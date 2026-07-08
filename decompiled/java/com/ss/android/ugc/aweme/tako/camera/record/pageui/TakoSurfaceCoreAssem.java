package com.ss.android.ugc.aweme.tako.camera.record.pageui;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01D1;
import X.C09R3;
import X.C127G;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C1780100wQK;
import X.C1780740wRM;
import X.C19719912Dl;
import X.C1A66;
import X.C20740416Dy;
import X.C2208671BcP;
import X.C2213981Bky;
import X.C2217381BqS;
import X.C687700QyG;
import X.C724750Sbp;
import X.C786410Ut5;
import X.EnumC1778840wOI;
import X.InterfaceC1146704e9;
import X.InterfaceC1464200oCo;
import X.InterfaceC20740516Dz;
import X.InterfaceC2217461Bqa;
import X.InterfaceSurfaceHolderCallbackC20740316Dx;
import Y.AObjectS80S0000000_33;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.camera.record.TakoRecordCoreViewModel;
import com.ss.android.ugc.aweme.tako.camera.record.TakoSurfaceScope;
import com.ss.android.ugc.aweme.tako.vm.TakoRecordFragmentViewModel;
import com.ss.android.vesdk.VEAudioEncodeSettings;
import com.ss.android.vesdk.VECameraCapture;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.VEPreviewSettings;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VESize;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes34.dex */
public final class TakoSurfaceCoreAssem extends AbstractC738140SxQ implements InterfaceC20740516Dz, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final AssemVMLazy LL;
    public final AssemVMLazy LLILLJJLI;
    public C127G LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoSurfaceCoreAssem.class, "coreVM", "getCoreVM()Lcom/ss/android/ugc/aweme/tako/camera/record/TakoRecordCoreViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TakoSurfaceCoreAssem.class, "recordFragmentVM", "getRecordFragmentVM()Lcom/ss/android/ugc/aweme/tako/vm/TakoRecordFragmentViewModel;", 0);
        c09r3.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public TakoSurfaceCoreAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoRecordCoreViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ, 1295), AFwS279S0000000_33.get$arr$(241), null, true);
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TakoRecordFragmentViewModel.class);
        this.LLILLJJLI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ2, 1296), AFwS279S0000000_33.get$arr$(242), null, true);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TakoSurfaceScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TakoSurfaceScope.class);
        return arrayList;
    }

    public final TakoRecordCoreViewModel bo() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        return (TakoRecordCoreViewModel) assemVMLazy.getValue();
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final TakoRecordFragmentViewModel m328do() {
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        return (TakoRecordFragmentViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC20740516Dz
    public final void LLJLIL() {
        TakoRecordCoreViewModel takoRecordCoreViewModelBo = bo();
        VECameraCapture vECameraCapture = takoRecordCoreViewModelBo.LLILLJJLI;
        if (vECameraCapture != null) {
            vECameraCapture.LJJ(null);
        }
        VERecorder vERecorder = takoRecordCoreViewModelBo.LL;
        if (vERecorder != null) {
            vERecorder.LIZIZ.LJJJJ(true);
        }
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLILLL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLILLL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{TakoRecordCoreViewModel.class, new AObjectS80S0000000_33(this, 6)}, defaultViewModelProviderFactory);
                    this.LLILLL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        InterfaceSurfaceHolderCallbackC20740316Dx interfaceSurfaceHolderCallbackC20740316Dx = m328do().LLILLL;
        if (interfaceSurfaceHolderCallbackC20740316Dx != null) {
            C20740416Dy c20740416Dy = (C20740416Dy) interfaceSurfaceHolderCallbackC20740316Dx;
            InterfaceC20740516Dz interfaceC20740516Dz = c20740416Dy.LLILZ;
            if (interfaceC20740516Dz != null) {
                interfaceC20740516Dz.LLJLIL();
            }
            c20740416Dy.LLILZ = null;
        }
        InterfaceSurfaceHolderCallbackC20740316Dx interfaceSurfaceHolderCallbackC20740316Dx2 = m328do().LLILLL;
        if (interfaceSurfaceHolderCallbackC20740316Dx2 != null) {
            C20740416Dy c20740416Dy2 = (C20740416Dy) interfaceSurfaceHolderCallbackC20740316Dx2;
            c20740416Dy2.LLILZ = this;
            SurfaceHolder surfaceHolder = c20740416Dy2.LLILLL;
            if (surfaceHolder != null) {
                J6(surfaceHolder.getSurface());
            }
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        VECameraCapture vECameraCapture = bo().LLILLJJLI;
        if (vECameraCapture != null) {
            vECameraCapture.LJJ(null);
        }
    }

    @Override // X.InterfaceC20740516Dz
    public final void J6(Surface surface) {
        int measuredWidth;
        int measuredHeight;
        VERecorder vERecorder;
        SurfaceView surfaceView;
        SurfaceView surfaceView2;
        final TakoRecordCoreViewModel takoRecordCoreViewModelBo = bo();
        InterfaceSurfaceHolderCallbackC20740316Dx interfaceSurfaceHolderCallbackC20740316Dx = m328do().LLILLL;
        if (interfaceSurfaceHolderCallbackC20740316Dx != null && (surfaceView2 = ((C20740416Dy) interfaceSurfaceHolderCallbackC20740316Dx).LL) != null) {
            measuredWidth = surfaceView2.getMeasuredWidth();
        } else {
            measuredWidth = 720;
        }
        InterfaceSurfaceHolderCallbackC20740316Dx interfaceSurfaceHolderCallbackC20740316Dx2 = m328do().LLILLL;
        if (interfaceSurfaceHolderCallbackC20740316Dx2 != null && (surfaceView = ((C20740416Dy) interfaceSurfaceHolderCallbackC20740316Dx2).LL) != null) {
            measuredHeight = surfaceView.getMeasuredHeight();
        } else {
            measuredHeight = 1280;
        }
        takoRecordCoreViewModelBo.LLIZLLLIL = new VESize(measuredWidth, measuredHeight);
        Map<String, Object> mapLIZJ = ((C2208671BcP) takoRecordCoreViewModelBo.LLIZ.getValue()).LIZJ();
        VEConfigCenter vEConfigCenter = VEConfigCenter.getInstance();
        for (Map.Entry entry : ((HashMap) mapLIZJ).entrySet()) {
            vEConfigCenter.updateValue((String) entry.getKey(), entry.getValue());
        }
        C1A66.LIZJ(C2213981Bky.LIZIZ.getApplicationContext(), C786410Ut5.W3().getAbsolutePath());
        Map<String, Object> mapLIZJ2 = ((C2208671BcP) takoRecordCoreViewModelBo.LLIZ.getValue()).LIZJ();
        VEConfigCenter vEConfigCenter2 = VEConfigCenter.getInstance();
        for (Map.Entry entry2 : ((HashMap) mapLIZJ2).entrySet()) {
            vEConfigCenter2.updateValue((String) entry2.getKey(), entry2.getValue());
        }
        VECameraSettings.Builder builder = new VECameraSettings.Builder();
        builder.setCameraFacing(VECameraSettings.CAMERA_FACING_ID.FACING_BACK);
        builder.setCameraType(VECameraSettings.CAMERA_TYPE.TYPE2);
        builder.setPreviewSize(measuredWidth, measuredHeight);
        VECameraSettings vECameraSettingsBuild = builder.build();
        VECameraCapture vECameraCapture = new VECameraCapture();
        takoRecordCoreViewModelBo.LLILLJJLI = vECameraCapture;
        vECameraCapture.LJIIL(C2213981Bky.LIZIZ.getApplicationContext(), vECameraSettingsBuild);
        VECameraCapture vECameraCapture2 = takoRecordCoreViewModelBo.LLILLJJLI;
        if (vECameraCapture2 != null) {
            vECameraCapture2.LJ(TokenCert.Companion.with("bpea-tako_image_upload_request_permission_camera"));
        }
        try {
            C2213981Bky.LIZIZ.getApplicationContext();
            vERecorder = new VERecorder("TakoRecord");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            vERecorder = null;
        }
        takoRecordCoreViewModelBo.LL = vERecorder;
        if (vERecorder != null) {
            vERecorder.LJIJJLI(new InterfaceC1464200oCo() { // from class: X.1A3A
                @Override // X.InterfaceC1464200oCo
                public final void onCallback(int i, int i2, float f, String str) {
                    if (i == VEInfo.TE_RECORD_INFO_ENGINE_INIT) {
                        C2484209oO.LJI("Migo-camera", "TE_RECORD_INFO_ENGINE_INIT...");
                        return;
                    }
                    if (i == VEInfo.TE_RECORD_INFO_ENGINE_START) {
                        C2484209oO.LJI("Migo-camera", "TE_RECORD_INFO_ENGINE_START...");
                        return;
                    }
                    if (i == VEInfo.TE_RECORD_INFO_ENGINE_PAUSE) {
                        C2484209oO.LJI("Migo-camera", "TE_RECORD_INFO_ENGINE_PAUSE...");
                        return;
                    }
                    if (i == VEInfo.TE_RECORD_INFO_ENGINE_STOP) {
                        C2484209oO.LJI("Migo-camera", "TE_RECORD_INFO_ENGINE_STOP...");
                        return;
                    }
                    if (i == VEInfo.TE_RECORD_INFO_ENGINE_DESTROY) {
                        C2484209oO.LJI("Migo-camera", "TE_RECORD_INFO_ENGINE_DESTROY...");
                        return;
                    }
                    if (i == 1000) {
                        C2484209oO.LJI("Migo-camera", "TET_RENDER_CREATED...");
                        TakoRecordCoreViewModel takoRecordCoreViewModel = takoRecordCoreViewModelBo;
                        VERecorder vERecorder2 = takoRecordCoreViewModel.LL;
                        if (vERecorder2 == null) {
                            return;
                        }
                        vERecorder2.LJJIZ(takoRecordCoreViewModel.LLILLJJLI);
                        return;
                    }
                    if (i == 1004) {
                        C2484209oO.LJI("Migo-camera", "TET_RENDER_DRAW_BEFORE...");
                        return;
                    }
                    if (i == 1005) {
                        C2484209oO.LJI("Migo-camera", "TET_RENDER_DRAW_AFTER...");
                        return;
                    }
                    if (i != 1001) {
                        return;
                    }
                    C2484209oO.LJI("Migo-camera", "TET_RENDER_DESTROYED...");
                    VECameraCapture vECameraCapture3 = takoRecordCoreViewModelBo.LLILLJJLI;
                    if (vECameraCapture3 == null) {
                        return;
                    }
                    vECameraCapture3.LIZ();
                }
            });
        }
        VERecorder vERecorder2 = takoRecordCoreViewModelBo.LL;
        if (vERecorder2 != null) {
            vERecorder2.LJIILIIL(takoRecordCoreViewModelBo.LLILLJJLI, new C1780100wQK(1).LIZ(), new VEAudioEncodeSettings.Builder().Build(), new VEPreviewSettings.Builder().build(), false);
        }
        VECameraCapture vECameraCapture3 = takoRecordCoreViewModelBo.LLILLJJLI;
        if (vECameraCapture3 != null) {
            vECameraCapture3.LLIZ = new C1780740wRM(takoRecordCoreViewModelBo);
            vECameraCapture3.LLJILJIL.queryZoomAbility(vECameraCapture3, true);
        }
        VERecorder vERecorder3 = takoRecordCoreViewModelBo.LL;
        if (vERecorder3 != null) {
            VEDisplaySettings.Builder builder2 = new VEDisplaySettings.Builder();
            builder2.setFitMode(EnumC1778840wOI.SCALE_MODE_CENTER_INSIDE);
            builder2.setTranslateY(0);
            builder2.setRenderSize(new VESize(measuredWidth, measuredHeight));
            vERecorder3.LJJI(builder2.build());
        }
        VERecorder vERecorder4 = takoRecordCoreViewModelBo.LL;
        if (vERecorder4 != null) {
            vERecorder4.LJJJ(surface);
        }
    }

    @Override // X.InterfaceC20740516Dz
    public final void LLIIZ(int i, int i2, Surface surface) {
        VERecorder vERecorder = bo().LL;
        if (vERecorder != null) {
            vERecorder.LIZJ(surface);
        }
    }
}
