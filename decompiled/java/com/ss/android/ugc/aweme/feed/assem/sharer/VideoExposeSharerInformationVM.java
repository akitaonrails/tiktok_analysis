package com.ss.android.ugc.aweme.feed.assem.sharer;

import X.C013C;
import X.C01GW;
import X.C0O3Q;
import X.C0OAD;
import X.C0S2L;
import X.C0S2V;
import X.C0SY1;
import X.C118300cf;
import X.C1233040iBy;
import X.C1234220iDs;
import X.C1252610ihX;
import X.C1260910iuv;
import X.C1336205Ku;
import X.C1388190mED;
import X.C13LE;
import X.C19651011uW;
import X.C1D0F;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217371BqR;
import X.C2276471E8n;
import X.C2296808zG;
import X.C2296908zH;
import X.C2344009Gk;
import X.C283930BAx;
import X.C289860BXs;
import X.C452501pT;
import X.C612510O0r;
import X.C717560SCs;
import X.C717570SCt;
import X.C717580SCu;
import X.C717590SCv;
import X.C723180SYi;
import X.C735840Sti;
import X.C736420Sue;
import X.EnumC1260920iuw;
import X.EnumC1260930iux;
import X.InterfaceC0148002o;
import X.InterfaceC2217461Bqa;
import X.InterfaceC723190SYj;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS26S0010000_11;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes12.dex */
public final class VideoExposeSharerInformationVM extends FeedBaseViewModel<C0S2L> implements InterfaceC723190SYj {
    public static final C612510O0r LLILZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C717590SCv LL;
    public C0SY1 LLILLJJLI;
    public final C01GW LLILLL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0O0r] */
    static {
        C2217371BqR c2217371BqR = new C2217371BqR(VideoExposeSharerInformationVM.class, "context", "getContext()Landroid/content/Context;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217371BqR};
        LLILZ = new Object() { // from class: X.0O0r
        };
    }

    @Override // X.InterfaceC723190SYj
    public final void uc1(FollowStatus followStatus) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0S2L(0);
    }

    public final Context getContext() {
        C717590SCv c717590SCv = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
        return (Context) c717590SCv.LIZ();
    }

    public final IIMService xQ2() {
        return (IIMService) this.LLILLL.getValue();
    }

    public VideoExposeSharerInformationVM() {
        C2296808zG.LIZ(new C717560SCs(CoroutineExceptionHandler.LJJLIL).plus(C2296908zH.LIZ()));
        this.LL = new C717590SCv(new C717580SCu());
        this.LLILLL = C452501pT.LIZIZ(new C717570SCt());
    }

    public final String AQ2() {
        String uid;
        User userYQ2 = yQ2();
        return (userYQ2 == null || (uid = userYQ2.getUid()) == null) ? "" : uid;
    }

    public final boolean DQ2() {
        List<Integer> canMessageFollowStatusList;
        User userYQ2 = yQ2();
        if (userYQ2 == null || !C289860BXs.LIZ() || !Intrinsics.LJFF(this.eventType, "homepage_hot") || CQ2(userYQ2) || C1336205Ku.LIZJ().LIZJ()) {
            return false;
        }
        if (C283930BAx.LIZ() == 0) {
            if (userYQ2.getFollowStatus() != 2) {
                return false;
            }
        } else if (C283930BAx.LIZ() != 1 && (C283930BAx.LIZ() != 2 || (canMessageFollowStatusList = userYQ2.getCanMessageFollowStatusList()) == null || !canMessageFollowStatusList.contains(Integer.valueOf(userYQ2.getFollowStatus())))) {
            return false;
        }
        return true;
    }

    public final User yQ2() {
        Aweme aweme;
        VideoItemParams item = getItem();
        if (item == null || (aweme = item.getAweme()) == null) {
            return null;
        }
        return AwemeBizExtKt.getSharer(aweme);
    }

    public final int zQ2() {
        User userYQ2 = yQ2();
        if (userYQ2 != null) {
            return userYQ2.getFollowStatus();
        }
        return -1;
    }

    public static boolean CQ2(User user) {
        List<Integer> canMessageFollowStatusList;
        if ((C283930BAx.LIZ() != 0 && ((canMessageFollowStatusList = user.getCanMessageFollowStatusList()) == null || canMessageFollowStatusList.isEmpty())) || C1336205Ku.LIZ(false).getImPrivacySettings().LJI()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void EQ2(String str) {
        Aweme aweme;
        User sharer;
        String str2;
        VideoItemParams item = getItem();
        if (item == null || (aweme = item.getAweme()) == null || (sharer = AwemeBizExtKt.getSharer(aweme)) == null) {
            return;
        }
        int followStatus = sharer.getFollowStatus();
        int followerStatus = sharer.getFollowerStatus();
        if (((C0S2L) getState()).LLJI) {
            return;
        }
        if (followerStatus == 0) {
            str2 = "null";
        } else {
            str2 = "single";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("follow_type", str2);
        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
        c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
        String uid = sharer.getUid();
        if (uid == null) {
            uid = "";
        }
        c2344009Gk.LJIIIIZZ("from_user_id", uid);
        c2344009Gk.LIZJ(followStatus, "follow_status");
        c2344009Gk.LIZJ(followerStatus, "follower_status");
        C20684815ws.LJIILLIIL("click_share_user_info", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC723190SYj
    public final void Uo(FollowStatus followStatus) {
        User userYQ2 = yQ2();
        if (userYQ2 != null && userYQ2.getUid() != null && Intrinsics.LJFF(userYQ2.getUid(), followStatus.getUserId())) {
            userYQ2.setFollowStatus(followStatus.getFollowStatus());
            if (followStatus.getFollowStatus() == 2 && !C1336205Ku.LIZJ().LIZJ()) {
                C1336205Ku.LIZ(false).getImSayHiService().LJIIJ(followStatus);
                FQ2(1, R.attr.a1h, true);
            } else {
                FQ2(0, R.attr.bx, true);
            }
        }
    }

    @Override // X.InterfaceC723190SYj
    public final void th(Exception exc) {
        Activity activityLIZ;
        Context context = getContext();
        if (context != null) {
            activityLIZ = C1388190mED.LIZ(context);
        } else {
            activityLIZ = null;
        }
        C0O3Q.LIZ(activityLIZ, exc);
    }

    @Override // X.InterfaceC723190SYj
    public final void u41(Exception exc) {
        C723180SYi.LIZ(this, exc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String wQ2(com.ss.android.ugc.aweme.profile.model.User r10) {
        /*
            r9 = this;
            int r3 = r10.getFollowStatus()
            int r1 = r10.getFollowerStatus()
            r2 = 2131837643(0x7f1142cb, float:1.9308487E38)
            r0 = 1
            if (r3 == 0) goto L8f
            if (r3 == r0) goto L81
            r0 = 2
            if (r3 == r0) goto L35
            r0 = 4
            if (r3 == r0) goto L27
            android.content.Context r0 = r9.getContext()
            if (r0 == 0) goto L22
            java.lang.String r3 = r0.getString(r2)
        L20:
            if (r3 != 0) goto L26
        L22:
            java.lang.String r3 = X.C20642515q3.LJI(r2)
        L26:
            return r3
        L27:
            android.content.Context r1 = r9.getContext()
            if (r1 == 0) goto L22
            r0 = 2131834779(0x7f11379b, float:1.9302678E38)
            java.lang.String r3 = r1.getString(r0)
            goto L20
        L35:
            android.content.Context r5 = r9.getContext()
            if (r5 == 0) goto L22
            com.ss.android.ugc.aweme.im.saas.host.api.im.callback.IIMUnder16Proxy r0 = X.C1336205Ku.LIZJ()
            boolean r0 = r0.LIZJ()
            if (r0 != 0) goto L79
            boolean r0 = CQ2(r10)
            if (r0 != 0) goto L79
            boolean r0 = r9.DQ2()
            if (r0 == 0) goto L5a
            X.002o r0 = r9.getState()
            X.0S2L r0 = (X.C0S2L) r0
            java.lang.String r3 = r0.LLILZLL
            goto L20
        L5a:
            r8 = 0
            com.ss.android.ugc.aweme.im.service.IIMService r0 = X.C1336205Ku.LIZ(r8)
            X.0igx r3 = r0.getImSayHiService()
            java.lang.String r6 = r10.getUid()
            r7 = 1
            r4 = 2147483647(0x7fffffff, float:NaN)
            java.lang.String r3 = r3.LJFF(r4, r5, r6, r7, r8)
            java.lang.String r1 = r10.getUid()
            java.lang.String r0 = "show"
            r9.BQ2(r1, r0)
            goto L20
        L79:
            r0 = 2131832369(0x7f112e31, float:1.929779E38)
            java.lang.String r3 = r5.getString(r0)
            goto L20
        L81:
            android.content.Context r1 = r9.getContext()
            if (r1 == 0) goto L22
            r0 = 2131834790(0x7f1137a6, float:1.93027E38)
            java.lang.String r3 = r1.getString(r0)
            goto L20
        L8f:
            if (r1 != r0) goto L9f
            android.content.Context r1 = r9.getContext()
            if (r1 == 0) goto L22
            r0 = 2131834735(0x7f11376f, float:1.9302589E38)
            java.lang.String r3 = r1.getString(r0)
            goto L20
        L9f:
            android.content.Context r1 = r9.getContext()
            if (r1 == 0) goto L22
            r0 = 2131834732(0x7f11376c, float:1.9302583E38)
            java.lang.String r3 = r1.getString(r0)
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationVM.wQ2(com.ss.android.ugc.aweme.profile.model.User):java.lang.String");
    }

    public final void BQ2(String str, String str2) {
        if (str == null) {
            return;
        }
        IIMService iIMServiceLIZ = C1336205Ku.LIZ(false);
        if (!iIMServiceLIZ.getImSayHiService().LJ(str, true, null, !C1336205Ku.LIZ(false).getLightInteractService().LIZLLL(str), false)) {
            return;
        }
        if (Intrinsics.LJFF(str2, "show")) {
            iIMServiceLIZ.getImSayhiAnalytics().LIZIZ(str, C2097608Jq.LJIIJ(new Pair("enter_from", "share_user_info_card")), this, false);
        } else {
            if (!Intrinsics.LJFF(str2, "click")) {
                return;
            }
            iIMServiceLIZ.getImSayhiAnalytics().LIZJ(str, C2097608Jq.LJIIJ(new Pair("enter_from", "share_user_info_card")));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final InterfaceC0148002o paramSync2StateAccept(InterfaceC0148002o interfaceC0148002o, VideoItemParams videoItemParams) {
        String nickname;
        String aid;
        String strWQ2;
        User userYQ2;
        User sharer;
        User sharer2;
        User sharer3;
        C0S2L c0s2l = (C0S2L) interfaceC0148002o;
        boolean zDQ2 = DQ2();
        Aweme aweme = videoItemParams.getAweme();
        UrlModel avatarThumb = null;
        if (aweme != null && (sharer3 = AwemeBizExtKt.getSharer(aweme)) != null) {
            nickname = sharer3.getNickname();
        } else {
            nickname = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        FeedAvatarDefaultAssem.LLLJIL.getClass();
        sbLIZ.append(FeedAvatarDefaultAssem.LLLL);
        sbLIZ.append('_');
        Aweme aweme2 = videoItemParams.getAweme();
        if (aweme2 != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (strLIZIZ == null) {
            strLIZIZ = "no_aid";
        }
        Aweme aweme3 = videoItemParams.getAweme();
        if (aweme3 != null && (sharer2 = AwemeBizExtKt.getSharer(aweme3)) != null) {
            avatarThumb = sharer2.getAvatarThumb();
        }
        Aweme aweme4 = videoItemParams.getAweme();
        if (aweme4 == null || (sharer = AwemeBizExtKt.getSharer(aweme4)) == null || (strWQ2 = wQ2(sharer)) == null) {
            strWQ2 = "";
        }
        C0S2L c0s2lLIZ = C0S2L.LIZ(c0s2l, nickname, strLIZIZ, avatarThumb, null, null, strWQ2, 0, 0, false, zDQ2, false, null, 3544);
        User userYQ22 = yQ2();
        if ((userYQ22 != null && userYQ22.getFollowStatus() == 4) || ((userYQ2 = yQ2()) != null && userYQ2.getFollowStatus() == 1)) {
            setState(new AwS26S0010000_11(false, 18));
        }
        return c0s2lLIZ;
    }

    public final void vQ2(String str, String str2) {
        Aweme aweme;
        String strLIZJ;
        VideoItemParams item = getItem();
        if (item != null && (aweme = item.getAweme()) != null) {
            User sharer = AwemeBizExtKt.getSharer(aweme);
            C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("current sharer: ");
            sbLIZ.append(sharer);
            c2276471E8n.LIZIZ("common_feed", "Relation_Shared", C2188811AlT.LIZIZ(sbLIZ));
            Fragment fragment = null;
            if (sharer != null && sharer.getUid() != null && !C0OAD.LIZIZ(aweme)) {
                if (aweme.isCanPlay() && !AwemeExtKt.isDelete(aweme)) {
                    C1234220iDs.LJIIIIZZ(C1234220iDs.LJI(sharer));
                    boolean zIsConnected = false;
                    C1260910iuv c1260910iuv = new C1260910iuv(0);
                    c1260910iuv.LJJIL("share_link");
                    String str3 = this.eventType;
                    String str4 = "homepage_hot";
                    if (str3 == null) {
                        str3 = "homepage_hot";
                    }
                    c1260910iuv.LJJIJLIJ(str3);
                    c1260910iuv.LJJJJZI(sharer);
                    c1260910iuv.LJJLIIIJJI = EnumC1260930iux.ENTER_PROFILE;
                    c1260910iuv.LJJLIIIJILLIZJL = EnumC1260920iuw.CARD;
                    c1260910iuv.LJJJJLL();
                    c1260910iuv.LJZ = C1234220iDs.LJIIIIZZ(C1234220iDs.LJI(sharer));
                    c1260910iuv.LJJJJIZL("sharer_card");
                    c1260910iuv.LJIILJJIL();
                    C735840Sti c735840Sti = C735840Sti.LIZ;
                    C19651011uW c19651011uW = C19651011uW.LIZIZ;
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", str);
                    if (this.pageType != 0) {
                        str4 = "server_push";
                    }
                    c2344009Gk.LJIIIIZZ("previous_page", str4);
                    c2344009Gk.LJIIIIZZ("enter_method", str2);
                    c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
                    c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
                    c2344009Gk.LJIIIIZZ("to_user_id", sharer.getUid());
                    C1D0F c1d0f = C1D0F.LIZ;
                    if (c1d0f != null) {
                        zIsConnected = c1d0f.isConnected();
                    }
                    c2344009Gk.LJ(Boolean.valueOf(zIsConnected), "is_casting");
                    if (c1d0f == null || (strLIZJ = c1d0f.LIZJ()) == null) {
                        strLIZJ = "";
                    }
                    c2344009Gk.LJIIIIZZ("casting_session_id", strLIZJ);
                    c2344009Gk.LIZLLL(System.currentTimeMillis(), "profile_entrance_id");
                    Object objLJIIIZ = c19651011uW.LJIIIZ(aweme, c2344009Gk);
                    c735840Sti.getClass();
                    C735840Sti.LIZIZ(aweme, objLJIIIZ);
                    C2344009Gk c2344009Gk2 = (C2344009Gk) objLJIIIZ;
                    BtmSDK btmSDK = BtmSDK.INSTANCE;
                    VideoItemParams item2 = getItem();
                    if (item2 != null) {
                        fragment = item2.fragment;
                    }
                    for (Map.Entry entry : BtmSDK.createReportParams$default(btmSDK, "c0.d0", PageFinder.via(fragment), null, 4, null).entrySet()) {
                        c2344009Gk2.LJFF((String) entry.getKey(), String.valueOf(entry.getValue()));
                    }
                    C20684815ws.LJIILLIIL("enter_personal_detail", c2344009Gk2.LIZ);
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), "aweme://user/profile/");
                    smartRouteBuildRoute.withParam("uid", sharer.getUid());
                    smartRouteBuildRoute.withParam("sec_user_id", sharer.getSecUid());
                    smartRouteBuildRoute.withParam("extra_previous_page", "share_user_info_card");
                    smartRouteBuildRoute.withParam("extra_from_pre_page", "share_user_info_card");
                    smartRouteBuildRoute.withParam("enter_from", "others_homepage");
                    smartRouteBuildRoute.withParam("enter_method", "share_link");
                    EnumC1260920iuw enumC1260920iuw = EnumC1260920iuw.CARD;
                    String accurateRecType = sharer.getAccurateRecType();
                    C1252610ihX.Companion.getClass();
                    smartRouteBuildRoute.withParam("recommend_enter_profile_params", new C1252610ihX("homepage_hot", "share_user_info_card", enumC1260920iuw, accurateRecType, C736420Sue.LIZ(sharer), sharer.getUid(), null, null, sharer.getRequestId(), null, null, null, sharer.getMatchedFriendStruct(), null, null, null, false, "share_link", "sharer_card", null, null, false, null, false, null));
                    smartRouteBuildRoute.open();
                    return;
                }
                if (AwemeExtKt.isImage(aweme)) {
                    C1233040iBy c1233040iBy = new C1233040iBy(getContext());
                    c1233040iBy.LIZIZ(2131835839);
                    c1233040iBy.LIZLLL();
                } else {
                    C1233040iBy c1233040iBy2 = new C1233040iBy(getContext());
                    c1233040iBy2.LIZIZ(2131858174);
                    c1233040iBy2.LIZLLL();
                }
            }
        }
    }

    public final void FQ2(int i, int i2, boolean z) {
        String string;
        User userYQ2 = yQ2();
        if (userYQ2 == null) {
            return;
        }
        String strWQ2 = wQ2(userYQ2);
        C013C c013c = new C013C();
        C013C c013c2 = new C013C();
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = i;
        C118300cf c118300cf2 = new C118300cf();
        c118300cf2.element = i2;
        int followStatus = userYQ2.getFollowStatus();
        if (followStatus != 0) {
            if (followStatus != 2) {
                c013c2.element = true;
            } else {
                if (z && DQ2()) {
                    c013c.element = true;
                    c118300cf.element = 0;
                    c118300cf2.element = R.attr.bx;
                    c013c2.element = true;
                }
                Context context = getContext();
                if (context != null) {
                    string = context.getString(R.string.hz7);
                } else {
                    string = null;
                }
                if (Intrinsics.LJFF(strWQ2, string)) {
                    c013c2.element = true;
                }
            }
        } else {
            setState(AFwS243S0000000_11.get$arr$(804));
        }
        setState(new C0S2V(this, c118300cf, c118300cf2, c013c, strWQ2, c013c2, z));
    }
}
