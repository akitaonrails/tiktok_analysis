package com.ss.android.ugc.aweme.pgc.hybrid.xbridge.impl.speech;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class DMASRSpeechOptions implements Serializable {

    @C09CT("address")
    public final String address;

    @C09CT("app_id")
    public final String appId;

    @C09CT("asr_show_lang")
    public final boolean asrShowLang;

    @C09CT("auto_stop")
    public final boolean autoStop;

    @C09CT("cluster")
    public final String cluster;

    @C09CT("connect_time_out")
    public final int connectTimeOut;

    @C09CT("lang")
    public final List<String> language;

    @C09CT("receive_time_out")
    public final int receiveTimeOut;

    @C09CT("total_time_out")
    public final int totalTimeOut;

    @C09CT("uri")
    public final String uri;

    public DMASRSpeechOptions(String str, String str2, String str3, String str4, List<String> list, int i, int i2, int i3, boolean z, boolean z2) {
        this.address = str;
        this.uri = str2;
        this.cluster = str3;
        this.appId = str4;
        this.language = list;
        this.totalTimeOut = i;
        this.connectTimeOut = i2;
        this.receiveTimeOut = i3;
        this.asrShowLang = z;
        this.autoStop = z2;
    }
}
