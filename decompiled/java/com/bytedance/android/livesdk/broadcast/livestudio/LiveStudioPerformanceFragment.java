package com.bytedance.android.livesdk.broadcast.livestudio;

import X.C098200Yq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C782390Umb;
import X.C782400Umc;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.dataChannel.LiveCenterForceRefreshEvent;
import com.bytedance.android.livesdk.dataChannel.LiveCenterShowEvent;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveStudioPerformanceFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4ZyHELIOSM6PiA/PTo3ISpiBSYlLRY4PCs6JxUpOyk8OigtJyw2DjctLiI2JjE=";
    public C782390Umb LL;
    public C782390Umb LLILLJJLI;
    public DataChannel LLILLL;
    public boolean LLILZ = true;

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!this.LLILZ) {
            DataChannel dataChannel = this.LLILLL;
            if (dataChannel != null) {
                dataChannel.FQ2(LiveCenterForceRefreshEvent.class);
                return;
            }
            return;
        }
        this.LLILZ = false;
        C782390Umb c782390Umb = this.LLILLJJLI;
        if (c782390Umb != null) {
            c782390Umb.setDataChannel(this.LLILLL);
        }
        DataChannel dataChannel2 = this.LLILLL;
        if (dataChannel2 != null) {
            dataChannel2.LC0(LiveCenterShowEvent.class, new C782400Umc(null, null, false, null, 14));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View viewFindViewById = this.LL;
        C782390Umb c782390Umb = null;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.mur);
            } else {
                viewFindViewById = null;
            }
            this.LL = (C782390Umb) viewFindViewById;
        }
        C782390Umb c782390Umb2 = (C782390Umb) viewFindViewById;
        if (c782390Umb2 instanceof C782390Umb) {
            c782390Umb = c782390Umb2;
        }
        this.LLILLJJLI = c782390Umb;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewSd = C786410Ut5.Sd(R.layout.gji, layoutInflater, viewGroup);
        C19GS c19gs = null;
        if (!(viewSd instanceof View)) {
            viewSd = null;
        }
        if (viewSd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewSd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewSd, this);
                viewSd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewSd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewSd;
    }
}
