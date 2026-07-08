package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class EcSearchPdpInboxDiversionConfigModel {

    @C09CT("enable")
    public final int enable;

    @C09CT("mall_schema")
    public final String mallSchema;

    @C09CT("request_threshold")
    public final long requestThreshold;

    @C09CT("show_srp_sharer_info")
    public final int showSrpSharerInfo;

    @C09CT("srp_style")
    public final int srpStyle;

    public EcSearchPdpInboxDiversionConfigModel() {
        this(0, 1000L, null, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcSearchPdpInboxDiversionConfigModel)) {
            return false;
        }
        EcSearchPdpInboxDiversionConfigModel ecSearchPdpInboxDiversionConfigModel = (EcSearchPdpInboxDiversionConfigModel) obj;
        return this.enable == ecSearchPdpInboxDiversionConfigModel.enable && this.requestThreshold == ecSearchPdpInboxDiversionConfigModel.requestThreshold && Intrinsics.LJFF(this.mallSchema, ecSearchPdpInboxDiversionConfigModel.mallSchema) && this.srpStyle == ecSearchPdpInboxDiversionConfigModel.srpStyle && this.showSrpSharerInfo == ecSearchPdpInboxDiversionConfigModel.showSrpSharerInfo;
    }

    public final int hashCode() {
        int iY2 = ((this.enable * 31) + C786410Ut5.Y2(this.requestThreshold)) * 31;
        String str = this.mallSchema;
        return ((((iY2 + (str == null ? 0 : str.hashCode())) * 31) + this.srpStyle) * 31) + this.showSrpSharerInfo;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcSearchPdpInboxDiversionConfigModel(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", requestThreshold=");
        sbLIZ.append(this.requestThreshold);
        sbLIZ.append(", mallSchema=");
        sbLIZ.append(this.mallSchema);
        sbLIZ.append(", srpStyle=");
        sbLIZ.append(this.srpStyle);
        sbLIZ.append(", showSrpSharerInfo=");
        sbLIZ.append(this.showSrpSharerInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EcSearchPdpInboxDiversionConfigModel(int i, long j, String str, int i2, int i3) {
        this.enable = i;
        this.requestThreshold = j;
        this.mallSchema = str;
        this.srpStyle = i2;
        this.showSrpSharerInfo = i3;
    }
}
