package com.ss.android.ugc.aweme.services.now.model;

import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;

/* JADX INFO: loaded from: classes9.dex */
public final class CreativeNowDraft {
    public final String creationId;
    public final BaseShortVideoContext editModel;
    public final NowsShootModel nowsShootData;
    public final long savedTime;
    public final AwemeDraft sourceDraftData;

    public CreativeNowDraft() {
        this("", 0L, null, null, null);
    }

    public CreativeNowDraft(String str, long j, BaseShortVideoContext baseShortVideoContext, NowsShootModel nowsShootModel, AwemeDraft awemeDraft) {
        this.creationId = str;
        this.savedTime = j;
        this.editModel = baseShortVideoContext;
        this.nowsShootData = nowsShootModel;
        this.sourceDraftData = awemeDraft;
    }
}
