package com.ss.android.ugc.aweme.search.creation.effect;

import X.C0QNF;
import X.C21415018rM;
import X.C669090QMh;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.services.editeffect.ISearchSugHelper;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchSugHelperImpl implements ISearchSugHelper {
    @Override // com.ss.android.ugc.aweme.services.editeffect.ISearchSugHelper
    public final boolean isSugNoCache(int i) {
        return i == -1;
    }

    @Override // com.ss.android.ugc.aweme.services.editeffect.ISearchSugHelper
    public final String sugMobType(SearchSugEntity searchSugEntity) {
        return C0QNF.LIZLLL(searchSugEntity);
    }

    @Override // com.ss.android.ugc.aweme.services.editeffect.ISearchSugHelper
    public final void bindLiteSug(SearchSugEntity searchSugEntity, C21415018rM c21415018rM, View view, float f, Context context) {
        C669090QMh.LIZIZ(C669090QMh.LIZ, searchSugEntity, c21415018rM, f, context, null, 32);
    }
}
