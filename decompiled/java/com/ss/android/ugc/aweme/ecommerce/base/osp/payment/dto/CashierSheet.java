package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.scene.Scene;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CashierSheet {

    @C09CT("cashier_bottom_sheet")
    public CashierSheetContent popup;

    @C09CT(Scene.SCENE_SERVICE)
    public Integer scene;

    public CashierSheet() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashierSheet)) {
            return false;
        }
        CashierSheet cashierSheet = (CashierSheet) obj;
        return Intrinsics.LJFF(this.scene, cashierSheet.scene) && Intrinsics.LJFF(this.popup, cashierSheet.popup);
    }

    public final int hashCode() {
        Integer num = this.scene;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        CashierSheetContent cashierSheetContent = this.popup;
        return iHashCode + (cashierSheetContent != null ? cashierSheetContent.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CashierSheet(scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", popup=");
        sbLIZ.append(this.popup);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CashierSheet(Integer num, CashierSheetContent cashierSheetContent) {
        this.scene = num;
        this.popup = cashierSheetContent;
    }
}
