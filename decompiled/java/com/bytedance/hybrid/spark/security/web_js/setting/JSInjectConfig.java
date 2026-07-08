package com.bytedance.hybrid.spark.security.web_js.setting;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class JSInjectConfig {

    @C09CT("allowList")
    public final List<String> allowList;

    @C09CT("blockList")
    public final List<String> blockList;

    @C09CT("businessLine")
    public final int businessLine;

    @C09CT("geckoAk")
    public final String geckoAk;

    @C09CT("geckoBundle")
    public final String geckoBundle;

    @C09CT("geckoChannel")
    public final String geckoChannel;

    @C09CT("geckoUrl")
    public final String geckoUrl;

    @C09CT("injectTime")
    public final String injectTime;

    @C09CT("isUseHardCode")
    public final boolean isUseHardCode;

    @C09CT("name")
    public final String name;

    public JSInjectConfig() {
        this(null, null, 0, null, null, null, null, null, null, false, 1023, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JSInjectConfig)) {
            return false;
        }
        JSInjectConfig jSInjectConfig = (JSInjectConfig) obj;
        return Intrinsics.LJFF(this.name, jSInjectConfig.name) && Intrinsics.LJFF(this.injectTime, jSInjectConfig.injectTime) && this.businessLine == jSInjectConfig.businessLine && Intrinsics.LJFF(this.allowList, jSInjectConfig.allowList) && Intrinsics.LJFF(this.blockList, jSInjectConfig.blockList) && Intrinsics.LJFF(this.geckoUrl, jSInjectConfig.geckoUrl) && Intrinsics.LJFF(this.geckoAk, jSInjectConfig.geckoAk) && Intrinsics.LJFF(this.geckoChannel, jSInjectConfig.geckoChannel) && Intrinsics.LJFF(this.geckoBundle, jSInjectConfig.geckoBundle) && this.isUseHardCode == jSInjectConfig.isUseHardCode;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JSInjectConfig(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", injectTime=");
        sbLIZ.append(this.injectTime);
        sbLIZ.append(", businessLine=");
        sbLIZ.append(this.businessLine);
        sbLIZ.append(", allowList=");
        sbLIZ.append(this.allowList);
        sbLIZ.append(", blockList=");
        sbLIZ.append(this.blockList);
        sbLIZ.append(", geckoUrl=");
        sbLIZ.append(this.geckoUrl);
        sbLIZ.append(", geckoAk=");
        sbLIZ.append(this.geckoAk);
        sbLIZ.append(", geckoChannel=");
        sbLIZ.append(this.geckoChannel);
        sbLIZ.append(", geckoBundle=");
        sbLIZ.append(this.geckoBundle);
        sbLIZ.append(", isUseHardCode=");
        sbLIZ.append(this.isUseHardCode);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public JSInjectConfig(String str, String str2, int i, List<String> list, List<String> list2, String str3, String str4, String str5, String str6, boolean z) {
        this.name = str;
        this.injectTime = str2;
        this.businessLine = i;
        this.allowList = list;
        this.blockList = list2;
        this.geckoUrl = str3;
        this.geckoAk = str4;
        this.geckoChannel = str5;
        this.geckoBundle = str6;
        this.isUseHardCode = z;
    }

    public JSInjectConfig(String str, String str2, int i, List list, List list2, String str3, String str4, String str5, String str6, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? -1 : i, (i2 & 8) != 0 ? C13BV.INSTANCE : list, (i2 & 16) != 0 ? C13BV.INSTANCE : list2, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? "" : str4, (i2 & 128) != 0 ? "" : str5, (i2 & 256) == 0 ? str6 : "", (i2 & 512) != 0 ? false : z);
    }
}
