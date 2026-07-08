package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class EventList {
    public static final TypeAdapter ADAPTER = new EventList_OptTypeAdapter(NormalGson.singleton());

    @C09CT("blocked_list")
    public List<String> blockedList = new ArrayList();

    @C09CT("audience_blocked_list")
    public List<String> audienceBlockedList = new ArrayList();
}
