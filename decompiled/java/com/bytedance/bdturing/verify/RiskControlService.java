package com.bytedance.bdturing.verify;

import X.AbstractC202165148l;
import X.AnonymousClass1493;
import X.C148U;
import X.C14AD;
import X.C785410UrT;
import X.InterfaceC202160148g;
import X.InterfaceC846640XJe;
import Y.ARunnableS63S0300000_30;
import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class RiskControlService implements AnonymousClass1493 {
    public C14AD mDialogShowing;

    @Override // X.AnonymousClass1493
    public boolean isProcess(int i) {
        return i == 1 || i == 2 || i == 12;
    }

    public final void dismissVerifyDialog() {
        try {
            C14AD c14ad = this.mDialogShowing;
            if (c14ad == null || !c14ad.isShowing()) {
                return;
            }
            C14AD c14ad2 = this.mDialogShowing;
            c14ad2.dismiss();
            C785410UrT.LIZ(c14ad2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.AnonymousClass1493
    public boolean execute(final AbstractC202165148l abstractC202165148l, final InterfaceC202160148g interfaceC202160148g) {
        boolean z;
        C14AD c14ad = this.mDialogShowing;
        if (c14ad != null && c14ad.isShowing()) {
            interfaceC202160148g.onFail(998);
            return true;
        }
        C148U c148u = C148U.LIZ;
        InterfaceC846640XJe interfaceC846640XJe = new InterfaceC846640XJe() { // from class: X.148v
            @Override // X.InterfaceC846640XJe
            public final void LIZ(int i, long j, String str) {
                Activity activity;
                Activity activity2 = abstractC202165148l.getActivity();
                if ((activity2 == null || !activity2.isFinishing()) && (activity = abstractC202165148l.getActivity()) != null) {
                    activity.runOnUiThread(new ARunnableS63S0300000_30(this, abstractC202165148l, interfaceC202160148g, 11));
                }
            }
        };
        boolean z2 = false;
        if (C148U.LIZJ.optLong("available_time") > System.currentTimeMillis()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            interfaceC846640XJe.LIZ(200, 0L, null);
            return true;
        }
        synchronized (c148u) {
            try {
                List<InterfaceC846640XJe> list = C148U.LJI;
                if (((LinkedList) list).size() == 0) {
                    z2 = true;
                }
                ((LinkedList) list).add(interfaceC846640XJe);
                if (z2) {
                    C148U.LJFF(0L);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return true;
    }
}
