package com.bytedance.android.livesdk.livesetting.wallet;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveWalletEmailIncentiveParams {
    public static final TypeAdapter ADAPTER = new LiveWalletEmailIncentiveParams_OptTypeAdapter(NormalGson.singleton());

    @C09CT("api_call_cooldown_seconds")
    public long apiCallCooldown;

    @C09CT("api_timeout_millis")
    public long apiTimeoutMillis;

    @C09CT("cashback_max_usd")
    public int cashbackMaxUsd;

    @C09CT("cashback_percent")
    public int cashbackPercent;

    @C09CT("after_recharge_cooldown_seconds")
    public long cooldownSeconds;

    @C09CT("email_voucher_template_id")
    public String emailVoucherTemplateId;

    @C09CT("feature_available_for_user")
    public boolean inExp;

    @C09CT("email_incentive_max_show_times")
    public int incentivePopupMaxShowTimes;

    public LiveWalletEmailIncentiveParams() {
        this(false, 900L, 0, "", 10, 2, 10000L, 86400L);
    }

    public LiveWalletEmailIncentiveParams(boolean z, long j, int i, String str, int i2, int i3, long j2, long j3) {
        this.inExp = z;
        this.apiCallCooldown = j;
        this.incentivePopupMaxShowTimes = i;
        this.emailVoucherTemplateId = str;
        this.cashbackMaxUsd = i2;
        this.cashbackPercent = i3;
        this.apiTimeoutMillis = j2;
        this.cooldownSeconds = j3;
    }
}
