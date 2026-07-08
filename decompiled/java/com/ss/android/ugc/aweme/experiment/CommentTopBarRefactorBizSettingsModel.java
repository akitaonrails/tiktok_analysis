package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentTopBarRefactorBizSettingsModel implements Serializable {

    @C09CT("support_biz_type_list")
    public List<Integer> bizTypeList;

    public CommentTopBarRefactorBizSettingsModel() {
        this(null);
    }

    public CommentTopBarRefactorBizSettingsModel(List<Integer> list) {
        this.bizTypeList = list;
    }

    public final void setBizTypeList(List<Integer> list) {
        this.bizTypeList = list;
    }
}
