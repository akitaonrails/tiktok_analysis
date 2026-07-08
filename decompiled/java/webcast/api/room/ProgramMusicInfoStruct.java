package webcast.api.room;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class ProgramMusicInfoStruct {

    @C09CT("audio_info")
    public ProgramMusicAudioStruct audioInfo;

    @C09CT("base_info")
    public ProgramMusicStruct baseInfo;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;
}
