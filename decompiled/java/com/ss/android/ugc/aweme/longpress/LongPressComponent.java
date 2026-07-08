package com.ss.android.ugc.aweme.longpress;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1380660m24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class LongPressComponent implements InterfaceC1380660m24 {
    public String LIZ;
    public final String LIZIZ;

    @C09CT("action_id")
    public String actionId;

    @C09CT("style_config")
    public LongPressComponentStyleConfig styleConfig;

    @C09CT("type")
    public String type;

    public LongPressComponent() {
        this(null, null, null, null, "component");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LongPressComponent)) {
            return false;
        }
        LongPressComponent longPressComponent = (LongPressComponent) obj;
        return Intrinsics.LJFF(this.styleConfig, longPressComponent.styleConfig) && Intrinsics.LJFF(this.actionId, longPressComponent.actionId) && Intrinsics.LJFF(this.type, longPressComponent.type) && Intrinsics.LJFF(this.LIZ, longPressComponent.LIZ) && Intrinsics.LJFF(this.LIZIZ, longPressComponent.LIZIZ);
    }

    public final int hashCode() {
        LongPressComponentStyleConfig longPressComponentStyleConfig = this.styleConfig;
        int iHashCode = (longPressComponentStyleConfig == null ? 0 : longPressComponentStyleConfig.hashCode()) * 31;
        String str = this.actionId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZ;
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LongPressComponent(styleConfig=");
        sbLIZ.append(this.styleConfig);
        sbLIZ.append(", actionId=");
        sbLIZ.append(this.actionId);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", key=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", nodeType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1380660m24
    public final String getNodeType() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1380660m24
    public final void setKey(String str) {
        this.LIZ = str;
    }

    public LongPressComponent(LongPressComponentStyleConfig longPressComponentStyleConfig, String str, String str2, String str3, String str4) {
        this.styleConfig = longPressComponentStyleConfig;
        this.actionId = str;
        this.type = str2;
        this.LIZ = str3;
        this.LIZIZ = str4;
    }
}
