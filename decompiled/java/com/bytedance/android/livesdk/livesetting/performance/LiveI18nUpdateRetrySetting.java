package com.bytedance.android.livesdk.livesetting.performance;

import X.C01GW;
import X.C09CT;
import X.C13LP;
import X.C1697810uHb;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.TypeAdapter;
import java.util.List;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_i18n_update_retry")
public final class LiveI18nUpdateRetrySetting {
    public static final LiveI18nUpdateRetrySetting INSTANCE = new LiveI18nUpdateRetrySetting();
    public static final I18nUpdateRetryConfig DEFAULT = new I18nUpdateRetryConfig(false, 3, C1697810uHb.LJIIJJI(3000L, 6000L, 9000L));
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(76));

    private final I18nUpdateRetryConfig getValue() {
        return (I18nUpdateRetryConfig) value$delegate.getValue();
    }

    public final boolean enable() {
        return getValue().getEnable();
    }

    public final int getMaxRetryCount() {
        return getValue().getMaxRetryCount();
    }

    public static final class I18nUpdateRetryConfig {
        public static final TypeAdapter ADAPTER = new LiveI18nUpdateRetrySetting_I18nUpdateRetryConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable")
        public boolean enable;

        @C09CT("max_retry_count")
        public int maxRetryCount;

        @C09CT("retry_intervals_ms")
        public List<Long> retryIntervalsMs;

        public I18nUpdateRetryConfig() {
            this(false, 3, C1697810uHb.LJIIJJI(3000L, 6000L, 9000L));
        }

        public final boolean getEnable() {
            return this.enable;
        }

        public final int getMaxRetryCount() {
            return this.maxRetryCount;
        }

        public final List<Long> getRetryIntervalsMs() {
            return this.retryIntervalsMs;
        }

        public final void setEnable(boolean z) {
            this.enable = z;
        }

        public final void setMaxRetryCount(int i) {
            this.maxRetryCount = i;
        }

        public final void setRetryIntervalsMs(List<Long> list) {
            this.retryIntervalsMs = list;
        }

        public I18nUpdateRetryConfig(boolean z, int i, List<Long> list) {
            this.enable = z;
            this.maxRetryCount = i;
            this.retryIntervalsMs = list;
        }
    }

    public final long getRetryIntervalMs(int i) {
        List<Long> retryIntervalsMs = getValue().getRetryIntervalsMs();
        if (retryIntervalsMs.isEmpty()) {
            return 9000L;
        }
        if (i > retryIntervalsMs.size()) {
            return ((Number) C13LP.LJJLIIIJJI(retryIntervalsMs)).longValue();
        }
        return ((Number) ListProtector.get(retryIntervalsMs, i - 1)).longValue();
    }
}
