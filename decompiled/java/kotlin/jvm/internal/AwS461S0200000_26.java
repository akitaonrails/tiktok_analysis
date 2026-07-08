package kotlin.jvm.internal;

import X.AnonymousClass0678;
import X.C013C;
import X.C049X;
import X.C04CK;
import X.C09AY;
import X.C0PEM;
import X.C0QSJ;
import X.C1010603xI;
import X.C1054004Ag;
import X.C1054804Ao;
import X.C1251150ifB;
import X.C1326490kch;
import X.C1697810uHb;
import X.C1708990uZd;
import X.C1709070uZl;
import X.C1709080uZm;
import X.C1709220ua0;
import X.C1709570uaZ;
import X.C1709820uay;
import X.C1709880ub4;
import X.C1713570uh1;
import X.C1714230ui5;
import X.C1714410uiN;
import X.C1714660uim;
import X.C1716510ull;
import X.C1716670um1;
import X.C1717770unn;
import X.C1718900upc;
import X.C1731890vAZ;
import X.C1738680vLW;
import X.C1739410vMh;
import X.C1743360vT4;
import X.C1748720vbi;
import X.C1753840vjy;
import X.C1755690vmx;
import X.C1759650vtL;
import X.C1759880vti;
import X.C189200o6;
import X.C1909107dp;
import X.C19EG;
import X.C2097608Jq;
import X.C2252611DEt;
import X.C23250099c;
import X.C420290Gdv;
import X.C5182020e;
import X.C604530NnP;
import X.C687700QyG;
import X.C724240Sb0;
import X.C770702zh;
import X.C786410Ut5;
import X.C958103op;
import X.EnumC1709200uZy;
import X.EnumC1743310vSz;
import X.EnumC1759660vtM;
import X.EnumC1759910vtl;
import X.InterfaceC1731910vAb;
import X.InterfaceC1748810vbr;
import X.InterfaceC1752680vi6;
import X.InterfaceC1753900vk4;
import X.InterfaceC1755040vlu;
import X.InterfaceC1757900vqW;
import X.InterfaceC1757910vqX;
import X.InterfaceC20236714Gf;
import Y.ARunnableS95S0200000_26;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.pipo.verify.base.model.VerifyDetail;
import com.bytedance.router.SmartRouter;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.component.collect.CollectInfoPageFragment;
import com.ss.android.ugc.aweme.component.guide.GuidePageAssem;
import com.ss.android.ugc.aweme.component.guide.InfoCollectGuideModel;
import com.ss.android.ugc.aweme.component.phone.PhoneNumberAssem;
import com.ss.android.ugc.aweme.component.phone.PhoneNumberVM;
import com.ss.android.ugc.aweme.component.phone.ttmobile.CollectMobileFromTTAssem;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.MessageCenterAssem;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.TradeEntranceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpButtonExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.TabBarItemVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.TabBarTab;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.VoucherInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.components.button.ButtonComponentData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.components.button.ButtonComponentModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponent;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponentAction;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.PdpBodyAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.PdpBodyVM;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.BannerData;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.BannerFrame;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.CartEntry;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.ServerConfigStyle;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.title.ECTrendingTitleAssem;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierEnterParams;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierViewModel;
import com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.fragment.AutofillAssem;
import com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditAssem;
import com.ss.android.ugc.aweme.prop.mobileefffect.edit.EffectEditV2Assem;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.verify.BaseVerifyFragment;
import com.ss.android.ugc.aweme.verify.ocr.OCRVerifyGuideAssem;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes27.dex */
public class AwS461S0200000_26 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case 16:
                return invoke$16(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS461S0200000_26(C013C c013c, ECTrendingTitleAssem eCTrendingTitleAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = c013c;
        this.l1 = eCTrendingTitleAssem;
    }

    public static final Object invoke$0(AwS461S0200000_26 awS461S0200000_26, Object obj, Object obj2) {
        CompletionBlock completionBlock = (CompletionBlock) awS461S0200000_26.l0;
        C1731890vAZ c1731890vAZ = (C1731890vAZ) awS461S0200000_26.l1;
        c1731890vAZ.LIZIZ = (String) obj2;
        c1731890vAZ.LIZ = (String) obj;
        completionBlock.onSuccess(c1731890vAZ, "");
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS461S0200000_26 awS461S0200000_26, Object obj, Object obj2) {
        String str;
        ButtonComponentModel buttonComponentModel;
        PdpComponentAction pdpComponentAction;
        PopUpButtonExtraInfo popUpButtonExtraInfo;
        VoucherInfo voucherInfo;
        if (((Boolean) obj).booleanValue()) {
            PdpComponent pdpComponent = ((C1759880vti) awS461S0200000_26.l0).LIZLLL;
            if (pdpComponent == null || (pdpComponentAction = pdpComponent.action) == null || (popUpButtonExtraInfo = pdpComponentAction.extraInfo) == null || (voucherInfo = popUpButtonExtraInfo.voucherInfo) == null || (str = voucherInfo.voucherTypeId) == null) {
                str = "";
            }
            if (obj2 != null) {
                ButtonComponentData buttonComponentData = (ButtonComponentData) awS461S0200000_26.l1;
                C1759880vti c1759880vti = (C1759880vti) awS461S0200000_26.l0;
                if (Intrinsics.LJFF(obj2, str) && buttonComponentData != null && (buttonComponentModel = buttonComponentData.nextButton) != null) {
                    c1759880vti.LIZJ(buttonComponentModel.text, buttonComponentModel.buttonStyle);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS461S0200000_26 awS461S0200000_26, Object obj, Object obj2) {
        ((CollectMobileFromTTAssem) awS461S0200000_26.l0).Oo("Privacy Policy", null);
        C1716510ull.LIZIZ(C1716510ull.LIZ, (C19EG) awS461S0200000_26.l1, (String) obj2, false, false, false, ((CollectMobileFromTTAssem) awS461S0200000_26.l0).Jo().LLILLL, "pipo_credit_wallet", null, null, 412);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS461S0200000_26 awS461S0200000_26, Object obj, Object obj2) {
        String str;
        String str2;
        String str3;
        String str4 = (String) obj2;
        C1716670um1 c1716670um1 = C1716670um1.LIZ;
        boolean zJo = ((GuidePageAssem) awS461S0200000_26.l0).Jo();
        c1716670um1.getClass();
        if (zJo) {
            str = "MOBILE";
        } else {
            str = "PIN";
        }
        C1716670um1.LIZIZ(str, "url");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        GuidePageAssem guidePageAssem = (GuidePageAssem) awS461S0200000_26.l0;
        InfoCollectGuideModel infoCollectGuideModel = guidePageAssem.Go().LLILZLL;
        String str5 = "";
        if (infoCollectGuideModel == null || (str2 = infoCollectGuideModel.merchantId) == null) {
            str2 = "";
        }
        linkedHashMap.put("merchant_id", str2);
        InfoCollectGuideModel infoCollectGuideModel2 = guidePageAssem.Go().LLILZLL;
        if (infoCollectGuideModel2 != null && (str3 = infoCollectGuideModel2.merchantUserId) != null) {
            str5 = str3;
        }
        linkedHashMap.put("merchant_user_id", str5);
        linkedHashMap.put("priority_region", C1717770unn.LJIIIIZZ().getCurrentRegionCode());
        C1718900upc c1718900upc = C1718900upc.LIZ;
        C19EG c19eg = (C19EG) awS461S0200000_26.l1;
        c1718900upc.getClass();
        C1718900upc.LJFF(c19eg, str4, linkedHashMap, false);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS461S0200000_26 awS461S0200000_26, Object obj, Object obj2) {
        String str;
        String str2;
        String str3 = (String) obj2;
        C1716670um1 c1716670um1 = C1716670um1.LIZ;
        String strSR = ((CollectInfoPageFragment) awS461S0200000_26.l0).SR();
        c1716670um1.getClass();
        C1716670um1.LIZIZ(strSR, "url");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        CollectInfoPageFragment collectInfoPageFragment = (CollectInfoPageFragment) awS461S0200000_26.l0;
        InfoCollectGuideModel infoCollectGuideModel = collectInfoPageFragment.LLJILJIL;
        String str4 = "";
        if (infoCollectGuideModel == null || (str = infoCollectGuideModel.merchantId) == null) {
            str = "";
        }
        linkedHashMap.put("merchant_id", str);
        InfoCollectGuideModel infoCollectGuideModel2 = collectInfoPageFragment.LLJILJIL;
        if (infoCollectGuideModel2 != null && (str2 = infoCollectGuideModel2.merchantUserId) != null) {
            str4 = str2;
        }
        linkedHashMap.put("merchant_user_id", str4);
        linkedHashMap.put("priority_region", C1717770unn.LJIIIIZZ().getCurrentRegionCode());
        C1718900upc c1718900upc = C1718900upc.LIZ;
        C19EG c19eg = (C19EG) awS461S0200000_26.l1;
        c1718900upc.getClass();
        C1718900upc.LJFF(c19eg, str3, linkedHashMap, false);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS461S0200000_26 awS461S0200000_26, Object obj, Object obj2) {
        EnumC1709200uZy enumC1709200uZy;
        boolean z;
        boolean z2;
        C1709220ua0 c1709220ua0;
        Function0<Unit> function0;
        C1709220ua0 c1709220ua02;
        Function0<Unit> function02;
        C1708990uZd c1708990uZd;
        C1709070uZl c1709070uZl;
        int iIntValue = ((Number) obj).intValue();
        String str = (String) obj2;
        CashierViewModel cashierViewModel = ((C1709820uay) awS461S0200000_26.l0).LL;
        Context context = ((C1709880ub4) awS461S0200000_26.l1).getContext();
        CashierEnterParams cashierEnterParams = cashierViewModel.LL;
        if (cashierEnterParams != null && (c1709070uZl = cashierEnterParams.LIZIZ) != null) {
            enumC1709200uZy = c1709070uZl.LIZIZ;
        } else {
            enumC1709200uZy = null;
        }
        if (enumC1709200uZy == EnumC1709200uZy.PAY_NOW) {
            z = true;
        } else {
            z = false;
        }
        if (cashierEnterParams != null && (c1708990uZd = cashierEnterParams.LIZJ) != null && c1708990uZd.LJIILIIL) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            if (C1697810uHb.LJIIJJI(0, 3).contains(Integer.valueOf(iIntValue))) {
                cashierViewModel.setStateImmediate(AFwS268S0000000_26.get$arr$(426));
                C1709570uaZ c1709570uaZ = cashierViewModel.LLILLJJLI;
                if (c1709570uaZ != null) {
                    c1709570uaZ.LJJJLL();
                }
                CashierEnterParams cashierEnterParams2 = cashierViewModel.LL;
                if (cashierEnterParams2 != null && (c1709220ua02 = cashierEnterParams2.LJ) != null && (function02 = c1709220ua02.LIZ) != null) {
                    function02.invoke();
                }
            }
        } else if (iIntValue != 0) {
            if (iIntValue != 1 && iIntValue != 2) {
                if (iIntValue == 3) {
                    cashierViewModel.setState(AFwS268S0000000_26.get$arr$(427));
                    C23250099c.LIZLLL(ViewModelKt.getViewModelScope(cashierViewModel), C0PEM.LIZJ, null, new C1709080uZm(cashierViewModel, context, null), 2);
                }
            } else {
                cashierViewModel.AQ2(str);
            }
        } else {
            C1709570uaZ c1709570uaZ2 = cashierViewModel.LLILLJJLI;
            if (c1709570uaZ2 != null) {
                c1709570uaZ2.LJJJLL();
            }
            CashierEnterParams cashierEnterParams3 = cashierViewModel.LL;
            if (cashierEnterParams3 != null && (c1709220ua0 = cashierEnterParams3.LJ) != null && (function0 = c1709220ua0.LIZ) != null) {
                function0.invoke();
            }
            cashierViewModel.setState(AFwS268S0000000_26.get$arr$(427));
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(cashierViewModel), C0PEM.LIZJ, null, new C1709080uZm(cashierViewModel, context, null), 2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS461S0200000_26 awS461S0200000_26, Object obj, Object obj2) {
        String str;
        VerifyDetail verifyDetailLJIIIIZZ;
        String str2;
        VerifyDetail verifyDetailLJIIIIZZ2;
        C1714660uim c1714660uimVR;
        String str3 = (String) obj2;
        BaseVerifyFragment baseVerifyFragmentLIZ = C1714230ui5.LIZ((OCRVerifyGuideAssem) awS461S0200000_26.l0);
        if (baseVerifyFragmentLIZ != null && (c1714660uimVR = baseVerifyFragmentLIZ.VR()) != null) {
            C1714660uim.LIZJ(c1714660uimVR, "privacy_policy");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        OCRVerifyGuideAssem oCRVerifyGuideAssem = (OCRVerifyGuideAssem) awS461S0200000_26.l0;
        C1713570uh1 c1713570uh1Jo = oCRVerifyGuideAssem.Jo();
        String str4 = "";
        if (c1713570uh1Jo == null || (verifyDetailLJIIIIZZ2 = c1713570uh1Jo.LJIIIIZZ()) == null || (str = verifyDetailLJIIIIZZ2.merchantId) == null) {
            str = "";
        }
        linkedHashMap.put("merchant_id", str);
        C1713570uh1 c1713570uh1Jo2 = oCRVerifyGuideAssem.Jo();
        if (c1713570uh1Jo2 != null && (verifyDetailLJIIIIZZ = c1713570uh1Jo2.LJIIIIZZ()) != null && (str2 = verifyDetailLJIIIIZZ.merchantUserId) != null) {
            str4 = str2;
        }
        linkedHashMap.put("merchant_user_id", str4);
        linkedHashMap.put("priority_region", C1717770unn.LJIIIIZZ().getCurrentRegionCode());
        C1718900upc c1718900upc = C1718900upc.LIZ;
        C19EG c19eg = (C19EG) awS461S0200000_26.l1;
        c1718900upc.getClass();
        C1718900upc.LJFF(c19eg, str3, linkedHashMap, false);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS461S0200000_26 awS461S0200000_26, Object obj, Object obj2) {
        List list = (List) obj2;
        PdpBodyAssem pdpBodyAssem = (PdpBodyAssem) awS461S0200000_26.l0;
        pdpBodyAssem.getClass();
        C1326490kch c1326490kch = C1326490kch.LIZ;
        C5182020e c5182020e = new C5182020e(list, (List<Function0<Unit>>) 515);
        c1326490kch.getClass();
        C1326490kch.LIZIZ(c5182020e);
        if (!list.isEmpty()) {
            pdpBodyAssem.kp().getState().LJIILL(list, new ARunnableS95S0200000_26(pdpBodyAssem, list, 50));
            pdpBodyAssem.LLL = true;
            C1326490kch.LIZIZ(new C5182020e(list, (List<Function0<Unit>>) 516));
        }
        if (!((C013C) awS461S0200000_26.l1).element && (!list.isEmpty())) {
            ((C013C) awS461S0200000_26.l1).element = true;
            PdpBodyAssem pdpBodyAssem2 = (PdpBodyAssem) awS461S0200000_26.l0;
            InterfaceC1755040vlu interfaceC1755040vlu = pdpBodyAssem2.LLLILZJ;
            if (interfaceC1755040vlu == null) {
                synchronized (pdpBodyAssem2) {
                    interfaceC1755040vlu = pdpBodyAssem2.LLLILZJ;
                    if (interfaceC1755040vlu == null) {
                        C0QSJ c0qsjHp = pdpBodyAssem2.hp();
                        if (c0qsjHp != null) {
                            interfaceC1755040vlu = (InterfaceC1755040vlu) c0qsjHp.getAbility(InterfaceC1755040vlu.class);
                            C687700QyG.LJ(interfaceC1755040vlu, InterfaceC1755040vlu.class);
                        } else {
                            interfaceC1755040vlu = null;
                        }
                        pdpBodyAssem2.LLLILZJ = interfaceC1755040vlu;
                    }
                }
            }
            interfaceC1755040vlu.Gd();
            ((PdpBodyAssem) awS461S0200000_26.l0).mp().start();
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$16(AwS461S0200000_26 awS461S0200000_26, Object obj, Object obj2) {
        InterfaceC1752680vi6 interfaceC1752680vi6Sp;
        C1054004Ag c1054004Ag;
        C1755690vmx currentState;
        TabBarItemVO tabBarItemVO;
        List<TabBarTab> list;
        if (((Number) obj2).intValue() < C958103op.LIZJ() || ((interfaceC1752680vi6Sp = ((PdpBodyAssem) awS461S0200000_26.l0).sp()) != null && (currentState = interfaceC1752680vi6Sp.getCurrentState()) != null && (tabBarItemVO = currentState.LLILLJJLI) != null && (list = tabBarItemVO.tabBarTabList) != null && (!list.isEmpty()))) {
            C786410Ut5.LJLLLLLL(8, (View) ((PdpBodyAssem) awS461S0200000_26.l0).LLJJJJLIIL.getValue());
        } else {
            C013C c013c = (C013C) awS461S0200000_26.l1;
            if (!c013c.element) {
                c013c.element = true;
                PdpViewModel pdpViewModelLp = ((PdpBodyAssem) awS461S0200000_26.l0).lp();
                if (pdpViewModelLp != null && (c1054004Ag = pdpViewModelLp.LLJLILLLLZIIL) != null) {
                    C1054004Ag.LJIILJJIL(c1054004Ag, "to_top", null, null, null, 14);
                }
            }
            C786410Ut5.LJLLLLLL(0, (View) ((PdpBodyAssem) awS461S0200000_26.l0).LLJJJJLIIL.getValue());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS461S0200000_26 awS461S0200000_26, Object obj, Object obj2) {
        ((Number) obj).intValue();
        if (((InterfaceC20236714Gf) awS461S0200000_26.l0).isActive()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) awS461S0200000_26.l0;
            C1738680vLW.LIZ.getClass();
            Map mapLIZIZ = C1738680vLW.LIZIZ();
            C189200o6.m2constructorimpl(mapLIZIZ);
            interfaceC20236714Gf.resumeWith(mapLIZIZ);
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("entrance", ((C604530NnP) awS461S0200000_26.l1).LIZ);
            pairArr[1] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "failure");
            if (obj2 == null) {
                obj2 = "unknown";
            }
            pairArr[2] = new Pair("error", obj2);
            AnonymousClass0678.LIZ("collect_gps", C2097608Jq.LJIIJ(pairArr));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS461S0200000_26 awS461S0200000_26, Object obj, Object obj2) {
        String str = (String) obj2;
        if (u.LJJIIJZLJL(str, "http", false)) {
            C1714410uiN.LIZLLL(C1714410uiN.LIZ, (Activity) awS461S0200000_26.l0, str, null, false, null, null, null, null, null, 1020);
            ((AutofillAssem) awS461S0200000_26.l1).Oo("learnmore");
        } else {
            SmartRouter.buildRoute(((AutofillAssem) awS461S0200000_26.l1).getContext(), str).open();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS461S0200000_26 awS461S0200000_26, Object obj, Object obj2) {
        PdpBodyVM pdpBodyVM = ((PdpViewModel) obj2).j;
        if (pdpBodyVM != null) {
            pdpBodyVM.setState(new AwS38S0001000_26(((InterfaceC1757900vqW) awS461S0200000_26.l0).getToBrick().intValue(), 12));
        }
        ((CompletionBlock) awS461S0200000_26.l1).onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1757910vqX.class, null), "");
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS461S0200000_26 awS461S0200000_26, Object obj, Object obj2) {
        String string;
        String str = (String) obj;
        String str2 = (String) obj2;
        PhoneNumberVM phoneNumberVMSo = ((PhoneNumberAssem) awS461S0200000_26.l0).So();
        PhoneNumberAssem phoneNumberAssem = (PhoneNumberAssem) awS461S0200000_26.l0;
        phoneNumberAssem.getClass();
        HashMap map = new HashMap();
        for (Map.Entry entry : BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "a2270.b70343", PageFinder.via(C724240Sb0.LJI(phoneNumberAssem)), null, 4, null).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || (string = value.toString()) == null) {
                string = "";
            }
            map.put(key, string);
        }
        phoneNumberVMSo.zQ2(str, map);
        C1716510ull.LIZIZ(C1716510ull.LIZ, (C19EG) awS461S0200000_26.l1, str2, false, false, false, ((PhoneNumberAssem) awS461S0200000_26.l0).Oo().LLILLL, "pipo_credit_wallet", "biz_7", null, 284);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS461S0200000_26 awS461S0200000_26, Object obj, Object obj2) {
        String str;
        TradeEntranceInfo tradeEntranceInfo = (TradeEntranceInfo) obj2;
        String str2 = null;
        if (tradeEntranceInfo != null) {
            str = tradeEntranceInfo.schema;
        } else {
            str = null;
        }
        if (C770702zh.LIZIZ(str)) {
            MessageCenterAssem messageCenterAssem = (MessageCenterAssem) awS461S0200000_26.l0;
            if (tradeEntranceInfo != null) {
                str2 = tradeEntranceInfo.schema;
            }
            View view = (View) awS461S0200000_26.l1;
            messageCenterAssem.getClass();
            TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p15);
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_clipboard_ltr;
            c1251150ifB.LIZJ(new AwS141S1200000_26(view, messageCenterAssem, str2, 6));
            tuxNavBar.LIZ(c1251150ifB);
            C1739410vMh c1739410vMh = C1739410vMh.LIZ;
            View viewFindViewById = view.findViewById(R.id.p15).findViewById(R.id.p1u);
            String str3 = messageCenterAssem.Oo().LLILLJJLI;
            c1739410vMh.getClass();
            if (viewFindViewById != null) {
                C1748720vbi.LJFF(viewFindViewById, new C04CK() { // from class: X.0veV
                    @Override // X.AbstractC1748790vbp
                    public final C1748850vbv LIZ() {
                        return new C1748850vbv(new C1748840vbu("EVENT_ORIGIN_FEATURE", new C1747940vaS[0]), new C1748840vbu("page_name", new C1747940vaS[0]), new C1748840vbu("enter_from", new C1747940vaS[0]), new C1748840vbu("previous_page", new C1747940vaS[0]));
                    }
                }, AFwS215S0000000_26.get$arr$(368), new AwS76S1000000_26(str3, 22));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS461S0200000_26 awS461S0200000_26, Object obj, Object obj2) {
        String str;
        Integer num;
        CartEntry cartEntry;
        CartEntry cartEntry2;
        final ServerConfigStyle serverConfigStyle = (ServerConfigStyle) obj2;
        TextView textView = (TextView) ((View) awS461S0200000_26.l0).findViewById(R.id.ykd);
        String str2 = null;
        if (serverConfigStyle != null) {
            str = serverConfigStyle.title;
        } else {
            str = null;
        }
        textView.setText(str);
        final ECTrendingTitleAssem eCTrendingTitleAssem = (ECTrendingTitleAssem) awS461S0200000_26.l1;
        C1753840vjy c1753840vjy = eCTrendingTitleAssem.LLJIJIL;
        if (c1753840vjy != null) {
            c1753840vjy.setDelegate(new InterfaceC1753900vk4() { // from class: X.0vSj
                @Override // X.InterfaceC1753900vk4
                public final Map<String, Object> LIZ() {
                    C1742820vSC c1742820vSC = eCTrendingTitleAssem.Go().LL;
                    String str3 = Intrinsics.LJFF(c1742820vSC != null ? c1742820vSC.LJIIIIZZ : null, "auction") ? "auction" : "trends";
                    return C2097608Jq.LJIIIIZZ(new Pair("previous_page", str3), new Pair("source_previous_page", str3));
                }

                @Override // X.InterfaceC1753900vk4
                public final String LIZJ() {
                    CartEntry cartEntry3;
                    ServerConfigStyle serverConfigStyle2 = serverConfigStyle;
                    if (serverConfigStyle2 == null || (cartEntry3 = serverConfigStyle2.cartEntry) == null) {
                        return null;
                    }
                    return cartEntry3.link;
                }

                @Override // X.InterfaceC1753900vk4
                public final String LIZLLL() {
                    C1742820vSC c1742820vSC = eCTrendingTitleAssem.Go().LL;
                    return !Intrinsics.LJFF(c1742820vSC != null ? c1742820vSC.LJIIIIZZ : null, "auction") ? "trends" : "auction";
                }

                @Override // X.InterfaceC1753900vk4
                public final boolean LIZIZ(C1753460vjM c1753460vjM) {
                    eCTrendingTitleAssem.Go().LLILLJJLI.LIZ = "next";
                    C1748720vbi.LIZLLL(c1753460vjM, new C10483048b(), new AwS605S0100000_26(eCTrendingTitleAssem, 304));
                    return false;
                }
            });
        }
        C1753840vjy c1753840vjy2 = (C1753840vjy) ((View) awS461S0200000_26.l0).findViewById(R.id.yka);
        if (serverConfigStyle != null && (cartEntry2 = serverConfigStyle.cartEntry) != null) {
            num = cartEntry2.itemCount;
        } else {
            num = null;
        }
        EnumC1743310vSz enumC1743310vSz = EnumC1743310vSz.STYLE_DEFAULT;
        if (serverConfigStyle != null && (cartEntry = serverConfigStyle.cartEntry) != null) {
            str2 = cartEntry.link;
        }
        c1753840vjy2.h0(new C1743360vT4(num, enumC1743310vSz, str2), true);
        if (!((ECTrendingTitleAssem) awS461S0200000_26.l1).LLJ) {
            C1748720vbi.LIZLLL((View) awS461S0200000_26.l0, new C1054804Ao(), new AwS605S0100000_26((ECTrendingTitleAssem) awS461S0200000_26.l1, 305));
            ((ECTrendingTitleAssem) awS461S0200000_26.l1).LLJ = true;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS461S0200000_26 awS461S0200000_26, Object obj, Object obj2) {
        List<BannerFrame> list;
        BannerData bannerData = (BannerData) obj2;
        C013C c013c = (C013C) awS461S0200000_26.l0;
        boolean z = true;
        if (!c013c.element) {
            c013c.element = true;
        }
        ECTrendingTitleAssem eCTrendingTitleAssem = (ECTrendingTitleAssem) awS461S0200000_26.l1;
        if (bannerData == null || (list = bannerData.bannerFrameList) == null || !(!list.isEmpty())) {
            z = false;
        }
        eCTrendingTitleAssem.LLJI = z;
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(AwS461S0200000_26 awS461S0200000_26, Object obj, Object obj2) {
        int length = ((String) obj2).length();
        EffectEditAssem effectEditAssem = (EffectEditAssem) awS461S0200000_26.l0;
        if (length > effectEditAssem.LLJJI) {
            effectEditAssem.op().LIZIZ(true);
            ((EffectEditAssem) awS461S0200000_26.l0).op().setFooterFieldView((TuxTextView) awS461S0200000_26.l1);
            C786410Ut5.LLLLZLL((TuxTextView) awS461S0200000_26.l1, 0);
        } else {
            effectEditAssem.op().LIZIZ(false);
            C786410Ut5.LLLLZLL((TuxTextView) awS461S0200000_26.l1, 8);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(AwS461S0200000_26 awS461S0200000_26, Object obj, Object obj2) {
        int length = ((String) obj2).length();
        EffectEditV2Assem effectEditV2Assem = (EffectEditV2Assem) awS461S0200000_26.l0;
        if (length > effectEditV2Assem.LLJJI) {
            C420290Gdv c420290Gdv = effectEditV2Assem.LLJJJ;
            if (c420290Gdv != null) {
                c420290Gdv.LIZIZ(true);
            }
            C420290Gdv c420290Gdv2 = ((EffectEditV2Assem) awS461S0200000_26.l0).LLJJJ;
            if (c420290Gdv2 != null) {
                c420290Gdv2.setFooterFieldView((TuxTextView) awS461S0200000_26.l1);
            }
            C786410Ut5.LLLLZLL((TuxTextView) awS461S0200000_26.l1, 0);
        } else {
            C420290Gdv c420290Gdv3 = effectEditV2Assem.LLJJJ;
            if (c420290Gdv3 != null) {
                c420290Gdv3.LIZIZ(false);
            }
            C786410Ut5.LLLLZLL((TuxTextView) awS461S0200000_26.l1, 8);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS461S0200000_26 awS461S0200000_26, Object obj, Object obj2) {
        C1054004Ag c1054004Ag;
        View view = (View) obj;
        String str = (String) obj2;
        PdpComponent pdpComponent = (PdpComponent) awS461S0200000_26.l0;
        if (pdpComponent != null) {
            C1759650vtL c1759650vtL = C1759650vtL.LIZ;
            PdpViewModel pdpViewModel = (PdpViewModel) awS461S0200000_26.l1;
            c1759650vtL.getClass();
            Integer num = pdpComponent.bizType;
            int value = EnumC1759660vtM.BIZ_TYPE_ADD_ON_ENTRANCE.getValue();
            if (num != null && num.intValue() == value && pdpViewModel != null && (c1054004Ag = pdpViewModel.LLJLILLLLZIIL) != null) {
                Map<String, Object> mapLIZ = C1010603xI.LIZ(pdpComponent.daInfo);
                InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = c1054004Ag.LJJIJLIJ();
                if (interfaceC1748810vbrLJJIJLIJ != null) {
                    C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new C04CK() { // from class: X.049n
                        @Override // X.AbstractC1748790vbp
                        public final C1748850vbv LIZ() {
                            C323580CmK c323580CmK = new C323580CmK(9);
                            c323580CmK.LIZ(new C1748840vbu("EVENT_ORIGIN_FEATURE", new C1747940vaS[0]));
                            c323580CmK.LIZ(new C1748840vbu("page_name", new C1747940vaS[0]));
                            c323580CmK.LIZ(new C1748840vbu("entrance_info", new C1747940vaS[0]));
                            c323580CmK.LIZ(new C1748840vbu("entrance_zone", new C1747940vaS[0]));
                            c323580CmK.LIZ(new C1748840vbu("campaign_id", new C1747940vaS[0]));
                            c323580CmK.LIZ(new C1748840vbu("campaign_type", new C1747940vaS[0]));
                            c323580CmK.LIZ(new C1748840vbu("campaign_zone", new C1747940vaS[0]));
                            c323580CmK.LIZ(new C1748840vbu("coupon_zone", new C1747940vaS[0]));
                            c323580CmK.LIZIZ(C048U.LIZ);
                            return new C1748850vbv((C1748840vbu[]) c323580CmK.LIZLLL(new C1748840vbu[c323580CmK.LIZJ()]));
                        }
                    }, new AwS86S1200000_1(c1054004Ag, mapLIZ, 43));
                }
            }
            Integer num2 = pdpComponent.componentType;
            int value2 = EnumC1759910vtl.COMPONENT_BUTTON.getValue();
            if (num2 != null && num2.intValue() == value2 && view != null) {
                C1748720vbi.LIZLLL(view, new C049X(), new AwS76S1000000_26(str, 17));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS461S0200000_26(C1709820uay c1709820uay, C1709880ub4 c1709880ub4, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1709820uay;
        this.l1 = c1709880ub4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS461S0200000_26(InterfaceC1757900vqW interfaceC1757900vqW, InterfaceC1757900vqW interfaceC1757900vqW2, CompletionBlock<InterfaceC1757910vqX> completionBlock) {
        super(2);
        this.$t = completionBlock;
        this.l0 = interfaceC1757900vqW;
        this.l1 = interfaceC1757900vqW2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS461S0200000_26(C1759880vti c1759880vti, ButtonComponentData buttonComponentData, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1759880vti;
        this.l1 = buttonComponentData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS461S0200000_26(C2252611DEt c2252611DEt, C604530NnP c604530NnP, int i) {
        super(2);
        this.$t = i;
        this.l0 = c2252611DEt;
        this.l1 = c604530NnP;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS461S0200000_26(Activity activity, AutofillAssem autofillAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = activity;
        this.l1 = autofillAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS461S0200000_26(View view, ECTrendingTitleAssem eCTrendingTitleAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = eCTrendingTitleAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS461S0200000_26(CompletionBlock completionBlock, CompletionBlock<InterfaceC1731910vAb> completionBlock2, C1731890vAZ c1731890vAZ) {
        super(2);
        this.$t = c1731890vAZ;
        this.l0 = completionBlock;
        this.l1 = completionBlock2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS461S0200000_26(CollectInfoPageFragment collectInfoPageFragment, C19EG c19eg, int i) {
        super(2);
        this.$t = i;
        this.l0 = collectInfoPageFragment;
        this.l1 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS461S0200000_26(GuidePageAssem guidePageAssem, C19EG c19eg, int i) {
        super(2);
        this.$t = i;
        this.l0 = guidePageAssem;
        this.l1 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS461S0200000_26(PhoneNumberAssem phoneNumberAssem, C19EG c19eg, int i) {
        super(2);
        this.$t = i;
        this.l0 = phoneNumberAssem;
        this.l1 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS461S0200000_26(CollectMobileFromTTAssem collectMobileFromTTAssem, C19EG c19eg, int i) {
        super(2);
        this.$t = i;
        this.l0 = collectMobileFromTTAssem;
        this.l1 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS461S0200000_26(MessageCenterAssem messageCenterAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = messageCenterAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS461S0200000_26(PdpComponent pdpComponent, PdpViewModel pdpViewModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = pdpComponent;
        this.l1 = pdpViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS461S0200000_26(PdpBodyAssem pdpBodyAssem, C013C c013c, int i) {
        super(2);
        this.$t = i;
        this.l0 = pdpBodyAssem;
        this.l1 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS461S0200000_26(EffectEditAssem effectEditAssem, TuxTextView tuxTextView, int i) {
        super(2);
        this.$t = i;
        this.l0 = effectEditAssem;
        this.l1 = tuxTextView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS461S0200000_26(EffectEditV2Assem effectEditV2Assem, TuxTextView tuxTextView, int i) {
        super(2);
        this.$t = i;
        this.l0 = effectEditV2Assem;
        this.l1 = tuxTextView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS461S0200000_26(OCRVerifyGuideAssem oCRVerifyGuideAssem, C19EG c19eg, int i) {
        super(2);
        this.$t = i;
        this.l0 = oCRVerifyGuideAssem;
        this.l1 = c19eg;
    }
}
