package com.ss.android.ugc.aweme.choosemusic.fragment;

import X.C098200Yq;
import X.C0OM1;
import X.C0RD4;
import X.C1237450iJ5;
import X.C12ES;
import X.C15GJ;
import X.C15O7;
import X.C1685300txQ;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C189200o6;
import X.C1893080zMY;
import X.C19EG;
import X.C19GS;
import X.C19Y3;
import X.C20448414zq;
import X.C204594153w;
import X.C21594419fC;
import X.C786410Ut5;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class SecondLevelMusicFragment extends AmeBaseFragment implements Observer<C0RD4> {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYkJiAgLSg5OiYwHELIOSZiM+KCg+LSs4Zxw2KyoiLQM2PiAgBDogISYKOy40JSAiPQ==";
    public C19Y3 LL;
    public C21594419fC LLILLJJLI;
    public C1749280vcc LLILLL;
    public C15GJ LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public int LLJ;
    public DataCenter LLJI;
    public C204594153w LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public long LLJJI;
    public long LLJJIII;

    public final void NR() {
        C1749280vcc c1749280vcc = this.LLILLL;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc, 0);
        C1749280vcc c1749280vcc2 = this.LLILLL;
        if (c1749280vcc2 == null) {
            c1749280vcc2 = null;
        }
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C1749280vcc c1749280vcc3 = this.LLILLL;
        C1893080zMY.LJI(c1722300uv6, (c1749280vcc3 != null ? c1749280vcc3 : null).getContext(), new AwS575S0100000_31(this, 336));
        c1749280vcc2.setStatus(c1722300uv6);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0081  */
    @Override // androidx.lifecycle.Observer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onChanged(X.C0RD4 r29) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.choosemusic.fragment.SecondLevelMusicFragment.onChanged(java.lang.Object):void");
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LLILZIL = arguments.getString("music_class_id");
            this.LLILZLL = arguments.getString("music_class_name");
            this.LLIZ = arguments.getString("music_class_enter_from");
            arguments.getBoolean("music_class_is_hot", false);
            this.LLIZLLLIL = arguments.getString("music_class_enter_method");
            this.LLJILJIL = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
            this.LLJ = arguments.getInt("music_class_level");
            this.LLJILLL = arguments.getInt("sound_page_scene", 0);
            this.LLJJI = arguments.getLong("max_video_duration", 0L);
            this.LLJJIII = arguments.getLong("shoot_video_length", 0L);
            this.LLJJ = arguments.getInt("music_discovery_type", 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object objH2;
        super.onViewCreated(view, bundle);
        C21594419fC c21594419fC = this.LLILLJJLI;
        if (c21594419fC == null) {
            c21594419fC = null;
        }
        c21594419fC.setOffscreenPageLimit(1);
        this.LLILZ = new C15GJ(getChildFragmentManager(), this.LLIZ, this.LLJILJIL, this.LLIZLLLIL);
        C19Y3 c19y3 = this.LL;
        if (c19y3 == null) {
            c19y3 = null;
        }
        c19y3.setTabMode(0);
        C19Y3 c19y32 = this.LL;
        if (c19y32 == null) {
            c19y32 = null;
        }
        c19y32.setTabMaxWidth(Integer.MAX_VALUE);
        Context context = getContext();
        if (context == null) {
            objH2 = null;
        } else {
            try {
                objH2 = C786410Ut5.H2(context, "connectivity");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ((ConnectivityManager) objH2);
        if (networkInfoLJIJ != null) {
            if (networkInfoLJIJ.isAvailable()) {
                C204594153w c204594153w = this.LLJIJIL;
                if (c204594153w != null) {
                    String str = this.LLILZIL;
                    int i = this.LLJ;
                    ChooseMusicApi.LIZ.LJII(str, 0, 30, i, this.LLJILLL).LJ(new C20448414zq(c204594153w, i), C15O7.LJIIIIZZ, null);
                    return;
                }
                return;
            }
        }
        NR();
    }

    public final void MR(int i, int i2, View view) {
        if (i != -1 || i2 != -1) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (i != -1) {
                marginLayoutParams.setMarginStart(i);
            }
            if (i2 != -1) {
                marginLayoutParams.setMarginEnd(i2);
            }
            C786410Ut5.W5(view, marginLayoutParams);
            view.invalidate();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c9m, viewGroup, false);
        this.LL = (C19Y3) viewTd.findViewById(R.id.ugw);
        this.LLILLJJLI = (C21594419fC) viewTd.findViewById(R.id.ugz);
        this.LLILLL = (C1749280vcc) viewTd.findViewById(R.id.owc);
        TuxNavBar tuxNavBar = (TuxNavBar) viewTd.findViewById(R.id.y08);
        C19GS c19gs = null;
        if (tuxNavBar == null) {
            tuxNavBar = null;
        }
        C0OM1 c0om1 = new C0OM1();
        String str = this.LLILZLL;
        if (str == null) {
            str = "";
        }
        C1237450iJ5.LIZIZ(c0om1, str, new AwS575S0100000_31(this, 1510));
        c0om1.LIZLLL = false;
        tuxNavBar.setNavActions(c0om1);
        C1749280vcc c1749280vcc = this.LLILLL;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc, 0);
        C1749280vcc c1749280vcc2 = this.LLILLL;
        if (c1749280vcc2 == null) {
            c1749280vcc2 = null;
        }
        c1749280vcc2.LJ();
        this.LLJILJILJ = (int) C12ES.LIZJ(16.0f, getActivity());
        if (this.LLJI == null) {
            this.LLJI = DataCenter.vQ2(ViewModelProviders.of(this), this);
        }
        DataCenter dataCenter = this.LLJI;
        if (dataCenter != null) {
            dataCenter.yQ2("status_second_level_music_list", this, false);
        }
        DataCenter dataCenter2 = this.LLJI;
        if (dataCenter2 != null) {
            dataCenter2.yQ2("second_level_music_list", this, false);
        }
        this.LLJIJIL = new C204594153w(getContext(), this.LLJI);
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
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
