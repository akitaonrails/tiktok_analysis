package com.ss.android.ugc.aweme.localservice.passthrough.settings.rules;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class GlobalPropsParamsConfigRule {

    @C09CT("bundle")
    public final String bundle;

    @C09CT("channel")
    public final String channel;

    @C09CT("data_btm")
    public final String dataBtm;

    @C09CT("params")
    public final List<String> params;

    @C09CT("path")
    public final String path;

    @C09CT("query")
    public final Map<String, Object> query;

    public GlobalPropsParamsConfigRule() {
        this(null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GlobalPropsParamsConfigRule)) {
            return false;
        }
        GlobalPropsParamsConfigRule globalPropsParamsConfigRule = (GlobalPropsParamsConfigRule) obj;
        return Intrinsics.LJFF(this.bundle, globalPropsParamsConfigRule.bundle) && Intrinsics.LJFF(this.channel, globalPropsParamsConfigRule.channel) && Intrinsics.LJFF(this.path, globalPropsParamsConfigRule.path) && Intrinsics.LJFF(this.query, globalPropsParamsConfigRule.query) && Intrinsics.LJFF(this.dataBtm, globalPropsParamsConfigRule.dataBtm) && Intrinsics.LJFF(this.params, globalPropsParamsConfigRule.params);
    }

    public final int hashCode() {
        String str = this.bundle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.channel;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.path;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, Object> map = this.query;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        String str4 = this.dataBtm;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.params;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GlobalPropsParamsConfigRule(bundle=");
        sbLIZ.append(this.bundle);
        sbLIZ.append(", channel=");
        sbLIZ.append(this.channel);
        sbLIZ.append(", path=");
        sbLIZ.append(this.path);
        sbLIZ.append(", query=");
        sbLIZ.append(this.query);
        sbLIZ.append(", dataBtm=");
        sbLIZ.append(this.dataBtm);
        sbLIZ.append(", params=");
        sbLIZ.append(this.params);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GlobalPropsParamsConfigRule(String str, String str2, String str3, Map<String, ? extends Object> map, String str4, List<String> list) {
        this.bundle = str;
        this.channel = str2;
        this.path = str3;
        this.query = map;
        this.dataBtm = str4;
        this.params = list;
    }
}
