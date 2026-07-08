package com.ss.android.ugc.aweme.ecommerce.base.pdp.view.iconlabelgroup;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class IconLabelGroup {

    @C09CT("background_color")
    public final String bgColor;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("items")
    public final List<IconLabelItem> items;

    public IconLabelGroup() {
        this(null, null, null);
    }

    public final int hashCode() {
        List<IconLabelItem> list = this.items;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.daInfo;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bgColor;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public IconLabelGroup(List<IconLabelItem> list, String str, String str2) {
        this.items = list;
        this.daInfo = str;
        this.bgColor = str2;
    }
}
