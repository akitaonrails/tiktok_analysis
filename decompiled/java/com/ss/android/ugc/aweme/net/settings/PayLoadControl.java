package com.ss.android.ugc.aweme.net.settings;

import X.C08CX;
import X.C09CT;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class PayLoadControl {

    @C09CT("applog_sampling")
    public int appLogSampling;

    @C09CT("check_list")
    public Set<String> checkList;

    @C09CT("commonlog_sampling")
    public int commonLogSampling;

    @C09CT("front_back_count")
    public int count;

    @C09CT("enable")
    public boolean enable;

    @C09CT("flow_control")
    public int flowControl;

    @C09CT("intercept_enable")
    public boolean intercept;

    @C09CT("intercept_api_list")
    public final Set<String> interceptApi;

    @C09CT("max_size")
    public final long maxSize;

    @C09CT("okhttp_sampling")
    public int okHttpSampling;

    @C09CT("rule_regex")
    public String ruleRegex;

    @C09CT("ttnet_sampling")
    public int ttNetSampling;

    @C09CT("urlconnection_sampling")
    public int urlConnectionSampling;

    public PayLoadControl() {
        this(false, false, 0, 0, 0, 0, 0, 0, 0, null, 0L, null, null, 8191, null);
    }

    public PayLoadControl(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str, long j, Set<String> set, Set<String> set2) {
        this.enable = z;
        this.intercept = z2;
        this.ttNetSampling = i;
        this.okHttpSampling = i2;
        this.urlConnectionSampling = i3;
        this.appLogSampling = i4;
        this.commonLogSampling = i5;
        this.count = i6;
        this.flowControl = i7;
        this.ruleRegex = str;
        this.maxSize = j;
        this.interceptApi = set;
        this.checkList = set2;
    }

    public PayLoadControl(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str, long j, Set set, Set set2, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? false : z, (i8 & 2) != 0 ? false : z2, (i8 & 4) != 0 ? 0 : i, (i8 & 8) != 0 ? 0 : i2, (i8 & 16) != 0 ? 0 : i3, (i8 & 32) != 0 ? 0 : i4, (i8 & 64) == 0 ? i5 : 0, (i8 & 128) != 0 ? 6 : i6, (i8 & 256) != 0 ? 2 : i7, (i8 & 512) != 0 ? "" : str, (i8 & 1024) != 0 ? 5242880L : j, (i8 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C08CX.INSTANCE : set, (i8 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? C08CX.INSTANCE : set2);
    }
}
