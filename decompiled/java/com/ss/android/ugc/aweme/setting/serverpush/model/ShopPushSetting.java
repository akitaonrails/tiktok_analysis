package com.ss.android.ugc.aweme.setting.serverpush.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class ShopPushSetting implements Serializable {

    @C09CT("shop_alerts_reminders_push")
    public final int shopAlertsRemindersPush;

    @C09CT("shop_tiktok_support_push")
    public final int shopCustomerSupportPush;

    @C09CT("shop_order_update_push")
    public final int shopOrderUpdatesPush;

    @C09CT("shop_promotions_push")
    public final int shopPromotionsPush;

    @C09CT("shop_sellers_chats_push")
    public final int shopSellersChatsPush;

    @C09CT("shop_surveys_push")
    public final int shopSurveysPush;

    public ShopPushSetting(int i, int i2, int i3, int i4, int i5, int i6) {
        this.shopOrderUpdatesPush = i;
        this.shopAlertsRemindersPush = i2;
        this.shopSurveysPush = i3;
        this.shopPromotionsPush = i4;
        this.shopSellersChatsPush = i5;
        this.shopCustomerSupportPush = i6;
    }
}
