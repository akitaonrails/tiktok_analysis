package com.bytedance.android.livesdk.livesetting.model;

import X.C09CT;
import X.C13BV;
import com.bytedance.scene.Scene;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveMessagePlatformRedDotConfig implements Serializable {

    @C09CT("end_time")
    public final long assetsEndTimeS;

    @C09CT("assets_ids")
    public final List<String> assetsIds;

    @C09CT("filter_reason")
    public final String filterReason;

    @C09CT("lifetime")
    public final int lifetime;

    @C09CT("new_user_block")
    public final boolean newUserBlock;

    @C09CT("outer_layer_red_dot_list")
    public final List<String> outLayerList;

    @C09CT("priority")
    public final int priority;

    @C09CT("room_location")
    public final String roomLocation;

    @C09CT("room_location_level")
    public final int roomLocationLevel;

    @C09CT("room_position")
    public final long roomPosition;

    @C09CT(Scene.SCENE_SERVICE)
    public final int scene;

    @C09CT("skip_downline_mechanism")
    public final boolean skipDownlineMechanism;

    public LiveMessagePlatformRedDotConfig() {
        this(0, false, 0, null, false, null, 0L, null, 0, 0, 0L, null, 4095, null);
    }

    public LiveMessagePlatformRedDotConfig(int i, boolean z, int i2, List<String> list, boolean z2, String str, long j, String str2, int i3, int i4, long j2, List<String> list2) {
        this.priority = i;
        this.newUserBlock = z;
        this.lifetime = i2;
        this.outLayerList = list;
        this.skipDownlineMechanism = z2;
        this.filterReason = str;
        this.roomPosition = j;
        this.roomLocation = str2;
        this.roomLocationLevel = i3;
        this.scene = i4;
        this.assetsEndTimeS = j2;
        this.assetsIds = list2;
    }

    public LiveMessagePlatformRedDotConfig(int i, boolean z, int i2, List list, boolean z2, String str, long j, String str2, int i3, int i4, long j2, List list2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 5 : i, (i5 & 2) != 0 ? true : z, (i5 & 4) != 0 ? 3 : i2, (i5 & 8) != 0 ? null : list, (i5 & 16) != 0 ? false : z2, (i5 & 32) != 0 ? null : str, (i5 & 64) != 0 ? -1L : j, (i5 & 128) == 0 ? str2 : null, (i5 & 256) != 0 ? 0 : i3, (i5 & 512) == 0 ? i4 : 0, (i5 & 1024) != 0 ? 0L : j2, (i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C13BV.INSTANCE : list2);
    }
}
