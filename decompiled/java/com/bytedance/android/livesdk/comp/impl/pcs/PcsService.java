package com.bytedance.android.livesdk.comp.impl.pcs;

import X.C01GW;
import X.C0JJO;
import X.C0JKF;
import X.C0KQV;
import X.C1106960euc;
import X.C1107160euw;
import X.C1ERG;
import X.C1ERH;
import X.C1ERI;
import X.C1ERJ;
import X.C1ERK;
import X.C1ERL;
import X.C1ERM;
import X.C1ERN;
import X.C1ERO;
import X.C1ERP;
import X.C452501pT;
import X.InterfaceC1083970eJX;
import X.InterfaceC1103460eoy;
import X.InterfaceC1107390evJ;
import X.InterfaceC1121830fIb;
import X.InterfaceC781460Ul6;
import android.os.Message;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.livesetting.performance.LiveServiceManagerOptSetting;
import com.bytedance.common.utility.collection.WeakHandler;

/* JADX INFO: loaded from: classes36.dex */
public class PcsService implements IPcsService, WeakHandler.IHandler {
    public final C01GW LL = C452501pT.LIZIZ(new C1ERG());
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C1ERH());
    public final C01GW LLILLL = C452501pT.LIZIZ(new C1ERI());
    public final C01GW LLILZ = C452501pT.LIZIZ(new C1ERL());
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C1ERN());
    public final C01GW LLILZLL = C452501pT.LIZIZ(new C1ERO());
    public final C01GW LLIZ = C452501pT.LIZIZ(new C1ERM());
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C1ERK());
    public final C01GW LLJ = C452501pT.LIZIZ(new C1ERP());
    public final C01GW LLJI = C452501pT.LIZIZ(new C1ERJ());

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    @Override // com.bytedance.android.livesdk.comp.api.pcs.IPcsService
    public final C0KQV Ae() {
        return (C0KQV) this.LLILZLL.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.api.pcs.IPcsService
    public final C1107160euw Dj() {
        return (C1107160euw) this.LL.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.api.pcs.IPcsService
    public final InterfaceC1107390evJ IS1() {
        return (InterfaceC1107390evJ) this.LLJ.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.api.pcs.IPcsService
    public final InterfaceC1083970eJX UN1() {
        return (InterfaceC1083970eJX) this.LLJI.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.api.pcs.IPcsService
    public final InterfaceC781460Ul6 ZI2() {
        return (InterfaceC781460Ul6) this.LLILLL.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.api.pcs.IPcsService
    public final InterfaceC1103460eoy ei() {
        return (InterfaceC1103460eoy) this.LLIZ.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.api.pcs.IPcsService
    public final InterfaceC1121830fIb or0() {
        return (InterfaceC1121830fIb) this.LLIZLLLIL.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.api.pcs.IPcsService
    public final C1106960euc pa() {
        return (C1106960euc) this.LLILLJJLI.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.api.pcs.IPcsService
    public final C0JKF w2() {
        return (C0JKF) this.LLILZ.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.api.pcs.IPcsService
    public final C0JJO xf() {
        return (C0JJO) this.LLILZIL.getValue();
    }

    public final void onInit() {
        LiveServiceManagerOptSetting.enable();
    }
}
