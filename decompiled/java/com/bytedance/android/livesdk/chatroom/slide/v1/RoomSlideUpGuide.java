package com.bytedance.android.livesdk.chatroom.slide.v1;

import X.C09CT;
import android.text.TextUtils;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class RoomSlideUpGuide {
    public static final TypeAdapter ADAPTER = new RoomSlideUpGuide_OptTypeAdapter(NormalGson.singleton());

    @C09CT("max_show_times")
    public int maxShowTimes;

    @C09CT("play_times")
    public int playTimes;

    @C09CT("new_play_times")
    public int newPlayTimes = 3;

    @C09CT("switch")
    public Map<String, Boolean> switchs = new HashMap();

    @C09CT("ec_switch")
    public Map<String, Boolean> ecSwitches = new HashMap();

    public static RoomSlideUpGuide defaultInstance() {
        RoomSlideUpGuide roomSlideUpGuide = new RoomSlideUpGuide();
        roomSlideUpGuide.playTimes = 3;
        roomSlideUpGuide.maxShowTimes = 2;
        roomSlideUpGuide.newPlayTimes = 3;
        roomSlideUpGuide.switchs = new HashMap();
        return roomSlideUpGuide;
    }

    public int getMaxShowTimes() {
        return this.maxShowTimes;
    }

    public int getNewPlayTimes() {
        return this.newPlayTimes;
    }

    public int getPlayTimes() {
        return this.playTimes;
    }

    public boolean isBaseLiveGuideEnable(String str) {
        Boolean bool;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Map<String, Boolean> map = this.switchs;
        if (map != null) {
            bool = map.get(str);
        } else {
            bool = Boolean.FALSE;
        }
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public boolean isECSearchGuideEnable(String str) {
        Boolean bool;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Map<String, Boolean> map = this.ecSwitches;
        if (map != null) {
            bool = map.get(str);
        } else {
            bool = Boolean.FALSE;
        }
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }
}
