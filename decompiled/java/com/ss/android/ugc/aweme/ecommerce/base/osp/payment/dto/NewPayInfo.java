package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;
import X.C882303cb;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class NewPayInfo {

    @C09CT("channel_sdk_data")
    public final String channelSdkData;

    @C09CT("material_collection_info")
    public final String materialCollectionInfo;

    @C09CT("merchant_operation_advice_prompt")
    public final MerchantOperationAdvicePrompt merchantOperationAdvicePrompt;

    @C09CT("package_name")
    public final String packageName;

    @C09CT("pay_error_toast")
    public final PayErrorToast payErrorToast;

    @C09CT("pay_result")
    public final PayResult payResult;

    @C09CT("poll_result_time")
    public final List<PollResultTime> pollResultTime;

    @C09CT("redirect_details")
    public final RedirectDetails redirectDetails;

    @C09CT("redirect_url")
    public final String redirectUrl;

    @C09CT("vacode")
    public final String vaCode;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NewPayInfo(redirectUrl=");
        sbLIZ.append(this.redirectUrl);
        sbLIZ.append(", payResult=");
        sbLIZ.append(this.payResult);
        sbLIZ.append(", payErrorToast=");
        sbLIZ.append(this.payErrorToast);
        sbLIZ.append(", packageName=");
        sbLIZ.append(this.packageName);
        sbLIZ.append(", channelSdkData=");
        sbLIZ.append(this.channelSdkData);
        sbLIZ.append(", redirectDetails=");
        sbLIZ.append(this.redirectDetails);
        sbLIZ.append(", pollResultTime=");
        sbLIZ.append(this.pollResultTime);
        sbLIZ.append(", vaCode=");
        sbLIZ.append(this.vaCode);
        sbLIZ.append(", merchantOperationAdvicePrompt=");
        sbLIZ.append(this.merchantOperationAdvicePrompt);
        sbLIZ.append(", materialCollectionInfo=");
        sbLIZ.append(this.materialCollectionInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final MaterialCollectionInfo LIZIZ() {
        return C882303cb.LIZ(this.materialCollectionInfo);
    }

    public static NewPayInfo LIZ(NewPayInfo newPayInfo, PayResult payResult) {
        String str = newPayInfo.redirectUrl;
        PayErrorToast payErrorToast = newPayInfo.payErrorToast;
        String str2 = newPayInfo.packageName;
        String str3 = newPayInfo.channelSdkData;
        RedirectDetails redirectDetails = newPayInfo.redirectDetails;
        List<PollResultTime> list = newPayInfo.pollResultTime;
        String str4 = newPayInfo.vaCode;
        MerchantOperationAdvicePrompt merchantOperationAdvicePrompt = newPayInfo.merchantOperationAdvicePrompt;
        String str5 = newPayInfo.materialCollectionInfo;
        newPayInfo.getClass();
        return new NewPayInfo(str, payResult, payErrorToast, str2, str3, redirectDetails, list, str4, merchantOperationAdvicePrompt, str5);
    }

    public NewPayInfo(String str, PayResult payResult, PayErrorToast payErrorToast, String str2, String str3, RedirectDetails redirectDetails, List<PollResultTime> list, String str4, MerchantOperationAdvicePrompt merchantOperationAdvicePrompt, String str5) {
        this.redirectUrl = str;
        this.payResult = payResult;
        this.payErrorToast = payErrorToast;
        this.packageName = str2;
        this.channelSdkData = str3;
        this.redirectDetails = redirectDetails;
        this.pollResultTime = list;
        this.vaCode = str4;
        this.merchantOperationAdvicePrompt = merchantOperationAdvicePrompt;
        this.materialCollectionInfo = str5;
    }
}
