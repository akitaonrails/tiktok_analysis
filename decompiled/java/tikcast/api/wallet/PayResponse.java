package tikcast.api.wallet;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PayResponse {

    @C09CT("cashier_redirect_info")
    public CashierRedirectInfo cashierRedirectInfo;

    @C09CT("channel_sdk_info")
    public ChannelSdkInfo channelSdkInfo;

    @C09CT("merchant_operation_advice")
    public MerchantOperationAdvice merchantOperationAdvice;

    @C09CT("order_customized_info")
    public OrderCustomizedInfo orderCustomizedInfo;

    @C09CT("payment_method_info")
    public PayResultPaymentMethod paymentMethodInfo;

    @C09CT("pin_free_info")
    public PinFreeInfo pinFreeInfo;

    @C09CT("redirect_details")
    public RedirectDetails redirectDetails;

    @C09CT("retryable")
    public boolean retryable;

    @C09CT("rfi_collect_info")
    public RFICollectInfo rfiCollectInfo;

    @C09CT("error_code")
    public String errorCode = "";

    @C09CT("error_message")
    public String errorMessage = "";

    @C09CT("result_code")
    public String resultCode = "";

    @C09CT("payment_reference")
    public String paymentReference = "";

    @C09CT("present_to_shopper_details")
    public String presentToShopperDetails = "";

    @C09CT("payment_method_details")
    public String paymentMethodDetails = "";

    @C09CT("payment_method_token")
    public String paymentMethodToken = "";

    @C09CT("expiration_time")
    public String expirationTime = "";

    @C09CT("pay_expiration_time")
    public String payExpirationTime = "";

    @C09CT("nonce")
    public String nonce = "";

    @C09CT("sub_order_details")
    public List<OrderDetail> subOrderDetails = new ArrayList();

    @C09CT("pay_id")
    public String payId = "";

    @C09CT("upload_return_url")
    public String uploadReturnUrl = "";

    @C09CT("order_status")
    public String orderStatus = "";

    @C09CT("merchant_id")
    public String merchantId = "";

    @C09CT("sub_merchant_id")
    public String subMerchantId = "";

    @C09CT("merchant_user_id")
    public String merchantUserId = "";

    @C09CT("amount")
    public String amount = "";

    @C09CT("currency")
    public String currency = "";

    @C09CT("error_content")
    public String errorContent = "";

    @C09CT("cashier_action")
    public String cashierAction = "";

    @C09CT("success_time")
    public String successTime = "";

    @C09CT("total_marketing_amount")
    public String totalMarketingAmount = "";

    @C09CT("pipo_error_action")
    public String pipoErrorAction = "";
}
