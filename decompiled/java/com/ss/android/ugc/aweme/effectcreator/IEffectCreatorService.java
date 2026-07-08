package com.ss.android.ugc.aweme.effectcreator;

import X.C0WJP;
import X.C1737170vJ5;
import X.InterfaceC1399520mWU;
import X.InterfaceC1637200shq;
import X.InterfaceC1737080vIw;
import X.InterfaceC1737300vJI;
import X.InterfaceC1737650vJr;
import X.InterfaceC318260Cdk;
import com.bytedance.effectcreatormobile.ckeapi.api.IShare;
import com.ss.android.ugc.aweme.effectcreator.protocol.IAIEffectEntranceService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AwS370S0200000_4;

/* JADX INFO: loaded from: classes27.dex */
public interface IEffectCreatorService {
    void LIZ(C1737170vJ5 c1737170vJ5, AwS370S0200000_4 awS370S0200000_4);

    C0WJP LIZIZ();

    InterfaceC1737650vJr LIZJ();

    InterfaceC1737080vIw LIZLLL();

    InterfaceC1399520mWU LJ();

    IAIEffectEntranceService LJFF();

    boolean LJI(Effect effect);

    InterfaceC1737300vJI LJII();

    InterfaceC318260Cdk draftService();

    IShare getShareService();

    InterfaceC1637200shq preloadService();
}
