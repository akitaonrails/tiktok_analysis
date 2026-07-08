package com.ss.android.ugc.aweme.ecommerce.base.pdp.vm;

import X.C004I;
import X.C04D0;
import X.C1062004Di;
import X.C1063304Dv;
import X.C13BV;
import X.C1756520voI;
import X.C1759460vt2;
import X.C786410Ut5;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BlockPageInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomAreaElem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShareInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.model.AddToCartData;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpMainState implements C004I {
    public static final int $stable = 8;
    public final AddToCartData addCartData;
    public final Object bizEnvChange;
    public final BlockPageInfo blockInfo;
    public final int bodyContent;
    public final PdpBottomAreaElem bottomAreaElem;
    public final C1063304Dv bottomBarVO;
    public final C1756520voI bottomFloatingState;
    public final float bottomSheetSlideOffset;
    public final CartEntry cartEntry;
    public final C1062004Di cartTip;
    public final List<Object> contentList;
    public final float creatorSheetSlideOffset;
    public final C04D0 creatorSheetVO;
    public final List<String> currentFocusModule;
    public final boolean dismiss;
    public final ExceptionUX exceptionUX;
    public final Long flashSaleCountDown;
    public final Integer flashSaleState;
    public final boolean isFullScreen;
    public final int loadingStatus;
    public final C1759460vt2 lynxPopupState;
    public final Boolean openSkuOnInit;
    public final LinkRichText protectionProgramText;
    public final int scrollOffset;
    public final int scrollOrientation;
    public final ShareInfo shareInfo;
    public final int sheetState;
    public final SellerInfo shopInfo;
    public final Boolean showFavoriteGuide;
    public final UserRight userRight;

    public PdpMainState() {
        this(false, null, false, 0, null, 0.0f, null, 0, 0.0f, 0, null, 0, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741823, null);
    }

    public final PdpMainState copy(boolean z, C1063304Dv c1063304Dv, boolean z2, int i, List<? extends Object> list, float f, C04D0 c04d0, int i2, float f2, int i3, List<String> list2, int i4, Integer num, Long l, C1062004Di c1062004Di, CartEntry cartEntry, int i5, ShareInfo shareInfo, BlockPageInfo blockPageInfo, Boolean bool, SellerInfo sellerInfo, PdpBottomAreaElem pdpBottomAreaElem, LinkRichText linkRichText, Object obj, UserRight userRight, ExceptionUX exceptionUX, C1759460vt2 c1759460vt2, C1756520voI c1756520voI, Boolean bool2, AddToCartData addToCartData) {
        return new PdpMainState(z, c1063304Dv, z2, i, list, f, c04d0, i2, f2, i3, list2, i4, num, l, c1062004Di, cartEntry, i5, shareInfo, blockPageInfo, bool, sellerInfo, pdpBottomAreaElem, linkRichText, obj, userRight, exceptionUX, c1759460vt2, c1756520voI, bool2, addToCartData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdpMainState)) {
            return false;
        }
        PdpMainState pdpMainState = (PdpMainState) obj;
        return this.isFullScreen == pdpMainState.isFullScreen && Intrinsics.LJFF(this.bottomBarVO, pdpMainState.bottomBarVO) && this.dismiss == pdpMainState.dismiss && this.sheetState == pdpMainState.sheetState && Intrinsics.LJFF(this.contentList, pdpMainState.contentList) && Float.compare(this.bottomSheetSlideOffset, pdpMainState.bottomSheetSlideOffset) == 0 && Intrinsics.LJFF(this.creatorSheetVO, pdpMainState.creatorSheetVO) && this.scrollOrientation == pdpMainState.scrollOrientation && Float.compare(this.creatorSheetSlideOffset, pdpMainState.creatorSheetSlideOffset) == 0 && this.scrollOffset == pdpMainState.scrollOffset && Intrinsics.LJFF(this.currentFocusModule, pdpMainState.currentFocusModule) && this.loadingStatus == pdpMainState.loadingStatus && Intrinsics.LJFF(this.flashSaleState, pdpMainState.flashSaleState) && Intrinsics.LJFF(this.flashSaleCountDown, pdpMainState.flashSaleCountDown) && Intrinsics.LJFF(this.cartTip, pdpMainState.cartTip) && Intrinsics.LJFF(this.cartEntry, pdpMainState.cartEntry) && this.bodyContent == pdpMainState.bodyContent && Intrinsics.LJFF(this.shareInfo, pdpMainState.shareInfo) && Intrinsics.LJFF(this.blockInfo, pdpMainState.blockInfo) && Intrinsics.LJFF(this.showFavoriteGuide, pdpMainState.showFavoriteGuide) && Intrinsics.LJFF(this.shopInfo, pdpMainState.shopInfo) && Intrinsics.LJFF(this.bottomAreaElem, pdpMainState.bottomAreaElem) && Intrinsics.LJFF(this.protectionProgramText, pdpMainState.protectionProgramText) && Intrinsics.LJFF(this.bizEnvChange, pdpMainState.bizEnvChange) && Intrinsics.LJFF(this.userRight, pdpMainState.userRight) && Intrinsics.LJFF(this.exceptionUX, pdpMainState.exceptionUX) && Intrinsics.LJFF(this.lynxPopupState, pdpMainState.lynxPopupState) && Intrinsics.LJFF(this.bottomFloatingState, pdpMainState.bottomFloatingState) && Intrinsics.LJFF(this.openSkuOnInit, pdpMainState.openSkuOnInit) && Intrinsics.LJFF(this.addCartData, pdpMainState.addCartData);
    }

    public String toString() {
        return "PdpMainState(isFullScreen=" + this.isFullScreen + ", bottomBarVO=" + this.bottomBarVO + ", dismiss=" + this.dismiss + ", sheetState=" + this.sheetState + ", contentList=" + this.contentList + ", bottomSheetSlideOffset=" + this.bottomSheetSlideOffset + ", creatorSheetVO=" + this.creatorSheetVO + ", scrollOrientation=" + this.scrollOrientation + ", creatorSheetSlideOffset=" + this.creatorSheetSlideOffset + ", scrollOffset=" + this.scrollOffset + ", currentFocusModule=" + this.currentFocusModule + ", loadingStatus=" + this.loadingStatus + ", flashSaleState=" + this.flashSaleState + ", flashSaleCountDown=" + this.flashSaleCountDown + ", cartTip=" + this.cartTip + ", cartEntry=" + this.cartEntry + ", bodyContent=" + this.bodyContent + ", shareInfo=" + this.shareInfo + ", blockInfo=" + this.blockInfo + ", showFavoriteGuide=" + this.showFavoriteGuide + ", shopInfo=" + this.shopInfo + ", bottomAreaElem=" + this.bottomAreaElem + ", protectionProgramText=" + this.protectionProgramText + ", bizEnvChange=" + this.bizEnvChange + ", userRight=" + this.userRight + ", exceptionUX=" + this.exceptionUX + ", lynxPopupState=" + this.lynxPopupState + ", bottomFloatingState=" + this.bottomFloatingState + ", openSkuOnInit=" + this.openSkuOnInit + ", addCartData=" + this.addCartData + ')';
    }

    public int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.isFullScreen) * 31;
        C1063304Dv c1063304Dv = this.bottomBarVO;
        int iHashCode = (((((((((iZ2 + (c1063304Dv == null ? 0 : c1063304Dv.hashCode())) * 31) + C786410Ut5.Z2(this.dismiss)) * 31) + this.sheetState) * 31) + this.contentList.hashCode()) * 31) + Float.floatToIntBits(this.bottomSheetSlideOffset)) * 31;
        C04D0 c04d0 = this.creatorSheetVO;
        int iHashCode2 = (((((((iHashCode + (c04d0 == null ? 0 : c04d0.hashCode())) * 31) + this.scrollOrientation) * 31) + Float.floatToIntBits(this.creatorSheetSlideOffset)) * 31) + this.scrollOffset) * 31;
        List<String> list = this.currentFocusModule;
        int iHashCode3 = (((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31) + this.loadingStatus) * 31;
        Integer num = this.flashSaleState;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.flashSaleCountDown;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        C1062004Di c1062004Di = this.cartTip;
        int iHashCode6 = (iHashCode5 + (c1062004Di == null ? 0 : c1062004Di.hashCode())) * 31;
        CartEntry cartEntry = this.cartEntry;
        int iHashCode7 = (((iHashCode6 + (cartEntry == null ? 0 : cartEntry.hashCode())) * 31) + this.bodyContent) * 31;
        ShareInfo shareInfo = this.shareInfo;
        int iHashCode8 = (iHashCode7 + (shareInfo == null ? 0 : shareInfo.hashCode())) * 31;
        BlockPageInfo blockPageInfo = this.blockInfo;
        int iHashCode9 = (iHashCode8 + (blockPageInfo == null ? 0 : blockPageInfo.hashCode())) * 31;
        Boolean bool = this.showFavoriteGuide;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        SellerInfo sellerInfo = this.shopInfo;
        int iHashCode11 = (iHashCode10 + (sellerInfo == null ? 0 : sellerInfo.hashCode())) * 31;
        PdpBottomAreaElem pdpBottomAreaElem = this.bottomAreaElem;
        int iHashCode12 = (iHashCode11 + (pdpBottomAreaElem == null ? 0 : pdpBottomAreaElem.hashCode())) * 31;
        LinkRichText linkRichText = this.protectionProgramText;
        int iHashCode13 = (iHashCode12 + (linkRichText == null ? 0 : linkRichText.hashCode())) * 31;
        Object obj = this.bizEnvChange;
        int iHashCode14 = (iHashCode13 + (obj == null ? 0 : obj.hashCode())) * 31;
        UserRight userRight = this.userRight;
        int iHashCode15 = (iHashCode14 + (userRight == null ? 0 : userRight.hashCode())) * 31;
        ExceptionUX exceptionUX = this.exceptionUX;
        int iHashCode16 = (iHashCode15 + (exceptionUX == null ? 0 : exceptionUX.hashCode())) * 31;
        C1759460vt2 c1759460vt2 = this.lynxPopupState;
        int iHashCode17 = (((iHashCode16 + (c1759460vt2 == null ? 0 : c1759460vt2.hashCode())) * 31) + this.bottomFloatingState.hashCode()) * 31;
        Boolean bool2 = this.openSkuOnInit;
        int iHashCode18 = (iHashCode17 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        AddToCartData addToCartData = this.addCartData;
        return iHashCode18 + (addToCartData != null ? addToCartData.hashCode() : 0);
    }

    public final AddToCartData getAddCartData() {
        return this.addCartData;
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

    public final PdpBottomAreaElem getBottomAreaElem() {
        return this.bottomAreaElem;
    }

    public final C1063304Dv getBottomBarVO() {
        return this.bottomBarVO;
    }

    public final C1756520voI getBottomFloatingState() {
        return this.bottomFloatingState;
    }

    public final float getBottomSheetSlideOffset() {
        return this.bottomSheetSlideOffset;
    }

    public final CartEntry getCartEntry() {
        return this.cartEntry;
    }

    public final C1062004Di getCartTip() {
        return this.cartTip;
    }

    public final List<Object> getContentList() {
        return this.contentList;
    }

    public final float getCreatorSheetSlideOffset() {
        return this.creatorSheetSlideOffset;
    }

    public final C04D0 getCreatorSheetVO() {
        return this.creatorSheetVO;
    }

    public final List<String> getCurrentFocusModule() {
        return this.currentFocusModule;
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

    public final C1759460vt2 getLynxPopupState() {
        return this.lynxPopupState;
    }

    public final Boolean getOpenSkuOnInit() {
        return this.openSkuOnInit;
    }

    public final LinkRichText getProtectionProgramText() {
        return this.protectionProgramText;
    }

    public final int getScrollOffset() {
        return this.scrollOffset;
    }

    public final int getScrollOrientation() {
        return this.scrollOrientation;
    }

    public final ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public final int getSheetState() {
        return this.sheetState;
    }

    public final SellerInfo getShopInfo() {
        return this.shopInfo;
    }

    public final Boolean getShowFavoriteGuide() {
        return this.showFavoriteGuide;
    }

    public final UserRight getUserRight() {
        return this.userRight;
    }

    public final boolean isFullScreen() {
        return this.isFullScreen;
    }

    public PdpMainState(boolean z, C1063304Dv c1063304Dv, boolean z2, int i, List<? extends Object> list, float f, C04D0 c04d0, int i2, float f2, int i3, List<String> list2, int i4, Integer num, Long l, C1062004Di c1062004Di, CartEntry cartEntry, int i5, ShareInfo shareInfo, BlockPageInfo blockPageInfo, Boolean bool, SellerInfo sellerInfo, PdpBottomAreaElem pdpBottomAreaElem, LinkRichText linkRichText, Object obj, UserRight userRight, ExceptionUX exceptionUX, C1759460vt2 c1759460vt2, C1756520voI c1756520voI, Boolean bool2, AddToCartData addToCartData) {
        this.isFullScreen = z;
        this.bottomBarVO = c1063304Dv;
        this.dismiss = z2;
        this.sheetState = i;
        this.contentList = list;
        this.bottomSheetSlideOffset = f;
        this.creatorSheetVO = c04d0;
        this.scrollOrientation = i2;
        this.creatorSheetSlideOffset = f2;
        this.scrollOffset = i3;
        this.currentFocusModule = list2;
        this.loadingStatus = i4;
        this.flashSaleState = num;
        this.flashSaleCountDown = l;
        this.cartTip = c1062004Di;
        this.cartEntry = cartEntry;
        this.bodyContent = i5;
        this.shareInfo = shareInfo;
        this.blockInfo = blockPageInfo;
        this.showFavoriteGuide = bool;
        this.shopInfo = sellerInfo;
        this.bottomAreaElem = pdpBottomAreaElem;
        this.protectionProgramText = linkRichText;
        this.bizEnvChange = obj;
        this.userRight = userRight;
        this.exceptionUX = exceptionUX;
        this.lynxPopupState = c1759460vt2;
        this.bottomFloatingState = c1756520voI;
        this.openSkuOnInit = bool2;
        this.addCartData = addToCartData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PdpMainState(boolean z, C1063304Dv c1063304Dv, boolean z2, int i, List list, float f, C04D0 c04d0, int i2, float f2, int i3, List list2, int i4, Integer num, Long l, C1062004Di c1062004Di, CartEntry cartEntry, int i5, ShareInfo shareInfo, BlockPageInfo blockPageInfo, Boolean bool, SellerInfo sellerInfo, PdpBottomAreaElem pdpBottomAreaElem, LinkRichText linkRichText, Object obj, UserRight userRight, ExceptionUX exceptionUX, C1759460vt2 c1759460vt2, C1756520voI c1756520voI, Boolean bool2, AddToCartData addToCartData, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        AddToCartData addToCartData2;
        Boolean bool3 = bool2;
        C1756520voI c1756520voI2 = c1756520voI;
        C1759460vt2 c1759460vt22 = c1759460vt2;
        ExceptionUX exceptionUX2 = exceptionUX;
        LinkRichText linkRichText2 = linkRichText;
        PdpBottomAreaElem pdpBottomAreaElem2 = pdpBottomAreaElem;
        SellerInfo sellerInfo2 = sellerInfo;
        Boolean bool4 = bool;
        BlockPageInfo blockPageInfo2 = blockPageInfo;
        ShareInfo shareInfo2 = shareInfo;
        int i7 = i5;
        CartEntry cartEntry2 = cartEntry;
        C1062004Di c1062004Di2 = c1062004Di;
        Integer num2 = num;
        Long l2 = l;
        List list3 = list2;
        int i8 = i3;
        int i9 = i2;
        C04D0 c04d02 = c04d0;
        float f3 = f;
        List list4 = list;
        int i10 = i;
        boolean z3 = z2;
        UserRight userRight2 = userRight;
        C1063304Dv c1063304Dv2 = c1063304Dv;
        Object obj2 = obj;
        boolean z4 = (i6 & 1) != 0 ? false : z;
        c1063304Dv2 = (i6 & 2) != 0 ? null : c1063304Dv2;
        z3 = (i6 & 4) != 0 ? false : z3;
        i10 = (i6 & 8) != 0 ? 4 : i10;
        list4 = (i6 & 16) != 0 ? C13BV.INSTANCE : list4;
        f3 = (i6 & 32) != 0 ? 0.0f : f3;
        c04d02 = (i6 & 64) != 0 ? null : c04d02;
        i9 = (i6 & 128) != 0 ? 1 : i9;
        float f4 = (i6 & 256) == 0 ? f2 : 0.0f;
        i8 = (i6 & 512) != 0 ? 0 : i8;
        list3 = (i6 & 1024) != 0 ? null : list3;
        int i11 = (i6 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? i4 : 0;
        num2 = (i6 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : num2;
        l2 = (i6 & 8192) != 0 ? null : l2;
        c1062004Di2 = (i6 & 16384) != 0 ? null : c1062004Di2;
        cartEntry2 = (32768 & i6) != 0 ? null : cartEntry2;
        i7 = (65536 & i6) != 0 ? -1 : i7;
        shareInfo2 = (131072 & i6) != 0 ? null : shareInfo2;
        blockPageInfo2 = (262144 & i6) != 0 ? null : blockPageInfo2;
        bool4 = (524288 & i6) != 0 ? null : bool4;
        sellerInfo2 = (1048576 & i6) != 0 ? null : sellerInfo2;
        pdpBottomAreaElem2 = (2097152 & i6) != 0 ? null : pdpBottomAreaElem2;
        linkRichText2 = (4194304 & i6) != 0 ? null : linkRichText2;
        obj2 = (8388608 & i6) != 0 ? null : obj2;
        userRight2 = (16777216 & i6) != 0 ? null : userRight2;
        exceptionUX2 = (33554432 & i6) != 0 ? null : exceptionUX2;
        c1759460vt22 = (67108864 & i6) != 0 ? null : c1759460vt22;
        if ((134217728 & i6) != 0) {
            addToCartData2 = null;
            c1756520voI2 = new C1756520voI(null, null, null);
        } else {
            addToCartData2 = null;
        }
        this(z4, c1063304Dv2, z3, i10, list4, f3, c04d02, i9, f4, i8, list3, i11, num2, l2, c1062004Di2, cartEntry2, i7, shareInfo2, blockPageInfo2, bool4, sellerInfo2, pdpBottomAreaElem2, linkRichText2, obj2, userRight2, exceptionUX2, c1759460vt22, c1756520voI2, (268435456 & i6) != 0 ? addToCartData2 : bool3, (i6 & 536870912) == 0 ? addToCartData : addToCartData2);
    }
}
