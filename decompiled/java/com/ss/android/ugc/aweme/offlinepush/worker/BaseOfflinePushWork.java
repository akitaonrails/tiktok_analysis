package com.ss.android.ugc.aweme.offlinepush.worker;

import X.C098200Yq;
import X.C189200o6;
import X.C19319410i8;
import X.C816100Vzs;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes29.dex */
public abstract class BaseOfflinePushWork extends CoroutineWorker {
    public final C19319410i8 LLJ;

    public abstract C816100Vzs LJIIIIZZ(Context context, int i);

    public abstract int LJIIJ();

    public void LJIIJJI() {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.InterfaceC1364105Vn<? super X.AbstractC795160VHe> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C10II
            if (r0 == 0) goto L24
            r3 = r8
            X.10II r3 = (X.C10II) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r4 = r3.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r3.LLILLL
            r5 = 32
            java.lang.String r6 = "[Work] onDoWorkFinally failed strategy="
            r0 = 1
            if (r1 == 0) goto L32
            if (r1 != r0) goto L2a
            goto L3e
        L24:
            X.10II r3 = new X.10II
            r3.<init>(r7, r8)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r4)
            r3.LLILLL = r0     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r4 = r7.LJIIIZ(r3)     // Catch: java.lang.Throwable -> L7c
            if (r4 != r2) goto L41
            return r2
        L3e:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Throwable -> L7c
        L41:
            X.0VHe r4 = (X.AbstractC795160VHe) r4     // Catch: java.lang.Throwable -> L7c
            r7.LJIIJJI()     // Catch: java.lang.Throwable -> L4c
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L4c
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L4c
            goto L58
        L4c:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L58:
            java.lang.Throwable r3 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r3 == 0) goto L7b
            X.10i8 r2 = r7.LLJ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r6)
            int r0 = r7.LJIIJ()
            r1.append(r0)
            r1.append(r5)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.LJ(r0)
        L7b:
            return r4
        L7c:
            r4 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r4)     // Catch: java.lang.Throwable -> L7c
            r7.LJIIJJI()     // Catch: java.lang.Throwable -> L89
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L89
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L89
            goto L95
        L89:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L95:
            java.lang.Throwable r3 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r3 == 0) goto Lb8
            X.10i8 r2 = r7.LLJ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r6)
            int r0 = r7.LJIIJ()
            r1.append(r0)
            r1.append(r5)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.LJ(r0)
        Lb8:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.offlinepush.worker.BaseOfflinePushWork.LJII(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0273 A[Catch: all -> 0x0376, TRY_LEAVE, TryCatch #3 {all -> 0x0376, blocks: (B:130:0x02a0, B:131:0x02a3, B:133:0x02a7, B:137:0x02c7, B:139:0x02d2, B:143:0x02f2, B:119:0x0268, B:122:0x026f, B:124:0x0273, B:127:0x0291, B:118:0x025d, B:115:0x0253, B:116:0x0256, B:112:0x0246), top: B:164:0x001f, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0291 A[Catch: all -> 0x0376, TRY_ENTER, TryCatch #3 {all -> 0x0376, blocks: (B:130:0x02a0, B:131:0x02a3, B:133:0x02a7, B:137:0x02c7, B:139:0x02d2, B:143:0x02f2, B:119:0x0268, B:122:0x026f, B:124:0x0273, B:127:0x0291, B:118:0x025d, B:115:0x0253, B:116:0x0256, B:112:0x0246), top: B:164:0x001f, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02a7 A[Catch: all -> 0x0376, TryCatch #3 {all -> 0x0376, blocks: (B:130:0x02a0, B:131:0x02a3, B:133:0x02a7, B:137:0x02c7, B:139:0x02d2, B:143:0x02f2, B:119:0x0268, B:122:0x026f, B:124:0x0273, B:127:0x0291, B:118:0x025d, B:115:0x0253, B:116:0x0256, B:112:0x0246), top: B:164:0x001f, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02c7 A[Catch: all -> 0x0376, TRY_ENTER, TryCatch #3 {all -> 0x0376, blocks: (B:130:0x02a0, B:131:0x02a3, B:133:0x02a7, B:137:0x02c7, B:139:0x02d2, B:143:0x02f2, B:119:0x0268, B:122:0x026f, B:124:0x0273, B:127:0x0291, B:118:0x025d, B:115:0x0253, B:116:0x0256, B:112:0x0246), top: B:164:0x001f, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x037f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(X.InterfaceC1364105Vn<? super X.AbstractC795160VHe> r14) {
        /*
            Method dump skipped, instruction units count: 911
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.offlinepush.worker.BaseOfflinePushWork.LJIIIZ(X.05Vn):java.lang.Object");
    }

    public BaseOfflinePushWork(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.LLJ = new C19319410i8("push_Work");
    }

    public static String LJIIL(int i, int i2, Context context) {
        Object c098200Yq;
        try {
            c098200Yq = context.getResources().getQuantityString(i, i2, Integer.valueOf(i2));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = context.getString(2131838516);
        }
        return (String) c098200Yq;
    }
}
