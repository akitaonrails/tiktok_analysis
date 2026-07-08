package com.bytedance.android.livesdk.livesetting.message;

import X.C09CT;
import X.C13LP;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes19.dex */
public final class RealtimeTrackerConfig {
    public static final TypeAdapter ADAPTER = new RealtimeTrackerConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("log_sample")
    public int logSample;

    @C09CT("methods_group")
    public String methodsGroup;

    @C09CT("methods_group_name")
    public String methodsGroupName;

    @C09CT("record_scenes")
    public List<String> recordScenes;

    @C09CT("report_interval")
    public int reportInterval;

    public RealtimeTrackerConfig() {
        this(false, LSPassThroughRecordSizeConfig.DEFAULT, new ArrayList(), "", "", 30);
    }

    public final List<String> getMethodsGroupList() {
        try {
            String str = this.methodsGroup;
            return str == null || str.length() == 0 ? new ArrayList() : C13LP.LLIIII(a0.LJJLIIIJILLIZJL(this.methodsGroup, new String[]{","}, 0, 6));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new ArrayList();
        }
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final int getLogSample() {
        return this.logSample;
    }

    public final String getMethodsGroup() {
        return this.methodsGroup;
    }

    public final String getMethodsGroupName() {
        return this.methodsGroupName;
    }

    public final List<String> getRecordScenes() {
        return this.recordScenes;
    }

    public final int getReportInterval() {
        return this.reportInterval;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setLogSample(int i) {
        this.logSample = i;
    }

    public final void setMethodsGroup(String str) {
        this.methodsGroup = str;
    }

    public final void setMethodsGroupName(String str) {
        this.methodsGroupName = str;
    }

    public final void setRecordScenes(List<String> list) {
        this.recordScenes = list;
    }

    public final void setReportInterval(int i) {
        this.reportInterval = i;
    }

    public RealtimeTrackerConfig(boolean z, int i, List<String> list, String str, String str2, int i2) {
        this.enable = z;
        this.logSample = i;
        this.recordScenes = list;
        this.methodsGroupName = str;
        this.methodsGroup = str2;
        this.reportInterval = i2;
    }
}
