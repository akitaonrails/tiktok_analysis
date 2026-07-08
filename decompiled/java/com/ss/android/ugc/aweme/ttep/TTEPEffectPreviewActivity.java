package com.ss.android.ugc.aweme.ttep;

import X.AbstractActivityC1655510tBN;
import X.AnonymousClass0801;
import X.C01GW;
import X.C0CHQ;
import X.C0CLW;
import X.C0IKQ;
import X.C0LAB;
import X.C0MBA;
import X.C0MGL;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1192870h9B;
import X.C1202330hOR;
import X.C1308910kAL;
import X.C1409940mnI;
import X.C1429380nIe;
import X.C1436840nUg;
import X.C1439190nYT;
import X.C1440005kM;
import X.C1441530ncF;
import X.C1443030nef;
import X.C1443540nfU;
import X.C1444920nhi;
import X.C1448130nmt;
import X.C1448790nnx;
import X.C1458410o3T;
import X.C1459710o5Z;
import X.C14EU;
import X.C14LN;
import X.C1514430pVp;
import X.C15R5;
import X.C1624360sN8;
import X.C1630980sXo;
import X.C1642810sqt;
import X.C1645790svh;
import X.C1649720t22;
import X.C1653550t8D;
import X.C1654320t9S;
import X.C1655520tBO;
import X.C1655580tBU;
import X.C1655670tBd;
import X.C1656700tDI;
import X.C1656770tDP;
import X.C1664590tQ1;
import X.C1664600tQ2;
import X.C1688700u2u;
import X.C1697810uHb;
import X.C1699250uJv;
import X.C1701330uNH;
import X.C19221910Hx;
import X.C19286810cs;
import X.C19771112Xd;
import X.C19CA;
import X.C19EH;
import X.C1A66;
import X.C1DI6;
import X.C1DMD;
import X.C1DPV;
import X.C1DRG;
import X.C201955140j;
import X.C20684815ws;
import X.C214873197f;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2265108u9;
import X.C298010BmB;
import X.C299020Bno;
import X.C306720C0o;
import X.C335910DEv;
import X.C524780Ki4;
import X.C540290LGx;
import X.C565610MGh;
import X.C569770MWh;
import X.C579670MoP;
import X.C786410Ut5;
import X.C855640XhS;
import X.EnumC1584370rKd;
import X.EnumC194317110p;
import X.EnumC2249681D3m;
import X.EnumC335920DEw;
import X.InterfaceC1621970sJH;
import X.InterfaceC1622600sKI;
import X.InterfaceC1624140sMm;
import X.InterfaceC1624370sN9;
import X.InterfaceC1635410sex;
import X.InterfaceC1642910sr3;
import X.InterfaceC1647420syK;
import X.InterfaceC1648570t0B;
import X.InterfaceC1648870t0f;
import X.InterfaceC1650070t2b;
import X.InterfaceC1650180t2m;
import X.InterfaceC1655610tBX;
import X.InterfaceC214877197j;
import X.InterfaceC2177841ALe;
import X.InterfaceC2254081DKk;
import X.InterfaceC362610EJn;
import X.InterfaceC376620Epg;
import X.InterfaceC484050IyZ;
import X.InterfaceC524950KiL;
import X.InterfaceC535600KzW;
import X.InterfaceC579050MnP;
import Y.AObjectS245S0100000_22;
import Y.AObjectS246S0100000_25;
import Y.AObjectS399S0100000_25;
import Y.AObserverS225S0100000_22;
import Y.ARunnableS125S0100000_25;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.scene.Scene;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService;
import com.ss.android.ugc.aweme.creative.model.MicroAppModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.mediaselector.IPreDownloadMusic;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.property.BrightnessManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.servicimpl.TTEPPageFactoryDelegate;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.ui.AudioFocusManager;
import com.ss.android.ugc.aweme.shortvideo.ui.b;
import com.ss.android.ugc.aweme.shortvideo.ui.task.CacheChooseMediaViewHolderTask;
import com.ss.android.ugc.aweme.shortvideo.ui.task.PreloadMediaDataTask;
import com.ss.android.ugc.aweme.shortvideo.ui.task.RecordTaskManager;
import com.ss.android.ugc.aweme.shortvideo.ui.task.g;
import com.ss.android.ugc.aweme.shortvideo.util.j;
import com.ss.android.ugc.aweme.shortvideo.x2;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment;
import com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import com.ss.android.vesdk.runtime.VEMem;
import com.zhiliaoapp.musically.R;
import dtj.u7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jgp.h;
import jgp.t;
import jgp.u;
import jgp.w;
import joo.f;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import ln3.a;
import lnn.q;
import lth.o;
import mn3.e0;
import nv7.c0;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes26.dex */
public class TTEPEffectPreviewActivity extends AbstractActivityC1655510tBN implements InterfaceC524950KiL, InterfaceC1650180t2m, IPreDownloadMusic, InterfaceC535600KzW, InterfaceC1650070t2b {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjE4LDHELIOS99HBEJGQo1LiAvPR8hLTMlLDgSKzElPyYnMQ==";
    public C1DRG LLIZLLLIL;
    public InterfaceC1647420syK LLJ;
    public ShortVideoContext LLJI;
    public InterfaceC2177841ALe LLJILLL;
    public FrameLayout LLJJ;
    public FrameLayout LLJJI;
    public View LLJJIII;
    public FrameLayout LLJJIJI;
    public List<String> LLJJIJIIJIL;
    public Effect LLJJIJIL;
    public boolean LLJJJ;
    public String LLJJJIL;
    public String LLJJJJ;
    public x2 LLJJJJLIIL;
    public InterfaceC1655610tBX LLJJL;
    public FrameLayout LLJLIL;
    public int LLJLL;
    public boolean LLJLLIL;
    public InterfaceC1624370sN9 LLJLLL;
    public e0 LLJZ;
    public InterfaceC1648570t0B LLJZIJLIL;
    public InterfaceC1621970sJH LLL;
    public a LLLF;
    public q LLLFF;
    public final List<InterfaceC484050IyZ> LLJIJIL = new ArrayList();
    public final List<InterfaceC362610EJn> LLJILJIL = new ArrayList();
    public final SafeHandler LLJILJILJ = new SafeHandler(this);
    public final C565610MGh LLJJJJJIL = new C565610MGh();
    public boolean LLJJLIIIJLLLLLLLZ = false;
    public boolean LLJL = false;
    public volatile boolean LLJLILLLLZIIL = true;

