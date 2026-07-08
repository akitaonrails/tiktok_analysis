package com.ss.android.ugc.aweme.feed.adapter.widget.enterroom;

import X.C01GW;
import X.C0CW2;
import X.C0J60;
import X.C0J65;
import X.C0J66;
import X.C1161920gLG;
import X.C11JL;
import X.C13IQ;
import X.C13LE;
import X.C176600m4;
import X.C19719912Dl;
import X.C1ACA;
import X.C481640Iug;
import X.C481660Iui;
import X.C481670Iuj;
import X.C481930Iv9;
import X.C481940IvA;
import X.C482240Ive;
import X.C486300J5g;
import X.C486320J5i;
import X.C486330J5j;
import X.C486370J5n;
import X.EnumC494740Jai;
import Y.AObserverS211S0100000_7;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.signaling.model.BaseDownlinkData;
import com.bytedance.android.livesdk.signaling.model.UplinkMessageResponse;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.hangout.component.interact.model.MultiTopLiveRoomMatchScene;
import com.ss.android.ugc.aweme.signaling.scene.biz.CacheStatusData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS125S0110000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LivePreviewEnterRoomBoostWidget extends LiveWatchPreviewWidget {
    public boolean LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public C11JL LLJILJIL;
    public C11JL LLJILJILJ;
    public volatile boolean LLJILLL;
    public boolean LLJJ;
    public final C481930Iv9 LLJJI;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0Iv9] */
    public LivePreviewEnterRoomBoostWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LivePreviewPlayerVM.class);
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(c19719912DlLIZ, 147);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        EnumC494740Jai enumC494740Jai = EnumC494740Jai.WIDGET;
        this.LLJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, enumC494740Jai, awS551S0100000_7, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FeedLiveViewHolderVM.class);
        this.LLJIJIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ2, enumC494740Jai, new AwS551S0100000_7(c19719912DlLIZ2, 148), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        this.LLJJI = new C0CW2<CacheStatusData>() { // from class: X.0Iv9
            @Override // X.C0CW2
            public final void LJII(BaseDownlinkData baseDownlinkData, UplinkMessageResponse uplinkMessageResponse, AwS125S0110000_7 awS125S0110000_7) {
                LiveRoomStruct liveRoomStruct;
                C1ACA c1acaZ1;
                Aweme aweme;
                String requestId;
                CacheStatusData cacheStatusData = (CacheStatusData) baseDownlinkData;
                C1ACA c1acaZ12 = this.LL.z1();
                if (c1acaZ12 != null && (liveRoomStruct = c1acaZ12.LIZJ) != null) {
                    long j = liveRoomStruct.id;
                    if (cacheStatusData.getRoomId() == j && (c1acaZ1 = this.LL.z1()) != null && (aweme = c1acaZ1.LIZIZ) != null && (requestId = aweme.getRequestId()) != null) {
                        ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).deleteEnterRoomBoostCache(requestId, j, cacheStatusData.getLatestCacheVersion());
                        C1ACA c1acaZ13 = this.LL.z1();
                        if (c1acaZ13 != null) {
                            c1acaZ13.LJJJJLI = true;
                        }
                    }
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void E1() {
        this.LL = true;
        M1();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void M1() {
        if (this.LLJILLL) {
            return;
        }
        this.LLJILLL = true;
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null) {
            c1acaZ1.LJJJJL = false;
        }
        C1ACA c1acaZ12 = z1();
        if (c1acaZ12 != null) {
            c1acaZ12.LJJJJLI = false;
        }
        C1ACA c1acaZ13 = z1();
        if (c1acaZ13 != null) {
            c1acaZ13.LJJJJJL = false;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void N1() {
        if (this.LLJILLL) {
            this.LLJILLL = false;
            C11JL c11jl = this.LLJILJIL;
            if (c11jl != null) {
                c11jl.dispose();
            }
            C11JL c11jl2 = this.LLJILJILJ;
            if (c11jl2 != null) {
                c11jl2.dispose();
            }
            this.LLJILJILJ = null;
            this.LLJILJIL = null;
            if (this.LLJ) {
                C481670Iuj c481670Iuj = C481670Iuj.LIZ;
                Map<C13IQ<?>, C0J66<?, ?>> map = C481670Iuj.LIZIZ;
                Object obj = ((LinkedHashMap) map).get(C13LE.LIZ(C481940IvA.class));
                if (obj == null) {
                    synchronized (c481670Iuj) {
                        try {
                            Object obj2 = ((LinkedHashMap) map).get(C13LE.LIZ(C481940IvA.class));
                            obj = obj2;
                            if (obj2 == null) {
                                C19719912Dl c19719912DlLIZ = C13LE.LIZ(C481940IvA.class);
                                C0J66<?, ?> c486370J5n = Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486370J5n.class)) ? new C486370J5n() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C0J60.class)) ? new C0J60() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486330J5j.class)) ? new C486330J5j() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486320J5i.class)) ? new C486320J5i() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486300J5g.class)) ? new C486300J5g() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481940IvA.class)) ? new C481940IvA() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481660Iui.class)) ? new C481660Iui() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C482240Ive.class)) ? new C482240Ive() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481640Iug.class)) ? new C481640Iug() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(MultiTopLiveRoomMatchScene.class)) ? new MultiTopLiveRoomMatchScene() : null;
                                map.put(C13LE.LIZ(C481940IvA.class), c486370J5n);
                                obj = c486370J5n;
                                if (c486370J5n != null) {
                                    C0J65.LL.LJI(c486370J5n);
                                    obj = c486370J5n;
                                }
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                boolean z = obj instanceof C481940IvA;
                Object obj3 = obj;
                if (!z) {
                    obj3 = null;
                }
                C0J66 c0j66 = (C0J66) obj3;
                if (c0j66 != null) {
                    c0j66.LJII(this.LLJJI);
                }
                this.LLJ = false;
            }
            C1ACA c1acaZ1 = z1();
            if (C176600m4.LIZIZ(c1acaZ1 != null ? Boolean.valueOf(c1acaZ1.LLFII) : null)) {
                return;
            }
            ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).abortEnterRoomBoost();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        super.L1();
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null) {
            c1acaZ1.LJJJJJ = false;
        }
        this.LLJJ = false;
        N1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void F1() {
        M1();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        N1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        super.LJJIJIIJIL(i);
        M1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJLIIIL(int i) {
        this.LL = false;
        N1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        MutableLiveData<Unit> mutableLiveData;
        super.onLoad(objArr);
        LivePreviewPlayerVM livePreviewPlayerVM = (LivePreviewPlayerVM) this.LLJI.getValue();
        if (livePreviewPlayerVM != null && (mutableLiveData = livePreviewPlayerVM.LLILZ) != null) {
            mutableLiveData.observe(this, new AObserverS211S0100000_7(this, 14));
        }
    }
}
