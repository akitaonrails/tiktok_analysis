package com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo;

import X.AnonymousClass0957;
import X.C01GW;
import X.C189200o6;
import X.C329560Cvy;
import X.C329660Cw8;
import X.C452501pT;
import androidx.lifecycle.ViewModel;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchProsConsRepo {
    public final ConcurrentHashMap<C329660Cw8, C329560Cvy> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<C329660Cw8, CopyOnWriteArrayList<AnonymousClass0957<C189200o6<C329560Cvy>>>> LIZIZ = new ConcurrentHashMap<>();

    public static final class RepoViewModel extends ViewModel {
        public final C01GW LL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1845));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C329660Cw8 r6, X.InterfaceC1364105Vn<? super X.C189200o6<X.C329560Cvy>> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C329630Cw5
            if (r0 == 0) goto L43
            r4 = r7
            X.0Cw5 r4 = (X.C329630Cw5) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L43
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L49
            X.C155000ia.LIZIZ(r3)
            X.00o6 r3 = (X.C189200o6) r3
            java.lang.Object r0 = r3.m10unboximpl()
        L28:
            return r0
        L29:
            X.C155000ia.LIZIZ(r3)
            java.util.concurrent.ConcurrentHashMap<X.0Cw8, X.0Cvy> r0 = r5.LIZ
            java.lang.Object r0 = r0.get(r6)
            X.0Cvy r0 = (X.C329560Cvy) r0
            if (r0 == 0) goto L41
            int r0 = r0.LIZ
        L38:
            r4.LLILLL = r1
            java.lang.Object r0 = r5.LIZJ(r6, r0, r4)
            if (r0 != r2) goto L28
            return r2
        L41:
            r0 = 0
            goto L38
        L43:
            X.0Cw5 r4 = new X.0Cw5
            r4.<init>(r5, r7)
            goto L12
        L49:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchProsConsRepo.LIZ(X.0Cw8, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C329660Cw8 r6, X.InterfaceC1364105Vn<? super X.C189200o6<X.C329560Cvy>> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C329640Cw6
            if (r0 == 0) goto L42
            r4 = r7
            X.0Cw6 r4 = (X.C329640Cw6) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L42
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L48
            X.C155000ia.LIZIZ(r3)
            X.00o6 r3 = (X.C189200o6) r3
            java.lang.Object r0 = r3.m10unboximpl()
        L28:
            return r0
        L29:
            X.C155000ia.LIZIZ(r3)
            java.util.concurrent.ConcurrentHashMap<X.0Cw8, X.0Cvy> r0 = r5.LIZ
            java.lang.Object r0 = r0.get(r6)
            if (r0 == 0) goto L38
            X.C189200o6.m2constructorimpl(r0)
            return r0
        L38:
            r4.LLILLL = r1
            r0 = 0
            java.lang.Object r0 = r5.LIZJ(r6, r0, r4)
            if (r0 != r2) goto L28
            return r2
        L42:
            X.0Cw6 r4 = new X.0Cw6
            r4.<init>(r5, r7)
            goto L12
        L48:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchProsConsRepo.LIZIZ(X.0Cw8, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac A[Catch: all -> 0x014c, TryCatch #1 {all -> 0x014c, blocks: (B:35:0x00a2, B:36:0x00a5, B:39:0x00ac, B:41:0x00b0, B:43:0x00b4, B:45:0x00b8, B:46:0x00c3, B:48:0x00c9, B:50:0x00d8, B:53:0x00df, B:56:0x00e5, B:60:0x00ed, B:62:0x00fd, B:63:0x00ff, B:65:0x010c, B:66:0x011c, B:67:0x0120, B:68:0x0126, B:69:0x014b), top: B:98:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00df A[Catch: all -> 0x014c, TryCatch #1 {all -> 0x014c, blocks: (B:35:0x00a2, B:36:0x00a5, B:39:0x00ac, B:41:0x00b0, B:43:0x00b4, B:45:0x00b8, B:46:0x00c3, B:48:0x00c9, B:50:0x00d8, B:53:0x00df, B:56:0x00e5, B:60:0x00ed, B:62:0x00fd, B:63:0x00ff, B:65:0x010c, B:66:0x011c, B:67:0x0120, B:68:0x0126, B:69:0x014b), top: B:98:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e5 A[Catch: all -> 0x014c, TryCatch #1 {all -> 0x014c, blocks: (B:35:0x00a2, B:36:0x00a5, B:39:0x00ac, B:41:0x00b0, B:43:0x00b4, B:45:0x00b8, B:46:0x00c3, B:48:0x00c9, B:50:0x00d8, B:53:0x00df, B:56:0x00e5, B:60:0x00ed, B:62:0x00fd, B:63:0x00ff, B:65:0x010c, B:66:0x011c, B:67:0x0120, B:68:0x0126, B:69:0x014b), top: B:98:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e8  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C329660Cw8 r11, int r12, X.InterfaceC1364105Vn<? super X.C189200o6<X.C329560Cvy>> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchProsConsRepo.LIZJ(X.0Cw8, int, X.05Vn):java.lang.Object");
    }
}
