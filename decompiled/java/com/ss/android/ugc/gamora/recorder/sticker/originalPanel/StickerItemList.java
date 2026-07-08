package com.ss.android.ugc.gamora.recorder.sticker.originalPanel;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class StickerItemList extends BaseResponse {
    public static final int $stable = 8;

    @C09CT("cursor")
    public final int cursor;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT("effect")
    public final List<NewFaceStickerBean> stickers;

    public StickerItemList() {
        this(0, false, null, null, 15, null);
    }

    public final StickerItemList copy(int i, boolean z, List<? extends NewFaceStickerBean> list, LogPbBean logPbBean) {
        return new StickerItemList(i, z, list, logPbBean);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerItemList)) {
            return false;
        }
        StickerItemList stickerItemList = (StickerItemList) obj;
        return this.cursor == stickerItemList.cursor && this.hasMore == stickerItemList.hasMore && Intrinsics.LJFF(this.stickers, stickerItemList.stickers) && Intrinsics.LJFF(this.logPb, stickerItemList.logPb);
    }

    public int hashCode() {
        int iZ2 = ((((this.cursor * 31) + C786410Ut5.Z2(this.hasMore)) * 31) + this.stickers.hashCode()) * 31;
        LogPbBean logPbBean = this.logPb;
        return iZ2 + (logPbBean == null ? 0 : logPbBean.hashCode());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StickerItemList(cursor=");
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

    public final int getCursor() {
        return this.cursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final List<NewFaceStickerBean> getStickers() {
        return this.stickers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StickerItemList(int i, boolean z, List<? extends NewFaceStickerBean> list, LogPbBean logPbBean) {
        this.cursor = i;
        this.hasMore = z;
        this.stickers = list;
        this.logPb = logPbBean;
    }

    public StickerItemList(int i, boolean z, List list, LogPbBean logPbBean, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? C13BV.INSTANCE : list, (i2 & 8) != 0 ? null : logPbBean);
    }
}
