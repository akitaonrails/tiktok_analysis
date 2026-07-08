package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.NoticeMessage;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RichBlock;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class AboutThisProductContentItem {

    @C09CT("action_card")
    public final AboutThisProductActionCard actionCard;

    @C09CT("ec_rich_block")
    public final RichBlock ecRichBlock;

    @C09CT("item_type")
    public final Integer itemType;

    @C09CT("notice_message")
    public final NoticeMessage noticeMessage;

    @C09CT("video")
    public final Video video;

    public AboutThisProductContentItem() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AboutThisProductContentItem)) {
            return false;
        }
        AboutThisProductContentItem aboutThisProductContentItem = (AboutThisProductContentItem) obj;
        return Intrinsics.LJFF(this.itemType, aboutThisProductContentItem.itemType) && Intrinsics.LJFF(this.video, aboutThisProductContentItem.video) && Intrinsics.LJFF(this.ecRichBlock, aboutThisProductContentItem.ecRichBlock) && Intrinsics.LJFF(this.noticeMessage, aboutThisProductContentItem.noticeMessage) && Intrinsics.LJFF(this.actionCard, aboutThisProductContentItem.actionCard);
    }

    public final int hashCode() {
        Integer num = this.itemType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Video video = this.video;
        int iHashCode2 = (iHashCode + (video == null ? 0 : video.hashCode())) * 31;
        RichBlock richBlock = this.ecRichBlock;
        int iHashCode3 = (iHashCode2 + (richBlock == null ? 0 : richBlock.hashCode())) * 31;
        NoticeMessage noticeMessage = this.noticeMessage;
        int iHashCode4 = (iHashCode3 + (noticeMessage == null ? 0 : noticeMessage.hashCode())) * 31;
        AboutThisProductActionCard aboutThisProductActionCard = this.actionCard;
        return iHashCode4 + (aboutThisProductActionCard != null ? aboutThisProductActionCard.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AboutThisProductContentItem(itemType=");
        sbLIZ.append(this.itemType);
        sbLIZ.append(", video=");
        sbLIZ.append(this.video);
        sbLIZ.append(", ecRichBlock=");
        sbLIZ.append(this.ecRichBlock);
        sbLIZ.append(", noticeMessage=");
        sbLIZ.append(this.noticeMessage);
        sbLIZ.append(", actionCard=");
        sbLIZ.append(this.actionCard);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AboutThisProductContentItem(Integer num, Video video, RichBlock richBlock, NoticeMessage noticeMessage, AboutThisProductActionCard aboutThisProductActionCard) {
        this.itemType = num;
        this.video = video;
        this.ecRichBlock = richBlock;
        this.noticeMessage = noticeMessage;
        this.actionCard = aboutThisProductActionCard;
    }
}
