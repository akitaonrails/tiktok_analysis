package com.ss.android.ugc.aweme.series.feed.mylist.assme.opt;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C1220000hqw;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13LE;
import X.C1559090qfr;
import X.C1559260qg8;
import X.C1573670r3N;
import X.C1574470r4f;
import X.C1620670sHB;
import X.C1845940y8W;
import X.C1846060y8i;
import X.C19EG;
import X.C20632315oP;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736950SvV;
import X.EnumC1574490r4h;
import X.InterfaceC1846110y8n;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.series.feed.model.MyListSceneEnum;
import com.ss.android.ugc.aweme.series.feed.mylist.assme.opt.SeriesHistorySubPageFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesYourListsMainPageAssem extends UIContentAssem {
    public final C736950SvV LLIZLLLIL;
    public TuxNavBar LLJ;
    public C1846060y8i LLJI;
    public C20632315oP LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C1559260qg8 LLJJ;

    public SeriesYourListsMainPageAssem() {
        AFwS213S0000000_24 aFwS213S0000000_24 = AFwS213S0000000_24.get$arr$(282);
        this.LLIZLLLIL = new C736950SvV(C13LE.LIZ(SeriesHistoryMainPageViewModel.class), aFwS213S0000000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(288), new AwS568S0100000_24((AbstractC738140SxQ) this, 937), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 934));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 933));
        this.LLJILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 936));
        this.LLJJ = new C1559260qg8(new C723580SZw(this, C1559090qfr.class, "history_list_key"), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Map<EnumC1574490r4h, Map<String, Aweme>> map = C1574470r4f.LIZ;
        C1574470r4f.LIZLLL(EnumC1574490r4h.SERIES_MYLIST);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        String string;
        super.onViewCreated(view);
        C20632315oP c20632315oP = (C20632315oP) view.findViewById(R.id.your_lists_view_pager);
        this.LLJIJIL = c20632315oP;
        if (c20632315oP != null) {
            c20632315oP.LIZIZ(new C1620670sHB(this, 1));
        }
        this.LLJ = (TuxNavBar) view.findViewById(R.id.your_lists_title_bar);
        TuxNavBar tuxNavBar = this.LLJ;
        int i = 0;
        if (tuxNavBar != null) {
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS568S0100000_24(this, 935));
            tuxNavBar.LIZIZ(c1251150ifB);
            tuxNavBar.LJIIZILJ(false);
            C1250250idj c1250250idj = new C1250250idj();
            Context context = tuxNavBar.getContext();
            if (context == null || (string = context.getString(2131839421)) == null) {
                string = "";
            }
            c1250250idj.LIZJ = string;
            tuxNavBar.LJIJJ(c1250250idj);
        }
        this.LLJI = (C1846060y8i) view.findViewById(R.id.your_lists_tab);
        if (getContext() != null) {
            C1846060y8i c1846060y8i = this.LLJI;
            if (c1846060y8i != null) {
                C1845940y8W c1845940y8WLJIIIZ = c1846060y8i.LJIIIZ();
                c1845940y8WLJIIIZ.LIZIZ((String) this.LLJILJIL.getValue());
                c1846060y8i.LIZIZ(c1845940y8WLJIIIZ, c1846060y8i.LLILZLL.size(), c1846060y8i.LLILZLL.isEmpty());
                C1845940y8W c1845940y8WLJIIIZ2 = c1846060y8i.LJIIIZ();
                c1845940y8WLJIIIZ2.LIZIZ((String) this.LLJILJILJ.getValue());
                c1846060y8i.LIZIZ(c1845940y8WLJIIIZ2, c1846060y8i.LLILZLL.size(), c1846060y8i.LLILZLL.isEmpty());
                C1845940y8W c1845940y8WLJIIIZ3 = c1846060y8i.LJIIIZ();
                c1845940y8WLJIIIZ3.LIZIZ((String) this.LLJILLL.getValue());
                c1846060y8i.LIZIZ(c1845940y8WLJIIIZ3, c1846060y8i.LLILZLL.size(), c1846060y8i.LLILZLL.isEmpty());
                c1846060y8i.LJIJJLI(true);
            }
            C1846060y8i c1846060y8i2 = this.LLJI;
            if (c1846060y8i2 != null) {
                c1846060y8i2.LIZ(new InterfaceC1846110y8n() { // from class: X.0r3u
                    @Override // X.InterfaceC1846110y8n
                    public final void LIZ(C1845940y8W c1845940y8W) {
                    }

                    @Override // X.InterfaceC1846110y8n
                    public final void LIZJ(C1845940y8W c1845940y8W) {
                    }

                    @Override // X.InterfaceC1846110y8n
                    public final void LIZIZ(C1845940y8W c1845940y8W) {
                        C20632315oP c20632315oP2 = this.LIZ.LLJIJIL;
                        if (c20632315oP2 != null) {
                            c20632315oP2.LJ(c1845940y8W.LIZLLL, true);
                        }
                    }
                });
            }
        }
        final C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C20632315oP c20632315oP2 = this.LLJIJIL;
            if (c20632315oP2 != null) {
                c20632315oP2.setOffscreenPageLimit(1);
            }
            C20632315oP c20632315oP3 = this.LLJIJIL;
            if (c20632315oP3 != null) {
                c20632315oP3.setAdapter(new FragmentStateAdapter(c19egLIZ) { // from class: X.0qyM
                    public final Map<Integer, SeriesHistorySubPageFragment> LLJI = new LinkedHashMap();

                    @Override // X.AbstractC21673619ry
                    public final int getItemCount() {
                        return 3;
                    }

                    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
                    public final Fragment LLLII(int i2) {
                        Fragment fragment = (Fragment) ((LinkedHashMap) this.LLJI).get(Integer.valueOf(i2));
                        if (fragment == null) {
                            SeriesHistorySubPageFragment seriesHistorySubPageFragment = new SeriesHistorySubPageFragment();
                            Bundle bundle = new Bundle();
                            bundle.putInt("position", i2);
                            seriesHistorySubPageFragment.setArguments(bundle);
                            this.LLJI.put(Integer.valueOf(i2), seriesHistorySubPageFragment);
                            return seriesHistorySubPageFragment;
                        }
                        return fragment;
                    }
                });
            }
            C20632315oP c20632315oP4 = this.LLJIJIL;
            if (c20632315oP4 != null) {
                C1573670r3N c1573670r3N = MyListSceneEnum.Companion;
                C1559090qfr c1559090qfr = (C1559090qfr) this.LLJJ.getValue();
                if (c1559090qfr == null || (str = c1559090qfr.LLILLL) == null) {
                    str = "1";
                }
                c1573670r3N.getClass();
                MyListSceneEnum[] myListSceneEnumArr = MyListSceneEnum.VALUES;
                int length = myListSceneEnumArr.length;
                while (true) {
                    if (i < length) {
                        if (Intrinsics.LJFF(myListSceneEnumArr[i].getValue(), str)) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                c20632315oP4.setCurrentItem(i);
            }
        }
    }
}
