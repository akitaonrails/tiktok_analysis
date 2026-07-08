package com.bytedance.ext_power_list;

import X.C01GW;
import X.C03H5;
import X.C0RDF;
import X.C0RPA;
import X.C0SDO;
import X.C0SMN;
import X.C0SZU;
import X.C0SZZ;
import X.C1196320hEk;
import X.C19EG;
import X.C2188811AlT;
import X.C452501pT;
import X.C723450SZj;
import X.C723850SaN;
import X.C724240Sb0;
import X.C725080ScM;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import X.InterfaceC719640SKs;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ies.powerlist.PowerCell;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public abstract class AssemPowerCell<ASSEM extends ReusedUISlotAssem<? extends C03H5>, T extends InterfaceC1891350zJl> extends PowerCell<T> implements C0SMN<PowerCell<T>, T> {
    public View LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(36));
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final ViewModelStore LLILZLL;

    @Override // X.C0SMN
    public final C0RDF C41() {
        return null;
    }

    public abstract ASSEM I5();

    @Override // X.InterfaceC719640SKs
    public final Context Mk2() {
        return null;
    }

    @Override // X.InterfaceC719640SKs
    public final boolean PO1() {
        return false;
    }

    @Override // X.InterfaceC719640SKs
    public final View LJJIJL() {
        View view = this.LL;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // X.C0SMN
    public final AssemReusedDispatcher<PowerCell<T>, T> LJJJLL() {
        return (AssemReusedDispatcher) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC713360RyY
    public ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLILZ.getValue();
    }

    @Override // X.C0SMN
    public ReusedUIAssem<?> NG1() {
        return (ReusedUIAssem) this.LLILZIL.getValue();
    }

    public AssemPowerCell() {
        AssemReusedDispatcher<PowerCell<T>, T> assemReusedDispatcherLJJJLL = LJJJLL();
        Lifecycle lifecycle = getLifecycle();
        assemReusedDispatcherLJJJLL.getClass();
        C724240Sb0.LJII(new C0SZZ(lifecycle, assemReusedDispatcherLJJJLL));
        this.LLILLL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(37));
        this.LLILZ = C452501pT.LIZIZ(new AwS555S0100000_11((AssemPowerCell) this, 52));
        this.LLILZIL = C452501pT.LIZIZ(new AwS555S0100000_11((AssemPowerCell) this, 51));
        this.LLILZLL = new ViewModelStore();
    }

    @Override // X.InterfaceC719640SKs
    public final LifecycleOwner E82() {
        return getParent();
    }

    @Override // X.InterfaceC719640SKs
    public final C19EG getActivity() {
        C19EG c19egLJ = C737910Sx3.LJ(LJJIJL().getContext());
        if (c19egLJ != null) {
            return c19egLJ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Can not find fragmentActivity through context: ");
        sbLIZ.append(LJJIJL().getContext());
        sbLIZ.append(", please check ");
        sbLIZ.append(LJJIJL());
        sbLIZ.append("'s context }");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.C0SMO
    public final C0SZU<PowerCell<T>, T> getChild() {
        LJJJLL().getClass();
        return new C723450SZj();
    }

    @Override // X.InterfaceC713360RyY
    public InterfaceC665370Q7z k0() {
        return C1196320hEk.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public void onDestroy() {
        super.onDestroy();
        this.LLILZLL.clear();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onPreload() {
        NG1().preload();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void unBind() {
        super.unBind();
        wY0();
    }

    @Override // X.C0SMN
    public final void wY0() {
        LJJJLL().LIZIZ();
    }

    @Override // X.C0SMN
    public final ViewModelStore md1() {
        return this.LLILZLL;
    }

    public final void P5(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (getItem() != null) {
            tryObserveLifecycle();
            LJJJLL().LIZ(interfaceC1891350zJl);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onBindItemView(T t) {
        SN1(getAdapterPosition(), t);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public View onCreateItemView(ViewGroup viewGroup) {
        if (isPreloading()) {
            return L5(viewGroup, true);
        }
        View preloadView = getPreloadView();
        if (preloadView == null) {
            preloadView = L5(viewGroup, false);
        }
        this.LL = preloadView;
        Sl0(LJJIJL(), this);
        return LJJIJL();
    }

    public final View L5(ViewGroup viewGroup, boolean z) {
        LayoutInflater layoutInflaterNe;
        ReusedUISlotAssem reusedUISlotAssem = (ReusedUISlotAssem) NG1();
        if (z) {
            layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext()).cloneInContext(viewGroup.getContext());
        } else {
            layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
        }
        return C786410Ut5.Td(layoutInflaterNe, reusedUISlotAssem.Oo(), viewGroup, false);
    }

    @Override // X.C0SMN
    /* JADX INFO: renamed from: N5, reason: merged with bridge method [inline-methods] */
    public void SN1(int i, T t) {
        P5(t);
    }

    @Override // X.C0SMN
    public final void Sl0(View view, InterfaceC719640SKs interfaceC719640SKs) {
        LifecycleOwner parent;
        Lifecycle lifecycle;
        AssemReusedDispatcher<PowerCell<T>, T> assemReusedDispatcherLJJJLL = LJJJLL();
        ReusedUIAssem<?> reusedUIAssemNG1 = NG1();
        assemReusedDispatcherLJJJLL.LIZ = reusedUIAssemNG1;
        C723850SaN.LJ(this, new C0SDO(reusedUIAssemNG1, view, interfaceC719640SKs, this));
        if (C725080ScM.LJJIFFI && (parent = getParent()) != null && (lifecycle = parent.getLifecycle()) != null) {
            lifecycle.addObserver(new LifecycleEventObserver(this) { // from class: com.bytedance.ext_power_list.AssemPowerCell.onCreateItemView.2
                public final /* synthetic */ AssemPowerCell<ASSEM, T> LL;

                {
                    this.LL = this;
                }

                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event != Lifecycle.Event.ON_DESTROY) {
                        return;
                    }
                    C0RPA.LIZ(this.LL.getActivity()).xQ2(this.LL);
                }
            });
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onBindItemView(T t, List<? extends Object> list) {
        if (C725080ScM.LJJIIJZLJL) {
            getAdapterPosition();
            P5(t);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public View onCreateItemView(ViewGroup viewGroup, int i) {
        return onCreateItemView(viewGroup);
    }
}
