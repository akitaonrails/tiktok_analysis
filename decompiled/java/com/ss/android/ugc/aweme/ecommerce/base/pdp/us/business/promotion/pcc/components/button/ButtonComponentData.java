package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.components.button;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ButtonComponentData {

    @C09CT("button")
    public final ButtonComponentModel button;

    @C09CT("next_button")
    public final ButtonComponentModel nextButton;

    public ButtonComponentData() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonComponentData)) {
            return false;
        }
        ButtonComponentData buttonComponentData = (ButtonComponentData) obj;
        return Intrinsics.LJFF(this.button, buttonComponentData.button) && Intrinsics.LJFF(this.nextButton, buttonComponentData.nextButton);
    }

    public final int hashCode() {
        ButtonComponentModel buttonComponentModel = this.button;
        int iHashCode = (buttonComponentModel == null ? 0 : buttonComponentModel.hashCode()) * 31;
        ButtonComponentModel buttonComponentModel2 = this.nextButton;
        return iHashCode + (buttonComponentModel2 != null ? buttonComponentModel2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ButtonComponentData(button=");
        sbLIZ.append(this.button);
        sbLIZ.append(", nextButton=");
        sbLIZ.append(this.nextButton);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ButtonComponentData(ButtonComponentModel buttonComponentModel, ButtonComponentModel buttonComponentModel2) {
        this.button = buttonComponentModel;
        this.nextButton = buttonComponentModel2;
    }
}
