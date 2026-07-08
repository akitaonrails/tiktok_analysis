package tikcast.api.privilege.enigma;

import X.C09CT;
import webcast.data.RechargeCustomError;

/* JADX INFO: loaded from: classes.dex */
public final class EnigmaPurchaseResponse {

    @C09CT("data")
    public Data data;

    @C09CT("extra")
    public Extra extra;

    public static final class Data {

        @C09CT("user_balance")
        public long userBalance;

        @C09CT("user_enigma")
        public UserEnigma userEnigma;
    }

    public static final class Extra extends com.bytedance.android.livesdk.model.Extra {

        @C09CT("custom_error")
        public RechargeCustomError customError;
    }
}
