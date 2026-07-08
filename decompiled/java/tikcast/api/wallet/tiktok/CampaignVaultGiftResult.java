package tikcast.api.wallet.tiktok;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class CampaignVaultGiftResult {

    @C09CT("data")
    public CampaignVaultGiftData data;

    public static final class CampaignVaultGiftData {

        @C09CT("gifts")
        public List<VaultGift> gifts = new ArrayList();

        @C09CT("is_eligible")
        public boolean isEligible;
    }

    public static final class VaultGift {

        @C09CT("booster")
        public Booster booster;

        @C09CT("gift_id")
        public long giftId;

        @C09CT("gift_level")
        public long giftLevel;

        @C09CT("is_selected")
        public boolean isSelected;

        @C09CT("is_unlock")
        public boolean isUnlock;

        @C09CT("shop_end_time")
        public long shopEndTime;

        @C09CT("shop_start_time")
        public long shopStartTime;

        @C09CT("total_coins")
        public long totalCoins;

        @C09CT("unlock_distance")
        public long unlockDistance;

        @C09CT("gift_icon_uri")
        public String giftIconUri = "";

        @C09CT("vault_schema_url")
        public String vaultSchemaUrl = "";
    }
}
