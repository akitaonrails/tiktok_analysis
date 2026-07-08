package com.bytedance.pitaya.api.feature.store;

import X.C2188811AlT;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PTYFeatureGroupQuery implements ReflectionCall {
    public final String groupName;
    public final List<PTYFeatureQuery> queries;

    public final PTYFeatureGroupQuery copy(String str, List<PTYFeatureQuery> list) {
        return new PTYFeatureGroupQuery(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PTYFeatureGroupQuery)) {
            return false;
        }
        PTYFeatureGroupQuery pTYFeatureGroupQuery = (PTYFeatureGroupQuery) obj;
        return Intrinsics.LJFF(this.groupName, pTYFeatureGroupQuery.groupName) && Intrinsics.LJFF(this.queries, pTYFeatureGroupQuery.queries);
    }

    public int hashCode() {
        return (this.groupName.hashCode() * 31) + this.queries.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PTYFeatureGroupQuery(groupName=");
        sbLIZ.append(this.groupName);
        sbLIZ.append(", queries=");
        sbLIZ.append(this.queries);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final List<PTYFeatureQuery> getQueries() {
        return this.queries;
    }

    public PTYFeatureGroupQuery(String str, List<PTYFeatureQuery> list) {
        this.groupName = str;
        this.queries = list;
    }
}
