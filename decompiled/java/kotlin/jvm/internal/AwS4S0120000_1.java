package kotlin.jvm.internal;

import X.C09AY;
import X.C1054004Ag;
import X.C1054104Ah;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpBottomNavBarWidgetNew;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class AwS4S0120000_1 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;
    public boolean z2;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS4S0120000_1 awS4S0120000_1, Object obj) throws JSONException {
        List<Object> contentList;
        PdpMainState pdpMainState = (PdpMainState) obj;
        boolean z = awS4S0120000_1.z1;
        if (!awS4S0120000_1.z2 && pdpMainState.isFullScreen() != awS4S0120000_1.z1) {
            PdpViewModel pdpViewModel = (PdpViewModel) awS4S0120000_1.l0;
            contentList = pdpViewModel.xR2(pdpViewModel.LLJILLL, false, false, false, false, false);
        } else {
            contentList = pdpMainState.getContentList();
        }
        return pdpMainState.copy(z, pdpMainState.bottomBarVO, pdpMainState.dismiss, pdpMainState.sheetState, contentList, pdpMainState.bottomSheetSlideOffset, pdpMainState.creatorSheetVO, pdpMainState.scrollOrientation, pdpMainState.creatorSheetSlideOffset, pdpMainState.scrollOffset, pdpMainState.currentFocusModule, pdpMainState.loadingStatus, pdpMainState.flashSaleState, pdpMainState.flashSaleCountDown, pdpMainState.cartTip, pdpMainState.cartEntry, pdpMainState.bodyContent, pdpMainState.shareInfo, pdpMainState.blockInfo, pdpMainState.showFavoriteGuide, pdpMainState.shopInfo, pdpMainState.bottomAreaElem, pdpMainState.protectionProgramText, pdpMainState.bizEnvChange, pdpMainState.userRight, pdpMainState.exceptionUX, pdpMainState.lynxPopupState, pdpMainState.bottomFloatingState, pdpMainState.openSkuOnInit, pdpMainState.addCartData);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS4S0120000_1 r9, java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS4S0120000_1.invoke$1(kotlin.jvm.internal.AwS4S0120000_1, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS4S0120000_1 r5, java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS4S0120000_1.invoke$2(kotlin.jvm.internal.AwS4S0120000_1, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AwS4S0120000_1 awS4S0120000_1, Object obj) {
        String str;
        String str2;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS4S0120000_1.l0).LIZIZ);
        if (awS4S0120000_1.z1) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        laneParams.plusAssign("is_ddl", str);
        laneParams.plusAssign("is_inapp", "1");
        if (awS4S0120000_1.z2) {
            str2 = "full";
        } else {
            str2 = "half";
        }
        laneParams.plusAssign("landpage_form", str2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S0120000_1(C1054004Ag c1054004Ag, boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1054004Ag;
        this.z1 = z;
        this.z2 = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S0120000_1(C1054104Ah c1054104Ah, boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1054104Ah;
        this.z1 = z;
        this.z2 = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S0120000_1(PdpViewModel pdpViewModel, boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.z2 = z2;
        this.l0 = pdpViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S0120000_1(boolean z, SeaPdpBottomNavBarWidgetNew seaPdpBottomNavBarWidgetNew, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = seaPdpBottomNavBarWidgetNew;
        this.z2 = z2;
    }
}
