package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.card;

import X.C0QSJ;
import X.C13IQ;
import X.C1558360qeg;
import X.C19EG;
import X.C2023707wJ;
import X.C673150Qan;
import X.C687700QyG;
import X.InterfaceC1146704e9;
import X.InterfaceC1884840z9G;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC719640SKs;
import X.InterfaceC737790Swr;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.view.UISlotAssem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class MixCardAssemHolder implements InterfaceC719640SKs, LifecycleEventObserver, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public final Fragment LL;
    public final AbsBaseAssemMixCard<?> LLILLJJLI;
    public final C13IQ<? extends UISlotAssem> LLILLL;
    public final Lifecycle LLILZ;
    public final C19EG LLILZIL;
    public final Fragment LLILZLL;
    public final View LLIZ;
    public final boolean LLIZLLLIL = true;
    public final InterfaceC665370Q7z LLJ;
    public final Fragment LLJI;
    public final AbsBaseAssemMixCard LLJIJIL;
    public InterfaceC1884840z9G LLJILJIL;

    @Override // X.InterfaceC719640SKs
    public final Context Mk2() {
        return null;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1884840z9G.class) {
            this.LLJILJIL = (InterfaceC1884840z9G) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MixCardScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == InterfaceC1884840z9G.class) {
            return this.LLJILJIL;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MixCardScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MixCardScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1884840z9G.class) {
            this.LLJILJIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC719640SKs
    public final /* bridge */ /* synthetic */ LifecycleOwner E82() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC719640SKs
    public final View LJJIJL() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC713360RyY
    public final /* bridge */ /* synthetic */ ViewModelStoreOwner LLIIIILZ() {
        return this.LLJI;
    }

    @Override // X.InterfaceC719640SKs
    public final boolean PO1() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC719640SKs
    public final C19EG getActivity() {
        return this.LLILZIL;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return this.LLJ;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{MixCardScope.class}).unbindAbility(this.LLJIJIL, InterfaceC1884840z9G.class);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{MixCardScope.class}).bindAbility(this.LLJIJIL, InterfaceC1884840z9G.class);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int[] iArr = C2023707wJ.LIZ;
        event.ordinal();
    }

    public MixCardAssemHolder(Fragment fragment, View view, AbsBaseAssemMixCard<?> absBaseAssemMixCard, C13IQ<? extends UISlotAssem> c13iq) {
        this.LL = fragment;
        this.LLILLJJLI = absBaseAssemMixCard;
        this.LLILLL = c13iq;
        this.LLILZ = fragment.getLifecycle();
        this.LLILZIL = fragment.getActivity();
        this.LLILZLL = fragment;
        this.LLIZ = view;
        this.LLJ = C1558360qeg.LJFF(this.LL, null);
        this.LLJI = fragment;
        this.LLJIJIL = absBaseAssemMixCard;
        fragment.getLifecycle().addObserver(this);
        C687700QyG.LJIIIIZZ(this);
    }
}
