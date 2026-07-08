package com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.sharepost;

import X.C01GW;
import X.C054G;
import X.C05O6;
import X.C098200Yq;
import X.C1391190mJ3;
import X.C1497305tb;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C23250099c;
import X.C343970De7;
import X.C418440Gaw;
import X.C452501pT;
import X.C723850SaN;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1058150ddt;
import X.InterfaceC1391170mJ1;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class BotSharePostPickerFragment extends BaseFragment implements InterfaceC1391170mJ1, InterfaceC1058150ddt {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwhZy46ZiwhOSN9OygtOzshLTUgMGHELIOSEwICQ4OyA8JWs/IS4hLTUjOjt9Cio4GicyOiAcJjwnGCwvIiohDjctLiI2JjE=";
    public Function0<Unit> LLIZ;
    public int LLIZLLLIL;
    public boolean LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 255));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 253));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 254));

    @Override // X.InterfaceC1391170mJ1
    public final boolean Hb() {
        return false;
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
    }

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        return false;
    }

    @Override // X.InterfaceC1391170mJ1
    public final View MH() {
        ViewGroup viewGroup;
        View view = (View) this.LLJI.getValue();
        if (view == null) {
            return null;
        }
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(view, viewGroup);
        }
        Context context = getContext();
        if (context == null) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        layoutParams.setMargins(iLIZIZ, 0, iLIZIZ, 0);
        frameLayout.setPadding(0, 0, 0, iLIZIZ);
        C786410Ut5.a6(frameLayout, layoutParams);
        frameLayout.addView(view);
        SR(this.LLIZLLLIL, this.LLJ);
        return frameLayout;
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
        C197039127h c197039127h = (C197039127h) this.LLJI.getValue();
        if (c197039127h == null) {
            return;
        }
        if (f <= 0.0f) {
            C786410Ut5.ud(c197039127h, (-f) * C418440Gaw.LIZIZ(230));
        } else {
            if (c197039127h.getTranslationY() == 0.0f) {
                return;
            }
            C786410Ut5.ud(c197039127h, 0.0f);
        }
    }

    public final void SR(int i, boolean z) {
        int i2;
        boolean z2;
        C197039127h c197039127h = (C197039127h) this.LLJI.getValue();
        if (c197039127h == null) {
            return;
        }
        if (i > 0) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, c197039127h);
        if (i > 0 && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        c197039127h.setEnabled(z2);
        c197039127h.setLoading(z);
        if (i > 0) {
            c197039127h.setText(getResources().getQuantityString(2131755227, i, Integer.valueOf(i)));
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        boolean z = true;
        if (((String) this.LLJIJIL.getValue()).length() == 0) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(this, C343970De7.LIZ);
            return;
        }
        C054G c054g = C05O6.LIZ;
        String str2 = (String) this.LLJIJIL.getValue();
        if (str2.length() != 0) {
            z = false;
        }
        if (!z) {
            C23250099c.LIZLLL(C05O6.LIZ, null, null, new C1497305tb(str2, null), 3);
        }
        C723850SaN.LIZ(this, false, null, new AwS368S0200000_2(this, view, 34), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ch3, viewGroup, false);
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
