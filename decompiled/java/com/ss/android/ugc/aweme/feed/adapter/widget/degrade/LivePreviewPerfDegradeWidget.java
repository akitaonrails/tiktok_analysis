package com.ss.android.ugc.aweme.feed.adapter.widget.degrade;

import X.AbstractC19484711Kz;
import X.C01GW;
import X.C09JN;
import X.C1100750ekb;
import X.C11JF;
import X.C11JL;
import X.C11NZ;
import X.C11S5;
import X.C13LE;
import X.C1701940uOG;
import X.C19719912Dl;
import X.C452501pT;
import X.C755900Tky;
import X.EnumC494740Jai;
import X.InterfaceC1100800ekg;
import Y.AfS181S0100000_12;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LivePreviewPerfDegradeWidget extends LiveWatchPreviewWidget {
    public boolean LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(189));
    public final C01GW LLJIJIL;
    public C11JL LLJILJIL;
    public C11JF LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public boolean LLJJI;

    public LivePreviewPerfDegradeWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LivePreviewPlayerVM.class);
        this.LLJIJIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, EnumC494740Jai.WIDGET, new AwS556S0100000_12(c19719912DlLIZ, 454), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), WidgetWithoutSyncConfig.INSTANCE.getInitVmWithoutSync());
        this.LLJILLL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(190));
        this.LLJJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 453));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        this.LLJJI = false;
        C755900Tky c755900Tky = C755900Tky.LL;
        Object value = this.LLJJ.getValue();
        c755900Tky.getClass();
        ConcurrentHashSet<String> concurrentHashSet = C755900Tky.LLILLL;
        concurrentHashSet.remove(value);
        if (concurrentHashSet.isEmpty()) {
            InterfaceC1100800ekg interfaceC1100800ekg = (InterfaceC1100800ekg) C755900Tky.LLJI.getValue();
            if (interfaceC1100800ekg != null) {
                interfaceC1100800ekg.stop();
            }
        } else {
            InterfaceC1100800ekg interfaceC1100800ekg2 = (InterfaceC1100800ekg) C755900Tky.LLJI.getValue();
            if (interfaceC1100800ekg2 != null) {
                interfaceC1100800ekg2.start();
            }
        }
        C11JF c11jf = this.LLJILJILJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C11JL c11jl = this.LLJILJIL;
        if (c11jl != null) {
            c11jl.dispose();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void H1() {
        MutableLiveData<C1100750ekb> mutableLiveData;
        C755900Tky c755900Tky = C755900Tky.LL;
        Object value = this.LLJJ.getValue();
        c755900Tky.getClass();
        ConcurrentHashSet<String> concurrentHashSet = C755900Tky.LLILLL;
        concurrentHashSet.remove(value);
        if (concurrentHashSet.isEmpty()) {
            InterfaceC1100800ekg interfaceC1100800ekg = (InterfaceC1100800ekg) C755900Tky.LLJI.getValue();
            if (interfaceC1100800ekg != null) {
                interfaceC1100800ekg.stop();
            }
        } else {
            InterfaceC1100800ekg interfaceC1100800ekg2 = (InterfaceC1100800ekg) C755900Tky.LLJI.getValue();
            if (interfaceC1100800ekg2 != null) {
                interfaceC1100800ekg2.start();
            }
        }
        C11JF c11jf = this.LLJILJILJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C11JL c11jl = this.LLJILJIL;
        if (c11jl != null) {
            c11jl.dispose();
        }
        this.LLJ = false;
        LivePreviewPlayerVM livePreviewPlayerVM = (LivePreviewPlayerVM) this.LLJIJIL.getValue();
        if (livePreviewPlayerVM == null || (mutableLiveData = livePreviewPlayerVM.LLJILLL) == null) {
            return;
        }
        mutableLiveData.setValue(null);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void J1() {
        C755900Tky c755900Tky = C755900Tky.LL;
        Object value = this.LLJJ.getValue();
        c755900Tky.getClass();
        ConcurrentHashSet<String> concurrentHashSet = C755900Tky.LLILLL;
        concurrentHashSet.add((String) value);
        if (concurrentHashSet.isEmpty()) {
            InterfaceC1100800ekg interfaceC1100800ekg = (InterfaceC1100800ekg) C755900Tky.LLJI.getValue();
            if (interfaceC1100800ekg != null) {
                interfaceC1100800ekg.stop();
            }
        } else {
            InterfaceC1100800ekg interfaceC1100800ekg2 = (InterfaceC1100800ekg) C755900Tky.LLJI.getValue();
            if (interfaceC1100800ekg2 != null) {
                interfaceC1100800ekg2.start();
            }
        }
        C11JL c11jl = this.LLJILJIL;
        if (c11jl != null) {
            c11jl.dispose();
        }
        this.LLJILJIL = (C11JL) AbstractC19484711Kz.LJIJI(new Callable() { // from class: X.0Tdu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("LivePreviewPerfDegradeWidget@7d18.bindView$1");
                C755900Tky.LL.getClass();
                C1100750ekb c1100750ekbLIZIZ = C755900Tky.LIZIZ();
                C1C7U.LIZIZ("LivePreviewPerfDegradeWidget@7d18.bindView$1");
                return c1100750ekbLIZIZ;
            }
        }).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS181S0100000_12(this, 204), new C09JN() { // from class: X.01c9
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("LivePreviewPerfDegradeWidget@7d18.bindView$3");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LivePreviewPerfDegradeWidget previewPullStreamSync error: ");
                sbLIZ.append(obj);
                System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("LivePreviewPerfDegradeWidget@7d18.bindView$3");
            }
        });
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void M1() {
        if (this.LLJJI) {
            return;
        }
        C755900Tky c755900Tky = C755900Tky.LL;
        Object value = this.LLJJ.getValue();
        c755900Tky.getClass();
        ConcurrentHashSet<String> concurrentHashSet = C755900Tky.LLILLL;
        concurrentHashSet.add((String) value);
        if (concurrentHashSet.isEmpty()) {
            InterfaceC1100800ekg interfaceC1100800ekg = (InterfaceC1100800ekg) C755900Tky.LLJI.getValue();
            if (interfaceC1100800ekg != null) {
                interfaceC1100800ekg.stop();
            }
        } else {
            InterfaceC1100800ekg interfaceC1100800ekg2 = (InterfaceC1100800ekg) C755900Tky.LLJI.getValue();
            if (interfaceC1100800ekg2 != null) {
                interfaceC1100800ekg2.start();
            }
        }
        this.LLJJI = true;
        C11JF c11jf = this.LLJILJILJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJILJILJ = (C11JF) C11NZ.LJJJJJL(0L, ((Number) this.LLJILLL.getValue()).longValue(), TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.0Tdt
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("LivePreviewPerfDegradeWidget@7d18.onWidgetResumed$1");
                C755900Tky.LL.getClass();
                C755900Tky.LIZIZ();
                C1C7U.LIZIZ("LivePreviewPerfDegradeWidget@7d18.onWidgetResumed$1");
            }
        }, new C09JN() { // from class: X.0TLN
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("LivePreviewPerfDegradeWidget@7d18.onWidgetResumed$2");
                C1C7U.LIZIZ("LivePreviewPerfDegradeWidget@7d18.onWidgetResumed$2");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void E1() {
        M1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void F1() {
        M1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        M1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJLIIIL(int i) {
        this.LLJJI = false;
        C755900Tky c755900Tky = C755900Tky.LL;
        Object value = this.LLJJ.getValue();
        c755900Tky.getClass();
        ConcurrentHashSet<String> concurrentHashSet = C755900Tky.LLILLL;
        concurrentHashSet.remove(value);
        if (concurrentHashSet.isEmpty()) {
            InterfaceC1100800ekg interfaceC1100800ekg = (InterfaceC1100800ekg) C755900Tky.LLJI.getValue();
            if (interfaceC1100800ekg != null) {
                interfaceC1100800ekg.stop();
            }
        } else {
            InterfaceC1100800ekg interfaceC1100800ekg2 = (InterfaceC1100800ekg) C755900Tky.LLJI.getValue();
            if (interfaceC1100800ekg2 != null) {
                interfaceC1100800ekg2.start();
            }
        }
        C11JF c11jf = this.LLJILJILJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C11JL c11jl = this.LLJILJIL;
        if (c11jl != null) {
            c11jl.dispose();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
    }
}
