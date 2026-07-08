package com.ss.android.ugc.aweme.sticker;

import X.C09R3;
import X.C0BII;
import X.C0BMQ;
import X.C13LE;
import X.C1637110shh;
import X.C1637850sit;
import X.C1647390syH;
import X.C1664740tQG;
import X.C1664750tQH;
import X.C1664770tQJ;
import X.C19A3;
import X.C1DRG;
import X.C2217381BqS;
import X.C385670FAf;
import X.InterfaceC1647420syK;
import X.InterfaceC1647930sz9;
import X.InterfaceC1648020szI;
import X.InterfaceC1649530t1j;
import X.InterfaceC2217461Bqa;
import X.InterfaceC579050MnP;
import Y.AObjectS178S0000000_25;
import Y.AObjectS246S0100000_25;
import androidx.lifecycle.Lifecycle;
import com.bytedance.als.LiveEvent;
import com.bytedance.creativex.recorder.sticker.panel.RecordStickerPanelViewModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.verify.EffectFullWidthHorizontalCarouselAB;
import kotlin.jvm.internal.AwS604S0100000_25;
import lnn.q;

/* JADX INFO: loaded from: classes26.dex */
public final class e3 extends C1637110shh {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public final C1664750tQH LLJJLIIIJLLLLLLLZ;
    public final C1664740tQG LLJL;
    public final C1664750tQH LLJLIL;
    public final C1664740tQG LLJLILLLLZIIL;
    public final C1664750tQH LLJLL;
    public final boolean LLJLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(e3.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(e3.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(e3.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(e3.class, "speedApiComponent", "getSpeedApiComponent()Lcom/ss/android/ugc/gamora/recorder/speed/SpeedApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(e3.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    public final a getPlanCUIApiComponent() {
        return (a) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLJLLL[0]);
    }

    @Override // X.C1637110shh, X.AbstractC1637220shs, X.AbstractC1643600ssA, X.AbstractC2255721DQs
    public final void onCreate() {
        LiveEvent<Boolean> liveEventAD0;
        C385670FAf<C1647390syH> bottomTabIndexChangeEvent;
        C1664750tQH c1664750tQH = this.LLJLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
        ((InterfaceC1647420syK) c1664750tQH.getValue(this, interfaceC2217461BqaArr[2])).xM((InterfaceC579050MnP) X1());
        super.onCreate();
        getPlanCUIApiComponent().nS().LIZ(this, new AObjectS246S0100000_25(this, 286));
        if (!C1637850sit.LIZIZ(this)) {
            getPlanCUIApiComponent().E21().LIZ(this, new AObjectS246S0100000_25(this, 287));
        } else if (((ShortVideoContext) this.LLJLL.getValue(this, interfaceC2217461BqaArr[4])).creativeModel.recordEffectModel.autoShowStickerPanel) {
            ((RecordStickerPanelViewModel) X1()).My0(true, true);
        }
        getPlanCUIApiComponent().A71().LIZ(this, new AObjectS178S0000000_25(this, 2));
        getPlanCUIApiComponent().Qf1().LIZ(this, new AObjectS246S0100000_25(this, 288));
        InterfaceC1647930sz9 interfaceC1647930sz9 = (InterfaceC1647930sz9) this.LLJL.getValue(this, interfaceC2217461BqaArr[1]);
        if (interfaceC1647930sz9 != null && (bottomTabIndexChangeEvent = interfaceC1647930sz9.getBottomTabIndexChangeEvent()) != null) {
            bottomTabIndexChangeEvent.LIZ(this, new AObjectS246S0100000_25(this, 289));
        }
        q qVar = (q) this.LLJJJJ.getValue(this, C1637110shh.LLJJL[2]);
        if (qVar != null && (liveEventAD0 = qVar.AD0()) != null) {
            liveEventAD0.LIZ(this, new AObjectS246S0100000_25(this, 290));
        }
        if (((Boolean) C0BMQ.LIZ.getValue()).booleanValue()) {
            getPlanCUIApiComponent().Ek().LJII(this, Lifecycle.State.CREATED, new AObjectS246S0100000_25(this, 291));
        }
    }

    public final InterfaceC1649530t1j v3() {
        return (InterfaceC1649530t1j) this.LLJLILLLLZIIL.getValue(this, LLJLLL[3]);
    }

    @Override // X.C1637110shh, X.AbstractC1637220shs, X.AbstractC1643600ssA, X.AbstractC2255721DQs
    public final void onDestroy() {
        super.onDestroy();
        ((InterfaceC1647420syK) this.LLJLIL.getValue(this, LLJLLL[2])).xM(null);
    }

    @Override // X.AbstractC1637220shs
    public final boolean w2() {
        return this.LLJLLIL;
    }

    public e3(C1DRG c1drg, C19A3 c19a3, int i, AwS604S0100000_25 awS604S0100000_25) {
        super(c1drg, c19a3, i, awS604S0100000_25);
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZ(this.LLIZ, a.class, null);
        this.LLJL = C1664770tQJ.LIZIZ(this.LLIZ, InterfaceC1648020szI.class, null);
        this.LLJLIL = C1664770tQJ.LIZ(this.LLIZ, InterfaceC1647420syK.class, null);
        this.LLJLILLLLZIIL = C1664770tQJ.LIZIZ(this.LLIZ, InterfaceC1649530t1j.class, null);
        this.LLJLL = C1664770tQJ.LIZ(this.LLIZ, ShortVideoContext.class, null);
        boolean z = false;
        if (EffectFullWidthHorizontalCarouselAB.isEnabled() && ((Number) C0BII.LIZ.getValue()).intValue() != 0) {
            z = true;
        }
        this.LLJLLIL = z;
    }
}
