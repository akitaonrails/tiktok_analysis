package com.bytedance.android.livesdk.game.broadcast.fragment;

import X.AbstractC480450Isl;
import X.C01GW;
import X.C098200Yq;
import X.C0J1N;
import X.C0TDF;
import X.C0TDQ;
import X.C11RD;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C19U1;
import X.C20337914i1;
import X.C20441214yg;
import X.C2188811AlT;
import X.C452501pT;
import X.C475510Ikn;
import X.C748890TZf;
import X.C786410Ut5;
import X.InterfaceC772390URp;
import Y.AfS181S0100000_12;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class GameDualDevicePositionFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExOiotLSwyHELIOSOzFiLz0yLygpJzt9DyQhLAsmKSkILDk6KyAcJjw6PCwjJwkhKSIhLCEn";
    public final C01GW LL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(119));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(118));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 249));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 248));
    public ViewPager LLILZIL;

    public final boolean NR() {
        return ((Boolean) this.LLILLL.getValue()).booleanValue();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C20337914i1<Integer> c20337914i1;
        super.onViewCreated(view, bundle);
        if (NR()) {
            c20337914i1 = InterfaceC772390URp.c0;
        } else {
            c20337914i1 = InterfaceC772390URp.d0;
        }
        Integer numLIZIZ = c20337914i1.LIZIZ();
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.SX0(C748890TZf.class, numLIZIZ);
        }
        C19U1 c19u1 = (C19U1) view.findViewById(R.id.yqv);
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.yqw);
        if (viewPager != null) {
            final FragmentManager childFragmentManager = getChildFragmentManager();
            boolean zNR = NR();
            boolean zNR2 = NR();
            GameDualDevicePositionPreviewFragment gameDualDevicePositionPreviewFragment = new GameDualDevicePositionPreviewFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("is_landscape", zNR2);
            gameDualDevicePositionPreviewFragment.setArguments(bundle2);
            final List listLJIILJJIL = C1697810uHb.LJIILJJIL(C0TDQ.LIZ((String) this.LLILZ.getValue(), zNR, false), gameDualDevicePositionPreviewFragment);
            final List listLJIILJJIL2 = C1697810uHb.LJIILJJIL(getString(2131843002), getString(2131843004));
            viewPager.setAdapter(new AbstractC480450Isl(childFragmentManager, listLJIILJJIL, listLJIILJJIL2) { // from class: X.0TDW
                public final List<Fragment> LLJ;
                public final List<String> LLJI;

                @Override // androidx.viewpager.widget.PagerAdapter
                public final int getCount() {
                    return this.LLJ.size();
                }

                @Override // androidx.viewpager.widget.PagerAdapter
                public final CharSequence LJIJJLI(int i) {
                    return (CharSequence) ListProtector.get(this.LLJI, i);
                }

                @Override // X.AbstractC480450Isl
                public final Fragment LJJIJIL(int i) {
                    return (Fragment) ListProtector.get(this.LLJ, i);
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.LLJ = listLJIILJJIL;
                    this.LLJI = listLJIILJJIL2;
                }
            });
        } else {
            viewPager = null;
        }
        this.LLILZIL = viewPager;
        c19u1.setupWithViewPager(this.LLILZIL, false);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isLandscape = ");
        sbLIZ.append(NR());
        C20441214yg.LJIIIZ("GameDualDevicePositionFragment", C2188811AlT.LIZIZ(sbLIZ));
        ((C0J1N) C0TDF.LIZJ().LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZLLL(this))).LIZJ(new AfS181S0100000_12(this, 11));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gi8, viewGroup, false);
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
