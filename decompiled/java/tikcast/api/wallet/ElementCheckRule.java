package tikcast.api.wallet;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ElementCheckRule {

    @C09CT("type")
    public String type = "";

    @C09CT("value")
    public String value = "";

    @C09CT("error_key")
    public String errorKey = "";

    @C09CT("error_code")
    public String errorCode = "";

    @C09CT("error_msg")
    public String errorMsg = "";

    @C09CT("stage")
    public List<String> stage = new ArrayList();

    @C09CT("action")
    public String action = "";

    @C09CT("error_key_params")
    public Map<String, String> errorKeyParams = new LinkedHashMap();
}
