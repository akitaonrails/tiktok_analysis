package webcast.api.sub;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class SMBServiceOptFormRequest {

    @C09CT("form_id")
    public long formId;

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

    @C09CT("edited_components")
    public List<Integer> editedComponents = new ArrayList();

    @C09CT("field_types")
    public List<Integer> fieldTypes = new ArrayList();

    @C09CT("service_id_str")
    public String serviceIdStr = "";
}
