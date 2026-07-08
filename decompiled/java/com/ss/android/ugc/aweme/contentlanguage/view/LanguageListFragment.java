package com.ss.android.ugc.aweme.contentlanguage.view;

import X.C086I;
import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1250300ido;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2187451AjH;
import X.C422410GhL;
import X.C616540OGe;
import X.C747550TUb;
import X.C747580TUe;
import X.C786410Ut5;
import X.EnumC638250P1r;
import X.InterfaceC747570TUd;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.contentlanguage.viewmodel.ContentPreferenceViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AwS134S0101000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class LanguageListFragment extends AmeBaseFragment implements Observer<ArrayList<C747580TUe>>, InterfaceC747570TUd {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJzs2JjEgHELIOSKCE0PSQrLGElISA7ZwMyJiI5KCg2BCw/PQkhKSIhLCEn";
    public ContentPreferenceViewModel LL;
    public TuxNavBar LLILLJJLI;
    public RecyclerView LLILLL;
    public C747550TUb LLILZ;
    public int LLILZIL;
    public int LLILZLL;

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(LanguageListFragment.class.getName());
        }
        super.onResume();
        ContentPreferenceViewModel contentPreferenceViewModel = this.LL;
        if (contentPreferenceViewModel == null || !contentPreferenceViewModel.LLILZIL) {
            return;
        }
        contentPreferenceViewModel.vQ2();
        contentPreferenceViewModel.LLILZIL = false;
    }

    @Override // X.InterfaceC747570TUd
    public final void LLJL(int i) {
        C747580TUe c747580TUe;
        ArrayList<C747580TUe> value;
        C747580TUe c747580TUe2;
        if (i == this.LLILZIL) {
            return;
        }
        this.LLILLJJLI.LJJ(new AwS134S0101000_28(i, this, 0), "done");
        ContentPreferenceViewModel contentPreferenceViewModel = this.LL;
        int i2 = this.LLILZIL;
        MutableLiveData<ArrayList<C747580TUe>> mutableLiveDataXQ2 = contentPreferenceViewModel.xQ2();
        if (!C086I.LIZIZ(mutableLiveDataXQ2.getValue())) {
            if (i2 >= 0 && (value = mutableLiveDataXQ2.getValue()) != null && (c747580TUe2 = (C747580TUe) ListProtector.get(value, i2)) != null) {
                c747580TUe2.LIZ = false;
            }
            ArrayList<C747580TUe> value2 = mutableLiveDataXQ2.getValue();
            if (value2 != null && (c747580TUe = (C747580TUe) ListProtector.get(value2, i)) != null) {
                c747580TUe.LIZ = true;
            }
            contentPreferenceViewModel.LL = i;
        }
        this.LLILZIL = i;
        this.LLILZ.notifyDataSetChanged();
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(ArrayList<C747580TUe> arrayList) {
        ArrayList<C747580TUe> arrayList2 = arrayList;
        if (!C086I.LIZIZ(arrayList2)) {
            C747550TUb c747550TUb = this.LLILZ;
            if (c747550TUb == null) {
                C747550TUb c747550TUb2 = new C747550TUb(getContext(), this);
                this.LLILZ = c747550TUb2;
                c747550TUb2.LLILLL = arrayList2;
                this.LLILLL.setAdapter(c747550TUb2);
                return;
            }
            c747550TUb.LLILLL = arrayList2;
            c747550TUb.notifyDataSetChanged();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        Integer numValueOf;
        ArrayList<C747580TUe> value;
        C747580TUe c747580TUe;
        super.onCreate(bundle);
        if (getActivity() == null) {
            return;
        }
        ContentPreferenceViewModel contentPreferenceViewModel = (ContentPreferenceViewModel) ViewModelProviders.of(getActivity()).get(ContentPreferenceViewModel.class);
        this.LL = contentPreferenceViewModel;
        contentPreferenceViewModel.xQ2().observe(this, this);
        ContentPreferenceViewModel contentPreferenceViewModel2 = this.LL;
        getContext();
        if (!C086I.LIZIZ(contentPreferenceViewModel2.xQ2().getValue()) && (i = contentPreferenceViewModel2.LL) >= 0) {
            ArrayList<C747580TUe> value2 = contentPreferenceViewModel2.xQ2().getValue();
            if (value2 != null) {
                numValueOf = Integer.valueOf(value2.size());
            } else {
                numValueOf = null;
            }
            if (i <= numValueOf.intValue() - 1 && (value = contentPreferenceViewModel2.xQ2().getValue()) != null && (c747580TUe = (C747580TUe) ListProtector.get(value, contentPreferenceViewModel2.LL)) != null) {
                c747580TUe.LIZ = false;
            }
        }
        this.LLILZLL = -1;
        this.LLILZIL = -1;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        this.LLILLJJLI = (TuxNavBar) view.findViewById(R.id.y08);
        this.LLILLL = (RecyclerView) view.findViewById(R.id.msq);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = this.LLILLL;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new WrapLinearLayoutManager(getContext()));
        }
        C422410GhL c422410GhLLJ = C422410GhL.LJ(getContext());
        RecyclerView recyclerView2 = this.LLILLL;
        if (recyclerView2 != null) {
            recyclerView2.addItemDecoration(c422410GhLLJ);
        }
        TuxNavBar tuxNavBar = this.LLILLJJLI;
        if (tuxNavBar != null) {
            C0OM1 c0om1 = new C0OM1();
            C1250300ido c1250300ido = new C1250300ido();
            c1250300ido.LIZJ = getString(2131828217);
            c1250300ido.LIZLLL = EnumC638250P1r.SECONDARY;
            c1250300ido.LIZ(new AwS572S0100000_28(this, 177));
            c0om1.LJ(c1250300ido);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = getString(2131829518);
            c0om1.LIZJ = c1250250idj;
            C1250300ido c1250300ido2 = new C1250300ido();
            c1250300ido2.LIZJ = getString(2131834695);
            c1250300ido2.LJ = false;
            c1250300ido2.LIZIZ = "done";
            c1250300ido2.LIZ(new AwS572S0100000_28(this, 178));
            c0om1.LIZIZ(c1250300ido2);
            c0om1.LIZLLL = true;
            tuxNavBar.setNavActions(c0om1);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ii, viewGroup, false);
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
