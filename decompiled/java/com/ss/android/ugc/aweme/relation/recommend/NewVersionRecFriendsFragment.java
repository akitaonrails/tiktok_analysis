package com.ss.android.ugc.aweme.relation.recommend;

import X.C01GW;
import X.C098200Yq;
import X.C1262950iyD;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2187451AjH;
import X.C2211631BhB;
import X.C452501pT;
import X.C616540OGe;
import X.C723850SaN;
import X.C786410Ut5;
import X.InterfaceC1740760vOs;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.relation.viewmodel.SocialRecFlowModel;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class NewVersionRecFriendsFragment extends AmeBaseFragment implements InterfaceC1740760vOs {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjcpJS4nISoiZz02HELIOSKyohJCo9LGsCLDgFLTc/ICA9GiAvDz06LSsoOgkhKSIhLCEn";
    public C1262950iyD LLILLJJLI;
    public boolean LLILZIL;
    public final C01GW LL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(255));
    public String LLILLL = "";
    public String LLILZ = "";

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "b1724";
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(NewVersionRecFriendsFragment.class.getName());
        }
        super.onResume();
        C2211631BhB.LJIIL(this, getActivity());
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C1262950iyD c1262950iyD;
        super.onViewCreated(view, bundle);
        String str = (String) this.LL.getValue();
        if (str != null && str.length() != 0) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                Serializable serializable = arguments.getSerializable("recommendFriendsConfig");
                if ((serializable instanceof C1262950iyD) && (c1262950iyD = (C1262950iyD) serializable) != null) {
                    this.LLILLJJLI = c1262950iyD;
                    String string = arguments.getString("platforms");
                    String str2 = "";
                    if (string == null) {
                        string = "";
                    }
                    this.LLILLL = string;
                    String string2 = arguments.getString("skip_platforms");
                    if (string2 != null) {
                        str2 = string2;
                    }
                    this.LLILZ = str2;
                    this.LLILZIL = arguments.getBoolean("isAfterAuth");
                } else {
                    C19EG activity = getActivity();
                    if (activity != null) {
                        ((SocialRecFlowModel) ViewModelProviders.of(activity).get(SocialRecFlowModel.class)).LLILLJJLI.postValue(new Bundle());
                        return;
                    }
                    return;
                }
            }
            C723850SaN.LIZ(this, false, null, new AwS595S0100000_16(this, 138), 3);
            return;
        }
        C19EG activity2 = getActivity();
        if (activity2 != null) {
            ((SocialRecFlowModel) ViewModelProviders.of(activity2).get(SocialRecFlowModel.class)).LLILLJJLI.postValue(new Bundle());
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c_p, viewGroup, false);
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
