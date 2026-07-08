package com.bytedance.helios.apimonitor;

import X.C0WS5;
import X.C0WS7;
import X.C0WSG;
import X.C0WSU;
import X.C0WSV;
import X.C0WZW;
import X.C801240Vbu;
import X.C825320WZe;
import android.app.Activity;
import android.app.Fragment;
import com.bytedance.helios.apimonitor.permission.PermissionPopUpConfig;
import com.bytedance.helios.apimonitor.permission.PermissionPopUpService;
import com.bytedance.pumbaa.base2.performance.IPerformanceExprSwitch;

/* JADX INFO: loaded from: classes14.dex */
public final class PermissionPopUpActionInvoker implements C0WSV {
    @Override // X.C0WSV
    public String name() {
        return "PermissionPopUp";
    }

    @Override // X.C0WSV
    public void postInvoke(int i, String str, String str2, Object obj, Object[] objArr, Object obj2, C0WZW c0wzw, boolean z) {
    }

    @Override // X.C0WSV
    public C0WSU preInvoke(int i, String str, String str2, Object obj, Object[] objArr, String str3, C0WZW c0wzw) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        C0WS7 c0ws7;
        IPerformanceExprSwitch iPerformanceExprSwitchLIZ = C825320WZe.LIZ();
        if (iPerformanceExprSwitchLIZ != null && !iPerformanceExprSwitchLIZ.LJ()) {
            if (c0wzw != null && (c0ws7 = c0wzw.LJFF) != null) {
                C0WS5.LIZ(c0ws7);
            }
            return C0WSU.LIZLLL;
        }
        if (!((PermissionPopUpConfig) C0WSG.LIZIZ.getValue()).enable) {
            return new C0WSU(false, null);
        }
        if (i != 11051) {
            if (i != 11052) {
                switch (i) {
                    case 102600:
                        C801240Vbu c801240Vbu = PermissionPopUpService.LL;
                        Activity activity = (Activity) obj;
                        if (objArr != null) {
                            obj5 = objArr[0];
                        } else {
                            obj5 = null;
                        }
                        int iIntValue = ((Integer) objArr[1]).intValue();
                        c801240Vbu.getClass();
                        C801240Vbu.LIZLLL(activity, (String[]) obj5, iIntValue);
                        break;
                    case 102601:
                        C801240Vbu c801240Vbu2 = PermissionPopUpService.LL;
                        Activity activity2 = ((Fragment) obj).getActivity();
                        if (objArr != null) {
                            obj4 = objArr[0];
                        } else {
                            obj4 = null;
                        }
                        int iIntValue2 = ((Integer) objArr[1]).intValue();
                        c801240Vbu2.getClass();
                        C801240Vbu.LIZLLL(activity2, (String[]) obj4, iIntValue2);
                        break;
                }
            } else {
                C801240Vbu c801240Vbu3 = PermissionPopUpService.LL;
                Activity activity3 = ((Fragment) obj).getActivity();
                if (objArr != null) {
                    obj3 = objArr[0];
                } else {
                    obj3 = null;
                }
                int iIntValue3 = ((Integer) obj3).intValue();
                String[] strArr = (String[]) objArr[1];
                int[] iArr = (int[]) objArr[2];
                c801240Vbu3.getClass();
                C801240Vbu.LJ(activity3, iIntValue3, strArr, iArr);
            }
        } else {
            C801240Vbu c801240Vbu4 = PermissionPopUpService.LL;
            Activity activity4 = (Activity) obj;
            if (objArr != null) {
                obj2 = objArr[0];
            } else {
                obj2 = null;
            }
            int iIntValue4 = ((Integer) obj2).intValue();
            String[] strArr2 = (String[]) objArr[1];
            int[] iArr2 = (int[]) objArr[2];
            c801240Vbu4.getClass();
            C801240Vbu.LJ(activity4, iIntValue4, strArr2, iArr2);
        }
        return new C0WSU(false, null);
    }
}
