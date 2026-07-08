package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C01GW;
import X.C09CT;
import X.C13BV;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_adaptive_rtc_media_info")
public final class LinkMicDynamicLayoutMediaSetting {
    public static final LinkMicDynamicLayoutMediaSetting INSTANCE = new LinkMicDynamicLayoutMediaSetting();
    public static final DynamicLayoutMediaConfig DEFAULT = new DynamicLayoutMediaConfig(false, null, null, 7, null);
    public static final C01GW config$delegate = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(73));

    public final DynamicLayoutMediaConfig getConfig() {
        return (DynamicLayoutMediaConfig) config$delegate.getValue();
    }

    public final boolean enable() {
        return getConfig().enable;
    }

    public final DynamicLayoutMediaConfig getDEFAULT() {
        return DEFAULT;
    }

    public static final class DynamicLayoutMediaConfig {
        public static final TypeAdapter ADAPTER = new LinkMicDynamicLayoutMediaSetting_DynamicLayoutMediaConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("black_list")
        public List<String> blackList;

        @C09CT("enable")
        public boolean enable;

        @C09CT("white_list")
        public List<String> whiteList;

        public DynamicLayoutMediaConfig() {
            this(false, null, null, 7, null);
        }

        public DynamicLayoutMediaConfig(boolean z, List<String> list, List<String> list2) {
            this.enable = z;
            this.whiteList = list;
            this.blackList = list2;
        }

        public DynamicLayoutMediaConfig(boolean z, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? C13BV.INSTANCE : list2);
        }
    }
}
