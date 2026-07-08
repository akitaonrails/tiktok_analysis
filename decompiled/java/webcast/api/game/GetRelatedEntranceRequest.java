package webcast.api.game;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class GetRelatedEntranceRequest {

    @C09CT("videos")
    public List<VideoBase> videos = new ArrayList();

    public static final class VideoBase {

        @C09CT("author_id")
        public long authorId;

        @C09CT("related_live_tag")
        public String relatedLiveTag = "";

        @C09CT("video_id")
        public long videoId;
    }
}
