package webcast.api.smb;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ListSMBCourseVideosRequest {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("count")
    public int count;

    @C09CT("course_id")
    public long courseId;

    @C09CT("offset")
    public int offset;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("video_id_list")
    public List<Long> videoIdList = new ArrayList();
}
