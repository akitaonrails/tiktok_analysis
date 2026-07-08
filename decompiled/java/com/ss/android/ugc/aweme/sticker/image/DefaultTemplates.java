package com.ss.android.ugc.aweme.sticker.image;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultTemplates implements Serializable {
    public static final int $stable = 8;

    @C09CT("cursor")
    public Integer cursor;

    @C09CT("template")
    public List<TemplateItem> templateItemList;

    public DefaultTemplates() {
        this(null, null, 3, null);
    }

    public final void setCursor(Integer num) {
        this.cursor = num;
    }

    public final void setTemplateItemList(List<TemplateItem> list) {
        this.templateItemList = list;
    }

    public DefaultTemplates(Integer num, List<TemplateItem> list) {
        this.cursor = num;
        this.templateItemList = list;
    }

    public DefaultTemplates(Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1 : num, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
