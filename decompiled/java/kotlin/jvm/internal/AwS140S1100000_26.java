package kotlin.jvm.internal;

import X.AbstractC1732180vB2;
import X.AbstractC1732350vBJ;
import X.C062P;
import X.C098200Yq;
import X.C09AY;
import X.C0PEM;
import X.C0X52;
import X.C1010603xI;
import X.C1054004Ag;
import X.C1054104Ah;
import X.C108G;
import X.C1388190mED;
import X.C1397620mTQ;
import X.C1397630mTR;
import X.C1397660mTU;
import X.C13LP;
import X.C1623606Xi;
import X.C1708030uY5;
import X.C1708070uY9;
import X.C1708210uYN;
import X.C1708220uYO;
import X.C1708610uZ1;
import X.C1709570uaZ;
import X.C1710030ubJ;
import X.C1711400udW;
import X.C1714180ui0;
import X.C1716050ul1;
import X.C1716310ulR;
import X.C1717920uo2;
import X.C1718120uoM;
import X.C1723270uwf;
import X.C1725270uzt;
import X.C1729230v6H;
import X.C1729240v6I;
import X.C1729520v6k;
import X.C1729860v7I;
import X.C1730180v7o;
import X.C1736580vI8;
import X.C1736830vIX;
import X.C1738910vLt;
import X.C1741890vQh;
import X.C1744200vUQ;
import X.C1745480vWU;
import X.C1745680vWo;
import X.C1746780vYa;
import X.C1749280vcc;
import X.C1755410vmV;
import X.C1755420vmW;
import X.C1761290vvz;
import X.C1762970vyh;
import X.C189200o6;
import X.C19EG;
import X.C1AF0;
import X.C20642515q3;
import X.C2097908Jt;
import X.C23250099c;
import X.C291001Au;
import X.C603880NmM;
import X.C724240Sb0;
import X.C759510Tqn;
import X.C786410Ut5;
import X.C817503Hh;
import X.C893803eS;
import X.C957403oi;
import X.EnumC1723290uwh;
import X.InterfaceC1708000uY2;
import X.InterfaceC1711410udX;
import Y.AObjectS369S0100000_26;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.component.bio.biometric.enroll.BioEnrollFragment;
import com.ss.android.ugc.aweme.component.bio.biometric.enroll.BioEnrollStepFragment;
import com.ss.android.ugc.aweme.component.phone.PhoneNumberAssem;
import com.ss.android.ugc.aweme.component.phone.PhoneNumberVM;
import com.ss.android.ugc.aweme.component.verify.pin.change.PinChangeViewAssem;
import com.ss.android.ugc.aweme.component.verify.pin.offline.PinOfflineViewAssem;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.AddressPasteViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.MessageCenterFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.productrecommend.ProductRecommendVO;
import com.ss.android.ugc.aweme.ecommerce.base.review.lynx.ReviewLynxAssem;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.RegionPicker;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerState;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.UploadImageResponseData;
import com.ss.android.ugc.aweme.model.draft.DraftSavedExtraData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.pipo.auth.PipoAuthResponse;
import com.ss.android.ugc.aweme.pipo.auth.PipoAuthViewModel;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.router.CashierRouterInterceptor;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.subcashier.SubCashierViewModel;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.verify.id.IDVerifyAssem;
import com.ss.android.ugc.aweme.verify.otp.OtpFragment;
import com.ss.android.ugc.aweme.verify.pin.PinVerifyViewAssem;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import eha.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public class AwS140S1100000_26 extends C09AY implements Function1 {
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
            case 41:
                return invoke$41(this, obj);
            case 42:
                return invoke$42(this, obj);
            case 43:
                return invoke$43(this, obj);
            case 44:
                return invoke$44(this, obj);
            case 45:
                return invoke$45(this, obj);
            case 46:
                return invoke$46(this, obj);
            case 47:
                return invoke$47(this, obj);
            case 48:
                return invoke$48(this, obj);
            case 49:
                return invoke$49(this, obj);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this, obj);
            case 51:
                return invoke$51(this, obj);
            case 52:
                return invoke$52(this, obj);
            case 53:
                return invoke$53(this, obj);
            case 54:
                return invoke$54(this, obj);
            case 55:
                return invoke$55(this, obj);
            case 56:
                return invoke$56(this, obj);
            case 57:
                return invoke$57(this, obj);
            case 58:
                return invoke$58(this, obj);
            case 59:
                return invoke$59(this, obj);
            case 60:
                return invoke$60(this, obj);
            case 61:
                return invoke$61(this, obj);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this, obj);
            case 63:
                return invoke$63(this, obj);
            case 64:
                return invoke$64(this, obj);
            case 65:
                return invoke$65(this, obj);
            case 66:
                return invoke$66(this, obj);
            case 67:
                return invoke$67(this, obj);
            case 68:
                return invoke$68(this, obj);
            case 69:
                return invoke$69(this, obj);
            case 70:
                return invoke$70(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1100000_26(HashMap map, int i) {
        super(1);
        this.$t = i;
        this.l1 = map;
        this.s0 = "address_grant";
    }

    public static final Object invoke$0(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("drop_down_list_name", awS140S1100000_26.s0);
        laneParams.plusAssign("item_num", Integer.valueOf(((AddressEditViewModel) awS140S1100000_26.l1).LLLLJI));
        laneParams.plusAssign("stay_time", Long.valueOf(SystemClock.elapsedRealtime() - ((AddressEditViewModel) awS140S1100000_26.l1).LLLLJ));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        ((BioEnrollStepFragment) awS140S1100000_26.l1).MR(awS140S1100000_26.s0, false);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        ((AddressPasteViewHolder) awS140S1100000_26.l1).b6(awS140S1100000_26.s0);
        ((AddressPasteViewHolder) awS140S1100000_26.l1).a6();
        C1745480vWU c1745480vWU = ((AddressPasteViewHolder) awS140S1100000_26.l1).f6().LLJJIJIL;
        HashMap<String, Object> map = ((AddressPasteViewHolder) awS140S1100000_26.l1).f6().LLJJIJIIJIL;
        c1745480vWU.getClass();
        C1745480vWU.LJIILJJIL("yes", map);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        Assembler assembler = (Assembler) obj;
        MessageCenterFragment messageCenterFragment = (MessageCenterFragment) awS140S1100000_26.l1;
        assembler.DQ2(messageCenterFragment, new AwS140S1100000_26(messageCenterFragment, awS140S1100000_26.s0, 12));
        MessageCenterFragment messageCenterFragment2 = (MessageCenterFragment) awS140S1100000_26.l1;
        assembler.DQ2(messageCenterFragment2, new AwS605S0100000_26(messageCenterFragment2, 193));
        assembler.QQ2((MessageCenterFragment) awS140S1100000_26.l1, AFwS257S0000000_19.get$arr$(150));
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        long jLongValue;
        Long l;
        C062P c062p = (C062P) obj;
        String str = awS140S1100000_26.s0;
        String str2 = (String) ((MessageCenterFragment) awS140S1100000_26.l1).LLJ.getValue();
        Object obj2 = ((Map) ((MessageCenterFragment) awS140S1100000_26.l1).LLJJIII.getValue()).get("start_click_time");
        if ((obj2 instanceof Long) && (l = (Long) obj2) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        MessageCenterFragment messageCenterFragment = (MessageCenterFragment) awS140S1100000_26.l1;
        c062p.LIZ = new C1738910vLt(str, str2, jLongValue, messageCenterFragment.LLJJLIIIJLLLLLLLZ, (String) messageCenterFragment.LLJJJJ.getValue(), (String) ((MessageCenterFragment) awS140S1100000_26.l1).LLJJJJJIL.getValue(), 48);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        Function1 function1 = (Function1) awS140S1100000_26.l1;
        if (function1 != null) {
            function1.invoke(awS140S1100000_26.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withNotCheckParams(((C1762970vyh) awS140S1100000_26.l1).LIZ);
        C1010603xI.LIZJ(laneParams, awS140S1100000_26.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        String str;
        District district;
        DistrictPickerState districtPickerState = (DistrictPickerState) obj;
        boolean z = true;
        if (districtPickerState.getTitleEn().length() > 0) {
            RegionPicker regionPicker = (RegionPicker) awS140S1100000_26.l1;
            String str2 = awS140S1100000_26.s0;
            try {
                C1744200vUQ c1744200vUQ = regionPicker.RR().LLILZIL;
                Object objFindViewById = null;
                if (c1744200vUQ != null) {
                    Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, districtPickerState.getDistrictList());
                    if ((objLJJJLZIJ instanceof District) && (district = (District) objLJJJLZIJ) != null) {
                        str = district.districtKey;
                    } else {
                        str = null;
                    }
                    Object obj2 = regionPicker.LLILLJJLI;
                    if (obj2 == null) {
                        View view = regionPicker.getView();
                        if (view != null) {
                            objFindViewById = view.findViewById(R.id.w0t);
                        }
                        regionPicker.LLILLJJLI = (C1749280vcc) objFindViewById;
                        obj2 = objFindViewById;
                    }
                    C1749280vcc c1749280vcc = (C1749280vcc) obj2;
                    if (c1749280vcc != null && c1749280vcc.getVisibility() == 0) {
                        z = false;
                    }
                    c1744200vUQ.LIZJ(str, str2, z);
                    objFindViewById = Unit.LIZ;
                }
                C189200o6.m2constructorimpl(objFindViewById);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("is_success", CardStruct.IStatusCode.DEFAULT);
        laneParams.plusAssign("fail_reason", awS140S1100000_26.s0);
        ((DistrictFragment) awS140S1100000_26.l1).getClass();
        laneParams.plusAssign("is_retry", C893803eS.LIZ(false));
        laneParams.plusAssign("duration", Long.valueOf(System.currentTimeMillis() - ((DistrictFragment) awS140S1100000_26.l1).LLJLL));
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        ((HashMap) obj).put(awS140S1100000_26.s0, awS140S1100000_26.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        ((PipoAuthViewModel) awS140S1100000_26.l1).setState(new AwS76S1000000_26(awS140S1100000_26.s0, 8));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$19(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        EnumC1723290uwh enumC1723290uwh = EnumC1723290uwh.SUCCESS;
        String str = awS140S1100000_26.s0;
        PipoAuthResponse pipoAuthResponse = (PipoAuthResponse) ((BaseResponse) ((C0X52) awS140S1100000_26.l1).LIZIZ).data;
        obj.getClass();
        return new C1723270uwf(enumC1723290uwh, null, str, pipoAuthResponse);
    }

    public static final Object invoke$2(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        C19EG c19egLIZIZ;
        Context context = ((BioEnrollFragment) awS140S1100000_26.l1).getContext();
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            ((BioEnrollFragment) awS140S1100000_26.l1).NR().yQ2(c19egLIZIZ);
        }
        C1716050ul1 c1716050ul1 = ((BioEnrollFragment) awS140S1100000_26.l1).LLILLL;
        if (c1716050ul1 != null) {
            C1716050ul1.LIZLLL(c1716050ul1, awS140S1100000_26.s0, "try_again");
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$20(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        return C1723270uwf.LIZ((C1723270uwf) obj, EnumC1723290uwh.ERROR, ((BaseResponse) ((C0X52) awS140S1100000_26.l1).LIZIZ).errorContent, awS140S1100000_26.s0, 8);
    }

    public static final Object invoke$21(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        ((CCDCAddCardViewModel) awS140S1100000_26.l1).FQ2(false);
        ((CCDCAddCardViewModel) awS140S1100000_26.l1).wQ2((String) obj);
        C1708210uYN c1708210uYN = C1708220uYO.LIZLLL;
        String str = awS140S1100000_26.s0;
        c1708210uYN.getClass();
        C1708210uYN.LIZJ(str, CardStruct.IStatusCode.DEFAULT, null, null);
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        PaymentOption paymentOptionLJJIJIIJI;
        C1709570uaZ c1709570uaZ = (C1709570uaZ) obj;
        String str = awS140S1100000_26.s0;
        C1708030uY5 c1708030uY5 = C1708030uY5.LIZ;
        c1708030uY5.LIZ(new C1708070uY9(str)).LIZLLL(null, AFwS231S0000000_3.get$arr$(48));
        c1708030uY5.LIZ(new C1708070uY9(str)).LJ(null, new AwS140S1100000_26(c1709570uaZ, str, 25));
        if (c1709570uaZ != null && (paymentOptionLJJIJIIJI = c1709570uaZ.LJJIJIIJI()) != null) {
            CashierRouterInterceptor cashierRouterInterceptor = (CashierRouterInterceptor) awS140S1100000_26.l1;
            String str2 = awS140S1100000_26.s0;
            cashierRouterInterceptor.getClass();
            CashierRouterInterceptor.LIZIZ(str2, 0, paymentOptionLJJIJIIJI, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        CashierRouterInterceptor cashierRouterInterceptor = (CashierRouterInterceptor) awS140S1100000_26.l1;
        String str = awS140S1100000_26.s0;
        cashierRouterInterceptor.getClass();
        CashierRouterInterceptor.LIZIZ(str, 2, null, null);
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        CashierRouterInterceptor cashierRouterInterceptor = (CashierRouterInterceptor) awS140S1100000_26.l1;
        String str = awS140S1100000_26.s0;
        cashierRouterInterceptor.getClass();
        CashierRouterInterceptor.LIZIZ(str, 1, null, (String) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap((Map) obj);
        linkedHashMap.put("result", CardStruct.IStatusCode.DEFAULT);
        C1709570uaZ c1709570uaZ = (C1709570uaZ) awS140S1100000_26.l1;
        if (c1709570uaZ != null) {
            linkedHashMap.putAll(c1709570uaZ.LJIIJJI());
        }
        C1708610uZ1.LIZIZ(awS140S1100000_26.s0).LIZ("rd_pipo_pay_result", linkedHashMap);
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        return C1736830vIX.LIZ((C1736830vIX) obj, null, null, Boolean.FALSE, new C291001Au(new C1736580vI8(awS140S1100000_26.s0, (DraftSavedExtraData) awS140S1100000_26.l1)), null, null, null, null, null, 0L, null, null, null, null, 4194111);
    }

    public static final Object invoke$27(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.putAll(C1010603xI.LIZ(awS140S1100000_26.s0));
        Map<String, ? extends Object> map = (Map) awS140S1100000_26.l1;
        if (map != null) {
            laneParams.withParamsGroup(map);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        SmartRouter.buildRoute(((AbstractC1732180vB2) awS140S1100000_26.l1).LLILLL, awS140S1100000_26.s0).open();
        ((AbstractC1732180vB2) awS140S1100000_26.l1).getClass();
        try {
            IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
            if (iEventCenter != null) {
                iEventCenter.LIZ("ec_content_popup_intrude_event", C786410Ut5.J3(new JSONObject()));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Map<String, String> map = C1729240v6I.LIZ;
        C1729240v6I.LJ(((AbstractC1732180vB2) awS140S1100000_26.l1).LJJIL(), C1729240v6I.LJFF(((AbstractC1732180vB2) awS140S1100000_26.l1).LLILZ), AbstractC1732180vB2.LJJIJLIJ(), "go_update");
        return Unit.LIZ;
    }

    public static final Object invoke$29(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131832640, new AwS140S1100000_26((AbstractC1732180vB2) awS140S1100000_26.l1, awS140S1100000_26.s0, 28));
        c1397620mTQ.LJII(2131832639, new AObjectS369S0100000_26((AbstractC1732180vB2) awS140S1100000_26.l1, 0));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        ((BioEnrollFragment) awS140S1100000_26.l1).MR();
        C1716050ul1 c1716050ul1 = ((BioEnrollFragment) awS140S1100000_26.l1).LLILLL;
        if (c1716050ul1 != null) {
            C1716050ul1.LIZLLL(c1716050ul1, awS140S1100000_26.s0, "enable_later");
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013d  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.List<com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region>] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$30(kotlin.jvm.internal.AwS140S1100000_26 r35, java.lang.Object r36) {
        /*
            Method dump skipped, instruction units count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS140S1100000_26.invoke$30(kotlin.jvm.internal.AwS140S1100000_26, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$31(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        C1711400udW.LIZIZ.put(awS140S1100000_26.s0, 2);
        ((InterfaceC1711410udX) awS140S1100000_26.l1).LIZJ();
        return Unit.LIZ;
    }

    public static final Object invoke$32(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        String str;
        HashMap<String, Object> mapLJIIJ;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054104Ah) awS140S1100000_26.l1).LIZIZ);
        laneParams.plusAssign("module_name", "product_video");
        ProductPackStruct productPackStruct = ((C1054104Ah) awS140S1100000_26.l1).LJIIL;
        if (productPackStruct == null || (str = productPackStruct.productId) == null) {
            str = "";
        }
        laneParams.plusAssign("product_id", str);
        String str2 = awS140S1100000_26.s0;
        if (str2 != null && (mapLJIIJ = C1741890vQh.LJIIJ(str2)) != null) {
            laneParams.putAll(mapLJIIJ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$33(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        String str;
        HashMap<String, Object> mapLJIIJ;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054104Ah) awS140S1100000_26.l1).LIZIZ);
        laneParams.plusAssign("module_name", "product_video");
        ProductPackStruct productPackStruct = ((C1054104Ah) awS140S1100000_26.l1).LJIIL;
        if (productPackStruct == null || (str = productPackStruct.productId) == null) {
            str = "";
        }
        laneParams.plusAssign("product_id", str);
        String str2 = awS140S1100000_26.s0;
        if (str2 != null && (mapLJIIJ = C1741890vQh.LJIIJ(str2)) != null) {
            laneParams.putAll(mapLJIIJ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$34(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054104Ah) awS140S1100000_26.l1).LIZIZ);
        laneParams.plusAssign("page_name", "product_detail_more");
        laneParams.plusAssign("shop_id", awS140S1100000_26.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$35(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        ((C1397660mTU) obj).LIZJ = true;
        C1718120uoM c1718120uoM = C1718120uoM.LIZ;
        String str = ((PinChangeViewAssem) awS140S1100000_26.l1).Jo().LLILZIL;
        String str2 = ((PinChangeViewAssem) awS140S1100000_26.l1).Jo().LLILLJJLI;
        String str3 = ((PinChangeViewAssem) awS140S1100000_26.l1).Jo().LLILZLL;
        String str4 = ((PinChangeViewAssem) awS140S1100000_26.l1).Jo().LLIZLLLIL;
        String str5 = ((PinChangeViewAssem) awS140S1100000_26.l1).Jo().LLIZ;
        String str6 = ((PinChangeViewAssem) awS140S1100000_26.l1).Jo().LLJ;
        String str7 = awS140S1100000_26.s0;
        c1718120uoM.getClass();
        C1718120uoM.LJ(str, "bnpl_pin_change", str2, "OK", str7, str3, str5, str4, str6);
        C19EG c19egLIZ = C724240Sb0.LIZ((PinChangeViewAssem) awS140S1100000_26.l1);
        if (c19egLIZ != null) {
            c19egLIZ.finish();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$36(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        ((C1397630mTR) obj).LIZJ(0, C20642515q3.LJI(2131844825), new AwS140S1100000_26((PinChangeViewAssem) awS140S1100000_26.l1, awS140S1100000_26.s0, 35));
        return Unit.LIZ;
    }

    public static final Object invoke$37(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        C108G c108g = C108G.LIZ;
        String str = awS140S1100000_26.s0;
        Integer num = (Integer) awS140S1100000_26.l1;
        c108g.getClass();
        C108G.LIZ((Context) obj, str, num);
        return Unit.LIZ;
    }

    public static final Object invoke$38(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        Function1 function1 = (Function1) awS140S1100000_26.l1;
        if (function1 != null) {
            function1.invoke(awS140S1100000_26.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$39(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        C1714180ui0 c1714180ui0Ho = ((IDVerifyAssem) awS140S1100000_26.l1).Ho();
        if (c1714180ui0Ho != null) {
            c1714180ui0Ho.LJII("too_many_failed_attempts", "got_it");
        }
        ((IDVerifyAssem) awS140S1100000_26.l1).Go("REJECT", awS140S1100000_26.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        C1716050ul1.LIZLLL((C1716050ul1) awS140S1100000_26.l1, awS140S1100000_26.s0, "maybe_later");
        return Unit.LIZ;
    }

    public static final Object invoke$40(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        ((C1397630mTR) obj).LJ(2131844825, new AwS140S1100000_26((IDVerifyAssem) awS140S1100000_26.l1, awS140S1100000_26.s0, 39));
        return Unit.LIZ;
    }

    public static final Object invoke$41(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        ((C1397660mTU) obj).LIZJ = true;
        C1718120uoM c1718120uoM = C1718120uoM.LIZ;
        String str = ((PinOfflineViewAssem) awS140S1100000_26.l1).Jo().LLILLJJLI;
        String str2 = ((PinOfflineViewAssem) awS140S1100000_26.l1).Jo().LL;
        String str3 = ((PinOfflineViewAssem) awS140S1100000_26.l1).Jo().LLILLL;
        String str4 = ((PinOfflineViewAssem) awS140S1100000_26.l1).Jo().LLJ;
        String str5 = ((PinOfflineViewAssem) awS140S1100000_26.l1).Jo().LLIZLLLIL;
        String str6 = ((PinOfflineViewAssem) awS140S1100000_26.l1).Jo().LLJI;
        String str7 = awS140S1100000_26.s0;
        c1718120uoM.getClass();
        C1718120uoM.LJ(str, "bnpl_pin_change", str2, "OK", str7, str3, str5, str4, str6);
        C19EG c19egLIZ = C724240Sb0.LIZ((PinOfflineViewAssem) awS140S1100000_26.l1);
        if (c19egLIZ != null) {
            c19egLIZ.finish();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$42(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        ((C1397630mTR) obj).LIZJ(0, C20642515q3.LJI(2131844825), new AwS140S1100000_26((PinOfflineViewAssem) awS140S1100000_26.l1, awS140S1100000_26.s0, 41));
        return Unit.LIZ;
    }

    public static final Object invoke$43(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        return C1729860v7I.LIZ((C1729860v7I) obj, null, null, ((UploadImageResponseData) awS140S1100000_26.l1).totalImageCount, new C1623606Xi(new C1729520v6k((UploadImageResponseData) awS140S1100000_26.l1, awS140S1100000_26.s0)), 100L, null, null, null, 227);
    }

    public static final Object invoke$44(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        return C1730180v7o.LIZ((C1730180v7o) obj, null, null, null, (TemplateItem) awS140S1100000_26.l1, awS140S1100000_26.s0, false, 39);
    }

    public static final Object invoke$45(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("page_name", ((C1746780vYa) awS140S1100000_26.l1).LIZIZ);
        laneParams.withNotCheckParams(((C1746780vYa) awS140S1100000_26.l1).LIZ);
        laneParams.plusAssign("previous_page", ((C1746780vYa) awS140S1100000_26.l1).LIZ.get("previous_page"));
        laneParams.withNotCheckParam("list_name", "sug_address");
        laneParams.withNotCheckParam("glide_type", awS140S1100000_26.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$46(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        Object obj2;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("page_name", "suggested_address_list");
        HashMap map = (HashMap) awS140S1100000_26.l1;
        Object obj3 = null;
        if (map != null) {
            obj2 = map.get("previous_page");
        } else {
            obj2 = null;
        }
        laneParams.plusAssign("previous_page", obj2);
        HashMap map2 = (HashMap) awS140S1100000_26.l1;
        if (map2 != null) {
            obj3 = map2.get("entrance_info");
        }
        laneParams.plusAssign("entrance_info", obj3);
        laneParams.plusAssign("module_name", awS140S1100000_26.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$47(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        Object obj2;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("page_name", "suggested_address_list");
        HashMap map = (HashMap) awS140S1100000_26.l1;
        Object obj3 = null;
        if (map != null) {
            obj2 = map.get("previous_page");
        } else {
            obj2 = null;
        }
        laneParams.plusAssign("previous_page", obj2);
        HashMap map2 = (HashMap) awS140S1100000_26.l1;
        if (map2 != null) {
            obj3 = map2.get("entrance_info");
        }
        laneParams.plusAssign("entrance_info", obj3);
        laneParams.plusAssign("module_name", awS140S1100000_26.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$48(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        ((OtpFragment) awS140S1100000_26.l1).iS().LJII("too_many_failed_attempts", "ok");
        ((OtpFragment) awS140S1100000_26.l1).gS("REJECT", awS140S1100000_26.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$49(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        ((C1397630mTR) obj).LJ(2131844825, new AwS140S1100000_26((OtpFragment) awS140S1100000_26.l1, awS140S1100000_26.s0, 48));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        PhoneNumberVM phoneNumberVM = (PhoneNumberVM) awS140S1100000_26.l1;
        phoneNumberVM.setState(new AwS140S1100000_26(phoneNumberVM, awS140S1100000_26.s0, 7));
        return Unit.LIZ;
    }

    public static final Object invoke$50(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("is_success", CardStruct.IStatusCode.DEFAULT);
        laneParams.plusAssign("fail_reason", awS140S1100000_26.s0);
        ((DistrictFragment) awS140S1100000_26.l1).getClass();
        laneParams.plusAssign("is_retry", C893803eS.LIZ(false));
        laneParams.plusAssign("duration", Long.valueOf(System.currentTimeMillis() - ((DistrictFragment) awS140S1100000_26.l1).LLJLL));
        return Unit.LIZ;
    }

    public static final Object invoke$51(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        PinVerifyViewAssem pinVerifyViewAssem = (PinVerifyViewAssem) awS140S1100000_26.l1;
        if (obj == null) {
            obj = "";
        }
        String str = awS140S1100000_26.s0;
        pinVerifyViewAssem.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("obj_id", obj);
        linkedHashMap.put("popup_id", str);
        pinVerifyViewAssem.ip("fp_sdk_bnpl_popup_click", linkedHashMap);
        C1714180ui0 c1714180ui0No = ((PinVerifyViewAssem) awS140S1100000_26.l1).No();
        if (c1714180ui0No != null) {
            c1714180ui0No.LJII("too_many_failed_attempts", "ok");
        }
        ((PinVerifyViewAssem) awS140S1100000_26.l1).Ho("REJECT", null);
        return Unit.LIZ;
    }

    public static final Object invoke$52(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        if (awS140S1100000_26.s0.length() == 0) {
            SubCashierViewModel subCashierViewModel = (SubCashierViewModel) awS140S1100000_26.l1;
            subCashierViewModel.setState(new AwS605S0100000_26(subCashierViewModel, 359));
        } else {
            List<C1710030ubJ> listVQ2 = ((SubCashierViewModel) awS140S1100000_26.l1).vQ2();
            String str = awS140S1100000_26.s0;
            ArrayList arrayList = new ArrayList();
            for (C1710030ubJ c1710030ubJ : listVQ2) {
                if (a0.LJJIIZI(c1710030ubJ.LIZ.displayInfo.name, str, true)) {
                    arrayList.add(c1710030ubJ);
                }
            }
            ((SubCashierViewModel) awS140S1100000_26.l1).setState(new AwS605S0100000_26(arrayList, (List<C1745680vWo>) 360));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$53(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        C1755410vmV c1755410vmV;
        Object objLLLIIIIL = ((C1755420vmW) awS140S1100000_26.l1).LLLIIIIL(((Number) obj).intValue(), false);
        String str = null;
        if ((objLLLIIIIL instanceof C1755410vmV) && (c1755410vmV = (C1755410vmV) objLLLIIIIL) != null) {
            str = c1755410vmV.LLILLL;
        }
        return Boolean.valueOf(Intrinsics.LJFF(str, awS140S1100000_26.s0));
    }

    public static final Object invoke$54(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("step", "load_start");
        laneParams.plusAssign("timestamp", Long.valueOf(System.currentTimeMillis()));
        laneParams.plusAssign("schema_url", awS140S1100000_26.s0);
        laneParams.plusAssign("product_id", ((ReviewLynxAssem) awS140S1100000_26.l1).Jo().LLILZLL);
        return Unit.LIZ;
    }

    public static final Object invoke$55(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        String str;
        SmartRouter.buildRoute(((AbstractC1732350vBJ) awS140S1100000_26.l1).LLILLL, awS140S1100000_26.s0).open();
        ((AbstractC1732350vBJ) awS140S1100000_26.l1).getClass();
        try {
            IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
            if (iEventCenter != null) {
                iEventCenter.LIZ("ec_content_popup_intrude_event", C786410Ut5.J3(new JSONObject()));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Map<String, String> map = C1729230v6H.LIZ;
        String strLJJIJIIJI = ((AbstractC1732350vBJ) awS140S1100000_26.l1).LJJIJIIJI();
        if (((AbstractC1732350vBJ) awS140S1100000_26.l1).LLILZ == 0) {
            str = "before_live";
        } else {
            str = "during_live";
        }
        C1729230v6H.LIZJ(strLJJIJIIJI, str, AbstractC1732350vBJ.LJJIJ(), "go_update");
        return Unit.LIZ;
    }

    public static final Object invoke$56(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131832640, new AwS140S1100000_26((AbstractC1732350vBJ) awS140S1100000_26.l1, awS140S1100000_26.s0, 55));
        c1397620mTQ.LJII(2131832639, new AObjectS369S0100000_26((AbstractC1732350vBJ) awS140S1100000_26.l1, 2));
        return Unit.LIZ;
    }

    public static final Object invoke$57(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        Uri uriLIZLLL;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        JSONObject jSONObject = (JSONObject) obj;
        String str = awS140S1100000_26.s0;
        C1725270uzt.LIZ(jSONObject.optString("biz"), null, jSONObject);
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C603880NmM(jSONObject, null), 2);
        if (Intrinsics.LJFF(jSONObject.opt("bdhm_bid"), "pipo_ttls") && (uriLIZLLL = C759510Tqn.LIZLLL(str, "ttls trace")) != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLIZLLL, "pay_request_id")) != null) {
            String strOptString = jSONObject.optString("web_router_info");
            InterfaceC1708000uY2 interfaceC1708000uY2 = C1708030uY5.LIZIZ.get(new C1708070uY9(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter));
            if (interfaceC1708000uY2 != null) {
                interfaceC1708000uY2.LIZ(strOptString);
            }
        }
        try {
            Function1 function1 = (Function1) awS140S1100000_26.l1;
            if (function1 != null) {
                function1.invoke(jSONObject);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$58(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        String str;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("show_type", "checkbox");
        laneParams.plusAssign("mobile", C893803eS.LIZ(((AddressEditViewModel) awS140S1100000_26.l1).LLLFZ));
        if (((AddressEditViewModel) awS140S1100000_26.l1).LLLFFI) {
            str = "check";
        } else {
            str = "non_check";
        }
        laneParams.plusAssign("action_type", str);
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(awS140S1100000_26.s0);
        if (mapLJIIJ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(mapLJIIJ.size()));
            Iterator<T> it2 = mapLJIIJ.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                Object key = entry.getKey();
                if (Intrinsics.LJFF(key, "sms_auth_status")) {
                    key = FollowStatusChangeMethod.PARAM_FOLLOW_STATUS;
                }
                linkedHashMap.put(key, entry.getValue());
            }
            laneParams.putAll(linkedHashMap);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$59(kotlin.jvm.internal.AwS140S1100000_26 r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS140S1100000_26.invoke$59(kotlin.jvm.internal.AwS140S1100000_26, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$6(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("obj_id", "ok");
        linkedHashMap.put("popup_id", awS140S1100000_26.s0);
        linkedHashMap.put("busi_type", ((PhoneNumberAssem) awS140S1100000_26.l1).Oo().LLILLL);
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        String str = ((PhoneNumberAssem) awS140S1100000_26.l1).Oo().LLILZLL;
        c1716310ulR.getClass();
        linkedHashMap.putAll(C1716310ulR.LIZ(str));
        C1716310ulR.LIZJ("fp_sdk_bnpl_popup_click", "bnpl_activate_phone_number", ((PhoneNumberAssem) awS140S1100000_26.l1).Oo().LL, linkedHashMap);
        return Unit.LIZ;
    }

    public static final Object invoke$60(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        HashMap map = (HashMap) obj;
        map.putAll(C1010603xI.LIZ(((ProductRecommendVO) awS140S1100000_26.l1).recommendData.daInfo));
        map.putAll(C1010603xI.LIZ(awS140S1100000_26.s0));
        return Unit.LIZ;
    }

    public static final Object invoke$61(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS140S1100000_26.l1).LIZIZ);
        laneParams.putAll(C1010603xI.LIZ(awS140S1100000_26.s0));
        return Unit.LIZ;
    }

    public static final Object invoke$62(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        ConcurrentHashMap<String, Object> concurrentHashMap = ((C1054004Ag) awS140S1100000_26.l1).LIZIZ;
        c957403oi.getClass();
        ((HashMap) c957403oi.LIZ).putAll(concurrentHashMap);
        c957403oi.LJ(C1010603xI.LIZ(awS140S1100000_26.s0));
        return Unit.LIZ;
    }

    public static final Object invoke$63(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        String str;
        HashMap<String, Object> mapLJIIJ;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS140S1100000_26.l1).LIZIZ);
        laneParams.plusAssign("module_name", "product_video");
        ProductPackStruct productPackStruct = ((C1054004Ag) awS140S1100000_26.l1).LJIIZILJ;
        if (productPackStruct == null || (str = productPackStruct.productId) == null) {
            str = "";
        }
        laneParams.plusAssign("product_id", str);
        String str2 = awS140S1100000_26.s0;
        if (str2 != null && (mapLJIIJ = C1741890vQh.LJIIJ(str2)) != null) {
            laneParams.putAll(mapLJIIJ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$64(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        String str;
        HashMap<String, Object> mapLJIIJ;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS140S1100000_26.l1).LIZIZ);
        laneParams.plusAssign("module_name", "product_video");
        ProductPackStruct productPackStruct = ((C1054004Ag) awS140S1100000_26.l1).LJIIZILJ;
        if (productPackStruct == null || (str = productPackStruct.productId) == null) {
            str = "";
        }
        laneParams.plusAssign("product_id", str);
        String str2 = awS140S1100000_26.s0;
        if (str2 != null && (mapLJIIJ = C1741890vQh.LJIIJ(str2)) != null) {
            laneParams.putAll(mapLJIIJ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$65(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS140S1100000_26.l1).LIZIZ);
        C1010603xI.LIZJ(laneParams, awS140S1100000_26.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$66(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS140S1100000_26.l1).LIZIZ);
        C1010603xI.LIZJ(laneParams, awS140S1100000_26.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$67(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS140S1100000_26.l1).LIZIZ);
        laneParams.plusAssign("page_name", "product_detail_more");
        laneParams.plusAssign("shop_id", awS140S1100000_26.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$68(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS140S1100000_26.l1).LIZIZ);
        C1010603xI.LIZJ(laneParams, awS140S1100000_26.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$69(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("button_name", awS140S1100000_26.s0);
        String str = ((C1761290vvz) awS140S1100000_26.l1).LIZ;
        if (str == null) {
            str = "";
        }
        laneParams.plusAssign("review_id", str);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        return C1717920uo2.LIZ((C1717920uo2) obj, null, awS140S1100000_26.s0, ((PhoneNumberVM) awS140S1100000_26.l1).LLILLL, false, null, null, null, null, 0, null, 1017);
    }

    public static final Object invoke$70(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("button_name", awS140S1100000_26.s0);
        String str = ((C1761290vvz) awS140S1100000_26.l1).LIZ;
        if (str == null) {
            str = "";
        }
        laneParams.plusAssign("review_id", str);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        Object obj2;
        LaneParams laneParams = (LaneParams) obj;
        HashMap<String, Object> map = ((AddressEditViewModel) awS140S1100000_26.l1).LLJJIJIIJIL;
        Object obj3 = null;
        if (map != null) {
            obj2 = map.get("previous_page");
        } else {
            obj2 = null;
        }
        laneParams.plusAssign("previous_page", obj2);
        laneParams.plusAssign("is_fullscreen", Integer.valueOf(((AddressEditViewModel) awS140S1100000_26.l1).LLLLLIL ? 1 : 0));
        laneParams.plusAssign("fill_type", ((AddressEditViewModel) awS140S1100000_26.l1).LLLLL.type());
        laneParams.plusAssign("page_name", ((AddressEditViewModel) awS140S1100000_26.l1).getPageName());
        HashMap<String, Object> map2 = ((AddressEditViewModel) awS140S1100000_26.l1).LLJJIJIIJIL;
        if (map2 != null) {
            obj3 = map2.get("entrance_info");
        }
        laneParams.plusAssign("entrance_info", obj3);
        laneParams.plusAssign("drop_down_list_name", awS140S1100000_26.s0);
        laneParams.plusAssign("item_num", Integer.valueOf(((AddressEditViewModel) awS140S1100000_26.l1).LLLLJI));
        laneParams.plusAssign("stay_time", Long.valueOf(SystemClock.elapsedRealtime() - ((AddressEditViewModel) awS140S1100000_26.l1).LLLLJ));
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS140S1100000_26 awS140S1100000_26, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131847063, new AwS140S1100000_26((AddressPasteViewHolder) awS140S1100000_26.l1, awS140S1100000_26.s0, 10));
        c1397620mTQ.LJII(2131847064, new AwS605S0100000_26((AddressPasteViewHolder) awS140S1100000_26.l1, 176));
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS140S1100000_26(com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 0: goto Lf;
                case 59: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l1 = r3
            r1.s0 = r4
            r0 = 1
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.s0 = r4
            r1.l1 = r3
            r0 = 1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS140S1100000_26.<init>(com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, java.lang.String, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS140S1100000_26(com.ss.android.ugc.aweme.component.phone.PhoneNumberVM r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 5 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.s0 = r4
            r1.l1 = r3
            r0 = 1
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.l1 = r3
            r1.s0 = r4
            r0 = 1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS140S1100000_26.<init>(com.ss.android.ugc.aweme.component.phone.PhoneNumberVM, java.lang.String, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS140S1100000_26(com.ss.android.ugc.aweme.ecommerce.base.messagecenter.MessageCenterFragment r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 11 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.s0 = r4
            r1.l1 = r3
            r0 = 1
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.l1 = r3
            r1.s0 = r4
            r0 = 1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS140S1100000_26.<init>(com.ss.android.ugc.aweme.ecommerce.base.messagecenter.MessageCenterFragment, java.lang.String, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS140S1100000_26(com.ss.android.ugc.aweme.pipo.cashier.cashier.router.CashierRouterInterceptor r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 22 - r5
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS140S1100000_26.<init>(com.ss.android.ugc.aweme.pipo.cashier.cashier.router.CashierRouterInterceptor, java.lang.String, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS140S1100000_26(java.lang.String r3, java.lang.String r4, X.C0X52<com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse<com.ss.android.ugc.aweme.pipo.auth.PipoAuthResponse>> r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 19 - r5
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS140S1100000_26.<init>(java.lang.String, X.0X52, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1100000_26(C1054004Ag c1054004Ag, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1054004Ag;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1100000_26(C1054104Ah c1054104Ah, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1054104Ah;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1100000_26(C1709570uaZ c1709570uaZ, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1709570uaZ;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1100000_26(C1716050ul1 c1716050ul1, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1716050ul1;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1100000_26(AbstractC1732180vB2 abstractC1732180vB2, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = abstractC1732180vB2;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1100000_26(AbstractC1732350vBJ abstractC1732350vBJ, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = abstractC1732350vBJ;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1100000_26(C1746780vYa c1746780vYa, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1746780vYa;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1100000_26(C1755420vmW c1755420vmW, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1755420vmW;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1100000_26(C1762970vyh c1762970vyh, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1762970vyh;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1100000_26(BioEnrollFragment bioEnrollFragment, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = bioEnrollFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1100000_26(BioEnrollStepFragment bioEnrollStepFragment, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = bioEnrollStepFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1100000_26(PinChangeViewAssem pinChangeViewAssem, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = pinChangeViewAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1100000_26(PinOfflineViewAssem pinOfflineViewAssem, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = pinOfflineViewAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1100000_26(AddressPasteViewHolder addressPasteViewHolder, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = addressPasteViewHolder;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1100000_26(ProductRecommendVO productRecommendVO, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = productRecommendVO;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1100000_26(RegionPicker regionPicker, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = regionPicker;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1100000_26(TemplateItem templateItem, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = templateItem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1100000_26(UploadImageResponseData uploadImageResponseData, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = uploadImageResponseData;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1100000_26(PipoAuthViewModel pipoAuthViewModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = pipoAuthViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1100000_26(CCDCAddCardViewModel cCDCAddCardViewModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = cCDCAddCardViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1100000_26(IDVerifyAssem iDVerifyAssem, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = iDVerifyAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1100000_26(OtpFragment otpFragment, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = otpFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1100000_26(PinVerifyViewAssem pinVerifyViewAssem, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = pinVerifyViewAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1100000_26(String str, InterfaceC1711410udX interfaceC1711410udX, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = interfaceC1711410udX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1100000_26(String str, C1761290vvz c1761290vvz, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1761290vvz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1100000_26(String str, PhoneNumberAssem phoneNumberAssem, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = phoneNumberAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1100000_26(String str, ReviewLynxAssem reviewLynxAssem, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = reviewLynxAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1100000_26(String str, DistrictFragment districtFragment, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = districtFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1100000_26(String str, DraftSavedExtraData draftSavedExtraData, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = draftSavedExtraData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1100000_26(String str, SubCashierViewModel subCashierViewModel, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = subCashierViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1100000_26(String str, k kVar, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1100000_26(String str, Integer num, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1100000_26(String str, Object obj, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS140S1100000_26(String str, String str2, Map<String, ? extends Object> map) {
        super(1);
        this.$t = map;
        this.s0 = str;
        this.l1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS140S1100000_26(String str, String str2, Function1<? super JSONObject, Unit> function1) {
        super(1);
        this.$t = function1;
        this.s0 = str;
        this.l1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1100000_26(String str, AwS605S0100000_26 awS605S0100000_26, int i) {
        super(1);
        this.$t = i;
        this.l1 = awS605S0100000_26;
        this.s0 = str;
    }
}
