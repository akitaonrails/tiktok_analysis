package com.bytedance.android.livesdk.livesetting.redenvelope;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.model.RedEnvelopeUrls;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_golden_envelope_schemes")
public final class RedEnvelopeURLConfig {
    public static final RedEnvelopeURLConfig INSTANCE = new RedEnvelopeURLConfig();
    public static RedEnvelopeUrls DEFAULT = new RedEnvelopeUrls();

    public final String getSendUrl() {
        RedEnvelopeUrls redEnvelopeUrls = (RedEnvelopeUrls) SettingsManager.INSTANCE.getValueSafely("live_golden_envelope_schemes", DEFAULT);
        if (redEnvelopeUrls != null) {
            return redEnvelopeUrls.sendUrl;
        }
        return null;
    }

    public final String getShortTouchUrl() {
        RedEnvelopeUrls redEnvelopeUrls = (RedEnvelopeUrls) SettingsManager.INSTANCE.getValueSafely("live_golden_envelope_schemes", DEFAULT);
        if (redEnvelopeUrls != null) {
            return redEnvelopeUrls.shortTouchUrl;
        }
        return null;
    }

    public final RedEnvelopeUrls getDEFAULT() {
        return DEFAULT;
    }

    public final void setDEFAULT(RedEnvelopeUrls redEnvelopeUrls) {
        DEFAULT = redEnvelopeUrls;
    }
}
