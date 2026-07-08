package kotlin.jvm.internal;

import X.C09AY;
import X.C1159290gH1;
import X.C1712550ufN;
import X.C1713300uga;
import X.C1714380uiK;
import X.C1715090ujT;
import X.C1717920uo2;
import X.C1728990v5t;
import X.C1736840vIY;
import X.C1742800vSA;
import X.C1755690vmx;
import X.C1761290vvz;
import X.C1761300vw0;
import X.C291001Au;
import X.C893803eS;
import X.InterfaceC1755830vnB;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditState;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailState;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS38S0010000_26 extends C09AY implements Function1 {
    public final int $t;
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS38S0010000_26(int i) {
        super(1);
        this.$t = i;
        this.z0 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS38S0010000_26(boolean z, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
    }

    public static final Object invoke$0(AwS38S0010000_26 awS38S0010000_26, Object obj) {
        AddressEditState addressEditState = (AddressEditState) obj;
        return addressEditState.copy(addressEditState.inputItemFirstTimeLoadingStatus, addressEditState.changeRegionLoadingStatus, addressEditState.deleteLoadingStatus, addressEditState.saveLoadingStatus, addressEditState.previewLoadingStatus, addressEditState.pudoAddressVO, addressEditState.inputItemVOList, addressEditState.inputItemPreviewVOList, addressEditState.emailHintVisible, addressEditState.privacyPolicyStatement, addressEditState.showExceptionUX, addressEditState.addressRightStatement, addressEditState.isAllKeyItemFilled, addressEditState.editDeliveryInstruction, addressEditState.scrollerPos, addressEditState.noticeBubbles, addressEditState.topText, addressEditState.changeOrderData, addressEditState.clientConfig, addressEditState.toastMessage, addressEditState.locationPermissionStatus, addressEditState.recommendCandInputData, addressEditState.currentLocation, addressEditState.isClickUseLocation, addressEditState.hasFineLocationPermission, addressEditState.autoFillLocation, awS38S0010000_26.z0, addressEditState.isUseMyLocationLoading, addressEditState.isDontKnowZipCode);
    }

    public static final Object invoke$1(AwS38S0010000_26 awS38S0010000_26, Object obj) {
        AddressEditState addressEditState = (AddressEditState) obj;
        return addressEditState.copy(addressEditState.inputItemFirstTimeLoadingStatus, addressEditState.changeRegionLoadingStatus, addressEditState.deleteLoadingStatus, addressEditState.saveLoadingStatus, addressEditState.previewLoadingStatus, addressEditState.pudoAddressVO, addressEditState.inputItemVOList, addressEditState.inputItemPreviewVOList, addressEditState.emailHintVisible, addressEditState.privacyPolicyStatement, addressEditState.showExceptionUX, addressEditState.addressRightStatement, awS38S0010000_26.z0, addressEditState.editDeliveryInstruction, addressEditState.scrollerPos, addressEditState.noticeBubbles, addressEditState.topText, addressEditState.changeOrderData, addressEditState.clientConfig, addressEditState.toastMessage, addressEditState.locationPermissionStatus, addressEditState.recommendCandInputData, addressEditState.currentLocation, addressEditState.isClickUseLocation, addressEditState.hasFineLocationPermission, addressEditState.autoFillLocation, addressEditState.needToastGetLocationError, addressEditState.isUseMyLocationLoading, addressEditState.isDontKnowZipCode);
    }

    public static final Object invoke$10(AwS38S0010000_26 awS38S0010000_26, Object obj) {
        return C1715090ujT.LIZ((C1715090ujT) obj, awS38S0010000_26.z0, null, null, null, 14);
    }

    public static final Object invoke$11(AwS38S0010000_26 awS38S0010000_26, Object obj) {
        return C1728990v5t.LIZ((C1728990v5t) obj, null, false, awS38S0010000_26.z0, null, null, null, null, 0, null, false, false, null, 4091);
    }

    public static final Object invoke$12(AwS38S0010000_26 awS38S0010000_26, Object obj) {
        ((InterfaceC1755830vnB) obj).F0(awS38S0010000_26.z0);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS38S0010000_26 awS38S0010000_26, Object obj) {
        return C1712550ufN.LIZ((C1712550ufN) obj, null, null, null, null, Boolean.valueOf(awS38S0010000_26.z0), 255);
    }

    public static final Object invoke$14(AwS38S0010000_26 awS38S0010000_26, Object obj) {
        C1712550ufN c1712550ufN = (C1712550ufN) obj;
        boolean z = true;
        if (!awS38S0010000_26.z0) {
            z = false;
        }
        return C1712550ufN.LIZ(c1712550ufN, null, null, null, Boolean.valueOf(z), null, 383);
    }

    public static final Object invoke$15(AwS38S0010000_26 awS38S0010000_26, Object obj) {
        C1761290vvz c1761290vvzLIZ;
        C1761300vw0 c1761300vw0 = (C1761300vw0) obj;
        C1761290vvz c1761290vvz = c1761300vw0.LIZIZ;
        if (c1761290vvz != null) {
            c1761290vvzLIZ = C1761290vvz.LIZ(c1761290vvz, null, null, awS38S0010000_26.z0, null, null, 2145386495);
        } else {
            c1761290vvzLIZ = null;
        }
        return C1761300vw0.LIZ(c1761300vw0, c1761290vvzLIZ);
    }

    public static final Object invoke$16(AwS38S0010000_26 awS38S0010000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("show_type", "checkbox");
        laneParams.plusAssign("mobile", C893803eS.LIZ(awS38S0010000_26.z0));
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS38S0010000_26 awS38S0010000_26, Object obj) {
        AddressEditState addressEditState = (AddressEditState) obj;
        return addressEditState.copy(addressEditState.inputItemFirstTimeLoadingStatus, addressEditState.changeRegionLoadingStatus, addressEditState.deleteLoadingStatus, addressEditState.saveLoadingStatus, addressEditState.previewLoadingStatus, addressEditState.pudoAddressVO, addressEditState.inputItemVOList, addressEditState.inputItemPreviewVOList, addressEditState.emailHintVisible, addressEditState.privacyPolicyStatement, addressEditState.showExceptionUX, addressEditState.addressRightStatement, addressEditState.isAllKeyItemFilled, addressEditState.editDeliveryInstruction, addressEditState.scrollerPos, addressEditState.noticeBubbles, addressEditState.topText, addressEditState.changeOrderData, addressEditState.clientConfig, addressEditState.toastMessage, addressEditState.locationPermissionStatus, addressEditState.recommendCandInputData, addressEditState.currentLocation, addressEditState.isClickUseLocation, addressEditState.hasFineLocationPermission, addressEditState.autoFillLocation, addressEditState.needToastGetLocationError, addressEditState.isUseMyLocationLoading, awS38S0010000_26.z0);
    }

    public static final Object invoke$18(AwS38S0010000_26 awS38S0010000_26, Object obj) {
        AddressEditState addressEditState = (AddressEditState) obj;
        return addressEditState.copy(addressEditState.inputItemFirstTimeLoadingStatus, addressEditState.changeRegionLoadingStatus, addressEditState.deleteLoadingStatus, addressEditState.saveLoadingStatus, addressEditState.previewLoadingStatus, addressEditState.pudoAddressVO, addressEditState.inputItemVOList, addressEditState.inputItemPreviewVOList, awS38S0010000_26.z0, addressEditState.privacyPolicyStatement, addressEditState.showExceptionUX, addressEditState.addressRightStatement, addressEditState.isAllKeyItemFilled, addressEditState.editDeliveryInstruction, addressEditState.scrollerPos, addressEditState.noticeBubbles, addressEditState.topText, addressEditState.changeOrderData, addressEditState.clientConfig, addressEditState.toastMessage, addressEditState.locationPermissionStatus, addressEditState.recommendCandInputData, addressEditState.currentLocation, addressEditState.isClickUseLocation, addressEditState.hasFineLocationPermission, addressEditState.autoFillLocation, addressEditState.needToastGetLocationError, addressEditState.isUseMyLocationLoading, addressEditState.isDontKnowZipCode);
    }

    public static final Object invoke$19(AwS38S0010000_26 awS38S0010000_26, Object obj) {
        AddressEditState addressEditState = (AddressEditState) obj;
        return addressEditState.copy(addressEditState.inputItemFirstTimeLoadingStatus, addressEditState.changeRegionLoadingStatus, addressEditState.deleteLoadingStatus, addressEditState.saveLoadingStatus, addressEditState.previewLoadingStatus, addressEditState.pudoAddressVO, addressEditState.inputItemVOList, addressEditState.inputItemPreviewVOList, addressEditState.emailHintVisible, addressEditState.privacyPolicyStatement, addressEditState.showExceptionUX, addressEditState.addressRightStatement, addressEditState.isAllKeyItemFilled, addressEditState.editDeliveryInstruction, addressEditState.scrollerPos, addressEditState.noticeBubbles, addressEditState.topText, addressEditState.changeOrderData, addressEditState.clientConfig, addressEditState.toastMessage, addressEditState.locationPermissionStatus, addressEditState.recommendCandInputData, addressEditState.currentLocation, addressEditState.isClickUseLocation, addressEditState.hasFineLocationPermission, addressEditState.autoFillLocation, addressEditState.needToastGetLocationError, awS38S0010000_26.z0, addressEditState.isDontKnowZipCode);
    }

    public static final Object invoke$2(AwS38S0010000_26 awS38S0010000_26, Object obj) {
        AddressEditDetailState addressEditDetailState = (AddressEditDetailState) obj;
        return addressEditDetailState.copy(addressEditDetailState.inputItemFirstTimeLoadingStatus, addressEditDetailState.inputItemVOList, addressEditDetailState.initData, awS38S0010000_26.z0, addressEditDetailState.candInputDataOptions);
    }

    public static final Object invoke$20(AwS38S0010000_26 awS38S0010000_26, Object obj) {
        return C1742800vSA.LIZ((C1742800vSA) obj, null, null, null, null, 0, awS38S0010000_26.z0, null, false, null, null, 991);
    }

    public static final Object invoke$21(AwS38S0010000_26 awS38S0010000_26, Object obj) {
        return C1742800vSA.LIZ((C1742800vSA) obj, null, null, null, null, 0, false, null, awS38S0010000_26.z0, null, null, 895);
    }

    public static final Object invoke$3(AwS38S0010000_26 awS38S0010000_26, Object obj) {
        String str;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("button_name", "sms_authorization");
        if (awS38S0010000_26.z0) {
            str = "sms_authorization_yes";
        } else {
            str = "sms_authorization_no";
        }
        laneParams.plusAssign("button_title", str);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS38S0010000_26 awS38S0010000_26, Object obj) {
        return C1755690vmx.LIZ((C1755690vmx) obj, null, null, 0, 0, 0, awS38S0010000_26.z0, 31);
    }

    public static final Object invoke$5(AwS38S0010000_26 awS38S0010000_26, Object obj) {
        return C1159290gH1.LIZ((C1159290gH1) obj, null, null, false, null, null, awS38S0010000_26.z0, 31);
    }

    public static final Object invoke$6(AwS38S0010000_26 awS38S0010000_26, Object obj) {
        return C1736840vIY.LIZ((C1736840vIY) obj, null, null, null, null, null, null, null, null, null, new C291001Au(Boolean.valueOf(awS38S0010000_26.z0)), 16777215);
    }

    public static final Object invoke$7(AwS38S0010000_26 awS38S0010000_26, Object obj) {
        return C1714380uiK.LIZ((C1714380uiK) obj, awS38S0010000_26.z0, true, null, null, 12);
    }

    public static final Object invoke$8(AwS38S0010000_26 awS38S0010000_26, Object obj) {
        return C1717920uo2.LIZ((C1717920uo2) obj, null, null, null, awS38S0010000_26.z0, null, null, null, null, 0, null, 1015);
    }

    public static final Object invoke$9(AwS38S0010000_26 awS38S0010000_26, Object obj) {
        return C1713300uga.LIZ((C1713300uga) obj, null, null, null, null, false, null, null, new C291001Au(Boolean.valueOf(awS38S0010000_26.z0)), null, 383);
    }
}
