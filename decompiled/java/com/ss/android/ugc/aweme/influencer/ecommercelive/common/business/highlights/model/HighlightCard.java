package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1891350zJl;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class HighlightCard implements Serializable, InterfaceC1891350zJl {
    public static final int $stable = 8;
    public final String groupDate;

    @C09CT("items")
    public final List<HighlightCellItem> highlightItems;
    public final Boolean isTopHighlight;
    public final Integer offset;

    @C09CT("title")
    public final String title;

    public final HighlightCard copy(String str, List<HighlightCellItem> list, Boolean bool, String str2, Integer num) {
        return new HighlightCard(str, list, bool, str2, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HighlightCard)) {
            return false;
        }
        HighlightCard highlightCard = (HighlightCard) obj;
        return Intrinsics.LJFF(this.title, highlightCard.title) && Intrinsics.LJFF(this.highlightItems, highlightCard.highlightItems) && Intrinsics.LJFF(this.isTopHighlight, highlightCard.isTopHighlight) && Intrinsics.LJFF(this.groupDate, highlightCard.groupDate) && Intrinsics.LJFF(this.offset, highlightCard.offset);
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<HighlightCellItem> list = this.highlightItems;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isTopHighlight;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.groupDate;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.offset;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HighlightCard(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", highlightItems=");
        sbLIZ.append(this.highlightItems);
        sbLIZ.append(", isTopHighlight=");
        sbLIZ.append(this.isTopHighlight);
        sbLIZ.append(", groupDate=");
        sbLIZ.append(this.groupDate);
        sbLIZ.append(", offset=");
        sbLIZ.append(this.offset);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getGroupDate() {
        return this.groupDate;
    }

    public final List<HighlightCellItem> getHighlightItems() {
        return this.highlightItems;
    }

    public final Integer getOffset() {
        return this.offset;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Boolean isTopHighlight() {
        return this.isTopHighlight;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public HighlightCard(String str, List<HighlightCellItem> list, Boolean bool, String str2, Integer num) {
        this.title = str;
        this.highlightItems = list;
        this.isTopHighlight = bool;
        this.groupDate = str2;
        this.offset = num;
    }
}
