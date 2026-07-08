package tikcast.api.wallet.tiktok;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class PIPODetails {

    @C09CT("ap_partner_api_in_app_request")
    public APPartnerAPIInAppRequest apPartnerApiInAppRequest;

    @C09CT("need_change_pipo_url")
    public boolean needChangePipoUrl;

    @C09CT("timestamp")
    public long timestamp;

    @C09CT("sign")
    public String sign = "";

    @C09CT("biz_content")
    public String bizContent = "";

    @C09CT("merchant_id")
    public String merchantId = "";

    @C09CT("method")
    public String method = "";

    @C09CT("pipo_url")
    public String pipoUrl = "";

    @C09CT("money_platform_url")
    public String moneyPlatformUrl = "";

    @C09CT("app_account_token")
    public String appAccountToken = "";

    @C09CT("iap_client_request_body")
    public String iapClientRequestBody = "";

    public static final class APPartnerAPIInAppRequest {

        @C09CT("request_body")
        public String requestBody = "";

        @C09CT("generic_product_id")
        public String genericProductId = "";
    }
}
