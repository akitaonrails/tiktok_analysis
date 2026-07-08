package com.ss.android.ugc.asve.recorder;

import X.C01GW;
import X.C01TT;
import X.C1448320nnC;
import X.C1DHX;
import X.C1DKT;
import X.C1DKV;
import X.C21620919jT;
import X.C2216241Boc;
import X.C2253301DHk;
import X.C2253311DHl;
import X.C2254341DLk;
import X.C2484209oO;
import X.C452501pT;
import X.InterfaceC1464200oCo;
import X.InterfaceC1645720sva;
import X.InterfaceC1660820tJw;
import X.InterfaceC2183551Acz;
import X.InterfaceC2253451DHz;
import X.InterfaceC2253811DJj;
import X.InterfaceC2253831DJl;
import X.InterfaceC2253851DJn;
import X.InterfaceC2254001DKc;
import X.InterfaceC2254211DKx;
import X.InterfaceC2254511DMb;
import android.content.Context;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.asve.recorder.VERecorderImpl;
import com.ss.android.ugc.asve.recorder.camera.VECameraController;
import com.ss.android.vesdk.VEAudioEncodeSettings;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.VEPreviewSettings;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.VEVolumeParam;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class VERecorderImpl implements InterfaceC2253831DJl, GenericLifecycleObserver {
    public final Context LL;
    public final C1DKV LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public final C2253301DHk LLILZ;
    public final Function0<Boolean> LLILZIL;
    public final InterfaceC2253451DHz LLILZLL;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS579S0100000_35(this, 403));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS579S0100000_35(this, 398));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS579S0100000_35(this, 400));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS579S0100000_35(this, 401));
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C2254341DLk LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;

    @Override // X.InterfaceC2253831DJl
    public final void LIZJ(Context context) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            release();
        }
    }

    @Override // X.InterfaceC2253831DJl
    public final VERecorder LIZIZ() {
        return (VERecorder) this.LLJILJIL.getValue();
    }

    @Override // X.InterfaceC2253831DJl
    public final InterfaceC2253811DJj LJ() {
        return (InterfaceC2253811DJj) this.LLJ.getValue();
    }

    @Override // X.InterfaceC2253831DJl
    public final InterfaceC1660820tJw getAudioController() {
        return (InterfaceC1660820tJw) this.LLIZLLLIL.getValue();
    }

    @Override // X.InterfaceC2253831DJl
    public final C1DHX getCameraController() {
        return (VECameraController) this.LLJIJIL.getValue();
    }

    @Override // X.InterfaceC2253831DJl
    public final InterfaceC1645720sva getEffectController() {
        return (InterfaceC1645720sva) this.LLJI.getValue();
    }

    @Override // X.InterfaceC2253831DJl
    public final InterfaceC2254001DKc getMediaController() {
        return (InterfaceC2254001DKc) this.LLJJ.getValue();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void release() {
        C2216241Boc.LIZ.LIZ("camera ON_DESTROY ");
        ((VECameraController) this.LLJIJIL.getValue()).T3();
        LIZIZ().LJIILJJIL();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        getAudioController().LJ().addCaptureListener(LIZIZ().LJII());
    }

    @Override // X.InterfaceC2253831DJl
    public final InterfaceC2254211DKx LIZ() {
        return this.LLJILJILJ;
    }

    public final void LIZLLL(boolean z) {
        if (this.LLILZIL.invoke().booleanValue()) {
            return;
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJILLL.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC2253851DJn) it2.next()).LIZIZ(!z ? 1 : 0);
        }
    }

    public final void LJI(int i) {
        if (this.LLILZIL.invoke().booleanValue()) {
            return;
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJILLL.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC2253851DJn) it2.next()).LIZ(i);
        }
        if (i == 0) {
            LIZIZ().LJJIJLIJ(new C21620919jT());
        }
    }

    public final void LJFF(int i, int i2) {
        boolean zBooleanValue = this.LLILZIL.invoke().booleanValue();
        if (i != 1000) {
            if (i == 1001) {
                ((VECameraController) this.LLJIJIL.getValue()).LJ();
            }
        } else if (zBooleanValue && this.LLILLJJLI.LJIIL()) {
            return;
        } else {
            ((VECameraController) this.LLJIJIL.getValue()).LIZJ();
        }
        if (zBooleanValue) {
            return;
        }
        if (i != 1040) {
            if (i == 1041) {
                C1448320nnC.LIZIZ = Integer.valueOf(i2);
                return;
            }
            return;
        }
        C1448320nnC.LIZ = Integer.valueOf(i2);
    }

    public VERecorderImpl(Context context, LifecycleOwner lifecycleOwner, C1DKV c1dkv, C2253311DHl c2253311DHl, InterfaceC2253451DHz interfaceC2253451DHz, Function0 function0) {
        this.LL = context;
        this.LLILLJJLI = c1dkv;
        this.LLILLL = lifecycleOwner;
        this.LLILZ = c2253311DHl;
        this.LLILZIL = function0;
        this.LLILZLL = interfaceC2253451DHz;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS579S0100000_35(this, 399));
        this.LLJIJIL = c01gwLIZIZ;
        this.LLJILJIL = C452501pT.LIZIZ(new AwS579S0100000_35(this, 404));
        this.LLJILJILJ = new C2254341DLk(c1dkv, LIZIZ(), function0);
        this.LLJILLL = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(689));
        C01TT.LIZLLL(new AwS578S0100000_34(this, 180));
        if (c1dkv.LJIJJ()) {
            LIZIZ().LIZ(new InterfaceC1464200oCo() { // from class: X.1DJe
                @Override // X.InterfaceC1464200oCo
                public final void onCallback(int i, int i2, float f, String str) {
                    boolean z;
                    int i3 = VEInfo.TE_RECORD_INFO_VIDEO_HW_ENCODER_INIT;
                    if (i == i3) {
                        VERecorderImpl vERecorderImpl = this.LL;
                        if (i2 == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        vERecorderImpl.LIZLLL(z);
                    } else if (i == VEInfo.TE_RECORD_INFO_ENGINE_START) {
                        this.LL.LJI(i2);
                    } else if (i == i3 && i2 != 0 && !this.LL.LLILZIL.invoke().booleanValue()) {
                        throw null;
                    }
                    this.LL.LJFF(i, i2);
                }
            });
        } else {
            VERecorder vERecorderLIZIZ = LIZIZ();
            vERecorderLIZIZ.LIZIZ.LIZ(new InterfaceC2254511DMb() { // from class: X.1DJh
                @Override // X.C1DMY
                public final void LJ(int i) {
                    this.LIZ.LJI(i);
                }

                @Override // X.C1DMY
                public final void LJI(boolean z) {
                    this.LIZ.LIZLLL(z);
                }

                @Override // X.InterfaceC2254511DMb
                public final void onInfo(int i, int i2, String str) {
                    this.LIZ.LJFF(i, i2);
                }
            });
        }
        VEVolumeParam vEVolumeParam = new VEVolumeParam();
        vEVolumeParam.bgmPlayVolume = c1dkv.LJIILLIIL().LJFF();
        vEVolumeParam.enhanceSysPlayVolume = c1dkv.LJIILLIIL().LIZ();
        if (!c1dkv.LJIIZILJ().LJII()) {
            LIZIZ().LIZIZ.LJJIJIIJIL(vEVolumeParam);
        }
        LIZIZ().LJIIL().LJII();
        LIZIZ().LIZIZ.LJJIJIL = true;
        C2484209oO.LJI("TERecorderBase", "attach VEAudioCapture from other");
        if (interfaceC2253451DHz != null) {
            interfaceC2253451DHz.LIZIZ("ve_video_encode_settings");
        }
        VEVideoEncodeSettings vEVideoEncodeSettingsLIZIZ = C1DKT.LIZIZ(c1dkv);
        if (interfaceC2253451DHz != null) {
            interfaceC2253451DHz.LIZ("ve_video_encode_settings");
        }
        if (interfaceC2253451DHz != null) {
            interfaceC2253451DHz.LIZIZ("ve_audio_encode_settings");
        }
        VEAudioEncodeSettings vEAudioEncodeSettingsBuild = new VEAudioEncodeSettings.Builder().Build();
        if (interfaceC2253451DHz != null) {
            interfaceC2253451DHz.LIZ("ve_audio_encode_settings");
        }
        if (interfaceC2253451DHz != null) {
            interfaceC2253451DHz.LIZIZ("ve_preview_settings");
        }
        VEPreviewSettings vEPreviewSettingsLIZ = C1DKT.LIZ(c1dkv);
        if (interfaceC2253451DHz != null) {
            interfaceC2253451DHz.LIZ("ve_preview_settings");
        }
        if (interfaceC2253451DHz != null) {
            interfaceC2253451DHz.LIZIZ("ve_recorder_init");
        }
        LIZIZ().LJIILIIL(null, vEVideoEncodeSettingsLIZIZ, vEAudioEncodeSettingsBuild, vEPreviewSettingsLIZ, ((VECameraController) c01gwLIZIZ.getValue()).l4());
        if (interfaceC2253451DHz != null) {
            interfaceC2253451DHz.LIZ("ve_recorder_init");
            interfaceC2253451DHz.LIZIZ("ve_recorder_init_to_camera_init");
        }
        if (c1dkv.LJIIZILJ().LJII()) {
            LIZIZ().LIZIZ.LJJIJIIJIL(vEVolumeParam);
        }
        if (c1dkv.LJJIFFI()) {
            int[] iArrLJIIIIZZ = c1dkv.LJIIZILJ().LJIIIIZZ();
            if (iArrLJIIIIZZ.length == 2) {
                LIZIZ().LJJI(c1dkv.LJIIZILJ().LJIILIIL(new VESize(iArrLJIIIIZZ[0], iArrLJIIIIZZ[1])));
            }
        }
        if (c1dkv.LJJII()) {
            LIZIZ().LJJJI(null, new InterfaceC2183551Acz() { // from class: X.1DJq
                @Override // X.InterfaceC2183551Acz
                public final void onDone(int i) {
                }
            });
        }
        this.LLJJ = C452501pT.LIZIZ(new AwS579S0100000_35(this, 402));
    }
}
