package kotlin.jvm.internal;

import X.C062P;
import X.C06I0;
import X.C06I6;
import X.C06VL;
import X.C098200Yq;
import X.C09AY;
import X.C0EQZ;
import X.C0I0B;
import X.C0PEM;
import X.C0YNP;
import X.C1168400gVi;
import X.C1175960ghu;
import X.C1398350mUb;
import X.C13BV;
import X.C1533790q13;
import X.C1533810q15;
import X.C1558520qew;
import X.C1672306gj;
import X.C1736506r5;
import X.C1753106tl;
import X.C1763606vS;
import X.C189200o6;
import X.C19719612Di;
import X.C201955140j;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2252611DEt;
import X.C23250099c;
import X.C259800zU;
import X.InterfaceC1381130m2p;
import X.InterfaceC20236714Gf;
import X.InterfaceC332260D0u;
import Y.AObjectS360S0200000_25;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.detailpage.manageadmin.fragment.ManageAdminFragment;
import com.ss.android.ugc.aweme.im.b2c.actionbar.ActionBarButtonConfBusiness;
import com.ss.android.ugc.aweme.im.b2c.actionbar.BusinessChatActionBarVM;
import com.ss.android.ugc.aweme.im.b2c.businessinfo.IMBusinessInfoAbilityImpl;
import com.ss.android.ugc.aweme.im.b2c.landing.BusinessChatLandingMsgRespV2;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.setting.StreakPetResourceDescription;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMB2CBusinessInfoAvgResp;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetResourceStatus;
import com.ss.android.ugc.aweme.internalshare.impl.sharetouser.ShareToUserSheet;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility;
import com.ss.android.ugc.profile.platform.business.header.business.storyhighlights.business.HeaderStoryHighlightsOtherCollectionComponent;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public class AwS116S1100000_2 extends C09AY implements Function1 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS116S1100000_2 awS116S1100000_2, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleAction: src=");
        sbLIZ.append(awS116S1100000_2.s0);
        sbLIZ.append(", autoplay=");
        sbLIZ.append((Boolean) awS116S1100000_2.l1);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS116S1100000_2 awS116S1100000_2, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.DQ2((ManageAdminFragment) awS116S1100000_2.l1, new AwS53S1000000_2(awS116S1100000_2.s0, 4));
        assembler.QQ2((ManageAdminFragment) awS116S1100000_2.l1, AFwS229S0000000_2.get$arr$(149));
        assembler.QQ2((ManageAdminFragment) awS116S1100000_2.l1, AFwS229S0000000_2.get$arr$(150));
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS116S1100000_2 awS116S1100000_2, Object obj) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj;
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap();
        }
        Object obj2 = awS116S1100000_2.l1;
        String str = awS116S1100000_2.s0;
        if (obj2 == null) {
            concurrentHashMap.remove(str);
            return concurrentHashMap;
        }
        concurrentHashMap.put(str, obj2);
        return concurrentHashMap;
    }

    public static final Object invoke$11(AwS116S1100000_2 awS116S1100000_2, Object obj) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj;
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap();
        }
        Object obj2 = awS116S1100000_2.l1;
        String str = awS116S1100000_2.s0;
        if (obj2 == null) {
            concurrentHashMap.remove(str);
            return concurrentHashMap;
        }
        concurrentHashMap.put(str, obj2);
        return concurrentHashMap;
    }

    public static final Object invoke$12(AwS116S1100000_2 awS116S1100000_2, Object obj) {
        String str = (String) obj;
        if (str != null && str.length() != 0) {
            ((Function1) awS116S1100000_2.l1).invoke(str);
        } else {
            C1168400gVi.LIZLLL(new AwS53S1000000_2(awS116S1100000_2.s0, 10));
            ((Function1) awS116S1100000_2.l1).invoke(null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS116S1100000_2 awS116S1100000_2, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.DQ2((ShareToUserSheet) awS116S1100000_2.l1, new AwS53S1000000_2(awS116S1100000_2.s0, 19));
        assembler.DQ2((ShareToUserSheet) awS116S1100000_2.l1, new AwS57S1000000_6(awS116S1100000_2.s0, 11));
        assembler.RQ2((ShareToUserSheet) awS116S1100000_2.l1, AFwS229S0000000_2.get$arr$(755));
        assembler.QQ2((ShareToUserSheet) awS116S1100000_2.l1, AFwS229S0000000_2.get$arr$(756));
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS116S1100000_2 awS116S1100000_2, Object obj) {
        C06I6 c06i6;
        if (((Boolean) obj).booleanValue()) {
            c06i6 = C06I6.SUCCESS;
        } else {
            c06i6 = C06I6.FAIL;
        }
        C06I0.LJIIIZ.put(awS116S1100000_2.s0, new StreakPetResourceStatus((StreakPetResourceDescription) awS116S1100000_2.l1, c06i6));
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS116S1100000_2 awS116S1100000_2, Object obj) {
        C06I6 c06i6;
        if (((Boolean) obj).booleanValue()) {
            c06i6 = C06I6.SUCCESS;
        } else {
            c06i6 = C06I6.FAIL;
        }
        C06I0.LJI.put(awS116S1100000_2.s0, new StreakPetResourceStatus((StreakPetResourceDescription) awS116S1100000_2.l1, c06i6));
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS116S1100000_2 awS116S1100000_2, Object obj) {
        C06I6 c06i6;
        if (((Boolean) obj).booleanValue()) {
            c06i6 = C06I6.SUCCESS;
        } else {
            c06i6 = C06I6.FAIL;
        }
        C06I0.LJIIIIZZ.put(awS116S1100000_2.s0, new StreakPetResourceStatus((StreakPetResourceDescription) awS116S1100000_2.l1, c06i6));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$17(AwS116S1100000_2 awS116S1100000_2, Object obj) {
        Boolean boolValueOf;
        ((C259800zU) awS116S1100000_2.l1).element = obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prefetchForceSync url: ");
        sbLIZ.append(awS116S1100000_2.s0);
        sbLIZ.append(" isSuccess: ");
        C1533790q13 c1533790q13 = (C1533790q13) ((C259800zU) awS116S1100000_2.l1).element;
        C1533810q15 c1533810q15 = null;
        if (c1533790q13 != null) {
            boolValueOf = Boolean.valueOf(c1533790q13.LIZIZ);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(" errorInfo: ");
        C1533790q13 c1533790q132 = (C1533790q13) ((C259800zU) awS116S1100000_2.l1).element;
        if (c1533790q132 != null) {
            c1533810q15 = c1533790q132.LIZLLL;
        }
        sbLIZ.append(c1533810q15);
        sbLIZ.append(" result: ");
        sbLIZ.append(obj);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS116S1100000_2 awS116S1100000_2, Object obj) {
        User user;
        InterfaceC1381130m2p interfaceC1381130m2p = (InterfaceC1381130m2p) obj;
        interfaceC1381130m2p.LJIIJJI("story_highlights");
        interfaceC1381130m2p.LJIIJ(awS116S1100000_2.s0);
        String uid = null;
        UserProfileAbility userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL((HeaderStoryHighlightsOtherCollectionComponent) awS116S1100000_2.l1), UserProfileAbility.class, null);
        if (userProfileAbility != null && (user = userProfileAbility.getUser()) != null) {
            uid = user.getUid();
        }
        interfaceC1381130m2p.LJIIIIZZ(uid);
        interfaceC1381130m2p.LJIIL(C2097608Jq.LJIIJ(new Pair("reportTypeId", "10000210")));
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS116S1100000_2 awS116S1100000_2, Object obj) {
        ((Function2) awS116S1100000_2.l1).invoke(awS116S1100000_2.s0, Integer.valueOf(((Number) obj).intValue()));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS116S1100000_2 awS116S1100000_2, Object obj) {
        List<ActionBarButtonConfBusiness> second;
        ArrayList arrayList;
        Object obj2;
        C1763606vS c1763606vS = (C1763606vS) obj;
        Pair<Integer, List<ActionBarButtonConfBusiness>> pair = c1763606vS.LL;
        if (pair != null && (second = pair.getSecond()) != null && (arrayList = new ArrayList(second)) != null && C19719612Di.LJJIIJ(arrayList, new AwS53S1000000_2(awS116S1100000_2.s0, 5), true)) {
            if (arrayList == null) {
                obj2 = C13BV.INSTANCE;
            } else {
                obj2 = arrayList;
            }
            C1763606vS c1763606vSLIZ = C1763606vS.LIZ(c1763606vS, new Pair(1, obj2), null, 2);
            BusinessChatActionBarVM businessChatActionBarVM = (BusinessChatActionBarVM) awS116S1100000_2.l1;
            businessChatActionBarVM.getClass();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(businessChatActionBarVM), C0PEM.LIZJ, null, new C1753106tl(businessChatActionBarVM, arrayList, null), 2);
            return c1763606vSLIZ;
        }
        return c1763606vS;
    }

    public static final Object invoke$20(AwS116S1100000_2 awS116S1100000_2, Object obj) {
        C1736506r5 c1736506r5 = (C1736506r5) obj;
        BusinessChatLandingMsgRespV2 businessChatLandingMsgRespV2 = (BusinessChatLandingMsgRespV2) awS116S1100000_2.l1;
        List list = businessChatLandingMsgRespV2.sugQuestions;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        String str = businessChatLandingMsgRespV2.suggestedQuestionTips;
        if (str == null) {
            str = "";
        }
        return C1736506r5.LIZ(c1736506r5, 0, null, list, null, str, null, null, false, awS116S1100000_2.s0, 235);
    }

    public static final Object invoke$21(AwS116S1100000_2 awS116S1100000_2, Object obj) {
        ((C062P) obj).LIZ = new C06VL(awS116S1100000_2.s0, new AwS581S0100000_2((Fragment) awS116S1100000_2.l1, 651));
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS116S1100000_2 awS116S1100000_2, Object obj) {
        Assembler assembler = (Assembler) obj;
        Fragment fragment = (Fragment) awS116S1100000_2.l1;
        assembler.DQ2(fragment, new AwS116S1100000_2(awS116S1100000_2.s0, fragment, 21));
        assembler.QQ2((Fragment) awS116S1100000_2.l1, AFwS229S0000000_2.get$arr$(872));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS116S1100000_2 awS116S1100000_2, Object obj) {
        long jLongValue;
        String str;
        IMB2CBusinessInfoAvgResp iMB2CBusinessInfoAvgResp = (IMB2CBusinessInfoAvgResp) obj;
        String str2 = iMB2CBusinessInfoAvgResp.avgRespStr;
        if (str2 == null) {
            str2 = "";
        }
        ((InterfaceC332260D0u) ((IMBusinessInfoAbilityImpl) awS116S1100000_2.l1).LLILLJJLI.getValue()).setValue(str2);
        if (!((IMBusinessInfoAbilityImpl) awS116S1100000_2.l1).LLILLL && str2.length() > 0) {
            Object value = ((IMBusinessInfoAbilityImpl) awS116S1100000_2.l1).LL.getValue();
            String str3 = awS116S1100000_2.s0;
            Long l = iMB2CBusinessInfoAvgResp.avgRespTime;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            value.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("conversation_id", C0YNP.LJ(str3));
            if (jLongValue < TimeUnit.MINUTES.toSeconds(3L)) {
                str = "3min";
            } else {
                TimeUnit timeUnit = TimeUnit.HOURS;
                if (jLongValue < timeUnit.toSeconds(1L)) {
                    str = "1h";
                } else if (jLongValue < timeUnit.toSeconds(12L)) {
                    str = "a_few_hours";
                } else {
                    str = "a_day";
                }
            }
            linkedHashMap.put("response_time", str);
            C0I0B.LJFF.LIZIZ();
            C20684815ws.LJIILLIIL("b2c_response_time_show", linkedHashMap);
            ((IMBusinessInfoAbilityImpl) awS116S1100000_2.l1).LLILLL = true;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS116S1100000_2 awS116S1100000_2, Object obj) {
        ((Function2) awS116S1100000_2.l1).invoke(Integer.valueOf(((Number) obj).intValue()), awS116S1100000_2.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS116S1100000_2 awS116S1100000_2, Object obj) {
        ((C0EQZ) awS116S1100000_2.l1).LLILZ.remove(awS116S1100000_2.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS116S1100000_2 awS116S1100000_2, Object obj) {
        if (((InterfaceC20236714Gf) awS116S1100000_2.l1).isActive()) {
            if (obj == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FetchDetailNode fetch detail success but body null, id=");
                sbLIZ.append(awS116S1100000_2.s0);
                IllegalStateException illegalStateException = new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                String message = illegalStateException.getMessage();
                if (message == null) {
                    message = "detail null";
                }
                C201955140j.LJII(c1398350mUb, message);
                InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) awS116S1100000_2.l1;
                C098200Yq c098200Yq = new C098200Yq(illegalStateException);
                C189200o6.m2constructorimpl(c098200Yq);
                interfaceC20236714Gf.resumeWith(c098200Yq);
            } else {
                InterfaceC20236714Gf interfaceC20236714Gf2 = (InterfaceC20236714Gf) awS116S1100000_2.l1;
                C189200o6.m2constructorimpl(obj);
                interfaceC20236714Gf2.resumeWith(obj);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS116S1100000_2 awS116S1100000_2, Object obj) {
        C062P c062p = (C062P) obj;
        c062p.LIZ = (C1175960ghu) awS116S1100000_2.l1;
        c062p.LIZIZ = awS116S1100000_2.s0;
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS116S1100000_2 awS116S1100000_2, Object obj) {
        Map map = (Map) obj;
        SessionInfo sessionInfo = (SessionInfo) awS116S1100000_2.l1;
        String str = awS116S1100000_2.s0;
        C0I0B.LJFF.LIZIZ();
        if (sessionInfo == null || !sessionInfo.isChatroomAnalyticsBlocked()) {
            C20684815ws.LJIILLIIL("show_inline_dm_option", C1672306gj.LIZIZ(sessionInfo, null, str, map, 2));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS116S1100000_2 awS116S1100000_2, Object obj) {
        C1533790q13 c1533790q13 = (C1533790q13) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchResource bundle=");
        sbLIZ.append(awS116S1100000_2.s0);
        sbLIZ.append(", isSucceed=");
        sbLIZ.append(c1533790q13.LIZIZ);
        sbLIZ.append(", filePath=");
        sbLIZ.append(c1533790q13.LIZLLL());
        C2188811AlT.LIZIZ(sbLIZ);
        Function1 function1 = (Function1) awS116S1100000_2.l1;
        if (function1 != null) {
            function1.invoke(c1533790q13);
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS116S1100000_2(java.lang.String r3, java.lang.String r4, kotlin.jvm.functions.Function1<? super X.C1533790q13, kotlin.Unit> r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 9 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.l1 = r4
            r1.s0 = r3
            r0 = 1
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.s0 = r3
            r1.l1 = r4
            r0 = 1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS116S1100000_2.<init>(java.lang.String, kotlin.jvm.functions.Function1, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S1100000_2(C0EQZ c0eqz, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c0eqz;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S1100000_2(C1175960ghu c1175960ghu, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1175960ghu;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S1100000_2(AObjectS360S0200000_25 aObjectS360S0200000_25, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = aObjectS360S0200000_25;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S1100000_2(Fragment fragment, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = fragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S1100000_2(ManageAdminFragment manageAdminFragment, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = manageAdminFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S1100000_2(IMBusinessInfoAbilityImpl iMBusinessInfoAbilityImpl, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = iMBusinessInfoAbilityImpl;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S1100000_2(BusinessChatLandingMsgRespV2 businessChatLandingMsgRespV2, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = businessChatLandingMsgRespV2;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S1100000_2(SessionInfo sessionInfo, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = sessionInfo;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S1100000_2(ShareToUserSheet shareToUserSheet, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = shareToUserSheet;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S1100000_2(Object obj, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S1100000_2(String str, C259800zU c259800zU, int i) {
        super(1);
        this.$t = i;
        this.l1 = c259800zU;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S1100000_2(String str, C2252611DEt c2252611DEt, int i) {
        super(1);
        this.$t = i;
        this.l1 = c2252611DEt;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S1100000_2(String str, Fragment fragment, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = fragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S1100000_2(String str, BusinessChatActionBarVM businessChatActionBarVM, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = businessChatActionBarVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S1100000_2(String str, StreakPetResourceDescription streakPetResourceDescription, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = streakPetResourceDescription;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S1100000_2(String str, HeaderStoryHighlightsOtherCollectionComponent headerStoryHighlightsOtherCollectionComponent, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = headerStoryHighlightsOtherCollectionComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S1100000_2(String str, Boolean bool, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = bool;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S1100000_2(AwS441S0200000_5 awS441S0200000_5, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = awS441S0200000_5;
        this.s0 = str;
    }
}
