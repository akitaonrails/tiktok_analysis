package com.ss.android.ugc.aweme.im.strategy.storage.adapters;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakGeckoLoadStrategy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class StreakGeckoLoadStrategyTypeAdapter extends TypeAdapter<StreakGeckoLoadStrategy> {
    @Override // com.google.gson.TypeAdapter
    public final StreakGeckoLoadStrategy read(C09CU c09cu) {
        c09cu.LIZIZ();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "streak_cold_start")) {
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                } else {
                    arrayList = new ArrayList();
                    c09cu.LIZ();
                    while (c09cu.LJIIZILJ()) {
                        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                            c09cu.LJJJJJL();
                            arrayList.add(null);
                        } else {
                            arrayList.add(c09cu.LJJJZ());
                        }
                    }
                    c09cu.LJI();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "streak_show_lazy_load")) {
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                } else {
                    arrayList2 = new ArrayList();
                    c09cu.LIZ();
                    while (c09cu.LJIIZILJ()) {
                        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                            c09cu.LJJJJJL();
                            arrayList2.add(null);
                        } else {
                            arrayList2.add(c09cu.LJJJZ());
                        }
                    }
                    c09cu.LJI();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return new StreakGeckoLoadStrategy(arrayList, arrayList2);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, StreakGeckoLoadStrategy streakGeckoLoadStrategy) {
        StreakGeckoLoadStrategy streakGeckoLoadStrategy2 = streakGeckoLoadStrategy;
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("streak_cold_start");
        if (streakGeckoLoadStrategy2.coldStartLoadChannel == null) {
            c09dl.LJIJJ();
        } else {
            c09dl.LIZIZ();
            List<String> list = streakGeckoLoadStrategy2.coldStartLoadChannel;
            if (list != null) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    c09dl.LJJJJJ(it2.next());
                }
            }
            c09dl.LJI();
        }
        c09dl.LJIILLIIL("streak_show_lazy_load");
        if (streakGeckoLoadStrategy2.lazyLoadChannel == null) {
            c09dl.LJIJJ();
        } else {
            c09dl.LIZIZ();
            List<String> list2 = streakGeckoLoadStrategy2.lazyLoadChannel;
            if (list2 != null) {
                Iterator<String> it3 = list2.iterator();
                while (it3.hasNext()) {
                    c09dl.LJJJJJ(it3.next());
                }
            }
            c09dl.LJI();
        }
        c09dl.LJII();
    }
}
