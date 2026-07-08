package tikcast.api.wallet.tiktok;

import X.C09CT;
import webcast.data.RechargeCustomError;

/* JADX INFO: loaded from: classes28.dex */
public final class DiamondBuyResult {

    @C09CT("data")
    public DiamondBuyData data;

    @C09CT("extra")
    public DiamondBuyExtra extra;

    public static final class ABSPIPOInfo {

        @C09CT("coin_number")
        public int coinNumber;

        @C09CT("need_billing_address")
        public boolean needBillingAddress;

        @C09CT("show_tax")
        public boolean showTax;

        @C09CT("order_id")
        public String orderId = "";

        @C09CT("cashier_url")
        public String cashierUrl = "";

        @C09CT("payment_reference")
        public String paymentReference = "";

        @C09CT("merchant_id")
        public String merchantId = "";

        @C09CT("nonce")
        public String nonce = "";

        @C09CT("address")
        public String address = "";

        @C09CT("tax_money")
        public String taxMoney = "";

        @C09CT("tax_rate")
        public String taxRate = "";

        @C09CT("notify_url")
        public String notifyUrl = "";

        @C09CT("total_money")
        public String totalMoney = "";

        @C09CT("region")
        public String region = "";

        @C09CT("billing_address")
        public String billingAddress = "";

        @C09CT("money_before_tax")
        public String moneyBeforeTax = "";

        @C09CT("price_show_form")
        public String priceShowForm = "";

        @C09CT("store_region")
        public String storeRegion = "";

        @C09CT("pipo_domain")
        public String pipoDomain = "";

        @C09CT("currency")
        public String currency = "";
    }

    public static final class APPartnerAPIInAppRequest {

        @C09CT("request_body")
        public String requestBody = "";

        @C09CT("generic_product_id")
        public String genericProductId = "";
    }

    public static final class DiamondBuyData {

        @C09CT("abs_pipo_info")
        public ABSPIPOInfo absPipoInfo;

        @C09CT("order_platform")
        public int orderPlatform;

        @C09CT("pipo_details")
        public PIPODetails pipoDetails;

        @C09CT("order_id")
        public String orderId = "";

        @C09CT("params")
        public String params = "";
    }

    public static final class DiamondBuyExtra {

        @C09CT("backup_sku_recharge")
        public boolean backupSkuRecharge;

        @C09CT("custom_error")
        public RechargeCustomError customError;

        @C09CT("iap_fail_extra")
        public IapFailExtraData iapFailExtra;
    }

    public static final class IapFailExtraData {

        @C09CT("toast_message")
        public String toastMessage = "";
    }
}
