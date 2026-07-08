package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveMatchInviteMockConfig {
    public static final TypeAdapter ADAPTER = new LiveMatchInviteMockConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("duplicate_invite")
    public boolean duplicateInvite;

    @C09CT("orphan_battle")
    public boolean orphanBattle;

    @C09CT("vm_cleared")
    public boolean vmCleared;

    public LiveMatchInviteMockConfig() {
        this(false, false, false);
    }

    public LiveMatchInviteMockConfig(boolean z, boolean z2, boolean z3) {
        this.orphanBattle = z;
        this.vmCleared = z2;
        this.duplicateInvite = z3;
    }
}
