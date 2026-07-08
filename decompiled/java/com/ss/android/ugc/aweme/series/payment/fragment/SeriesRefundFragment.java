package com.ss.android.ugc.aweme.series.payment.fragment;

import X.C03H5;
import X.C098200Yq;
import X.C0HZQ;
import X.C0I7D;
import X.C0WZX;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C13LE;
import X.C1612490s3z;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ACListenerS126S0200000_24;
import Y.ACListenerS158S0100000_24;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.refund.viewmodel.SeriesRefundRatingViewModel;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.series.payment.fragment.SeriesRefundFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesRefundFragment extends Fragment implements InterfaceC724530SbT {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpOyY2O2s8KDHELIOSY+LSs4ZykhKSIhLCEnZhYpOyY2OxcpLzo9LAM+KCg+LSs4";
    public final CollectionDetailModel LL;
    public final C736950SvV LLILLJJLI;
    public final List<CheckBox> LLILLL;
    public C197039127h LLILZ;
    public C0I7D LLILZIL;
    public Dialog LLILZLL;

    public SeriesRefundFragment() {
        this(null);
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

    public final void RR() {
        Editable editableLLLLJI;
        Iterator<CheckBox> it2 = this.LLILLL.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            if (it2.next().isChecked()) {
                z = true;
            }
        }
        C0I7D c0i7d = this.LLILZIL;
        boolean z2 = (c0i7d == null || (editableLLLLJI = C2204961BRm.LLLLJI(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtcZbLz3wzS9HTpkWkLq186fua0/VgAoHhGhN6rCykELmSNSD3wmpTrmlu", null))) == null || editableLLLLJI.length() <= 0) ? false : true;
        C197039127h c197039127h = this.LLILZ;
        if (c197039127h != null) {
            c197039127h.setEnabled(z || z2);
        }
    }

    public SeriesRefundFragment(CollectionDetailModel collectionDetailModel) {
        this.LL = collectionDetailModel;
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 1052);
        this.LLILLJJLI = new C736950SvV(C13LE.LIZ(SeriesRefundRatingViewModel.class), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(325), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
        this.LLILLL = new ArrayList();
    }

    public final String MR(String str) {
        String str2;
        String str3;
        int i = -1;
        int i2 = 0;
        for (CheckBox checkBox : this.LLILLL) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                if (checkBox.isChecked()) {
                    i = i2;
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    str2 = "No selected reason";
                } else {
                    str2 = "Poor video quality";
                }
            } else {
                str2 = "Not what I expected";
            }
        } else {
            str2 = "Purchased by accident";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        if (str.length() > 0) {
            str3 = " and Other.";
        } else {
            str3 = "";
        }
        sbLIZ.append(str3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void NR(String str) {
        String string;
        String string2;
        boolean z;
        C1612490s3z c1612490s3z = C1612490s3z.LJI;
        Bundle arguments = getArguments();
        SeriesCategory seriesCategory = null;
        if (arguments != null) {
            string = arguments.getString("enter_from");
        } else {
            string = null;
        }
        CollectionDetailModel collectionDetailModel = this.LL;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            string2 = arguments2.getString("current_page");
        } else {
            string2 = null;
        }
        Bundle arguments3 = getArguments();
        boolean z2 = false;
        if (arguments3 != null) {
            z = arguments3.getBoolean("is_from_anchor");
        } else {
            z = false;
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            z2 = arguments4.getBoolean("is_from_bottom_banner");
        }
        CollectionDetailModel collectionDetailModel2 = this.LL;
        if (collectionDetailModel2 != null) {
            seriesCategory = collectionDetailModel2.category;
        }
        C1612490s3z.LJJJJZ(c1612490s3z, str, string, null, null, null, null, Boolean.valueOf(z), null, null, null, null, null, null, null, null, null, null, null, collectionDetailModel, null, null, null, null, null, null, null, false, null, null, null, null, Boolean.valueOf(z2), false, null, null, null, null, null, string2, seriesCategory, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -524612, 1073740283);
    }

    public final void OR(boolean z) {
        String string;
        Long lValueOf;
        SeriesCategory seriesCategory;
        boolean z2;
        boolean z3;
        C1612490s3z c1612490s3z = C1612490s3z.LJI;
        Bundle arguments = getArguments();
        String string2 = null;
        if (arguments != null) {
            string = arguments.getString("enter_from");
        } else {
            string = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            lValueOf = Long.valueOf(arguments2.getLong("room_id"));
        } else {
            lValueOf = null;
        }
        CollectionDetailModel collectionDetailModel = this.LL;
        if (collectionDetailModel != null) {
            seriesCategory = collectionDetailModel.category;
        } else {
            seriesCategory = null;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            string2 = arguments3.getString("current_page");
        }
        Bundle arguments4 = getArguments();
        int i = 0;
        if (arguments4 != null) {
            z2 = arguments4.getBoolean("is_from_anchor");
        } else {
            z2 = false;
        }
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            z3 = arguments5.getBoolean("is_from_bottom_banner");
        } else {
            z3 = false;
        }
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            i = arguments6.getInt("refund_number_of_episodes");
        }
        C1612490s3z.LJJJJZ(c1612490s3z, "collection_refund_summary", string, null, null, null, null, Boolean.valueOf(z2), Boolean.valueOf(z), null, null, null, lValueOf, null, null, null, null, null, null, collectionDetailModel, null, null, null, null, null, null, null, false, null, null, null, null, Boolean.valueOf(z3), false, null, null, null, null, null, string2, seriesCategory, Integer.valueOf(i), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -528836, 1073738235);
    }

    public final void PR(LinearLayout linearLayout, final String str) {
        TuxTextView tuxTextView = (TuxTextView) linearLayout.findViewById(R.id.t2x);
        final C0HZQ c0hzq = (C0HZQ) linearLayout.findViewById(R.id.t2q);
        ((ArrayList) this.LLILLL).add(c0hzq);
        tuxTextView.setText(str);
        C786410Ut5.h9(tuxTextView, new ACListenerS126S0200000_24(this, c0hzq, 6));
        C786410Ut5.b9(c0hzq, new ACListenerS158S0100000_24(this, 43));
        C786410Ut5.D7(c0hzq, new CompoundButton.OnCheckedChangeListener(str, c0hzq) { // from class: X.0s8c
            public final /* synthetic */ C0HZQ LLILLJJLI;

            {
                this.LLILLJJLI = c0hzq;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (z) {
                    List<CheckBox> list = this.LL.LLILLL;
                    C0HZQ c0hzq2 = this.LLILLJJLI;
                    for (CompoundButton compoundButton2 : (ArrayList) list) {
                        if (!Intrinsics.LJFF(c0hzq2, compoundButton2)) {
                            compoundButton2.setChecked(false);
                        }
                    }
                    this.LL.NR("select_collection_refund_reason");
                }
                this.LL.RR();
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        String string3;
        Resources resources;
        Resources resources2;
        String string4;
        Resources resources3;
        Resources resources4;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.t2n);
        Context context = getContext();
        String str = "";
        if (context == null || (resources4 = context.getResources()) == null || (string = resources4.getString(2131847518)) == null) {
            string = "";
        }
        PR(linearLayout, string);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.t2o);
        Context context2 = getContext();
        if (context2 == null || (resources3 = context2.getResources()) == null || (string2 = resources3.getString(2131847521)) == null) {
            string2 = "";
        }
        PR(linearLayout2, string2);
        LinearLayout linearLayout3 = (LinearLayout) view.findViewById(R.id.t2p);
        Context context3 = getContext();
        if (context3 != null && (resources2 = context3.getResources()) != null && (string4 = resources2.getString(2131847534)) != null) {
            str = string4;
        }
        PR(linearLayout3, str);
        C786410Ut5.a9((TuxIconView) view.findViewById(R.id.bn2), new ACListenerS158S0100000_24(this, 41));
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.t38);
        this.LLILZ = c197039127h;
        if (c197039127h != null) {
            Context context4 = getContext();
            if (context4 != null && (resources = context4.getResources()) != null) {
                string3 = resources.getString(2131847531);
            } else {
                string3 = null;
            }
            c197039127h.setText(string3);
        }
        final TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.t2a);
        tuxTextView.setText("0/200");
        C0I7D c0i7d = (C0I7D) view.findViewById(R.id.f805t2b);
        this.LLILZIL = c0i7d;
        if (c0i7d != null) {
            c0i7d.addTextChangedListener(new TextWatcher() { // from class: X.0s8b
                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    SeriesRefundFragment seriesRefundFragment = this.LL;
                    C0I7D c0i7d2 = seriesRefundFragment.LLILZIL;
                    if (c0i7d2 != null) {
                        tuxTextView.setText("" + String.valueOf(C2204961BRm.LLLLJI(c0i7d2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtcZbLz3wzS9HTpkWkLq186fua0/VgAoHhGhN6rCykELmSNSD3wmpTrmlu", null))).length() + "/200");
                        seriesRefundFragment.RR();
                        if (String.valueOf(C2204961BRm.LLLLJI(c0i7d2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtcZbLz3wzS9HTpkWkLq186fua0/VgAoHhGhN6rCykELmSNSD3wmpTrmlu", null))).length() > 0) {
                            Iterator<CheckBox> it2 = seriesRefundFragment.LLILLL.iterator();
                            while (it2.hasNext()) {
                                it2.next().setChecked(false);
                            }
                        }
                    }
                }
            });
        }
        C197039127h c197039127h2 = this.LLILZ;
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, new ACListenerS158S0100000_24(this, 42));
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLILLJJLI.getValue(), new C2217381BqS() { // from class: X.0s8d
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1611650s2d) obj).LLILZLL;
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 84), 4);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bhw, viewGroup, false);
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
