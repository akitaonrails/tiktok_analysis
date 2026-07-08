package kotlin.jvm.internal;

import X.C05P0;
import X.C05P1;
import X.C09AY;
import X.C0LAB;
import X.C0XZJ;
import X.C0Z5B;
import X.C1075830e6P;
import X.C1211730hdb;
import X.C1214260hhg;
import X.C1215810hkB;
import X.C1229780i6i;
import X.C1230060i7A;
import X.C1230320i7a;
import X.C1234860iEu;
import X.C1236480iHW;
import X.C1238240iKM;
import X.C1238760iLC;
import X.C1238980iLY;
import X.C1245080iVO;
import X.C1246870iYH;
import X.C1248430ian;
import X.C1250680ieQ;
import X.C1257270ip3;
import X.C1262310ixB;
import X.C1263670izN;
import X.C1265420j2C;
import X.C127K;
import X.C13BV;
import X.C13LP;
import X.C1403110mcH;
import X.C1436405jm;
import X.C1440005kM;
import X.C1533950q1J;
import X.C1558420qem;
import X.C1558520qew;
import X.C1651206dK;
import X.C1669520tXy;
import X.C1900300zYC;
import X.C1910890zpH;
import X.C19323610io;
import X.C197039127h;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C291001Au;
import X.C343950De5;
import X.C626160OhC;
import X.C627260Oiy;
import X.C786410Ut5;
import X.EnumC1216830hlp;
import X.EnumC1229960i70;
import X.EnumC1234850iEt;
import X.EnumC1248480ias;
import X.EnumC1392960mLu;
import X.InterfaceC1214250hhf;
import X.InterfaceC1222510huz;
import X.InterfaceC1229620i6S;
import X.InterfaceC1234930iF1;
import X.InterfaceC1265060j1c;
import X.InterfaceC1891350zJl;
import Y.ACListenerS154S0100000_19;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.account.login.auth.ui.login.SmsInputViewModel;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.viewmodel.ManageGroupViewModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.invitation.newdesign.vm.GroupInvitationVM;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.publicgroup.data.GroupAccessCriteria;
import com.ss.android.ugc.aweme.publicgroup.data.GroupAccessCriteriaCollection;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.photo.text.photoboost.PhotoModeBoostedFeedbackResponse;
import com.ss.android.ugc.profile.business.profile.BioProfileLinkComponent;
import com.ss.android.ugc.profile.business.profile.biolink.BioStructuralLinkProtocol;
import com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcProgressAssem;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.states.FollowerRelationState;
import com.ss.android.ugc.profile.business.ur.school.datasource.CampusGroup;
import com.ss.android.ugc.profile.business.ur.school.datasource.GroupSectionInfo;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolgroups.SchoolGroupsListViewModel;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.base.IBioUserMailLinkAbility;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AwS133S1100000_19 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public String s0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS133S1100000_19 awS133S1100000_19, Object obj) {
        ((Function0) awS133S1100000_19.l1).invoke();
        C1250680ieQ c1250680ieQ = C1250680ieQ.LIZ;
        String str = awS133S1100000_19.s0;
        c1250680ieQ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, "select_from_phone");
        c2344009Gk.LJIIIIZZ("enter_from", str);
        C20684815ws.LJIILLIIL("ttinfra_profile_background_setting_click", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS133S1100000_19 awS133S1100000_19, Object obj) {
        ((Function0) awS133S1100000_19.l1).invoke();
        C1250680ieQ c1250680ieQ = C1250680ieQ.LIZ;
        String str = awS133S1100000_19.s0;
        c1250680ieQ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, "select_from_post");
        c2344009Gk.LJIIIIZZ("enter_from", str);
        C20684815ws.LJIILLIIL("ttinfra_profile_background_setting_click", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$10(AwS133S1100000_19 awS133S1100000_19, Object obj) {
        String uid;
        UserProfileInfo userProfileInfo;
        C291001Au c291001Au = (C291001Au) obj;
        if (c291001Au != null) {
            Boolean boolValueOf = Boolean.valueOf(((Boolean) c291001Au.LIZ).booleanValue());
            BioProfileLinkComponent bioProfileLinkComponent = (BioProfileLinkComponent) awS133S1100000_19.l1;
            String str = awS133S1100000_19.s0;
            if (!boolValueOf.booleanValue()) {
                if (!bioProfileLinkComponent.LLJLLL) {
                    bioProfileLinkComponent.LLJLLL = true;
                    IBioUserMailLinkAbility iBioUserMailLinkAbility = (IBioUserMailLinkAbility) C1558520qew.LIZ(C1558520qew.LJIIL(bioProfileLinkComponent), IBioUserMailLinkAbility.class, null);
                    if (iBioUserMailLinkAbility != null) {
                        String enterFrom = bioProfileLinkComponent.getEnterFrom();
                        ProfileCommonInfo profileCommonInfoVo = bioProfileLinkComponent.Vo();
                        if (profileCommonInfoVo == null || (userProfileInfo = profileCommonInfoVo.getUserProfileInfo()) == null || (uid = userProfileInfo.getUid()) == null) {
                            uid = "";
                        }
                        if (str == null) {
                            str = "";
                        }
                        iBioUserMailLinkAbility.Pi1(enterFrom, "weblink", uid, str);
                    }
                }
            } else {
                bioProfileLinkComponent.LLJLLL = false;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS133S1100000_19 awS133S1100000_19, Object obj) {
        String uid;
        UserProfileInfo userProfileInfo;
        if (((Boolean) obj).booleanValue()) {
            BioProfileLinkComponent bioProfileLinkComponent = (BioProfileLinkComponent) awS133S1100000_19.l1;
            if (!bioProfileLinkComponent.LLJLLL) {
                bioProfileLinkComponent.LLJLLL = true;
                IBioUserMailLinkAbility iBioUserMailLinkAbility = (IBioUserMailLinkAbility) C1558520qew.LIZ(C1558520qew.LJIIL((BioProfileLinkComponent) awS133S1100000_19.l1), IBioUserMailLinkAbility.class, null);
                if (iBioUserMailLinkAbility != null) {
                    String enterFrom = ((BioProfileLinkComponent) awS133S1100000_19.l1).getEnterFrom();
                    ProfileCommonInfo profileCommonInfoVo = ((BioProfileLinkComponent) awS133S1100000_19.l1).Vo();
                    String str = "";
                    if (profileCommonInfoVo == null || (userProfileInfo = profileCommonInfoVo.getUserProfileInfo()) == null || (uid = userProfileInfo.getUid()) == null) {
                        uid = "";
                    }
                    String str2 = awS133S1100000_19.s0;
                    if (str2 != null) {
                        str = str2;
                    }
                    iBioUserMailLinkAbility.Pi1(enterFrom, "weblink", uid, str);
                }
            }
        } else {
            ((BioProfileLinkComponent) awS133S1100000_19.l1).LLJLLL = false;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$12(AwS133S1100000_19 awS133S1100000_19, Object obj) {
        String uid;
        UserProfileInfo userProfileInfo;
        C291001Au c291001Au = (C291001Au) obj;
        if (c291001Au != null) {
            Boolean boolValueOf = Boolean.valueOf(((Boolean) c291001Au.LIZ).booleanValue());
            BioStructuralLinkProtocol bioStructuralLinkProtocol = (BioStructuralLinkProtocol) awS133S1100000_19.l1;
            String str = awS133S1100000_19.s0;
            if (!boolValueOf.booleanValue()) {
                if (!bioStructuralLinkProtocol.LLJJJJ) {
                    bioStructuralLinkProtocol.LLJJJJ = true;
                    IBioUserMailLinkAbility iBioUserMailLinkAbility = (IBioUserMailLinkAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(bioStructuralLinkProtocol), IBioUserMailLinkAbility.class, null);
                    if (iBioUserMailLinkAbility != null) {
                        String str2 = bioStructuralLinkProtocol.LLJJIJIL;
                        if (str2 == null) {
                            str2 = "";
                        }
                        ProfileCommonInfo profileCommonInfoLJIILIIL = bioStructuralLinkProtocol.LJIILIIL();
                        if (profileCommonInfoLJIILIIL == null || (userProfileInfo = profileCommonInfoLJIILIIL.getUserProfileInfo()) == null || (uid = userProfileInfo.getUid()) == null) {
                            uid = "";
                        }
                        if (str == null) {
                            str = "";
                        }
                        iBioUserMailLinkAbility.Pi1(str2, "weblink", uid, str);
                    }
                }
            } else {
                bioStructuralLinkProtocol.LLJJJJ = false;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS133S1100000_19 awS133S1100000_19, Object obj) {
        String uid;
        UserProfileInfo userProfileInfo;
        if (((Boolean) obj).booleanValue()) {
            BioStructuralLinkProtocol bioStructuralLinkProtocol = (BioStructuralLinkProtocol) awS133S1100000_19.l1;
            if (!bioStructuralLinkProtocol.LLJJJJ) {
                bioStructuralLinkProtocol.LLJJJJ = true;
                IBioUserMailLinkAbility iBioUserMailLinkAbility = (IBioUserMailLinkAbility) C1558520qew.LIZ(C1558420qem.LIZIZ((BioStructuralLinkProtocol) awS133S1100000_19.l1), IBioUserMailLinkAbility.class, null);
                if (iBioUserMailLinkAbility != null) {
                    BioStructuralLinkProtocol bioStructuralLinkProtocol2 = (BioStructuralLinkProtocol) awS133S1100000_19.l1;
                    String str = bioStructuralLinkProtocol2.LLJJIJIL;
                    String str2 = "";
                    if (str == null) {
                        str = "";
                    }
                    ProfileCommonInfo profileCommonInfoLJIILIIL = bioStructuralLinkProtocol2.LJIILIIL();
                    if (profileCommonInfoLJIILIIL == null || (userProfileInfo = profileCommonInfoLJIILIIL.getUserProfileInfo()) == null || (uid = userProfileInfo.getUid()) == null) {
                        uid = "";
                    }
                    String str3 = awS133S1100000_19.s0;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    iBioUserMailLinkAbility.Pi1(str, "weblink", uid, str2);
                }
            }
        } else {
            ((BioStructuralLinkProtocol) awS133S1100000_19.l1).LLJJJJ = false;
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$14(AwS133S1100000_19 awS133S1100000_19, Object obj) {
        C197039127h c197039127h = (C197039127h) obj;
        c197039127h.setText(awS133S1100000_19.s0);
        C786410Ut5.U8(c197039127h, new ACListenerS154S0100000_19((Function0) awS133S1100000_19.l1, 152));
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS133S1100000_19 awS133S1100000_19, Object obj) {
        Integer numValueOf;
        Object next;
        C1214260hhg c1214260hhg;
        C1236480iHW c1236480iHW = (C1236480iHW) obj;
        c1236480iHW.getClass();
        List<InterfaceC1214250hhf> list = c1236480iHW.getListState().LLILZ;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list);
            String str = awS133S1100000_19.s0;
            Iterator it2 = arrayList.iterator();
            while (true) {
                numValueOf = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    InterfaceC1214250hhf interfaceC1214250hhf = (InterfaceC1214250hhf) next;
                    if ((interfaceC1214250hhf instanceof C1214260hhg) && Intrinsics.LJFF(((C1214260hhg) interfaceC1214250hhf).LL.conversationId, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            InterfaceC1214250hhf interfaceC1214250hhf2 = (InterfaceC1214250hhf) next;
            if ((interfaceC1214250hhf2 instanceof C1214260hhg) && (c1214260hhg = (C1214260hhg) interfaceC1214250hhf2) != null) {
                SchoolGroupsListViewModel schoolGroupsListViewModel = (SchoolGroupsListViewModel) awS133S1100000_19.l1;
                C1910890zpH logger = schoolGroupsListViewModel.getLogger();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("user joined group: ");
                C1214260hhg c1214260hhg2 = (C1214260hhg) interfaceC1214250hhf2;
                sbLIZ.append(c1214260hhg2.LL.groupName);
                logger.LIZ("SchoolGroupsListViewModel", C2188811AlT.LIZIZ(sbLIZ));
                arrayList.remove(c1214260hhg);
                CampusGroup campusGroup = c1214260hhg2.LL;
                campusGroup.setVerifyStatus(Integer.valueOf(EnumC1229960i70.IN_GROUP.getValue()));
                Integer num = campusGroup.groupMemberCount;
                if (num != null) {
                    numValueOf = Integer.valueOf(num.intValue() + 1);
                }
                campusGroup.setGroupMemberCount(numValueOf);
                schoolGroupsListViewModel.vQ2(arrayList, c1214260hhg, c1236480iHW, true);
                schoolGroupsListViewModel.listSetItems(arrayList);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS133S1100000_19 awS133S1100000_19, Object obj) {
        Object next;
        C1236480iHW c1236480iHW = (C1236480iHW) obj;
        c1236480iHW.getClass();
        List<InterfaceC1214250hhf> list = c1236480iHW.getListState().LLILZ;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list);
            String str = awS133S1100000_19.s0;
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    InterfaceC1214250hhf interfaceC1214250hhf = (InterfaceC1214250hhf) next;
                    if ((interfaceC1214250hhf instanceof C1214260hhg) && Intrinsics.LJFF(((C1214260hhg) interfaceC1214250hhf).LL.conversationId, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            InterfaceC1214250hhf interfaceC1214250hhf2 = (InterfaceC1214250hhf) next;
            if (interfaceC1214250hhf2 instanceof C1214260hhg) {
                C1214260hhg c1214260hhg = (C1214260hhg) interfaceC1214250hhf2;
                if (C1234860iEu.LIZ(c1214260hhg.LL) != EnumC1234850iEt.MY_GROUPS) {
                    Integer num = c1214260hhg.LL.verifyStatus;
                    int value = EnumC1229960i70.REQUEST_PENDING_APPROVAL.getValue();
                    if (num != null && num.intValue() == value) {
                        SchoolGroupsListViewModel schoolGroupsListViewModel = (SchoolGroupsListViewModel) awS133S1100000_19.l1;
                        String str2 = awS133S1100000_19.s0;
                        schoolGroupsListViewModel.getLogger().LIZ("SchoolGroupsListViewModel", "handle join group");
                        schoolGroupsListViewModel.withState(new AwS133S1100000_19(schoolGroupsListViewModel, str2, 15));
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS133S1100000_19 awS133S1100000_19, Object obj) {
        C1236480iHW c1236480iHW = (C1236480iHW) obj;
        c1236480iHW.getClass();
        List listLIZ = C627260Oiy.LIZ(c1236480iHW);
        if (listLIZ != null) {
            ArrayList arrayList = new ArrayList(listLIZ);
            String str = awS133S1100000_19.s0;
            Iterator it2 = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                InterfaceC1214250hhf interfaceC1214250hhf = (InterfaceC1214250hhf) it2.next();
                if ((interfaceC1214250hhf instanceof C1214260hhg) && Intrinsics.LJFF(((C1214260hhg) interfaceC1214250hhf).LL.conversationId, str)) {
                    if (i != -1) {
                        ListProtector.remove(arrayList, i);
                        ((SchoolGroupsListViewModel) awS133S1100000_19.l1).zQ2(arrayList, c1236480iHW, EnumC1234850iEt.MY_GROUPS);
                        ((SchoolGroupsListViewModel) awS133S1100000_19.l1).listSetItems(arrayList);
                        GroupSectionInfo groupSectionInfo = c1236480iHW.LLILZIL;
                        if (groupSectionInfo != null) {
                            ((SchoolGroupsListViewModel) awS133S1100000_19.l1).setState(new AwS598S0100000_19(groupSectionInfo, 531));
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS133S1100000_19 awS133S1100000_19, Object obj) {
        Integer numValueOf;
        C626160OhC c626160OhCLIZ;
        C1236480iHW c1236480iHW = (C1236480iHW) obj;
        c1236480iHW.getClass();
        List listLIZ = C627260Oiy.LIZ(c1236480iHW);
        if (listLIZ != null) {
            ArrayList arrayList = new ArrayList(listLIZ);
            String str = awS133S1100000_19.s0;
            Iterator it2 = arrayList.iterator();
            int i = 0;
            while (true) {
                int i2 = -1;
                if (!it2.hasNext()) {
                    break;
                }
                InterfaceC1214250hhf interfaceC1214250hhf = (InterfaceC1214250hhf) it2.next();
                if ((interfaceC1214250hhf instanceof C1214260hhg) && Intrinsics.LJFF(((C1214260hhg) interfaceC1214250hhf).LL.conversationId, str)) {
                    if (i != -1) {
                        C1214260hhg c1214260hhg = (C1214260hhg) ListProtector.get(arrayList, i);
                        ListProtector.remove(arrayList, i);
                        Iterator it3 = arrayList.iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            InterfaceC1214250hhf interfaceC1214250hhf2 = (InterfaceC1214250hhf) it3.next();
                            if ((interfaceC1214250hhf2 instanceof C1214260hhg) && C1234860iEu.LIZ(((C1214260hhg) interfaceC1214250hhf2).LL) == EnumC1234850iEt.EXPLORE) {
                                i2 = i3;
                                break;
                            }
                            i3++;
                        }
                        CampusGroup campusGroup = c1214260hhg.LL;
                        C1910890zpH logger = ((SchoolGroupsListViewModel) awS133S1100000_19.l1).getLogger();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("update verify status: ");
                        sbLIZ.append(campusGroup.groupName);
                        logger.LIZ("SchoolGroupsListViewModel", C2188811AlT.LIZIZ(sbLIZ));
                        campusGroup.setVerifyStatus(Integer.valueOf(EnumC1229960i70.CAN_JOIN.getValue()));
                        Integer num = campusGroup.groupMemberCount;
                        if (num != null) {
                            numValueOf = Integer.valueOf(num.intValue() - 1);
                        } else {
                            numValueOf = null;
                        }
                        campusGroup.setGroupMemberCount(numValueOf);
                        if (i2 >= 0) {
                            ListProtector.add(arrayList, i2, c1214260hhg);
                        } else {
                            C626160OhC c626160OhCLIZ2 = c1236480iHW.LL.LLILLJJLI.LIZ();
                            if ((c626160OhCLIZ2 != null && !c626160OhCLIZ2.LIZIZ) || ((c626160OhCLIZ = c1236480iHW.LL.LL.LIZ()) != null && !c626160OhCLIZ.LIZIZ)) {
                                arrayList.add(c1214260hhg);
                            }
                        }
                        ((SchoolGroupsListViewModel) awS133S1100000_19.l1).zQ2(arrayList, c1236480iHW, EnumC1234850iEt.MY_GROUPS);
                        ((SchoolGroupsListViewModel) awS133S1100000_19.l1).wQ2(arrayList, c1236480iHW, EnumC1234850iEt.EXPLORE);
                        ((SchoolGroupsListViewModel) awS133S1100000_19.l1).listSetItems(arrayList);
                        GroupSectionInfo groupSectionInfo = c1236480iHW.LLILZIL;
                        if (groupSectionInfo != null) {
                            ((SchoolGroupsListViewModel) awS133S1100000_19.l1).setState(new AwS598S0100000_19(groupSectionInfo, 532));
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS133S1100000_19 awS133S1100000_19, Object obj) {
        String str;
        String str2;
        if (((Number) obj).intValue() == 0) {
            C1257270ip3.LIZ.getClass();
            C1211730hdb c1211730hdb = C1257270ip3.LIZJ;
            int i = c1211730hdb.LIZ().getInt(C1211730hdb.LIZIZ("pb_uid_no_click_count", "global"), 0) + 1;
            c1211730hdb.LIZ().storeInt(C1211730hdb.LIZIZ("pb_uid_no_click_count", "global"), i);
            if (i >= C1257270ip3.LIZ().noClickExitThreshold) {
                c1211730hdb.LIZ().storeLong(C1211730hdb.LIZIZ("pb_uid_exit_until", "global"), System.currentTimeMillis() + (C1257270ip3.LIZ().exitDays * 86400000));
            }
        } else {
            C1257270ip3 c1257270ip3 = C1257270ip3.LIZ;
            String str3 = awS133S1100000_19.s0;
            c1257270ip3.getClass();
            C1211730hdb c1211730hdb2 = C1257270ip3.LIZJ;
            c1211730hdb2.LIZ().storeBoolean(C1211730hdb.LIZIZ("pb_uid_aid_exit_forever", str3), true);
            c1211730hdb2.LIZ().storeInt(C1211730hdb.LIZIZ("pb_uid_exit_forever", "global"), c1211730hdb2.LIZ().getInt(C1211730hdb.LIZIZ("pb_uid_exit_forever", "global"), 0) + 1);
            PhotoModeBoostedFeedbackResponse photoModeBoostedFeedbackResponse = (PhotoModeBoostedFeedbackResponse) awS133S1100000_19.l1;
            C0LAB c0lab = new C0LAB();
            String str4 = null;
            if (photoModeBoostedFeedbackResponse != null) {
                str4 = photoModeBoostedFeedbackResponse.itemId;
                str = photoModeBoostedFeedbackResponse.hotRequestCount;
                str2 = photoModeBoostedFeedbackResponse.photoQueueHotRequestCnt;
            } else {
                str = null;
                str2 = null;
            }
            C1403110mcH.LIZIZ(c0lab, "personal_video_cover_page", str4, str, str2, "click", "click_more");
            C20684815ws.LJIILLIIL("info_photo_boosted_banner", c0lab.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS133S1100000_19 awS133S1100000_19, Object obj) {
        ((InterfaceC1234930iF1) awS133S1100000_19.l1).e4(awS133S1100000_19.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS133S1100000_19 awS133S1100000_19, Object obj) {
        return C19323610io.LJJIJL((C19323610io) obj, null, null, false, (View) awS133S1100000_19.l1, null, false, false, awS133S1100000_19.s0, false, false, null, false, false, 16773087);
    }

    public static final Object invoke$21(AwS133S1100000_19 awS133S1100000_19, Object obj) {
        C1262310ixB c1262310ixB = (C1262310ixB) obj;
        c1262310ixB.LIZ(AFwS257S0000000_19.get$arr$(553));
        new AwS70S1000000_19(awS133S1100000_19.s0, 14).invoke(c1262310ixB.LJ);
        new AwS598S0100000_19((C1075830e6P) awS133S1100000_19.l1, 518).invoke(c1262310ixB.LIZLLL);
        c1262310ixB.LIZLLL(AFwS257S0000000_19.get$arr$(554));
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS133S1100000_19 awS133S1100000_19, Object obj) {
        Map<Integer, String> profileLinksMap;
        String str = (String) obj;
        User user = ((ProfileEditFragment) awS133S1100000_19.l1).LLLLLLZ;
        C127K c127k = null;
        if (user == null) {
            user = null;
        }
        user.setLemon8UserName(str);
        ProfileEditFragment profileEditFragment = (ProfileEditFragment) awS133S1100000_19.l1;
        C127K c127k2 = profileEditFragment.LLLFF;
        if (c127k2 != null) {
            c127k = c127k2;
        }
        profileEditFragment.pT(c127k, str, true);
        Map<Integer, Function1<String, Unit>> map = ((ProfileEditFragment) awS133S1100000_19.l1).LLLLIILL;
        EnumC1216830hlp enumC1216830hlp = EnumC1216830hlp.LEMON8;
        Function1 function1 = (Function1) ((LinkedHashMap) map).get(Integer.valueOf(enumC1216830hlp.getType()));
        if (function1 != null) {
            function1.invoke(str);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lemon8-app.com/");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        User user2 = ((ProfileEditFragment) awS133S1100000_19.l1).getUser();
        if (user2 != null && (profileLinksMap = user2.getProfileLinksMap()) != null) {
            profileLinksMap.put(Integer.valueOf(enumC1216830hlp.getType()), strLIZIZ);
        }
        ((ProfileEditFragment) awS133S1100000_19.l1).UR(false);
        C1440005kM.LIZ(new C1436405jm(false));
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("platform", "lemon8");
        c2344009Gk.LJIIIIZZ("enter_from", awS133S1100000_19.s0);
        C20684815ws.LJIILLIIL("social_account_bind_success", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS133S1100000_19 awS133S1100000_19, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C1230060i7A c1230060i7A = (C1230060i7A) awS133S1100000_19.l1;
            InterfaceC1229620i6S interfaceC1229620i6S = c1230060i7A.LJIIJJI;
            if (interfaceC1229620i6S != null) {
                interfaceC1229620i6S.LIZIZ(c1230060i7A.LJI);
            }
        } else {
            C1229780i6i.LIZ(((C1230060i7A) awS133S1100000_19.l1).LJIIIZ, awS133S1100000_19.s0);
            InterfaceC1229620i6S interfaceC1229620i6S2 = ((C1230060i7A) awS133S1100000_19.l1).LJIIJJI;
            if (interfaceC1229620i6S2 != null) {
                interfaceC1229620i6S2.LIZ(null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS133S1100000_19 awS133S1100000_19, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            InterfaceC1229620i6S interfaceC1229620i6S = ((C1230060i7A) awS133S1100000_19.l1).LJIIJJI;
            if (interfaceC1229620i6S != null) {
                interfaceC1229620i6S.LIZIZ(awS133S1100000_19.s0);
            }
        } else {
            InterfaceC1229620i6S interfaceC1229620i6S2 = ((C1230060i7A) awS133S1100000_19.l1).LJIIJJI;
            if (interfaceC1229620i6S2 != null) {
                interfaceC1229620i6S2.LIZ(null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS133S1100000_19 awS133S1100000_19, Object obj) {
        FollowerRelationState followerRelationState = (FollowerRelationState) obj;
        List<InterfaceC1891350zJl> listCZ0 = ((InterfaceC1265060j1c) awS133S1100000_19.l1).CZ0(followerRelationState);
        String str = awS133S1100000_19.s0;
        Iterator<InterfaceC1891350zJl> it2 = listCZ0.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            InterfaceC1891350zJl next = it2.next();
            if ((next instanceof C1265420j2C) && Intrinsics.LJFF(((C1265420j2C) next).LLILLJJLI.getUid(), str)) {
                if (i != -1) {
                    ArrayList arrayList = new ArrayList(((InterfaceC1265060j1c) awS133S1100000_19.l1).CZ0(followerRelationState));
                    ListProtector.remove(arrayList, i);
                    ((InterfaceC1265060j1c) awS133S1100000_19.l1).Oc0(arrayList);
                }
            } else {
                i++;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS133S1100000_19 awS133S1100000_19, Object obj) {
        C1248430ian c1248430ian = (C1248430ian) obj;
        String str = awS133S1100000_19.s0;
        if (str == null) {
            str = c1248430ian.LL;
        }
        List list = (List) awS133S1100000_19.l1;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        return C1248430ian.LIZ(c1248430ian, str, list, null, "", null, "", EnumC1248480ias.ORIGINAL, true, 4);
    }

    public static final Object invoke$27(AwS133S1100000_19 awS133S1100000_19, Object obj) {
        ProfileAigcProgressAssem profileAigcProgressAssem = (ProfileAigcProgressAssem) awS133S1100000_19.l1;
        profileAigcProgressAssem.Zo(awS133S1100000_19.s0, profileAigcProgressAssem.Go((List) obj));
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS133S1100000_19 awS133S1100000_19, Object obj) {
        ProfileAigcProgressAssem profileAigcProgressAssem = (ProfileAigcProgressAssem) awS133S1100000_19.l1;
        profileAigcProgressAssem.ap(awS133S1100000_19.s0, profileAigcProgressAssem.Go((List) obj));
        return Unit.LIZ;
    }

    public static final Object invoke$29(AwS133S1100000_19 awS133S1100000_19, Object obj) {
        return C1215810hkB.LIZ((C1215810hkB) obj, awS133S1100000_19.s0, (List) awS133S1100000_19.l1, (int) (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), false, 8);
    }

    public static final Object invoke$3(AwS133S1100000_19 awS133S1100000_19, Object obj) {
        return C1651206dK.LIZ((C1651206dK) obj, ((GroupAccessCriteriaCollection) awS133S1100000_19.l1).selectedAccessCriteria, awS133S1100000_19.s0, false, null, 0, false, 0, null, false, false, false, false, null, null, 524281);
    }

    public static final Object invoke$30(AwS133S1100000_19 awS133S1100000_19, Object obj) {
        return C19323610io.LJJIJL(((C1238760iLC) awS133S1100000_19.l1).LIZIZ(), null, null, false, null, awS133S1100000_19.s0, false, false, null, false, false, null, false, false, 16777087);
    }

    public static final Object invoke$31(AwS133S1100000_19 awS133S1100000_19, Object obj) {
        return C19323610io.LJJIJL(((C1238760iLC) awS133S1100000_19.l1).LIZIZ(), null, null, false, null, null, false, false, awS133S1100000_19.s0, false, false, null, false, false, 16773119);
    }

    public static final Object invoke$32(AwS133S1100000_19 awS133S1100000_19, Object obj) {
        C1238240iKM c1238240iKM;
        View view = (View) obj;
        if ((view instanceof C1238240iKM) && (c1238240iKM = (C1238240iKM) view) != null) {
            String str = awS133S1100000_19.s0;
            C05P1 c05p1 = (C05P1) awS133S1100000_19.l1;
            if (C1533950q1J.LJ(C1669520tXy.LIZJ(c05p1).LIZJ)) {
                if (Intrinsics.LJFF(((C1238980iLY) c05p1.getValue()).LIZJ, str)) {
                    c1238240iKM.setValidationStatus(3);
                }
                c1238240iKM.LIZJ(((C1238980iLY) c05p1.getValue()).LIZJ);
            } else {
                c1238240iKM.LIZ();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$33(AwS133S1100000_19 awS133S1100000_19, Object obj) {
        String errorMsg;
        C0XZJ c0xzj = (C0XZJ) obj;
        String errorMsg2 = c0xzj.getErrorMsg();
        if (errorMsg2 != null && errorMsg2.length() != 0) {
            errorMsg = c0xzj.getErrorMsg();
        } else {
            errorMsg = awS133S1100000_19.s0;
        }
        ((SmsInputViewModel) awS133S1100000_19.l1).vQ2(errorMsg);
        return Unit.LIZ;
    }

    public static final Object invoke$34(AwS133S1100000_19 awS133S1100000_19, Object obj) {
        String errorMsg;
        C0XZJ c0xzj = (C0XZJ) obj;
        String errorMsg2 = c0xzj.getErrorMsg();
        if (errorMsg2 != null && errorMsg2.length() != 0) {
            errorMsg = c0xzj.getErrorMsg();
        } else {
            errorMsg = awS133S1100000_19.s0;
        }
        ((SmsInputViewModel) awS133S1100000_19.l1).vQ2(errorMsg);
        return Unit.LIZ;
    }

    public static final Object invoke$35(AwS133S1100000_19 awS133S1100000_19, Object obj) {
        String errorMsg;
        C0XZJ c0xzj = (C0XZJ) obj;
        String errorMsg2 = c0xzj.getErrorMsg();
        if (errorMsg2 != null && errorMsg2.length() != 0) {
            errorMsg = c0xzj.getErrorMsg();
        } else {
            errorMsg = awS133S1100000_19.s0;
        }
        ((SmsInputViewModel) awS133S1100000_19.l1).vQ2(errorMsg);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS133S1100000_19 awS133S1100000_19, Object obj) {
        boolean z;
        C1651206dK c1651206dK = (C1651206dK) obj;
        GroupAccessCriteria groupAccessCriteria = (GroupAccessCriteria) C13LP.LJJJLL(((ManageGroupViewModel) awS133S1100000_19.l1).zQ2().LIZJ(((ManageGroupViewModel) awS133S1100000_19.l1).xQ2()));
        boolean zLJIIIZ = ((ManageGroupViewModel) awS133S1100000_19.l1).zQ2().LJIIIZ(((ManageGroupViewModel) awS133S1100000_19.l1).xQ2());
        String strLJFF = ((ManageGroupViewModel) awS133S1100000_19.l1).zQ2().LJFF(((ManageGroupViewModel) awS133S1100000_19.l1).xQ2());
        boolean zLJ = ((ManageGroupViewModel) awS133S1100000_19.l1).zQ2().LJ(((ManageGroupViewModel) awS133S1100000_19.l1).xQ2());
        int iVQ2 = ((ManageGroupViewModel) awS133S1100000_19.l1).vQ2();
        boolean zLJIIIIZZ = ((ManageGroupViewModel) awS133S1100000_19.l1).zQ2().LJIIIIZZ(((ManageGroupViewModel) awS133S1100000_19.l1).xQ2());
        if (((ManageGroupViewModel) awS133S1100000_19.l1).zQ2().LIZLLL(((ManageGroupViewModel) awS133S1100000_19.l1).xQ2(), awS133S1100000_19.s0) == C0Z5B.ENABLED) {
            z = true;
        } else {
            z = false;
        }
        InterfaceC1222510huz interfaceC1222510huzZQ2 = ((ManageGroupViewModel) awS133S1100000_19.l1).zQ2();
        String strXQ2 = ((ManageGroupViewModel) awS133S1100000_19.l1).xQ2();
        String str = "";
        if (strXQ2 == null) {
            strXQ2 = "";
        }
        boolean zLIZ = interfaceC1222510huzZQ2.LIZ(strXQ2);
        InterfaceC1222510huz interfaceC1222510huzZQ22 = ((ManageGroupViewModel) awS133S1100000_19.l1).zQ2();
        String strXQ22 = ((ManageGroupViewModel) awS133S1100000_19.l1).xQ2();
        if (strXQ22 != null) {
            str = strXQ22;
        }
        return C1651206dK.LIZ(c1651206dK, groupAccessCriteria, null, zLJIIIZ, strLJFF, 0, zLJ, iVQ2, awS133S1100000_19.s0, zLJIIIIZZ, z, interfaceC1222510huzZQ22.LIZIZ(str), zLIZ, null, null, 491725);
    }

    public static final Object invoke$5(AwS133S1100000_19 awS133S1100000_19, Object obj) {
        boolean z;
        C1246870iYH c1246870iYH = (C1246870iYH) obj;
        if (Intrinsics.LJFF(c1246870iYH.LIZ, awS133S1100000_19.s0) && c1246870iYH.LIZIZ == ((EnumC1392960mLu) awS133S1100000_19.l1)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$6(AwS133S1100000_19 awS133S1100000_19, Object obj) {
        return C1900300zYC.LIZ((C1900300zYC) obj, null, null, null, null, new C291001Au(new C1245080iVO(Boolean.valueOf(((MusNotice) awS133S1100000_19.l1).hasRead), true, awS133S1100000_19.s0, null, 4)), null, null, null, 239);
    }

    public static final Object invoke$7(AwS133S1100000_19 awS133S1100000_19, Object obj) {
        return C1900300zYC.LIZ((C1900300zYC) obj, null, null, null, null, new C291001Au(new C1245080iVO(Boolean.valueOf(((FollowRequestData) awS133S1100000_19.l1).hasRead), true, null, awS133S1100000_19.s0, 2)), null, null, null, 239);
    }

    public static final Object invoke$8(AwS133S1100000_19 awS133S1100000_19, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((GroupInvitationVM) awS133S1100000_19.l1).xQ2(new C1230320i7a(awS133S1100000_19.s0));
        } else {
            ((GroupInvitationVM) awS133S1100000_19.l1).xQ2(new C343950De5() { // from class: X.0i7Z
            });
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS133S1100000_19 awS133S1100000_19, Object obj) {
        return C1263670izN.LIZ((C1263670izN) obj, 0, null, null, null, null, awS133S1100000_19.s0, (List) awS133S1100000_19.l1, null, null, 0, 927);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS133S1100000_19(com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolgroups.SchoolGroupsListViewModel r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 15 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.l1 = r3
            r1.s0 = r4
            r0 = 1
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.s0 = r4
            r1.l1 = r3
            r0 = 1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS133S1100000_19.<init>(com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolgroups.SchoolGroupsListViewModel, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S1100000_19(C05P0 c05p0, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c05p0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S1100000_19(C1230060i7A c1230060i7A, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1230060i7A;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S1100000_19(InterfaceC1234930iF1 interfaceC1234930iF1, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = interfaceC1234930iF1;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S1100000_19(C1238760iLC c1238760iLC, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1238760iLC;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S1100000_19(InterfaceC1265060j1c interfaceC1265060j1c, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = interfaceC1265060j1c;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S1100000_19(View view, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = view;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S1100000_19(SmsInputViewModel smsInputViewModel, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = smsInputViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S1100000_19(ManageGroupViewModel manageGroupViewModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = manageGroupViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S1100000_19(GroupInvitationVM groupInvitationVM, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = groupInvitationVM;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S1100000_19(MusNotice musNotice, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = musNotice;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S1100000_19(GroupAccessCriteriaCollection groupAccessCriteriaCollection, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = groupAccessCriteriaCollection;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S1100000_19(BioProfileLinkComponent bioProfileLinkComponent, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = bioProfileLinkComponent;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S1100000_19(BioStructuralLinkProtocol bioStructuralLinkProtocol, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = bioStructuralLinkProtocol;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S1100000_19(ProfileAigcProgressAssem profileAigcProgressAssem, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = profileAigcProgressAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S1100000_19(ProfileEditFragment profileEditFragment, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = profileEditFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S1100000_19(String str, C1075830e6P c1075830e6P, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1075830e6P;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S1100000_19(String str, EnumC1392960mLu enumC1392960mLu, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = enumC1392960mLu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S1100000_19(String str, FollowRequestData followRequestData, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = followRequestData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S1100000_19(String str, PhotoModeBoostedFeedbackResponse photoModeBoostedFeedbackResponse, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = photoModeBoostedFeedbackResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS133S1100000_19(String str, String str2, List<IMUser> list) {
        super(1);
        this.$t = list;
        this.s0 = str;
        this.l1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS133S1100000_19(String str, String str2, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.s0 = str;
        this.l1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS133S1100000_19(Function0 function0, Function0<Unit> function02, String str) {
        super(1);
        this.$t = str;
        this.l1 = function0;
        this.s0 = function02;
    }
}
