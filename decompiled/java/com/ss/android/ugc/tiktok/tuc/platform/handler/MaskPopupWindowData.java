package com.ss.android.ugc.tiktok.tuc.platform.handler;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.feed.model.MaskPopText;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class MaskPopupWindowData implements Serializable {

    @C09CT("pop_content")
    public final List<MaskPopText> content;

    @C09CT("event_name")
    public final String eventName;

    @C09CT("param")
    public final Map<String, String> params;

    @C09CT("pop_title")
    public final String title;

    public MaskPopupWindowData() {
        this(null, null, null, null, 15, null);
    }

    public MaskPopupWindowData(String str, List<MaskPopText> list, String str2, Map<String, String> map) {
        this.title = str;
        this.content = list;
        this.eventName = str2;
        this.params = map;
    }

    public MaskPopupWindowData(String str, List list, String str2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : map);
    }
}
