package com.ss.android.ugc.aweme.localservice.live.common.config;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes29.dex */
public final class TtlsLiveConfigSettings {
    public static final TtlsLiveConfigModel LIZ;

    static {
        Integer numValueOf = Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT);
        LIZ = new TtlsLiveConfigModel(new PopCardConfigModel(null, null, numValueOf), new PreviewPopCardConfigModel(null, numValueOf), new ShopBagConfigModel(null, null, null, 2000, 800));
    }

    public static TtlsLiveConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        TtlsLiveConfigModel ttlsLiveConfigModel = LIZ;
        TtlsLiveConfigModel ttlsLiveConfigModel2 = (TtlsLiveConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ttls_live_config", TtlsLiveConfigModel.class, ttlsLiveConfigModel);
        return ttlsLiveConfigModel2 != null ? ttlsLiveConfigModel2 : ttlsLiveConfigModel;
    }

    public static final class PreviewPopCardConfigModel {

        @C09CT("product_card_schema")
        public final String productCardSchema;

        @C09CT("request_delay_range")
        public final Integer requestDelayRange;

        public PreviewPopCardConfigModel() {
            this(null, null);
        }

        public PreviewPopCardConfigModel(String str, Integer num) {
            this.productCardSchema = str;
            this.requestDelayRange = num;
        }
    }

    public static final class PopCardConfigModel {

        @C09CT("anchor_product_card_schema")
        public final String anchorProductCardSchema;

        @C09CT("audience_product_card_schema")
        public final String audienceProductCardSchema;

        @C09CT("request_delay_range")
        public final Integer requestDelayRange;

        public PopCardConfigModel() {
            this(null, null, null);
        }

        public PopCardConfigModel(String str, String str2, Integer num) {
            this.anchorProductCardSchema = str;
            this.audienceProductCardSchema = str2;
            this.requestDelayRange = num;
        }
    }

    public static final class TtlsLiveConfigModel {

        @C09CT("pop_card_config")
        public final PopCardConfigModel popCardConfig;

        @C09CT("preview_pop_card_config")
        public final PreviewPopCardConfigModel previewPopCardConfig;

        @C09CT("shop_bag_config")
        public final ShopBagConfigModel shopBagConfig;

        public TtlsLiveConfigModel() {
            this(null, null, null);
        }

        public TtlsLiveConfigModel(PopCardConfigModel popCardConfigModel, PreviewPopCardConfigModel previewPopCardConfigModel, ShopBagConfigModel shopBagConfigModel) {
            this.popCardConfig = popCardConfigModel;
            this.previewPopCardConfig = previewPopCardConfigModel;
            this.shopBagConfig = shopBagConfigModel;
        }
    }

    public static final class ShopBagConfigModel {

        @C09CT("anchor_bag_click_jump_url")
        public final String anchorBagClickJumpUrl;

        @C09CT("audience_admin_bag_click_jump_url")
        public final String audienceAdminBagClickJumpUrl;

        @C09CT("audience_bag_click_jump_url")
        public final String audienceBagClickJumpUrl;

        @C09CT("bubble_show_duration")
        public final Integer bubbleShowDuration;

        @C09CT("request_delay_range")
        public final Integer requestDelayRange;

        public ShopBagConfigModel() {
            this(null, null, null, null, null);
        }

        public ShopBagConfigModel(String str, String str2, String str3, Integer num, Integer num2) {
            this.anchorBagClickJumpUrl = str;
            this.audienceAdminBagClickJumpUrl = str2;
            this.audienceBagClickJumpUrl = str3;
            this.bubbleShowDuration = num;
            this.requestDelayRange = num2;
        }
    }
}
