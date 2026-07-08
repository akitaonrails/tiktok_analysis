package com.ss.android.ugc.aweme.tools.mvtemplate;

import X.C004I;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: loaded from: classes9.dex */
public final class RecordMVViewModel extends BaseJediViewModel<RecordMVState> {
    public Effect LLILZIL;
    public String LLILZLL;
    public ShortVideoContext LLIZ;

    public final ShortVideoContext lR2() {
        ShortVideoContext shortVideoContext = this.LLIZ;
        if (shortVideoContext != null) {
            return shortVideoContext;
        }
        return null;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new RecordMVState(null, null);
    }
}
