package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import X.C13LQ;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_pcs_new_leads_barrage_scene_key")
public final class LivePcsNewLeadsBarrageSceneKeySetting {
    public static final LivePcsNewLeadsBarrageSceneKeySetting INSTANCE = new LivePcsNewLeadsBarrageSceneKeySetting();
    public static final String[] DEFAULT = {"smb_leads_form_send", "smb_leads_dm_send"};

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_pcs_new_leads_barrage_scene_key", DEFAULT);
    }

    public final boolean isTargetScene(String str) {
        return C13LQ.LJIILLIIL(str, getValue());
    }
}
