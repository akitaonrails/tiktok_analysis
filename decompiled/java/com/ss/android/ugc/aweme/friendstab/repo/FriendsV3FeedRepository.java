package com.ss.android.ugc.aweme.friendstab.repo;

import X.C01GW;
import X.C0W17;
import X.C108100b1;
import X.C2188811AlT;
import X.C23250099c;
import X.C452501pT;
import X.C806500VkO;
import X.C806540VkS;
import X.C806550VkT;
import X.C806570VkV;
import X.C817503Hh;
import X.InterfaceC497601wk;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3FeedRequestConfig;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3FeedsDBConfig;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3RecConfig;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3ScrollSpeedConfig;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsV3FeedRepository {
    public static Long LJIIIIZZ;
    public static final FriendsV3FeedRepository LIZ = new FriendsV3FeedRepository();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(134));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(135));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(162));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(164));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(163));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(160));
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(161));
    public static final CopyOnWriteArrayList<Function1<FriendsV3FeedModel, Boolean>> LJIIIZ = new CopyOnWriteArrayList<>();
    public static final C01GW LJIIJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(494));

    public static C806570VkV LIZIZ() {
        return (C806570VkV) LIZIZ.getValue();
    }

    public static String LIZLLL() {
        AccountUserService accountUserServiceLJIIJ;
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) {
            return null;
        }
        return accountUserServiceLJIIJ.getCurUserId();
    }

    public static C806500VkO LJ() {
        return (C806500VkO) LIZJ.getValue();
    }

    public static FriendsV3FeedNetworkSource LJFF() {
        return (FriendsV3FeedNetworkSource) LIZLLL.getValue();
    }

    public static void LJI() {
        if (((FriendsV3FeedsDBConfig) C806540VkS.LIZIZ.getValue()).enableDB) {
            C0W17.LIZJ("repo", "initCacheFromDB");
            C23250099c.LIZLLL(((Boolean) C108100b1.LIZ.getValue()).booleanValue() ? (InterfaceC497601wk) LJIIJ.getValue() : C817503Hh.LL, null, null, new C806550VkT(null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1582260rHE LIZJ() {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedRepository.LIZJ():X.0rHE");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX INFO: renamed from: refreshTextHistory-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m218refreshTextHistorygIAlus(@X.InterfaceC2177008fw java.lang.Object r8, X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedResponse>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C1588030rQX
            if (r0 == 0) goto L48
            r6 = r9
            X.0rQX r6 = (X.C1588030rQX) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 1
            if (r0 == 0) goto L29
            if (r0 != r4) goto L4e
            X.C155000ia.LIZIZ(r1)
            X.00o6 r1 = (X.C189200o6) r1
            java.lang.Object r0 = r1.m10unboximpl()
        L28:
            return r0
        L29:
            X.C155000ia.LIZIZ(r1)
            java.lang.String r1 = "repo"
            java.lang.String r0 = "refreshTextHistory"
            X.C0W17.LIZJ(r1, r0)
            com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedNetworkSource r3 = LJFF()
            X.0rOh r2 = X.EnumC1586890rOh.UNKNOWN
            X.0hqp r1 = new X.0hqp
            r0 = 0
            r1.<init>(r0, r2)
            r6.LLILLL = r4
            java.lang.Object r0 = r3.m214requestTextHistory0E7RQCE(r1, r8, r6)
            if (r0 != r5) goto L28
            return r5
        L48:
            X.0rQX r6 = new X.0rQX
            r6.<init>(r7, r9)
            goto L12
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedRepository.m218refreshTextHistorygIAlus(java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static int LJIIJ(int i, int i2, Integer num) {
        boolean z;
        int i3;
        if (!((FriendsV3ScrollSpeedConfig) LJ.getValue()).enableScrollAwarePageCount || num == null) {
            return i2;
        }
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        if (num.intValue() >= 30) {
            if (z) {
                i3 = ((FriendsV3RecConfig) LJFF.getValue()).countWhenFling;
            } else {
                i3 = ((FriendsV3FeedRequestConfig) LJI.getValue()).countWhenFling;
            }
        } else if (num.intValue() >= 20) {
            if (z) {
                i3 = ((FriendsV3RecConfig) LJFF.getValue()).countWhenFastScroll;
            } else {
                i3 = ((FriendsV3FeedRequestConfig) LJI.getValue()).countWhenFastScroll;
            }
        } else {
            i3 = i2;
        }
        if (i3 != i2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resolvePageCount overridden: orderType=");
            sbLIZ.append(i);
            sbLIZ.append(", scrollSpeedLevel=");
            sbLIZ.append(num);
            sbLIZ.append(", baseCount=");
            sbLIZ.append(i2);
            sbLIZ.append(", override=");
            sbLIZ.append(i3);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX INFO: renamed from: loadMoreTextHistory-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m216loadMoreTextHistory0E7RQCE(X.AbstractC1588120rQg r6, @X.InterfaceC2177008fw java.lang.Object r7, X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedResponse>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C1588000rQU
            if (r0 == 0) goto L50
            r4 = r8
            X.0rQU r4 = (X.C1588000rQU) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 != r2) goto L56
            X.C155000ia.LIZIZ(r1)
            X.00o6 r1 = (X.C189200o6) r1
            java.lang.Object r0 = r1.m10unboximpl()
        L28:
            return r0
        L29:
            X.C155000ia.LIZIZ(r1)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "loadMoreTextHistory, feedPageToken="
            r1.append(r0)
            java.lang.String r0 = r6.LJ
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "repo"
            X.C0W17.LIZJ(r0, r1)
            com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedNetworkSource r0 = LJFF()
            r4.LLILLL = r2
            java.lang.Object r0 = r0.m214requestTextHistory0E7RQCE(r6, r7, r4)
            if (r0 != r3) goto L28
            return r3
        L50:
            X.0rQU r4 = new X.0rQU
            r4.<init>(r5, r8)
            goto L12
        L56:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedRepository.m216loadMoreTextHistory0E7RQCE(X.0rQg, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX INFO: renamed from: refreshTextDetail-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m217refreshTextDetail0E7RQCE(java.lang.String r6, @X.InterfaceC2177008fw java.lang.Object r7, X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedResponse>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C1588020rQW
            if (r0 == 0) goto L4e
            r4 = r8
            X.0rQW r4 = (X.C1588020rQW) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4e
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 != r2) goto L54
            X.C155000ia.LIZIZ(r1)
            X.00o6 r1 = (X.C189200o6) r1
            java.lang.Object r0 = r1.m10unboximpl()
        L28:
            return r0
        L29:
            X.C155000ia.LIZIZ(r1)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "requestTextDetail, aid="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "repo"
            X.C0W17.LIZJ(r0, r1)
            com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedNetworkSource r0 = LJFF()
            r4.LLILLL = r2
            java.lang.Object r0 = r0.m212requestTextDetail0E7RQCE(r6, r7, r4)
            if (r0 != r3) goto L28
            return r3
        L4e:
            X.0rQW r4 = new X.0rQW
            r4.<init>(r5, r8)
            goto L12
        L54:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedRepository.m217refreshTextDetail0E7RQCE(java.lang.String, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.AbstractC1588120rQg r21, java.util.List<java.lang.String> r22, java.lang.Integer r23, X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedResponse>> r24) {
        /*
            r20 = this;
            r3 = r24
            boolean r0 = r3 instanceof X.C1587970rQR
            if (r0 == 0) goto L8e
            r4 = r3
            X.0rQR r4 = (X.C1587970rQR) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8e
            int r2 = r2 - r1
            r4.LLILLL = r2
        L14:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r5 = 1
            if (r0 == 0) goto L2b
            if (r0 != r5) goto L97
            X.C155000ia.LIZIZ(r1)
            X.00o6 r1 = (X.C189200o6) r1
            java.lang.Object r0 = r1.m10unboximpl()
        L2a:
            return r0
        L2b:
            X.C155000ia.LIZIZ(r1)
            java.lang.Long r11 = com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedRepository.LJIIIIZZ
            r2 = 0
            if (r22 == 0) goto L50
            java.lang.String r1 = X.C309390CAv.LIZIZ(r22)     // Catch: java.lang.Throwable -> L3b
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L3b
            goto L47
        L3b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L47:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L4e
            r2 = r1
        L4e:
            java.lang.String r2 = (java.lang.String) r2
        L50:
            r8 = r21
            int r1 = r8.LIZJ()
            r0 = 2
            if (r1 != r0) goto L87
            X.01GW r0 = X.C1588140rQi.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3RecConfig r0 = (com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3RecConfig) r0
            int r1 = r0.loadMoreCount
        L63:
            int r0 = r8.LIZJ()
            r6 = r23
            int r9 = LJIIJ(r0, r1, r6)
            com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedNetworkSource r7 = LJFF()
            r12 = 0
            r4.LLILLL = r5
            r10 = 0
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r12
            r19 = r4
            r18 = r6
            r17 = r2
            java.lang.Object r0 = r7.m210requestjLovISM(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            if (r0 != r3) goto L2a
            return r3
        L87:
            com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3FeedRequestConfig r0 = X.C1582230rHB.LIZ()
            int r1 = r0.loadMoreCount
            goto L63
        L8e:
            X.0rQR r4 = new X.0rQR
            r0 = r20
            r4.<init>(r0, r3)
            goto L14
        L97:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedRepository.LJII(X.0rQg, java.util.List, java.lang.Integer, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.AbstractC1588120rQg r21, java.util.List<java.lang.String> r22, java.lang.Integer r23, X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedResponse>> r24) {
        /*
            r20 = this;
            r3 = r24
            boolean r0 = r3 instanceof X.C1587980rQS
            if (r0 == 0) goto L80
            r4 = r3
            X.0rQS r4 = (X.C1587980rQS) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L80
            int r2 = r2 - r1
            r4.LLILLL = r2
        L14:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r5 = 1
            if (r0 == 0) goto L2b
            if (r0 != r5) goto L88
            X.C155000ia.LIZIZ(r1)
            X.00o6 r1 = (X.C189200o6) r1
            java.lang.Object r0 = r1.m10unboximpl()
        L2a:
            return r0
        L2b:
            X.C155000ia.LIZIZ(r1)
            java.lang.Long r11 = com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedRepository.LJIIIIZZ
            r2 = 0
            if (r22 == 0) goto L50
            java.lang.String r1 = X.C309390CAv.LIZIZ(r22)     // Catch: java.lang.Throwable -> L3b
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L3b
            goto L47
        L3b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L47:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L4e
            r2 = r1
        L4e:
            java.lang.String r2 = (java.lang.String) r2
        L50:
            X.01GW r0 = com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedRepository.LJII
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3LoadPreviousReqConfig r0 = (com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3LoadPreviousReqConfig) r0
            int r1 = r0.loadPreviousCount
            r8 = r21
            int r0 = r8.LIZJ()
            r6 = r23
            int r9 = LJIIJ(r0, r1, r6)
            com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedNetworkSource r7 = LJFF()
            r12 = 0
            r4.LLILLL = r5
            r10 = 0
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r12
            r19 = r4
            r18 = r6
            r17 = r2
            java.lang.Object r0 = r7.m210requestjLovISM(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            if (r0 != r3) goto L2a
            return r3
        L80:
            X.0rQS r4 = new X.0rQS
            r0 = r20
            r4.<init>(r0, r3)
            goto L14
        L88:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedRepository.LJIIIIZZ(X.0rQg, java.util.List, java.lang.Integer, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(int r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, X.InterfaceC1364105Vn r18) {
        /*
            r13 = this;
            r3 = r18
            boolean r0 = r3 instanceof X.C1588040rQY
            r4 = r13
            if (r0 == 0) goto L73
            r12 = r3
            X.0rQY r12 = (X.C1588040rQY) r12
            int r2 = r12.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L73
            int r2 = r2 - r1
            r12.LLILLL = r2
        L15:
            java.lang.Object r1 = r12.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r12.LLILLL
            r2 = 1
            if (r0 == 0) goto L2c
            if (r0 != r2) goto L79
            X.C155000ia.LIZIZ(r1)
            X.00o6 r1 = (X.C189200o6) r1
            java.lang.Object r0 = r1.m10unboximpl()
        L2b:
            return r0
        L2c:
            X.C155000ia.LIZIZ(r1)
            r7 = 0
            if (r17 == 0) goto L63
            int r0 = r17.length()
            if (r0 <= 0) goto L40
            r0 = 1
        L39:
            if (r0 != 0) goto L3d
            r17 = r7
        L3d:
            if (r17 == 0) goto L63
            goto L42
        L40:
            r0 = 0
            goto L39
        L42:
            java.util.List r0 = java.util.Collections.singletonList(r17)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = X.C309390CAv.LIZIZ(r0)     // Catch: java.lang.Throwable -> L4e
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L4e
            goto L5a
        L4e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L5a:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L61
            r7 = r1
        L61:
            java.lang.String r7 = (java.lang.String) r7
        L63:
            r12.LLILLL = r2
            r8 = 0
            r9 = 0
            r6 = r16
            r5 = r15
            r11 = r14
            r10 = r8
            java.lang.Object r0 = r4.LIZ(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r0 != r3) goto L2b
            return r3
        L73:
            X.0rQY r12 = new X.0rQY
            r12.<init>(r4, r3)
            goto L15
        L79:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedRepository.LJIIIZ(int, java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x036a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r0v79, types: [com.ss.android.ugc.aweme.feed.model.Aweme] */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [T] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [T] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r30, java.lang.String r31, java.lang.String r32, X.EnumC1587000rOs r33, boolean r34, X.EnumC1586970rOp r35, int r36, X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedResponse>> r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedRepository.LIZ(java.lang.String, java.lang.String, java.lang.String, X.0rOs, boolean, X.0rOp, int, X.05Vn):java.lang.Object");
    }
}
