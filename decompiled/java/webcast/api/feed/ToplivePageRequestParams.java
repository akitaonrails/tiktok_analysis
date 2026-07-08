package webcast.api.feed;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ToplivePageRequestParams {

    @C09CT("async_you_may_like")
    public boolean asyncYouMayLike;

    @C09CT("debug")
    public boolean debug;

    @C09CT("enable_http_dns")
    public boolean enableHttpDns;

    @C09CT("is_non_personalized")
    public long isNonPersonalized;

    @C09CT("is_preload")
    public boolean isPreload;

    @C09CT("item_ids")
    public List<String> itemIds = new ArrayList();

    @C09CT("enter_source")
    public String enterSource = "";

    @C09CT("item_ids_str")
    public String itemIdsStr = "";
}
