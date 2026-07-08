package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class OecLiveCreatorMessage extends AbstractC1136060ffY {

    @C09CT("action_map")
    public Map<Integer, OecLiveCreatorAction> actionMap;

    @C09CT("data")
    public OecLiveCreatorMessageData data;

    @C09CT("meta")
    public OecLiveCreatorMessageMeta meta;

    public OecLiveCreatorMessage() {
        this.type = C001A.OEC_LIVE_CREATOR_MESSAGE;
        this.actionMap = new LinkedHashMap();
    }
}
