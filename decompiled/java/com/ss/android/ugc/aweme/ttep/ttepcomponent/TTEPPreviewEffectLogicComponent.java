package com.ss.android.ugc.aweme.ttep.ttepcomponent;

import X.AbstractC2255721DQs;
import X.C01TT;
import X.C05YF;
import X.C091J;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0C64;
import X.C0FNV;
import X.C0PEM;
import X.C13LE;
import X.C1449000noI;
import X.C1624010sMZ;
import X.C1629130sUp;
import X.C1629720sVm;
import X.C1664770tQJ;
import X.C19EG;
import X.C1DRG;
import X.C2217381BqS;
import X.C2252611DEt;
import X.C23250099c;
import X.C863430Xu1;
import X.DialogC1389620mGW;
import X.InterfaceC1364105Vn;
import X.InterfaceC1629730sVn;
import X.InterfaceC1631630sYr;
import X.InterfaceC1644770su3;
import X.InterfaceC1648510t05;
import X.InterfaceC1648570t0B;
import X.InterfaceC1650230t2r;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC379610EuV;
import Y.AObjectS306S0200000_25;
import Y.ARunnableS25S0101000_14;
import android.content.Intent;
import android.os.Looper;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.ttep.IDownloadCallback;
import com.ss.android.ugc.aweme.ttep.external.TTEPAbilityServiceImpl;
import com.ss.android.ugc.aweme.ttep.ttepcomponent.TTEPPreviewEffectLogicComponent;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import com.ss.android.vesdk.VERecorder;
import kotlin.Unit;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;

