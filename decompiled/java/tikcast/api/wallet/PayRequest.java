package tikcast.api.wallet;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PayRequest {

    @C09CT("configuration")
    public Configuration configuration;

    @C09CT("payment_extra_info")
    public PaymentExtraInfo paymentExtraInfo;

    @C09CT("payment_method")
    public PaymentMethod paymentMethod;

    @C09CT("store_payment_method")
    public boolean storePaymentMethod;

    @C09CT("charge_id")
    public String chargeId = "";

    @C09CT("risk_info")
    public String riskInfo = "";

    @C09CT("return_url")
    public String returnUrl = "";

    @C09CT("event_info")
    public String eventInfo = "";

    public static final class Configuration {

        @C09CT("locale")
        public String locale = "";

        @C09CT("color_theme")
        public String colorTheme = "";

        @C09CT("platform")
        public String platform = "";

        @C09CT("flow")
        public String flow = "";

        @C09CT("encrypted_source_config")
        public String encryptedSourceConfig = "";

        @C09CT("environment")
        public String environment = "";

        @C09CT("origin_key")
        public String originKey = "";

        @C09CT("proxy_id")
        public String proxyId = "";

        @C09CT("ab_groups")
        public List<ABGroups> abGroups = new ArrayList();

        public static final class ABGroups {

            @C09CT("exp_label")
            public String expLabel = "";

            @C09CT("group_version")
            public String groupVersion = "";
        }
    }
}
