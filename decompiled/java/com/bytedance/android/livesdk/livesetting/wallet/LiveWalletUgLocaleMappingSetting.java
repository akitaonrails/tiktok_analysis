package com.bytedance.android.livesdk.livesetting.wallet;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.u;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_wallet_ug_locale_mapping")
public final class LiveWalletUgLocaleMappingSetting {
    public static final LiveWalletUgLocaleMappingSetting INSTANCE = new LiveWalletUgLocaleMappingSetting();
    public static final Map<String, String> DEFAULT = C2097608Jq.LJIIIIZZ(new Pair("BRL", "pt-BR"), new Pair("JPY", "ja-JP"), new Pair("IDR", "id-ID"));

    private final Map<String, String> convertUnderscores() {
        Map<String, String> map = (Map) SettingsManager.INSTANCE.getValueSafely("live_wallet_ug_locale_mapping", DEFAULT);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                map.put(entry.getKey(), u.LJJIFFI(entry.getValue(), "_", "-", false));
            }
        }
        return map;
    }

    public final Map<String, String> getValue() {
        Map<String, String> mapConvertUnderscores = convertUnderscores();
        return mapConvertUnderscores == null ? DEFAULT : mapConvertUnderscores;
    }
}
