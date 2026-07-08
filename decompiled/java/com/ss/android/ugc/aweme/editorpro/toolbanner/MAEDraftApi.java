package com.ss.android.ugc.aweme.editorpro.toolbanner;

import X.C0X9S;
import X.InterfaceC1501060pAG;
import X.InterfaceC1501160pAQ;

/* JADX INFO: loaded from: classes28.dex */
public interface MAEDraftApi {
    @InterfaceC1501160pAQ("/api/json-store/access/mae_template_{date}")
    C0X9S<MAEDraftResponse> fetchDraftList(@InterfaceC1501060pAG("date") String str);
}
