package com.ss.android.ugc.aweme.search.common.communicate;

import X.C13IQ;
import X.C13LE;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.ss.android.ugc.aweme.search.ISearchAssemDebugService;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchCLASubtitleCommonAssem;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchAssemDebugService implements ISearchAssemDebugService {
    @Override // com.ss.android.ugc.aweme.search.ISearchAssemDebugService
    public final List<C13IQ<? extends ReusedAssem<?>>> LIZ() {
        return Collections.singletonList(C13LE.LIZ(SearchCLASubtitleCommonAssem.class));
    }
}
