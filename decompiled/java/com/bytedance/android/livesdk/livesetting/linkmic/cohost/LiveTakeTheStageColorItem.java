package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveTakeTheStageColorItem {
    public static final TypeAdapter ADAPTER;

    @C09CT("contribute_list_color")
    public LiveTakeTheStageColor contributeListColor;

    @C09CT("led_component_color")
    public LiveTakeTheStageColor ledComponentColor;

    @C09CT("rank_component_color")
    public LiveTakeTheStageColor rankComponentColor;

    @C09CT("switch_turn_animation_color")
    public LiveTakeTheStageColor switchTurnAnimationColor;

    public LiveTakeTheStageColorItem() {
        this(null, null, null, null, 15, null);
    }

    static {
        new LiveTakeTheStageColorItem(null, null, null, null, 15, null);
        ADAPTER = new LiveTakeTheStageColorItem_OptTypeAdapter(NormalGson.singleton());
    }

    public LiveTakeTheStageColorItem(LiveTakeTheStageColor liveTakeTheStageColor, LiveTakeTheStageColor liveTakeTheStageColor2, LiveTakeTheStageColor liveTakeTheStageColor3, LiveTakeTheStageColor liveTakeTheStageColor4) {
        this.ledComponentColor = liveTakeTheStageColor;
        this.rankComponentColor = liveTakeTheStageColor2;
        this.switchTurnAnimationColor = liveTakeTheStageColor3;
        this.contributeListColor = liveTakeTheStageColor4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LiveTakeTheStageColorItem(LiveTakeTheStageColor liveTakeTheStageColor, LiveTakeTheStageColor liveTakeTheStageColor2, LiveTakeTheStageColor liveTakeTheStageColor3, LiveTakeTheStageColor liveTakeTheStageColor4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            LiveTakeTheStageColor liveTakeTheStageColor5 = LiveTakeTheStageColor.LIZ;
            liveTakeTheStageColor = LiveTakeTheStageColor.LIZ;
        }
        if ((i & 2) != 0) {
            LiveTakeTheStageColor liveTakeTheStageColor6 = LiveTakeTheStageColor.LIZ;
            liveTakeTheStageColor2 = LiveTakeTheStageColor.LIZ;
        }
        if ((i & 4) != 0) {
            LiveTakeTheStageColor liveTakeTheStageColor7 = LiveTakeTheStageColor.LIZ;
            liveTakeTheStageColor3 = LiveTakeTheStageColor.LIZ;
        }
        if ((i & 8) != 0) {
            LiveTakeTheStageColor liveTakeTheStageColor8 = LiveTakeTheStageColor.LIZ;
            liveTakeTheStageColor4 = LiveTakeTheStageColor.LIZ;
        }
        this(liveTakeTheStageColor, liveTakeTheStageColor2, liveTakeTheStageColor3, liveTakeTheStageColor4);
    }
}
