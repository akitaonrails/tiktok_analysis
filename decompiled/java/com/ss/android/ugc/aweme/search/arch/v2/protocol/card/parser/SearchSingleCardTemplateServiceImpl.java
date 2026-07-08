package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser;

import X.C04TD;
import X.C13LE;
import X.C19719912Dl;
import X.C656810PpX;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.utils.SearchSingleCardTemplateService;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchSingleCardTemplateServiceImpl implements SearchSingleCardTemplateService {
    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.utils.SearchSingleCardTemplateService
    public final C19719912Dl LIZ() {
        return C13LE.LIZ(SearchBuiltInBottomAssem.class);
    }

    public static SearchSingleCardTemplateService LIZJ() {
        Object objLIZ = C04TD.LIZ(SearchSingleCardTemplateService.class, false);
        if (objLIZ != null) {
            return (SearchSingleCardTemplateService) objLIZ;
        }
        if (C04TD.G3 == null) {
            synchronized (SearchSingleCardTemplateService.class) {
                if (C04TD.G3 == null) {
                    C04TD.G3 = new SearchSingleCardTemplateServiceImpl();
                }
            }
        }
        return C04TD.G3;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.utils.SearchSingleCardTemplateService
    public final SearchSingleCardTemplateAssem LIZIZ(C656810PpX c656810PpX) {
        return new SearchSingleCardTemplateAssem(c656810PpX);
    }
}
