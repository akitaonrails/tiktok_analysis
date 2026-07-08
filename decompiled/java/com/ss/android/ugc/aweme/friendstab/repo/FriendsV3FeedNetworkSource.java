package com.ss.android.ugc.aweme.friendstab.repo;

import X.C01GW;
import X.C0B5Z;
import X.C0SDP;
import X.C0W17;
import X.C0XIR;
import X.C100800Zq;
import X.C1386160mAw;
import X.C1587740rQ4;
import X.C1587880rQI;
import X.C189200o6;
import X.C2188811AlT;
import X.C23112093u;
import X.C282910B6z;
import X.C452501pT;
import X.C584850Mwl;
import X.C628500Oky;
import X.C630740Ooa;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsV3FeedNetworkSource {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(158));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(157));
    public final C630740Ooa LIZJ = C628500Oky.LIZ(AFwS213S0000000_24.get$arr$(159));
    public final C630740Ooa LIZLLL = C628500Oky.LIZ(AFwS213S0000000_24.get$arr$(156));
    public final int LJ = 31;

    public static void LJ() {
        C1587740rQ4 c1587740rQ4 = C1587740rQ4.LIZ;
        c1587740rQ4.getClass();
        if (C1587740rQ4.LJIJI) {
            return;
        }
        C1587740rQ4.LJ = SystemClock.elapsedRealtime();
        C1587740rQ4.LJIILIIL = SystemClock.elapsedRealtime() - C1587740rQ4.LIZJ;
        C1587740rQ4.LJI(c1587740rQ4, C0SDP.ERROR_PAGE, false, "FeedDataError", 2);
    }

    public final C1587880rQI LIZJ() {
        return (C1587880rQI) this.LIZIZ.getValue();
    }

    public static boolean LIZ(Throwable th) {
        C23112093u c23112093u;
        if (th == null || !((Boolean) C282910B6z.LIZ.getValue()).booleanValue() || !(th instanceof C0XIR) || (c23112093u = (C23112093u) th) == null || c23112093u.getErrorCode() != 8) {
            return false;
        }
        return true;
    }

    public static int LIZIZ(Object obj) {
        Object obj2;
        if (C189200o6.m7isFailureimpl(obj)) {
            obj2 = null;
        } else {
            obj2 = obj;
        }
        FriendsV3FeedResponse friendsV3FeedResponse = (FriendsV3FeedResponse) obj2;
        if (C189200o6.m7isFailureimpl(obj) || friendsV3FeedResponse == null) {
            return 1;
        }
        if (friendsV3FeedResponse.status_code != 0) {
            return 2;
        }
        List<FriendsV3FeedModel> list = friendsV3FeedResponse.friendsV3Feeds;
        if (list != null && !list.isEmpty()) {
            return 0;
        }
        return 3;
    }

    public static boolean LJI(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shouldInterceptRetryWhenPreload, isPreload=");
        sbLIZ.append(z);
        sbLIZ.append(",!FriendsV3DisableErrorRetryWhenPreload.enable:");
        C01GW c01gw = C0B5Z.LIZ;
        sbLIZ.append(!((Boolean) c01gw.getValue()).booleanValue());
        C2188811AlT.LIZIZ(sbLIZ);
        if (((Boolean) c01gw.getValue()).booleanValue() && z) {
            return true;
        }
        return false;
    }

    public final Object LIZLLL(FriendsV3FeedResponse friendsV3FeedResponse) {
        ArrayList arrayList;
        FriendsV3RepostModel friendsV3RepostModel;
        boolean z;
        Aweme aweme;
        String imprId;
        String imprId2;
        String imprId3;
        FriendsV3RepostModel friendsV3RepostModel2;
        boolean z2 = !C100800Zq.LIZ();
        FriendsV3FeedResponse friendsV3FeedResponseLJ = null;
        if (friendsV3FeedResponse != null) {
            List<FriendsV3FeedModel> list = friendsV3FeedResponse.friendsV3Feeds;
            if (list != null) {
                arrayList = new ArrayList();
                int i = 0;
                for (FriendsV3FeedModel friendsV3FeedModel : list) {
                    Aweme aweme2 = friendsV3FeedModel.aweme;
                    if ((aweme2 != null && aweme2.getIsTikTokStory()) || ((friendsV3RepostModel = friendsV3FeedModel.repostItem) != null && (aweme = friendsV3RepostModel.repostedAweme) != null && aweme.getIsTikTokStory())) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z2 && z) {
                        C0W17.LIZJ("network", "handleResponseInit, filter story item");
                    } else {
                        Aweme aweme3 = friendsV3FeedModel.aweme;
                        if (aweme3 != null || ((friendsV3RepostModel2 = friendsV3FeedModel.repostItem) != null && (aweme3 = friendsV3RepostModel2.repostedAweme) != null)) {
                            IRequestIdService iRequestIdService = (IRequestIdService) this.LIZJ.getValue();
                            if (iRequestIdService != null) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(aweme3.getAid());
                                sbLIZ.append(this.LJ);
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                LogPbBean logPbBean = friendsV3FeedResponse.logPb;
                                if (logPbBean != null) {
                                    imprId2 = logPbBean.getImprId();
                                } else {
                                    imprId2 = null;
                                }
                                iRequestIdService.LIZIZ(i, strLIZIZ, imprId2);
                            }
                            LogPbBean logPbBean2 = friendsV3FeedResponse.logPb;
                            if (logPbBean2 != null) {
                                imprId = logPbBean2.getImprId();
                            } else {
                                imprId = null;
                            }
                            aweme3.setRequestId(imprId);
                            IAwemeService iAwemeService = (IAwemeService) this.LIZLLL.getValue();
                            if (iAwemeService != null) {
                                iAwemeService.LLILLL(aweme3);
                            }
                            C584850Mwl.LIZ.LJI(imprId, friendsV3FeedResponse.logPb);
                        }
                        RoomFeedCellStruct roomFeedCellStruct = friendsV3FeedModel.roomStruct;
                        if (roomFeedCellStruct != null) {
                            LogPbBean logPbBean3 = friendsV3FeedResponse.logPb;
                            if (logPbBean3 != null) {
                                imprId3 = logPbBean3.getImprId();
                            } else {
                                imprId3 = null;
                            }
                            LiveRoomStruct newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData();
                            if (newLiveRoomData != null) {
                                newLiveRoomData.setRequestId(imprId3);
                            }
                            LiveRoomStruct newLiveRoomData2 = roomFeedCellStruct.getNewLiveRoomData();
                            if (newLiveRoomData2 != null) {
                                newLiveRoomData2.clientAcceptanceTime = System.currentTimeMillis();
                            }
                            LiveRoomStruct newLiveRoomData3 = roomFeedCellStruct.getNewLiveRoomData();
                            if (newLiveRoomData3 != null) {
                                newLiveRoomData3.livePositionInRequest = i + 1;
                            }
                        }
                        i++;
                        arrayList.add(friendsV3FeedModel);
                    }
                }
            } else {
                arrayList = null;
                if (friendsV3FeedResponse != null) {
                }
            }
            friendsV3FeedResponseLJ = FriendsV3FeedResponse.LJ(friendsV3FeedResponse, arrayList);
            C1386160mAw.LIZJ(friendsV3FeedResponseLJ, friendsV3FeedResponse);
        }
        C189200o6.m2constructorimpl(friendsV3FeedResponseLJ);
        return friendsV3FeedResponseLJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX INFO: renamed from: requestTextDetail-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m212requestTextDetail0E7RQCE(java.lang.String r6, @X.InterfaceC2177008fw java.lang.Object r7, X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedResponse>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C1588010rQV
            if (r0 == 0) goto L20
            r4 = r8
            X.0rQV r4 = (X.C1588010rQV) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L38
            if (r1 != r0) goto L30
            goto L26
        L20:
            X.0rQV r4 = new X.0rQV
            r4.<init>(r5, r8)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L45
            X.00o6 r3 = (X.C189200o6) r3     // Catch: java.lang.Exception -> L45
            java.lang.Object r0 = r3.m10unboximpl()     // Catch: java.lang.Exception -> L45
            return r0
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L38:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0     // Catch: java.lang.Exception -> L45
            r0 = 0
            java.lang.Object r0 = r5.m213requestTextDetailInnerBWLJW6A(r6, r7, r0, r4)     // Catch: java.lang.Exception -> L45
            if (r0 != r2) goto L56
            return r2
        L45:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "network"
            X.C0W17.LIZIZ(r0, r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L56:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedNetworkSource.m212requestTextDetail0E7RQCE(java.lang.String, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX INFO: renamed from: requestTextHistory-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m214requestTextHistory0E7RQCE(X.AbstractC1588120rQg r6, @X.InterfaceC2177008fw java.lang.Object r7, X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedResponse>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C1587990rQT
            if (r0 == 0) goto L20
            r4 = r8
            X.0rQT r4 = (X.C1587990rQT) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L38
            if (r1 != r0) goto L30
            goto L26
        L20:
            X.0rQT r4 = new X.0rQT
            r4.<init>(r5, r8)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L45
            X.00o6 r3 = (X.C189200o6) r3     // Catch: java.lang.Exception -> L45
            java.lang.Object r0 = r3.m10unboximpl()     // Catch: java.lang.Exception -> L45
            return r0
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L38:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0     // Catch: java.lang.Exception -> L45
            r0 = 0
            java.lang.Object r0 = r5.m215requestTextHistoryInnerBWLJW6A(r6, r7, r0, r4)     // Catch: java.lang.Exception -> L45
            if (r0 != r2) goto L56
            return r2
        L45:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "network"
            X.C0W17.LIZIZ(r0, r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L56:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedNetworkSource.m214requestTextHistory0E7RQCE(X.0rQg, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x010a  */
    /* JADX INFO: renamed from: requestTextDetailInner-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m213requestTextDetailInnerBWLJW6A(java.lang.String r19, @X.InterfaceC2177008fw java.lang.Object r20, int r21, X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedResponse>> r22) {
        /*
            Method dump skipped, instruction units count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedNetworkSource.m213requestTextDetailInnerBWLJW6A(java.lang.String, java.lang.Object, int, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0153  */
    /* JADX INFO: renamed from: requestTextHistoryInner-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m215requestTextHistoryInnerBWLJW6A(X.AbstractC1588120rQg r13, @X.InterfaceC2177008fw java.lang.Object r14, int r15, X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedResponse>> r16) {
        /*
            Method dump skipped, instruction units count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedNetworkSource.m215requestTextHistoryInnerBWLJW6A(X.0rQg, java.lang.Object, int, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX INFO: renamed from: request-jLovISM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m210requestjLovISM(X.AbstractC1588120rQg r29, int r30, int r31, java.lang.Long r32, java.lang.String r33, @X.InterfaceC2177008fw java.lang.Object r34, X.EnumC1587000rOs r35, X.EnumC1586970rOp r36, X.C1581400rFq r37, java.lang.String r38, java.lang.Integer r39, X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedResponse>> r40) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedNetworkSource.m210requestjLovISM(X.0rQg, int, int, java.lang.Long, java.lang.String, java.lang.Object, X.0rOs, X.0rOp, X.0rFq, java.lang.String, java.lang.Integer, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0229  */
    /* JADX INFO: renamed from: requestInner-p3iPjrY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m211requestInnerp3iPjrY(X.AbstractC1588120rQg r53, int r54, int r55, java.lang.Long r56, java.lang.String r57, @X.InterfaceC2177008fw java.lang.Object r58, int r59, java.lang.String r60, X.EnumC1587000rOs r61, X.EnumC1586970rOp r62, X.C1581400rFq r63, X.C1588150rQj r64, java.lang.String r65, java.lang.Integer r66, X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedResponse>> r67) {
        /*
            Method dump skipped, instruction units count: 969
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedNetworkSource.m211requestInnerp3iPjrY(X.0rQg, int, int, java.lang.Long, java.lang.String, java.lang.Object, int, java.lang.String, X.0rOs, X.0rOp, X.0rFq, X.0rQj, java.lang.String, java.lang.Integer, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d5  */
    /* JADX INFO: renamed from: handleEmptyRetryAgain-Y5yfBNE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m208handleEmptyRetryAgainY5yfBNE(com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedResponse r26, X.AbstractC1588120rQg r27, int r28, int r29, java.lang.Long r30, java.lang.String r31, @X.InterfaceC2177008fw java.lang.Object r32, int r33, java.lang.String r34, X.EnumC1587000rOs r35, X.EnumC1586970rOp r36, X.C1581400rFq r37, X.C1588150rQj r38, java.lang.String r39, java.lang.Integer r40, X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedResponse>> r41) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedNetworkSource.m208handleEmptyRetryAgainY5yfBNE(com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedResponse, X.0rQg, int, int, java.lang.Long, java.lang.String, java.lang.Object, int, java.lang.String, X.0rOs, X.0rOp, X.0rFq, X.0rQj, java.lang.String, java.lang.Integer, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX INFO: renamed from: handleErrorRetryAgain-qRkA4Yo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m209handleErrorRetryAgainqRkA4Yo(java.lang.Object r22, X.AbstractC1588120rQg r23, int r24, int r25, java.lang.Long r26, java.lang.String r27, @X.InterfaceC2177008fw java.lang.Object r28, int r29, java.lang.String r30, X.EnumC1587000rOs r31, X.EnumC1586970rOp r32, X.C1581400rFq r33, X.C1588150rQj r34, java.lang.String r35, java.lang.Integer r36, X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedResponse>> r37) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedNetworkSource.m209handleErrorRetryAgainqRkA4Yo(java.lang.Object, X.0rQg, int, int, java.lang.Long, java.lang.String, java.lang.Object, int, java.lang.String, X.0rOs, X.0rOp, X.0rFq, X.0rQj, java.lang.String, java.lang.Integer, X.05Vn):java.lang.Object");
    }
}