/* JADX INFO: loaded from: classes26.dex */
public final class TTEPPreviewEffectLogicComponent extends AbstractC2255721DQs<InterfaceC1629730sVn> implements InterfaceC1629730sVn, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] $$delegatedProperties;
    public static final C1629720sVm Companion;
    public C1629130sUp customStickerCategory;
    public final C1DRG diContainer;
    public boolean isVEFirstFrameReady;
    public DialogC1389620mGW loadingDialog;
    public Effect previewEffect;
    public final InterfaceC1731706qJ stickerApiComponent$delegate = C1664770tQJ.LIZ(getDiContainer(), q.class, null);
    public final InterfaceC1731706qJ filterApiComponent$delegate = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1644770su3.class, null);
    public final InterfaceC1731706qJ gestureApiComponent$delegate = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648510t05.class, null);
    public final InterfaceC1731706qJ recordStickerLogicComponent$delegate = C1664770tQJ.LIZ(getDiContainer(), l0.class, null);
    public final InterfaceC1731706qJ cameraApi$delegate = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
    public final C19EG activity = (C19EG) getDiContainer().LJII(C19EG.class, null);
    public boolean isFirst = true;

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0sVm] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TTEPPreviewEffectLogicComponent.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        C13LE.LIZ.getClass();
        $$delegatedProperties = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(TTEPPreviewEffectLogicComponent.class, "filterApiComponent", "getFilterApiComponent()Lcom/bytedance/creativex/recorder/filter/api/FilterApiComponent;", 0), new C2217381BqS(TTEPPreviewEffectLogicComponent.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0), new C2217381BqS(TTEPPreviewEffectLogicComponent.class, "recordStickerLogicComponent", "getRecordStickerLogicComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/RecordStickerLogicComponent;", 0), new C2217381BqS(TTEPPreviewEffectLogicComponent.class, "cameraApi", "getCameraApi()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0)};
        Companion = new Object() { // from class: X.0sVm
        };
    }

    @Override // X.AbstractC2255721DQs
    public InterfaceC1629730sVn getApiComponent() {
        return this;
    }

    private final InterfaceC1644770su3 getFilterApiComponent() {
        return (InterfaceC1644770su3) this.filterApiComponent$delegate.getValue(this, $$delegatedProperties[1]);
    }

    private final InterfaceC1648510t05 getGestureApiComponent() {
        return (InterfaceC1648510t05) this.gestureApiComponent$delegate.getValue(this, $$delegatedProperties[2]);
    }

    private final void getPreviewEffect() {
        this.previewEffect = (Effect) this.activity.getIntent().getParcelableExtra("extra_ttep_preview_effect");
    }

    private final q getStickerApiComponent() {
        return (q) this.stickerApiComponent$delegate.getValue(this, $$delegatedProperties[0]);
    }

    private final void handleEffectIdPreview() {
        String strINVOKEVIRTUAL_com_ss_android_ugc_aweme_ttep_ttepcomponent_TTEPPreviewEffectLogicComponent_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = INVOKEVIRTUAL_com_ss_android_ugc_aweme_ttep_ttepcomponent_TTEPPreviewEffectLogicComponent_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(this.activity.getIntent(), "extra_ttep_preview_effect_id");
        if (strINVOKEVIRTUAL_com_ss_android_ugc_aweme_ttep_ttepcomponent_TTEPPreviewEffectLogicComponent_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra == null || strINVOKEVIRTUAL_com_ss_android_ugc_aweme_ttep_ttepcomponent_TTEPPreviewEffectLogicComponent_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra.length() == 0) {
            return;
        }
        C091J c091jLJII = getStickerApiComponent().C0().getStickerRepository().LJII();
        C1629130sUp c1629130sUp = new C1629130sUp(null, this.activity);
        c091jLJII.LIZIZ(c1629130sUp);
        this.customStickerCategory = c1629130sUp;
        C01TT.LIZLLL(new AwS569S0100000_25(this, 488));
        TTEPAbilityServiceImpl.LIZ.downloadPreviewEffectAndResource("https://effecthouse.tiktok.com", strINVOKEVIRTUAL_com_ss_android_ugc_aweme_ttep_ttepcomponent_TTEPPreviewEffectLogicComponent_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra, new IDownloadCallback() { // from class: X.0sVl
            @Override // com.ss.android.ugc.aweme.services.ttep.IDownloadCallback
            public final void onSuccess(Effect effect) {
                TTEPPreviewEffectLogicComponent tTEPPreviewEffectLogicComponent = this.LIZ;
                C1629130sUp c1629130sUp2 = tTEPPreviewEffectLogicComponent.customStickerCategory;
                if (c1629130sUp2 != null) {
                    c1629130sUp2.LIZ = effect;
                }
                tTEPPreviewEffectLogicComponent.previewEffect = effect;
                C01TT.LIZLLL(new AwS569S0100000_25(tTEPPreviewEffectLogicComponent, 490));
            }

            @Override // com.ss.android.ugc.aweme.services.ttep.IDownloadCallback
            public final void onFail(int i, String str, Exception exc) {
                int i2;
                C01TT.LIZLLL(new AwS569S0100000_25(this.LIZ, 489));
                if (i != 0) {
                    if (Intrinsics.LJFF(str, "exceed limit")) {
                        i2 = 2131833829;
                    } else if (Intrinsics.LJFF(str, "no permission")) {
                        i2 = 2131821495;
                    } else {
                        i2 = 2131848597;
                    }
                    C786410Ut5.LJLIIL(500L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS25S0101000_14(i2, this.LIZ, 2));
                }
            }
        });
    }

    public final void applyEffect() {
        if (this.previewEffect != null && this.isFirst && this.isVEFirstFrameReady) {
            this.isFirst = false;
            C1624010sMZ.LJII(getStickerApiComponent(), this.previewEffect);
            getStickerApiComponent().C0().LJII().LIZIZ(0);
            getStickerApiComponent().C0().LJII().LJIIIZ(new C1449000noI(this.previewEffect, 0, 1, false, false, false, false, (String) null, "", "", 1266));
        }
    }

    public final void dismissLoadingDialog() {
        DialogC1389620mGW dialogC1389620mGW = this.loadingDialog;
        if (dialogC1389620mGW != null) {
            C0FNV.LIZ(dialogC1389620mGW);
        }
    }

    public final InterfaceC1650230t2r getCameraApi() {
        return (InterfaceC1650230t2r) this.cameraApi$delegate.getValue(this, $$delegatedProperties[4]);
    }

    public final l0 getRecordStickerLogicComponent() {
        return (l0) this.recordStickerLogicComponent$delegate.getValue(this, $$delegatedProperties[3]);
    }

    public final void showLoadingDialog() {
        DialogC1389620mGW dialogC1389620mGW;
        DialogC1389620mGW dialogC1389620mGW2 = this.loadingDialog;
        if (dialogC1389620mGW2 == null) {
            DialogC1389620mGW dialogC1389620mGW3 = new DialogC1389620mGW(this.activity);
            this.loadingDialog = dialogC1389620mGW3;
            C0FNV.LIZJ(dialogC1389620mGW3);
        } else {
            if (dialogC1389620mGW2.isShowing() || (dialogC1389620mGW = this.loadingDialog) == null) {
                return;
            }
            C0FNV.LIZJ(dialogC1389620mGW);
        }
    }

    private final void tryApplyEffect() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C863430Xu1(this, null), 2);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        getPreviewEffect();
        tryApplyEffect();
        getFilterApiComponent().yL2(false, "build_in");
        C091J c091jLJII = getStickerApiComponent().C0().getStickerRepository().LJII();
        if (this.previewEffect != null) {
            c091jLJII.LIZIZ(new C1629130sUp(this.previewEffect, this.activity));
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "ttep_preview_by_deeplink_enable", true, true) && this.previewEffect == null) {
            handleEffectIdPreview();
        }
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        getApiComponent();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.diContainer;
    }

    public TTEPPreviewEffectLogicComponent(C1DRG c1drg) {
        this.diContainer = c1drg;
    }

    public final Object awaitRecordComponentSetUp(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        getRecordStickerLogicComponent().LLJLLIL.LIZ(this, new AObjectS306S0200000_25((Object) this, (Object) c2252611DEt, (InterfaceC1648570t0B) 9));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public final Object awaitVEFirstFrame(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        getCameraApi().St2().L0(new InterfaceC1631630sYr<Integer, Integer, String, VERecorder, Unit>() { // from class: X.0sUR
            @Override // X.InterfaceC1631630sYr
            public final Unit invoke(Integer num, Integer num2, String str, VERecorder vERecorder) {
                int iIntValue = num.intValue();
                num2.intValue();
                if (iIntValue == 1050) {
                    TTEPPreviewEffectLogicComponent tTEPPreviewEffectLogicComponent = this.LL;
                    tTEPPreviewEffectLogicComponent.isVEFirstFrameReady = true;
                    tTEPPreviewEffectLogicComponent.getCameraApi().St2().Dh(this);
                    InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = c2252611DEt;
                    Boolean bool = Boolean.TRUE;
                    C189200o6.m2constructorimpl(bool);
                    interfaceC20236714Gf.resumeWith(bool);
                }
                return Unit.LIZ;
            }
        });
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public static String INVOKEVIRTUAL_com_ss_android_ugc_aweme_ttep_ttepcomponent_TTEPPreviewEffectLogicComponent_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
