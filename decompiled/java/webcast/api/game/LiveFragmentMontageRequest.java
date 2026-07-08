package webcast.api.game;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LiveFragmentMontageRequest {

    @C09CT("is_post")
    public boolean isPost;

    @C09CT("vcloud_video_param_video_extra")
    public VcloudVideoEditParamVideoExtra vcloudVideoParamVideoExtra;

    @C09CT("room_id")
    public String roomId = "";

    @C09CT("title")
    public String title = "";

    @C09CT("fragment_id")
    public String fragmentId = "";

    @C09CT("video_tracks")
    public List<VideoTrack> videoTracks = new ArrayList();
}
