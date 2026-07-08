package com.bytedance.android.livesdk.viewer_picks.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ControlChaosInfo {

    @C09CT("action_type")
    public int actionType;

    @C09CT("command_type")
    public int commandType;

    @C09CT("hot_keys")
    public List<HotKey> hotKeys = new ArrayList();
}
