package com.ss.android.ugc.aweme.audiomode.vopclone.experiment;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class VopCloneConfig {

    @C09CT("channel")
    public final Integer channel;

    @C09CT("connection_timeout")
    public final Integer connectionTimeout;

    @C09CT("cut_off_length")
    public final Float cutoffLength;

    @C09CT("vop_hashtag_ids")
    public final List<HashtagId> hashtagIdGroup;

    @C09CT("show_vop_entry")
    public final Integer isShowVopEntry;

    @C09CT("language")
    public final Integer language;

    @C09CT("max_block_size")
    public final Integer maxBlockSize;

    @C09CT("model_key")
    public final String modelKey;

    @C09CT("record_max_duration")
    public final Integer recordMaxDuration;

    @C09CT("resample_rate")
    public final Integer resampleRate;

    @C09CT("sample_rate")
    public final Integer sampleRate;

    @C09CT("sample_text_content")
    public final String sampleTextContent;

    @C09CT("snr_threshold")
    public final Float snrThreshold;

    @C09CT("text_type")
    public final Integer textType;

    @C09CT("tts_server_url")
    public final String ttsServerUrl;

    @C09CT("vop_server_url")
    public final String vopServerUrl;

    @C09CT("vop_url")
    public final String webUrl;

    @C09CT("wer_failed_max_times")
    public final Integer werFailedMaxTimes;

    @C09CT("wer_threshold")
    public final Float werThreshold;

    public VopCloneConfig() {
        this(0, null, "aweme://webview?url=https%3A%2F%2Fsami.tiktokv.com%2Fvop_h5%2Findex.html%3Fuse_spark%3D1%26sign_up_origin%3Dinbox%26is_first_enter%3D0", 0, "http://sami-va.tiktokv.com/internal", "http://sami-sg.tiktokv.com/internal", 50000, "audio_metrics", 30000, Float.valueOf(0.2f), Float.valueOf(20.0f), 3, Float.valueOf(0.3f), 24000, "", 50, 44100, 1, 512);
    }

    public VopCloneConfig(Integer num, List<HashtagId> list, String str, Integer num2, String str2, String str3, Integer num3, String str4, Integer num4, Float f, Float f2, Integer num5, Float f3, Integer num6, String str5, Integer num7, Integer num8, Integer num9, Integer num10) {
        this.isShowVopEntry = num;
        this.hashtagIdGroup = list;
        this.webUrl = str;
        this.language = num2;
        this.vopServerUrl = str2;
        this.ttsServerUrl = str3;
        this.connectionTimeout = num3;
        this.modelKey = str4;
        this.recordMaxDuration = num4;
        this.werThreshold = f;
        this.snrThreshold = f2;
        this.werFailedMaxTimes = num5;
        this.cutoffLength = f3;
        this.resampleRate = num6;
        this.sampleTextContent = str5;
        this.textType = num7;
        this.sampleRate = num8;
        this.channel = num9;
        this.maxBlockSize = num10;
    }
}
