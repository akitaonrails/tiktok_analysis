package com.ss.android.ugc.tiktok.pns.screen.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class ScreenTimeActionRequest implements Serializable {

    @C09CT("action_id")
    public final String actionId;

    @C09CT("button_id")
    public final Integer buttonId;

    @C09CT("current_top_screen")
    public final String currentTopScreen;

    @C09CT("extra")
    public final String extra;

    @C09CT("status_id")
    public final Integer statusId;

    @C09CT("trigger_scene")
    public final String triggerScene;

    public ScreenTimeActionRequest() {
        this("", null, "", "", null, null);
    }

    public ScreenTimeActionRequest(String str, Integer num, String str2, String str3, Integer num2, String str4) {
        this.actionId = str;
        this.buttonId = num;
        this.currentTopScreen = str2;
        this.triggerScene = str3;
        this.statusId = num2;
        this.extra = str4;
    }
}
