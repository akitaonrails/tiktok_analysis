package com.ss.android.ugc.aweme.poi.detail.videolist.autoplay;

import X.C01GW;
import X.C0CAN;
import X.C0CAP;
import X.C118300cf;
import X.C1558520qew;
import X.C2255108sX;
import X.C339190DRl;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS43S0100000_16;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$PageScrollCallBackAbility;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: loaded from: classes17.dex */
public final class PoiSlashPostsTriggerLine {
    public final LifecycleOwner LIZ;
    public final InterfaceC665370Q7z LIZIZ;
    public final RecyclerView LIZJ;
    public final C0CAN LIZLLL;
    public View LJ;
    public View LJFF;
    public final MutableLiveData<Float> LJI;
    public final MutableLiveData<Float> LJII;
    public boolean LJIIIIZZ;
    public ViewOnAttachStateChangeListenerC20604515jv LJIIIZ;
    public C0CAP LJIIJ;
    public C0CAP LJIIJJI;
    public int LJIIL;
    public final C01GW LJIILIIL;
    public final C01GW LJIILJJIL;

    public final float LIZIZ() {
        return ((Number) this.LJIILIIL.getValue()).floatValue();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LIZLLL() {
        final C118300cf c118300cf = new C118300cf();
        InterfaceC665370Q7z interfaceC665370Q7z = this.LIZIZ;
        if (interfaceC665370Q7z != null) {
            ContainerEventDispatcher$PageScrollCallBackAbility containerEventDispatcher$PageScrollCallBackAbility = new ContainerEventDispatcher$PageScrollCallBackAbility() { // from class: com.ss.android.ugc.aweme.poi.detail.videolist.autoplay.PoiSlashPostsTriggerLine$updateScrollStatus$1
                @Override // com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$PageScrollCallBackAbility
                public final void oq(int i) {
                }

                @Override // com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$PageScrollCallBackAbility
                public final void bq(int i) {
                    C118300cf c118300cf2 = c118300cf;
                    int i2 = c118300cf2.element;
                    if (i2 == 0) {
                        c118300cf2.element = i;
                        return;
                    }
                    this.LIZJ(i - i2);
                    c118300cf.element = i;
                }
            };
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7z, ContainerEventDispatcher$PageScrollCallBackAbility.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7z, containerEventDispatcher$PageScrollCallBackAbility, ContainerEventDispatcher$PageScrollCallBackAbility.class, null, null);
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                    if (!(invocationHandler instanceof C2255108sX)) {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                    ((C2255108sX) invocationHandler).LL.add(containerEventDispatcher$PageScrollCallBackAbility);
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2255108sX c2255108sX = new C2255108sX();
                    c2255108sX.LL.add(containerEventDispatcher$PageScrollCallBackAbility);
                    c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                    Object objNewProxyInstance = Proxy.newProxyInstance(ContainerEventDispatcher$PageScrollCallBackAbility.class.getClassLoader(), new Class[]{ContainerEventDispatcher$PageScrollCallBackAbility.class}, c2255108sX);
                    if (objNewProxyInstance == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher.PageScrollCallBackAbility");
                    }
                    C1558520qew.LJII(interfaceC665370Q7z, (InterfaceC494301wD) objNewProxyInstance, ContainerEventDispatcher$PageScrollCallBackAbility.class, null, null);
                }
            }
        }
        RecyclerView recyclerView = this.LIZJ;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(new AsS43S0100000_16(this, 0));
        }
    }

    public static View LIZ(Context context) {
        View view = new View(context);
        C786410Ut5.W5(view, new FrameLayout.LayoutParams(-1, (int) C339190DRl.LIZ(2)));
        view.setBackgroundColor(-256);
        view.setClickable(false);
        view.setFocusable(false);
        return view;
    }

    public final void LIZJ(int i) {
        if (i == 0) {
            return;
        }
        if (i > 0) {
            this.LJIIJ = C0CAP.FLAG_SCROLL_DOWN;
            this.LJI.setValue(Float.valueOf(((Number) this.LJIILJJIL.getValue()).floatValue()));
            this.LJII.setValue(Float.valueOf(LIZIZ()));
        } else {
            this.LJIIJ = C0CAP.FLAG_SCROLL_UP;
            this.LJI.setValue(Float.valueOf(LIZIZ()));
            this.LJII.setValue(Float.valueOf(LIZIZ() * 2));
        }
        if (this.LJIIJ != this.LJIIJJI) {
            int[] iArr = new int[2];
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LJIIIZ;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                viewOnAttachStateChangeListenerC20604515jv.getLocationOnScreen(iArr);
            }
            this.LJIIL = iArr[1];
        }
        this.LJIIJJI = this.LJIIJ;
    }

    public PoiSlashPostsTriggerLine(LifecycleOwner lifecycleOwner, InterfaceC665370Q7z interfaceC665370Q7z, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, C0CAN c0can) {
        this.LIZ = lifecycleOwner;
        this.LIZIZ = interfaceC665370Q7z;
        this.LIZJ = viewOnAttachStateChangeListenerC20604515jv;
        this.LIZLLL = c0can;
        Float fValueOf = Float.valueOf(0.0f);
        this.LJI = new MutableLiveData<>(fValueOf);
        this.LJII = new MutableLiveData<>(fValueOf);
        C0CAP c0cap = C0CAP.FLAG_UNKNOWN;
        this.LJIIJ = c0cap;
        this.LJIIJJI = c0cap;
        this.LJIILIIL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(535));
        this.LJIILJJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(517));
    }
}
