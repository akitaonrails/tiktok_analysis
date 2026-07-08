package com.ss.android.ugc.aweme.tako.setting;

import X.C09CT;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes28.dex */
public final class DMASRSpeechOptions implements Serializable {
    public static final int $stable = 8;

    @C09CT("address")
    public final String address;

    @C09CT("app_id")
    public final String appId;

    @C09CT("asr_show_lang")
    public final boolean asrShowLang;

    @C09CT("cluster")
    public final String cluster;

    @C09CT("connect_time_out")
    public final int connectTimeOut;

    @C09CT("lang")
    public final List<String> language;

    @C09CT("protocol_type")
    public final int protocolType;

    @C09CT("receive_time_out")
    public final int receiveTimeOut;

    @C09CT("req_params")
    public final Map<String, Object> reqParams;

    @C09CT("resource_id")
    public final String resourceId;

    @C09CT("token")
    public final String token;

    @C09CT("total_time_out")
    public final Long totalTimeOut;

    @C09CT("uri")
    public final String uri;

    public DMASRSpeechOptions() {
        this(null, null, null, null, null, null, 0, 0, false, null, null, 0, null, 8191, null);
    }

    public DMASRSpeechOptions(String str, String str2, String str3, String str4, List<String> list, Long l, int i, int i2, boolean z, String str5, String str6, int i3, Map<String, ? extends Object> map) {
        this.address = str;
        this.uri = str2;
        this.cluster = str3;
        this.appId = str4;
        this.language = list;
        this.totalTimeOut = l;
        this.connectTimeOut = i;
        this.receiveTimeOut = i2;
        this.asrShowLang = z;
        this.token = str5;
        this.resourceId = str6;
        this.protocolType = i3;
        this.reqParams = map;
    }

    public DMASRSpeechOptions(String str, String str2, String str3, String str4, List list, Long l, int i, int i2, boolean z, String str5, String str6, int i3, Map map, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "wss://speech.tiktokv.com" : str, (i4 & 2) != 0 ? "/api/v1/sauc" : str2, (i4 & 4) != 0 ? "vs_tt_input" : str3, (i4 & 8) != 0 ? "vs_tt_tako" : str4, (i4 & 16) != 0 ? Collections.singletonList("fil-PH") : list, (i4 & 32) != 0 ? Long.valueOf(Mp4ScreenVideoLoadTimeout.CONTROL) : l, (i4 & 64) != 0 ? 12000 : i, (i4 & 128) != 0 ? LivePreCreateNextRoomPlayer.ENABLE : i2, (i4 & 256) != 0 ? false : z, (i4 & 512) != 0 ? "" : str5, (i4 & 1024) == 0 ? str6 : "", (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? i3 : 0, (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : map);
    }
}
