package tikcast.api.wallet.w_quickcharge;

import X.C09CT;
import com.bytedance.android.live.wallet.model.CurrencyPriceItem;
import com.bytedance.android.livesdk.wallet.Diamond;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class GetWQuickChargePackagesResponse {

    @C09CT("data")
    public Data data;

    public static final class DailyCap {

        @C09CT("default_value")
        public long defaultValue;

        @C09CT("options")
        public List<Long> options = new ArrayList();
    }

    public static final class DailyLimit {

        @C09CT("default_value")
        public long defaultValue;

        @C09CT("options")
        public List<Long> options = new ArrayList();
    }

    public static final class Data {

        @C09CT("daily_cap")
        public DailyCap dailyCap;

        @C09CT("daily_limit")
        public DailyLimit dailyLimit;

        @C09CT("default_package_id")
        public long defaultPackageId;

        @C09CT("packages")
        public List<Diamond> packages = new ArrayList();

        @C09CT("threshold")
        public Threshold threshold;

        @C09CT("unit_price")
        public CurrencyPriceItem unitPrice;
    }

    public static final class Threshold {

        @C09CT("default_value")
        public long defaultValue;

        @C09CT("max_value")
        public long maxValue;

        @C09CT("recommendations")
        public List<Long> recommendations = new ArrayList();
    }
}
