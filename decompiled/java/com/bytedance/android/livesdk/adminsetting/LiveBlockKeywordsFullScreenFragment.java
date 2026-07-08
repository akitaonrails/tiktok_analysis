package com.bytedance.android.livesdk.adminsetting;

import X.C01GW;
import X.C098200Yq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C292401Bi;
import X.C500260Jjc;
import X.C748430TXl;
import X.C786410Ut5;
import X.InterfaceC2262081DgM;
import X.InterfaceC500940Jki;
import Y.ACListenerS147S0100000_12;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveBlockKeywordsFullScreenFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICEgLTE4HELIOSICE0ZgklPyoRJCovIgQ2MTIjOysgDjAgJRwwOiApJwkhKSIhLCEn";
    public C748430TXl LL;
    public FrameLayout LLILLJJLI;
    public final C01GW LLILLL = C292401Bi.LIZ(new AwS556S0100000_12(this, 93));
    public final C01GW LLILZ = C292401Bi.LIZ(new AwS556S0100000_12(this, 91));

    public final C748430TXl NR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.c4c) : null;
            this.LL = (C748430TXl) viewFindViewById;
        }
        return (C748430TXl) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        if (this.mStatusViewValid) {
            C500260Jjc.LJIILJJIL(NR().getBlockWordEditTextFromXml());
        }
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        InterfaceC2262081DgM currentUser;
        String secUid;
        long id;
        User owner;
        String secUid2;
        super.onViewCreated(view, bundle);
        String str = "";
        if (this.LLILLL.getValue() != null) {
            C748430TXl c748430TXlNR = NR();
            boolean zBooleanValue = ((Boolean) this.LLILZ.getValue()).booleanValue();
            Room room = (Room) this.LLILLL.getValue();
            if (room != null && (owner = room.getOwner()) != null && (secUid2 = owner.getSecUid()) != null) {
                str = secUid2;
            }
            Room room2 = (Room) this.LLILLL.getValue();
            if (room2 != null) {
                id = room2.getId();
            } else {
                id = 0;
            }
            c748430TXlNR.LJII(str, id, "autosuggest", zBooleanValue, false);
        } else {
            C748430TXl c748430TXlNR2 = NR();
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            if (interfaceC500940JkiUser != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null && (secUid = currentUser.getSecUid()) != null) {
                str = secUid;
            }
            c748430TXlNR2.LJII(str, 0L, "autosuggest", true, false);
        }
        NR().setOnAddSuccessCallback(new AwS556S0100000_12(this, 92));
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.bmy);
            } else {
                viewFindViewById = null;
            }
            this.LLILLJJLI = (FrameLayout) viewFindViewById;
        }
        C786410Ut5.O7((FrameLayout) viewFindViewById, new ACListenerS147S0100000_12(this, 82));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ggi, viewGroup, false);
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
