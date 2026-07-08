package tikcast.api.privilege.enigma;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class EnigmaHomePageResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("home")
        public EnigmaHomePageData home;

        @C09CT("is_whitelist_user")
        public boolean isWhitelistUser;
    }
}
