package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.scene.Scene;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentButtonInfo {

    @C09CT("button_text")
    public String buttonText;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene;

    public PaymentButtonInfo() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentButtonInfo)) {
            return false;
        }
        PaymentButtonInfo paymentButtonInfo = (PaymentButtonInfo) obj;
        return Intrinsics.LJFF(this.scene, paymentButtonInfo.scene) && Intrinsics.LJFF(this.buttonText, paymentButtonInfo.buttonText);
    }

    public final int hashCode() {
        String str = this.scene;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.buttonText;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaymentButtonInfo(scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", buttonText=");
        sbLIZ.append(this.buttonText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PaymentButtonInfo(String str, String str2) {
        this.scene = str;
        this.buttonText = str2;
    }
}