    @Override // X.InterfaceC524950KiL
    public final void AH(InterfaceC362610EJn interfaceC362610EJn) {
    }

    @Override // X.ActivityC214874197g
    public final boolean LLLLZIL() {
        return true;
    }

    @Override // X.InterfaceC1650070t2b
    public final String getTag() {
        return "TTEPEffectPreviewActivity";
    }

    @Override // com.ss.android.ugc.aweme.mediaselector.IPreDownloadMusic
    public final boolean isReEnterChoosePhoto() {
        return false;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.ss.android.ugc.aweme.mediaselector.IPreDownloadMusic
    public final void setIsChangeMusicDownloadSuccess(boolean z, MusicModel musicModel, String str) {
    }

    @Override // com.ss.android.ugc.aweme.mediaselector.IPreDownloadMusic
    public final void setIsReEnterChoosePhoto(boolean z) {
    }

    @Override // X.ActivityC214874197g
    public final C1202330hOR LLLLLZL() {
        C1192870h9B.LIZ.getClass();
        return C1192870h9B.LJII;
    }

    @Override // X.AbstractActivityC1674880tgc
    public final void LLLZ() {
        ShortVideoContext shortVideoContext = this.LLJI;
        if (shortVideoContext != null) {
            c0 c0Var = c0.LIZ;
            View view = this.LLJJIII;
            CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
            c0Var.q2(cameraComponentModel.mVideoWidth, cameraComponentModel.mVideoHeight, view);
        }
    }

    public final q LLZLLLL() {
        if (this.LLLFF == null) {
            this.LLLFF = (q) this.LLIZLLLIL.LJIIL(null, q.class);
        }
        return this.LLLFF;
    }

    public final InterfaceC579050MnP LLZZ() {
        return (InterfaceC579050MnP) this.LLJJJJLIIL.getDiContainer().LJIIL(null, InterfaceC579050MnP.class);
    }

    public final void LLZZZIL() {
        this.LLJZ.St2().rh(new C1DMD(new C579670MoP(this.LLJI.cameraComponentModel.mWorkspace)), this.LLJI.cameraComponentModel.mWorkspace.LJ().getAbsolutePath());
        this.LLJZ.js2();
    }

    @Override // X.ActivityC214874197g
    public final String getCreationId() {
        ShortVideoContext shortVideoContext = this.LLJI;
        if (shortVideoContext != null) {
            return shortVideoContext.getCreationId();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.mediaselector.IPreDownloadMusic
    public final IPreDownloadMusic.PreDownloadMusicData getPreDownloadMusicData() {
        return new IPreDownloadMusic.PreDownloadMusicData(null, null);
    }

    @Override // X.AbstractActivityC1674880tgc, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity", "onResume", true);
        C201955140j.LIZ("TTEPEffectPreviewActivity => onResume start");
        super.onResume();
        ShortVideoContext shortVideoContext = this.LLJI;
        if (shortVideoContext != null && shortVideoContext.mIsFromDraft) {
            C1440005kM.LIZ(new C0MBA());
        }
        this.LLJL = true;
        if (this.LLJJLIIIJLLLLLLLZ) {
            InterfaceC1624140sMm interfaceC1624140sMm = o.LJJI;
            interfaceC1624140sMm.getClass();
            interfaceC1624140sMm.getClass();
            this.LLJJLIIIJLLLLLLLZ = false;
        }
        if (u7.LJ()) {
            C0LAB c0lab = new C0LAB();
            c0lab.LJ(Scene.SCENE_SERVICE, "resume_record");
            c0lab.LJ("shoot_way", this.LLJI.shootWay);
            c0lab.LJ("creation_id", this.LLJI.getCreationId());
            c0lab.LJ("enter_from", this.LLJI.enterFrom);
            C1699250uJv.LLILLL.getClass();
            c0lab.LIZIZ(0L, "dalvikPss");
            c0lab.LIZIZ(0L, "nativePss");
            c0lab.LIZIZ(0L, "otherPss");
            c0lab.LIZIZ(0L, "totalPss");
            C20684815ws.LJIILLIIL("av_memory_log", c0lab.LIZ);
        }
        C201955140j.LIZ("TTEPEffectPreviewActivity => onResume end");
        C540290LGx.LIZ.LJIIJJI(this, new AObjectS399S0100000_25(this, 33));
        VEMem.getInstance().uploadVirtualMemSize(0);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity", "onResume", false);
    }

    @Override // X.AbstractActivityC1674880tgc, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity", "onStart", true);
        super.onStart();
        RecordTaskManager.LIZ(new jgp.q(), C298010BmB.LIZ());
        C01GW c01gw = BrightnessManager.LIZ;
        BrightnessManager.LIZ(this, this, C1655670tBd.LIZ);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity", "onStart", false);
    }

    public TTEPEffectPreviewActivity() {
        new ArrayList();
    }

    @Override // X.InterfaceC535600KzW
    public final FrameLayout LLIIZ() {
        return (FrameLayout) findViewById(R.id.szh);
    }

    public final void LLZLI() {
        if (isFinishing()) {
            return;
        }
        C524780Ki4.LIZ.step("av_video_record_init", "addFragment");
        C201955140j.LIZ("addFragment PlanC");
        InterfaceC1655610tBX interfaceC1655610tBX = this.LLJJL;
        if (interfaceC1655610tBX != null) {
            interfaceC1655610tBX.LIZ();
            this.LLJJL = null;
            C786410Ut5.LJJJJI((ViewGroup) findViewById(R.id.szh));
        }
        Intent intent = getIntent();
        this.LLJJJJLIIL = intent == null ? new x2(this.LLJI, null, this.LLIZLLLIL, new InterfaceC1642910sr3() { // from class: X.0sqv
            @Override // X.InterfaceC1642910sr3
            public final void LIZ(C19A3 c19a3) {
                String str = TTEPEffectPreviewActivity._pnsPageId;
                TTEPPageFactoryDelegate.LIZIZ().LIZ(c19a3);
            }
        }) : new x2(this.LLJI, LLLZZIL(intent), this.LLIZLLLIL, new InterfaceC1642910sr3() { // from class: X.0sqw
            @Override // X.InterfaceC1642910sr3
            public final void LIZ(C19A3 c19a3) {
                String str = TTEPEffectPreviewActivity._pnsPageId;
                TTEPPageFactoryDelegate.LIZIZ().LIZ(c19a3);
            }
        });
        this.LLJJJJLIIL.LLJJ = new ARunnableS125S0100000_25(this, 95);
        C214873197f c214873197fLIZ = C19CA.LIZ(this, x2.class);
        c214873197fLIZ.LJI = false;
        c214873197fLIZ.LJII = new InterfaceC214877197j() { // from class: X.0tBK
            @Override // X.InterfaceC214877197j
            public final Scene LIZ(ClassLoader classLoader, String str, Bundle bundle) {
                TTEPEffectPreviewActivity tTEPEffectPreviewActivity = this.LIZ;
                String str2 = TTEPEffectPreviewActivity._pnsPageId;
                tTEPEffectPreviewActivity.getClass();
                if (TextUtils.equals(x2.class.getName(), str)) {
                    return tTEPEffectPreviewActivity.LLJJJJLIIL;
                }
                return null;
            }
        };
        c214873197fLIZ.LIZLLL = false;
        c214873197fLIZ.LJ = false;
        c214873197fLIZ.LJFF = R.id.szh;
        this.LLJJL = c214873197fLIZ.LIZ();
    }

    @Override // X.AbstractActivityC1655510tBN, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        Intent intent;
        String strLLZ = LLZ(getIntent(), "backurl");
        Intent intent2 = getIntent();
        if (intent2 != null && intent2.getSerializableExtra("micro_app_info") != null) {
            MicroAppModel microAppModel = (MicroAppModel) getIntent().getSerializableExtra("micro_app_info");
            ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getMiniAppService();
            C19286810cs.LIZ(microAppModel.appId);
        }
        super.finish();
        if (this.LLJJJJLIIL != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                InterfaceC1648570t0B interfaceC1648570t0B = this.LLJZIJLIL;
                if (interfaceC1648570t0B != null) {
                    interfaceC1648570t0B.V2(false);
                }
            } else {
                runOnUiThread(new ARunnableS125S0100000_25(this, 94));
            }
        }
        if (!TextUtils.isEmpty(strLLZ) && (((intent = getIntent()) == null || intent.getSerializableExtra("micro_app_info") == null) && !TextUtils.isEmpty(strLLZ) && !TextUtils.equals("__BACKURL__", strLLZ))) {
            try {
                Uri uri = UriProtector.parse(strLLZ);
                Intent intent3 = new Intent();
                intent3.setData(uri);
                intent3.setAction("android.intent.action.VIEW");
                intent3.addCategory("android.intent.category.BROWSABLE");
                intent3.setComponent(null);
                intent3.setSelector(null);
                C2204961BRm.H(this, intent3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP68Zo+A6AZYRdhuANyXhKg8Q+TVGX5v8wTxCk9uow==", null));
                moveTaskToBack(true);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C569770MWh.LIZ(3, this);
    }

    @Override // X.AbstractActivityC1655510tBN, X.AbstractActivityC1674880tgc, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C1624360sN8.LIZ.clear();
        C1624360sN8.LIZIZ.clear();
        C1436840nUg c1436840nUg = new C1436840nUg(this);
        if (c1436840nUg.LIZJ().getBoolean("is_first_enter_record_page", true)) {
            c1436840nUg.LJ();
        }
        C1645790svh c1645790svh = C1645790svh.LIZJ;
        c1645790svh.LIZIZ = null;
        InterfaceC1635410sex interfaceC1635410sex = c1645790svh.LIZ;
        if (interfaceC1635410sex != null) {
            interfaceC1635410sex.destroy();
        }
        c1645790svh.LIZ = null;
        o.LJI.dl();
        C1458410o3T.LJIIJJI(false);
        this.LLJJJJLIIL = null;
        EventBus.LIZLLL().LJJI(this);
        C786410Ut5.LJLILLLLZI(C1699250uJv.LLILLL.LL, 1);
        C1448790nnx.LIZ = false;
        C1448790nnx.LIZIZ = false;
        C1448790nnx.LIZJ = false;
        AVCommerceServiceImpl.LJIIJ().LIZJ();
        C524780Ki4.LIZ.leave(this, "record");
        C2265108u9.LIZIZ();
        f.LIZ.getClass();
        f.LIZ(this);
        C1DPV.LIZIZ.LIZ.getClass();
        C1DI6.LIZIZ = null;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.LLJL = false;
        ShortVideoContext shortVideoContext = this.LLJI;
        if (shortVideoContext != null) {
            C524780Ki4.LIZ.pause(this, "record", shortVideoContext.shootWay, shortVideoContext.getCreationId());
        }
        VEMem.getInstance().uploadVirtualMemSize(1);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        InterfaceC1648570t0B interfaceC1648570t0B = this.LLJZIJLIL;
        if (interfaceC1648570t0B != null) {
            interfaceC1648570t0B.V2(false);
        }
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // X.InterfaceC535600KzW
    public final FrameLayout LJLLLL() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC1650180t2m
    public final InterfaceC2177841ALe LLIZLLLIL() {
        return this.LLJILLL;
    }

    public static Bundle LLLZZIL(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.AbstractActivityC1674880tgc
    public final void LLLLZLLLI(boolean z) {
        com.ss.android.ugc.aweme.shortvideo.component.a aVarLLLLILI;
        x2 x2Var = this.LLJJJJLIIL;
        if (x2Var != null && (aVarLLLLILI = x2Var.LLLLILI()) != null) {
            aVarLLLLILI.gX1(z);
        }
    }

    @Override // X.AbstractActivityC1674880tgc
    public final void LLLZIL(boolean z) {
        com.ss.android.ugc.aweme.shortvideo.component.a aVarLLLLILI;
        x2 x2Var = this.LLJJJJLIIL;
        if (x2Var != null && (aVarLLLLILI = x2Var.LLLLILI()) != null) {
            aVarLLLLILI.H90(z);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void LLZZLLIL(Bundle bundle) {
        List<String> list;
        String str;
        boolean z;
        boolean z2;
        if (bundle != null) {
            this.LLJI = (ShortVideoContext) bundle.getParcelable("save_state_short_video_context");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initData with outState,shortVideoContext is NULL:");
            if (this.LLJI == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            sbLIZ.append(z2);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.LLJI == null) {
            C0CHQ.LIZ().LJJIZ();
            this.LLJI = C1443540nfU.LIZJ(LLLZZIL(getIntent()), this, null);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("initData with intent,shortVideoContext is NULL:");
            if (this.LLJI == null) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ2.append(z);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (getIntent().getBooleanExtra("reuse_mvtheme_enter", false)) {
            this.LLJI.enterMvThemeEffect = (Effect) getIntent().getParcelableExtra("extra_mv_effect");
        }
        int intExtra = getIntent().getIntExtra("extra_ttep_enter_preview_page", 0);
        if (intExtra == 1) {
            ShortVideoContext shortVideoContext = this.LLJI;
            shortVideoContext.enterFrom = "effect_qr_scan";
            shortVideoContext.creativeModel.aigcOfflineModel.isCreatorPreview = true;
        } else if (intExtra == 2) {
            this.LLJI.enterFrom = "effect_internal_moderation";
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("This mode is not supported:");
            sbLIZ3.append(intExtra);
            throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ3));
        }
        if (C1448130nmt.LIZIZ) {
            C1448130nmt.LIZIZ = false;
            this.LLJI.creativeModel.recordMobModel.isColdStart = true;
        }
        this.LLJJJIL = LLZ(getIntent(), "extra_sticker_from");
        this.LLJJJJ = LLZ(getIntent(), "grade_key");
        ShortVideoContext shortVideoContext2 = this.LLJI;
        if (shortVideoContext2 != null && (str = shortVideoContext2.shootWay) != null) {
            String str2 = FaceStickerBean.sCurPropSource;
            switch (str.hashCode()) {
                case -1731750228:
                    if (str.equals("single_song")) {
                        str2 = "single_song";
                    }
                    break;
                case -1098262888:
                    if (str.equals("prop_reuse")) {
                        str2 = "prop_reuse";
                    }
                    break;
                case 3449699:
                    if (str.equals("prop")) {
                        str2 = "homepage_prop_maker";
                    }
                    break;
                case 3524221:
                    if (str.equals("scan")) {
                        str2 = "qr_code";
                    }
                    break;
                case 669986889:
                    if (str.equals("direct_shoot")) {
                        str2 = "direct_shoot";
                    }
                    break;
                case 1402633315:
                    if (str.equals("challenge")) {
                        str2 = "challenge";
                    }
                    break;
            }
            FaceStickerBean.sCurPropSource = str2;
        }
        C1443030nef c1443030nefLJII = C1443030nef.LJII();
        String str3 = this.LLJI.shootWay;
        c1443030nefLJII.LIZIZ = str3;
        c1443030nefLJII.LIZJ = str3;
        C1443030nef c1443030nefLJII2 = C1443030nef.LJII();
        ShortVideoContext shortVideoContext3 = this.LLJI;
        String str4 = shortVideoContext3.mShootFrom;
        c1443030nefLJII2.LIZIZ = str4;
        c1443030nefLJII2.LIZJ = str4;
        C1439190nYT.LJFF(shortVideoContext3.creativeInfo);
        ShortVideoContextViewModel shortVideoContextViewModel = (ShortVideoContextViewModel) ViewModelProviders.of(this).get(ShortVideoContextViewModel.class);
        ShortVideoContext shortVideoContext4 = this.LLJI;
        shortVideoContextViewModel.LL = shortVideoContext4;
        shortVideoContextViewModel.wQ2(shortVideoContext4.shootMode);
        this.LLJJJ = getIntent().getBooleanExtra("sticker_pannel_show", false);
        this.LLJJIJIIJIL = getIntent().getStringArrayListExtra("reuse_sticker_ids");
        this.LLJJIJIL = (Effect) getIntent().getParcelableExtra("first_sticker");
        LLZ(getIntent(), "update_effect_id");
        getIntent().getParcelableArrayListExtra("update_effect_extra");
        if (C0CLW.LIZIZ.LIZ.getStickerUpdateApp().booleanValue() && "direct_shoot".equals(this.LLJI.shootWay) && this.LLJJIJIL == null && ((list = this.LLJJIJIIJIL) == null || list.size() == 0)) {
            String strLIZIZ = o.LJIILLIIL.LIZIZ(this);
            if (!TextUtils.isEmpty(strLIZIZ)) {
                ArrayList arrayList = new ArrayList();
                this.LLJJIJIIJIL = arrayList;
                arrayList.add(strLIZIZ);
            }
        }
        if (!TextUtils.isEmpty(LLZ(getIntent(), "star_atlas_object"))) {
            this.LLJI.creativeModel.commerceModel.getTcmModel().setOuterTcmOrder(LLZ(getIntent(), "star_atlas_object"));
            ((ICommerceToolsTcmService) ServiceManager.get().getService(ICommerceToolsTcmService.class)).LJIILL(this.LLJI.creativeModel.commerceModel.getTcmModel());
        }
        String strLLZ = LLZ(getIntent(), "music_origin");
        ShortVideoContext shortVideoContext5 = this.LLJI;
        if (strLLZ == null) {
            strLLZ = "original";
        }
        shortVideoContext5.LJJLIIIJILLIZJL(strLLZ);
        C1409940mnI.LJI();
    }

    @Override // X.InterfaceC524950KiL
    public final void Qh(InterfaceC484050IyZ interfaceC484050IyZ) {
        ((ArrayList) this.LLJIJIL).add(interfaceC484050IyZ);
    }

    @Override // X.InterfaceC524950KiL
    public final void T4(InterfaceC484050IyZ interfaceC484050IyZ) {
        ((ArrayList) this.LLJIJIL).remove(interfaceC484050IyZ);
    }

    @Override // X.InterfaceC524950KiL
    public final void b8(InterfaceC362610EJn interfaceC362610EJn) {
        ((ArrayList) this.LLJILJIL).remove(interfaceC362610EJn);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            InterfaceC1648870t0f interfaceC1648870t0f = (InterfaceC1648870t0f) this.LLJJJJLIIL.getDiContainer().LJIIL(null, InterfaceC1648870t0f.class);
            if (interfaceC1648870t0f != null) {
                interfaceC1648870t0f.dismissSuperEntranceEvent();
            }
            InterfaceC1648870t0f interfaceC1648870t0f2 = (InterfaceC1648870t0f) this.LLJJJJLIIL.getDiContainer().LJIIL(null, InterfaceC1648870t0f.class);
            if (interfaceC1648870t0f2 != null) {
                interfaceC1648870t0f2.dismissUploadPopEntranceEvent();
            }
            InterfaceC1648870t0f interfaceC1648870t0f3 = (InterfaceC1648870t0f) this.LLJJJJLIIL.getDiContainer().LJIIL(null, InterfaceC1648870t0f.class);
            if (interfaceC1648870t0f3 != null) {
                interfaceC1648870t0f3.dismissLivePopupEvent();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // X.InterfaceC524950KiL
    public final void kF(InterfaceC362610EJn interfaceC362610EJn) {
        ((ArrayList) this.LLJILJIL).add(interfaceC362610EJn);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = this.LLJLL;
        int i2 = configuration.screenWidthDp;
        if (i != i2) {
            this.LLJLL = i2;
            c0 c0Var = c0.LIZ;
            View view = this.LLJJIII;
            CameraComponentModel cameraComponentModel = this.LLJI.cameraComponentModel;
            c0Var.q2(cameraComponentModel.mVideoWidth, cameraComponentModel.mVideoHeight, view);
        }
    }

    @Override // X.AbstractActivityC1655510tBN, X.AbstractActivityC1674880tgc, X.ActivityC214874197g, X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        long j;
        String creationId;
        int i;
        byte b;
        boolean z;
        boolean z2;
        AVMusic aVMusicExtractAVMusic;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity", "onCreate", true);
        C1DPV.LIZIZ.LIZ(EnumC2249681D3m.TTEP_PREVIEW);
        j jVar = C524780Ki4.LIZ;
        jVar.enter(this, "record");
        f fVar = f.LIZ;
        Intent intent = getIntent();
        fVar.getClass();
        f.LIZJ(this, intent, bundle);
        LLZZLLIL(bundle);
        jVar.step("av_video_record_init", "init recorderModule start");
        C15R5.LJI.LJIIIIZZ(this);
        ShortVideoContext shortVideoContext = this.LLJI;
        if (shortVideoContext != null && (aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel)) != null && aVMusicExtractAVMusic.getDuration() > 0) {
            this.LLJI.LJJLIIIJ(aVMusicExtractAVMusic.getDuration());
        }
        o.LIZLLL();
        C1654320t9S.LIZ(this, AFwS266S0000000_25.get$arr$(527));
        C1664590tQ1.LIZIZ(this, new AwS604S0100000_25(this, 783));
        C1664600tQ2.LIZIZ(this, new AwS604S0100000_25(this, 779));
        C1642810sqt.LIZ(C1664600tQ2.LIZLLL(this), "ttep_record_effect_preview");
        C1DRG c1drgLJFF = C1664600tQ2.LIZLLL(this).LJFF();
        this.LLIZLLLIL = c1drgLJFF;
        this.LLJZ = (e0) c1drgLJFF.LJII(e0.class, null);
        this.LLJZIJLIL = (InterfaceC1648570t0B) this.LLIZLLLIL.LJII(InterfaceC1648570t0B.class, null);
        this.LLL = (InterfaceC1621970sJH) this.LLIZLLLIL.LJII(InterfaceC1621970sJH.class, null);
        this.LLJ = (InterfaceC1647420syK) this.LLIZLLLIL.LJII(InterfaceC1647420syK.class, null);
        this.LLJILLL = this.LLJZ.Gz0();
        this.LLJJIII = this.LLJZ.getPreviewView();
        boolean zLIZ = new C1653550t8D(this.LLJI).LIZ();
        SafeHandler safeHandler = this.LLJILJILJ;
        ARunnableS125S0100000_25 aRunnableS125S0100000_25 = new ARunnableS125S0100000_25(this, 96);
        if (zLIZ) {
            j = 2000;
        } else {
            j = 0;
        }
        safeHandler.postDelayed(aRunnableS125S0100000_25, j);
        if (zLIZ) {
            this.LLJZ.PR(C1655520tBO.LIZIZ, true);
        }
        this.LLJZ.A31().LIZ(this, new AObjectS246S0100000_25(this, 719));
        this.LLJZ.PB(new C1441530ncF());
        this.LLJZ.qF1().observe(this, new AObserverS225S0100000_22(this, 179));
        InterfaceC2254081DKk interfaceC2254081DKkSt2 = this.LLJZ.St2();
        if (this.LLJI.getCreationId() == null) {
            creationId = "";
        } else {
            creationId = this.LLJI.getCreationId();
        }
        interfaceC2254081DKkSt2.setControllerCallback(new C19771112Xd(creationId));
        this.LLLF = (a) this.LLIZLLLIL.LJIIL(null, a.class);
        if (this.LLJI.LJJLL()) {
            InterfaceC2254081DKk interfaceC2254081DKkSt22 = this.LLJZ.St2();
            q qVarLLZLLLL = LLZLLLL();
            InterfaceC2177841ALe interfaceC2177841ALe = this.LLJILLL;
            e0 e0Var = this.LLJZ;
            C1DRG c1drg = this.LLIZLLLIL;
            e0Var.yj1().LIZ(this, new C1656700tDI(this, interfaceC2254081DKkSt22, qVarLLZLLLL, interfaceC2177841ALe, new C1656770tDP(e0Var, c1drg), c1drg, this).LLJJI);
        }
        this.LLJZ.O71().LIZ(this, new AObjectS245S0100000_22(this, 285));
        this.LLJZIJLIL.yK0().LIZ(this, new AObjectS246S0100000_25(this, 717));
        jVar.step("av_video_record_init", "init recorderModule end");
        C201955140j.LIZ("TTEPEffectPreviewActivity => onCreate start");
        C1443030nef.LJII().getClass();
        C1429380nIe.LIZ = false;
        jVar.step("av_video_record_init", "onCreate");
        RecordTaskManager.LIZ(new jgp.q(), C298010BmB.LIZ());
        RecordTaskManager.LIZ(new w(this), false);
        RecordTaskManager.LIZ(new u(), false);
        C0CHQ.LIZ().isDebugConfigOpen();
        C14LN.LIZ(this, this, C1655670tBd.LIZ);
        super.onCreate(bundle);
        if (getIntent().getIntExtra("translation_type", 0) == 3) {
            C569770MWh.LIZLLL(3, this);
        }
        getWindow().addFlags(128);
        setContentView(R.layout.ko);
        if (getResources().getConfiguration() != null) {
            i = getResources().getConfiguration().screenWidthDp;
        } else {
            i = 0;
        }
        this.LLJLL = i;
        if (!C1688700u2u.LIZ(this)) {
            C201955140j.LIZ("RecordConditionCheck.check() false");
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity", "onCreate", false);
            return;
        }
        if (C1655580tBU.LIZ()) {
            b = 15;
        } else {
            b = 7;
        }
        C1A66.LJFF(b);
        this.LLJJ = (FrameLayout) findViewById(R.id.tqy);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.mg3);
        this.LLJJI = frameLayout;
        frameLayout.addView(this.LLJZ.St2().getViewFunction().getView());
        jVar.step("av_video_record_init", "init stickerModule start");
        l0 l0Var = (l0) this.LLIZLLLIL.LJII(l0.class, null);
        l0Var.jL(new InterfaceC1622600sKI() { // from class: X.0svo
            @Override // X.InterfaceC1622600sKI
            public final boolean LIZ() {
                if (this.LIZ.LLJI == null) {
                    return false;
                }
                return !C580130Mp9.LIZ(r0.LJI());
            }

            @Override // X.InterfaceC1622600sKI
            public final boolean LIZIZ() {
                InterfaceC1648570t0B interfaceC1648570t0B;
                x2 x2Var = this.LIZ.LLJJJJLIIL;
                if (x2Var == null || x2Var.LLLLIILL() == null || (interfaceC1648570t0B = this.LIZ.LLJZIJLIL) == null) {
                    return true;
                }
                return interfaceC1648570t0B.Jv2().LIZJ().booleanValue();
            }

            @Override // X.InterfaceC1622600sKI
            public final void LJJIJIIJIL() {
                InterfaceC1648570t0B interfaceC1648570t0B = this.LIZ.LLJZIJLIL;
                if (interfaceC1648570t0B != null) {
                    interfaceC1648570t0B.Db2("sticker stop record");
                }
            }
        });
        InterfaceC1648570t0B interfaceC1648570t0B = this.LLJZIJLIL;
        if (interfaceC1648570t0B != null) {
            interfaceC1648570t0B.yM2().LIZ(this, new AObjectS246S0100000_25(l0Var, 718));
        }
        List<Fragment> listLJJLIIIJL = getSupportFragmentManager().LJJLIIIJL();
        if (C0IKQ.LIZIZ(listLJJLIIIJL)) {
            listLJJLIIIJL.getClass();
            ArrayList arrayList = new ArrayList();
            for (Fragment fragment : listLJJLIIIJL) {
                if (Boolean.valueOf(fragment instanceof AbstractStickerFragment).booleanValue()) {
                    arrayList.add(fragment);
                }
            }
            if (C0IKQ.LIZIZ(arrayList)) {
                C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    c19ehLJIIJ.LJIIZILJ((Fragment) it2.next());
                }
                c19ehLJIIJ.LJIIJ();
            }
        }
        j jVar2 = C524780Ki4.LIZ;
        jVar2.step("av_video_record_init", "init stickerModule end");
        this.LLJI.tabs = getIntent().getIntExtra("tabs", 0);
        RecordTaskManager.LIZ(new h(), false);
        C1444920nhi.LIZLLL(this.LLJI);
        o.LIZJ.getClass();
        C1514430pVp.LJFF(EnumC1584370rKd.valueOf("SHOOT"));
        getLifecycle().addObserver(new AudioFocusManager(this));
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.mb4);
        this.LLJLIL = frameLayout2;
        ShortVideoContext shortVideoContext2 = this.LLJI;
        if (shortVideoContext2 != null && shortVideoContext2.enterMvThemeEffect != null) {
            z = true;
        } else {
            z = false;
        }
        if (!shortVideoContext2.mToLive && !shortVideoContext2.mToStatus && !z && !C306720C0o.LIZ()) {
            z2 = true;
        } else {
            z2 = false;
        }
        C1649720t22.LIZ(this, frameLayout2, z2, true, this.LLIZLLLIL);
        this.LLJILJILJ.post(new ARunnableS125S0100000_25(this, 91));
        C1459710o5Z.LJIIJJI = true;
        C201955140j.LIZ("TTEPEffectPreviewActivity => onCreate end");
        C1448790nnx.LIZ = true;
        C1448790nnx.LIZIZ = true;
        C1448790nnx.LIZJ = true;
        this.LLJI.mShareId = LLZ(getIntent(), "share_id");
        this.LLJI.clientId = LLZ(getIntent(), "channel");
        RecordTaskManager.LIZ(new t(), false);
        RecordTaskManager.LIZ(new b(), false);
        RecordTaskManager.LIZ(new g(this, null), false);
        if (u7.LJ() || u7.LIZIZ()) {
            jVar2.start("tool_performance_show_album_icon", "activity created");
        }
        RecordTaskManager.LIZ(new PreloadMediaDataTask(getLifecycle(), this, null, EnumC194317110p.P0), false);
        RecordTaskManager.LIZ(new com.ss.android.ugc.aweme.shortvideo.ui.task.f(), false);
        RecordTaskManager.LIZ(new CacheChooseMediaViewHolderTask(this, getLifecycle(), null), false);
        jVar2.step("av_video_record_init", "onCreate end");
        this.LLJZ.LE(false);
        if (C306720C0o.LIZ()) {
            LLZLI();
            this.LLJLILLLLZIIL = false;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity", "onCreate", false);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public void onEvent(AnonymousClass0801 anonymousClass0801) {
        ShortVideoContext shortVideoContext;
        String str = anonymousClass0801.LIZ;
        if (str != null && (shortVideoContext = this.LLJI) != null) {
            shortVideoContext.extraSession.commerceData = str;
        }
        C855640XhS.LIZ(this.LLJI.creativeModel);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x015c  */
    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNewIntent(android.content.Intent r8) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity.onNewIntent(android.content.Intent):void");
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.remove("android:fragments");
        Bundle bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        if (bundle2 != null) {
            C786410Ut5.LJJIIZI(bundle2, new Bundle(), "android:support:fragments");
        }
        C786410Ut5.LJJIJL(bundle, "save_state_short_video_context", this.LLJI);
        f fVar = f.LIZ;
        getIntent();
        fVar.getClass();
        f.LJII(this, bundle);
    }

    @C14EU(sticky = true)
    public void receiveToast(C1630980sXo c1630980sXo) {
        if (TextUtils.equals(c1630980sXo.LIZ, "sticker_unlocked")) {
            this.LLJJLIIIJLLLLLLLZ = true;
            if (this.LLJL && !c1630980sXo.LIZJ) {
                InterfaceC1624140sMm interfaceC1624140sMm = o.LJJI;
                interfaceC1624140sMm.getClass();
                interfaceC1624140sMm.getClass();
                this.LLJJLIIIJLLLLLLLZ = false;
            }
            EventBus.LIZLLL().LJIL(c1630980sXo);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }

    public static String LLZ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19GS, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        C0MGL c0mgl;
        Iterator it2 = ((ArrayList) this.LLJILJIL).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC362610EJn) it2.next()).onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        if (i == 4) {
            if (this.LLJJJJLIIL == null) {
                if (getIntent().hasExtra("stitch_params")) {
                    return true;
                }
                return super.onKeyDown(i, keyEvent);
            }
            InterfaceC1648570t0B interfaceC1648570t0B = this.LLJZIJLIL;
            if (interfaceC1648570t0B != null && !interfaceC1648570t0B.Jv2().LIZJ().booleanValue()) {
                return true;
            }
            InterfaceC1655610tBX interfaceC1655610tBX = this.LLJJL;
            if ((interfaceC1655610tBX == null || !interfaceC1655610tBX.onBackPressed()) && this.LLJJJJLIIL.getDiContainer() != null && (c0mgl = (C0MGL) this.LLJJJJLIIL.getDiContainer().LJIIL(null, C0MGL.class)) != null) {
                c0mgl.yp0("system_back_button", System.currentTimeMillis());
            }
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        InterfaceC1648570t0B interfaceC1648570t0B;
        boolean z;
        Activity activity;
        Iterator it2 = ((ArrayList) this.LLJIJIL).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC484050IyZ) it2.next()).onActivityResult(i, i2, intent)) {
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
        if (i == 1002) {
            if (i2 == -1) {
                ShortVideoContext shortVideoContext = this.LLJI;
                if (shortVideoContext != null && shortVideoContext.microAppModel != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (intent != null && LLLZZIL(intent) != null && !z) {
                    Intent intent2 = new Intent();
                    InterfaceC376620Epg interfaceC376620Epg = o.LIZJ;
                    intent2.setClass(this, C19221910Hx.LIZJ());
                    intent2.addFlags(67108864);
                    intent2.putExtras(LLLZZIL(intent));
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(this, intent2, "Context_startActivity_1");
                    C1701330uNH.LIZ(intent2, this);
                    C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP68Zo+A6AZYRdhuANyXhKg8Q+TVGX5v8wTxCk9uow==", null);
                    C0WST c0wst = new C0WST();
                    Object[] objArr = {intent2};
                    C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
                    C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "com/ss/android/ugc/aweme/ttep/TTEPEffectPreviewActivity", "startActivity", this, objArr, "void", c0wzw);
                    if (c0wsuLIZIZ.LIZ) {
                        c0wst.LIZ(11098, "com/ss/android/ugc/aweme/ttep/TTEPEffectPreviewActivity", "startActivity", null, objArr, this, c0wzw, false);
                    } else {
                        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                        if (objArr2 != null) {
                            Object obj = objArr2[0];
                            if (obj != null) {
                                activity = (Activity) obj;
                            } else {
                                activity = this;
                            }
                            Object obj2 = objArr2[1];
                            if (obj2 != null) {
                                intent2 = (Intent) obj2;
                            }
                        } else {
                            activity = this;
                        }
                        activity.startActivity(intent2);
                        c0wst.LIZ(11098, "com/ss/android/ugc/aweme/ttep/TTEPEffectPreviewActivity", "startActivity", null, objArr, activity, c0wzw, true);
                    }
                }
                finish();
                return;
            }
            return;
        }
        if (i != 1003 || i2 != -1 || this.LLJJJJLIIL == null || (interfaceC1648570t0B = this.LLJZIJLIL) == null) {
            return;
        }
        interfaceC1648570t0B.yF2(true);
    }
}
