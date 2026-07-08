package webcast.data;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class EffectCategory {

    @C09CT("icon")
    public UrlDataStruct icon;

    @C09CT("icon_selected")
    public UrlDataStruct iconSelected;

    @C09CT("is_default")
    public boolean isDefault;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("key")
    public String key = "";

    @C09CT("name")
    public String name = "";

    @C09CT("effects")
    public List<String> effects = new ArrayList();

    @C09CT("tags")
    public List<String> tags = new ArrayList();

    @C09CT("tags_updated_at")
    public String tagsUpdatedAt = "";

    @C09CT("extra")
    public String extra = "";
}
