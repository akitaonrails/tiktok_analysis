package com.google.android.gms.common.api.internal;

import X.C0W3J;
import X.C19EG;
import X.C19EH;
import X.C831570Wjj;
import X.FragmentC21501819Cu;
import X.InterfaceC831130Wj1;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes33.dex */
public class LifecycleCallback {
    public final InterfaceC831130Wj1 LL;

    public LifecycleCallback(InterfaceC831130Wj1 interfaceC831130Wj1) {
        this.LL = interfaceC831130Wj1;
    }

    public void LIZ(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public void LIZLLL(int i, int i2, Intent intent) {
    }

    public void LJ(Bundle bundle) {
    }

    public void LJFF() {
    }

    public void LJI(Bundle bundle) {
    }

    public void LJII() {
    }

    public void LJIIIIZZ() {
    }

    public final Activity LIZIZ() {
        Activity activityS8 = this.LL.s8();
        C0W3J.LJIIIIZZ(activityS8);
        return activityS8;
    }

    public static InterfaceC831130Wj1 LIZJ(C831570Wjj c831570Wjj) {
        FragmentC21501819Cu fragmentC21501819Cu;
        zzd zzdVar;
        Object obj = c831570Wjj.LIZ;
        if (obj instanceof C19EG) {
            C19EG c19eg = (C19EG) obj;
            Reference reference = (Reference) zzd.LLILZ.get(c19eg);
            if (reference == null || (zzdVar = (zzd) reference.get()) == null) {
                try {
                    zzdVar = (zzd) c19eg.getSupportFragmentManager().LJJJJZI("SupportLifecycleFragmentImpl");
                    if (zzdVar == null || zzdVar.isRemoving()) {
                        zzdVar = new zzd();
                        C19EH c19ehLJIIJ = c19eg.getSupportFragmentManager().LJIIJ();
                        c19ehLJIIJ.LIZLLL(zzdVar, "SupportLifecycleFragmentImpl");
                        c19ehLJIIJ.LJIIJ();
                    }
                    zzd.LLILZ.put(c19eg, new WeakReference(zzdVar));
                } catch (ClassCastException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
                }
            }
            return zzdVar;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            Reference reference2 = (Reference) FragmentC21501819Cu.LLILZ.get(activity);
            if (reference2 == null || (fragmentC21501819Cu = (FragmentC21501819Cu) reference2.get()) == null) {
                try {
                    fragmentC21501819Cu = (FragmentC21501819Cu) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                    if (fragmentC21501819Cu == null || fragmentC21501819Cu.isRemoving()) {
                        fragmentC21501819Cu = new FragmentC21501819Cu();
                        activity.getFragmentManager().beginTransaction().add(fragmentC21501819Cu, "LifecycleFragmentImpl").commitAllowingStateLoss();
                    }
                    FragmentC21501819Cu.LLILZ.put(activity, new WeakReference(fragmentC21501819Cu));
                } catch (ClassCastException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e2);
                }
            }
            return fragmentC21501819Cu;
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    public static InterfaceC831130Wj1 getChimeraLifecycleFragmentImpl(C831570Wjj c831570Wjj) {
        throw new IllegalStateException("Method not available in SDK.");
    }
}
