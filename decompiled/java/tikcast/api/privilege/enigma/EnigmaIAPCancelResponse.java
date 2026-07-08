package tikcast.api.privilege.enigma;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class EnigmaIAPCancelResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("contract_id")
        public String contractId = "";

        @C09CT("sub_info")
        public EnigmaSubscriptionInfo subInfo;

        @C09CT("user_enigma")
        public UserEnigma userEnigma;
    }
}
