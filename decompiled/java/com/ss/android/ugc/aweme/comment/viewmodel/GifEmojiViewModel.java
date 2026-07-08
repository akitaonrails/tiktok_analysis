package com.ss.android.ugc.aweme.comment.viewmodel;

import X.C004I;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.comment.model.GifEmoji;

/* JADX INFO: loaded from: classes35.dex */
public class GifEmojiViewModel extends JediViewModel<GifEmojiState> {
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new GifEmojiState(new GifEmoji());
    }
}
