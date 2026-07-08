package com.ss.android.ugc.aweme.ecommerce.base.address.edit;

import X.C004I;
import X.C1177960gl8;
import X.C13BV;
import X.C1745180vW0;
import X.C1745680vWo;
import X.C1747210vZH;
import X.C1747580vZs;
import X.C1747620vZw;
import X.C786410Ut5;
import X.C948003nC;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressRightsInfo;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ChangeOnOrderStruct;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstructionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.NoticeBubble;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class AddressEditState implements C004I {
    public static final int $stable = 8;
    public final AddressRightsInfo addressRightStatement;
    public final boolean autoFillLocation;
    public final C948003nC<ChangeOnOrderStruct> changeOrderData;
    public final Integer changeRegionLoadingStatus;
    public final ClientConfig clientConfig;
    public final C1177960gl8 currentLocation;
    public final Integer deleteLoadingStatus;
    public final C948003nC<DeliveryInstructionInfo> editDeliveryInstruction;
    public final boolean emailHintVisible;
    public Boolean hasFineLocationPermission;
    public final int inputItemFirstTimeLoadingStatus;
    public final List<C1745680vWo> inputItemPreviewVOList;
    public final List<C1745680vWo> inputItemVOList;
    public final boolean isAllKeyItemFilled;
    public final boolean isClickUseLocation;
    public boolean isDontKnowZipCode;
    public final boolean isUseMyLocationLoading;
    public final boolean locationPermissionStatus;
    public boolean needToastGetLocationError;
    public final C948003nC<List<NoticeBubble>> noticeBubbles;
    public final Integer previewLoadingStatus;
    public final C948003nC<LinkRichText> privacyPolicyStatement;
    public final C1747210vZH pudoAddressVO;
    public final CandInputData recommendCandInputData;
    public final Integer saveLoadingStatus;
    public final C948003nC<C1747620vZw> scrollerPos;
    public final ExceptionUX showExceptionUX;
    public final C1747580vZs toastMessage;
    public final ECRichText topText;

    public AddressEditState() {
        this(0, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, false, null, null, false, null, false, false, false, false, 536870911, null);
    }

    public final AddressEditState copy(int i, Integer num, Integer num2, Integer num3, Integer num4, C1747210vZH c1747210vZH, List<C1745680vWo> list, List<C1745680vWo> list2, boolean z, C948003nC<LinkRichText> c948003nC, ExceptionUX exceptionUX, AddressRightsInfo addressRightsInfo, boolean z2, C948003nC<DeliveryInstructionInfo> c948003nC2, C948003nC<C1747620vZw> c948003nC3, C948003nC<List<NoticeBubble>> c948003nC4, ECRichText eCRichText, C948003nC<ChangeOnOrderStruct> c948003nC5, ClientConfig clientConfig, C1747580vZs c1747580vZs, boolean z3, CandInputData candInputData, C1177960gl8 c1177960gl8, boolean z4, Boolean bool, boolean z5, boolean z6, boolean z7, boolean z8) {
        return new AddressEditState(i, num, num2, num3, num4, c1747210vZH, list, list2, z, c948003nC, exceptionUX, addressRightsInfo, z2, c948003nC2, c948003nC3, c948003nC4, eCRichText, c948003nC5, clientConfig, c1747580vZs, z3, candInputData, c1177960gl8, z4, bool, z5, z6, z7, z8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressEditState)) {
            return false;
        }
        AddressEditState addressEditState = (AddressEditState) obj;
        return this.inputItemFirstTimeLoadingStatus == addressEditState.inputItemFirstTimeLoadingStatus && Intrinsics.LJFF(this.changeRegionLoadingStatus, addressEditState.changeRegionLoadingStatus) && Intrinsics.LJFF(this.deleteLoadingStatus, addressEditState.deleteLoadingStatus) && Intrinsics.LJFF(this.saveLoadingStatus, addressEditState.saveLoadingStatus) && Intrinsics.LJFF(this.previewLoadingStatus, addressEditState.previewLoadingStatus) && Intrinsics.LJFF(this.pudoAddressVO, addressEditState.pudoAddressVO) && Intrinsics.LJFF(this.inputItemVOList, addressEditState.inputItemVOList) && Intrinsics.LJFF(this.inputItemPreviewVOList, addressEditState.inputItemPreviewVOList) && this.emailHintVisible == addressEditState.emailHintVisible && Intrinsics.LJFF(this.privacyPolicyStatement, addressEditState.privacyPolicyStatement) && Intrinsics.LJFF(this.showExceptionUX, addressEditState.showExceptionUX) && Intrinsics.LJFF(this.addressRightStatement, addressEditState.addressRightStatement) && this.isAllKeyItemFilled == addressEditState.isAllKeyItemFilled && Intrinsics.LJFF(this.editDeliveryInstruction, addressEditState.editDeliveryInstruction) && Intrinsics.LJFF(this.scrollerPos, addressEditState.scrollerPos) && Intrinsics.LJFF(this.noticeBubbles, addressEditState.noticeBubbles) && Intrinsics.LJFF(this.topText, addressEditState.topText) && Intrinsics.LJFF(this.changeOrderData, addressEditState.changeOrderData) && Intrinsics.LJFF(this.clientConfig, addressEditState.clientConfig) && Intrinsics.LJFF(this.toastMessage, addressEditState.toastMessage) && this.locationPermissionStatus == addressEditState.locationPermissionStatus && Intrinsics.LJFF(this.recommendCandInputData, addressEditState.recommendCandInputData) && Intrinsics.LJFF(this.currentLocation, addressEditState.currentLocation) && this.isClickUseLocation == addressEditState.isClickUseLocation && Intrinsics.LJFF(this.hasFineLocationPermission, addressEditState.hasFineLocationPermission) && this.autoFillLocation == addressEditState.autoFillLocation && this.needToastGetLocationError == addressEditState.needToastGetLocationError && this.isUseMyLocationLoading == addressEditState.isUseMyLocationLoading && this.isDontKnowZipCode == addressEditState.isDontKnowZipCode;
    }

    public int hashCode() {
        int i = this.inputItemFirstTimeLoadingStatus * 31;
        Integer num = this.changeRegionLoadingStatus;
        int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.deleteLoadingStatus;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.saveLoadingStatus;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.previewLoadingStatus;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        C1747210vZH c1747210vZH = this.pudoAddressVO;
        int iHashCode5 = (((((((iHashCode4 + (c1747210vZH == null ? 0 : c1747210vZH.hashCode())) * 31) + this.inputItemVOList.hashCode()) * 31) + this.inputItemPreviewVOList.hashCode()) * 31) + C786410Ut5.Z2(this.emailHintVisible)) * 31;
        C948003nC<LinkRichText> c948003nC = this.privacyPolicyStatement;
        int iHashCode6 = (iHashCode5 + (c948003nC == null ? 0 : c948003nC.hashCode())) * 31;
        ExceptionUX exceptionUX = this.showExceptionUX;
        int iHashCode7 = (iHashCode6 + (exceptionUX == null ? 0 : exceptionUX.hashCode())) * 31;
        AddressRightsInfo addressRightsInfo = this.addressRightStatement;
        int iHashCode8 = (((iHashCode7 + (addressRightsInfo == null ? 0 : addressRightsInfo.hashCode())) * 31) + C786410Ut5.Z2(this.isAllKeyItemFilled)) * 31;
        C948003nC<DeliveryInstructionInfo> c948003nC2 = this.editDeliveryInstruction;
        int iHashCode9 = (iHashCode8 + (c948003nC2 == null ? 0 : c948003nC2.hashCode())) * 31;
        C948003nC<C1747620vZw> c948003nC3 = this.scrollerPos;
        int iHashCode10 = (iHashCode9 + (c948003nC3 == null ? 0 : c948003nC3.hashCode())) * 31;
        C948003nC<List<NoticeBubble>> c948003nC4 = this.noticeBubbles;
        int iHashCode11 = (iHashCode10 + (c948003nC4 == null ? 0 : c948003nC4.hashCode())) * 31;
        ECRichText eCRichText = this.topText;
        int iHashCode12 = (iHashCode11 + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        C948003nC<ChangeOnOrderStruct> c948003nC5 = this.changeOrderData;
        int iHashCode13 = (iHashCode12 + (c948003nC5 == null ? 0 : c948003nC5.hashCode())) * 31;
        ClientConfig clientConfig = this.clientConfig;
        int iHashCode14 = (iHashCode13 + (clientConfig == null ? 0 : clientConfig.hashCode())) * 31;
        C1747580vZs c1747580vZs = this.toastMessage;
        int iHashCode15 = (((iHashCode14 + (c1747580vZs == null ? 0 : c1747580vZs.hashCode())) * 31) + C786410Ut5.Z2(this.locationPermissionStatus)) * 31;
        CandInputData candInputData = this.recommendCandInputData;
        int iHashCode16 = (iHashCode15 + (candInputData == null ? 0 : candInputData.hashCode())) * 31;
        C1177960gl8 c1177960gl8 = this.currentLocation;
        int iHashCode17 = (((iHashCode16 + (c1177960gl8 == null ? 0 : c1177960gl8.hashCode())) * 31) + C786410Ut5.Z2(this.isClickUseLocation)) * 31;
        Boolean bool = this.hasFineLocationPermission;
        return ((((((((iHashCode17 + (bool != null ? bool.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.autoFillLocation)) * 31) + C786410Ut5.Z2(this.needToastGetLocationError)) * 31) + C786410Ut5.Z2(this.isUseMyLocationLoading)) * 31) + C786410Ut5.Z2(this.isDontKnowZipCode);
    }

    public String toString() {
        return "AddressEditState(inputItemFirstTimeLoadingStatus=" + this.inputItemFirstTimeLoadingStatus + ", changeRegionLoadingStatus=" + this.changeRegionLoadingStatus + ", deleteLoadingStatus=" + this.deleteLoadingStatus + ", saveLoadingStatus=" + this.saveLoadingStatus + ", previewLoadingStatus=" + this.previewLoadingStatus + ", pudoAddressVO=" + this.pudoAddressVO + ", inputItemVOList=" + this.inputItemVOList + ", inputItemPreviewVOList=" + this.inputItemPreviewVOList + ", emailHintVisible=" + this.emailHintVisible + ", privacyPolicyStatement=" + this.privacyPolicyStatement + ", showExceptionUX=" + this.showExceptionUX + ", addressRightStatement=" + this.addressRightStatement + ", isAllKeyItemFilled=" + this.isAllKeyItemFilled + ", editDeliveryInstruction=" + this.editDeliveryInstruction + ", scrollerPos=" + this.scrollerPos + ", noticeBubbles=" + this.noticeBubbles + ", topText=" + this.topText + ", changeOrderData=" + this.changeOrderData + ", clientConfig=" + this.clientConfig + ", toastMessage=" + this.toastMessage + ", locationPermissionStatus=" + this.locationPermissionStatus + ", recommendCandInputData=" + this.recommendCandInputData + ", currentLocation=" + this.currentLocation + ", isClickUseLocation=" + this.isClickUseLocation + ", hasFineLocationPermission=" + this.hasFineLocationPermission + ", autoFillLocation=" + this.autoFillLocation + ", needToastGetLocationError=" + this.needToastGetLocationError + ", isUseMyLocationLoading=" + this.isUseMyLocationLoading + ", isDontKnowZipCode=" + this.isDontKnowZipCode + ')';
    }

    public final AddressRightsInfo getAddressRightStatement() {
        return this.addressRightStatement;
    }

    public final boolean getAutoFillLocation() {
        return this.autoFillLocation;
    }

    public final C948003nC<ChangeOnOrderStruct> getChangeOrderData() {
        return this.changeOrderData;
    }

    public final Integer getChangeRegionLoadingStatus() {
        return this.changeRegionLoadingStatus;
    }

    public final ClientConfig getClientConfig() {
        return this.clientConfig;
    }

    public final C1177960gl8 getCurrentLocation() {
        return this.currentLocation;
    }

    public final Integer getDeleteLoadingStatus() {
        return this.deleteLoadingStatus;
    }

    public final C948003nC<DeliveryInstructionInfo> getEditDeliveryInstruction() {
        return this.editDeliveryInstruction;
    }

    public final boolean getEmailHintVisible() {
        return this.emailHintVisible;
    }

    public final Boolean getHasFineLocationPermission() {
        return this.hasFineLocationPermission;
    }

    public final int getInputItemFirstTimeLoadingStatus() {
        return this.inputItemFirstTimeLoadingStatus;
    }

    public final List<C1745680vWo> getInputItemPreviewVOList() {
        return this.inputItemPreviewVOList;
    }

    public final List<C1745680vWo> getInputItemVOList() {
        return this.inputItemVOList;
    }

    public final boolean getLocationPermissionStatus() {
        return this.locationPermissionStatus;
    }

    public final boolean getNeedToastGetLocationError() {
        return this.needToastGetLocationError;
    }

    public final C948003nC<List<NoticeBubble>> getNoticeBubbles() {
        return this.noticeBubbles;
    }

    public final Integer getPreviewLoadingStatus() {
        return this.previewLoadingStatus;
    }

    public final C948003nC<LinkRichText> getPrivacyPolicyStatement() {
        return this.privacyPolicyStatement;
    }

    public final C1747210vZH getPudoAddressVO() {
        return this.pudoAddressVO;
    }

    public final CandInputData getRecommendCandInputData() {
        return this.recommendCandInputData;
    }

    public final Integer getSaveLoadingStatus() {
        return this.saveLoadingStatus;
    }

    public final C948003nC<C1747620vZw> getScrollerPos() {
        return this.scrollerPos;
    }

    public final ExceptionUX getShowExceptionUX() {
        return this.showExceptionUX;
    }

    public final C1747580vZs getToastMessage() {
        return this.toastMessage;
    }

    public final ECRichText getTopText() {
        return this.topText;
    }

    public final boolean isAllKeyItemFilled() {
        return this.isAllKeyItemFilled;
    }

    public final boolean isClickUseLocation() {
        return this.isClickUseLocation;
    }

    public final boolean isDontKnowZipCode() {
        return this.isDontKnowZipCode;
    }

    public final boolean isUseMyLocationLoading() {
        return this.isUseMyLocationLoading;
    }

    public final void setDontKnowZipCode(boolean z) {
        this.isDontKnowZipCode = z;
    }

    public final void setHasFineLocationPermission(Boolean bool) {
        this.hasFineLocationPermission = bool;
    }

    public final void setNeedToastGetLocationError(boolean z) {
        this.needToastGetLocationError = z;
    }

    public AddressEditState(int i, Integer num, Integer num2, Integer num3, Integer num4, C1747210vZH c1747210vZH, List<C1745680vWo> list, List<C1745680vWo> list2, boolean z, C948003nC<LinkRichText> c948003nC, ExceptionUX exceptionUX, AddressRightsInfo addressRightsInfo, boolean z2, C948003nC<DeliveryInstructionInfo> c948003nC2, C948003nC<C1747620vZw> c948003nC3, C948003nC<List<NoticeBubble>> c948003nC4, ECRichText eCRichText, C948003nC<ChangeOnOrderStruct> c948003nC5, ClientConfig clientConfig, C1747580vZs c1747580vZs, boolean z3, CandInputData candInputData, C1177960gl8 c1177960gl8, boolean z4, Boolean bool, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.inputItemFirstTimeLoadingStatus = i;
        this.changeRegionLoadingStatus = num;
        this.deleteLoadingStatus = num2;
        this.saveLoadingStatus = num3;
        this.previewLoadingStatus = num4;
        this.pudoAddressVO = c1747210vZH;
        this.inputItemVOList = list;
        this.inputItemPreviewVOList = list2;
        this.emailHintVisible = z;
        this.privacyPolicyStatement = c948003nC;
        this.showExceptionUX = exceptionUX;
        this.addressRightStatement = addressRightsInfo;
        this.isAllKeyItemFilled = z2;
        this.editDeliveryInstruction = c948003nC2;
        this.scrollerPos = c948003nC3;
        this.noticeBubbles = c948003nC4;
        this.topText = eCRichText;
        this.changeOrderData = c948003nC5;
        this.clientConfig = clientConfig;
        this.toastMessage = c1747580vZs;
        this.locationPermissionStatus = z3;
        this.recommendCandInputData = candInputData;
        this.currentLocation = c1177960gl8;
        this.isClickUseLocation = z4;
        this.hasFineLocationPermission = bool;
        this.autoFillLocation = z5;
        this.needToastGetLocationError = z6;
        this.isUseMyLocationLoading = z7;
        this.isDontKnowZipCode = z8;
    }

    public AddressEditState(int i, Integer num, Integer num2, Integer num3, Integer num4, C1747210vZH c1747210vZH, List list, List list2, boolean z, C948003nC c948003nC, ExceptionUX exceptionUX, AddressRightsInfo addressRightsInfo, boolean z2, C948003nC c948003nC2, C948003nC c948003nC3, C948003nC c948003nC4, ECRichText eCRichText, C948003nC c948003nC5, ClientConfig clientConfig, C1747580vZs c1747580vZs, boolean z3, CandInputData candInputData, C1177960gl8 c1177960gl8, boolean z4, Boolean bool, boolean z5, boolean z6, boolean z7, boolean z8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : num2, (i2 & 8) != 0 ? null : num3, (i2 & 16) != 0 ? null : num4, (i2 & 32) != 0 ? null : c1747210vZH, (i2 & 64) != 0 ? C13BV.INSTANCE : list, (i2 & 128) != 0 ? C13BV.INSTANCE : list2, (i2 & 256) != 0 ? false : z, (i2 & 512) != 0 ? null : c948003nC, (i2 & 1024) != 0 ? null : exceptionUX, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : addressRightsInfo, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z2, (i2 & 8192) != 0 ? null : c948003nC2, (i2 & 16384) != 0 ? null : c948003nC3, (32768 & i2) != 0 ? null : c948003nC4, (65536 & i2) != 0 ? null : eCRichText, (131072 & i2) != 0 ? null : c948003nC5, (262144 & i2) != 0 ? null : clientConfig, (524288 & i2) != 0 ? null : c1747580vZs, (1048576 & i2) != 0 ? C1745180vW0.LJFF() : z3, (2097152 & i2) != 0 ? null : candInputData, (4194304 & i2) != 0 ? null : c1177960gl8, (8388608 & i2) != 0 ? false : z4, (16777216 & i2) != 0 ? null : bool, (33554432 & i2) != 0 ? false : z5, (67108864 & i2) != 0 ? false : z6, (134217728 & i2) != 0 ? false : z7, (i2 & 268435456) != 0 ? false : z8);
    }
}
