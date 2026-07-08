package com.ss.android.ugc.aweme.search.widget.core.communicate;

import X.C04TD;
import X.C13LE;
import X.C19719912Dl;
import com.ss.android.ugc.aweme.search.widget.ISearchWidgetService;
import com.ss.android.ugc.aweme.search.widget.core.videwmodel.SearchLaunchAssem;
import com.ss.android.ugc.aweme.search.widget.core.videwmodel.SearchWidgetAssem;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchWidgetServiceImpl implements ISearchWidgetService {
    @Override // com.ss.android.ugc.aweme.search.widget.ISearchWidgetService
    public final C19719912Dl LIZ() {
        return C13LE.LIZ(SearchLaunchAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.search.widget.ISearchWidgetService
    public final C19719912Dl LIZIZ() {
        return C13LE.LIZ(SearchWidgetAssem.class);
    }

    public static ISearchWidgetService LIZJ() {
        Object objLIZ = C04TD.LIZ(ISearchWidgetService.class, false);
        if (objLIZ != null) {
            return (ISearchWidgetService) objLIZ;
        }
        if (C04TD.O3 == null) {
            synchronized (ISearchWidgetService.class) {
                if (C04TD.O3 == null) {
                    C04TD.O3 = new SearchWidgetServiceImpl();
                }
            }
        }
        return C04TD.O3;
    }
}
