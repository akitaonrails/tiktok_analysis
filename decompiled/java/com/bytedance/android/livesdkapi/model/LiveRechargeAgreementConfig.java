package com.bytedance.android.livesdkapi.model;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public class LiveRechargeAgreementConfig {
    public static final TypeAdapter ADAPTER = new LiveRechargeAgreementConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("live_room_recharge_agreement_for_global")
    public String agreementForGlobal;

    @C09CT("live_room_recharge_agreement_frozen_coins")
    public String agreementKeyForFrozenCoins;

    @C09CT("live_room_recharge_agreement_for_region")
    public List<AgreementForRegion> agreementsForRegion;

    @C09CT("frozen_coins_policy")
    public String frozenCoinsPolicyUrl;

    @C09CT("frozen_coins_policy_enable")
    public boolean isFrozenCoinsPolicyEnable;

    @C09CT("is_show_recharge_rule_in_global")
    public boolean isShowRechargeLawInGlobal;

    @C09CT("is_show_recharge_rule_in_region")
    public boolean isShowRechargeLawInRegion;

    @C09CT("is_show_recharge_rule_in_US")
    public boolean isShowRechargeLawInUS;

    @C09CT("live_room_recharge_vip_key_frozen_coins")
    public String lawNameKeyForFrozenCoins;

    @C09CT("retention_task_policy_body")
    public String retentionTaskPolicyBody;

    @C09CT("retention_task_policy_link")
    public String retentionTaskPolicyLink;

    @C09CT("retention_task_policy_name")
    public String retentionTaskPolicyName;

    /* JADX INFO: loaded from: classes18.dex */
    public static class AgreementForRegion {
        public static final TypeAdapter ADAPTER;

        @C09CT("title")
        public String lawName;

        @C09CT("url")
        public String lawUrl;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveRechargeAgreementConfig_AgreementForRegion_OptTypeAdapter();
        }
    }
}
