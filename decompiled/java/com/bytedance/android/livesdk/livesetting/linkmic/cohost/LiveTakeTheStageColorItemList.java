package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveTakeTheStageColorItemList {
    public static final TypeAdapter ADAPTER = new LiveTakeTheStageColorItemList_OptTypeAdapter(NormalGson.singleton());

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public LiveTakeTheStageColorItem item0;

    @C09CT("1")
    public LiveTakeTheStageColorItem item1;

    @C09CT("2")
    public LiveTakeTheStageColorItem item2;

    @C09CT("3")
    public LiveTakeTheStageColorItem item3;
}
