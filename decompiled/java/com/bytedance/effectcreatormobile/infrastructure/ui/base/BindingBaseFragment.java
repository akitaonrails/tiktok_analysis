package com.bytedance.effectcreatormobile.infrastructure.ui.base;

import X.C098200Yq;
import X.C0DVM;
import X.C0XSS;
import X.C1685300txQ;
import X.C1706630uVp;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2188811AlT;
import X.C23250099c;
import X.C428301lZ;
import X.InterfaceC340040DUs;
import X.ViewOnAttachStateChangeListenerC346330Dhv;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BindingBaseFragment<B extends InterfaceC340040DUs> extends CKEFragment {
    public B LLILZ;

    public abstract void OR(View view, Bundle bundle);

    public abstract B RR(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    public final B PR() {
        B b = this.LLILZ;
        if (b != null) {
            return b;
        }
        C0DVM c0dvmLIZ = C0XSS.LIZ();
        if (c0dvmLIZ != null) {
            c0dvmLIZ.ensureNotReachHere(new Exception("binding get must not be null!"), "binding get null!");
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        View view = getView();
        if (view != null) {
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC346330Dhv(this, 0));
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C428301lZ(this, view, bundle, null), 3);
    }

    @Override // com.bytedance.effectcreatormobile.infrastructure.ui.base.CKEFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View root;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getClass().getName());
        sbLIZ.append("--onCreateView");
        C1706630uVp.LIZ("BindingBaseFragment", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZ = (B) RR(layoutInflater, viewGroup, bundle);
        InterfaceC340040DUs interfaceC340040DUsPR = PR();
        C19GS c19gs = null;
        if (interfaceC340040DUsPR != null) {
            root = interfaceC340040DUsPR.getRoot();
        } else {
            root = null;
        }
        if (!(root instanceof View)) {
            root = null;
        }
        if (root != null) {
            try {
                ViewTreeLifecycleOwner.set(root, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(root, this);
                root.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return root;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return root;
    }
}
