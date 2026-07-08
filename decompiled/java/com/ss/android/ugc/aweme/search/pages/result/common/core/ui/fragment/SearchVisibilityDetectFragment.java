package com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C616540OGe;
import X.C786410Ut5;
import X.InterfaceC646750PYj;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public abstract class SearchVisibilityDetectFragment extends AbsSearchBaseFragment implements View.OnAttachStateChangeListener {
    public boolean LLILZLL;
    public boolean LLIZ;
    public final ArrayList<InterfaceC646750PYj> LLIZLLLIL = new ArrayList<>();

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        ZR(false);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.LLILZLL = false;
        ZR(false);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(getClass().getName());
        }
        super.onResume();
        this.LLILZLL = true;
        ZR(true);
    }

    private final void ZR(boolean z) {
        boolean z2;
        if (z == this.LLIZ) {
            return;
        }
        boolean z3 = this.LLILZLL;
        boolean zIsVisible = isVisible();
        boolean userVisibleHint = getUserVisibleHint();
        if (z3 && zIsVisible && userVisibleHint) {
            z2 = true;
        } else {
            z2 = false;
        }
        C786410Ut5.j4("==> checkVisibility = %s  ( parent = %s, super = %s, hint = %s )", Arrays.copyOf(new Object[]{Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(zIsVisible), Boolean.valueOf(userVisibleHint)}, 4));
        if (z2 != this.LLIZ) {
            this.LLIZ = z2;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("==> onVisibilityChanged = ");
            sbLIZ.append(z2);
            C2188811AlT.LIZIZ(sbLIZ);
            Iterator<InterfaceC646750PYj> it2 = this.LLIZLLLIL.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(z2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        ZR(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/ss/android/ugc/aweme/search/pages/result/common/core/ui/fragment/SearchVisibilityDetectFragment", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtYo3N1HzhDDRLpI72YnZMf+rOTrgB6IgwXYfZLQfz62aabjulGvOwJE7aMlI+aZ8GK4imrMwVwH71TzwE8Xeaf/H4q81Dc9KZ", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        ZR(!z);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ZR(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        ZR(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/search/pages/result/common/core/ui/fragment/SearchVisibilityDetectFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtYo3N1HzhDDRLpI72YnZMf+rOTrgB6IgwXYfZLQfz62aabjulGvOwJE7aMlI+aZ8GK4imrMwVwH71TzwE8Xeaf/H4q81Dc9KZ", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        ZR(z);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.addOnAttachStateChangeListener(this);
    }
}
