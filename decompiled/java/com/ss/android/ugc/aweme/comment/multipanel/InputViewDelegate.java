package com.ss.android.ugc.aweme.comment.multipanel;

import X.C450690Hlr;
import X.C451030HmP;
import X.InterfaceC450680Hlq;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;

/* JADX INFO: loaded from: classes7.dex */
public class InputViewDelegate implements InterfaceC450680Hlq {
    public final InterfaceC450680Hlq LL;

    @Override // X.InterfaceC450680Hlq
    public final void Id() {
    }

    @Override // X.InterfaceC450680Hlq
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public /* bridge */ /* synthetic */ void onDestroy() {
        C450690Hlr.LIZ(this);
    }

    @Override // X.InterfaceC450680Hlq
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public /* bridge */ /* synthetic */ void onPause() {
        C450690Hlr.LIZIZ(this);
    }

    @Override // X.InterfaceC450680Hlq
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public /* bridge */ /* synthetic */ void onResume() {
        C450690Hlr.LIZJ(this);
    }

    public InputViewDelegate(EmojiInputViewImplV2 emojiInputViewImplV2) {
        this.LL = emojiInputViewImplV2;
    }

    @Override // X.InterfaceC450680Hlq
    public final void CC(String str) {
        this.LL.CC(str);
    }

    @Override // X.InterfaceC450680Hlq
    public final void fU0(C451030HmP c451030HmP) {
        this.LL.fU0(c451030HmP);
    }

    @Override // X.InterfaceC450680Hlq
    public final void zm(CommentPersonalizedEmoji commentPersonalizedEmoji) {
        this.LL.zm(commentPersonalizedEmoji);
    }
}
