package com.bytedance.android.livesdk.game.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class GameOnDeviceMomentData {

    @C09CT("max_time")
    public long maxTime;

    @C09CT("message_type")
    public int messageType;

    @C09CT("moment_delay")
    public long momentDelay;

    @C09CT("moment_live_duration")
    public long momentLiveDuration;

    @C09CT("shadow_message_type")
    public int shadowMessageType;

    @C09CT("recognition_end")
    public String recognitionEnd = "";

    @C09CT("recognition_method")
    public String recognitionMethod = "";

    @C09CT("recognition_detail_json")
    public String recognitionDetailJson = "";

    @C09CT("unique_id")
    public String uniqueId = "";

    @C09CT("moment_effects")
    public List<Integer> momentEffects = new ArrayList();
}
