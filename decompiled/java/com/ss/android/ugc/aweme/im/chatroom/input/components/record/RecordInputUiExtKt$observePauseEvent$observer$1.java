package com.ss.android.ugc.aweme.im.chatroom.input.components.record;

import X.C08CR;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class RecordInputUiExtKt$observePauseEvent$observer$1 implements LifecycleEventObserver {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ Lifecycle LLILLJJLI;

    public RecordInputUiExtKt$observePauseEvent$observer$1(LifecycleRegistry lifecycleRegistry, Function0 function0) {
        this.LL = function0;
        this.LLILLJJLI = lifecycleRegistry;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = C08CR.LIZ[event.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.LLILLJJLI.removeObserver(this);
                return;
            }
            return;
        }
        this.LL.invoke();
    }
}
