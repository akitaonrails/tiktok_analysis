package kotlin.jvm.internal;

import X.AbstractC1220800hsE;
import X.C05P0;
import X.C05XL;
import X.C099F;
import X.C09AY;
import X.C0BKW;
import X.C0DL6;
import X.C0I7D;
import X.C1195404m0;
import X.C11G4;
import X.C1215970hkR;
import X.C1216110hkf;
import X.C1216270hkv;
import X.C1216290hkx;
import X.C1220820hsG;
import X.C1221260hsy;
import X.C1228780i56;
import X.C1229580i6O;
import X.C1229590i6P;
import X.C1229630i6T;
import X.C1229640i6U;
import X.C1229760i6g;
import X.C1229770i6h;
import X.C1229810i6l;
import X.C1229840i6o;
import X.C1229970i71;
import X.C1243240iSQ;
import X.C1247000iYU;
import X.C1247680iZa;
import X.C1247690iZb;
import X.C1248940ibc;
import X.C1261180ivM;
import X.C127K;
import X.C1308910kAL;
import X.C1361400lX0;
import X.C1385040m98;
import X.C13BV;
import X.C13LP;
import X.C1436405jm;
import X.C1440005kM;
import X.C1481605r4;
import X.C15438062q;
import X.C1558420qem;
import X.C1558520qew;
import X.C1584506Ih;
import X.C1623606Xi;
import X.C1722300uv6;
import X.C1748470vbJ;
import X.C1836160xsk;
import X.C189200o6;
import X.C19585611jy;
import X.C19635211ry;
import X.C1EDI;
import X.C20600815jK;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2201941BFw;
import X.C23250099c;
import X.C2344009Gk;
import X.C291001Au;
import X.C341940Daq;
import X.C343230Dcv;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C459080HzO;
import X.C627660Ojc;
import X.C736460Sui;
import X.C786410Ut5;
import X.C814420VxA;
import X.C844470XAv;
import X.C866950Xzh;
import X.EnumC1216660hlY;
import X.EnumC1217960hne;
import X.EnumC1221420htE;
import X.EnumC1229960i70;
import X.EnumC1247010iYV;
import X.EnumC1249130ibv;
import X.EnumC1251790igD;
import X.EnumC1262450ixP;
import X.InterfaceC1631620sYq;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS14S0201000_7;
import Y.ARunnableS81S0200000_12;
import Y.ARunnableS88S0200000_19;
import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsActivity;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.fragment.WhoCanJoinAssem;
import com.ss.android.ugc.aweme.compliance.api.model.Organization;
import com.ss.android.ugc.aweme.detailpage.audit.assem.AuditRequestListAssem;
import com.ss.android.ugc.aweme.ecommerce.tts.addressedit.us.vh.USDeleteButtonViewHolder;
import com.ss.android.ugc.aweme.fangroup.assem.FanGroupListAssem;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.inbox.search.InboxSearchFilterUserListFragment;
import com.ss.android.ugc.aweme.inbox.search.InboxSearchResultBaseFragment;
import com.ss.android.ugc.aweme.inbox.search.assem.InboxSearchResultContainer;
import com.ss.android.ugc.aweme.invitation.newdesign.assem.GroupInvitationInputAnswerAssem;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.AutoPostLivingPanelDialog;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.profile.model.ProfileNgoStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserPronounsInfo;
import com.ss.android.ugc.aweme.publicgroup.assem.GroupListAssem;
import com.ss.android.ugc.aweme.publicgroup.data.GroupPreviewDisplayMeta;
import com.ss.android.ugc.aweme.publicgroup.vm.GroupListViewModel;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageFragment;
import com.ss.android.ugc.aweme.relation.muflist.MufPageTrackInfo;
import com.ss.android.ugc.aweme.services.external.IDonationService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerGroupInfo;
import com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem;
import com.ss.android.ugc.profile.business.cd.ProfileNavbarSettingProtocol;
import com.ss.android.ugc.profile.business.ci.NavBarBellData;
import com.ss.android.ugc.profile.business.live.ProfileNavbarBellProtocol;
import com.ss.android.ugc.profile.business.profile.ProfileNavbarMenuProtocol;
import com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility;
import com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcAvatarListAssem;
import com.ss.android.ugc.profile.business.ur.editprofile.pronouns.ui.ProfileEditPronounsNavBarAssem;
import com.ss.android.ugc.profile.business.ur.editprofileassem.EditProfileNGOCellAssem;
import com.ss.android.ugc.profile.business.ur.editprofileassem.EditProfilePersonalLinkAssem;
import com.ss.android.ugc.profile.business.ur.editprofileassem.EditProfilePronounCellAssem;
import com.ss.android.ugc.profile.business.ur.editprofileassem.EditProfileUsernameCellAssem;
import com.ss.android.ugc.profile.business.ur.editprofileviewmodel.EditProfileNGOViewModel;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.base.RelationInfoBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.CommonInfoBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.ProfileUserAccountNameInfoBaseComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.ProfileUserInfoManageBaseComponent;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility;
import com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAssemV2;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS70S1000000_19;

