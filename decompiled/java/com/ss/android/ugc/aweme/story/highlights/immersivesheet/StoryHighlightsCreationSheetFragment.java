package com.ss.android.ugc.aweme.story.highlights.immersivesheet;

import X.C01GW;
import X.C05P0;
import X.C098200Yq;
import X.C0I7D;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1383370m6R;
import X.C1389890mGx;
import X.C13BV;
import X.C1412705fx;
import X.C1523605xq;
import X.C1615806Ui;
import X.C1616006Uk;
import X.C1674790tgT;
import X.C1685300txQ;
import X.C1768006wA;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C23250099c;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC344240DeY;
import Y.ACListenerS137S0100000_2;
import Y.ARunnableS71S0200000_2;
import android.content.Context;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.story.highlights.widget.StoryHighlightsCoverView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StoryHighlightsCreationSheetFragment extends BaseFragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY4Jj0qZi0lLic/ISIkPTx9ISghLDHELIOS0gITMpOic2LTFiGjs8OjwEICg7JCwrITsgCzcpKDs6JysfISo2PAM+KCg+LSs4";
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 827));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 824));
    public C1615806Ui LLJ;

    public final StoryHighlightsImmersiveSheetVM SR() {
        return (StoryHighlightsImmersiveSheetVM) this.LLIZ.getValue();
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        Bundle arguments = getArguments();
        Boolean boolValueOf = arguments != null ? Boolean.valueOf(arguments.getBoolean("can_return_to_list_page")) : null;
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131848987);
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZLLL = false;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS546S0100000_2(this, 826));
        c0om1.LIZIZ(c1251150ifB);
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            C1251150ifB c1251150ifB2 = new C1251150ifB();
            c1251150ifB2.LIZLLL();
            c1251150ifB2.LIZJ = R.raw.icon_chevron_left_offset_ltr;
            c1251150ifB2.LIZJ(new AwS546S0100000_2(this, 825));
            c0om1.LJ(c1251150ifB2);
        }
        return c0om1;
    }

    public final void UR() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(this);
        c1389890mGx.LJIIJ(context.getResources().getQuantityString(2131755719, 15, 15));
        c1389890mGx.LJIIJJI();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1615806Ui c1615806Ui = this.LLJ;
        if (c1615806Ui == null) {
            return;
        }
        C05P0<C1674790tgT> uiState = c1615806Ui.LLILLL.getUiState();
        List list = (ArrayList) this.LLIZLLLIL.getValue();
        if (!(list instanceof List) || list == null) {
            list = C13BV.INSTANCE;
        }
        uiState.setValue(new C1674790tgT(new C1523605xq(list), null, null, 0, C1383370m6R.LJFF(R.attr.a02), 0.5f, false, 0, 0.0f, 974));
        final InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(15);
        c1615806Ui.LLILZ.setFilters(new InputFilter[]{new InputFilter() { // from class: X.06Uj
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                if (charSequence == null) {
                    return null;
                }
                int i5 = i2 - i;
                CharSequence charSequenceFilter = lengthFilter.filter(charSequence, i, i2, spanned, i3, i4);
                if (i5 > 0 && charSequenceFilter != null) {
                    if (charSequenceFilter.length() == 0) {
                        this.UR();
                    } else if (charSequenceFilter.length() < i5) {
                        this.UR();
                        return charSequenceFilter;
                    }
                }
                return charSequenceFilter;
            }
        }});
        c1615806Ui.LLILZ.addTextChangedListener(new C1768006wA(this, 3));
        HandlerHook.viewPost(c1615806Ui.LLILZ, new ARunnableS71S0200000_2(c1615806Ui, this, 21));
        C786410Ut5.U8(c1615806Ui.LLILLJJLI, new ACListenerS137S0100000_2(this, 46));
        C1615806Ui c1615806Ui2 = this.LLJ;
        if (c1615806Ui2 != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C1412705fx(this, c1615806Ui2, null), 3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fbk, viewGroup, false);
        int i = R.id.cp8;
        C197039127h c197039127h = (C197039127h) C1616006Uk.LIZ(R.id.cp8, viewTd);
        if (c197039127h != null) {
            i = R.id.f58;
            StoryHighlightsCoverView storyHighlightsCoverView = (StoryHighlightsCoverView) C1616006Uk.LIZ(R.id.f58, viewTd);
            if (storyHighlightsCoverView != null) {
                i = R.id.hd6;
                C0I7D c0i7d = (C0I7D) C1616006Uk.LIZ(R.id.hd6, viewTd);
                if (c0i7d != null) {
                    LinearLayout linearLayout = (LinearLayout) viewTd;
                    this.LLJ = new C1615806Ui(linearLayout, c197039127h, storyHighlightsCoverView, c0i7d);
                    C19GS c19gs = null;
                    if (!(linearLayout instanceof View)) {
                        linearLayout = null;
                    }
                    if (linearLayout != null) {
                        try {
                            ViewTreeLifecycleOwner.set(linearLayout, getViewLifecycleOwner());
                            ViewTreeViewModelStoreOwner.set(linearLayout, this);
                            linearLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
                            C19EG activity = getActivity();
                            if (activity instanceof C19GS) {
                                c19gs = (C19GS) activity;
                            }
                            C1685300txQ.LIZ(c19gs);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                            return linearLayout;
                        }
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                    return linearLayout;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i)));
    }
}
