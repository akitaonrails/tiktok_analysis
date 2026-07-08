package com.bytedance.android.livesdk.dualdevice;

import X.C0IJT;
import X.C0U79;
import X.C0U7A;
import X.C0UGO;
import X.C0UGS;
import X.C0UHA;
import X.C1161920gLG;
import X.C1273890jFr;
import X.C465520INi;
import X.C474500IjA;
import X.C743410TEd;
import X.C748880TZe;
import X.C760080Tri;
import X.C761830TuX;
import X.C767120U7i;
import X.C768460UCm;
import X.C781270Ukn;
import X.InterfaceC1268640j7O;
import X.InterfaceC1300420jwe;
import X.InterfaceC769210UFj;
import Y.ARunnableS112S0100000_12;
import android.os.Looper;
import android.view.SurfaceView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dualdevice.DualDeviceRtcVideoWidget;
import com.bytedance.android.livesdkapi.dualdevice.IDualDeviceVideoWidget;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ttlivestreamer.core.opengl.GlUtil;

/* JADX INFO: loaded from: classes13.dex */
public final class DualDeviceRtcVideoWidget extends IDualDeviceVideoWidget {
    public final SurfaceView LL;
    public C1273890jFr LLILLJJLI;
    public InterfaceC1268640j7O LLILLL;
    public C0UHA LLILZ;
    public boolean LLILZIL;
    public final BPEAHandler LLILZLL = new BPEAHandler(Looper.getMainLooper());
    public boolean LLIZ = true;

    @Override // com.bytedance.android.livesdkapi.dualdevice.IDualDeviceVideoWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdkapi.dualdevice.IDualDeviceVideoWidget
    public final void z1(C743410TEd c743410TEd) {
    }

    @Override // com.bytedance.android.livesdkapi.dualdevice.IDualDeviceVideoWidget
    public final void A1() {
        C0UHA c0uha = this.LLILZ;
        if (c0uha != null) {
            c0uha.LIZ();
        }
    }

    @Override // com.bytedance.android.livesdkapi.dualdevice.IDualDeviceVideoWidget
    public final LiveDialogFragment x1() {
        FragmentManager fragmentManager;
        if (this.LLILZ == null || this.dataChannel == null || this.context == null) {
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
        super.onCreate();
        C1273890jFr c1273890jFr = C0UGS.LIZ;
        this.LLILLJJLI = c1273890jFr;
        this.LLILLL = c1273890jFr != null ? c1273890jFr.LJIIL() : null;
        C0UHA c0uha = new C0UHA(this.LL, this.LLILLJJLI, true, true);
        c0uha.LLILZIL = new C0UGO() { // from class: X.0UGK
            @Override // X.C0UGO
            public final void onError(int i, int i2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("CameraState onError status: ");
                sbLIZ.append(i);
                sbLIZ.append(", ret: ");
                sbLIZ.append(i2);
                sbLIZ.append(", msg: ");
                sbLIZ.append((String) null);
                C20441214yg.LJ("DualDeviceRtcVideoWidget", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.C0UGO
            public final void onInfo(int i, int i2, int i3, String str) {
                if (i == 1) {
                    DualDeviceRtcVideoWidget dualDeviceRtcVideoWidget = this.LIZ;
                    if (!dualDeviceRtcVideoWidget.LLILZIL) {
                        dualDeviceRtcVideoWidget.LLILZIL = true;
                        C786410Ut5.LJJZZIII(dualDeviceRtcVideoWidget.LLILZLL, new ARunnableS112S0100000_12(dualDeviceRtcVideoWidget, 391));
                    }
                }
            }
        };
        this.LLILZ = c0uha;
        C465520INi.LIZ.JG2(new InterfaceC1300420jwe() { // from class: X.0jBJ
            public final C1269240j8M LIZ = new C1269240j8M();

            @Override // X.InterfaceC1300420jwe
            public final double LIZ() {
                AbstractC1273900jFs abstractC1273900jFs;
                InterfaceC1268690j7T interfaceC1268690j7TLJIJJLI;
                C1273890jFr c1273890jFr2 = this.LIZIZ.LLILLJJLI;
                if (c1273890jFr2 == null || (abstractC1273900jFs = c1273890jFr2.LJI) == null || (interfaceC1268690j7TLJIJJLI = abstractC1273900jFs.LJIJJLI()) == null) {
                    return 0.0d;
                }
                return interfaceC1268690j7TLJIJJLI.LLILL();
            }

            @Override // X.InterfaceC1300420jwe
            public final double LIZIZ() {
                AbstractC1273900jFs abstractC1273900jFs;
                C1273890jFr c1273890jFr2 = this.LIZIZ.LLILLJJLI;
                if (c1273890jFr2 != null && (abstractC1273900jFs = c1273890jFr2.LJI) != null) {
                    abstractC1273900jFs.LLFFF(this.LIZ);
                }
                return this.LIZ.getVideoSourceFps();
            }

            @Override // X.InterfaceC1300420jwe
            public final double LJII() {
                AbstractC1273900jFs abstractC1273900jFs;
                C1273890jFr c1273890jFr2 = this.LIZIZ.LLILLJJLI;
                if (c1273890jFr2 != null && (abstractC1273900jFs = c1273890jFr2.LJI) != null) {
                    abstractC1273900jFs.LLFFF(this.LIZ);
                }
                return this.LIZ.getVideoSourceDeliverFps();
            }
        });
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        Cert certFindCert = CertProviderManagerKt.findCert("bpea-dual_device_page_eixt", 1476788501);
        C0UHA c0uha = this.LLILZ;
        if (c0uha != null) {
            c0uha.LJIIZILJ(certFindCert);
        }
        C0UHA c0uha2 = this.LLILZ;
        if (c0uha2 != null) {
            c0uha2.LLILZIL = null;
        }
        this.LLILLJJLI = null;
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
        this.LLILZLL.removeCallbacksAndMessages(null);
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
        super.onPause();
        C1273890jFr c1273890jFr = this.LLILLJJLI;
        if (c1273890jFr != null) {
            c1273890jFr.LJIILL(CertProviderManagerKt.findCert("bpea-dual_device_camera_on_pause", 1476788484));
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        C1273890jFr c1273890jFr = this.LLILLJJLI;
        if (c1273890jFr != null) {
            c1273890jFr.J3(CertProviderManagerKt.findCert("bpea-dual_device_camera_on_resume", 1476788503), false);
        }
    }

    public DualDeviceRtcVideoWidget(SurfaceView surfaceView) {
        this.LL = surfaceView;
    }

    @Override // com.bytedance.android.livesdkapi.dualdevice.IDualDeviceVideoWidget
    public final void B1(boolean z) {
        if (this.LLIZ == z) {
            return;
        }
        this.LLIZ = z;
        C0UHA c0uha = this.LLILZ;
        if (c0uha != null) {
            c0uha.LJIIJ(CertProviderManagerKt.findCert("bpea-dual_device_switch_camera", 1476788502));
        }
    }

    @Override // com.bytedance.android.livesdkapi.dualdevice.IDualDeviceVideoWidget
    public final void y1(boolean z) {
        Cert certFindCert;
        if (z) {
            certFindCert = CertProviderManagerKt.findCert("bpea-dual_device_open_or_close_camera", 1476788499);
        } else {
            certFindCert = CertProviderManagerKt.findCert("bpea-dual_device_close_camera", 1476788500);
        }
        C0UHA c0uha = this.LLILZ;
        if (c0uha != null) {
            c0uha.LJIILIIL(certFindCert, z);
        }
    }
}
