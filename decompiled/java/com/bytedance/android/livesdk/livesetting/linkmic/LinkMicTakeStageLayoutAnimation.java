package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C931820aM8;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class LinkMicTakeStageLayoutAnimation {
    public static final int $stable = 0;
    public static final LinkMicTakeStageLayoutAnimation INSTANCE = new LinkMicTakeStageLayoutAnimation();

    private final boolean getAnchorValue() {
        return LinkMicTakeStageLayoutAnimationForDolphin.getValue() && LiveAbLabelSetting.INSTANCE.getBooleanValue("enable_effect_layout_animation");
    }

    private final boolean getGuestValue() {
        return LinkMicTakeStageLayoutAnimationForDolphin.getValue() && Intrinsics.LJFF(C931820aM8.LIZLLL("enable_effect_layout_animation"), Boolean.TRUE);
    }

    public static final boolean isEnable(boolean z) {
        if (z) {
            return INSTANCE.getAnchorValue();
        }
        return INSTANCE.getGuestValue();
    }
}
