package com.ss.android.ugc.aweme.video.preload.model;

import X.C09CT;
import X.C1475570oV9;
import X.C1484260ojA;
import X.C2188811AlT;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public class PreloadStrategyConfig {

    @C09CT("danger_buffer_threshold")
    public int dangerBufferThreshold;

    @C09CT("enable_buffer_threshold")
    public int enableBufferPreload;

    @C09CT("network_lower")
    public long networkLower;

    @C09CT("network_upper")
    public long networkUpper;

    @C09CT("secure_buffer_threshold")
    public int secureBufferThreshold;

    @C09CT("tasks")
    public List<PreloadTask> tasks;

    public void clearFlag() {
        List<PreloadTask> list = this.tasks;
        if (list != null) {
            Iterator<PreloadTask> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().alreadyPreload = false;
            }
        }
    }

    public List<PreloadTask> getTasks() {
        if (this.tasks == null) {
            this.tasks = Collections.emptyList();
        }
        return this.tasks;
    }

    public boolean isEnableBufferPreload() {
        return this.enableBufferPreload == 1;
    }

    public String taskToJson() {
        List<PreloadTask> list = this.tasks;
        if (C1475570oV9.LIZ == null) {
            C1475570oV9.LIZ = new Gson();
        }
        return GsonProtectorUtils.toJson(C1475570oV9.LIZ, list);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreloadStrategyConfig{tasks=");
        List<PreloadTask> list = this.tasks;
        if (C1475570oV9.LIZ == null) {
            C1475570oV9.LIZ = new Gson();
        }
        sbLIZ.append(GsonProtectorUtils.toJson(C1475570oV9.LIZ, list));
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static PreloadStrategyConfig getDefault() {
        return C1484260ojA.LIZ;
    }

    public int getDangerBufferThreshold() {
        return this.dangerBufferThreshold;
    }

    public long getNetworkLower() {
        return this.networkLower;
    }

    public long getNetworkUpper() {
        return this.networkUpper;
    }

    public int getSecureBufferThreshold() {
        return this.secureBufferThreshold;
    }

    public static PreloadStrategyConfig convertOldConfig(int i, int i2) {
        PreloadStrategyConfig preloadStrategyConfig = new PreloadStrategyConfig();
        preloadStrategyConfig.tasks = Collections.singletonList(new PreloadTask(i, i2));
        return preloadStrategyConfig;
    }
}
