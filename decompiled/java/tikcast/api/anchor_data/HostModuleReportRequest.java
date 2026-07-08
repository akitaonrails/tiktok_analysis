package tikcast.api.anchor_data;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class HostModuleReportRequest {

    @C09CT(Scene.SCENE_SERVICE)
    public String scene = "";

    @C09CT("module_name")
    public String moduleName = "";

    @C09CT("item_ids")
    public List<String> itemIds = new ArrayList();

    @C09CT("operation_type")
    public String operationType = "";

    @C09CT("item_ids_str")
    public String itemIdsStr = "";
}