/* JADX INFO: loaded from: classes20.dex */
public class AwS668S0100000_19 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            case 8:
                return invoke$8(this, obj, obj2, obj3);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2, obj3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2, obj3);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2, obj3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2, obj3);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2, obj3);
            case 14:
                return invoke$14(this, obj, obj2, obj3);
            case 15:
                return invoke$15(this, obj, obj2, obj3);
            case 16:
                return invoke$16(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2, obj3);
            case 19:
                return invoke$19(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2, obj3);
            case 21:
                return invoke$21(this, obj, obj2, obj3);
            case 22:
                return invoke$22(this, obj, obj2, obj3);
            case 23:
                return invoke$23(this, obj, obj2, obj3);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj, obj2, obj3);
            case 25:
                return invoke$25(this, obj, obj2, obj3);
            case 26:
                return invoke$26(this, obj, obj2, obj3);
            case 27:
                return invoke$27(this, obj, obj2, obj3);
            case 28:
                return invoke$28(this, obj, obj2, obj3);
            case 29:
                return invoke$29(this, obj, obj2, obj3);
            case 30:
                return invoke$30(this, obj, obj2, obj3);
            case 31:
                return invoke$31(this, obj, obj2, obj3);
            case 32:
                return invoke$32(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this, obj, obj2, obj3);
            case 35:
                return invoke$35(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this, obj, obj2, obj3);
            case 37:
                return invoke$37(this, obj, obj2, obj3);
            case 38:
                return invoke$38(this, obj, obj2, obj3);
            case 39:
                return invoke$39(this, obj, obj2, obj3);
            case 40:
                return invoke$40(this, obj, obj2, obj3);
            case 41:
                return invoke$41(this, obj, obj2, obj3);
            case 42:
                return invoke$42(this, obj, obj2, obj3);
            case 43:
                return invoke$43(this, obj, obj2, obj3);
            case 44:
                return invoke$44(this, obj, obj2, obj3);
            case 45:
                return invoke$45(this, obj, obj2, obj3);
            case 46:
                return invoke$46(this, obj, obj2, obj3);
            case 47:
                return invoke$47(this, obj, obj2, obj3);
            case 48:
                return invoke$48(this, obj, obj2, obj3);
            case 49:
                return invoke$49(this, obj, obj2, obj3);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this, obj, obj2, obj3);
            case 51:
                return invoke$51(this, obj, obj2, obj3);
            case 52:
                return invoke$52(this, obj, obj2, obj3);
            case 53:
                return invoke$53(this, obj, obj2, obj3);
            case 54:
                return invoke$54(this, obj, obj2, obj3);
            case 55:
                return invoke$55(this, obj, obj2, obj3);
            case 56:
                return invoke$56(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS668S0100000_19(C05P0 c05p0, C05P0<AbstractC1220800hsE> c05p02) {
        super(3);
        this.$t = c05p02;
        this.l0 = c05p0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS668S0100000_19(C099F c099f, int i) {
        super(3);
        this.$t = i;
        this.l0 = c099f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS668S0100000_19(C1261180ivM c1261180ivM, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1261180ivM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS668S0100000_19(C1836160xsk c1836160xsk, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1836160xsk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS668S0100000_19(C19585611jy c19585611jy, int i) {
        super(3);
        this.$t = i;
        this.l0 = c19585611jy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS668S0100000_19(C19635211ry c19635211ry, int i) {
        super(3);
        this.$t = i;
        this.l0 = c19635211ry;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS668S0100000_19(WhoCanJoinAssem whoCanJoinAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = whoCanJoinAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS668S0100000_19(AuditRequestListAssem auditRequestListAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = auditRequestListAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS668S0100000_19(USDeleteButtonViewHolder uSDeleteButtonViewHolder, int i) {
        super(3);
        this.$t = i;
        this.l0 = uSDeleteButtonViewHolder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS668S0100000_19(FanGroupListAssem fanGroupListAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = fanGroupListAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS668S0100000_19(InboxSearchFilterUserListFragment inboxSearchFilterUserListFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = inboxSearchFilterUserListFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS668S0100000_19(InboxSearchResultContainer inboxSearchResultContainer, int i) {
        super(3);
        this.$t = i;
        this.l0 = inboxSearchResultContainer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS668S0100000_19(GroupInvitationInputAnswerAssem groupInvitationInputAnswerAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = groupInvitationInputAnswerAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS668S0100000_19(AutoPostLivingPanelDialog autoPostLivingPanelDialog, int i) {
        super(3);
        this.$t = i;
        this.l0 = autoPostLivingPanelDialog;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS668S0100000_19(GroupListAssem groupListAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = groupListAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS668S0100000_19(MufListPageFragment mufListPageFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = mufListPageFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS668S0100000_19(StoryInboxCell storyInboxCell, int i) {
        super(3);
        this.$t = i;
        this.l0 = storyInboxCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS668S0100000_19(ProfileAvatarAssem profileAvatarAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = profileAvatarAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS668S0100000_19(ProfileNavbarSettingProtocol profileNavbarSettingProtocol, int i) {
        super(3);
        this.$t = i;
        this.l0 = profileNavbarSettingProtocol;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS668S0100000_19(ProfileNavbarBellProtocol profileNavbarBellProtocol, int i) {
        super(3);
        this.$t = i;
        this.l0 = profileNavbarBellProtocol;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS668S0100000_19(ProfileNavbarMenuProtocol profileNavbarMenuProtocol, int i) {
        super(3);
        this.$t = i;
        this.l0 = profileNavbarMenuProtocol;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS668S0100000_19(ProfileAigcAvatarListAssem profileAigcAvatarListAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = profileAigcAvatarListAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS668S0100000_19(ProfileEditPronounsNavBarAssem profileEditPronounsNavBarAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = profileEditPronounsNavBarAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS668S0100000_19(EditProfileNGOCellAssem editProfileNGOCellAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = editProfileNGOCellAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS668S0100000_19(EditProfilePersonalLinkAssem editProfilePersonalLinkAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = editProfilePersonalLinkAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS668S0100000_19(EditProfilePronounCellAssem editProfilePronounCellAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = editProfilePronounCellAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS668S0100000_19(EditProfileUsernameCellAssem editProfileUsernameCellAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = editProfileUsernameCellAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS668S0100000_19(ProfileEditNicknameFragment profileEditNicknameFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = profileEditNicknameFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS668S0100000_19(HeaderAdvancedFeatureBaseUIComponent headerAdvancedFeatureBaseUIComponent, int i) {
        super(3);
        this.$t = i;
        this.l0 = headerAdvancedFeatureBaseUIComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS668S0100000_19(RelationInfoBaseUIComponent relationInfoBaseUIComponent, RelationInfoBaseUIComponent<T> relationInfoBaseUIComponent2) {
        super(3);
        this.$t = relationInfoBaseUIComponent2;
        this.l0 = relationInfoBaseUIComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS668S0100000_19(AccountInfoBaseUIComponent accountInfoBaseUIComponent, AccountInfoBaseUIComponent<T> accountInfoBaseUIComponent2) {
        super(3);
        this.$t = accountInfoBaseUIComponent2;
        this.l0 = accountInfoBaseUIComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS668S0100000_19(CommonInfoBaseUIComponent commonInfoBaseUIComponent, CommonInfoBaseUIComponent<T> commonInfoBaseUIComponent2) {
        super(3);
        this.$t = commonInfoBaseUIComponent2;
        this.l0 = commonInfoBaseUIComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS668S0100000_19(ProfileUserAccountNameInfoBaseComponent profileUserAccountNameInfoBaseComponent, ProfileUserAccountNameInfoBaseComponent<T> profileUserAccountNameInfoBaseComponent2) {
        super(3);
        this.$t = profileUserAccountNameInfoBaseComponent2;
        this.l0 = profileUserAccountNameInfoBaseComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS668S0100000_19(ProfileUserInfoManageBaseComponent profileUserInfoManageBaseComponent, ProfileUserInfoManageBaseComponent<T> profileUserInfoManageBaseComponent2) {
        super(3);
        this.$t = profileUserInfoManageBaseComponent2;
        this.l0 = profileUserInfoManageBaseComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS668S0100000_19(NavbarBaseUIComponent navbarBaseUIComponent, NavbarBaseUIComponent<T> navbarBaseUIComponent2) {
        super(3);
        this.$t = navbarBaseUIComponent2;
        this.l0 = navbarBaseUIComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS668S0100000_19(UserAwemePagerAssemV2 userAwemePagerAssemV2, int i) {
        super(3);
        this.$t = i;
        this.l0 = userAwemePagerAssemV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS668S0100000_19(Throwable th, int i) {
        super(3);
        this.$t = i;
        this.l0 = th;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS668S0100000_19(Function0 function0, Function0<Unit> function02) {
        super(3);
        this.$t = function02;
        this.l0 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS668S0100000_19(Function1 function1, Function1<? super DMGroupChatStickerGroupInfo, Unit> function12) {
        super(3);
        this.$t = function12;
        this.l0 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS668S0100000_19(AwS32S0202000_21 awS32S0202000_21, int i) {
        super(3);
        this.$t = i;
        this.l0 = awS32S0202000_21;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS668S0100000_19(AwS422S0200000_21 awS422S0200000_21, int i) {
        super(3);
        this.$t = i;
        this.l0 = awS422S0200000_21;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS668S0100000_19(AwS427S0200000_26 awS427S0200000_26, int i) {
        super(3);
        this.$t = i;
        this.l0 = awS427S0200000_26;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS668S0100000_19(AwS562S0100000_18 awS562S0100000_18, int i) {
        super(3);
        this.$t = i;
        this.l0 = awS562S0100000_18;
    }

    public static final Object invoke$0(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        C05P0 c05p0 = (C05P0) awS668S0100000_19.l0;
        C1220820hsG c1220820hsG = new C1220820hsG(((Boolean) obj).booleanValue(), (String) obj2, (String) obj3);
        String str = ManageOrgPermissionsActivity._pnsPageId;
        c05p0.setValue(c1220820hsG);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        String str = (String) obj3;
        if (((Boolean) obj2).booleanValue() && str.length() != 0) {
            C1584506Ih.LIZIZ(((WhoCanJoinAssem) awS668S0100000_19.l0).getContentView());
            ((TextView) ((WhoCanJoinAssem) awS668S0100000_19.l0).LLJJIII.getValue()).setText(str);
        } else {
            C1584506Ih.LIZ(((WhoCanJoinAssem) awS668S0100000_19.l0).getContentView());
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$10(kotlin.jvm.internal.AwS668S0100000_19 r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r2 = r6.booleanValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r7.booleanValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r3 = r8.booleanValue()
            java.lang.Object r1 = r5.l0
            com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem r1 = (com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem) r1
            boolean r0 = r1.q1()
            r4 = 1
            if (r0 == 0) goto Lb5
            X.0ShA r0 = X.C728060ShA.LIZ
            r0.getClass()
            boolean r0 = X.C728060ShA.LIZ()
            if (r0 != 0) goto L2d
            boolean r0 = X.C1256360ina.LIZ()
            if (r0 == 0) goto Lb5
        L2d:
            if (r2 != 0) goto Lb5
            r0 = 1
        L30:
            r1.LLL = r0
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem r0 = (com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem) r0
            boolean r0 = r0.op()
            if (r0 == 0) goto L54
            java.lang.Object r1 = r5.l0
            com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem r1 = (com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem) r1
            boolean r0 = r1.LLJILJILJ
            if (r0 == 0) goto L54
            if (r3 == 0) goto L54
            X.0inS r0 = r1.LLJIJIL
            if (r0 == 0) goto L54
            android.view.View r1 = r0.LJJZZI()
            if (r1 == 0) goto L54
            r0 = 4
            X.C786410Ut5.LJLLLLLL(r0, r1)
        L54:
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem r0 = (com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem) r0
            r0.Jo(r3)
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem r0 = (com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem) r0
            boolean r0 = r0.op()
            if (r0 == 0) goto La1
            java.lang.Object r2 = r5.l0
            com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem r2 = (com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem) r2
            boolean r0 = r2.LLJILJIL
            if (r0 != 0) goto Lb3
            boolean r0 = r2.LLJJIJI
            if (r0 != 0) goto Lb3
            r1 = 0
        L72:
            if (r3 != 0) goto Lb1
            boolean r0 = r2.LLJJIJI
            if (r0 != 0) goto Lb1
            r0 = 0
        L79:
            if (r1 == r0) goto La1
            X.01GW r0 = r2.LLJJIJIIJIL
            java.lang.Object r2 = r0.getValue()
            com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility r2 = (com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility) r2
            if (r2 == 0) goto La1
            X.0N4w r0 = X.EnumC588120N4w.AVATAR_WIDGET
            java.lang.String r1 = r0.getScene()
            if (r3 != 0) goto L96
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem r0 = (com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem) r0
            boolean r0 = r0.LLJJIJI
            if (r0 != 0) goto L96
            r4 = 0
        L96:
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem r0 = (com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem) r0
            boolean r0 = r0.Ap()
            r2.zl2(r1, r4, r0)
        La1:
            java.lang.Object r1 = r5.l0
            com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem r1 = (com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem) r1
            r1.LLJILJIL = r3
            if (r3 == 0) goto Lae
            boolean r0 = r1.LLL
            r1.zp(r0)
        Lae:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Lb1:
            r0 = 1
            goto L79
        Lb3:
            r1 = 1
            goto L72
        Lb5:
            r0 = 0
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS668S0100000_19.invoke$10(kotlin.jvm.internal.AwS668S0100000_19, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$11(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        if (obj2 == null) {
            if (obj3 != null) {
            }
            return Unit.LIZ;
        }
        ((ProfileNavbarSettingProtocol) awS668S0100000_19.l0).getClass();
        ((ProfileNavbarSettingProtocol) awS668S0100000_19.l0).getClass();
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        User user;
        int iIntValue = ((Number) obj3).intValue();
        if (obj2 != null) {
            ProfileNavbarBellProtocol profileNavbarBellProtocol = (ProfileNavbarBellProtocol) awS668S0100000_19.l0;
            UserProfileAbility userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(profileNavbarBellProtocol), UserProfileAbility.class, null);
            if (userProfileAbility != null) {
                user = userProfileAbility.getUser();
                if (user != null) {
                    user.setLivePushNotificationStatus(iIntValue);
                }
            } else {
                user = null;
            }
            NavBarBellData navBarBellData = (NavBarBellData) profileNavbarBellProtocol.LLJILJIL;
            if (navBarBellData != null) {
                navBarBellData.setLivePushNotificationStatus(Integer.valueOf(iIntValue));
            }
            UserProfileAbility userProfileAbility2 = (UserProfileAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(profileNavbarBellProtocol), UserProfileAbility.class, null);
            if (userProfileAbility2 != null) {
                userProfileAbility2.sA2(user, EnumC1251790igD.NORMAL);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        String value;
        EnumC1249130ibv enumC1249130ibv;
        if (obj2 != null || obj3 != null) {
            ProfileNavbarMenuProtocol profileNavbarMenuProtocol = (ProfileNavbarMenuProtocol) awS668S0100000_19.l0;
            profileNavbarMenuProtocol.getClass();
            InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(profileNavbarMenuProtocol);
            C1248940ibc c1248940ibc = profileNavbarMenuProtocol.LLJJJJ;
            if (c1248940ibc == null || (enumC1249130ibv = c1248940ibc.LL) == null || (value = enumC1249130ibv.getValue()) == null) {
                value = "";
            }
            INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, INavbarBaseAbility.class, value);
            if (iNavbarBaseAbility != null) {
                iNavbarBaseAbility.rG1(0, "nav_bar_end_profile_menu", false);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$14(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        ((ProfileAigcAvatarListAssem) awS668S0100000_19.l0).No((EnumC1221420htE) ((C291001Au) obj2).LIZ, (C1221260hsy) ((C291001Au) obj3).LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        String str = (String) obj2;
        if (((Boolean) obj3).booleanValue()) {
            ((ProfileEditPronounsNavBarAssem) awS668S0100000_19.l0).ap(str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        Object parent;
        View view;
        LinearLayout linearLayout;
        ProfileNgoStruct profileNgoStruct = (ProfileNgoStruct) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        EditProfileNGOCellAssem editProfileNGOCellAssem = (EditProfileNGOCellAssem) awS668S0100000_19.l0;
        if (zBooleanValue) {
            C127K c127k = editProfileNGOCellAssem.LLJ;
            if (c127k != null) {
                C786410Ut5.LLZLL(c127k, 8);
            }
        } else {
            editProfileNGOCellAssem.getClass();
            try {
                SettingsManager.LIZLLL().getClass();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (SettingsManager.LIZ("enable_profile_add_nonprofit", false)) {
                String name = null;
                if (C1EDI.LJ()) {
                    C127K c127k2 = editProfileNGOCellAssem.LLJ;
                    if (c127k2 != null) {
                        parent = c127k2.getParent();
                    } else {
                        parent = null;
                    }
                    if ((parent instanceof LinearLayout) && (view = (View) parent) != null && (linearLayout = (LinearLayout) view.findViewById(R.id.jk4)) != null) {
                        C786410Ut5.LJZL(0, linearLayout);
                    }
                }
                C127K c127k3 = editProfileNGOCellAssem.LLJ;
                if (c127k3 != null) {
                    C786410Ut5.LLZLL(c127k3, 0);
                }
                if (profileNgoStruct != null) {
                    name = profileNgoStruct.getName();
                }
                if (C1EDI.LJ()) {
                    if (name != null && name.length() != 0) {
                        C127K c127k4 = editProfileNGOCellAssem.LLJ;
                        if (c127k4 != null) {
                            C1215970hkR.LIZLLL(c127k4, name);
                        }
                    } else {
                        C127K c127k5 = editProfileNGOCellAssem.LLJ;
                        if (c127k5 != null) {
                            C1215970hkR.LIZJ(c127k5, C1216270hkv.LIZJ(2131838884), false);
                        }
                    }
                } else if (name != null && name.length() != 0) {
                    C127K c127k6 = editProfileNGOCellAssem.LLJ;
                    if (c127k6 != null) {
                        C1215970hkR.LJ(c127k6, name, true);
                    }
                } else {
                    C127K c127k7 = editProfileNGOCellAssem.LLJ;
                    if (c127k7 != null) {
                        C1215970hkR.LJ(c127k7, C1216270hkv.LIZJ(2131838232), false);
                    }
                }
            } else {
                C127K c127k8 = editProfileNGOCellAssem.LLJ;
                if (c127k8 != null) {
                    C786410Ut5.LLZLL(c127k8, 8);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        Context context;
        C1361400lX0 c1361400lX0LIZIZ;
        Integer numLIZJ;
        String str = (String) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        EditProfilePersonalLinkAssem editProfilePersonalLinkAssem = (EditProfilePersonalLinkAssem) awS668S0100000_19.l0;
        if (zBooleanValue) {
            View view = editProfilePersonalLinkAssem.LLJ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
        } else {
            View view2 = editProfilePersonalLinkAssem.LLJ;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
            EditProfilePersonalLinkAssem editProfilePersonalLinkAssem2 = (EditProfilePersonalLinkAssem) awS668S0100000_19.l0;
            View view3 = editProfilePersonalLinkAssem2.LLJ;
            TextView textView = null;
            if (view3 != null && (textView = (TextView) view3.findViewById(R.id.q_b)) != null) {
                textView.setText(str);
            }
            View view4 = editProfilePersonalLinkAssem2.LLJ;
            if (view4 != null && (context = view4.getContext()) != null && (c1361400lX0LIZIZ = C1385040m98.LIZIZ(context)) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, c1361400lX0LIZIZ)) != null) {
                int iIntValue = numLIZJ.intValue();
                if (textView != null) {
                    textView.setTextColor(iIntValue);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        UserPronounsInfo userPronounsInfo = (UserPronounsInfo) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        EditProfilePronounCellAssem editProfilePronounCellAssem = (EditProfilePronounCellAssem) awS668S0100000_19.l0;
        editProfilePronounCellAssem.getClass();
        if (!zBooleanValue && userPronounsInfo != null && userPronounsInfo.getEnableEditPronouns() != null && !Intrinsics.LJFF(userPronounsInfo.getEnableEditPronouns(), Boolean.FALSE)) {
            C127K c127k = editProfilePronounCellAssem.LLJ;
            if (c127k != null) {
                C786410Ut5.LLZLL(c127k, 0);
            }
            String pronouns = userPronounsInfo.getPronouns();
            if (C1EDI.LJ()) {
                if (pronouns != null && pronouns.length() != 0) {
                    C127K c127k2 = editProfilePronounCellAssem.LLJ;
                    if (c127k2 != null) {
                        C1215970hkR.LIZLLL(c127k2, pronouns);
                    }
                } else {
                    C127K c127k3 = editProfilePronounCellAssem.LLJ;
                    if (c127k3 != null) {
                        C1215970hkR.LIZJ(c127k3, C1216270hkv.LIZJ(2131838880), false);
                    }
                }
            } else if (TextUtils.isEmpty(pronouns)) {
                C127K c127k4 = editProfilePronounCellAssem.LLJ;
                if (c127k4 != null) {
                    C1215970hkR.LJ(c127k4, C1216270hkv.LIZJ(2131825151), false);
                }
            } else {
                C127K c127k5 = editProfilePronounCellAssem.LLJ;
                if (c127k5 != null) {
                    C1215970hkR.LJ(c127k5, pronouns, true);
                }
            }
        } else {
            C127K c127k6 = editProfilePronounCellAssem.LLJ;
            if (c127k6 != null) {
                C786410Ut5.LLZLL(c127k6, 8);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object invoke$19(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        C127K c127k;
        C11G4 c11g4;
        C127K c127k2;
        Context context;
        String str = (String) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        EditProfileUsernameCellAssem editProfileUsernameCellAssem = (EditProfileUsernameCellAssem) awS668S0100000_19.l0;
        editProfileUsernameCellAssem.getClass();
        if (C1EDI.LJ()) {
            C127K c127k3 = editProfileUsernameCellAssem.LLJ;
            if (c127k3 != null) {
                C1215970hkR.LIZLLL(c127k3, str);
            }
        } else {
            C127K c127k4 = editProfileUsernameCellAssem.LLJ;
            if (c127k4 != null) {
                C1215970hkR.LJ(c127k4, str, true);
            }
        }
        if (zBooleanValue && (c127k = editProfileUsernameCellAssem.LLJ) != null && (c11g4 = (C11G4) c127k.getAccessory()) != null && (c127k2 = editProfileUsernameCellAssem.LLJ) != null && (context = c127k2.getContext()) != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c11g4.LJIIL());
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_exclamation_mark_circle_fill;
            c419910GdJ.LIZIZ = C341940Daq.LIZ(12.0d);
            c419910GdJ.LIZJ = C341940Daq.LIZ(12.0d);
            c419910GdJ.LJ = Integer.valueOf(R.attr.a04);
            spannableStringBuilder.clear();
            spannableStringBuilder.append((CharSequence) CardStruct.IStatusCode.DEFAULT);
            C786410Ut5.q2(spannableStringBuilder, c419910GdJ.LIZIZ(2, context), 0, 1, 17);
            c11g4.LJIILJJIL(spannableStringBuilder);
            c127k.setAccessory(c11g4);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS668S0100000_19 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto L8b
            r0 = 4
        L20:
            r4 = r4 | r0
        L21:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L89
            r0 = 1
        L3e:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L56
        L4d:
            kotlin.jvm.internal.AwS61S0001000_19 r4 = new kotlin.jvm.internal.AwS61S0001000_19
            r0 = 7
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L56:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 1
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r7 = 0
            r8 = 0
            r0 = 2131836369(0x7f113dd1, float:1.9305903E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r15)
            kotlin.jvm.internal.AwS455S0200000_19 r2 = new kotlin.jvm.internal.AwS455S0200000_19
            r0 = r16
            java.lang.Object r1 = r0.l0
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r0 = 3
            r2.<init>(r4, r1, r0)
            r0 = 43152988(0x292765c, float:2.1520707E-37)
            X.12De r13 = X.C13Z4.LIZJ(r0, r2, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1456(0x5b0, float:2.04E-42)
            r9 = r8
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r7
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L89:
            r0 = 0
            goto L3e
        L8b:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS668S0100000_19.invoke$2(kotlin.jvm.internal.AwS668S0100000_19, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$20(kotlin.jvm.internal.AwS668S0100000_19 r17, java.lang.Object r18, java.lang.Object r19, java.lang.Object r20) {
        /*
            r0 = r20
            r3 = r19
            r1 = r18
            java.lang.Number r1 = (java.lang.Number) r1
            int r2 = r1.intValue()
            X.0tpg r3 = (X.InterfaceC1680500tpg) r3
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r5 = 4
            if (r0 != 0) goto L21
            boolean r0 = r3.LJIJI(r2)
            if (r0 == 0) goto La6
            r0 = 4
        L20:
            r4 = r4 | r0
        L21:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r3.LIZ()
            if (r0 == 0) goto L33
            r3.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r3.LJJIIJZLJL(r0)
            r0 = r4 & 14
            r1 = 1
            r4 = 0
            if (r0 != r5) goto La4
            r0 = 1
        L40:
            java.lang.Object r6 = r3.LJJ()
            if (r0 != 0) goto L4f
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L59
        L4f:
            kotlin.jvm.internal.AwS61S0001000_19 r6 = new kotlin.jvm.internal.AwS61S0001000_19
            r0 = 16
            r6.<init>(r2, r0)
            r3.LJJIJIIJI(r6)
        L59:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r3.LJ()
            X.0tW1 r8 = X.EnumC1668310tW1.Normal
            r0 = 2131838131(0x7f1144b3, float:1.9309477E38)
            java.lang.String r11 = X.C0MBB.LIZIZ(r0, r3)
            r5 = r17
            java.lang.Object r2 = r5.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment r2 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment) r2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r0 = r2.LLJJIJIL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r4] = r0
            r0 = 2131838130(0x7f1144b2, float:1.9309475E38)
            java.lang.String r12 = r2.getString(r0, r1)
            r10 = 0
            kotlin.jvm.internal.AwS455S0200000_19 r2 = new kotlin.jvm.internal.AwS455S0200000_19
            java.lang.Object r1 = r5.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment r1 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment) r1
            r0 = 27
            r2.<init>(r1, r6, r0)
            r0 = 408925047(0x185fb377, float:2.8912681E-24)
            X.12De r15 = X.C13Z4.LIZJ(r0, r2, r3)
            r7 = 0
            r18 = 805309872(0x30000db0, float:4.658558E-10)
            r20 = 1424(0x590, float:1.995E-42)
            r9 = r7
            r13 = r10
            r14 = r10
            r16 = r10
            r19 = r7
            r17 = r3
            X.C1668330tW3.LJI(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L30
        La4:
            r0 = 0
            goto L40
        La6:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS668S0100000_19.invoke$20(kotlin.jvm.internal.AwS668S0100000_19, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$21(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        return ((RelationInfoBaseUIComponent) awS668S0100000_19.l0).uP(((Number) obj).intValue(), (String) obj2);
    }

    public static final Object invoke$22(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        return ((RelationInfoBaseUIComponent) awS668S0100000_19.l0).uP(((Number) obj).intValue(), (String) obj2);
    }

    public static final Object invoke$23(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        return ((AccountInfoBaseUIComponent) awS668S0100000_19.l0).uP(((Number) obj).intValue(), (String) obj2);
    }

    public static final Object invoke$24(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        return ((AccountInfoBaseUIComponent) awS668S0100000_19.l0).uP(((Number) obj).intValue(), (String) obj2);
    }

    public static final Object invoke$25(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        return ((CommonInfoBaseUIComponent) awS668S0100000_19.l0).uP(((Number) obj).intValue(), (String) obj2);
    }

    public static final Object invoke$26(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        return ((CommonInfoBaseUIComponent) awS668S0100000_19.l0).uP(((Number) obj).intValue(), (String) obj2);
    }

    public static final Object invoke$27(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        return ((ProfileUserAccountNameInfoBaseComponent) awS668S0100000_19.l0).uP(((Number) obj).intValue(), (String) obj2);
    }

    public static final Object invoke$28(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        return ((ProfileUserAccountNameInfoBaseComponent) awS668S0100000_19.l0).uP(((Number) obj).intValue(), (String) obj2);
    }

    public static final Object invoke$29(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        return ((ProfileUserInfoManageBaseComponent) awS668S0100000_19.l0).uP(((Number) obj).intValue(), (String) obj2);
    }

    public static final Object invoke$3(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        AwS668S0100000_19 awS668S0100000_192 = ((InboxSearchFilterUserListFragment) awS668S0100000_19.l0).LLIZLLLIL;
        if (awS668S0100000_192 != null) {
            awS668S0100000_192.invoke(obj, obj2, obj3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$30(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        return ((ProfileUserInfoManageBaseComponent) awS668S0100000_19.l0).uP(((Number) obj).intValue(), (String) obj2);
    }

    public static final Object invoke$31(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        return ((NavbarBaseUIComponent) awS668S0100000_19.l0).uP(((Number) obj).intValue(), (String) obj2);
    }

    public static final Object invoke$32(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        return ((NavbarBaseUIComponent) awS668S0100000_19.l0).uP(((Number) obj).intValue(), (String) obj2);
    }

    public static final Object invoke$33(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        return ((NavbarBaseUIComponent) awS668S0100000_19.l0).uP(((Number) obj).intValue(), (String) obj2);
    }

    public static final Object invoke$34(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        ((UserAwemePagerAssemV2) awS668S0100000_19.l0).Fv((String) obj2, (String) obj3);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$35(kotlin.jvm.internal.AwS668S0100000_19 r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17) {
        /*
            r0 = r17
            r13 = r16
            r1 = r15
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r13 = (X.InterfaceC1680500tpg) r13
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L20
            boolean r0 = r13.LJIJI(r3)
            if (r0 == 0) goto L82
            r0 = 4
        L1f:
            r4 = r4 | r0
        L20:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L32
            boolean r0 = r13.LIZ()
            if (r0 == 0) goto L32
            r13.LIZJ()
        L2f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L32:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r13.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L80
            r0 = 1
        L3d:
            java.lang.Object r2 = r13.LJJ()
            if (r0 != 0) goto L4c
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r2 != r0) goto L56
        L4c:
            kotlin.jvm.internal.AwS61S0001000_19 r2 = new kotlin.jvm.internal.AwS61S0001000_19
            r0 = 17
            r2.<init>(r3, r0)
            r13.LJJIJIIJI(r2)
        L56:
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r13.LJ()
            r3 = 1
            X.0tW1 r4 = X.EnumC1668310tW1.Normal
            r5 = 0
            r6 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "(debug) error: "
            r1.<init>(r0)
            java.lang.Object r0 = r14.l0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1.append(r0)
            java.lang.String r8 = r1.toString()
            r14 = 3504(0xdb0, float:4.91E-42)
            r16 = 1968(0x7b0, float:2.758E-42)
            r7 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r15 = r5
            X.C1668330tW3.LJI(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L2f
        L80:
            r0 = 0
            goto L3d
        L82:
            r0 = 2
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS668S0100000_19.invoke$35(kotlin.jvm.internal.AwS668S0100000_19, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$36(kotlin.jvm.internal.AwS668S0100000_19 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto L93
            r0 = 4
        L20:
            r4 = r4 | r0
        L21:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L91
            r0 = 1
        L3e:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L57
        L4d:
            kotlin.jvm.internal.AwS61S0001000_19 r4 = new kotlin.jvm.internal.AwS61S0001000_19
            r0 = 18
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L57:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 1
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r7 = 0
            r8 = 0
            r0 = 2131851307(0x7f11782b, float:1.93362E38)
            java.lang.String r9 = X.C0MBB.LIZIZ(r0, r15)
            r0 = 2131851306(0x7f11782a, float:1.9336199E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r15)
            kotlin.jvm.internal.AwS455S0200000_19 r2 = new kotlin.jvm.internal.AwS455S0200000_19
            r0 = r16
            java.lang.Object r1 = r0.l0
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.AutoPostLivingPanelDialog r1 = (com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.AutoPostLivingPanelDialog) r1
            r0 = 32
            r2.<init>(r1, r4, r0)
            r0 = 1805276803(0x6b9a5683, float:3.7316623E26)
            X.12De r13 = X.C13Z4.LIZJ(r0, r2, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1424(0x590, float:1.995E-42)
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r7
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L91:
            r0 = 0
            goto L3e
        L93:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS668S0100000_19.invoke$36(kotlin.jvm.internal.AwS668S0100000_19, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$37(kotlin.jvm.internal.AwS668S0100000_19 r17, java.lang.Object r18, java.lang.Object r19, java.lang.Object r20) {
        /*
            r0 = r20
            r3 = r19
            r1 = r18
            java.lang.Number r1 = (java.lang.Number) r1
            int r2 = r1.intValue()
            X.0tpg r3 = (X.InterfaceC1680500tpg) r3
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r5 = 4
            if (r0 != 0) goto L21
            boolean r0 = r3.LJIJI(r2)
            if (r0 == 0) goto La4
            r0 = 4
        L20:
            r4 = r4 | r0
        L21:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r3.LIZ()
            if (r0 == 0) goto L33
            r3.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r3.LJJIIJZLJL(r0)
            r0 = r4 & 14
            r1 = 1
            r4 = 0
            if (r0 != r5) goto La2
            r0 = 1
        L40:
            java.lang.Object r6 = r3.LJJ()
            if (r0 != 0) goto L4f
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L59
        L4f:
            kotlin.jvm.internal.AwS61S0001000_19 r6 = new kotlin.jvm.internal.AwS61S0001000_19
            r0 = 20
            r6.<init>(r2, r0)
            r3.LJJIJIIJI(r6)
        L59:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r3.LJ()
            X.0tW1 r8 = X.EnumC1668310tW1.Normal
            r5 = r17
            java.lang.Object r2 = r5.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment r2 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment) r2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = r2.nS()
            r1[r4] = r0
            r0 = 2131827624(0x7f111ba8, float:1.9288166E38)
            java.lang.String r11 = r2.getString(r0, r1)
            r0 = 2131827623(0x7f111ba7, float:1.9288164E38)
            java.lang.String r12 = X.C0MBB.LIZIZ(r0, r3)
            r10 = 0
            kotlin.jvm.internal.AwS455S0200000_19 r2 = new kotlin.jvm.internal.AwS455S0200000_19
            java.lang.Object r1 = r5.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment r1 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment) r1
            r0 = 34
            r2.<init>(r1, r6, r0)
            r0 = 655705283(0x271544c3, float:2.071518E-15)
            X.12De r15 = X.C13Z4.LIZJ(r0, r2, r3)
            r7 = 0
            r18 = 805309872(0x30000db0, float:4.658558E-10)
            r20 = 1424(0x590, float:1.995E-42)
            r9 = r7
            r13 = r10
            r14 = r10
            r16 = r10
            r19 = r7
            r17 = r3
            X.C1668330tW3.LJI(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L30
        La2:
            r0 = 0
            goto L40
        La4:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS668S0100000_19.invoke$37(kotlin.jvm.internal.AwS668S0100000_19, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$38(kotlin.jvm.internal.AwS668S0100000_19 r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21) {
        /*
            r0 = r21
            r3 = r20
            r1 = r19
            java.lang.Number r1 = (java.lang.Number) r1
            int r6 = r1.intValue()
            X.0tpg r3 = (X.InterfaceC1680500tpg) r3
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r7 = 4
            r1 = 2
            if (r0 != 0) goto L22
            boolean r0 = r3.LJIJI(r6)
            if (r0 == 0) goto Lad
            r0 = 4
        L21:
            r4 = r4 | r0
        L22:
            r2 = r4 & 19
            r0 = 18
            if (r2 != r0) goto L34
            boolean r0 = r3.LIZ()
            if (r0 == 0) goto L34
            r3.LIZJ()
        L31:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L34:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r3.LJJIIJZLJL(r0)
            r0 = r4 & 14
            r5 = 1
            r4 = 0
            if (r0 != r7) goto Lab
            r0 = 1
        L41:
            java.lang.Object r7 = r3.LJJ()
            if (r0 != 0) goto L50
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r7 != r0) goto L5a
        L50:
            kotlin.jvm.internal.AwS61S0001000_19 r7 = new kotlin.jvm.internal.AwS61S0001000_19
            r0 = 21
            r7.<init>(r6, r0)
            r3.LJJIJIIJI(r7)
        L5a:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r3.LJ()
            X.0tW1 r9 = X.EnumC1668310tW1.Normal
            r0 = 2131827631(0x7f111baf, float:1.928818E38)
            java.lang.String r12 = X.C0MBB.LIZIZ(r0, r3)
            r6 = r18
            java.lang.Object r2 = r6.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment r2 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment) r2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = r2.nS()
            r1[r4] = r0
            r0 = 48
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r5] = r0
            r0 = 2131827630(0x7f111bae, float:1.9288178E38)
            java.lang.String r13 = r2.getString(r0, r1)
            r11 = 0
            kotlin.jvm.internal.AwS455S0200000_19 r2 = new kotlin.jvm.internal.AwS455S0200000_19
            java.lang.Object r1 = r6.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment r1 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment) r1
            r0 = 33
            r2.<init>(r1, r7, r0)
            r0 = 207425478(0xc5d0fc6, float:1.7029967E-31)
            X.12De r16 = X.C13Z4.LIZJ(r0, r2, r3)
            r8 = 0
            r19 = 805309872(0x30000db0, float:4.658558E-10)
            r21 = 1424(0x590, float:1.995E-42)
            r10 = r8
            r14 = r11
            r15 = r11
            r17 = r11
            r18 = r3
            r20 = r8
            X.C1668330tW3.LJI(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L31
        Lab:
            r0 = 0
            goto L41
        Lad:
            r0 = 2
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS668S0100000_19.invoke$38(kotlin.jvm.internal.AwS668S0100000_19, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$39(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        float f;
        C1229810i6l c1229810i6l = (C1229810i6l) obj2;
        int iIntValue = ((Number) obj3).intValue();
        final GroupInvitationInputAnswerAssem groupInvitationInputAnswerAssem = (GroupInvitationInputAnswerAssem) awS668S0100000_19.l0;
        EnumC1229960i70.Companion.getClass();
        EnumC1229960i70 enumC1229960i70LIZ = C1229970i71.LIZ(iIntValue);
        final C1748470vbJ c1748470vbJ = (C1748470vbJ) groupInvitationInputAnswerAssem.LLJILJIL.getValue();
        if (c1748470vbJ != null) {
            String str = c1229810i6l.LJIIIZ;
            boolean z = true;
            if (C866950Xzh.LIZ(str) && c1229810i6l.LJIIIIZZ) {
                C1584506Ih.LIZIZ(c1748470vbJ);
                c1748470vbJ.LJFF(false);
                c1748470vbJ.setMinimumHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(51)));
                C1584506Ih.LIZ(c1748470vbJ.findViewById(R.id.uqb));
                C426750GoL.LJIIIZ(c1748470vbJ.findViewById(R.id.hwv), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), false, 21);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.zp);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
                if (enumC1229960i70LIZ != EnumC1229960i70.CAN_JOIN) {
                    f = 0.4f;
                } else {
                    f = 1.0f;
                }
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1748470vbJ);
                c1748470vbJ.setAlpha(f);
                c1748470vbJ.setBackground(c384050F3z.LIZ(c1748470vbJ.getContext()));
                C0I7D editText = c1748470vbJ.getEditText();
                editText.setHint(editText.getContext().getString(2131831405, str));
                c1748470vbJ.LJII(131073);
                editText.setFilters(C459080HzO.LIZIZ(50, editText));
                editText.addTextChangedListener(new C0DL6() { // from class: X.0i9f
                    @Override // X.C0DL6, android.text.TextWatcher
                    public final void afterTextChanged(Editable editable) {
                        groupInvitationInputAnswerAssem.Go().setState(new AwS70S1000000_19(String.valueOf(C2204961BRm.LLLLJI(c1748470vbJ.getEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmdZba3Sb0j24+bJNR3K3lhzA2gWH5BbZOK3A+FDaZZj4Qo7/AdIEZ+snTDlaX6NE8BQplHTCgHbs=", null))), 21));
                    }
                });
            }
            if (enumC1229960i70LIZ != EnumC1229960i70.CAN_JOIN) {
                z = false;
            }
            c1748470vbJ.LIZLLL(z);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        InboxSearchResultBaseFragment inboxSearchResultBaseFragment;
        String str = (String) obj;
        String str2 = (String) obj2;
        UrlModel urlModel = (UrlModel) obj3;
        InboxSearchResultContainer inboxSearchResultContainer = (InboxSearchResultContainer) awS668S0100000_19.l0;
        Fragment fragmentLIZIZ = inboxSearchResultContainer.hp().getFragmentItemOperator().LIZIZ(inboxSearchResultContainer.hp().getCurrentItem());
        if ((fragmentLIZIZ instanceof InboxSearchResultBaseFragment) && (inboxSearchResultBaseFragment = (InboxSearchResultBaseFragment) fragmentLIZIZ) != null) {
            inboxSearchResultBaseFragment.NR(str, str2, urlModel, true);
        }
        ((DialogFragment) inboxSearchResultContainer.LLJJJJLIIL.getValue()).dismiss();
        return Unit.LIZ;
    }

    public static final Object invoke$40(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        C05XL c05xl = (C05XL) awS668S0100000_19.l0;
        C189200o6.m2constructorimpl(obj3);
        c05xl.LJIIZILJ(C189200o6.m1boximpl(obj3));
        return Unit.LIZ;
    }

    public static final Object invoke$41(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        C05XL c05xl = (C05XL) awS668S0100000_19.l0;
        C189200o6.m2constructorimpl(obj3);
        c05xl.LJIIZILJ(C189200o6.m1boximpl(obj3));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$42(kotlin.jvm.internal.AwS668S0100000_19 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto L93
            r0 = 4
        L20:
            r4 = r4 | r0
        L21:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L91
            r0 = 1
        L3e:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L57
        L4d:
            kotlin.jvm.internal.AwS61S0001000_19 r4 = new kotlin.jvm.internal.AwS61S0001000_19
            r0 = 22
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L57:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 1
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r7 = 0
            r8 = 0
            r0 = 2131846235(0x7f11645b, float:1.9325913E38)
            java.lang.String r9 = X.C0MBB.LIZIZ(r0, r15)
            r0 = 2131832368(0x7f112e30, float:1.9297788E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r15)
            kotlin.jvm.internal.AwS455S0200000_19 r2 = new kotlin.jvm.internal.AwS455S0200000_19
            r0 = r16
            java.lang.Object r1 = r0.l0
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r0 = 36
            r2.<init>(r1, r4, r0)
            r0 = -476586343(0xffffffffe397de99, float:-5.6029964E21)
            X.12De r13 = X.C13Z4.LIZJ(r0, r2, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1424(0x590, float:1.995E-42)
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r7
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L91:
            r0 = 0
            goto L3e
        L93:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS668S0100000_19.invoke$42(kotlin.jvm.internal.AwS668S0100000_19, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$43(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        return ((HeaderAdvancedFeatureBaseUIComponent) awS668S0100000_19.l0).uP(((Number) obj).intValue(), (String) obj2);
    }

    public static final Object invoke$44(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        return ((HeaderAdvancedFeatureBaseUIComponent) awS668S0100000_19.l0).uP(((Number) obj).intValue(), (String) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$45(kotlin.jvm.internal.AwS668S0100000_19 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto L8d
            r0 = 4
        L20:
            r4 = r4 | r0
        L21:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L8b
            r0 = 1
        L3e:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L57
        L4d:
            kotlin.jvm.internal.AwS61S0001000_19 r4 = new kotlin.jvm.internal.AwS61S0001000_19
            r0 = 24
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L57:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 0
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r8 = 0
            r0 = 2131857706(0x7f11912a, float:1.934918E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r15)
            kotlin.jvm.internal.AwS455S0200000_19 r2 = new kotlin.jvm.internal.AwS455S0200000_19
            r0 = r16
            java.lang.Object r1 = r0.l0
            X.0ivM r1 = (X.C1261180ivM) r1
            r0 = 39
            r2.<init>(r1, r4, r0)
            r0 = 725924289(0x2b44b9c1, float:6.9890973E-13)
            X.12De r13 = X.C13Z4.LIZJ(r0, r2, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1456(0x5b0, float:2.04E-42)
            r7 = r5
            r9 = r8
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r5
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L8b:
            r0 = 0
            goto L3e
        L8d:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS668S0100000_19.invoke$45(kotlin.jvm.internal.AwS668S0100000_19, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$46(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        String nickName;
        InterfaceC1891350zJl c1247680iZa;
        boolean z3;
        String nickName2;
        String str = (String) obj2;
        List<IMUser> list = (List) obj3;
        boolean z4 = false;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && list.isEmpty()) {
            MufListPageFragment mufListPageFragment = (MufListPageFragment) awS668S0100000_19.l0;
            C786410Ut5.LLLZLZ(mufListPageFragment.nS(), 0);
            C786410Ut5.LLF(8, mufListPageFragment.mS());
            C786410Ut5.LLF(8, mufListPageFragment.iS());
            mufListPageFragment.nS().setStatus((C1722300uv6) mufListPageFragment.LLJJL.getValue());
            mufListPageFragment.nS().setLayoutVariant(1);
        } else if (str.length() > 0 && (!list.isEmpty())) {
            MufListPageFragment mufListPageFragment2 = (MufListPageFragment) awS668S0100000_19.l0;
            C786410Ut5.LLLZLZ(mufListPageFragment2.nS(), 8);
            C786410Ut5.LLF(0, mufListPageFragment2.mS());
            C786410Ut5.LLF(8, mufListPageFragment2.iS());
            EnumC1247010iYV enumC1247010iYV = null;
            mufListPageFragment2.mS().getState().LJFF(null);
            C20600815jK<InterfaceC1891350zJl> state = mufListPageFragment2.mS().getState();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (IMUser iMUser : list) {
                if (C0BKW.LIZ()) {
                    IMUser.Companion.getClass();
                    User userLJII = C2201941BFw.LJII(iMUser);
                    EnumC1262450ixP enumC1262450ixPHS = mufListPageFragment2.hS();
                    MufPageTrackInfo mufPageTrackInfoQS = mufListPageFragment2.qS();
                    C1243240iSQ c1243240iSQ = C1243240iSQ.LIZ;
                    if (iMUser.searchType != 3) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c1243240iSQ.getClass();
                    if (z3 && C343230Dcv.LIZ()) {
                        nickName2 = C1247000iYU.LIZ(iMUser);
                        if (nickName2 == null && (nickName2 = iMUser.getNickName()) == null) {
                            C844470XAv.LIZ.getClass();
                            nickName2 = C844470XAv.LIZ().getString(2131831188);
                        }
                    } else {
                        nickName2 = iMUser.getNickName();
                        if (nickName2 == null) {
                            C844470XAv.LIZ.getClass();
                            nickName2 = C844470XAv.LIZ().getString(2131831188);
                        }
                    }
                    c1247680iZa = new C1247690iZb(userLJII, enumC1262450ixPHS, mufPageTrackInfoQS, z4, nickName2, enumC1247010iYV, true, 32);
                } else {
                    EnumC1262450ixP enumC1262450ixPHS2 = mufListPageFragment2.hS();
                    MufPageTrackInfo mufPageTrackInfoQS2 = mufListPageFragment2.qS();
                    C1243240iSQ c1243240iSQ2 = C1243240iSQ.LIZ;
                    if (iMUser.searchType != 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c1243240iSQ2.getClass();
                    if (z2 && C343230Dcv.LIZ()) {
                        nickName = C1247000iYU.LIZ(iMUser);
                        if (nickName == null && (nickName = iMUser.getNickName()) == null) {
                            C844470XAv.LIZ.getClass();
                            nickName = C844470XAv.LIZ().getString(2131831188);
                        }
                    } else {
                        nickName = iMUser.getNickName();
                        if (nickName == null) {
                            C844470XAv.LIZ.getClass();
                            nickName = C844470XAv.LIZ().getString(2131831188);
                        }
                    }
                    c1247680iZa = new C1247680iZa(enumC1262450ixPHS2, iMUser, mufPageTrackInfoQS2, nickName, C1195404m0.LIZ(iMUser.getUid()));
                }
                arrayList.add(c1247680iZa);
            }
            state.LIZLLL(arrayList, null);
            mufListPageFragment2.mS().scrollToPosition(0);
        } else {
            MufListPageFragment mufListPageFragment3 = (MufListPageFragment) awS668S0100000_19.l0;
            C786410Ut5.LLLZLZ(mufListPageFragment3.nS(), 8);
            C786410Ut5.LLF(8, mufListPageFragment3.mS());
            C786410Ut5.LLF(0, mufListPageFragment3.iS());
            KeyboardUtils.LIZIZ(mufListPageFragment3.iS());
        }
        if (str.length() > 0) {
            MufListPageFragment mufListPageFragment4 = (MufListPageFragment) awS668S0100000_19.l0;
            if (!mufListPageFragment4.LLJLIL) {
                mufListPageFragment4.LLJLIL = true;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", (String) mufListPageFragment4.LLJJIJI.getValue());
                c2344009Gk.LJIIIIZZ("previous_page", (String) mufListPageFragment4.LLJJIII.getValue());
                C20684815ws.LJIILLIIL("search_friends_list", c2344009Gk.LIZ);
            }
        } else {
            ((MufListPageFragment) awS668S0100000_19.l0).LLJLIL = false;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$47(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        boolean zLIZIZ;
        Organization organization = (Organization) obj;
        EnumC1216660hlY enumC1216660hlY = (EnumC1216660hlY) obj2;
        Map<String, String> map = (Map) obj3;
        UrlModel urlModel = null;
        if (organization != null) {
            EditProfileNGOCellAssem editProfileNGOCellAssem = (EditProfileNGOCellAssem) awS668S0100000_19.l0;
            C127K c127k = editProfileNGOCellAssem.LLJ;
            if (c127k != null) {
                String str = organization.name;
                if (str != null) {
                    zLIZIZ = C736460Sui.LIZIZ(str);
                } else {
                    zLIZIZ = false;
                }
                C1215970hkR.LJ(c127k, str, zLIZIZ);
            }
            EditProfileNGOViewModel editProfileNGOViewModelGo = editProfileNGOCellAssem.Go();
            String str2 = organization.name;
            Integer num = organization.ngoId;
            String str3 = organization.orgId;
            String str4 = organization.iconUri;
            if (str4 != null) {
                urlModel = new UrlModel();
                urlModel.setUri(str4);
            }
            editProfileNGOViewModelGo.vQ2(new IDonationService.OrganizationModel(str2, organization.desc, urlModel, organization.detailUrl, organization.donateLink, str3, organization.orgType, num, organization.fundraiserId), map);
        } else {
            EditProfileNGOCellAssem editProfileNGOCellAssem2 = (EditProfileNGOCellAssem) awS668S0100000_19.l0;
            if (enumC1216660hlY == EnumC1216660hlY.REMOVED) {
                editProfileNGOCellAssem2.Go().vQ2(null, C2097608Jq.LJ());
            }
        }
        if (C1216110hkf.LIZ[enumC1216660hlY.ordinal()] != 1) {
            C1440005kM.LIZ(new C1436405jm(false));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$48(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        List<ITEM> list;
        C627660Ojc c627660Ojc = (C627660Ojc) obj2;
        if ((c627660Ojc.LL instanceof C1623606Xi) && (list = c627660Ojc.LLILZ) != 0) {
            ((AuditRequestListAssem) awS668S0100000_19.l0).Go().getState().LJIILL(list, null);
            if ((!list.isEmpty()) && obj3 == EnumC1217960hne.BATCH) {
                C1584506Ih.LIZIZ((View) ((AuditRequestListAssem) awS668S0100000_19.l0).LLJI.getValue());
            } else {
                C1584506Ih.LIZ((View) ((AuditRequestListAssem) awS668S0100000_19.l0).LLJI.getValue());
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$49(kotlin.jvm.internal.AwS668S0100000_19 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto L93
            r0 = 4
        L20:
            r4 = r4 | r0
        L21:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L91
            r0 = 1
        L3e:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L57
        L4d:
            kotlin.jvm.internal.AwS61S0001000_19 r4 = new kotlin.jvm.internal.AwS61S0001000_19
            r0 = 26
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L57:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 1
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r7 = 0
            r8 = 0
            r0 = 2131851058(0x7f117732, float:1.9335696E38)
            java.lang.String r9 = X.C0MBB.LIZIZ(r0, r15)
            r0 = 2131851057(0x7f117731, float:1.9335694E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r15)
            kotlin.jvm.internal.AwS455S0200000_19 r2 = new kotlin.jvm.internal.AwS455S0200000_19
            r0 = r16
            java.lang.Object r1 = r0.l0
            X.11ry r1 = (X.C19635211ry) r1
            r0 = 49
            r2.<init>(r1, r4, r0)
            r0 = 773416063(0x2e19647f, float:3.487743E-11)
            X.12De r13 = X.C13Z4.LIZJ(r0, r2, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1424(0x590, float:1.995E-42)
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r7
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L91:
            r0 = 0
            goto L3e
        L93:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS668S0100000_19.invoke$49(kotlin.jvm.internal.AwS668S0100000_19, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$5(kotlin.jvm.internal.AwS668S0100000_19 r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17) {
        /*
            r0 = r17
            r13 = r16
            r1 = r15
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r13 = (X.InterfaceC1680500tpg) r13
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L20
            boolean r0 = r13.LJIJI(r3)
            if (r0 == 0) goto L82
            r0 = 4
        L1f:
            r4 = r4 | r0
        L20:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L32
            boolean r0 = r13.LIZ()
            if (r0 == 0) goto L32
            r13.LIZJ()
        L2f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L32:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r13.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L80
            r0 = 1
        L3d:
            java.lang.Object r2 = r13.LJJ()
            if (r0 != 0) goto L4c
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r2 != r0) goto L56
        L4c:
            kotlin.jvm.internal.AwS61S0001000_19 r2 = new kotlin.jvm.internal.AwS61S0001000_19
            r0 = 9
            r2.<init>(r3, r0)
            r13.LJJIJIIJI(r2)
        L56:
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r13.LJ()
            r3 = 1
            X.0tW1 r4 = X.EnumC1668310tW1.Normal
            r5 = 0
            r6 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "(debug) error: "
            r1.<init>(r0)
            java.lang.Object r0 = r14.l0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1.append(r0)
            java.lang.String r8 = r1.toString()
            r14 = 3504(0xdb0, float:4.91E-42)
            r16 = 1968(0x7b0, float:2.758E-42)
            r7 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r15 = r5
            X.C1668330tW3.LJI(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L2f
        L80:
            r0 = 0
            goto L3d
        L82:
            r0 = 2
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS668S0100000_19.invoke$5(kotlin.jvm.internal.AwS668S0100000_19, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$50(kotlin.jvm.internal.AwS668S0100000_19 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto L93
            r0 = 4
        L20:
            r4 = r4 | r0
        L21:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L91
            r0 = 1
        L3e:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L57
        L4d:
            kotlin.jvm.internal.AwS61S0001000_19 r4 = new kotlin.jvm.internal.AwS61S0001000_19
            r0 = 27
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L57:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 1
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r7 = 0
            r8 = 0
            r0 = 2131848082(0x7f116b92, float:1.932966E38)
            java.lang.String r9 = X.C0MBB.LIZIZ(r0, r15)
            r0 = 2131848081(0x7f116b91, float:1.9329658E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r15)
            kotlin.jvm.internal.AwS455S0200000_19 r2 = new kotlin.jvm.internal.AwS455S0200000_19
            r0 = r16
            java.lang.Object r1 = r0.l0
            com.ss.android.ugc.aweme.ecommerce.tts.addressedit.us.vh.USDeleteButtonViewHolder r1 = (com.ss.android.ugc.aweme.ecommerce.tts.addressedit.us.vh.USDeleteButtonViewHolder) r1
            r0 = 50
            r2.<init>(r1, r4, r0)
            r0 = 270538989(0x102018ed, float:3.1573638E-29)
            X.12De r13 = X.C13Z4.LIZJ(r0, r2, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1424(0x590, float:1.995E-42)
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r7
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L91:
            r0 = 0
            goto L3e
        L93:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS668S0100000_19.invoke$50(kotlin.jvm.internal.AwS668S0100000_19, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$51(kotlin.jvm.internal.AwS668S0100000_19 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto L93
            r0 = 4
        L20:
            r4 = r4 | r0
        L21:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L91
            r0 = 1
        L3e:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L57
        L4d:
            kotlin.jvm.internal.AwS61S0001000_19 r4 = new kotlin.jvm.internal.AwS61S0001000_19
            r0 = 28
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L57:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 0
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r8 = 0
            r0 = 2131829067(0x7f11214b, float:1.9291093E38)
            java.lang.String r9 = X.C0MBB.LIZIZ(r0, r15)
            r0 = 2131829064(0x7f112148, float:1.9291087E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r15)
            kotlin.jvm.internal.AwS455S0200000_19 r2 = new kotlin.jvm.internal.AwS455S0200000_19
            r0 = r16
            java.lang.Object r1 = r0.l0
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r0 = 53
            r2.<init>(r1, r4, r0)
            r0 = -2055102478(0xffffffff85819ff2, float:-1.2189856E-35)
            X.12De r13 = X.C13Z4.LIZJ(r0, r2, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1424(0x590, float:1.995E-42)
            r7 = r5
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r5
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L91:
            r0 = 0
            goto L3e
        L93:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS668S0100000_19.invoke$51(kotlin.jvm.internal.AwS668S0100000_19, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$52(kotlin.jvm.internal.AwS668S0100000_19 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto L93
            r0 = 4
        L20:
            r4 = r4 | r0
        L21:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L91
            r0 = 1
        L3e:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L57
        L4d:
            kotlin.jvm.internal.AwS61S0001000_19 r4 = new kotlin.jvm.internal.AwS61S0001000_19
            r0 = 29
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L57:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 0
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r8 = 0
            r0 = 2131829079(0x7f112157, float:1.9291117E38)
            java.lang.String r9 = X.C0MBB.LIZIZ(r0, r15)
            r0 = 2131829076(0x7f112154, float:1.929111E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r15)
            kotlin.jvm.internal.AwS455S0200000_19 r2 = new kotlin.jvm.internal.AwS455S0200000_19
            r0 = r16
            java.lang.Object r1 = r0.l0
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r0 = 52
            r2.<init>(r1, r4, r0)
            r0 = 681606598(0x28a07dc6, float:1.7818114E-14)
            X.12De r13 = X.C13Z4.LIZJ(r0, r2, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1424(0x590, float:1.995E-42)
            r7 = r5
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r5
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L91:
            r0 = 0
            goto L3e
        L93:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS668S0100000_19.invoke$52(kotlin.jvm.internal.AwS668S0100000_19, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$53(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        return ((C1836160xsk) awS668S0100000_19.l0).getCalculateSelectedTimeSpan().invoke(Float.valueOf(((Number) obj2).floatValue()), Float.valueOf(((Number) obj3).floatValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$54(kotlin.jvm.internal.AwS668S0100000_19 r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
        /*
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r3 = r5.booleanValue()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r6.booleanValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r2 = r7.booleanValue()
            java.lang.Object r1 = r4.l0
            com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell r1 = (com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell) r1
            boolean r0 = r1.LLJJIJIL
            if (r0 == 0) goto L41
            X.0ShA r0 = X.C728060ShA.LIZ
            r0.getClass()
            boolean r0 = X.C728060ShA.LIZ()
            if (r0 != 0) goto L2a
            boolean r0 = X.C1256360ina.LIZ()
            if (r0 == 0) goto L41
        L2a:
            if (r3 != 0) goto L41
            r0 = 1
        L2d:
            r1.LLJL = r0
            com.ss.android.ugc.aweme.story.experiment.StoryInboxLegacyNoteBubbleShowEtFixExp r0 = com.ss.android.ugc.aweme.story.experiment.StoryInboxLegacyNoteBubbleShowEtFixExp.INSTANCE
            boolean r0 = r0.fallback()
            if (r0 != 0) goto L3e
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell r0 = (com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell) r0
            r0.m7(r2)
        L3e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L41:
            r0 = 0
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS668S0100000_19.invoke$54(kotlin.jvm.internal.AwS668S0100000_19, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$55(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        GroupPreviewDisplayMeta groupPreviewDisplayMeta = (GroupPreviewDisplayMeta) obj3;
        ((Function0) obj2).invoke();
        if (groupPreviewDisplayMeta != null) {
            C1481605r4.LIZIZ(new ARunnableS81S0200000_12(C1229770i6h.LIZ(groupPreviewDisplayMeta), (Function1) awS668S0100000_19.l0, 150));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0256  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$56(kotlin.jvm.internal.AwS668S0100000_19 r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS668S0100000_19.invoke$56(kotlin.jvm.internal.AwS668S0100000_19, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$6(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        C1229580i6O c1229580i6O = (C1229580i6O) obj2;
        C1229840i6o c1229840i6o = (C1229840i6o) obj3;
        GroupListAssem groupListAssem = (GroupListAssem) awS668S0100000_19.l0;
        groupListAssem.LLJJJ.LLILZLL.LJIILL(c1229580i6O.LIZ, new ARunnableS88S0200000_19(groupListAssem, c1229580i6O, 46));
        if (c1229840i6o.LIZIZ) {
            GroupListAssem groupListAssem2 = (GroupListAssem) awS668S0100000_19.l0;
            groupListAssem2.LLJJJIL.LLILZLL.LJIILL(c1229840i6o.LIZ, new ARunnableS88S0200000_19(groupListAssem2, c1229840i6o, 47));
        } else {
            ((GroupListAssem) awS668S0100000_19.l0).LLJJJIL.LLILZLL.LJIILL(C13BV.INSTANCE, null);
            ((GroupListAssem) awS668S0100000_19.l0).kp(false);
        }
        GroupListAssem groupListAssem3 = (GroupListAssem) awS668S0100000_19.l0;
        List listLJLIL = C13LP.LJLIL(c1229840i6o.LIZ, c1229580i6O.LIZ);
        long j = ((C1228780i56) groupListAssem3.LLJJL.getValue()).LL.LIZIZ.LJI;
        if (j != 0 && !groupListAssem3.LLJLILLLLZIIL) {
            groupListAssem3.LLJLILLLLZIIL = true;
            groupListAssem3.ip();
            ArrayList arrayList = new ArrayList();
            for (Object obj4 : (ArrayList) listLJLIL) {
                if (obj4 instanceof C1229760i6g) {
                    arrayList.add(obj4);
                }
            }
            Iterator it2 = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((C1229760i6g) it2.next()).LL == j) {
                    if (i != -1) {
                        C1229640i6U c1229640i6U = new C1229640i6U(i, j);
                        int i2 = c1229640i6U.LIZ;
                        long j2 = c1229640i6U.LIZIZ;
                        GroupListViewModel groupListViewModelIp = groupListAssem3.ip();
                        C1229630i6T c1229630i6T = (C1229630i6T) groupListViewModelIp.getState();
                        List<InterfaceC1891350zJl> list = c1229630i6T.LL.LIZ;
                        ArrayList arrayList2 = new ArrayList();
                        for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
                            if (interfaceC1891350zJl instanceof C1229760i6g) {
                                arrayList2.add(interfaceC1891350zJl);
                            }
                        }
                        Iterator it3 = arrayList2.iterator();
                        int i3 = 0;
                        while (true) {
                            if (it3.hasNext()) {
                                if (((C1229760i6g) it3.next()).LL == j2) {
                                    break;
                                }
                                i3++;
                            } else {
                                i3 = -1;
                                break;
                            }
                        }
                        Iterator<C1229760i6g> it4 = c1229630i6T.LLILLJJLI.LIZ.iterator();
                        int i4 = 0;
                        while (true) {
                            if (it4.hasNext()) {
                                if (it4.next().LL == j2) {
                                    break;
                                }
                                i4++;
                            } else {
                                i4 = -1;
                                break;
                            }
                        }
                        if (i3 != -1) {
                            List<InterfaceC1891350zJl> list2 = c1229630i6T.LL.LIZ;
                            ArrayList arrayList3 = new ArrayList();
                            for (InterfaceC1891350zJl interfaceC1891350zJl2 : list2) {
                                if (interfaceC1891350zJl2 instanceof C1229760i6g) {
                                    arrayList3.add(interfaceC1891350zJl2);
                                }
                            }
                            groupListViewModelIp.FQ2(i3, true, true, arrayList3);
                        } else {
                            if (i4 != -1) {
                                groupListViewModelIp.FQ2(i4, false, true, c1229630i6T.LLILLJJLI.LIZ);
                            }
                            HandlerHook.viewPost((View) groupListAssem3.LLJJJJLIIL.getValue(), new ARunnableS14S0201000_7(i2, groupListAssem3, groupListAssem3.hp(), 4));
                        }
                        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(groupListViewModelIp), null, null, new C1229590i6P(groupListViewModelIp, j2, null), 3);
                        HandlerHook.viewPost((View) groupListAssem3.LLJJJJLIIL.getValue(), new ARunnableS14S0201000_7(i2, groupListAssem3, groupListAssem3.hp(), 4));
                    }
                } else {
                    i++;
                }
            }
        }
        GroupListAssem groupListAssem4 = (GroupListAssem) awS668S0100000_19.l0;
        if (!groupListAssem4.LLJJLIIIJLLLLLLLZ) {
            groupListAssem4.ip().CQ2(false);
            ((GroupListAssem) awS668S0100000_19.l0).LLJJLIIIJLLLLLLLZ = true;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$7(kotlin.jvm.internal.AwS668S0100000_19 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto L8d
            r0 = 4
        L20:
            r4 = r4 | r0
        L21:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L8b
            r0 = 1
        L3e:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L57
        L4d:
            kotlin.jvm.internal.AwS61S0001000_19 r4 = new kotlin.jvm.internal.AwS61S0001000_19
            r0 = 12
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L57:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 1
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r7 = 0
            r8 = 0
            r0 = 2131822392(0x7f110738, float:1.9277554E38)
            java.lang.String r9 = X.C0MBB.LIZIZ(r0, r15)
            kotlin.jvm.internal.AwS455S0200000_19 r2 = new kotlin.jvm.internal.AwS455S0200000_19
            r0 = r16
            java.lang.Object r1 = r0.l0
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r0 = 23
            r2.<init>(r1, r4, r0)
            r0 = -1315316397(0xffffffffb199dd53, float:-4.4780477E-9)
            X.12De r13 = X.C13Z4.LIZJ(r0, r2, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1488(0x5d0, float:2.085E-42)
            r10 = r8
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r7
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L8b:
            r0 = 0
            goto L3e
        L8d:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS668S0100000_19.invoke$7(kotlin.jvm.internal.AwS668S0100000_19, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$8(kotlin.jvm.internal.AwS668S0100000_19 r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
        /*
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r3.booleanValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r4.booleanValue()
            java.lang.Object r1 = r1.l0
            com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell r1 = (com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell) r1
            boolean r0 = r1.LLJJIJIL
            if (r0 == 0) goto L31
            X.0ShA r0 = X.C728060ShA.LIZ
            r0.getClass()
            boolean r0 = X.C728060ShA.LIZ()
            if (r0 != 0) goto L29
            boolean r0 = X.C1256360ina.LIZ()
            if (r0 == 0) goto L31
        L29:
            if (r2 != 0) goto L31
            r0 = 1
        L2c:
            r1.LLJL = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L31:
            r0 = 0
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS668S0100000_19.invoke$8(kotlin.jvm.internal.AwS668S0100000_19, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$9(AwS668S0100000_19 awS668S0100000_19, Object obj, Object obj2, Object obj3) {
        Organization organization = (Organization) obj;
        ((C19585611jy) awS668S0100000_19.l0).e4();
        if (obj2 != EnumC1216660hlY.CANCELED) {
            if (obj2 == EnumC1216660hlY.REMOVED) {
                ((C19585611jy) awS668S0100000_19.l0).O3();
            } else if (organization != null) {
                ((C19585611jy) awS668S0100000_19.l0).E3(C1216290hkx.LIZ(organization));
            }
        }
        return Unit.LIZ;
    }
}
