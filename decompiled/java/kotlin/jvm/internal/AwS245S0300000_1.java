package kotlin.jvm.internal;

import X.AnonymousClass0378;
import X.C039O;
import X.C039Q;
import X.C03AZ;
import X.C03CJ;
import X.C03CL;
import X.C03DX;
import X.C03E9;
import X.C03GO;
import X.C03HJ;
import X.C03KY;
import X.C03O0;
import X.C03O1;
import X.C03PI;
import X.C03RK;
import X.C03RL;
import X.C03RW;
import X.C03SW;
import X.C03SY;
import X.C03X9;
import X.C03XD;
import X.C03XG;
import X.C03ZB;
import X.C03ZC;
import X.C03ZD;
import X.C03ZF;
import X.C048H;
import X.C048K;
import X.C049H;
import X.C049Y;
import X.C04C6;
import X.C04E4;
import X.C09AY;
import X.C1018703yb;
import X.C1020703yv;
import X.C10513049f;
import X.C10516049i;
import X.C1054104Ah;
import X.C1063704Dz;
import X.C118300cf;
import X.C123100dR;
import X.C1294720jnS;
import X.C1295960jpS;
import X.C1323720kYE;
import X.C1388190mED;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C1741890vQh;
import X.C1748720vbi;
import X.C19EG;
import X.C19ME;
import X.C1AF0;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C23250099c;
import X.C23271099x;
import X.C2341109Fh;
import X.C259800zU;
import X.C418440Gaw;
import X.C426160GnO;
import X.C714302qb;
import X.C719102rN;
import X.C719202rO;
import X.C719302rP;
import X.C722902rz;
import X.C765002ym;
import X.C770702zh;
import X.C786410Ut5;
import X.C7879035x;
import X.C7976039q;
import X.C7977039r;
import X.C807203Di;
import X.C807503Dl;
import X.C814420VxA;
import X.C817803Hk;
import X.C862603Yq;
import X.C864903Zn;
import X.C866903a7;
import X.C873003b6;
import X.C882103cZ;
import X.C889403dk;
import X.C890803dy;
import X.C899503fN;
import X.C928203k0;
import X.C948503nH;
import X.C960603pE;
import X.C990503u3;
import X.C990603u4;
import X.EnumC865103Zp;
import X.InterfaceC1294390jmv;
import X.InterfaceC1748810vbr;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC989703tv;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.SystemClock;
import android.text.Layout;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.api.model.RedirectContent;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.DiscountView;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DeliveryData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticItem;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPanelModule;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.vm.OspShopViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.MiniOspPaymentInfoCell2;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.summary.SummaryCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.aggregation.USCombineAggregationOrderCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.payment.USPaymentInfoCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.usertrust.ImageRichText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.usertrust.UserTrustItemDescriptionChunk;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.usexpress.logistics.USHalfLogisticsCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ActivateHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentServiceFeeInfoToolTips;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentTip;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.InstallmentPlanListElementViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Announcement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.subpage.USAggregationProductInfoAssemFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ContactDetail;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceBubble;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingModuleMeta;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPreviewInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpShipping;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.header.SeaPdpHeadViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.logisticis.SeaShippingVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.waistbanner.SeaPdpWaistBannerViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpBottomNavBarWidgetNew;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.returnpolicies.ReturnPoliciesFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.feed.model.InlineLink;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import g1c.AjS20S0300000_1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import kotlin.text.u;
import oqa.h;

