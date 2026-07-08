package com.ss.android.ugc.aweme.forward.model;

import X.C09CT;
import X.C0X12;
import X.C616570OGh;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class UserDynamicList extends BaseResponse implements C0X12 {

    @C09CT("dongtai_list")
    public List<DynamicStruct> dynamicList;

    @C09CT("has_more")
    public int hasMore;

    @C09CT("max_cursor")
    public long maxCursor;

    @C09CT("min_cursor")
    public long minCursor;
    public String requestId;

    public List<DynamicStruct> getDynamicList() {
        return this.dynamicList;
    }

    public int getHasMore() {
        return this.hasMore;
    }

    public long getMaxCursor() {
        return this.maxCursor;
    }

    public long getMinCursor() {
        return this.minCursor;
    }

    @Override // X.C0X12
    public String getRequestId() {
        return this.requestId;
    }

    public void setDynamicList(List<DynamicStruct> list) {
        this.dynamicList = list;
    }

    public void setHasMore(int i) {
        this.hasMore = i;
    }

    public void setMaxCursor(long j) {
        this.maxCursor = j;
    }

    public void setMinCursor(long j) {
        this.minCursor = j;
    }

    @Override // X.C0X12
    public void setRequestId(String str) {
        this.requestId = str;
        if (C616570OGh.LIZ(this.dynamicList)) {
            return;
        }
        for (DynamicStruct dynamicStruct : this.dynamicList) {
            if (dynamicStruct != null) {
                dynamicStruct.setRequestId(str);
            }
        }
    }
}
