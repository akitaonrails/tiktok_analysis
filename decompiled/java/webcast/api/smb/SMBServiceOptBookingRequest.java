package webcast.api.smb;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes23.dex */
public final class SMBServiceOptBookingRequest {

    @C09CT("event_template_id")
    public long eventTemplateId;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("service_id")
    public long serviceId;

    @C09CT("name")
    public String name = "";

    @C09CT("desc")
    public String desc = "";

    @C09CT("pin_notice")
    public String pinNotice = "";

    @C09CT("service_id_str")
    public String serviceIdStr = "";

    @C09CT("event_template_id_str")
    public String eventTemplateIdStr = "";
}
