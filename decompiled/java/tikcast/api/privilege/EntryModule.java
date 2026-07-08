package tikcast.api.privilege;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class EntryModule {

    @C09CT("badge_entry")
    public BadgeEntry badgeEntry;

    @C09CT("base_container")
    public BaseContainer baseContainer;

    @C09CT("enigma_entry")
    public EnigmaModuleEntry enigmaEntry;

    @C09CT("entrance_spotlight_entry")
    public EntranceSpotlightEntry entranceSpotlightEntry;

    @C09CT("gift_entry")
    public GiftEntry giftEntry;

    @C09CT("gift_tray_sponsor_entry")
    public GiftTraySponserEntry giftTraySponsorEntry;

    @C09CT("guardian_entry")
    public GuardianModuleEntry guardianEntry;

    @C09CT("live_name_frame_entry")
    public LiveNameFrameEntry liveNameFrameEntry;

    @C09CT("match_pk_card_entry")
    public MatchPKCardEntry matchPkCardEntry;

    @C09CT("profile_frame_entry")
    public ProfileFrameEntry profileFrameEntry;

    @C09CT("vault_entry")
    public VaultEntry vaultEntry;

    @C09CT("voucher_entry")
    public VoucherModuleEntry voucherEntry;

    public static final class BaseContainer {

        @C09CT("asset_type")
        public int assetType;

        @C09CT("effective_object_num")
        public int effectiveObjectNum;

        @C09CT("module_id")
        public String moduleId = "";

        @C09CT("total_object_num")
        public int totalObjectNum;
    }
}
