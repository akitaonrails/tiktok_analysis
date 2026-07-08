package com.ss.android.ugc.profile.business.ci.viewer.ui;

import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20696415yk;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC344240DeY;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.profile.business.ci.viewer.viewmodel.ProfileViewerViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class ProfileViewerSettingSheetFragment extends Fragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9KyxiPyY2HELIOSPyA+Zzo6ZhU+Jik6JCAaICokLTcfLDsnISsrGic2LTEKOy40JSAiPQ==";
    public C20696415yk LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 668));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 666));

    public final ProfileViewerViewModel MR() {
        return (ProfileViewerViewModel) this.LLILLJJLI.getValue();
    }

    public final boolean NR() {
        return ((Boolean) this.LLILLL.getValue()).booleanValue();
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS556S0100000_12(this, 665));
        c0om1.LIZIZ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(NR() ? 2131837216 : 2131845517);
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZLLL = false;
        return c0om1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ae  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            r7 = this;
            super.onViewCreated(r8, r9)
            r0 = 2131375232(0x7f0a3480, float:1.8370606E38)
            android.view.View r2 = r8.findViewById(r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131837179(0x7f1140fb, float:1.9307546E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setText(r0)
            r0 = 2131367509(0x7f0a1655, float:1.8354942E38)
            android.view.View r2 = r8.findViewById(r0)
            Y.ACListenerS147S0100000_12 r1 = new Y.ACListenerS147S0100000_12
            r0 = 279(0x117, float:3.91E-43)
            r1.<init>(r7, r0)
            X.C786410Ut5.I7(r1, r2)
            com.ss.android.ugc.profile.business.ci.viewer.viewmodel.ProfileViewerViewModel r0 = r7.MR()
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r3 = r0.LLILZIL
            androidx.lifecycle.LifecycleOwner r2 = r7.getViewLifecycleOwner()
            Y.AObserverS216S0100000_12 r1 = new Y.AObserverS216S0100000_12
            r0 = 56
            r1.<init>(r8, r0)
            r3.observe(r2, r1)
            com.ss.android.ugc.profile.business.ci.viewer.viewmodel.ProfileViewerViewModel r0 = r7.MR()
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r2 = r0.LLILZIL
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService> r0 = com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService.class
            java.lang.Object r1 = r1.getService(r0)
            com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService r1 = (com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService) r1
            java.lang.String r0 = "viewer_history"
            com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecord r0 = r1.LJJIJ(r0)
            if (r0 == 0) goto Lae
            int r1 = r0.status
            r0 = 1
            if (r1 != r0) goto Lae
        L5e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.postValue(r0)
            X.10i2 r6 = new X.10i2
            r0 = 2131386112(0x7f0a5f00, float:1.8392673E38)
            android.view.View r0 = r8.findViewById(r0)
            X.15jv r0 = (X.ViewOnAttachStateChangeListenerC20604515jv) r0
            r6.<init>(r0)
            com.ss.android.ugc.profile.business.ci.viewer.viewmodel.ProfileViewerViewModel r0 = r7.MR()
            boolean r5 = r0.LLJIJIL
            boolean r0 = r7.NR()
            if (r0 == 0) goto L92
            X.09Gk r2 = new X.09Gk
            r2.<init>()
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "profile_visitor_settings"
            r2.LJIIIIZZ(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "change_viewer_status"
            X.C20684815ws.LJIILLIIL(r0, r1)
        L92:
            android.content.Context r4 = r7.getContext()
            if (r4 == 0) goto Lad
            X.15yk r3 = new X.15yk
            boolean r2 = r7.NR()
            kotlin.jvm.internal.AwS556S0100000_12 r1 = new kotlin.jvm.internal.AwS556S0100000_12
            r0 = 667(0x29b, float:9.35E-43)
            r1.<init>(r7, r0)
            r3.<init>(r4, r1, r2, r5)
            r7.LL = r3
            r6.LIZ(r3)
        Lad:
            return
        Lae:
            r0 = 0
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ci.viewer.ui.ProfileViewerSettingSheetFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ejs, viewGroup, false);
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
