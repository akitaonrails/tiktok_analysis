package kotlin.jvm.internal;

import X.C09AY;
import X.C0LCS;
import X.C1010603xI;
import X.C1023640ckE;
import X.C1071690dzj;
import X.C1D2Q;
import X.C2097908Jt;
import X.C953503o5;
import X.EnumC1073320e2M;
import X.InterfaceC497601wk;
import com.bytedance.router.monitor.page.FragmentRouter;
import com.bytedance.router.monitor.page.PageRouterHandler;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.producthighlight.ProductHighlightData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.producthighlight.ProductHighlightVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleV3VH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleVO;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.header.skc.SeaPdpSkcPanelHeaderState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.header.skc.SeaPdpSkcPanelHeaderViewModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.EditTextStickerViewState;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public class AwS149S1100000_35 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
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
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS149S1100000_35 awS149S1100000_35, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((FragmentRouter) obj).activityId, awS149S1100000_35.s0));
    }

    public static final Object invoke$1(AwS149S1100000_35 awS149S1100000_35, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        USSESSellerModuleVO uSSESSellerModuleVOX5 = ((USSESSellerModuleV3VH) awS149S1100000_35.l1).X5();
        laneParams.plusAssign("module_name", "shop_card_brand_explanation");
        ((USSESSellerModuleV3VH) awS149S1100000_35.l1).getClass();
        laneParams.withParamsGroup(C2097908Jt.LIZJ(new Pair("rights_content_new", USSESSellerModuleV3VH.v6(uSSESSellerModuleVOX5))));
        laneParams.withParamsGroup(((USSESSellerModuleV3VH) awS149S1100000_35.l1).t7().LLILZIL.LJ(awS149S1100000_35.s0));
        laneParams.withParamsGroup(((USSESSellerModuleV3VH) awS149S1100000_35.l1).z6());
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS149S1100000_35 awS149S1100000_35, Object obj) {
        C1071690dzj c1071690dzj = (C1071690dzj) obj;
        c1071690dzj.LIZJ = EnumC1073320e2M.SOCIAL_RELEVANT_EVENT;
        c1071690dzj.LIZLLL = (InterfaceC497601wk) awS149S1100000_35.l1;
        new AwS85S1000000_35(awS149S1100000_35.s0, 19).invoke(c1071690dzj.LJI);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS149S1100000_35 awS149S1100000_35, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        String str = awS149S1100000_35.s0;
        if (str != null) {
            C1D2Q.LIZ.getClass();
            c1023640ckE.withParam(C1D2Q.LJI, str);
        }
        Long l = (Long) awS149S1100000_35.l1;
        if (l != null) {
            long jLongValue = l.longValue();
            C1D2Q.LIZ.getClass();
            c1023640ckE.withParam(C1D2Q.LJII, Long.valueOf(jLongValue));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS149S1100000_35 awS149S1100000_35, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        String str = awS149S1100000_35.s0;
        if (str != null) {
            C1D2Q.LIZ.getClass();
            c1023640ckE.withParam(C1D2Q.LJI, str);
        }
        Long l = (Long) awS149S1100000_35.l1;
        if (l != null) {
            long jLongValue = l.longValue();
            C1D2Q.LIZ.getClass();
            c1023640ckE.withParam(C1D2Q.LJII, Long.valueOf(jLongValue));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS149S1100000_35 awS149S1100000_35, Object obj) {
        EditTextStickerViewState editTextStickerViewState = (EditTextStickerViewState) obj;
        return editTextStickerViewState.copy(editTextStickerViewState.ui, editTextStickerViewState.inTimeEditView, editTextStickerViewState.sticker2Top, editTextStickerViewState.dismissHitText, editTextStickerViewState.addSticker, editTextStickerViewState.guideListener, editTextStickerViewState.reloadStickerEvent, editTextStickerViewState.changeToTopListener, editTextStickerViewState.textStickerEditListener, editTextStickerViewState.timeClickListener, editTextStickerViewState.readTextClickListener, editTextStickerViewState.addGuidanceStickerIfNeed, editTextStickerViewState.targetCanvasSize, editTextStickerViewState.showInputView, editTextStickerViewState.editTextSticker, editTextStickerViewState.removeAllStickerEvent, editTextStickerViewState.updateLayoutSizeEvent, editTextStickerViewState.guideViewVisibility, editTextStickerViewState.resetGuideViewVisibilityEvent, editTextStickerViewState.forceHideReadItemEvent, editTextStickerViewState.goReadTextStickerScene, editTextStickerViewState.cancelNewStickerRead, editTextStickerViewState.fakeTextDataAndRead, editTextStickerViewState.getNowStringGoToReadWithFake, editTextStickerViewState.changeTextEditPageReadIcon, new C0LCS<>(new Pair((TextStickerData) awS149S1100000_35.l1, awS149S1100000_35.s0)), editTextStickerViewState.mobClickTextReadingEvent, editTextStickerViewState.muteReadText, editTextStickerViewState.enableDirectEditEvent, editTextStickerViewState.addTextChangeListenerEvent, editTextStickerViewState.addTextStickerViaString, editTextStickerViewState.removeTextSticker, editTextStickerViewState.updateStickerTime, editTextStickerViewState.removeGuidanceText, editTextStickerViewState.registerTimeEditRefreshListener, editTextStickerViewState.unRegisterTimeEditRefreshListener, editTextStickerViewState.removeAllTextSticker, editTextStickerViewState.videoPlayState);
    }

    public static final Object invoke$3(AwS149S1100000_35 awS149S1100000_35, Object obj) {
        C1071690dzj c1071690dzj = (C1071690dzj) obj;
        c1071690dzj.LIZJ = EnumC1073320e2M.SOCIAL_RELEVANT_EVENT;
        c1071690dzj.LIZLLL = (InterfaceC497601wk) awS149S1100000_35.l1;
        new AwS85S1000000_35(awS149S1100000_35.s0, 8).invoke(c1071690dzj.LJI);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS149S1100000_35 awS149S1100000_35, Object obj) {
        C1071690dzj c1071690dzj = (C1071690dzj) obj;
        c1071690dzj.LIZJ = EnumC1073320e2M.SOCIAL_RELEVANT_EVENT;
        c1071690dzj.LIZLLL = (InterfaceC497601wk) awS149S1100000_35.l1;
        new AwS85S1000000_35(awS149S1100000_35.s0, 13).invoke(c1071690dzj.LJI);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS149S1100000_35 awS149S1100000_35, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        C1010603xI.LIZJ(laneParams, awS149S1100000_35.s0);
        laneParams.withParamsGroup(((ProductHighlightVH) awS149S1100000_35.l1).d6().LLILZIL.LJ(((ProductHighlightVH) awS149S1100000_35.l1).c6()));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS149S1100000_35 awS149S1100000_35, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        C1010603xI.LIZJ(laneParams, awS149S1100000_35.s0);
        laneParams.withParamsGroup(((ProductHighlightVH) awS149S1100000_35.l1).d6().LLILZIL.LJ(((ProductHighlightVH) awS149S1100000_35.l1).c6()));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS149S1100000_35 awS149S1100000_35, Object obj) {
        String str;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("slide_type", awS149S1100000_35.s0);
        ProductHighlightData productHighlightData = ((ProductHighlightVH) awS149S1100000_35.l1).X5().moduleData;
        if (productHighlightData != null) {
            str = productHighlightData.daInfo;
        } else {
            str = null;
        }
        C1010603xI.LIZJ(laneParams, str);
        laneParams.withParamsGroup(((ProductHighlightVH) awS149S1100000_35.l1).d6().LLILZIL.LJ(((ProductHighlightVH) awS149S1100000_35.l1).c6()));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS149S1100000_35 awS149S1100000_35, Object obj) {
        SeaPdpSkcPanelHeaderViewModel seaPdpSkcPanelHeaderViewModel = (SeaPdpSkcPanelHeaderViewModel) awS149S1100000_35.l1;
        C953503o5 seaPdpProductPriceData = ((SeaPdpSkcPanelHeaderState) obj).getSeaPdpProductPriceData();
        String str = awS149S1100000_35.s0;
        seaPdpSkcPanelHeaderViewModel.getClass();
        seaPdpSkcPanelHeaderViewModel.setState(new AwS149S1100000_35(seaPdpProductPriceData, str, 9));
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS149S1100000_35 awS149S1100000_35, Object obj) {
        SeaPdpSkcPanelHeaderState seaPdpSkcPanelHeaderState = (SeaPdpSkcPanelHeaderState) obj;
        return seaPdpSkcPanelHeaderState.copy(seaPdpSkcPanelHeaderState.headerImgList, (C953503o5) awS149S1100000_35.l1, awS149S1100000_35.s0, seaPdpSkcPanelHeaderState.promotionDealVO, seaPdpSkcPanelHeaderState.keyBoardVisibility);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS149S1100000_35(C953503o5 c953503o5, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c953503o5;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS149S1100000_35(PageRouterHandler pageRouterHandler, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = pageRouterHandler;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS149S1100000_35(USSESSellerModuleV3VH uSSESSellerModuleV3VH, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = uSSESSellerModuleV3VH;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS149S1100000_35(SeaPdpSkcPanelHeaderViewModel seaPdpSkcPanelHeaderViewModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = seaPdpSkcPanelHeaderViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS149S1100000_35(TextStickerData textStickerData, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = textStickerData;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS149S1100000_35(String str, InterfaceC497601wk interfaceC497601wk, int i) {
        super(1);
        this.$t = i;
        this.l1 = interfaceC497601wk;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS149S1100000_35(String str, ProductHighlightVH productHighlightVH, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = productHighlightVH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS149S1100000_35(String str, Long l, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = l;
    }
}
