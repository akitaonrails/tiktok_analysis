package webcast.api.smb;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes28.dex */
public final class GetSMBCourseDetailRequest {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("course_id")
    public long courseId;

    @C09CT("iap_country_code")
    public String iapCountryCode = "";

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;
}
