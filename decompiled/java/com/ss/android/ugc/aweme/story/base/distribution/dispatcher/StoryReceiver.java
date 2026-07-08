package com.ss.android.ugc.aweme.story.base.distribution.dispatcher;

import X.AbstractC727240Sfq;
import X.C19719612Di;
import X.C727150Sfh;
import X.InterfaceC420801kM;
import X.InterfaceC726980SfQ;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import java.util.Set;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryReceiver implements GenericLifecycleObserver {
    public final Object LL;
    public final InterfaceC726980SfQ LLILLJJLI;
    public final AbstractC727240Sfq<?, ?> LLILLL;
    public InterfaceC420801kM LLILZ;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        AbstractC727240Sfq<?, ?> abstractC727240Sfq = this.LLILLL;
        InterfaceC726980SfQ interfaceC726980SfQ = this.LLILLJJLI;
        Set<StoryReceiver> set = abstractC727240Sfq.LIZ.get(interfaceC726980SfQ);
        if (set != null) {
            C19719612Di.LJJIII(set, new AwS590S0100000_11(this, 7), true);
        }
        abstractC727240Sfq.LIZ.remove(interfaceC726980SfQ);
        InterfaceC420801kM interfaceC420801kM = this.LLILZ;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
    }

    public StoryReceiver(Object obj, InterfaceC726980SfQ interfaceC726980SfQ, C727150Sfh c727150Sfh) {
        this.LL = obj;
        this.LLILLJJLI = interfaceC726980SfQ;
        this.LLILLL = c727150Sfh;
        IMainSAFLifecycleKt.requireMainSAFLifecycle(interfaceC726980SfQ, null, false).getLifecycle().addObserver(this);
    }
}
