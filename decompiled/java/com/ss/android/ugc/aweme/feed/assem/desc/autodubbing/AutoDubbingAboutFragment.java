package com.ss.android.ugc.aweme.feed.assem.desc.autodubbing;

import X.C098200Yq;
import X.C0DV7;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20600815jK;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC836760Ws6;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC836760Ws6
public final class AutoDubbingAboutFragment extends BaseFragment {
    public static final List<Pair<Integer, Integer>> LLJIJIL = C1697810uHb.LJIIJJI(new Pair(2131826841, 2131826837), new Pair(2131826842, 2131826838), new Pair(2131826843, 2131826839), new Pair(2131826844, 2131826840));
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiMpLCt9KTY/LCJ9LCA/HELIOSKmEyPTEjLToxKiwiLmESPTEjDToxKiwiLg4xJzA4Dz0yLygpJzs=";
    public Integer LLIZ = 0;
    public Integer LLIZLLLIL = 0;
    public TuxNavBar LLJ;
    public ViewOnAttachStateChangeListenerC20604515jv LLJI;

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        NR(AFwS232S0000000_4.get$arr$(32));
        super.onCreate(bundle);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer numLIZJ;
        Integer numLIZJ2;
        C20600815jK<InterfaceC1891350zJl> state;
        Activity activity;
        Window window;
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null) {
            numLIZJ = C1308910kAL.LIZJ(R.attr.zm, context);
        } else {
            numLIZJ = null;
        }
        this.LLIZ = numLIZJ;
        Context context2 = getContext();
        if (context2 != null) {
            numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, context2);
        } else {
            numLIZJ2 = null;
        }
        this.LLIZLLLIL = numLIZJ2;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJI;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(AboutPageTextCell.class);
        }
        Integer num = this.LLIZ;
        if (num != null) {
            final int iIntValue = num.intValue();
            view.setBackgroundColor(iIntValue);
            Context context3 = view.getContext();
            if ((context3 instanceof C19EG) && (activity = (Activity) context3) != null && (window = activity.getWindow()) != null) {
                try {
                    window.setNavigationBarColor(iIntValue);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                View decorView = window.getDecorView();
                if ((decorView instanceof ViewGroup) && decorView != null) {
                    decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: X.0DSF
                        @Override // android.view.View.OnApplyWindowInsetsListener
                        public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                            view2.setBackground(new ColorDrawable(iIntValue));
                            return windowInsets;
                        }
                    });
                }
            }
        }
        TuxNavBar tuxNavBar = this.LLJ;
        if (tuxNavBar != null) {
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS548S0100000_4(this, 438));
            tuxNavBar.LIZIZ(c1251150ifB);
        }
        TuxNavBar tuxNavBar2 = this.LLJ;
        if (tuxNavBar2 != null) {
            tuxNavBar2.LJIIZILJ(false);
        }
        Integer num2 = this.LLIZ;
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            TuxNavBar tuxNavBar3 = this.LLJ;
            if (tuxNavBar3 != null) {
                tuxNavBar3.setNavBackground(iIntValue2);
            }
        }
        Context context4 = getContext();
        if (context4 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C0DV7(context4.getString(2131826845), 12, this.LLIZLLLIL, this.LLIZ, 56));
            for (Pair<Integer, Integer> pair : LLJIJIL) {
                arrayList.add(new C0DV7(context4.getString(pair.getFirst().intValue()), 22, this.LLIZLLLIL, context4.getString(pair.getSecond().intValue()), 111, this.LLIZLLLIL, this.LLIZ));
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJI;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
                state.LJIILL(arrayList, null);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.s1, viewGroup, false);
        this.LLJ = (TuxNavBar) viewTd.findViewById(R.id.y1z);
        this.LLJI = (ViewOnAttachStateChangeListenerC20604515jv) viewTd.findViewById(R.id.uxe);
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }
}
