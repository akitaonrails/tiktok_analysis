package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class LivePublisherTaskDetailRequirement {

    @C09CT("content_consistent_duration")
    public long contentConsistentDuration;

    @C09CT("gamepad_mount_duration")
    public long gamepadMountDuration;

    @C09CT("other_requirement")
    public List<String> otherRequirement = new ArrayList();

    @C09CT("room_uv")
    public long roomUv;
}
