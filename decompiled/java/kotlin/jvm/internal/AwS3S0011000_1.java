package kotlin.jvm.internal;

import X.C04I9;
import X.C09AY;
import X.C1556570qbn;
import X.C936903lP;
import X.C937203lS;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpMainState;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS3S0011000_1 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public boolean z0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS3S0011000_1 awS3S0011000_1, Object obj) {
        SeaPdpMainState seaPdpMainState = (SeaPdpMainState) obj;
        C04I9 seaFocusTabAction = seaPdpMainState.getSeaFocusTabAction();
        if (seaFocusTabAction != null && seaFocusTabAction.LIZ == awS3S0011000_1.i1) {
            return seaPdpMainState;
        }
        return seaPdpMainState.copy(seaPdpMainState.isFullScreen, seaPdpMainState.bottomBarVO, seaPdpMainState.bottomBarData, seaPdpMainState.tabs, seaPdpMainState.dismiss, seaPdpMainState.sheetState, seaPdpMainState.contentList, seaPdpMainState.bottomSheetSlideOffset, seaPdpMainState.creatorSheetVO, seaPdpMainState.scrollOrientation, seaPdpMainState.creatorSheetSlideOffset, seaPdpMainState.scrollOffset, new C04I9(awS3S0011000_1.i1, awS3S0011000_1.z0), seaPdpMainState.seaFocusTabActionNew, seaPdpMainState.selectedTabName, seaPdpMainState.loadingStatus, seaPdpMainState.flashSaleState, seaPdpMainState.flashSaleCountDown, seaPdpMainState.cartTip, seaPdpMainState.cartEntry, seaPdpMainState.bodyContent, seaPdpMainState.shareInfo, seaPdpMainState.showLoadingDialog, seaPdpMainState.blockInfo, seaPdpMainState.showFloatShop, seaPdpMainState.bizEnvChange, seaPdpMainState.slideToPaymentModule, seaPdpMainState.lynxAirItemName, seaPdpMainState.exceptionUX, seaPdpMainState.lynxPopupState, seaPdpMainState.bottomFloatingState, seaPdpMainState.seaEntranceBubble, seaPdpMainState.bottomMynaBannerState, seaPdpMainState.mediaWindow);
    }

    public static final Object invoke$1(AwS3S0011000_1 awS3S0011000_1, Object obj) {
        SeaPdpMainState seaPdpMainState = (SeaPdpMainState) obj;
        C1556570qbn seaFocusTabActionNew = seaPdpMainState.getSeaFocusTabActionNew();
        if (seaFocusTabActionNew != null && seaFocusTabActionNew.LIZ == awS3S0011000_1.i1) {
            return seaPdpMainState;
        }
        return seaPdpMainState.copy(seaPdpMainState.isFullScreen, seaPdpMainState.bottomBarVO, seaPdpMainState.bottomBarData, seaPdpMainState.tabs, seaPdpMainState.dismiss, seaPdpMainState.sheetState, seaPdpMainState.contentList, seaPdpMainState.bottomSheetSlideOffset, seaPdpMainState.creatorSheetVO, seaPdpMainState.scrollOrientation, seaPdpMainState.creatorSheetSlideOffset, seaPdpMainState.scrollOffset, seaPdpMainState.seaFocusTabAction, new C1556570qbn(awS3S0011000_1.i1, awS3S0011000_1.z0), seaPdpMainState.selectedTabName, seaPdpMainState.loadingStatus, seaPdpMainState.flashSaleState, seaPdpMainState.flashSaleCountDown, seaPdpMainState.cartTip, seaPdpMainState.cartEntry, seaPdpMainState.bodyContent, seaPdpMainState.shareInfo, seaPdpMainState.showLoadingDialog, seaPdpMainState.blockInfo, seaPdpMainState.showFloatShop, seaPdpMainState.bizEnvChange, seaPdpMainState.slideToPaymentModule, seaPdpMainState.lynxAirItemName, seaPdpMainState.exceptionUX, seaPdpMainState.lynxPopupState, seaPdpMainState.bottomFloatingState, seaPdpMainState.seaEntranceBubble, seaPdpMainState.bottomMynaBannerState, seaPdpMainState.mediaWindow);
    }

    public static final Object invoke$2(AwS3S0011000_1 awS3S0011000_1, Object obj) {
        return C936903lP.LIZ((C936903lP) obj, null, null, null, 0, new C937203lS(awS3S0011000_1.i1, awS3S0011000_1.z0), null, 0, null, null, null, 0, 2031);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S0011000_1(int i, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.z0 = z;
    }
}
