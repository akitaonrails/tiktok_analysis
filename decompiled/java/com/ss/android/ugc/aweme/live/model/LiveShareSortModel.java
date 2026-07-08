package com.ss.android.ugc.aweme.live.model;

import X.C09CT;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class LiveShareSortModel implements Serializable {

    @C09CT("share_list")
    public List<? extends IMContact> shareList;

    public LiveShareSortModel() {
        this(null);
    }

    public LiveShareSortModel(List<? extends IMContact> list) {
        this.shareList = list;
    }

    public final void setShareList(List<? extends IMContact> list) {
        this.shareList = list;
    }
}
