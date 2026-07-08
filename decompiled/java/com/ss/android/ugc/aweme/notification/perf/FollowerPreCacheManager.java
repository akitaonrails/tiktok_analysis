package com.ss.android.ugc.aweme.notification.perf;

import X.C09CT;
import X.C123100dR;
import X.C13LP;
import X.C1901120zZW;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.TitleTemplate;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class FollowerPreCacheManager {
    public static final FollowerPreCacheManager LIZ = new FollowerPreCacheManager();
    public static C1901120zZW LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040 A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:4:0x0003, B:6:0x001b, B:23:0x0053, B:24:0x0055, B:11:0x0028, B:13:0x002c, B:14:0x002e, B:16:0x0034, B:18:0x0038, B:19:0x003a, B:21:0x0040), top: B:31:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1901120zZW LIZIZ() {
        /*
            java.lang.Class<X.0zZW> r7 = X.C1901120zZW.class
            monitor-enter(r7)
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()     // Catch: java.lang.Throwable -> L59
            X.0XPy r0 = (X.AbstractC848400XPy) r0     // Catch: java.lang.Throwable -> L59
            java.lang.String r4 = r0.getCurUserId()     // Catch: java.lang.Throwable -> L59
            X.0zpR r0 = X.C1910990zpR.LIZIZ     // Catch: java.lang.Throwable -> L59
            java.lang.String r3 = r0.LIZ()     // Catch: java.lang.Throwable -> L59
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r4)     // Catch: java.lang.Throwable -> L59
            r5 = 0
            if (r0 == 0) goto L20
            long r1 = r0.longValue()     // Catch: java.lang.Throwable -> L59
            goto L22
        L20:
            r1 = 0
        L22:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            r1 = 0
            if (r0 > 0) goto L28
            goto L53
        L28:
            X.0zZW r0 = com.ss.android.ugc.aweme.notification.perf.FollowerPreCacheManager.LIZIZ     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L51
            java.lang.String r0 = r0.LIZ     // Catch: java.lang.Throwable -> L59
        L2e:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L40
            X.0zZW r0 = com.ss.android.ugc.aweme.notification.perf.FollowerPreCacheManager.LIZIZ     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L3a
            java.lang.String r1 = r0.LIZIZ     // Catch: java.lang.Throwable -> L59
        L3a:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r1)     // Catch: java.lang.Throwable -> L59
            if (r0 != 0) goto L55
        L40:
            int r0 = X.C2187451AjH.LIZ     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = "FollowerPCManger"
            java.lang.String r0 = "uid or language changed. created new CacheDataHelper"
            X.C1720106oR.LJI(r1, r0)     // Catch: java.lang.Throwable -> L59
            X.0zZW r0 = new X.0zZW     // Catch: java.lang.Throwable -> L59
            r0.<init>(r4, r3)     // Catch: java.lang.Throwable -> L59
            com.ss.android.ugc.aweme.notification.perf.FollowerPreCacheManager.LIZIZ = r0     // Catch: java.lang.Throwable -> L59
            goto L55
        L51:
            r0 = r1
            goto L2e
        L53:
            com.ss.android.ugc.aweme.notification.perf.FollowerPreCacheManager.LIZIZ = r1     // Catch: java.lang.Throwable -> L59
        L55:
            X.0zZW r0 = com.ss.android.ugc.aweme.notification.perf.FollowerPreCacheManager.LIZIZ     // Catch: java.lang.Throwable -> L59
            monitor-exit(r7)
            return r0
        L59:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L59
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.perf.FollowerPreCacheManager.LIZIZ():X.0zZW");
    }

    public static void LIZJ() {
        FollowPageResponse followPageResponse;
        List<FollowPageData> data;
        C1901120zZW c1901120zZWLIZIZ = LIZIZ();
        if (c1901120zZWLIZIZ != null) {
            synchronized (c1901120zZWLIZIZ) {
                FollowNoticeData followNoticeData = c1901120zZWLIZIZ.LIZJ;
                if (followNoticeData != null && (followPageResponse = followNoticeData.resp) != null && (data = followPageResponse.getData()) != null) {
                    for (FollowPageData followPageData : data) {
                        MusNotice musNotice = followPageData.notice;
                        if (musNotice != null) {
                            musNotice.hasRead = true;
                            GeneralTemplateNotice generalTemplateNotice = musNotice.templateNotice;
                            if (generalTemplateNotice != null) {
                                generalTemplateNotice.hasRead = true;
                            }
                        }
                        FollowRequestData followRequestData = followPageData.followRequest;
                        if (followRequestData != null) {
                            followRequestData.setHasRead(true);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b A[Catch: all -> 0x0035, LOOP:0: B:12:0x0025->B:14:0x002b, LOOP_END, TRY_LEAVE, TryCatch #0 {, blocks: (B:6:0x0009, B:7:0x0014, B:9:0x001b, B:11:0x0021, B:12:0x0025, B:14:0x002b), top: B:20:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageResponse r4) {
        /*
            X.0zZW r3 = LIZIZ()
            if (r3 == 0) goto L39
            monitor-enter(r3)
            if (r4 == 0) goto L14
            com.ss.android.ugc.aweme.notification.perf.FollowerPreCacheManager$FollowNoticeData r2 = new com.ss.android.ugc.aweme.notification.perf.FollowerPreCacheManager$FollowNoticeData     // Catch: java.lang.Throwable -> L35
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L35
            r2.<init>(r0, r4)     // Catch: java.lang.Throwable -> L35
            r3.LIZJ = r2     // Catch: java.lang.Throwable -> L35
        L14:
            java.util.concurrent.CopyOnWriteArrayList<com.ss.android.ugc.aweme.profile.model.User> r0 = r3.LIZLLL     // Catch: java.lang.Throwable -> L35
            r0.clear()     // Catch: java.lang.Throwable -> L35
            if (r4 == 0) goto L38
            java.util.List r0 = r4.getData()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L38
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L35
        L25:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L38
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L35
            com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageData r0 = (com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageData) r0     // Catch: java.lang.Throwable -> L35
            r3.LIZ(r0)     // Catch: java.lang.Throwable -> L35
            goto L25
        L35:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L38:
            monitor-exit(r3)
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.perf.FollowerPreCacheManager.LIZLLL(com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageResponse):void");
    }

    public static void LJ(List list) {
        Object next;
        NoticeItems noticeItems;
        User user;
        NoticeUITemplate noticeUITemplate;
        TitleTemplate titleTemplate;
        List<User> list2;
        User user2;
        C1901120zZW c1901120zZWLIZIZ = LIZIZ();
        if (c1901120zZWLIZIZ != null) {
            synchronized (c1901120zZWLIZIZ) {
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (((InboxEntranceCell) next).isFollower()) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    InboxEntranceCell inboxEntranceCell = (InboxEntranceCell) next;
                    if (inboxEntranceCell != null && (noticeItems = inboxEntranceCell.noticePreloadItem) != null) {
                        ArrayList arrayList = new ArrayList();
                        c1901120zZWLIZIZ.LIZLLL.clear();
                        List<? extends MusNotice> list3 = noticeItems.items;
                        if (list3 != null) {
                            for (MusNotice musNotice : list3) {
                                GeneralTemplateNotice generalTemplateNotice = musNotice.templateNotice;
                                if (generalTemplateNotice != null && (noticeUITemplate = generalTemplateNotice.uiTemplate) != null && (titleTemplate = noticeUITemplate.titleTemplate) != null && (list2 = titleTemplate.fromUsers) != null && (user2 = (User) C13LP.LJJJLL(list2)) != null) {
                                    c1901120zZWLIZIZ.LIZLLL.add(user2);
                                } else {
                                    FollowNotice followNotice = musNotice.followNotice;
                                    if (followNotice != null && (user = followNotice.getUser()) != null) {
                                        c1901120zZWLIZIZ.LIZLLL.add(user);
                                    }
                                }
                                int i = musNotice.type;
                                if (i == 305) {
                                    FollowNotice followNotice2 = musNotice.followNotice;
                                    if (followNotice2 != null) {
                                        arrayList.add(new FollowPageData(musNotice.type, null, new FollowRequestData(followNotice2.getUser(), musNotice.createTime, musNotice.hasRead), musNotice.createTime, musNotice.lastReadTime, musNotice.isPriority));
                                    }
                                } else if (i != 0) {
                                    arrayList.add(new FollowPageData(i, musNotice, null, musNotice.createTime, musNotice.lastReadTime, musNotice.isPriority));
                                }
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            c1901120zZWLIZIZ.LIZJ = new FollowNoticeData(System.currentTimeMillis(), new FollowPageResponse(noticeItems.total, noticeItems.hasMore, 0L, noticeItems.maxTime, noticeItems.minTime, 0L, arrayList, 0L, null, 0, ""));
                        }
                    }
                }
            }
        }
    }

    public static final class FollowNoticeData {

        @C09CT("resp")
        public final FollowPageResponse resp;

        @C09CT("ts")
        public long timestamp;

        public FollowNoticeData(long j, FollowPageResponse followPageResponse) {
            this.timestamp = j;
            this.resp = followPageResponse;
        }
    }

    public static void LIZ(FollowerPreCacheManager followerPreCacheManager, String str, String str2, int i) {
        FollowPageResponse followPageResponse;
        List<FollowPageData> data;
        String uid;
        boolean zLJFF;
        User user;
        String str3;
        String str4 = str2;
        String str5 = str;
        if ((i & 1) != 0) {
            str5 = null;
        }
        if ((i & 2) != 0) {
            str4 = null;
        }
        followerPreCacheManager.getClass();
        C1901120zZW c1901120zZWLIZIZ = LIZIZ();
        if (c1901120zZWLIZIZ != null) {
            synchronized (c1901120zZWLIZIZ) {
                FollowNoticeData followNoticeData = c1901120zZWLIZIZ.LIZJ;
                if (followNoticeData != null && (followPageResponse = followNoticeData.resp) != null && (data = followPageResponse.getData()) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (FollowPageData followPageData : data) {
                        FollowPageData followPageData2 = followPageData;
                        if (C123100dR.LIZ(str5)) {
                            MusNotice musNotice = followPageData2.notice;
                            if (musNotice != null) {
                                str3 = musNotice.nid;
                            } else {
                                str3 = null;
                            }
                            zLJFF = Intrinsics.LJFF(str3, str5);
                        } else if (C123100dR.LIZ(str4)) {
                            FollowRequestData followRequestData = followPageData2.followRequest;
                            if (followRequestData != null && (user = followRequestData.user) != null) {
                                uid = user.getUid();
                            } else {
                                uid = null;
                            }
                            zLJFF = Intrinsics.LJFF(uid, str4);
                        } else {
                            arrayList.add(followPageData);
                        }
                        if (!zLJFF) {
                            arrayList.add(followPageData);
                        }
                    }
                    c1901120zZWLIZIZ.LIZJ = new FollowNoticeData(System.currentTimeMillis(), new FollowPageResponse(followPageResponse.getTotal(), followPageResponse.getHasMore(), 0L, followPageResponse.getNoticeMaxTime(), followPageResponse.getNoticeMinTime(), 0L, arrayList, 0L, null, 0, ""));
                }
            }
        }
    }
}
