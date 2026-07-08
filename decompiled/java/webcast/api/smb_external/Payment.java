package webcast.api.smb_external;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class Payment {

    @C09CT("amount")
    public double amount;

    @C09CT("successful")
    public boolean successful;

    @C09CT("external_id")
    public String externalId = "";

    @C09CT("provider")
    public String provider = "";

    @C09CT("currency")
    public String currency = "";

    @C09CT("terms")
    public String terms = "";
}
