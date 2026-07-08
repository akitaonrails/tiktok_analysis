package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class WatchReasonV2Item {

    @C09CT("style")
    public int style;

    @C09CT("type")
    public int type;

    @C09CT("content")
    public String content = "";

    @C09CT("tag_ids")
    public List<Integer> tagIds = new ArrayList();

    @C09CT("watch_reason_ids")
    public List<Integer> watchReasonIds = new ArrayList();
}
