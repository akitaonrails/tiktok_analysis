package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings;

import X.C273120An8;
import X.C273130An9;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsService;

/* JADX INFO: loaded from: classes5.dex */
public final class LiveRecordingsServiceImpl implements LiveRecordingsService {
    @Override // com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsService
    public final int LIZ() {
        return ((Number) C273120An8.LIZ.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsService
    public final boolean LIZIZ() {
        return ((Number) C273130An9.LIZ.getValue()).intValue() == 1;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsService
    public final boolean LIZJ() {
        return ((Number) C273130An9.LIZ.getValue()).intValue() == 2;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsService
    public final boolean isEnable() {
        return ((Number) C273130An9.LIZ.getValue()).intValue() > 0;
    }
}
