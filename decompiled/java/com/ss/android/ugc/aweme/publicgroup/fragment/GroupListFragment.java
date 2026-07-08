package com.ss.android.ugc.aweme.publicgroup.fragment;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1228470i4b;
import X.C1228810i59;
import X.C1229360i62;
import X.C1229370i63;
import X.C1323820kYO;
import X.C13LE;
import X.C1548820qPI;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C19ME;
import X.C2217381BqS;
import X.C338490DOt;
import X.C397901gf;
import X.C418440Gaw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C459080HzO;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.C987103tV;
import X.EnumC1228830i5B;
import X.InterfaceC0148002o;
import X.InterfaceC1228860i5E;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC836760Ws6;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.publicgroup.vm.GroupListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS228S0300000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
@InterfaceC836760Ws6
public final class GroupListFragment extends BaseFragment implements InterfaceC724530SbT {
    public static final C1229370i63 LLJJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final Map<String, C1228470i4b> LLJJIJI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjU5KyM6KyHELIOSI+JjojZiM+KCg+LSs4ZwghJzA8BSYgPAM+KCg+LSs4";
    public final AssemVMLazy LLIZ;
    public C1228470i4b LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public String LLJIJIL;
    public boolean LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0i63] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupListFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/publicgroup/vm/GroupListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJI = new Object() { // from class: X.0i63
        };
        LLJJIJI = new LinkedHashMap();
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public GroupListFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GroupListViewModel.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 1699);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(257);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 1700), aFwS257S0000000_19, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new AwS563S0100000_19((Fragment) this, 1701), aFwS257S0000000_19, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 1702), aFwS257S0000000_19, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZ = assemVMLazy;
        this.LLJI = "";
        this.LLJIJIL = "";
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1697));
        this.LLJILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1698));
        this.LLJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1696));
    }

    public final GroupListViewModel SR() {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (GroupListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() throws JSONException {
        C1228810i59 c1228810i59;
        InterfaceC1228860i5E interfaceC1228860i5E;
        super.onDestroy();
        C1228470i4b c1228470i4b = this.LLIZLLLIL;
        if (c1228470i4b != null && (c1228810i59 = c1228470i4b.LIZIZ) != null && (interfaceC1228860i5E = c1228810i59.LJIJJ) != null) {
            interfaceC1228860i5E.LIZIZ();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("has_visible_publish_group", !SR().getState().LL.LIZ.isEmpty() ? 1 : 0);
        C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis, new C1323820kYO(jSONObject), "im_group_list_page_update"));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        String str = this.LLJ;
        if (str == null || !this.LLJILJIL) {
            return;
        }
        LLJJIJI.remove(str);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        String string2;
        String string3;
        String string4;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("param_uuid")) == null) {
            if (bundle != null) {
                string = bundle.getString("param_uuid");
            } else {
                string = null;
            }
        }
        this.LLJ = string;
        Bundle arguments2 = getArguments();
        String str = "";
        if ((arguments2 == null || (string2 = arguments2.getString("open_platform_biz_line")) == null) && (bundle == null || (string2 = bundle.getString("open_platform_biz_line")) == null)) {
            string2 = "";
        }
        this.LLJI = string2;
        Bundle arguments3 = getArguments();
        if (arguments3 != null && (string4 = arguments3.getString("open_platform_biz_scene")) != null) {
            str = string4;
        } else if (bundle != null && (string3 = bundle.getString("open_platform_biz_scene")) != null) {
            str = string3;
        }
        this.LLJIJIL = str;
        String str2 = this.LLJ;
        if (str2 != null) {
            this.LLIZLLLIL = (C1228470i4b) ((LinkedHashMap) LLJJIJI).get(str2);
        }
        NR(AFwS283S0000000_35.get$arr$(77));
        activityConfiguration(AFwS283S0000000_35.get$arr$(78));
        this.LLJILJIL = true;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String str = this.LLJ;
        if (str != null) {
            C786410Ut5.LJJJI("param_uuid", str, bundle);
            C786410Ut5.LJJJI("open_platform_biz_line", this.LLJI, bundle);
            C786410Ut5.LJJJI("open_platform_biz_scene", this.LLJIJIL, bundle);
            bundle.putBoolean("arranging_state", SR().getState().LLILZIL);
        }
        this.LLJILJIL = false;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ColorDrawable colorDrawable;
        TextView textView;
        C1228810i59 c1228810i59;
        TextView textView2;
        ViewGroup.LayoutParams layoutParams;
        C19ME c19me;
        super.onViewCreated(view, bundle);
        C1228470i4b c1228470i4b = this.LLIZLLLIL;
        if (c1228470i4b == null) {
            return;
        }
        Context context = view.getContext();
        C1228810i59 c1228810i592 = c1228470i4b.LIZIZ;
        int iLIZ = C1229360i62.LIZ(context, c1228810i592.LJIIIIZZ, c1228810i592.LJIJJLI.LJIIIIZZ);
        int i = 0;
        if (!c1228470i4b.LIZIZ.LIZLLL) {
            colorDrawable = new ColorDrawable(0);
        } else {
            colorDrawable = new ColorDrawable(iLIZ);
        }
        view.setBackground(colorDrawable);
        EnumC1228830i5B enumC1228830i5B = null;
        C723850SaN.LIZ(this, false, null, new AwS228S0300000_19(bundle, this, c1228470i4b, 13), 3);
        C736680Sv4.LJIIIIZZ(this, SR(), new C2217381BqS() { // from class: X.0i61
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1229630i6T) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 71), 4);
        FrameLayout frameLayout = (FrameLayout) this.LLJILLL.getValue();
        if (frameLayout != null) {
            View view2 = (View) this.LLJILLL.getValue();
            if (view2 != null) {
                layoutParams = view2.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
                C1228810i59 c1228810i593 = c1228470i4b.LIZIZ;
                if (!c1228810i593.LIZLLL && c1228810i593.LJIJJLI.LJ == null) {
                    c19me.matchConstraintDefaultHeight = 1;
                }
                c19me.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                C786410Ut5.a6(frameLayout, c19me);
            }
        }
        String str = SR().xQ2().LJI;
        if (str != null && (textView2 = (TextView) this.LLJJ.getValue()) != null) {
            textView2.setText(str);
        }
        C1228470i4b c1228470i4b2 = this.LLIZLLLIL;
        if (c1228470i4b2 != null && (c1228810i59 = c1228470i4b2.LIZIZ) != null) {
            enumC1228830i5B = c1228810i59.LJIIIIZZ;
        }
        if (enumC1228830i5B == EnumC1228830i5B.STICKER_CHOOSE_GROUP && (textView = (TextView) this.LLJJ.getValue()) != null) {
            textView.setTextColor(-1711276033);
        }
        View view3 = (View) this.LLJJ.getValue();
        if (view3 != null) {
            if (!SR().zQ2()) {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view3);
        }
        C459080HzO.LIZ(this, c1228470i4b.LIZIZ.LJIJJLI.LJIIIZ);
        InterfaceC1228860i5E interfaceC1228860i5E = c1228470i4b.LIZIZ.LJIJJ;
        if (interfaceC1228860i5E != null) {
            interfaceC1228860i5E.LIZ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.cib, viewGroup, false);
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

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
