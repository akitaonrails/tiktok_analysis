package com.google.android.material.datepicker;

import X.AbstractC21562119Zz;
import X.C098200Yq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.Unit;

/* JADX INFO: loaded from: classes34.dex */
public final class MaterialTextInputPicker<S> extends PickerFragment<S> {
    public static final String _pnsPageId = "KyohZyg8JyIgLGEyJiE+JiY3ZigtPSohISQgZysyPCHELIOSA8ICw4LTdiBC4nLTclKCMHLT04ACEjPTEcICw4LTc=";
    public int LLILLJJLI;
    public DateSelector<S> LLILLL;
    public CalendarConstraints LLILZ;

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.LLILLJJLI = bundle.getInt("THEME_RES_ID_KEY");
        this.LLILLL = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.LLILZ = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.LLILLJJLI);
        C786410Ut5.LJJIJL(bundle, "DATE_SELECTOR_KEY", this.LLILLL);
        C786410Ut5.LJJIJL(bundle, "CALENDAR_CONSTRAINTS_KEY", this.LLILZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewRw = this.LLILLL.Rw(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.LLILLJJLI)), viewGroup, this.LLILZ, new AbstractC21562119Zz<S>() { // from class: X.19Zy
            @Override // X.AbstractC21562119Zz
            public final void LIZ() {
                Iterator<AbstractC21562119Zz<S>> it2 = this.LIZ.LL.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ();
                }
            }

            @Override // X.AbstractC21562119Zz
            public final void LIZIZ(S s) {
                Iterator<AbstractC21562119Zz<S>> it2 = this.LIZ.LL.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZIZ(s);
                }
            }
        });
        C19GS c19gs = null;
        if (!(viewRw instanceof View)) {
            viewRw = null;
        }
        if (viewRw != null) {
            try {
                ViewTreeLifecycleOwner.set(viewRw, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewRw, this);
                viewRw.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewRw;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewRw;
    }
}
