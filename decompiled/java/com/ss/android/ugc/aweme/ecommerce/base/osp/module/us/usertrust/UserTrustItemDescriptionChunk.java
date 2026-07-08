package com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.usertrust;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class UserTrustItemDescriptionChunk {

    @C09CT("text_with_image")
    public ImageRichText textWithImage;

    @C09CT("text_with_link")
    public LinkRichText textWithLink;

    @C09CT("type")
    public Integer type;

    public UserTrustItemDescriptionChunk() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserTrustItemDescriptionChunk)) {
            return false;
        }
        UserTrustItemDescriptionChunk userTrustItemDescriptionChunk = (UserTrustItemDescriptionChunk) obj;
        return Intrinsics.LJFF(this.type, userTrustItemDescriptionChunk.type) && Intrinsics.LJFF(this.textWithLink, userTrustItemDescriptionChunk.textWithLink) && Intrinsics.LJFF(this.textWithImage, userTrustItemDescriptionChunk.textWithImage);
    }

    public final int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        LinkRichText linkRichText = this.textWithLink;
        int iHashCode2 = (iHashCode + (linkRichText == null ? 0 : linkRichText.hashCode())) * 31;
        ImageRichText imageRichText = this.textWithImage;
        return iHashCode2 + (imageRichText != null ? imageRichText.hashCode() : 0);
    }

    public UserTrustItemDescriptionChunk(Integer num, LinkRichText linkRichText, ImageRichText imageRichText) {
        this.type = num;
        this.textWithLink = linkRichText;
        this.textWithImage = imageRichText;
    }
}
