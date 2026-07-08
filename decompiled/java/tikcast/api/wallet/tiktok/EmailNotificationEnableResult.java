package tikcast.api.wallet.tiktok;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class EmailNotificationEnableResult {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("cashback_percent")
        public int cashbackPercent;

        @C09CT("delay_voucher")
        public boolean delayVoucher;

        @C09CT("success")
        public boolean success;

        @C09CT("voucher_list")
        public List<VoucherItem> voucherList = new ArrayList();
    }
}
