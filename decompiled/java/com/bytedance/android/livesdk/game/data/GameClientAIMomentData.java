package com.bytedance.android.livesdk.game.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class GameClientAIMomentData {

    @C09CT("timestamp")
    public long eventTime;

    @C09CT("message_type")
    public int messageType;

    @C09CT("recognition_end")
    public String recognitionEnd = "";

    @C09CT("unique_id")
    public String uniqueId = "";

    @C09CT("moment_effects")
    public List<Integer> momentEffects = new ArrayList();
}
