package com.ss.android.ugc.aweme;

import X.AbstractC194523118n;
import X.AnonymousClass1192;
import X.C098200Yq;
import X.C1117360fBO;
import X.C13BV;
import X.C1685300txQ;
import X.C189200o6;
import X.C194518118i;
import X.C19EG;
import X.C19GS;
import X.C786410Ut5;
import Y.ACListenerS131S0200000_29;
import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ViewAnimator;
import android.widget.ViewSwitcher;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.api.model.AnchorCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Unit;

/* JADX INFO: loaded from: classes30.dex */
public final class AnchorRecentlyAddFragment extends AnchorBaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZgHELIOSQiKic8OhcpKio9PCk1CCs3DjctLiI2JjE=";
    public TuxIconView LLILLL;
    public TuxTextView LLILZ;
    public RecyclerView LLILZIL;
    public ViewSwitcher LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public TuxIconView LLJ;
    public ViewSwitcher LLJI;
    public boolean LLJIJIL;
    public C1117360fBO LLJILJIL;
    public final List<AnchorCell> LLJILJILJ = new ArrayList();

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
    }

    public final void MR(boolean z) {
        this.LLJIJIL = z;
        View viewFindViewById = this.LLILZLL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.txt_view_switcher);
            } else {
                viewFindViewById = null;
            }
            this.LLILZLL = (ViewSwitcher) viewFindViewById;
        }
        ((ViewAnimator) viewFindViewById).setDisplayedChild(z ? 1 : 0);
        View view2 = this.LLJI;
        if (view2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.khl);
            }
            this.LLJI = (ViewSwitcher) viewFindViewById2;
            view2 = viewFindViewById2;
        }
        ((ViewAnimator) view2).setDisplayedChild(z ? 1 : 0);
        Iterator it2 = ((ArrayList) this.LLJILJILJ).iterator();
        while (it2.hasNext()) {
            ((AnchorCell) it2.next()).isEditable = z;
        }
        C1117360fBO c1117360fBO = this.LLJILJIL;
        if (c1117360fBO != null) {
            c1117360fBO.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        RandomAccess parcelableArrayList;
        String string;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        View viewFindViewById = null;
        if (arguments != null) {
            parcelableArrayList = arguments.getParcelableArrayList("recently_add");
        } else {
            parcelableArrayList = null;
        }
        ((ArrayList) this.LLJILJILJ).clear();
        List<AnchorCell> list = this.LLJILJILJ;
        if (parcelableArrayList == null) {
            parcelableArrayList = C13BV.INSTANCE;
        }
        ((ArrayList) list).addAll(parcelableArrayList);
        Iterator it2 = ((ArrayList) this.LLJILJILJ).iterator();
        while (it2.hasNext()) {
            ((AnchorCell) it2.next()).isEditable = false;
        }
        View viewFindViewById2 = this.LLILLL;
        if (viewFindViewById2 == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById2 = view2.findViewById(R.id.kg2);
            } else {
                viewFindViewById2 = null;
            }
            this.LLILLL = (TuxIconView) viewFindViewById2;
        }
        C786410Ut5.a9((TuxIconView) viewFindViewById2, new ACListenerS163S0100000_29(this, 70));
        View viewFindViewById3 = this.LLILZ;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.txt_title);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILZ = (TuxTextView) viewFindViewById3;
        }
        TextView textView = (TextView) viewFindViewById3;
        Context context = getContext();
        if (context != null) {
            string = context.getString(C194518118i.LIZIZ(AnchorBaseFragment.LLILLJJLI).LIZLLL());
        } else {
            string = null;
        }
        textView.setText(string);
        AnonymousClass1192 anonymousClass1192 = (AnonymousClass1192) getActivity();
        if (getActivity() != null) {
            AbstractC194523118n abstractC194523118nLIZ = C194518118i.LIZ(anonymousClass1192, AnchorBaseFragment.LLILLJJLI);
            C1117360fBO c1117360fBO = new C1117360fBO();
            abstractC194523118nLIZ.LIZ(c1117360fBO, abstractC194523118nLIZ.LIZ, "recently_Add");
            this.LLJILJIL = c1117360fBO;
            List<?> arrayList = this.LLJILJILJ;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            c1117360fBO.LL = arrayList;
        }
        View viewFindViewById4 = this.LLILZIL;
        if (viewFindViewById4 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById4 = view4.findViewById(R.id.t0q);
            } else {
                viewFindViewById4 = null;
            }
            this.LLILZIL = (RecyclerView) viewFindViewById4;
        }
        ((RecyclerView) viewFindViewById4).setAdapter(this.LLJILJIL);
        View viewFindViewById5 = this.LLILZIL;
        if (viewFindViewById5 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById5 = view5.findViewById(R.id.t0q);
            } else {
                viewFindViewById5 = null;
            }
            this.LLILZIL = (RecyclerView) viewFindViewById5;
        }
        ((RecyclerView) viewFindViewById5).setLayoutManager(new LinearLayoutManager(getContext()));
        View viewFindViewById6 = this.LLILZLL;
        if (viewFindViewById6 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById6 = view6.findViewById(R.id.txt_view_switcher);
            } else {
                viewFindViewById6 = null;
            }
            this.LLILZLL = (ViewSwitcher) viewFindViewById6;
        }
        ((ViewAnimator) viewFindViewById6).setDisplayedChild(0);
        View viewFindViewById7 = this.LLIZ;
        if (viewFindViewById7 == null) {
            View view7 = getView();
            if (view7 != null) {
                viewFindViewById7 = view7.findViewById(R.id.txt_edit);
            } else {
                viewFindViewById7 = null;
            }
            this.LLIZ = (TuxTextView) viewFindViewById7;
        }
        C786410Ut5.h9((TuxTextView) viewFindViewById7, new ACListenerS163S0100000_29(this, 110));
        View viewFindViewById8 = this.LLIZLLLIL;
        if (viewFindViewById8 == null) {
            View view8 = getView();
            if (view8 != null) {
                viewFindViewById8 = view8.findViewById(R.id.txt_delete_all);
            } else {
                viewFindViewById8 = null;
            }
            this.LLIZLLLIL = (TuxTextView) viewFindViewById8;
        }
        C786410Ut5.h9((TuxTextView) viewFindViewById8, new ACListenerS131S0200000_29(this, anonymousClass1192, 15));
        View viewFindViewById9 = this.LLILLL;
        if (viewFindViewById9 == null) {
            View view9 = getView();
            if (view9 != null) {
                viewFindViewById9 = view9.findViewById(R.id.kg2);
            } else {
                viewFindViewById9 = null;
            }
            this.LLILLL = (TuxIconView) viewFindViewById9;
        }
        C786410Ut5.a9((TuxIconView) viewFindViewById9, new ACListenerS163S0100000_29(this, 141));
        View view10 = this.LLJ;
        if (view10 == null) {
            View view11 = getView();
            if (view11 != null) {
                viewFindViewById = view11.findViewById(R.id.kg_);
            }
            this.LLJ = (TuxIconView) viewFindViewById;
            view10 = viewFindViewById;
        }
        C786410Ut5.a9((TuxIconView) view10, new ACListenerS163S0100000_29(this, 142));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c81, viewGroup, false);
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
