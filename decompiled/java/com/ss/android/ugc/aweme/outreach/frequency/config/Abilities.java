package com.ss.android.ugc.aweme.outreach.frequency.config;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class Abilities {

    @C09CT("client_frequency_control")
    public final ClientFrequencyControl clientFrequencyControl;

    @C09CT("client_local_storage")
    public final ClientLocalStorage clientLocalStorage;

    @C09CT("records_clipping")
    public final RecordsClipping recordsClipping;

    @C09CT("unified_upload_records")
    public final UnifiedUploadRecordsAbility unifiedUploadRecords;

    public Abilities(RecordsClipping recordsClipping, ClientFrequencyControl clientFrequencyControl, UnifiedUploadRecordsAbility unifiedUploadRecordsAbility, ClientLocalStorage clientLocalStorage) {
        this.recordsClipping = recordsClipping;
        this.clientFrequencyControl = clientFrequencyControl;
        this.unifiedUploadRecords = unifiedUploadRecordsAbility;
        this.clientLocalStorage = clientLocalStorage;
    }
}
