package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base;

import X.C356901a3;
import X.InterfaceC902970Zbb;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;

/* JADX INFO: loaded from: classes15.dex */
public final class CommonMessageListConfigKt$onSendMessageStatsTracker$businessLogicConfig$1$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ InterfaceC902970Zbb LL;
    public final /* synthetic */ SessionInfo LLILLJJLI;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        String str;
        InterfaceC902970Zbb interfaceC902970Zbb = this.LL;
        String conversationId = this.LLILLJJLI.getConversationId();
        if (this.LLILLJJLI.isMessageRequest()) {
            str = "stranger";
        } else {
            str = "no_stranger";
        }
        interfaceC902970Zbb.LIZIZ(conversationId, str);
        this.LL.reset();
    }

    public CommonMessageListConfigKt$onSendMessageStatsTracker$businessLogicConfig$1$1(InterfaceC902970Zbb interfaceC902970Zbb, SessionInfo sessionInfo) {
        this.LL = interfaceC902970Zbb;
        this.LLILLJJLI = sessionInfo;
    }
}
