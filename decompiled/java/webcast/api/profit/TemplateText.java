package webcast.api.profit;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public final class TemplateText {

    @C09CT("style")
    public TemplateStyle style;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("template")
    public String template = "";

    @C09CT("placeholders")
    public Map<String, TemplatePlaceholder> placeholders = new LinkedHashMap();
}
