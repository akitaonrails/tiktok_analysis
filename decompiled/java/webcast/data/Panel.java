package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Panel {

    @C09CT("icon")
    public UrlDataStruct icon;

    @C09CT("text")
    public String text = "";

    @C09CT("tags")
    public List<String> tags = new ArrayList();

    @C09CT("tags_updated_at")
    public String tagsUpdatedAt = "";

    @C09CT("extra")
    public String extra = "";
}
