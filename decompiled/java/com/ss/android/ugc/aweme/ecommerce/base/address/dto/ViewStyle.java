package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ViewStyle {

    @C09CT("view_item_highlight_mode")
    public final Integer viewItemHighlightMode;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ViewStyle) && Intrinsics.LJFF(this.viewItemHighlightMode, ((ViewStyle) obj).viewItemHighlightMode);
    }

    public ViewStyle(Integer num) {
        this.viewItemHighlightMode = num;
    }
}
