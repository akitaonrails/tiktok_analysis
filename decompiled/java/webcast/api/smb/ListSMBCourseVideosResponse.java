package webcast.api.smb;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SMBCourseVideo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ListSMBCourseVideosResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("total_video_count")
        public long totalVideoCount;

        @C09CT("video_list")
        public List<SMBCourseVideo> videoList = new ArrayList();
    }
}
