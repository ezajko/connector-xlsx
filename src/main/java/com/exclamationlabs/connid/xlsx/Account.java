/*
 * Copyright (c) 2019. Exclamation Labs https://www.exclamationlabs.com/
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.exclamationlabs.connid.xlsx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("serial")
public class Account extends HashMap<String, String> {

    private String identifier;
    private List<String> groups = new ArrayList<>();

    public Account(){}

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String[] getGroups() {
        return groups.toArray(new String[0]);
    }

    public void addGroup(String group) {
        this.groups.add(group);
    }

    public void setGroups(String[] groups) {
        this.groups = Arrays.asList(groups);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;

        Account that = (Account) o;
        if (identifier != null ? !identifier.equals(that.identifier) : that.identifier != null) return false;
        return groups != null ? groups.equals(that.groups) : that.groups == null;
    }

    @Override
    public int hashCode() {
        int result = identifier != null ? identifier.hashCode() : 0;
        result = 31 * result + (groups != null ? groups.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Account{" +
                "identifier='" + identifier + '\'' +
                this.entrySet().toString() + '\'' +
                ", groups='" + groups + '\'' +
                '}';
    }
}
