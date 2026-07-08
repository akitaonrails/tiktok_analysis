package kotlin.jvm.internal;

import X.AbstractC1541650qDj;
import X.C09AY;
import X.C14CA;
import X.C1730290v7z;
import X.C1730690v8d;
import X.C1730740v8i;
import X.C1742800vSA;
import X.C1747580vZs;
import X.C1747620vZw;
import X.C1754870vld;
import X.C1755690vmx;
import X.C1761940vx2;
import X.C291001Au;
import X.C948003nC;
import X.InterfaceC1740150vNt;
import android.webkit.WebView;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditState;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.delivery.DeliveryInstructionState;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerState;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS38S0001000_26 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f994i0;

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
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            default:
                return null;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS38S0001000_26(int r3) {
        /*
            r2 = this;
            r2.$t = r3
            int r3 = 17 - r3
            if (r3 == 0) goto Lf
            r1 = r2
            r0 = -1
            r1.f994i0 = r0
            r0 = 1
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r0 = 2131848087(0x7f116b97, float:1.932967E38)
            r1.f994i0 = r0
            r0 = 1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS38S0001000_26.<init>(int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS38S0001000_26(int i, int i2) {
        super(1);
        this.$t = i2;
        this.f994i0 = i;
    }

    public static final Object invoke$0(AwS38S0001000_26 awS38S0001000_26, Object obj) {
        ((TextView) obj).setTextColor(awS38S0001000_26.f994i0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS38S0001000_26 awS38S0001000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("button_name", "enter_address_manually");
        laneParams.plusAssign("input_box_name", "one_box_search");
        laneParams.plusAssign("item_num", Integer.valueOf(awS38S0001000_26.f994i0));
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS38S0001000_26 awS38S0001000_26, Object obj) {
        return C1754870vld.LIZ((C1754870vld) obj, null, 0, null, awS38S0001000_26.f994i0, 0.0f, false, null, null, null, 503);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0vNr] */
    public static final Object invoke$11(AwS38S0001000_26 awS38S0001000_26, Object obj) {
        AbstractC1541650qDj abstractC1541650qDj = (AbstractC1541650qDj) obj;
        if (abstractC1541650qDj instanceof C14CA) {
            final int i = awS38S0001000_26.f994i0;
            ((C14CA) abstractC1541650qDj).LLIZ = new InterfaceC1740150vNt() { // from class: X.0vNr
                public int LIZ;

                @Override // X.InterfaceC1740150vNt
                public final void LIZ(WebView webView) {
                    int i2 = this.LIZ + 1;
                    this.LIZ = i2;
                    if (i2 != 1) {
                        if (i2 == 2) {
                            C1435305jb.LIZIZ(((long) i) * 1000, "draw_end_resume_h5");
                        }
                    } else {
                        if (webView == null) {
                            return;
                        }
                        C948503nH.LJII(webView, new C1351005Qm(i, null));
                    }
                }
            };
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS38S0001000_26 awS38S0001000_26, Object obj) {
        return C1754870vld.LIZ((C1754870vld) obj, null, 0, null, 0, 0.0f, false, new C291001Au(Integer.valueOf(awS38S0001000_26.f994i0)), null, null, 447);
    }

    public static final Object invoke$13(AwS38S0001000_26 awS38S0001000_26, Object obj) {
        DistrictPickerState districtPickerState = (DistrictPickerState) obj;
        return districtPickerState.copy(districtPickerState.title, districtPickerState.titleEn, districtPickerState.districtList, districtPickerState.selectedDistrict, awS38S0001000_26.f994i0);
    }

    public static final Object invoke$14(AwS38S0001000_26 awS38S0001000_26, Object obj) {
        C1761940vx2 c1761940vx2 = (C1761940vx2) obj;
        int i = awS38S0001000_26.f994i0;
        return new C1761940vx2(c1761940vx2.LL, c1761940vx2.LLILLJJLI, c1761940vx2.LLILLL, c1761940vx2.LLILZ, c1761940vx2.LLILZIL, i, new C291001Au(Integer.valueOf(i)));
    }

    public static final Object invoke$15(AwS38S0001000_26 awS38S0001000_26, Object obj) {
        AddressEditState addressEditState = (AddressEditState) obj;
        return addressEditState.copy(addressEditState.inputItemFirstTimeLoadingStatus, addressEditState.changeRegionLoadingStatus, addressEditState.deleteLoadingStatus, addressEditState.saveLoadingStatus, Integer.valueOf(awS38S0001000_26.f994i0), addressEditState.pudoAddressVO, addressEditState.inputItemVOList, addressEditState.inputItemPreviewVOList, addressEditState.emailHintVisible, addressEditState.privacyPolicyStatement, addressEditState.showExceptionUX, addressEditState.addressRightStatement, addressEditState.isAllKeyItemFilled, addressEditState.editDeliveryInstruction, addressEditState.scrollerPos, addressEditState.noticeBubbles, addressEditState.topText, addressEditState.changeOrderData, addressEditState.clientConfig, addressEditState.toastMessage, addressEditState.locationPermissionStatus, addressEditState.recommendCandInputData, addressEditState.currentLocation, addressEditState.isClickUseLocation, addressEditState.hasFineLocationPermission, addressEditState.autoFillLocation, addressEditState.needToastGetLocationError, addressEditState.isUseMyLocationLoading, addressEditState.isDontKnowZipCode);
    }

    public static final Object invoke$16(AwS38S0001000_26 awS38S0001000_26, Object obj) {
        AddressEditState addressEditState = (AddressEditState) obj;
        return addressEditState.copy(awS38S0001000_26.f994i0, addressEditState.changeRegionLoadingStatus, addressEditState.deleteLoadingStatus, addressEditState.saveLoadingStatus, addressEditState.previewLoadingStatus, addressEditState.pudoAddressVO, addressEditState.inputItemVOList, addressEditState.inputItemPreviewVOList, addressEditState.emailHintVisible, addressEditState.privacyPolicyStatement, addressEditState.showExceptionUX, addressEditState.addressRightStatement, addressEditState.isAllKeyItemFilled, addressEditState.editDeliveryInstruction, addressEditState.scrollerPos, addressEditState.noticeBubbles, addressEditState.topText, addressEditState.changeOrderData, addressEditState.clientConfig, addressEditState.toastMessage, addressEditState.locationPermissionStatus, addressEditState.recommendCandInputData, addressEditState.currentLocation, addressEditState.isClickUseLocation, addressEditState.hasFineLocationPermission, addressEditState.autoFillLocation, addressEditState.needToastGetLocationError, addressEditState.isUseMyLocationLoading, addressEditState.isDontKnowZipCode);
    }

    public static final Object invoke$17(AwS38S0001000_26 awS38S0001000_26, Object obj) {
        AddressEditState addressEditState = (AddressEditState) obj;
        return addressEditState.copy(addressEditState.inputItemFirstTimeLoadingStatus, addressEditState.changeRegionLoadingStatus, addressEditState.deleteLoadingStatus, addressEditState.saveLoadingStatus, addressEditState.previewLoadingStatus, addressEditState.pudoAddressVO, addressEditState.inputItemVOList, addressEditState.inputItemPreviewVOList, addressEditState.emailHintVisible, addressEditState.privacyPolicyStatement, addressEditState.showExceptionUX, addressEditState.addressRightStatement, addressEditState.isAllKeyItemFilled, addressEditState.editDeliveryInstruction, addressEditState.scrollerPos, addressEditState.noticeBubbles, addressEditState.topText, addressEditState.changeOrderData, addressEditState.clientConfig, new C1747580vZs(Integer.valueOf(awS38S0001000_26.f994i0)), addressEditState.locationPermissionStatus, addressEditState.recommendCandInputData, addressEditState.currentLocation, addressEditState.isClickUseLocation, addressEditState.hasFineLocationPermission, addressEditState.autoFillLocation, addressEditState.needToastGetLocationError, addressEditState.isUseMyLocationLoading, addressEditState.isDontKnowZipCode);
    }

    public static final Object invoke$18(AwS38S0001000_26 awS38S0001000_26, Object obj) {
        AddressEditState addressEditState = (AddressEditState) obj;
        return addressEditState.copy(addressEditState.inputItemFirstTimeLoadingStatus, addressEditState.changeRegionLoadingStatus, addressEditState.deleteLoadingStatus, addressEditState.saveLoadingStatus, addressEditState.previewLoadingStatus, addressEditState.pudoAddressVO, addressEditState.inputItemVOList, addressEditState.inputItemPreviewVOList, addressEditState.emailHintVisible, addressEditState.privacyPolicyStatement, addressEditState.showExceptionUX, addressEditState.addressRightStatement, addressEditState.isAllKeyItemFilled, addressEditState.editDeliveryInstruction, new C948003nC<>(new C1747620vZw(awS38S0001000_26.f994i0)), addressEditState.noticeBubbles, addressEditState.topText, addressEditState.changeOrderData, addressEditState.clientConfig, addressEditState.toastMessage, addressEditState.locationPermissionStatus, addressEditState.recommendCandInputData, addressEditState.currentLocation, addressEditState.isClickUseLocation, addressEditState.hasFineLocationPermission, addressEditState.autoFillLocation, addressEditState.needToastGetLocationError, addressEditState.isUseMyLocationLoading, addressEditState.isDontKnowZipCode);
    }

    public static final Object invoke$19(AwS38S0001000_26 awS38S0001000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("drop_down_list_name", "CPF");
        laneParams.plusAssign("action_type", "show");
        laneParams.plusAssign("item_num", Integer.valueOf(awS38S0001000_26.f994i0));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS38S0001000_26 awS38S0001000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("button_name", "enter_address_manually");
        laneParams.plusAssign("input_box_name", "one_box_search");
        laneParams.plusAssign("item_num", Integer.valueOf(awS38S0001000_26.f994i0));
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS38S0001000_26 awS38S0001000_26, Object obj) {
        DeliveryInstructionState deliveryInstructionState = (DeliveryInstructionState) obj;
        return deliveryInstructionState.copy(awS38S0001000_26.f994i0, deliveryInstructionState.saveLoadingStatus, deliveryInstructionState.itemList, deliveryInstructionState.pageLoaded, deliveryInstructionState.editDeliveryInstruction, deliveryInstructionState.curSelectItem, deliveryInstructionState.scrollerPos, deliveryInstructionState.backEvent, deliveryInstructionState.netEvent, deliveryInstructionState.toast, deliveryInstructionState.logDuration);
    }

    public static final Object invoke$21(AwS38S0001000_26 awS38S0001000_26, Object obj) {
        DeliveryInstructionState deliveryInstructionState = (DeliveryInstructionState) obj;
        return deliveryInstructionState.copy(deliveryInstructionState.pageStatus, deliveryInstructionState.saveLoadingStatus, deliveryInstructionState.itemList, deliveryInstructionState.pageLoaded, deliveryInstructionState.editDeliveryInstruction, deliveryInstructionState.curSelectItem, new C948003nC<>(Integer.valueOf(awS38S0001000_26.f994i0)), deliveryInstructionState.backEvent, deliveryInstructionState.netEvent, deliveryInstructionState.toast, deliveryInstructionState.logDuration);
    }

    public static final Object invoke$22(AwS38S0001000_26 awS38S0001000_26, Object obj) {
        DeliveryInstructionState deliveryInstructionState = (DeliveryInstructionState) obj;
        return deliveryInstructionState.copy(deliveryInstructionState.pageStatus, deliveryInstructionState.saveLoadingStatus, deliveryInstructionState.itemList, deliveryInstructionState.pageLoaded, deliveryInstructionState.editDeliveryInstruction, deliveryInstructionState.curSelectItem, new C948003nC<>(Integer.valueOf(awS38S0001000_26.f994i0)), deliveryInstructionState.backEvent, deliveryInstructionState.netEvent, deliveryInstructionState.toast, deliveryInstructionState.logDuration);
    }

    public static final Object invoke$23(AwS38S0001000_26 awS38S0001000_26, Object obj) {
        PdpMainState pdpMainState = (PdpMainState) obj;
        return pdpMainState.copy(pdpMainState.isFullScreen, pdpMainState.bottomBarVO, pdpMainState.dismiss, pdpMainState.sheetState, pdpMainState.contentList, pdpMainState.bottomSheetSlideOffset, pdpMainState.creatorSheetVO, pdpMainState.scrollOrientation, pdpMainState.creatorSheetSlideOffset, awS38S0001000_26.f994i0, pdpMainState.currentFocusModule, pdpMainState.loadingStatus, pdpMainState.flashSaleState, pdpMainState.flashSaleCountDown, pdpMainState.cartTip, pdpMainState.cartEntry, pdpMainState.bodyContent, pdpMainState.shareInfo, pdpMainState.blockInfo, pdpMainState.showFavoriteGuide, pdpMainState.shopInfo, pdpMainState.bottomAreaElem, pdpMainState.protectionProgramText, pdpMainState.bizEnvChange, pdpMainState.userRight, pdpMainState.exceptionUX, pdpMainState.lynxPopupState, pdpMainState.bottomFloatingState, pdpMainState.openSkuOnInit, pdpMainState.addCartData);
    }

    public static final Object invoke$24(AwS38S0001000_26 awS38S0001000_26, Object obj) {
        PdpMainState pdpMainState = (PdpMainState) obj;
        return pdpMainState.copy(pdpMainState.isFullScreen, pdpMainState.bottomBarVO, pdpMainState.dismiss, pdpMainState.sheetState, pdpMainState.contentList, pdpMainState.bottomSheetSlideOffset, pdpMainState.creatorSheetVO, awS38S0001000_26.f994i0, pdpMainState.creatorSheetSlideOffset, pdpMainState.scrollOffset, pdpMainState.currentFocusModule, pdpMainState.loadingStatus, pdpMainState.flashSaleState, pdpMainState.flashSaleCountDown, pdpMainState.cartTip, pdpMainState.cartEntry, pdpMainState.bodyContent, pdpMainState.shareInfo, pdpMainState.blockInfo, pdpMainState.showFavoriteGuide, pdpMainState.shopInfo, pdpMainState.bottomAreaElem, pdpMainState.protectionProgramText, pdpMainState.bizEnvChange, pdpMainState.userRight, pdpMainState.exceptionUX, pdpMainState.lynxPopupState, pdpMainState.bottomFloatingState, pdpMainState.openSkuOnInit, pdpMainState.addCartData);
    }

    public static final Object invoke$25(AwS38S0001000_26 awS38S0001000_26, Object obj) {
        AddressEditDetailState addressEditDetailState = (AddressEditDetailState) obj;
        return addressEditDetailState.copy(awS38S0001000_26.f994i0, addressEditDetailState.inputItemVOList, addressEditDetailState.initData, addressEditDetailState.isAllRequiredItemFilled, addressEditDetailState.candInputDataOptions);
    }

    public static final Object invoke$26(AwS38S0001000_26 awS38S0001000_26, Object obj) {
        return C1742800vSA.LIZ((C1742800vSA) obj, null, null, null, null, awS38S0001000_26.f994i0, false, null, false, null, null, 1007);
    }

    public static final Object invoke$3(AwS38S0001000_26 awS38S0001000_26, Object obj) {
        C1730740v8i c1730740v8i = (C1730740v8i) obj;
        C1730290v7z c1730290v7z = C1730290v7z.LIZ;
        int i = awS38S0001000_26.f994i0;
        c1730290v7z.getClass();
        int i2 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                i2 = 1;
            }
        }
        return C1730740v8i.LIZ(c1730740v8i, null, null, null, null, Integer.valueOf(i2), null, 0, null, null, 495);
    }

    public static final Object invoke$4(AwS38S0001000_26 awS38S0001000_26, Object obj) {
        return C1755690vmx.LIZ((C1755690vmx) obj, null, null, 0, awS38S0001000_26.f994i0, 0, false, 55);
    }

    public static final Object invoke$5(AwS38S0001000_26 awS38S0001000_26, Object obj) {
        C1730690v8d c1730690v8d = (C1730690v8d) obj;
        C1730290v7z c1730290v7z = C1730290v7z.LIZ;
        int i = awS38S0001000_26.f994i0;
        c1730290v7z.getClass();
        int i2 = 2;
        if (i != 2) {
            if (i != 3) {
                i2 = 1;
            } else {
                i2 = 3;
            }
        }
        return C1730690v8d.LIZ(c1730690v8d, null, Integer.valueOf(i2), 3);
    }

    public static final Object invoke$6(AwS38S0001000_26 awS38S0001000_26, Object obj) {
        return C1730690v8d.LIZ((C1730690v8d) obj, null, Integer.valueOf(awS38S0001000_26.f994i0), 3);
    }

    public static final Object invoke$7(AwS38S0001000_26 awS38S0001000_26, Object obj) {
        SeaPdpMainState seaPdpMainState = (SeaPdpMainState) obj;
        return seaPdpMainState.copy(seaPdpMainState.isFullScreen, seaPdpMainState.bottomBarVO, seaPdpMainState.bottomBarData, seaPdpMainState.tabs, seaPdpMainState.dismiss, seaPdpMainState.sheetState, seaPdpMainState.contentList, seaPdpMainState.bottomSheetSlideOffset, seaPdpMainState.creatorSheetVO, seaPdpMainState.scrollOrientation, seaPdpMainState.creatorSheetSlideOffset, awS38S0001000_26.f994i0, seaPdpMainState.seaFocusTabAction, seaPdpMainState.seaFocusTabActionNew, seaPdpMainState.selectedTabName, seaPdpMainState.loadingStatus, seaPdpMainState.flashSaleState, seaPdpMainState.flashSaleCountDown, seaPdpMainState.cartTip, seaPdpMainState.cartEntry, seaPdpMainState.bodyContent, seaPdpMainState.shareInfo, seaPdpMainState.showLoadingDialog, seaPdpMainState.blockInfo, seaPdpMainState.showFloatShop, seaPdpMainState.bizEnvChange, seaPdpMainState.slideToPaymentModule, seaPdpMainState.lynxAirItemName, seaPdpMainState.exceptionUX, seaPdpMainState.lynxPopupState, seaPdpMainState.bottomFloatingState, seaPdpMainState.seaEntranceBubble, seaPdpMainState.bottomMynaBannerState, seaPdpMainState.mediaWindow);
    }

    public static final Object invoke$8(AwS38S0001000_26 awS38S0001000_26, Object obj) {
        SeaPdpMainState seaPdpMainState = (SeaPdpMainState) obj;
        return seaPdpMainState.copy(seaPdpMainState.isFullScreen, seaPdpMainState.bottomBarVO, seaPdpMainState.bottomBarData, seaPdpMainState.tabs, seaPdpMainState.dismiss, seaPdpMainState.sheetState, seaPdpMainState.contentList, seaPdpMainState.bottomSheetSlideOffset, seaPdpMainState.creatorSheetVO, awS38S0001000_26.f994i0, seaPdpMainState.creatorSheetSlideOffset, seaPdpMainState.scrollOffset, seaPdpMainState.seaFocusTabAction, seaPdpMainState.seaFocusTabActionNew, seaPdpMainState.selectedTabName, seaPdpMainState.loadingStatus, seaPdpMainState.flashSaleState, seaPdpMainState.flashSaleCountDown, seaPdpMainState.cartTip, seaPdpMainState.cartEntry, seaPdpMainState.bodyContent, seaPdpMainState.shareInfo, seaPdpMainState.showLoadingDialog, seaPdpMainState.blockInfo, seaPdpMainState.showFloatShop, seaPdpMainState.bizEnvChange, seaPdpMainState.slideToPaymentModule, seaPdpMainState.lynxAirItemName, seaPdpMainState.exceptionUX, seaPdpMainState.lynxPopupState, seaPdpMainState.bottomFloatingState, seaPdpMainState.seaEntranceBubble, seaPdpMainState.bottomMynaBannerState, seaPdpMainState.mediaWindow);
    }

    public static final Object invoke$9(AwS38S0001000_26 awS38S0001000_26, Object obj) {
        SeaPdpMainState seaPdpMainState = (SeaPdpMainState) obj;
        return seaPdpMainState.copy(seaPdpMainState.isFullScreen, seaPdpMainState.bottomBarVO, seaPdpMainState.bottomBarData, seaPdpMainState.tabs, seaPdpMainState.dismiss, seaPdpMainState.sheetState, seaPdpMainState.contentList, seaPdpMainState.bottomSheetSlideOffset, seaPdpMainState.creatorSheetVO, seaPdpMainState.scrollOrientation, seaPdpMainState.creatorSheetSlideOffset, seaPdpMainState.scrollOffset, seaPdpMainState.seaFocusTabAction, seaPdpMainState.seaFocusTabActionNew, Integer.valueOf(awS38S0001000_26.f994i0), seaPdpMainState.loadingStatus, seaPdpMainState.flashSaleState, seaPdpMainState.flashSaleCountDown, seaPdpMainState.cartTip, seaPdpMainState.cartEntry, seaPdpMainState.bodyContent, seaPdpMainState.shareInfo, seaPdpMainState.showLoadingDialog, seaPdpMainState.blockInfo, seaPdpMainState.showFloatShop, seaPdpMainState.bizEnvChange, seaPdpMainState.slideToPaymentModule, seaPdpMainState.lynxAirItemName, seaPdpMainState.exceptionUX, seaPdpMainState.lynxPopupState, seaPdpMainState.bottomFloatingState, seaPdpMainState.seaEntranceBubble, seaPdpMainState.bottomMynaBannerState, seaPdpMainState.mediaWindow);
    }
}
