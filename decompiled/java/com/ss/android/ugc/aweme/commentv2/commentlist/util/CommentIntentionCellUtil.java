package com.ss.android.ugc.aweme.commentv2.commentlist.util;

import X.C01GW;
import X.C051M;
import X.C09CT;
import X.C0XQ7;
import X.C1017070cZd;
import X.C1339790ky9;
import X.C1344030l4z;
import X.C1344930l6R;
import X.C1345760l7m;
import X.C1440005kM;
import X.C19719612Di;
import X.C2188811AlT;
import X.C452501pT;
import X.C461720I8s;
import X.C703302op;
import X.C786410Ut5;
import X.C844470XAv;
import X.InterfaceC586170Myt;
import X.InterfaceC665370Q7z;
import androidx.fragment.app.Fragment;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility;
import com.ss.android.ugc.aweme.experiment.CommentIntentionControlConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentIntentionCellUtil implements InterfaceC586170Myt {
    public static final CommentIntentionCellUtil LL;
    public static boolean LLILLJJLI;
    public static String LLILLL;
    public static final C01GW LLILZ;
    public static List<CommentIntentionDisplayInfo> LLILZIL;
    public static CommentIntentionControlInfo LLILZLL;

    public static final class CommentIntentionDisplayInfo {

        @C09CT("comment_intention_display_aid")
        public String commentIntentionDisplayAid;

        @C09CT("comment_intention_display_times")
        public int commentIntentionDisplayTimes;

        @C09CT("comment_intention_display_timestamp")
        public long commentIntentionDisplayTimestamp;

        public CommentIntentionDisplayInfo() {
            this("", 0, 0L);
        }

        public CommentIntentionDisplayInfo(String str, int i, long j) {
            this.commentIntentionDisplayAid = str;
            this.commentIntentionDisplayTimes = i;
            this.commentIntentionDisplayTimestamp = j;
        }
    }

    static {
        CommentIntentionCellUtil commentIntentionCellUtil = new CommentIntentionCellUtil();
        LL = commentIntentionCellUtil;
        LLILLL = "";
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL(commentIntentionCellUtil);
        LLILZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(217));
    }

    public static CommentIntentionControlInfo LIZ() {
        CommentIntentionControlInfo commentIntentionControlInfo = LLILZLL;
        if (commentIntentionControlInfo != null) {
            return commentIntentionControlInfo;
        }
        Keva keva = (Keva) LLILZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("comment_intention_long");
        sbLIZ.append(C461720I8s.LIZIZ());
        String string = keva.getString(C2188811AlT.LIZIZ(sbLIZ), "");
        if (C703302op.LIZ(string)) {
            try {
                LLILZLL = (CommentIntentionControlInfo) C051M.LIZIZ(CommentIntentionControlInfo.class, string);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else {
            LLILZLL = new CommentIntentionControlInfo(0, 0L);
        }
        return LLILZLL;
    }

    public static List LIZIZ() {
        ArrayList arrayList;
        List<CommentIntentionDisplayInfo> list = LLILZIL;
        boolean z = true;
        if (!(list == null || list.isEmpty())) {
            return LLILZIL;
        }
        Keva keva = (Keva) LLILZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("comment_intention_short");
        sbLIZ.append(C461720I8s.LIZIZ());
        String string = keva.getString(C2188811AlT.LIZIZ(sbLIZ), "");
        if (string != null && string.length() != 0) {
            z = false;
        }
        if (z) {
            LLILZIL = new ArrayList();
        } else {
            try {
                List list2 = (List) C051M.LIZJ(string, new TypeToken<List<? extends CommentIntentionDisplayInfo>>() { // from class: X.0l6P
                }.getType());
                arrayList = list2 != null ? new ArrayList(list2) : new ArrayList();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                arrayList = new ArrayList();
            }
            LLILZIL = arrayList;
        }
        return LLILZIL;
    }

    public static boolean LIZLLL() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        CommentIntentionControlInfo commentIntentionControlInfoLIZ = LIZ();
        long j = jCurrentTimeMillis - (commentIntentionControlInfoLIZ != null ? commentIntentionControlInfoLIZ.commentIntentionExitTimestamp : 0L);
        CommentIntentionControlConfig commentIntentionControlConfig = (CommentIntentionControlConfig) C1344930l6R.LIZIZ.getValue();
        if (j <= ((long) (commentIntentionControlConfig != null ? commentIntentionControlConfig.commentIntentionExitDays : 0)) * 86400000) {
            C1344030l4z.LIZJ("IntentionCellUtil", "hit long exit");
            return true;
        }
        CommentIntentionControlInfo commentIntentionControlInfoLIZ2 = LIZ();
        if (commentIntentionControlInfoLIZ2 != null) {
            commentIntentionControlInfoLIZ2.commentIntentionExitTimestamp = 0L;
            LL.getClass();
            LJI(commentIntentionControlInfoLIZ2);
        }
        return false;
    }

    public final void LJIIJ() {
        LJIIJJI(this);
        CommentIntentionControlInfo commentIntentionControlInfoLIZ = LIZ();
        int i = 0;
        int i2 = (commentIntentionControlInfoLIZ != null ? commentIntentionControlInfoLIZ.commentIntentionNoClick : 0) + 1;
        CommentIntentionControlConfig commentIntentionControlConfig = (CommentIntentionControlConfig) C1344930l6R.LIZIZ.getValue();
        if (i2 >= (commentIntentionControlConfig != null ? commentIntentionControlConfig.commentIntentionNoClickLimit : 0)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            CommentIntentionControlInfo commentIntentionControlInfoLIZ2 = LIZ();
            if (commentIntentionControlInfoLIZ2 != null) {
                commentIntentionControlInfoLIZ2.commentIntentionExitTimestamp = jCurrentTimeMillis;
                LL.getClass();
                LJI(commentIntentionControlInfoLIZ2);
            }
        } else {
            i = i2;
        }
        CommentIntentionControlInfo commentIntentionControlInfoLIZ3 = LIZ();
        if (commentIntentionControlInfoLIZ3 != null) {
            commentIntentionControlInfoLIZ3.commentIntentionNoClick = i;
            LL.getClass();
            LJI(commentIntentionControlInfoLIZ3);
        }
    }

    public static String LIZJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || !C1017070cZd.LLI(aweme) || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (awemeRawAd.getCreativeId() == null) {
                jSONObject.put("creativeId", JSONObject.NULL);
            } else {
                jSONObject.put("creativeId", awemeRawAd.getCreativeId().longValue());
            }
            Object groupId = awemeRawAd.getGroupId();
            if (groupId == null) {
                groupId = JSONObject.NULL;
            }
            jSONObject.put("groupId", groupId);
            Object adId = awemeRawAd.getAdId();
            if (adId == null) {
                adId = JSONObject.NULL;
            }
            jSONObject.put("adId", adId);
            jSONObject.put("logExtra", awemeRawAd.getLogExtra());
            return C786410Ut5.J3(jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static boolean LJ(String str) {
        int i;
        List listLIZIZ = LIZIZ();
        if (listLIZIZ == null) {
            listLIZIZ = new ArrayList();
        }
        C19719612Di.LJJIIJ(listLIZIZ, AFwS259S0000000_21.get$arr$(129), true);
        LJII(listLIZIZ);
        List listLIZIZ2 = LIZIZ();
        Object obj = null;
        if (listLIZIZ2 != null) {
            Iterator it2 = listLIZIZ2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.LJFF(((CommentIntentionDisplayInfo) next).commentIntentionDisplayAid, str)) {
                    obj = next;
                    break;
                }
            }
            CommentIntentionDisplayInfo commentIntentionDisplayInfo = (CommentIntentionDisplayInfo) obj;
            if (commentIntentionDisplayInfo != null) {
                int i2 = commentIntentionDisplayInfo.commentIntentionDisplayTimes;
                CommentIntentionControlConfig commentIntentionControlConfig = (CommentIntentionControlConfig) C1344930l6R.LIZIZ.getValue();
                if (commentIntentionControlConfig != null) {
                    i = commentIntentionControlConfig.commentIntentionSingleDayLimit;
                } else {
                    i = 0;
                }
                if (i2 >= i && System.currentTimeMillis() - commentIntentionDisplayInfo.commentIntentionDisplayTimestamp < 86400000) {
                    C1344030l4z.LIZJ("IntentionCellUtil", "hit short exit");
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static void LJI(CommentIntentionControlInfo commentIntentionControlInfo) {
        ((Keva) LLILZ.getValue()).storeString("comment_intention_long".concat(C461720I8s.LIZIZ()), C051M.LJ(commentIntentionControlInfo, false));
        C844470XAv.LIZ.getClass();
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test") && C1339790ky9.LIZ()) {
            C1440005kM.LIZ(new IEvent() { // from class: X.0l6Q
                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent post() {
                    C1440005kM.LIZ(this);
                    return this;
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent postSticky() {
                    C1440005kM.LIZIZ(this);
                    return this;
                }
            });
        }
    }

    public static void LJII(List list) {
        Keva keva = (Keva) LLILZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("comment_intention_short");
        sbLIZ.append(C461720I8s.LIZIZ());
        keva.storeString(C2188811AlT.LIZIZ(sbLIZ), C051M.LJ(list, false));
    }

    public static void LJIIJJI(CommentIntentionCellUtil commentIntentionCellUtil) {
        commentIntentionCellUtil.getClass();
        LLILLJJLI = false;
        LLILLL = "";
    }

    public static final class CommentIntentionControlInfo {

        @C09CT("comment_intention_exit_timestamp")
        public long commentIntentionExitTimestamp;

        @C09CT("comment_intention_no_click")
        public int commentIntentionNoClick;

        public CommentIntentionControlInfo() {
            this(0, 0L);
        }

        public CommentIntentionControlInfo(int i, long j) {
            this.commentIntentionNoClick = i;
            this.commentIntentionExitTimestamp = j;
        }
    }

    public final void LJIIIZ(InterfaceC665370Q7z interfaceC665370Q7z, String str, Fragment fragment) {
        int i;
        int i2;
        if (LLILLJJLI) {
            LJIIJJI(this);
            ICommentListVMAbility iCommentListVMAbilityLJ = C1345760l7m.LJ(fragment, interfaceC665370Q7z);
            if (iCommentListVMAbilityLJ != null) {
                iCommentListVMAbilityLJ.JT0(str);
            }
            CommentIntentionControlInfo commentIntentionControlInfoLIZ = LIZ();
            int i3 = 0;
            if (commentIntentionControlInfoLIZ != null) {
                i = commentIntentionControlInfoLIZ.commentIntentionNoClick;
            } else {
                i = 0;
            }
            int i4 = i + 1;
            CommentIntentionControlConfig commentIntentionControlConfig = (CommentIntentionControlConfig) C1344930l6R.LIZIZ.getValue();
            if (commentIntentionControlConfig != null) {
                i2 = commentIntentionControlConfig.commentIntentionNoClickLimit;
            } else {
                i2 = 0;
            }
            if (i4 >= i2) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                CommentIntentionControlInfo commentIntentionControlInfoLIZ2 = LIZ();
                if (commentIntentionControlInfoLIZ2 != null) {
                    commentIntentionControlInfoLIZ2.commentIntentionExitTimestamp = jCurrentTimeMillis;
                    LL.getClass();
                    LJI(commentIntentionControlInfoLIZ2);
                }
            } else {
                i3 = i4;
            }
            CommentIntentionControlInfo commentIntentionControlInfoLIZ3 = LIZ();
            if (commentIntentionControlInfoLIZ3 != null) {
                commentIntentionControlInfoLIZ3.commentIntentionNoClick = i3;
                LL.getClass();
                LJI(commentIntentionControlInfoLIZ3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(android.content.Context r17, X.InterfaceC665370Q7z r18, X.C1340640kzW r19, androidx.fragment.app.Fragment r20) {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.commentlist.util.CommentIntentionCellUtil.LJFF(android.content.Context, X.0Q7z, X.0kzW, androidx.fragment.app.Fragment):void");
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (z) {
            if (i == 1 || i == 2 || i == 3) {
                LJIIJJI(this);
                LLILZIL = null;
                LLILZLL = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0073 A[PHI: r11
      0x0073: PHI (r11v5 java.lang.String) = (r11v0 java.lang.String), (r11v6 java.lang.String) binds: [B:35:0x0071, B:33:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0079 A[PHI: r11
      0x0079: PHI (r11v4 java.lang.String) = (r11v0 java.lang.String), (r11v5 java.lang.String) binds: [B:35:0x0071, B:37:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c A[PHI: r11 r12
      0x007c: PHI (r11v1 java.lang.String) = (r11v4 java.lang.String), (r11v5 java.lang.String) binds: [B:39:0x007a, B:37:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x007c: PHI (r12v0 java.lang.String) = (r12v3 java.lang.String), (r12v4 java.lang.String) binds: [B:39:0x007a, B:37:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0082 A[PHI: r11 r12
      0x0082: PHI (r11v3 java.lang.String) = (r11v1 java.lang.String), (r11v4 java.lang.String) binds: [B:41:0x0080, B:39:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0082: PHI (r12v2 java.lang.String) = (r12v0 java.lang.String), (r12v3 java.lang.String) binds: [B:41:0x0080, B:39:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(X.InterfaceC665370Q7z r16, com.ss.android.ugc.aweme.comment.model.CommentContextSource r17, java.lang.String r18, com.ss.android.ugc.aweme.comment.model.CommentIntentStruct r19, int r20, java.lang.String r21, java.lang.String r22, androidx.fragment.app.Fragment r23) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.commentlist.util.CommentIntentionCellUtil.LJIIIIZZ(X.0Q7z, com.ss.android.ugc.aweme.comment.model.CommentContextSource, java.lang.String, com.ss.android.ugc.aweme.comment.model.CommentIntentStruct, int, java.lang.String, java.lang.String, androidx.fragment.app.Fragment):void");
    }
}
