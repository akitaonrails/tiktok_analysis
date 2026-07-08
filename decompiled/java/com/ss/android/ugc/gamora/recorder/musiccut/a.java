package com.ss.android.ugc.gamora.recorder.musiccut;

import X.C13LE;
import X.C1652840t74;
import X.C1664770tQJ;
import X.C19A3;
import X.C1DRG;
import X.C2217381BqS;
import X.C385670FAf;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import Y.AObjectS246S0100000_25;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.x2;
import kotlin.Pair;

/* JADX INFO: loaded from: classes26.dex */
public final class a extends C1652840t74 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public static final int LLJJJ;
    public final InterfaceC1731706qJ LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(a.class, "planCUiApiComponent", "getPlanCUiApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJ = 8;
    }

    private final com.ss.android.ugc.aweme.shortvideo.component.a v3() {
        return (com.ss.android.ugc.aweme.shortvideo.component.a) this.LLJJIJIIJIL.getValue(this, LLJJIJIL[0]);
    }

    @Override // X.C1652840t74
    public void T2() {
        C19A3 c19a3 = this.LL;
        if (!(c19a3 instanceof x2) || c19a3 == null) {
            return;
        }
        super.T2();
    }

    @Override // X.C1652840t74, X.AbstractC2255721DQs
    public void onCreate() {
        C385670FAf<Pair<Long, AVMusic>> c385670FAfEy;
        C385670FAf<Boolean> c385670FAfV10;
        super.onCreate();
        com.ss.android.ugc.aweme.shortvideo.component.a aVarV3 = v3();
        if (aVarV3 != null && (c385670FAfV10 = aVarV3.V10()) != null) {
            c385670FAfV10.LIZ(this, new AObjectS246S0100000_25(this, 461));
        }
        com.ss.android.ugc.aweme.shortvideo.component.a aVarV32 = v3();
        if (aVarV32 == null || (c385670FAfEy = aVarV32.ey()) == null) {
            return;
        }
        c385670FAfEy.LIZ(this, new AObjectS246S0100000_25(this, 462));
    }

    public a(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.component.a.class, null);
    }
}
