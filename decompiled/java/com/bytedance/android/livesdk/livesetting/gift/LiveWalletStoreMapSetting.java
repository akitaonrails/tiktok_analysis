package com.bytedance.android.livesdk.livesetting.gift;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_wallet_store_name_map")
public final class LiveWalletStoreMapSetting {
    public static final LiveWalletStoreMapSetting INSTANCE = new LiveWalletStoreMapSetting();
    public static final Map<String, String> DEFAULT = C2097608Jq.LJIIIIZZ(new Pair("huaweiadsglobal_int", "HUAWEI AppGallery"), new Pair("xiaomiglobal_int", "Xiaomi GetApps"), new Pair("vivoglobal_int", "V-Appstore"), new Pair("oppoglobal_int", "OPPO App Market"), new Pair("samsung_store", "Galaxy Store"), new Pair("transsion_1", "Palm Store"));

    public final Map<String, String> getValue() {
        return (Map) SettingsManager.INSTANCE.getValueSafely("live_wallet_store_name_map", DEFAULT);
    }

    public final String getStoreName(String str) {
        Map<String, String> value;
        if (str == null || (value = getValue()) == null) {
            return null;
        }
        return value.get(str);
    }
}
