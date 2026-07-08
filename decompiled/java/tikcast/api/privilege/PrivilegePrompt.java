package tikcast.api.privilege;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class PrivilegePrompt {

    @C09CT("text")
    public String text = "";

    @C09CT("placeholder_map")
    public Map<String, PrivilegePlaceholder> placeholderMap = new LinkedHashMap();
}
