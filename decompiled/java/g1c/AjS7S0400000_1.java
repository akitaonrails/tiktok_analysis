package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.AnonymousClass0376;
import X.C037J;
import X.C03C8;
import X.C03FC;
import X.C03GM;
import X.C03GO;
import X.C03JP;
import X.C03U4;
import X.C049H;
import X.C049Y;
import X.C1011703xT;
import X.C1013103xh;
import X.C10329042d;
import X.C10516049i;
import X.C1054104Ah;
import X.C1073204Hq;
import X.C1390920mIc;
import X.C13BV;
import X.C13LP;
import X.C1741890vQh;
import X.C1748720vbi;
import X.C1748730vbj;
import X.C197039127h;
import X.C19EG;
import X.C2097608Jq;
import X.C21244318Bt;
import X.C426160GnO;
import X.C714302qb;
import X.C719202rO;
import X.C720002rW;
import X.C722302rt;
import X.C770702zh;
import X.C786410Ut5;
import X.C7879035x;
import X.C7939038f;
import X.C7969039j;
import X.C808003Dq;
import X.C817603Hi;
import X.C817803Hk;
import X.C919503ib;
import X.C958103op;
import X.C960603pE;
import X.C972903rD;
import X.InterfaceC1012803xe;
import X.InterfaceC1748810vbr;
import X.InterfaceC7980039u;
import X.InterfaceC954103oB;
import X.InterfaceC975703rf;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressAdapter$AddressViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic.LogisticSubViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.discount.PlatformDiscountsCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.ShippingFeeDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.bonus.SeaBonusCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.summary.SubBillItemData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.summary.SummaryCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.discount.USPlatformDiscountsCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.summary.USOrderSummaryCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.usexpress.summary.USHalfPageOrderSummaryFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BonusInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ComboSubSkuExpression;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PopupButton;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PopupLayerDetailInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionCouponModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.subpage.USCustomizeBundleFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaist;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.onereview.PdpReviewViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuPanelBaseReusedAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS115S1100000_1;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS650S0100000_1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes2.dex */
public class AjS7S0400000_1 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.AbstractViewOnClickListenerC420730Ged
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, view);
                break;
            case 14:
                LIZ$14(this, view);
                break;
            case 15:
                LIZ$15(this, view);
                break;
            case 16:
                LIZ$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                LIZ$17(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                LIZ$18(this, view);
                break;
            case 19:
                LIZ$19(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                LIZ$20(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AjS7S0400000_1 ajS7S0400000_1, View view) {
        boolean z;
        Object obj;
        if (view != null) {
            OrderSubmitAssemViewModel orderSubmitAssemViewModel = (OrderSubmitAssemViewModel) ajS7S0400000_1.l0;
            C037J c037j = orderSubmitAssemViewModel.LLLJL;
            C719202rO c719202rO = (C719202rO) ajS7S0400000_1.l1;
            c037j.LJ = c719202rO.LLJILJILJ;
            C817803Hk c817803Hk = new C817803Hk("c3646.d8120", (Integer) ajS7S0400000_1.l2);
            C817603Hi c817603Hi = orderSubmitAssemViewModel.LLLZLZ;
            String string = c719202rO.LLJJ;
            c817603Hi.getClass();
            if (string != null && string.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            String str = null;
            if (!z) {
                String strLJFF = C817603Hi.LJFF(c817803Hk);
                C21244318Bt c21244318Bt = new C21244318Bt();
                c21244318Bt.LIZ = strLJFF;
                c21244318Bt.LIZIZ = PageFinder.via(c817603Hi.LIZLLL);
                c21244318Bt.LIZJ = null;
                String strCreateJumpSourceBtmToken = BtmSDK.INSTANCE.createJumpSourceBtmToken(c21244318Bt);
                if (C770702zh.LIZIZ(strCreateJumpSourceBtmToken)) {
                    Uri.Builder builderBuildUpon = UriProtector.parse(string).buildUpon();
                    builderBuildUpon.appendQueryParameter("source_btm_token", strCreateJumpSourceBtmToken);
                    string = builderBuildUpon.build().toString();
                }
            }
            C1013103xh c1013103xh = InterfaceC1012803xe.LIZ;
            Context context = ((View) ajS7S0400000_1.l3).getContext();
            if (string == null) {
                string = "";
            }
            HashMap<String, Object> map = ((OrderSubmitAssemViewModel) ajS7S0400000_1.l0).LLLIL;
            if (map != null) {
                obj = map.get("entrance_info");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str = (String) obj;
            }
            C1013103xh.LIZJ(c1013103xh, context, string, ((C719202rO) ajS7S0400000_1.l1).LLJILJILJ, 2, str, ((OrderSubmitAssemViewModel) ajS7S0400000_1.l0).LLLIL, null, null, null, null, 7936);
            C1748720vbi.LIZLLL(view, new C10516049i(), new AwS210S0300000_1((C719202rO) ajS7S0400000_1.l1, (OrderSubmitAssemViewModel) ajS7S0400000_1.l0, c817803Hk, 11));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$1(AjS7S0400000_1 ajS7S0400000_1, View view) {
        String str;
        if (view != null) {
            HashMap<String, Object> mapLJIIJ = null;
            String strLJ = ((PlatformDiscountsCell) ajS7S0400000_1.l0).T5().LLLZLZ.LJ("c1196.d19683_w10345", ((PromotionCouponModule) ajS7S0400000_1.l1).vapSchema, null);
            if (strLJ != null && !a0.LJJJIL(strLJ)) {
                C919503ib.LIZIZ(((View) ajS7S0400000_1.l2).getContext(), strLJ, C2097608Jq.LJ(), false).open();
            }
            C720002rW c720002rW = (C720002rW) ((PlatformDiscountsCell) ajS7S0400000_1.l0).getItem();
            if (c720002rW != null && (str = c720002rW.LLJJIJIIJIL) != null) {
                mapLJIIJ = C1741890vQh.LJIIJ(str);
            }
            C1748720vbi.LIZLLL((TuxTextView) ajS7S0400000_1.l3, new C10516049i(), new AwS367S0200000_1((PlatformDiscountsCell) ajS7S0400000_1.l0, mapLJIIJ, 54));
        }
    }

    public static final void LIZ$10(AjS7S0400000_1 ajS7S0400000_1, View view) {
        if (view != null) {
            C1748720vbi.LIZLLL((TuxIconView) ajS7S0400000_1.l0, new C049Y(), AFwS228S0000000_1.get$arr$(586));
            FragmentManager fragmentManager = ((SkuPanelBaseReusedAssem) ((InterfaceC7980039u) ajS7S0400000_1.l1)).tp().getFragmentManager();
            if (fragmentManager != null) {
                C808003Dq.LJFF(C808003Dq.LIZLLL(C808003Dq.LJ(((View) ajS7S0400000_1.l2).getContext(), R.attr.u_, 51, ((C722302rt) ajS7S0400000_1.l3).LLJJ), C7879035x.LIZ().getString(2131848100), false, new AwS650S0100000_1((TuxIconView) ajS7S0400000_1.l0, 20), 28), fragmentManager, null, new AwS545S0100000_1((TuxIconView) ajS7S0400000_1.l0, 1586), 4);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$11(AjS7S0400000_1 ajS7S0400000_1, View view) {
        TuxSheet tuxSheet;
        if (view != null) {
            C1748720vbi.LIZLLL((LinearLayout) ajS7S0400000_1.l0, new C049Y(), new AwS580S0100000_1((OrderSubmitAssemViewModel) ajS7S0400000_1.l1, 582));
            String strLIZJ = ((OrderSubmitAssemViewModel) ajS7S0400000_1.l1).LLLZLZ.LIZJ("c61704.d79729", null);
            C03GM c03gm = USCustomizeBundleFragment.LLJ;
            Fragment fragment = (Fragment) ajS7S0400000_1.l2;
            ComboSubSkuExpression comboSubSkuExpression = (ComboSubSkuExpression) ajS7S0400000_1.l3;
            c03gm.getClass();
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LJIIIIZZ(1);
            c1390920mIc.LIZ.LLJJL = (int) C958103op.LIZIZ();
            USCustomizeBundleFragment uSCustomizeBundleFragment = new USCustomizeBundleFragment();
            Bundle bundle = new Bundle();
            if (fragment instanceof InterfaceC1748810vbr) {
                C960603pE.LJI(bundle, (InterfaceC1748810vbr) fragment, new AwS115S1100000_1(comboSubSkuExpression, strLIZJ, 13));
            }
            uSCustomizeBundleFragment.setArguments(bundle);
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLJJIJI = uSCustomizeBundleFragment;
            tuxSheet2.LLJLL = true;
            tuxSheet2.LLJLLL = false;
            tuxSheet2.LLJLILLLLZIIL = false;
            USCustomizeBundleFragment.LLJIJIL = tuxSheet2;
            FragmentManager fragmentManager = fragment.getFragmentManager();
            if (fragmentManager != null && (tuxSheet = USCustomizeBundleFragment.LLJIJIL) != null) {
                tuxSheet.show(fragmentManager, (String) null);
            }
        }
    }

    public static final void LIZ$12(AjS7S0400000_1 ajS7S0400000_1, View view) {
        if (view != null) {
            C1011703xT.LIZ(((PromotionWaist) ajS7S0400000_1.l0).jumpSchema, (InterfaceC1748810vbr) ajS7S0400000_1.l1, ((C10329042d) ajS7S0400000_1.l2).getContext(), ((PdpViewModel) ajS7S0400000_1.l3).LLJI);
            C1748720vbi.LIZLLL((C10329042d) ajS7S0400000_1.l2, new C049H(), new AwS580S0100000_1((C10329042d) ajS7S0400000_1.l2, 628));
        }
    }

    public static final void LIZ$13(AjS7S0400000_1 ajS7S0400000_1, View view) {
        C1054104Ah c1054104Ah;
        String str;
        ProductDetailReview productDetailReview;
        if (view != null) {
            Integer num = ((ReviewMedia) ajS7S0400000_1.l0).mediaType;
            if (num != null && num.intValue() == 1) {
                C1054104Ah c1054104Ah2 = ((PdpReviewViewHolder) ajS7S0400000_1.l1).c6().LLJLIL;
                if (c1054104Ah2 != null) {
                    c1054104Ah2.LJJIJLIJ((ReviewItemStruct) ajS7S0400000_1.l2, "pic");
                }
            } else {
                Integer num2 = ((ReviewMedia) ajS7S0400000_1.l0).mediaType;
                if (num2 != null && num2.intValue() == 2 && (c1054104Ah = ((PdpReviewViewHolder) ajS7S0400000_1.l1).c6().LLJLIL) != null) {
                    c1054104Ah.LJJIJLIJ((ReviewItemStruct) ajS7S0400000_1.l2, "video");
                }
            }
            C1073204Hq c1073204Hq = ((PdpReviewViewHolder) ajS7S0400000_1.l1).c6().LLLLLJLJLL;
            C426160GnO c426160GnO = (C426160GnO) ajS7S0400000_1.l3;
            ReviewItemStruct.MainReview mainReview = ((ReviewItemStruct) ajS7S0400000_1.l2).review;
            String str2 = null;
            if (mainReview != null) {
                str = mainReview.reviewId;
            } else {
                str = null;
            }
            String strLJIIIZ = ((PdpReviewViewHolder) ajS7S0400000_1.l1).c6().LLLLL.LJIIIZ();
            ProductPackStruct productPackStruct = ((PdpReviewViewHolder) ajS7S0400000_1.l1).c6().LLJIJIL;
            if (productPackStruct != null && (productDetailReview = productPackStruct.review) != null) {
                str2 = productDetailReview.daInfo;
            }
            C1073204Hq.LIZIZ(c1073204Hq, c426160GnO, "review_entrance", "review", 1, str, strLJIIIZ, str2, 64);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.037v, android.view.View] */
    public static final void LIZ$14(AjS7S0400000_1 ajS7S0400000_1, View view) {
        String str;
        FragmentManager fragmentManager;
        Integer num;
        Context context;
        if (view != null) {
            final Context context2 = ((View) ajS7S0400000_1.l0).getContext();
            C714302qb c714302qb = (C714302qb) ajS7S0400000_1.l1;
            final AttributeSet attributeSet = null;
            final int i = 0;
            ?? r6 = new ConstraintLayout(context2, attributeSet, i, i) { // from class: X.037v
                public final int LL;
                public TuxTextView LLILLJJLI;
                public C197039127h LLILLL;

                public final C197039127h getBuyServiceFeeButtonFromXml() {
                    KeyEvent.Callback callbackFindViewById = this.LLILLL;
                    if (callbackFindViewById == null) {
                        callbackFindViewById = findViewById(R.id.d8h);
                        this.LLILLL = (C197039127h) callbackFindViewById;
                    }
                    return (C197039127h) callbackFindViewById;
                }

                public final TuxTextView getBuyServiceFeeContentFromXml() {
                    KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
                    if (callbackFindViewById == null) {
                        callbackFindViewById = findViewById(R.id.d8i);
                        this.LLILLJJLI = (TuxTextView) callbackFindViewById;
                    }
                    return (TuxTextView) callbackFindViewById;
                }

                public final int getScene() {
                    return this.LL;
                }

                public final void setBuyServiceFeeButtonFromXml(C197039127h c197039127h) {
                    this.LLILLL = c197039127h;
                }

                public final void setBuyServiceFeeContentFromXml(TuxTextView tuxTextView) {
                    this.LLILLJJLI = tuxTextView;
                }

                {
                    super(context2, attributeSet, i);
                    this.LL = i;
                    C786410Ut5.Td(C786410Ut5.ne(context2), R.layout.apc, this, true).setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30)));
                }
            };
            C03C8.LIZJ(r6.getBuyServiceFeeContentFromXml(), c714302qb.LJIIL, "buy_service_fee_content", null);
            C197039127h buyServiceFeeButtonFromXml = r6.getBuyServiceFeeButtonFromXml();
            PopupButton popupButton = c714302qb.LJIILIIL;
            if (popupButton != null) {
                str = popupButton.text;
            } else {
                str = null;
            }
            buyServiceFeeButtonFromXml.setText(str);
            PopupButton popupButton2 = c714302qb.LJIILIIL;
            if (popupButton2 != null && (num = popupButton2.buttonStyle) != null && num.intValue() == 5 && (context = r6.getContext()) != null) {
                r6.getBuyServiceFeeButtonFromXml().LJJJJL(new AwS580S0100000_1(context, 776));
            }
            TuxSheet tuxSheetLIZLLL = C808003Dq.LIZLLL(r6, ((C714302qb) ajS7S0400000_1.l1).LIZ, false, null, 60);
            C786410Ut5.I7(new AjS60S0100000_1(new AwS545S0100000_1(tuxSheetLIZLLL, 1656), 106), r6.getBuyServiceFeeButtonFromXml());
            Fragment fragment = (Fragment) ajS7S0400000_1.l2;
            if (fragment != null && (fragmentManager = fragment.getFragmentManager()) != null) {
                C808003Dq.LJFF(tuxSheetLIZLLL, fragmentManager, null, null, 12);
            }
            Function0 function0 = (Function0) ajS7S0400000_1.l3;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public static final void LIZ$15(AjS7S0400000_1 ajS7S0400000_1, View view) {
        List<C714302qb> list;
        if (view != null) {
            C722302rt c722302rt = (C722302rt) ajS7S0400000_1.l0;
            if (c722302rt != null) {
                list = c722302rt.LLILZLL;
            } else {
                list = null;
            }
            HashMap map = new HashMap();
            if (list != null) {
                for (C714302qb c714302qb : list) {
                    Integer num = c714302qb.LJIIIIZZ;
                    if (num != null) {
                        num.intValue();
                        map.put(String.valueOf(c714302qb.LJIIIIZZ), c714302qb.LIZIZ);
                    }
                }
            }
            C1748720vbi.LIZLLL((C03GO) ajS7S0400000_1.l1, new C049Y(), new AwS580S0100000_1((SummaryCell) ajS7S0400000_1.l2, 777));
            C19EG activity = ((SummaryCell) ajS7S0400000_1.l2).getActivity();
            if (activity != null) {
                Bundle bundle = new Bundle();
                C960603pE.LJFF(bundle, view, null);
                C786410Ut5.LJJJI("name", ((C714302qb) ajS7S0400000_1.l3).LIZ, bundle);
                C714302qb c714302qb2 = (C714302qb) ajS7S0400000_1.l3;
                C786410Ut5.LJJIJL(bundle, "sub_items", new SubBillItemData(c714302qb2.LIZ, c714302qb2.LIZIZ, c714302qb2.LIZLLL, c714302qb2.LJFF, c714302qb2.LJII, c714302qb2.LJIIIIZZ, c714302qb2.LJIIIZ, c714302qb2.LJIIJ));
                C786410Ut5.LJJJI("price", ((C714302qb) ajS7S0400000_1.l3).LIZIZ, bundle);
                C786410Ut5.LJJJI("explain_text", ((C714302qb) ajS7S0400000_1.l3).LJIIJJI, bundle);
                FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                c1390920mIc.LJIIIIZZ(0);
                ShippingFeeDialogFragment shippingFeeDialogFragment = new ShippingFeeDialogFragment();
                shippingFeeDialogFragment.setArguments(bundle);
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJJIJI = shippingFeeDialogFragment;
                tuxSheet.LLJLILLLLZIIL = false;
                tuxSheet.show(supportFragmentManager, "OSPShippingFeeDialogFragment");
            }
        }
    }

    public static final void LIZ$16(AjS7S0400000_1 ajS7S0400000_1, View view) {
        FragmentManager fragmentManager;
        String str;
        List<BillItem> listLIZ;
        String str2;
        PopupLayerDetailInfo popupLayerDetailInfo;
        PopupLayerDetailInfo popupLayerDetailInfo2;
        PopupLayerDetailInfo popupLayerDetailInfo3;
        if (view != null) {
            USHalfPageOrderSummaryFragment uSHalfPageOrderSummaryFragment = (USHalfPageOrderSummaryFragment) ajS7S0400000_1.l0;
            if (uSHalfPageOrderSummaryFragment != null && (fragmentManager = uSHalfPageOrderSummaryFragment.getFragmentManager()) != null) {
                Context context = view.getContext();
                C7969039j c7969039j = C7969039j.LIZ;
                BonusInfo bonusInfo = (BonusInfo) ajS7S0400000_1.l2;
                if (bonusInfo != null && (popupLayerDetailInfo3 = bonusInfo.popupLayerDetailInfo) != null) {
                    str = popupLayerDetailInfo3.desc;
                } else {
                    str = null;
                }
                if (bonusInfo == null || (popupLayerDetailInfo2 = bonusInfo.popupLayerDetailInfo) == null || (listLIZ = popupLayerDetailInfo2.LIZ()) == null) {
                    listLIZ = C13BV.INSTANCE;
                }
                C7939038f c7939038fLIZJ = C808003Dq.LIZJ(context, C7969039j.LJFF(c7969039j, str, null, listLIZ, 100, 2));
                BonusInfo bonusInfo2 = (BonusInfo) ajS7S0400000_1.l2;
                if (bonusInfo2 == null || (popupLayerDetailInfo = bonusInfo2.popupLayerDetailInfo) == null || (str2 = popupLayerDetailInfo.title) == null) {
                    str2 = "";
                }
                C808003Dq.LJFF(C808003Dq.LIZLLL(c7939038fLIZJ, str2, false, null, 60), fragmentManager, null, null, 12);
            }
            C1748720vbi.LIZLLL((TuxIconView) ajS7S0400000_1.l1, new C10516049i(), new AwS367S0200000_1((USHalfPageOrderSummaryFragment) ajS7S0400000_1.l0, (USHalfPageOrderSummaryFragment) ajS7S0400000_1.l3, (HashMap<String, Object>) 337));
        }
    }

    public static final void LIZ$17(AjS7S0400000_1 ajS7S0400000_1, View view) {
        if (view != null) {
            LogisticSubViewHolder logisticSubViewHolder = (LogisticSubViewHolder) ajS7S0400000_1.l0;
            logisticSubViewHolder.withState(logisticSubViewHolder.X5(), new AwS210S0300000_1((LogisticSubViewHolder) ajS7S0400000_1.l0, (LogisticDTO) ajS7S0400000_1.l1, (C03FC) ajS7S0400000_1.l2, 119));
            String str = ((LogisticDTO) ajS7S0400000_1.l1).spendMoreForFree.schema;
            if (str != null) {
                ((LogisticSubViewHolder) ajS7S0400000_1.l0).X5().AR2(((View) ajS7S0400000_1.l3).getContext(), str);
            }
        }
    }

    public static final void LIZ$18(AjS7S0400000_1 ajS7S0400000_1, View view) {
        Object obj;
        String str;
        List<ShopOrderNew> list;
        ShopOrderNew shopOrderNew;
        if (view != null) {
            ((PlatformDiscountsCell) ajS7S0400000_1.l0).T5().LLLJL.LJ = ((C720002rW) ajS7S0400000_1.l1).LLIZ;
            String str2 = null;
            String strLJ = ((PlatformDiscountsCell) ajS7S0400000_1.l0).T5().LLLZLZ.LJ("c1196.d26958", ((C720002rW) ajS7S0400000_1.l1).LLJ, null);
            C1013103xh c1013103xh = InterfaceC1012803xe.LIZ;
            Context context = ((View) ajS7S0400000_1.l2).getContext();
            if (strLJ == null) {
                strLJ = "";
            }
            HashMap<String, Object> map = ((PlatformDiscountsCell) ajS7S0400000_1.l0).T5().LLLIL;
            if (map != null) {
                obj = map.get("entrance_info");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            HashMap<String, Object> map2 = ((PlatformDiscountsCell) ajS7S0400000_1.l0).T5().LLLIL;
            String str3 = ((C720002rW) ajS7S0400000_1.l1).LLIZ;
            BillInfoData billInfoData = ((PlatformDiscountsCell) ajS7S0400000_1.l0).T5().LLJJI;
            if (billInfoData != null && (list = billInfoData.newShopOrders) != null && (shopOrderNew = (ShopOrderNew) C13LP.LJJJLL(list)) != null) {
                str2 = shopOrderNew.shopPromotionCacheKey;
            }
            C1013103xh.LIZJ(c1013103xh, context, strLJ, str3, 1, str, map2, null, null, str3, str2, 1792);
            C1748720vbi.LIZLLL((View) ajS7S0400000_1.l2, new C10516049i(), new AwS210S0300000_1((PlatformDiscountsCell) ajS7S0400000_1.l0, (PlatformDiscountsCell) ajS7S0400000_1.l1, (C720002rW) ajS7S0400000_1.l3, (HashMap<String, Object>) 121));
        }
    }

    public static final void LIZ$19(AjS7S0400000_1 ajS7S0400000_1, View view) {
        if (view != null) {
            C03U4 c03u4 = C03U4.LIZ;
            View view2 = (View) ajS7S0400000_1.l0;
            ExceptionUX exceptionUX = ((BonusInfo) ajS7S0400000_1.l1).redeemInfo;
            AFwS185S0000000_1 aFwS185S0000000_1 = AFwS185S0000000_1.get$arr$(529);
            AFwS185S0000000_1 aFwS185S0000000_12 = AFwS185S0000000_1.get$arr$(530);
            c03u4.getClass();
            C03U4.LIZ(view2, exceptionUX, aFwS185S0000000_1, aFwS185S0000000_12, null, null);
            C1748720vbi.LIZLLL((View) ajS7S0400000_1.l0, new C10516049i(), new AwS367S0200000_1((PlatformDiscountsCell) ajS7S0400000_1.l2, (HashMap) ajS7S0400000_1.l3, 366));
            C1748720vbi.LIZLLL((View) ajS7S0400000_1.l0, new C049Y(), new AwS580S0100000_1((PlatformDiscountsCell) ajS7S0400000_1.l2, 1007));
        }
    }

    public static final void LIZ$2(AjS7S0400000_1 ajS7S0400000_1, View view) {
        if (view != null) {
            C03JP c03jp = (C03JP) ajS7S0400000_1.l0;
            if (!c03jp.LLJILLL) {
                c03jp.h0((AnonymousClass0376) ajS7S0400000_1.l1, (OrderSubmitAssemViewModel) ajS7S0400000_1.l2, "select", Boolean.FALSE);
                Function1 function1 = (Function1) ajS7S0400000_1.l3;
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(((C03JP) ajS7S0400000_1.l0).LLJILLL));
                }
            }
        }
    }

    public static final void LIZ$20(AjS7S0400000_1 ajS7S0400000_1, View view) {
        if (view != null) {
            String str = ((LinkRichText) ajS7S0400000_1.l0).link;
            if (str != null) {
                C919503ib.LIZIZ((Context) ajS7S0400000_1.l2, str, C2097608Jq.LJ(), false).open();
            }
            C1748720vbi.LIZLLL((TuxTextView) ajS7S0400000_1.l1, new C10516049i(), new AwS580S0100000_1((InterfaceC954103oB) ajS7S0400000_1.l3, 1128));
        }
    }

    public static final void LIZ$3(AjS7S0400000_1 ajS7S0400000_1, View view) {
        FragmentManager fragmentManager;
        if (view != null) {
            C1748720vbi.LIZLLL((TuxIconView) ajS7S0400000_1.l0, new C049Y(), AFwS228S0000000_1.get$arr$(113));
            Fragment fragment = ((USOrderSummaryCell) ajS7S0400000_1.l1).getFragment();
            if (fragment != null && (fragmentManager = fragment.getFragmentManager()) != null) {
                C808003Dq.LJFF(C808003Dq.LIZLLL(C808003Dq.LJ(((View) ajS7S0400000_1.l2).getContext(), R.attr.u_, 51, ((C722302rt) ajS7S0400000_1.l3).LLJJ), C7879035x.LIZ().getString(2131848100), false, new AwS650S0100000_1((TuxIconView) ajS7S0400000_1.l0, 3), 28), fragmentManager, null, new AwS545S0100000_1((TuxIconView) ajS7S0400000_1.l0, 696), 4);
            }
        }
    }

    public static final void LIZ$4(AjS7S0400000_1 ajS7S0400000_1, View view) {
        if (view != null) {
            ((SeaBonusCell) ajS7S0400000_1.l0).N5((View) ajS7S0400000_1.l1, (BonusInfo) ajS7S0400000_1.l2, (HashMap) ajS7S0400000_1.l3);
        }
    }

    public static final void LIZ$5(AjS7S0400000_1 ajS7S0400000_1, View view) {
        if (view != null) {
            ((SeaBonusCell) ajS7S0400000_1.l0).N5((TuxIconView) ajS7S0400000_1.l1, (BonusInfo) ajS7S0400000_1.l2, (HashMap) ajS7S0400000_1.l3);
        }
    }

    public static final void LIZ$6(AjS7S0400000_1 ajS7S0400000_1, View view) {
        FragmentManager fragmentManager;
        String str;
        List<BillItem> listLIZ;
        String str2;
        if (view != null) {
            Fragment fragment = ((USPlatformDiscountsCell) ajS7S0400000_1.l0).getFragment();
            if (fragment != null && (fragmentManager = fragment.getFragmentManager()) != null) {
                Context context = ((USPlatformDiscountsCell) ajS7S0400000_1.l0).itemView.getContext();
                C7969039j c7969039j = C7969039j.LIZ;
                PopupLayerDetailInfo popupLayerDetailInfo = ((BonusInfo) ajS7S0400000_1.l2).popupLayerDetailInfo;
                if (popupLayerDetailInfo != null) {
                    str = popupLayerDetailInfo.desc;
                } else {
                    str = null;
                }
                if (popupLayerDetailInfo == null || (listLIZ = popupLayerDetailInfo.LIZ()) == null) {
                    listLIZ = C13BV.INSTANCE;
                }
                C7939038f c7939038fLIZJ = C808003Dq.LIZJ(context, C7969039j.LJFF(c7969039j, str, null, listLIZ, 100, 2));
                PopupLayerDetailInfo popupLayerDetailInfo2 = ((BonusInfo) ajS7S0400000_1.l2).popupLayerDetailInfo;
                if (popupLayerDetailInfo2 == null || (str2 = popupLayerDetailInfo2.title) == null) {
                    str2 = "";
                }
                C808003Dq.LJFF(C808003Dq.LIZLLL(c7939038fLIZJ, str2, false, null, 60), fragmentManager, null, null, 12);
            }
            C1748720vbi.LIZLLL((View) ajS7S0400000_1.l1, new C10516049i(), new AwS367S0200000_1((USPlatformDiscountsCell) ajS7S0400000_1.l0, (USPlatformDiscountsCell) ajS7S0400000_1.l3, (HashMap<String, Object>) 194));
        }
    }

    public static final void LIZ$7(AjS7S0400000_1 ajS7S0400000_1, View view) {
        if (view != null) {
            ((AddressAdapter$AddressViewHolder) ajS7S0400000_1.l0).b6(((Address) ajS7S0400000_1.l1).LJII(), "other", (ReachableAddress) ajS7S0400000_1.l2);
            if (((C972903rD) ajS7S0400000_1.l3).getReachable()) {
                ((AddressAdapter$AddressViewHolder) ajS7S0400000_1.l0).W5().Fk1((Address) ajS7S0400000_1.l1);
            }
        }
    }

    public static final void LIZ$8(AjS7S0400000_1 ajS7S0400000_1, View view) {
        String hintText;
        int i;
        if (view != null && (hintText = ((C972903rD) ajS7S0400000_1.l0).getHintText()) != null && !a0.LJJJIL(hintText)) {
            ((AddressAdapter$AddressViewHolder) ajS7S0400000_1.l1).b6(((Address) ajS7S0400000_1.l2).LJII(), "other", (ReachableAddress) ajS7S0400000_1.l3);
            InterfaceC975703rf interfaceC975703rfW5 = ((AddressAdapter$AddressViewHolder) ajS7S0400000_1.l1).W5();
            Context context = view.getContext();
            InterfaceC1748810vbr interfaceC1748810vbrLIZ = C1748730vbj.LIZ(view);
            Address address = (Address) ajS7S0400000_1.l2;
            String hintText2 = ((C972903rD) ajS7S0400000_1.l0).getHintText();
            Integer num = ((ReachableAddress) ajS7S0400000_1.l3).addressInvalidType;
            if (((AddressAdapter$AddressViewHolder) ajS7S0400000_1.l1).W5().xW()) {
                i = ((AddressAdapter$AddressViewHolder) ajS7S0400000_1.l1).LLJI;
            } else {
                i = ((AddressAdapter$AddressViewHolder) ajS7S0400000_1.l1).LLJI - 1;
            }
            interfaceC975703rfW5.KM(context, interfaceC1748810vbrLIZ, address, hintText2, num, Integer.valueOf(i), null, null, null, null);
        }
    }

    public static final void LIZ$9(AjS7S0400000_1 ajS7S0400000_1, View view) {
        int i;
        if (view != null) {
            InterfaceC975703rf interfaceC975703rfW5 = ((AddressAdapter$AddressViewHolder) ajS7S0400000_1.l0).W5();
            Context context = view.getContext();
            InterfaceC1748810vbr interfaceC1748810vbrLIZ = C1748730vbj.LIZ(view);
            Address address = (Address) ajS7S0400000_1.l1;
            String hintText = ((C972903rD) ajS7S0400000_1.l2).getHintText();
            Integer num = ((ReachableAddress) ajS7S0400000_1.l3).addressInvalidType;
            if (((AddressAdapter$AddressViewHolder) ajS7S0400000_1.l0).W5().xW()) {
                i = ((AddressAdapter$AddressViewHolder) ajS7S0400000_1.l0).LLJI;
            } else {
                i = ((AddressAdapter$AddressViewHolder) ajS7S0400000_1.l0).LLJI - 1;
            }
            interfaceC975703rfW5.KM(context, interfaceC1748810vbrLIZ, address, hintText, num, Integer.valueOf(i), null, null, null, null);
            ((AddressAdapter$AddressViewHolder) ajS7S0400000_1.l0).b6(((Address) ajS7S0400000_1.l1).LJII(), "edit", (ReachableAddress) ajS7S0400000_1.l3);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AjS7S0400000_1(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r4, com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressAdapter$AddressViewHolder r5, com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress r6, X.C972903rD r7, int r8) {
        /*
            r3 = this;
            r3.$t = r8
            switch(r8) {
                case 7: goto L20;
                case 8: goto L14;
                default: goto L5;
            }
        L5:
            r2 = r3
            r2.l0 = r5
            r2.l1 = r4
            r2.l2 = r7
            r2.l3 = r6
            r0 = 700(0x2bc, double:3.46E-321)
        L10:
            r2.<init>(r0)
            return
        L14:
            r2 = r3
            r2.l0 = r7
            r2.l1 = r5
            r2.l2 = r4
            r2.l3 = r6
            r0 = 700(0x2bc, double:3.46E-321)
            goto L10
        L20:
            r2 = r3
            r2.l0 = r5
            r2.l1 = r4
            r2.l2 = r6
            r2.l3 = r7
            r0 = 700(0x2bc, double:3.46E-321)
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: g1c.AjS7S0400000_1.<init>(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address, com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressAdapter$AddressViewHolder, com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress, X.03rD, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS7S0400000_1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
