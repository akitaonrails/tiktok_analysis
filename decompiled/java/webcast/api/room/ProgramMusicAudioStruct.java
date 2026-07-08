package webcast.api.room;

import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.MusicUrlStruct;

/* JADX INFO: loaded from: classes.dex */
public final class ProgramMusicAudioStruct {

    @C09CT("audio_track_url")
    public MusicUrlStruct audioTrackUrl;

    @C09CT("cover_hd_url")
    public MusicUrlStruct coverHdUrl;

    @C09CT("cover_large_url")
    public MusicUrlStruct coverLargeUrl;

    @C09CT("cover_medium_url")
    public MusicUrlStruct coverMediumUrl;

    @C09CT("cover_thumb_url")
    public MusicUrlStruct coverThumbUrl;

    @C09CT("duration")
    public long duration;

    @C09CT("end_time")
    public long endTime;

    @C09CT("play_url")
    public MusicUrlStruct playUrl;

    @C09CT("start_time")
    public long startTime;
}
