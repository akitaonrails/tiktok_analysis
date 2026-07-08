package com.ss.android.ugc.aweme.tako.share.panel;

import X.AbstractC1375550ltp;
import X.AbstractC19483511Kn;
import X.C036E;
import X.C05XL;
import X.C063X;
import X.C063Z;
import X.C090F;
import X.C0M7Y;
import X.C0PEM;
import X.C11IM;
import X.C11J8;
import X.C11RO;
import X.C11S5;
import X.C1370940lmO;
import X.C1375540lto;
import X.C15448063a;
import X.C15451063d;
import X.C1701890uOB;
import X.C19483611Ko;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.InterfaceC1369790lkX;
import Y.ACallableS236S0200000_2;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class TakoLongImageSharePackage extends TakoSharePackage {
    public final AtomicBoolean c2paStarted;
    public final C05XL<Boolean> c2paWritten;
    public volatile Function2<? super Context, ? super BaseSharePackage, Unit> onDownload;
    public volatile Function0<Unit> onExternalShareSuccess;
    public volatile Bitmap renderedLongImage;
    public String shareId;
    public volatile String tempFilePath;
    public volatile Uri tempFileUri;
    public static final C15451063d Companion = new Object() { // from class: X.063d
    };
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LIZJ() {
        return true;
    }

    public final void LJJI() {
        if (this.c2paStarted.compareAndSet(false, true)) {
            String str = this.tempFilePath;
            if (str.length() == 0) {
                this.c2paWritten.LJIIZILJ(Boolean.FALSE);
            } else {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C063Z(this, str, null), 3);
            }
        }
    }

    public TakoLongImageSharePackage(C1370940lmO c1370940lmO) {
        super(c1370940lmO);
        this.tempFilePath = "";
        this.shareId = "";
        this.c2paWritten = C090F.LIZIZ();
        this.c2paStarted = new AtomicBoolean(false);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LIZLLL(InterfaceC1369790lkX interfaceC1369790lkX) {
        return !Intrinsics.LJFF(interfaceC1369790lkX.key(), "tako_share_download_long_image");
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final AbstractC1375550ltp LJIILLIIL(InterfaceC1369790lkX interfaceC1369790lkX) {
        Uri uri = this.tempFileUri;
        if (uri != null) {
            return new C1375540lto(uri, null, null, null, null, false, 252);
        }
        return super.LJIILLIIL(interfaceC1369790lkX);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final AbstractC19483511Kn<AbstractC1375550ltp> LJIIZILJ(InterfaceC1369790lkX interfaceC1369790lkX) {
        final ACallableS236S0200000_2 aCallableS236S0200000_2 = new ACallableS236S0200000_2(this, interfaceC1369790lkX, 1);
        C19483611Ko c19483611KoLJIJJ = new AbstractC19483511Kn<T>(aCallableS236S0200000_2) { // from class: X.11Ir
            public final Callable<? extends C11ID<? extends T>> LL;

            {
                this.LL = aCallableS236S0200000_2;
            }

            @Override // X.AbstractC19483511Kn
            public final void LJIJI(C11IH<? super T> c11ih) throws Throwable {
                try {
                    C11ID<? extends T> c11idCall = this.LL.call();
                    C1701890uOB.LIZ(c11idCall, "The maybeSupplier returned a null MaybeSource");
                    c11idCall.LIZ(c11ih);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C11SP.LIZ(th);
                    C11JT.error(th, c11ih);
                }
            }
        }.LJIJJ(C11S5.LIZ());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C11RO c11ro = C11S5.LIZIZ;
        C1701890uOB.LIZ(timeUnit, "unit is null");
        C1701890uOB.LIZ(c11ro, "scheduler is null");
        return new C11J8(c19483611KoLJIJJ, new C11IM(Math.max(0L, 10L), timeUnit, c11ro), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJ(X.InterfaceC1364105Vn<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C15450063c
            if (r0 == 0) goto L20
            r4 = r6
            X.063c r4 = (X.C15450063c) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L3f
        L20:
            X.063c r4 = new X.063c
            r4.<init>(r5, r6)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            r5.LJJI()
            X.05XL<java.lang.Boolean> r0 = r5.c2paWritten     // Catch: java.lang.Throwable -> L50
            r4.LLILLL = r1     // Catch: java.lang.Throwable -> L50
            java.lang.Object r3 = r0.LJLIIIL(r4)     // Catch: java.lang.Throwable -> L50
            if (r3 != r2) goto L42
            return r2
        L3f:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L50
        L42:
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L50
            boolean r0 = r3.booleanValue()     // Catch: java.lang.Throwable -> L50
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L50
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L50
            goto L5c
        L50:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        L5c:
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C189200o6.m7isFailureimpl(r2)
            if (r0 == 0) goto L68
            return r1
        L68:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.share.panel.TakoLongImageSharePackage.LJJ(X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.model.LinkDefaultSharePackageV2, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final void LJIJ(InterfaceC1369790lkX interfaceC1369790lkX, Function2<? super AbstractC1375550ltp, ? super Boolean, Unit> function2) {
        if (this.tempFilePath.length() == 0) {
            function2.invoke(LJIILLIIL(interfaceC1369790lkX), Boolean.TRUE);
        } else {
            LJJI();
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C15448063a(this, function2, interfaceC1369790lkX, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.model.LinkDefaultSharePackageV2, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LJII(InterfaceC1369790lkX interfaceC1369790lkX, Context context, View view, C0M7Y c0m7y, Function1<? super Boolean, Unit> function1) {
        boolean zLIZIZ;
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        if (!zLIZIZ) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C063X(context, interfaceC1369790lkX, null), 3);
            return true;
        }
        if (Intrinsics.LJFF(interfaceC1369790lkX.key(), "tako_share_download_long_image")) {
            Function2<? super Context, ? super BaseSharePackage, Unit> function2 = this.onDownload;
            if (function2 == null) {
                function1.invoke(Boolean.FALSE);
                return false;
            }
            function2.invoke(context, this);
            return true;
        }
        super.LJII(interfaceC1369790lkX, context, view, c0m7y, function1);
        return false;
    }
}
