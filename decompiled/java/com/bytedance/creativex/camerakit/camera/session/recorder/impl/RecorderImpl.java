package com.bytedance.creativex.camerakit.camera.session.recorder.impl;

import X.C01GW;
import X.C0CNO;
import X.C1624510sNN;
import X.C1A66;
import X.C1DHA;
import X.C1DHX;
import X.C1DKT;
import X.C1DMD;
import X.C2188811AlT;
import X.C2216241Boc;
import X.C2253271DHh;
import X.C2254321DLi;
import X.C2254401DLq;
import X.C2281551ESb;
import X.C2286708xd;
import X.C2484209oO;
import X.C452501pT;
import X.EnumC21570019bG;
import X.InterfaceC1631630sYr;
import X.InterfaceC1645720sva;
import X.InterfaceC1660820tJw;
import X.InterfaceC2183551Acz;
import X.InterfaceC2253451DHz;
import X.InterfaceC2253811DJj;
import X.InterfaceC2254001DKc;
import X.InterfaceC2254011DKd;
import X.InterfaceC2254211DKx;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ttve.nativePort.TERecorderInterface;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VEAudioEncodeSettings;
import com.ss.android.vesdk.VEPreviewSettings;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.VEVolumeParam;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;
import com.ss.android.vesdk.k;
import java.io.File;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class RecorderImpl implements C1DHA, GenericLifecycleObserver {
    public final C2253271DHh LL;
    public volatile boolean LLILLJJLI;
    public volatile boolean LLJIJIL;
    public final String LLJILJIL;
    public final String LLJILJILJ;
    public long LLJILLL;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS579S0100000_35(this, 113));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS579S0100000_35(this, 104));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS579S0100000_35(this, 106));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS579S0100000_35(this, 105));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS579S0100000_35(this, 110));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS579S0100000_35(this, 108));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS579S0100000_35(this, 112));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS579S0100000_35(this, 107));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 333));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS579S0100000_35(this, 111));

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            release();
        }
    }

    @Override // X.C1DHA
    public final InterfaceC2254211DKx LIZ() {
        return (InterfaceC2254211DKx) this.LLJ.getValue();
    }

    @Override // X.C1DHA
    public final boolean LIZIZ() {
        return this.LL.LIZLLL.LIZIZ();
    }

    @Override // X.C1DHA
    public final InterfaceC2253811DJj LJ() {
        return (InterfaceC2253811DJj) this.LLJI.getValue();
    }

    @Override // X.C1DHA
    public final InterfaceC2254011DKd LJFF() {
        return (InterfaceC2254011DKd) this.LLJJI.getValue();
    }

    @Override // X.C1DHA
    public final VERecorder LJI() {
        return (VERecorder) this.LLILLL.getValue();
    }

    @Override // X.C1DHA
    public final InterfaceC1660820tJw getAudioController() {
        return (InterfaceC1660820tJw) this.LLILZLL.getValue();
    }

    @Override // X.C1DHA
    public final C1DHX getCameraController() {
        return (C1DHX) this.LLILZIL.getValue();
    }

    @Override // X.C1DHA
    public final InterfaceC1645720sva getEffectController() {
        return (InterfaceC1645720sva) this.LLIZLLLIL.getValue();
    }

    @Override // X.C1DHA
    public final InterfaceC2254001DKc getMediaController() {
        return (InterfaceC2254001DKc) this.LLIZ.getValue();
    }

    public final void init() {
        Surface surface;
        if (this.LLILLJJLI) {
            return;
        }
        C0CNO.LIZLLL(0L, new AwS579S0100000_35(this, 109));
        if (this.LL.LIZLLL.LJJ()) {
            SurfaceHolder surfaceHolder = this.LL.LIZLLL.getSurfaceHolder();
            if (surfaceHolder != null) {
                surfaceHolder.addCallback(new SurfaceHolder.Callback() { // from class: X.1DJf
                    @Override // android.view.SurfaceHolder.Callback
                    public final void surfaceChanged(SurfaceHolder surfaceHolder2, int i, int i2, int i3) {
                    }

                    @Override // android.view.SurfaceHolder.Callback
                    public final void surfaceCreated(SurfaceHolder surfaceHolder2) {
                        this.LL.LJIIIIZZ();
                        this.LL.getMediaController().b5(surfaceHolder2.getSurface(), AFwS283S0000000_35.get$arr$(122));
                    }

                    @Override // android.view.SurfaceHolder.Callback
                    public final void surfaceDestroyed(SurfaceHolder surfaceHolder2) {
                        this.LL.getMediaController().LIZ();
                    }
                });
            }
            SurfaceHolder surfaceHolder2 = this.LL.LIZLLL.getSurfaceHolder();
            if (surfaceHolder2 != null && (surface = surfaceHolder2.getSurface()) != null && surface.isValid()) {
                LJIIIIZZ();
                getMediaController().b5(surface, AFwS231S0000000_3.get$arr$(132));
            }
        }
        if (!this.LL.LIZLLL.LIZIZ()) {
            C1A66.LIZIZ();
        }
        this.LLJILLL = System.currentTimeMillis();
        VEVolumeParam vEVolumeParam = new VEVolumeParam();
        vEVolumeParam.bgmPlayVolume = this.LL.LIZLLL.LJIILLIIL().LJFF();
        vEVolumeParam.enhanceSysPlayVolume = this.LL.LIZLLL.LJIILLIIL().LIZ();
        InterfaceC1631630sYr<Integer, Integer, String, VERecorder, Unit> interfaceC1631630sYr = this.LL.LJIIIIZZ;
        if (interfaceC1631630sYr != null) {
            LJFF().L0(interfaceC1631630sYr);
        }
        LJFF().LIZ();
        if (!this.LL.LIZLLL.LJIIZILJ().LJII()) {
            LJI().LIZIZ.LJJIJIIJIL(vEVolumeParam);
        }
        if (!this.LL.LIZLLL.LIZIZ()) {
            LJI().LJIIL().LJII();
        }
        LJI().LIZIZ.LJJIJIL = true;
        C2484209oO.LJI("TERecorderBase", "attach VEAudioCapture from other");
        InterfaceC2253451DHz interfaceC2253451DHz = this.LL.LJ;
        if (interfaceC2253451DHz != null) {
            interfaceC2253451DHz.LIZIZ("ve_video_encode_settings");
        }
        VEVideoEncodeSettings vEVideoEncodeSettingsLIZIZ = C1DKT.LIZIZ(this.LL.LIZLLL);
        InterfaceC2253451DHz interfaceC2253451DHz2 = this.LL.LJ;
        if (interfaceC2253451DHz2 != null) {
            interfaceC2253451DHz2.LIZ("ve_video_encode_settings");
        }
        InterfaceC2253451DHz interfaceC2253451DHz3 = this.LL.LJ;
        if (interfaceC2253451DHz3 != null) {
            interfaceC2253451DHz3.LIZIZ("ve_audio_encode_settings");
        }
        VEAudioEncodeSettings vEAudioEncodeSettingsBuild = new VEAudioEncodeSettings.Builder().Build();
        InterfaceC2253451DHz interfaceC2253451DHz4 = this.LL.LJ;
        if (interfaceC2253451DHz4 != null) {
            interfaceC2253451DHz4.LIZ("ve_audio_encode_settings");
        }
        InterfaceC2253451DHz interfaceC2253451DHz5 = this.LL.LJ;
        if (interfaceC2253451DHz5 != null) {
            interfaceC2253451DHz5.LIZIZ("ve_preview_settings");
        }
        VEPreviewSettings vEPreviewSettingsLIZ = C1DKT.LIZ(this.LL.LIZLLL);
        InterfaceC2253451DHz interfaceC2253451DHz6 = this.LL.LJ;
        if (interfaceC2253451DHz6 != null) {
            interfaceC2253451DHz6.LIZ("ve_preview_settings");
        }
        InterfaceC2253451DHz interfaceC2253451DHz7 = this.LL.LJ;
        if (interfaceC2253451DHz7 != null) {
            interfaceC2253451DHz7.LIZIZ("ve_recorder_init");
        }
        LJI().LJIILIIL(null, vEVideoEncodeSettingsLIZIZ, vEAudioEncodeSettingsBuild, vEPreviewSettingsLIZ, this.LL.LIZLLL.LJIJJLI() ? false : getCameraController().l4());
        Effect effect = this.LL.LJII;
        if (effect != null) {
            if (!C2281551ESb.LIZIZ.LJ() || C2286708xd.LIZJ(effect.getUnzipPath())) {
                VEEffectFilterParam vEEffectFilterParamLIZ = C1624510sNN.LIZ(effect);
                C2216241Boc c2216241Boc = C2216241Boc.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("EffectCoreLine::recorderConfig.preloadEffect toVEEffectFilterParam = ");
                sbLIZ.append(vEEffectFilterParamLIZ);
                c2216241Boc.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                LJI().LJJJJJL(vEEffectFilterParamLIZ);
            } else {
                C2216241Boc.LIZ.LIZ("[lazyEffect] effect not ready, lazy set effect");
            }
        }
        InterfaceC2253451DHz interfaceC2253451DHz8 = this.LL.LJ;
        if (interfaceC2253451DHz8 != null) {
            interfaceC2253451DHz8.LIZ("ve_recorder_init");
        }
        InterfaceC2253451DHz interfaceC2253451DHz9 = this.LL.LJ;
        if (interfaceC2253451DHz9 != null) {
            interfaceC2253451DHz9.LIZIZ("ve_recorder_init_to_camera_init");
        }
        if (this.LL.LIZLLL.LJIIZILJ().LJII()) {
            LJI().LIZIZ.LJJIJIIJIL(vEVolumeParam);
        }
        if (this.LL.LIZLLL.LJJIFFI()) {
            int[] iArrLJIIIIZZ = this.LL.LIZLLL.LJIIZILJ().LJIIIIZZ();
            if (iArrLJIIIIZZ.length == 2) {
                LJI().LJJI(this.LL.LIZLLL.LJIIZILJ().LJIILIIL(new VESize(iArrLJIIIIZZ[0], iArrLJIIIIZZ[1])));
            }
        }
        if (this.LL.LIZLLL.LJJII()) {
            LJI().LJJJI(null, new InterfaceC2183551Acz() { // from class: X.1DJ1
                @Override // X.InterfaceC2183551Acz
                public final void onDone(int i) {
                }
            });
        }
        this.LLILLJJLI = true;
    }

    @Override // X.C1DHA
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void release() {
        C2216241Boc.LIZ.LIZ("camera ON_DESTROY ");
        getCameraController().T3();
        LJI().LJIILJJIL();
    }

    @Override // X.C1DHA
    public final void LJIIIIZZ() {
        getEffectController().ho();
        if (this.LLJIJIL || this.LLJJ.getValue() != EnumC21570019bG.DUET) {
            return;
        }
        C2216241Boc.LIZ.uu("initDuet() called");
        InterfaceC2253811DJj interfaceC2253811DJjLJ = LJ();
        String str = this.LLJILJIL;
        String str2 = this.LLJILJILJ;
        boolean z = ((double) this.LL.LIZLLL.LJJIII().LIZJ()) * 1.3333333333333333d > ((double) this.LL.LIZLLL.LJJIII().LJFF());
        this.LL.LIZLLL.LJJIII().LIZ();
        interfaceC2253811DJjLJ.LIZLLL(str, str2, z);
        LJ().LIZ();
        this.LLJIJIL = true;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        getAudioController().LJ().addCaptureListener(LJI().LJII());
    }

    @Override // X.C1DHA
    public final long getInitRecorderTime() {
        return this.LLJILLL;
    }

    public RecorderImpl(C2253271DHh c2253271DHh) {
        this.LL = c2253271DHh;
        this.LLJILJIL = c2253271DHh.LIZLLL.LJJIII().LJ();
        this.LLJILJILJ = c2253271DHh.LIZLLL.LJJIII().LIZLLL();
    }

    @Override // X.C1DHA
    public final void LJII(C1DMD c1dmd) {
        int iLIZIZ;
        VERecorder vERecorderLJI = LJI();
        k kVar = vERecorderLJI.LIZIZ;
        kVar.LIZIZ = c1dmd;
        if (kVar.LJJJJ.LJFF != 0 && kVar.LJJJJ.LJFF != 1) {
            C2484209oO.LIZJ("TERecorder", "Invoking the wrong timing!");
        } else {
            kVar.LIZIZ = c1dmd;
            ((LinkedList) kVar.LJJJJ.LJ).clear();
            ((LinkedList) kVar.LJJJJ.LIZLLL).clear();
            kVar.LJJJJ.getClass();
            String strLIZJ = c1dmd.LIZJ();
            String str = File.separator;
            if (!strLIZJ.endsWith(str)) {
                C2254401DLq c2254401DLq = kVar.LJJJJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c1dmd.LIZJ());
                sbLIZ.append(str);
                c2254401DLq.LIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            TERecorderInterface tERecorderInterface = kVar.LJJJ;
            C2254401DLq c2254401DLq2 = kVar.LJJJJ;
            if (tERecorderInterface.LIZ == 0) {
                iLIZIZ = -112;
            } else {
                tERecorderInterface.LJIL("RecordContext", C2254321DLi.LIZIZ(c2254401DLq2));
                iLIZIZ = tERecorderInterface.LIZIZ();
                if (iLIZIZ == 0) {
                    vERecorderLJI.LIZ = c1dmd;
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("changeResManager failed ret=");
            sbLIZ2.append(iLIZIZ);
            C2484209oO.LIZJ("TERecorder", C2188811AlT.LIZIZ(sbLIZ2));
        }
        getEffectController().ao();
    }
}
