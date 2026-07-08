package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.view.SearchableEditText;

/* JADX INFO: loaded from: classes7.dex */
public final class ChatroomEditTextExtKt$clearEditTextListener$observer$1 implements LifecycleEventObserver {
    public final /* synthetic */ SearchableEditText LL;

    public ChatroomEditTextExtKt$clearEditTextListener$observer$1(SearchableEditText searchableEditText) {
        this.LL = searchableEditText;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event != Lifecycle.Event.ON_DESTROY) {
            return;
        }
        this.LL.LJIIJJI();
    }
}
