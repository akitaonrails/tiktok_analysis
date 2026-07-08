package com.ss.android.ugc.aweme.ecommerce.arch;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchBffSection {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("is_dynamic_sticky")
    public final boolean isDynamicSticky;

    @C09CT("is_sticky")
    public final boolean isSticky;

    @C09CT("item_style")
    public final MixStyle itemStyle;

    @C09CT("items")
    public final List<SearchBffItem> items;

    @C09CT("order")
    public final int order;

    @C09CT("section_style")
    public final MixStyle sectionStyle;

    @C09CT("type")
    public final long type;

    public SearchBffSection() {
        this(null, 0L, 0, null, false, false, null, null, 255, null);
    }

    public SearchBffSection(String str, long j, int i, List<SearchBffItem> list, boolean z, boolean z2, MixStyle mixStyle, MixStyle mixStyle2) {
        this.id = str;
        this.type = j;
        this.order = i;
        this.items = list;
        this.isSticky = z;
        this.isDynamicSticky = z2;
        this.sectionStyle = mixStyle;
        this.itemStyle = mixStyle2;
    }

    public SearchBffSection(String str, long j, int i, List list, boolean z, boolean z2, MixStyle mixStyle, MixStyle mixStyle2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? C13BV.INSTANCE : list, (i2 & 16) != 0 ? false : z, (i2 & 32) == 0 ? z2 : false, (i2 & 64) != 0 ? null : mixStyle, (i2 & 128) == 0 ? mixStyle2 : null);
    }
}
