package com.bytedance.android.livesdk.livesetting.message;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveMessageStickyConfig {
    public static final TypeAdapter ADAPTER = new LiveMessageStickyConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("method_list")
    public List<String> methodList = new ArrayList();

    @C09CT("capacity_per_method")
    public int capacityPerMethod = 1;

    @C09CT("sticky_time_limit")
    public int stickyTimeLimit = 10000;

    @C09CT("sticky_till_time")
    public int stickyTillTime = 180000;

    public final int getCapacityPerMethod() {
        return this.capacityPerMethod;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final List<String> getMethodList() {
        return this.methodList;
    }

    public final int getStickyTillTime() {
        return this.stickyTillTime;
    }

    public final int getStickyTimeLimit() {
        return this.stickyTimeLimit;
    }

    public final void setCapacityPerMethod(int i) {
        this.capacityPerMethod = i;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setMethodList(List<String> list) {
        this.methodList = list;
    }

    public final void setStickyTillTime(int i) {
        this.stickyTillTime = i;
    }

    public final void setStickyTimeLimit(int i) {
        this.stickyTimeLimit = i;
    }
}
