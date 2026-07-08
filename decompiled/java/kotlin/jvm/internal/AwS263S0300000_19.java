package kotlin.jvm.internal;

import X.AbstractC1223210hw7;
import X.AbstractC848400XPy;
import X.C013C;
import X.C01GW;
import X.C09AY;
import X.C0AYL;
import X.C0C07;
import X.C0CLW;
import X.C0FNT;
import X.C0HTT;
import X.C0TN5;
import X.C0TVK;
import X.C0XQ7;
import X.C1074520e4I;
import X.C1074850e4p;
import X.C1210510hbd;
import X.C1221880hty;
import X.C1229810i6l;
import X.C1234450iEF;
import X.C1234690iEd;
import X.C1235030iFB;
import X.C1235040iFC;
import X.C1235080iFG;
import X.C1238350iKX;
import X.C1242590iRN;
import X.C1243440iSk;
import X.C1245020iVI;
import X.C1245830iWb;
import X.C1245860iWe;
import X.C1246760iY6;
import X.C1247120iYg;
import X.C1248940ibc;
import X.C1249920idC;
import X.C1253010iiB;
import X.C1253930ijf;
import X.C1260960iv0;
import X.C1261270ivV;
import X.C1261650iw7;
import X.C1261760iwI;
import X.C1261860iwS;
import X.C1262090iwp;
import X.C1264320j0Q;
import X.C1375980luW;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1391190mJ3;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C1524805y2;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1900990zZJ;
import X.C19596611lk;
import X.C19719912Dl;
import X.C19741112Lp;
import X.C19EG;
import X.C20684815ws;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2223001BzW;
import X.C2344009Gk;
import X.C259800zU;
import X.C268330AfP;
import X.C298980Bnk;
import X.C316660CbA;
import X.C340190DVh;
import X.C343950De5;
import X.C343970De7;
import X.C437850HEx;
import X.C443090HZb;
import X.C459080HzO;
import X.C737030Svd;
import X.C786410Ut5;
import X.C844470XAv;
import X.C946803n0;
import X.C985403tE;
import X.EnumC1070410dxf;
import X.EnumC1231460i9Q;
import X.EnumC1249890id9;
import X.EnumC1260920iuw;
import X.EnumC1430380nKG;
import X.InterfaceC1215160hj8;
import X.InterfaceC1263010iyJ;
import X.InterfaceC1679450tnz;
import X.InterfaceC1686540tzQ;
import X.InterfaceC2214261BlQ;
import X.InterfaceC494301wD;
import Y.ARunnableS119S0100000_19;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.account.org.permissions.InvitePageViewModel;
import com.ss.android.ugc.aweme.account.security.EmailData;
import com.ss.android.ugc.aweme.account.security.PhoneData;
import com.ss.android.ugc.aweme.account.security.SecurityCheckUpViewModel;
import com.ss.android.ugc.aweme.comment.service.AIPhotoCommentService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.invitation.newdesign.assem.GroupInvitationGroupInfoAssem;
import com.ss.android.ugc.aweme.invitation.newdesign.vm.GroupInvitationVM;
import com.ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.v2.cell.FollowRequestCell;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility;
import com.ss.android.ugc.aweme.publicgroup.data.Placeholder;
import com.ss.android.ugc.aweme.relation.auth.widget.cell.AuthMaFPowerCell;
import com.ss.android.ugc.aweme.relation.usercard.ability.AuthCardCellTrackAbility;
import com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility;
import com.ss.android.ugc.aweme.relation.usercard.ability.RecUserCellTrackAbility;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsAuthCell;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.setting.verification.VerificationResponse;
import com.ss.android.ugc.aweme.share.SystemShareActivity;
import com.ss.android.ugc.aweme.share.api.RemoveTemplateApi;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.ui.CancelUploadOrReeditSheetContentFragment;
import com.ss.android.ugc.profile.business.message.HeaderCTAMessageComponent;
import com.ss.android.ugc.profile.business.profile.BioProfileLinkComponent;
import com.ss.android.ugc.profile.business.profile.biolink.BioStructuralLinkProtocol;
import com.ss.android.ugc.profile.business.profile.popup.MyProfileGuideWidgetV2;
import com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcProgressAssem;
import com.ss.android.ugc.profile.business.ur.platform.HeaderCTAEditProfileComponent;
import com.ss.android.ugc.profile.business.ur.platform.HeaderCTASettingsButtonComponent;
import com.ss.android.ugc.profile.business.ur.platform.HeaderCTAShareProfileComponent;
import com.ss.android.ugc.profile.business.ur.platform.HeaderCTASocialEntranceComponent;
import com.ss.android.ugc.profile.business.ur.platform.addfriends.HeaderCTAAddFriendsComponent;
import com.ss.android.ugc.profile.business.ur.platform.follow.HeaderCTAFollowComponent;
import com.ss.android.ugc.profile.business.ur.platform.recommendbutton.HeaderCTARecommendButtonComponent;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsPageContainerAssem;
import com.ss.android.ugc.profile.business.ur.school.modifyschool.SchoolFlowController;
import com.ss.android.ugc.profile.business.user.creator.product.creatorstudio.HeaderCTACreatorStudioComponent;
import com.ss.android.ugc.profile.platform.base.data.Action;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.business.cta.assemble.ProfileHeaderCTAComponent;
import com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent;
import com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.MyProfileGuideState;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileState;
import com.ss.android.ugc.profile.platform.standard.protocol.component.NavbarPlatformProtocol;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class AwS263S0300000_19 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS263S0300000_19 awS263S0300000_19) {
        ((C1242590iRN) awS263S0300000_19.l0).LJFF((User) awS263S0300000_19.l1);
        ((C1242590iRN) awS263S0300000_19.l0).LIZJ(new C1234450iEF((Aweme) awS263S0300000_19.l2));
        C1234690iEd.LIZIZ.LIZJ().LIZ((User) awS263S0300000_19.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS263S0300000_19 awS263S0300000_19) {
        ((SystemShareActivity) awS263S0300000_19.l0).LLZZ("permission_dialog_pop_up_open_settings");
        C19741112Lp c19741112Lp = C19741112Lp.LIZ;
        SystemShareActivity systemShareActivity = (SystemShareActivity) awS263S0300000_19.l0;
        String str = ((String[]) awS263S0300000_19.l1)[0];
        c19741112Lp.getClass();
        C19741112Lp.LJIIIZ(systemShareActivity, str);
        ((Function0) awS263S0300000_19.l2).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS263S0300000_19 awS263S0300000_19) {
        String str;
        C1524805y2.LIZ(AFwS207S0000000_19.get$arr$(419));
        C1221880hty c1221880hty = C1221880hty.LIZ;
        if (((ProfileAigcProgressAssem) awS263S0300000_19.l0).LLJJIJIL) {
            str = "fast";
        } else {
            str = "slow";
        }
        Long lValueOf = Long.valueOf(SystemClock.elapsedRealtime() - ((ProfileAigcProgressAssem) awS263S0300000_19.l0).LLJJI);
        String enterFrom = ((ProfileAigcProgressAssem) awS263S0300000_19.l0).getEnterFrom();
        String str2 = ((ProfileAigcProgressAssem) awS263S0300000_19.l0).LLJJIJIIJIL;
        c1221880hty.getClass();
        C1221880hty.LIZIZ(lValueOf, str, "discard", enterFrom, str2);
        ProfileAigcProgressAssem profileAigcProgressAssem = (ProfileAigcProgressAssem) awS263S0300000_19.l0;
        profileAigcProgressAssem.Lo(new AwS385S0200000_19((C19EG) awS263S0300000_19.l2, profileAigcProgressAssem, 58));
        ((Function0) awS263S0300000_19.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS263S0300000_19 awS263S0300000_19) {
        String str;
        String str2;
        ((INoticeService) ServiceManager.get().getService(INoticeService.class)).LJJLIIIJ(((User) awS263S0300000_19.l1).getUid(), new WeakHandler((HeaderCTAFollowComponent) awS263S0300000_19.l0));
        ((C437850HEx) awS263S0300000_19.l2).LIZIZ();
        C1253930ijf c1253930ijf = C1253930ijf.LIZ;
        String enterFrom = ((HeaderCTAFollowComponent) awS263S0300000_19.l0).getEnterFrom();
        if (enterFrom == null) {
            enterFrom = "";
        }
        String uid = ((User) awS263S0300000_19.l1).getUid();
        c1253930ijf.getClass();
        C1253930ijf.LJIIL(1, enterFrom, uid);
        String uid2 = ((User) awS263S0300000_19.l1).getUid();
        if (((User) awS263S0300000_19.l1).getFollowStatus() == 1) {
            str = "mutual";
        } else {
            str = "single";
        }
        C01GW c01gw = C1245020iVI.LIZ;
        boolean zLIZJ = C1245020iVI.LIZJ((User) awS263S0300000_19.l1);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("to_user_id", uid2);
        c2344009Gk.LJIIIIZZ("enter_from", "others_homepage");
        c2344009Gk.LJIIIIZZ("follow_type", str);
        if (zLIZJ) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("has_label", str2);
        C20684815ws.LJIILLIIL("follow_approve", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS263S0300000_19 awS263S0300000_19) {
        String str;
        ((INoticeService) ServiceManager.get().getService(INoticeService.class)).LJJJJL(((User) awS263S0300000_19.l1).getUid(), new WeakHandler((HeaderCTAFollowComponent) awS263S0300000_19.l0));
        ((C437850HEx) awS263S0300000_19.l2).LIZIZ();
        C1253930ijf c1253930ijf = C1253930ijf.LIZ;
        String enterFrom = ((HeaderCTAFollowComponent) awS263S0300000_19.l0).getEnterFrom();
        if (enterFrom == null) {
            enterFrom = "";
        }
        String uid = ((User) awS263S0300000_19.l1).getUid();
        c1253930ijf.getClass();
        C1253930ijf.LJIIL(0, enterFrom, uid);
        String uid2 = ((User) awS263S0300000_19.l1).getUid();
        C01GW c01gw = C1245020iVI.LIZ;
        boolean zLIZJ = C1245020iVI.LIZJ((User) awS263S0300000_19.l1);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("to_user_id", uid2);
        if (zLIZJ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("has_label", str);
        c2344009Gk.LJIIIIZZ("enter_from", "others_homepage");
        C20684815ws.LJIILLIIL("follow_refuse", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013f A[LOOP:0: B:45:0x0139->B:47:0x013f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$13(kotlin.jvm.internal.AwS263S0300000_19 r9) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS263S0300000_19.invoke$13(kotlin.jvm.internal.AwS263S0300000_19):java.lang.Object");
    }

    public static final Object invoke$14(AwS263S0300000_19 awS263S0300000_19) {
        SchoolFlowController schoolFlowController = (SchoolFlowController) awS263S0300000_19.l0;
        C19EG c19eg = (C19EG) awS263S0300000_19.l1;
        C1245830iWb c1245830iWb = (C1245830iWb) awS263S0300000_19.l2;
        C1245830iWb c1245830iWb2 = new C1245830iWb(c1245830iWb.LIZ, new C1245860iWe(EnumC1231460i9Q.ADD_SCHOOL_SHEET_POP_UP, null, "popup_first_tap_add_college"), false, c1245830iWb.LIZLLL, c1245830iWb.LJ, c1245830iWb.LJFF, c1245830iWb.LJI);
        schoolFlowController.getClass();
        SchoolFlowController.LIZJ(c19eg, c1245830iWb2);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS263S0300000_19 awS263S0300000_19) {
        ProfileBaseAbility profileBaseAbility = (ProfileBaseAbility) C1558520qew.LIZ(C1558520qew.LJIIL((ProfileHeaderCTAComponent) awS263S0300000_19.l0), ProfileBaseAbility.class, null);
        if (profileBaseAbility != null && profileBaseAbility.q1()) {
            ProfileHeaderCTAComponent profileHeaderCTAComponent = (ProfileHeaderCTAComponent) awS263S0300000_19.l0;
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(HeaderCTAEditProfileComponent.class);
            EnumC1249890id9 enumC1249890id9 = EnumC1249890id9.TEXT;
            profileHeaderCTAComponent.LLJJLIIIJLLLLLLLZ.put("cta_edit_profile", enumC1249890id9);
            profileHeaderCTAComponent.Ho("cta_edit_profile", c19719912DlLIZ, null, 0, false);
            C1249920idC.LIZ((ProfileHeaderCTAComponent) awS263S0300000_19.l0, "cta_creator_studio", C13LE.LIZ(HeaderCTACreatorStudioComponent.class), enumC1249890id9);
        }
        ProfileHeaderCTAComponent profileHeaderCTAComponent2 = (ProfileHeaderCTAComponent) awS263S0300000_19.l0;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(HeaderCTAFollowComponent.class);
        EnumC1249890id9 enumC1249890id92 = EnumC1249890id9.TEXT;
        C1249920idC.LIZ(profileHeaderCTAComponent2, "cta_social_follow", c19719912DlLIZ2, enumC1249890id92);
        C1253010iiB c1253010iiB = C1253010iiB.LIZJ;
        if (c1253010iiB.LJ()) {
            C1249920idC.LIZ((ProfileHeaderCTAComponent) awS263S0300000_19.l0, "cta_social_message", C13LE.LIZ(HeaderCTAMessageComponent.class), enumC1249890id92);
        }
        C1249920idC.LIZ((ProfileHeaderCTAComponent) awS263S0300000_19.l0, "cta_add_friends", C13LE.LIZ(HeaderCTAAddFriendsComponent.class), (EnumC1249890id9) awS263S0300000_19.l1);
        C1249920idC.LIZ((ProfileHeaderCTAComponent) awS263S0300000_19.l0, "cta_share_profile", C13LE.LIZ(HeaderCTAShareProfileComponent.class), (EnumC1249890id9) awS263S0300000_19.l2);
        ProfileHeaderCTAComponent profileHeaderCTAComponent3 = (ProfileHeaderCTAComponent) awS263S0300000_19.l0;
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(HeaderCTASocialEntranceComponent.class);
        EnumC1249890id9 enumC1249890id93 = EnumC1249890id9.ICON;
        C1249920idC.LIZ(profileHeaderCTAComponent3, "cta_social_entrance", c19719912DlLIZ3, enumC1249890id93);
        if (c1253010iiB.LJJI()) {
            C1249920idC.LIZ((ProfileHeaderCTAComponent) awS263S0300000_19.l0, "cta_recommend_button", C13LE.LIZ(HeaderCTARecommendButtonComponent.class), enumC1249890id93);
        }
        C1249920idC.LIZ((ProfileHeaderCTAComponent) awS263S0300000_19.l0, "cta_base_item", C13LE.LIZ(HeaderCTABaseUIComponent.class), enumC1249890id92);
        if (!C268330AfP.LJIIIZ()) {
            enumC1249890id92 = enumC1249890id93;
        }
        C1249920idC.LIZ((ProfileHeaderCTAComponent) awS263S0300000_19.l0, "cta_settings_button", C13LE.LIZ(HeaderCTASettingsButtonComponent.class), enumC1249890id92);
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS263S0300000_19 awS263S0300000_19) {
        if (!((GroupInvitationGroupInfoAssem) awS263S0300000_19.l0).hp().getState().LLIZ) {
            ((GroupInvitationGroupInfoAssem) awS263S0300000_19.l0).hp();
            Context context = ((TuxTextView) awS263S0300000_19.l1).getContext();
            if (context == null) {
                context = C459080HzO.LJ();
            }
            long j = ((C1229810i6l) awS263S0300000_19.l2).LJI;
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://user/profile/");
            smartRouteBuildRoute.withParam("uid", String.valueOf(j));
            smartRouteBuildRoute.withParam("enter_from", "group_join_panel");
            smartRouteBuildRoute.open();
            ((GroupInvitationGroupInfoAssem) awS263S0300000_19.l0).hp().LLILLL = true;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$17(AwS263S0300000_19 awS263S0300000_19) {
        ((BioProfileLinkComponent) awS263S0300000_19.l0).fq((Context) awS263S0300000_19.l1, (String) ((C259800zU) awS263S0300000_19.l2).element);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS263S0300000_19 awS263S0300000_19) {
        String string;
        if (C1210510hbd.LIZLLL((Aweme) awS263S0300000_19.l0)) {
            C1375980luW c1375980luW = (C1375980luW) awS263S0300000_19.l1;
            Context context = (Context) awS263S0300000_19.l2;
            Aweme aweme = (Aweme) awS263S0300000_19.l0;
            c1375980luW.getClass();
            RemoveTemplateApi removeTemplateApi = RemoveTemplateApi.LIZ;
            C844470XAv.LIZ.getClass();
            RemoveTemplateApi.LIZ(removeTemplateApi, context, String.valueOf(C844470XAv.LJIIJ), aweme.getAid(), C1210510hbd.LIZ(aweme), null, new AwS563S0100000_19(aweme, 2911), 48);
        }
        if (((Boolean) C298980Bnk.LIZIZ(Boolean.valueOf(C0C07.LIZ()), Boolean.valueOf(C0AYL.LIZ(Integer.valueOf(EnumC1430380nKG.ANCHOR_PUGC_TEMPLATE.getTYPE()))))).booleanValue() && C1210510hbd.LIZIZ((Aweme) awS263S0300000_19.l0)) {
            C1375980luW c1375980luW2 = (C1375980luW) awS263S0300000_19.l1;
            Context context2 = (Context) awS263S0300000_19.l2;
            Aweme aweme2 = (Aweme) awS263S0300000_19.l0;
            c1375980luW2.getClass();
            RemoveTemplateApi removeTemplateApi2 = RemoveTemplateApi.LIZ;
            C844470XAv.LIZ.getClass();
            String strValueOf = String.valueOf(C844470XAv.LJIIJ);
            String aid = aweme2.getAid();
            for (AnchorCommonStruct anchorCommonStruct : aweme2.getAnchors()) {
                if (anchorCommonStruct.getType() == EnumC1430380nKG.ANCHOR_PUGC_TEMPLATE.getTYPE()) {
                    RemoveTemplateApi.LIZ(removeTemplateApi2, context2, strValueOf, aid, anchorCommonStruct.getId(), null, new AwS563S0100000_19(aweme2, 2909), 48);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        Aweme aweme3 = (Aweme) awS263S0300000_19.l0;
        EnumC1430380nKG enumC1430380nKG = EnumC1430380nKG.ANCHOR_PHOTO_MODE_TEMPLATE;
        if (C1210510hbd.LIZJ(enumC1430380nKG.getTYPE(), aweme3)) {
            C1375980luW c1375980luW3 = (C1375980luW) awS263S0300000_19.l1;
            Context context3 = (Context) awS263S0300000_19.l2;
            Aweme aweme4 = (Aweme) awS263S0300000_19.l0;
            int type = enumC1430380nKG.getTYPE();
            c1375980luW3.getClass();
            if (type == enumC1430380nKG.getTYPE()) {
                string = context3.getString(2131839826);
            } else {
                string = null;
            }
            RemoveTemplateApi removeTemplateApi3 = RemoveTemplateApi.LIZ;
            C844470XAv.LIZ.getClass();
            String strValueOf2 = String.valueOf(C844470XAv.LJIIJ);
            String aid2 = aweme4.getAid();
            for (AnchorCommonStruct anchorCommonStruct2 : aweme4.getAnchors()) {
                if (anchorCommonStruct2.getType() == type) {
                    RemoveTemplateApi.LIZ(removeTemplateApi3, context3, strValueOf2, aid2, anchorCommonStruct2.getId(), string, new AwS159S0101000_19(aweme4, type, 6), 16);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS263S0300000_19 awS263S0300000_19) {
        SmartRouter.buildRoute(((View) awS263S0300000_19.l0).getContext(), ((Placeholder) awS263S0300000_19.l1).schema).open();
        ((GroupInvitationVM) awS263S0300000_19.l2).xQ2(new C343950De5() { // from class: X.0i9G
        });
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$2(AwS263S0300000_19 awS263S0300000_19) {
        int iIntValue;
        Integer numLJIIJJI;
        String str = "notification_page";
        User user = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        Object[] objArr12 = 0;
        Object[] objArr13 = 0;
        Object[] objArr14 = 0;
        Object[] objArr15 = 0;
        Object[] objArr16 = 0;
        Object[] objArr17 = 0;
        Object[] objArr18 = 0;
        Object[] objArr19 = 0;
        Object[] objArr20 = 0;
        Object[] objArr21 = 0;
        Object[] objArr22 = 0;
        Object[] objArr23 = 0;
        Object[] objArr24 = 0;
        Object[] objArr25 = 0;
        Object[] objArr26 = 0;
        Object[] objArr27 = 0;
        Object[] objArr28 = 0;
        Object[] objArr29 = 0;
        Object[] objArr30 = 0;
        Object[] objArr31 = 0;
        Object[] objArr32 = 0;
        Object[] objArr33 = 0;
        Object[] objArr34 = 0;
        Object[] objArr35 = 0;
        Object[] objArr36 = 0;
        Object[] objArr37 = 0;
        Object[] objArr38 = 0;
        Object[] objArr39 = 0;
        Object[] objArr40 = 0;
        Object[] objArr41 = 0;
        Object[] objArr42 = 0;
        Object[] objArr43 = 0;
        Object[] objArr44 = 0;
        Object[] objArr45 = 0;
        Object[] objArr46 = 0;
        Object[] objArr47 = 0;
        Object[] objArr48 = 0;
        Object[] objArr49 = 0;
        Object[] objArr50 = 0;
        Object[] objArr51 = 0;
        Object[] objArr52 = 0;
        Object[] objArr53 = 0;
        Object[] objArr54 = 0;
        Object[] objArr55 = 0;
        Object[] objArr56 = 0;
        Object[] objArr57 = 0;
        Object[] objArr58 = 0;
        Object[] objArr59 = 0;
        Object[] objArr60 = 0;
        Object[] objArr61 = 0;
        Object[] objArr62 = 0;
        String accountType = ((MusNotice) awS263S0300000_19.l0).getAccountType();
        int i = 0;
        Object[] objArr63 = 0;
        Object[] objArr64 = 0;
        Object[] objArr65 = 0;
        Object[] objArr66 = 0;
        Object[] objArr67 = 0;
        Object[] objArr68 = 0;
        Object[] objArr69 = 0;
        String str2 = (String) ((Map) awS263S0300000_19.l1).get("from");
        if (str2 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str2)) != null) {
            iIntValue = numLJIIJJI.intValue();
        } else {
            iIntValue = 0;
        }
        return new C1260960iv0(str, user, (String) (objArr62 == true ? 1 : 0), (String) (objArr61 == true ? 1 : 0), (String) (objArr60 == true ? 1 : 0), (String) (objArr59 == true ? 1 : 0), (Integer) (objArr58 == true ? 1 : 0), (String) (objArr57 == true ? 1 : 0), (String) (objArr56 == true ? 1 : 0), (String) (objArr55 == true ? 1 : 0), (String) (objArr54 == true ? 1 : 0), (String) (objArr53 == true ? 1 : 0), accountType, (String) (objArr52 == true ? 1 : 0), (String) (objArr51 == true ? 1 : 0), (String) (objArr50 == true ? 1 : 0), (String) (objArr49 == true ? 1 : 0), i, (int) (objArr69 == true ? 1 : 0), (Boolean) (objArr48 == true ? 1 : 0), iIntValue, (String) (objArr47 == true ? 1 : 0), (boolean) (objArr68 == true ? 1 : 0), (Boolean) (objArr46 == true ? 1 : 0), (Boolean) (objArr45 == true ? 1 : 0), (String) (objArr44 == true ? 1 : 0), (String) (objArr43 == true ? 1 : 0), (String) (objArr42 == true ? 1 : 0), (String) (objArr41 == true ? 1 : 0), (String) (objArr40 == true ? 1 : 0), (String) (objArr39 == true ? 1 : 0), (String) (objArr38 == true ? 1 : 0), (String) (objArr37 == true ? 1 : 0), (String) (objArr36 == true ? 1 : 0), (Integer) (objArr35 == true ? 1 : 0), (String) (objArr34 == true ? 1 : 0), (Integer) (objArr33 == true ? 1 : 0), (String) (objArr32 == true ? 1 : 0), (int) (objArr67 == true ? 1 : 0), (String) (objArr31 == true ? 1 : 0), (Boolean) (objArr30 == true ? 1 : 0), (Map) awS263S0300000_19.l2, (String) (objArr29 == true ? 1 : 0), (Integer) (objArr28 == true ? 1 : 0), (Integer) (objArr27 == true ? 1 : 0), (String) (objArr26 == true ? 1 : 0), (String) (objArr25 == true ? 1 : 0), (int) (objArr66 == true ? 1 : 0), (String) (objArr24 == true ? 1 : 0), (Long) (objArr23 == true ? 1 : 0), (int) (objArr65 == true ? 1 : 0), (Integer) (objArr22 == true ? 1 : 0), (String) (objArr21 == true ? 1 : 0), (String) (objArr20 == true ? 1 : 0), (int) (objArr64 == true ? 1 : 0), (int) (objArr63 == true ? 1 : 0), (Integer) (objArr19 == true ? 1 : 0), (Map) (objArr18 == true ? 1 : 0), (String) (objArr17 == true ? 1 : 0), (Boolean) (objArr16 == true ? 1 : 0), (Integer) (objArr15 == true ? 1 : 0), (Integer) (objArr14 == true ? 1 : 0), (String) (objArr13 == true ? 1 : 0), (String) (objArr12 == true ? 1 : 0), (Integer) (objArr11 == true ? 1 : 0), (Integer) (objArr10 == true ? 1 : 0), (Integer) (objArr9 == true ? 1 : 0), (String) (objArr8 == true ? 1 : 0), (String) (objArr7 == true ? 1 : 0), (String) (objArr6 == true ? 1 : 0), (Integer) (objArr5 == true ? 1 : 0), (Integer) (objArr4 == true ? 1 : 0), (String) (objArr3 == true ? 1 : 0), (C1247120iYg) (objArr2 == true ? 1 : 0), (Map) (objArr == true ? 1 : 0), -2101250, -2049, 16383);
    }

    public static final Object invoke$20(AwS263S0300000_19 awS263S0300000_19) {
        SecurityCheckUpViewModel securityCheckUpViewModel = (SecurityCheckUpViewModel) awS263S0300000_19.l0;
        C0TVK c0tvk = C0TVK.PHONE;
        securityCheckUpViewModel.LLILZIL = c0tvk;
        C0TN5 c0tn5 = C0TN5.LIZ;
        String str = securityCheckUpViewModel.vQ2().LLILLJJLI;
        boolean z = !((C013C) awS263S0300000_19.l1).element;
        c0tn5.getClass();
        C0TN5.LIZ(c0tvk, str, z);
        Activity activity = ((SecurityCheckUpViewModel) awS263S0300000_19.l0).vQ2().LL.get();
        if (activity != null) {
            ((SecurityCheckUpViewModel) awS263S0300000_19.l0).LLILLL.bindMobile(activity, "security_checkup_page", (Bundle) awS263S0300000_19.l2, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS263S0300000_19 awS263S0300000_19) {
        boolean zBooleanValue;
        SecurityCheckUpViewModel securityCheckUpViewModel = (SecurityCheckUpViewModel) awS263S0300000_19.l0;
        C0TVK c0tvk = C0TVK.PHONE;
        securityCheckUpViewModel.LLILZIL = c0tvk;
        C0TN5 c0tn5 = C0TN5.LIZ;
        String str = securityCheckUpViewModel.vQ2().LLILLJJLI;
        boolean z = !((C013C) awS263S0300000_19.l1).element;
        c0tn5.getClass();
        C0TN5.LIZ(c0tvk, str, z);
        Activity activity = ((SecurityCheckUpViewModel) awS263S0300000_19.l0).vQ2().LL.get();
        if (activity != null) {
            PhoneData phoneData = (PhoneData) awS263S0300000_19.l2;
            final C1235080iFG c1235080iFG = new C1235080iFG(activity);
            final String str2 = phoneData.number;
            C786410Ut5.J4(c1235080iFG.LJ());
            C1235040iFC c1235040iFC = (C1235040iFC) c1235080iFG.LIZJ.getValue();
            User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
            C1235030iFB c1235030iFB = new C1235030iFB() { // from class: X.0iF9
                @Override // X.C1235030iFB
                public final void LIZ() {
                    c1235080iFG.LJ().hide();
                }

                @Override // X.C1235030iFB
                public final void LIZIZ() {
                    c1235080iFG.LJ().hide();
                }

                @Override // X.C1235030iFB
                public final void LIZJ(VerificationResponse verificationResponse) {
                    c1235080iFG.LJ().hide();
                    Activity activity2 = c1235080iFG.LIZ;
                    C1397580mTM c1397580mTM = new C1397580mTM(activity2);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('\n');
                    sbLIZ.append(str2);
                    c1397580mTM.LJI(activity2.getString(2131857882, C2188811AlT.LIZIZ(sbLIZ)));
                    c1397580mTM.LIZIZ(c1235080iFG.LIZ.getString(2131857880));
                    C985403tE.LIZ(c1397580mTM, new AwS598S0100000_19(c1235080iFG, 638));
                    c1397580mTM.LJIIIZ = new C340190DVh(R.raw.icon_phone, 0, c1235080iFG.LIZ, Integer.valueOf(R.attr.a1h));
                    c1397580mTM.LJIIIIZZ = false;
                    c1397580mTM.LJII = true;
                    c1397580mTM.LIZLLL(new AwS598S0100000_19(c1235080iFG, 639));
                    new C1397510mTF(c1397580mTM).LIZLLL();
                    c1235080iFG.LJIIIIZZ(true);
                }
            };
            c1235040iFC.getClass();
            try {
                zBooleanValue = C0CLW.LIZIZ.LIZ.getMtcertSettings().getEnableChangeMobileNotice().booleanValue();
            } catch (C316660CbA e) {
                TryCatchGuardChecker.doCheck(e);
                zBooleanValue = false;
            }
            c1235040iFC.LIZ(zBooleanValue, curUser, c1235030iFB);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS263S0300000_19 awS263S0300000_19) {
        SecurityCheckUpViewModel securityCheckUpViewModel = (SecurityCheckUpViewModel) awS263S0300000_19.l0;
        C0TVK c0tvk = C0TVK.EMAIL;
        securityCheckUpViewModel.LLILZIL = c0tvk;
        C0TN5 c0tn5 = C0TN5.LIZ;
        String str = securityCheckUpViewModel.vQ2().LLILLJJLI;
        boolean z = !((C013C) awS263S0300000_19.l1).element;
        c0tn5.getClass();
        C0TN5.LIZ(c0tvk, str, z);
        Activity activity = ((SecurityCheckUpViewModel) awS263S0300000_19.l0).vQ2().LL.get();
        if (activity != null) {
            ((SecurityCheckUpViewModel) awS263S0300000_19.l0).LLILLL.bindEmail(activity, "security_checkup_page", "click", (Bundle) awS263S0300000_19.l2, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS263S0300000_19 awS263S0300000_19) {
        int i;
        int i2;
        SecurityCheckUpViewModel securityCheckUpViewModel = (SecurityCheckUpViewModel) awS263S0300000_19.l0;
        C0TVK c0tvk = C0TVK.EMAIL;
        securityCheckUpViewModel.LLILZIL = c0tvk;
        C0TN5 c0tn5 = C0TN5.LIZ;
        String str = securityCheckUpViewModel.vQ2().LLILLJJLI;
        boolean z = !((C013C) awS263S0300000_19.l1).element;
        c0tn5.getClass();
        C0TN5.LIZ(c0tvk, str, z);
        Activity activity = ((SecurityCheckUpViewModel) awS263S0300000_19.l0).vQ2().LL.get();
        if (activity != null) {
            EmailData emailData = (EmailData) awS263S0300000_19.l2;
            C1235080iFG c1235080iFG = new C1235080iFG(activity);
            String str2 = emailData.email;
            c1235080iFG.LIZLLL = emailData.isVerified();
            c1235080iFG.LJIIIIZZ(false);
            if (c1235080iFG.LIZLLL) {
                i = 2131857871;
            } else {
                i = 2131857866;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('\n');
            sbLIZ.append(str2);
            String string = activity.getString(i, C2188811AlT.LIZIZ(sbLIZ));
            if (c1235080iFG.LIZLLL) {
                i2 = 2131857870;
            } else {
                i2 = 2131857865;
            }
            String string2 = activity.getString(i2);
            C1397580mTM c1397580mTM = new C1397580mTM(activity);
            c1397580mTM.LJI(string);
            c1397580mTM.LIZIZ(string2);
            C985403tE.LIZ(c1397580mTM, new AwS598S0100000_19(c1235080iFG, 634));
            c1397580mTM.LJIIIZ = new C340190DVh(R.raw.icon_envelope, 0, activity, Integer.valueOf(R.attr.a1h));
            c1397580mTM.LJIIIIZZ = false;
            c1397580mTM.LJII = true;
            c1397580mTM.LIZLLL(new AwS598S0100000_19(c1235080iFG, 635));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$24(AwS263S0300000_19 awS263S0300000_19) {
        ((BioStructuralLinkProtocol) awS263S0300000_19.l0).LJLILLLLZI((Context) awS263S0300000_19.l1, (String) ((C259800zU) awS263S0300000_19.l2).element);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$25(kotlin.jvm.internal.AwS263S0300000_19 r7) {
        /*
            java.lang.Object r6 = r7.l0
            com.ss.android.ugc.profile.business.profile.popup.MyProfileGuideWidgetV2 r6 = (com.ss.android.ugc.profile.business.profile.popup.MyProfileGuideWidgetV2) r6
            java.lang.Object r2 = r7.l1
            com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.MyProfileGuideState r2 = (com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.MyProfileGuideState) r2
            java.lang.Object r5 = r7.l2
            com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileState r5 = (com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileState) r5
            r6.getClass()
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.music.service.IProfileMusicTabService> r0 = com.ss.android.ugc.aweme.music.service.IProfileMusicTabService.class
            java.lang.Object r4 = r1.getService(r0)
            com.ss.android.ugc.aweme.music.service.IProfileMusicTabService r4 = (com.ss.android.ugc.aweme.music.service.IProfileMusicTabService) r4
            boolean r3 = r2.getNeedShowMusicOfflineNotice()
            boolean r2 = r6.LJIILL()
            com.ss.android.ugc.aweme.profile.model.User r0 = r5.getUser()
            if (r0 == 0) goto L39
            int r1 = r0.getShowArtistPlaylist()
            r0 = 1
            if (r1 != r0) goto L39
        L30:
            boolean r0 = r4.LJIIZILJ(r3, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L39:
            r0 = 0
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS263S0300000_19.invoke$25(kotlin.jvm.internal.AwS263S0300000_19):java.lang.Object");
    }

    public static final Object invoke$26(AwS263S0300000_19 awS263S0300000_19) {
        ((C013C) awS263S0300000_19.l0).element = true;
        ((C1246760iY6) awS263S0300000_19.l1).LLILZIL.invoke();
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJ((View) awS263S0300000_19.l2, C343970De7.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$27(AwS263S0300000_19 awS263S0300000_19) {
        List<Action> list;
        Boolean boolValueOf;
        String url;
        NavbarBaseUIComponent navbarBaseUIComponent = (NavbarBaseUIComponent) awS263S0300000_19.l0;
        ProfileComponents profileComponents = navbarBaseUIComponent.LLJJJ;
        ProfileComponents profileComponents2 = null;
        if (profileComponents != null) {
            list = profileComponents.actions;
        } else {
            list = null;
        }
        NavbarPlatformProtocol navbarPlatformProtocolAp = navbarBaseUIComponent.Ap();
        if (navbarPlatformProtocolAp != null) {
            boolValueOf = Boolean.valueOf(navbarPlatformProtocolAp.LJII((TuxIconView) awS263S0300000_19.l1));
        } else {
            boolValueOf = null;
        }
        if (!Intrinsics.LJFF(boolValueOf, Boolean.TRUE) && list != null) {
            Context context = (Context) awS263S0300000_19.l2;
            for (Action action : list) {
                if (Intrinsics.LJFF(action.getType(), "router")) {
                    Action.RouterInfo router = action.getRouter();
                    if (router != null) {
                        url = router.getUrl();
                    } else {
                        url = null;
                    }
                    SmartRouter.buildRoute(context, url).open();
                }
            }
        }
        NavbarBaseUIComponent navbarBaseUIComponent2 = (NavbarBaseUIComponent) awS263S0300000_19.l0;
        C1248940ibc c1248940ibcZp = navbarBaseUIComponent2.zp();
        if (c1248940ibcZp != null) {
            profileComponents2 = c1248940ibcZp.LLILLL;
        }
        navbarBaseUIComponent2.mp(profileComponents2);
        ((NavbarBaseUIComponent) awS263S0300000_19.l0).Fp();
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS263S0300000_19 awS263S0300000_19) {
        Activity activityLIZ;
        Context context = ((CancelUploadOrReeditSheetContentFragment) awS263S0300000_19.l0).getContext();
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            final C0HTT c0htt = (C0HTT) awS263S0300000_19.l1;
            final Aweme aweme = (Aweme) awS263S0300000_19.l2;
            SAFExtensionKt.LJIJI(new InterfaceC2214261BlQ() { // from class: X.0ipC
                @Override // X.InterfaceC2214261BlQ
                public final void LIZIZ(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LIZJ(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJ(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJFF(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJI(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJII(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIIIIZZ(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIIIZ(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIIJ(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIIJJI(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIIL(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIILIIL(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIILJJIL(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIILL(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIILLIIL(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIIZILJ(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIJ(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIJI(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIJJ(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIJJLI(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIL(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJJ(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LIZLLL(AbstractC1387200mCc abstractC1387200mCc) {
                    c0htt.LLIIL(new C737030Svd(2, aweme));
                    SAFExtensionKt.LJJIIJ(this);
                }
            });
            return activityLIZ;
        }
        ((C0HTT) awS263S0300000_19.l1).LLIIL(new C737030Svd(2, (Aweme) awS263S0300000_19.l2));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS263S0300000_19 awS263S0300000_19) {
        ((InterfaceC1686540tzQ) awS263S0300000_19.l0).LJIJJ(false);
        InterfaceC1679450tnz interfaceC1679450tnz = (InterfaceC1679450tnz) awS263S0300000_19.l1;
        if (interfaceC1679450tnz != null) {
            interfaceC1679450tnz.hide();
        }
        InvitePageViewModel invitePageViewModel = (InvitePageViewModel) awS263S0300000_19.l2;
        invitePageViewModel.getClass();
        C1243440iSk c1243440iSk = C1243440iSk.LIZ;
        String strWQ2 = invitePageViewModel.wQ2();
        c1243440iSk.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("invite_type", strWQ2);
        c2344009Gk.LJIIIIZZ("btn_click", "continue");
        C20684815ws.LJIILLIIL("org_permission_invite_click", c2344009Gk.LIZ);
        invitePageViewModel.LL.setValue(new C1238350iKX(null));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS263S0300000_19 awS263S0300000_19) {
        ((InterfaceC1215160hj8) awS263S0300000_19.l0).LIZ(false);
        AIPhotoCommentService aIPhotoCommentService = (AIPhotoCommentService) awS263S0300000_19.l1;
        Context context = (Context) awS263S0300000_19.l2;
        aIPhotoCommentService.getClass();
        Activity activityLIZ = C0FNT.LIZ(context);
        if (activityLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIIZ(2131837144);
            c1389890mGx.LJIIJJI();
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$5(AwS263S0300000_19 awS263S0300000_19) {
        Bundle arguments;
        String str = ((C1900990zZJ) awS263S0300000_19.l0).LLILZ;
        Fragment fragmentLIZ = C946803n0.LIZ(((FollowRequestCell) awS263S0300000_19.l1).itemView);
        LinkedHashMap linkedHashMap = null;
        if (fragmentLIZ != null && (arguments = fragmentLIZ.getArguments()) != null && arguments.getInt("is_from_push", 0) == 1) {
            linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("is_from_push", "1");
            String string = arguments.getString("push_type");
            String str2 = "";
            if (string == null) {
                string = "";
            }
            linkedHashMap.put("push_type", string);
            String string2 = arguments.getString("push_id");
            if (string2 != null) {
                str2 = string2;
            }
            linkedHashMap.put("push_id", str2);
        }
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        return new C1260960iv0(str, (User) awS263S0300000_19.l2, (String) null, (String) (0 == true ? 1 : 0), "notification_page", (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), 0, (int) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (boolean) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), (Map) linkedHashMap2, (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Long) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (Map) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (C1247120iYg) (0 == true ? 1 : 0), (Map) (0 == true ? 1 : 0), -20, -2049, 16383);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$6(AwS263S0300000_19 awS263S0300000_19) {
        Integer numValueOf;
        C1074520e4I c1074520e4I = (C1074520e4I) awS263S0300000_19.l0;
        String str = c1074520e4I.LIZ;
        User user = (User) awS263S0300000_19.l1;
        String str2 = c1074520e4I.LIZJ;
        String str3 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        Object[] objArr12 = 0;
        Object[] objArr13 = 0;
        Object[] objArr14 = 0;
        Object[] objArr15 = 0;
        Object[] objArr16 = 0;
        Object[] objArr17 = 0;
        Object[] objArr18 = 0;
        Object[] objArr19 = 0;
        Object[] objArr20 = 0;
        Object[] objArr21 = 0;
        Object[] objArr22 = 0;
        Object[] objArr23 = 0;
        Object[] objArr24 = 0;
        Object[] objArr25 = 0;
        Object[] objArr26 = 0;
        Object[] objArr27 = 0;
        Object[] objArr28 = 0;
        Object[] objArr29 = 0;
        Object[] objArr30 = 0;
        Object[] objArr31 = 0;
        Object[] objArr32 = 0;
        Object[] objArr33 = 0;
        Object[] objArr34 = 0;
        Object[] objArr35 = 0;
        Object[] objArr36 = 0;
        Object[] objArr37 = 0;
        Object[] objArr38 = 0;
        Object[] objArr39 = 0;
        Object[] objArr40 = 0;
        Object[] objArr41 = 0;
        Object[] objArr42 = 0;
        Object[] objArr43 = 0;
        Object[] objArr44 = 0;
        Object[] objArr45 = 0;
        Object[] objArr46 = 0;
        Object[] objArr47 = 0;
        Object[] objArr48 = 0;
        Object[] objArr49 = 0;
        Object[] objArr50 = 0;
        Object[] objArr51 = 0;
        Object[] objArr52 = 0;
        Object[] objArr53 = 0;
        Object[] objArr54 = 0;
        Object[] objArr55 = 0;
        Object[] objArr56 = 0;
        Object[] objArr57 = 0;
        Object[] objArr58 = 0;
        String str4 = c1074520e4I.LIZIZ;
        String str5 = c1074520e4I.LIZLLL;
        C1074850e4p c1074850e4p = (C1074850e4p) ((AuthMaFPowerCell) awS263S0300000_19.l2).getItem();
        if (c1074850e4p != null) {
            numValueOf = Integer.valueOf(c1074850e4p.LIZ());
        } else {
            numValueOf = null;
        }
        AuthMaFPowerCell authMaFPowerCell = (AuthMaFPowerCell) awS263S0300000_19.l2;
        String str6 = ((C1074520e4I) awS263S0300000_19.l0).LJ;
        authMaFPowerCell.getClass();
        Object[] objArr59 = objArr58 == true ? 1 : 0;
        Object[] objArr60 = objArr57 == true ? 1 : 0;
        Object[] objArr61 = objArr56 == true ? 1 : 0;
        Object[] objArr62 = objArr55 == true ? 1 : 0;
        Object[] objArr63 = objArr54 == true ? 1 : 0;
        Object[] objArr64 = objArr53 == true ? 1 : 0;
        Object[] objArr65 = objArr52 == true ? 1 : 0;
        Object[] objArr66 = objArr51 == true ? 1 : 0;
        Object[] objArr67 = objArr50 == true ? 1 : 0;
        Object[] objArr68 = objArr49 == true ? 1 : 0;
        Object[] objArr69 = objArr48 == true ? 1 : 0;
        Object[] objArr70 = objArr47 == true ? 1 : 0;
        Object[] objArr71 = objArr46 == true ? 1 : 0;
        Object[] objArr72 = objArr45 == true ? 1 : 0;
        Object[] objArr73 = objArr44 == true ? 1 : 0;
        Object[] objArr74 = objArr43 == true ? 1 : 0;
        Object[] objArr75 = objArr42 == true ? 1 : 0;
        Object[] objArr76 = objArr41 == true ? 1 : 0;
        Object[] objArr77 = objArr40 == true ? 1 : 0;
        Object[] objArr78 = objArr39 == true ? 1 : 0;
        Object[] objArr79 = objArr38 == true ? 1 : 0;
        Object[] objArr80 = objArr37 == true ? 1 : 0;
        Object[] objArr81 = objArr36 == true ? 1 : 0;
        Object[] objArr82 = objArr35 == true ? 1 : 0;
        Object[] objArr83 = objArr34 == true ? 1 : 0;
        Object[] objArr84 = objArr33 == true ? 1 : 0;
        Object[] objArr85 = objArr32 == true ? 1 : 0;
        Object[] objArr86 = objArr31 == true ? 1 : 0;
        Object[] objArr87 = objArr30 == true ? 1 : 0;
        Object[] objArr88 = objArr29 == true ? 1 : 0;
        Object[] objArr89 = objArr28 == true ? 1 : 0;
        Object[] objArr90 = objArr27 == true ? 1 : 0;
        Object[] objArr91 = objArr26 == true ? 1 : 0;
        Object[] objArr92 = objArr25 == true ? 1 : 0;
        Object[] objArr93 = objArr24 == true ? 1 : 0;
        Object[] objArr94 = objArr23 == true ? 1 : 0;
        Object[] objArr95 = objArr22 == true ? 1 : 0;
        Object[] objArr96 = objArr21 == true ? 1 : 0;
        Object[] objArr97 = objArr20 == true ? 1 : 0;
        Object[] objArr98 = objArr19 == true ? 1 : 0;
        Object[] objArr99 = objArr18 == true ? 1 : 0;
        Object[] objArr100 = objArr17 == true ? 1 : 0;
        Object[] objArr101 = objArr16 == true ? 1 : 0;
        Object[] objArr102 = objArr15 == true ? 1 : 0;
        Object[] objArr103 = objArr14 == true ? 1 : 0;
        Object[] objArr104 = objArr13 == true ? 1 : 0;
        Object[] objArr105 = objArr12 == true ? 1 : 0;
        Object[] objArr106 = objArr11 == true ? 1 : 0;
        Object[] objArr107 = objArr10 == true ? 1 : 0;
        Object[] objArr108 = objArr9 == true ? 1 : 0;
        Object[] objArr109 = objArr8 == true ? 1 : 0;
        Object[] objArr110 = objArr7 == true ? 1 : 0;
        Object[] objArr111 = objArr6 == true ? 1 : 0;
        Object[] objArr112 = objArr5 == true ? 1 : 0;
        Object[] objArr113 = objArr4 == true ? 1 : 0;
        Object[] objArr114 = objArr3 == true ? 1 : 0;
        Object[] objArr115 = objArr2 == true ? 1 : 0;
        Object[] objArr116 = objArr == true ? 1 : 0;
        return new C1260960iv0(str, user, str2, str3, str4, str5, numValueOf, (String) objArr59, (String) objArr60, (String) objArr61, AuthMaFPowerCell.N5(str6).name(), (String) objArr62, (String) objArr63, (String) objArr64, (String) objArr65, (String) objArr66, (String) objArr67, 0, (int) (0 == true ? 1 : 0), (Boolean) objArr68, (int) (0 == true ? 1 : 0), (String) objArr69, (boolean) (0 == true ? 1 : 0), (Boolean) objArr70, (Boolean) objArr71, (String) objArr72, (String) objArr73, (String) objArr74, (String) objArr75, (String) objArr76, (String) objArr77, (String) objArr78, (String) objArr79, (String) objArr80, (Integer) objArr81, (String) objArr82, (Integer) objArr83, (String) objArr84, (int) (0 == true ? 1 : 0), (String) objArr85, (Boolean) objArr86, (Map) objArr87, (String) objArr88, (Integer) objArr89, (Integer) objArr90, (String) objArr91, (String) objArr92, (int) (0 == true ? 1 : 0), (String) objArr93, (Long) objArr94, (int) (0 == true ? 1 : 0), (Integer) objArr95, (String) objArr96, (String) objArr97, (int) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), (Integer) objArr98, (Map) objArr99, (String) objArr100, (Boolean) objArr101, (Integer) objArr102, (Integer) objArr103, (String) objArr104, (String) objArr105, (Integer) objArr106, (Integer) objArr107, (Integer) objArr108, (String) objArr109, (String) objArr110, (String) objArr111, (Integer) objArr112, (Integer) objArr113, (String) objArr114, (C1247120iYg) objArr115, (Map) objArr116, -1144, -1, 16383);
    }

    public static final Object invoke$7(AwS263S0300000_19 awS263S0300000_19) {
        InterfaceC494301wD interfaceC494301wDLIZ;
        InterfaceC494301wD interfaceC494301wDLIZ2;
        Fragment fragmentLIZ;
        Lifecycle lifecycle;
        String strLJJJLIIL;
        Fragment fragmentLIZ2;
        Lifecycle lifecycle2;
        String strLJJJLIIL2;
        Function0<Unit> function0 = ((C1262090iwp) awS263S0300000_19.l0).LJJII;
        if (function0 != null) {
            function0.invoke();
        }
        AbsAuthCell absAuthCell = (AbsAuthCell) awS263S0300000_19.l1;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1264320j0Q.LIZ.getClass();
            C1264320j0Q.LIZIZ("Ability", "get ability error!", th);
        }
        if (!Intrinsics.LJFF(absAuthCell.itemView.getTag(R.id.usercard_unbind_tag), Boolean.TRUE)) {
            LifecycleOwner lifecycleOwner = absAuthCell.getLifecycleOwner();
            if ((((lifecycleOwner instanceof Fragment) && (fragmentLIZ2 = (Fragment) lifecycleOwner) != null) || (fragmentLIZ2 = C946803n0.LIZ(absAuthCell.itemView)) != null) && (fragmentLIZ2.isDetached() || !fragmentLIZ2.isAdded())) {
                C1264320j0Q.LIZ.getClass();
                C1264320j0Q.LIZIZ("Ability", "attach fragment illegal!", null);
            } else {
                LifecycleOwner lifecycleOwner2 = absAuthCell.getLifecycleOwner();
                if (lifecycleOwner2 != null && (lifecycle2 = lifecycleOwner2.getLifecycle()) != null) {
                    if (lifecycle2.getCurrentState() == Lifecycle.State.DESTROYED) {
                        C1264320j0Q.LIZ.getClass();
                        C1264320j0Q.LIZIZ("Ability", "get ability illegal!", null);
                    } else {
                        InterfaceC1263010iyJ interfaceC1263010iyJI5 = absAuthCell.I5();
                        if (interfaceC1263010iyJI5 != null) {
                            strLJJJLIIL2 = interfaceC1263010iyJI5.LJJJLIIL();
                        } else {
                            strLJJJLIIL2 = null;
                        }
                        interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJ(absAuthCell.itemView, null), IUserCardListAbility.class, strLJJJLIIL2);
                        if (interfaceC494301wDLIZ == null) {
                            C1264320j0Q c1264320j0Q = C1264320j0Q.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(strLJJJLIIL2);
                            sbLIZ.append("'s ");
                            sbLIZ.append(C13LE.LIZ(IUserCardListAbility.class).LJI());
                            sbLIZ.append(" not found, parent: ");
                            sbLIZ.append(absAuthCell.itemView.getParent());
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            c1264320j0Q.getClass();
                            C1264320j0Q.LIZIZ("Ability", strLIZIZ, null);
                        }
                    }
                }
            }
            interfaceC494301wDLIZ = null;
        } else {
            interfaceC494301wDLIZ = null;
        }
        IUserCardListAbility iUserCardListAbility = (IUserCardListAbility) interfaceC494301wDLIZ;
        if (iUserCardListAbility != null) {
            iUserCardListAbility.cN1(((C1261760iwI) awS263S0300000_19.l2).LLILZ);
        }
        AbsAuthCell absAuthCell2 = (AbsAuthCell) awS263S0300000_19.l1;
        try {
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C1264320j0Q.LIZ.getClass();
            C1264320j0Q.LIZIZ("Ability", "get ability error!", th2);
        }
        if (!Intrinsics.LJFF(absAuthCell2.itemView.getTag(R.id.usercard_unbind_tag), Boolean.TRUE)) {
            LifecycleOwner lifecycleOwner3 = absAuthCell2.getLifecycleOwner();
            if ((((lifecycleOwner3 instanceof Fragment) && (fragmentLIZ = (Fragment) lifecycleOwner3) != null) || (fragmentLIZ = C946803n0.LIZ(absAuthCell2.itemView)) != null) && (fragmentLIZ.isDetached() || !fragmentLIZ.isAdded())) {
                C1264320j0Q.LIZ.getClass();
                C1264320j0Q.LIZIZ("Ability", "attach fragment illegal!", null);
            } else {
                LifecycleOwner lifecycleOwner4 = absAuthCell2.getLifecycleOwner();
                if (lifecycleOwner4 != null && (lifecycle = lifecycleOwner4.getLifecycle()) != null) {
                    if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                        C1264320j0Q.LIZ.getClass();
                        C1264320j0Q.LIZIZ("Ability", "get ability illegal!", null);
                    } else {
                        InterfaceC1263010iyJ interfaceC1263010iyJI52 = absAuthCell2.I5();
                        if (interfaceC1263010iyJI52 != null) {
                            strLJJJLIIL = interfaceC1263010iyJI52.LJJJLIIL();
                        } else {
                            strLJJJLIIL = null;
                        }
                        interfaceC494301wDLIZ2 = C1558520qew.LIZ(C1558360qeg.LJ(absAuthCell2.itemView, null), AuthCardCellTrackAbility.class, strLJJJLIIL);
                        if (interfaceC494301wDLIZ2 == null) {
                            C1264320j0Q c1264320j0Q2 = C1264320j0Q.LIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(strLJJJLIIL);
                            sbLIZ2.append("'s ");
                            sbLIZ2.append(C13LE.LIZ(AuthCardCellTrackAbility.class).LJI());
                            sbLIZ2.append(" not found, parent: ");
                            sbLIZ2.append(absAuthCell2.itemView.getParent());
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                            c1264320j0Q2.getClass();
                            C1264320j0Q.LIZIZ("Ability", strLIZIZ2, null);
                        }
                    }
                }
            }
            interfaceC494301wDLIZ2 = null;
        } else {
            interfaceC494301wDLIZ2 = null;
        }
        AuthCardCellTrackAbility authCardCellTrackAbility = (AuthCardCellTrackAbility) interfaceC494301wDLIZ2;
        if (authCardCellTrackAbility == null) {
            return null;
        }
        ((AbsAuthCell) awS263S0300000_19.l1).N5();
        final EnumC1070410dxf enumC1070410dxf = ((C1261760iwI) awS263S0300000_19.l2).LLILZ.LL;
        C1264320j0Q c1264320j0Q3 = C1264320j0Q.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("remove ");
        sbLIZ3.append(enumC1070410dxf);
        sbLIZ3.append('!');
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        c1264320j0Q3.getClass();
        C1264320j0Q.LIZLLL("CellTrack", strLIZIZ3);
        C1261270ivV c1261270ivVInvoke = authCardCellTrackAbility.LL.invoke();
        final String str = c1261270ivVInvoke.LIZ;
        final String str2 = c1261270ivVInvoke.LIZIZ;
        final String str3 = c1261270ivVInvoke.LJ;
        final String str4 = c1261270ivVInvoke.LIZLLL;
        new AbstractC1223210hw7(str, str2, str3, str4, enumC1070410dxf) { // from class: X.08jy
            public final String LIZIZ;
            public final String LIZJ;
            public final String LIZLLL;
            public final String LJ;
            public final EnumC1070410dxf LJFF;
            public final String LJI = "authorize_card_close";
            public final Map<String, String> LJII;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2202008jy)) {
                    return false;
                }
                C2202008jy c2202008jy = (C2202008jy) obj;
                return Intrinsics.LJFF(this.LIZIZ, c2202008jy.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2202008jy.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c2202008jy.LIZLLL) && Intrinsics.LJFF(this.LJ, c2202008jy.LJ) && this.LJFF == c2202008jy.LJFF;
            }

            public final int hashCode() {
                return (((((((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("AuthorizeCardCloseTrack(enterFrom=");
                sbLIZ4.append(this.LIZIZ);
                sbLIZ4.append(", enterMethod=");
                sbLIZ4.append(this.LIZJ);
                sbLIZ4.append(", homepageUid=");
                sbLIZ4.append(this.LIZLLL);
                sbLIZ4.append(", previousPage=");
                sbLIZ4.append(this.LJ);
                sbLIZ4.append(", platform=");
                sbLIZ4.append(this.LJFF);
                sbLIZ4.append(')');
                return C2188811AlT.LIZIZ(sbLIZ4);
            }

            @Override // X.AbstractC1223210hw7
            public final String LIZ() {
                return this.LJI;
            }

            @Override // X.AbstractC1223210hw7
            public final Map<String, String> LIZIZ() {
                return this.LJII;
            }

            {
                this.LIZIZ = str;
                this.LIZJ = str2;
                this.LIZLLL = str3;
                this.LJ = str4;
                this.LJFF = enumC1070410dxf;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", str);
                c2344009Gk.LJIIIIZZ("enter_method", str2);
                c2344009Gk.LJIIIIZZ("previous_page", str4);
                c2344009Gk.LJIIIIZZ("homepage_uid", str3);
                c2344009Gk.LJIIIIZZ("platform", enumC1070410dxf.name().toLowerCase(Locale.ENGLISH));
                this.LJII = c2344009Gk.LIZ;
            }
        }.LIZLLL(null);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$8(AwS263S0300000_19 awS263S0300000_19) {
        String type;
        boolean z;
        Boolean bool;
        Integer num;
        Map<String, Boolean> map;
        if (((C1261270ivV) awS263S0300000_19.l0).LJFF) {
            type = EnumC1260920iuw.POP_UP.getType();
        } else {
            type = EnumC1260920iuw.CARD.getType();
        }
        C1261270ivV c1261270ivV = (C1261270ivV) awS263S0300000_19.l0;
        String str = c1261270ivV.LIZ;
        String str2 = c1261270ivV.LIZJ;
        if (str2 == null) {
            str2 = c1261270ivV.LIZIZ;
        }
        String str3 = c1261270ivV.LIZLLL;
        String str4 = c1261270ivV.LJ;
        int imprOrder = ((C1261860iwS) awS263S0300000_19.l1).getImprOrder();
        C1261650iw7 c1261650iw7 = (C1261650iw7) ((AbsRecUserCell) awS263S0300000_19.l2).getItem();
        if (c1261650iw7 != null) {
            z = c1261650iw7.LLILZLL;
        } else {
            z = false;
        }
        C1261270ivV c1261270ivV2 = (C1261270ivV) awS263S0300000_19.l0;
        int i = c1261270ivV2.LJIIIZ;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("source_page", c1261270ivV2.LJIIJJI), new Pair("light_interaction_enter_method", ((C1261270ivV) awS263S0300000_19.l0).LJIJ), new Pair("light_interaction_position", ((C1261270ivV) awS263S0300000_19.l0).LJIJI));
        C1261270ivV c1261270ivV3 = (C1261270ivV) awS263S0300000_19.l0;
        String str5 = c1261270ivV3.LJIIJJI;
        String str6 = c1261270ivV3.LJII;
        String str7 = c1261270ivV3.LJI;
        String str8 = c1261270ivV3.LJIIL;
        String str9 = c1261270ivV3.LJIILIIL;
        Integer num2 = c1261270ivV3.LJIJJ;
        RecUserCellTrackAbility recUserCellTrackAbility = (RecUserCellTrackAbility) ((AbsRecUserCell) awS263S0300000_19.l2).LLILZLL.getValue();
        if (recUserCellTrackAbility != null && (map = recUserCellTrackAbility.LLILZIL) != null) {
            bool = (Boolean) ((LinkedHashMap) map).get(((C1261860iwS) awS263S0300000_19.l1).getUid());
        } else {
            bool = null;
        }
        String str10 = ((C1261270ivV) awS263S0300000_19.l0).LJIJJLI;
        C1261650iw7 c1261650iw72 = (C1261650iw7) ((AbsRecUserCell) awS263S0300000_19.l2).getItem();
        if (c1261650iw72 != null) {
            num = c1261650iw72.LLIZ;
        } else {
            num = null;
        }
        int i2 = 0;
        return new C1260960iv0(str, (User) awS263S0300000_19.l1, str2, (String) null, str3, str4, Integer.valueOf(imprOrder), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), type, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), str6, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), i2, i2, (Boolean) (0 == true ? 1 : 0), i, (String) (0 == true ? 1 : 0), z, (Boolean) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), str8, str9, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), i2, (String) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), mapLJIIJ, str5, (Integer) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), i2, (String) (0 == true ? 1 : 0), (Long) (0 == true ? 1 : 0), i2, (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), i2, i2, num2, (Map) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), bool, num, (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), str7, str10, (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (C1247120iYg) (0 == true ? 1 : 0), (Map) (0 == true ? 1 : 0), -1621107832, 939517951, 16191);
    }

    public static final Object invoke$9(AwS263S0300000_19 awS263S0300000_19) {
        View decorView;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((C19EG) awS263S0300000_19.l0, "aweme://aweme/detail/");
        smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, ((C2223001BzW) awS263S0300000_19.l1).original_item_id);
        smartRouteBuildRoute.withParam("cid", ((C2223001BzW) awS263S0300000_19.l1).quoted_comment_id);
        smartRouteBuildRoute.withParam("refer", "click_comment_bubble");
        smartRouteBuildRoute.open();
        C20684815ws.LJIILLIIL("view_original_comment", C2097608Jq.LJIIIIZZ(new Pair("is_share_public_comment_to_story", "1"), new Pair("action_type", "click")));
        Window window = ((C19EG) awS263S0300000_19.l0).getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            HandlerHook.viewPost(decorView, new ARunnableS119S0100000_19((C19596611lk) awS263S0300000_19.l2, 90));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS263S0300000_19(C013C c013c, C1246760iY6 c1246760iY6, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = c013c;
        this.l1 = c1246760iY6;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS263S0300000_19(C1074520e4I c1074520e4I, C1074520e4I c1074520e4I2, User user, AuthMaFPowerCell<T> authMaFPowerCell) {
        super(0);
        this.$t = authMaFPowerCell;
        this.l0 = c1074520e4I;
        this.l1 = c1074520e4I2;
        this.l2 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS263S0300000_19(InterfaceC1215160hj8 interfaceC1215160hj8, AIPhotoCommentService aIPhotoCommentService, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC1215160hj8;
        this.l1 = aIPhotoCommentService;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS263S0300000_19(C1261270ivV c1261270ivV, C1261270ivV c1261270ivV2, C1261860iwS c1261860iwS, AbsRecUserCell<ITEM> absRecUserCell) {
        super(0);
        this.$t = absRecUserCell;
        this.l0 = c1261270ivV;
        this.l1 = c1261270ivV2;
        this.l2 = c1261860iwS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS263S0300000_19(C1262090iwp c1262090iwp, C1262090iwp c1262090iwp2, AbsAuthCell<ITEM> absAuthCell, ITEM item) {
        super(0);
        this.$t = item;
        this.l0 = c1262090iwp;
        this.l1 = c1262090iwp2;
        this.l2 = absAuthCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS263S0300000_19(InterfaceC1686540tzQ interfaceC1686540tzQ, InterfaceC1679450tnz interfaceC1679450tnz, InvitePageViewModel invitePageViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC1686540tzQ;
        this.l1 = interfaceC1679450tnz;
        this.l2 = invitePageViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS263S0300000_19(C1900990zZJ c1900990zZJ, FollowRequestCell followRequestCell, User user, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1900990zZJ;
        this.l1 = followRequestCell;
        this.l2 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS263S0300000_19(C19EG c19eg, C2223001BzW c2223001BzW, C19596611lk c19596611lk, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19eg;
        this.l1 = c2223001BzW;
        this.l2 = c19596611lk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS263S0300000_19(C19EG c19eg, ProfileAigcProgressAssem profileAigcProgressAssem, Function0 function0, int i) {
        super(0);
        this.$t = i;
        this.l0 = profileAigcProgressAssem;
        this.l1 = function0;
        this.l2 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS263S0300000_19(Context context, Aweme aweme, C1375980luW c1375980luW, int i) {
        super(0);
        this.$t = i;
        this.l0 = aweme;
        this.l1 = c1375980luW;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS263S0300000_19(View view, Placeholder placeholder, GroupInvitationVM groupInvitationVM, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
        this.l1 = placeholder;
        this.l2 = groupInvitationVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS263S0300000_19(SecurityCheckUpViewModel securityCheckUpViewModel, C013C c013c, Bundle bundle, int i) {
        super(0);
        this.$t = i;
        this.l0 = securityCheckUpViewModel;
        this.l1 = c013c;
        this.l2 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS263S0300000_19(SecurityCheckUpViewModel securityCheckUpViewModel, C013C c013c, EmailData emailData, int i) {
        super(0);
        this.$t = i;
        this.l0 = securityCheckUpViewModel;
        this.l1 = c013c;
        this.l2 = emailData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS263S0300000_19(SecurityCheckUpViewModel securityCheckUpViewModel, C013C c013c, PhoneData phoneData, int i) {
        super(0);
        this.$t = i;
        this.l0 = securityCheckUpViewModel;
        this.l1 = c013c;
        this.l2 = phoneData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS263S0300000_19(Aweme aweme, User user, C1242590iRN c1242590iRN, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1242590iRN;
        this.l1 = user;
        this.l2 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS263S0300000_19(GroupInvitationGroupInfoAssem groupInvitationGroupInfoAssem, TuxTextView tuxTextView, C1229810i6l c1229810i6l, int i) {
        super(0);
        this.$t = i;
        this.l0 = groupInvitationGroupInfoAssem;
        this.l1 = tuxTextView;
        this.l2 = c1229810i6l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS263S0300000_19(MusNotice musNotice, MusNotice musNotice2, Map<String, String> map, Map<String, String> map2) {
        super(0);
        this.$t = map2;
        this.l0 = musNotice;
        this.l1 = musNotice2;
        this.l2 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS263S0300000_19(SystemShareActivity systemShareActivity, SystemShareActivity systemShareActivity2, String[] strArr, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = systemShareActivity;
        this.l1 = systemShareActivity2;
        this.l2 = strArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS263S0300000_19(CancelUploadOrReeditSheetContentFragment cancelUploadOrReeditSheetContentFragment, CancelUploadOrReeditSheetContentFragment cancelUploadOrReeditSheetContentFragment2, C0HTT<C737030Svd> c0htt, Aweme aweme) {
        super(0);
        this.$t = aweme;
        this.l0 = cancelUploadOrReeditSheetContentFragment;
        this.l1 = cancelUploadOrReeditSheetContentFragment2;
        this.l2 = c0htt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS263S0300000_19(BioProfileLinkComponent bioProfileLinkComponent, BioProfileLinkComponent bioProfileLinkComponent2, Context context, C259800zU<String> c259800zU) {
        super(0);
        this.$t = c259800zU;
        this.l0 = bioProfileLinkComponent;
        this.l1 = bioProfileLinkComponent2;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS263S0300000_19(BioStructuralLinkProtocol bioStructuralLinkProtocol, BioStructuralLinkProtocol bioStructuralLinkProtocol2, Context context, C259800zU<String> c259800zU) {
        super(0);
        this.$t = c259800zU;
        this.l0 = bioStructuralLinkProtocol;
        this.l1 = bioStructuralLinkProtocol2;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS263S0300000_19(MyProfileGuideWidgetV2 myProfileGuideWidgetV2, MyProfileGuideState myProfileGuideState, ProfileState profileState, int i) {
        super(0);
        this.$t = i;
        this.l0 = myProfileGuideWidgetV2;
        this.l1 = myProfileGuideState;
        this.l2 = profileState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS263S0300000_19(HeaderCTAFollowComponent headerCTAFollowComponent, User user, C437850HEx c437850HEx, int i) {
        super(0);
        this.$t = i;
        this.l0 = headerCTAFollowComponent;
        this.l1 = user;
        this.l2 = c437850HEx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS263S0300000_19(FindSchoolFriendsPageContainerAssem findSchoolFriendsPageContainerAssem, FindSchoolFriendsPageContainerAssem findSchoolFriendsPageContainerAssem2, TuxNavBar tuxNavBar, List<? extends List<C443090HZb>> list) {
        super(0);
        this.$t = list;
        this.l0 = findSchoolFriendsPageContainerAssem;
        this.l1 = findSchoolFriendsPageContainerAssem2;
        this.l2 = tuxNavBar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS263S0300000_19(SchoolFlowController schoolFlowController, C19EG c19eg, C1245830iWb c1245830iWb, int i) {
        super(0);
        this.$t = i;
        this.l0 = schoolFlowController;
        this.l1 = c19eg;
        this.l2 = c1245830iWb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS263S0300000_19(ProfileHeaderCTAComponent profileHeaderCTAComponent, EnumC1249890id9 enumC1249890id9, EnumC1249890id9 enumC1249890id92, int i) {
        super(0);
        this.$t = i;
        this.l0 = profileHeaderCTAComponent;
        this.l1 = enumC1249890id9;
        this.l2 = enumC1249890id92;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS263S0300000_19(NavbarBaseUIComponent navbarBaseUIComponent, NavbarBaseUIComponent<BizBaseData> navbarBaseUIComponent2, TuxIconView tuxIconView, Context context) {
        super(0);
        this.$t = context;
        this.l0 = navbarBaseUIComponent;
        this.l1 = navbarBaseUIComponent2;
        this.l2 = tuxIconView;
    }
}
