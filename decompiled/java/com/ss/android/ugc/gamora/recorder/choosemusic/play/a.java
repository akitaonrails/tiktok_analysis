package com.ss.android.ugc.gamora.recorder.choosemusic.play;

import X.C09R3;
import X.C13LE;
import X.C1647390syH;
import X.C1649510t1h;
import X.C1652790t6z;
import X.C1664770tQJ;
import X.C1DRG;
import X.C2217381BqS;
import X.C385670FAf;
import X.C539900LFk;
import X.InterfaceC1638550sk1;
import X.InterfaceC1647420syK;
import X.InterfaceC1648020szI;
import X.InterfaceC1652190t61;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import Y.AObjectS246S0100000_25;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class a extends C1652790t6z {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public static final int LLJL;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(a.class, "recordPermissionUIApiComponent", "getRecordPermissionUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(a.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(a.class, "playApiComponent", "getPlayApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(a.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(a.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        c09r3.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLJL = 8;
    }

    private final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLJJL.getValue(this, LLJJLIIIJLLLLLLLZ[4]);
    }

    private final InterfaceC1638550sk1 gq() {
        return (InterfaceC1638550sk1) this.LLJJJJ.getValue(this, LLJJLIIIJLLLLLLLZ[1]);
    }

    private final com.ss.android.ugc.aweme.shortvideo.component.a q3() {
        return (com.ss.android.ugc.aweme.shortvideo.component.a) this.LLJJJJJIL.getValue(this, LLJJLIIIJLLLLLLLZ[2]);
    }

    public final InterfaceC1648020szI Op() {
        return (InterfaceC1648020szI) this.LLJJJJLIIL.getValue(this, LLJJLIIIJLLLLLLLZ[3]);
    }

    public final InterfaceC1652190t61 v3() {
        return (InterfaceC1652190t61) this.LLJJJIL.getValue(this, LLJJLIIIJLLLLLLLZ[0]);
    }

    @Override // X.C1652790t6z
    public boolean c3() {
        C385670FAf<Boolean> c385670FAfL00;
        InterfaceC1652190t61 interfaceC1652190t61V3 = v3();
        if (interfaceC1652190t61V3 == null || (c385670FAfL00 = interfaceC1652190t61V3.L00()) == null) {
            return false;
        }
        return Intrinsics.LJFF(c385670FAfL00.LIZJ(), Boolean.TRUE);
    }

    @Override // X.C1652790t6z, X.AbstractC2255721DQs
    public void onCreate() {
        C385670FAf<C1647390syH> bottomTabIndexChangeEvent;
        C385670FAf<C1649510t1h> c385670FAfQw1;
        C385670FAf<String> c385670FAfJP0;
        super.onCreate();
        getRecordAdapterApi().BT0(this);
        if (G2()) {
            return;
        }
        InterfaceC1638550sk1 interfaceC1638550sk1Gq = gq();
        if (interfaceC1638550sk1Gq != null && (c385670FAfJP0 = interfaceC1638550sk1Gq.jP0()) != null) {
            c385670FAfJP0.LIZ(this, new AObjectS246S0100000_25(this, 412));
        }
        com.ss.android.ugc.aweme.shortvideo.component.a aVarQ3 = q3();
        if (aVarQ3 != null && (c385670FAfQw1 = aVarQ3.Qw1()) != null) {
            c385670FAfQw1.LIZ(this, new AObjectS246S0100000_25(this, 413));
        }
        InterfaceC1648020szI interfaceC1648020szIOp = Op();
        if (interfaceC1648020szIOp == null || (bottomTabIndexChangeEvent = interfaceC1648020szIOp.getBottomTabIndexChangeEvent()) == null) {
            return;
        }
        bottomTabIndexChangeEvent.LIZ(this, new AObjectS246S0100000_25(this, 414));
    }

    @Override // X.C1652790t6z, X.AbstractC2255721DQs
    public void onDestroy() {
        getRecordAdapterApi().BT0(null);
        super.onDestroy();
    }

    @Override // X.C1652790t6z
    public boolean m3(Effect effect) {
        if (C539900LFk.LJIIIIZZ(this.LLILZLL)) {
            return false;
        }
        return super.m3(effect);
    }

    public a(C1DRG c1drg, boolean z) {
        super(c1drg, z);
        this.LLJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1652190t61.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1638550sk1.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.component.a.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1648020szI.class, null);
        this.LLJJL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647420syK.class, null);
    }

    public final boolean B3(C1647390syH c1647390syH, String str) {
        if (!TextUtils.equals((CharSequence) c1647390syH.LIZ, str) && TextUtils.equals((CharSequence) c1647390syH.LIZIZ, str)) {
            return true;
        }
        return false;
    }
}
