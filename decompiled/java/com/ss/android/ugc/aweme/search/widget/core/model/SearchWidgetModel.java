package com.ss.android.ugc.aweme.search.widget.core.model;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchWidgetModel extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("data")
    public final List<SearchWidgetTypeBean> data;

    @C09CT("log_id")
    public final String logId;

    public final SearchWidgetModel copy(List<SearchWidgetTypeBean> list, String str) {
        return new SearchWidgetModel(list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchWidgetModel)) {
            return false;
        }
        SearchWidgetModel searchWidgetModel = (SearchWidgetModel) obj;
        return Intrinsics.LJFF(this.data, searchWidgetModel.data) && Intrinsics.LJFF(this.logId, searchWidgetModel.logId);
    }

    public int hashCode() {
        List<SearchWidgetTypeBean> list = this.data;
        return ((list == null ? 0 : list.hashCode()) * 31) + this.logId.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchWidgetModel(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.logId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getFirstGroupId() {
        SearchWidgetTypeBean searchWidgetTypeBean;
        List<SearchWidgetSuggestWord> list;
        List<SearchWidgetTypeBean> list2 = this.data;
        return ((list2 == null || list2.isEmpty()) || (list = (searchWidgetTypeBean = (SearchWidgetTypeBean) ListProtector.get(this.data, 0)).words) == null || list.isEmpty()) ? "" : ((SearchWidgetSuggestWord) ListProtector.get(searchWidgetTypeBean.words, 0)).getGroupId();
    }

    public final String getFirstGuessWord() {
        SearchWidgetTypeBean searchWidgetTypeBean;
        List<SearchWidgetSuggestWord> list;
        List<SearchWidgetTypeBean> list2 = this.data;
        return ((list2 == null || list2.isEmpty()) || (list = (searchWidgetTypeBean = (SearchWidgetTypeBean) ListProtector.get(this.data, 0)).words) == null || list.isEmpty()) ? "" : ((SearchWidgetSuggestWord) ListProtector.get(searchWidgetTypeBean.words, 0)).getWord();
    }

    public final SearchWidgetSuggestWord[] getSuggestWords() {
        List<SearchWidgetSuggestWord> list;
        List<SearchWidgetSuggestWord> listSubList;
        List<SearchWidgetTypeBean> list2 = this.data;
        if ((list2 == null || list2.isEmpty()) || (list = ((SearchWidgetTypeBean) ListProtector.get(this.data, 0)).words) == null || list.isEmpty()) {
            return null;
        }
        List<SearchWidgetSuggestWord> list3 = ((SearchWidgetTypeBean) ListProtector.get(this.data, 0)).words;
        if (list3 == null || list3.size() < 8) {
            List<SearchWidgetSuggestWord> list4 = ((SearchWidgetTypeBean) ListProtector.get(this.data, 0)).words;
            if (list4 != null) {
                return (SearchWidgetSuggestWord[]) list4.toArray(new SearchWidgetSuggestWord[0]);
            }
            return null;
        }
        List<SearchWidgetSuggestWord> list5 = ((SearchWidgetTypeBean) ListProtector.get(this.data, 0)).words;
        if (list5 == null || (listSubList = list5.subList(0, 8)) == null) {
            return null;
        }
        return (SearchWidgetSuggestWord[]) listSubList.toArray(new SearchWidgetSuggestWord[0]);
    }

    public final List<SearchWidgetTypeBean> getData() {
        return this.data;
    }

    public final String getLogId() {
        return this.logId;
    }

    public SearchWidgetModel(List<SearchWidgetTypeBean> list, String str) {
        this.data = list;
        this.logId = str;
    }
}
