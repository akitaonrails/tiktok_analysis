package webcast.api.smb;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SMBCourse;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ListSMBCourseDetailsResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("course_list")
        public List<SMBCourse> courseList = new ArrayList();
    }
}
