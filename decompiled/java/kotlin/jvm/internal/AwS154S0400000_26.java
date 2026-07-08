package kotlin.jvm.internal;

import X.AnonymousClass0483;
import X.C098200Yq;
import X.C09AY;
import X.C09R7;
import X.C0C17;
import X.C118300cf;
import X.C13IQ;
import X.C1697810uHb;
import X.C1708640uZ4;
import X.C1709140uZs;
import X.C1709570uaZ;
import X.C1710940ucm;
import X.C1713570uh1;
import X.C1714230ui5;
import X.C1715530ukB;
import X.C1718420uoq;
import X.C1718430uor;
import X.C1718710upJ;
import X.C1718820upU;
import X.C1725060uzY;
import X.C1733010vCN;
import X.C1739770vNH;
import X.C1740040vNi;
import X.C1744700vVE;
import X.C1748440vbG;
import X.C1748720vbi;
import X.C1749140vcO;
import X.C1749710vdJ;
import X.C1759440vt0;
import X.C1770220wAO;
import X.C1770320wAY;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1AF0;
import X.C2097608Jq;
import X.C2399609ak;
import X.C2505309rn;
import X.C259800zU;
import X.C337180DJs;
import X.C418440Gaw;
import X.C680790Qn7;
import X.C703302op;
import X.C814420VxA;
import X.C921403iu;
import X.C995290c0V;
import X.EnumC1759580vtE;
import X.EnumC336190DFx;
import X.InterfaceC1075600e62;
import X.InterfaceC1631630sYr;
import X.InterfaceC1725110uzd;
import X.InterfaceC1748810vbr;
import X.InterfaceC1766500w4O;
import X.InterfaceC2217241BqE;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.pipo.verify.base.model.response.AlertMsg;
import com.bytedance.pipo.verify.base.model.response.PopupContent;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.widget.Widget;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.android.ugc.aweme.component.verify.pin.model.HintPageMsg;
import com.ss.android.ugc.aweme.ecommerce.base.address.associate.AddressAssociateViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.delivery.DeliveryInstructionViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.address.identity.AddressIdentityAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoOption;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoPanel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.PdpBodyAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.PdpBodyVM;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.header.skc.SeaPdpSkcPanelHeaderViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerWrapperViewModel;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.ui.EcSearchNoCartFypBottomButtonAssem;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.ui.EcSearchNoCartFypBottomButtonAssemV2;
import com.ss.android.ugc.aweme.ecommerce.ug.common.model.DiversionTargetRes;
import com.ss.android.ugc.aweme.ecommerce.ug.common.model.DiversionTargetResCfg;
import com.ss.android.ugc.aweme.ecommerce.ug.prefetch.popup.libra.NativePrefetchPopUpExperiment;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.ECBillboard;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateEditBottomAreaViewModel;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POPayElement;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import com.ss.android.ugc.aweme.pipo.errorsdk.ErrorActionResponse;
import com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsTabVM;
import com.ss.android.ugc.aweme.setting.viewmodel.AuthListViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.FollowRelationTabViewModel;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.MyProfileGuideViewModel;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes27.dex */
public class AwS154S0400000_26 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            case 29:
                return invoke$29(this);
            case 30:
                return invoke$30(this);
            case 31:
                return invoke$31(this);
            case 32:
                return invoke$32(this);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS154S0400000_26 awS154S0400000_26) {
        String str;
        ProductPrice productPrice;
        PdpViewModel pdpViewModel = ((C1749710vdJ) awS154S0400000_26.l0).LIZ;
        InterfaceC1748810vbr interfaceC1748810vbr = (InterfaceC1748810vbr) awS154S0400000_26.l1;
        ProductBase productBase = ((ProductPackStruct) awS154S0400000_26.l2).baseInfo;
        if (productBase != null && (productPrice = productBase.priceInfo) != null) {
            str = productPrice.realPrice;
        } else {
            str = null;
        }
        pdpViewModel.nS2(interfaceC1748810vbr, str, (HashMap) awS154S0400000_26.l3);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$1(AwS154S0400000_26 awS154S0400000_26) {
        Fragment fragment = (Fragment) awS154S0400000_26.l0;
        ViewModel viewModel = ViewModelProviders.of(fragment, ((InterfaceC1075600e62) fragment).jl()).get((String) ((Function0) awS154S0400000_26.l1).invoke(), C09R7.LIZ((C13IQ) awS154S0400000_26.l2));
        Function2 function2 = (Function2) awS154S0400000_26.l3;
        Fragment fragment2 = (Fragment) awS154S0400000_26.l0;
        JediViewModel jediViewModel = (JediViewModel) viewModel;
        InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(AddressAssociateViewModel.class);
        if (interfaceC1766500w4OCreate != null) {
            interfaceC1766500w4OCreate.LIZ();
        }
        jediViewModel.JQ2(new AwS392S0200000_26(function2, fragment2, 22));
        return jediViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$10(AwS154S0400000_26 awS154S0400000_26) {
        Fragment fragment = (Fragment) awS154S0400000_26.l0;
        ViewModel viewModel = ViewModelProviders.of(fragment, ((InterfaceC1075600e62) fragment).jl()).get((String) ((Function0) awS154S0400000_26.l1).invoke(), C09R7.LIZ((C13IQ) awS154S0400000_26.l2));
        Function2 function2 = (Function2) awS154S0400000_26.l3;
        Fragment fragment2 = (Fragment) awS154S0400000_26.l0;
        JediViewModel jediViewModel = (JediViewModel) viewModel;
        InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(DistrictPickerWrapperViewModel.class);
        if (interfaceC1766500w4OCreate != null) {
            interfaceC1766500w4OCreate.LIZ();
        }
        jediViewModel.JQ2(new AwS392S0200000_26(function2, fragment2, 52));
        return jediViewModel;
    }

    public static final Object invoke$11(AwS154S0400000_26 awS154S0400000_26) {
        ((TemplateEditBottomAreaViewModel) awS154S0400000_26.l0).vQ2((TemplateItem) awS154S0400000_26.l1, (TemplateItem) awS154S0400000_26.l2, (ViewGroup) awS154S0400000_26.l3, true);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$12(AwS154S0400000_26 awS154S0400000_26) {
        C19GS c19gs = (C19GS) awS154S0400000_26.l0;
        ViewModel viewModel = ViewModelProviders.of(c19gs, ((InterfaceC1075600e62) c19gs).jl()).get(C09R7.LIZ((C13IQ) awS154S0400000_26.l3).getName(), C09R7.LIZ((C13IQ) awS154S0400000_26.l1));
        Function2 function2 = (Function2) awS154S0400000_26.l2;
        C19GS c19gs2 = (C19GS) awS154S0400000_26.l0;
        JediViewModel jediViewModel = (JediViewModel) viewModel;
        InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(FindFriendsTabVM.class);
        if (interfaceC1766500w4OCreate != null) {
            interfaceC1766500w4OCreate.LIZ();
        }
        jediViewModel.JQ2(new AwS385S0200000_19(function2, c19gs2, 43));
        return jediViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$13(AwS154S0400000_26 awS154S0400000_26) {
        Fragment fragment = (Fragment) awS154S0400000_26.l0;
        ViewModel viewModel = ViewModelProviders.of(fragment, ((InterfaceC1075600e62) fragment).jl()).get((String) ((Function0) awS154S0400000_26.l1).invoke(), C09R7.LIZ((C13IQ) awS154S0400000_26.l2));
        Function2 function2 = (Function2) awS154S0400000_26.l3;
        Fragment fragment2 = (Fragment) awS154S0400000_26.l0;
        JediViewModel jediViewModel = (JediViewModel) viewModel;
        InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(AuthListViewModel.class);
        if (interfaceC1766500w4OCreate != null) {
            interfaceC1766500w4OCreate.LIZ();
        }
        jediViewModel.JQ2(new AwS392S0200000_26(function2, fragment2, 83));
        return jediViewModel;
    }

    public static /* bridge */ /* synthetic */ Object invoke$14(AwS154S0400000_26 awS154S0400000_26) {
        ViewModelProvider viewModelProviderOf;
        Object objLIZJ = ((Widget) awS154S0400000_26.l0).LIZJ();
        if (objLIZJ instanceof Fragment) {
            viewModelProviderOf = ViewModelProviders.of((Fragment) objLIZJ, ((InterfaceC1075600e62) ((Widget) awS154S0400000_26.l0)).jl());
        } else if (objLIZJ instanceof C19EG) {
            viewModelProviderOf = ViewModelProviders.of((C19EG) objLIZJ, ((InterfaceC1075600e62) ((Widget) awS154S0400000_26.l0)).jl());
        } else {
            throw new IllegalStateException();
        }
        JediViewModel jediViewModel = (JediViewModel) viewModelProviderOf.get((String) ((Function0) awS154S0400000_26.l1).invoke(), C09R7.LIZ((C13IQ) awS154S0400000_26.l2));
        InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(MyProfileGuideViewModel.class);
        if (interfaceC1766500w4OCreate != null) {
            interfaceC1766500w4OCreate.LIZ();
        }
        jediViewModel.JQ2((Function1) awS154S0400000_26.l3);
        return jediViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$15(AwS154S0400000_26 awS154S0400000_26) {
        C19GS c19gs = (C19GS) awS154S0400000_26.l0;
        ViewModel viewModel = ViewModelProviders.of(c19gs, ((InterfaceC1075600e62) c19gs).jl()).get(C09R7.LIZ((C13IQ) awS154S0400000_26.l3).getName(), C09R7.LIZ((C13IQ) awS154S0400000_26.l1));
        Function2 function2 = (Function2) awS154S0400000_26.l2;
        C19GS c19gs2 = (C19GS) awS154S0400000_26.l0;
        JediViewModel jediViewModel = (JediViewModel) viewModel;
        InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(FollowRelationTabViewModel.class);
        if (interfaceC1766500w4OCreate != null) {
            interfaceC1766500w4OCreate.LIZ();
        }
        jediViewModel.JQ2(new AwS385S0200000_19(function2, c19gs2, 59));
        return jediViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$16(AwS154S0400000_26 awS154S0400000_26) {
        String str;
        int i;
        int iLIZIZ;
        int iMeasureText;
        int iLIZIZ2;
        int iLIZIZ3;
        SmartImageView smartImageView;
        ViewGroup.LayoutParams layoutParams;
        TextPaint paint;
        int marginStart;
        int marginEnd;
        int iLIZIZ4;
        int iLIZIZ5;
        ViewGroup.LayoutParams layoutParams2;
        Bitmap bitmap = (Bitmap) ((C259800zU) awS154S0400000_26.l0).element;
        boolean zLIZLLL = false;
        if (bitmap != null) {
            EcSearchNoCartFypBottomButtonAssemV2 ecSearchNoCartFypBottomButtonAssemV2 = (EcSearchNoCartFypBottomButtonAssemV2) awS154S0400000_26.l3;
            C1770220wAO c1770220wAO = (C1770220wAO) awS154S0400000_26.l1;
            if (!bitmap.isRecycled() && bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                LinearLayout linearLayout = ecSearchNoCartFypBottomButtonAssemV2.LLL;
                if (linearLayout != null) {
                    ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
                    if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                        marginStart = ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginStart();
                    } else {
                        marginStart = 0;
                    }
                    ViewGroup.LayoutParams layoutParams4 = linearLayout.getLayoutParams();
                    if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                        marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams4).getMarginEnd();
                    } else {
                        marginEnd = 0;
                    }
                    int i2 = marginStart + marginEnd;
                    TuxIconView tuxIconView = ecSearchNoCartFypBottomButtonAssemV2.LLLFZ;
                    if (tuxIconView != null) {
                        ViewGroup.LayoutParams layoutParams5 = tuxIconView.getLayoutParams();
                        if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                            iLIZIZ4 = ((ViewGroup.MarginLayoutParams) layoutParams5).getMarginEnd();
                        } else {
                            iLIZIZ4 = 0;
                        }
                    } else {
                        iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                    }
                    int i3 = i2 + iLIZIZ4;
                    TuxTextView tuxTextView = ecSearchNoCartFypBottomButtonAssemV2.LLLFFI;
                    if (tuxTextView != null && (layoutParams2 = tuxTextView.getLayoutParams()) != null) {
                        iLIZIZ5 = layoutParams2.width;
                    } else {
                        iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                    }
                    i = i3 + iLIZIZ5;
                } else {
                    i = 0;
                }
                TuxIconView tuxIconView2 = ecSearchNoCartFypBottomButtonAssemV2.LLLFZ;
                if (tuxIconView2 != null) {
                    iLIZIZ = tuxIconView2.getWidth();
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                }
                TuxTextView tuxTextView2 = ecSearchNoCartFypBottomButtonAssemV2.LLLF;
                if (tuxTextView2 != null && (paint = tuxTextView2.getPaint()) != null) {
                    iMeasureText = (int) paint.measureText(c1770220wAO.LIZIZ.guideText);
                } else {
                    iMeasureText = 0;
                }
                SmartImageView smartImageView2 = ecSearchNoCartFypBottomButtonAssemV2.LLLFF;
                if (smartImageView2 != null && (layoutParams = smartImageView2.getLayoutParams()) != null) {
                    iLIZIZ2 = layoutParams.height;
                } else {
                    iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                }
                int width = (int) (bitmap.getWidth() * (iLIZIZ2 / bitmap.getHeight()));
                int i4 = iLIZIZ + width + iMeasureText + i;
                FrameLayout frameLayout = ecSearchNoCartFypBottomButtonAssemV2.LLJZIJLIL;
                if (frameLayout != null) {
                    iLIZIZ3 = frameLayout.getWidth();
                } else {
                    iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(280));
                }
                if (i4 <= iLIZIZ3 && (smartImageView = ecSearchNoCartFypBottomButtonAssemV2.LLLFF) != null) {
                    TuxTextView tuxTextView3 = ecSearchNoCartFypBottomButtonAssemV2.LLLFFI;
                    if (tuxTextView3 != null) {
                        C337180DJs.LIZJ(tuxTextView3);
                    }
                    ecSearchNoCartFypBottomButtonAssemV2.LLJZ = true;
                    C1744700vVE.LJIIL(smartImageView, width);
                    C337180DJs.LIZJ(smartImageView);
                    smartImageView.setImageBitmap(bitmap);
                }
            }
        }
        C1770320wAY c1770320wAY = C1770320wAY.LIZ;
        Map<String, Object> mapLJ = ((C1770220wAO) awS154S0400000_26.l1).LIZIZ.daParams;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        Integer numValueOf = Integer.valueOf(((C118300cf) awS154S0400000_26.l2).element);
        TuxTextView tuxTextView4 = ((EcSearchNoCartFypBottomButtonAssemV2) awS154S0400000_26.l3).LLLF;
        if (tuxTextView4 != null) {
            C680790Qn7.LIZ.getClass();
            zLIZLLL = C680790Qn7.LIZLLL(tuxTextView4);
        }
        Boolean boolValueOf = Boolean.valueOf(zLIZLLL);
        EcSearchNoCartFypBottomButtonAssemV2 ecSearchNoCartFypBottomButtonAssemV22 = (EcSearchNoCartFypBottomButtonAssemV2) awS154S0400000_26.l3;
        if (ecSearchNoCartFypBottomButtonAssemV22.LLJZ) {
            str = "promotion_image";
        } else {
            str = "normal";
        }
        String strBp = ecSearchNoCartFypBottomButtonAssemV22.Bp();
        c1770320wAY.getClass();
        C1770320wAY.LJIIJJI(mapLJ, numValueOf, boolValueOf, str, strBp);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$17(AwS154S0400000_26 awS154S0400000_26) {
        String str;
        int i;
        int iLIZIZ;
        int iMeasureText;
        int iLIZIZ2;
        int iLIZIZ3;
        SmartImageView smartImageView;
        ViewGroup.LayoutParams layoutParams;
        TextPaint paint;
        int marginStart;
        int marginEnd;
        int iLIZIZ4;
        int iLIZIZ5;
        ViewGroup.LayoutParams layoutParams2;
        Bitmap bitmap = (Bitmap) ((C259800zU) awS154S0400000_26.l0).element;
        boolean zLIZLLL = false;
        if (bitmap != null) {
            EcSearchNoCartFypBottomButtonAssem ecSearchNoCartFypBottomButtonAssem = (EcSearchNoCartFypBottomButtonAssem) awS154S0400000_26.l3;
            C1770220wAO c1770220wAO = (C1770220wAO) awS154S0400000_26.l1;
            if (!bitmap.isRecycled() && bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                LinearLayout linearLayout = ecSearchNoCartFypBottomButtonAssem.LLLLIILLL;
                if (linearLayout != null) {
                    ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
                    if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                        marginStart = ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginStart();
                    } else {
                        marginStart = 0;
                    }
                    ViewGroup.LayoutParams layoutParams4 = linearLayout.getLayoutParams();
                    if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                        marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams4).getMarginEnd();
                    } else {
                        marginEnd = 0;
                    }
                    int i2 = marginStart + marginEnd;
                    TuxIconView tuxIconView = ecSearchNoCartFypBottomButtonAssem.LLLLJI;
                    if (tuxIconView != null) {
                        ViewGroup.LayoutParams layoutParams5 = tuxIconView.getLayoutParams();
                        if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                            iLIZIZ4 = ((ViewGroup.MarginLayoutParams) layoutParams5).getMarginEnd();
                        } else {
                            iLIZIZ4 = 0;
                        }
                    } else {
                        iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                    }
                    int i3 = i2 + iLIZIZ4;
                    TuxTextView tuxTextView = ecSearchNoCartFypBottomButtonAssem.LLLLJ;
                    if (tuxTextView != null && (layoutParams2 = tuxTextView.getLayoutParams()) != null) {
                        iLIZIZ5 = layoutParams2.width;
                    } else {
                        iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                    }
                    i = i3 + iLIZIZ5;
                } else {
                    i = 0;
                }
                TuxIconView tuxIconView2 = ecSearchNoCartFypBottomButtonAssem.LLLLJI;
                if (tuxIconView2 != null) {
                    iLIZIZ = tuxIconView2.getWidth();
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                }
                TuxTextView tuxTextView2 = ecSearchNoCartFypBottomButtonAssem.LLLLIL;
                if (tuxTextView2 != null && (paint = tuxTextView2.getPaint()) != null) {
                    iMeasureText = (int) paint.measureText(c1770220wAO.LIZIZ.guideText);
                } else {
                    iMeasureText = 0;
                }
                SmartImageView smartImageView2 = ecSearchNoCartFypBottomButtonAssem.LLLLILI;
                if (smartImageView2 != null && (layoutParams = smartImageView2.getLayoutParams()) != null) {
                    iLIZIZ2 = layoutParams.height;
                } else {
                    iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                }
                int width = (int) (bitmap.getWidth() * (iLIZIZ2 / bitmap.getHeight()));
                int i4 = iLIZIZ + width + iMeasureText + i;
                FrameLayout frameLayout = ecSearchNoCartFypBottomButtonAssem.LLLLIILL;
                if (frameLayout != null) {
                    iLIZIZ3 = frameLayout.getWidth();
                } else {
                    iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(280));
                }
                if (i4 <= iLIZIZ3 && (smartImageView = ecSearchNoCartFypBottomButtonAssem.LLLLILI) != null) {
                    TuxTextView tuxTextView3 = ecSearchNoCartFypBottomButtonAssem.LLLLJ;
                    if (tuxTextView3 != null) {
                        C337180DJs.LIZJ(tuxTextView3);
                    }
                    ecSearchNoCartFypBottomButtonAssem.LLLILZJ = true;
                    C1744700vVE.LJIIL(smartImageView, width);
                    C337180DJs.LIZJ(smartImageView);
                    smartImageView.setImageBitmap(bitmap);
                }
            }
        }
        C1770320wAY c1770320wAY = C1770320wAY.LIZ;
        Map<String, Object> mapLJ = ((C1770220wAO) awS154S0400000_26.l1).LIZIZ.daParams;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        Integer numValueOf = Integer.valueOf(((C118300cf) awS154S0400000_26.l2).element);
        TuxTextView tuxTextView4 = ((EcSearchNoCartFypBottomButtonAssem) awS154S0400000_26.l3).LLLLIL;
        if (tuxTextView4 != null) {
            C680790Qn7.LIZ.getClass();
            zLIZLLL = C680790Qn7.LIZLLL(tuxTextView4);
        }
        Boolean boolValueOf = Boolean.valueOf(zLIZLLL);
        EcSearchNoCartFypBottomButtonAssem ecSearchNoCartFypBottomButtonAssem2 = (EcSearchNoCartFypBottomButtonAssem) awS154S0400000_26.l3;
        if (ecSearchNoCartFypBottomButtonAssem2.LLLILZJ) {
            str = "promotion_image";
        } else {
            str = "normal";
        }
        String strBp = ecSearchNoCartFypBottomButtonAssem2.Bp();
        c1770320wAY.getClass();
        C1770320wAY.LJIIJJI(mapLJ, numValueOf, boolValueOf, str, strBp);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS154S0400000_26 awS154S0400000_26) {
        Unit unit;
        String str;
        String str2;
        String str3;
        String str4;
        C1740040vNi c1740040vNi = C1740040vNi.LIZ;
        Map map = (Map) awS154S0400000_26.l0;
        DiversionTargetRes diversionTargetRes = (DiversionTargetRes) awS154S0400000_26.l1;
        c1740040vNi.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> it2 = NativePrefetchPopUpExperiment.LIZ().readGlobalContextList.iterator();
        while (true) {
            Object obj = "";
            unit = null;
            if (!it2.hasNext()) {
                break;
            }
            String next = it2.next();
            Object obj2 = map.get(next);
            if (obj2 != null) {
                obj = obj2;
            }
            linkedHashMap.put(next, obj);
            if (Intrinsics.LJFF(next, "diversion_params") && NativePrefetchPopUpExperiment.LIZ().needUpdateNoAnchorVideoParam) {
                try {
                    Object obj3 = map.get("mall_extra_info");
                    if ((obj3 instanceof String) && (str3 = (String) obj3) != null) {
                        if (str3.length() > 0) {
                            new p();
                            if (Intrinsics.LJFF(C2399609ak.LIZJ(p.LIZJ(str3).LJIILIIL(), "mall_out_source"), "homepage_hot_no_anchor_video")) {
                                Object obj4 = linkedHashMap.get(next);
                                if ((obj4 instanceof String) && (str4 = (String) obj4) != null && str4.length() > 0) {
                                    new p();
                                    n nVarLJIILIIL = p.LIZJ(str4).LJIILIIL();
                                    nVarLJIILIIL.LJJII(Boolean.FALSE, "diversion_params_for_popup");
                                    linkedHashMap.put(next, nVarLJIILIIL.toString());
                                }
                            }
                        }
                        unit = Unit.LIZ;
                    }
                    C189200o6.m2constructorimpl(unit);
                } catch (CancellationException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw e;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1AF0.LJ(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            if (Intrinsics.LJFF(next, "previous_page")) {
                if (Intrinsics.LJFF(map.get(next), "homepage_hot")) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("mall_enter_cnt_app_launch", str2);
            }
        }
        if (diversionTargetRes != null) {
            try {
                DiversionTargetResCfg diversionTargetResCfg = diversionTargetRes.config;
                if (diversionTargetResCfg != null && (str = diversionTargetResCfg.requestParams) != null) {
                    if (str.length() > 0) {
                        new p();
                        Set<Map.Entry<String, k>> setEntrySet = p.LIZJ(str).LJIILIIL().entrySet();
                        if (setEntrySet != null) {
                            Iterator<T> it3 = setEntrySet.iterator();
                            while (it3.hasNext()) {
                                Map.Entry entry = (Map.Entry) it3.next();
                                if (!linkedHashMap.containsKey(entry.getKey())) {
                                    Object key = entry.getKey();
                                    Object obj5 = (k) entry.getValue();
                                    if (obj5 == null) {
                                        obj5 = "";
                                    }
                                    linkedHashMap.put(key, obj5);
                                }
                            }
                        }
                    }
                    unit = Unit.LIZ;
                }
            } catch (CancellationException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw e2;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C1AF0.LJ(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
        }
        C189200o6.m2constructorimpl(unit);
        linkedHashMap.put("popup_request_region", C2505309rn.LIZ.getValue());
        C1739770vNH.LJ(null, linkedHashMap, "tiktok_ecom_hybrid_mall", "tiktok_ecom_hybrid_mall", "config", new AwS392S0200000_26((Function1) awS154S0400000_26.l2, (Function1<? super String, Unit>) awS154S0400000_26.l3, (Function0<Unit>) 100));
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS154S0400000_26 awS154S0400000_26) {
        String hint;
        C1748720vbi.LIZLLL((C1749140vcO) awS154S0400000_26.l0, new AnonymousClass0483(), new AwS235S0300000_26((AddressIdentityAssem) awS154S0400000_26.l1, (IdentityInfoOption) awS154S0400000_26.l2, (IdentityInfoPanel) awS154S0400000_26.l3, 30));
        AddressIdentityAssem addressIdentityAssem = (AddressIdentityAssem) awS154S0400000_26.l1;
        IdentityInfoOption identityInfoOption = (IdentityInfoOption) awS154S0400000_26.l2;
        addressIdentityAssem.LLJJ = identityInfoOption;
        ((C1749140vcO) awS154S0400000_26.l0).setText(identityInfoOption.getName());
        if (C703302op.LIZ(((IdentityInfoOption) awS154S0400000_26.l2).getValue())) {
            C1748440vbG c1748440vbG = ((AddressIdentityAssem) awS154S0400000_26.l1).LLJILLL;
            if (c1748440vbG != null) {
                c1748440vbG.LLJLILLLLZIIL.setText(((IdentityInfoOption) awS154S0400000_26.l2).getValue());
            }
        } else {
            C1748440vbG c1748440vbG2 = ((AddressIdentityAssem) awS154S0400000_26.l1).LLJILLL;
            if (c1748440vbG2 != null) {
                c1748440vbG2.LLJLILLLLZIIL.setText((CharSequence) null);
            }
            C1748440vbG c1748440vbG3 = ((AddressIdentityAssem) awS154S0400000_26.l1).LLJILLL;
            if (c1748440vbG3 != null) {
                if (C0C17.LIZ()) {
                    hint = ((IdentityInfoPanel) awS154S0400000_26.l3).getPlaceholderText();
                } else {
                    hint = ((IdentityInfoOption) awS154S0400000_26.l2).getHint();
                    if (hint == null) {
                        hint = "";
                    }
                }
                c1748440vbG3.setPlaceholderText(hint);
            }
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$2(AwS154S0400000_26 awS154S0400000_26) {
        Fragment fragment = (Fragment) awS154S0400000_26.l0;
        ViewModel viewModel = ViewModelProviders.of(fragment, ((InterfaceC1075600e62) fragment).jl()).get((String) ((Function0) awS154S0400000_26.l1).invoke(), C09R7.LIZ((C13IQ) awS154S0400000_26.l2));
        Function2 function2 = (Function2) awS154S0400000_26.l3;
        Fragment fragment2 = (Fragment) awS154S0400000_26.l0;
        JediViewModel jediViewModel = (JediViewModel) viewModel;
        InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(AddressEditViewModel.class);
        if (interfaceC1766500w4OCreate != null) {
            interfaceC1766500w4OCreate.LIZ();
        }
        jediViewModel.JQ2(new AwS392S0200000_26(function2, fragment2, 25));
        return jediViewModel;
    }

    public static final Object invoke$20(AwS154S0400000_26 awS154S0400000_26) {
        ((C1709140uZs) awS154S0400000_26.l0).LIZIZ((C995290c0V) awS154S0400000_26.l1, (C1709570uaZ) awS154S0400000_26.l2, (Function0) awS154S0400000_26.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS154S0400000_26 awS154S0400000_26) {
        List listLJIIJJI = C1697810uHb.LJIIJJI(new Pair("host", ((C1718420uoq) awS154S0400000_26.l0).LLILLL), new Pair("session_id", ((C1718420uoq) awS154S0400000_26.l0).LLILZ), new Pair("previous_page_id", ((C1718420uoq) awS154S0400000_26.l0).LLILLJJLI), new Pair("merchant_id", ((C1718420uoq) awS154S0400000_26.l0).LLIZ), new Pair("merchant_user_id", ((C1718420uoq) awS154S0400000_26.l0).LLIZLLLIL), new Pair("pipo_product_code", ((C1718420uoq) awS154S0400000_26.l0).LLILZIL), new Pair("source", ((C1718420uoq) awS154S0400000_26.l0).LLILZIL), new Pair(Scene.SCENE_SERVICE, ((C1718420uoq) awS154S0400000_26.l0).LLILZIL));
        C1718820upU c1718820upU = C1718820upU.LIZ;
        Context context = (Context) awS154S0400000_26.l1;
        HintPageMsg hintPageMsg = (HintPageMsg) awS154S0400000_26.l2;
        Function1 function1 = (Function1) awS154S0400000_26.l3;
        c1718820upU.getClass();
        C1718820upU.LIZIZ(context, hintPageMsg, listLJIIJJI, function1);
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS154S0400000_26 awS154S0400000_26) {
        List listLJIIJJI = C1697810uHb.LJIIJJI(new Pair("host", ((C1718430uor) awS154S0400000_26.l0).LLILLJJLI), new Pair("session_id", ((C1718430uor) awS154S0400000_26.l0).LLILLL), new Pair("previous_page_id", ((C1718430uor) awS154S0400000_26.l0).LL), new Pair("merchant_id", ((C1718430uor) awS154S0400000_26.l0).LLILZLL), new Pair("merchant_user_id", ((C1718430uor) awS154S0400000_26.l0).LLIZ), new Pair("pipo_product_code", ((C1718430uor) awS154S0400000_26.l0).LLILZ), new Pair("source", ((C1718430uor) awS154S0400000_26.l0).LLILZ), new Pair(Scene.SCENE_SERVICE, ((C1718430uor) awS154S0400000_26.l0).LLILZ));
        C1718820upU c1718820upU = C1718820upU.LIZ;
        Context context = (Context) awS154S0400000_26.l1;
        HintPageMsg hintPageMsg = (HintPageMsg) awS154S0400000_26.l2;
        Function1 function1 = (Function1) awS154S0400000_26.l3;
        c1718820upU.getClass();
        C1718820upU.LIZIZ(context, hintPageMsg, listLJIIJJI, function1);
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS154S0400000_26 awS154S0400000_26) {
        List listLJIIJJI = C1697810uHb.LJIIJJI(new Pair("host", ((C1718710upJ) awS154S0400000_26.l0).LLILZLL), new Pair("session_id", ((C1718710upJ) awS154S0400000_26.l0).LLIZ), new Pair("previous_page_id", ((C1718710upJ) awS154S0400000_26.l0).LL), new Pair("merchant_id", ((C1718710upJ) awS154S0400000_26.l0).LLIZLLLIL), new Pair("merchant_user_id", ((C1718710upJ) awS154S0400000_26.l0).LLJ), new Pair("pipo_product_code", ((C1718710upJ) awS154S0400000_26.l0).LLILLJJLI), new Pair("source", ((C1718710upJ) awS154S0400000_26.l0).LLILLJJLI), new Pair(Scene.SCENE_SERVICE, ((C1718710upJ) awS154S0400000_26.l0).LLILLJJLI));
        C1718820upU c1718820upU = C1718820upU.LIZ;
        Context context = (Context) awS154S0400000_26.l1;
        HintPageMsg hintPageMsg = (HintPageMsg) awS154S0400000_26.l2;
        Function1 function1 = (Function1) awS154S0400000_26.l3;
        c1718820upU.getClass();
        C1718820upU.LIZIZ(context, hintPageMsg, listLJIIJJI, function1);
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS154S0400000_26 awS154S0400000_26) {
        ((C1725060uzY) awS154S0400000_26.l0).LJIIIIZZ("handle_action_string", (C1710940ucm) awS154S0400000_26.l1, (ErrorActionResponse) awS154S0400000_26.l2, (InterfaceC1725110uzd) awS154S0400000_26.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS154S0400000_26 awS154S0400000_26) {
        ((C1725060uzY) awS154S0400000_26.l0).LJIIIIZZ("handle_client_se", (C1710940ucm) awS154S0400000_26.l1, (ErrorActionResponse) awS154S0400000_26.l2, (InterfaceC1725110uzd) awS154S0400000_26.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS154S0400000_26 awS154S0400000_26) {
        C1708640uZ4.LIZ.LIZIZ((Context) awS154S0400000_26.l0, (C1709570uaZ) awS154S0400000_26.l1, (PaymentOption) awS154S0400000_26.l2, (InterfaceC1631630sYr) awS154S0400000_26.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$27(AwS154S0400000_26 awS154S0400000_26) {
        ((C1759440vt0) awS154S0400000_26.l0).LJ((ViewGroup) ((View) awS154S0400000_26.l1), (EnumC1759580vtE) awS154S0400000_26.l2);
        Function0 function0 = (Function0) awS154S0400000_26.l3;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$28(AwS154S0400000_26 awS154S0400000_26) {
        PdpBodyVM pdpBodyVM = (PdpBodyVM) awS154S0400000_26.l0;
        InterfaceC2217241BqE interfaceC2217241BqE = (InterfaceC2217241BqE) awS154S0400000_26.l1;
        InterfaceC2217241BqE interfaceC2217241BqE2 = (InterfaceC2217241BqE) awS154S0400000_26.l2;
        AwS640S0100000_26 awS640S0100000_26 = new AwS640S0100000_26((PdpBodyAssem) awS154S0400000_26.l3, 153);
        pdpBodyVM.getClass();
        AssemViewModel.selectSubscribe$default(pdpBodyVM, null, interfaceC2217241BqE, interfaceC2217241BqE2, null, null, null, awS640S0100000_26, 57, null);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$29(AwS154S0400000_26 awS154S0400000_26) {
        Fragment fragment = (Fragment) awS154S0400000_26.l0;
        ViewModel viewModel = ViewModelProviders.of(fragment, ((InterfaceC1075600e62) fragment).jl()).get((String) ((Function0) awS154S0400000_26.l1).invoke(), C09R7.LIZ((C13IQ) awS154S0400000_26.l2));
        Function2 function2 = (Function2) awS154S0400000_26.l3;
        Fragment fragment2 = (Fragment) awS154S0400000_26.l0;
        JediViewModel jediViewModel = (JediViewModel) viewModel;
        InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(PdpViewModel.class);
        if (interfaceC1766500w4OCreate != null) {
            interfaceC1766500w4OCreate.LIZ();
        }
        jediViewModel.JQ2(new AwS392S0200000_26(function2, fragment2, 199));
        return jediViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$3(AwS154S0400000_26 awS154S0400000_26) {
        Fragment fragment = (Fragment) awS154S0400000_26.l0;
        ViewModel viewModel = ViewModelProviders.of(fragment, ((InterfaceC1075600e62) fragment).jl()).get((String) ((Function0) awS154S0400000_26.l1).invoke(), C09R7.LIZ((C13IQ) awS154S0400000_26.l2));
        Function2 function2 = (Function2) awS154S0400000_26.l3;
        Fragment fragment2 = (Fragment) awS154S0400000_26.l0;
        JediViewModel jediViewModel = (JediViewModel) viewModel;
        InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(DeliveryInstructionViewModel.class);
        if (interfaceC1766500w4OCreate != null) {
            interfaceC1766500w4OCreate.LIZ();
        }
        jediViewModel.JQ2(new AwS392S0200000_26(function2, fragment2, 29));
        return jediViewModel;
    }

    public static final Object invoke$30(AwS154S0400000_26 awS154S0400000_26) {
        ((C1733010vCN) awS154S0400000_26.l0).LLILLJJLI.LJIIL((List) awS154S0400000_26.l1, (Map) awS154S0400000_26.l2, (ECBillboard) awS154S0400000_26.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$31(AwS154S0400000_26 awS154S0400000_26) {
        ((C1733010vCN) awS154S0400000_26.l0).LLILLJJLI.LJIIL((List) awS154S0400000_26.l1, (Map) awS154S0400000_26.l2, (ECBillboard) awS154S0400000_26.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$32(AwS154S0400000_26 awS154S0400000_26) {
        ((C1733010vCN) awS154S0400000_26.l0).LLILLJJLI.LJIIL((List) awS154S0400000_26.l1, (Map) awS154S0400000_26.l2, (ECBillboard) awS154S0400000_26.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$33(AwS154S0400000_26 awS154S0400000_26) {
        String str;
        String str2;
        C1715530ukB c1715530ukB = C1715530ukB.LIZ;
        Context context = (Context) awS154S0400000_26.l0;
        AlertMsg alertMsg = (AlertMsg) awS154S0400000_26.l1;
        ArrayList arrayList = null;
        if (alertMsg != null) {
            str = alertMsg.title;
            str2 = alertMsg.content;
            List<PopupContent> list = alertMsg.button;
            if (list != null) {
                arrayList = new ArrayList();
                for (PopupContent popupContent : list) {
                    if (Intrinsics.LJFF(popupContent.type, "button")) {
                        arrayList.add(popupContent);
                    }
                }
            }
        } else {
            str = null;
            str2 = null;
        }
        C1715530ukB c1715530ukB2 = C1715530ukB.LIZ;
        C1713570uh1 c1713570uh1 = (C1713570uh1) awS154S0400000_26.l2;
        c1715530ukB2.getClass();
        ArrayList arrayList2 = new ArrayList();
        C1714230ui5.LIZLLL(new AwS427S0200000_26(c1713570uh1, (C1713570uh1) arrayList2, (List<Pair<String, String>>) 97));
        Function1 function1 = (Function1) awS154S0400000_26.l3;
        c1715530ukB.getClass();
        C1715530ukB.LIZIZ(context, str, str2, arrayList, arrayList2, function1);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$4(AwS154S0400000_26 awS154S0400000_26) {
        C19GS c19gs = (C19GS) awS154S0400000_26.l0;
        ViewModel viewModel = ViewModelProviders.of(c19gs, ((InterfaceC1075600e62) c19gs).jl()).get(C09R7.LIZ((C13IQ) awS154S0400000_26.l3).getName(), C09R7.LIZ((C13IQ) awS154S0400000_26.l1));
        Function2 function2 = (Function2) awS154S0400000_26.l2;
        C19GS c19gs2 = (C19GS) awS154S0400000_26.l0;
        JediViewModel jediViewModel = (JediViewModel) viewModel;
        InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(AddressEditDetailViewModel.class);
        if (interfaceC1766500w4OCreate != null) {
            interfaceC1766500w4OCreate.LIZ();
        }
        jediViewModel.JQ2(new AwS391S0200000_25(function2, c19gs2, 43));
        return jediViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$5(AwS154S0400000_26 awS154S0400000_26) {
        Fragment fragment = (Fragment) awS154S0400000_26.l0;
        ViewModel viewModel = ViewModelProviders.of(fragment, ((InterfaceC1075600e62) fragment).jl()).get((String) ((Function0) awS154S0400000_26.l1).invoke(), C09R7.LIZ((C13IQ) awS154S0400000_26.l2));
        Function2 function2 = (Function2) awS154S0400000_26.l3;
        Fragment fragment2 = (Fragment) awS154S0400000_26.l0;
        JediViewModel jediViewModel = (JediViewModel) viewModel;
        InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(AddressMapDetailViewModel.class);
        if (interfaceC1766500w4OCreate != null) {
            interfaceC1766500w4OCreate.LIZ();
        }
        jediViewModel.JQ2(new AwS392S0200000_26(function2, fragment2, 36));
        return jediViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$6(AwS154S0400000_26 awS154S0400000_26) {
        Fragment fragment = (Fragment) awS154S0400000_26.l0;
        ViewModel viewModel = ViewModelProviders.of(fragment, ((InterfaceC1075600e62) fragment).jl()).get((String) ((Function0) awS154S0400000_26.l1).invoke(), C09R7.LIZ((C13IQ) awS154S0400000_26.l2));
        Function2 function2 = (Function2) awS154S0400000_26.l3;
        Fragment fragment2 = (Fragment) awS154S0400000_26.l0;
        JediViewModel jediViewModel = (JediViewModel) viewModel;
        InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(SeaPdpViewModel.class);
        if (interfaceC1766500w4OCreate != null) {
            interfaceC1766500w4OCreate.LIZ();
        }
        jediViewModel.JQ2(new AwS392S0200000_26(function2, fragment2, 40));
        return jediViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$7(AwS154S0400000_26 awS154S0400000_26) {
        Fragment fragment = (Fragment) awS154S0400000_26.l0;
        ViewModel viewModel = ViewModelProviders.of(fragment, ((InterfaceC1075600e62) fragment).jl()).get((String) ((Function0) awS154S0400000_26.l1).invoke(), C09R7.LIZ((C13IQ) awS154S0400000_26.l2));
        Function2 function2 = (Function2) awS154S0400000_26.l3;
        Fragment fragment2 = (Fragment) awS154S0400000_26.l0;
        JediViewModel jediViewModel = (JediViewModel) viewModel;
        InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(PdpViewModel.class);
        if (interfaceC1766500w4OCreate != null) {
            interfaceC1766500w4OCreate.LIZ();
        }
        jediViewModel.JQ2(new AwS392S0200000_26(function2, fragment2, 45));
        return jediViewModel;
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(AwS154S0400000_26 awS154S0400000_26) {
        ViewModelProvider viewModelProviderOf;
        Object objLIZJ = ((Widget) awS154S0400000_26.l0).LIZJ();
        if (objLIZJ instanceof Fragment) {
            viewModelProviderOf = ViewModelProviders.of((Fragment) objLIZJ, ((InterfaceC1075600e62) ((Widget) awS154S0400000_26.l0)).jl());
        } else if (objLIZJ instanceof C19EG) {
            viewModelProviderOf = ViewModelProviders.of((C19EG) objLIZJ, ((InterfaceC1075600e62) ((Widget) awS154S0400000_26.l0)).jl());
        } else {
            throw new IllegalStateException();
        }
        JediViewModel jediViewModel = (JediViewModel) viewModelProviderOf.get((String) ((Function0) awS154S0400000_26.l1).invoke(), C09R7.LIZ((C13IQ) awS154S0400000_26.l2));
        InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(SeaPdpSkcPanelHeaderViewModel.class);
        if (interfaceC1766500w4OCreate != null) {
            interfaceC1766500w4OCreate.LIZ();
        }
        jediViewModel.JQ2((Function1) awS154S0400000_26.l3);
        return jediViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$9(AwS154S0400000_26 awS154S0400000_26) {
        Fragment fragment = (Fragment) awS154S0400000_26.l0;
        ViewModel viewModel = ViewModelProviders.of(fragment, ((InterfaceC1075600e62) fragment).jl()).get((String) ((Function0) awS154S0400000_26.l1).invoke(), C09R7.LIZ((C13IQ) awS154S0400000_26.l2));
        Function2 function2 = (Function2) awS154S0400000_26.l3;
        Fragment fragment2 = (Fragment) awS154S0400000_26.l0;
        JediViewModel jediViewModel = (JediViewModel) viewModel;
        InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(DistrictPickerViewModel.class);
        if (interfaceC1766500w4OCreate != null) {
            interfaceC1766500w4OCreate.LIZ();
        }
        jediViewModel.JQ2(new AwS392S0200000_26(function2, fragment2, 51));
        return jediViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS154S0400000_26(C259800zU c259800zU, C259800zU<Bitmap> c259800zU2, C1770220wAO c1770220wAO, C118300cf c118300cf, EcSearchNoCartFypBottomButtonAssem ecSearchNoCartFypBottomButtonAssem) {
        super(0);
        this.$t = ecSearchNoCartFypBottomButtonAssem;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = c1770220wAO;
        this.l3 = c118300cf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS154S0400000_26(C259800zU c259800zU, C259800zU<Bitmap> c259800zU2, C1770220wAO c1770220wAO, C118300cf c118300cf, EcSearchNoCartFypBottomButtonAssemV2 ecSearchNoCartFypBottomButtonAssemV2) {
        super(0);
        this.$t = ecSearchNoCartFypBottomButtonAssemV2;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = c1770220wAO;
        this.l3 = c118300cf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS154S0400000_26(C1709140uZs c1709140uZs, C1709140uZs c1709140uZs2, C995290c0V c995290c0V, C1709570uaZ c1709570uaZ, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = c1709140uZs;
        this.l1 = c1709140uZs2;
        this.l2 = c995290c0V;
        this.l3 = c1709570uaZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS154S0400000_26(C1725060uzY c1725060uzY, C1710940ucm c1710940ucm, ErrorActionResponse errorActionResponse, C921403iu c921403iu, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1725060uzY;
        this.l1 = c1710940ucm;
        this.l2 = errorActionResponse;
        this.l3 = c921403iu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS154S0400000_26(C1725060uzY c1725060uzY, C1710940ucm c1710940ucm, ErrorActionResponse errorActionResponse, InterfaceC1725110uzd interfaceC1725110uzd, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1725060uzY;
        this.l1 = c1710940ucm;
        this.l2 = errorActionResponse;
        this.l3 = interfaceC1725110uzd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS154S0400000_26(C1733010vCN c1733010vCN, C1733010vCN c1733010vCN2, List<ECBillboard> list, Map<String, ? extends Object> map, ECBillboard eCBillboard) {
        super(0);
        this.$t = eCBillboard;
        this.l0 = c1733010vCN;
        this.l1 = c1733010vCN2;
        this.l2 = list;
        this.l3 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS154S0400000_26(C1749140vcO c1749140vcO, AddressIdentityAssem addressIdentityAssem, IdentityInfoOption identityInfoOption, IdentityInfoPanel identityInfoPanel, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1749140vcO;
        this.l1 = addressIdentityAssem;
        this.l2 = identityInfoOption;
        this.l3 = identityInfoPanel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS154S0400000_26(C1749710vdJ c1749710vdJ, C1749710vdJ c1749710vdJ2, InterfaceC1748810vbr interfaceC1748810vbr, ProductPackStruct productPackStruct, HashMap<String, Object> map) {
        super(0);
        this.$t = map;
        this.l0 = c1749710vdJ;
        this.l1 = c1749710vdJ2;
        this.l2 = interfaceC1748810vbr;
        this.l3 = productPackStruct;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS154S0400000_26(C1759440vt0 c1759440vt0, C1759440vt0 c1759440vt02, View view, EnumC1759580vtE enumC1759580vtE, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = c1759440vt0;
        this.l1 = c1759440vt02;
        this.l2 = view;
        this.l3 = enumC1759580vtE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS154S0400000_26(C19GS c19gs, C13IQ c13iq, Function2 function2, C13IQ c13iq2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19gs;
        this.l1 = c13iq;
        this.l2 = function2;
        this.l3 = c13iq2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS154S0400000_26(Context context, Context context2, C1709570uaZ c1709570uaZ, PaymentOption paymentOption, InterfaceC1631630sYr<? super EnumC336190DFx, ? super List<POPayElement>, ? super String, ? super String, Unit> interfaceC1631630sYr) {
        super(0);
        this.$t = interfaceC1631630sYr;
        this.l0 = context;
        this.l1 = context2;
        this.l2 = c1709570uaZ;
        this.l3 = paymentOption;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS154S0400000_26(Context context, AlertMsg alertMsg, C1713570uh1 c1713570uh1, AwS140S1100000_26 awS140S1100000_26, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = alertMsg;
        this.l2 = c1713570uh1;
        this.l3 = awS140S1100000_26;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS154S0400000_26(Fragment fragment, Function0 function0, C13IQ c13iq, Function2 function2, int i) {
        super(0);
        this.$t = i;
        this.l0 = fragment;
        this.l1 = function0;
        this.l2 = c13iq;
        this.l3 = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS154S0400000_26(Widget widget, Function0 function0, C13IQ c13iq, Function1 function1, int i) {
        super(0);
        this.$t = i;
        this.l0 = widget;
        this.l1 = function0;
        this.l2 = c13iq;
        this.l3 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS154S0400000_26(PdpBodyVM pdpBodyVM, InterfaceC2217241BqE interfaceC2217241BqE, InterfaceC2217241BqE interfaceC2217241BqE2, PdpBodyAssem pdpBodyAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = pdpBodyVM;
        this.l1 = interfaceC2217241BqE;
        this.l2 = interfaceC2217241BqE2;
        this.l3 = pdpBodyAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS154S0400000_26(TemplateEditBottomAreaViewModel templateEditBottomAreaViewModel, TemplateItem templateItem, TemplateItem templateItem2, ViewGroup viewGroup, int i) {
        super(0);
        this.$t = i;
        this.l0 = templateEditBottomAreaViewModel;
        this.l1 = templateItem;
        this.l2 = templateItem2;
        this.l3 = viewGroup;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS154S0400000_26(Map map, DiversionTargetRes diversionTargetRes, AwS588S0100000_9 awS588S0100000_9, AwS570S0100000_26 awS570S0100000_26, int i) {
        super(0);
        this.$t = i;
        this.l0 = map;
        this.l1 = diversionTargetRes;
        this.l2 = awS588S0100000_9;
        this.l3 = awS570S0100000_26;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS154S0400000_26(Context context, HintPageMsg hintPageMsg, C1718420uoq c1718420uoq, String str, AwS235S0300000_26 awS235S0300000_26, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1718420uoq;
        this.l1 = context;
        this.l2 = hintPageMsg;
        this.l3 = awS235S0300000_26;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS154S0400000_26(Context context, HintPageMsg hintPageMsg, C1718430uor c1718430uor, String str, AwS235S0300000_26 awS235S0300000_26, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1718430uor;
        this.l1 = context;
        this.l2 = hintPageMsg;
        this.l3 = awS235S0300000_26;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS154S0400000_26(Context context, HintPageMsg hintPageMsg, C1718710upJ c1718710upJ, String str, AwS392S0200000_26 awS392S0200000_26, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1718710upJ;
        this.l1 = context;
        this.l2 = hintPageMsg;
        this.l3 = awS392S0200000_26;
    }
}
