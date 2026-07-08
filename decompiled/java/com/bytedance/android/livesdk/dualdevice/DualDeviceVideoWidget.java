package com.bytedance.android.livesdk.dualdevice;

import X.C0IJT;
import X.C0U79;
import X.C0U7A;
import X.C0UGO;
import X.C0UH8;
import X.C0UHA;
import X.C0UHD;
import X.C0UNM;
import X.C1161920gLG;
import X.C1273890jFr;
import X.C1276880jKg;
import X.C20441214yg;
import X.C2188811AlT;
import X.C465520INi;
import X.C474500IjA;
import X.C743410TEd;
import X.C748880TZe;
import X.C760080Tri;
import X.C761830TuX;
import X.C767120U7i;
import X.C768460UCm;
import X.C776280Uck;
import X.C776310Ucn;
import X.C781270Ukn;
import X.EnumC1309510kBJ;
import X.InterfaceC1268640j7O;
import X.InterfaceC1300420jwe;
import X.InterfaceC743420TEe;
import X.InterfaceC769210UFj;
import Y.ARunnableS112S0100000_12;
import android.content.Context;
import android.os.Looper;
import android.view.SurfaceView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dualdevice.DualDeviceVideoWidget;
import com.bytedance.android.livesdk.livesetting.game.GameWiredPhoneCameraFixSetting;
import com.bytedance.android.livesdkapi.dualdevice.IDualDeviceVideoWidget;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ttlivestreamer.core.opengl.GlUtil;

/* JADX INFO: loaded from: classes13.dex */
public final class DualDeviceVideoWidget extends IDualDeviceVideoWidget {
    public final C0UHD LL;
    public final SurfaceView LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public C1273890jFr LLILZLL;
    public InterfaceC1268640j7O LLIZ;
    public C0UHA LLIZLLLIL;
    public boolean LLJ;
    public InterfaceC743420TEe LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public final BPEAHandler LLJI = new BPEAHandler(Looper.getMainLooper());
    public boolean LLJILLL = true;

    @Override // com.bytedance.android.livesdkapi.dualdevice.IDualDeviceVideoWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdkapi.dualdevice.IDualDeviceVideoWidget
    public final void A1() {
        C0UHA c0uha = this.LLIZLLLIL;
        if (c0uha != null) {
            c0uha.LIZ();
        }
        this.LLJILJILJ = true;
    }

    @Override // com.bytedance.android.livesdkapi.dualdevice.IDualDeviceVideoWidget
    public final LiveDialogFragment x1() {
        FragmentManager fragmentManager;
        if (this.LLIZLLLIL == null || this.dataChannel == null || this.context == null) {
            return null;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("live_take_beauty_click");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJIIJJI("live_take");
        c474500IjALIZ.LJIILL("click");
        c474500IjALIZ.LIZ();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) == null) {
            return null;
        }
        LiveDialogFragment liveDialogFragmentLIZ = C768460UCm.LIZ(this.context, this.dataChannel);
        liveDialogFragmentLIZ.show(fragmentManager, "");
        return liveDialogFragmentLIZ;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        C0UHA c0uha;
        super.onCreate();
        int i = this.LLILZIL == 1 ? 2 : 1;
        Context context = this.LLILLJJLI.getContext();
        int i2 = this.LLILLL;
        if (i2 <= 0) {
            i2 = 1280;
        }
        int i3 = this.LLILZ;
        if (i3 <= 0) {
            i3 = 960;
        }
        C776280Uck c776280Uck = new C776280Uck(context);
        c776280Uck.LJJIFFI = C781270Ukn.LJIJJ().IG0();
        c776280Uck.LJJIL = new C1276880jKg();
        c776280Uck.LJJI = new C0UNM();
        c776280Uck.LJJIZ = new C0UH8();
        c776280Uck.LJIJJLI = i;
        EnumC1309510kBJ enumC1309510kBJ = EnumC1309510kBJ.INST;
        c776280Uck.LJJJ = enumC1309510kBJ.getModelFilePath();
        c776280Uck.LJJJI = enumC1309510kBJ.getResourceFinder(context);
        c776280Uck.LJIIJ = i2;
        c776280Uck.LJIIJJI = i3;
        c776280Uck.LJJJJ = i2;
        c776280Uck.LJJJJI = i3;
        c776280Uck.LJIL = 5;
        c776280Uck.LIZLLL = "screen_dual_device_old";
        C776310Ucn c776310UcnLIZ = c776280Uck.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("widthStream = ");
        sbLIZ.append(i2);
        sbLIZ.append(",heightStream = ");
        sbLIZ.append(i3);
        C20441214yg.LJIIIZ("DualDeviceVideoWidget", C2188811AlT.LIZIZ(sbLIZ));
        C1273890jFr c1273890jFr = new C1273890jFr(c776310UcnLIZ);
        this.LLILZLL = c1273890jFr;
        this.LLIZ = c1273890jFr.LJIIL();
        C0UHA c0uha2 = new C0UHA(this.LLILLJJLI, this.LLILZLL, this.LLILZIL != 1, true);
        C0UHD c0uhd = this.LL;
        if (c0uhd != null) {
            synchronized (c0uha2) {
                c0uha2.LLILZ = c0uhd;
            }
        }
        c0uha2.LLILZIL = new C0UGO() { // from class: X.0UGL
            @Override // X.C0UGO
            public final void onError(int i4, int i5) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("CameraState onError status: ");
                sbLIZ2.append(i4);
                sbLIZ2.append(", ret: ");
                sbLIZ2.append(i5);
                sbLIZ2.append(", msg: ");
                sbLIZ2.append((String) null);
                C20441214yg.LJ("DualDeviceVideoWidget", C2188811AlT.LIZIZ(sbLIZ2));
            }

