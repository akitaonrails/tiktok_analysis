package com.ss.android.ugc.aweme;

import X.AnonymousClass1192;
import X.C098200Yq;
import X.C1117360fBO;
import X.C118L;
import X.C118S;
import X.C118U;
import X.C1235900iGa;
import X.C15438062q;
import X.C1685300txQ;
import X.C189200o6;
import X.C19413410xI;
import X.C19413610xK;
import X.C194518118i;
import X.C19EG;
import X.C19GS;
import X.C21609119hZ;
import X.C683640Qri;
import X.C786410Ut5;
import X.InterfaceC1581920rGg;
import X.InterfaceC1670800ta2;
import X.InterfaceC683650Qrj;
import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.api.model.AnchorCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes30.dex */
public final class AnchorSelectionFragment extends AnchorBaseFragment implements C118U, InterfaceC683650Qrj {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2HELIOSZgQiKic8OhYpJSowPCwjJwkhKSIhLCEn";
    public C1235900iGa LLILLL;
    public C21609119hZ LLILZ;
    public ViewStub LLILZIL;
    public TuxTextView LLILZLL;
    public RelativeLayout LLIZ;
    public RecyclerView LLIZLLLIL;
    public LinearLayout LLJ;
    public C118L LLJI;
    public C118S LLJIJIL;
    public C1117360fBO LLJILJIL;
    public C19413410xI<RecyclerView.ViewHolder> LLJILJILJ;
    public View LLJILLL;

    @Override // X.InterfaceC1212360hec
    public final void Jm() {
    }

    @Override // X.InterfaceC1212360hec
    public final void LJ() {
    }

    @Override // X.InterfaceC1212360hec
    public final /* synthetic */ void SY() {
    }

    @Override // X.InterfaceC1212360hec
    public final void bD1(Exception exc) {
    }

    @Override // X.InterfaceC1212360hec
    public final void mE(List<Object> list, boolean z) {
    }

    @Override // X.InterfaceC1212360hec
    public final /* synthetic */ void zK() {
    }

    @Override // X.InterfaceC683650Qrj
    public final boolean LJIIJJI() {
        C19413410xI<RecyclerView.ViewHolder> c19413410xI = this.LLJILJILJ;
        boolean z = false;
        if (c19413410xI != null && c19413410xI.LL == 0) {
            z = true;
        }
        return !z;
    }

