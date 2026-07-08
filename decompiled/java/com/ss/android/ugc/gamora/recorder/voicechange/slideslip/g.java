package com.ss.android.ugc.gamora.recorder.voicechange.slideslip;

import X.AbstractC1627380sS0;
import X.AbstractC1663570tON;
import X.AbstractC1663650tOV;
import X.C013C;
import X.C01GW;
import X.C0C64;
import X.C0CHQ;
import X.C0LAB;
import X.C0LH5;
import X.C120T;
import X.C123100dR;
import X.C1389880mGw;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C1446130njf;
import X.C1461250o83;
import X.C1462900oAi;
import X.C1475700oVM;
import X.C1485060okS;
import X.C15438062q;
import X.C1623600sLu;
import X.C1624570sNT;
import X.C1627370sRz;
import X.C1631190sY9;
import X.C1633850scR;
import X.C1650900t3w;
import X.C1663310tNx;
import X.C1663320tNy;
import X.C1663580tOO;
import X.C1663610tOR;
import X.C1663660tOW;
import X.C1663690tOZ;
import X.C1663750tOf;
import X.C1663770tOh;
import X.C1663790tOj;
import X.C1663830tOn;
import X.C1663900tOu;
import X.C1663960tP0;
import X.C1664460tPo;
import X.C1664590tQ1;
import X.C1664770tQJ;
import X.C1697810uHb;
import X.C19A3;
import X.C19EG;
import X.C1DRG;
import X.C20498815Ja;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C306040Bz8;
import X.C385670FAf;
import X.C452501pT;
import X.C533930Kwp;
import X.C540180LGm;
import X.C560530Lyd;
import X.C786410Ut5;
import X.InterfaceC1485100okW;
import X.InterfaceC1485110okX;
import X.InterfaceC1485120okY;
import X.InterfaceC1630630sXF;
import X.InterfaceC1635410sex;
import X.InterfaceC1647420syK;
import X.InterfaceC1648570t0B;
import X.InterfaceC1650930t3z;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC577380Mki;
import X.InterfaceC577400Mkk;
import Y.AObjectS246S0100000_25;
import Y.AObjectS306S0200000_25;
import Y.AObserverS227S0100000_25;
import Y.ARunnableS125S0100000_25;
import Y.ARunnableS36S0101000_25;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.shortvideo.d4;
import com.ss.android.ugc.aweme.shortvideo.edit.audioedit.voicechange.vcstream.svc.SVCTask;
import com.ss.android.ugc.aweme.shortvideo.edit.audioedit.voicechange.vcstream.vad.VADService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import com.ss.android.ugc.gamora.recorder.voicechange.slideslip.g;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS37S0001000_25;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS63S2100000_25;
import kotlin.jvm.internal.AwS674S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class g extends AbstractC1663650tOV<InterfaceC1650930t3z, v, C1663960tP0, C1663830tOn> implements InterfaceC1650930t3z {
    public static final C1663750tOf LLLLLZL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLZ;
    public static final int LLLLZI;
    public C19A3 LLL;
    public final C1DRG LLLF;
    public v LLLFF;
    public final InterfaceC1731706qJ LLLFFI;
    public final a LLLFZ;
    public final InterfaceC1731706qJ LLLI;
    public final InterfaceC1731706qJ LLLII;
    public final MutableLiveData<Boolean> LLLIIII;
    public final Function0<v> LLLIIIIL;
    public final Function0<C1663960tP0> LLLIIIL;
    public final Function0<C1663830tOn> LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public boolean LLLILZ;
    public AbstractC1663570tON LLLILZJ;
    public AbstractC1663570tON LLLILZLLLI;
    public String LLLIZZ;
    public VADService LLLJ;
    public boolean LLLJIL;
    public boolean LLLJL;
    public boolean LLLL;
    public boolean LLLLII;
    public C1461250o83 LLLLIIIILLL;
    public final List<SVCTask> LLLLIIL;
    public SVCTask LLLLIILL;
    public final List<AbstractC1663570tON> LLLLIILLL;
    public boolean LLLLIL;
    public boolean LLLLILI;
    public boolean LLLLJ;
    public final InterfaceC1731706qJ LLLLJI;
    public final InterfaceC1731706qJ LLLLL;
    public boolean LLLLLIL;
    public final Runnable LLLLLILLIL;
    public int LLLLLJIL;
    public final Runnable LLLLLJLJLL;
    public C20498815Ja LLLLLL;
    public final C1663690tOZ LLLLLLIL;
    public volatile boolean LLLLLLJ;
    public boolean LLLLLLL;
    public boolean LLLLLLLLL;
    public long LLLLLLLLLL;
    public final C01GW LLLLLLLZIL;
    public final C01GW LLLLLLZ;
    public final C01GW LLLLLLZZ;
    public final C01GW LLLLLZ;
    public boolean LLLLLZIL;

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0tOf] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(g.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        C13LE.LIZ.getClass();
        LLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(g.class, "slideSlipStickerApiComponent", "getSlideSlipStickerApiComponent()Lcom/ss/android/ugc/slideslip/SlideSlipEffectApiComponent;", 0), new C2217381BqS(g.class, "cameraLayoutApiComponent", "getCameraLayoutApiComponent()Lcom/ss/android/ugc/gamora/recorder/layout/CameraLayoutApiComponent;", 0), new C2217381BqS(g.class, "controlProgressApiComponent", "getControlProgressApiComponent()Lcom/ss/android/ugc/gamora/recorder/progress/LighteningControlProgressApiComponent;", 0), new C2217381BqS(g.class, "lazyControlProgressConfig", "getLazyControlProgressConfig()Lcom/ss/android/ugc/aweme/property/LazyLoadControlProgressComponentConfig;", 0)};
        LLLLLZL = new Object() { // from class: X.0tOf
        };
        LLLLZI = 8;
    }

    @Override // X.InterfaceC1650930t3z
    public void e31() {
        this.LLLLLZIL = true;
        onPause();
    }

    @Override // X.InterfaceC1650930t3z
    public void tM1() {
        this.LLLLLZIL = false;
        onResume();
    }

    public final void u8() {
        this.LLLLII = false;
        L6();
        if (C306040Bz8.LIZLLL()) {
            this.LLLJ.LIZJ();
            this.LLLLJ = false;
            E5(AFwS266S0000000_25.get$arr$(321));
        }
        q9(C1663580tOO.LIZ);
        t9("STATE_PREVIEW_EMPTY");
        j3(-1);
        T9();
        C1663660tOW c1663660tOW = C1663660tOW.LIZ;
        ShortVideoContext shortVideoContext = getShortVideoContext();
        c1663660tOW.getClass();
        C20684815ws.LJIILLIIL("cancel_sound_filter", C1663660tOW.LJII(shortVideoContext).LIZ);
    }

    private final void Cu1() {
        if (this.LLLLIL) {
            return;
        }
        this.LLLLIL = true;
        this.LLLLILI = false;
        L7().LJIIJ(Boolean.FALSE);
        E5(AFwS266S0000000_25.get$arr$(315));
        J8(false);
    }

    private final C560530Lyd<Boolean> I7() {
        return (C560530Lyd) this.LLLLLLZZ.getValue();
    }

    private final boolean K6() {
        return this.LLLLIIIILLL.LIZ();
    }

    private final C560530Lyd<Boolean> L7() {
        return (C560530Lyd) this.LLLLLZ.getValue();
    }

    private final C560530Lyd<C1650900t3w> T4() {
        return (C560530Lyd) this.LLLLLLLZIL.getValue();
    }

    private final void T8() {
        E5(new AwS604S0100000_25(this, 411));
        this.LLLLJ = false;
        this.LLLJ.init();
        this.LLLJ.LIZJ();
        C1663660tOW c1663660tOW = C1663660tOW.LIZ;
        ShortVideoContext shortVideoContext = getShortVideoContext();
        Effect effectRT1 = RT1();
        c1663660tOW.getClass();
        C1663660tOW.LJFF(shortVideoContext, effectRT1);
        this.LLLJ.LIZIZ();
        this.LLLJ.LLJJIJIL = new AwS604S0100000_25(this, 414);
    }

    private final void d7() {
        for (SVCTask sVCTask : this.LLLLIIL) {
            sVCTask.LIZ();
            if (!sVCTask.LLILZLL && sVCTask.LLILZIL > 0) {
                C1663660tOW c1663660tOW = C1663660tOW.LIZ;
                ShortVideoContext shortVideoContext = getShortVideoContext();
                Effect effect = sVCTask.LLJJ;
                long jCurrentTimeMillis = System.currentTimeMillis() - sVCTask.LLILZIL;
                c1663660tOW.getClass();
                C1663660tOW.LIZJ(shortVideoContext, effect, jCurrentTimeMillis, false);
            }
        }
        this.LLLLIIL.clear();
    }

    private final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLLFFI.getValue(this, LLLLZ[0]);
    }

    private final void o8() {
        View viewRequireView;
        final ViewTreeObserver viewTreeObserver;
        v vVar = this.LLLFF;
        if (vVar == null || (viewRequireView = vVar.requireView()) == null || (viewTreeObserver = viewRequireView.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserver.OnDrawListener onDrawListener = new ViewTreeObserver.OnDrawListener() { // from class: X.0tOa
            @Override // android.view.ViewTreeObserver.OnDrawListener
            public final void onDraw() {
                C1653260t7k.LIZJ("click_voice_filter_shown", true);
                C01TT.LIZJ(new AwS426S0200000_25(viewTreeObserver, this, 105));
            }
        };
        viewTreeObserver.addOnDrawListener(onDrawListener);
        C2187701Ajg.LIZ(viewTreeObserver, onDrawListener, ViewTreeObserver.OnDrawListener.class);
    }

    private final C20498815Ja s7() {
        C20498815Ja c20498815Ja = this.LLLLLL;
        if (c20498815Ja != null) {
            return c20498815Ja;
        }
        C20498815Ja c20498815Ja2 = new C20498815Ja("record_page_svc_stream");
        this.LLLLLL = c20498815Ja2;
        return c20498815Ja2;
    }

    private final InterfaceC577400Mkk y7() {
        return (InterfaceC577400Mkk) this.LLLI.getValue(this, LLLLZ[1]);
    }

    @Override // X.AbstractC1663650tOV
    public boolean C5() {
        if (!this.LLLLILI) {
            return super.C5();
        }
        Cu1();
        return true;
    }

    public final void L6() {
        P6(this.LLLLIIL);
        d7();
        BPEAHandler bPEAHandler = C1462900oAi.LIZ;
        bPEAHandler.removeCallbacks(this.LLLLLILLIL);
        bPEAHandler.removeCallbacks(this.LLLLLJLJLL);
        N6();
        if ((this.LLLILZJ instanceof C1663310tNx) && C306040Bz8.LIZIZ()) {
            t9("STATE_PREVIEW_SPEAK");
        }
        if (C306040Bz8.LIZJ()) {
            C20498815Ja c20498815Ja = this.LLLLLL;
            if (c20498815Ja != null) {
                c20498815Ja.release();
            }
            this.LLLLLL = null;
            if (this.LLLLLLJ) {
                C1663660tOW c1663660tOW = C1663660tOW.LIZ;
                ShortVideoContext shortVideoContext = getShortVideoContext();
                Effect effectRT1 = RT1();
                long jCurrentTimeMillis = System.currentTimeMillis() - this.LLLLLLLLLL;
                c1663660tOW.getClass();
                C1663660tOW.LIZJ(shortVideoContext, effectRT1, jCurrentTimeMillis, false);
            }
            this.LLLLLLJ = false;
            this.LLLLLLLLL = false;
            this.LLLLLLL = false;
            this.LLLLLLLLLL = -1L;
        }
    }

    public final void N6() {
        this.LLLLIIIILLL = new C1461250o83(null, null, null, null, 511);
    }

    @Override // X.InterfaceC1650930t3z
    public Effect RT1() {
        return C1663610tOR.LIZ(this.LLLILZJ);
    }

    @Override // X.InterfaceC1650930t3z
    public String S80() {
        if (!this.LLLL) {
            return "";
        }
        AbstractC1663570tON abstractC1663570tON = this.LLLILZJ;
        return abstractC1663570tON instanceof C1663310tNx ? C1663610tOR.LIZ(abstractC1663570tON).getEffect_id() : "";
    }

    public final C560530Lyd<Boolean> W7() {
        return (C560530Lyd) this.LLLLLLZ.getValue();
    }

    public final boolean Z7() {
        C560530Lyd<AbstractC1627380sS0> c560530Lyd;
        AbstractC1627380sS0 abstractC1627380sS0LJI;
        l0 l0Var = this.LLJJL;
        Effect effectLIZ = null;
        if (l0Var != null && (c560530Lyd = l0Var.LLJZIJLIL) != null && (abstractC1627380sS0LJI = c560530Lyd.LJI()) != null) {
            effectLIZ = abstractC1627380sS0LJI.LIZ();
        }
        if (!C1624570sNT.LJJIIZ(effectLIZ)) {
            return false;
        }
        J9(false);
        this.LLLL = false;
        return true;
    }

    public final void h8() {
        if (this.LLLJL) {
            Cu1();
        }
    }

    public final void j9() {
        if (this.LLLLILI) {
            return;
        }
        this.LLLLILI = true;
        this.LLLLIL = false;
        L7().LJIIJ(Boolean.TRUE);
        E5(AFwS266S0000000_25.get$arr$(316));
        J8(true);
    }

    @Override // X.AbstractC1663650tOV
    public void k5() {
        C1663690tOZ c1663690tOZ = this.LLLLLLIL;
        if (!((ArrayList) c1663690tOZ.LIZIZ).isEmpty()) {
            c1663690tOZ.LIZJ.LJFF(c1663690tOZ.LIZIZ);
        } else {
            ((C1663900tOu) c1663690tOZ.LIZ.getValue()).LIZ(new AwS674S0100000_25(c1663690tOZ, 42));
        }
        c1663690tOZ.LIZJ.LIZ(this, new AObjectS246S0100000_25(this, 648));
    }

    public final InterfaceC577380Mki k7() {
        return (InterfaceC577380Mki) this.LLLII.getValue(this, LLLLZ[2]);
    }

    public final InterfaceC1630630sXF n7() {
        return (InterfaceC1630630sXF) this.LLLLJI.getValue(this, LLLLZ[3]);
    }

    public final C1631190sY9 o7() {
        return (C1631190sY9) this.LLLLL.getValue(this, LLLLZ[4]);
    }

    public final void p8() {
        S6(new AwS569S0100000_25(this, 680));
    }

    public final void r8() {
        S6(new AwS569S0100000_25(this, 681));
    }

    private final void T9() {
        T4().LJIIJ(new C1650900t3w(1));
        getShortVideoContext().creativeModel.streamVoiceConversionModel.isSVCSelected = false;
        w9();
    }

    private final void w9() {
        getShortVideoContext().creativeModel.streamVoiceConversionModel.vcShootingEffectId = S80();
        getShortVideoContext().creativeModel.streamVoiceConversionModel.vcShootingEffectIdFrom = C1664460tPo.LIZIZ(RT1());
    }

    @Override // X.InterfaceC1650930t3z
    public LiveEvent<Boolean> Go() {
        return I7();
    }

    public final void I9() {
        String musicPath = getShortVideoContext().getMusicPath();
        if (musicPath == null || musicPath.length() == 0) {
            this.LLLL = true;
            U9();
        } else {
            Xw0();
            this.LLLL = false;
        }
    }

    @Override // X.InterfaceC1650930t3z
    public LiveEvent<Boolean> Ir1() {
        return L7();
    }

    @Override // X.InterfaceC1650930t3z
    public void O81() {
        if (d4.LJJIJIIJI(getShortVideoContext())) {
            C1389880mGw c1389880mGw = new C1389880mGw(C1664590tQ1.LJII(this));
            c1389880mGw.LJIIIZ(C1664590tQ1.LJII(this).getResources().getString(2131822810));
            c1389880mGw.LIZLLL(3000L);
            c1389880mGw.LJIIJ();
        }
    }

    public final void P8() {
        Cu1();
        C1663660tOW c1663660tOW = C1663660tOW.LIZ;
        ShortVideoContext shortVideoContext = getShortVideoContext();
        c1663660tOW.getClass();
        C0LAB c0labLJII = C1663660tOW.LJII(shortVideoContext);
        c0labLJII.LJ("to_status", "fold");
        c0labLJII.LJ("enter_method", "click_blank");
        C20684815ws.LJIILLIIL("voice_effect_panel_trans", c0labLJII.LIZ);
    }

    public final void U9() {
        w9();
        if (this.LLLL && getShortVideoContext().LJI().isEmpty() && !getShortVideoContext().cameraComponentModel.isRetakeMode) {
            int i = getShortVideoContext().shootMode;
            if (i == 2 || i == 16) {
                this.LLLL = false;
            }
            if (this.LLLILZJ instanceof C1663310tNx) {
                T4().LJIIJ(new C1650900t3w(2));
                getShortVideoContext().creativeModel.streamVoiceConversionModel.isSVCSelected = true;
            } else {
                T4().LJIIJ(new C1650900t3w(1));
                getShortVideoContext().creativeModel.streamVoiceConversionModel.isSVCSelected = false;
            }
        }
    }

    @Override // X.AbstractC1663650tOV
    public void Xi() {
        C560530Lyd<AbstractC1627380sS0> c560530Lyd;
        C385670FAf<Boolean> c385670FAfBh;
        getPlanCUIApiComponent().RS().LIZ(this, new AObjectS246S0100000_25(this, 650));
        Op().getBottomTabIndexChangeEvent().LIZ(this, new AObjectS246S0100000_25(this, 651));
        InterfaceC577400Mkk interfaceC577400MkkY7 = y7();
        if (interfaceC577400MkkY7 != null && (c385670FAfBh = interfaceC577400MkkY7.bh()) != null) {
            c385670FAfBh.LIZ(this, new AObjectS246S0100000_25(this, 652));
        }
        l0 l0Var = this.LLJJL;
        if (l0Var != null && (c560530Lyd = l0Var.LLJZIJLIL) != null) {
            c560530Lyd.LIZ(this, new AObjectS246S0100000_25(this, 653));
        }
        String musicPath = getShortVideoContext().getMusicPath();
        if (musicPath != null && musicPath.length() > 0) {
            if (Z7()) {
                return;
            }
            Xw0();
            this.LLLL = false;
        }
        H4().Wv().LIZ(this, new AObjectS246S0100000_25(this, 654));
        H4().Vk().LIZ(this, new AObjectS246S0100000_25(this, 655));
        getRecordControlApi().me2().LIZ(this, new AObjectS246S0100000_25(this, 656));
        getRecordControlApi().pU1().LIZ(this, new AObjectS246S0100000_25(this, 657));
        getRecordControlApi().ec().LIZ(this, new AObjectS306S0200000_25((Object) new C013C(), (Object) this, (InterfaceC1648570t0B) 22));
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_first_frame_network_api_delay", true, false)) {
            getCameraApiComponent().qF1().observe(this, new AObserverS227S0100000_25(this, 75));
        } else {
            k5();
        }
        x60().LIZ(this, new AObjectS246S0100000_25(this, 649));
    }

    @Override // X.InterfaceC1650930t3z
    public void Xw0() {
        T4().LJIIJ(new C1650900t3w(4));
        getShortVideoContext().creativeModel.streamVoiceConversionModel.isSVCSelected = false;
        w9();
    }

    @Override // X.InterfaceC1650930t3z
    public LiveEvent<Boolean> hN2() {
        return W7();
    }

    @Override // X.AbstractC1663650tOV, ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        getRecordAdapterApi().Cp2(this);
        BPEAHandler bPEAHandler = C1462900oAi.LIZ;
        C1462900oAi.LIZ(getShortVideoContext().creativeInfo);
        hN2().LIZ(this, new AObjectS246S0100000_25(this, 658));
    }

    @Override // X.AbstractC1663650tOV, X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        getRecordAdapterApi().Cp2(null);
        this.LLLJ.LIZJ();
        this.LLLLJ = false;
        VADService vADService = this.LLLJ;
        vADService.LIZJ();
        vADService.LIZ(6, null);
        if (vADService.LLJJIJIIJIL) {
            VADService.AnonymousClass1 anonymousClass1 = vADService.LLJJIJI;
            if (anonymousClass1 == null) {
                anonymousClass1 = null;
            }
            C786410Ut5.LJJZZIII(anonymousClass1, new ARunnableS125S0100000_25(vADService, 110));
        }
        L6();
        C1663790tOj.LIZ().getClass();
        if (C120T.LIZLLL == null) {
            InterfaceC1635410sex interfaceC1635410sexLIZ = C1633850scR.LIZ(C0CHQ.LIZ, null);
            C0CHQ.LIZ().initDownloadableModel();
            C120T.LIZLLL = interfaceC1635410sexLIZ;
        }
        InterfaceC1635410sex interfaceC1635410sex = C120T.LIZLLL;
        if (interfaceC1635410sex != null) {
            interfaceC1635410sex.destroy();
        }
        C120T.LIZLLL = null;
    }

    @Override // X.AbstractC1663650tOV, X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        this.LLLJ.LIZJ();
        this.LLLLJ = false;
        VADService vADService = this.LLLJ;
        vADService.LIZJ();
        vADService.LIZ(6, null);
        if (vADService.LLJJIJIIJIL) {
            VADService.AnonymousClass1 anonymousClass1 = vADService.LLJJIJI;
            C786410Ut5.LJJZZIII(anonymousClass1 != null ? anonymousClass1 : null, new ARunnableS125S0100000_25(vADService, 110));
        }
        L6();
    }

    @Override // X.AbstractC1663650tOV, X.AbstractC2255721DQs
    public void onResume() {
        boolean zLJI = MethodIDManager.LJI(202431);
        super.onResume();
        if (!this.LLLLLZIL && Fh() && C306040Bz8.LIZLLL() && (this.LLLILZJ instanceof C1663310tNx)) {
            T8();
        }
        if (getRecordControlApi().ec().LIZJ().booleanValue() || getShortVideoContext().cameraComponentModel.isRetakeMode) {
            J9(false);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC1650930t3z
    public LiveEvent<C1650900t3w> x60() {
        return T4();
    }

    @Override // ge.i
    public Function0<v> E3() {
        return this.LLLIIIIL;
    }

    @Override // X.InterfaceC1650930t3z
    public MutableLiveData<Boolean> K02() {
        return this.LLLIIII;
    }

    @Override // X.AbstractC1663650tOV, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLLF;
    }

    @Override // X.InterfaceC1650930t3z
    public boolean isFeatureEnabled() {
        return this.LLLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1663960tP0> o2() {
        return this.LLLIIIL;
    }

    public final C1461250o83 u7() {
        return this.LLLLIIIILLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1663830tOn> w2() {
        return this.LLLIIL;
    }

    private final void J8(boolean z) {
        getCameraApiComponent().Zl0(new C1663770tOh(!z, false, false));
    }

    private final void S6(Function0<Unit> function0) {
        if (this.LLLLLIL) {
            this.LLLLLIL = false;
            function0.invoke();
            C786410Ut5.LJLIIL(500L, C1462900oAi.LIZ, new ARunnableS125S0100000_25(this, 66));
        }
    }

    private final AbstractC1663570tON T6(String str) {
        C1663580tOO c1663580tOO = C1663580tOO.LIZ;
        if (str != null) {
            List<AbstractC1663570tON> list = this.LLLLIILLL;
            ArrayList arrayList = new ArrayList();
            for (AbstractC1663570tON abstractC1663570tON : list) {
                if (Intrinsics.LJFF(C1664460tPo.LJIIIIZZ(C1663610tOR.LIZ(abstractC1663570tON)), str)) {
                    arrayList.add(abstractC1663570tON);
                }
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                return (AbstractC1663570tON) it2.next();
            }
        }
        return c1663580tOO;
    }

    private final AbstractC1663570tON W6(String str) {
        int i = 0;
        for (AbstractC1663570tON abstractC1663570tON : this.LLLLIILLL) {
            int i2 = i + 1;
            if (i >= 0) {
                AbstractC1663570tON abstractC1663570tON2 = abstractC1663570tON;
                if (Intrinsics.LJFF(C1663610tOR.LIZ(abstractC1663570tON2).getEffect_id(), str)) {
                    return abstractC1663570tON2;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return null;
    }

    private final void a9(boolean z) {
        if ((!Fh() && !z) || !this.LLLL) {
            return;
        }
        List<String> list = ((C1663900tOu) this.LLLLLLIL.LIZ.getValue()).LIZ;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        Effect effectLIZ = C1663610tOR.LIZ(this.LLLILZJ);
        C1446130njf.LIZ.getClass();
        String strLJFF = C1446130njf.LJFF(effectLIZ, "vc_anchor_audioprew");
        if (strLJFF == null) {
            strLJFF = "";
        }
        if ((!list.isEmpty()) && C123100dR.LIZ(C1664460tPo.LJIIIIZZ(C1663610tOR.LIZ(this.LLLILZJ))) && C123100dR.LIZ(strLJFF)) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (String str : list) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(strLJFF);
                arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
            }
            C1485060okS c1485060okS = new C1485060okS();
            c1485060okS.LJFF = C1664460tPo.LJIIIIZZ(C1663610tOR.LIZ(this.LLLILZJ));
            c1485060okS.LIZIZ = arrayList;
            SimVideoUrlModel simVideoUrlModel = new SimVideoUrlModel();
            VideoUrlModel videoUrlModel = new VideoUrlModel();
            videoUrlModel.setUrlKey(c1485060okS.LJFF);
            videoUrlModel.setUrlList(c1485060okS.LIZIZ);
            videoUrlModel.setSourceId(c1485060okS.LJFF);
            simVideoUrlModel.origin = videoUrlModel;
            simVideoUrlModel.setSourceId(c1485060okS.LJFF);
            simVideoUrlModel.setUrlKey(c1485060okS.LJFF);
            simVideoUrlModel.setUrlList(c1485060okS.LIZIZ);
            this.LLLLLLLLL = C1475700oVM.LIZ().isCache(simVideoUrlModel);
            C20498815Ja c20498815JaS7 = s7();
            if (!this.LLLLLLLLL) {
                j3(0);
                j3(40);
            }
            this.LLLLLLLLLL = System.currentTimeMillis();
            C1663660tOW c1663660tOW = C1663660tOW.LIZ;
            ShortVideoContext shortVideoContext = getShortVideoContext();
            Effect effectRT1 = RT1();
            c1663660tOW.getClass();
            C1663660tOW.LJ(shortVideoContext, effectRT1);
            this.LLLLLLJ = false;
            this.LLLLLLL = true;
            c20498815JaS7.LIZIZ(c1485060okS);
            c20498815JaS7.LJ(new InterfaceC1485120okY() { // from class: X.0tOc
                @Override // X.InterfaceC1485120okY
                public final void LIZ(int i, int i2) {
                    this.LIZ.LLLLLLJ = true;
                    g gVar = this.LIZ;
                    gVar.LLLLLLL = false;
                    if (!gVar.LLLLLLLLL) {
                        gVar.j3(100);
                    }
                }
            });
            c20498815JaS7.LIZJ(new InterfaceC1485110okX() { // from class: X.0tOX
                @Override // X.InterfaceC1485110okX
                public final void LIZ(int i, int i2) {
                    this.LIZ.LLLLLLJ = false;
                    g gVar = this.LIZ;
                    gVar.LLLLLLL = false;
                    C1663660tOW c1663660tOW2 = C1663660tOW.LIZ;
                    ShortVideoContext shortVideoContext2 = gVar.getShortVideoContext();
                    Effect effectRT12 = this.LIZ.RT1();
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZ.LLLLLLLLLL;
                    c1663660tOW2.getClass();
                    C1663660tOW.LIZJ(shortVideoContext2, effectRT12, jCurrentTimeMillis, false);
                }
            });
            c20498815JaS7.LIZ(new InterfaceC1485100okW() { // from class: X.0tOY
                @Override // X.InterfaceC1485100okW
                public final void LIZIZ() {
                    this.LIZ.LLLLLLJ = false;
                    g gVar = this.LIZ;
                    gVar.LLLLLLL = false;
                    C1663660tOW c1663660tOW2 = C1663660tOW.LIZ;
                    ShortVideoContext shortVideoContext2 = gVar.getShortVideoContext();
                    Effect effectRT12 = this.LIZ.RT1();
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZ.LLLLLLLLLL;
                    c1663660tOW2.getClass();
                    C1663660tOW.LIZJ(shortVideoContext2, effectRT12, jCurrentTimeMillis, true);
                }
            });
        }
    }

    public final void J9(boolean z) {
        T4().LJIIJ(new C1650900t3w(5));
        if (!z) {
            getShortVideoContext().creativeModel.streamVoiceConversionModel.isSVCSelected = false;
        }
    }

    public final SVCTask P6(List<SVCTask> list) {
        SVCTask sVCTask = new SVCTask(getDiContainer());
        this.LLLLIILL = sVCTask;
        list.add(sVCTask);
        sVCTask.LLJJI.LLJILLL = true;
        return sVCTask;
    }

    @Override // X.AbstractC1663650tOV, X.InterfaceC1652230t65
    public void Ub(String str) {
        String str2;
        super.Ub(str);
        this.LLLLIL = false;
        this.LLLLILI = false;
        C560530Lyd<Boolean> c560530LydI7 = I7();
        Boolean bool = Boolean.FALSE;
        c560530LydI7.LJIIJ(bool);
        L7().LJIIJ(bool);
        if (!Intrinsics.LJFF(str, "from_observer")) {
            this.LLLILZ = false;
        }
        L6();
        if (this.LLLILZJ instanceof C1663310tNx) {
            str2 = "STATE_PREVIEW_SPEAK";
        } else {
            str2 = "STATE_PREVIEW_EMPTY";
        }
        t9(str2);
        if (C306040Bz8.LIZLLL()) {
            this.LLLJ.LIZJ();
            this.LLLLJ = false;
        }
    }

    public final void j3(int i) {
        if (i == 0) {
            this.LLLLLJIL = 0;
        }
        if (i > 0 && this.LLLLLJIL == -1) {
            return;
        }
        this.LLLLLJIL = i;
        if (i == -1) {
            E5(new AwS37S0001000_25(i, 2));
        } else {
            C786410Ut5.LJLIIL(20L, C1462900oAi.LIZ, new ARunnableS36S0101000_25(i, this, 2));
        }
    }

    public final void q9(AbstractC1663570tON abstractC1663570tON) {
        this.LLLILZJ = abstractC1663570tON;
        E5(new AwS604S0100000_25(this, 415));
        U9();
    }

    public final void t9(String str) {
        if (C306040Bz8.LIZJ()) {
            return;
        }
        if (C306040Bz8.LIZLLL()) {
            this.LLLJ.LIZJ();
            this.LLLLJ = false;
            this.LLLJ.LLILLL.LIZJ = AFwS266S0000000_25.get$arr$(317);
            if (Intrinsics.LJFF(str, "STATE_PREVIEW_SPEAK")) {
                this.LLLIZZ = "STATE_PREVIEW_NONE";
                if (Fh() && !this.LLJL && !this.LLJLIL) {
                    this.LLLJ.init();
                    C1663660tOW c1663660tOW = C1663660tOW.LIZ;
                    ShortVideoContext shortVideoContext = getShortVideoContext();
                    Effect effectRT1 = RT1();
                    c1663660tOW.getClass();
                    C1663660tOW.LJFF(shortVideoContext, effectRT1);
                    this.LLLJ.LIZIZ();
                    E5(new AwS604S0100000_25(this, 416));
                }
            } else if (Intrinsics.LJFF(str, "STATE_PREVIEW_PREVIEW")) {
                this.LLLIZZ = "STATE_PREVIEW_NONE";
                E5(new AwS604S0100000_25(this, 417));
            } else {
                Intrinsics.LJFF(str, "STATE_PREVIEW_PLAYING");
                E5(AFwS266S0000000_25.get$arr$(318));
            }
        } else {
            this.LLLIZZ = str;
        }
        E5(new AwS604S0100000_25(this, 418));
        if (Intrinsics.LJFF(str, "STATE_PREVIEW_SPEAK")) {
            if (C306040Bz8.LIZIZ() && this.LLLIILIL && this.LLLLIL) {
                this.LLLIILIL = false;
                E5(AFwS266S0000000_25.get$arr$(319));
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(str, "STATE_PREVIEW_PREVIEW") || !C306040Bz8.LIZIZ() || !this.LLLIL || !this.LLLLIL) {
            return;
        }
        this.LLLIL = false;
        E5(AFwS266S0000000_25.get$arr$(320));
    }

    @Override // X.InterfaceC1650930t3z
    public void uC(String str) {
        AbstractC1663570tON abstractC1663570tONT6 = T6(str);
        String strLJIIIIZZ = C1664460tPo.LJIIIIZZ(C1663610tOR.LIZ(abstractC1663570tONT6));
        W7().LJIIIZ(Boolean.FALSE);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSelection,truly speakerId = ");
        sbLIZ.append(strLJIIIIZZ);
        C2188811AlT.LIZIZ(sbLIZ);
        z8(-1, abstractC1663570tONT6);
    }

    public g(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLL = c19a3;
        this.LLLF = c1drg;
        this.LLLFFI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647420syK.class, null);
        this.LLLFZ = (a) getDiContainer().LJII(a.class, null);
        this.LLLI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC577400Mkk.class, null);
        this.LLLII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC577380Mki.class, null);
        this.LLLIIII = new MutableLiveData<>();
        this.LLLIIIIL = new AwS569S0100000_25(this, 679);
        this.LLLIIIL = AFwS214S0000000_25.get$arr$(334);
        this.LLLIIL = new AwS569S0100000_25(this, 678);
        this.LLLIILIL = true;
        this.LLLIL = true;
        C1663320tNy c1663320tNy = C1663320tNy.LIZ;
        this.LLLILZJ = c1663320tNy;
        this.LLLILZLLLI = c1663320tNy;
        this.LLLIZZ = "STATE_PREVIEW_EMPTY";
        this.LLLJ = new VADService(getDiContainer());
        this.LLLL = true;
        this.LLLLIIIILLL = new C1461250o83(null, null, null, null, 511);
        ArrayList arrayList = new ArrayList();
        this.LLLLIIL = arrayList;
        this.LLLLIILL = P6(arrayList);
        this.LLLLIILLL = new ArrayList();
        this.LLLLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1630630sXF.class, null);
        this.LLLLL = C1664770tQJ.LIZIZ(getDiContainer(), C1631190sY9.class, "lazyControlProgressConfig");
        this.LLLLLIL = true;
        this.LLLLLILLIL = new ARunnableS125S0100000_25(this, 67);
        this.LLLLLJIL = -1;
        this.LLLLLJLJLL = new ARunnableS125S0100000_25(this, 65);
        this.LLLLLLIL = new C1663690tOZ();
        this.LLLLLLLLLL = -1L;
        this.LLLLLLLZIL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(333));
        this.LLLLLLZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(332));
        this.LLLLLLZZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(330));
        this.LLLLLZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(331));
    }

    private final void d8(String str, String str2) {
        AbstractC1663570tON abstractC1663570tONW6;
        C560530Lyd<AbstractC1627380sS0> c560530Lyd;
        if (str.length() != 0 && W6(str) != null) {
            if (str.length() <= 0 || (abstractC1663570tONW6 = W6(str)) == null) {
                abstractC1663570tONW6 = (AbstractC1663570tON) C13LP.LJJJLZIJ(0, this.LLLLIILLL);
                if (abstractC1663570tONW6 == null) {
                    return;
                }
            }
            q9(abstractC1663570tONW6);
            t9("STATE_PREVIEW_SPEAK");
            AbstractC1627380sS0 abstractC1627380sS0LJI = null;
            if (C306040Bz8.LIZJ()) {
                a9(false);
            }
            C1663660tOW c1663660tOW = C1663660tOW.LIZ;
            ShortVideoContext shortVideoContext = getShortVideoContext();
            Effect effectLIZ = C1663610tOR.LIZ(abstractC1663570tONW6);
            l0 l0Var = this.LLJJL;
            if (l0Var != null && (c560530Lyd = l0Var.LLJZIJLIL) != null) {
                abstractC1627380sS0LJI = c560530Lyd.LJI();
            }
            c1663660tOW.getClass();
            C1663660tOW.LJI(shortVideoContext, effectLIZ, true, abstractC1627380sS0LJI instanceof C1627370sRz);
        }
    }

    public final void y8(int i, AbstractC1663570tON abstractC1663570tON) {
        this.LLLILZLLLI = abstractC1663570tON;
        if (C306040Bz8.LIZJ()) {
            AbstractC1663570tON abstractC1663570tON2 = this.LLLILZJ;
            if ((abstractC1663570tON2 instanceof C1663310tNx) && C1663610tOR.LIZJ(this.LLLILZLLLI, abstractC1663570tON2) && !this.LLLLLLJ) {
                a9(false);
            }
        }
        if (C306040Bz8.LIZLLL() || (!C1663610tOR.LIZJ(this.LLLILZLLLI, this.LLLILZJ))) {
            return;
        }
        if (Intrinsics.LJFF(this.LLLIZZ, "STATE_PREVIEW_SPEAK")) {
            this.LLLLII = true;
            t9("STATE_PREVIEW_PREVIEW");
            N6();
            SVCTask sVCTaskP6 = P6(this.LLLLIIL);
            C1663660tOW c1663660tOW = C1663660tOW.LIZ;
            ShortVideoContext shortVideoContext = getShortVideoContext();
            Effect effectRT1 = RT1();
            c1663660tOW.getClass();
            C1663660tOW.LJFF(shortVideoContext, effectRT1);
            Effect effectRT12 = RT1();
            getShortVideoContext();
            sVCTaskP6.LJI(effectRT12, true);
            C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, C1462900oAi.LIZ, this.LLLLLILLIL);
            sVCTaskP6.LLJJIII = new AwS391S0200000_25(this, sVCTaskP6, 172);
            return;
        }
        if (!Intrinsics.LJFF(this.LLLIZZ, "STATE_PREVIEW_PREVIEW")) {
            return;
        }
        t9("STATE_PREVIEW_PLAYING");
        C1462900oAi.LIZ.removeCallbacks(this.LLLLLILLIL);
        this.LLLLIILL.LIZLLL(getShortVideoContext());
        this.LLLLIIIILLL = this.LLLLIILL.LIZIZ();
    }

    @Override // X.AbstractC1663650tOV, X.InterfaceC1652230t65
    public void yo(String str, String str2) {
        C540180LGm c540180LGm = C540180LGm.LIZ;
        c540180LGm.getClass();
        if (C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO")) {
            n9(this, str, str2);
            return;
        }
        C19EG c19eg = (C19EG) C1664590tQ1.LJII(this);
        C0LH5 c0lh5 = new C0LH5() { // from class: X.0tOd
            @Override // X.C0LH5
            public final void LIZ(int[] iArr, String[] strArr) {
                if (strArr != null) {
                    for (int i = 0; i < strArr.length; i++) {
                    }
                }
                if (iArr != null) {
                    for (int i2 = 0; i2 < iArr.length; i2++) {
                    }
                }
            }
        };
        AwS63S2100000_25 awS63S2100000_25 = new AwS63S2100000_25(this, str, str2, 1);
        TokenCert tokenCert = C1623600sLu.LIZ;
        c540180LGm.getClass();
        C540180LGm.LIZ(c19eg, c0lh5, awS63S2100000_25, tokenCert);
    }

    public final void z8(int i, AbstractC1663570tON abstractC1663570tON) {
        boolean z;
        AbstractC1627380sS0 abstractC1627380sS0LJI;
        C560530Lyd<AbstractC1627380sS0> c560530Lyd;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        this.LLLLII = z;
        Effect effectRT1 = RT1();
        if (C123100dR.LIZ(C1664460tPo.LJIIIIZZ(C1663610tOR.LIZ(abstractC1663570tON)))) {
            Effect effectLIZ = C1663610tOR.LIZ(abstractC1663570tON);
            if (this.LLLLII) {
                C1664460tPo.LJI(effectLIZ, "video_shoot_page");
            } else {
                C1664460tPo.LJI(effectLIZ, "vc_prop");
            }
        }
        q9(abstractC1663570tON);
        C1663660tOW c1663660tOW = C1663660tOW.LIZ;
        ShortVideoContext shortVideoContext = getShortVideoContext();
        Effect effectLIZ2 = C1663610tOR.LIZ(abstractC1663570tON);
        l0 l0Var = this.LLJJL;
        if (l0Var != null && (c560530Lyd = l0Var.LLJZIJLIL) != null) {
            abstractC1627380sS0LJI = c560530Lyd.LJI();
        } else {
            abstractC1627380sS0LJI = null;
        }
        c1663660tOW.getClass();
        C1663660tOW.LJI(shortVideoContext, effectLIZ2, false, abstractC1627380sS0LJI instanceof C1627370sRz);
        SVCTask sVCTask = this.LLLLIILL;
        if (sVCTask.LLILLJJLI && !sVCTask.LLJIJIL && !sVCTask.LLJI) {
            ShortVideoContext shortVideoContext2 = getShortVideoContext();
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLLLIILL.LLILZ;
            C0LAB c0labLJII = C1663660tOW.LJII(shortVideoContext2);
            c0labLJII.LJ("effect_id", effectRT1.getEffect_id());
            c0labLJII.LJ("effect_name", effectRT1.getName());
            c0labLJII.LJ("shoot_entrance", shortVideoContext2.LJ().getStoryShootEntrance());
            c0labLJII.LIZIZ(jCurrentTimeMillis, "duration");
            C20684815ws.LJIILLIIL("voice_effect_preview_record_interrupt", c0labLJII.LIZ);
        } else if (sVCTask.LLJJI.LLJJI && !sVCTask.LLJIJIL && (sVCTask.LLJI || sVCTask.LLIZ)) {
            C1663660tOW.LIZLLL(getShortVideoContext(), effectRT1, !this.LLLLIILL.LLIZ);
        } else if (C306040Bz8.LIZJ()) {
            if (this.LLLLLLL) {
                C1663660tOW.LIZLLL(getShortVideoContext(), effectRT1, false);
            } else if (this.LLLLLLJ) {
                C1663660tOW.LIZLLL(getShortVideoContext(), effectRT1, true);
            }
        }
        if (C306040Bz8.LIZJ()) {
            a9(!this.LLLLII);
        }
        d7();
        BPEAHandler bPEAHandler = C1462900oAi.LIZ;
        bPEAHandler.removeCallbacks(this.LLLLLILLIL);
        bPEAHandler.removeCallbacks(this.LLLLLJLJLL);
        if (K6()) {
            this.LLLJIL = true;
            C786410Ut5.LJLIIL(200L, bPEAHandler, this.LLLLLJLJLL);
            t9("STATE_PREVIEW_PLAYING");
        } else {
            t9("STATE_PREVIEW_SPEAK");
        }
        w9();
    }

    public static final void n9(g gVar, String str, String str2) {
        super.yo(str, str2);
        if (!gVar.LLLJL) {
            gVar.d8(str, str2);
        }
        gVar.LLLL = true;
        gVar.LLLJL = true;
        gVar.Cu1();
        gVar.I7().LJIIJ(Boolean.TRUE);
        if (!gVar.LLJL && C306040Bz8.LIZLLL() && (gVar.LLLILZJ instanceof C1663310tNx)) {
            gVar.T8();
        }
        gVar.o8();
    }
}
