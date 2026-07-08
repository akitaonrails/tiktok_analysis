package webcast.api.smb;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SMBCourseVideo;

/* JADX INFO: loaded from: classes29.dex */
public final class PostSMBCourseVideoResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("course_video")
        public SMBCourseVideo courseVideo;
    }
}
