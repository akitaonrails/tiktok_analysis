package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveCohostInvitationOverIssuranceConfig {
    public static final TypeAdapter ADAPTER = new LiveCohostInvitationOverIssuranceConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enabled")
    public int enabled;

    @C09CT("maximum_invitable_mic_slots")
    public int maximumInvitableMicSlots;

    @C09CT("source_type_list")
    public int[] sourceTypeList;

    public LiveCohostInvitationOverIssuranceConfig() {
        this(0, 3, new int[0]);
    }

    public final int getEnabled() {
        return this.enabled;
    }

    public final int getMaximumInvitableMicSlots() {
        return this.maximumInvitableMicSlots;
    }

    public final int[] getSourceTypeList() {
        return this.sourceTypeList;
    }

    public final void setEnabled(int i) {
        this.enabled = i;
    }

    public final void setMaximumInvitableMicSlots(int i) {
        this.maximumInvitableMicSlots = i;
    }

    public final void setSourceTypeList(int[] iArr) {
        this.sourceTypeList = iArr;
    }

    public LiveCohostInvitationOverIssuranceConfig(int i, int i2, int[] iArr) {
        this.enabled = i;
        this.maximumInvitableMicSlots = i2;
        this.sourceTypeList = iArr;
    }
}
