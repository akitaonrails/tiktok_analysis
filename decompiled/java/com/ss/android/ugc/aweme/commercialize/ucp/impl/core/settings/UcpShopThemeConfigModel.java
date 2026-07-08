package com.ss.android.ugc.aweme.commercialize.ucp.impl.core.settings;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class UcpShopThemeConfigModel {

    @C09CT("buttonColor")
    public final String buttonColor;

    @C09CT("buttonTextType")
    public final int buttonTextType;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UcpShopThemeConfigModel)) {
            return false;
        }
        UcpShopThemeConfigModel ucpShopThemeConfigModel = (UcpShopThemeConfigModel) obj;
        return Intrinsics.LJFF(this.buttonColor, ucpShopThemeConfigModel.buttonColor) && this.buttonTextType == ucpShopThemeConfigModel.buttonTextType;
    }

    public final int hashCode() {
        return (this.buttonColor.hashCode() * 31) + this.buttonTextType;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UcpShopThemeConfigModel(buttonColor=");
        sbLIZ.append(this.buttonColor);
        sbLIZ.append(", buttonTextType=");
        sbLIZ.append(this.buttonTextType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UcpShopThemeConfigModel() {
        this("UIShapePrimary", 0);
    }

    public UcpShopThemeConfigModel(String str, int i) {
        this.buttonColor = str;
        this.buttonTextType = i;
    }
}
