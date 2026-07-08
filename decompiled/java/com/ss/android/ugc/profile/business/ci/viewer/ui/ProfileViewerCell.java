package com.ss.android.ugc.profile.business.ci.viewer.ui;

import X.C01GW;
import X.C03GH;
import X.C03GJ;
import X.C06KC;
import X.C0B9D;
import X.C0I0B;
import X.C0NYY;
import X.C0O26;
import X.C0S1B;
import X.C0SY5;
import X.C0SY7;
import X.C0ZD9;
import X.C0ZDI;
import X.C0ZE7;
import X.C1076010e6h;
import X.C1243240iSQ;
import X.C1252610ihX;
import X.C1253000iiA;
import X.C1260910iuv;
import X.C1264070j01;
import X.C1264800j1C;
import X.C1336205Ku;
import X.C1357130lQ7;
import X.C1386850mC3;
import X.C1386870mC5;
import X.C1387050mCN;
import X.C1388190mED;
import X.C1400340mXo;
import X.C1402390mb7;
import X.C1606750ruj;
import X.C1606770rul;
import X.C1607280rva;
import X.C1607310rvd;
import X.C1608750rxx;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2211751BhN;
import X.C297570BlT;
import X.C339190DRl;
import X.C427660Gpo;
import X.C438710HIf;
import X.C452501pT;
import X.C595660NXw;
import X.C735370Ssx;
import X.C736460Sui;
import X.C737760Swo;
import X.C786410Ut5;
import X.C894700Z8a;
import X.C896480ZEw;
import X.C897370ZIh;
import X.C897490ZIt;
import X.C897520ZIw;
import X.EnumC1260930iux;
import X.EnumC1387060mCO;
import X.EnumC1606080rte;
import X.EnumC1606090rtf;
import X.EnumC1908370zlD;
import X.EnumC1908380zlE;
import X.EnumC1910440zoY;
import X.EnumC896030ZDd;
import X.EnumC896490ZEx;
import X.InterfaceC1891350zJl;
import X.InterfaceC892560Yzu;
import X.InterfaceC897380ZIi;
import Y.ACListenerS124S0200000_21;
import Y.ACListenerS155S0100000_21;
import Y.AObserverS224S0100000_21;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.util.IUserProfilePreload;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.relation.label.RelationLabelTextView;
import com.ss.android.ugc.profile.business.ci.viewer.api.ProfileViewerInfo;
import com.ss.android.ugc.profile.business.ci.viewer.ui.ProfileViewerCell;
import com.ss.android.ugc.profile.business.ci.viewer.viewmodel.ProfileViewerViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AFwS258S0000000_20;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class ProfileViewerCell extends PowerCell<C1386850mC3> {
    public boolean LLJIJIL;
    public final C01GW LL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1149));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1141));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1147));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1138));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1148));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1144));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1143));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1140));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1146));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1145));
    public C894700Z8a LLJILJIL = C894700Z8a.LJI;
    public final String LLJILJILJ = "profile_viewer_page";
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1139));

    public final void R5() {
        ProfileViewerInfo profileViewerInfo;
        User user;
        MutualStruct mutualStruct;
        String str;
        List<MutualUser> list;
        C1386850mC3 item = getItem();
        if (item == null || (profileViewerInfo = item.LL) == null || (user = profileViewerInfo.user) == null) {
            return;
        }
        C1386870mC5.LIZ.getClass();
        if (C1386870mC5.LIZ()) {
            X5(user, String.valueOf(this.LLJILJIL.LIZIZ.getValue()));
        } else {
            X5(user, null);
        }
        W5(EnumC1260930iux.ENTER_PROFILE);
        ((IUserProfilePreload) ServiceManager.get().getService(IUserProfilePreload.class)).LIZ(user);
        Activity activityLIZ = C1388190mED.LIZ(this.itemView.getContext());
        if (activityLIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aweme://user/profile/");
            sbLIZ.append(user.getUid());
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activityLIZ, C2188811AlT.LIZIZ(sbLIZ));
            smartRouteBuildRoute.withParam("uid", user.getUid());
            smartRouteBuildRoute.withParam("sec_user_id", user.getSecUid());
            smartRouteBuildRoute.withParam("enter_from", "profile_visitor_list");
            smartRouteBuildRoute.withParam("extra_from_pre_page", "profile_visitor_list");
            C1357130lQ7.LJFF(smartRouteBuildRoute, getCurrentFragment());
            MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
            if (matchedFriendStruct != null && (((mutualStruct = matchedFriendStruct.mMutualStruct) != null && (list = mutualStruct.userList) != null && !list.isEmpty()) || ((str = matchedFriendStruct.recommendReason) != null && str.length() != 0))) {
                smartRouteBuildRoute.withParam("recommend_enter_profile_params", new C1252610ihX("profile_visitor_list", U5().LLJILJILJ, C1264800j1C.LIZJ(), user.getRecType(), C736460Sui.LIZ(user), user.getUid(), null, null, user.getRequestId(), null, user.getFriendTypeStr(), user.getSocialInfo(), null, null, null, null, false, null, null, null, null, false, null, false, null));
            }
            smartRouteBuildRoute.open();
        }
    }

    public final TuxTextView T5() {
        return (TuxTextView) this.LLILZIL.getValue();
    }

    public final ProfileViewerViewModel U5() {
        return (ProfileViewerViewModel) this.LL.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C2211751BhN.LIZ(this.itemView, new C1402390mb7(this, 6));
        AvatarComponentView avatarComponentView = (AvatarComponentView) this.LLJILLL.getValue();
        C1608750rxx config = avatarComponentView.getConfig();
        new AwS600S0100000_21(this, 430).invoke(config.LIZ);
        config.LIZJ(new C737760Swo(new C1606750ruj(EnumC1606080rte.PROFILE_VIEWS, new C1606770rul(null, null, null, null, new AwS565S0100000_21(this, 1679), null, null, null, null, 495), 4)));
        C1386870mC5.LIZ.getClass();
        if (C1386870mC5.LIZ()) {
            EnumC1606090rtf enumC1606090rtf = EnumC1606090rtf.PROFILE_VIEWS;
            C897520ZIw c897520ZIwWQ2 = U5().wQ2();
            C0ZE7 c0ze7 = new C0ZE7(getCurrentLifecycleOwner());
            c0ze7.LIZLLL = "profile_visitor_list";
            c0ze7.LIZIZ(EnumC1910440zoY.PROFILE_VISITOR_LIST);
            c0ze7.LJFF = "profile";
            config.LIZJ(new C1607280rva(new C1607310rvd(enumC1606090rtf, c0ze7, false, false, c897520ZIwWQ2, 110)));
        }
        config.LIZIZ(AFwS259S0000000_21.get$arr$(459));
        avatarComponentView.LJFF(avatarComponentView.getConfig());
        C339190DRl.LIZLLL((View) this.LLJILLL.getValue());
        C339190DRl.LIZIZ(this.itemView.findViewById(R.id.bi2));
        ((AvatarComponentView) this.LLJILLL.getValue()).LIZ(1, new ACListenerS155S0100000_21(this, 282));
        C897520ZIw c897520ZIwWQ22 = U5().wQ2();
        if (c897520ZIwWQ22 != null) {
            c897520ZIwWQ22.LIZIZ(true, new C0NYY() { // from class: X.0mC4
                @Override // X.C0NYY
                public final Object k3(Map<String, C595660NXw> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                    C1386850mC3 item = this.LL.getItem();
                    if (item != null && map.get(item.LL.user.getUid()) != null) {
                        C1386850mC3 item2 = this.LL.getItem();
                        if (item2 != null) {
                            ProfileViewerCell profileViewerCell = this.LL;
                            profileViewerCell.L5(item2);
                            profileViewerCell.N5(item2);
                        }
                        return Unit.LIZ;
                    }
                    return Unit.LIZ;
                }
            });
        }
        if (C1253000iiA.LIZ()) {
            C1076010e6h.LIZJ.LIZIZ().LIZ().observe(this, new AObserverS224S0100000_21(this, 110));
        }
    }

    public final ILightInteractionPlatformService S5() {
        return (ILightInteractionPlatformService) ServiceManager.get().getService(ILightInteractionPlatformService.class);
    }

    public final boolean a6() {
        ProfileViewerInfo profileViewerInfo;
        User user;
        String uid;
        C1386850mC3 item = getItem();
        if (item == null || (profileViewerInfo = item.LL) == null || (user = profileViewerInfo.user) == null || (uid = user.getUid()) == null) {
            return false;
        }
        C01GW c01gw = C0B9D.LIZ;
        return (((Number) c01gw.getValue()).intValue() == 1 || ((Number) c01gw.getValue()).intValue() == 2) && C1336205Ku.LIZ(false).getLightInteractService().LIZIZ(uid);
    }

    public final void c6() {
        ProfileViewerInfo profileViewerInfo;
        User user;
        C1386850mC3 item = getItem();
        if (item == null || (profileViewerInfo = item.LL) == null || (user = profileViewerInfo.user) == null || user.getFollowStatus() != C0SY7.FOLLOW_MUTUAL.getValue()) {
            return;
        }
        ILightInteractionPlatformService iLightInteractionPlatformServiceS5 = S5();
        String uid = user.getUid();
        String strLJJLIIIJJI = S5().LJJLIIIJJI(this.LLJILJILJ);
        if (strLJJLIIIJJI == null) {
            strLJJLIIIJJI = "";
        }
        String str = this.LLJILJILJ;
        String uid2 = user.getUid();
        if (uid2 == null) {
            uid2 = "";
        }
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        if (iLightInteractionPlatformServiceS5.LJJJJLI(uid, strLJJLIIIJJI, str, uid2, curUserId)) {
            return;
        }
        IIMNudgeAndStreakService imNudgeAndStreakService = C1336205Ku.LIZ(false).getImNudgeAndStreakService();
        EnumC896030ZDd enumC896030ZDd = EnumC896030ZDd.PROFILE_VIEW_LIST;
        String uid3 = user.getUid();
        if (uid3 == null) {
            uid3 = "";
        }
        if (imNudgeAndStreakService.LJJIFFI(enumC896030ZDd, uid3, "")) {
            return;
        }
        View view = (View) this.LLIZ.getValue();
        String strLJJLIIIJJI2 = S5().LJJLIIIJJI(this.LLJILJILJ);
        String str2 = strLJJLIIIJJI2 != null ? strLJJLIIIJJI2 : "";
        String str3 = this.LLJILJILJ;
        String uid4 = user.getUid();
        String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
        String strLJII = S5().LJII(str2);
        if (strLJII.length() == 0) {
            strLJII = "nudge";
        }
        InterfaceC892560Yzu interfaceC892560YzuLJJIJIIJIL = S5().LJJIJIIJIL(C0SY5.LIZIZ(view.getContext()));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(uid4);
        sbLIZ.append(currentUserID);
        sbLIZ.append(str3);
        sbLIZ.append(str2);
        interfaceC892560YzuLJJIJIIJIL.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1908380zlE.PROFILE_VISITOR_LIST.getValue(), EnumC1908370zlD.PROFILE_VISITOR_LIST.getValue(), null, null, null, strLJII);
    }

    public final void I5(C1386850mC3 c1386850mC3) {
        RelationButton relationButton = (RelationButton) this.LLIZ.getValue();
        if (relationButton != null) {
            relationButton.setTracker(new AwS422S0200000_21(this, c1386850mC3, 138));
            C1387050mCN c1387050mCN = new C1387050mCN(c1386850mC3.LL.user);
            c1387050mCN.LJ = EnumC1387060mCO.MESSAGE_AFTER_NUDGE;
            c1387050mCN.LJIIJ = C1264800j1C.LIZ(c1386850mC3.LL.user);
            relationButton.LLLLZIL(c1387050mCN.LIZ());
        }
    }

    public final void L5(C1386850mC3 c1386850mC3) {
        C1386870mC5.LIZ.getClass();
        if (C1386870mC5.LIZ() && c1386850mC3.LL.user.getFollowStatus() == C0SY7.FOLLOW_MUTUAL.getValue()) {
            RelationLabelTextView relationLabelTextView = (RelationLabelTextView) this.LLILZLL.getValue();
            if (relationLabelTextView != null) {
                C786410Ut5.v0(relationLabelTextView, 8);
            }
            InterfaceC897380ZIi.LIZIZ.getClass();
            C595660NXw c595660NXwLIZIZ = C897370ZIh.LIZ().LIZIZ(C0O26.LIZJ(AFwS245S0000000_12.get$arr$(261), c1386850mC3.LL.user));
            this.LLJILJIL = C896480ZEw.LIZ(c595660NXwLIZIZ, null, 3);
            this.LLJIJIL = C896480ZEw.LIZJ(c595660NXwLIZIZ);
            if (this.LLJILJIL.LIZIZ != EnumC896490ZEx.NO_STATUS) {
                TextView textView = (TextView) this.LLILZ.getValue();
                if (textView != null) {
                    textView.setText(this.LLJILJIL.LIZ);
                }
                View view = (View) this.LLILZ.getValue();
                if (view != null) {
                    C339190DRl.LIZLLL(view);
                    return;
                }
                return;
            }
        }
        if (C297570BlT.LIZLLL()) {
            P5(c1386850mC3);
        }
    }

    public final void N5(C1386850mC3 c1386850mC3) {
        String strLJJLIIIJJI;
        ILightInteractionPlatformService iLightInteractionPlatformServiceS5 = S5();
        String uid = c1386850mC3.LL.user.getUid();
        String strLJJLIIIJJI2 = S5().LJJLIIIJJI(this.LLJILJILJ);
        if (strLJJLIIIJJI2 == null) {
            strLJJLIIIJJI2 = "";
        }
        String str = this.LLJILJILJ;
        String uid2 = c1386850mC3.LL.user.getUid();
        if (uid2 == null) {
            uid2 = "";
        }
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        if (!iLightInteractionPlatformServiceS5.LJJJJLI(uid, strLJJLIIIJJI2, str, uid2, curUserId)) {
            IIMNudgeAndStreakService imNudgeAndStreakService = C1336205Ku.LIZ(false).getImNudgeAndStreakService();
            EnumC896030ZDd enumC896030ZDd = EnumC896030ZDd.PROFILE_VIEW_LIST;
            String uid3 = c1386850mC3.LL.user.getUid();
            if (uid3 == null) {
                uid3 = "";
            }
            if (!imNudgeAndStreakService.LJJIFFI(enumC896030ZDd, uid3, "")) {
                if (a6()) {
                    RelationButton relationButton = (RelationButton) this.LLIZ.getValue();
                    if (relationButton != null) {
                        relationButton.setTracker(new AwS422S0200000_21(this, c1386850mC3, 138));
                        C1387050mCN c1387050mCN = new C1387050mCN(c1386850mC3.LL.user);
                        c1387050mCN.LJIIJ = C1264800j1C.LIZ(c1386850mC3.LL.user);
                        if (!S5().LJJLIIIJJIZ() || (strLJJLIIIJJI = S5().LJJLIIIJJI(this.LLJILJILJ)) == null) {
                            V5(c1386850mC3, relationButton, c1387050mCN);
                        } else {
                            ILightInteractionPlatformService iLightInteractionPlatformServiceS52 = S5();
                            String uid4 = c1386850mC3.LL.user.getUid();
                            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", EnumC1908380zlE.PROFILE_VISITOR_LIST.getValue()), new Pair("enter_method", EnumC1908370zlD.PROFILE_VISITOR_LIST.getValue()));
                            String str2 = this.LLJILJILJ;
                            User user = c1386850mC3.LL.user;
                            AwS422S0200000_21 awS422S0200000_21 = new AwS422S0200000_21(this, c1386850mC3, 137);
                            String curUserId2 = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
                            if (curUserId2 == null) {
                                curUserId2 = "";
                            }
                            if (!iLightInteractionPlatformServiceS52.LJJIZ(uid4, relationButton, strLJJLIIIJJI, mapLJIIJ, str2, user, curUserId2, false, null, null, null, null, awS422S0200000_21)) {
                                I5(c1386850mC3);
                            }
                        }
                        relationButton.setDataChangeListener(new AwS600S0100000_21(this, 429));
                        return;
                    }
                    return;
                }
                RelationButton relationButton2 = (RelationButton) this.LLIZ.getValue();
                if (relationButton2 != null) {
                    C1387050mCN c1387050mCN2 = new C1387050mCN(c1386850mC3.LL.user);
                    c1387050mCN2.LJIIJ = C1264800j1C.LIZ(c1386850mC3.LL.user);
                    relationButton2.LLLLZIL(c1387050mCN2.LIZ());
                }
                RelationButton relationButton3 = (RelationButton) this.LLIZ.getValue();
                if (relationButton3 == null) {
                    return;
                }
                relationButton3.setTracker(new AwS565S0100000_21(this, 1678));
                return;
            }
        }
        I5(c1386850mC3);
    }

    public final void P5(C1386850mC3 c1386850mC3) {
        List<String> list;
        String strValueOf;
        Context context = this.itemView.getContext();
        if (context != null && (list = c1386850mC3.LLILLJJLI) != null && (!list.isEmpty())) {
            if (list.size() > 10) {
                strValueOf = "10+";
            } else {
                strValueOf = String.valueOf(list.size());
            }
            String quantityString = context.getResources().getQuantityString(2131756054, list.size(), strValueOf);
            TuxTextView tuxTextViewT5 = T5();
            if (tuxTextViewT5 != null) {
                tuxTextViewT5.setText(quantityString);
            }
            TuxTextView tuxTextViewT52 = T5();
            if (tuxTextViewT52 != null) {
                C786410Ut5.LLLLZLL(tuxTextViewT52, 0);
            }
        }
    }

    public final boolean W5(EnumC1260930iux enumC1260930iux) {
        ProfileViewerInfo profileViewerInfo;
        User user;
        int i;
        String str;
        C1386850mC3 item = getItem();
        if (item == null || (profileViewerInfo = item.LL) == null || (user = profileViewerInfo.user) == null) {
            return false;
        }
        String strLJIJJLI = C735370Ssx.LJIJJLI(user);
        C1260910iuv c1260910iuv = new C1260910iuv(0);
        c1260910iuv.LJJLIIIJJI = enumC1260930iux;
        c1260910iuv.LJJLIIIJILLIZJL = C1264800j1C.LIZJ();
        c1260910iuv.LJJJJLL();
        c1260910iuv.LJJIJLIJ("profile_visitor_list");
        if (strLJIJJLI.length() == 0) {
            i = -1;
        } else {
            i = CastIntegerProtector.parseInt(strLJIJJLI);
        }
        c1260910iuv.LJJJLL = i;
        c1260910iuv.LJJJJJ(U5().LLJILJILJ);
        c1260910iuv.LJJJJZI(user);
        MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
        String str2 = null;
        if (matchedFriendStruct != null) {
            str = matchedFriendStruct.relationType;
        } else {
            str = null;
        }
        c1260910iuv.LJJJJL(str);
        MatchedFriendStruct matchedFriendStruct2 = user.getMatchedFriendStruct();
        if (matchedFriendStruct2 != null) {
            str2 = matchedFriendStruct2.recType;
        }
        c1260910iuv.LJJJJJL(str2);
        if (C1264800j1C.LIZ(user)) {
            c1260910iuv.LJIILJJIL();
        }
        return true;
    }

    public final void b6(String str) {
        String uid;
        ProfileViewerInfo profileViewerInfo;
        User user;
        C0ZE7 c0ze7 = new C0ZE7(getCurrentLifecycleOwner());
        c0ze7.LIZLLL = "profile_visitor_list";
        c0ze7.LJII = Boolean.valueOf(this.LLJIJIL);
        c0ze7.LIZIZ(EnumC1910440zoY.PROFILE_VISITOR_LIST);
        c0ze7.LJFF = "story_detail_page";
        C1386850mC3 item = getItem();
        if (item == null || (profileViewerInfo = item.LL) == null || (user = profileViewerInfo.user) == null || (uid = user.getUid()) == null) {
            uid = "";
        }
        c0ze7.LIZJ = uid;
        C897490ZIt.LIZIZ(c0ze7);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String uid;
        C1386850mC3 c1386850mC3 = (C1386850mC3) interfaceC1891350zJl;
        super.onBindItemView(c1386850mC3);
        User user = c1386850mC3.LL.user;
        if (user != null && (uid = user.getUid()) != null) {
            C0S1B.LIZ((AvatarComponentView) this.LLJILLL.getValue(), uid, user, this, false, null, 56);
            C427660Gpo avatar = ((AvatarComponentView) this.LLJILLL.getValue()).getAvatar();
            C427660Gpo.LJIIJJI(avatar, C438710HIf.LIZ(C06KC.LIZIZ.LIZ(avatar.getContext(), avatar, user)), true, null, "ProfileViewerCell", false, true, null, null, false, AFwS258S0000000_20.get$arr$(25), 468);
        }
        C786410Ut5.h9((TuxTextView) this.LLILLL.getValue(), new ACListenerS155S0100000_21(this, 283));
        C03GH.LIZ(this.itemView, C03GJ.CELL);
        C03GH.LIZ((View) this.LLILLJJLI.getValue(), C03GJ.AVATAR);
        C03GH.LIZ((View) this.LLILLL.getValue(), C03GJ.USERNAME);
        C786410Ut5.I7(new ACListenerS124S0200000_21(c1386850mC3, this, 103), this.itemView);
        TextView textView = (TextView) this.LLILLL.getValue();
        C1243240iSQ.LIZ.getClass();
        textView.setText(C1243240iSQ.LIZ(user, true));
        TuxTextView tuxTextView = (TuxTextView) this.LLILZ.getValue();
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
        TuxTextView tuxTextViewT5 = T5();
        if (tuxTextViewT5 != null) {
            C786410Ut5.LLLLZLL(tuxTextViewT5, 8);
        }
        RelationLabelTextView relationLabelTextView = (RelationLabelTextView) this.LLILZLL.getValue();
        if (relationLabelTextView != null) {
            C786410Ut5.v0(relationLabelTextView, 8);
        }
        int followStatus = c1386850mC3.LL.user.getFollowStatus();
        if (followStatus == C0SY7.FOLLOW_MUTUAL.getValue()) {
            L5(c1386850mC3);
        } else if (followStatus == C0SY7.FOLLOWED.getValue()) {
            if (C297570BlT.LIZ() == 1 || C297570BlT.LIZ() == 3) {
                P5(c1386850mC3);
            }
        } else {
            MatchedFriendStruct matchedFriendStruct = c1386850mC3.LL.user.getMatchedFriendStruct();
            if (matchedFriendStruct != null) {
                RelationLabelTextView relationLabelTextView2 = (RelationLabelTextView) this.LLILZLL.getValue();
                if (relationLabelTextView2 != null) {
                    C786410Ut5.v0(relationLabelTextView2, 0);
                }
                RelationLabelTextView relationLabelTextView3 = (RelationLabelTextView) this.LLILZLL.getValue();
                if (relationLabelTextView3 != null) {
                    RelationLabelTextView.LJJJJL(relationLabelTextView3, matchedFriendStruct, C1264070j01.LJI);
                }
            }
        }
        N5(c1386850mC3);
        if (c1386850mC3.LL.isUnRead && !((Set) U5().LLILLL.getValue()).contains(c1386850mC3.LL.user.getUid())) {
            View view = this.itemView;
            view.setBackgroundColor(a.LIZIZ(R.attr.a0c, view.getContext()));
        } else {
            View view2 = this.itemView;
            view2.setBackgroundColor(a.LIZIZ(R.attr.bx, view2.getContext()));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        int i;
        if (((Number) C0B9D.LIZ.getValue()).intValue() == 1) {
            i = R.layout.eey;
        } else {
            i = R.layout.eex;
        }
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), i, viewGroup, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0084 A[PHI: r1
      0x0084: PHI (r1v19 java.lang.String) = (r1v12 java.lang.String), (r1v20 java.lang.String) binds: [B:17:0x0082, B:15:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a A[PHI: r1
      0x009a: PHI (r1v17 java.lang.String) = (r1v14 java.lang.String), (r1v18 java.lang.String) binds: [B:24:0x0098, B:22:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X5(com.ss.android.ugc.aweme.profile.model.User r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ci.viewer.ui.ProfileViewerCell.X5(com.ss.android.ugc.aweme.profile.model.User, java.lang.String):void");
    }

    public static void V5(C1386850mC3 c1386850mC3, RelationButton relationButton, C1387050mCN c1387050mCN) {
        c1387050mCN.LJ = EnumC1387060mCO.MESSAGE_NUDGE;
        C0SY7 c0sy7 = C0SY7.FOLLOW_MUTUAL;
        c1387050mCN.LIZIZ(C2097908Jt.LIZJ(new Pair(c0sy7, C1336205Ku.LIZ(false).getImNudgeAndStreakService().LJIJJ())));
        Map<? extends C0SY7, ? extends Boolean> mapLIZJ = C2097908Jt.LIZJ(new Pair(c0sy7, Boolean.TRUE));
        Map<C0SY7, Boolean> map = c1387050mCN.LJIIIZ;
        if (mapLIZJ != null) {
            map.putAll(mapLIZJ);
        }
        c1387050mCN.LJIILL = new C0ZD9(C0ZDI.SEPARATE_FREQUENCY_CONTROL, EnumC896030ZDd.PROFILE_VIEW_LIST, false, null, null, c1386850mC3.LL.user.getUid(), null, null, 220);
        relationButton.LLLLZIL(c1387050mCN.LIZ());
    }
}
