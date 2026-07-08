package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveParamCheckDebugConfig {
    public static final TypeAdapter ADAPTER = new LiveParamCheckDebugConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("save_stack_trace_event_list")
    public List<String> saveStackTraceEventList;

    @C09CT("save_stack_trace_online")
    public boolean saveStackTraceOnline;

    public LiveParamCheckDebugConfig() {
        this(false, null, 3, null);
    }

    public final List<String> getSaveStackTraceEventList() {
        return this.saveStackTraceEventList;
    }

    public final boolean getSaveStackTraceOnline() {
        return this.saveStackTraceOnline;
    }

    public final void setSaveStackTraceEventList(List<String> list) {
        this.saveStackTraceEventList = list;
    }

    public final void setSaveStackTraceOnline(boolean z) {
        this.saveStackTraceOnline = z;
    }

    public LiveParamCheckDebugConfig(boolean z, List<String> list) {
        this.saveStackTraceOnline = z;
        this.saveStackTraceEventList = list;
    }

    public LiveParamCheckDebugConfig(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? Collections.singletonList("livesdk_anchor_invite_guest_connection") : list);
    }
}
