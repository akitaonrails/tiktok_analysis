package com.bytedance.android.livesdk.game.bottombar.herosheet;

import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1338270kvh;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C340790DXp;
import X.C419910GdJ;
import X.C475840IlK;
import X.C475860IlM;
import X.C497740JfY;
import X.C786410Ut5;
import X.InterfaceC344240DeY;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class MoreAvatarListFragment extends BaseFragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExJzE4HELIOSJiIxKTdiISohJzYkLConZggjOyoSPiQ4KD0fITY4Dz0yLygpJzs=";
    public String LL = "";
    public String LLILLJJLI = "";
    public String LLILLL = "";
    public final LinkedList<C475860IlM> LLILZ = new LinkedList<>();
    public final ArrayList<C475860IlM> LLILZIL = new ArrayList<>();
    public Function1<? super C475860IlM, Unit> LLILZLL;
    public Function0<Unit> LLIZ;

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C1250250idj c1250250idj = new C1250250idj();
        String str = this.LL;
        if (str == null) {
            str = "";
        }
        c1250250idj.LIZJ = str;
        C1251150ifB c1251150ifB = new C1251150ifB();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_x_mark_small;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ezq);
        c1251150ifB.LIZLLL();
        c1251150ifB.LJ = c419910GdJ;
        c1251150ifB.LIZJ(new AwS551S0100000_7(this, 61));
        C0OM1 c0om1 = new C0OM1();
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    public MoreAvatarListFragment() {
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Map<String, Object> map = C1338270kvh.LIZ;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ghy, viewGroup, false);
        LinkedList<C475860IlM> linkedList = this.LLILZ;
        ArrayList<C475860IlM> arrayList = this.LLILZIL;
        TextView textView = (TextView) viewTd.findViewById(R.id.tv_recent);
        TextView textView2 = (TextView) viewTd.findViewById(R.id.tv_popular);
        RecyclerView recyclerView = (RecyclerView) viewTd.findViewById(R.id.twt);
        RecyclerView recyclerView2 = (RecyclerView) viewTd.findViewById(R.id.twf);
        textView.setText(this.LLILLJJLI);
        textView2.setText(this.LLILLL);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(5, 1, getContext(), false);
        gridLayoutManager.mSmoothScrollbarEnabled = false;
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setOverScrollMode(2);
        C475840IlK c475840IlK = new C475840IlK();
        recyclerView.setAdapter(c475840IlK);
        c475840IlK.LLILLJJLI = new AwS586S0100000_7(this, 503);
        recyclerView.addItemDecoration(new C340790DXp((int) C497740JfY.LIZIZ(6.0f), (int) C497740JfY.LIZIZ(10.0f)));
        GridLayoutManager gridLayoutManager2 = new GridLayoutManager(5, 1, getContext(), false);
        gridLayoutManager2.mSmoothScrollbarEnabled = false;
        recyclerView2.setLayoutManager(gridLayoutManager2);
        recyclerView2.setNestedScrollingEnabled(true);
        recyclerView2.setOverScrollMode(2);
        recyclerView2.setHasFixedSize(true);
        C19GS c19gs = null;
        recyclerView2.setItemAnimator(null);
        C475840IlK c475840IlK2 = new C475840IlK();
        recyclerView2.setAdapter(c475840IlK2);
        c475840IlK2.LLILLJJLI = new AwS586S0100000_7(this, 504);
        recyclerView2.addItemDecoration(new C340790DXp((int) C497740JfY.LIZIZ(6.0f), (int) C497740JfY.LIZIZ(10.0f)));
        c475840IlK.LL.clear();
        c475840IlK.LL.addAll(linkedList);
        c475840IlK.notifyDataSetChanged();
        c475840IlK2.LL.clear();
        c475840IlK2.LL.addAll(arrayList);
        c475840IlK2.notifyDataSetChanged();
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }
}
