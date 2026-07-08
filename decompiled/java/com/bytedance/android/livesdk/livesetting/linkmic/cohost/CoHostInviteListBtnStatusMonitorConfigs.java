package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class CoHostInviteListBtnStatusMonitorConfigs {
    public static final TypeAdapter ADAPTER = new CoHostInviteListBtnStatusMonitorConfigs_OptTypeAdapter(NormalGson.singleton());

    @C09CT("hit_statuses")
    public List<Integer> hitStatuses;

    @C09CT("invitee_lists")
    public List<Integer> inviteeLists;

    @C09CT("transitions")
    public Map<Integer, ? extends List<Integer>> transitions;

    public CoHostInviteListBtnStatusMonitorConfigs() {
        C13BV c13bv = C13BV.INSTANCE;
        this.hitStatuses = c13bv;
        this.transitions = C2097608Jq.LJ();
        this.inviteeLists = c13bv;
    }
}
