package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PeopleAlsoLikeInfoStruct implements Serializable {

    @C09CT("covers")
    public final List<UrlModel> covers;

    public final boolean isValid() {
        List<UrlModel> list = this.covers;
        return list != null && list.size() >= 3;
    }

    public final List<UrlModel> getCovers() {
        return this.covers;
    }
}
