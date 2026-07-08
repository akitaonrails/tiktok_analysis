package tikcast.api.fans;

import X.C09CT;
import webcast.fans_platform.Namespace;

/* JADX INFO: loaded from: classes.dex */
public final class ListModelRequest {

    @C09CT("namespace")
    public Namespace namespace;

    @C09CT("page_size")
    public int pageSize;

    @C09CT("page_token")
    public String pageToken = "";

    @C09CT("search_text")
    public String searchText = "";
}
