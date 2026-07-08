package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SMBCourse;
import com.bytedance.android.livesdk.chatroom.api.SMBServiceSKU;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SMBServiceListReorderRequest {

    @C09CT("new_service_list_order")
    public List<SMBServiceSKU> newServiceListOrder = new ArrayList();

    @C09CT("new_course_list_order")
    public List<SMBCourse> newCourseListOrder = new ArrayList();
}
