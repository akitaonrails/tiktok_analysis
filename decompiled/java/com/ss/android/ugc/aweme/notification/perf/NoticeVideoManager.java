package com.ss.android.ugc.aweme.notification.perf;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C09CT;
import X.C0XQ7;
import X.C1348700lCW;
import X.C1349420lDg;
import X.C1387940mDo;
import X.C14EU;
import X.C1697810uHb;
import X.C1701970uOJ;
import X.C1720106oR;
import X.C1907940zkW;
import X.C1907990zkb;
import X.C1908360zlC;
import X.C1C7U;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2252408s6;
import X.C2300508zr;
import X.C452501pT;
import X.C523420Kfs;
import X.C622680Oba;
import X.C686150Qvl;
import X.C703302op;
import X.C737030Svd;
import X.InterfaceC1209300hZg;
import X.InterfaceC1349410lDf;
import X.InterfaceC427710Gpt;
import android.os.Looper;
import android.os.Message;
import android.util.LruCache;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.experiment.CommentPreloadExperiment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.regex.Matcher;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes29.dex */
public final class NoticeVideoManager implements InterfaceC427710Gpt {
    public static final NoticeVideoManager LL;
    public static final Meta LLILLJJLI;
    public static final C01GW LLILLL;
    public static InnerManager LLILZ;

    public static final class InnerManager extends BPEAHandler implements InterfaceC1209300hZg {
        public final String LL;
        public final C01GW LLILLJJLI;
        public final C01GW LLILLL;
        public final C01GW LLILZ;
        public final C01GW LLILZIL;
        public final C01GW LLILZLL;
        public final C01GW LLIZ;
        public final C01GW LLIZLLLIL;
        public boolean LLJ;
        public final Set<C1349420lDg> LLJI;
        public final Set<C1348700lCW> LLJIJIL;

        public final LruCache<String, Integer> LJFF() {
            return (LruCache) this.LLILZIL.getValue();
        }

        public final LruCache<String, C1907990zkb> LJII() {
            return (LruCache) this.LLILLL.getValue();
        }

        public final LruCache<String, C1907990zkb> LJIIIIZZ() {
            return (LruCache) this.LLILZ.getValue();
        }

        public final CopyOnWriteArrayList<C1701970uOJ> LJIIIZ() {
            return (CopyOnWriteArrayList) this.LLILZLL.getValue();
        }

        public final CopyOnWriteArraySet<String> LJIIJ() {
            return (CopyOnWriteArraySet) this.LLIZ.getValue();
        }

        public final void LJIJ() {
            if (this.LLJ) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.LLJIJIL);
            this.LLJIJIL.clear();
            if (LJIIZILJ(arrayList)) {
                return;
            }
            CommentPreloadExperiment.LIZ.getClass();
            if (CommentPreloadExperiment.LIZ() == 2 && (!arrayList.isEmpty())) {
                CommentService.LIZ.getClass();
                C523420Kfs.LIZ().LJJII(2, "notification_page", arrayList);
            }
        }

