package com.ss.android.ugc.aweme.external.ui;

import X.C098200Yq;
import X.C0CHQ;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C214876197i;
import X.C530700Krc;
import X.InterfaceC214877197j;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.videochoose.IVideoChoose;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class MusVideoChooseFragmentWrapper extends Fragment implements IVideoChoose {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiA0PSohJiQgHELIOSZzo6Zgg5Ohk6LCAjCic8JzYpDz0yLygpJzsEOiQ8OSoh";
    public final int LL = View.generateViewId();
    public final C530700Krc LLILLJJLI;

    @Override // com.ss.android.ugc.aweme.services.videochoose.IVideoChoose
    public final void loadData() {
        this.LLILLJJLI.loadData();
    }

    public MusVideoChooseFragmentWrapper() {
        int color = C0CHQ.LIZ.getResources().getColor(R.color.bd);
        int color2 = C0CHQ.LIZ.getResources().getColor(R.color.b7);
        int color3 = C0CHQ.LIZ.getResources().getColor(R.color.ao);
        C530700Krc c530700Krc = new C530700Krc();
        Bundle bundle = new Bundle();
        bundle.putInt("ARG_NUM_COLUMNS", 3);
        bundle.putFloat("ARG_HORIZONTAL_SPACING", 1.5f);
        bundle.putFloat("ARG_VERTICAL_SPACING", 1.5f);
        bundle.putInt("ARG_GRID_PADDING", 0);
        bundle.putInt("ARG_TEXT_COLOR", color);
        bundle.putInt("ARG_SHADOW_COLOR", color2);
        bundle.putDouble("ARG_ITEM_HEIGHT_WIDTH_RATIO", 1.0d);
        bundle.putInt("ARG_TEXT_SIZE", 13);
        bundle.putBoolean("ARG_TEXT_BACKGROUND", false);
        bundle.putBoolean("ARG_TEXT_INDICATOR", false);
        bundle.putInt("ARG_BG_COLOR", color3);
        c530700Krc.mArguments = bundle;
        this.LLILLJJLI = c530700Krc;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C214876197i c214876197i = new C214876197i(this, C530700Krc.class, this.LL);
        c214876197i.LJ = new InterfaceC214877197j() { // from class: X.0LzS
            @Override // X.InterfaceC214877197j
            public final Scene LIZ(ClassLoader classLoader, String str, Bundle bundle2) {
                return this.LIZ.LLILLJJLI;
            }
        };
        c214876197i.LJFF = false;
        c214876197i.LIZLLL = false;
        c214876197i.LIZ();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        FrameLayout frameLayout = new FrameLayout(requireActivity());
        frameLayout.setId(this.LL);
        try {
            ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(frameLayout, this);
            frameLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return frameLayout;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return frameLayout;
        }
    }
}
