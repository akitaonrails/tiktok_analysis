package com.bytedance.pumbaa.entry.service;

import X.C01GW;
import X.C09CS;
import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class KeyedDomainPathRule {

    @C09CT("domain_exclude_list")
    @C09CS(PathMatchRuleListDeserializer.class)
    public final List<PathMatchRule> domainExcludeList;

    @C09CT("domain_include_list")
    @C09CS(PathMatchRuleListDeserializer.class)
    public final List<PathMatchRule> domainIncludeList;

    @C09CT("keys")
    public final List<String> keys;

    @C09CT("path_exclude_list")
    @C09CS(PathMatchRuleListDeserializer.class)
    public final List<PathMatchRule> pathExcludeList;

    @C09CT("path_include_list")
    @C09CS(PathMatchRuleListDeserializer.class)
    public final List<PathMatchRule> pathIncludeList;

    public static final class Groups {
        public final C01GW LIZ;

        @C09CT("rules")
        public final List<KeyedDomainPathRule> rules;

        public Groups() {
            this(null, 1, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Groups) && Intrinsics.LJFF(this.rules, ((Groups) obj).rules);
        }

        public final int hashCode() {
            return this.rules.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Groups(rules=");
            sbLIZ.append(this.rules);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        static {
            new Groups(C13BV.INSTANCE);
        }

        public Groups(List<KeyedDomainPathRule> list) {
            this.rules = list;
            this.LIZ = C452501pT.LIZIZ(new AwS547S0100000_3(this, 18));
        }

        public Groups(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list);
        }
    }

    public KeyedDomainPathRule() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyedDomainPathRule)) {
            return false;
        }
        KeyedDomainPathRule keyedDomainPathRule = (KeyedDomainPathRule) obj;
        return Intrinsics.LJFF(this.keys, keyedDomainPathRule.keys) && Intrinsics.LJFF(this.pathIncludeList, keyedDomainPathRule.pathIncludeList) && Intrinsics.LJFF(this.pathExcludeList, keyedDomainPathRule.pathExcludeList) && Intrinsics.LJFF(this.domainIncludeList, keyedDomainPathRule.domainIncludeList) && Intrinsics.LJFF(this.domainExcludeList, keyedDomainPathRule.domainExcludeList);
    }

    public final int hashCode() {
        return (((((((this.keys.hashCode() * 31) + this.pathIncludeList.hashCode()) * 31) + this.pathExcludeList.hashCode()) * 31) + this.domainIncludeList.hashCode()) * 31) + this.domainExcludeList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KeyedDomainPathRule(keys=");
        sbLIZ.append(this.keys);
        sbLIZ.append(", pathIncludeList=");
        sbLIZ.append(this.pathIncludeList);
        sbLIZ.append(", pathExcludeList=");
        sbLIZ.append(this.pathExcludeList);
        sbLIZ.append(", domainIncludeList=");
        sbLIZ.append(this.domainIncludeList);
        sbLIZ.append(", domainExcludeList=");
        sbLIZ.append(this.domainExcludeList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public KeyedDomainPathRule(List<String> list, List<PathMatchRule> list2, List<PathMatchRule> list3, List<PathMatchRule> list4, List<PathMatchRule> list5) {
        this.keys = list;
        this.pathIncludeList = list2;
        this.pathExcludeList = list3;
        this.domainIncludeList = list4;
        this.domainExcludeList = list5;
    }

    public KeyedDomainPathRule(List list, List list2, List list3, List list4, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? C13BV.INSTANCE : list3, (i & 8) != 0 ? C13BV.INSTANCE : list4, (i & 16) != 0 ? C13BV.INSTANCE : list5);
    }
}
