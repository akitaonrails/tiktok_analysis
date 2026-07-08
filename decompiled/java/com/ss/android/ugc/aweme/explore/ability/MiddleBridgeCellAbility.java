package com.ss.android.ugc.aweme.explore.ability;

import X.C1086520eNe;
import X.C15T5;
import X.C15VE;
import X.C20526015Tm;
import X.InterfaceC494301wD;
import android.view.ViewGroup;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.explore.ExploreFeedParams;
import com.ss.android.ugc.aweme.explore.ExploreLynxParams;
import com.ss.android.ugc.aweme.explore.assem.ExploreFeedCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import kotlin.jvm.internal.AwS412S0200000_11;

/* JADX INFO: loaded from: classes32.dex */
public interface MiddleBridgeCellAbility extends InterfaceC494301wD {
    void Dt2(int i);

    void E62(ExploreFeedParams exploreFeedParams);

    void FI(SmartRoute smartRoute);

    void Fh0(C20526015Tm c20526015Tm, ViewGroup viewGroup, ExploreFeedCell exploreFeedCell);

    void Gs2(C15T5 c15t5);

    void H00();

    void LD2();

    boolean LJJIIJZLJL();

    Map<String, String> Ln(String str);

    void Vq1();

    void ck1(String str, AwS412S0200000_11 awS412S0200000_11);

    String getEnterFrom();

    Aweme gt();

    C1086520eNe lP2();

    boolean pJ2();

    void rh1(ExploreLynxParams exploreLynxParams);

    void tw2();

    void wY1(long j, String str);

    C15VE xm();
}
