package com.ss.android.ugc.aweme;

import X.AbstractC194523118n;
import X.AnonymousClass1192;
import X.C098200Yq;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1069330dvv;
import X.C1117360fBO;
import X.C118I;
import X.C1235900iGa;
import X.C1255920ims;
import X.C12YA;
import X.C13DL;
import X.C13LP;
import X.C13LQ;
import X.C1685300txQ;
import X.C189200o6;
import X.C19413410xI;
import X.C19413610xK;
import X.C194511118b;
import X.C194512118c;
import X.C194514118e;
import X.C194515118f;
import X.C194518118i;
import X.C19773412Ya;
import X.C19EG;
import X.C19GS;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C683640Qri;
import X.C786410Ut5;
import X.InterfaceC1212360hec;
import X.InterfaceC683650Qrj;
import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
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
import kotlin.text.a0;

/* JADX INFO: loaded from: classes30.dex */
public final class AnchorSearchFragment extends AnchorBaseFragment implements InterfaceC1212360hec<AnchorCell>, InterfaceC683650Qrj {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCHELIOSI2ZgQiKic8OhYpKD0wIAM+KCg+LSs4";
    public EditText LLILLL;
    public TuxTextView LLILZ;
    public RecyclerView LLILZIL;
    public ImageView LLILZLL;
    public TuxTextView LLIZ;
    public RecyclerView LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxTextView LLJI;
    public C1235900iGa LLJIJIL;
    public C1255920ims<C118I> LLJILJIL;
    public C118I LLJILJILJ;
    public C194511118b LLJILLL;
    public C1117360fBO LLJJ;
    public C1117360fBO LLJJI;
    public C19413410xI<RecyclerView.ViewHolder> LLJJIII;

    @Override // X.InterfaceC1212360hec
    public final void Jm() {
    }

    @Override // X.InterfaceC1212360hec
    public final /* synthetic */ void SY() {
    }

    @Override // X.InterfaceC1212360hec
    public final void bD1(Exception exc) {
    }

    @Override // X.InterfaceC1212360hec
    public final void mE(List<AnchorCell> list, boolean z) {
    }

    @Override // X.InterfaceC1212360hec
    public final /* synthetic */ void zK() {
        throw null;
    }

    @Override // X.InterfaceC683650Qrj
    public final boolean LJIIJJI() {
        C19413410xI<RecyclerView.ViewHolder> c19413410xI = this.LLJJIII;
        boolean z = false;
        if (c19413410xI != null && c19413410xI.LL == 0) {
            z = true;
        }
        return !z;
    }

