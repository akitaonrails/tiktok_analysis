package com.ss.android.ugc.aweme.services.draft;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;

/* JADX INFO: loaded from: classes9.dex */
public abstract class DraftListenerAdapter implements IDraftListener {
    @Override // com.ss.android.ugc.aweme.services.draft.IDraftListener
    public void onDeleted(AwemeDraft awemeDraft) {
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftListener
    public void onUpdated(IDraftListener.UpdateParams updateParams) {
    }
}
