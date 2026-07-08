package com.bytedance.android.livesdk.giftlimitnotification;

import X.C098200Yq;
import X.C0DW8;
import X.C1685300txQ;
import X.C16FS;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20441214yg;
import X.C2188811AlT;
import X.C250000xu;
import X.C250500xz;
import X.C766270U4b;
import X.C786410Ut5;
import X.InterfaceC250300xx;
import Y.ACListenerS147S0100000_12;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveGiftReminderAmountFragment extends BaseFragment implements InterfaceC250300xx {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LywqPSM6JSw4JyAnHELIOSISMlKi4nISoiZwM6PiALICknGiAhICE3LTcNJCAmJjEKOy40JSAiPQ==";
    public C0DW8 LL;
    public FrameLayout LLILLJJLI;
    public C16FS LLILLL;
    public final ArrayList<Integer> LLILZ = new ArrayList<>();
    public final ArrayList<String> LLILZIL = new ArrayList<>();

    public final C0DW8 OR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.j04) : null;
            this.LL = (C0DW8) viewFindViewById;
        }
        return (C0DW8) viewFindViewById;
    }

    @Override // X.InterfaceC250300xx
    public final void onFailure() {
        C250000xu.LIZ.getClass();
        C766270U4b.LJIIJJI(C250000xu.LJJIFFI);
    }

    @Override // X.InterfaceC250300xx
    public final void onSuccess() {
        C250000xu.LIZ.getClass();
        C766270U4b.LJIIJJI(C250000xu.LJJI);
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.jho) : null;
            this.LLILLJJLI = (FrameLayout) viewFindViewById;
        }
        viewFindViewById.performClick();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }

    public static String NR(String str) {
        C20441214yg.LIZIZ("LiveGiftReminderAmountFragment", "addSeparator");
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        while (length > 3) {
            int i = length - 3;
            arrayList.add(str.substring(i, length));
            length = i;
        }
        arrayList.add(str.substring(0, length));
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        while (true) {
            size--;
            if (size > 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((String) ListProtector.get(arrayList, size));
                sbLIZ.append(',');
                sb.append(C2188811AlT.LIZIZ(sbLIZ));
            } else {
                sb.append((String) ListProtector.get(arrayList, 0));
                return sb.toString();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Integer value;
        String string;
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LLILLJJLI;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.jho);
            } else {
                viewFindViewById = null;
            }
            this.LLILLJJLI = (FrameLayout) viewFindViewById;
        }
        C786410Ut5.O7((FrameLayout) viewFindViewById, new ACListenerS147S0100000_12(this, 401));
        View view3 = this.LLILLL;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById2 = view4.findViewById(R.id.cu3);
            }
            this.LLILLL = (C16FS) viewFindViewById2;
            view3 = viewFindViewById2;
        }
        C786410Ut5.h8((C16FS) view3, new ACListenerS147S0100000_12(this, 209));
        this.LLILZ.clear();
        this.LLILZIL.clear();
        C250000xu.LIZ.getClass();
        List<Integer> list = C250000xu.LJIILJJIL;
        if (list != null) {
            this.LLILZ.addAll(list);
        }
        List<Integer> list2 = C250000xu.LJIILJJIL;
        if (list2 != null) {
            Iterator<Integer> it2 = list2.iterator();
            while (it2.hasNext()) {
                this.LLILZIL.add(NR(String.valueOf(it2.next().intValue())));
            }
        }
        char c = 1;
        while (true) {
            str = "";
            ListProtector.add(this.LLILZIL, 0, "");
            this.LLILZIL.add("");
            ListProtector.add(this.LLILZ, 0, 0);
            this.LLILZ.add(0);
            if (c == 2) {
                break;
            } else {
                c = 2;
            }
        }
        C250000xu.LIZ.getClass();
        MutableLiveData<Integer> mutableLiveData = C250000xu.LJJ;
        if (mutableLiveData != null && (value = mutableLiveData.getValue()) != null && (string = value.toString()) != null) {
            str = string;
        }
        String strNR = NR(str);
        OR().setData(this.LLILZIL);
        OR().setWheelSize(5);
        OR().setLayoutManager(new LinearLayoutManager(getContext()));
        int iIndexOf = this.LLILZIL.indexOf(strNR) - 2;
        OR().setMCurrentPositon(iIndexOf);
        OR().scrollToPosition(iIndexOf);
        C250500xz.LIZIZ(C250000xu.LJ() ? 1 : 0, -1, -1, 1, C250000xu.LJJIJIIJI, C250000xu.LJJIJIIJIL, "-1", C250000xu.LJIILIIL, C250000xu.LJIILL);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.god, viewGroup, false);
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
