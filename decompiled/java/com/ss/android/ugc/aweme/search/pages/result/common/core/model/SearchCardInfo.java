package com.ss.android.ugc.aweme.search.pages.result.common.core.model;

import X.C09CT;
import X.C0PLU;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchCardInfo implements C0PLU, Serializable {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL = -1;

    @C09CT("ala_src")
    public String alasrc;

    @C09CT("doc_id")
    public String docId;

    @C09CT("sounds_list_type")
    public int soundsListType;

    public int hashCode() {
        String str = this.docId;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.alasrc;
        return ((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LL) * 31) + this.LLILLJJLI) * 31) + this.LLILLL;
    }

    public final String getAlasrc() {
        return this.alasrc;
    }

    public final int getCardType() {
        return this.LLILLL;
    }

    public final String getDocId() {
        return this.docId;
    }

    public final int getFeedType() {
        return this.LL;
    }

    public final int getRank() {
        return this.LLILLJJLI;
    }

    public final int getSoundsListType() {
        return this.soundsListType;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(SearchCardInfo.class, cls)) {
            return false;
        }
        SearchCardInfo searchCardInfo = (SearchCardInfo) obj;
        if (Intrinsics.LJFF(this.docId, searchCardInfo.docId) && Intrinsics.LJFF(this.alasrc, searchCardInfo.alasrc) && this.LL == searchCardInfo.LL && this.LLILLJJLI == searchCardInfo.LLILLJJLI && this.LLILLL == searchCardInfo.LLILLL) {
            return true;
        }
        return false;
    }

    public final void setAlasrc(String str) {
        this.alasrc = str;
    }

    public final void setCardType(int i) {
        this.LLILLL = i;
    }

    public final void setDocId(String str) {
        this.docId = str;
    }

    public final void setFeedType(int i) {
        this.LL = i;
    }

    public final void setRank(int i) {
        this.LLILLJJLI = i;
    }

    public final void setSoundsListType(int i) {
        this.soundsListType = i;
    }
}
