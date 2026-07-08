package com.bytedance.hybrid.spark.roma.config;

import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import com.bytedance.hybrid.spark.roma.expr.ConditionModel;
import com.google.gson.k;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ShortLinkConfig {
    public String LIZ;

    @C09CT("ev")
    public final int editVersion;

    @C09CT("c")
    public final Map<String, k> pageConfig;

    @C09CT("d")
    public final Map<String, ParamsDesc> paramsDesc;

    @C09CT("rt")
    public final ConditionModel realTimeCondition;

    @C09CT("s")
    public final String schemeTemplate;

    @C09CT("strict")
    public final int strictMode;

    @C09CT("vv")
    public final int variantVersion;

    @C09CT("v")
    public final int version;

    public ShortLinkConfig() {
        this(1, "", C2097608Jq.LJ(), C2097608Jq.LJ(), 1, 0, 1, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShortLinkConfig(version=");
        sbLIZ.append(this.version);
        sbLIZ.append(", schemeTemplate=");
        sbLIZ.append(this.schemeTemplate);
        sbLIZ.append(", pageConfig=");
        sbLIZ.append(this.pageConfig);
        sbLIZ.append(", paramsDesc=");
        sbLIZ.append(this.paramsDesc);
        sbLIZ.append(", strictMode=");
        sbLIZ.append(this.strictMode);
        sbLIZ.append(", editVersion=");
        sbLIZ.append(this.editVersion);
        sbLIZ.append(", variantVersion=");
        sbLIZ.append(this.variantVersion);
        sbLIZ.append(", realTimeCondition=");
        sbLIZ.append(this.realTimeCondition);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final class ParamsDesc {

        @C09CT("d")
        public final String defaultValue;

        @C09CT("r")
        public final int required;

        public ParamsDesc() {
            this(0, "");
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ParamsDesc(required=");
            sbLIZ.append(this.required);
            sbLIZ.append(", defaultValue=");
            sbLIZ.append(this.defaultValue);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public ParamsDesc(int i, String str) {
            this.required = i;
            this.defaultValue = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShortLinkConfig(int i, String str, Map<String, ? extends k> map, Map<String, ParamsDesc> map2, int i2, int i3, int i4, ConditionModel conditionModel) {
        this.version = i;
        this.schemeTemplate = str;
        this.pageConfig = map;
        this.paramsDesc = map2;
        this.strictMode = i2;
        this.editVersion = i3;
        this.variantVersion = i4;
        this.realTimeCondition = conditionModel;
    }
}
