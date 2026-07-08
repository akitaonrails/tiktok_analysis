package com.ss.android.ugc.aweme.journey.step.push;

import X.C098200Yq;
import X.C10H5;
import X.C1685300txQ;
import X.C189200o6;
import X.C1912300zrY;
import X.C19249910Sr;
import X.C19EG;
import X.C19GS;
import X.C2344009Gk;
import X.C786410Ut5;
import X.EnumC1912290zrX;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.INUJPushService;
import com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes29.dex */
public final class PushAuthPrepositionPageFragment extends NUJComponentFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zi8jPD09LTxiOjs2OGHELIOSs8PDw7ZhU5OicSPTEkGT02OCo/IDs6JyscKCg2DjctLiI2JjE=";
    public boolean LLJIJIL;
    public final INUJPushService LLJI = (INUJPushService) ServiceManager.get().getService(INUJPushService.class);
    public EnumC1912290zrX LLJILJIL = EnumC1912290zrX.INIT;

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (!this.LLJIJIL) {
            VR("killed");
        } else if (this.LLJILJIL == EnumC1912290zrX.SKIPPED) {
            VR("skipped");
        } else {
            VR("done");
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (this.LLJIJIL) {
            return;
        }
        VR("background");
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
    public final void VR(String str) {
        C19249910Sr c19249910Sr = C19249910Sr.LIZIZ;
        String value = C10H5.PUSH_PERMISSION_PAGE_EXIT.getValue();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("ui_type", "push_preposition_page");
        c2344009Gk.LJIIIIZZ("exit_method", str);
        c2344009Gk.LJIIIIZZ("push_status", this.LLJILJIL.getStatus());
        c2344009Gk.LIZJ(this.LLJIJIL ? 1 : 0, "node_completed");
        c19249910Sr.LIZIZ(c2344009Gk, value);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C19EG activity = getActivity();
        if (activity == null) {
            NR(null);
            return;
        }
        if (this.LLJILJIL != EnumC1912290zrX.INIT) {
            return;
        }
        this.LLJILJIL = EnumC1912290zrX.REQUESTED;
        C19249910Sr c19249910Sr = C19249910Sr.LIZIZ;
        String value = C10H5.PUSH_PERMISSION_PAGE_SHOW.getValue();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("ui_type", "push_preposition_page");
        c19249910Sr.LIZIZ(c2344009Gk, value);
        this.LLJI.LJIIIZ(activity, new C1912300zrY(this));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View view = new View(requireContext());
        view.setBackgroundColor(-16777216);
        C786410Ut5.W5(view, new ViewGroup.LayoutParams(-1, -1));
        try {
            ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(view, this);
            view.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return view;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return view;
        }
    }
}
