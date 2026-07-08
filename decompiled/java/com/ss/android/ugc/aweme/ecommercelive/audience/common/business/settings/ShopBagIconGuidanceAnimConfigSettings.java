package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes33.dex */
public final class ShopBagIconGuidanceAnimConfigSettings {
    public static final ECShopBagGuidanceAnimConfig LIZ = new ECShopBagGuidanceAnimConfig(new ECShopBagAnimConfig(0L, 1500L, 3, 5), new ECShopBagLottieUrls("https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_bag/bag_text_before.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_bag/bag_no_text_before.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_cart/cart_text_before.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_cart/cart_no_text_before.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_bag/bag_text_after.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_bag/bag_no_text_after.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_cart/cart_text_after.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_cart/cart_no_text_after.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_bag/bag_pin_connect_before.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_cart/cart_pin_connect_before.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_bag/bag_pin_connect_after.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_cart/cart_pin_connect_after.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_new_bag/new_bag_pin_connect_before.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_new_bag/new_bag_pin_connect_after.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_new_bag/new_bag_pin_close_v3.zip"));

    /* JADX INFO: loaded from: classes32.dex */
    public static final class ECShopBagAnimConfig {

        @C09CT("anim_show_max_user_count")
        public final Integer animShowMaxUserCount;

        @C09CT("delay_request_time")
        public final Long delayRequestTime;

        @C09CT("shop_bag_click_max_time")
        public final Integer shopBagClickMaxTime;

        @C09CT("wait_request_time")
        public final Long waitRequestTime;

        public ECShopBagAnimConfig() {
            this(0L, 1500L, 3, 5);
        }

        public ECShopBagAnimConfig(Long l, Long l2, Integer num, Integer num2) {
            this.delayRequestTime = l;
            this.waitRequestTime = l2;
            this.shopBagClickMaxTime = num;
            this.animShowMaxUserCount = num2;
        }
    }

    public static final class ECShopBagGuidanceAnimConfig {

        @C09CT("ec_shop_bag_animation_frequency_control")
        public final ECShopBagAnimConfig config;

        @C09CT("ec_shop_bag_lottie_urls")
        public final ECShopBagLottieUrls lottieUrls;

        public ECShopBagGuidanceAnimConfig() {
            this(new ECShopBagAnimConfig(0L, 1500L, 3, 5), new ECShopBagLottieUrls("https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_bag/bag_text_before.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_bag/bag_no_text_before.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_cart/cart_text_before.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_cart/cart_no_text_before.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_bag/bag_text_after.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_bag/bag_no_text_after.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_cart/cart_text_after.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_cart/cart_no_text_after.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_bag/bag_pin_connect_before.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_cart/cart_pin_connect_before.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_bag/bag_pin_connect_after.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_cart/cart_pin_connect_after.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_new_bag/new_bag_pin_connect_before.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_new_bag/new_bag_pin_connect_after.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_new_bag/new_bag_pin_close_v3.zip"));
        }

        public ECShopBagGuidanceAnimConfig(ECShopBagAnimConfig eCShopBagAnimConfig, ECShopBagLottieUrls eCShopBagLottieUrls) {
            this.config = eCShopBagAnimConfig;
            this.lottieUrls = eCShopBagLottieUrls;
        }
    }

    public static final class ECShopBagLottieUrls {

        @C09CT("anim_new_bag_for_pin_close")
        public final String animBagAfterPinBeforeBubble;

        @C09CT("anim_bag_bubble_no_text_after")
        public final String animBagBubbleNoTextAfter;

        @C09CT("anim_bag_bubble_no_text_before")
        public final String animBagBubbleNoTextBefore;

        @C09CT("anim_bag_bubble_with_text_after")
        public final String animBagBubbleWithTextAfter;

        @C09CT("anim_bag_bubble_with_text_before")
        public final String animBagBubbleWithTextBefore;

        @C09CT("anim_bag_for_pin_after")
        public final String animBagPinAfter;

        @C09CT("anim_bag_for_pin_before")
        public final String animBagPinBefore;

        @C09CT("anim_cart_bubble_no_text_after")
        public final String animCartBubbleNoTextAfter;

        @C09CT("anim_cart_bubble_no_text_before")
        public final String animCartBubbleNoTextBefore;

        @C09CT("anim_cart_bubble_with_text_after")
        public final String animCartBubbleWithTextAfter;

        @C09CT("anim_cart_bubble_with_text_before")
        public final String animCartBubbleWithTextBefore;

        @C09CT("anim_cart_for_pin_after")
        public final String animCartPinAfter;

        @C09CT("anim_cart_for_pin_before")
        public final String animCartPinBefore;

        @C09CT("anim_new_bag_for_pin_after")
        public final String animNewBagPinAfter;

        @C09CT("anim_new_bag_for_pin_before")
        public final String animNewBagPinBefore;

        public ECShopBagLottieUrls() {
            this("https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_bag/bag_text_before.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_bag/bag_no_text_before.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_cart/cart_text_before.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_cart/cart_no_text_before.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_bag/bag_text_after.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_bag/bag_no_text_after.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_cart/cart_text_after.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_cart/cart_no_text_after.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_bag/bag_pin_connect_before.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_cart/cart_pin_connect_before.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_bag/bag_pin_connect_after.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_cart/cart_pin_connect_after.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_new_bag/new_bag_pin_connect_before.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_new_bag/new_bag_pin_connect_after.zip", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_new_bag/new_bag_pin_close_v3.zip");
        }

        public ECShopBagLottieUrls(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
            this.animBagBubbleWithTextBefore = str;
            this.animBagBubbleNoTextBefore = str2;
            this.animCartBubbleWithTextBefore = str3;
            this.animCartBubbleNoTextBefore = str4;
            this.animBagBubbleWithTextAfter = str5;
            this.animBagBubbleNoTextAfter = str6;
            this.animCartBubbleWithTextAfter = str7;
            this.animCartBubbleNoTextAfter = str8;
            this.animBagPinBefore = str9;
            this.animCartPinBefore = str10;
            this.animBagPinAfter = str11;
            this.animCartPinAfter = str12;
            this.animNewBagPinBefore = str13;
            this.animNewBagPinAfter = str14;
            this.animBagAfterPinBeforeBubble = str15;
        }
    }

    public static final ECShopBagGuidanceAnimConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ECShopBagGuidanceAnimConfig eCShopBagGuidanceAnimConfig = LIZ;
        ECShopBagGuidanceAnimConfig eCShopBagGuidanceAnimConfig2 = (ECShopBagGuidanceAnimConfig) settingsManagerLIZLLL.LJIIIIZZ("ec_shop_bag_guidance_animation_settings", ECShopBagGuidanceAnimConfig.class, eCShopBagGuidanceAnimConfig);
        return eCShopBagGuidanceAnimConfig2 != null ? eCShopBagGuidanceAnimConfig2 : eCShopBagGuidanceAnimConfig;
    }
}
