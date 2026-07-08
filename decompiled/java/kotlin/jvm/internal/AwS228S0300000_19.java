package kotlin.jvm.internal;

import X.AbstractC1227390i2r;
import X.C013C;
import X.C062P;
import X.C09AY;
import X.C0H5S;
import X.C0HZQ;
import X.C0I0B;
import X.C0NPS;
import X.C0PEM;
import X.C0Y8T;
import X.C1007450cK7;
import X.C10EU;
import X.C1215360hjS;
import X.C1216270hkv;
import X.C1216760hli;
import X.C1218000hni;
import X.C1218060hno;
import X.C1218860hp6;
import X.C1219950hqr;
import X.C1220920hsQ;
import X.C1225220hzM;
import X.C1228190i49;
import X.C1228390i4T;
import X.C1228410i4V;
import X.C1228470i4b;
import X.C1228760i54;
import X.C1229100i5c;
import X.C1229390i65;
import X.C1229400i66;
import X.C1230080i7C;
import X.C1230090i7D;
import X.C1231150i8v;
import X.C1233730iD5;
import X.C1233790iDB;
import X.C1233960iDS;
import X.C1236470iHV;
import X.C1236480iHW;
import X.C1237880iJm;
import X.C1240120iNO;
import X.C1240520iO2;
import X.C1240530iO3;
import X.C1240600iOA;
import X.C1243000iS2;
import X.C1243400iSg;
import X.C1243410iSh;
import X.C1245920iWk;
import X.C1245940iWm;
import X.C1248720ibG;
import X.C1248930ibb;
import X.C1249090ibr;
import X.C1249820id2;
import X.C1251350ifV;
import X.C1252230igv;
import X.C1257500ipQ;
import X.C1257530ipT;
import X.C1257950iq9;
import X.C1266010j39;
import X.C1358880lSw;
import X.C1358950lT3;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1397620mTQ;
import X.C13BV;
import X.C1529305yl;
import X.C1697810uHb;
import X.C1748440vbG;
import X.C1843500y4a;
import X.C191994109g;
import X.C197039127h;
import X.C19719612Di;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C2252611DEt;
import X.C23250099c;
import X.C23271099x;
import X.C2344009Gk;
import X.C259800zU;
import X.C291001Au;
import X.C346160Dhe;
import X.C461720I8s;
import X.C626380OhY;
import X.C696620RUe;
import X.C735410St1;
import X.C735840Sti;
import X.C770770ULj;
import X.C786410Ut5;
import X.C894660Z7w;
import X.C948503nH;
import X.C985403tE;
import X.EnumC1216640hlW;
import X.EnumC1217960hne;
import X.EnumC1217990hnh;
import X.EnumC1229960i70;
import X.EnumC1231540i9Y;
import X.EnumC1233840iDG;
import X.EnumC1240610iOB;
import X.EnumC1240620iOC;
import X.EnumC1248370iah;
import X.EnumC1249830id3;
import X.EnumC1251790igD;
import X.InterfaceC1226510i1R;
import X.InterfaceC1231480i9S;
import X.InterfaceC1240540iO4;
import X.InterfaceC20236714Gf;
import X.InterfaceC863580XuG;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Selection;
import android.text.TextUtils;
import android.view.TouchDelegate;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.n;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityAssem;
import com.ss.android.ugc.aweme.account.org.permissions.InvitePageViewModel;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.fragment.ManageGroupContentAssem;
import com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.follower.CheckupRelationFollowerCell;
import com.ss.android.ugc.aweme.detailpage.audit.viewmodel.AuditRequestListViewModel;
import com.ss.android.ugc.aweme.fangroup.fragment.FanGroupJoinPanelFragment;
import com.ss.android.ugc.aweme.fangroup.model.GroupJoinResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteReason;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.viewmodel.IMSearchDetailVM;
import com.ss.android.ugc.aweme.inbox.storyreveal.StoryRevealInboxFloatingNoticePopupTask$showPopup$3$pauseDismissObserver$1;
import com.ss.android.ugc.aweme.profile.model.FollowingItemList;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.ProfileNgoStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.publicgroup.fragment.GroupListFragment;
import com.ss.android.ugc.aweme.selector.choosegroup.FanGroupChooseGroupFragment;
import com.ss.android.ugc.aweme.selector.choosegroup.FanGroupChooseGroupFragmentParam;
import com.ss.android.ugc.aweme.selector.choosegroup.FanGroupChooseGroupViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.upvote.detail.reposttab.RepostListViewModel;
import com.ss.android.ugc.profile.business.profile.ProfileSortPublishTabBusiness;
import com.ss.android.ugc.profile.business.profile.menu.ProfilePageMenuFragment;
import com.ss.android.ugc.profile.business.profile.menu.root.base.ProfileMenuRootBaseComponent;
import com.ss.android.ugc.profile.business.ur.aigc.ChooseStyleCell;
import com.ss.android.ugc.profile.business.ur.editprofileviewmodel.EditProfileNGOViewModel;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.states.FollowingRelationState;
import com.ss.android.ugc.profile.business.ur.platform.AccountModifyUserNameProtocol;
import com.ss.android.ugc.profile.business.ur.platform.relationlabel.ProfileHeaderRelationLabelComponent;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolgroups.SchoolGroupsListViewModel;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolusers.SchoolUsersListViewModel;
import com.ss.android.ugc.profile.business.ur.userid.MyProfileUserIdVM;
import com.ss.android.ugc.profile.platform.base.assemble.ProfileRootBaseComponent;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.u;
import webcast.api.fans.GroupInviteItem;

