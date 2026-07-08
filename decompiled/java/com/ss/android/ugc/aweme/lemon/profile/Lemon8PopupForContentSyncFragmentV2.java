package com.ss.android.ugc.aweme.lemon.profile;

import X.C098200Yq;
import X.C10GC;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C786410Ut5;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lemon.Lemon8ProfileContentSyncConfig;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes29.dex */
public final class Lemon8PopupForContentSyncFragmentV2 extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZikpJCA9ZjU+Jik6JCHELIOSBiBSo+Jyt0GSAjPTUKJj0QJys4LCEnGzwiKgkhKSIhLCEnHnc=";
    public C10GC LL;
    public Lemon8ProfileContentSyncConfig LLILLJJLI;
    public View LLILLL;
    public boolean LLILZ = true;

    public static void NR(View view, final float f) {
        view.setClipToOutline(true);
        view.setOutlineProvider(new ViewOutlineProvider() { // from class: X.10GB
            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view2, Outline outline) {
                if (view2 == null) {
                    return;
                }
                Rect rect = new Rect(0, 0, view2.getWidth(), view2.getHeight());
                if (outline != null) {
                    outline.setRoundRect(rect, f);
                }
            }
        });
    }

    public final void MR(SmartImageView smartImageView, String str) {
        if (smartImageView != null && str != null) {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:79:0x027b  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r26, android.os.Bundle r27) {
        /*
            Method dump skipped, instruction units count: 1022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.lemon.profile.Lemon8PopupForContentSyncFragmentV2.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2;
        View viewTd = this.LLILLL;
        C19GS c19gs = null;
        if (viewTd != null) {
            ViewParent parent = viewTd.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) parent;
            } else {
                viewGroup2 = null;
            }
            if (viewGroup2 != null) {
                C786410Ut5.LJJJLZIJ(viewTd, viewGroup2);
            }
        }
        if (viewTd == null) {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.d_w, viewGroup, false);
            this.LLILLL = viewTd;
        }
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
