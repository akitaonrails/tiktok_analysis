package com.ss.android.ugc.aweme.ecommerce.base.osp.payment;

import X.C004I;
import X.C03Z2;
import X.C03Z3;
import X.C03ZZ;
import X.C13BV;
import X.C786410Ut5;
import X.C948003nC;
import X.EnumC880203cG;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentState implements C004I {
    public static final int $stable = 8;
    public final Integer abnormalStatus;
    public final C948003nC<String> bindCardErrorAction;
    public final String bindCardErrorMsg;
    public final Object buttonTrigger;
    public final EnumC880203cG changeBindCardStatus;
    public final PaymentMethod checkedAnchorPaymentMethod;
    public final PaymentMethod checkedCreditMethod;
    public final PaymentMethod checkedPaymentMethod;
    public Object chooseSaveStatus;
    public final C03Z2 dialogContent;
    public final boolean emailHintVisible;
    public final ExceptionUX exceptionUX;
    public final Object installmentPlanChanged;
    public final PaymentInfo paymentInfo;
    public final C948003nC<PaymentInfo> paymentInfoForNextStep;
    public final PaymentInfo paymentInfoForThreeStepCache;
    public final List<Object> paymentList;
    public final Object resendPayAction;
    public final Object scrollUpAction;
    public final Integer scrollUpDistance;
    public final boolean showLoading;
    public final Object subPaymentMethodIsChecked;
    public final C03Z3 summary;
    public final C03ZZ summaryPanelStatus;
    public final String systemError;
    public final C948003nC<String> toast;

    public PaymentState() {
        this(null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108863, null);
    }

    public final PaymentState copy(PaymentMethod paymentMethod, List<? extends Object> list, PaymentInfo paymentInfo, String str, boolean z, PaymentInfo paymentInfo2, C948003nC<PaymentInfo> c948003nC, boolean z2, Object obj, Object obj2, Integer num, C948003nC<String> c948003nC2, PaymentMethod paymentMethod2, Object obj3, Integer num2, ExceptionUX exceptionUX, EnumC880203cG enumC880203cG, String str2, C948003nC<String> c948003nC3, Object obj4, Object obj5, PaymentMethod paymentMethod3, C03ZZ c03zz, C03Z3 c03z3, C03Z2 c03z2, Object obj6) {
        return new PaymentState(paymentMethod, list, paymentInfo, str, z, paymentInfo2, c948003nC, z2, obj, obj2, num, c948003nC2, paymentMethod2, obj3, num2, exceptionUX, enumC880203cG, str2, c948003nC3, obj4, obj5, paymentMethod3, c03zz, c03z3, c03z2, obj6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentState)) {
            return false;
        }
        PaymentState paymentState = (PaymentState) obj;
        return Intrinsics.LJFF(this.checkedPaymentMethod, paymentState.checkedPaymentMethod) && Intrinsics.LJFF(this.paymentList, paymentState.paymentList) && Intrinsics.LJFF(this.paymentInfo, paymentState.paymentInfo) && Intrinsics.LJFF(this.systemError, paymentState.systemError) && this.emailHintVisible == paymentState.emailHintVisible && Intrinsics.LJFF(this.paymentInfoForThreeStepCache, paymentState.paymentInfoForThreeStepCache) && Intrinsics.LJFF(this.paymentInfoForNextStep, paymentState.paymentInfoForNextStep) && this.showLoading == paymentState.showLoading && Intrinsics.LJFF(this.resendPayAction, paymentState.resendPayAction) && Intrinsics.LJFF(this.scrollUpAction, paymentState.scrollUpAction) && Intrinsics.LJFF(this.scrollUpDistance, paymentState.scrollUpDistance) && Intrinsics.LJFF(this.toast, paymentState.toast) && Intrinsics.LJFF(this.checkedCreditMethod, paymentState.checkedCreditMethod) && Intrinsics.LJFF(this.installmentPlanChanged, paymentState.installmentPlanChanged) && Intrinsics.LJFF(this.abnormalStatus, paymentState.abnormalStatus) && Intrinsics.LJFF(this.exceptionUX, paymentState.exceptionUX) && this.changeBindCardStatus == paymentState.changeBindCardStatus && Intrinsics.LJFF(this.bindCardErrorMsg, paymentState.bindCardErrorMsg) && Intrinsics.LJFF(this.bindCardErrorAction, paymentState.bindCardErrorAction) && Intrinsics.LJFF(this.chooseSaveStatus, paymentState.chooseSaveStatus) && Intrinsics.LJFF(this.subPaymentMethodIsChecked, paymentState.subPaymentMethodIsChecked) && Intrinsics.LJFF(this.checkedAnchorPaymentMethod, paymentState.checkedAnchorPaymentMethod) && this.summaryPanelStatus == paymentState.summaryPanelStatus && Intrinsics.LJFF(this.summary, paymentState.summary) && Intrinsics.LJFF(this.dialogContent, paymentState.dialogContent) && Intrinsics.LJFF(this.buttonTrigger, paymentState.buttonTrigger);
    }

    public int hashCode() {
        PaymentMethod paymentMethod = this.checkedPaymentMethod;
        int iHashCode = (((paymentMethod == null ? 0 : paymentMethod.hashCode()) * 31) + this.paymentList.hashCode()) * 31;
        PaymentInfo paymentInfo = this.paymentInfo;
        int iHashCode2 = (iHashCode + (paymentInfo == null ? 0 : paymentInfo.hashCode())) * 31;
        String str = this.systemError;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.emailHintVisible)) * 31;
        PaymentInfo paymentInfo2 = this.paymentInfoForThreeStepCache;
        int iHashCode4 = (iHashCode3 + (paymentInfo2 == null ? 0 : paymentInfo2.hashCode())) * 31;
        C948003nC<PaymentInfo> c948003nC = this.paymentInfoForNextStep;
        int iHashCode5 = (((iHashCode4 + (c948003nC == null ? 0 : c948003nC.hashCode())) * 31) + C786410Ut5.Z2(this.showLoading)) * 31;
        Object obj = this.resendPayAction;
        int iHashCode6 = (iHashCode5 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.scrollUpAction;
        int iHashCode7 = (iHashCode6 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Integer num = this.scrollUpDistance;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        C948003nC<String> c948003nC2 = this.toast;
        int iHashCode9 = (iHashCode8 + (c948003nC2 == null ? 0 : c948003nC2.hashCode())) * 31;
        PaymentMethod paymentMethod2 = this.checkedCreditMethod;
        int iHashCode10 = (iHashCode9 + (paymentMethod2 == null ? 0 : paymentMethod2.hashCode())) * 31;
        Object obj3 = this.installmentPlanChanged;
        int iHashCode11 = (iHashCode10 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Integer num2 = this.abnormalStatus;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        ExceptionUX exceptionUX = this.exceptionUX;
        int iHashCode13 = (iHashCode12 + (exceptionUX == null ? 0 : exceptionUX.hashCode())) * 31;
        EnumC880203cG enumC880203cG = this.changeBindCardStatus;
        int iHashCode14 = (iHashCode13 + (enumC880203cG == null ? 0 : enumC880203cG.hashCode())) * 31;
        String str2 = this.bindCardErrorMsg;
        int iHashCode15 = (iHashCode14 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C948003nC<String> c948003nC3 = this.bindCardErrorAction;
        int iHashCode16 = (iHashCode15 + (c948003nC3 == null ? 0 : c948003nC3.hashCode())) * 31;
        Object obj4 = this.chooseSaveStatus;
        int iHashCode17 = (iHashCode16 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Object obj5 = this.subPaymentMethodIsChecked;
        int iHashCode18 = (iHashCode17 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        PaymentMethod paymentMethod3 = this.checkedAnchorPaymentMethod;
        int iHashCode19 = (((iHashCode18 + (paymentMethod3 == null ? 0 : paymentMethod3.hashCode())) * 31) + this.summaryPanelStatus.hashCode()) * 31;
        C03Z3 c03z3 = this.summary;
        int iHashCode20 = (iHashCode19 + (c03z3 == null ? 0 : c03z3.hashCode())) * 31;
        C03Z2 c03z2 = this.dialogContent;
        int iHashCode21 = (iHashCode20 + (c03z2 == null ? 0 : c03z2.hashCode())) * 31;
        Object obj6 = this.buttonTrigger;
        return iHashCode21 + (obj6 != null ? obj6.hashCode() : 0);
    }

    public String toString() {
        return "PaymentState(checkedPaymentMethod=" + this.checkedPaymentMethod + ", paymentList=" + this.paymentList + ", paymentInfo=" + this.paymentInfo + ", systemError=" + this.systemError + ", emailHintVisible=" + this.emailHintVisible + ", paymentInfoForThreeStepCache=" + this.paymentInfoForThreeStepCache + ", paymentInfoForNextStep=" + this.paymentInfoForNextStep + ", showLoading=" + this.showLoading + ", resendPayAction=" + this.resendPayAction + ", scrollUpAction=" + this.scrollUpAction + ", scrollUpDistance=" + this.scrollUpDistance + ", toast=" + this.toast + ", checkedCreditMethod=" + this.checkedCreditMethod + ", installmentPlanChanged=" + this.installmentPlanChanged + ", abnormalStatus=" + this.abnormalStatus + ", exceptionUX=" + this.exceptionUX + ", changeBindCardStatus=" + this.changeBindCardStatus + ", bindCardErrorMsg=" + this.bindCardErrorMsg + ", bindCardErrorAction=" + this.bindCardErrorAction + ", chooseSaveStatus=" + this.chooseSaveStatus + ", subPaymentMethodIsChecked=" + this.subPaymentMethodIsChecked + ", checkedAnchorPaymentMethod=" + this.checkedAnchorPaymentMethod + ", summaryPanelStatus=" + this.summaryPanelStatus + ", summary=" + this.summary + ", dialogContent=" + this.dialogContent + ", buttonTrigger=" + this.buttonTrigger + ')';
    }

    public final Integer getAbnormalStatus() {
        return this.abnormalStatus;
    }

    public final C948003nC<String> getBindCardErrorAction() {
        return this.bindCardErrorAction;
    }

    public final String getBindCardErrorMsg() {
        return this.bindCardErrorMsg;
    }

    public final Object getButtonTrigger() {
        return this.buttonTrigger;
    }

    public final EnumC880203cG getChangeBindCardStatus() {
        return this.changeBindCardStatus;
    }

    public final PaymentMethod getCheckedAnchorPaymentMethod() {
        return this.checkedAnchorPaymentMethod;
    }

    public final PaymentMethod getCheckedCreditMethod() {
        return this.checkedCreditMethod;
    }

    public final PaymentMethod getCheckedPaymentMethod() {
        return this.checkedPaymentMethod;
    }

    public final Object getChooseSaveStatus() {
        return this.chooseSaveStatus;
    }

    public final C03Z2 getDialogContent() {
        return this.dialogContent;
    }

    public final boolean getEmailHintVisible() {
        return this.emailHintVisible;
    }

    public final ExceptionUX getExceptionUX() {
        return this.exceptionUX;
    }

    public final Object getInstallmentPlanChanged() {
        return this.installmentPlanChanged;
    }

    public final PaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    public final C948003nC<PaymentInfo> getPaymentInfoForNextStep() {
        return this.paymentInfoForNextStep;
    }

    public final PaymentInfo getPaymentInfoForThreeStepCache() {
        return this.paymentInfoForThreeStepCache;
    }

    public final List<Object> getPaymentList() {
        return this.paymentList;
    }

    public final Object getResendPayAction() {
        return this.resendPayAction;
    }

    public final Object getScrollUpAction() {
        return this.scrollUpAction;
    }

    public final Integer getScrollUpDistance() {
        return this.scrollUpDistance;
    }

    public final boolean getShowLoading() {
        return this.showLoading;
    }

    public final Object getSubPaymentMethodIsChecked() {
        return this.subPaymentMethodIsChecked;
    }

    public final C03Z3 getSummary() {
        return this.summary;
    }

    public final C03ZZ getSummaryPanelStatus() {
        return this.summaryPanelStatus;
    }

    public final String getSystemError() {
        return this.systemError;
    }

    public final C948003nC<String> getToast() {
        return this.toast;
    }

    public final void setChooseSaveStatus(Object obj) {
        this.chooseSaveStatus = obj;
    }

    public PaymentState(PaymentMethod paymentMethod, List<? extends Object> list, PaymentInfo paymentInfo, String str, boolean z, PaymentInfo paymentInfo2, C948003nC<PaymentInfo> c948003nC, boolean z2, Object obj, Object obj2, Integer num, C948003nC<String> c948003nC2, PaymentMethod paymentMethod2, Object obj3, Integer num2, ExceptionUX exceptionUX, EnumC880203cG enumC880203cG, String str2, C948003nC<String> c948003nC3, Object obj4, Object obj5, PaymentMethod paymentMethod3, C03ZZ c03zz, C03Z3 c03z3, C03Z2 c03z2, Object obj6) {
        this.checkedPaymentMethod = paymentMethod;
        this.paymentList = list;
        this.paymentInfo = paymentInfo;
        this.systemError = str;
        this.emailHintVisible = z;
        this.paymentInfoForThreeStepCache = paymentInfo2;
        this.paymentInfoForNextStep = c948003nC;
        this.showLoading = z2;
        this.resendPayAction = obj;
        this.scrollUpAction = obj2;
        this.scrollUpDistance = num;
        this.toast = c948003nC2;
        this.checkedCreditMethod = paymentMethod2;
        this.installmentPlanChanged = obj3;
        this.abnormalStatus = num2;
        this.exceptionUX = exceptionUX;
        this.changeBindCardStatus = enumC880203cG;
        this.bindCardErrorMsg = str2;
        this.bindCardErrorAction = c948003nC3;
        this.chooseSaveStatus = obj4;
        this.subPaymentMethodIsChecked = obj5;
        this.checkedAnchorPaymentMethod = paymentMethod3;
        this.summaryPanelStatus = c03zz;
        this.summary = c03z3;
        this.dialogContent = c03z2;
        this.buttonTrigger = obj6;
    }

    public PaymentState(PaymentMethod paymentMethod, List list, PaymentInfo paymentInfo, String str, boolean z, PaymentInfo paymentInfo2, C948003nC c948003nC, boolean z2, Object obj, Object obj2, Integer num, C948003nC c948003nC2, PaymentMethod paymentMethod2, Object obj3, Integer num2, ExceptionUX exceptionUX, EnumC880203cG enumC880203cG, String str2, C948003nC c948003nC3, Object obj4, Object obj5, PaymentMethod paymentMethod3, C03ZZ c03zz, C03Z3 c03z3, C03Z2 c03z2, Object obj6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : paymentMethod, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? null : paymentInfo, (i & 8) != 0 ? null : str, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : paymentInfo2, (i & 64) != 0 ? null : c948003nC, (i & 128) == 0 ? z2 : false, (i & 256) != 0 ? null : obj, (i & 512) != 0 ? null : obj2, (i & 1024) != 0 ? null : num, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : c948003nC2, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : paymentMethod2, (i & 8192) != 0 ? null : obj3, (i & 16384) != 0 ? null : num2, (32768 & i) != 0 ? null : exceptionUX, (65536 & i) != 0 ? null : enumC880203cG, (131072 & i) != 0 ? null : str2, (262144 & i) != 0 ? null : c948003nC3, (524288 & i) != 0 ? null : obj4, (1048576 & i) != 0 ? null : obj5, (2097152 & i) != 0 ? null : paymentMethod3, (4194304 & i) != 0 ? C03ZZ.HIDE : c03zz, (8388608 & i) != 0 ? null : c03z3, (16777216 & i) != 0 ? null : c03z2, (i & 33554432) != 0 ? null : obj6);
    }
}
