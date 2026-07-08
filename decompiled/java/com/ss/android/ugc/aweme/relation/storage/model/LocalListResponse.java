package com.ss.android.ugc.aweme.relation.storage.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class LocalListResponse extends BaseResponse {

    @C09CT("local_datas")
    public final List<LocalData> _data;

    @C09CT("has_more")
    public final Boolean _hasMore;

    @C09CT("next_page_token")
    public final String _nextPageToken;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    public final List<LocalData> getData() {
        List<LocalData> list = this._data;
        return list == null ? C13BV.INSTANCE : list;
    }

    public final boolean getHasMore() {
        Boolean bool = this._hasMore;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final String getNextPageToken() {
        String str = this._nextPageToken;
        return str == null ? "" : str;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalListResponse(data=");
        sbLIZ.append(this._data);
        sbLIZ.append(", _nextPageToken=");
        sbLIZ.append(this._nextPageToken);
        sbLIZ.append(", _hasMore=");
        sbLIZ.append(this._hasMore);
        sbLIZ.append(", logId: ");
        LogPbBean logPbBean = this.logPb;
        sbLIZ.append(logPbBean != null ? logPbBean.getImprId() : null);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LocalListResponse(List<LocalData> list, String str, Boolean bool, LogPbBean logPbBean) {
        this._data = list;
        this._nextPageToken = str;
        this._hasMore = bool;
        this.logPb = logPbBean;
    }
}
