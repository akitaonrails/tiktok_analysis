package com.ss.android.ugc.aweme.im.streak.impl.psp;

import X.C06C6;
import X.C06F4;
import X.C06F5;
import X.C06FA;
import X.C06FO;
import X.C06GE;
import X.C0GYY;
import X.C13BV;
import X.C1567806Bw;
import X.C1603906Pt;
import X.C354710DvR;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.streak.api.IStreakPSPContextProvider;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import com.ss.android.ugc.aweme.im.streak.impl.datasource.StreakServerDataSource;
import com.ss.android.ugc.aweme.im.streak.impl.exp.FakeWritingConfig;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.jvm.internal.AwS46S0000100_2;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakPSPContextProvider implements IStreakPSPContextProvider {
    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakPSPContextProvider
    public final int LIZ() {
        FakeWritingConfig fakeWritingConfig = C06GE.LIZ;
        return C06GE.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakPSPContextProvider
    public final int LIZJ() {
        FakeWritingConfig fakeWritingConfig = C06GE.LIZ;
        return C06GE.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakPSPContextProvider
    public final List<Integer> LIZIZ() {
        return C1603906Pt.LIZIZ().tuxSmallIconLevelList;
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakPSPContextProvider
    public final StreakData LIZLLL(String str) {
        C06F5.LIZ.getClass();
        C06F4.LIZIZ.LJ.getClass();
        return C06FA.LJFF(str, true);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakPSPContextProvider
    public final StreakPetData LJ(String str) {
        C06C6.LIZIZ.getClass();
        return C06C6.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakPSPContextProvider
    public final long LJFF(StreakData streakData) {
        return C1567806Bw.LIZ(streakData);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakPSPContextProvider
    public final StreakData LJII(String str) {
        C06F5.LIZ.getClass();
        C06F4.LIZIZ.LJFF.getClass();
        return StreakServerDataSource.LJFF(str);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakPSPContextProvider
    public final List<Long> LJI(StreakData streakData, boolean z) {
        String id;
        List<Long> list;
        if (z) {
            if (streakData == null || (list = streakData.dayBeginArray) == null) {
                return C13BV.INSTANCE;
            }
            return list;
        }
        if (streakData != null) {
            id = streakData.timeZoneId;
        } else {
            id = null;
        }
        ArrayList arrayList = new ArrayList();
        int i = C06GE.LIZJ;
        long jLJI = C1567806Bw.LJI();
        if (id == null && (id = Calendar.getInstance().getTimeZone().getID()) == null) {
            id = "";
        }
        int i2 = -2;
        int iLIZ = C0GYY.LIZ(-2, i, 2);
        if (-2 <= iLIZ) {
            while (true) {
                C06FO c06fo = C06FO.LIZ;
                AwS46S0000100_2 awS46S0000100_2 = new AwS46S0000100_2(jLJI, 6);
                c06fo.getClass();
                C354710DvR c354710DvRLIZJ = C06FO.LIZJ(id, -i2, awS46S0000100_2);
                ListProtector.add(arrayList, 0, Long.valueOf(c354710DvRLIZJ.LLILLJJLI));
                ListProtector.add(arrayList, 0, Long.valueOf(c354710DvRLIZJ.LL));
                if (i2 == iLIZ) {
                    break;
                }
                i2 += 2;
            }
        }
        if (i % 2 != 0) {
            return arrayList;
        }
        ListProtector.remove(arrayList, 0);
        return arrayList;
    }
}
