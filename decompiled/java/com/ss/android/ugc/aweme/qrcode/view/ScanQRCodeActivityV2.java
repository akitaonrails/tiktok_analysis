package com.ss.android.ugc.aweme.qrcode.view;

import X.AbstractC1893900zNs;
import X.AbstractC848400XPy;
import X.C036E;
import X.C0OBG;
import X.C0OM1;
import X.C0OO0;
import X.C0WOD;
import X.C0WZX;
import X.C0XPD;
import X.C0XQ7;
import X.C10Z2;
import X.C10Z7;
import X.C10Z8;
import X.C10Z9;
import X.C10ZE;
import X.C1250250idj;
import X.C1250300ido;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1346440l8s;
import X.C13BV;
import X.C14EU;
import X.C14K9;
import X.C14KQ;
import X.C15O7;
import X.C1697810uHb;
import X.C1701330uNH;
import X.C1879390z0T;
import X.C1893880zNq;
import X.C1893890zNr;
import X.C1893910zNt;
import X.C19271010aK;
import X.C19273310ah;
import X.C19276910bH;
import X.C19287110cv;
import X.C19288210d6;
import X.C19288410d8;
import X.C19288510d9;
import X.C19288710dB;
import X.C19288910dD;
import X.C19289310dH;
import X.C19335310kh;
import X.C19335610kk;
import X.C20684815ws;
import X.C2204961BRm;
import X.C2344009Gk;
import X.C2411409ce;
import X.C296060Bj2;
import X.C299020Bno;
import X.C335910DEv;
import X.C346530DiF;
import X.C448700Hie;
import X.C448710Hif;
import X.C621180OYa;
import X.C786410Ut5;
import X.C844470XAv;
import X.DialogC1389620mGW;
import X.EnumC041200Cs;
import X.EnumC335920DEw;
import X.EnumC439370HKt;
import X.EnumC448630HiX;
import X.EnumC638250P1r;
import X.InterfaceC1255040ilS;
import X.InterfaceC1879420z0W;
import X.InterfaceC19271510aP;
import X.InterfaceC19271810aS;
import X.InterfaceC19271910aT;
import X.InterfaceC19289410dI;
import X.InterfaceC197023126r;
import X.InterfaceC448730Hih;
import X.SurfaceHolderCallbackC19287410cy;
import Y.ACallableS431S0100000_28;
import Y.ACallableS73S1100000_28;
import Y.AObjectS126S0000000_28;
import Y.AObjectS402S0100000_28;
import Y.ARunnableS128S0100000_28;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.governance.tool.api.IControlService;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.minis.api.IMinisApiService;
import com.ss.android.ugc.aweme.offline.ec.rax.impl.IEcRaxService;
import com.ss.android.ugc.aweme.offline.thor.IThorService;
import com.ss.android.ugc.aweme.profile.IProfileService;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService;
import com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2;
import com.ss.android.ugc.aweme.service.ICreativeAppDiffService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IAVCameraService;
import com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;
import com.ss.android.ugc.aweme.services.external.ability.camera.AVCameraParams;
import com.ss.android.ugc.aweme.services.external.ability.qr.AVScanSettings;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.algorithm.VEBachQRCodeResult;
import com.ss.android.vesdk.algorithm.s;
import com.zhiliaoapp.musically.R;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
public class ScanQRCodeActivityV2 extends BaseActivity implements View.OnClickListener, InterfaceC19271810aS, InterfaceC1255040ilS {
    public static C10ZE LLLF = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjQ+KiHELIOSA3LWs6ICokZhYvKCECGgYjLSoSKzElPyYnMRN+";
    public TextView LL;
    public ImageView LLILLJJLI;
    public ImageView LLILLL;
    public TuxNavBar LLILZ;
    public DialogC1389620mGW LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public SurfaceView LLJ;
    public IQRCodeScanner LLJI;
    public InterfaceC19271910aT LLJIJIL;
    public C19271010aK LLJILJIL;
    public C0OO0 LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public TextView LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public TextView LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public ImageView LLJJJ;
    public FrameLayout LLJJJIL;
    public GestureDetector LLJJJJ;
    public ScaleGestureDetector LLJJJJJIL;
    public GestureDetector LLJJJJLIIL;
    public QrCodeScanService LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public float LLJJL = 1.0f;
    public final C19289310dH LLJLLIL = new C19289310dH("ScanQRCodeActivityV2");
    public final C19288510d9 LLJLLL = new C19288510d9();
    public final C19288210d6 LLJZ = new IQRCodeScanner.ScanProcessListenr() { // from class: X.10d6
        @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner.ScanProcessListenr
        public final void onCameraOpenSuccess() {
            ScanQRCodeActivityV2 scanQRCodeActivityV2 = this.LIZ;
            if (scanQRCodeActivityV2.LLJLILLLLZIIL) {
                return;
            }
            scanQRCodeActivityV2.LLJLLL.LIZIZ(new AbstractC19288610dA() { // from class: X.10dE
            });
        }

        @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner.ScanProcessListenr
        public final void onCameraScanStarted() {
            ScanQRCodeActivityV2 scanQRCodeActivityV2 = this.LIZ;
            if (scanQRCodeActivityV2.LLJLILLLLZIIL) {
                return;
            }
            scanQRCodeActivityV2.LLJLLL.LIZIZ(new AbstractC19288610dA() { // from class: X.10dC
            });
        }

        @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner.ScanProcessListenr
        public final void onFirstRenderSuccess() {
            ScanQRCodeActivityV2 scanQRCodeActivityV2 = this.LIZ;
            if (scanQRCodeActivityV2.LLJLILLLLZIIL) {
                return;
            }
            scanQRCodeActivityV2.LLJLLL.LIZIZ(new AbstractC19288610dA() { // from class: X.10dF
            });
        }
    };
    public final C19288910dD LLJZIJLIL = new C19288910dD(this);
    public final C19287110cv LLL = new InterfaceC448730Hih() { // from class: X.10cv
        @Override // X.InterfaceC448730Hih
        public final void LIZ(List<s> list) throws Throwable {
            if (list != null) {
                try {
                    ArrayList arrayList = (ArrayList) list;
                    if (!arrayList.isEmpty()) {
                        this.LIZ.LLLZIL((VEBachQRCodeResult) arrayList.get(0));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LIZ.LLJLLIL.LIZ("camera scan result convert error", e);
                }
            }
        }
    };

    @Override // X.InterfaceC1255040ilS
    public final void Eb0(AvatarUri avatarUri) {
    }

    @Override // X.InterfaceC1255040ilS
    public final void hO(Exception exc) {
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void LLLLZI() {
        IQRCodeScanner iQRCodeScanner = this.LLJI;
        if (iQRCodeScanner != null) {
            iQRCodeScanner.closeLight();
        }
        this.LLJJIII = false;
        C786410Ut5.S4(0.8f, this.LLJJI);
        this.LLJJI.setText(2131836466);
        Drawable drawable = getResources().getDrawable(R.drawable.d2a);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        this.LLJJI.setCompoundDrawablesRelative(drawable, null, null, null);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("type", "flash_off");
        C20684815ws.LJIILLIIL("scan_page_click", c2344009Gk.LIZ);
    }

    public final void LLLLZIL() {
        DialogC1389620mGW dialogC1389620mGW = this.LLILZIL;
        if (dialogC1389620mGW == null || !dialogC1389620mGW.isShowing()) {
            return;
        }
        C786410Ut5.LJIIJ(this.LLILZIL);
    }

    public final void LLLZ() {
        C0OO0 c0oo0 = this.LLJILJILJ;
        if (c0oo0 == null) {
            return;
        }
        c0oo0.LIZJ();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("type", "album");
        C20684815ws.LJIILLIIL("scan_page_click", c2344009Gk.LIZ);
    }

    public final void LLLZLZ() {
        if (this.LLJI == null) {
            LLLLZLLIL(null);
        }
        C844470XAv.LIZ.getClass();
        new AVCameraParams(C844470XAv.LIZ(), 1);
        new AVScanSettings();
        C14KQ.LJIIIIZZ(this);
        C14KQ.LJ(this);
        this.LLJJJIL.getX();
        this.LLJJJIL.getY();
        this.LLJJJIL.getWidth();
        this.LLJJJIL.getHeight();
        ((C19271010aK) this.LLJIJIL).LJIIJ.LIZLLL();
        ACallableS431S0100000_28 aCallableS431S0100000_28 = new ACallableS431S0100000_28(this, 9);
        ExecutorService executorService = C15O7.LJI;
        C15O7.LIZIZ(aCallableS431S0100000_28, executorService, null).LJ(new C19335310kh(this, 2), executorService, null).LJ(new C19335310kh(this, 1), C15O7.LJIIIIZZ, null);
    }

    public final void LLLZZIL() {
        C15O7.LIZJ(new ACallableS431S0100000_28(this, 20));
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2", "onResume", true);
        this.LLJJLIIIJLLLLLLLZ.LIZIZ();
        super.onResume();
        C786410Ut5.LLIIII(this.LLJ, 0);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2", "onResume", false);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        this.LLJLIL = true;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (!this.LLJLILLLLZIIL) {
            this.LLJLLL.LIZIZ(new C19288410d8(EnumC041200Cs.MANUAL_EXIT, null));
            this.LLJLLL.LIZ("scan_qrcode_exit");
        }
        C19273310ah.LIZ.LIZIZ(0, "");
        InterfaceC19271910aT interfaceC19271910aT = this.LLJIJIL;
        if (interfaceC19271910aT != null) {
            C19271010aK c19271010aK = (C19271010aK) interfaceC19271910aT;
            c19271010aK.LIZIZ = null;
            c19271010aK.LIZ = null;
        }
        C0OO0 c0oo0 = this.LLJILJILJ;
        if (c0oo0 != null) {
            c0oo0.LIZLLL();
            this.LLJILJILJ.LJFF(null);
        }
        this.LLJIJIL = null;
        C15O7.LIZJ(new ACallableS431S0100000_28(this, 10));
        GestureDetector gestureDetector = this.LLJJJJ;
        if (gestureDetector != null) {
            gestureDetector.setOnDoubleTapListener(null);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (!this.LLJLIL && !this.LLJLILLLLZIIL && !this.LLJLL) {
            this.LLJLLL.LIZIZ(new C19288410d8(EnumC041200Cs.APP_EXIT, null));
            this.LLJLLL.LIZ("scan_qrcode_exit");
        }
        if (this.LLJJIII) {
            LLLLZI();
        }
        C786410Ut5.LLIIII(this.LLJ, 4);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
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

    public final void LLLLZLL(int i) {
        if (this.LLJ != null) {
            HandlerHook.viewPostDelay(this.LLJ, new ARunnableS128S0100000_28(this, 65), i);
        }
    }

    public final void LLLLZLLIL(final InterfaceC19289410dI interfaceC19289410dI) {
        this.LLJJIJI = false;
        ((IExternalService) PluggableExtentionKt.pluggableSpi(IExternalService.class)).abilityService().cameraService().getScanner(true, this, this.LLJ.getHolder(), new IAVCameraService.IAVCameraReadyCallback() { // from class: X.10cz
            @Override // com.ss.android.ugc.aweme.services.external.ability.IAVCameraService.IAVCameraReadyCallback
            public final void finish(Object obj) {
                ScanQRCodeActivityV2 scanQRCodeActivityV2 = this.LIZ;
                InterfaceC19289410dI interfaceC19289410dI2 = interfaceC19289410dI;
                IQRCodeScanner iQRCodeScanner = (IQRCodeScanner) obj;
                if (iQRCodeScanner != null) {
                    scanQRCodeActivityV2.LLJI = iQRCodeScanner;
                    if (scanQRCodeActivityV2.LLJIJIL == scanQRCodeActivityV2.LLJILJIL) {
                        iQRCodeScanner.setVEScanListener(scanQRCodeActivityV2.LLL);
                        scanQRCodeActivityV2.LLJI.setScanProcessListener(scanQRCodeActivityV2.LLJZ);
                    }
                } else {
                    String str = ScanQRCodeActivityV2._pnsPageId;
                    scanQRCodeActivityV2.getClass();
                }
                if (interfaceC19289410dI2 != null) {
                    interfaceC19289410dI2.LIZ();
                }
            }
        });
    }

    public final void LLLLZLLLI(String str) throws Throwable {
        this.LLJILLL = true;
        C448710Hif c448710Hif = new C448710Hif();
        C448700Hie c448700Hie = c448710Hif.LIZ;
        c448700Hie.picturePath = str;
        c448700Hie.LIZ = EnumC448630HiX.PICTURE.ordinal();
        C448700Hie c448700Hie2 = c448710Hif.LIZ;
        c448700Hie2.LIZJ = true;
        c448700Hie2.reqHeight = 720;
        c448700Hie2.reqWidth = 1280;
        VEBachQRCodeResult vEBachQRCodeResultScanPicture = VEUtils.scanPicture(c448710Hif.LIZ());
        if (vEBachQRCodeResultScanPicture == null) {
            this.LLJLLL.LIZIZ(new C19288410d8(null, Boolean.TRUE));
            this.LLJLLL.LIZ("scan_qrcode_success_with_performance_time");
        }
        LLLZIL(vEBachQRCodeResultScanPicture);
    }

    public final void LLLZIL(VEBachQRCodeResult vEBachQRCodeResult) throws Throwable {
        InterfaceC19271910aT interfaceC19271910aT;
        if (vEBachQRCodeResult != null && vEBachQRCodeResult.retCode == 0) {
            if (this.LLJJIJIL && !this.LLJJIJI && this.LLJIJIL != null) {
                if (vEBachQRCodeResult.getResult() != null) {
                    this.LLJLILLLLZIIL = true;
                    if (this.LLJILLL) {
                        this.LLJLLL.LIZIZ(new C19288710dB(EnumC439370HKt.ALBUM));
                    } else {
                        this.LLJLLL.LIZIZ(new C19288710dB(EnumC439370HKt.CAMERA));
                    }
                    this.LLJJIJI = true;
                    if (this.LLIZLLLIL) {
                        if (this.LLIZ == 5) {
                            LLLF.LIZ(UriProtector.parse(vEBachQRCodeResult.getResult()));
                            finish();
                            return;
                        }
                        Intent intent = new Intent();
                        intent.putExtra("scan_code_result", vEBachQRCodeResult.getResult());
                        intent.putExtra("scan_code_type", vEBachQRCodeResult.type);
                        C2204961BRm.j(this, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPu6YJDK2Xx2eneiRHfyG1q32gXLqFY1LU2tVfEPRsAM", null));
                        finish();
                        return;
                    }
                    ((C19271010aK) this.LLJIJIL).LIZLLL(this.LLJILLL, vEBachQRCodeResult.type, vEBachQRCodeResult.getResult(), this.LLIZ, LLLF);
                    return;
                }
                IQRCodeScanner iQRCodeScanner = this.LLJI;
                if (iQRCodeScanner != null) {
                    iQRCodeScanner.zoomByRatio(vEBachQRCodeResult.getZoomRefactor());
                    return;
                }
                return;
            }
            return;
        }
        if (this.LLIZ == 5) {
            LLLF.v();
            return;
        }
        if (this.LLJJIJIL && (interfaceC19271910aT = this.LLJIJIL) != null) {
            ((C19271010aK) interfaceC19271910aT).LIZJ(this.LLJILLL);
        }
        this.LLJILLL = false;
    }

    @Override // X.InterfaceC1255040ilS
    public final void dN2(final String str) {
        this.LLJLL = false;
        if (this.LLJI == null) {
            LLLLZLLIL(new InterfaceC19289410dI() { // from class: X.10d2
                @Override // X.InterfaceC19289410dI
                public final void LIZ() {
                    ScanQRCodeActivityV2 scanQRCodeActivityV2 = this.LIZ;
                    String str2 = str;
                    String str3 = ScanQRCodeActivityV2._pnsPageId;
                    scanQRCodeActivityV2.getClass();
                    C15O7.LIZIZ(new ACallableS73S1100000_28(scanQRCodeActivityV2, str2, 0), C15O7.LJI, null);
                }
            });
        } else {
            C15O7.LIZIZ(new ACallableS73S1100000_28(this, str, 1), C15O7.LJI, null);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        String str = null;
        if (id == R.id.ztq) {
            if (this.LLJJIII) {
                LLLLZI();
                return;
            }
            IQRCodeScanner iQRCodeScanner = this.LLJI;
            if (iQRCodeScanner != null) {
                iQRCodeScanner.openLight();
            }
            this.LLJJIII = true;
            C786410Ut5.S4(1.0f, this.LLJJI);
            this.LLJJI.setText(2131836465);
            Drawable drawable = getResources().getDrawable(R.drawable.d2b);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            this.LLJJI.setCompoundDrawablesRelative(drawable, null, null, null);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("type", "flash_on");
            C20684815ws.LJIILLIIL("scan_page_click", c2344009Gk.LIZ);
            return;
        }
        if (id != R.id.i8b && id != R.id.sjr) {
            if (id != R.id.avd || C0OBG.LIZIZ(view)) {
                return;
            }
            LLLZ();
            this.LLJLL = true;
            return;
        }
        if (C0OBG.LIZIZ(view)) {
            return;
        }
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("type", "qr_code");
        C20684815ws.LJIILLIIL("scan_page_click", c2344009Gk2.LIZ);
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C0XPD.LIZIZ(this, "scan", "click_my_qr", null, new C19335610kk(this, 2));
            return;
        }
        this.LLJLIL = true;
        if (this.LLILZLL) {
            finish();
            return;
        }
        if (this.LLIZ == 6) {
            str = "find_friends_page";
        }
        C621180OYa.LIZ.LJJLJ(this, "scan_page", str);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.LLJLLIL.LIZ("onConfigurationChanged", configuration);
        C786410Ut5.LLIIII(this.LLJ, 8);
        C786410Ut5.LLIIII(this.LLJ, 0);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [X.0z0W, X.10aW] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z;
        C13BV c13bvLIZIZ;
        C13BV c13bvLIZIZ2;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2", "onCreate", true);
        this.LLJLLIL.LIZ("onCreate, init view and data", bundle);
        activityConfiguration(new AObjectS126S0000000_28(2));
        super.onCreate(bundle);
        setContentView(R.layout.k8);
        this.LLILZLL = getIntent().getBooleanExtra("enter_from", false);
        this.LLIZ = getIntent().getIntExtra("scan_page_from", 0);
        ICreativeAppDiffService.LIZ.getClass();
        C1346440l8s.LIZ().LIZ();
        if (getIntent().getBooleanExtra("camera_only", false)) {
            z = true;
        } else {
            z = false;
        }
        this.LLJL = z;
        this.LLIZLLLIL = getIntent().getBooleanExtra("is_kill_self_after_scan", false);
        this.LL = (TextView) findViewById(R.id.zyk);
        this.LLILLJJLI = (ImageView) findViewById(R.id.sjr);
        this.LLILLL = (ImageView) findViewById(R.id.avd);
        this.LLILZ = (TuxNavBar) findViewById(R.id.y08);
        this.LLJJ = false;
        this.LLJ = (SurfaceView) findViewById(R.id.wpz);
        this.LLJJI = (TextView) findViewById(R.id.ztq);
        this.LLJJIJIIJIL = (TextView) findViewById(R.id.zd_);
        this.LLJJJ = (ImageView) findViewById(R.id.u0t);
        findViewById(R.id.tv_qr_scan_hint);
        this.LLJJJIL = (FrameLayout) findViewById(R.id.i9w);
        View viewFindViewById = findViewById(R.id.tsc);
        String stringExtra = null;
        if (Build.VERSION.SDK_INT >= 35 && viewFindViewById != null) {
            C14K9.LJIJJ(viewFindViewById, new C346530DiF(viewFindViewById.getContext(), 0));
        }
        TextView textView = (TextView) findViewById(R.id.z99);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.xrz);
        if (C296060Bj2.LIZIZ && textView != null && tuxTextView != null) {
            textView.setText(2131839079);
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
        if (this.LLJL) {
            TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.z99);
            ImageView imageView = (ImageView) findViewById(R.id.avd);
            TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.jyl);
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
            }
            if (imageView != null) {
                C786410Ut5.LJZI(8, imageView);
            }
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            }
            findViewById(R.id.m94);
            TuxIconView tuxIconView2 = (TuxIconView) findViewById(R.id.k32);
            ImageView imageView2 = (ImageView) findViewById(R.id.sjr);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tuxIconView2.getLayoutParams();
            marginLayoutParams.setMarginStart(Math.round(142 * getResources().getDisplayMetrics().density));
            C786410Ut5.M6(tuxIconView2, marginLayoutParams);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
            marginLayoutParams2.setMarginStart(Math.round(130 * getResources().getDisplayMetrics().density));
            C786410Ut5.c6(imageView2, marginLayoutParams2);
            tuxIconView2.requestLayout();
            imageView2.requestLayout();
        }
        this.LLJ.getHolder().addCallback(new SurfaceHolderCallbackC19287410cy(this));
        C786410Ut5.Q7(this.LLILLJJLI, this);
        C786410Ut5.Q7(this.LLILLL, this);
        this.LL.setText(getString(2131845737));
        TuxNavBar tuxNavBar = this.LLILZ;
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LJIIIIZZ = getString(2131823350);
        c1251150ifB.LIZ = new InterfaceC197023126r() { // from class: X.10d7
            @Override // X.InterfaceC197023126r
            public final void LIZ() {
                ScanQRCodeActivityV2 scanQRCodeActivityV2 = this.LIZ;
                scanQRCodeActivityV2.LLJLIL = true;
                scanQRCodeActivityV2.finish();
            }
        };
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(R.string.sj6);
        c0om1.LIZJ = c1250250idj;
        C1250300ido c1250300ido = new C1250300ido();
        c1250300ido.LIZLLL = EnumC638250P1r.SECONDARY;
        c1250300ido.LIZJ = "";
        c1250300ido.LJFF = false;
        c1250300ido.LIZ(new AObjectS402S0100000_28(this, 1));
        c0om1.LIZIZ(c1250300ido);
        c0om1.LIZJ(0);
        c0om1.LIZLLL = false;
        tuxNavBar.setNavActions(c0om1);
        this.LLJJLIIIJLLLLLLLZ = (QrCodeScanService) ServiceManager.get().getService(QrCodeScanService.class);
        LLLLZLLIL(null);
        final C19271010aK c19271010aK = new C19271010aK(this, this);
        this.LLJILJIL = c19271010aK;
        ArrayList arrayList = new ArrayList();
        c19271010aK.LJIILJJIL = arrayList;
        final ?? r9 = new InterfaceC1879420z0W() { // from class: X.10aW
            /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
            @Override // X.InterfaceC1879420z0W
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LIZ(int r20, final java.lang.String r21, java.lang.String r22, java.util.Map r23) {
                /*
                    Method dump skipped, instruction units count: 984
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C19272210aW.LIZ(int, java.lang.String, java.lang.String, java.util.Map):boolean");
            }
        };
        arrayList.add(new C10Z9());
        List<InterfaceC19271510aP> list = c19271010aK.LJIILJJIL;
        final BaseActivity baseActivity = c19271010aK.LIZ;
        ((ArrayList) list).add(new InterfaceC19271510aP(baseActivity) { // from class: X.0dcm
            public final BaseActivity LIZ;

            @Override // X.InterfaceC19271510aP
            public final String LIZ() {
                return "minis-MinisUrlHandler";
            }

            @Override // X.InterfaceC19271510aP
            public final String getName() {
                return "minis_url_handler";
            }

            {
                this.LIZ = baseActivity;
            }

            @Override // X.InterfaceC19271510aP
            public final boolean LIZIZ(int i, String str) {
                boolean zLIZLLL = false;
                if (str == null) {
                    return false;
                }
                try {
                    new URL(str);
                    try {
                        Uri uri = UriProtector.parse(str);
                        if (uri != null) {
                            if (a0.LJJIIZI(uri.toString(), "debug", false) && a0.LJJIIZI(uri.toString(), "client_key", false) && a0.LJJIIZI(uri.toString(), "minis", false)) {
                                ((IMinisApiService) ServiceManager.get().getService(IMinisApiService.class)).LJIIIZ(this.LIZ, uri);
                                int i2 = C2187451AjH.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("handleResult, debug, canMinisHandle:");
                                sbLIZ.append(true);
                                sbLIZ.append(", qrUrl:");
                                sbLIZ.append(str);
                                C2188811AlT.LIZIZ(sbLIZ);
                                return true;
                            }
                            if (a0.LJJIIZI(uri.toString(), "/ttmg/dev/", false)) {
                                IMinisApiService iMinisApiService = (IMinisApiService) PluggableExtentionKt.pluggableSpi$default(IMinisApiService.class, false, false, false, 14, null);
                                if (iMinisApiService == null) {
                                    return false;
                                }
                                return iMinisApiService.LJIL(this.LIZ, uri, true);
                            }
                            if (a0.LJJIIZI(uri.toString(), "/ttms/dev/", false)) {
                                IMinisApiService iMinisApiService2 = (IMinisApiService) PluggableExtentionKt.pluggableSpi$default(IMinisApiService.class, false, false, false, 14, null);
                                if (iMinisApiService2 == null) {
                                    return false;
                                }
                                return iMinisApiService2.LJIL(this.LIZ, uri, false);
                            }
                            if (a0.LJJIIZI(uri.toString(), "/ttmg/instant_play_preview", false)) {
                                IMinisApiService iMinisApiService3 = (IMinisApiService) PluggableExtentionKt.pluggableSpi$default(IMinisApiService.class, false, false, false, 14, null);
                                if (iMinisApiService3 != null) {
                                    zLIZLLL = iMinisApiService3.LIZLLL(this.LIZ, uri);
                                }
                                int i3 = C2187451AjH.LIZ;
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("handleResult, instant_play_preview, canMinisHandle:");
                                sbLIZ2.append(zLIZLLL);
                                sbLIZ2.append(", qrUrl:");
                                sbLIZ2.append(str);
                                C2188811AlT.LIZIZ(sbLIZ2);
                                return zLIZLLL;
                            }
                            String strLJIIZILJ = ((IMinisApiService) ServiceManager.get().getService(IMinisApiService.class)).LJIIZILJ(uri);
                            if (C123100dR.LIZ(strLJIIZILJ)) {
                                ((IMinisApiService) ServiceManager.get().getService(IMinisApiService.class)).LJIILLIIL(uri, strLJIIZILJ, this.LIZ);
                                zLIZLLL = true;
                            }
                            int i4 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("handleResult, token, canMinisHandle:");
                            sbLIZ3.append(zLIZLLL);
                            sbLIZ3.append(", qrUrl:");
                            sbLIZ3.append(str);
                            sbLIZ3.append(", token:");
                            sbLIZ3.append(strLJIIZILJ);
                            C2188811AlT.LIZIZ(sbLIZ3);
                            return zLIZLLL;
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    return false;
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    return false;
                }
            }
        });
        List<InterfaceC19271510aP> list2 = c19271010aK.LJIILJJIL;
        C19273310ah c19273310ah = C19273310ah.LIZ;
        ((ArrayList) list2).add(c19273310ah);
        ((ArrayList) c19271010aK.LJIILJJIL).add(new AbstractC1893900zNs(r9) { // from class: X.0zvd
            @Override // X.InterfaceC19271510aP
            public final String getName() {
                return "family_pairing_handler";
            }

            @Override // X.InterfaceC19271510aP
            public final boolean LIZIZ(int i, String str) {
                if (ComplianceServiceProvider.LJIIJJI().LJIIJJI(str)) {
                    return true;
                }
                return false;
            }
        });
        ((ArrayList) c19271010aK.LJIILJJIL).add(new C1893910zNt(r9));
        ((ArrayList) c19271010aK.LJIILJJIL).add(new C1893890zNr(r9));
        ((ArrayList) c19271010aK.LJIILJJIL).add(new C1893880zNq(r9));
        ((ArrayList) c19271010aK.LJIILJJIL).add(new C10Z2(r9));
        ((ArrayList) c19271010aK.LJIILJJIL).add(new C1879390z0T(r9));
        ArrayList arrayList2 = new ArrayList();
        c19271010aK.LJIILL = arrayList2;
        arrayList2.add(new C10Z9());
        ((ArrayList) c19271010aK.LJIILL).add(c19273310ah);
        ((ArrayList) c19271010aK.LJIILL).add(new C10Z7());
        ((ArrayList) c19271010aK.LJIILL).add(new C10Z8());
        ((ArrayList) c19271010aK.LJIILL).add(new C19276910bH(r9));
        ((ArrayList) c19271010aK.LJIILL).add(new InterfaceC19271510aP() { // from class: X.10dJ
            @Override // X.InterfaceC19271510aP
            public final String LIZ() {
                return "";
            }

            @Override // X.InterfaceC19271510aP
            public final boolean LIZIZ(int i, String str) {
                return false;
            }

            @Override // X.InterfaceC19271510aP
            public final String getName() {
                return "xs_game_parse_handler";
            }
        });
        IEcRaxService iEcRaxService = (IEcRaxService) ServiceManager.get().getService(IEcRaxService.class);
        if (iEcRaxService != null && (c13bvLIZIZ2 = iEcRaxService.LIZIZ()) != null) {
            ((ArrayList) c19271010aK.LJIILL).addAll(c13bvLIZIZ2);
        }
        IThorService iThorService = (IThorService) PluggableExtentionKt.pluggableSpi(IThorService.class);
        if (iThorService != null && (c13bvLIZIZ = iThorService.LIZIZ()) != null) {
            ((ArrayList) c19271010aK.LJIILL).addAll(c13bvLIZIZ);
        }
        C0WOD.LIZ.getClass();
        IControlService iControlServiceLIZ = C0WOD.LIZ();
        if (iControlServiceLIZ != null) {
            iControlServiceLIZ.LIZIZ();
        }
        C19271010aK c19271010aK2 = this.LLJILJIL;
        this.LLJIJIL = c19271010aK2;
        c19271010aK2.LJIILIIL = this.LLJZIJLIL;
        c19271010aK2.getClass();
        C0OO0 avatarPresenter = ((IProfileService) PluggableExtentionKt.pluggableSpi(IProfileService.class)).getAvatarPresenter();
        this.LLJILJILJ = avatarPresenter;
        avatarPresenter.LJFF(this);
        this.LLJILJILJ.LJI(this, null, -1, null);
        C786410Ut5.T7(this.LLJJI, this);
        if (C036E.LIZ.LIZIZ()) {
            C786410Ut5.LLIL(this.LLJJIJIIJIL, 8);
            this.LLJJIJIL = true;
        } else {
            this.LLJJIJIL = false;
        }
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        try {
            stringExtra = getIntent().getStringExtra("source_btm_token");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        btmSDK.registerBtmPageOnCreate(this, "a2270.b6614", stringExtra);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2", "onCreate", false);
    }

    @C14EU
    public void onNetStateChangeEvent(C2411409ce c2411409ce) {
        if (isDestroyed()) {
            return;
        }
        if (C036E.LIZ.LIZIZ()) {
            C786410Ut5.LLIL(this.LLJJIJIIJIL, 8);
            this.LLJJIJIL = true;
        } else {
            C786410Ut5.LLIL(this.LLJJIJIIJIL, 0);
            this.LLJJIJIL = false;
        }
    }

    @Override // android.app.Activity
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.LLJJJJ;
        if (gestureDetector != null && gestureDetector.onTouchEvent(motionEvent)) {
            return true;
        }
        GestureDetector gestureDetector2 = this.LLJJJJLIIL;
        if (gestureDetector2 != null && gestureDetector2.onTouchEvent(motionEvent)) {
            return true;
        }
        ScaleGestureDetector scaleGestureDetector = this.LLJJJJJIL;
        if (scaleGestureDetector != null && scaleGestureDetector.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
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

    public static void LLLLLZL(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPu6YJDK2Xx2eneiRHfyG1q32gXLqFY1LU2tVfEPRsAM", null));
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C0OO0 c0oo0 = this.LLJILJILJ;
        if (c0oo0 != null) {
            c0oo0.onActivityResult(i, i2, intent);
        }
    }
}
