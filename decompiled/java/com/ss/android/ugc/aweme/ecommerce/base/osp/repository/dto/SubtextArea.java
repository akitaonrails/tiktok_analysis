package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SubtextArea {

    @C09CT("content")
    public String content;

    @C09CT("content_rich_text")
    public ECRichText contentRichText;

    @C09CT("icon")
    public Icon icon;

    @C09CT("promotion_usable_end_time")
    public Long promotionUsableEndTime;

    public SubtextArea() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubtextArea)) {
            return false;
        }
        SubtextArea subtextArea = (SubtextArea) obj;
        return Intrinsics.LJFF(this.content, subtextArea.content) && Intrinsics.LJFF(this.promotionUsableEndTime, subtextArea.promotionUsableEndTime) && Intrinsics.LJFF(this.icon, subtextArea.icon) && Intrinsics.LJFF(this.contentRichText, subtextArea.contentRichText);
    }

    public SubtextArea(String str, Long l, Icon icon, ECRichText eCRichText) {
        this.content = str;
        this.promotionUsableEndTime = l;
        this.icon = icon;
        this.contentRichText = eCRichText;
    }
}
