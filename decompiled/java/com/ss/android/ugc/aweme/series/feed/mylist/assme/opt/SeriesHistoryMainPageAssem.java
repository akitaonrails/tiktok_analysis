package com.ss.android.ugc.aweme.series.feed.mylist.assme.opt;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C1220000hqw;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13LE;
import X.C1559090qfr;
import X.C1559260qg8;
import X.C1573610r3H;
import X.C1573670r3N;
import X.C1573990r3t;
import X.C1574470r4f;
import X.C1578940rBs;
import X.C1578990rBx;
import X.C1620670sHB;
import X.C1697810uHb;
import X.C1954807lC;
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
import X.EnumC1579060rC4;
import X.InterfaceC1573860r3g;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.series.feed.model.MyListSceneEnum;
import com.ss.android.ugc.aweme.series.feed.mylist.assme.opt.SeriesHistoryMainPageAssem;
import com.ss.android.ugc.aweme.series.feed.mylist.assme.opt.SeriesHistoryMainPageViewModel;
import com.ss.android.ugc.aweme.series.feed.mylist.assme.opt.SeriesHistorySubPageFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesHistoryMainPageAssem extends UIContentAssem {
    public final C736950SvV LLIZLLLIL;
    public TuxNavBar LLJ;
    public C1578940rBs LLJI;
    public C20632315oP LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C1559260qg8 LLJILLL;

    public SeriesHistoryMainPageAssem() {
        AFwS213S0000000_24 aFwS213S0000000_24 = AFwS213S0000000_24.get$arr$(275);
        this.LLIZLLLIL = new C736950SvV(C13LE.LIZ(SeriesHistoryMainPageViewModel.class), aFwS213S0000000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(284), new AwS568S0100000_24((AbstractC738140SxQ) this, 924), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 922));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 921));
        this.LLJILLL = new C1559260qg8(new C723580SZw(this, C1559090qfr.class, "history_list_key"), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Map<EnumC1574490r4h, Map<String, Aweme>> map = C1574470r4f.LIZ;
        C1574470r4f.LIZLLL(EnumC1574490r4h.SERIES_MYLIST);
    }

    public static final String Go(MyListSceneEnum myListSceneEnum) {
        int i = C1573610r3H.LIZ[myListSceneEnum.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "purchased";
                }
                throw new C1954807lC();
            }
            return "favorite";
        }
        return "history";
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        int iIntValue;
        String string;
        super.onViewCreated(view);
        C20632315oP c20632315oP = (C20632315oP) view.findViewById(R.id.jq8);
        this.LLJIJIL = c20632315oP;
        if (c20632315oP != null) {
            c20632315oP.LIZIZ(new C1620670sHB(this, 0));
        }
        this.LLJ = (TuxNavBar) view.findViewById(R.id.jq4);
        TuxNavBar tuxNavBar = this.LLJ;
        if (tuxNavBar != null) {
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS568S0100000_24(this, 923));
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
        C1578940rBs c1578940rBs = (C1578940rBs) view.findViewById(R.id.jpz);
        this.LLJI = c1578940rBs;
        c1578940rBs.setVariant(EnumC1579060rC4.CAPSULE);
        c1578940rBs.setHorizontalMargin(8);
        c1578940rBs.setWidthRule(new C1573990r3t(0));
        c1578940rBs.setFont(52);
        C1573670r3N c1573670r3N = MyListSceneEnum.Companion;
        C1559090qfr c1559090qfr = (C1559090qfr) this.LLJILLL.getValue();
        if (c1559090qfr == null || (str = c1559090qfr.LLILLL) == null) {
            str = "1";
        }
        c1573670r3N.getClass();
        MyListSceneEnum[] myListSceneEnumArr = MyListSceneEnum.VALUES;
        int length = myListSceneEnumArr.length;
        int i = 0;
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
        Integer numValueOf = Integer.valueOf(i);
        int iIntValue2 = numValueOf.intValue();
        if (iIntValue2 >= 0 && iIntValue2 < 2) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = 0;
        }
        if (getContext() != null) {
            C1578940rBs c1578940rBs2 = this.LLJI;
            if (c1578940rBs2 != null) {
                c1578940rBs2.setChips(C1697810uHb.LJIIJJI(new C1578990rBx((String) this.LLJILJIL.getValue()), new C1578990rBx((String) this.LLJILJILJ.getValue())));
            }
            C1578940rBs c1578940rBs3 = this.LLJI;
            if (c1578940rBs3 != null) {
                C1578940rBs.LIZ(c1578940rBs3, iIntValue);
            }
            C1578940rBs c1578940rBs4 = this.LLJI;
            if (c1578940rBs4 != null) {
                c1578940rBs4.setOnSelectedChangeListener(new InterfaceC1573860r3g() { // from class: X.0r3T
                    @Override // X.InterfaceC1573860r3g
                    public final void LIZ(int i2, boolean z, AbstractC1573810r3b abstractC1573810r3b) {
                        MyListSceneEnum myListSceneEnum;
                        String str2;
                        String str3;
                        if (z) {
                            C20632315oP c20632315oP2 = this.LIZ.LLJIJIL;
                            if (c20632315oP2 != null) {
                                c20632315oP2.LJ(i2, true);
                            }
                            MyListSceneEnum myListSceneEnum2 = ((C1573630r3J) ((AssemViewModel) this.LIZ.LLIZLLLIL.getValue()).getState()).LL;
                            if (i2 == 0) {
                                myListSceneEnum = MyListSceneEnum.MY_LIST_SCENE_COLLECTION_HISTORY;
                            } else {
                                myListSceneEnum = MyListSceneEnum.MY_LIST_SCENE_COLLECTION_FAVOURITE;
                            }
                            SeriesHistoryMainPageAssem seriesHistoryMainPageAssem = this.LIZ;
                            if (Intrinsics.LJFF(abstractC1573810r3b, C1573820r3c.LIZ)) {
                                str2 = "click";
                            } else {
                                str2 = "slide";
                            }
                            seriesHistoryMainPageAssem.getClass();
                            if (myListSceneEnum != myListSceneEnum2) {
                                C1581520rG2 c1581520rG2 = C1581520rG2.LJI;
                                C1559090qfr c1559090qfr2 = (C1559090qfr) ((SeriesHistoryMainPageViewModel) seriesHistoryMainPageAssem.LLIZLLLIL.getValue()).LL.getValue();
                                if (c1559090qfr2 == null || (str3 = c1559090qfr2.LL) == null) {
                                    str3 = "";
                                }
                                C1611660s2e.LJJJI("series_mylist", str2, str3, SeriesHistoryMainPageAssem.Go(myListSceneEnum2), SeriesHistoryMainPageAssem.Go(myListSceneEnum), null, null);
                            }
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
                c20632315oP3.setAdapter(new FragmentStateAdapter(c19egLIZ) { // from class: X.0qyL
                    public final Map<Integer, SeriesHistorySubPageFragment> LLJI = new LinkedHashMap();

                    @Override // X.AbstractC21673619ry
                    public final int getItemCount() {
                        return 2;
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
                c20632315oP4.setCurrentItem(iIntValue);
            }
        }
    }
}
