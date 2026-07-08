package com.ss.android.ugc.aweme.setting.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class SecondPartyPartnerAuth {

    @C09CT("auth_apps")
    public List<AuthorizedStruct> authApps;

    @C09CT("second_party_access_title")
    public String secondPartyAccessTitle;

    @C09CT("second_party_partner_enum")
    public String secondPartyPartnerEnum;

    @C09CT("second_party_partner_name")
    public String secondPartyPartnerName;

    public SecondPartyPartnerAuth() {
        this(null, null, null, null);
    }

    public SecondPartyPartnerAuth(String str, String str2, List<AuthorizedStruct> list, String str3) {
        this.secondPartyPartnerName = str;
        this.secondPartyPartnerEnum = str2;
        this.authApps = list;
        this.secondPartyAccessTitle = str3;
    }
}