    public final TuxTextView MR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.e03) : null;
            this.LLIZ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C1235900iGa NR() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.nms) : null;
            this.LLJIJIL = (C1235900iGa) viewFindViewById;
        }
        return (C1235900iGa) viewFindViewById;
    }

    public final RecyclerView OR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.t0l) : null;
            this.LLILZIL = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    public final RecyclerView PR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.t0m) : null;
            this.LLIZLLLIL = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    public final ImageView RR() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.u9m) : null;
            this.LLILZLL = (ImageView) viewFindViewById;
        }
        return (ImageView) viewFindViewById;
    }

    public final EditText SR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.u9t) : null;
            this.LLILLL = (EditText) viewFindViewById;
        }
        return (EditText) viewFindViewById;
    }

    public final TuxTextView UR() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.txt_search_no_context) : null;
            this.LLJI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView VR() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.txt_search_result_empty) : null;
            this.LLJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final void WR() {
        String[] stringArray;
        C194511118b c194511118b = this.LLJILLL;
        if (c194511118b == null || (stringArray = c194511118b.LIZIZ.getStringArray(c194511118b.LIZ, new String[0])) == null) {
            return;
        }
        List<?> listLJLI = C13LQ.LJLI(stringArray);
        C1117360fBO c1117360fBO = this.LLJJ;
        if (c1117360fBO != null) {
            c1117360fBO.LLLII(listLJLI);
        }
        C1117360fBO c1117360fBO2 = this.LLJJ;
        if (c1117360fBO2 != null) {
            c1117360fBO2.notifyDataSetChanged();
        }
        if (((ArrayList) listLJLI).size() > 2) {
            C786410Ut5.LLLLZLL(MR(), 0);
        }
    }

    public final void ZR() {
        C1255920ims<C118I> c1255920ims = this.LLJILJIL;
        if (c1255920ims != null) {
            String string = a0.LJLIIIL(C2204961BRm.LLJILLL(SR(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KMumYJfBzgF880pU8UOVZLFsX8QU", null)).toString()).toString();
            if (TextUtils.isEmpty(string)) {
                return;
            }
            c1255920ims.LIZJ(1, string);
            C786410Ut5.LLIZLLLIL(OR(), 8);
            C786410Ut5.LLLLZLL(MR(), 8);
            C1069330dvv.LIZ(getContext(), SR());
            C194511118b c194511118b = this.LLJILLL;
            if (c194511118b != null) {
                c194511118b.LIZIZ.storeStringArray(c194511118b.LIZ, (String[]) C13LP.LL(C13LQ.LJIIZILJ(C13DL.LJIIIZ(new String[]{string}, c194511118b.LIZIZ.getStringArray(c194511118b.LIZ, new String[0]))), 10).toArray(new String[0]));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        C1255920ims<C118I> c1255920ims = this.LLJILJIL;
        if (c1255920ims != null) {
            c1255920ims.LIZ();
            c1255920ims.LJIILJJIL();
        }
        super.onDestroy();
    }

    @Override // X.InterfaceC1212360hec
    public final void showLoadMoreLoading() {
        C19413410xI<RecyclerView.ViewHolder> c19413410xI = this.LLJJIII;
        if (c19413410xI != null) {
            c19413410xI.LLLFZ(1);
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void LJ() {
        C786410Ut5.LLLLIIL(NR(), 0);
    }

    @Override // X.InterfaceC1212360hec
    public final void Ng1() {
        C786410Ut5.LLLLZLL(VR(), 0);
        C786410Ut5.LLLLZLL(UR(), 0);
        C786410Ut5.LLLLIIL(NR(), 8);
        C786410Ut5.LLIZLLLIL(PR(), 8);
        C19413410xI<RecyclerView.ViewHolder> c19413410xI = this.LLJJIII;
        if (c19413410xI != null) {
            c19413410xI.LLLFZ(0);
        }
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
        this.LLJI = null;
        this.LLJIJIL = null;
    }

    @Override // X.InterfaceC683650Qrj
    public final void preload() {
        String string = a0.LJLIIIL(C2204961BRm.LLJILLL(SR(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KMumYJfBzgF880pU8UOVZLFsX8QU", null)).toString()).toString();
        C1255920ims<C118I> c1255920ims = this.LLJILJIL;
        if (c1255920ims != null) {
            c1255920ims.LIZJ(4, string);
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void Uq2(Exception exc) {
        C19413410xI<RecyclerView.ViewHolder> c19413410xI = this.LLJJIII;
        if (c19413410xI != null) {
            c19413410xI.LLLFZ(0);
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void Wi(Exception exc) {
        C19413410xI<RecyclerView.ViewHolder> c19413410xI = this.LLJJIII;
        if (c19413410xI != null) {
            c19413410xI.LLLFZ(2);
        }
    }

    @Override // X.InterfaceC683650Qrj
    public final void n2(boolean z) {
        C19413410xI<RecyclerView.ViewHolder> c19413410xI = this.LLJJIII;
        if (c19413410xI != null) {
            c19413410xI.LLLFZ(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.AnchorBaseFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        String string;
        super.onActivityCreated(bundle);
        C1117360fBO c1117360fBO = new C1117360fBO();
        C194512118c c194512118c = new C194512118c((AnonymousClass1192) getActivity());
        c194512118c.LIZJ = new C194515118f(this);
        c194512118c.LIZLLL = new C194514118e(c1117360fBO, this);
        c1117360fBO.LLLI(String.class, c194512118c);
        this.LLJJ = c1117360fBO;
        AbstractC194523118n abstractC194523118nLIZ = C194518118i.LIZ((AnonymousClass1192) getActivity(), AnchorBaseFragment.LLILLJJLI);
        C1117360fBO c1117360fBO2 = new C1117360fBO();
        abstractC194523118nLIZ.LIZ(c1117360fBO2, abstractC194523118nLIZ.LIZ, "search_result");
        this.LLJJI = c1117360fBO2;
        this.LLJILJIL = new C1255920ims<>();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("anchor_search_history");
        sbLIZ.append(AnchorBaseFragment.LLILLJJLI.name());
        this.LLJILLL = new C194511118b(C2188811AlT.LIZIZ(sbLIZ));
        C118I c118i = new C118I(AnchorBaseFragment.LLILLJJLI.getTYPE());
        this.LLJILJILJ = c118i;
        C1255920ims<C118I> c1255920ims = this.LLJILJIL;
        if (c1255920ims != null) {
            c1255920ims.LLILLJJLI = this;
            c1255920ims.LJIIJ(c118i);
        }
        View viewFindViewById = this.LLILZ;
        C1117360fBO c1117360fBO3 = null;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.dbd);
            } else {
                viewFindViewById = null;
            }
            this.LLILZ = (TuxTextView) viewFindViewById;
        }
        C786410Ut5.h9((TuxTextView) viewFindViewById, new ACListenerS163S0100000_29(this, 24));
        EditText editTextSR = SR();
        Context context = getContext();
        if (context != null) {
            C194518118i.LIZIZ(AnchorBaseFragment.LLILLJJLI);
            string = context.getString(2131829263);
        } else {
            string = null;
        }
        editTextSR.setHint(string);
        SR().setImeOptions(3);
        SR().setInputType(1);
        SR().setOnEditorActionListener(new C12YA(this, 0));
        SR().addTextChangedListener(new C19773412Ya(this, 3));
        SR().setFocusable(true);
        SR().setFocusableInTouchMode(true);
        SR().requestFocus();
        C1069330dvv.LIZJ(getContext(), SR());
        C786410Ut5.Q7(RR(), new ACListenerS163S0100000_29(this, 32));
        C786410Ut5.h9(MR(), new ACListenerS163S0100000_29(this, 45));
        this.LLJJIII = C19413610xK.LIZ(this.LLJJI);
        PR().setLayoutManager(new LinearLayoutManager(getContext()));
        PR().setAdapter(this.LLJJIII);
        PR().setOnFlingListener(new C683640Qri(PR(), this));
        OR().setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView recyclerViewOR = OR();
        C1117360fBO c1117360fBO4 = this.LLJJ;
        if (c1117360fBO4 != null) {
            c1117360fBO3 = c1117360fBO4;
        }
        recyclerViewOR.setAdapter(c1117360fBO3);
        WR();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/ss/android/ugc/aweme/AnchorSearchFragment", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KMumYJfBzgF880pU8UOVZLFsX8QU", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        if (z) {
            C2204961BRm.LLJILLL(SR(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KMumYJfBzgF880pU8UOVZLFsX8QU", null)).clear();
            C1069330dvv.LIZ(getContext(), SR());
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void LLJJJIL(List<AnchorCell> list, boolean z) {
        C786410Ut5.LLLLZLL(VR(), 8);
        C786410Ut5.LLLLZLL(UR(), 8);
        C786410Ut5.LLLLIIL(NR(), 8);
        C786410Ut5.LLIZLLLIL(PR(), 0);
        if (list != null && !list.isEmpty()) {
            C1117360fBO c1117360fBO = this.LLJJI;
            if (c1117360fBO != null) {
                c1117360fBO.LL = list;
            }
            C19413410xI<RecyclerView.ViewHolder> c19413410xI = this.LLJJIII;
            if (c19413410xI != null) {
                c19413410xI.LLLFZ(z ? 1 : 0);
            }
            C1117360fBO c1117360fBO2 = this.LLJJI;
            if (c1117360fBO2 != null) {
                c1117360fBO2.notifyDataSetChanged();
            }
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void Pj(List<AnchorCell> list, boolean z) {
        C1117360fBO c1117360fBO;
        if (list != null && !list.isEmpty() && (c1117360fBO = this.LLJJI) != null) {
            c1117360fBO.LL = list;
        }
        C19413410xI<RecyclerView.ViewHolder> c19413410xI = this.LLJJIII;
        if (c19413410xI != null) {
            c19413410xI.LLLFZ(z ? 1 : 0);
        }
        C1117360fBO c1117360fBO2 = this.LLJJI;
        if (c1117360fBO2 != null) {
            c1117360fBO2.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.i_, viewGroup, false);
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
