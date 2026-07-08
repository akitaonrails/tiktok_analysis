package webcast.api.smb;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class UpdateSMBCourseReq {

    @C09CT("course_id")
    public long courseId;

    @C09CT("price_tier")
    public long priceTier;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("name")
    public String name = "";

    @C09CT("description")
    public String description = "";

    @C09CT("pin_text")
    public String pinText = "";

    @C09CT("published_video_ids")
    public List<Long> publishedVideoIds = new ArrayList();

    @C09CT("deleted_video_ids")
    public List<Long> deletedVideoIds = new ArrayList();
}
