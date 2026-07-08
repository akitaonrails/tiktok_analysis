package kotlin.jvm.internal;

import X.C03HZ;
import X.C09AY;
import X.C1054004Ag;
import X.C1054104Ah;
import X.C123100dR;
import X.C821603Iw;
import X.C821703Ix;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.address.widget.ZipCodePickerDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.logisticpanel.AggregateLogisticPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpRecommendPreloadResponse;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS39S0100100_1 extends C09AY implements Function1 {
    public final int $t;
    public long j1;
    public Object l0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS39S0100100_1 awS39S0100100_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("stay_time", Long.valueOf(awS39S0100100_1.j1));
        laneParams.plusAssign("quit_type", ((ZipCodePickerDialogFragment) awS39S0100100_1.l0).LLIZLLLIL);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS39S0100100_1 awS39S0100100_1, Object obj) {
        int size;
        List<C821603Iw> list;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("quit_type", "close");
        laneParams.plusAssign("is_edit_logistics", CardStruct.IStatusCode.DEFAULT);
        laneParams.plusAssign("stay_time", Long.valueOf(awS39S0100100_1.j1 - C03HZ.LIZIZ));
        C821703Ix c821703Ix = ((AggregateLogisticPanelFragment) awS39S0100100_1.l0).VR().LLILLL;
        if (c821703Ix != null && (list = c821703Ix.LIZJ) != null) {
            size = list.size();
        } else {
            size = 0;
        }
        laneParams.plusAssign("group_cnt", Integer.valueOf(size));
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS39S0100100_1 awS39S0100100_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS39S0100100_1.l0).LIZIZ);
        laneParams.plusAssign("duration", Long.valueOf(awS39S0100100_1.j1));
        laneParams.plusAssign("action_sheet_for", "sku");
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS39S0100100_1 awS39S0100100_1, Object obj) {
        SeaPdpMainState seaPdpMainState = (SeaPdpMainState) obj;
        return seaPdpMainState.copy(seaPdpMainState.isFullScreen, seaPdpMainState.bottomBarVO, seaPdpMainState.bottomBarData, seaPdpMainState.tabs, seaPdpMainState.dismiss, seaPdpMainState.sheetState, (List) awS39S0100100_1.l0, seaPdpMainState.bottomSheetSlideOffset, seaPdpMainState.creatorSheetVO, seaPdpMainState.scrollOrientation, seaPdpMainState.creatorSheetSlideOffset, seaPdpMainState.scrollOffset, seaPdpMainState.seaFocusTabAction, seaPdpMainState.seaFocusTabActionNew, seaPdpMainState.selectedTabName, seaPdpMainState.loadingStatus, 2, Long.valueOf(awS39S0100100_1.j1), seaPdpMainState.cartTip, seaPdpMainState.cartEntry, seaPdpMainState.bodyContent, seaPdpMainState.shareInfo, seaPdpMainState.showLoadingDialog, seaPdpMainState.blockInfo, seaPdpMainState.showFloatShop, seaPdpMainState.bizEnvChange, seaPdpMainState.slideToPaymentModule, seaPdpMainState.lynxAirItemName, seaPdpMainState.exceptionUX, seaPdpMainState.lynxPopupState, seaPdpMainState.bottomFloatingState, seaPdpMainState.seaEntranceBubble, seaPdpMainState.bottomMynaBannerState, seaPdpMainState.mediaWindow);
    }

    public static final Object invoke$3(AwS39S0100100_1 awS39S0100100_1, Object obj) {
        SeaPdpMainState seaPdpMainState = (SeaPdpMainState) obj;
        return seaPdpMainState.copy(seaPdpMainState.isFullScreen, seaPdpMainState.bottomBarVO, seaPdpMainState.bottomBarData, seaPdpMainState.tabs, seaPdpMainState.dismiss, seaPdpMainState.sheetState, (List) awS39S0100100_1.l0, seaPdpMainState.bottomSheetSlideOffset, seaPdpMainState.creatorSheetVO, seaPdpMainState.scrollOrientation, seaPdpMainState.creatorSheetSlideOffset, seaPdpMainState.scrollOffset, seaPdpMainState.seaFocusTabAction, seaPdpMainState.seaFocusTabActionNew, seaPdpMainState.selectedTabName, seaPdpMainState.loadingStatus, 3, Long.valueOf(awS39S0100100_1.j1), seaPdpMainState.cartTip, seaPdpMainState.cartEntry, seaPdpMainState.bodyContent, seaPdpMainState.shareInfo, seaPdpMainState.showLoadingDialog, seaPdpMainState.blockInfo, seaPdpMainState.showFloatShop, seaPdpMainState.bizEnvChange, seaPdpMainState.slideToPaymentModule, seaPdpMainState.lynxAirItemName, seaPdpMainState.exceptionUX, seaPdpMainState.lynxPopupState, seaPdpMainState.bottomFloatingState, seaPdpMainState.seaEntranceBubble, seaPdpMainState.bottomMynaBannerState, seaPdpMainState.mediaWindow);
    }

    public static final Object invoke$4(AwS39S0100100_1 awS39S0100100_1, Object obj) {
        PdpMainState pdpMainState = (PdpMainState) obj;
        return pdpMainState.copy(pdpMainState.isFullScreen, pdpMainState.bottomBarVO, pdpMainState.dismiss, pdpMainState.sheetState, (List) awS39S0100100_1.l0, pdpMainState.bottomSheetSlideOffset, pdpMainState.creatorSheetVO, pdpMainState.scrollOrientation, pdpMainState.creatorSheetSlideOffset, pdpMainState.scrollOffset, pdpMainState.currentFocusModule, pdpMainState.loadingStatus, 2, Long.valueOf(awS39S0100100_1.j1), pdpMainState.cartTip, pdpMainState.cartEntry, pdpMainState.bodyContent, pdpMainState.shareInfo, pdpMainState.blockInfo, pdpMainState.showFavoriteGuide, pdpMainState.shopInfo, pdpMainState.bottomAreaElem, pdpMainState.protectionProgramText, pdpMainState.bizEnvChange, pdpMainState.userRight, pdpMainState.exceptionUX, pdpMainState.lynxPopupState, pdpMainState.bottomFloatingState, pdpMainState.openSkuOnInit, pdpMainState.addCartData);
    }

    public static final Object invoke$5(AwS39S0100100_1 awS39S0100100_1, Object obj) {
        PdpMainState pdpMainState = (PdpMainState) obj;
        return pdpMainState.copy(pdpMainState.isFullScreen, pdpMainState.bottomBarVO, pdpMainState.dismiss, pdpMainState.sheetState, (List) awS39S0100100_1.l0, pdpMainState.bottomSheetSlideOffset, pdpMainState.creatorSheetVO, pdpMainState.scrollOrientation, pdpMainState.creatorSheetSlideOffset, pdpMainState.scrollOffset, pdpMainState.currentFocusModule, pdpMainState.loadingStatus, 3, Long.valueOf(awS39S0100100_1.j1), pdpMainState.cartTip, pdpMainState.cartEntry, pdpMainState.bodyContent, pdpMainState.shareInfo, pdpMainState.blockInfo, pdpMainState.showFavoriteGuide, pdpMainState.shopInfo, pdpMainState.bottomAreaElem, pdpMainState.protectionProgramText, pdpMainState.bizEnvChange, pdpMainState.userRight, pdpMainState.exceptionUX, pdpMainState.lynxPopupState, pdpMainState.bottomFloatingState, pdpMainState.openSkuOnInit, pdpMainState.addCartData);
    }

    public static final Object invoke$6(AwS39S0100100_1 awS39S0100100_1, Object obj) {
        int size;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("quit_type", "return");
        laneParams.plusAssign("is_edit_logistics", CardStruct.IStatusCode.DEFAULT);
        laneParams.plusAssign("stay_time", Long.valueOf(awS39S0100100_1.j1 - C03HZ.LIZIZ));
        List<C821603Iw> list = ((C821703Ix) awS39S0100100_1.l0).LIZJ;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        laneParams.plusAssign("group_cnt", Integer.valueOf(size));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS39S0100100_1 awS39S0100100_1, Object obj) {
        int size;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("quit_type", "return");
        laneParams.plusAssign("is_edit_logistics", CardStruct.IStatusCode.DEFAULT);
        laneParams.plusAssign("stay_time", Long.valueOf(awS39S0100100_1.j1 - C03HZ.LIZIZ));
        List<C821603Iw> list = ((C821703Ix) awS39S0100100_1.l0).LIZJ;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        laneParams.plusAssign("group_cnt", Integer.valueOf(size));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS39S0100100_1 awS39S0100100_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054104Ah) awS39S0100100_1.l0).LIZIZ);
        laneParams.plusAssign("duration", Long.valueOf(awS39S0100100_1.j1));
        laneParams.plusAssign("action_sheet_for", "sku");
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS39S0100100_1 awS39S0100100_1, Object obj) {
        int i;
        LaneParams laneParams = (LaneParams) obj;
        long j = awS39S0100100_1.j1;
        PdpRecommendPreloadResponse pdpRecommendPreloadResponse = (PdpRecommendPreloadResponse) awS39S0100100_1.l0;
        laneParams.plusAssign("duration", Long.valueOf(SystemClock.elapsedRealtime() - j));
        Integer num = pdpRecommendPreloadResponse.code;
        if (num != null && num.intValue() == 0 && C123100dR.LIZ(pdpRecommendPreloadResponse.data)) {
            i = 1;
        } else {
            i = 0;
        }
        laneParams.plusAssign("is_success", Integer.valueOf(i));
        laneParams.plusAssign("err_msg", pdpRecommendPreloadResponse.message);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS39S0100100_1(long j, C821703Ix c821703Ix, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = c821703Ix;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS39S0100100_1(long j, ZipCodePickerDialogFragment zipCodePickerDialogFragment, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = zipCodePickerDialogFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS39S0100100_1(long j, AggregateLogisticPanelFragment aggregateLogisticPanelFragment, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = aggregateLogisticPanelFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS39S0100100_1(long j, PdpRecommendPreloadResponse pdpRecommendPreloadResponse, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = pdpRecommendPreloadResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS39S0100100_1(C1054004Ag c1054004Ag, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1054004Ag;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS39S0100100_1(C1054104Ah c1054104Ah, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1054104Ah;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0000: IPUT (r6 I:int), (r2 I:kotlin.jvm.internal.AwS39S0100100_1) (LINE:50724864) kotlin.jvm.internal.AwS39S0100100_1.$t int, block:B:2:0x0000 */
    public AwS39S0100100_1(List list, List<? extends Object> list2, long j) {
        int i;
        super(1);
        this.$t = i;
        this.l0 = list;
        this.j1 = list2;
    }
}
