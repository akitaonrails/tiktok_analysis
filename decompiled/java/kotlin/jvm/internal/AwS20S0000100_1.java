package kotlin.jvm.internal;

import X.C09AY;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS20S0000100_1 extends C09AY implements Function1 {
    public final int $t;
    public long j0;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS20S0000100_1(long j, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
    }

    public static final Object invoke$0(AwS20S0000100_1 awS20S0000100_1, Object obj) {
        SeaPdpMainState seaPdpMainState = (SeaPdpMainState) obj;
        return seaPdpMainState.copy(seaPdpMainState.isFullScreen, seaPdpMainState.bottomBarVO, seaPdpMainState.bottomBarData, seaPdpMainState.tabs, seaPdpMainState.dismiss, seaPdpMainState.sheetState, seaPdpMainState.contentList, seaPdpMainState.bottomSheetSlideOffset, seaPdpMainState.creatorSheetVO, seaPdpMainState.scrollOrientation, seaPdpMainState.creatorSheetSlideOffset, seaPdpMainState.scrollOffset, seaPdpMainState.seaFocusTabAction, seaPdpMainState.seaFocusTabActionNew, seaPdpMainState.selectedTabName, seaPdpMainState.loadingStatus, seaPdpMainState.flashSaleState, Long.valueOf(awS20S0000100_1.j0), seaPdpMainState.cartTip, seaPdpMainState.cartEntry, seaPdpMainState.bodyContent, seaPdpMainState.shareInfo, seaPdpMainState.showLoadingDialog, seaPdpMainState.blockInfo, seaPdpMainState.showFloatShop, seaPdpMainState.bizEnvChange, seaPdpMainState.slideToPaymentModule, seaPdpMainState.lynxAirItemName, seaPdpMainState.exceptionUX, seaPdpMainState.lynxPopupState, seaPdpMainState.bottomFloatingState, seaPdpMainState.seaEntranceBubble, seaPdpMainState.bottomMynaBannerState, seaPdpMainState.mediaWindow);
    }

    public static final Object invoke$1(AwS20S0000100_1 awS20S0000100_1, Object obj) {
        PdpMainState pdpMainState = (PdpMainState) obj;
        return pdpMainState.copy(pdpMainState.isFullScreen, pdpMainState.bottomBarVO, pdpMainState.dismiss, pdpMainState.sheetState, pdpMainState.contentList, pdpMainState.bottomSheetSlideOffset, pdpMainState.creatorSheetVO, pdpMainState.scrollOrientation, pdpMainState.creatorSheetSlideOffset, pdpMainState.scrollOffset, pdpMainState.currentFocusModule, pdpMainState.loadingStatus, pdpMainState.flashSaleState, Long.valueOf(awS20S0000100_1.j0), pdpMainState.cartTip, pdpMainState.cartEntry, pdpMainState.bodyContent, pdpMainState.shareInfo, pdpMainState.blockInfo, pdpMainState.showFavoriteGuide, pdpMainState.shopInfo, pdpMainState.bottomAreaElem, pdpMainState.protectionProgramText, pdpMainState.bizEnvChange, pdpMainState.userRight, pdpMainState.exceptionUX, pdpMainState.lynxPopupState, pdpMainState.bottomFloatingState, pdpMainState.openSkuOnInit, pdpMainState.addCartData);
    }

    public static final Object invoke$2(AwS20S0000100_1 awS20S0000100_1, Object obj) {
        ((LaneParams) obj).plusAssign("duration", Long.valueOf(System.currentTimeMillis() - awS20S0000100_1.j0));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS20S0000100_1 awS20S0000100_1, Object obj) {
        ((LaneParams) obj).plusAssign("duration", Long.valueOf(System.currentTimeMillis() - awS20S0000100_1.j0));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS20S0000100_1 awS20S0000100_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("actionsheet_name", "item_sold_info");
        laneParams.plusAssign("stay_time", Long.valueOf(awS20S0000100_1.j0));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS20S0000100_1 awS20S0000100_1, Object obj) {
        ((LaneParams) obj).plusAssign("duration", Long.valueOf(System.currentTimeMillis() - awS20S0000100_1.j0));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS20S0000100_1 awS20S0000100_1, Object obj) {
        ((LaneParams) obj).plusAssign("duration", Long.valueOf(System.currentTimeMillis() - awS20S0000100_1.j0));
        return Unit.LIZ;
    }
}
