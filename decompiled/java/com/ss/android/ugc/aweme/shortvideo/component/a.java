package com.ss.android.ugc.aweme.shortvideo.component;

import X.C0FTJ;
import X.C1648670t0L;
import X.C1649510t1h;
import X.C385670FAf;
import X.C443120HZe;
import X.EnumC1466150oFx;
import X.InterfaceC1647890sz5;
import android.content.Intent;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public interface a extends InterfaceC1647890sz5 {
    C385670FAf<C1648670t0L> A71();

    C385670FAf<Pair<Integer, Boolean>> Ap1();

    void CB(C1649510t1h c1649510t1h);

    C385670FAf<Float> Cg1();

    C385670FAf<Boolean> E21();

    LiveEvent<Boolean> Ek();

    LiveEvent<Boolean> FU0();

    void GN1(boolean z);

    boolean HF1();

    void Jy2(Effect effect);

    void L02(boolean z);

    boolean LJ2();

    LiveEvent<C443120HZe<Integer, Integer, Intent>> LLZIL();

    LiveEvent<Effect> O50();

    void Ok1(C1648670t0L c1648670t0L);

    void Q42();

    LiveEvent<Unit> QU1();

    C385670FAf<Boolean> Qf1();

    C385670FAf<C1649510t1h> Qw1();

    void RV1();

    C385670FAf<Float> US();

    C385670FAf<Boolean> V10();

    void VT0(Function1<? super EnumC1466150oFx, ? extends List<? extends C0FTJ<? extends StickerModel>>> function1);

    LiveEvent<Boolean> WU();

    Function1<Function0<Unit>, Unit> X80();

    C385670FAf<e> YQ0();

    void Z22();

    LiveEvent<Unit> Z40();

    boolean ZB0();

    void aS1(boolean z);

    void bP1(boolean z);

    void be1(Function1<? super Function0<Unit>, Unit> function1);

    void eP2(boolean z);

    C385670FAf<Pair<Long, AVMusic>> ey();

    void gH0(long j, AVMusic aVMusic);

    C385670FAf<Boolean> gw0();

    Function1<EnumC1466150oFx, List<C0FTJ<StickerModel>>> kO();

    void mC(e eVar);

    LiveEvent<Unit> nS();

    void oL1();

    void onActivityResult(int i, int i2, Intent intent);

    LiveEvent<Unit> sF1();

    Boolean t92();

    void uL(int i, boolean z);

    void uj(boolean z);

    void yr2(boolean z);
}
