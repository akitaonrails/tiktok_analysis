package com.bytedance.touchpoint.core.sunshinependant;

import X.C01GW;
import X.C0J3E;
import X.C1220000hqw;
import X.C13LE;
import X.C1548820qPI;
import X.C262100zr;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736950SvV;
import X.InterfaceC1141530foN;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.touchpoint.api.model.SunshinePendant;
import com.bytedance.touchpoint.api.viewmodel.BaseTouchPointDataVM;
import com.bytedance.touchpoint.data.parser.notify.SunshinePendantViewModel;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class SunshinePendantManager extends AbsPendantManager<SunshinePendant> implements InterfaceC1141530foN {
    public static final C01GW<SunshinePendantManager> LLILZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(61));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(62));
    public final String LLILLL = "For You";

    @Override // com.bytedance.touchpoint.core.sunshinependant.AbsPendantManager
    public final void LJIIJ() {
        this.LL = null;
        C1548820qPI.LJIIIIZZ("close_sunshine_pendant", this);
    }

    @Override // com.bytedance.touchpoint.core.sunshinependant.AbsPendantManager
    public final void LJIIJJI() {
        this.LL = null;
        C1548820qPI.LJIIIIZZ("close_sunshine_pendant", this);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b A[PHI: r4
      0x007b: PHI (r4v1 int) = (r4v0 int), (r4v6 int) binds: [B:37:0x0078, B:23:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007f A[PHI: r4 r5
      0x007f: PHI (r4v2 int) = (r4v1 int), (r4v5 int) binds: [B:40:0x007c, B:26:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x007f: PHI (r5v1 int) = (r5v0 int), (r5v4 int) binds: [B:40:0x007c, B:26:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.touchpoint.core.sunshinependant.AbsPendantManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL() {
        /*
            r9 = this;
            r0 = 0
            r9.LL = r0
            java.lang.String r2 = "close_sunshine_pendant"
            X.C1548820qPI.LJIIIIZZ(r2, r9)
            X.01GW<X.0zPA> r0 = X.C1894700zPA.LJIJ
            X.0zPA r1 = X.C2178808gE.LIZ()
            r0 = 80
            X.0zNV r0 = r1.LJ(r0)
            r9.LL = r0
            if (r0 != 0) goto L19
            return
        L19:
            X.0sFe r3 = X.C1619720sFe.LIZ
            r7 = 0
            X.0z0O r0 = r3.LIZ(r7)
            X.0zRP r0 = (X.AbstractC1896090zRP) r0
            if (r0 == 0) goto L83
            X.19EG r0 = r0.LJIIIIZZ()
            if (r0 == 0) goto L83
            X.0zNV r0 = r9.LL
            if (r0 == 0) goto L3d
            r1 = 1
            X.0z0O r0 = r3.LIZ(r1)
            X.0zSh r0 = (X.C1896890zSh) r0
            if (r0 == 0) goto L41
            boolean r0 = r0.LJIIJ()
            if (r0 != r1) goto L41
        L3d:
            X.C1548820qPI.LIZLLL(r2, r9)
            return
        L41:
            X.0zNV r1 = r9.LL
            com.bytedance.touchpoint.api.model.SunshinePendant r1 = (com.bytedance.touchpoint.api.model.SunshinePendant) r1
            if (r1 == 0) goto L77
            com.bytedance.touchpoint.api.model.CloseFrequentLimit r0 = r1.closeFrequentLimit
            if (r0 == 0) goto L77
            int r4 = r0.daysWindow
        L4d:
            com.bytedance.touchpoint.api.model.CloseFrequentLimit r0 = r1.closeFrequentLimit
            if (r0 == 0) goto L7b
            int r5 = r0.maxClose
        L53:
            com.bytedance.touchpoint.api.model.CloseFrequentLimit r0 = r1.closeFrequentLimit
            if (r0 == 0) goto L7f
            int r6 = r0.daysNoShow
        L59:
            com.bytedance.touchpoint.api.model.CloseFrequentLimit r0 = r1.closeFrequentLimit
            if (r0 == 0) goto L65
            java.lang.Integer r0 = r0.hoursNoShow
            if (r0 == 0) goto L65
            int r7 = r0.intValue()
        L65:
            X.0zXP r3 = X.C710890RuZ.LIZ
            java.lang.String r8 = "not_show_before_stamp_sunshine"
            boolean r0 = r3.LIZJ(r4, r5, r6, r7, r8)
            if (r0 == 0) goto L3d
            java.lang.String r1 = r9.LLILLL
            java.lang.String r0 = "For You"
            kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            goto L3d
        L77:
            r4 = 0
            if (r1 == 0) goto L7b
            goto L4d
        L7b:
            r5 = 0
            if (r1 == 0) goto L7f
            goto L53
        L7f:
            r6 = 0
            if (r1 == 0) goto L65
            goto L59
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.touchpoint.core.sunshinependant.SunshinePendantManager.LJIIL():void");
    }

    @Override // com.bytedance.touchpoint.core.sunshinependant.AbsPendantManager, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.AbstractC1895130zPr
    public final BaseTouchPointDataVM LJIIIZ() {
        LifecycleOwner lifecycleOwner = C0J3E.LL;
        return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(SunshinePendantViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(19), null, null, null).getValue();
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        Intrinsics.LJFF(c262100zr.LIZ, "close_sunshine_pendant");
    }
}