/* JADX INFO: loaded from: classes2.dex */
public class AwS245S0300000_1 extends C09AY implements Function0 {
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
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this);
            case 35:
                return invoke$35(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this);
            case 37:
                return invoke$37(this);
            case 38:
                return invoke$38(this);
            case 39:
                return invoke$39(this);
            case 40:
                return invoke$40(this);
            case 41:
                return invoke$41(this);
            case 42:
                return invoke$42(this);
            case 43:
                return invoke$43(this);
            case 44:
                return invoke$44(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS245S0300000_1 awS245S0300000_1) {
        String str;
        PaymentInfo paymentInfo;
        C864903Zn c864903Zn = C864903Zn.LIZ;
        PaymentMethod paymentMethod = (PaymentMethod) awS245S0300000_1.l0;
        if (paymentMethod != null) {
            str = paymentMethod.id;
        } else {
            str = null;
        }
        c864903Zn.getClass();
        if (C864903Zn.LIZ(str) && C864903Zn.LIZIZ().useNewPayInfo) {
            paymentInfo = ((PaymentInfoCell2) awS245S0300000_1.l1).V5().LLJJJ;
        } else {
            paymentInfo = ((PaymentInfoCell2) awS245S0300000_1.l1).LLJIJIL;
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(((C03ZB) awS245S0300000_1.l2).getContext());
        if (c19egLIZIZ != null) {
            PaymentInfoCell2 paymentInfoCell2 = (PaymentInfoCell2) awS245S0300000_1.l1;
            PaymentInfoViewModel.zQ2(paymentInfoCell2.T5(), c19egLIZIZ.getSupportFragmentManager(), (PaymentMethod) awS245S0300000_1.l0, paymentInfo, paymentInfoCell2.V5(), EnumC865103Zp.SELECT_INSTALLMENT_PLAN, null, null, null, false, 480);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS245S0300000_1 awS245S0300000_1) {
        C882103cZ.LIZ((FragmentManager) awS245S0300000_1.l0, ((C03ZB) awS245S0300000_1.l1).getContext(), (PaymentServiceFeeInfoToolTips) awS245S0300000_1.l2);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$10(kotlin.jvm.internal.AwS245S0300000_1 r11) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS245S0300000_1.invoke$10(kotlin.jvm.internal.AwS245S0300000_1):java.lang.Object");
    }

    public static final Object invoke$11(AwS245S0300000_1 awS245S0300000_1) {
        C1748720vbi.LIZLLL(((C039O) awS245S0300000_1.l0).LL, new C10513049f(), new AwS367S0200000_1((C714302qb) awS245S0300000_1.l1, (C039Q) awS245S0300000_1.l2, 74));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$12(AwS245S0300000_1 awS245S0300000_1) {
        ExceptionUX exceptionUX;
        RedirectContent redirectContent;
        String strLJIIIIZZ;
        PayResponseData payResponseData = (PayResponseData) ((Response) awS245S0300000_1.l0).data;
        if (payResponseData != null && (exceptionUX = payResponseData.exceptionUX) != null && (redirectContent = exceptionUX.redirectContent) != null) {
            Function0 function0 = (Function0) awS245S0300000_1.l1;
            C03PI c03pi = (C03PI) awS245S0300000_1.l2;
            String str = redirectContent.jumpSchema;
            if (str != null) {
                Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
                builderBuildUpon.appendQueryParameter("source", c03pi.LIZLLL);
                HashMap<String, Object> map = c03pi.LJII;
                if (map == null || (strLJIIIIZZ = C1741890vQh.LJIIIIZZ(map)) == null) {
                    strLJIIIIZZ = "{}";
                }
                builderBuildUpon.appendQueryParameter("trackParams", strLJIIIIZZ);
                builderBuildUpon.appendQueryParameter("_ec_start_time", String.valueOf(System.currentTimeMillis()));
                SmartRouter.buildRoute(C786410Ut5.M3(C7879035x.LIZ()), builderBuildUpon.toString()).open();
            }
            if (Intrinsics.LJFF(redirectContent.closePage, Boolean.TRUE)) {
                function0.invoke();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS245S0300000_1 awS245S0300000_1) {
        SeaPdpViewModel seaPdpViewModel = (SeaPdpViewModel) awS245S0300000_1.l0;
        SeaPdpViewModel.qS2(seaPdpViewModel, (Context) awS245S0300000_1.l1, seaPdpViewModel.LLJILJIL, C960603pE.LIZLLL((View) awS245S0300000_1.l2), null, true, 0, 0, 0, 224);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS245S0300000_1 awS245S0300000_1) {
        PdpViewModel pdpViewModel = (PdpViewModel) awS245S0300000_1.l0;
        PdpViewModel.fS2(pdpViewModel, (Context) awS245S0300000_1.l1, pdpViewModel.Pv0(), C960603pE.LIZLLL((View) awS245S0300000_1.l2), null, true, 0, 32);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS245S0300000_1 awS245S0300000_1) {
        return ((PdpViewModel) awS245S0300000_1.l0).nR2((SkuPanelState) awS245S0300000_1.l1, (Integer) awS245S0300000_1.l2);
    }

    public static final Object invoke$16(AwS245S0300000_1 awS245S0300000_1) {
        return ((PdpViewModel) awS245S0300000_1.l0).nR2((SkuPanelState) awS245S0300000_1.l1, (Integer) awS245S0300000_1.l2);
    }

    public static final Object invoke$17(AwS245S0300000_1 awS245S0300000_1) {
        PaymentViewModel.IR2((PaymentViewModel) awS245S0300000_1.l0, "backup_payment", (PaymentMethod) awS245S0300000_1.l1, (LifecycleOwner) awS245S0300000_1.l2, false, true, 16);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS245S0300000_1 awS245S0300000_1) {
        SeaPdpViewModel seaPdpViewModelLJIIIIZZ = ((SeaPdpBottomNavBarWidgetNew) awS245S0300000_1.l0).LJIIIIZZ();
        SeaPdpBottomNavBarWidgetNew seaPdpBottomNavBarWidgetNew = (SeaPdpBottomNavBarWidgetNew) awS245S0300000_1.l0;
        SeaPdpViewModel.kR2(seaPdpViewModelLJIIIIZZ, seaPdpBottomNavBarWidgetNew.LLILZ, (C04E4) awS245S0300000_1.l1, seaPdpBottomNavBarWidgetNew.LLJ, null, null, null, null, null, null, 4072);
        if (((SeaPdpBottomNavBarWidgetNew) awS245S0300000_1.l0).LJIIIIZZ().jS2()) {
            AnonymousClass0378.LIZ().LIZ("ec_add_cart_click", C1741890vQh.LJIIIIZZ(((SeaPdpBottomNavBarWidgetNew) awS245S0300000_1.l0).LJI(true, true)));
        } else {
            C1054104Ah c1054104Ah = ((SeaPdpBottomNavBarWidgetNew) awS245S0300000_1.l0).LJIIIIZZ().LLJLIL;
            if (c1054104Ah != null) {
                C1054104Ah.LJJI(c1054104Ah, "add_to_cart", Boolean.TRUE, null, null, null, 28);
            }
            C1054104Ah c1054104Ah2 = ((SeaPdpBottomNavBarWidgetNew) awS245S0300000_1.l0).LJIIIIZZ().LLJLIL;
            if (c1054104Ah2 != null) {
                C1054104Ah.LJIIJJI(c1054104Ah2, "add_to_cart", ((SeaPdpBottomNavBarWidgetNew) awS245S0300000_1.l0).LJI(true, true), (Map) awS245S0300000_1.l2, null, 44);
            }
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((SeaPdpBottomNavBarWidgetNew) awS245S0300000_1.l0), null, null, new C1063704Dz((SeaPdpBottomNavBarWidgetNew) awS245S0300000_1.l0, null), 3);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$19(AwS245S0300000_1 awS245S0300000_1) {
        String str;
        Layout layout = ((C807503Dl) awS245S0300000_1.l0).LLILZ.getLayout();
        if (layout != null) {
            C807503Dl c807503Dl = (C807503Dl) awS245S0300000_1.l0;
            Announcement announcement = (Announcement) awS245S0300000_1.l1;
            SeaPdpFragment seaPdpFragment = (SeaPdpFragment) awS245S0300000_1.l2;
            if (layout.getEllipsisCount(layout.getLineCount() - 1) == 0) {
                C786410Ut5.LJLLLLLL(8, c807503Dl.LLJJ);
                str = "disable";
            } else {
                C786410Ut5.LJLLLLLL(0, c807503Dl.LLJJ);
                C786410Ut5.I7(new AjS20S0300000_1(seaPdpFragment, announcement, c807503Dl, 17), c807503Dl.LL);
                str = "normal";
            }
            if ((seaPdpFragment instanceof InterfaceC1748810vbr) && seaPdpFragment != null) {
                C1748720vbi.LIZIZ(seaPdpFragment, new C048K(), new AwS115S1100000_1(announcement, str, 25));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS245S0300000_1 r40) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS245S0300000_1.invoke$2(kotlin.jvm.internal.AwS245S0300000_1):java.lang.Object");
    }

    public static final Object invoke$20(AwS245S0300000_1 awS245S0300000_1) {
        LogisticPromotion logisticPromotion;
        List<LogisticItem> list;
        LogisticDTO logisticDTO = (LogisticDTO) awS245S0300000_1.l0;
        String daInfo = null;
        if (logisticDTO != null && (logisticPromotion = logisticDTO.promotion) != null && (list = logisticPromotion.items) != null && !list.isEmpty()) {
            List list2 = (List) awS245S0300000_1.l2;
            Voucher voucher = ((DeliveryData) awS245S0300000_1.l1).showVoucher;
            if (voucher != null) {
                daInfo = voucher.getDaInfo();
            }
            list2.add(new C03CL(logisticPromotion, daInfo));
            return Unit.LIZ;
        }
        Voucher voucher2 = ((DeliveryData) awS245S0300000_1.l1).showVoucher;
        if (voucher2 == null) {
            return null;
        }
        List list3 = (List) awS245S0300000_1.l2;
        List<DiscountView> discountViews = voucher2.getDiscountViews();
        if (discountViews == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<DiscountView> it2 = discountViews.iterator();
        while (it2.hasNext()) {
            String discountText = it2.next().getDiscountText();
            if (discountText != null) {
                arrayList.add(discountText);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        list3.add(new C03CJ(arrayList, voucher2.getDaInfo()));
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS245S0300000_1 awS245S0300000_1) {
        String strLJIIIIZZ;
        RedirectContent redirectContent = ((PayResponseData) awS245S0300000_1.l0).exceptionUX.redirectContent;
        if (redirectContent != null) {
            OrderSubmitAssemViewModel orderSubmitAssemViewModel = (OrderSubmitAssemViewModel) awS245S0300000_1.l1;
            Context context = (Context) awS245S0300000_1.l2;
            String str = redirectContent.jumpSchema;
            if (str != null) {
                Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
                builderBuildUpon.appendQueryParameter("source", "ordersubmit");
                HashMap<String, Object> map = orderSubmitAssemViewModel.LLLIL;
                if (map == null || (strLJIIIIZZ = C1741890vQh.LJIIIIZZ(map)) == null) {
                    strLJIIIIZZ = "{}";
                }
                builderBuildUpon.appendQueryParameter("trackParams", strLJIIIIZZ);
                builderBuildUpon.appendQueryParameter("_ec_start_time", String.valueOf(System.currentTimeMillis()));
                SmartRouter.buildRoute(context, builderBuildUpon.toString()).open();
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$22(kotlin.jvm.internal.AwS245S0300000_1 r11) {
        /*
            java.lang.Object r0 = r11.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.header.SeaPdpHeadViewHolder r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.header.SeaPdpHeadViewHolder) r0
            X.03GF r4 = r0.d6()
            java.lang.Object r5 = r11.l1
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceBubble r5 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceBubble) r5
            java.lang.Object r7 = r11.l2
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel r7 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel) r7
            r4.getClass()
            r2 = 0
            r3 = 8
            if (r5 == 0) goto L79
            r1 = 0
            X.C786410Ut5.LJLLLLLL(r1, r4)
            com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText r6 = r5.title
            if (r6 == 0) goto L8e
            com.bytedance.tux.input.TuxTextView r0 = r4.LLILLJJLI
            X.C786410Ut5.LLLLZLL(r0, r1)
            com.bytedance.tux.input.TuxTextView r1 = r4.LLILLJJLI
            java.lang.String r0 = "PDPPopupBottomStyleContentView_titleView"
            X.C03C8.LIZJ(r1, r6, r0, r2)
        L2c:
            com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon r0 = r5.icon
            if (r0 == 0) goto L48
            X.0kdB r1 = X.C1326790kdB.LIZ
            com.ss.android.ugc.aweme.ecommerce.service.vo.Image r0 = r0.getIcon()
            r1.getClass()
            X.0kl3 r1 = X.C1326790kdB.LIZLLL(r0)
            r0 = 1
            r1.LIZLLL = r0
            com.bytedance.lighten.loader.SmartImageView r0 = r4.LL
            r1.LJJ(r0)
            X.C786410Ut5.h3(r1)
        L48:
            g1c.AjS20S0300000_1 r1 = new g1c.AjS20S0300000_1
            r0 = 45
            r1.<init>(r7, r5, r4, r0)
            X.C786410Ut5.I7(r1, r4)
            X.04Ah r6 = r7.LLJLIL
            if (r6 == 0) goto L79
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceBubbleExtraInfo r0 = r5.extraInfo
            if (r0 == 0) goto L8c
            java.lang.String r8 = r0.daInfo
        L5c:
            java.util.Map r9 = r4.getExtraParams()
            X.0vbr r1 = r6.LJJIZ()
            if (r1 == 0) goto L75
            X.049h r0 = new X.049h
            r0.<init>()
            kotlin.jvm.internal.AwS43S1300000_1 r5 = new kotlin.jvm.internal.AwS43S1300000_1
            r10 = 13
            r5.<init>(r6, r7, r8, r9, r10)
            X.C1748720vbi.LIZIZ(r1, r0, r5)
        L75:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L7c
        L79:
            X.C786410Ut5.LJLLLLLL(r3, r4)
        L7c:
            java.lang.Object r0 = r11.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.header.SeaPdpHeadViewHolder r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.header.SeaPdpHeadViewHolder) r0
            X.03p4 r0 = r0.e6()
            if (r0 == 0) goto L8b
            X.C0H1U.LIZIZ(r0)
            kotlin.Unit r2 = kotlin.Unit.LIZ
        L8b:
            return r2
        L8c:
            r8 = r2
            goto L5c
        L8e:
            com.bytedance.tux.input.TuxTextView r0 = r4.LLILLJJLI
            X.C786410Ut5.LLLLZLL(r0, r3)
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS245S0300000_1.invoke$22(kotlin.jvm.internal.AwS245S0300000_1):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$23(AwS245S0300000_1 awS245S0300000_1) {
        String str;
        C1054104Ah c1054104Ah = ((SeaShippingVH) awS245S0300000_1.l0).d6().LLJLIL;
        if (c1054104Ah != null) {
            C807203Di c807203Di = (C807203Di) ((SeaShippingVH) awS245S0300000_1.l0).LLILLJJLI;
            C765002ym c765002ym = c807203Di.LL;
            PdpShipping pdpShipping = c807203Di.LLILLJJLI;
            Map<String, ? extends Object> map = (Map) awS245S0300000_1.l1;
            PDPShippingModuleMeta pDPShippingModuleMeta = (PDPShippingModuleMeta) awS245S0300000_1.l2;
            String str2 = null;
            if (pDPShippingModuleMeta != null) {
                str = pDPShippingModuleMeta.deliveryInfo;
                str2 = pDPShippingModuleMeta.edtType;
            } else {
                str = null;
            }
            c1054104Ah.LJJIII("logistics", true, c765002ym, pdpShipping, map, str, str2, c807203Di.LLILLL);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS245S0300000_1 awS245S0300000_1) {
        C1748720vbi.LIZIZ((ReturnPoliciesFragment) awS245S0300000_1.l0, new C048H(), new AwS580S0100000_1((ReturnPoliciesFragment) awS245S0300000_1.l0, 503));
        String str = ((ContactDetail) awS245S0300000_1.l1).link;
        if (str != null) {
            SmartRouter.buildRoute(((C03DX) awS245S0300000_1.l2).getContext(), UriProtector.parse(str).toString()).open();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS245S0300000_1 awS245S0300000_1) {
        C1748720vbi.LIZIZ((ReturnPoliciesFragment) awS245S0300000_1.l0, new C048H(), new AwS580S0100000_1((ReturnPoliciesFragment) awS245S0300000_1.l0, 504));
        String str = ((ContactDetail) awS245S0300000_1.l1).link;
        if (str != null) {
            SmartRouter.buildRoute(((C03DX) awS245S0300000_1.l2).getContext(), UriProtector.parse(str).toString()).open();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS245S0300000_1 awS245S0300000_1) {
        SmartRouter.buildRoute(((SeaPdpWaistBannerViewHolder) awS245S0300000_1.l0).itemView.getContext(), ((C1020703yv) awS245S0300000_1.l1).LIZJ.tailComponent.jumpSchema.schema).open();
        SeaPdpWaistBannerViewHolder seaPdpWaistBannerViewHolder = (SeaPdpWaistBannerViewHolder) awS245S0300000_1.l0;
        C1020703yv c1020703yv = (C1020703yv) awS245S0300000_1.l1;
        C1748720vbi.LJ(seaPdpWaistBannerViewHolder.itemView, new C10516049i(), "c93481.d0", (PageFinder) awS245S0300000_1.l2, new AwS367S0200000_1(c1020703yv, seaPdpWaistBannerViewHolder, 213));
        SeaPdpWaistBannerViewHolder seaPdpWaistBannerViewHolder2 = (SeaPdpWaistBannerViewHolder) awS245S0300000_1.l0;
        C1020703yv c1020703yv2 = (C1020703yv) awS245S0300000_1.l1;
        C1748720vbi.LJ(seaPdpWaistBannerViewHolder2.itemView, new C049H(), "c93481.d0", (PageFinder) awS245S0300000_1.l2, new AwS580S0100000_1(c1020703yv2, 517));
        return Unit.LIZ;
    }

    public static final Object invoke$27(AwS245S0300000_1 awS245S0300000_1) {
        C1748720vbi.LIZLLL(((C7977039r) awS245S0300000_1.l0).LLILLJJLI, new C10513049f(), new AwS367S0200000_1((C714302qb) awS245S0300000_1.l1, (C7976039q) awS245S0300000_1.l2, 229));
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS245S0300000_1 awS245S0300000_1) {
        int i;
        String str;
        Integer numValueOf;
        C03RW c03rw;
        C03X9 c03x9 = (C03X9) awS245S0300000_1.l0;
        C03XG c03xg = (C03XG) awS245S0300000_1.l1;
        Integer num = (Integer) awS245S0300000_1.l2;
        c03x9.getClass();
        boolean zLIZ = C03XD.LIZ();
        boolean z = c03x9.LIZ;
        if (zLIZ) {
            if (!z) {
                if (c03xg != null && (c03rw = c03xg.LIZIZ) != null) {
                    i = c03rw.LIZIZ;
                } else {
                    i = -1;
                }
                C928203k0 c928203k0 = C928203k0.LIZ;
                Integer num2 = null;
                if (c03xg != null) {
                    str = c03xg.LIZ;
                    num2 = c03xg.LIZLLL;
                } else {
                    str = null;
                }
                Integer numLJIIIIZZ = c928203k0.LJIIIIZZ(str, i, num2, new AwS545S0100000_1(c03xg, 1591), 0, null, 0);
                c03x9.LIZ = true;
                if (numLJIIIIZZ == null) {
                    numValueOf = Integer.valueOf(C03SW.DEFAULT_FLOW.getValue());
                } else {
                    numValueOf = numLJIIIIZZ;
                }
                c03x9.LIZIZ = numValueOf;
                C03X9.LJIIJ(numLJIIIIZZ, num);
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[OSP_ASYNC_INFLATE] onStartBillInfoPreload, flowType=");
                sbLIZ.append(numLJIIIIZZ);
                sbLIZ.append(", preload layout");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LJ(strLIZIZ);
            } else {
                C2341109Fh.LIZ.getClass();
                C2341109Fh.LJ("[OSP_ASYNC_INFLATE] onStartBillInfoPreload, preload layout has already executed");
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$29(AwS245S0300000_1 awS245S0300000_1) {
        int value;
        C03X9 c03x9 = (C03X9) awS245S0300000_1.l0;
        Integer num = (Integer) awS245S0300000_1.l1;
        Integer num2 = (Integer) awS245S0300000_1.l2;
        boolean z = c03x9.LIZ;
        Integer num3 = c03x9.LIZIZ;
        if (num3 != null) {
            value = num3.intValue();
        } else {
            value = C03SW.DEFAULT_FLOW.getValue();
        }
        if (!z) {
            C03X9.LJIIJ(num, num2);
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[OSP_ASYNC_INFLATE] onStartRoute, flowType=");
            sbLIZ.append(num);
            sbLIZ.append(", preload layout");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LJ(strLIZIZ);
        } else if (num != null && value == num.intValue()) {
            C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[OSP_ASYNC_INFLATE] onStartRoute, flowType=");
            sbLIZ2.append(num);
            sbLIZ2.append(", preload layout has already executed");
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            c2341109Fh2.getClass();
            C2341109Fh.LJ(strLIZIZ2);
        } else {
            C03X9.LJIIJ(num, num2);
            C2341109Fh c2341109Fh3 = C2341109Fh.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("[OSP_ASYNC_INFLATE] onStartRoute, flowType=");
            sbLIZ3.append(num);
            sbLIZ3.append(", preload layout executed but prevFlowType=");
            sbLIZ3.append(value);
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
            c2341109Fh3.getClass();
            C2341109Fh.LJ(strLIZIZ3);
        }
        c03x9.LIZ = false;
        c03x9.LIZIZ = null;
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS245S0300000_1 r10) {
        /*
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ActivateHelper r2 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ActivateHelper.LIZ
            java.lang.Object r0 = r10.l0
            X.03ZF r0 = (X.C03ZF) r0
            android.content.Context r3 = r0.getContext()
            java.lang.Object r0 = r10.l1
            X.03ZB r0 = (X.C03ZB) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r4 = r0.getPaymentMethod()
            java.lang.String r5 = "ordersubmit"
            java.lang.Object r0 = r10.l1
            X.03ZB r0 = (X.C03ZB) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel r0 = r0.getOspMiniVM()
            r8 = 0
            if (r0 != 0) goto L8f
            java.lang.Object r0 = r10.l1
            X.03ZB r0 = (X.C03ZB) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r0 = r0.getOspAssemViewModel()
            if (r0 == 0) goto L9c
            java.util.HashMap<java.lang.String, java.lang.Object> r6 = r0.LLLIL
        L2b:
            java.lang.Object r0 = r10.l1
            X.03ZB r0 = (X.C03ZB) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel r0 = r0.getOspMiniVM()
            java.lang.String r1 = "c45857.d64885"
            if (r0 != 0) goto L7a
            java.lang.Object r0 = r10.l1
            X.03ZB r0 = (X.C03ZB) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r0 = r0.getOspAssemViewModel()
            if (r0 == 0) goto L8d
            X.03Hi r0 = r0.LLLZLZ
            if (r0 == 0) goto L8d
            java.lang.String r7 = r0.LIZJ(r1, r8)
        L49:
            java.lang.Object r0 = r10.l1
            X.03ZB r0 = (X.C03ZB) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r0 = r0.getPaymentInfo()
            if (r0 == 0) goto L59
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo r0 = r0.paymentMethodInfo
            if (r0 == 0) goto L59
            java.lang.String r8 = r0.tenure
        L59:
            java.lang.Object r1 = r10.l2
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan r1 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan) r1
            java.lang.Object r0 = r10.l0
            X.03ZF r0 = (X.C03ZF) r0
            boolean r0 = r0.LIZJ()
            java.lang.String r9 = r1.LIZLLL(r0)
            java.lang.Object r0 = r10.l2
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan) r0
            java.lang.String r10 = r0.LIZJ()
            r2.getClass()
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ActivateHelper.LIZ(r3, r4, r5, r6, r7, r8, r9, r10)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L7a:
            java.lang.Object r0 = r10.l1
            X.03ZB r0 = (X.C03ZB) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel r0 = r0.getOspMiniVM()
            if (r0 == 0) goto L8d
            X.03Hi r0 = r0.LLLFF
            if (r0 == 0) goto L8d
            java.lang.String r7 = r0.LIZJ(r1, r8)
            goto L49
        L8d:
            r7 = r8
            goto L49
        L8f:
            java.lang.Object r0 = r10.l1
            X.03ZB r0 = (X.C03ZB) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel r0 = r0.getOspMiniVM()
            if (r0 == 0) goto L9c
            java.util.HashMap<java.lang.String, java.lang.Object> r6 = r0.LLJJJJ
            goto L2b
        L9c:
            r6 = r8
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS245S0300000_1.invoke$3(kotlin.jvm.internal.AwS245S0300000_1):java.lang.Object");
    }

    public static final Object invoke$30(AwS245S0300000_1 awS245S0300000_1) {
        C1748720vbi.LIZLLL((C03AZ) awS245S0300000_1.l0, new C10516049i(), new AwS367S0200000_1((OrderSubmitAssemViewModel) awS245S0300000_1.l1, (C719102rN) awS245S0300000_1.l2, 234));
        return Unit.LIZ;
    }

    public static final Object invoke$31(AwS245S0300000_1 awS245S0300000_1) {
        CCDCAddCardViewModel cCDCAddCardViewModel = (CCDCAddCardViewModel) awS245S0300000_1.l0;
        cCDCAddCardViewModel.VQ2((PaymentInfo) awS245S0300000_1.l1, cCDCAddCardViewModel.JQ2(), (List) awS245S0300000_1.l2, false);
        return Unit.LIZ;
    }

    public static final Object invoke$32(AwS245S0300000_1 awS245S0300000_1) {
        String str;
        C03SY c03sy = C03SY.LIZ;
        C873003b6 c873003b6 = ((CCDCAddCardViewModel) awS245S0300000_1.l0).LLJJI;
        if (c873003b6 != null) {
            str = c873003b6.LIZJ;
        } else {
            str = null;
        }
        c03sy.getClass();
        C03SY.LJJ(str);
        C890803dy c890803dy = (C890803dy) awS245S0300000_1.l1;
        List<InterfaceC1891350zJl> list = c890803dy.LLILLJJLI;
        CCDCAddCardViewModel cCDCAddCardViewModel = (CCDCAddCardViewModel) awS245S0300000_1.l0;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        boolean z = false;
        for (Object objLIZIZ : list) {
            if (objLIZIZ instanceof C889403dk) {
                Map<String, List<PaymentElement>> map = cCDCAddCardViewModel.LL;
                C889403dk c889403dk = (C889403dk) objLIZIZ;
                C866903a7 c866903a7 = c889403dk.LLILLJJLI;
                List<PaymentElement> list2 = (List) ((LinkedHashMap) map).get(c866903a7.LIZ.id);
                if (list2 == null) {
                    list2 = C13BV.INSTANCE;
                }
                String strRR2 = cCDCAddCardViewModel.rR2(c866903a7, c890803dy.LL, list2);
                if (strRR2 != null) {
                    c866903a7.LIZJ = strRR2;
                    objLIZIZ = C889403dk.LIZIZ(c889403dk, new Object());
                    z = true;
                }
            }
            arrayList.add(objLIZIZ);
        }
        if (z) {
            ((CCDCAddCardViewModel) awS245S0300000_1.l0).YQ2(arrayList);
        } else {
            ((Function0) awS245S0300000_1.l2).invoke();
        }
        ((CCDCAddCardViewModel) awS245S0300000_1.l0).setStateImmediate(AFwS228S0000000_1.get$arr$(598));
        return Unit.LIZ;
    }

    public static final Object invoke$33(AwS245S0300000_1 awS245S0300000_1) {
        CCDCAddCardViewModel cCDCAddCardViewModel = (CCDCAddCardViewModel) awS245S0300000_1.l0;
        cCDCAddCardViewModel.VQ2((PaymentInfo) awS245S0300000_1.l1, cCDCAddCardViewModel.JQ2(), (List) awS245S0300000_1.l2, false);
        return Unit.LIZ;
    }

    public static final Object invoke$34(AwS245S0300000_1 awS245S0300000_1) {
        CCDCAddCardViewModel cCDCAddCardViewModel = (CCDCAddCardViewModel) awS245S0300000_1.l0;
        cCDCAddCardViewModel.VQ2((PaymentInfo) awS245S0300000_1.l1, cCDCAddCardViewModel.JQ2(), (List) awS245S0300000_1.l2, false);
        return Unit.LIZ;
    }

    public static final Object invoke$35(AwS245S0300000_1 awS245S0300000_1) {
        C1748720vbi.LIZLLL((C03GO) awS245S0300000_1.l0, new C049Y(), new AwS367S0200000_1((C714302qb) awS245S0300000_1.l1, (SummaryCell) awS245S0300000_1.l2, 277));
        return Unit.LIZ;
    }

    public static final Object invoke$36(AwS245S0300000_1 awS245S0300000_1) {
        C882103cZ.LIZ((FragmentManager) awS245S0300000_1.l0, ((h) awS245S0300000_1.l1).getContext(), ((PaymentTip) awS245S0300000_1.l2).toolTips);
        return Unit.LIZ;
    }

    public static final Object invoke$37(AwS245S0300000_1 awS245S0300000_1) {
        String str;
        String str2;
        ProductPrice productPrice;
        SeaPdpViewModel seaPdpViewModelFS = ((SeaPdpFragment) awS245S0300000_1.l0).FS();
        SeaPdpFragment seaPdpFragment = (SeaPdpFragment) awS245S0300000_1.l0;
        ProductBase productBase = ((ProductPackStruct) awS245S0300000_1.l1).baseInfo;
        String strLJIIIIZZ = null;
        if (productBase != null && (productPrice = productBase.priceInfo) != null) {
            str = productPrice.realPrice;
        } else {
            str = null;
        }
        HashMap map = (HashMap) awS245S0300000_1.l2;
        PdpPreviewInfo pdpPreviewInfo = seaPdpViewModelFS.LLLIILIL;
        if (pdpPreviewInfo != null) {
            str2 = pdpPreviewInfo.price;
        } else {
            str2 = null;
        }
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = -1;
        if (C770702zh.LIZIZ(str2) && C770702zh.LIZIZ(str)) {
            if (a0.LJJIIZI(str, str2, false)) {
                c118300cf.element = 0;
            } else {
                c118300cf.element = 1;
                HashMap map2 = new HashMap();
                map2.put("prepage_price", str2);
                map2.put("pdp_price", str);
                if (map != null) {
                    strLJIIIIZZ = C1741890vQh.LJIIIIZZ(map);
                }
                map2.put("trackParams", strLJIIIIZZ);
                map2.put("is_diff", String.valueOf(c118300cf.element));
                C1AF0.LIZLLL("tiktokec_price_difference", map2);
            }
        }
        C1748720vbi.LIZIZ(seaPdpFragment, new C04C6(), new AwS17S2200000_1(str2, str, (String) map, (Map<String, ? extends Object>) c118300cf, (C118300cf) 9));
        return Unit.LIZ;
    }

    public static final Object invoke$38(AwS245S0300000_1 awS245S0300000_1) {
        List<Icon> list;
        C990503u3 c990503u3 = C990503u3.LIZ;
        C03E9 c03e9 = (C03E9) awS245S0300000_1.l0;
        C426160GnO c426160GnO = c03e9.LLILZIL;
        ImageRichText imageRichText = ((UserTrustItemDescriptionChunk) awS245S0300000_1.l1).textWithImage;
        if (imageRichText != null) {
            list = imageRichText.icons;
        } else {
            list = null;
        }
        AwS367S0200000_1 awS367S0200000_1 = new AwS367S0200000_1(c03e9, (poa.a0) awS245S0300000_1.l2, 294);
        AFwS326S0000000_1 aFwS326S0000000_1 = AFwS326S0000000_1.get$arr$(12);
        c990503u3.getClass();
        C990503u3.LIZ(c426160GnO, list, awS367S0200000_1, aFwS326S0000000_1);
        return Unit.LIZ;
    }

    public static final Object invoke$39(AwS245S0300000_1 awS245S0300000_1) {
        InstallmentPlan installmentPlanRR2;
        String str;
        HashMap<String, Object> map;
        EnterParams enterParams;
        PaymentViewModel paymentViewModel = ((C03ZD) awS245S0300000_1.l0).getPaymentViewModel();
        String str2 = null;
        if (paymentViewModel != null) {
            installmentPlanRR2 = paymentViewModel.rR2(((C03ZD) awS245S0300000_1.l0).getPaymentMethod(), "activate bnpl from installment plan list");
        } else {
            installmentPlanRR2 = null;
        }
        ActivateHelper activateHelper = ActivateHelper.LIZ;
        Context context = ((C03ZF) awS245S0300000_1.l1).getContext();
        PaymentMethod paymentMethod = ((C03ZD) awS245S0300000_1.l0).getPaymentMethod();
        PaymentViewModel paymentViewModel2 = ((C03ZD) awS245S0300000_1.l0).getPaymentViewModel();
        if (paymentViewModel2 == null || (str = paymentViewModel2.LLJJJ) == null) {
            str = "payment_method";
        }
        PaymentViewModel paymentViewModel3 = ((C03ZD) awS245S0300000_1.l0).getPaymentViewModel();
        if (paymentViewModel3 != null && (enterParams = paymentViewModel3.LLJ) != null) {
            map = enterParams.trackParams;
        } else {
            map = null;
        }
        if (installmentPlanRR2 != null) {
            str2 = installmentPlanRR2.tenure;
        }
        String strLIZLLL = ((InstallmentPlan) awS245S0300000_1.l2).LIZLLL(((C03ZF) awS245S0300000_1.l1).LIZJ());
        String strLIZJ = ((InstallmentPlan) awS245S0300000_1.l2).LIZJ();
        activateHelper.getClass();
        ActivateHelper.LIZ(context, paymentMethod, str, map, null, str2, strLIZLLL, strLIZJ);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS245S0300000_1 awS245S0300000_1) {
        String string;
        Object obj;
        String string2;
        Object obj2;
        C719202rO c719202rO;
        USCombineAggregationOrderCell uSCombineAggregationOrderCell = (USCombineAggregationOrderCell) awS245S0300000_1.l0;
        View view = (View) awS245S0300000_1.l1;
        C719302rP c719302rP = (C719302rP) awS245S0300000_1.l2;
        uSCombineAggregationOrderCell.getClass();
        List<C719202rO> list = c719302rP.LLIZLLLIL;
        if (list == null || (c719202rO = (C719202rO) C13LP.LJJJLL(list)) == null || !c719202rO.LLJJLIIIJLLLLLLLZ) {
            C1748720vbi.LIZLLL(view, new C10516049i(), new AwS86S1200000_1(c719302rP, uSCombineAggregationOrderCell, 0));
            Fragment fragment = uSCombineAggregationOrderCell.getFragment();
            if (fragment != null) {
                C03HJ c03hj = USAggregationProductInfoAssemFragment.LLJILJILJ;
                Pair[] pairArr = new Pair[2];
                HashMap<String, Object> map = uSCombineAggregationOrderCell.L5().LLLIL;
                String str = "";
                if (map == null || (obj2 = map.get("previous_page")) == null || (string = obj2.toString()) == null) {
                    string = "";
                }
                pairArr[0] = new Pair("previous_page", string);
                HashMap<String, Object> map2 = uSCombineAggregationOrderCell.L5().LLLIL;
                if (map2 != null && (obj = map2.get("entrance_info")) != null && (string2 = obj.toString()) != null) {
                    str = string2;
                }
                pairArr[1] = new Pair("entrance_info", str);
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
                Integer numValueOf = Integer.valueOf((int) C928203k0.LJIIJ());
                c03hj.getClass();
                C03HJ.LIZ(fragment, c719302rP, mapLJIIIIZZ, false, numValueOf, true);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$40(AwS245S0300000_1 awS245S0300000_1) {
        ((C03ZD) awS245S0300000_1.l0).LIZLLL(true);
        InstallmentPlanListElementViewHolder installmentPlanListElementViewHolder = (InstallmentPlanListElementViewHolder) awS245S0300000_1.l1;
        installmentPlanListElementViewHolder.withState(installmentPlanListElementViewHolder.W5(), new AwS367S0200000_1((InstallmentPlanListElementViewHolder) awS245S0300000_1.l1, (C862603Yq) awS245S0300000_1.l2, 316));
        return Unit.LIZ;
    }

    public static final Object invoke$41(AwS245S0300000_1 awS245S0300000_1) {
        SmartRouter.buildRoute((Context) awS245S0300000_1.l0, ((InlineLink) awS245S0300000_1.l1).url).open();
        Function1 function1 = (Function1) awS245S0300000_1.l2;
        if (function1 != null) {
            String str = ((InlineLink) awS245S0300000_1.l1).url;
            if (str == null) {
                str = "";
            }
            function1.invoke(str);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.Integer] */
    public static final Object invoke$42(AwS245S0300000_1 awS245S0300000_1) {
        String str;
        C03O1 c03o1 = (C03O1) awS245S0300000_1.l0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C03O1 c03o12 = (C03O1) awS245S0300000_1.l0;
        Object obj = awS245S0300000_1.l1;
        C259800zU c259800zU = (C259800zU) awS245S0300000_1.l2;
        linkedHashMap.putAll(c03o12.LIZ);
        if ((obj instanceof Long) && !Intrinsics.LJFF(obj, -1L)) {
            linkedHashMap.put("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - ((Number) obj).longValue()));
        }
        if (c03o12.LJIIIIZZ > 0) {
            str = "yes";
        } else {
            str = "no";
        }
        linkedHashMap.put("is_retry", str);
        if (c03o12.LJIIIIZZ > 0) {
            c259800zU.element = 2;
        }
        linkedHashMap.put("request_type", String.valueOf(c259800zU.element));
        c03o1.getClass();
        C03O1.LJJIJIIJIL("rd_tiktokec_first_bill_info_request_send", linkedHashMap);
        return Unit.LIZ;
    }

    public static final Object invoke$43(AwS245S0300000_1 awS245S0300000_1) {
        LogisticArea logisticArea;
        String str;
        Map<String, String> map;
        USHalfLogisticsCell uSHalfLogisticsCell = (USHalfLogisticsCell) awS245S0300000_1.l0;
        Context context = uSHalfLogisticsCell.itemView.getContext();
        C722902rz c722902rz = (C722902rz) awS245S0300000_1.l1;
        LogisticDTO logisticDTO = (LogisticDTO) awS245S0300000_1.l2;
        LogisticPanelModule logisticPanelModule = c722902rz.LLJI;
        if (logisticPanelModule != null && (logisticArea = logisticPanelModule.logisticArea) != null && (str = logisticArea.link) != null && str.length() != 0) {
            if (logisticDTO != null) {
                map = logisticDTO.eventTrackInfo;
            } else {
                map = null;
            }
            C1748720vbi.LIZLLL(uSHalfLogisticsCell.itemView, new C10516049i(), new AwS6S2300000_1(uSHalfLogisticsCell, c722902rz, map, 2));
            List<LogisticDTO> list = c722902rz.LLIZ;
            if (list != null) {
                AssemVMLazy assemVMLazy = uSHalfLogisticsCell.LLJIJIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = USHalfLogisticsCell.LLJJIII;
                OspShopViewModel ospShopViewModel = (OspShopViewModel) assemVMLazy.getValue();
                String strLIZLLL = C960603pE.LIZLLL(uSHalfLogisticsCell.itemView);
                C817803Hk c817803Hk = new C817803Hk("c3646.d29091", 0);
                OrderSubmitAssemViewModel orderSubmitAssemViewModelN5 = uSHalfLogisticsCell.N5();
                orderSubmitAssemViewModelN5.yS2();
                C948503nH.LJI(ospShopViewModel, C23271099x.INSTANCE, new C03KY(context, list, c722902rz, orderSubmitAssemViewModelN5, strLIZLLL, c817803Hk, ospShopViewModel, null));
                C03O0.LJJJJZI(C03O0.LIZ, "logistics", null, 6);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$44(AwS245S0300000_1 awS245S0300000_1) {
        ViewGroup.LayoutParams layoutParams;
        C990603u4 c990603u4 = C990603u4.LIZ;
        Context context = (Context) awS245S0300000_1.l0;
        View viewZ9 = ((InterfaceC989703tv) awS245S0300000_1.l1).z9();
        ViewGroup viewGroupY9 = ((InterfaceC989703tv) awS245S0300000_1.l1).y9();
        C1294720jnS c1294720jnS = ((OrderSubmitFragment) awS245S0300000_1.l2).ZR().f349Y;
        c990603u4.getClass();
        if (viewZ9 != null && viewGroupY9 != null && c1294720jnS != null && viewZ9.getVisibility() == 0) {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(250));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(250));
            final C1295960jpS c1295960jpS = new C1295960jpS(context);
            if (viewGroupY9 instanceof ConstraintLayout) {
                C19ME c19me = new C19ME(iLIZIZ, iLIZIZ2);
                c19me.startToStart = 0;
                c19me.topToTop = 0;
                layoutParams = c19me;
            } else {
                layoutParams = new ViewGroup.LayoutParams(iLIZIZ, iLIZIZ2);
            }
            C786410Ut5.s6(c1295960jpS, layoutParams);
            c1295960jpS.setImageAssetDelegate(new InterfaceC1294390jmv() { // from class: X.0Lu6
                @Override // X.InterfaceC1294390jmv
                public final Bitmap LIZ(C1294320jmo c1294320jmo) {
                    String str = c1294320jmo.LIZLLL;
                    try {
                        if (u.LJJIIJZLJL(str, "data:image", false)) {
                            byte[] bArrDecode = Base64.decode(a0.LJJLIL(str, ",", str), 0);
                            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                        }
                        return null;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        return null;
                    }
                }
            });
            c1295960jpS.setComposition(c1294720jnS);
            Pair pairLIZ = C990603u4.LIZ(viewZ9, viewGroupY9);
            int iIntValue = ((Number) pairLIZ.getFirst()).intValue();
            int iIntValue2 = ((Number) pairLIZ.getSecond()).intValue();
            C786410Ut5.Pc(c1295960jpS, c1295960jpS.getTranslationX() + (iIntValue - iLIZIZ) + viewZ9.getWidth());
            C786410Ut5.ld(c1295960jpS, c1295960jpS.getTranslationY() + (iIntValue2 - iLIZIZ2) + viewZ9.getHeight());
            viewGroupY9.addView(c1295960jpS);
            final InterfaceC989703tv interfaceC989703tv = (InterfaceC989703tv) awS245S0300000_1.l1;
            final OrderSubmitFragment orderSubmitFragment = (OrderSubmitFragment) awS245S0300000_1.l2;
            c1295960jpS.addAnimatorListener(new AnimatorListenerAdapter() { // from class: X.03tu
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    ViewGroup viewGroupY92;
                    InterfaceC989703tv interfaceC989703tv2 = interfaceC989703tv;
                    if (interfaceC989703tv2 != null && (viewGroupY92 = interfaceC989703tv2.y9()) != null) {
                        C786410Ut5.LJJJLZIJ(c1295960jpS, viewGroupY92);
                    }
                    orderSubmitFragment.ZR().f349Y = null;
                }
            });
            c1295960jpS.playAnimation();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$5(kotlin.jvm.internal.AwS245S0300000_1 r23) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS245S0300000_1.invoke$5(kotlin.jvm.internal.AwS245S0300000_1):java.lang.Object");
    }

    public static final Object invoke$6(AwS245S0300000_1 awS245S0300000_1) {
        PaymentInfo paymentInfo;
        C864903Zn c864903Zn = C864903Zn.LIZ;
        String str = ((PaymentMethod) awS245S0300000_1.l0).id;
        c864903Zn.getClass();
        if (C864903Zn.LIZ(str) && C864903Zn.LIZIZ().useNewPayInfo) {
            paymentInfo = ((MiniOspPaymentInfoCell2) awS245S0300000_1.l1).P5().LLJIJIL;
        } else {
            paymentInfo = ((MiniOspPaymentInfoCell2) awS245S0300000_1.l1).LLJIJIL;
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(((C03ZB) awS245S0300000_1.l2).getContext());
        if (c19egLIZIZ != null) {
            MiniOspPaymentInfoCell2 miniOspPaymentInfoCell2 = (MiniOspPaymentInfoCell2) awS245S0300000_1.l1;
            PaymentInfoViewModel.zQ2(miniOspPaymentInfoCell2.R5(), c19egLIZIZ.getSupportFragmentManager(), (PaymentMethod) awS245S0300000_1.l0, paymentInfo, null, EnumC865103Zp.SELECT_INSTALLMENT_PLAN, miniOspPaymentInfoCell2.P5(), null, null, false, 448);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS245S0300000_1 awS245S0300000_1) {
        String str;
        ((C03ZB) awS245S0300000_1.l0).LIZLLL();
        C03O1 c03o1 = ((MiniOspPaymentInfoCell2) awS245S0300000_1.l1).P5().LLILZLL;
        PaymentMethod paymentMethod = (PaymentMethod) awS245S0300000_1.l2;
        c03o1.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(c03o1.LIZ);
        BindInfo bindInfo = paymentMethod.bindInfo;
        if (bindInfo != null) {
            str = bindInfo.bindStatus;
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            linkedHashMap.put("pay_bind_status", str);
        }
        linkedHashMap.put("is_option_discounted", Integer.valueOf(C770702zh.LIZ(paymentMethod.extraInfo) ? 1 : 0));
        String strLJIJJ = paymentMethod.LJIJJ(false);
        linkedHashMap.put("is_payment_promoted", Integer.valueOf(C770702zh.LIZ(strLJIJJ) ? 1 : 0));
        String str2 = "";
        if (strLJIJJ == null) {
            strLJIJJ = "";
        }
        linkedHashMap.put("promotion_info", strLJIJJ);
        String strLJIJ = paymentMethod.LJIJ();
        if (strLJIJ != null) {
            str2 = strLJIJ;
        }
        linkedHashMap.put("marketing_batch_id", str2);
        linkedHashMap.put("payment_option", paymentMethod.LJJIIZ());
        linkedHashMap.put("button_name", "view_installment_plan");
        C1018703yb.LIZIZ("tiktokec_button_click", linkedHashMap);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS245S0300000_1 awS245S0300000_1) {
        C1748720vbi.LIZLLL((C03GO) awS245S0300000_1.l0, new C049Y(), new AwS367S0200000_1((C714302qb) awS245S0300000_1.l1, (SummaryCell) awS245S0300000_1.l2, 66));
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS245S0300000_1 awS245S0300000_1) {
        String str;
        CommuteType commuteType;
        String strLIZ;
        HashMap linkedHashMap = ((USPaymentInfoCell) awS245S0300000_1.l0).T5().LLLIL;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        C1323720kYE.LIZ(((C03ZC) awS245S0300000_1.l1).getContext()).LJIIIIZZ(C1741890vQh.LJIIIIZZ(linkedHashMap), "payment_track_params");
        PaymentMethod paymentMethod = (PaymentMethod) awS245S0300000_1.l2;
        BindInfo bindInfo = paymentMethod.bindInfo;
        String str2 = null;
        if (bindInfo != null) {
            str = bindInfo.schema;
        } else {
            str = null;
        }
        String str3 = paymentMethod.packageName;
        CommuteInfo commuteInfoLJII = paymentMethod.LJII(false);
        if (commuteInfoLJII != null) {
            commuteType = commuteInfoLJII.commuteType;
        } else {
            commuteType = null;
        }
        if (str != null && C123100dR.LIZ(str)) {
            if (commuteType != null) {
                strLIZ = C899503fN.LIZ(commuteType);
            } else {
                strLIZ = null;
            }
            if (commuteType == CommuteType.INTERNAL_NATIVE) {
                PaymentBindHelper paymentBindHelper = PaymentBindHelper.LIZ;
                Context context = ((C03ZC) awS245S0300000_1.l1).getContext();
                String strLIZJ = ((USPaymentInfoCell) awS245S0300000_1.l0).T5().LLLZLZ.LIZJ("c5101.d29406", null);
                PaymentMethod paymentMethod2 = (PaymentMethod) awS245S0300000_1.l2;
                if (paymentMethod2 != null) {
                    str2 = paymentMethod2.id;
                }
                paymentBindHelper.getClass();
                PaymentBindHelper.LJ(context, "ordersubmit", str, linkedHashMap, strLIZJ, str2, null, null, null);
            } else {
                Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
                builderBuildUpon.appendQueryParameter("source", "order_submit");
                if (strLIZ != null && strLIZ.length() != 0) {
                    builderBuildUpon.appendQueryParameter("commute_type", strLIZ);
                }
                String strLJ = ((PaymentMethod) awS245S0300000_1.l2).LJ();
                if (strLJ != null && strLJ.length() != 0) {
                    builderBuildUpon.appendQueryParameter("idempotency_key", strLJ);
                }
                C948503nH.LJI(((USPaymentInfoCell) awS245S0300000_1.l0).T5(), C23271099x.INSTANCE, new C03RK((C03ZC) awS245S0300000_1.l1, (PaymentMethod) awS245S0300000_1.l2, (USPaymentInfoCell) awS245S0300000_1.l0, str3, builderBuildUpon, commuteType, null));
            }
        } else {
            C948503nH.LJI(((USPaymentInfoCell) awS245S0300000_1.l0).T5(), C23271099x.INSTANCE, new C03RL((C03ZC) awS245S0300000_1.l1, (PaymentMethod) awS245S0300000_1.l2, (USPaymentInfoCell) awS245S0300000_1.l0, str3, commuteType, null));
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS245S0300000_1(com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.MiniOspPaymentInfoCell2 r3, X.C03ZB r4, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 5: goto L11;
                case 6: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r1.l2 = r5
            r0 = 0
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r3
            r1.l2 = r4
            r0 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS245S0300000_1.<init>(com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.MiniOspPaymentInfoCell2, X.03ZB, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS245S0300000_1(X.C03ZC r3, com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.payment.USPaymentInfoCell r4, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 9 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.l2 = r5
            r0 = 0
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r1.l2 = r5
            r0 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS245S0300000_1.<init>(X.03ZC, com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.payment.USPaymentInfoCell, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS245S0300000_1(C039O c039o, C714302qb c714302qb, C039Q c039q, int i) {
        super(0);
        this.$t = i;
        this.l0 = c039o;
        this.l1 = c714302qb;
        this.l2 = c039q;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS245S0300000_1(C7977039r c7977039r, C714302qb c714302qb, C7976039q c7976039q, int i) {
        super(0);
        this.$t = i;
        this.l0 = c7977039r;
        this.l1 = c714302qb;
        this.l2 = c7976039q;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS245S0300000_1(C03AZ c03az, OrderSubmitAssemViewModel orderSubmitAssemViewModel, C719102rN c719102rN, int i) {
        super(0);
        this.$t = i;
        this.l0 = c03az;
        this.l1 = orderSubmitAssemViewModel;
        this.l2 = c719102rN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS245S0300000_1(C03E9 c03e9, UserTrustItemDescriptionChunk userTrustItemDescriptionChunk, poa.a0 a0Var, int i) {
        super(0);
        this.$t = i;
        this.l0 = c03e9;
        this.l1 = userTrustItemDescriptionChunk;
        this.l2 = a0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS245S0300000_1(C03GO c03go, C714302qb c714302qb, SummaryCell summaryCell, int i) {
        super(0);
        this.$t = i;
        this.l0 = c03go;
        this.l1 = c714302qb;
        this.l2 = summaryCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS245S0300000_1(C03O1 c03o1, C03O1 c03o12, Object obj, C259800zU<Integer> c259800zU) {
        super(0);
        this.$t = c259800zU;
        this.l0 = c03o1;
        this.l1 = c03o12;
        this.l2 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS245S0300000_1(C03X9 c03x9, C03XG c03xg, Integer num, int i) {
        super(0);
        this.$t = i;
        this.l0 = c03x9;
        this.l1 = c03xg;
        this.l2 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS245S0300000_1(C03X9 c03x9, Integer num, Integer num2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c03x9;
        this.l1 = num;
        this.l2 = num2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS245S0300000_1(C03ZB c03zb, PaymentInfoCell2 paymentInfoCell2, PaymentMethod paymentMethod, int i) {
        super(0);
        this.$t = i;
        this.l0 = paymentMethod;
        this.l1 = paymentInfoCell2;
        this.l2 = c03zb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS245S0300000_1(C03ZD c03zd, C03ZF c03zf, InstallmentPlan installmentPlan, int i) {
        super(0);
        this.$t = i;
        this.l0 = c03zd;
        this.l1 = c03zf;
        this.l2 = installmentPlan;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS245S0300000_1(C03ZD c03zd, InstallmentPlanListElementViewHolder installmentPlanListElementViewHolder, C862603Yq c862603Yq, int i) {
        super(0);
        this.$t = i;
        this.l0 = c03zd;
        this.l1 = installmentPlanListElementViewHolder;
        this.l2 = c862603Yq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS245S0300000_1(C03ZF c03zf, C03ZB c03zb, InstallmentPlan installmentPlan, int i) {
        super(0);
        this.$t = i;
        this.l0 = c03zf;
        this.l1 = c03zb;
        this.l2 = installmentPlan;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS245S0300000_1(Context context, InterfaceC989703tv interfaceC989703tv, OrderSubmitFragment orderSubmitFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = interfaceC989703tv;
        this.l2 = orderSubmitFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS245S0300000_1(Context context, Context context2, InlineLink inlineLink, Function1<? super String, Unit> function1) {
        super(0);
        this.$t = function1;
        this.l0 = context;
        this.l1 = context2;
        this.l2 = inlineLink;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS245S0300000_1(FragmentManager fragmentManager, C03ZB c03zb, PaymentServiceFeeInfoToolTips paymentServiceFeeInfoToolTips, int i) {
        super(0);
        this.$t = i;
        this.l0 = fragmentManager;
        this.l1 = c03zb;
        this.l2 = paymentServiceFeeInfoToolTips;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS245S0300000_1(FragmentManager fragmentManager, h hVar, PaymentTip paymentTip, int i) {
        super(0);
        this.$t = i;
        this.l0 = fragmentManager;
        this.l1 = hVar;
        this.l2 = paymentTip;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS245S0300000_1(Response response, Response<PayResponseData> response2, Function0<Unit> function0, C03PI c03pi) {
        super(0);
        this.$t = c03pi;
        this.l0 = response;
        this.l1 = response2;
        this.l2 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS245S0300000_1(LogisticDTO logisticDTO, LogisticDTO logisticDTO2, DeliveryData deliveryData, List<Object> list) {
        super(0);
        this.$t = list;
        this.l0 = logisticDTO;
        this.l1 = logisticDTO2;
        this.l2 = deliveryData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS245S0300000_1(USCombineAggregationOrderCell uSCombineAggregationOrderCell, View view, C719302rP c719302rP, int i) {
        super(0);
        this.$t = i;
        this.l0 = uSCombineAggregationOrderCell;
        this.l1 = view;
        this.l2 = c719302rP;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS245S0300000_1(USHalfLogisticsCell uSHalfLogisticsCell, C722902rz c722902rz, LogisticDTO logisticDTO, int i) {
        super(0);
        this.$t = i;
        this.l0 = uSHalfLogisticsCell;
        this.l1 = c722902rz;
        this.l2 = logisticDTO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS245S0300000_1(PaymentViewModel paymentViewModel, PaymentMethod paymentMethod, LifecycleOwner lifecycleOwner, int i) {
        super(0);
        this.$t = i;
        this.l0 = paymentViewModel;
        this.l1 = paymentMethod;
        this.l2 = lifecycleOwner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS245S0300000_1(CCDCAddCardViewModel cCDCAddCardViewModel, C890803dy c890803dy, AwS245S0300000_1 awS245S0300000_1, int i) {
        super(0);
        this.$t = i;
        this.l0 = cCDCAddCardViewModel;
        this.l1 = c890803dy;
        this.l2 = awS245S0300000_1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS245S0300000_1(CCDCAddCardViewModel cCDCAddCardViewModel, CCDCAddCardViewModel cCDCAddCardViewModel2, PaymentInfo paymentInfo, List<PaymentElement> list) {
        super(0);
        this.$t = list;
        this.l0 = cCDCAddCardViewModel;
        this.l1 = cCDCAddCardViewModel2;
        this.l2 = paymentInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS245S0300000_1(PayResponseData payResponseData, OrderSubmitAssemViewModel orderSubmitAssemViewModel, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = payResponseData;
        this.l1 = orderSubmitAssemViewModel;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS245S0300000_1(SeaPdpHeadViewHolder seaPdpHeadViewHolder, EntranceBubble entranceBubble, SeaPdpViewModel seaPdpViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = seaPdpHeadViewHolder;
        this.l1 = entranceBubble;
        this.l2 = seaPdpViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS245S0300000_1(SeaShippingVH seaShippingVH, SeaShippingVH seaShippingVH2, Map<String, Object> map, PDPShippingModuleMeta pDPShippingModuleMeta) {
        super(0);
        this.$t = pDPShippingModuleMeta;
        this.l0 = seaShippingVH;
        this.l1 = seaShippingVH2;
        this.l2 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS245S0300000_1(SeaPdpWaistBannerViewHolder seaPdpWaistBannerViewHolder, C1020703yv c1020703yv, PageFinder pageFinder, int i) {
        super(0);
        this.$t = i;
        this.l0 = seaPdpWaistBannerViewHolder;
        this.l1 = c1020703yv;
        this.l2 = pageFinder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS245S0300000_1(SeaPdpFragment seaPdpFragment, SeaPdpFragment seaPdpFragment2, ProductPackStruct productPackStruct, HashMap<String, Object> map) {
        super(0);
        this.$t = map;
        this.l0 = seaPdpFragment;
        this.l1 = seaPdpFragment2;
        this.l2 = productPackStruct;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS245S0300000_1(SeaPdpViewModel seaPdpViewModel, Context context, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = seaPdpViewModel;
        this.l1 = context;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS245S0300000_1(SeaPdpBottomNavBarWidgetNew seaPdpBottomNavBarWidgetNew, SeaPdpBottomNavBarWidgetNew seaPdpBottomNavBarWidgetNew2, C04E4 c04e4, Map<String, ? extends Object> map) {
        super(0);
        this.$t = map;
        this.l0 = seaPdpBottomNavBarWidgetNew;
        this.l1 = seaPdpBottomNavBarWidgetNew2;
        this.l2 = c04e4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS245S0300000_1(ReturnPoliciesFragment returnPoliciesFragment, ContactDetail contactDetail, C03DX c03dx, int i) {
        super(0);
        this.$t = i;
        this.l0 = returnPoliciesFragment;
        this.l1 = contactDetail;
        this.l2 = c03dx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS245S0300000_1(PdpViewModel pdpViewModel, Context context, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = pdpViewModel;
        this.l1 = context;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS245S0300000_1(PdpViewModel pdpViewModel, SkuPanelState skuPanelState, Integer num, int i) {
        super(0);
        this.$t = i;
        this.l0 = pdpViewModel;
        this.l1 = skuPanelState;
        this.l2 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS245S0300000_1(Announcement announcement, SeaPdpFragment seaPdpFragment, SeaPdpViewModel seaPdpViewModel, C807503Dl c807503Dl, int i) {
        super(0);
        this.$t = i;
        this.l0 = c807503Dl;
        this.l1 = announcement;
        this.l2 = seaPdpFragment;
    }
}
