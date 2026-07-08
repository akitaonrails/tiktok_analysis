package com.ss.android.ugc.aweme.im.streak.api.pet;

import X.AbstractC1549150qPp;
import X.C06C8;
import X.C06G9;
import X.C06H2;
import X.C08CX;
import X.C0Y8T;
import X.C1520305xJ;
import X.C1586906Jf;
import X.C1598806Nu;
import X.C19719912Dl;
import X.C19EG;
import X.EnumC1514605wO;
import android.app.Activity;
import android.os.Bundle;
import com.bytedance.im.core.common.statusmsg.BusinessCommandMessage;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface IStreakPetService {
    public static final C1586906Jf LIZ = C1586906Jf.LIZ;

    void LIZ(Map map, String str, C08CX c08cx, StreakData streakData, StreakPetData streakPetData);

    boolean LIZIZ(String str);

    StreakPetData LIZJ(String str);

    void LIZLLL(Activity activity, C06G9 c06g9, String str, String str2, String str3, C06H2 c06h2, String str4, String str5);

    C19719912Dl LJ();

    C19719912Dl LJFF();

    void LJI(int i, String str);

    boolean LJII(String str);

    C19719912Dl LJIIIIZZ();

    void LJIIIZ(String str);

    void LJIIJ(C19EG c19eg, Bundle bundle);

    void LJIIJJI(int i, String str);

    void LJIIL(C1598806Nu c1598806Nu);

    boolean LJIILIIL(String str);

    void LJIILJJIL(String str, String str2);

    void LJIILL(BusinessCommandMessage businessCommandMessage);

    boolean LJIILLIIL(String str);

    boolean LJIIZILJ(String str);

    boolean LJIJ(String str);

    String LJIJI(String str);

    void LJIJJ(BusinessCommandMessage businessCommandMessage);

    void LJIJJLI(C1598806Nu c1598806Nu);

    void LJIL(EnumC1514605wO enumC1514605wO);

    boolean LJJ(String str);

    boolean LJJI(String str);

    void LJJIFFI(C19EG c19eg, String str, String str2, String str3);

    IStreakPetEventService LJJII();

    void LJJIII(String str);

    void LJJIIJ(BusinessCommandMessage businessCommandMessage);

    void LJJIIJZLJL(C06C8 c06c8);

    boolean LJJIIZ(String str);

    void LJJIIZI(String str);

    void LJJIJ(String str, String str2, EnumC1514605wO enumC1514605wO, String str3);

    void LJJIJIIJI();

    void LJJIJIIJIL(C06C8 c06c8);

    List<Class<? extends AbstractC1549150qPp<?, ?>>> LJJIJIL();

    C1520305xJ b(C0Y8T c0y8t, String str);
}
