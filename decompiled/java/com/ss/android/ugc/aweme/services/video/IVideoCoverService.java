package com.ss.android.ugc.aweme.services.video;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.effect.IEffectService;

/* JADX INFO: loaded from: classes9.dex */
public interface IVideoCoverService {
    void getVideoCoverByCallback(AwemeDraft awemeDraft, IEffectService.OnVideoCoverCallback onVideoCoverCallback);
}
