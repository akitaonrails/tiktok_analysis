package com.bytedance.android.livesdk.adminsetting;

import X.C01GW;
import X.C098200Yq;
import X.C1685300txQ;
import X.C16F5;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C23250099c;
import X.C292401Bi;
import X.C475510Ikn;
import X.C487990JBt;
import X.C500260Jjc;
import X.C751260TdU;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveFilterCommentSettingFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICEgLTHELIOSE4ICE0ZgklPyoVISk4LD0QJyghLCEnGyA4PSY9LwM+KCg+LSs4";
    public C16F5 LL;
    public LinearLayout LLILLJJLI;
    public C751260TdU LLILZ;
    public FrameLayout LLILZLL;
    public LiveIconView LLIZ;
    public final C01GW LLILLL = C292401Bi.LIZ(new AwS551S0100000_7(this, 18));
    public final C01GW LLILZIL = C292401Bi.LIZ(new AwS551S0100000_7(this, 17));

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
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

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        View view;
        super.onViewStateRestored(bundle);
        if (!C500260Jjc.LJIJJLI(C475510Ikn.LJ(this)) && (view = getView()) != null) {
            view.getLayoutParams().height = (view.getContext().getResources().getDisplayMetrics().heightPixels * 73) / 100;
            C786410Ut5.W5(view, view.getLayoutParams());
        }
        Room room = (Room) this.LLILLL.getValue();
        if (room != null) {
            room.getId();
        }
        this.LLILZ = new C751260TdU(((Boolean) this.LLILZIL.getValue()).booleanValue(), getView(), "", "", C475510Ikn.LJ(this), this);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C487990JBt(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6 A[PHI: r1
      0x00c6: PHI (r1v20 android.view.View) = (r1v19 android.view.View), (r1v23 android.view.View) binds: [B:41:0x00b3, B:46:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.adminsetting.LiveFilterCommentSettingFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.g6h, viewGroup, false);
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
