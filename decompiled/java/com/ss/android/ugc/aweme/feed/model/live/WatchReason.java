package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class WatchReason implements Serializable {

    @C09CT("bg_color_type")
    public int bgColorType;

    @C09CT("is_show")
    public boolean isShow;
    public boolean isShowed;

    @C09CT("style")
    public int style;

    @C09CT("watch_reasons")
    public List<WatchReasonItem> watchReasons = new ArrayList();
}
