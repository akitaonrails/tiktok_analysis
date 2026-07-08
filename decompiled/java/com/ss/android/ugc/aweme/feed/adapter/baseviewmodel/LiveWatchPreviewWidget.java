package com.ss.android.ugc.aweme.feed.adapter.baseviewmodel;

import X.C01GW;
import X.C07IN;
import X.C0A5Q;
import X.C1085470eLx;
import X.C13IQ;
import X.C13LE;
import X.C19386510sx;
import X.C19719912Dl;
import X.C1ACA;
import X.C1ACT;
import X.C20597915ir;
import X.C268890AgJ;
import X.C452501pT;
import X.C513601zK;
import X.C5182020e;
import X.EnumC494740Jai;
import Y.AObserverS216S0100000_12;
import Y.AObserverS220S0100000_16;
import Y.AObserverS234S0100000_32;
import Y.AObserverS235S0100000_33;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.experiment.PreloadWidgetsData;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.ViewHolderStatusVM;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public abstract class LiveWatchPreviewWidget extends LiveRecyclableWidget {
    public static final C01GW<HashMap<View, C1085470eLx>> LLIZLLLIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(177));
    public boolean LL;
    public boolean LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;

    public LiveWatchPreviewWidget() {
        C1ACT.INITIALIZING.getState();
        this.LLILLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2075));
        this.LLILZ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 142));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ViewHolderStatusVM.class);
        this.LLILZIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, EnumC494740Jai.WIDGET, new C5182020e((C13IQ) c19719912DlLIZ, 110), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), WidgetWithoutSyncConfig.INSTANCE.getInitVmWithoutSync());
        this.LLILZLL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(113));
        this.LLIZ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 143));
    }

    public void B1() {
    }

    public void C1(boolean z) {
    }

    public void D1(boolean z) {
    }

    public void E1() {
        this.LL = true;
    }

    public void F1() {
    }

    public void G1() {
    }

    public void H1() {
    }

    public void I1() {
    }

    public void J1() {
    }

    public void L1() {
        this.LL = false;
        this.LLILLJJLI = false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public boolean needRecycle() {
        return ((PreloadWidgetsData) C20597915ir.LIZIZ.getValue()).enableRecycleWidget;
    }

    public final ViewHolderStatusVM y1() {
        return (ViewHolderStatusVM) this.LLILZIL.getValue();
    }

    public final C1ACA z1() {
        return (C1ACA) this.LLILZ.getValue();
    }

    public final void x1() {
        LiveRoomStruct liveRoomStruct;
        C1ACA c1acaZ1;
        C1ACA c1acaZ12 = z1();
        boolean z = false;
        if (c1acaZ12 != null && (liveRoomStruct = c1acaZ12.LIZJ) != null && liveRoomStruct.isTopGifter && (c1acaZ1 = z1()) != null && !c1acaZ1.LJIILLIIL) {
            z = true;
        }
        if (this.LLILLJJLI && !this.LL && (((Boolean) C268890AgJ.LIZ.getValue()).booleanValue() || z)) {
            this.LL = true;
        }
        F1();
    }

    public static RecyclableWidgetManager.LoadInterceptor A1(View view) {
        if (view != null && C07IN.LIZ()) {
            C01GW<HashMap<View, C1085470eLx>> c01gw = LLIZLLLIL;
            if (c01gw.getValue().get(view) == null) {
                RecyclableWidgetManager.LoadInterceptor loadInterceptor = new RecyclableWidgetManager.LoadInterceptor() { // from class: X.0eLx
                    public final C01GW LIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(118));
                    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(117));

                    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetManager.LoadInterceptor
                    public final boolean intercept(int i, Widget widget) {
                        if (((HashMap) this.LIZ.getValue()).containsKey(Integer.valueOf(i))) {
                            Widget widget2 = (Widget) ((HashMap) this.LIZ.getValue()).get(Integer.valueOf(i));
                            if (widget2 == null || widget2.getId() != i) {
                                return false;
                            }
                            return true;
                        }
                        ((HashMap) this.LIZ.getValue()).put(Integer.valueOf(i), widget);
                        return false;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetManager.LoadInterceptor
                    public final boolean intercept(int i, Class<? extends Widget> cls) {
                        if (((HashSet) this.LIZIZ.getValue()).contains(Integer.valueOf(i))) {
                            return true;
                        }
                        ((HashSet) this.LIZIZ.getValue()).add(Integer.valueOf(i));
                        return false;
                    }
                };
                c01gw.getValue().put(view, loadInterceptor);
                return loadInterceptor;
            }
            return c01gw.getValue().get(view);
        }
        return null;
    }

    public void LJJIJIIJIL(int i) {
        this.LL = true;
        this.LLILLJJLI = true;
    }

    public void LJLIIIL(int i) {
        this.LL = false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onLoad(Object[] objArr) {
        C19386510sx<String> c19386510sx;
        C19386510sx<String> c19386510sx2;
        MutableLiveData<Integer> mutableLiveData;
        MutableLiveData<Unit> mutableLiveData2;
        C19386510sx<Integer> c19386510sx3;
        MutableLiveData<Unit> mutableLiveData3;
        C19386510sx<Unit> c19386510sx4;
        C19386510sx<Unit> c19386510sx5;
        MutableLiveData<Unit> mutableLiveData4;
        NextLiveData<Boolean> nextLiveData;
        NextLiveData<Boolean> nextLiveData2;
        NextLiveData<Unit> nextLiveData3;
        MutableLiveData<Unit> mutableLiveData5;
        MutableLiveData<Integer> mutableLiveData6;
        if (((Boolean) C0A5Q.LIZ.getValue()).booleanValue()) {
            ViewHolderStatusVM viewHolderStatusVMY1 = y1();
            if (viewHolderStatusVMY1 != null && (mutableLiveData6 = viewHolderStatusVMY1.LLJJI) != null) {
                mutableLiveData6.observe(this, new AObserverS235S0100000_33(this, 6));
            }
            ViewHolderStatusVM viewHolderStatusVMY12 = y1();
            if (viewHolderStatusVMY12 != null && (mutableLiveData5 = viewHolderStatusVMY12.LLILZLL) != null) {
                mutableLiveData5.observe(this, new AObserverS234S0100000_32(this, 14));
            }
        } else {
            ViewHolderStatusVM viewHolderStatusVMY13 = y1();
            if (viewHolderStatusVMY13 != null && (c19386510sx5 = viewHolderStatusVMY13.LLILLL) != null) {
                c19386510sx5.LIZ.observe(this, new AObserverS235S0100000_33(this, 76));
            }
            ViewHolderStatusVM viewHolderStatusVMY14 = y1();
            if (viewHolderStatusVMY14 != null && (c19386510sx4 = viewHolderStatusVMY14.LLJ) != null) {
                c19386510sx4.LIZ.observe(this, new AObserverS235S0100000_33(this, 77));
            }
            ViewHolderStatusVM viewHolderStatusVMY15 = y1();
            if (viewHolderStatusVMY15 != null && (mutableLiveData3 = viewHolderStatusVMY15.LLILZLL) != null) {
                mutableLiveData3.observe(this, new AObserverS234S0100000_32(this, 48));
            }
            ViewHolderStatusVM viewHolderStatusVMY16 = y1();
            if (viewHolderStatusVMY16 != null && (c19386510sx3 = viewHolderStatusVMY16.LLIZ) != null) {
                c19386510sx3.LIZ.observe(this, new C513601zK(this, 58));
            }
            ViewHolderStatusVM viewHolderStatusVMY17 = y1();
            if (viewHolderStatusVMY17 != null && (mutableLiveData2 = viewHolderStatusVMY17.LLILZIL) != null) {
                mutableLiveData2.observe(this, new AObserverS235S0100000_33(this, 78));
            }
            ViewHolderStatusVM viewHolderStatusVMY18 = y1();
            if (viewHolderStatusVMY18 != null && (mutableLiveData = viewHolderStatusVMY18.LLILZ) != null) {
                mutableLiveData.observe(this, new AObserverS235S0100000_33(this, 79));
            }
            ViewHolderStatusVM viewHolderStatusVMY19 = y1();
            if (viewHolderStatusVMY19 != null && (c19386510sx2 = viewHolderStatusVMY19.LLIZLLLIL) != null) {
                c19386510sx2.LIZ.observe(this, new AObserverS235S0100000_33(this, 80));
            }
            ViewHolderStatusVM viewHolderStatusVMY110 = y1();
            if (viewHolderStatusVMY110 != null && (c19386510sx = viewHolderStatusVMY110.LLILLJJLI) != null) {
                c19386510sx.LIZ.observe(this, new AObserverS235S0100000_33(this, 81));
            }
        }
        ViewHolderStatusVM viewHolderStatusVMY111 = y1();
        if (viewHolderStatusVMY111 != null && (nextLiveData3 = viewHolderStatusVMY111.LLJI) != null) {
            nextLiveData3.observe(this, new AObserverS220S0100000_16(this, 3));
        }
        ViewHolderStatusVM viewHolderStatusVMY112 = y1();
        if (viewHolderStatusVMY112 != null && (nextLiveData2 = viewHolderStatusVMY112.LLJIJIL) != null) {
            nextLiveData2.observe(this, new AObserverS216S0100000_12(this, 35));
        }
        ViewHolderStatusVM viewHolderStatusVMY113 = y1();
        if (viewHolderStatusVMY113 != null && (nextLiveData = viewHolderStatusVMY113.LLJILJIL) != null) {
            nextLiveData.observe(this, new C513601zK(this, 40));
        }
        ViewHolderStatusVM viewHolderStatusVMY114 = y1();
        if (viewHolderStatusVMY114 != null && (mutableLiveData4 = viewHolderStatusVMY114.LLJILJILJ) != null) {
            mutableLiveData4.observe(this, new AObserverS220S0100000_16(this, 4));
        }
    }
}
