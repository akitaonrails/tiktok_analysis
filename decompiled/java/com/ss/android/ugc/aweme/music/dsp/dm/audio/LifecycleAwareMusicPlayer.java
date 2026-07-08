package com.ss.android.ugc.aweme.music.dsp.dm.audio;

import X.C01GW;
import X.C0OR6;
import X.C20498815Ja;
import X.C2199208jW;
import X.C2199308jX;
import X.C2296808zG;
import X.C23250099c;
import X.C356901a3;
import X.C452501pT;
import X.C598060Ncy;
import X.C620260OUm;
import X.InterfaceC620290OUp;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.chatroom.IIMChatRoomOpenService;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class LifecycleAwareMusicPlayer implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public String LL;
    public final InterfaceC620290OUp LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public boolean LLILZLL;
    public C0OR6 LLIZ;
    public float LLIZLLLIL;

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

    public final C20498815Ja LIZ() {
        return (C20498815Ja) this.LLILZ.getValue();
    }

    public LifecycleAwareMusicPlayer(String str) {
        C2199208jW c2199208jW = C2199308jX.LIZ;
        this.LL = str;
        this.LLILLJJLI = c2199208jW;
        this.LLILLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1690));
        this.LLILZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1691));
        this.LLILZIL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(439));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
        IIMChatRoomOpenService iIMChatRoomOpenService = (IIMChatRoomOpenService) PluggableExtentionKt.pluggableSpi$default(IIMChatRoomOpenService.class, false, false, false, 14, null);
        if (iIMChatRoomOpenService != null) {
            iIMChatRoomOpenService.LIZLLL((C620260OUm) this.LLILLL.getValue());
        }
        String str = this.LL;
        this.LL = str;
        this.LLILZLL = true;
        this.LLIZ = null;
        C23250099c.LIZLLL(C2296808zG.LIZIZ(), null, null, new C598060Ncy(this, str, null), 3);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        IIMChatRoomOpenService iIMChatRoomOpenService = (IIMChatRoomOpenService) PluggableExtentionKt.pluggableSpi$default(IIMChatRoomOpenService.class, false, false, false, 14, null);
        if (iIMChatRoomOpenService != null) {
            iIMChatRoomOpenService.LJ((C620260OUm) this.LLILLL.getValue());
        }
        this.LLILZLL = false;
        this.LLIZ = null;
        LIZ().release();
        this.LLILLJJLI.LIZJ();
        lifecycleOwner.getLifecycle().removeObserver(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
        LIZ().pause();
        if (this.LLILZLL) {
            this.LLILZLL = false;
            this.LLILLJJLI.LIZ(this.LLIZLLLIL, false);
        }
    }
}