/* JADX INFO: loaded from: classes20.dex */
public class AwS228S0300000_19 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            case 27:
                return invoke$27(this, obj);
            case 28:
                return invoke$28(this, obj);
            case 29:
                return invoke$29(this, obj);
            case 30:
                return invoke$30(this, obj);
            case 31:
                return invoke$31(this, obj);
            case 32:
                return invoke$32(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this, obj);
            case 35:
                return invoke$35(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this, obj);
            case 37:
                return invoke$37(this, obj);
            case 38:
                return invoke$38(this, obj);
            case 39:
                return invoke$39(this, obj);
            case 40:
                return invoke$40(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.DQ2((ProfilePageMenuFragment) awS228S0300000_19.l0, new AwS598S0100000_19((List) awS228S0300000_19.l1, (List<? extends ProfileComponents>) 18));
        assembler.QQ2((ProfilePageMenuFragment) awS228S0300000_19.l0, new AwS598S0100000_19((View) awS228S0300000_19.l2, 19));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        C696620RUe c696620RUe = (C696620RUe) obj;
        c696620RUe.LL = ((ManageGroupContentAssem) awS228S0300000_19.l0).LLJIJIL.get((EnumC1216640hlW) awS228S0300000_19.l1);
        c696620RUe.LLIZLLLIL = ((EnumC1216640hlW) awS228S0300000_19.l1).getId();
        c696620RUe.LLJ = (View) awS228S0300000_19.l2;
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        ((InterfaceC1231480i9S) obj).LIZLLL((Context) awS228S0300000_19.l0, (C1228470i4b) awS228S0300000_19.l1, (AbstractC1227390i2r) awS228S0300000_19.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.DQ2((FanGroupJoinPanelFragment) awS228S0300000_19.l0, new AwS385S0200000_19((C1231150i8v) awS228S0300000_19.l1, (GroupJoinResponse) awS228S0300000_19.l2, 26));
        assembler.RQ2((FanGroupJoinPanelFragment) awS228S0300000_19.l0, AFwS229S0000000_2.get$arr$(177));
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        Integer numValueOf;
        Map<String, String> mapLIZLLL;
        C1240530iO3 c1240530iO3LIZ;
        C626380OhY c626380OhY = (C626380OhY) obj;
        IMSearchDetailVM iMSearchDetailVM = (IMSearchDetailVM) awS228S0300000_19.l0;
        EnumC1240620iOC enumC1240620iOC = (EnumC1240620iOC) awS228S0300000_19.l1;
        List list = (List) awS228S0300000_19.l2;
        iMSearchDetailVM.getClass();
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i >= 0) {
                C1240530iO3 c1240530iO3 = (C1240530iO3) obj2;
                InterfaceC1240540iO4 interfaceC1240540iO4 = c1240530iO3.LL;
                if (interfaceC1240540iO4 instanceof C1240120iNO) {
                    C1240120iNO c1240120iNO = (C1240120iNO) interfaceC1240540iO4;
                    IMUser iMUser = c1240120iNO.LJIIJ;
                    C0Y8T c0y8t = c1240120iNO.LJII;
                    if (c1240120iNO.LJI) {
                        mapLIZLLL = C1240600iOA.LIZIZ.LJ(EnumC1240610iOB.MESSAGE, enumC1240620iOC, c0y8t, i, size, false);
                        c1240120iNO.LJIILIIL = mapLIZLLL;
                    } else {
                        C1240600iOA c1240600iOA = C1240600iOA.LIZIZ;
                        EnumC1240610iOB enumC1240610iOB = EnumC1240610iOB.MESSAGE;
                        C1240520iO2 c1240520iO2 = c1240530iO3.LLILLJJLI;
                        if (c1240520iO2 != null) {
                            numValueOf = Integer.valueOf(c1240520iO2.LIZIZ);
                        } else {
                            numValueOf = null;
                        }
                        mapLIZLLL = c1240600iOA.LIZLLL(enumC1240610iOB, enumC1240620iOC, iMUser, c0y8t, i, size, false, numValueOf);
                        c1240120iNO.LJIILIIL = mapLIZLLL;
                    }
                    if (mapLIZLLL != null && !mapLIZLLL.isEmpty() && (c1240530iO3LIZ = C1240530iO3.LIZ(c1240530iO3, null, mapLIZLLL, 495)) != null) {
                        arrayList.add(c1240530iO3LIZ);
                    }
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return new C626380OhY(arrayList, false, c626380OhY.LLILLL);
    }

    public static final Object invoke$13(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        Assembler assembler = (Assembler) obj;
        Bundle bundle = (Bundle) awS228S0300000_19.l0;
        if (bundle != null) {
            ((GroupListFragment) awS228S0300000_19.l1).SR().setState(new AwS33S0010000_19(bundle.getBoolean("arranging_state"), 14));
        }
        GroupListFragment groupListFragment = (GroupListFragment) awS228S0300000_19.l1;
        assembler.DQ2(groupListFragment, new AwS385S0200000_19((C1228470i4b) awS228S0300000_19.l2, groupListFragment, 41));
        GroupListFragment groupListFragment2 = (GroupListFragment) awS228S0300000_19.l1;
        assembler.DQ2(groupListFragment2, new AwS385S0200000_19((C1228470i4b) awS228S0300000_19.l2, groupListFragment2, 42));
        assembler.RQ2((GroupListFragment) awS228S0300000_19.l1, AFwS229S0000000_2.get$arr$(472));
        assembler.RQ2((GroupListFragment) awS228S0300000_19.l1, AFwS237S0000000_7.get$arr$(184));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$14(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        C1257530ipT c1257530ipT;
        User user;
        C291001Au c291001Au = (C291001Au) obj;
        Integer numValueOf = null;
        if (c291001Au != null && (user = (User) c291001Au.LIZ) != null) {
            numValueOf = Integer.valueOf(user.visibleVideosCount);
        }
        if (C0H5S.LIZ(numValueOf) && numValueOf != null) {
            View view = (View) awS228S0300000_19.l0;
            ProfileSortPublishTabBusiness profileSortPublishTabBusiness = (ProfileSortPublishTabBusiness) awS228S0300000_19.l1;
            C1257950iq9 c1257950iq9 = (C1257950iq9) awS228S0300000_19.l2;
            String strLIZIZ = C1843500y4a.LIZIZ(numValueOf.intValue());
            if ((view instanceof C1257530ipT) && (c1257530ipT = (C1257530ipT) view) != null) {
                c1257530ipT.setVideoNumber(strLIZIZ);
            }
            C1257500ipQ c1257500ipQ = profileSortPublishTabBusiness.LLILLL;
            if (c1257500ipQ != null) {
                c1257500ipQ.LLILZIL.put(Integer.valueOf(c1257950iq9.LIZ), Integer.valueOf(C1257500ipQ.LJ(c1257500ipQ.getContext().getString(2131848610)) + C1257500ipQ.LJ(strLIZIZ) + C1216270hkv.LIZIZ(30)));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.EQ2((ProfileMenuRootBaseComponent) awS228S0300000_19.l0, new AwS385S0200000_19((ProfileComponents) awS228S0300000_19.l1, (C1248930ibb) awS228S0300000_19.l2, 52));
        assembler.QQ2((ProfileMenuRootBaseComponent) awS228S0300000_19.l0, new AwS598S0100000_19((C1248930ibb) awS228S0300000_19.l2, 332));
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        SchoolGroupsListViewModel schoolGroupsListViewModel = (SchoolGroupsListViewModel) awS228S0300000_19.l0;
        C948503nH.LJI(schoolGroupsListViewModel, C23271099x.INSTANCE, new C1236470iHV((C1007450cK7) awS228S0300000_19.l1, schoolGroupsListViewModel, (InterfaceC20236714Gf) awS228S0300000_19.l2, (C1236480iHW) obj, null));
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        SchoolUsersListViewModel schoolUsersListViewModel = (SchoolUsersListViewModel) awS228S0300000_19.l0;
        C948503nH.LJI(schoolUsersListViewModel, C23271099x.INSTANCE, new C1245940iWm(schoolUsersListViewModel, (C346160Dhe) obj, (InterfaceC20236714Gf) awS228S0300000_19.l1, (C1245920iWk) awS228S0300000_19.l2, null));
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        String str;
        String str2;
        Boolean bool;
        Boolean bool2;
        String str3;
        HashMap<String, String> map;
        C062P c062p = (C062P) obj;
        ProfileComponents profileComponents = (ProfileComponents) awS228S0300000_19.l0;
        C1249090ibr<ProfileUser> c1249090ibrBp = ((ProfileRootBaseComponent) awS228S0300000_19.l1).bp();
        C1252230igv c1252230igv = null;
        if (c1249090ibrBp != null) {
            str = c1249090ibrBp.LLILLJJLI;
        } else {
            str = null;
        }
        C1249090ibr<ProfileUser> c1249090ibrBp2 = ((ProfileRootBaseComponent) awS228S0300000_19.l1).bp();
        if (c1249090ibrBp2 != null) {
            str2 = c1249090ibrBp2.LLILLL;
        } else {
            str2 = null;
        }
        C1249090ibr<ProfileUser> c1249090ibrBp3 = ((ProfileRootBaseComponent) awS228S0300000_19.l1).bp();
        if (c1249090ibrBp3 != null) {
            bool = c1249090ibrBp3.LLILZ;
        } else {
            bool = null;
        }
        C1249090ibr<ProfileUser> c1249090ibrBp4 = ((ProfileRootBaseComponent) awS228S0300000_19.l1).bp();
        if (c1249090ibrBp4 != null) {
            bool2 = c1249090ibrBp4.LLILZIL;
        } else {
            bool2 = null;
        }
        C1249090ibr<ProfileUser> c1249090ibrBp5 = ((ProfileRootBaseComponent) awS228S0300000_19.l1).bp();
        if (c1249090ibrBp5 != null) {
            str3 = c1249090ibrBp5.LLILZLL;
        } else {
            str3 = null;
        }
        C1249090ibr<ProfileUser> c1249090ibrBp6 = ((ProfileRootBaseComponent) awS228S0300000_19.l1).bp();
        if (c1249090ibrBp6 == null || (map = c1249090ibrBp6.LLIZ) == null) {
            map = new HashMap<>();
        }
        C1249090ibr<ProfileUser> c1249090ibrBp7 = ((ProfileRootBaseComponent) awS228S0300000_19.l1).bp();
        if (c1249090ibrBp7 != null) {
            c1252230igv = c1249090ibrBp7.LLIZLLLIL;
        }
        c062p.LIZ = new C1249090ibr(profileComponents, str, str2, bool, bool2, str3, map, c1252230igv);
        c062p.LIZIZ = ((C1248930ibb) awS228S0300000_19.l2).LIZ;
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        Assembler assembler = (Assembler) obj;
        ProfileRootBaseComponent profileRootBaseComponent = (ProfileRootBaseComponent) awS228S0300000_19.l0;
        assembler.EQ2(profileRootBaseComponent, new AwS385S0200000_19((ProfileComponents) awS228S0300000_19.l1, profileRootBaseComponent, 67));
        assembler.QQ2((ProfileRootBaseComponent) awS228S0300000_19.l0, new AwS598S0100000_19((C1248930ibb) awS228S0300000_19.l2, 451));
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [T, X.0vbG] */
    public static final Object invoke$2(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        Context context = (Context) obj;
        C1237880iJm c1237880iJm = new C1237880iJm(context, null, 0);
        c1237880iJm.getInputBox().setHint(context.getString(2131839003));
        c1237880iJm.getInputBox().LIZ(new C1266010j39((InvitePageViewModel) awS228S0300000_19.l0, c1237880iJm, 3));
        ((C259800zU) awS228S0300000_19.l1).element = null;
        ((C259800zU) awS228S0300000_19.l2).element = c1237880iJm.getInputBox();
        return c1237880iJm;
    }

    public static final Object invoke$20(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        return C1251350ifV.LIZ((C1251350ifV) obj, null, false, false, null, null, null, null, null, null, null, null, null, null, (EnumC1251790igD) awS228S0300000_19.l2, null, null, null, null, null, false, null, null, null, null, null, null, null, null, new C291001Au(new Pair((ProfileUser) awS228S0300000_19.l0, (User) awS228S0300000_19.l1)), null, null, null, null, null, null, null, null, -268443649, 31);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$21(kotlin.jvm.internal.AwS228S0300000_19 r2, java.lang.Object r3) {
        /*
            com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol r3 = (com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol) r3
            if (r3 == 0) goto Lb
            java.lang.Object r0 = r2.l0
            com.google.gson.n r0 = (com.google.gson.n) r0
            r3.LJJJLZIJ(r0)
        Lb:
            java.lang.Object r1 = r2.l1
            com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent r1 = (com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent) r1
            if (r3 == 0) goto L15
            T extends com.ss.android.ugc.profile.platform.base.data.BizBaseData r0 = r3.LLJILJIL
            if (r0 != 0) goto L19
        L15:
            java.lang.Object r0 = r2.l2
            com.ss.android.ugc.profile.platform.base.data.BizBaseData r0 = (com.ss.android.ugc.profile.platform.base.data.BizBaseData) r0
        L19:
            r1.LLJLIL = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS228S0300000_19.invoke$21(kotlin.jvm.internal.AwS228S0300000_19, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$22(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue == 1 || iIntValue == 2) {
            C735840Sti c735840Sti = C735840Sti.LIZ;
            String str = ((C1243000iS2) awS228S0300000_19.l0).LLILLL;
            if (str == null) {
                str = "notification_page";
            }
            String mobValue = EnumC1231540i9Y.INBOX_POPUP.getMobValue();
            c735840Sti.getClass();
            C735840Sti.LJIIL(str, mobValue, "close");
        }
        ((C1243000iS2) awS228S0300000_19.l0).LLILZ = null;
        ((Fragment) awS228S0300000_19.l1).getLifecycle().removeObserver((StoryRevealInboxFloatingNoticePopupTask$showPopup$3$pauseDismissObserver$1) awS228S0300000_19.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        InterfaceC1226510i1R interfaceC1226510i1R = (InterfaceC1226510i1R) awS228S0300000_19.l0;
        if (interfaceC1226510i1R != null) {
            interfaceC1226510i1R.LIZLLL();
        }
        Function2<Context, C0Y8T, Unit> function2 = ((C1228190i49) awS228S0300000_19.l1).LIZ.LLJILJILJ;
        Context context = ((Fragment) awS228S0300000_19.l2).getContext();
        if (context == null) {
            C0I0B.LJFF.LIZJ();
            context = C894660Z7w.LIZ();
        }
        function2.invoke(context, obj);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$24(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        Context contextLIZ;
        ((C1228190i49) awS228S0300000_19.l0).LIZ.LLILLJJLI.getTag();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receive conversation create callback, conversation:");
        sbLIZ.append(obj);
        C2188811AlT.LIZIZ(sbLIZ);
        C197039127h c197039127h = ((C770770ULj) awS228S0300000_19.l1).LIZ;
        if (c197039127h != null) {
            c197039127h.setLoading(false);
        }
        C197039127h c197039127h2 = ((C770770ULj) awS228S0300000_19.l1).LIZ;
        if (c197039127h2 != null) {
            c197039127h2.setClickable(true);
        }
        if (obj != null) {
            DialogFragment dialogFragment = (DialogFragment) ((C259800zU) awS228S0300000_19.l2).element;
            if (dialogFragment != null) {
                dialogFragment.dismiss();
            }
            Function2<Context, C0Y8T, Unit> function2 = ((C1228190i49) awS228S0300000_19.l0).LIZ.LLJILJILJ;
            C197039127h c197039127h3 = ((C770770ULj) awS228S0300000_19.l1).LIZ;
            if (c197039127h3 == null || (contextLIZ = c197039127h3.getContext()) == null) {
                C0I0B.LJFF.LIZJ();
                contextLIZ = C894660Z7w.LIZ();
            }
            function2.invoke(contextLIZ, obj);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        C770770ULj c770770ULj = (C770770ULj) obj;
        c770770ULj.LIZIZ = false;
        C197039127h c197039127h = c770770ULj.LIZ;
        if (c197039127h != null) {
            c197039127h.setLoading(true);
        }
        C197039127h c197039127h2 = c770770ULj.LIZ;
        if (c197039127h2 != null) {
            c197039127h2.setClickable(false);
        }
        C1228190i49 c1228190i49 = (C1228190i49) awS228S0300000_19.l0;
        c1228190i49.LIZ((Map) awS228S0300000_19.l1, new AwS228S0300000_19(c1228190i49, (C1228190i49) c770770ULj, (C770770ULj) awS228S0300000_19.l2, (C259800zU<TuxSheet>) 24));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$26(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        boolean z;
        String str;
        FollowingRelationState followingRelationState = (FollowingRelationState) obj;
        if (!((C013C) awS228S0300000_19.l0).element && !((FollowingItemList) awS228S0300000_19.l1).isHotSoonHasMore()) {
            z = false;
        } else {
            z = true;
        }
        FollowingItemList followingItemList = (FollowingItemList) awS228S0300000_19.l1;
        int i = followingItemList.vcdCount;
        String str2 = followingItemList.hotSoonText;
        if (str2 != null && str2.length() != 0) {
            str = ((FollowingItemList) awS228S0300000_19.l1).hotSoonText;
        } else {
            str = (String) ((C259800zU) awS228S0300000_19.l2).element;
        }
        return followingRelationState.copy(followingRelationState.userId, followingRelationState.secUserId, followingRelationState.isSelf, followingRelationState.recommendList, followingRelationState.jediListState, z, i, str, followingRelationState.unreadCountMap, followingRelationState.unreadUidList, followingRelationState.pageToken, followingRelationState.liveSortBy, followingRelationState.listState, followingRelationState.payload, followingRelationState.refresh, followingRelationState.removeUid, followingRelationState.followingListOwner);
    }

    public static final Object invoke$27(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        C1358950lT3 c1358950lT3 = C1358950lT3.LIZ;
        List<Aweme> list = (List) awS228S0300000_19.l0;
        List<UpvoteList> list2 = (List) awS228S0300000_19.l1;
        String str = ((RepostListViewModel) awS228S0300000_19.l2).LLIZLLLIL;
        c1358950lT3.getClass();
        for (Aweme aweme : list) {
            UpvoteReason upvoteReason = aweme.getUpvoteReason();
            if (upvoteReason != null) {
                C1358880lSw c1358880lSw = C1358880lSw.LIZ;
                String aid = aweme.getAid();
                c1358880lSw.getClass();
                ((ConcurrentHashMap) C1358880lSw.LIZIZ.getValue()).put(aid, upvoteReason);
            }
        }
        if (list2 != null) {
            for (UpvoteList upvoteList : list2) {
                C1358950lT3 c1358950lT32 = C1358950lT3.LIZ;
                c1358950lT32.getClass();
                UpvoteList upvoteListLJIIIZ = C1358950lT3.LJIIIZ(upvoteList);
                C1358950lT3.LJII(c1358950lT32, upvoteListLJIIIZ.itemId, upvoteListLJIIIZ, str, false, 0, false, 56);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        ((C0HZQ) awS228S0300000_19.l0).setChecked(((C0NPS) obj).LLILLJJLI.LIZ.contains(((C1220920hsQ) awS228S0300000_19.l1).LL));
        ((ChooseStyleCell) awS228S0300000_19.l2).LLILLJJLI = ((C0HZQ) awS228S0300000_19.l0).isChecked();
        ChooseStyleCell chooseStyleCell = (ChooseStyleCell) awS228S0300000_19.l2;
        if (chooseStyleCell.LLILLJJLI) {
            ((C0HZQ) awS228S0300000_19.l0).setEnabled(true);
        } else {
            ((C0HZQ) awS228S0300000_19.l0).setEnabled(chooseStyleCell.I5().vQ2());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$29(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        return C1215360hjS.LIZ((C1215360hjS) obj, (ProfileNgoStruct) awS228S0300000_19.l0, (ProfileNgoStruct) awS228S0300000_19.l1, 4);
    }

    public static final Object invoke$3(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        Assembler assembler = (Assembler) obj;
        List list = (List) awS228S0300000_19.l0;
        ArrayList<EnumC1216640hlW> arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((C1216760hli) it2.next()).LIZ, arrayList);
        }
        ManageGroupContentAssem manageGroupContentAssem = (ManageGroupContentAssem) awS228S0300000_19.l1;
        View view = (View) awS228S0300000_19.l2;
        for (EnumC1216640hlW enumC1216640hlW : arrayList) {
            if (manageGroupContentAssem.LLJILJIL.containsKey(enumC1216640hlW)) {
                assembler.RQ2(manageGroupContentAssem, new AwS385S0200000_19(manageGroupContentAssem, enumC1216640hlW, 12));
            } else if (manageGroupContentAssem.LLJIJIL.containsKey(enumC1216640hlW)) {
                assembler.QQ2(manageGroupContentAssem, new AwS228S0300000_19(manageGroupContentAssem, enumC1216640hlW, view, 1));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$30(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        boolean z;
        Rect rect = new Rect();
        ((View) obj).getHitRect(rect);
        if (!rect.isEmpty()) {
            ((View) awS228S0300000_19.l0).setTouchDelegate((TouchDelegate) ((Function2) awS228S0300000_19.l1).invoke(rect, (View) awS228S0300000_19.l2));
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static /* bridge */ /* synthetic */ Object invoke$31(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        C191994109g c191994109g = C191994109g.LIZ;
        String str = ((CheckupRelationFollowerCell) awS228S0300000_19.l0).I5().LLILLL;
        String uid = ((User) awS228S0300000_19.l1).getUid();
        c191994109g.getClass();
        C191994109g.LJIIIZ("remove_follower", str, uid);
        C1397580mTM c1397580mTM = new C1397580mTM(((View) awS228S0300000_19.l2).getContext());
        c1397580mTM.LJFF(2131846231);
        c1397580mTM.LIZIZ(C786410Ut5.j4(((View) awS228S0300000_19.l2).getResources().getString(2131846230), Arrays.copyOf(new Object[]{C10EU.LIZJ((User) awS228S0300000_19.l1)}, 1)));
        C985403tE.LIZ(c1397580mTM, new AwS385S0200000_19((CheckupRelationFollowerCell) awS228S0300000_19.l0, (User) awS228S0300000_19.l1, 121));
        new C1397510mTF(c1397580mTM).LIZLLL();
        return Unit.LIZ;
    }

    public static final Object invoke$32(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        boolean z;
        C1228410i4V c1228410i4V;
        Object value;
        C1219950hqr c1219950hqr;
        Long lValueOf;
        C1225220hzM c1225220hzM = (C1225220hzM) obj;
        FanGroupChooseGroupViewModel fanGroupChooseGroupViewModel = (FanGroupChooseGroupViewModel) awS228S0300000_19.l0;
        fanGroupChooseGroupViewModel.getClass();
        if (c1225220hzM.LLILZIL && !c1225220hzM.LLIZLLLIL && (c1228410i4V = fanGroupChooseGroupViewModel.LLIZ) != null) {
            long j = c1225220hzM.LL;
            C2252321DDq c2252321DDq = fanGroupChooseGroupViewModel.LL;
            do {
                value = c2252321DDq.getValue();
                c1219950hqr = (C1219950hqr) value;
                Long l = c1219950hqr.LJFF;
                if (l != null && l.longValue() == j) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(j);
                }
            } while (!c2252321DDq.compareAndSet(value, C1219950hqr.LIZ(c1219950hqr, false, false, false, null, FanGroupChooseGroupViewModel.vQ2(c1228410i4V.LIZ, c1219950hqr.LIZLLL, lValueOf), lValueOf, 15)));
        }
        FanGroupChooseGroupFragment fanGroupChooseGroupFragment = (FanGroupChooseGroupFragment) awS228S0300000_19.l1;
        FanGroupChooseGroupFragmentParam fanGroupChooseGroupFragmentParam = (FanGroupChooseGroupFragmentParam) awS228S0300000_19.l2;
        fanGroupChooseGroupFragment.getClass();
        String strValueOf = String.valueOf(c1225220hzM.LL);
        if (fanGroupChooseGroupFragmentParam.LIZ() != 0 && fanGroupChooseGroupFragmentParam.LIZ() == C461720I8s.LIZJ()) {
            z = true;
        } else {
            z = false;
        }
        C1228760i54.LIZ("group_list_page_click", new Pair[]{new Pair("group_type", C1229100i5c.LJI(strValueOf)), new Pair("is_master", C1529305yl.LIZ(Boolean.valueOf(z))), new Pair("group_status", String.valueOf(EnumC1229960i70.IN_GROUP.getValue()))}, C0I0B.LJFF.LIZIZ());
        return Unit.LIZ;
    }

    public static final Object invoke$33(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        String str;
        GroupInviteItem next;
        Object value;
        C1219950hqr c1219950hqr;
        C1225220hzM c1225220hzM = (C1225220hzM) obj;
        FanGroupChooseGroupViewModel fanGroupChooseGroupViewModel = (FanGroupChooseGroupViewModel) awS228S0300000_19.l0;
        C1228410i4V c1228410i4V = fanGroupChooseGroupViewModel.LLIZ;
        if (c1228410i4V != null) {
            long j = c1225220hzM.LL;
            Iterator<GroupInviteItem> it2 = ((C1219950hqr) fanGroupChooseGroupViewModel.LL.getValue()).LIZLLL.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.conversationShortId == j) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            GroupInviteItem groupInviteItem = next;
            if (groupInviteItem != null && groupInviteItem.isHidden) {
                groupInviteItem.isHidden = false;
                C2252321DDq c2252321DDq = fanGroupChooseGroupViewModel.LL;
                do {
                    value = c2252321DDq.getValue();
                    c1219950hqr = (C1219950hqr) value;
                } while (!c2252321DDq.compareAndSet(value, C1219950hqr.LIZ(c1219950hqr, false, false, false, null, FanGroupChooseGroupViewModel.vQ2(c1228410i4V.LIZ, c1219950hqr.LIZLLL, c1219950hqr.LJFF), null, 47)));
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(fanGroupChooseGroupViewModel), null, null, new C1228390i4T(j, groupInviteItem, fanGroupChooseGroupViewModel, c1228410i4V, null), 3);
            }
        }
        FanGroupChooseGroupFragment fanGroupChooseGroupFragment = (FanGroupChooseGroupFragment) awS228S0300000_19.l1;
        FanGroupChooseGroupFragmentParam fanGroupChooseGroupFragmentParam = (FanGroupChooseGroupFragmentParam) awS228S0300000_19.l2;
        fanGroupChooseGroupFragment.getClass();
        String strValueOf = String.valueOf(c1225220hzM.LL);
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("enter_from", fanGroupChooseGroupFragmentParam.enterFrom);
        pairArr[1] = new Pair("conversation_id", strValueOf);
        pairArr[2] = new Pair("to_status", "show");
        FanGroupChooseGroupFragmentParam fanGroupChooseGroupFragmentParam2 = fanGroupChooseGroupFragment.LLIZ;
        if (fanGroupChooseGroupFragmentParam2 == null || (str = fanGroupChooseGroupFragmentParam2.creatorUid) == null) {
            str = "";
        }
        pairArr[3] = new Pair("is_profile_owner", C1529305yl.LIZ(Boolean.valueOf(C461720I8s.LJI(str))));
        pairArr[4] = new Pair("chat_type", "fan_group");
        C1228760i54.LIZ("ttsocial_group_chat_visibility_btn_click", pairArr, C0I0B.LJFF.LIZIZ());
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$34(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        C1243400iSg c1243400iSg = C1243400iSg.LIZ;
        C1243410iSh c1243410iSh = (C1243410iSh) awS228S0300000_19.l0;
        c1243400iSg.getClass();
        InputMethodManager inputMethodManager = null;
        C1243400iSg.LIZ(c1243410iSh, "show", null);
        ((C1748440vbG) awS228S0300000_19.l1).LJIIIZ();
        Selection.setSelection(((C1748440vbG) awS228S0300000_19.l1).getText(), ((C1748440vbG) awS228S0300000_19.l1).getEditTextLength());
        Object objH2 = C786410Ut5.H2((Context) awS228S0300000_19.l2, "input_method");
        if (objH2 instanceof InputMethodManager) {
            inputMethodManager = (InputMethodManager) objH2;
        }
        ((C1748440vbG) awS228S0300000_19.l1).LJIIJ(inputMethodManager, 1);
        return Unit.LIZ;
    }

    public static final Object invoke$35(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        int i;
        boolean z;
        String string = ((TuxTextView) awS228S0300000_19.l0).getText().toString();
        int length = string.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            if (!z2) {
                i = i2;
            } else {
                i = length;
            }
            if (Intrinsics.LJI(string.charAt(i), 32) <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z2) {
                if (!z) {
                    z2 = true;
                } else {
                    i2++;
                }
            } else {
                if (!z) {
                    break;
                }
                length--;
            }
        }
        String string2 = string.subSequence(i2, length + 1).toString();
        if (!TextUtils.isEmpty(string2) && u.LJIIZILJ(string2, " T", false)) {
            ((AccountModifyUserNameProtocol) awS228S0300000_19.l1).LJJLIIIJLJLI();
        }
        MyProfileUserIdVM myProfileUserIdVM = (MyProfileUserIdVM) awS228S0300000_19.l2;
        myProfileUserIdVM.getClass();
        myProfileUserIdVM.setState(new AwS18S0010000_3(false, 4));
        return Unit.LIZ;
    }

    public static final Object invoke$36(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        EnumC1233840iDG enumC1233840iDG;
        C1233960iDS c1233960iDS = C1233960iDS.LIZ;
        String verifyTypeFromMethod = ((TwoStepVerificationActivityAssem) awS228S0300000_19.l0).LLJJL.getVerifyTypeFromMethod(((C1233790iDB) awS228S0300000_19.l1).LIZJ);
        String enterFrom = ((TwoStepVerificationActivityAssem) awS228S0300000_19.l0).getEnterFrom();
        c1233960iDS.getClass();
        C2344009Gk c2344009GkLIZ = C1233960iDS.LIZ();
        c2344009GkLIZ.LJIIIIZZ("method_edited", C1233960iDS.LIZIZ(verifyTypeFromMethod));
        c2344009GkLIZ.LJIIIIZZ("enter_from", enterFrom);
        C20684815ws.LJIILLIIL("twosv_setup_popup_click_update", c2344009GkLIZ.LIZ);
        C1233790iDB c1233790iDB = ((C1233730iD5) awS228S0300000_19.l2).LIZ;
        if (c1233790iDB != null) {
            enumC1233840iDG = c1233790iDB.LIZJ;
        } else {
            enumC1233840iDG = null;
        }
        if (enumC1233840iDG == EnumC1233840iDG.TOTP) {
            TwoStepVerificationActivityAssem twoStepVerificationActivityAssem = (TwoStepVerificationActivityAssem) awS228S0300000_19.l0;
            C1233790iDB c1233790iDB2 = (C1233790iDB) awS228S0300000_19.l1;
            Context context = twoStepVerificationActivityAssem.getContext();
            if (context != null) {
                C1397580mTM c1397580mTM = new C1397580mTM(context);
                c1397580mTM.LJI(context.getString(2131850716));
                c1397580mTM.LIZIZ(context.getString(2131850715));
                C985403tE.LIZ(c1397580mTM, new AwS228S0300000_19(context, twoStepVerificationActivityAssem, c1233790iDB2, 39));
                new C1397510mTF(c1397580mTM).LIZLLL();
            }
        } else {
            ((TwoStepVerificationActivityAssem) awS228S0300000_19.l0).Jo().SQ2(((C1233790iDB) awS228S0300000_19.l1).LIZJ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$37(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(0, ((Context) awS228S0300000_19.l0).getString(2131857377), new AwS385S0200000_19((TwoStepVerificationActivityAssem) awS228S0300000_19.l1, (EnumC1233840iDG) awS228S0300000_19.l2, 148));
        c1397620mTQ.LIZJ(1, ((Context) awS228S0300000_19.l0).getString(2131857393), null);
        c1397620mTQ.LJFF = true;
        return Unit.LIZ;
    }

    public static final Object invoke$38(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(0, ((Context) awS228S0300000_19.l0).getString(2131857382), new AwS385S0200000_19((TwoStepVerificationActivityAssem) awS228S0300000_19.l1, (EnumC1233840iDG) awS228S0300000_19.l2, 149));
        c1397620mTQ.LIZJ(1, ((Context) awS228S0300000_19.l0).getString(2131857393), null);
        c1397620mTQ.LJFF = true;
        return Unit.LIZ;
    }

    public static final Object invoke$39(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF = true;
        c1397620mTQ.LIZJ(0, ((Context) awS228S0300000_19.l0).getString(2131857360), new AwS385S0200000_19((TwoStepVerificationActivityAssem) awS228S0300000_19.l1, (C1233790iDB) awS228S0300000_19.l2, 151));
        c1397620mTQ.LJII(2131848820, null);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        C23250099c.LIZLLL(((AuditRequestListViewModel) awS228S0300000_19.l0).getAssemVMScope(), C0PEM.LIZJ, null, new C1218860hp6((C1218060hno) obj, (AuditRequestListViewModel) awS228S0300000_19.l0, (EnumC1217990hnh) awS228S0300000_19.l1, (Context) awS228S0300000_19.l2, null), 2);
        return Unit.LIZ;
    }

    public static final Object invoke$40(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        List<MutualUser> list;
        MutualUser mutualUser;
        int iIntValue = ((Number) obj).intValue();
        ProfileHeaderRelationLabelComponent profileHeaderRelationLabelComponent = (ProfileHeaderRelationLabelComponent) awS228S0300000_19.l0;
        MatchedFriendStruct matchedFriendStruct = (MatchedFriendStruct) awS228S0300000_19.l1;
        profileHeaderRelationLabelComponent.getClass();
        MutualStruct mutualStruct = matchedFriendStruct.mMutualStruct;
        if (mutualStruct != null && (list = mutualStruct.userList) != null && (mutualUser = (MutualUser) ListProtector.get(list, iIntValue)) != null) {
            C735410St1 c735410St1 = new C735410St1();
            c735410St1.LIZLLL = "others_homepage";
            c735410St1.LJJLIIIJILLIZJL = "click_mutual_connection_name";
            c735410St1.LJJLIIJ = mutualUser.getUid();
            c735410St1.LJIILJJIL();
            C1249820id2 c1249820id2 = new C1249820id2();
            c1249820id2.LIZLLL = "others_homepage";
            c1249820id2.LJIILLIIL = "click_name";
            c1249820id2.LJIIZILJ = mutualUser.getUid();
            c1249820id2.LJIILJJIL();
            ((ProfileHeaderRelationLabelComponent) awS228S0300000_19.l0).kp(C1248720ibG.LIZ(EnumC1249830id3.HAS_RELATION_LABEL), EnumC1248370iah.BIO);
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((Context) awS228S0300000_19.l2, "aweme://user/profile/");
            smartRouteBuildRoute.withParam("uid", mutualUser.getUid());
            smartRouteBuildRoute.withParam("sec_uid", mutualUser.getSecUid());
            smartRouteBuildRoute.withParam("enter_from", "others_homepage");
            smartRouteBuildRoute.withParam("enter_method", "click_mutual_connection_name");
            smartRouteBuildRoute.open();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        return C1218060hno.LIZ((C1218060hno) obj, ((AuditRequestListViewModel) awS228S0300000_19.l0).CQ2((List) awS228S0300000_19.l1), (EnumC1217960hne) awS228S0300000_19.l2, 0, false, C13BV.INSTANCE, null, null, 100);
    }

    public static final Object invoke$6(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        return C1218060hno.LIZ((C1218060hno) obj, ((AuditRequestListViewModel) awS228S0300000_19.l0).CQ2((List) awS228S0300000_19.l1), (EnumC1217960hne) awS228S0300000_19.l2, 0, false, null, null, null, 124);
    }

    public static final Object invoke$7(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        ((InterfaceC1231480i9S) obj).LIZIZ((Context) awS228S0300000_19.l0, (C1230080i7C) awS228S0300000_19.l1, (C1230090i7D) awS228S0300000_19.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        ((InterfaceC1231480i9S) obj).LIZ((C1229390i65) awS228S0300000_19.l0, (C1229400i66) awS228S0300000_19.l1, (InterfaceC863580XuG) awS228S0300000_19.l2, null);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS228S0300000_19 awS228S0300000_19, Object obj) {
        ((InterfaceC1231480i9S) obj).LIZ((C1229390i65) awS228S0300000_19.l0, (C1229400i66) awS228S0300000_19.l1, (InterfaceC863580XuG) awS228S0300000_19.l2, null);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS228S0300000_19(com.ss.android.ugc.profile.platform.base.assemble.ProfileRootBaseComponent r3, X.C1248930ibb r4, com.ss.android.ugc.profile.platform.base.data.ProfileComponents r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 18 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.l0 = r3
            r1.l1 = r5
            r1.l2 = r4
            r0 = 1
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r3
            r1.l2 = r4
            r0 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS228S0300000_19.<init>(com.ss.android.ugc.profile.platform.base.assemble.ProfileRootBaseComponent, X.0ibb, com.ss.android.ugc.profile.platform.base.data.ProfileComponents, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS228S0300000_19(C013C c013c, C013C c013c2, FollowingItemList followingItemList, C259800zU<String> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = c013c;
        this.l1 = c013c2;
        this.l2 = followingItemList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS228S0300000_19(C0HZQ c0hzq, ChooseStyleCell chooseStyleCell, C1220920hsQ c1220920hsQ, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0hzq;
        this.l1 = c1220920hsQ;
        this.l2 = chooseStyleCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS228S0300000_19(InterfaceC1226510i1R interfaceC1226510i1R, C1228190i49 c1228190i49, Fragment fragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC1226510i1R;
        this.l1 = c1228190i49;
        this.l2 = fragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS228S0300000_19(C1228190i49 c1228190i49, C1228190i49 c1228190i492, C770770ULj c770770ULj, C259800zU<TuxSheet> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = c1228190i49;
        this.l1 = c1228190i492;
        this.l2 = c770770ULj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS228S0300000_19(C1228190i49 c1228190i49, C1228190i49 c1228190i492, Map<String, ? extends Object> map, C259800zU<TuxSheet> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = c1228190i49;
        this.l1 = c1228190i492;
        this.l2 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS228S0300000_19(C1229390i65 c1229390i65, C1229400i66 c1229400i66, InterfaceC863580XuG interfaceC863580XuG, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1229390i65;
        this.l1 = c1229400i66;
        this.l2 = interfaceC863580XuG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS228S0300000_19(C1243000iS2 c1243000iS2, Fragment fragment, StoryRevealInboxFloatingNoticePopupTask$showPopup$3$pauseDismissObserver$1 storyRevealInboxFloatingNoticePopupTask$showPopup$3$pauseDismissObserver$1, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1243000iS2;
        this.l1 = fragment;
        this.l2 = storyRevealInboxFloatingNoticePopupTask$showPopup$3$pauseDismissObserver$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS228S0300000_19(C1243410iSh c1243410iSh, C1748440vbG c1748440vbG, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1243410iSh;
        this.l1 = c1748440vbG;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS228S0300000_19(Context context, C1228470i4b c1228470i4b, AbstractC1227390i2r abstractC1227390i2r, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = c1228470i4b;
        this.l2 = abstractC1227390i2r;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS228S0300000_19(Context context, C1230080i7C c1230080i7C, C1230090i7D c1230090i7D, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = c1230080i7C;
        this.l2 = c1230090i7D;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS228S0300000_19(Context context, TwoStepVerificationActivityAssem twoStepVerificationActivityAssem, C1233790iDB c1233790iDB, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = twoStepVerificationActivityAssem;
        this.l2 = c1233790iDB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS228S0300000_19(Context context, TwoStepVerificationActivityAssem twoStepVerificationActivityAssem, EnumC1233840iDG enumC1233840iDG, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = twoStepVerificationActivityAssem;
        this.l2 = enumC1233840iDG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS228S0300000_19(Bundle bundle, GroupListFragment groupListFragment, C1228470i4b c1228470i4b, int i) {
        super(1);
        this.$t = i;
        this.l0 = bundle;
        this.l1 = groupListFragment;
        this.l2 = c1228470i4b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS228S0300000_19(View view, View view2, AwS68S0001000_19 awS68S0001000_19, int i) {
        super(1);
        this.$t = i;
        this.l0 = view;
        this.l1 = awS68S0001000_19;
        this.l2 = view2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS228S0300000_19(View view, ProfileSortPublishTabBusiness profileSortPublishTabBusiness, C1257950iq9 c1257950iq9, int i) {
        super(1);
        this.$t = i;
        this.l0 = view;
        this.l1 = profileSortPublishTabBusiness;
        this.l2 = c1257950iq9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS228S0300000_19(TuxTextView tuxTextView, AccountModifyUserNameProtocol accountModifyUserNameProtocol, MyProfileUserIdVM myProfileUserIdVM, int i) {
        super(1);
        this.$t = i;
        this.l0 = tuxTextView;
        this.l1 = accountModifyUserNameProtocol;
        this.l2 = myProfileUserIdVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS228S0300000_19(n nVar, n nVar2, NavbarBaseUIComponent<T> navbarBaseUIComponent, BizBaseData bizBaseData) {
        super(1);
        this.$t = bizBaseData;
        this.l0 = nVar;
        this.l1 = nVar2;
        this.l2 = navbarBaseUIComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS228S0300000_19(TwoStepVerificationActivityAssem twoStepVerificationActivityAssem, C1233790iDB c1233790iDB, C1233730iD5 c1233730iD5, int i) {
        super(1);
        this.$t = i;
        this.l0 = twoStepVerificationActivityAssem;
        this.l1 = c1233790iDB;
        this.l2 = c1233730iD5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS228S0300000_19(InvitePageViewModel invitePageViewModel, InvitePageViewModel invitePageViewModel2, C259800zU<EditText> c259800zU, C259800zU<C1748440vbG> c259800zU2) {
        super(1);
        this.$t = c259800zU2;
        this.l0 = invitePageViewModel;
        this.l1 = invitePageViewModel2;
        this.l2 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS228S0300000_19(ManageGroupContentAssem manageGroupContentAssem, EnumC1216640hlW enumC1216640hlW, View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = manageGroupContentAssem;
        this.l1 = enumC1216640hlW;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS228S0300000_19(CheckupRelationFollowerCell checkupRelationFollowerCell, User user, View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = checkupRelationFollowerCell;
        this.l1 = user;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS228S0300000_19(AuditRequestListViewModel auditRequestListViewModel, EnumC1217990hnh enumC1217990hnh, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = auditRequestListViewModel;
        this.l1 = enumC1217990hnh;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS228S0300000_19(AuditRequestListViewModel auditRequestListViewModel, AuditRequestListViewModel auditRequestListViewModel2, List<C1218000hni> list, EnumC1217960hne enumC1217960hne) {
        super(1);
        this.$t = enumC1217960hne;
        this.l0 = auditRequestListViewModel;
        this.l1 = auditRequestListViewModel2;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS228S0300000_19(FanGroupJoinPanelFragment fanGroupJoinPanelFragment, C1231150i8v c1231150i8v, GroupJoinResponse groupJoinResponse, int i) {
        super(1);
        this.$t = i;
        this.l0 = fanGroupJoinPanelFragment;
        this.l1 = c1231150i8v;
        this.l2 = groupJoinResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS228S0300000_19(IMSearchDetailVM iMSearchDetailVM, IMSearchDetailVM iMSearchDetailVM2, EnumC1240620iOC enumC1240620iOC, List<C1240530iO3> list) {
        super(1);
        this.$t = list;
        this.l0 = iMSearchDetailVM;
        this.l1 = iMSearchDetailVM2;
        this.l2 = enumC1240620iOC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS228S0300000_19(ProfileNgoStruct profileNgoStruct, ProfileNgoStruct profileNgoStruct2, EditProfileNGOViewModel editProfileNGOViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = profileNgoStruct;
        this.l1 = profileNgoStruct2;
        this.l2 = editProfileNGOViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS228S0300000_19(FanGroupChooseGroupViewModel fanGroupChooseGroupViewModel, FanGroupChooseGroupFragment fanGroupChooseGroupFragment, FanGroupChooseGroupFragmentParam fanGroupChooseGroupFragmentParam, int i) {
        super(1);
        this.$t = i;
        this.l0 = fanGroupChooseGroupViewModel;
        this.l1 = fanGroupChooseGroupFragment;
        this.l2 = fanGroupChooseGroupFragmentParam;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS228S0300000_19(ProfilePageMenuFragment profilePageMenuFragment, ProfilePageMenuFragment profilePageMenuFragment2, List<? extends ProfileComponents> list, View view) {
        super(1);
        this.$t = view;
        this.l0 = profilePageMenuFragment;
        this.l1 = profilePageMenuFragment2;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS228S0300000_19(ProfileMenuRootBaseComponent profileMenuRootBaseComponent, ProfileComponents profileComponents, C1248930ibb c1248930ibb, int i) {
        super(1);
        this.$t = i;
        this.l0 = profileMenuRootBaseComponent;
        this.l1 = profileComponents;
        this.l2 = c1248930ibb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS228S0300000_19(ProfileHeaderRelationLabelComponent profileHeaderRelationLabelComponent, MatchedFriendStruct matchedFriendStruct, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = profileHeaderRelationLabelComponent;
        this.l1 = matchedFriendStruct;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS228S0300000_19(SchoolGroupsListViewModel schoolGroupsListViewModel, C1007450cK7 c1007450cK7, C2252611DEt c2252611DEt, int i) {
        super(1);
        this.$t = i;
        this.l0 = schoolGroupsListViewModel;
        this.l1 = c1007450cK7;
        this.l2 = c2252611DEt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS228S0300000_19(SchoolUsersListViewModel schoolUsersListViewModel, C2252611DEt c2252611DEt, C1245920iWk c1245920iWk, int i) {
        super(1);
        this.$t = i;
        this.l0 = schoolUsersListViewModel;
        this.l1 = c2252611DEt;
        this.l2 = c1245920iWk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS228S0300000_19(ProfileUser profileUser, User user, EnumC1251790igD enumC1251790igD, int i) {
        super(1);
        this.$t = i;
        this.l0 = profileUser;
        this.l1 = user;
        this.l2 = enumC1251790igD;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS228S0300000_19(List list, List<C1216760hli> list2, ManageGroupContentAssem manageGroupContentAssem, View view) {
        super(1);
        this.$t = view;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = manageGroupContentAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS228S0300000_19(List list, List<? extends Aweme> list2, List<UpvoteList> list3, RepostListViewModel repostListViewModel) {
        super(1);
        this.$t = repostListViewModel;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = list3;
    }
}
