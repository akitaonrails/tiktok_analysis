package com.ss.android.ugc.aweme.live.root.tab.wrapper;

import X.C098200Yq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C475260IkO;
import X.C480320IsY;
import X.C786410Ut5;
import X.EnumC475180IkG;
import X.InterfaceC475150IkD;
import X.InterfaceC475300IkS;
import X.InterfaceC475320IkU;
import X.InterfaceC479780Irg;
import X.InterfaceC479810Irj;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.livesetting.linkmic.TiktokLiveTopLiveArchitectureOptSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.root.tab.tabpage.TabFragmentAdapter$sendPageEvent$observer$1;
import com.zhiliaoapp.musically.R;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class TabWrapperFragment extends Fragment implements InterfaceC475150IkD {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9OiojHELIOSPWEnKSdiPj0yODUpO2EHKScbOy4jOCA+Dz0yLygpJzs=";
    public InterfaceC475320IkU LL;
    public InterfaceC479780Irg<?> LLILLJJLI;
    public C480320IsY LLILLL;
    public InterfaceC475300IkS LLILZ;
    public InterfaceC479810Irj LLILZIL;
    public ViewGroup LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public final List<C475260IkO> LLJ = new ArrayList();
    public Boolean LLJI;

    public final void al() {
        InterfaceC479810Irj interfaceC479810Irj;
        InterfaceC479810Irj interfaceC479810Irj2;
        Fragment fragmentLLLIILIL;
        View view;
        Fragment fragmentLLLIILIL2;
        View view2;
        if (TiktokLiveTopLiveArchitectureOptSetting.INSTANCE.getValue().measureTiming == 0 && (((interfaceC479810Irj = this.LLILZIL) == null || (fragmentLLLIILIL2 = interfaceC479810Irj.LLLIILIL()) == null || (view2 = fragmentLLLIILIL2.getView()) == null || view2.getVisibility() != 0) && (interfaceC479810Irj2 = this.LLILZIL) != null && (fragmentLLLIILIL = interfaceC479810Irj2.LLLIILIL()) != null && (view = fragmentLLLIILIL.getView()) != null)) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        InterfaceC479810Irj interfaceC479810Irj3 = this.LLILZIL;
        if (interfaceC479810Irj3 != null) {
            interfaceC479810Irj3.al();
        }
    }

    @Override // X.InterfaceC475150IkD
    public final void rf() {
        InterfaceC479810Irj interfaceC479810Irj;
        ViewGroup viewGroup;
        InterfaceC479810Irj interfaceC479810Irj2;
        InterfaceC479810Irj interfaceC479810Irj3;
        Fragment fragmentLLLIILIL;
        View view;
        Fragment fragmentLLLIILIL2;
        View view2;
        if (this.LLIZ || (interfaceC479810Irj = this.LLILZIL) == null || (viewGroup = this.LLILZLL) == null) {
            return;
        }
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJ(viewGroup.getId(), interfaceC479810Irj.LLLIILIL(), null);
        c19ehLJIIJ.LJIIJJI();
        if (Intrinsics.LJFF(this.LLJI, Boolean.TRUE)) {
            InterfaceC479810Irj interfaceC479810Irj4 = this.LLILZIL;
            if (interfaceC479810Irj4 != null) {
                interfaceC479810Irj4.onPageSelected();
            }
        } else if (Intrinsics.LJFF(this.LLJI, Boolean.FALSE) && (interfaceC479810Irj2 = this.LLILZIL) != null) {
            interfaceC479810Irj2.LLLILZLLLI();
        }
        C480320IsY c480320IsY = this.LLILLL;
        Integer numValueOf = c480320IsY != null ? Integer.valueOf(c480320IsY.LLJILLL) : null;
        InterfaceC475320IkU interfaceC475320IkU = this.LL;
        if (Intrinsics.LJFF(numValueOf, interfaceC475320IkU != null ? Integer.valueOf(interfaceC475320IkU.position()) : null)) {
            this.LLIZLLLIL = true;
            C480320IsY c480320IsY2 = this.LLILLL;
            if (c480320IsY2 != null) {
                InterfaceC479810Irj interfaceC479810Irj5 = this.LLILZIL;
                if (interfaceC479810Irj5 != null) {
                    interfaceC479810Irj5.IR(c480320IsY2.LLJILLL);
                }
                InterfaceC479810Irj interfaceC479810Irj6 = this.LLILZIL;
                if ((interfaceC479810Irj6 == null || (fragmentLLLIILIL2 = interfaceC479810Irj6.LLLIILIL()) == null || (view2 = fragmentLLLIILIL2.getView()) == null || view2.getVisibility() != 0) && (interfaceC479810Irj3 = this.LLILZIL) != null && (fragmentLLLIILIL = interfaceC479810Irj3.LLLIILIL()) != null && (view = fragmentLLLIILIL.getView()) != null) {
                    C786410Ut5.LJLLLLLL(0, view);
                }
            }
        }
        this.LLIZ = true;
    }

    @Override // X.InterfaceC475150IkD
    public final C19EH Pu() {
        return getChildFragmentManager().LJIIJ();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        InterfaceC479810Irj interfaceC479810Irj;
        super.onDestroy();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLIZ = false;
        if (this.LLILZLL != null && (interfaceC479810Irj = this.LLILZIL) != null) {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIIZILJ(interfaceC479810Irj.LLLIILIL());
            c19ehLJIIJ.LJIIJ();
        }
        this.LLILZIL = null;
        this.LLILZLL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ViewGroup viewGroup = this.LLILZLL;
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        this.LLILZLL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        rf();
    }

    @Override // X.InterfaceC475150IkD
    public final void Ah(EnumC475180IkG enumC475180IkG) {
        Fragment fragmentLLLIILIL;
        C480320IsY c480320IsY = this.LLILLL;
        if (c480320IsY != null) {
            InterfaceC475320IkU interfaceC475320IkU = this.LL;
            if (interfaceC475320IkU != null) {
                interfaceC475320IkU.position();
            }
            InterfaceC475320IkU interfaceC475320IkU2 = this.LL;
            if (interfaceC475320IkU2 != null) {
                interfaceC475320IkU2.name();
            }
            C475260IkO c475260IkO = new C475260IkO(enumC475180IkG);
            InterfaceC479810Irj interfaceC479810Irj = this.LLILZIL;
            if (interfaceC479810Irj != null && (fragmentLLLIILIL = interfaceC479810Irj.LLLIILIL()) != null) {
                Iterator it2 = ((LinkedHashMap) c480320IsY.LLJILJILJ).entrySet().iterator();
                while (it2.hasNext()) {
                    TabWrapperFragment tabWrapperFragment = (TabWrapperFragment) ((Reference) ((Map.Entry) it2.next()).getValue()).get();
                    if (tabWrapperFragment != null) {
                        InterfaceC479810Irj interfaceC479810Irj2 = tabWrapperFragment.LLILZIL;
                        if (interfaceC479810Irj2 != null) {
                            interfaceC479810Irj2.eP(c475260IkO);
                        } else {
                            ((ArrayList) tabWrapperFragment.LLJ).add(c475260IkO);
                        }
                    }
                }
                if (((LinkedHashMap) c480320IsY.LLJJIII).get(fragmentLLLIILIL) == null) {
                    c480320IsY.LLJJIII.put(fragmentLLLIILIL, new ArrayList());
                }
                List list = (List) ((LinkedHashMap) c480320IsY.LLJJIII).get(fragmentLLLIILIL);
                if (list != null) {
                    list.add(c475260IkO);
                }
                if (((LinkedHashMap) c480320IsY.LLJJIJI).get(fragmentLLLIILIL) == null) {
                    TabFragmentAdapter$sendPageEvent$observer$1 tabFragmentAdapter$sendPageEvent$observer$1 = new TabFragmentAdapter$sendPageEvent$observer$1(fragmentLLLIILIL, c480320IsY);
                    c480320IsY.LLJJIJI.put(fragmentLLLIILIL, tabFragmentAdapter$sendPageEvent$observer$1);
                    fragmentLLLIILIL.getLifecycle().addObserver(tabFragmentAdapter$sendPageEvent$observer$1);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        for (C475260IkO c475260IkO : this.LLJ) {
            InterfaceC479810Irj interfaceC479810Irj = this.LLILZIL;
            if (interfaceC479810Irj != null) {
                interfaceC479810Irj.eP(c475260IkO);
            }
        }
        ((ArrayList) this.LLJ).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        InterfaceC479810Irj interfaceC479810IrjLIZ;
        InterfaceC475320IkU interfaceC475320IkU = this.LL;
        C19GS c19gs = null;
        if (interfaceC475320IkU != null) {
            interfaceC479810IrjLIZ = interfaceC475320IkU.LIZ(this.LLILLJJLI, this, this.LLILZ);
        } else {
            interfaceC479810IrjLIZ = null;
        }
        this.LLILZIL = interfaceC479810IrjLIZ;
        ViewGroup viewGroup2 = this.LLILZLL;
        if (!(viewGroup2 instanceof View)) {
            viewGroup2 = null;
        }
        if (viewGroup2 != null) {
            try {
                ViewTreeLifecycleOwner.set(viewGroup2, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewGroup2, this);
                viewGroup2.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewGroup2;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewGroup2;
    }
}
