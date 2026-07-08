package com.ss.android.ugc.aweme.ftc;

import X.AbstractActivityC1655510tBN;
import X.C01GW;
import X.C0CHQ;
import X.C0CLW;
import X.C0IKQ;
import X.C0LAB;
import X.C0WZX;
import X.C1192870h9B;
import X.C1202330hOR;
import X.C1308910kAL;
import X.C1309570kBP;
import X.C1409940mnI;
import X.C1436840nUg;
import X.C1439190nYT;
import X.C1443030nef;
import X.C1443540nfU;
import X.C1444920nhi;
import X.C1448790nnx;
import X.C1458410o3T;
import X.C1459710o5Z;
import X.C14EU;
import X.C14K9;
import X.C1514430pVp;
import X.C15R5;
import X.C1624360sN8;
import X.C1630980sXo;
import X.C1649720t22;
import X.C1650040t2Y;
import X.C1654320t9S;
import X.C1655580tBU;
import X.C1664590tQ1;
import X.C1664600tQ2;
import X.C1688700u2u;
import X.C1697810uHb;
import X.C1698370uIV;
import X.C1699250uJv;
import X.C19286810cs;
import X.C19EH;
import X.C1A66;
import X.C1DI6;
import X.C1DMD;
import X.C1DPV;
import X.C1DRG;
import X.C201955140j;
import X.C20246714Kb;
import X.C20684815ws;
import X.C214873197f;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2265108u9;
import X.C298010BmB;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.C524780Ki4;
import X.C540290LGx;
import X.C565610MGh;
import X.C569770MWh;
import X.C579670MoP;
import X.C579950Mor;
import X.C786410Ut5;
import X.EnumC1584370rKd;
import X.EnumC2249681D3m;
import X.EnumC335920DEw;
import X.InterfaceC1173080gdG;
import X.InterfaceC1621970sJH;
import X.InterfaceC1622600sKI;
import X.InterfaceC1624140sMm;
import X.InterfaceC1647890sz5;
import X.InterfaceC1648570t0B;
import X.InterfaceC1648870t0f;
import X.InterfaceC1650180t2m;
import X.InterfaceC1655610tBX;
import X.InterfaceC214877197j;
import X.InterfaceC2177841ALe;
import X.InterfaceC2254001DKc;
import X.InterfaceC362610EJn;
import X.InterfaceC484050IyZ;
import X.InterfaceC524950KiL;
import X.InterfaceC579050MnP;
import Y.AObjectS241S0100000_8;
import Y.AObjectS246S0100000_25;
import Y.AObjectS399S0100000_25;
import Y.AObserverS225S0100000_22;
import Y.ARunnableS122S0100000_22;
import Y.ARunnableS125S0100000_25;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
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
import com.bytedance.als.ApiCenter;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.Scene;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.MicroAppModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.ui.AudioFocusManager;
import com.ss.android.ugc.aweme.shortvideo.ui.b;
import com.ss.android.ugc.aweme.shortvideo.ui.task.RecordTaskManager;
import com.ss.android.ugc.aweme.shortvideo.util.j;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import com.zhiliaoapp.musically.R;
import dtj.u7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jgp.h;
import jgp.t;
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
public class FTCVideoRecordNewActivity extends AbstractActivityC1655510tBN implements InterfaceC524950KiL, InterfaceC1650180t2m {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiM4HELIOSKmEVHAYaICs2JxcpKiAhLAspPg4wPCw6IDsq";
    public C1DRG LLJ;
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
    public C1650040t2Y LLJJJJLIIL;
    public InterfaceC1655610tBX LLJJL;
    public FrameLayout LLJLIL;
    public int LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public e0 LLJZ;
    public InterfaceC1648570t0B LLJZIJLIL;
    public InterfaceC1621970sJH LLL;
    public a LLLF;
    public q LLLFF;
    public final C01GW<ApiCenter> LLIZLLLIL = C452501pT.LIZIZ(new AObjectS399S0100000_25(this, 35));
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
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
            this.LLLFF = (q) this.LLJ.LJIIL(null, q.class);
        }
        return this.LLLFF;
    }

    public final InterfaceC579050MnP LLZZ() {
        return (InterfaceC579050MnP) this.LLIZLLLIL.getValue().LIZLLL(InterfaceC579050MnP.class);
    }

    public final void LLZZZIL() {
        this.LLJZ.St2().rh(new C1DMD(new C579670MoP(this.LLJI.cameraComponentModel.mWorkspace)), this.LLJI.cameraComponentModel.mWorkspace.LJ().getAbsolutePath());
    }

    @Override // X.ActivityC214874197g
    public final String getCreationId() {
        ShortVideoContext shortVideoContext = this.LLJI;
        if (shortVideoContext != null) {
            return shortVideoContext.getCreationId();
        }
        return null;
    }

    @Override // X.AbstractActivityC1674880tgc, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity", "onResume", true);
        C201955140j.LIZ("VideoRecordNewActivity => onResume start");
        super.onResume();
        this.LLJL = true;
        if (getIntent() != null && getIntent().getBooleanExtra("extra_editor_pro_to_record", false)) {
            this.LLL.Ud1(true);
        }
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
        C201955140j.LIZ("VideoRecordNewActivity => onResume end");
        C540290LGx.LIZ.LJIIJJI(this, new AObjectS399S0100000_25(this, 34));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity", "onResume", false);
    }

    @Override // X.AbstractActivityC1674880tgc, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity", "onStart", true);
        super.onStart();
        RecordTaskManager.LIZ(new jgp.q(), C298010BmB.LIZ());
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity", "onStart", false);
    }

    public FTCVideoRecordNewActivity() {
        new ArrayList();
    }

    public final void LLZLI() {
        C1650040t2Y c1650040t2Y;
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
        if (intent == null) {
            c1650040t2Y = new C1650040t2Y(getIntent(), this.LLJI);
        } else {
            c1650040t2Y = new C1650040t2Y(intent, this.LLJI);
        }
        this.LLJJJJLIIL = c1650040t2Y;
        c1650040t2Y.LLJJ = new ARunnableS125S0100000_25(this, 102);
        C214873197f c214873197f = new C214873197f(this, C1650040t2Y.class);
        c214873197f.LJI = false;
        c214873197f.LJII = new InterfaceC214877197j() { // from class: X.0tBJ
            @Override // X.InterfaceC214877197j
            public final Scene LIZ(ClassLoader classLoader, String str, Bundle bundle) {
                FTCVideoRecordNewActivity fTCVideoRecordNewActivity = this.LIZ;
                String str2 = FTCVideoRecordNewActivity._pnsPageId;
                fTCVideoRecordNewActivity.getClass();
                if (TextUtils.equals(C1650040t2Y.class.getName(), str)) {
                    return fTCVideoRecordNewActivity.LLJJJJLIIL;
                }
                return null;
            }
        };
        c214873197f.LIZLLL = false;
        c214873197f.LJ = false;
        c214873197f.LJFF = R.id.szh;
        this.LLJJL = c214873197f.LIZ();
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
                runOnUiThread(new ARunnableS125S0100000_25(this, 100));
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
                C2204961BRm.LLZLLIL(this, intent3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOy8YNHo6BHuhI/F2ZZXoYHdPOyEwmM8hnpCoAgw", null));
                moveTaskToBack(true);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C569770MWh.LIZ(3, this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ShortVideoContext shortVideoContext = this.LLJI;
        if (shortVideoContext.mToLive || shortVideoContext.duetFromUser != null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || getWindow().getDecorView().getRootWindowInsets() != null) {
            InterfaceC2254001DKc mediaController = this.LLJZ.St2().getMediaController();
            float f = C20246714Kb.LIZ;
            mediaController.k5(C20246714Kb.LIZ((ViewGroup.MarginLayoutParams) this.LLJJIII.getLayoutParams(), getWindow(), this.LLJLLL));
        }
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
        o.LJI.dl();
        C1458410o3T.LJIIJJI(false);
        this.LLJJJJLIIL = null;
        EventBus.LIZLLL().LJJI(this);
        C786410Ut5.LJLILLLLZI(C1699250uJv.LLILLL.LL, 1);
        C1448790nnx.LIZ = false;
        C1448790nnx.LIZIZ = false;
        C1448790nnx.LIZJ = false;
        C1443030nef.LJII().LJIIIZ();
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
        j jVar = C524780Ki4.LIZ;
        ShortVideoContext shortVideoContext = this.LLJI;
        jVar.pause(this, "record", shortVideoContext.shootWay, shortVideoContext.getCreationId());
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
        InterfaceC1647890sz5 interfaceC1647890sz5;
        this.LLJLLL = z;
        C1650040t2Y c1650040t2Y = this.LLJJJJLIIL;
        if (c1650040t2Y != null && (interfaceC1647890sz5 = (InterfaceC1647890sz5) c1650040t2Y.getDiContainer().LJIIL(null, com.ss.android.ugc.aweme.shortvideo.component.a.class)) != null) {
            interfaceC1647890sz5.gX1(z);
        }
    }

    @Override // X.AbstractActivityC1674880tgc
    public final void LLLZIL(boolean z) {
        InterfaceC1647890sz5 interfaceC1647890sz5;
        C1650040t2Y c1650040t2Y = this.LLJJJJLIIL;
        if (c1650040t2Y != null && (interfaceC1647890sz5 = (InterfaceC1647890sz5) c1650040t2Y.getDiContainer().LJIIL(null, com.ss.android.ugc.aweme.shortvideo.component.a.class)) != null) {
            interfaceC1647890sz5.H90(z);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void LLZZLLIL(Bundle bundle) {
        List<String> list;
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
        this.LLJJJIL = LLZ(getIntent(), "extra_sticker_from");
        this.LLJJJJ = LLZ(getIntent(), "grade_key");
        String str = this.LLJI.shootWay;
        if (str != null) {
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
        ShortVideoContext shortVideoContext = this.LLJI;
        c1443030nefLJII2.LIZLLL = shortVideoContext.mShootFrom;
        C1439190nYT.LJFF(shortVideoContext.creativeInfo);
        ShortVideoContextViewModel shortVideoContextViewModel = (ShortVideoContextViewModel) ViewModelProviders.of(this).get(ShortVideoContextViewModel.class);
        ShortVideoContext shortVideoContext2 = this.LLJI;
        shortVideoContextViewModel.LL = shortVideoContext2;
        shortVideoContextViewModel.wQ2(shortVideoContext2.shootMode);
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
        }
        String strLLZ = LLZ(getIntent(), "music_origin");
        ShortVideoContext shortVideoContext3 = this.LLJI;
        if (strLLZ == null) {
            strLLZ = "original";
        }
        shortVideoContext3.LJJLIIIJILLIZJL(strLLZ);
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
            InterfaceC1648870t0f interfaceC1648870t0f = (InterfaceC1648870t0f) C1309570kBP.LIZ(this).LIZLLL(InterfaceC1648870t0f.class);
            if (interfaceC1648870t0f != null) {
                interfaceC1648870t0f.dismissSuperEntranceEvent();
            }
            InterfaceC1648870t0f interfaceC1648870t0f2 = (InterfaceC1648870t0f) C1309570kBP.LIZ(this).LIZLLL(InterfaceC1648870t0f.class);
            if (interfaceC1648870t0f2 != null) {
                interfaceC1648870t0f2.dismissUploadPopEntranceEvent();
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
        int i;
        byte b;
        boolean z;
        boolean z2;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity", "onCreate", true);
        j jVar = C524780Ki4.LIZ;
        jVar.enter(this, "record");
        C1DPV.LIZIZ.LIZ(EnumC2249681D3m.SHOOT);
        f fVar = f.LIZ;
        Intent intent = getIntent();
        fVar.getClass();
        f.LIZJ(this, intent, bundle);
        LLZZLLIL(bundle);
        C15R5.LJI.LJIIIIZZ(this);
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(this.LLJI.creativeModel.musicBuzModel);
        if (aVMusicExtractAVMusic != null && aVMusicExtractAVMusic.getDuration() > 0) {
            this.LLJI.LJJLIIIJ(aVMusicExtractAVMusic.getDuration());
        }
        C1654320t9S.LIZ(this, AFwS266S0000000_25.get$arr$(545));
        C1664590tQ1.LIZIZ(this, new AwS604S0100000_25(this, 798));
        C1664600tQ2.LIZIZ(this, new AwS604S0100000_25(this, 810));
        C1DRG c1drgLJFF = C1664600tQ2.LIZLLL(this).LJFF();
        this.LLJ = c1drgLJFF;
        this.LLJZ = (e0) c1drgLJFF.LJII(e0.class, null);
        this.LLJZIJLIL = (InterfaceC1648570t0B) this.LLJ.LJII(InterfaceC1648570t0B.class, null);
        this.LLL = (InterfaceC1621970sJH) this.LLJ.LJII(InterfaceC1621970sJH.class, null);
        this.LLJILLL = this.LLJZ.Gz0();
        this.LLJJIII = this.LLJZ.getPreviewView();
        this.LLJILJILJ.postDelayed(new ARunnableS125S0100000_25(this, 101), 2000L);
        this.LLJZ.A31().LIZ(this, new AObjectS246S0100000_25(this, 723));
        this.LLJZ.qF1().observe(this, new AObserverS225S0100000_22(this, 185));
        this.LLJZIJLIL.yK0().LIZ(this, new AObjectS241S0100000_8(this, 109));
        this.LLLF = (a) this.LLJ.LJIIL(null, a.class);
        C201955140j.LIZ("VideoRecordNewActivity => onCreate start");
        C1443030nef.LJII().getClass();
        jVar.step("av_video_record_init", "onCreate");
        RecordTaskManager.LIZ(new jgp.q(), C298010BmB.LIZ());
        RecordTaskManager.LIZ(new w(this), false);
        if (getIntent().getIntExtra("translation_type", 0) == 3) {
            C569770MWh.LIZLLL(3, this);
        } else if (getIntent().getIntExtra("translation_type", 0) == 1) {
            C569770MWh.LIZLLL(1, this);
        }
        super.onCreate(bundle);
        getWindow().addFlags(128);
        setContentView(R.layout.cc4);
        if (getResources().getConfiguration() != null) {
            i = getResources().getConfiguration().screenWidthDp;
        } else {
            i = 0;
        }
        this.LLJLL = i;
        if (!C1688700u2u.LIZ(this)) {
            C201955140j.LIZ("RecordConditionCheck.check() false");
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity", "onCreate", false);
            return;
        }
        if (C1655580tBU.LIZ()) {
            b = 15;
        } else {
            b = 7;
        }
        C1A66.LJFF(b);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.tqy);
        this.LLJJ = frameLayout;
        if (Build.VERSION.SDK_INT >= 35) {
            C14K9.LJIJJ(frameLayout, new C1698370uIV(this, 1));
        }
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.mg3);
        this.LLJJI = frameLayout2;
        frameLayout2.addView(this.LLJZ.St2().getViewFunction().getView());
        l0 l0Var = (l0) this.LLJ.LJII(l0.class, null);
        l0Var.jL(new InterfaceC1622600sKI() { // from class: X.0t2L
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
                C1650040t2Y c1650040t2Y = this.LIZ.LLJJJJLIIL;
                if (c1650040t2Y == null || c1650040t2Y.LLLLIIIILLL() == null || (interfaceC1648570t0B = this.LIZ.LLJZIJLIL) == null) {
                    return true;
                }
                return interfaceC1648570t0B.Jv2().LIZJ().booleanValue();
            }

            @Override // X.InterfaceC1622600sKI
            public final void LJJIJIIJIL() {
                this.LIZ.LLJZIJLIL.Db2("ftc sticker stop record");
            }
        });
        this.LLJZIJLIL.yM2().LIZ(this, new AObjectS246S0100000_25(l0Var, 724));
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
        RecordTaskManager.LIZ(new h(), false);
        C1444920nhi.LIZLLL(this.LLJI);
        o.LIZJ.getClass();
        C1514430pVp.LJFF(EnumC1584370rKd.valueOf("SHOOT"));
        getLifecycle().addObserver(new AudioFocusManager(this));
        FrameLayout frameLayout3 = (FrameLayout) findViewById(R.id.mb4);
        this.LLJLIL = frameLayout3;
        ShortVideoContext shortVideoContext = this.LLJI;
        if (shortVideoContext.enterMvThemeEffect != null) {
            z = true;
        } else {
            z = false;
        }
        if (!shortVideoContext.mToLive && !shortVideoContext.mToStatus && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        C1649720t22.LIZ(this, frameLayout3, z2, true, this.LLJ);
        this.LLJILJILJ.post(new ARunnableS125S0100000_25(this, 106));
        C1459710o5Z.LJIIJJI = true;
        C201955140j.LIZ("VideoRecordNewActivity => onCreate end");
        C1448790nnx.LIZ = true;
        C1448790nnx.LIZIZ = true;
        C1448790nnx.LIZJ = true;
        RecordTaskManager.LIZ(new t(), false);
        RecordTaskManager.LIZ(new b(), false);
        this.LLJILJILJ.postDelayed(new ARunnableS122S0100000_22(this, 122), 2000L);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity", "onCreate", false);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public void onEvent(C579950Mor c579950Mor) {
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x016d  */
    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNewIntent(android.content.Intent r9) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity.onNewIntent(android.content.Intent):void");
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.remove("android:fragments");
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
        InterfaceC1173080gdG interfaceC1173080gdG;
        Iterator it2 = ((ArrayList) this.LLJILJIL).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC362610EJn) it2.next()).onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        if (i == 4) {
            if (this.LLJJJJLIIL == null) {
                return super.onKeyDown(i, keyEvent);
            }
            InterfaceC1648570t0B interfaceC1648570t0B = this.LLJZIJLIL;
            if (interfaceC1648570t0B != null && !interfaceC1648570t0B.Jv2().LIZJ().booleanValue()) {
                return true;
            }
            InterfaceC1655610tBX interfaceC1655610tBX = this.LLJJL;
            if ((interfaceC1655610tBX == null || !interfaceC1655610tBX.onBackPressed()) && this.LLJJJJLIIL.getDiContainer() != null && (interfaceC1173080gdG = (InterfaceC1173080gdG) this.LLJJJJLIIL.getDiContainer().LJIIL(null, InterfaceC1173080gdG.class)) != null) {
                interfaceC1173080gdG.vw1();
            }
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        Iterator it2 = ((ArrayList) this.LLJIJIL).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC484050IyZ) it2.next()).onActivityResult(i, i2, intent)) {
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
        if (i == 1002 && i2 == -1) {
            ShortVideoContext shortVideoContext = this.LLJI;
            if (shortVideoContext != null && shortVideoContext.microAppModel != null) {
                z = true;
            } else {
                z = false;
            }
            if (intent != null && LLLZZIL(intent) != null && !z) {
                Intent intent2 = new Intent();
                intent2.addFlags(67108864);
                intent2.putExtras(LLLZZIL(intent));
                ((ICreativeSAAService) ServiceManager.get().getService(ICreativeSAAService.class)).openPublishPage(this, intent2);
            }
            finish();
        }
    }
}
