package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm;

import X.C004I;
import X.C047M;
import X.C04C1;
import X.C04D1;
import X.C04E6;
import X.C04I9;
import X.C1063304Dv;
import X.C13BV;
import X.C1556570qbn;
import X.C1756520voI;
import X.C1759460vt2;
import X.C786410Ut5;
import X.EnumC1752690vi7;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BlockPageInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceBubble;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SeaPdpMediaWindow;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShareInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Tab;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPdpMainState implements C004I {
    public static final int $stable = 8;
    public final Object bizEnvChange;
    public final BlockPageInfo blockInfo;
    public final int bodyContent;
    public final C04C1 bottomBarData;
    public final C1063304Dv bottomBarVO;
    public final C1756520voI bottomFloatingState;
    public final C04E6 bottomMynaBannerState;
    public final float bottomSheetSlideOffset;
    public final CartEntry cartEntry;
    public final C047M cartTip;
    public final List<Object> contentList;
    public final float creatorSheetSlideOffset;
    public final C04D1 creatorSheetVO;
    public final boolean dismiss;
    public final ExceptionUX exceptionUX;
    public final Long flashSaleCountDown;
    public final Integer flashSaleState;
    public final boolean isFullScreen;
    public final int loadingStatus;
    public final Set<String> lynxAirItemName;
    public final C1759460vt2 lynxPopupState;
    public final SeaPdpMediaWindow mediaWindow;
    public final int scrollOffset;
    public final int scrollOrientation;
    public final EntranceBubble seaEntranceBubble;
    public final C04I9 seaFocusTabAction;
    public final C1556570qbn seaFocusTabActionNew;
    public final Integer selectedTabName;
    public final ShareInfo shareInfo;
    public final int sheetState;
    public final Boolean showFloatShop;
    public final boolean showLoadingDialog;
    public final Object slideToPaymentModule;
    public final List<Tab> tabs;

    public SeaPdpMainState() {
        this(false, null, null, null, false, 0, null, 0.0f, null, 0, 0.0f, 0, null, null, null, 0, null, null, null, null, 0, null, false, null, null, null, null, null, null, null, null, null, null, null, -1, 3, null);
    }

    public final SeaPdpMainState copy(boolean z, C1063304Dv c1063304Dv, C04C1 c04c1, List<Tab> list, boolean z2, int i, List<? extends Object> list2, float f, C04D1 c04d1, int i2, float f2, int i3, C04I9 c04i9, C1556570qbn c1556570qbn, Integer num, int i4, Integer num2, Long l, C047M c047m, CartEntry cartEntry, int i5, ShareInfo shareInfo, boolean z3, BlockPageInfo blockPageInfo, Boolean bool, Object obj, Object obj2, Set<String> set, ExceptionUX exceptionUX, C1759460vt2 c1759460vt2, C1756520voI c1756520voI, EntranceBubble entranceBubble, C04E6 c04e6, SeaPdpMediaWindow seaPdpMediaWindow) {
        return new SeaPdpMainState(z, c1063304Dv, c04c1, list, z2, i, list2, f, c04d1, i2, f2, i3, c04i9, c1556570qbn, num, i4, num2, l, c047m, cartEntry, i5, shareInfo, z3, blockPageInfo, bool, obj, obj2, set, exceptionUX, c1759460vt2, c1756520voI, entranceBubble, c04e6, seaPdpMediaWindow);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaPdpMainState)) {
            return false;
        }
        SeaPdpMainState seaPdpMainState = (SeaPdpMainState) obj;
        return this.isFullScreen == seaPdpMainState.isFullScreen && Intrinsics.LJFF(this.bottomBarVO, seaPdpMainState.bottomBarVO) && Intrinsics.LJFF(this.bottomBarData, seaPdpMainState.bottomBarData) && Intrinsics.LJFF(this.tabs, seaPdpMainState.tabs) && this.dismiss == seaPdpMainState.dismiss && this.sheetState == seaPdpMainState.sheetState && Intrinsics.LJFF(this.contentList, seaPdpMainState.contentList) && Float.compare(this.bottomSheetSlideOffset, seaPdpMainState.bottomSheetSlideOffset) == 0 && Intrinsics.LJFF(this.creatorSheetVO, seaPdpMainState.creatorSheetVO) && this.scrollOrientation == seaPdpMainState.scrollOrientation && Float.compare(this.creatorSheetSlideOffset, seaPdpMainState.creatorSheetSlideOffset) == 0 && this.scrollOffset == seaPdpMainState.scrollOffset && Intrinsics.LJFF(this.seaFocusTabAction, seaPdpMainState.seaFocusTabAction) && Intrinsics.LJFF(this.seaFocusTabActionNew, seaPdpMainState.seaFocusTabActionNew) && Intrinsics.LJFF(this.selectedTabName, seaPdpMainState.selectedTabName) && this.loadingStatus == seaPdpMainState.loadingStatus && Intrinsics.LJFF(this.flashSaleState, seaPdpMainState.flashSaleState) && Intrinsics.LJFF(this.flashSaleCountDown, seaPdpMainState.flashSaleCountDown) && Intrinsics.LJFF(this.cartTip, seaPdpMainState.cartTip) && Intrinsics.LJFF(this.cartEntry, seaPdpMainState.cartEntry) && this.bodyContent == seaPdpMainState.bodyContent && Intrinsics.LJFF(this.shareInfo, seaPdpMainState.shareInfo) && this.showLoadingDialog == seaPdpMainState.showLoadingDialog && Intrinsics.LJFF(this.blockInfo, seaPdpMainState.blockInfo) && Intrinsics.LJFF(this.showFloatShop, seaPdpMainState.showFloatShop) && Intrinsics.LJFF(this.bizEnvChange, seaPdpMainState.bizEnvChange) && Intrinsics.LJFF(this.slideToPaymentModule, seaPdpMainState.slideToPaymentModule) && Intrinsics.LJFF(this.lynxAirItemName, seaPdpMainState.lynxAirItemName) && Intrinsics.LJFF(this.exceptionUX, seaPdpMainState.exceptionUX) && Intrinsics.LJFF(this.lynxPopupState, seaPdpMainState.lynxPopupState) && Intrinsics.LJFF(this.bottomFloatingState, seaPdpMainState.bottomFloatingState) && Intrinsics.LJFF(this.seaEntranceBubble, seaPdpMainState.seaEntranceBubble) && Intrinsics.LJFF(this.bottomMynaBannerState, seaPdpMainState.bottomMynaBannerState) && Intrinsics.LJFF(this.mediaWindow, seaPdpMainState.mediaWindow);
    }

    public String toString() {
        return "SeaPdpMainState(isFullScreen=" + this.isFullScreen + ", bottomBarVO=" + this.bottomBarVO + ", bottomBarData=" + this.bottomBarData + ", tabs=" + this.tabs + ", dismiss=" + this.dismiss + ", sheetState=" + this.sheetState + ", contentList=" + this.contentList + ", bottomSheetSlideOffset=" + this.bottomSheetSlideOffset + ", creatorSheetVO=" + this.creatorSheetVO + ", scrollOrientation=" + this.scrollOrientation + ", creatorSheetSlideOffset=" + this.creatorSheetSlideOffset + ", scrollOffset=" + this.scrollOffset + ", seaFocusTabAction=" + this.seaFocusTabAction + ", seaFocusTabActionNew=" + this.seaFocusTabActionNew + ", selectedTabName=" + this.selectedTabName + ", loadingStatus=" + this.loadingStatus + ", flashSaleState=" + this.flashSaleState + ", flashSaleCountDown=" + this.flashSaleCountDown + ", cartTip=" + this.cartTip + ", cartEntry=" + this.cartEntry + ", bodyContent=" + this.bodyContent + ", shareInfo=" + this.shareInfo + ", showLoadingDialog=" + this.showLoadingDialog + ", blockInfo=" + this.blockInfo + ", showFloatShop=" + this.showFloatShop + ", bizEnvChange=" + this.bizEnvChange + ", slideToPaymentModule=" + this.slideToPaymentModule + ", lynxAirItemName=" + this.lynxAirItemName + ", exceptionUX=" + this.exceptionUX + ", lynxPopupState=" + this.lynxPopupState + ", bottomFloatingState=" + this.bottomFloatingState + ", seaEntranceBubble=" + this.seaEntranceBubble + ", bottomMynaBannerState=" + this.bottomMynaBannerState + ", mediaWindow=" + this.mediaWindow + ')';
    }

    public int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.isFullScreen) * 31;
        C1063304Dv c1063304Dv = this.bottomBarVO;
        int iHashCode = (iZ2 + (c1063304Dv == null ? 0 : c1063304Dv.hashCode())) * 31;
        C04C1 c04c1 = this.bottomBarData;
        int iHashCode2 = (iHashCode + (c04c1 == null ? 0 : c04c1.hashCode())) * 31;
        List<Tab> list = this.tabs;
        int iHashCode3 = (((((((((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Z2(this.dismiss)) * 31) + this.sheetState) * 31) + this.contentList.hashCode()) * 31) + Float.floatToIntBits(this.bottomSheetSlideOffset)) * 31;
        C04D1 c04d1 = this.creatorSheetVO;
        int iHashCode4 = (((((((iHashCode3 + (c04d1 == null ? 0 : c04d1.hashCode())) * 31) + this.scrollOrientation) * 31) + Float.floatToIntBits(this.creatorSheetSlideOffset)) * 31) + this.scrollOffset) * 31;
        C04I9 c04i9 = this.seaFocusTabAction;
        int iHashCode5 = (iHashCode4 + (c04i9 == null ? 0 : c04i9.hashCode())) * 31;
        C1556570qbn c1556570qbn = this.seaFocusTabActionNew;
        int iHashCode6 = (iHashCode5 + (c1556570qbn == null ? 0 : c1556570qbn.hashCode())) * 31;
        Integer num = this.selectedTabName;
        int iHashCode7 = (((iHashCode6 + (num == null ? 0 : num.hashCode())) * 31) + this.loadingStatus) * 31;
        Integer num2 = this.flashSaleState;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.flashSaleCountDown;
        int iHashCode9 = (iHashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        C047M c047m = this.cartTip;
        int iHashCode10 = (iHashCode9 + (c047m == null ? 0 : c047m.hashCode())) * 31;
        CartEntry cartEntry = this.cartEntry;
        int iHashCode11 = (((iHashCode10 + (cartEntry == null ? 0 : cartEntry.hashCode())) * 31) + this.bodyContent) * 31;
        ShareInfo shareInfo = this.shareInfo;
        int iHashCode12 = (((iHashCode11 + (shareInfo == null ? 0 : shareInfo.hashCode())) * 31) + C786410Ut5.Z2(this.showLoadingDialog)) * 31;
        BlockPageInfo blockPageInfo = this.blockInfo;
        int iHashCode13 = (iHashCode12 + (blockPageInfo == null ? 0 : blockPageInfo.hashCode())) * 31;
        Boolean bool = this.showFloatShop;
        int iHashCode14 = (iHashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        Object obj = this.bizEnvChange;
        int iHashCode15 = (iHashCode14 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.slideToPaymentModule;
        int iHashCode16 = (iHashCode15 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Set<String> set = this.lynxAirItemName;
        int iHashCode17 = (iHashCode16 + (set == null ? 0 : set.hashCode())) * 31;
        ExceptionUX exceptionUX = this.exceptionUX;
        int iHashCode18 = (iHashCode17 + (exceptionUX == null ? 0 : exceptionUX.hashCode())) * 31;
        C1759460vt2 c1759460vt2 = this.lynxPopupState;
        int iHashCode19 = (((iHashCode18 + (c1759460vt2 == null ? 0 : c1759460vt2.hashCode())) * 31) + this.bottomFloatingState.hashCode()) * 31;
        EntranceBubble entranceBubble = this.seaEntranceBubble;
        int iHashCode20 = (iHashCode19 + (entranceBubble == null ? 0 : entranceBubble.hashCode())) * 31;
        C04E6 c04e6 = this.bottomMynaBannerState;
        int iHashCode21 = (iHashCode20 + (c04e6 == null ? 0 : c04e6.hashCode())) * 31;
        SeaPdpMediaWindow seaPdpMediaWindow = this.mediaWindow;
        return iHashCode21 + (seaPdpMediaWindow != null ? seaPdpMediaWindow.hashCode() : 0);
    }

    public final Object getBizEnvChange() {
        return this.bizEnvChange;
    }

    public final BlockPageInfo getBlockInfo() {
        return this.blockInfo;
    }

    public final int getBodyContent() {
        return this.bodyContent;
    }

    public final C04C1 getBottomBarData() {
        return this.bottomBarData;
    }

    public final C1063304Dv getBottomBarVO() {
        return this.bottomBarVO;
    }

    public final C1756520voI getBottomFloatingState() {
        return this.bottomFloatingState;
    }

    public final C04E6 getBottomMynaBannerState() {
        return this.bottomMynaBannerState;
    }

    public final float getBottomSheetSlideOffset() {
        return this.bottomSheetSlideOffset;
    }

    public final CartEntry getCartEntry() {
        return this.cartEntry;
    }

    public final C047M getCartTip() {
        return this.cartTip;
    }

    public final List<Object> getContentList() {
        return this.contentList;
    }

    public final float getCreatorSheetSlideOffset() {
        return this.creatorSheetSlideOffset;
    }

    public final C04D1 getCreatorSheetVO() {
        return this.creatorSheetVO;
    }

    public final boolean getDismiss() {
        return this.dismiss;
    }

    public final ExceptionUX getExceptionUX() {
        return this.exceptionUX;
    }

    public final Long getFlashSaleCountDown() {
        return this.flashSaleCountDown;
    }

    public final Integer getFlashSaleState() {
        return this.flashSaleState;
    }

    public final int getLoadingStatus() {
        return this.loadingStatus;
    }

    public final Set<String> getLynxAirItemName() {
        return this.lynxAirItemName;
    }

    public final C1759460vt2 getLynxPopupState() {
        return this.lynxPopupState;
    }

    public final SeaPdpMediaWindow getMediaWindow() {
        return this.mediaWindow;
    }

    public final int getScrollOffset() {
        return this.scrollOffset;
    }

    public final int getScrollOrientation() {
        return this.scrollOrientation;
    }

    public final EntranceBubble getSeaEntranceBubble() {
        return this.seaEntranceBubble;
    }

    public final C04I9 getSeaFocusTabAction() {
        return this.seaFocusTabAction;
    }

    public final C1556570qbn getSeaFocusTabActionNew() {
        return this.seaFocusTabActionNew;
    }

    public final Integer getSelectedTabName() {
        return this.selectedTabName;
    }

    public final ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public final int getSheetState() {
        return this.sheetState;
    }

    public final Boolean getShowFloatShop() {
        return this.showFloatShop;
    }

    public final boolean getShowLoadingDialog() {
        return this.showLoadingDialog;
    }

    public final Object getSlideToPaymentModule() {
        return this.slideToPaymentModule;
    }

    public final List<Tab> getTabs() {
        return this.tabs;
    }

    public final boolean isFullScreen() {
        return this.isFullScreen;
    }

    public SeaPdpMainState(boolean z, C1063304Dv c1063304Dv, C04C1 c04c1, List<Tab> list, boolean z2, int i, List<? extends Object> list2, float f, C04D1 c04d1, int i2, float f2, int i3, C04I9 c04i9, C1556570qbn c1556570qbn, Integer num, int i4, Integer num2, Long l, C047M c047m, CartEntry cartEntry, int i5, ShareInfo shareInfo, boolean z3, BlockPageInfo blockPageInfo, Boolean bool, Object obj, Object obj2, Set<String> set, ExceptionUX exceptionUX, C1759460vt2 c1759460vt2, C1756520voI c1756520voI, EntranceBubble entranceBubble, C04E6 c04e6, SeaPdpMediaWindow seaPdpMediaWindow) {
        this.isFullScreen = z;
        this.bottomBarVO = c1063304Dv;
        this.bottomBarData = c04c1;
        this.tabs = list;
        this.dismiss = z2;
        this.sheetState = i;
        this.contentList = list2;
        this.bottomSheetSlideOffset = f;
        this.creatorSheetVO = c04d1;
        this.scrollOrientation = i2;
        this.creatorSheetSlideOffset = f2;
        this.scrollOffset = i3;
        this.seaFocusTabAction = c04i9;
        this.seaFocusTabActionNew = c1556570qbn;
        this.selectedTabName = num;
        this.loadingStatus = i4;
        this.flashSaleState = num2;
        this.flashSaleCountDown = l;
        this.cartTip = c047m;
        this.cartEntry = cartEntry;
        this.bodyContent = i5;
        this.shareInfo = shareInfo;
        this.showLoadingDialog = z3;
        this.blockInfo = blockPageInfo;
        this.showFloatShop = bool;
        this.bizEnvChange = obj;
        this.slideToPaymentModule = obj2;
        this.lynxAirItemName = set;
        this.exceptionUX = exceptionUX;
        this.lynxPopupState = c1759460vt2;
        this.bottomFloatingState = c1756520voI;
        this.seaEntranceBubble = entranceBubble;
        this.bottomMynaBannerState = c04e6;
        this.mediaWindow = seaPdpMediaWindow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SeaPdpMainState(boolean z, C1063304Dv c1063304Dv, C04C1 c04c1, List list, boolean z2, int i, List list2, float f, C04D1 c04d1, int i2, float f2, int i3, C04I9 c04i9, C1556570qbn c1556570qbn, Integer num, int i4, Integer num2, Long l, C047M c047m, CartEntry cartEntry, int i5, ShareInfo shareInfo, boolean z3, BlockPageInfo blockPageInfo, Boolean bool, Object obj, Object obj2, Set set, ExceptionUX exceptionUX, C1759460vt2 c1759460vt2, C1756520voI c1756520voI, EntranceBubble entranceBubble, C04E6 c04e6, SeaPdpMediaWindow seaPdpMediaWindow, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z4;
        SeaPdpMediaWindow seaPdpMediaWindow2;
        C04E6 c04e62 = c04e6;
        EntranceBubble entranceBubble2 = entranceBubble;
        C1756520voI c1756520voI2 = c1756520voI;
        C1759460vt2 c1759460vt22 = c1759460vt2;
        ExceptionUX exceptionUX2 = exceptionUX;
        Set set2 = set;
        Object obj3 = obj2;
        ShareInfo shareInfo2 = shareInfo;
        int i8 = i5;
        CartEntry cartEntry2 = cartEntry;
        C047M c047m2 = c047m;
        C04I9 c04i92 = c04i9;
        Integer num3 = num2;
        int i9 = i4;
        C1556570qbn c1556570qbn2 = c1556570qbn;
        Long l2 = l;
        int i10 = i2;
        C04D1 c04d12 = c04d1;
        float f3 = f;
        List list3 = list2;
        int i11 = i;
        boolean z5 = z2;
        Object obj4 = obj;
        Integer num4 = num;
        List list4 = list;
        C04C1 c04c12 = c04c1;
        Boolean bool2 = bool;
        C1063304Dv c1063304Dv2 = c1063304Dv;
        int i12 = i3;
        BlockPageInfo blockPageInfo2 = blockPageInfo;
        boolean z6 = (i6 & 1) != 0 ? false : z;
        c1063304Dv2 = (i6 & 2) != 0 ? null : c1063304Dv2;
        c04c12 = (i6 & 4) != 0 ? null : c04c12;
        list4 = (i6 & 8) != 0 ? null : list4;
        z5 = (i6 & 16) != 0 ? false : z5;
        i11 = (i6 & 32) != 0 ? 4 : i11;
        list3 = (i6 & 64) != 0 ? C13BV.INSTANCE : list3;
        f3 = (i6 & 128) != 0 ? 0.0f : f3;
        c04d12 = (i6 & 256) != 0 ? null : c04d12;
        i10 = (i6 & 512) != 0 ? 1 : i10;
        float f4 = (i6 & 1024) == 0 ? f2 : 0.0f;
        i12 = (i6 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0 : i12;
        c04i92 = (i6 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? new C04I9(EnumC1752690vi7.HEADER.getValue(), false) : c04i92;
        if ((i6 & 8192) != 0) {
            z4 = false;
            c1556570qbn2 = new C1556570qbn(-1, false);
        } else {
            z4 = false;
        }
        num4 = (i6 & 16384) != 0 ? null : num4;
        i9 = (32768 & i6) != 0 ? 0 : i9;
        num3 = (65536 & i6) != 0 ? null : num3;
        l2 = (131072 & i6) != 0 ? null : l2;
        c047m2 = (262144 & i6) != 0 ? null : c047m2;
        cartEntry2 = (524288 & i6) != 0 ? null : cartEntry2;
        i8 = (1048576 & i6) != 0 ? -1 : i8;
        shareInfo2 = (2097152 & i6) != 0 ? null : shareInfo2;
        z4 = (4194304 & i6) == 0 ? z3 : z4;
        blockPageInfo2 = (8388608 & i6) != 0 ? null : blockPageInfo2;
        bool2 = (16777216 & i6) != 0 ? null : bool2;
        obj4 = (33554432 & i6) != 0 ? null : obj4;
        obj3 = (67108864 & i6) != 0 ? null : obj3;
        set2 = (134217728 & i6) != 0 ? null : set2;
        exceptionUX2 = (268435456 & i6) != 0 ? null : exceptionUX2;
        c1759460vt22 = (536870912 & i6) != 0 ? null : c1759460vt22;
        if ((1073741824 & i6) != 0) {
            seaPdpMediaWindow2 = null;
            c1756520voI2 = new C1756520voI(null, null, null);
        } else {
            seaPdpMediaWindow2 = null;
        }
        this(z6, c1063304Dv2, c04c12, list4, z5, i11, list3, f3, c04d12, i10, f4, i12, c04i92, c1556570qbn2, num4, i9, num3, l2, c047m2, cartEntry2, i8, shareInfo2, z4, blockPageInfo2, bool2, obj4, obj3, set2, exceptionUX2, c1759460vt22, c1756520voI2, (i6 & Integer.MIN_VALUE) != 0 ? seaPdpMediaWindow2 : entranceBubble2, (i7 & 1) != 0 ? seaPdpMediaWindow2 : c04e62, (i7 & 2) == 0 ? seaPdpMediaWindow : seaPdpMediaWindow2);
    }
}
