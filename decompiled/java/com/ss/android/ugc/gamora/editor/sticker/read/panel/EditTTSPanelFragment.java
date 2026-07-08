package com.ss.android.ugc.gamora.editor.sticker.read.panel;

import X.AbstractC214823195h;
import X.AbstractC21673719rz;
import X.AbstractC21674919sB;
import X.C098200Yq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19407210wI;
import X.C19407510wL;
import X.C19773212Xy;
import X.C19EG;
import X.C19GS;
import X.C297840Blu;
import X.C425240Glu;
import X.C786410Ut5;
import X.InterfaceC19407610wM;
import Y.ARunnableS129S0100000_29;
import Y.AsS55S0100000_29;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes30.dex */
public final class EditTTSPanelFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiItJCAhKWspLSYnJzdiOjs6HELIOSKy4pO2EhLSQoZz8yJiAgZwo3ITEYHRwDKSspJQkhKSIhLCEn";
    public C425240Glu LL;
    public InterfaceC19407610wM LLILLL;
    public C19407510wL LLILZ;
    public AsS55S0100000_29 LLILZIL;
    public final List<ReadTextEffectBean> LLILLJJLI = new ArrayList();
    public final boolean LLILZLL = C297840Blu.LIZ();

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        AsS55S0100000_29 asS55S0100000_29 = this.LLILZIL;
        if (asS55S0100000_29 != null) {
            C425240Glu c425240Glu = this.LL;
            if (c425240Glu == null) {
                c425240Glu = null;
            }
            c425240Glu.removeOnScrollListener(asS55S0100000_29);
        }
        this.LLILZIL = null;
    }

    public final void MR(boolean z) {
        Bundle arguments;
        C425240Glu c425240Glu = this.LL;
        if (c425240Glu != null) {
            C425240Glu c425240Glu2 = null;
            if (c425240Glu.getLayoutManager() instanceof GridLayoutManager) {
                C425240Glu c425240Glu3 = this.LL;
                if (c425240Glu3 != null) {
                    c425240Glu2 = c425240Glu3;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c425240Glu2.getLayoutManager();
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                if (iFindFirstVisibleItemPosition >= 0 && iFindLastVisibleItemPosition < ((ArrayList) this.LLILLJJLI).size() && (arguments = getArguments()) != null) {
                    ArrayList arrayList = new ArrayList(((ArrayList) this.LLILLJJLI).subList(iFindFirstVisibleItemPosition, iFindLastVisibleItemPosition + 1));
                    InterfaceC19407610wM interfaceC19407610wM = this.LLILLL;
                    if (interfaceC19407610wM != null) {
                        interfaceC19407610wM.LLJLL(arguments.getInt("POSITION"), z, arrayList);
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC21674919sB abstractC21674919sB;
        Object next;
        ArrayList arrayList;
        super.onViewCreated(view, bundle);
        if (getArguments() != null && ((ArrayList) this.LLILLJJLI).isEmpty()) {
            List<ReadTextEffectBean> list = this.LLILLJJLI;
            Bundle arguments = getArguments();
            if (arguments == null || (arrayList = arguments.getParcelableArrayList("DATA")) == null) {
                arrayList = new ArrayList();
            }
            ((ArrayList) list).addAll(arrayList);
        }
        this.LL = (C425240Glu) view.findViewById(R.id.yx8);
        C425240Glu c425240Glu = null;
        if (((ArrayList) this.LLILLJJLI).isEmpty()) {
            C425240Glu c425240Glu2 = this.LL;
            if (c425240Glu2 != null) {
                c425240Glu = c425240Glu2;
            }
            C786410Ut5.f1(c425240Glu, 8);
            return;
        }
        C425240Glu c425240Glu3 = this.LL;
        if (c425240Glu3 == null) {
            c425240Glu3 = null;
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        gridLayoutManager.LLIZ = new AbstractC214823195h() { // from class: X.10wN
            @Override // X.AbstractC214823195h
            public final int LJFF(int i) {
                C425240Glu c425240Glu4 = this.LJ.LL;
                Integer numValueOf = null;
                if (c425240Glu4 == null) {
                    c425240Glu4 = null;
                }
                AbstractC21673619ry adapter = c425240Glu4.getAdapter();
                if (adapter != null) {
                    numValueOf = Integer.valueOf(adapter.getItemViewType(i));
                }
                if (numValueOf != null && numValueOf.intValue() == 2) {
                    return 2;
                }
                return 1;
            }
        };
        c425240Glu3.setLayoutManager(gridLayoutManager);
        if (C19407210wI.LIZ()) {
            Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((ReadTextEffectBean) next).instantClonePlaceHolder) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            ReadTextEffectBean readTextEffectBean = (ReadTextEffectBean) next;
            C425240Glu c425240Glu4 = this.LL;
            if (c425240Glu4 == null) {
                c425240Glu4 = null;
            }
            c425240Glu4.addItemDecoration(new C19773212Xy(readTextEffectBean, 0));
        }
        C19407510wL c19407510wL = new C19407510wL(this);
        this.LLILZ = c19407510wL;
        c19407510wL.setHasStableIds(true);
        C425240Glu c425240Glu5 = this.LL;
        if (c425240Glu5 == null) {
            c425240Glu5 = null;
        }
        c425240Glu5.setAdapter(this.LLILZ);
        C425240Glu c425240Glu6 = this.LL;
        if (c425240Glu6 == null) {
            c425240Glu6 = null;
        }
        RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();
        recycledViewPool.setMaxRecycledViews(0, 10);
        c425240Glu6.setRecycledViewPool(recycledViewPool);
        C425240Glu c425240Glu7 = this.LL;
        if (c425240Glu7 == null) {
            c425240Glu7 = null;
        }
        AbstractC21673719rz itemAnimator = c425240Glu7.getItemAnimator();
        if ((itemAnimator instanceof AbstractC21674919sB) && (abstractC21674919sB = (AbstractC21674919sB) itemAnimator) != null) {
            abstractC21674919sB.LLIZ = false;
        }
        AsS55S0100000_29 asS55S0100000_29 = new AsS55S0100000_29(this, 6);
        this.LLILZIL = asS55S0100000_29;
        C425240Glu c425240Glu8 = this.LL;
        if (c425240Glu8 == null) {
            c425240Glu8 = null;
        }
        c425240Glu8.addOnScrollListener(asS55S0100000_29);
        C425240Glu c425240Glu9 = this.LL;
        if (c425240Glu9 != null) {
            c425240Glu = c425240Glu9;
        }
        HandlerHook.viewPost(c425240Glu, new ARunnableS129S0100000_29(this, 108));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ep7, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
