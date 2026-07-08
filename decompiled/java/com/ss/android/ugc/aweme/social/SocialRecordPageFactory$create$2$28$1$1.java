package com.ss.android.ugc.aweme.social;

import X.C13LE;
import X.C1644920suI;
import X.C1664750tQH;
import X.C1664770tQJ;
import X.C1DRG;
import X.C2217381BqS;
import X.C356901a3;
import X.InterfaceC1647420syK;
import X.InterfaceC2217461Bqa;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes30.dex */
public final class SocialRecordPageFactory$create$2$28$1$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final C1664750tQH LL;
    public final /* synthetic */ C1644920suI LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SocialRecordPageFactory$create$2$28$1$1.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
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
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
        ((InterfaceC1647420syK) this.LL.getValue(this, LLILLL[0])).xx2(this.LLILLJJLI);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        ((InterfaceC1647420syK) this.LL.getValue(this, LLILLL[0])).xx2(null);
    }

    public SocialRecordPageFactory$create$2$28$1$1(C1DRG c1drg, C1644920suI c1644920suI) {
        this.LLILLJJLI = c1644920suI;
        this.LL = C1664770tQJ.LIZ(c1drg, InterfaceC1647420syK.class, null);
    }
}
