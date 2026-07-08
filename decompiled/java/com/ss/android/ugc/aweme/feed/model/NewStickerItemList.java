package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class NewStickerItemList extends BaseResponse {

    @C09CT("cursor")
    public long cursor;

    @C09CT("has_more")
    public int hasMore;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("effect")
    public List<NewFaceSticker> stickers;

    public NewStickerItemList() {
        this(0L, 0, null, null);
    }

    public final NewStickerItemList copy(long j, int i, List<NewFaceSticker> list, LogPbBean logPbBean) {
        return new NewStickerItemList(j, i, list, logPbBean);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewStickerItemList)) {
            return false;
        }
        NewStickerItemList newStickerItemList = (NewStickerItemList) obj;
        return this.cursor == newStickerItemList.cursor && this.hasMore == newStickerItemList.hasMore && Intrinsics.LJFF(this.stickers, newStickerItemList.stickers) && Intrinsics.LJFF(this.logPb, newStickerItemList.logPb);
    }

    public int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.cursor) * 31) + this.hasMore) * 31;
        List<NewFaceSticker> list = this.stickers;
        int iHashCode = (iY2 + (list == null ? 0 : list.hashCode())) * 31;
        LogPbBean logPbBean = this.logPb;
        return iHashCode + (logPbBean != null ? logPbBean.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NewStickerItemList(cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", stickers=");
        sbLIZ.append(this.stickers);
        sbLIZ.append(", logPb=");
        sbLIZ.append(this.logPb);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final long getCursor() {
        return this.cursor;
    }

    public final int getHasMore() {
        return this.hasMore;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final List<NewFaceSticker> getStickers() {
        return this.stickers;
    }

    public final void setCursor(long j) {
        this.cursor = j;
    }

    public final void setHasMore(int i) {
        this.hasMore = i;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setStickers(List<NewFaceSticker> list) {
        this.stickers = list;
    }

    public NewStickerItemList(long j, int i, List<NewFaceSticker> list, LogPbBean logPbBean) {
        this.cursor = j;
        this.hasMore = i;
        this.stickers = list;
        this.logPb = logPbBean;
    }
}
