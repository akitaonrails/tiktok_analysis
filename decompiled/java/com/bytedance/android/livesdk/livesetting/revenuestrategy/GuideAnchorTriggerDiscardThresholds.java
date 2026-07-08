package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import X.AnonymousClass0206;
import X.C01GW;
import X.C163200ju;
import X.C2097608Jq;
import X.C292401Bi;
import com.bytedance.android.live.annotation.SettingsKey;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("anchor_gift_guide_trigger_discard_thresholds")
public final class GuideAnchorTriggerDiscardThresholds {
    public static final GuideAnchorTriggerDiscardThresholds INSTANCE = new GuideAnchorTriggerDiscardThresholds();
    public static final Map<String, Object> DEFAULT = C2097608Jq.LJ();
    public static final C01GW settings$delegate = C292401Bi.LIZ(AnonymousClass0206.get$arr$(79));

    private final Map<String, Object> getSettings() {
        return (Map) settings$delegate.getValue();
    }

    public final long getThreshold(String str) {
        Object obj;
        Map<String, Object> settings = getSettings();
        if (settings != null && (obj = settings.get(str)) != null) {
            return C163200ju.LIZ(obj);
        }
        return 0L;
    }
}
