package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class ShareWarnPopWindow implements Serializable {

    @C09CT("pop_accessory")
    public final ShareWarnPopAccessory accessory;

    @C09CT("pop_content")
    public final List<ShareWarnPopContent> content;

    @C09CT("pop_title")
    public final String title;

    public ShareWarnPopWindow() {
        this(null, null, null, 7, null);
    }

    public ShareWarnPopWindow(String str, List<ShareWarnPopContent> list, ShareWarnPopAccessory shareWarnPopAccessory) {
        this.title = str;
        this.content = list;
        this.accessory = shareWarnPopAccessory;
    }

    public ShareWarnPopWindow(String str, List list, ShareWarnPopAccessory shareWarnPopAccessory, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? null : shareWarnPopAccessory);
    }
}
