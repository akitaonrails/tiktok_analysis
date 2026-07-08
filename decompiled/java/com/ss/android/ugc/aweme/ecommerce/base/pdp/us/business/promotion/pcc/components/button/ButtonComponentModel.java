package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.components.button;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponentAction;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ButtonComponentModel {

    @C09CT("button_action")
    public final PdpComponentAction buttonAction;

    @C09CT("button_style")
    public final ButtonStyle buttonStyle;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("text")
    public final ECRichText text;

    public ButtonComponentModel() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonComponentModel)) {
            return false;
        }
        ButtonComponentModel buttonComponentModel = (ButtonComponentModel) obj;
        return Intrinsics.LJFF(this.text, buttonComponentModel.text) && Intrinsics.LJFF(this.buttonStyle, buttonComponentModel.buttonStyle) && Intrinsics.LJFF(this.buttonAction, buttonComponentModel.buttonAction) && Intrinsics.LJFF(this.daInfo, buttonComponentModel.daInfo);
    }

    public final int hashCode() {
        ECRichText eCRichText = this.text;
        int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
        ButtonStyle buttonStyle = this.buttonStyle;
        int iHashCode2 = (iHashCode + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31;
        PdpComponentAction pdpComponentAction = this.buttonAction;
        int iHashCode3 = (iHashCode2 + (pdpComponentAction == null ? 0 : pdpComponentAction.hashCode())) * 31;
        String str = this.daInfo;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ButtonComponentModel(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", buttonStyle=");
        sbLIZ.append(this.buttonStyle);
        sbLIZ.append(", buttonAction=");
        sbLIZ.append(this.buttonAction);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ButtonComponentModel(ECRichText eCRichText, ButtonStyle buttonStyle, PdpComponentAction pdpComponentAction, String str) {
        this.text = eCRichText;
        this.buttonStyle = buttonStyle;
        this.buttonAction = pdpComponentAction;
        this.daInfo = str;
    }
}