            @Override // X.C0UGO
            public final void onInfo(int i4, int i5, int i6, String str) {
                boolean z;
                if (i4 == 1) {
                    DualDeviceVideoWidget dualDeviceVideoWidget = this.LIZ;
                    if (dualDeviceVideoWidget.LLILZIL != 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!dualDeviceVideoWidget.LLJ && z) {
                        dualDeviceVideoWidget.LLJ = true;
                        C786410Ut5.LJJZZIII(dualDeviceVideoWidget.LLJI, new ARunnableS112S0100000_12(dualDeviceVideoWidget, 393));
                    }
                }
            }
        };
        if (GameWiredPhoneCameraFixSetting.INSTANCE.isDefault() && this.LLJILJILJ && (c0uha = this.LLIZLLLIL) != null) {
            c0uha.LIZ();
        }
        this.LLIZLLLIL = c0uha2;
        C465520INi.LIZ.JG2(new InterfaceC1300420jwe() { // from class: X.0jBK
            public final C1269240j8M LIZ = new C1269240j8M();

            @Override // X.InterfaceC1300420jwe
            public final double LIZ() {
                AbstractC1273900jFs abstractC1273900jFs;
                InterfaceC1268690j7T interfaceC1268690j7TLJIJJLI;
                C1273890jFr c1273890jFr2 = this.LIZIZ.LLILZLL;
                if (c1273890jFr2 == null || (abstractC1273900jFs = c1273890jFr2.LJI) == null || (interfaceC1268690j7TLJIJJLI = abstractC1273900jFs.LJIJJLI()) == null) {
                    return 0.0d;
                }
                return interfaceC1268690j7TLJIJJLI.LLILL();
            }

            @Override // X.InterfaceC1300420jwe
            public final double LIZIZ() {
                AbstractC1273900jFs abstractC1273900jFs;
                C1273890jFr c1273890jFr2 = this.LIZIZ.LLILZLL;
                if (c1273890jFr2 != null && (abstractC1273900jFs = c1273890jFr2.LJI) != null) {
                    abstractC1273900jFs.LLFFF(this.LIZ);
                }
                return this.LIZ.getVideoSourceFps();
            }

            @Override // X.InterfaceC1300420jwe
            public final double LJII() {
                AbstractC1273900jFs abstractC1273900jFs;
                C1273890jFr c1273890jFr2 = this.LIZIZ.LLILZLL;
                if (c1273890jFr2 != null && (abstractC1273900jFs = c1273890jFr2.LJI) != null) {
                    abstractC1273900jFs.LLFFF(this.LIZ);
                }
                return this.LIZ.getVideoSourceDeliverFps();
            }
        });
        InterfaceC743420TEe interfaceC743420TEe = this.LLJIJIL;
        if (interfaceC743420TEe != null) {
            interfaceC743420TEe.LIZ();
        }
        this.LLJILJIL = true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        Cert certFindCert = CertProviderManagerKt.findCert("bpea-4911", 1476788488);
        C0UHA c0uha = this.LLIZLLLIL;
        if (c0uha != null) {
            c0uha.LJIIZILJ(certFindCert);
        }
        C0UHA c0uha2 = this.LLIZLLLIL;
        if (c0uha2 != null) {
            c0uha2.LLILZIL = null;
        }
        C1273890jFr c1273890jFr = this.LLILZLL;
        if (c1273890jFr != null) {
            c1273890jFr.release(certFindCert);
        }
        GlUtil.nativeDetachThreadToOpenGl();
        C768460UCm.LIZIZ().release();
        IHostCreativeTool iHostCreativeTool = (IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class);
        if (iHostCreativeTool != null) {
            iHostCreativeTool.K42();
        }
        IHostCreativeTool iHostCreativeTool2 = (IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class);
        if (iHostCreativeTool2 != null) {
            iHostCreativeTool2.releaseGalleryModule();
        }
        C781270Ukn.LJI().releasePanelResource(true);
        C0U7A liveEffectRestoreManager = C781270Ukn.LJI().getLiveEffectRestoreManager();
        if (liveEffectRestoreManager != null) {
            ((C0U79) liveEffectRestoreManager).LIZ(this.dataChannel);
        }
        C768460UCm.LIZJ().release();
        C768460UCm.LJFF();
        C767120U7i.LIZLLL(true);
        C768460UCm.LJII().release(false);
        C768460UCm.LJIIIIZZ();
        C761830TuX.LJ();
        C760080Tri.LIZ();
        ((C0U79) C768460UCm.LJ()).LIZ(this.dataChannel);
        this.LLJI.removeCallbacksAndMessages(null);
        C465520INi.LIZ.JG2(null);
    }

    @Override // com.bytedance.android.livesdkapi.dualdevice.IDualDeviceVideoWidget
    public final void onDestroyView() {
        InterfaceC769210UFj interfaceC769210UFjLIZJ = C768460UCm.LIZJ();
        interfaceC769210UFjLIZJ.LIZIZ(true);
        interfaceC769210UFjLIZJ.LJI(this.dataChannel);
        interfaceC769210UFjLIZJ.LJ(this.dataChannel);
        interfaceC769210UFjLIZJ.LIZ();
        interfaceC769210UFjLIZJ.release();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        C1273890jFr c1273890jFr;
        super.onPause();
        if (this.LLILZIL != 1 || (c1273890jFr = this.LLILZLL) == null) {
            return;
        }
        c1273890jFr.LJIILL(CertProviderManagerKt.findCert("bpea-388", 1476788484));
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        C1273890jFr c1273890jFr;
        super.onResume();
        if (this.LLILZIL != 1 || (c1273890jFr = this.LLILZLL) == null) {
            return;
        }
        c1273890jFr.J3(CertProviderManagerKt.findCert("bpea-388", 1476788484), false);
    }

    @Override // com.bytedance.android.livesdkapi.dualdevice.IDualDeviceVideoWidget
    public final void B1(boolean z) {
        if (this.LLJILLL == z) {
            return;
        }
        this.LLJILLL = z;
        C0UHA c0uha = this.LLIZLLLIL;
        if (c0uha != null) {
            c0uha.LJIIJ(CertProviderManagerKt.findCert("bpea-3788", 1476788488));
        }
    }

    @Override // com.bytedance.android.livesdkapi.dualdevice.IDualDeviceVideoWidget
    public final void y1(boolean z) {
        Cert certFindCert;
        if (z) {
            certFindCert = CertProviderManagerKt.findCert("bpea-808", 1476788488);
        } else {
            certFindCert = CertProviderManagerKt.findCert("bpea-807", 1476788488);
        }
        C0UHA c0uha = this.LLIZLLLIL;
        if (c0uha != null) {
            c0uha.LJIILIIL(certFindCert, z);
        }
    }

    @Override // com.bytedance.android.livesdkapi.dualdevice.IDualDeviceVideoWidget
    public final void z1(C743410TEd c743410TEd) {
        this.LLJIJIL = c743410TEd;
        if (this.LLJILJIL && c743410TEd != null) {
            c743410TEd.LIZ();
        }
    }

    public DualDeviceVideoWidget(C0UHD c0uhd, SurfaceView surfaceView, int i, int i2, int i3) {
        this.LL = c0uhd;
        this.LLILLJJLI = surfaceView;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = i3;
    }
}
