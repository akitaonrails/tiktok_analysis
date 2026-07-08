package com.ss.android.ugc.aweme.services.editeffect;

import X.C21415018rM;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;

/* JADX INFO: loaded from: classes23.dex */
public interface ISearchSugHelper {

    public static final class DefaultImpls {
    }

    void bindLiteSug(SearchSugEntity searchSugEntity, C21415018rM c21415018rM, View view, float f, Context context);

    boolean isSugNoCache(int i);

    String sugMobType(SearchSugEntity searchSugEntity);
}
