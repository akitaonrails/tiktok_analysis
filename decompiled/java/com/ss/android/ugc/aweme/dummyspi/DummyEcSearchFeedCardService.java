package com.ss.android.ugc.aweme.dummyspi;

import X.C13BV;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feedcard.IEcSearchFeedCardService;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class DummyEcSearchFeedCardService implements IEcSearchFeedCardService {
    @Override // com.ss.android.ugc.aweme.feedcard.IEcSearchFeedCardService
    public final void LIZIZ(List<? extends Aweme> list) {
    }

    @Override // com.ss.android.ugc.aweme.feedcard.IEcSearchFeedCardService
    public final void initSignalMonitor() {
    }

    @Override // com.ss.android.ugc.aweme.feedcard.IEcSearchFeedCardService
    public final Map<String, Object> LIZ() {
        return new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.feedcard.IEcSearchFeedCardService
    public final List<String> LIZJ() {
        return C13BV.INSTANCE;
    }
}
