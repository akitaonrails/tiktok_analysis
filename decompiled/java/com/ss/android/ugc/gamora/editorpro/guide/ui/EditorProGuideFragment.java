package com.ss.android.ugc.gamora.editorpro.guide.ui;

import X.C098200Yq;
import X.C0C64;
import X.C0T9L;
import X.C0T9M;
import X.C0VSP;
import X.C1294250jmh;
import X.C1295960jpS;
import X.C1455810nzH;
import X.C14KQ;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C786410Ut5;
import Y.ACListenerS147S0100000_12;
import Y.ARunnableS112S0100000_12;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
public final class EditorProGuideFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiItJCAhKWspLSYnJzc8OyHELIOSB9LzAlLSp9PSxiDCs6PCo+GT08DzAlLSoVOiQrJCo9PA==";
    public TuxSheet LL;
    public VideoPublishEditModel LLILLJJLI;
    public String LLILLL = "";

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        final C1295960jpS c1295960jpS = (C1295960jpS) view.findViewById(R.id.nru);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.q32);
        TextView textView = (TextView) view.findViewById(R.id.title);
        C786410Ut5.a6(frameLayout, new LinearLayout.LayoutParams(-1, (int) ((C14KQ.LJIIIZ(getContext()) * 184.0f) / 375.0f)));
        C1294250jmh.LJ(new C0VSP(this.LLILLL), null).LIZIZ(new C0T9M(new C0T9L() { // from class: X.0T9K
            @Override // X.C0T9L
            public final void LIZ(C1294720jnS c1294720jnS) {
                if (c1294720jnS != null) {
                    c1295960jpS.setComposition(c1294720jnS);
                }
            }
        }));
        c1295960jpS.setRepeatCount(-1);
        c1295960jpS.setRepeatMode(1);
        HandlerHook.viewPost(c1295960jpS, new ARunnableS112S0100000_12(c1295960jpS, 225));
        C1455810nzH.LIZ.getClass();
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_editor_pro_change_adjust_clip_name", true);
        if (iLJIJ != 1) {
            if (iLJIJ != 2) {
                if (iLJIJ != 3) {
                    if (iLJIJ != 4) {
                        if (iLJIJ != 5) {
                            i = 2131837982;
                        } else {
                            i = 2131833441;
                        }
                    } else {
                        i = 2131833444;
                    }
                } else {
                    i = 2131833442;
                }
            } else {
                i = 2131833443;
            }
        } else {
            i = 2131833445;
        }
        textView.setText(i);
        C786410Ut5.U8((C197039127h) view.findViewById(R.id.pk9), new ACListenerS147S0100000_12(this, 277));
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 278), view.findViewById(R.id.e1y));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c18, viewGroup, false);
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
