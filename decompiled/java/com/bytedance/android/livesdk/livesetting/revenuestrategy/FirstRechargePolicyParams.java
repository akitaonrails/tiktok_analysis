package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.google.gson.TypeAdapter;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes36.dex */
public final class FirstRechargePolicyParams {
    public static final TypeAdapter ADAPTER = new FirstRechargePolicyParams_OptTypeAdapter(NormalGson.singleton());

    @C09CT("exchange_policy_template_starling_key_ex")
    public String exExchangeTemplate;

    @C09CT("exchange_policy_starling_keys")
    public List<String> exchangePolicyKey;

    @C09CT("exchange_policy_urls")
    public List<String> exchangePolicyUrl;

    @C09CT("exchange_policy_template_starling_key")
    public String exchangeTemplate;

    @C09CT("is_show_recharge_rule_in_region")
    public boolean isRegionRuleShow;

    @C09CT("recharge_policy_starling_key")
    public String rechargePolicyKey;

    @C09CT("recharge_policy_starling_keys")
    public List<String> rechargePolicyKeyList;

    @C09CT("live_room_recharge_agreement_for_global")
    public String rechargePolicyUrl;

    @C09CT("recharge_policy_urls")
    public List<String> rechargePolicyUrlList;

    @C09CT("recharge_policy_template_starling_key")
    public String rechargeTemplate;

    @C09CT("live_room_recharge_agreement_for_region")
    public List<? extends Map<String, String>> reginPolicy;

    @C09CT("disclaimer_for_US")
    public boolean usDisclaimer;

    @C09CT("recharge_policy_template_starling_key_us")
    public String usRechargeTemplate;

    public FirstRechargePolicyParams() {
        this(null, null, null, null, null, false, null, false, null, null, null, null, null, 8191, null);
    }

    public FirstRechargePolicyParams(String str, String str2, String str3, String str4, String str5, boolean z, String str6, boolean z2, List<? extends Map<String, String>> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
        this.usRechargeTemplate = str;
        this.rechargeTemplate = str2;
        this.exExchangeTemplate = str3;
        this.exchangeTemplate = str4;
        this.rechargePolicyKey = str5;
        this.usDisclaimer = z;
        this.rechargePolicyUrl = str6;
        this.isRegionRuleShow = z2;
        this.reginPolicy = list;
        this.exchangePolicyKey = list2;
        this.exchangePolicyUrl = list3;
        this.rechargePolicyUrlList = list4;
        this.rechargePolicyKeyList = list5;
    }

    public FirstRechargePolicyParams(String str, String str2, String str3, String str4, String str5, boolean z, String str6, boolean z2, List list, List list2, List list3, List list4, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? false : z, (i & 64) == 0 ? str6 : "", (i & 128) == 0 ? z2 : false, (i & 256) != 0 ? C13BV.INSTANCE : list, (i & 512) != 0 ? C13BV.INSTANCE : list2, (i & 1024) != 0 ? C13BV.INSTANCE : list3, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C13BV.INSTANCE : list4, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? C13BV.INSTANCE : list5);
    }
}
