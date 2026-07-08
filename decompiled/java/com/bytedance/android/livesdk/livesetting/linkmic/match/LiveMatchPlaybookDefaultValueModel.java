package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveMatchPlaybookDefaultValueModel {
    public static final TypeAdapter ADAPTER = new LiveMatchPlaybookDefaultValueModel_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_match_entity_edit")
    public boolean enableMatchEntityEdit;

    @C09CT("match_gameplay_option")
    public int matchGameplayOption;

    public LiveMatchPlaybookDefaultValueModel() {
        this(0, false);
    }

    public LiveMatchPlaybookDefaultValueModel(int i, boolean z) {
        this.matchGameplayOption = i;
        this.enableMatchEntityEdit = z;
    }
}
