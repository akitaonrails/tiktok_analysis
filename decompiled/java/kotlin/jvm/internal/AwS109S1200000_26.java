package kotlin.jvm.internal;

import X.C09AY;
import X.C0OFE;
import X.C0X52;
import X.C1010603xI;
import X.C1054004Ag;
import X.C1238130iKB;
import X.C1389880mGw;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1397660mTU;
import X.C1507790pL7;
import X.C1542120qEU;
import X.C1714230ui5;
import X.C1714660uim;
import X.C1721620uu0;
import X.C1728940v5o;
import X.C1728990v5t;
import X.C1729070v61;
import X.C1731550vA1;
import X.C1736560vI6;
import X.C1736830vIX;
import X.C1741890vQh;
import X.C1745310vWD;
import X.C1745340vWG;
import X.C1745470vWT;
import X.C1745480vWU;
import X.C1745680vWo;
import X.C1746460vY4;
import X.C1748770vbn;
import X.C1748780vbo;
import X.C1753650vjf;
import X.C1753660vjg;
import X.C1773720wG2;
import X.C19EG;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2252611DEt;
import X.C23250099c;
import X.C604530NnP;
import X.C719202rO;
import X.C893803eS;
import X.C948003nC;
import X.C960603pE;
import X.EnumC488160JCk;
import X.InterfaceC1053404Aa;
import X.InterfaceC1717210umt;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.keva.Keva;
import com.bytedance.pipo.ttpay.recharge.network.Amount;
import com.bytedance.pipo.ttpay.recharge.network.SubmitPaymentResponse;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.biz.wallet.network.model.PopOutInfo;
import com.ss.android.ugc.aweme.biz.wallet.network.model.WalletFlowDecision;
import com.ss.android.ugc.aweme.component.register.BaseRegisterManager;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ChangeOnOrderStruct;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditState;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.PhoneInputItemViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.bnpl.BnplMiddleActivity;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponentCard;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.header.PdpHeadNavBarWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.lynx.ReviewLynxAssem;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerState;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerViewModel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreLabel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardMultiGuide;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardSettingsData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.BillboardGlobalViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.SizeChartTemplateEditViewModel;
import com.ss.android.ugc.aweme.model.draft.DraftSavedExtraData;
import com.ss.android.ugc.aweme.pipo.auth.PipoAuthResponse;
import com.ss.android.ugc.aweme.pipo.auth.PipoAuthViewModel;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import com.ss.android.ugc.aweme.prop.fragment.MobileEffectEditV2Fragment;
import com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditVM;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.verify.BaseVerifyFragment;
import com.ss.android.ugc.aweme.verify.BaseVerifyUIContentAssem;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS109S1200000_26 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        ((Boolean) obj).booleanValue();
        C1773720wG2 c1773720wG2 = (C1773720wG2) awS109S1200000_26.l1;
        View view = (View) awS109S1200000_26.l2;
        c1773720wG2.getClass();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "rotation", 0.0f, -20.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "rotation", -20.0f, 20.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "rotation", 20.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        animatorSet.start();
        C1773720wG2 c1773720wG22 = (C1773720wG2) awS109S1200000_26.l1;
        String str = awS109S1200000_26.s0;
        c1773720wG22.getClass();
        if (str != null) {
            C1389880mGw c1389880mGw = new C1389880mGw(c1773720wG22.LIZIZ().LIZLLL().LJ);
            c1389880mGw.LJIIIZ(str);
            c1389880mGw.LJIIJ();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        return C1721620uu0.LIZ((C1721620uu0) obj, null, null, null, null, EnumC488160JCk.SUCCESS, null, (SubmitPaymentResponse) ((BaseResponse) awS109S1200000_26.l1).data, awS109S1200000_26.s0, null, null, null, null, (Amount) awS109S1200000_26.l2, null, null, 12079);
    }

    public static final Object invoke$10(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        int iIntValue;
        C1728990v5t c1728990v5t = (C1728990v5t) obj;
        BillboardSettingsData billboardSettingsData = (BillboardSettingsData) awS109S1200000_26.l1;
        boolean z = billboardSettingsData.setting.isAutoDisplay;
        Integer num = billboardSettingsData.maxDisplayCount;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 1;
        }
        BillboardMultiGuide billboardMultiGuide = ((BillboardSettingsData) awS109S1200000_26.l1).multiGuide;
        C1728940v5o c1728940v5o = ((BillboardGlobalViewModel) awS109S1200000_26.l2).LL.LL;
        String str = awS109S1200000_26.s0;
        c1728940v5o.getClass();
        Keva kevaLIZ = C1729070v61.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_is_first_show_multi_template_guide_");
        String str2 = "";
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        boolean z2 = kevaLIZ.getBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
        C1728940v5o c1728940v5o2 = ((BillboardGlobalViewModel) awS109S1200000_26.l2).LL.LL;
        String str3 = awS109S1200000_26.s0;
        c1728940v5o2.getClass();
        Keva kevaLIZ2 = C1729070v61.LIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("key_is_first_show_multi_template_image_");
        if (str3 != null) {
            str2 = str3;
        }
        sbLIZ2.append(str2);
        return C1728990v5t.LIZ(c1728990v5t, null, false, z, null, null, null, null, iIntValue, billboardMultiGuide, z2, kevaLIZ2.getBoolean(C2188811AlT.LIZIZ(sbLIZ2), true), null, 2171);
    }

    public static final Object invoke$11(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        ((PipoAuthViewModel) awS109S1200000_26.l1).setState(new AwS140S1100000_26(awS109S1200000_26.s0, (String) awS109S1200000_26.l2, (C0X52<BaseResponse<PipoAuthResponse>>) 19));
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        ((PipoAuthViewModel) awS109S1200000_26.l1).setState(new AwS140S1100000_26(awS109S1200000_26.s0, (String) awS109S1200000_26.l2, (C0X52<BaseResponse<PipoAuthResponse>>) 20));
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.DQ2((MobileEffectEditV2Fragment) awS109S1200000_26.l1, new AwS605S0100000_26((MobileEffectData) awS109S1200000_26.l2, 387));
        assembler.DQ2((MobileEffectEditV2Fragment) awS109S1200000_26.l1, new AwS76S1000000_26(awS109S1200000_26.s0, 11));
        assembler.RQ2((MobileEffectEditV2Fragment) awS109S1200000_26.l1, AFwS229S0000000_2.get$arr$(466));
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        C23250099c.LIZLLL(((EffectEditVM) awS109S1200000_26.l1).getAssemVMScope(), null, null, new C1736560vI6((C1736830vIX) obj, (EffectEditVM) awS109S1200000_26.l1, awS109S1200000_26.s0, (DraftSavedExtraData) awS109S1200000_26.l2, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        C1714660uim c1714660uimVR;
        BaseVerifyFragment baseVerifyFragmentLIZ = C1714230ui5.LIZ((BaseVerifyUIContentAssem) awS109S1200000_26.l1);
        if (baseVerifyFragmentLIZ != null && (c1714660uimVR = baseVerifyFragmentLIZ.VR()) != null) {
            String str = awS109S1200000_26.s0;
            if (str == null) {
                str = "";
            }
            c1714660uimVR.LJFF("scan_again", str, "rd_pipo_veri_center_popup_click");
        }
        Runnable runnable = (Runnable) awS109S1200000_26.l2;
        if (runnable != null) {
            runnable.run();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        C1714660uim c1714660uimVR;
        BaseVerifyFragment baseVerifyFragmentLIZ = C1714230ui5.LIZ((BaseVerifyUIContentAssem) awS109S1200000_26.l1);
        if (baseVerifyFragmentLIZ != null && (c1714660uimVR = baseVerifyFragmentLIZ.VR()) != null) {
            String str = awS109S1200000_26.s0;
            if (str == null) {
                str = "";
            }
            c1714660uimVR.LJFF("cancel", str, "rd_pipo_veri_center_popup_click");
        }
        Runnable runnable = (Runnable) awS109S1200000_26.l2;
        if (runnable != null) {
            runnable.run();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        Map<String, Object> mapLJ;
        InterfaceC1053404Aa interfaceC1053404Aa;
        LaneParams laneParams = (LaneParams) obj;
        String str = awS109S1200000_26.s0;
        if (str != null) {
            laneParams.put("coupon_ignore_type", str);
        }
        C1010603xI.LIZJ(laneParams, ((PdpComponentCard) awS109S1200000_26.l1).daInfo);
        PdpViewModel pdpViewModel = (PdpViewModel) awS109S1200000_26.l2;
        if (pdpViewModel == null || (interfaceC1053404Aa = pdpViewModel.LLILZIL) == null || (mapLJ = interfaceC1053404Aa.LJ("c5815.d0")) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        laneParams.withNotCheckParams(mapLJ);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        Map<String, Object> mapLJ;
        InterfaceC1053404Aa interfaceC1053404Aa;
        LaneParams laneParams = (LaneParams) obj;
        C1010603xI.LIZJ(laneParams, ((PdpComponentCard) awS109S1200000_26.l1).daInfo);
        String str = awS109S1200000_26.s0;
        if (str != null) {
            laneParams.put("click_area", str);
        }
        PdpViewModel pdpViewModel = (PdpViewModel) awS109S1200000_26.l2;
        if (pdpViewModel == null || (interfaceC1053404Aa = pdpViewModel.LLILZIL) == null || (mapLJ = interfaceC1053404Aa.LJ("c5815.d0")) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        laneParams.withNotCheckParams(mapLJ);
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        Map<String, Object> mapLJ;
        InterfaceC1053404Aa interfaceC1053404Aa;
        LaneParams laneParams = (LaneParams) obj;
        C1010603xI.LIZJ(laneParams, ((PdpComponentCard) awS109S1200000_26.l1).daInfo);
        String str = awS109S1200000_26.s0;
        if (str != null) {
            laneParams.put("click_area", str);
        }
        PdpViewModel pdpViewModel = (PdpViewModel) awS109S1200000_26.l2;
        if (pdpViewModel == null || (interfaceC1053404Aa = pdpViewModel.LLILZIL) == null || (mapLJ = interfaceC1053404Aa.LJ("c5815.d0")) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        laneParams.withNotCheckParams(mapLJ);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.0umy] */
    public static final Object invoke$2(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        String str;
        WalletFlowDecision walletFlowDecision = (WalletFlowDecision) obj;
        String str2 = walletFlowDecision.verifyInfo;
        if ((str2 == null || str2.length() == 0) && walletFlowDecision.offlineProcessInfo != null) {
            C1397580mTM c1397580mTM = new C1397580mTM((Context) awS109S1200000_26.l1);
            c1397580mTM.LJII = false;
            PopOutInfo popOutInfo = walletFlowDecision.popOut;
            String str3 = null;
            if (popOutInfo != null) {
                str = popOutInfo.title;
            } else {
                str = null;
            }
            c1397580mTM.LJI(str);
            PopOutInfo popOutInfo2 = walletFlowDecision.popOut;
            if (popOutInfo2 != null) {
                str3 = popOutInfo2.content;
            }
            c1397580mTM.LIZIZ(str3);
            C1238130iKB.LIZ(c1397580mTM, new AwS392S0200000_26(walletFlowDecision, (Context) awS109S1200000_26.l1, 19));
            c1397580mTM.LIZLLL(new AwS392S0200000_26((Context) awS109S1200000_26.l1, (BaseRegisterManager) awS109S1200000_26.l2, 20));
            new C1397510mTF(c1397580mTM).LIZLLL();
        } else {
            final BaseRegisterManager baseRegisterManager = (BaseRegisterManager) awS109S1200000_26.l2;
            String str4 = awS109S1200000_26.s0;
            final Context context = (Context) awS109S1200000_26.l1;
            baseRegisterManager.LIZIZ(str4, (C19EG) context, walletFlowDecision, new InterfaceC1717210umt() { // from class: X.0umy
                @Override // X.InterfaceC1717210umt
                public final void LIZ() {
                }

                @Override // X.InterfaceC1717210umt
                public final void LIZIZ() {
                    BaseRegisterManager baseRegisterManager2 = baseRegisterManager;
                    BaseRegisterManager baseRegisterManager3 = baseRegisterManager;
                    new C1717190umr(baseRegisterManager2, (C19EG) context, C13LP.LLIIII(baseRegisterManager2.LLJ), 0, baseRegisterManager3.LLJIJIL, (String) null, 96).LIZJ(null, baseRegisterManager3.LLJILJIL, null);
                }
            });
            SmartRouter.removeInterceptor((BaseRegisterManager) awS109S1200000_26.l2);
            ((Activity) ((Context) awS109S1200000_26.l1)).finish();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("input_box_name", awS109S1200000_26.s0);
        String str = CardStruct.IStatusCode.DEFAULT;
        laneParams.plusAssign("stay_time", CardStruct.IStatusCode.DEFAULT);
        if (!Intrinsics.LJFF(awS109S1200000_26.s0, "address_searchbar")) {
            laneParams.plusAssign("input_method", "");
            laneParams.plusAssign("has_normal_input", C893803eS.LIZ(((PhoneInputItemViewHolder) awS109S1200000_26.l1).LLJJIJIL));
            laneParams.plusAssign("has_auto_input", "1");
            C1746460vY4 c1746460vY4 = C1746460vY4.LIZ;
            String str2 = awS109S1200000_26.s0;
            c1746460vY4.getClass();
            laneParams.plusAssign("has_sug_input", C893803eS.LIZ(C1746460vY4.LIZJ(str2)));
            if (C1745310vWD.LIZ((C1745340vWG) awS109S1200000_26.l2)) {
                str = "1";
            }
            laneParams.plusAssign("is_valid", str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        ((LaneParams) obj).plusAssign("PREFETCH_RESULT", (ProductPackStruct) awS109S1200000_26.l1);
        C960603pE.LJIIJ((Bundle) awS109S1200000_26.l2, awS109S1200000_26.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        ((LaneParams) obj).plusAssign("PREFETCH_RESULT", (ProductPackStruct) awS109S1200000_26.l1);
        ((Intent) awS109S1200000_26.l2).putExtra("lib_track_rtn_id", awS109S1200000_26.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        C1731550vA1 c1731550vA1 = (C1731550vA1) obj;
        String str = awS109S1200000_26.s0;
        SizeChartTemplateEditViewModel sizeChartTemplateEditViewModel = (SizeChartTemplateEditViewModel) awS109S1200000_26.l1;
        String str2 = ((C1731550vA1) awS109S1200000_26.l2).LLILLL;
        sizeChartTemplateEditViewModel.getClass();
        boolean zVQ2 = SizeChartTemplateEditViewModel.vQ2(str, str2);
        String str3 = c1731550vA1.LL;
        String str4 = c1731550vA1.LLILLL;
        String str5 = c1731550vA1.LLILZ;
        String str6 = c1731550vA1.LLILZIL;
        String str7 = c1731550vA1.LLILZLL;
        String str8 = c1731550vA1.LLIZ;
        String str9 = c1731550vA1.LLIZLLLIL;
        String str10 = c1731550vA1.LLJ;
        boolean z = c1731550vA1.LLJIJIL;
        boolean z2 = c1731550vA1.LLJILJIL;
        boolean z3 = c1731550vA1.LLJILJILJ;
        c1731550vA1.getClass();
        return C1731550vA1.LIZ(str3, str, str4, str5, str6, str7, str8, str9, str10, zVQ2, z, z2, z3);
    }

    public static final Object invoke$24(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        C1731550vA1 c1731550vA1 = (C1731550vA1) obj;
        String str = awS109S1200000_26.s0;
        SizeChartTemplateEditViewModel sizeChartTemplateEditViewModel = (SizeChartTemplateEditViewModel) awS109S1200000_26.l1;
        String str2 = ((C1731550vA1) awS109S1200000_26.l2).LLILZIL;
        sizeChartTemplateEditViewModel.getClass();
        boolean zVQ2 = SizeChartTemplateEditViewModel.vQ2(str, str2);
        String str3 = c1731550vA1.LL;
        String str4 = c1731550vA1.LLILLJJLI;
        String str5 = c1731550vA1.LLILLL;
        String str6 = c1731550vA1.LLILZIL;
        String str7 = c1731550vA1.LLILZLL;
        String str8 = c1731550vA1.LLIZ;
        String str9 = c1731550vA1.LLIZLLLIL;
        String str10 = c1731550vA1.LLJ;
        boolean z = c1731550vA1.LLJI;
        boolean z2 = c1731550vA1.LLJILJIL;
        boolean z3 = c1731550vA1.LLJILJILJ;
        c1731550vA1.getClass();
        return C1731550vA1.LIZ(str3, str4, str5, str, str6, str7, str8, str9, str10, z, zVQ2, z2, z3);
    }

    public static final Object invoke$25(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        C1731550vA1 c1731550vA1 = (C1731550vA1) obj;
        String str = awS109S1200000_26.s0;
        SizeChartTemplateEditViewModel sizeChartTemplateEditViewModel = (SizeChartTemplateEditViewModel) awS109S1200000_26.l1;
        String str2 = ((C1731550vA1) awS109S1200000_26.l2).LLIZ;
        sizeChartTemplateEditViewModel.getClass();
        boolean zVQ2 = SizeChartTemplateEditViewModel.vQ2(str, str2);
        String str3 = c1731550vA1.LL;
        String str4 = c1731550vA1.LLILLJJLI;
        String str5 = c1731550vA1.LLILLL;
        String str6 = c1731550vA1.LLILZ;
        String str7 = c1731550vA1.LLILZIL;
        String str8 = c1731550vA1.LLIZ;
        String str9 = c1731550vA1.LLIZLLLIL;
        String str10 = c1731550vA1.LLJ;
        boolean z = c1731550vA1.LLJI;
        boolean z2 = c1731550vA1.LLJIJIL;
        boolean z3 = c1731550vA1.LLJILJILJ;
        c1731550vA1.getClass();
        return C1731550vA1.LIZ(str3, str4, str5, str6, str7, str, str8, str9, str10, z, z2, zVQ2, z3);
    }

    public static final Object invoke$26(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        C1731550vA1 c1731550vA1 = (C1731550vA1) obj;
        String str = awS109S1200000_26.s0;
        SizeChartTemplateEditViewModel sizeChartTemplateEditViewModel = (SizeChartTemplateEditViewModel) awS109S1200000_26.l1;
        String str2 = ((C1731550vA1) awS109S1200000_26.l2).LLJ;
        sizeChartTemplateEditViewModel.getClass();
        boolean zVQ2 = SizeChartTemplateEditViewModel.vQ2(str, str2);
        String str3 = c1731550vA1.LL;
        String str4 = c1731550vA1.LLILLJJLI;
        String str5 = c1731550vA1.LLILLL;
        String str6 = c1731550vA1.LLILZ;
        String str7 = c1731550vA1.LLILZIL;
        String str8 = c1731550vA1.LLILZLL;
        String str9 = c1731550vA1.LLIZ;
        String str10 = c1731550vA1.LLJ;
        boolean z = c1731550vA1.LLJI;
        boolean z2 = c1731550vA1.LLJIJIL;
        boolean z3 = c1731550vA1.LLJILJIL;
        c1731550vA1.getClass();
        return C1731550vA1.LIZ(str3, str4, str5, str6, str7, str8, str9, str, str10, z, z2, z3, zVQ2);
    }

    public static final Object invoke$27(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        C1731550vA1 c1731550vA1 = (C1731550vA1) obj;
        String str = awS109S1200000_26.s0;
        SizeChartTemplateEditViewModel sizeChartTemplateEditViewModel = (SizeChartTemplateEditViewModel) awS109S1200000_26.l1;
        String str2 = ((C1731550vA1) awS109S1200000_26.l2).LLILLJJLI;
        sizeChartTemplateEditViewModel.getClass();
        boolean zVQ2 = SizeChartTemplateEditViewModel.vQ2(str2, str);
        String str3 = c1731550vA1.LL;
        String str4 = c1731550vA1.LLILLJJLI;
        String str5 = c1731550vA1.LLILZ;
        String str6 = c1731550vA1.LLILZIL;
        String str7 = c1731550vA1.LLILZLL;
        String str8 = c1731550vA1.LLIZ;
        String str9 = c1731550vA1.LLIZLLLIL;
        String str10 = c1731550vA1.LLJ;
        boolean z = c1731550vA1.LLJIJIL;
        boolean z2 = c1731550vA1.LLJILJIL;
        boolean z3 = c1731550vA1.LLJILJILJ;
        c1731550vA1.getClass();
        return C1731550vA1.LIZ(str3, str4, str, str5, str6, str7, str8, str9, str10, zVQ2, z, z2, z3);
    }

    public static final Object invoke$28(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        C1731550vA1 c1731550vA1 = (C1731550vA1) obj;
        String str = awS109S1200000_26.s0;
        SizeChartTemplateEditViewModel sizeChartTemplateEditViewModel = (SizeChartTemplateEditViewModel) awS109S1200000_26.l1;
        String str2 = ((C1731550vA1) awS109S1200000_26.l2).LLILZ;
        sizeChartTemplateEditViewModel.getClass();
        boolean zVQ2 = SizeChartTemplateEditViewModel.vQ2(str2, str);
        String str3 = c1731550vA1.LL;
        String str4 = c1731550vA1.LLILLJJLI;
        String str5 = c1731550vA1.LLILLL;
        String str6 = c1731550vA1.LLILZ;
        String str7 = c1731550vA1.LLILZLL;
        String str8 = c1731550vA1.LLIZ;
        String str9 = c1731550vA1.LLIZLLLIL;
        String str10 = c1731550vA1.LLJ;
        boolean z = c1731550vA1.LLJI;
        boolean z2 = c1731550vA1.LLJILJIL;
        boolean z3 = c1731550vA1.LLJILJILJ;
        c1731550vA1.getClass();
        return C1731550vA1.LIZ(str3, str4, str5, str6, str, str7, str8, str9, str10, z, zVQ2, z2, z3);
    }

    public static final Object invoke$29(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        C1731550vA1 c1731550vA1 = (C1731550vA1) obj;
        String str = awS109S1200000_26.s0;
        SizeChartTemplateEditViewModel sizeChartTemplateEditViewModel = (SizeChartTemplateEditViewModel) awS109S1200000_26.l1;
        String str2 = ((C1731550vA1) awS109S1200000_26.l2).LLILZLL;
        sizeChartTemplateEditViewModel.getClass();
        boolean zVQ2 = SizeChartTemplateEditViewModel.vQ2(str2, str);
        String str3 = c1731550vA1.LL;
        String str4 = c1731550vA1.LLILLJJLI;
        String str5 = c1731550vA1.LLILLL;
        String str6 = c1731550vA1.LLILZ;
        String str7 = c1731550vA1.LLILZIL;
        String str8 = c1731550vA1.LLILZLL;
        String str9 = c1731550vA1.LLIZLLLIL;
        String str10 = c1731550vA1.LLJ;
        boolean z = c1731550vA1.LLJI;
        boolean z2 = c1731550vA1.LLJIJIL;
        boolean z3 = c1731550vA1.LLJILJILJ;
        c1731550vA1.getClass();
        return C1731550vA1.LIZ(str3, str4, str5, str6, str7, str8, str, str9, str10, z, z2, zVQ2, z3);
    }

    public static final Object invoke$3(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        AddressEditState addressEditState = (AddressEditState) obj;
        return addressEditState.copy(addressEditState.inputItemFirstTimeLoadingStatus, addressEditState.changeRegionLoadingStatus, addressEditState.deleteLoadingStatus, (Integer) awS109S1200000_26.l1, addressEditState.previewLoadingStatus, addressEditState.pudoAddressVO, addressEditState.inputItemVOList, addressEditState.inputItemPreviewVOList, addressEditState.emailHintVisible, addressEditState.privacyPolicyStatement, addressEditState.showExceptionUX, addressEditState.addressRightStatement, addressEditState.isAllKeyItemFilled, addressEditState.editDeliveryInstruction, addressEditState.scrollerPos, addressEditState.noticeBubbles, addressEditState.topText, new C948003nC<>(new ChangeOnOrderStruct((Integer) awS109S1200000_26.l2, awS109S1200000_26.s0)), addressEditState.clientConfig, addressEditState.toastMessage, addressEditState.locationPermissionStatus, addressEditState.recommendCandInputData, addressEditState.currentLocation, addressEditState.isClickUseLocation, addressEditState.hasFineLocationPermission, addressEditState.autoFillLocation, addressEditState.needToastGetLocationError, addressEditState.isUseMyLocationLoading, addressEditState.isDontKnowZipCode);
    }

    public static final Object invoke$30(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        C1731550vA1 c1731550vA1 = (C1731550vA1) obj;
        String str = awS109S1200000_26.s0;
        SizeChartTemplateEditViewModel sizeChartTemplateEditViewModel = (SizeChartTemplateEditViewModel) awS109S1200000_26.l1;
        String str2 = ((C1731550vA1) awS109S1200000_26.l2).LLIZLLLIL;
        sizeChartTemplateEditViewModel.getClass();
        boolean zVQ2 = SizeChartTemplateEditViewModel.vQ2(str2, str);
        String str3 = c1731550vA1.LL;
        String str4 = c1731550vA1.LLILLJJLI;
        String str5 = c1731550vA1.LLILLL;
        String str6 = c1731550vA1.LLILZ;
        String str7 = c1731550vA1.LLILZIL;
        String str8 = c1731550vA1.LLILZLL;
        String str9 = c1731550vA1.LLIZ;
        String str10 = c1731550vA1.LLIZLLLIL;
        boolean z = c1731550vA1.LLJI;
        boolean z2 = c1731550vA1.LLJIJIL;
        boolean z3 = c1731550vA1.LLJILJIL;
        c1731550vA1.getClass();
        return C1731550vA1.LIZ(str3, str4, str5, str6, str7, str8, str9, str10, str, z, z2, z3, zVQ2);
    }

    public static final Object invoke$31(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        Object obj2;
        String str;
        LaneParams laneParams = (LaneParams) obj;
        HashMap<String, Object> map = ((AddressEditViewModel) awS109S1200000_26.l1).LLJJIJIIJIL;
        Object obj3 = null;
        if (map != null) {
            obj2 = map.get("previous_page");
        } else {
            obj2 = null;
        }
        laneParams.plusAssign("previous_page", obj2);
        laneParams.plusAssign("is_fullscreen", Integer.valueOf(((AddressEditViewModel) awS109S1200000_26.l1).LLLLLIL ? 1 : 0));
        laneParams.plusAssign("fill_type", ((AddressEditViewModel) awS109S1200000_26.l1).LLLLL.type());
        laneParams.plusAssign("page_name", ((AddressEditViewModel) awS109S1200000_26.l1).getPageName());
        HashMap<String, Object> map2 = ((AddressEditViewModel) awS109S1200000_26.l1).LLJJIJIIJIL;
        if (map2 != null) {
            obj3 = map2.get("entrance_info");
        }
        laneParams.plusAssign("entrance_info", obj3);
        laneParams.plusAssign("drop_down_list_name", awS109S1200000_26.s0);
        laneParams.plusAssign("item_num", 1);
        if (C1745470vWT.LIZ(awS109S1200000_26.s0) && (str = ((CandInputDataOptions) awS109S1200000_26.l2).report) != null) {
            laneParams.plusAssign("sever_data_report", str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$32(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        Object obj2;
        String str;
        LaneParams laneParams = (LaneParams) obj;
        HashMap<String, Object> map = ((AddressEditViewModel) awS109S1200000_26.l1).LLJJIJIIJIL;
        Object obj3 = null;
        if (map != null) {
            obj2 = map.get("previous_page");
        } else {
            obj2 = null;
        }
        laneParams.plusAssign("previous_page", obj2);
        laneParams.plusAssign("is_fullscreen", Integer.valueOf(((AddressEditViewModel) awS109S1200000_26.l1).LLLLLIL ? 1 : 0));
        laneParams.plusAssign("fill_type", ((AddressEditViewModel) awS109S1200000_26.l1).LLLLL.type());
        laneParams.plusAssign("page_name", ((AddressEditViewModel) awS109S1200000_26.l1).getPageName());
        HashMap<String, Object> map2 = ((AddressEditViewModel) awS109S1200000_26.l1).LLJJIJIIJIL;
        if (map2 != null) {
            obj3 = map2.get("entrance_info");
        }
        laneParams.plusAssign("entrance_info", obj3);
        laneParams.plusAssign("drop_down_list_name", awS109S1200000_26.s0);
        laneParams.plusAssign("item_num", 1);
        laneParams.plusAssign("action_type", "auto");
        laneParams.plusAssign("rank", 0);
        if (C1745470vWT.LIZ(awS109S1200000_26.s0) && (str = ((CandInputDataOptions) awS109S1200000_26.l2).report) != null) {
            laneParams.plusAssign("sever_data_report", str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$33(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        ((C1753660vjg) awS109S1200000_26.l1).LIZIZ(laneParams, (BundleInfo) awS109S1200000_26.l2);
        C1753660vjg c1753660vjg = (C1753660vjg) awS109S1200000_26.l1;
        BundleInfo bundleInfo = (BundleInfo) awS109S1200000_26.l2;
        c1753660vjg.getClass();
        C1753660vjg.LIZ(laneParams, bundleInfo);
        laneParams.plusAssign("click_area", awS109S1200000_26.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$34(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("step", "load_failed");
        laneParams.plusAssign("timestamp", Long.valueOf(System.currentTimeMillis()));
        laneParams.plusAssign("schema_url", awS109S1200000_26.s0);
        laneParams.plusAssign("load_time", Long.valueOf(SystemClock.elapsedRealtime() - ((ReviewLynxAssem) awS109S1200000_26.l1).LLJILJIL));
        Integer num = ((C1542120qEU) awS109S1200000_26.l2).LIZ;
        if (num != null) {
            laneParams.plusAssign("err_code", Integer.valueOf(num.intValue()));
        }
        String str = ((C1542120qEU) awS109S1200000_26.l2).LIZIZ;
        if (str != null) {
            laneParams.plusAssign("err_msg", str);
        }
        laneParams.plusAssign("product_id", ((ReviewLynxAssem) awS109S1200000_26.l1).Jo().LLILZLL);
        return Unit.LIZ;
    }

    public static final Object invoke$35(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        DistrictPickerState districtPickerState = (DistrictPickerState) obj;
        DistrictPickerViewModel districtPickerViewModel = (DistrictPickerViewModel) awS109S1200000_26.l1;
        List list = (List) awS109S1200000_26.l2;
        districtPickerViewModel.getClass();
        List<? extends Object> listKR2 = DistrictPickerViewModel.kR2(list);
        String str = awS109S1200000_26.s0;
        String str2 = "";
        if (str != null) {
            str2 = str;
        }
        return districtPickerState.copy(str2, str2, listKR2, districtPickerState.selectedDistrict, -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$36(kotlin.jvm.internal.AwS109S1200000_26 r9, java.lang.Object r10) {
        /*
            X.0vLY r10 = (X.C1738700vLY) r10
            java.lang.Object r0 = r9.l1
            X.14Gf r0 = (X.InterfaceC20236714Gf) r0
            boolean r0 = r0.isActive()
            if (r0 == 0) goto Lab
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.lang.String r1 = "permission"
            java.lang.String r0 = r9.s0
            r7.put(r1, r0)
            r6 = 0
            if (r10 == 0) goto Lae
            java.lang.Double r5 = r10.LIZ
            java.lang.Double r6 = r10.LIZIZ
        L1f:
            java.lang.String r8 = ""
            if (r5 == 0) goto L47
            double r0 = r5.doubleValue()
            boolean r0 = java.lang.Double.isNaN(r0)
            if (r0 != 0) goto L47
            double r3 = r5.doubleValue()
            r1 = -4582834833314545664(0xc066800000000000, double:-180.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L47
            double r3 = r5.doubleValue()
            r1 = 4640537203540230144(0x4066800000000000, double:180.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L48
        L47:
            r5 = r8
        L48:
            java.lang.String r0 = "longitude"
            r7.put(r0, r5)
            if (r6 == 0) goto L73
            double r0 = r6.doubleValue()
            boolean r0 = java.lang.Double.isNaN(r0)
            if (r0 != 0) goto L73
            double r3 = r6.doubleValue()
            r1 = -4587338432941916160(0xc056800000000000, double:-90.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L73
            double r3 = r6.doubleValue()
            r1 = 4636033603912859648(0x4056800000000000, double:90.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L74
        L73:
            r6 = r8
        L74:
            java.lang.String r0 = "latitude"
            r7.put(r0, r6)
            java.lang.Object r0 = r9.l1
            X.14Gf r0 = (X.InterfaceC20236714Gf) r0
            X.C189200o6.m2constructorimpl(r7)
            r0.resumeWith(r7)
            r0 = 2
            kotlin.Pair[] r3 = new kotlin.Pair[r0]
            java.lang.Object r0 = r9.l2
            X.0NnP r0 = (X.C604530NnP) r0
            java.lang.String r2 = r0.LIZ
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "entrance"
            r1.<init>(r0, r2)
            r0 = 0
            r3[r0] = r1
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r1 = "status"
            java.lang.String r0 = "success"
            r2.<init>(r1, r0)
            r0 = 1
            r3[r0] = r2
            java.util.Map r1 = X.C2097608Jq.LJIIJ(r3)
            java.lang.String r0 = "collect_gps"
            X.AnonymousClass0678.LIZ(r0, r1)
        Lab:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Lae:
            r5 = r6
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS109S1200000_26.invoke$36(kotlin.jvm.internal.AwS109S1200000_26, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$37(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        String str;
        String str2;
        Object obj2;
        String str3;
        String str4;
        HashMap<String, Object> mapLJIIJ;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("button_name", awS109S1200000_26.s0);
        if (((AddressEditFragment) awS109S1200000_26.l1).mS().LLLLLIL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        laneParams.plusAssign("is_fullscreen", str);
        if (((AddressEditFragment) awS109S1200000_26.l1).mS().LLLLLIL) {
            str2 = "full_screen";
        } else {
            str2 = "seven_screen";
        }
        laneParams.plusAssign("page_show_type", str2);
        AddressPageStarter.AddressEditEnterParams addressEditEnterParams = (AddressPageStarter.AddressEditEnterParams) awS109S1200000_26.l2;
        String str5 = null;
        if (addressEditEnterParams != null && (str4 = addressEditEnterParams.trackParams) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str4)) != null) {
            obj2 = mapLJIIJ.get("previous_page");
        } else {
            obj2 = null;
        }
        laneParams.plusAssign("source_previous_page", obj2);
        AddressPageStarter.AddressEditEnterParams addressEditEnterParams2 = (AddressPageStarter.AddressEditEnterParams) awS109S1200000_26.l2;
        if (addressEditEnterParams2 != null) {
            str5 = addressEditEnterParams2.triggerEvent;
        }
        laneParams.plusAssign("trigger_event", str5);
        AddressEditFragment addressEditFragment = (AddressEditFragment) awS109S1200000_26.l1;
        if (addressEditFragment.LLJJJJ) {
            if (Intrinsics.LJFF(addressEditFragment.mS().LLIZLLLIL, Boolean.TRUE)) {
                str3 = "default_on";
            } else {
                str3 = "default_off";
            }
            laneParams.put("pudo_default_status", str3);
        }
        laneParams.putAll(((AddressEditFragment) awS109S1200000_26.l1).mS().LLLILZJ.LIZ("c3631.d5885"));
        return Unit.LIZ;
    }

    public static final Object invoke$38(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        C1746460vY4 c1746460vY4 = C1746460vY4.LIZ;
        Address address = (Address) awS109S1200000_26.l1;
        List<C1745680vWo> inputItemVOList = ((AddressEditState) obj).getInputItemVOList();
        String str = awS109S1200000_26.s0;
        Map map = (Map) awS109S1200000_26.l2;
        c1746460vY4.getClass();
        C1746460vY4.LJIIIIZZ(address, inputItemVOList, new AwS675S0100000_26(C1746460vY4.LIZ(address, str, map), 15));
        return Unit.LIZ;
    }

    public static final Object invoke$39(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        C1746460vY4 c1746460vY4 = C1746460vY4.LIZ;
        Address address = (Address) awS109S1200000_26.l1;
        List<C1745680vWo> inputItemVOList = ((AddressEditState) obj).getInputItemVOList();
        String str = awS109S1200000_26.s0;
        Map map = (Map) awS109S1200000_26.l2;
        c1746460vY4.getClass();
        C1746460vY4.LJIIIIZZ(address, inputItemVOList, new AwS675S0100000_26(C1746460vY4.LIZ(address, str, map), 15));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        HashMap map = (HashMap) obj;
        map.put("sea_one_step_shop_info", (C719202rO) awS109S1200000_26.l1);
        String str = awS109S1200000_26.s0;
        if (str == null) {
            str = "";
        }
        map.put("sea_one_step_free_gift_title", str);
        map.put("sea_one_step_track_message", (Map) awS109S1200000_26.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$40(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        Object obj2;
        int i;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("page_name", ((C1745480vWU) awS109S1200000_26.l1).LIZ.getPageName());
        HashMap map = (HashMap) awS109S1200000_26.l2;
        Object obj3 = null;
        if (map != null) {
            obj2 = map.get("previous_page");
        } else {
            obj2 = null;
        }
        laneParams.plusAssign("previous_page", obj2);
        HashMap map2 = (HashMap) awS109S1200000_26.l2;
        if (map2 != null) {
            obj3 = map2.get("entrance_info");
        }
        laneParams.plusAssign("entrance_info", obj3);
        laneParams.plusAssign("fill_type", ((C1745480vWU) awS109S1200000_26.l1).LIZ.LLLLL.type());
        laneParams.plusAssign("input_box_name", awS109S1200000_26.s0);
        C0OFE.LIZ("is_fullscreen", Integer.valueOf(((C1745480vWU) awS109S1200000_26.l1).LIZ.LLLLLIL ? 1 : 0));
        if (((C1745480vWU) awS109S1200000_26.l1).LIZ.LLLI != null) {
            i = 1;
        } else {
            i = 0;
        }
        laneParams.plusAssign("has_auto_input", Integer.valueOf(i));
        return Unit.LIZ;
    }

    public static final Object invoke$41(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS109S1200000_26.l1).LIZIZ);
        Integer num = (Integer) awS109S1200000_26.l2;
        if (num != null) {
            laneParams.plusAssign("item_order", Integer.valueOf(num.intValue()));
        }
        C1010603xI.LIZJ(laneParams, awS109S1200000_26.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$42(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        String str;
        StoreLabel storeLabel;
        StoreOfficialLabel storeOfficialLabel;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("entrance_type", "top_bar");
        SellerInfo sellerInfo = (SellerInfo) awS109S1200000_26.l1;
        if (sellerInfo != null && (storeLabel = sellerInfo.storeLabel) != null && (storeOfficialLabel = storeLabel.officialLabel) != null) {
            str = storeOfficialLabel.labelTypeStr;
        } else {
            str = null;
        }
        laneParams.plusAssign("seller_logo_type", str);
        laneParams.plusAssign("badge_type", awS109S1200000_26.s0);
        Map<String, Object> mapLJ = ((PdpHeadNavBarWidget) awS109S1200000_26.l2).LJIJI().LLILZIL.LJ("c35259.d11651");
        if (mapLJ != null) {
            laneParams.withParamsGroup(mapLJ);
        }
        laneParams.plusAssign("source_previous_page", "product_detail");
        return Unit.LIZ;
    }

    public static final Object invoke$43(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        ((C1753650vjf) awS109S1200000_26.l1).LIZIZ(laneParams, (BundleInfo) awS109S1200000_26.l2);
        C1753650vjf c1753650vjf = (C1753650vjf) awS109S1200000_26.l1;
        BundleInfo bundleInfo = (BundleInfo) awS109S1200000_26.l2;
        c1753650vjf.getClass();
        C1753650vjf.LIZ(laneParams, bundleInfo);
        laneParams.plusAssign("click_area", awS109S1200000_26.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        C1748780vbo.LIZIZ((C1748770vbn) obj, "lib_track_builtin_lane_business", new AwS109S1200000_26((C719202rO) awS109S1200000_26.l1, (C719202rO) awS109S1200000_26.s0, (String) awS109S1200000_26.l2, (Map<String, String>) 4));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("bnpl_source_id", ((BnplMiddleActivity) awS109S1200000_26.l1).LLILZLL), new Pair("object_id", awS109S1200000_26.s0), new Pair("button_id", "retry"));
        c1507790pL7.getClass();
        C1507790pL7.LJFF("rd_pipo_middle_click", mapLJIIJ);
        ((Function1) awS109S1200000_26.l2).invoke(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("bnpl_source_id", ((BnplMiddleActivity) awS109S1200000_26.l1).LLILZLL), new Pair("object_id", awS109S1200000_26.s0), new Pair("button_id", "cancel"));
        c1507790pL7.getClass();
        C1507790pL7.LJFF("rd_pipo_middle_click", mapLJIIJ);
        SmartRouter.buildRoute((BnplMiddleActivity) awS109S1200000_26.l1, "//bnpl/middle/cancel").open();
        ((Function1) awS109S1200000_26.l2).invoke(obj);
        ((BnplMiddleActivity) awS109S1200000_26.l1).finish();
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        ((LaneParams) obj).plusAssign("PREFETCH_RESULT", (ProductPackStruct) awS109S1200000_26.l1);
        C960603pE.LJIIJ((Bundle) awS109S1200000_26.l2, awS109S1200000_26.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS109S1200000_26 awS109S1200000_26, Object obj) {
        ((LaneParams) obj).plusAssign("PREFETCH_RESULT", (ProductPackStruct) awS109S1200000_26.l1);
        ((Intent) awS109S1200000_26.l2).putExtra("lib_track_rtn_id", awS109S1200000_26.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S1200000_26(PdpComponentCard pdpComponentCard, PdpViewModel pdpViewModel, int i) {
        super(1);
        this.$t = i;
        this.l1 = pdpComponentCard;
        this.s0 = "claim";
        this.l2 = pdpViewModel;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS109S1200000_26(X.C0X52 r3, com.ss.android.ugc.aweme.pipo.auth.PipoAuthViewModel r4, java.lang.String r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 11 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.l1 = r4
            r1.l2 = r3
            r1.s0 = r5
            r0 = 1
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l1 = r4
            r1.s0 = r5
            r1.l2 = r3
            r0 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS109S1200000_26.<init>(X.0X52, com.ss.android.ugc.aweme.pipo.auth.PipoAuthViewModel, java.lang.String, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS109S1200000_26(com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponentCard r3, com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r4, java.lang.String r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 17 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.l1 = r3
            r1.s0 = r5
            r1.l2 = r4
            r0 = 1
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.s0 = r5
            r1.l1 = r3
            r1.l2 = r4
            r0 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS109S1200000_26.<init>(com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponentCard, com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS109S1200000_26(C719202rO c719202rO, C719202rO c719202rO2, String str, Map<String, String> map) {
        super(1);
        this.$t = map;
        this.l1 = c719202rO;
        this.s0 = c719202rO2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S1200000_26(C1054004Ag c1054004Ag, Integer num, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1054004Ag;
        this.l2 = num;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS109S1200000_26(C1745480vWU c1745480vWU, C1745480vWU c1745480vWU2, HashMap<String, Object> map, String str) {
        super(1);
        this.$t = str;
        this.l1 = c1745480vWU;
        this.l2 = c1745480vWU2;
        this.s0 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S1200000_26(C1753650vjf c1753650vjf, BundleInfo bundleInfo, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1753650vjf;
        this.l2 = bundleInfo;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S1200000_26(C1753660vjg c1753660vjg, BundleInfo bundleInfo, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1753660vjg;
        this.l2 = bundleInfo;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S1200000_26(C1773720wG2 c1773720wG2, View view, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1773720wG2;
        this.l2 = view;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S1200000_26(C2252611DEt c2252611DEt, String str, C604530NnP c604530NnP, int i) {
        super(1);
        this.$t = i;
        this.l1 = c2252611DEt;
        this.s0 = str;
        this.l2 = c604530NnP;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S1200000_26(Context context, BaseRegisterManager baseRegisterManager, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = context;
        this.l2 = baseRegisterManager;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS109S1200000_26(Address address, Address address2, String str, Map<String, ? extends Object> map) {
        super(1);
        this.$t = map;
        this.l1 = address;
        this.s0 = address2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S1200000_26(AddressEditViewModel addressEditViewModel, String str, CandInputDataOptions candInputDataOptions, int i) {
        super(1);
        this.$t = i;
        this.l1 = addressEditViewModel;
        this.s0 = str;
        this.l2 = candInputDataOptions;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS109S1200000_26(BnplMiddleActivity bnplMiddleActivity, BnplMiddleActivity bnplMiddleActivity2, String str, Function1<? super C1397660mTU, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l1 = bnplMiddleActivity;
        this.s0 = bnplMiddleActivity2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S1200000_26(ProductPackStruct productPackStruct, Intent intent, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = productPackStruct;
        this.l2 = intent;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S1200000_26(ProductPackStruct productPackStruct, Bundle bundle, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = productPackStruct;
        this.l2 = bundle;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S1200000_26(SellerInfo sellerInfo, String str, PdpHeadNavBarWidget pdpHeadNavBarWidget, int i) {
        super(1);
        this.$t = i;
        this.l1 = sellerInfo;
        this.s0 = str;
        this.l2 = pdpHeadNavBarWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS109S1200000_26(DistrictPickerViewModel districtPickerViewModel, DistrictPickerViewModel districtPickerViewModel2, List<District> list, String str) {
        super(1);
        this.$t = str;
        this.l1 = districtPickerViewModel;
        this.l2 = districtPickerViewModel2;
        this.s0 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S1200000_26(BillboardSettingsData billboardSettingsData, BillboardGlobalViewModel billboardGlobalViewModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = billboardSettingsData;
        this.l2 = billboardGlobalViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS109S1200000_26(BaseResponse baseResponse, BaseResponse<SubmitPaymentResponse> baseResponse2, String str, Amount amount) {
        super(1);
        this.$t = amount;
        this.l1 = baseResponse;
        this.s0 = baseResponse2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S1200000_26(MobileEffectEditV2Fragment mobileEffectEditV2Fragment, MobileEffectData mobileEffectData, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = mobileEffectEditV2Fragment;
        this.l2 = mobileEffectData;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S1200000_26(EffectEditVM effectEditVM, String str, DraftSavedExtraData draftSavedExtraData, int i) {
        super(1);
        this.$t = i;
        this.l1 = effectEditVM;
        this.s0 = str;
        this.l2 = draftSavedExtraData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S1200000_26(BaseVerifyUIContentAssem baseVerifyUIContentAssem, String str, Runnable runnable, int i) {
        super(1);
        this.$t = i;
        this.l1 = baseVerifyUIContentAssem;
        this.s0 = str;
        this.l2 = runnable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S1200000_26(Integer num, Integer num2, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = num;
        this.l2 = num2;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S1200000_26(String str, AddressEditFragment addressEditFragment, AddressPageStarter.AddressEditEnterParams addressEditEnterParams, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = addressEditFragment;
        this.l2 = addressEditEnterParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S1200000_26(String str, PhoneInputItemViewHolder phoneInputItemViewHolder, C1745340vWG c1745340vWG, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = phoneInputItemViewHolder;
        this.l2 = c1745340vWG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S1200000_26(String str, ReviewLynxAssem reviewLynxAssem, C1542120qEU c1542120qEU, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = reviewLynxAssem;
        this.l2 = c1542120qEU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S1200000_26(String str, SizeChartTemplateEditViewModel sizeChartTemplateEditViewModel, C1731550vA1 c1731550vA1, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = sizeChartTemplateEditViewModel;
        this.l2 = c1731550vA1;
    }
}
