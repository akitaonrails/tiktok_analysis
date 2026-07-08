package com.ss.android.ugc.aweme.unifiedauth.push.tracking.api;

import X.C09CT;
import X.C10CR;
import X.C10GW;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class PopupEvent implements Serializable {
    public static final C10GW Companion = new Object() { // from class: X.10GW
    };

    @C09CT("action_time")
    public final long actionTS;

    @C09CT("action_type")
    public final int actionType;

    @C09CT("filter_reason")
    public final String filterReason;

    @C09CT("frequency_control")
    public final long freqControlInMin;

    @C09CT("trigger_id")
    public final long id;

    @C09CT("popup_type")
    public final String popupType;

    @C09CT("show_type")
    public final int showType;

    @C09CT("trigger_scene")
    public final String triggerScene;

    @C09CT("trigger_time")
    public final long triggerTS;

    public PopupEvent() {
        this(0L, 0L, "", 0L, 0, "others", "normal", C10CR.NOT_ACTION_TYPE.getValue(), 0L);
    }

    public PopupEvent(long j, long j2, String str, long j3, int i, String str2, String str3, int i2, long j4) {
        this.id = j;
        this.triggerTS = j2;
        this.triggerScene = str;
        this.freqControlInMin = j3;
        this.showType = i;
        this.filterReason = str2;
        this.popupType = str3;
        this.actionType = i2;
        this.actionTS = j4;
    }
}
