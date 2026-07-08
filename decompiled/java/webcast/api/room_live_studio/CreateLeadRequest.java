package webcast.api.room_live_studio;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class CreateLeadRequest {

    @C09CT("contact_method")
    public int contactMethod;

    @C09CT("product_id")
    public long productId;

    @C09CT("supplier_id")
    public long supplierId;

    @C09CT("tiktok_handle")
    public String tiktokHandle = "";

    @C09CT("city")
    public String city = "";

    @C09CT("postal_code")
    public String postalCode = "";

    @C09CT("encrypted_contact_value")
    public String encryptedContactValue = "";

    @C09CT("encrypted_aes_key")
    public String encryptedAesKey = "";

    @C09CT("idempotency_key")
    public String idempotencyKey = "";
}
