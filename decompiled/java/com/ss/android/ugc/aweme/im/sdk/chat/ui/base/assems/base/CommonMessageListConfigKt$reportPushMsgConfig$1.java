package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base;

import X.C013C;
import X.C01GW;
import X.C06Q4;
import X.C0PEM;
import X.C0ZZ5;
import X.C13BV;
import X.C2296808zG;
import X.C23250099c;
import X.C356901a3;
import X.C869590Y9l;
import X.InterfaceC2217461Bqa;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class CommonMessageListConfigKt$reportPushMsgConfig$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ long LL;
    public final /* synthetic */ C01GW<ChatroomEventAbility> LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ SessionInfo LLILZ;
    public final /* synthetic */ C013C LLILZIL;
    public final /* synthetic */ C013C LLILZLL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
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
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        List<C869590Y9l> listOM0;
        C01GW<ChatroomEventAbility> c01gw = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C0ZZ5.LIZ;
        ChatroomEventAbility value = c01gw.getValue();
        if (value == null || (listOM0 = value.OM0()) == null) {
            listOM0 = C13BV.INSTANCE;
        }
        long j = this.LLILLL;
        Iterator<C869590Y9l> it2 = listOM0.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C869590Y9l next = it2.next();
            if (next.getMsgId() == j) {
                if (next != null) {
                    return;
                }
            }
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C06Q4(this.LLILLL, listOM0, this.LLILZ, this.LLILZIL, this.LLILZLL, System.currentTimeMillis() - this.LL, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommonMessageListConfigKt$reportPushMsgConfig$1(long j, C01GW<? extends ChatroomEventAbility> c01gw, long j2, SessionInfo sessionInfo, C013C c013c, C013C c013c2) {
        this.LL = j;
        this.LLILLJJLI = c01gw;
        this.LLILLL = j2;
        this.LLILZ = sessionInfo;
        this.LLILZIL = c013c;
        this.LLILZLL = c013c2;
    }
}
