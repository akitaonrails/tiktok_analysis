package com.ss.android.ugc.aweme.mix.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class MixListResponse extends BaseResponse implements Serializable {
    public String LL = "";
    public String LLILLJJLI = "";
    public String LLILLL = "";
    public String LLILZ = "";

    @C09CT("cursor")
    public long cursor;

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("mix_list")
    public List<MixStruct> mixList;

    public final long getCursor() {
        return this.cursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final String getKeyWord() {
        return this.LL;
    }

    public final List<MixStruct> getMixList() {
        return this.mixList;
    }

    public final String getSearchId() {
        return this.LLILLJJLI;
    }

    public final String getSearchResultId() {
        return this.LLILLL;
    }

    public final String getSearchType() {
        return this.LLILZ;
    }

    public final void setCursor(long j) {
        this.cursor = j;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setKeyWord(String str) {
        this.LL = str;
    }

    public final void setMixList(List<MixStruct> list) {
        this.mixList = list;
    }

    public final void setSearchId(String str) {
        this.LLILLJJLI = str;
    }

    public final void setSearchResultId(String str) {
        this.LLILLL = str;
    }

    public final void setSearchType(String str) {
        this.LLILZ = str;
    }
}
