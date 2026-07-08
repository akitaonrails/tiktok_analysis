package com.ss.android.ugc.aweme.services.external;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;

/* JADX INFO: loaded from: classes23.dex */
public interface IGetPublishDraftCallback {
    void onFail();

    void onSuccess(AwemeDraft awemeDraft);
}
