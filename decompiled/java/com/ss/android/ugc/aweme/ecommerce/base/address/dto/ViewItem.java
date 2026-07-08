package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ViewItem {

    @C09CT("icon")
    public final Icon icon;

    @C09CT("text")
    public final String text;

    @C09CT("trailing")
    public final ECRichText trailing;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewItem)) {
            return false;
        }
        ViewItem viewItem = (ViewItem) obj;
        return Intrinsics.LJFF(this.text, viewItem.text) && Intrinsics.LJFF(this.icon, viewItem.icon) && Intrinsics.LJFF(this.trailing, viewItem.trailing);
    }

    public ViewItem(String str, Icon icon, ECRichText eCRichText) {
        this.text = str;
        this.icon = icon;
        this.trailing = eCRichText;
    }
}