        public InnerManager(String str) {
            super(Looper.getMainLooper());
            this.LL = str;
            this.LLILLJJLI = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(282));
            this.LLILLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(283));
            this.LLILZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(285));
            this.LLILZIL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(514));
            this.LLILZLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(286));
            this.LLIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(287));
            this.LLIZLLLIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(284));
            this.LLJI = new LinkedHashSet();
            this.LLJIJIL = new LinkedHashSet();
            C2252408s6.LJIIIZ(new AwS547S0100000_3(this, 40));
        }

        public static void LJ(LruCache lruCache) {
            for (Map.Entry entry : lruCache.snapshot().entrySet()) {
                C1907990zkb c1907990zkb = (C1907990zkb) entry.getValue();
                c1907990zkb.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis() - c1907990zkb.LIZIZ;
                NoticeVideoManager.LL.getClass();
                if (jCurrentTimeMillis > NoticeVideoManager.LIZIZ().expireDuration) {
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("remove expired:");
                    sbLIZ.append((String) entry.getKey());
                    C1720106oR.LJI("NoticeVideoManager", C2188811AlT.LIZIZ(sbLIZ));
                    lruCache.remove(entry.getKey());
                }
            }
        }

        public static String LJIIL(String str) {
            if (C703302op.LIZ(str) && u.LJJIIJZLJL(str, "aweme://aweme/detail/", false)) {
                Matcher matcher = PatternProtector.compile("\\d+\\d").matcher(str);
                if (matcher.find()) {
                    return matcher.group();
                }
                return null;
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0053 A[PHI: r1
          0x0053: PHI (r1v6 java.lang.String) = (r1v4 java.lang.String), (r1v3 java.lang.String) binds: [B:31:0x0051, B:26:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.String LJIILIIL(com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r4) {
            /*
                com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r0 = r4.commentNotice
                if (r0 == 0) goto Lf
                com.ss.android.ugc.aweme.comment.model.Comment r0 = r0.getComment()
                if (r0 == 0) goto Lf
                java.lang.String r1 = r0.getCid()
            Le:
                return r1
            Lf:
                com.ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice r0 = r4.diggNotice
                if (r0 == 0) goto L1e
                com.ss.android.ugc.aweme.comment.model.Comment r0 = r0.getComment()
                if (r0 == 0) goto L1e
                java.lang.String r1 = r0.getCid()
                return r1
            L1e:
                com.ss.android.ugc.aweme.notice.repo.list.bean.AtMe r1 = r4.atMe
                r3 = 0
                if (r1 == 0) goto L6f
                com.ss.android.ugc.aweme.comment.model.Comment r0 = r1.getComment()
                if (r0 == 0) goto L66
                com.ss.android.ugc.aweme.comment.model.Comment r0 = r1.getComment()
                java.lang.String r1 = r0.getCid()
            L31:
                kotlin.Unit r0 = kotlin.Unit.LIZ
                if (r0 != 0) goto Le
            L35:
                com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice r2 = r4.templateNotice
                if (r2 == 0) goto Le
                java.lang.String r0 = r2.schemaUrl
                java.lang.String r1 = LJIILJJIL(r0)
                if (r1 == 0) goto L47
                int r0 = r1.length()
                if (r0 != 0) goto L53
            L47:
                com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate r0 = r2.uiTemplate
                if (r0 == 0) goto L64
                java.lang.String r0 = r0.middleSchemaUrl
            L4d:
                java.lang.String r1 = LJIILJJIL(r0)
                if (r1 == 0) goto L59
            L53:
                int r0 = r1.length()
                if (r0 != 0) goto Le
            L59:
                com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate r0 = r2.uiTemplate
                if (r0 == 0) goto L5f
                java.lang.String r3 = r0.rightSchemaUrl
            L5f:
                java.lang.String r1 = LJIILJJIL(r3)
                return r1
            L64:
                r0 = r3
                goto L4d
            L66:
                java.lang.String r0 = r1.getSchemaUrl()
                java.lang.String r1 = LJIILJJIL(r0)
                goto L31
            L6f:
                r1 = r3
                goto L35
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.perf.NoticeVideoManager.InnerManager.LJIILIIL(com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice):java.lang.String");
        }

        public static String LJIILJJIL(String str) {
            if (str == null) {
                return null;
            }
            return C1907940zkW.LIZIZ(UriProtector.parse(str), "cid");
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [X.0lDe] */
        public static boolean LJIIZILJ(List list) {
            if (C1908360zlC.LIZ()) {
                for (final C1348700lCW c1348700lCW : (ArrayList) list) {
                    Aweme aweme = c1348700lCW.LIZ;
                    ?? r2 = new InterfaceC1349410lDf() { // from class: X.0lDe
                        public final void LIZ(int i) {
                            CommentPreloadExperiment.LIZ.getClass();
                            if (CommentPreloadExperiment.LIZ() == 2) {
                                CommentService.LIZ.getClass();
                                C523420Kfs.LIZ().LJJII(2, "notification_page", Collections.singletonList(c1348700lCW));
                            }
                        }

                        public final void LIZIZ(int i) {
                            CommentService.LIZ.getClass();
                            CommentService commentServiceLIZ = C523420Kfs.LIZ();
                            Aweme aweme2 = c1348700lCW.LIZ;
                            CommentPreloadExperiment.LIZ.getClass();
                            commentServiceLIZ.LJJIIZ(aweme2, Integer.valueOf(((CommentPreloadExperiment.Meta) CommentPreloadExperiment.LIZJ.getValue()).ttl), 2001, "notification_page", "notification_page", c1348700lCW.LIZIZ, i, true, EnumC746780TRc.OTHER.getValue());
                        }
                    };
                    int iLIZ = C1387940mDo.LIZ(aweme);
                    if (iLIZ != -1) {
                        if (iLIZ != 0) {
                            r2.LIZIZ(iLIZ);
                        } else {
                            r2.LIZ(iLIZ);
                        }
                    }
                }
                return true;
            }
            return false;
        }

        @Override // X.InterfaceC1209300hZg
        public final Aweme LIZ(String str) {
            C1907990zkb c1907990zkb = LJII().get(str);
            if (c1907990zkb == null && (c1907990zkb = LJIIIIZZ().get(str)) == null && (c1907990zkb = (C1907990zkb) ((LruCache) this.LLILLJJLI.getValue()).get(str)) == null) {
                return null;
            }
            return c1907990zkb.LIZ;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("NoticeVideoManager$InnerManager@6dab.handleMessage");
            if (message.what == 0) {
                removeMessages(0);
                if (!this.LLJ) {
                    C2252408s6.LJIIIZ(new C2300508zr(this));
                } else {
                    NoticeVideoManager.LL.getClass();
                    sendEmptyMessageDelayed(0, NoticeVideoManager.LIZIZ().alignmentDelay / ((long) 2));
                }
            }
            C1C7U.LIZIZ("NoticeVideoManager$InnerManager@6dab.handleMessage");
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0077 A[PHI: r3
          0x0077: PHI (r3v2 java.lang.String) = (r3v1 java.lang.String), (r3v8 java.lang.String) binds: [B:31:0x0060, B:36:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0095 A[PHI: r3
          0x0095: PHI (r3v6 java.lang.String) = (r3v4 java.lang.String), (r3v3 java.lang.String) binds: [B:47:0x0093, B:42:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x009b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.String LJIIJJI(com.ss.android.ugc.aweme.notification.perf.NoticeVideoManager.InnerManager r5, com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r6) {
            /*
                r5.getClass()
                com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r0 = r6.commentNotice
                r2 = 1
                r5 = 0
                r4 = 0
                if (r0 == 0) goto L3f
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
                if (r0 == 0) goto L3f
                java.lang.String r3 = r0.getAid()
            L14:
                com.ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice r0 = r6.diggNotice
                if (r0 == 0) goto L27
                int r0 = r0.getDiggType()
                if (r0 <= r2) goto L27
                com.ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice r0 = r6.diggNotice
                int r1 = r0.getDiggType()
                r0 = 3
                if (r1 != r0) goto L28
            L27:
                r5 = 1
            L28:
                com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r0 = r6.commentNotice
                if (r0 == 0) goto L3c
                java.util.List<java.lang.Integer> r1 = X.InterfaceC1153260g7I.LIZ
                int r0 = r0.getCommentType()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                boolean r0 = r1.contains(r0)
                r5 = r0 ^ 1
            L3c:
                if (r5 == 0) goto Lb6
                return r3
            L3f:
                com.ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice r0 = r6.diggNotice
                if (r0 == 0) goto L4e
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
                if (r0 == 0) goto L4e
                java.lang.String r3 = r0.getAid()
                goto L14
            L4e:
                com.ss.android.ugc.aweme.notice.repo.list.bean.DuetNotice r0 = r6.duetNotice
                if (r0 == 0) goto Lb4
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.aweme
                if (r0 == 0) goto Lb4
                java.lang.String r3 = r0.getAid()
                kotlin.Unit r0 = kotlin.Unit.LIZ
                if (r0 != 0) goto L14
            L5e:
                com.ss.android.ugc.aweme.notice.repo.list.bean.AtMe r1 = r6.atMe
                if (r1 == 0) goto L77
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r1.getAweme()
                if (r0 == 0) goto Lab
                r1.getAweme()
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r1.getAweme()
                java.lang.String r3 = r0.getAid()
            L73:
                kotlin.Unit r0 = kotlin.Unit.LIZ
                if (r0 != 0) goto L14
            L77:
                com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice r1 = r6.templateNotice
                if (r1 == 0) goto L14
                java.lang.String r0 = r1.schemaUrl
                java.lang.String r3 = LJIIL(r0)
                if (r3 == 0) goto L89
                int r0 = r3.length()
                if (r0 != 0) goto L95
            L89:
                com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate r0 = r1.uiTemplate
                if (r0 == 0) goto La9
                java.lang.String r0 = r0.middleSchemaUrl
            L8f:
                java.lang.String r3 = LJIIL(r0)
                if (r3 == 0) goto L9b
            L95:
                int r0 = r3.length()
                if (r0 != 0) goto L14
            L9b:
                com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate r0 = r1.uiTemplate
                if (r0 == 0) goto La7
                java.lang.String r0 = r0.rightSchemaUrl
            La1:
                java.lang.String r3 = LJIIL(r0)
                goto L14
            La7:
                r0 = r4
                goto La1
            La9:
                r0 = r4
                goto L8f
            Lab:
                java.lang.String r0 = r1.getSchemaUrl()
                java.lang.String r3 = X.ViewOnClickListenerC1906680ziU.matchAid(r0)
                goto L73
            Lb4:
                r3 = r4
                goto L5e
            Lb6:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.perf.NoticeVideoManager.InnerManager.LJIIJJI(com.ss.android.ugc.aweme.notification.perf.NoticeVideoManager$InnerManager, com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice):java.lang.String");
        }

        @Override // X.InterfaceC1209300hZg
        public final void LIZLLL(Aweme aweme, String str) {
            if (aweme != null) {
                C2252408s6.LJIIIZ(new AwS429S0200000_28(this, C1697810uHb.LJIILJJIL(aweme), 38));
            } else {
                if (str.length() <= 0) {
                    return;
                }
                LJII().remove(str);
                LJIIIIZZ().remove(str);
            }
        }
    }

    static {
        NoticeVideoManager noticeVideoManager = new NoticeVideoManager();
        LL = noticeVideoManager;
        LLILLJJLI = new Meta(false, 180L, 2, 10, 20, 400L);
        LLILLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(288));
        C0XQ7.LJFF().LJJIFFI(noticeVideoManager);
        C622680Oba.LIZJ(noticeVideoManager);
    }

    public static final InnerManager LIZ() {
        LL.getClass();
        if (!LIZIZ().isEnabled) {
            return null;
        }
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null || curUserId.length() == 0) {
            LJ();
        } else {
            InnerManager innerManager = LLILZ;
            if (!Intrinsics.LJFF(innerManager != null ? innerManager.LL : null, curUserId)) {
                LJ();
                LLILZ = new InnerManager(curUserId);
            }
        }
        return LLILZ;
    }

    public static Meta LIZIZ() {
        return (Meta) LLILLL.getValue();
    }

    public static final void LJ() {
        InnerManager innerManager = LLILZ;
        if (innerManager != null) {
            C2252408s6.LJIIIZ(new AwS547S0100000_3(innerManager, 41));
        }
        LLILZ = null;
    }

    @C14EU
    public final void onVideoEvent(C737030Svd c737030Svd) {
        String str;
        InnerManager innerManager;
        if (c737030Svd != null && c737030Svd.LIZ == 2) {
            Object obj = c737030Svd.LIZIZ;
            if ((obj instanceof String) && (str = (String) obj) != null && str.length() != 0 && (innerManager = LLILZ) != null) {
                innerManager.LIZLLL(null, str);
            }
        }
    }

    public static void LIZJ(SmartRoute smartRoute, String str) {
        if (LIZIZ().isEnabled && u.LJJIIJZLJL(str, "aweme://aweme/detail/", false)) {
            smartRoute.withParam("video_from", "from_notification_page");
        }
    }

    public static void LIZLLL(C686150Qvl c686150Qvl, String str) {
        if (LIZIZ().isEnabled && u.LJJIIJZLJL(str, "aweme://aweme/detail/", false)) {
            c686150Qvl.LIZIZ("video_from", "from_notification_page");
        }
    }

    @Override // X.InterfaceC427710Gpt
    public final void LLLLLLZZ(int i, User user, User user2) {
        String str;
        String uid;
        String str2;
        InnerManager innerManager = LLILZ;
        String uid2 = null;
        if (innerManager != null) {
            str = innerManager.LL;
        } else {
            str = null;
        }
        if (user2 != null) {
            uid = user2.getUid();
        } else {
            uid = null;
        }
        if (!Intrinsics.LJFF(str, uid)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("user changed:");
            InnerManager innerManager2 = LLILZ;
            if (innerManager2 != null) {
                str2 = innerManager2.LL;
            } else {
                str2 = null;
            }
            sbLIZ.append(str2);
            sbLIZ.append(", ");
            if (user2 != null) {
                uid2 = user2.getUid();
            }
            sbLIZ.append(uid2);
            C1720106oR.LIZ("NoticeVideoManager", C2188811AlT.LIZIZ(sbLIZ));
            LJ();
        }
    }

    public static final class Meta {

        @C09CT("request_alignment_delay")
        public final long alignmentDelay;

        @C09CT("expire_duration")
        public final long expireDuration;

        @C09CT("enabled")
        public final boolean isEnabled;

        @C09CT("preserved_cache_count")
        public final int preservedCacheCount;

        @C09CT("rolling_cache_count")
        public final int rollingCacheCount;

        @C09CT("trigger_preload_condition")
        public final int triggerPreloadCondition;

        public Meta() {
            this(false, 180L, 2, 10, 20, 400L);
        }

        public Meta(boolean z, long j, int i, int i2, int i3, long j2) {
            this.isEnabled = z;
            this.expireDuration = j;
            this.triggerPreloadCondition = i;
            this.preservedCacheCount = i2;
            this.rollingCacheCount = i3;
            this.alignmentDelay = j2;
        }
    }
}
