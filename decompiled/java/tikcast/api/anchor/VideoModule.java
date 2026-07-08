package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class VideoModule {

    @C09CT("title")
    public String title = "";

    @C09CT("videos")
    public List<VideoStruct> videos = new ArrayList();

    public static final class VideoStruct {

        @C09CT("duration")
        public long duration;

        @C09CT("vv")
        public long vv;

        @C09CT("video_id")
        public String videoId = "";

        @C09CT("cover_image")
        public String coverImage = "";

        @C09CT("video_url")
        public String videoUrl = "";

        @C09CT("nick_name")
        public String nickName = "";

        @C09CT("title")
        public String title = "";
    }
}
