package com.ss.android.ugc.aweme.ecommerce.search.lynx.spark.core.communicate.jsb;

import X.AbstractC684710QtR;
import X.C098200Yq;
import X.C123100dR;
import X.C189200o6;
import X.C19EG;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1063300dmC;
import X.InterfaceC684720QtS;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchShowToastMethod extends AbstractC684710QtR {
    public static final int $stable = 8;

    public final DialogFragment hasOpenedDialogs(C19EG c19eg) {
        for (Fragment fragment : c19eg.getSupportFragmentManager().LJJLIIIJL()) {
            if (fragment instanceof DialogFragment) {
                return (DialogFragment) fragment;
            }
        }
        return null;
    }

    public void handle(InterfaceC684720QtS interfaceC684720QtS, CompletionBlock<Object> completionBlock, EnumC1063300dmC enumC1063300dmC) {
        try {
            String toast = interfaceC684720QtS.getToast();
            Integer numValueOf = null;
            if (C123100dR.LIZ(toast) && toast != null) {
                String iconType = interfaceC684720QtS.getIconType();
                Number acrossActivities = interfaceC684720QtS.getAcrossActivities();
                if (acrossActivities != null) {
                    numValueOf = Integer.valueOf(acrossActivities.intValue());
                }
                showEcSearchToast(toast, iconType, numValueOf);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("acrossActivities : ");
            sbLIZ.append(interfaceC684720QtS.getAcrossActivities());
            C189200o6.m2constructorimpl(Integer.valueOf(Log.i("EcSearchShowToastMethod", C2188811AlT.LIZIZ(sbLIZ))));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void showEcSearchToast(final String str, final String str2, final Integer num) {
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0QtQ
            /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x005b A[Catch: all -> 0x00a8, TryCatch #0 {all -> 0x00a8, blocks: (B:3:0x0008, B:6:0x0019, B:13:0x0026, B:18:0x0035, B:19:0x0039, B:21:0x003d, B:23:0x0042, B:24:0x0046, B:32:0x005b, B:34:0x006c, B:35:0x0076, B:41:0x00a4, B:37:0x0081, B:39:0x0092, B:40:0x009c, B:14:0x002b, B:16:0x002f), top: B:46:0x0008 }] */
            /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() {
                /*
                    r8 = this;
                    java.lang.Integer r4 = r1
                    com.ss.android.ugc.aweme.ecommerce.search.lynx.spark.core.communicate.jsb.EcSearchShowToastMethod r3 = r2
                    java.lang.String r2 = r3
                    java.lang.String r7 = r4
                    X.01GW r0 = X.C256750A4j.LIZ     // Catch: java.lang.Throwable -> La8
                    java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> La8
                    java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> La8
                    boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> La8
                    r1 = 1
                    if (r0 != 0) goto L20
                    if (r4 == 0) goto L20
                    int r0 = r4.intValue()     // Catch: java.lang.Throwable -> La8
                    if (r0 != r1) goto L20
                    goto L22
                L20:
                    r5 = 0
                    goto L23
                L22:
                    r5 = 1
                L23:
                    r1 = 0
                    if (r5 == 0) goto L2b
                    android.app.Activity r6 = X.C2214201BlK.LJFF()     // Catch: java.lang.Throwable -> La8
                    goto L33
                L2b:
                    X.0OvC r0 = r3.IBridgeSdkContext     // Catch: java.lang.Throwable -> La8
                    if (r0 == 0) goto L35
                    android.app.Activity r6 = r0.LIZLLL()     // Catch: java.lang.Throwable -> La8
                L33:
                    if (r6 != 0) goto L39
                L35:
                    android.app.Activity r6 = X.C2214201BlK.LJFF()     // Catch: java.lang.Throwable -> La8
                L39:
                    boolean r0 = r6 instanceof X.C19EG     // Catch: java.lang.Throwable -> La8
                    if (r0 == 0) goto L4f
                    r0 = r6
                    X.19EG r0 = (X.C19EG) r0     // Catch: java.lang.Throwable -> La8
                    if (r0 == 0) goto L4f
                    androidx.fragment.app.DialogFragment r4 = r3.hasOpenedDialogs(r0)     // Catch: java.lang.Throwable -> La8
                L46:
                    java.lang.String r0 = "tick"
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)     // Catch: java.lang.Throwable -> La8
                    if (r0 == 0) goto L55
                    goto L51
                L4f:
                    r4 = r1
                    goto L46
                L51:
                    r3 = 2130774901(0x7f010b75, float:1.715299E38)
                    goto L56
                L55:
                    r3 = 0
                L56:
                    r2 = 2131099768(0x7f060078, float:1.7811899E38)
                    if (r4 == 0) goto L7f
                    X.0mGw r1 = new X.0mGw     // Catch: java.lang.Throwable -> La8
                    r1.<init>(r4)     // Catch: java.lang.Throwable -> La8
                    r1.LJIIIZ(r7)     // Catch: java.lang.Throwable -> La8
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> La8
                    r0.intValue()     // Catch: java.lang.Throwable -> La8
                    if (r3 == 0) goto L76
                    int r0 = r0.intValue()     // Catch: java.lang.Throwable -> La8
                    r1.LJ(r0)     // Catch: java.lang.Throwable -> La8
                    r1.LJI(r2)     // Catch: java.lang.Throwable -> La8
                L76:
                    r1.LIZ(r5)     // Catch: java.lang.Throwable -> La8
                    r1.LJIIJ()     // Catch: java.lang.Throwable -> La8
                    kotlin.Unit r1 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> La8
                    goto La4
                L7f:
                    if (r6 == 0) goto La4
                    X.0mGw r1 = new X.0mGw     // Catch: java.lang.Throwable -> La8
                    r1.<init>(r6)     // Catch: java.lang.Throwable -> La8
                    r1.LJIIIZ(r7)     // Catch: java.lang.Throwable -> La8
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> La8
                    r0.intValue()     // Catch: java.lang.Throwable -> La8
                    if (r3 == 0) goto L9c
                    int r0 = r0.intValue()     // Catch: java.lang.Throwable -> La8
                    r1.LJ(r0)     // Catch: java.lang.Throwable -> La8
                    r1.LJI(r2)     // Catch: java.lang.Throwable -> La8
                L9c:
                    r1.LIZ(r5)     // Catch: java.lang.Throwable -> La8
                    r1.LJIIJ()     // Catch: java.lang.Throwable -> La8
                    kotlin.Unit r1 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> La8
                La4:
                    X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> La8
                    return
                La8:
                    r1 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
                    X.00Yq r0 = new X.00Yq
                    r0.<init>(r1)
                    X.C189200o6.m2constructorimpl(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC684700QtQ.LIZ():void");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("EcSearchShowToastMethod@7372.showEcSearchToast$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("EcSearchShowToastMethod@7372.showEcSearchToast$1");
            }
        });
    }

    @Override // X.AbstractC1549150qPp
    public /* bridge */ /* synthetic */ void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        handle((InterfaceC684720QtS) xBaseParamModel, (CompletionBlock<Object>) completionBlock, enumC1063300dmC);
    }
}
