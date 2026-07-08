package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AudioStruct {

    @C09CT("audio_format")
    public int audioFormat;

    @C09CT("duration")
    public int duration;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("volume_amplitude_peak")
    public double volumeAmplitudePeak;

    @C09CT("volume_loudness_lufs")
    public double volumeLoudnessLufs;

    @C09CT("vid")
    public String vid = "";

    @C09CT("audio_urls")
    public List<String> audioUrls = new ArrayList();
}
