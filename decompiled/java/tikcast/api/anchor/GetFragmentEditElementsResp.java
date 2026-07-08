package tikcast.api.anchor;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class GetFragmentEditElementsResp {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("edit_element_result_map")
        public Map<String, EditElementResult> editElementResultMap = new LinkedHashMap();
    }
}
