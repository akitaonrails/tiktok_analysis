package com.ss.android.ugc.tools.service;

import X.C01GW;
import X.C1429570nIx;
import X.C1446930nkx;
import X.C18T4;
import X.C1EP4;
import X.C1EP6;
import X.C1EP7;
import X.C1EP8;
import X.C1EP9;
import X.C1EPA;
import X.C1EPB;
import X.C1EPC;
import X.C452501pT;
import X.InterfaceC1354700lMC;
import X.InterfaceC1397450mT9;
import X.InterfaceC1429470nIn;
import X.InterfaceC21291818Ua;
import X.InterfaceC21300818Xm;
import X.InterfaceC2454409ja;
import X.InterfaceC876790YaT;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class AiChatFeatureServiceImpl implements IAiChatFeatureService {
    public static final /* synthetic */ int LJIIJ = 0;
    public final C01GW LIZ = C452501pT.LIZIZ(new C1EP7(this));
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1EP6());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C1EP4());
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS579S0100000_35(this, 178));
    public final C01GW LJ = C452501pT.LIZIZ(new C1EPA(this));
    public final C01GW LJFF = C452501pT.LIZIZ(new C1EP8(this));
    public final C01GW LJI = C452501pT.LIZIZ(new C1EPB(this));
    public final C01GW LJII = C452501pT.LIZIZ(new C1EP9(this));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS579S0100000_35(this, 177));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(352));

    static {
        C1446930nkx.LIZIZ("tiktok_creation_ai_chat", new C1429570nIx());
        C1446930nkx.LJI("tiktok_creation_ai_chat", AFwS261S0000000_22.get$arr$(243));
    }

    @Override // com.ss.android.ugc.tools.IAiChatFeatureService
    public final InterfaceC21300818Xm LIZ() {
        return (InterfaceC21300818Xm) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.tools.IAiChatFeatureService
    public final C1EPC LIZIZ() {
        return (C1EPC) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.tools.IAiChatFeatureService
    public final InterfaceC1397450mT9 LIZJ() {
        return (InterfaceC1397450mT9) this.LJFF.getValue();
    }

    @Override // com.ss.android.ugc.tools.IAiChatFeatureService
    public final InterfaceC21291818Ua LIZLLL() {
        return (InterfaceC21291818Ua) this.LIZLLL.getValue();
    }

    @Override // com.ss.android.ugc.tools.IAiChatFeatureService
    public final InterfaceC1354700lMC LJ() {
        return (InterfaceC1354700lMC) this.LJIIIZ.getValue();
    }

    @Override // com.ss.android.ugc.tools.IAiChatFeatureService
    public final InterfaceC1429470nIn LJFF() {
        return (InterfaceC1429470nIn) this.LJ.getValue();
    }

    @Override // com.ss.android.ugc.tools.IAiChatFeatureService
    public final C18T4 LJI() {
        return (C18T4) this.LJIIIIZZ.getValue();
    }

    @Override // com.ss.android.ugc.tools.IAiChatFeatureService
    public final InterfaceC876790YaT LJII() {
        return (InterfaceC876790YaT) this.LJI.getValue();
    }

    @Override // com.ss.android.ugc.tools.IAiChatFeatureService
    public final InterfaceC2454409ja getCache() {
        return (InterfaceC2454409ja) this.LJII.getValue();
    }
}
