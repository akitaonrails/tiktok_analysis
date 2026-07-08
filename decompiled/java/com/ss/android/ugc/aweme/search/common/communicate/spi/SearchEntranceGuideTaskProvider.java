package com.ss.android.ugc.aweme.search.common.communicate.spi;

import X.C0QHB;
import X.C10GR;
import X.C19EG;
import X.C667580QGm;
import android.view.View;
import com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchEntranceGuideTaskService;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchEntranceGuideTaskProvider implements ISearchEntranceGuideTaskProvider {
    @Override // com.ss.android.ugc.aweme.search.common.communicate.spi.ISearchEntranceGuideTaskProvider
    public final Class<? extends C10GR> LIZ() {
        Class<? extends C10GR> clsLIZ;
        ISearchEntranceGuideTaskService.LIZ.getClass();
        ISearchEntranceGuideTaskService value = C0QHB.LIZIZ.getValue();
        return (value == null || (clsLIZ = value.LIZ()) == null) ? C667580QGm.class : clsLIZ;
    }

    @Override // com.ss.android.ugc.aweme.search.common.communicate.spi.ISearchEntranceGuideTaskProvider
    public final C10GR LIZIZ(View view, C19EG c19eg) {
        C10GR c10grLIZIZ;
        ISearchEntranceGuideTaskService.LIZ.getClass();
        ISearchEntranceGuideTaskService value = C0QHB.LIZIZ.getValue();
        if (value == null || (c10grLIZIZ = value.LIZIZ(view, c19eg)) == null) {
            return new C667580QGm();
        }
        return c10grLIZIZ;
    }
}