    public final RelativeLayout MR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.dlq) : null;
            this.LLIZ = (RelativeLayout) viewFindViewById;
        }
        return (RelativeLayout) viewFindViewById;
    }

    public final LinearLayout NR() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.mag) : null;
            this.LLJ = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final C1235900iGa OR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.nlm) : null;
            this.LLILLL = (C1235900iGa) viewFindViewById;
        }
        return (C1235900iGa) viewFindViewById;
    }

    public final C21609119hZ PR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.nnb) : null;
            this.LLILZ = (C21609119hZ) viewFindViewById;
        }
        return (C21609119hZ) viewFindViewById;
    }

    public final RecyclerView RR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.t0q) : null;
            this.LLIZLLLIL = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        C118S c118s = this.LLJIJIL;
        if (c118s != null) {
            c118s.LIZ();
            c118s.LJIILJJIL();
        }
        super.onDestroy();
    }

    @Override // X.InterfaceC683650Qrj
    public final void preload() {
        C118S c118s = this.LLJIJIL;
        if (c118s != null) {
            c118s.LIZJ(4);
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void showLoadMoreLoading() {
        C19413410xI<RecyclerView.ViewHolder> c19413410xI = this.LLJILJILJ;
        if (c19413410xI != null) {
            c19413410xI.LLLFZ(1);
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void Ng1() {
        C786410Ut5.LLLLIIL(OR(), 8);
        C786410Ut5.LJZL(0, NR());
        PR().setRefreshing(false);
        C19413410xI<RecyclerView.ViewHolder> c19413410xI = this.LLJILJILJ;
        if (c19413410xI != null) {
            c19413410xI.LLLFZ(0);
        }
    }

    @Override // X.C118U
    public final void hM1() {
        C786410Ut5.LLIIL(MR(), 0);
    }

    @Override // X.C118U
    public final void mf0() {
        C786410Ut5.LLIIL(MR(), 8);
    }

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
    }

    @Override // X.InterfaceC1212360hec
    public final void Uq2(Exception exc) {
        C786410Ut5.LLLLIIL(OR(), 8);
        C786410Ut5.LJZL(0, NR());
        PR().setRefreshing(false);
        C19413410xI<RecyclerView.ViewHolder> c19413410xI = this.LLJILJILJ;
        if (c19413410xI != null) {
            c19413410xI.LLLFZ(0);
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void Wi(Exception exc) {
        C19413410xI<RecyclerView.ViewHolder> c19413410xI = this.LLJILJILJ;
        if (c19413410xI != null) {
            c19413410xI.LLLFZ(2);
        }
    }

    @Override // X.InterfaceC683650Qrj
    public final void n2(boolean z) {
        C19413410xI<RecyclerView.ViewHolder> c19413410xI = this.LLJILJILJ;
        if (c19413410xI != null) {
            c19413410xI.LLLFZ(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.AnchorBaseFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        String string;
        AnonymousClass1192 anonymousClass1192;
        ImageView imageView;
        TextView textView;
        super.onActivityCreated(bundle);
        this.LLJI = new C118L(AnchorBaseFragment.LLILLJJLI.getTYPE());
        C118S c118s = new C118S();
        this.LLJIJIL = c118s;
        c118s.LLILLJJLI = this;
        c118s.LJIIJ(this.LLJI);
        C118S c118s2 = this.LLJIJIL;
        if (c118s2 != null) {
            c118s2.LLILZ = this;
        }
        C786410Ut5.LLLLIIL(OR(), 0);
        PR().setOnRefreshListener(new InterfaceC1581920rGg() { // from class: X.118W
            @Override // X.InterfaceC1581920rGg
            public final void LJFF() {
                C118S c118s3 = this.LL.LLJIJIL;
                if (c118s3 != null) {
                    c118s3.LIZJ(1);
                }
            }
        });
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.wci);
            } else {
                viewFindViewById = null;
            }
            this.LLILZIL = (ViewStub) viewFindViewById;
        }
        ((ViewStub) viewFindViewById).setLayoutResource(C194518118i.LIZIZ(AnchorBaseFragment.LLILLJJLI).LIZ());
        View viewFindViewById2 = this.LLILZIL;
        if (viewFindViewById2 == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById2 = view2.findViewById(R.id.wci);
            } else {
                viewFindViewById2 = null;
            }
            this.LLILZIL = (ViewStub) viewFindViewById2;
        }
        View viewLJLLLL = C786410Ut5.LJLLLL((ViewStub) viewFindViewById2);
        this.LLJILLL = viewLJLLLL;
        if (viewLJLLLL != null && (textView = (TextView) viewLJLLLL.findViewById(R.id.txt_title)) != null) {
            textView.setText("");
        }
        View view3 = this.LLJILLL;
        if (view3 != null && (imageView = (ImageView) view3.findViewById(R.id.kg2)) != null) {
            C786410Ut5.Q7(imageView, new ACListenerS163S0100000_29(this, 60));
        }
        View viewFindViewById3 = this.LLILZLL;
        if (viewFindViewById3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById3 = view4.findViewById(R.id.txt_element_search_hint);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILZLL = (TuxTextView) viewFindViewById3;
        }
        TextView textView2 = (TextView) viewFindViewById3;
        Context context = getContext();
        if (context != null) {
            C194518118i.LIZIZ(AnchorBaseFragment.LLILLJJLI);
            string = context.getString(2131829263);
        } else {
            string = null;
        }
        textView2.setText(string);
        C786410Ut5.S7(MR(), new ACListenerS163S0100000_29(this, 61));
        InterfaceC1670800ta2 activity = getActivity();
        if (activity instanceof AnonymousClass1192) {
            anonymousClass1192 = (AnonymousClass1192) activity;
        } else {
            anonymousClass1192 = null;
        }
        C1117360fBO c1117360fBOLIZIZ = C194518118i.LIZ(anonymousClass1192, AnchorBaseFragment.LLILLJJLI).LIZIZ();
        this.LLJILJIL = c1117360fBOLIZIZ;
        this.LLJILJILJ = C19413610xK.LIZ(c1117360fBOLIZIZ);
        RR().setAdapter(this.LLJILJILJ);
        RR().setLayoutManager(new LinearLayoutManager(getContext()));
        RR().setItemAnimator(null);
        RR().setOnFlingListener(new C683640Qri(RR(), this));
        C118S c118s3 = this.LLJIJIL;
        if (c118s3 != null) {
            c118s3.LIZJ(1);
        }
    }

    @Override // X.C118U
    public final void xe2(int i) {
        int itemCount;
        C1117360fBO c1117360fBO = this.LLJILJIL;
        if (c1117360fBO != null) {
            itemCount = c1117360fBO.getItemCount();
        } else {
            itemCount = 0;
        }
        C1117360fBO c1117360fBO2 = this.LLJILJIL;
        if (c1117360fBO2 != null) {
            c1117360fBO2.notifyItemRangeChanged(i, itemCount);
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void LLJJJIL(List<Object> list, boolean z) {
        if (list != null && !list.isEmpty()) {
            C786410Ut5.LLIZLLLIL(RR(), 0);
            C786410Ut5.LLLLIIL(OR(), 8);
            PR().setRefreshing(false);
            C786410Ut5.LJZL(8, NR());
            C1117360fBO c1117360fBO = this.LLJILJIL;
            if (c1117360fBO != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (Object obj : list) {
                    if (obj instanceof AnchorCell) {
                        ((AnchorCell) obj).type = AnchorBaseFragment.LLILLJJLI.getTYPE();
                    }
                    arrayList.add(obj);
                }
                c1117360fBO.LL = arrayList;
            }
            C19413410xI<RecyclerView.ViewHolder> c19413410xI = this.LLJILJILJ;
            if (c19413410xI != null) {
                c19413410xI.LLLFZ(z ? 1 : 0);
            }
            C1117360fBO c1117360fBO2 = this.LLJILJIL;
            if (c1117360fBO2 != null) {
                c1117360fBO2.notifyDataSetChanged();
            }
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void Pj(List<Object> list, boolean z) {
        C1117360fBO c1117360fBO;
        if (list != null && !list.isEmpty() && (c1117360fBO = this.LLJILJIL) != null) {
            c1117360fBO.LL = list;
        }
        C19413410xI<RecyclerView.ViewHolder> c19413410xI = this.LLJILJILJ;
        if (c19413410xI != null) {
            c19413410xI.LLLFZ(z ? 1 : 0);
        }
        C1117360fBO c1117360fBO2 = this.LLJILJIL;
        if (c1117360fBO2 != null) {
            c1117360fBO2.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ia, viewGroup, false);
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
