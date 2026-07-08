package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ClaimAnimation {

    @C09CT("bg_icon")
    public final Icon bgIcon;

    @C09CT("exceed_user_bold_desc")
    public final String boldDesc;

    @C09CT("draw_desc")
    public final String desc;

    @C09CT("items")
    public final List<Object> items;

    @C09CT("exceed_user_desc")
    public final String resultDesc;

    public ClaimAnimation() {
        this(null, null, null, null, null);
    }

    public ClaimAnimation(List<Object> list, String str, String str2, String str3, Icon icon) {
        this.items = list;
        this.desc = str;
        this.resultDesc = str2;
        this.boldDesc = str3;
        this.bgIcon = icon;
    }
}
