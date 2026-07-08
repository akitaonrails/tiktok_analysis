package com.ss.android.ugc.aweme.dmt_integration;

import X.C07M1;
import X.C07OR;
import X.C09E5;
import X.C09E7;
import X.C09FN;
import X.C09FO;
import X.C09FQ;
import X.C0C64;
import X.C0CD2;
import X.C0CHQ;
import X.C0L4D;
import X.C0L78;
import X.C0MB2;
import X.C12V9;
import X.C12VA;
import X.C12VC;
import X.C12VD;
import X.C139V;
import X.C13QW;
import X.C1403010mc7;
import X.C1411560mpu;
import X.C1442090nd9;
import X.C1448790nnx;
import X.C1463330oBP;
import X.C15OW;
import X.C1638280sja;
import X.C1660660tJg;
import X.C1660670tJh;
import X.C1660680tJi;
import X.C1663470tOD;
import X.C1785606z0;
import X.C1827607Du;
import X.C1933907hp;
import X.C19730012Hi;
import X.C19736612Jw;
import X.C1ETF;
import X.C20007913Qf;
import X.C20510015Ni;
import X.C21366318jV;
import X.C21366618jY;
import X.C2206701BYe;
import X.C2208851Bch;
import X.C2219091BtD;
import X.C2219151BtJ;
import X.C2219161BtK;
import X.C2219191BtN;
import X.C2219201BtO;
import X.C2219211BtP;
import X.C2219221BtQ;
import X.C2219291BtX;
import X.C2219381Btg;
import X.C2219411Btj;
import X.C2281251EQx;
import X.C2400609au;
import X.C2471909mP;
import X.C2539009xE;
import X.C263130ASx;
import X.C297850Blv;
import X.C303630BvF;
import X.C311070CHh;
import X.C311100CHk;
import X.C527920Kn8;
import X.C799570VYd;
import X.C823050WQl;
import X.C855640XhS;
import X.C860680Xpa;
import X.C861730XrH;
import X.InterfaceC1411570mpv;
import X.InterfaceC1447070nlB;
import X.InterfaceC1448800nny;
import X.InterfaceC1463990oCT;
import X.InterfaceC1609810rzf;
import X.InterfaceC1656280tCc;
import X.InterfaceC21358518iF;
import X.InterfaceC2140108Zz;
import X.InterfaceC2217461Bqa;
import X.InterfaceC234100vL;
import X.InterfaceC2401109az;
import X.InterfaceC2401609b4;
import X.InterfaceC2472209mS;
import X.InterfaceC420801kM;
import X.InterfaceC540790LIv;
import android.app.Application;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.modeo.IModeoInit;
import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.port.in.IHashTagService;
import com.ss.android.ugc.aweme.service.IToolsCameraAudioSecurityCheckService;
import com.ss.android.ugc.aweme.services.IAVInitializer;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.RuntimeBehaviorServiceDiff;
import com.ss.android.ugc.aweme.services.sparrow.DmtSparrowServiceImpl;
import com.ss.android.ugc.aweme.setting.performance.EPEffectReadyOpt;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS190S0000000_4;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class AVInitializerImpl implements IAVInitializer {
    public static boolean LIZIZ;
    public boolean LIZ;

    @Override // com.ss.android.ugc.aweme.services.IAVInitializer
    public final void updateAB() {
        Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeInt("creative_tools_album_opti_2021_10", C0C64.LJIILLIIL().LJIJ(31744, 0, "creative_tools_album_opti_2021_10", true));
    }

    public static void LIZ(Function0 function0) {
        C2219151BtJ c2219151BtJ = new C2219151BtJ(function0);
        C2219161BtK c2219161BtK = C2219201BtO.LIZIZ;
        c2219161BtK.LJII = c2219151BtJ;
        C12VC c12vc = new C12VC();
        C12VD c12vd = C2219201BtO.LIZJ;
        c12vd.LIZLLL = c12vc;
        C2219191BtN c2219191BtN = new C2219191BtN();
        C21366618jY c21366618jY = C2219201BtO.LIZLLL;
        c21366618jY.LIZIZ = c2219191BtN;
        C2219291BtX c2219291BtX = new C2219291BtX();
        final C2219211BtP c2219211BtP = C2219201BtO.LJ;
        c2219211BtP.LIZIZ = c2219291BtX;
        boolean zBooleanValue = ((Boolean) C2539009xE.LIZIZ.getValue()).booleanValue();
        if (C2219201BtO.LIZ.compareAndSet(false, true)) {
            C2219091BtD.LIZ.getClass();
            C2219091BtD.LJIIIZ = c2219161BtK;
            C2471909mP.LJII = new InterfaceC2472209mS() { // from class: X.1Btf
                @Override // X.InterfaceC2472209mS
                public final Application getApplication() {
                    return C2219091BtD.LIZ();
                }
            };
            if (!zBooleanValue) {
                c2219161BtK.LJIIJ();
                Application application = c2219161BtK.LIZ;
                if (application != null) {
                    C1663470tOD c1663470tOD = C2219091BtD.LIZJ;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C2219091BtD.LIZIZ;
                    c1663470tOD.LLILLJJLI = application;
                    C2471909mP.LIZ.getClass();
                    C1663470tOD c1663470tOD2 = C2471909mP.LIZJ;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C2471909mP.LIZIZ;
                    c1663470tOD2.LLILLJJLI = application;
                }
                c2219161BtK.LJIIJ();
                Boolean bool = c2219161BtK.LIZIZ;
                if (bool != null) {
                    boolean zBooleanValue2 = bool.booleanValue();
                    C1663470tOD c1663470tOD3 = C2219091BtD.LIZLLL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr3 = C2219091BtD.LIZIZ;
                    c1663470tOD3.LLILLJJLI = Boolean.valueOf(zBooleanValue2);
                }
                c2219161BtK.LJIIJ();
                Gson gson = c2219161BtK.LJ;
                if (gson != null) {
                    C1663470tOD c1663470tOD4 = C2219091BtD.LJFF;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr4 = C2219091BtD.LIZIZ;
                    c1663470tOD4.LLILLJJLI = gson;
                }
                c2219161BtK.LJIIJ();
                InterfaceC2140108Zz interfaceC2140108Zz = c2219161BtK.LJFF;
                if (interfaceC2140108Zz != null) {
                    C1663470tOD c1663470tOD5 = C2219091BtD.LJI;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr5 = C2219091BtD.LIZIZ;
                    c1663470tOD5.LLILLJJLI = interfaceC2140108Zz;
                }
                c2219161BtK.LJIIJ();
                InterfaceC1656280tCc interfaceC1656280tCc = c2219161BtK.LJI;
                if (interfaceC1656280tCc != null) {
                    C1663470tOD c1663470tOD6 = C2219091BtD.LJII;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr6 = C2219091BtD.LIZIZ;
                    c1663470tOD6.LLILLJJLI = interfaceC1656280tCc;
                }
            }
            C21366318jV.LIZLLL.getClass();
            C21366318jV.LJFF = c2219161BtK;
            if (!zBooleanValue) {
                c2219161BtK.LJIIJ();
                InterfaceC21358518iF interfaceC21358518iF = c2219161BtK.LIZLLL;
                if (interfaceC21358518iF != null) {
                    C1663470tOD<InterfaceC21358518iF> c1663470tOD7 = C21366318jV.LJ;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr7 = C1638280sja.LIZ;
                    c1663470tOD7.LLILLJJLI = interfaceC21358518iF;
                }
            }
            C19736612Jw.LIZ.getClass();
            C19736612Jw.LJ = c12vd;
            if (!zBooleanValue) {
                c12vd.LJI();
                Function0<? extends Typeface> function02 = c12vd.LIZIZ;
                if (function02 != null) {
                    C1663470tOD c1663470tOD8 = C19736612Jw.LIZLLL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr8 = C19736612Jw.LIZIZ;
                    c1663470tOD8.LLILLJJLI = function02;
                }
                c12vd.LJI();
                InterfaceC1609810rzf interfaceC1609810rzf = c12vd.LIZ;
                if (interfaceC1609810rzf != null) {
                    C1663470tOD c1663470tOD9 = C19736612Jw.LIZJ;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr9 = C19736612Jw.LIZIZ;
                    c1663470tOD9.LLILLJJLI = interfaceC1609810rzf;
                }
            }
            C12V9.LJIILIIL = c12vd;
            if (!zBooleanValue && C12V9.LJIILJJIL.compareAndSet(false, true)) {
                c12vd.LJI();
                Function1<? super C12V9, Unit> function1 = c12vd.LIZJ;
                if (function1 != null) {
                    function1.invoke(C12VA.LIZ());
                }
            }
            C2219091BtD.LJIIJ = c21366618jY;
            if (!zBooleanValue) {
                InterfaceC1463990oCT logger = c21366618jY.getLogger();
                if (logger != null) {
                    C1663470tOD c1663470tOD10 = C2219091BtD.LJIIIIZZ;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr10 = C2219091BtD.LIZIZ;
                    c1663470tOD10.LLILLJJLI = logger;
                }
                c2219211BtP.LIZIZ();
                Function1<? super C09FQ, Unit> function12 = c2219211BtP.LIZ;
                if (function12 != null) {
                    function12.invoke(C09FN.LIZ);
                }
                c2219211BtP.LIZIZ();
            } else {
                C09FN.LIZ.LIZJ = new InterfaceC234100vL() { // from class: X.1BtZ
                    @Override // X.InterfaceC234100vL
                    public final void LIZ(C09FQ c09fq) {
                        C2219211BtP c2219211BtP2 = c2219211BtP;
                        c2219211BtP2.LIZIZ();
                        Function1<? super C09FQ, Unit> function13 = c2219211BtP2.LIZ;
                        if (function13 != null) {
                            function13.invoke(c09fq);
                        }
                    }
                };
                C09FO.LIZ.LIZJ = new InterfaceC234100vL() { // from class: X.1Bte
                    @Override // X.InterfaceC234100vL
                    public final void LIZ(C09FQ c09fq) {
                        c2219211BtP.LIZIZ();
                    }
                };
            }
            c2219211BtP.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IAVInitializer
    public final void initAVEnv(Application application) {
        if (!this.LIZ) {
            application.getClass();
            C0CHQ.LIZ = application;
            C303630BvF.LIZ = new C2219221BtQ(application);
            C1403010mc7.LIZ = new InterfaceC1447070nlB() { // from class: X.1DsV
                public final C01GW LIZ = C452501pT.LIZIZ(new C2269221Drs());
                public final C01GW LIZIZ = C452501pT.LIZIZ(new C2219651Bu7());
                public final C01GW LIZJ = C452501pT.LIZIZ(new C2269251Drv());
                public final C01GW LIZLLL = C452501pT.LIZIZ(new C2269181Dro());
                public final C01GW LJ = C452501pT.LIZIZ(new C2269511DsL());

                /* JADX WARN: Type inference failed for: r0v0, types: [X.0nlD] */
                @Override // X.InterfaceC1447070nlB
                public final C1447090nlD LIZ() {
                    return new Object() { // from class: X.0nlD
                    };
                }

                @Override // X.InterfaceC1447070nlB
                public final C568790MSn LIZIZ() {
                    return new C568790MSn();
                }

                @Override // X.InterfaceC1447070nlB
                public final C856040Xi6 LIZLLL() {
                    return new C856040Xi6();
                }

                @Override // X.InterfaceC1447070nlB
                public final C0LH7 LJ() {
                    return (C0LH7) this.LIZJ.getValue();
                }

                @Override // X.InterfaceC1447070nlB
                public final InterfaceC1429130nIF LJFF() {
                    return (InterfaceC1429130nIF) this.LJ.getValue();
                }

                @Override // X.InterfaceC1447070nlB
                public final DmtSparrowServiceImpl LJII() {
                    return new DmtSparrowServiceImpl();
                }

                @Override // X.InterfaceC1447070nlB
                public final InterfaceC524700Khw LJIIIIZZ() {
                    return (InterfaceC524700Khw) this.LIZLLL.getValue();
                }

                @Override // X.InterfaceC1447070nlB
                public final C1441380nc0 LJIIIZ() {
                    return new C1441380nc0();
                }

                public final IAVServiceProxy LJIIJ() {
                    return (IAVServiceProxy) this.LIZ.getValue();
                }

                @Override // X.InterfaceC1447070nlB
                public final IAnotherMusicService getMusicService() {
                    return (IAnotherMusicService) this.LIZIZ.getValue();
                }

                @Override // X.InterfaceC1447070nlB
                public final InterfaceC1434690nRD LIZJ() {
                    return LJIIJ().getAVConverter();
                }

                @Override // X.InterfaceC1447070nlB
                public final InterfaceC2269521DsM LJI() {
                    return LJIIJ().getABService();
                }

                @Override // X.InterfaceC1447070nlB
                public final InterfaceC376620Epg getApplicationService() {
                    return LJIIJ().getApplicationService();
                }

                @Override // X.InterfaceC1447070nlB
                public final InterfaceC580190MpF getBridgeService() {
                    return LJIIJ().getBridgeService();
                }

                @Override // X.InterfaceC1447070nlB
                public final InterfaceC555500LqW getBusinessGoodsService() {
                    return LJIIJ().getBusinessGoodsService();
                }

                @Override // X.InterfaceC1447070nlB
                public final InterfaceC856880XjS getCaptionMentionService() {
                    return LJIIJ().getCaptionMentionService();
                }

                @Override // X.InterfaceC1447070nlB
                public final InterfaceC194468116k getChallengeService() {
                    return LJIIJ().getDmtChallengeService();
                }

                @Override // X.InterfaceC1447070nlB
                public final InterfaceC1631430sYX getCommerceService() {
                    return LJIIJ().getCommerceService();
                }

                @Override // X.InterfaceC1447070nlB
                public final IHashTagService getHashTagService() {
                    return LJIIJ().getHashTagService();
                }

                @Override // X.InterfaceC1447070nlB
                public final InterfaceC1655090tAh getLiveService() {
                    return LJIIJ().getLiveService();
                }

                @Override // X.InterfaceC1447070nlB
                public final InterfaceC1439690nZH getPublishService() {
                    return LJIIJ().getPublishService();
                }

                @Override // X.InterfaceC1447070nlB
                public final InterfaceC1420020n3Y getRegionService() {
                    return LJIIJ().getRegionService();
                }

                @Override // X.InterfaceC1447070nlB
                public final InterfaceC1447080nlC getShareService() {
                    return LJIIJ().getShareService();
                }

                @Override // X.InterfaceC1447070nlB
                public final InterfaceC855410Xh5 getSpService() {
                    return LJIIJ().getSpService();
                }

                @Override // X.InterfaceC1447070nlB
                public final InterfaceC855700XhY getSyncShareService() {
                    return LJIIJ().getSyncShareService();
                }

                @Override // X.InterfaceC1447070nlB
                public final InterfaceC1402500mbI getWikiService() {
                    return LJIIJ().getWikiService();
                }
            };
            this.LIZ = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IAVInitializer
    public final void initMonitor(Application application) {
        final C139V c139v = C861730XrH.LIZ;
        c139v.getClass();
        if (application != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (!c139v.LJ) {
                    final C1ETF c1etf = new C1ETF() { // from class: X.139W
                        @Override // X.C1ETF
                        public final void LIZ() {
                        }

                        @Override // X.C1ETF
                        public final void LIZIZ() {
                        }

                        @Override // X.C1ETF
                        public final void LIZJ() {
                        }

                        @Override // X.C1ETF
                        public final void LIZLLL() {
                        }

                        @Override // X.C1ETF
                        public final void LJ() {
                        }

                        @Override // X.C1ETF
                        public final void LJFF() {
                        }

                        @Override // X.C1ETF
                        public final void LJI() {
                        }

                        @Override // X.C1ETF
                        public final void LJIIIIZZ() {
                        }

                        @Override // X.C1ETF
                        public final void LJIIIZ() {
                        }

                        @Override // X.C1ETF
                        public final void LJIIJ() {
                        }

                        @Override // X.C1ETF
                        public final void LJIIJJI() {
                        }

                        @Override // X.C1ETF
                        public final void LJIIL() {
                        }

                        @Override // X.C1ETF
                        public final void LJIILIIL() {
                        }

                        @Override // X.C1ETF
                        public final void LJIILJJIL() {
                        }

                        @Override // X.C1ETF
                        public final void LJIILL() {
                        }

                        @Override // X.C1ETF
                        public final void onPaused() {
                        }

                        @Override // X.C1ETF
                        public final void onStopped() {
                            C139V c139v2 = c139v;
                            int i = c139v2.LIZLLL - 1;
                            c139v2.LIZLLL = i;
                            if (i == 0) {
                                c139v2.LIZLLL(2);
                            }
                        }

                        @Override // X.C1ETF
                        public final void LJII(AbstractC1387200mCc abstractC1387200mCc) {
                            c139v.LIZJ(new C1688830u37(abstractC1387200mCc, (byte) 2));
                            c139v.LIZ.remove(abstractC1387200mCc);
                        }

                        @Override // X.C1ETF
                        public final void LJIILLIIL(AbstractC1387200mCc abstractC1387200mCc) {
                            C139V c139v2 = c139v;
                            int i = c139v2.LIZLLL + 1;
                            c139v2.LIZLLL = i;
                            if (i == 1) {
                                c139v2.LIZLLL(1);
                            }
                            c139v.LIZJ(new C1688830u37(abstractC1387200mCc, (byte) 3));
                        }

                        @Override // X.C1ETF
                        public final void LJIIZILJ(AbstractC1387200mCc abstractC1387200mCc) {
                            c139v.LIZJ(new C1688830u37(abstractC1387200mCc, (byte) 5));
                        }

                        @Override // X.C1ETF
                        public final void LJIJ(C813430VvZ c813430VvZ) {
                            c139v.LIZJ(new C1688830u37(c813430VvZ.LIZ, (byte) 1));
                            c139v.LIZ.add(c813430VvZ.LIZ);
                        }
                    };
                    new InterfaceC420801kM(c1etf) { // from class: X.15xY
                        public boolean LL;
                        public final C1ETE LLILLJJLI;

                        @Override // X.InterfaceC420801kM
                        public final void dispose() {
                            synchronized (this.LLILLJJLI) {
                                try {
                                    SAFExtensionKt.LJJIIJ(this.LLILLJJLI);
                                    this.LL = true;
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }

                        @Override // X.InterfaceC420801kM
                        public final boolean isDisposed() {
                            boolean z;
                            synchronized (this.LLILLJJLI) {
                                try {
                                    z = this.LL;
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                            return z;
                        }

                        /* JADX WARN: Type inference failed for: r0v0, types: [X.1BlQ, X.1ETE] */
                        {
                            ?? r0 = new InterfaceC2214261BlQ(c1etf) { // from class: X.1ETE
                                public final C1ETF LIZ;

                                @Override // X.InterfaceC2214261BlQ
                                public final void LJII(AbstractC1387200mCc abstractC1387200mCc) {
                                }

                                @Override // X.InterfaceC2214261BlQ
                                public final void LJIIL(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                                }

                                {
                                    this.LIZ = c1etf;
                                }

                                @Override // X.InterfaceC2214261BlQ
                                public final void LIZIZ(AbstractC1387200mCc abstractC1387200mCc) {
                                    this.LIZ.onPaused();
                                }

                                @Override // X.InterfaceC2214261BlQ
                                public final void LIZJ(AbstractC1387200mCc abstractC1387200mCc) {
                                    this.LIZ.LJIIZILJ(abstractC1387200mCc);
                                }

                                @Override // X.InterfaceC2214261BlQ
                                public final void LIZLLL(AbstractC1387200mCc abstractC1387200mCc) {
                                    this.LIZ.onStopped();
                                }

                                @Override // X.InterfaceC2214261BlQ
                                public final void LJ(AbstractC1387200mCc abstractC1387200mCc) {
                                    this.LIZ.LJII(abstractC1387200mCc);
                                }

                                @Override // X.InterfaceC2214261BlQ
                                public final void LJFF(AbstractC1387200mCc abstractC1387200mCc) {
                                    this.LIZ.LJIILIIL();
                                }

                                @Override // X.InterfaceC2214261BlQ
                                public final void LJIIIIZZ(AbstractC1387200mCc abstractC1387200mCc) {
                                    this.LIZ.LJIILL();
                                }

                                @Override // X.InterfaceC2214261BlQ
                                public final void LJIIIZ(AbstractC1387200mCc abstractC1387200mCc) {
                                    this.LIZ.LJIILJJIL();
                                }

                                @Override // X.InterfaceC2214261BlQ
                                public final void LJIIJJI(AbstractC1387200mCc abstractC1387200mCc) {
                                    this.LIZ.LJ();
                                }

                                @Override // X.InterfaceC2214261BlQ
                                public final void LJIILJJIL(AbstractC1387200mCc abstractC1387200mCc) {
                                    this.LIZ.LJIILLIIL(abstractC1387200mCc);
                                }

                                @Override // X.InterfaceC2214261BlQ
                                public final void LJIILL(AbstractC1387200mCc abstractC1387200mCc) {
                                    this.LIZ.LJIIL();
                                }

                                @Override // X.InterfaceC2214261BlQ
                                public final void LJIJI(AbstractC1387200mCc abstractC1387200mCc) {
                                    this.LIZ.LJIIJ();
                                }

                                @Override // X.InterfaceC2214261BlQ
                                public final void LJIJJ(AbstractC1387200mCc abstractC1387200mCc) {
                                    this.LIZ.LIZ();
                                }

                                @Override // X.InterfaceC2214261BlQ
                                public final void LJIJJLI(AbstractC1387200mCc abstractC1387200mCc) {
                                    this.LIZ.LJIIIIZZ();
                                }

                                @Override // X.InterfaceC2214261BlQ
                                public final void LJIL(AbstractC1387200mCc abstractC1387200mCc) {
                                    this.LIZ.LJIIIZ();
                                }

                                @Override // X.InterfaceC2214261BlQ
                                public final void LJJ(AbstractC1387200mCc abstractC1387200mCc) {
                                    this.LIZ.LIZIZ();
                                }

                                @Override // X.InterfaceC2214261BlQ
                                public final void LJI(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                                    this.LIZ.LJI();
                                }

                                @Override // X.InterfaceC2214261BlQ
                                public final void LJIIJ(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                                    this.LIZ.LIZJ();
                                }

                                @Override // X.InterfaceC2214261BlQ
                                public final void LJIILIIL(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                                    this.LIZ.LJFF();
                                }

                                @Override // X.InterfaceC2214261BlQ
                                public final void LJIILLIIL(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                                    this.LIZ.LIZLLL();
                                }

                                @Override // X.InterfaceC2214261BlQ
                                public final void LJIIZILJ(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                                    this.LIZ.LJIJ(new C813430VvZ(abstractC1387200mCc, bundle));
                                }

                                @Override // X.InterfaceC2214261BlQ
                                public final void LJIJ(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                                    this.LIZ.LJIIJJI();
                                }
                            };
                            this.LLILLJJLI = r0;
                            SAFExtensionKt.LJIJI(r0);
                        }
                    };
                    c139v.LJ = true;
                    return;
                }
                return;
            }
            throw new IllegalStateException("CreativeActivityMonitor: init must call in main thread!");
        }
        throw new NullPointerException("CreativeActivityMonitor: can't init with null application!");
    }

    @Override // com.ss.android.ugc.aweme.services.IAVInitializer
    public final void initialize(Application application) {
        int openAlbumOptiGroup;
        boolean z;
        initAVEnv(application);
        if (((Boolean) C07M1.LIZIZ.getValue()).booleanValue()) {
            openAlbumOptiGroup = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("creative_tools_album_opti_2021_10", 0);
        } else {
            openAlbumOptiGroup = InterfaceC540790LIv.LJI.getOpenAlbumOptiGroup();
        }
        if (openAlbumOptiGroup != 0) {
            z = true;
        } else {
            z = false;
        }
        boolean zBooleanValue = ((Boolean) C263130ASx.LIZ.getValue()).booleanValue();
        C2400609au.LIZ = z;
        C2400609au.LIZIZ = zBooleanValue;
        C2471909mP.LJ = new InterfaceC2401109az() { // from class: X.0CHi
            @Override // X.InterfaceC2401109az
            public final boolean LIZ() {
                return C285600BHi.LIZ();
            }

            @Override // X.InterfaceC2401109az
            public final boolean LIZIZ() {
                return C0C64.LJIILLIIL().LJIIIZ(31744, "studio_filter_no_read_permission_media", true, false);
            }
        };
        C2471909mP.LIZLLL = new InterfaceC2401609b4() { // from class: X.15Q5
            @Override // X.InterfaceC2401609b4
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC2401609b4
            public final void LIZ(int i, String str) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FileAdapterAndroidR code:");
                sbLIZ.append(i);
                sbLIZ.append(", msg:");
                sbLIZ.append(str);
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("FileAdapterAndroidR code:");
                sbLIZ2.append(i);
                sbLIZ2.append(", msg:");
                sbLIZ2.append(str);
                sbLIZ2.append(", trace:");
                sbLIZ2.append(Log.getStackTraceString(new Throwable()));
                C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
            }
        };
        C1660680tJi.LIZ = new C0MB2();
        C1660670tJh.LIZ = new C0L4D();
        C1660660tJg.LIZ = new C1463330oBP();
        LIZIZ = true;
        C07OR.LIZ.getClass();
        if ((((Number) C07OR.LIZIZ.getValue()).intValue() & 1) == 1) {
            C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0CHg
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AVInitializerImpl@9dca.initialize$3");
                    try {
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AVInitializerImpl@9dca.initialize$3");
                }
            });
        } else {
            C303630BvF.LIZIZ.getValue();
        }
        LIZ(new C311070CHh());
        C1448790nnx.LIZLLL = new InterfaceC1448800nny() { // from class: X.1Bta
            @Override // X.InterfaceC1448800nny
            public final void LIZ(String str) {
                RuntimeBehaviorServiceDiff.INSTANCE.event(str);
            }

            @Override // X.InterfaceC1448800nny
            public final void event(String str, String str2) {
                RuntimeBehaviorServiceDiff.INSTANCE.event(str, str2);
            }
        };
        C1442090nd9.LIZIZ(application);
        C1411560mpu.LIZ = new InterfaceC1411570mpv() { // from class: X.1Btb
            @Override // X.InterfaceC1411570mpv
            public final void LIZ(double d, String str, boolean z2) {
                String str2;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", d);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C543670LTx c543670LTx = new C543670LTx();
                c543670LTx.LIZ.put("methodName", str);
                if (z2) {
                    str2 = "yes";
                } else {
                    str2 = "no";
                }
                c543670LTx.LIZ.put("is_nle", str2);
                C1637890six.LIZJ("nle_method_cost", jSONObject, c543670LTx.LJ());
            }
        };
        if (!C2208851Bch.LIZ() && !C2208851Bch.LIZIZ()) {
            C2206701BYe.LIZ(application).LIZIZ(0);
        } else {
            C2206701BYe.LIZ(application).LIZIZ(1);
        }
        ((IModeoInit) ServiceManager.get().getService(IModeoInit.class)).LIZJ();
        C20510015Ni.LIZIZ = C15OW.LIZ;
        C2281251EQx.LIZIZ = C860680Xpa.LIZ;
        C20007913Qf.LIZ = new C13QW() { // from class: X.13VK
            @Override // X.C13QW
            public final long LIZ() {
                return ((EPEffectReadyOpt.EffectReadyConfig) EPEffectReadyOpt.LIZIZ.getValue()).expirationTime;
            }

            @Override // X.C13QW
            public final boolean LIZIZ() {
                return ((EPEffectReadyOpt.EffectReadyConfig) EPEffectReadyOpt.LIZIZ.getValue()).enable;
            }
        };
        C2219411Btj.LIZ = C297850Blv.LIZ;
        C19730012Hi.LIZIZ = new C2219381Btg();
        C09E5.LIZ = C09E7.LIZ;
        C0L78 c0l78 = new C0L78();
        ArrayList arrayList = (ArrayList) C855640XhS.LIZ;
        arrayList.remove(c0l78);
        arrayList.add(c0l78);
        C527920Kn8 c527920Kn8 = new C527920Kn8();
        arrayList.remove(c527920Kn8);
        arrayList.add(c527920Kn8);
        if (C1827607Du.LJIIIZ(AFwS190S0000000_4.get$arr$(3586), C1785606z0.LIZ())) {
            if (((Number) C0CD2.LJIILLIIL.getValue()).intValue() == 1) {
                C799570VYd.LJFF(false).execute(new Runnable() { // from class: X.15Q3
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("AVInitializerImpl@9dca.initialize$7");
                        try {
                            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).specialPlusService().isNeedShowSpecialPlusDirect();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("AVInitializerImpl@9dca.initialize$7");
                    }
                });
            } else {
                ((IExternalService) ServiceManager.get().getService(IExternalService.class)).specialPlusService().isNeedShowSpecialPlusDirect();
            }
        }
        if (C1933907hp.LIZ()) {
            ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IAVInitializer
    public final void initializeLite(Application application) {
        initAVEnv(application);
        C1660680tJi.LIZ = new C0MB2();
        C1660670tJh.LIZ = new C0L4D();
        C1660660tJg.LIZ = new C1463330oBP();
        LIZIZ = true;
        LIZ(new C311100CHk());
        C1448790nnx.LIZLLL = new InterfaceC1448800nny() { // from class: X.1Btd
            @Override // X.InterfaceC1448800nny
            public final void LIZ(String str) {
                RuntimeBehaviorServiceDiff.INSTANCE.event(str);
            }

            @Override // X.InterfaceC1448800nny
            public final void event(String str, String str2) {
                RuntimeBehaviorServiceDiff.INSTANCE.event(str, str2);
            }
        };
        C1442090nd9.LIZIZ(application);
        C1411560mpu.LIZ = new InterfaceC1411570mpv() { // from class: X.1Btc
            @Override // X.InterfaceC1411570mpv
            public final void LIZ(double d, String str, boolean z) {
                String str2;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", d);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C543670LTx c543670LTx = new C543670LTx();
                c543670LTx.LIZ.put("methodName", str);
                if (z) {
                    str2 = "yes";
                } else {
                    str2 = "no";
                }
                c543670LTx.LIZ.put("is_nle", str2);
                C1637890six.LIZJ("nle_method_cost", jSONObject, c543670LTx.LJ());
            }
        };
        C20510015Ni.LIZIZ = C15OW.LIZ;
        C2281251EQx.LIZIZ = C860680Xpa.LIZ;
        C2219411Btj.LIZ = C297850Blv.LIZ;
        C19730012Hi.LIZIZ = new C2219381Btg();
        C09E5.LIZ = C09E7.LIZ;
        C0L78 c0l78 = new C0L78();
        ArrayList arrayList = (ArrayList) C855640XhS.LIZ;
        arrayList.remove(c0l78);
        arrayList.add(c0l78);
        C527920Kn8 c527920Kn8 = new C527920Kn8();
        arrayList.remove(c527920Kn8);
        arrayList.add(c527920Kn8);
    }

    @Override // com.ss.android.ugc.aweme.services.IAVInitializer
    public final void runAfterFeed(Application application) {
        C2471909mP.LJ = new InterfaceC2401109az() { // from class: X.0CHj
            @Override // X.InterfaceC2401109az
            public final boolean LIZ() {
                return C285600BHi.LIZ();
            }

            @Override // X.InterfaceC2401109az
            public final boolean LIZIZ() {
                return C0C64.LJIILLIIL().LJIIIZ(31744, "studio_filter_no_read_permission_media", true, false);
            }
        };
        C2471909mP.LIZLLL = new InterfaceC2401609b4() { // from class: X.15Q4
            @Override // X.InterfaceC2401609b4
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC2401609b4
            public final void LIZ(int i, String str) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FileAdapterAndroidR code:");
                sbLIZ.append(i);
                sbLIZ.append(", msg:");
                sbLIZ.append(str);
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("FileAdapterAndroidR code:");
                sbLIZ2.append(i);
                sbLIZ2.append(", msg:");
                sbLIZ2.append(str);
                sbLIZ2.append(", trace:");
                sbLIZ2.append(Log.getStackTraceString(new Throwable()));
                C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
            }
        };
        if (!C2208851Bch.LIZ() && !C2208851Bch.LIZIZ()) {
            C2206701BYe.LIZ(application).LIZIZ(0);
        } else {
            C2206701BYe.LIZ(application).LIZIZ(1);
        }
        if (C1827607Du.LJIIIZ(AFwS190S0000000_4.get$arr$(3586), C1785606z0.LIZ())) {
            if (((Number) C0CD2.LJIILLIIL.getValue()).intValue() == 1) {
                C799570VYd.LJFF(false).execute(new Runnable() { // from class: X.15Q2
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("AVInitializerImpl@9dca.runAfterFeed$3");
                        try {
                            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).specialPlusService().isNeedShowSpecialPlusDirect();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("AVInitializerImpl@9dca.runAfterFeed$3");
                    }
                });
            } else {
                ((IExternalService) ServiceManager.get().getService(IExternalService.class)).specialPlusService().isNeedShowSpecialPlusDirect();
            }
        }
        if (C1933907hp.LIZ()) {
            ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LIZ();
        }
    }
}
