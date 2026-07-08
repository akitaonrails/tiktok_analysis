package com.ss.android.ugc.aweme.downloader;

import X.C098200Yq;
import X.C189200o6;
import X.C534490Kxj;
import X.C534500Kxk;
import X.InterfaceC534560Kxq;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS43S0500000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class DownloadTaskImpl implements InterfaceC534560Kxq {
    public final String LIZIZ;
    public final Context LIZJ;
    public final LifecycleOwner LIZLLL;
    public final List<C534490Kxj> LJ;
    public final C534500Kxk LJFF;

    @Override // X.InterfaceC534560Kxq
    public final void cancel() {
        try {
            this.LJFF.LJ();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C534550Kxp
            if (r0 == 0) goto L24
            r6 = r8
            X.0Kxp r6 = (X.C534550Kxp) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r1 = r6.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r3 = 2
            r2 = 1
            r5 = 0
            if (r0 == 0) goto L35
            if (r0 == r2) goto L32
            if (r0 != r3) goto L2a
            goto L63
        L24:
            X.0Kxp r6 = new X.0Kxp
            r6.<init>(r7, r8)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            com.ss.android.ugc.aweme.downloader.DownloadTaskImpl r2 = r6.LL
            goto L4e
        L35:
            X.C155000ia.LIZIZ(r1)
            X.1DFH r0 = X.C0PEM.LIZ     // Catch: java.lang.Throwable -> L6c
            X.08pq r1 = X.C2107308Nj.LIZ     // Catch: java.lang.Throwable -> L6c
            com.ss.android.ugc.aweme.downloader.DownloadTaskImpl$start$2$1 r0 = new com.ss.android.ugc.aweme.downloader.DownloadTaskImpl$start$2$1     // Catch: java.lang.Throwable -> L6c
            r0.<init>(r7, r5)     // Catch: java.lang.Throwable -> L6c
            r6.LL = r7     // Catch: java.lang.Throwable -> L6c
            r6.LLILZ = r2     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r0 = X.C23250099c.LJI(r6, r1, r0)     // Catch: java.lang.Throwable -> L6c
            if (r0 != r4) goto L4c
            return r4
        L4c:
            r2 = r7
            goto L51
        L4e:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L6c
        L51:
            X.1DFB r1 = X.C0PEM.LIZJ     // Catch: java.lang.Throwable -> L6c
            X.0Kxl r0 = new X.0Kxl     // Catch: java.lang.Throwable -> L6c
            r0.<init>(r2, r5)     // Catch: java.lang.Throwable -> L6c
            r6.LL = r5     // Catch: java.lang.Throwable -> L6c
            r6.LLILZ = r3     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r0 = X.C23250099c.LJI(r6, r1, r0)     // Catch: java.lang.Throwable -> L6c
            if (r0 != r4) goto L66
            return r4
        L63:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L6c
        L66:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L6c
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L6c
            goto L78
        L6c:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L78:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r0 == 0) goto L93
            X.0Kxk r4 = r7.LJFF
            com.ss.android.socialbase.downloader.model.DownloadInfo r3 = new com.ss.android.socialbase.downloader.model.DownloadInfo
            r3.<init>()
            com.ss.android.socialbase.downloader.exception.BaseException r2 = new com.ss.android.socialbase.downloader.exception.BaseException
            r1 = -1
            java.lang.String r0 = "start failed"
            r2.<init>(r1, r0)
            r3.setFailedException(r2)
            r4.LJFF(r3, r5)
        L93:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.downloader.DownloadTaskImpl.LIZ(X.05Vn):java.lang.Object");
    }

    public DownloadTaskImpl(String str, Context context, LifecycleOwner lifecycleOwner, List list, AwS43S0500000_8 awS43S0500000_8) {
        this.LIZIZ = str;
        this.LIZJ = context;
        this.LIZLLL = lifecycleOwner;
        this.LJ = list;
        C534500Kxk c534500Kxk = new C534500Kxk(context, this);
        awS43S0500000_8.invoke(c534500Kxk);
        this.LJFF = c534500Kxk;
    }
}
