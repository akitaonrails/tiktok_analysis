package tikcast.api.wallet.tiktok;

import X.C09CT;
import com.bytedance.android.livesdk.wallet.Diamond;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class PlatformPackageOptionsResult {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("web_packages")
        public List<Diamond> webPackages = new ArrayList();

        @C09CT("iap_packages")
        public List<Diamond> iapPackages = new ArrayList();
    }
}
