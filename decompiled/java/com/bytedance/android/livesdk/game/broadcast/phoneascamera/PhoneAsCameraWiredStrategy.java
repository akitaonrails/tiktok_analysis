package com.bytedance.android.livesdk.game.broadcast.phoneascamera;

import X.1JLc;
import X.AbstractC743230TDl;
import X.C0TEL;
import X.C0TEP;
import X.C0TFE;
import X.C11PQ;
import X.C1273340jEy;
import X.C20441214yg;
import X.C2188811AlT;
import X.EnumC743340TDw;
import X.InterfaceC743380TEa;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.LiveDualDeviceFlipCameraChannel;
import com.bytedance.android.livesdk.dataChannel.LiveDualDeviceFlipCameraClickMockChannel;
import com.bytedance.android.livesdk.dataChannel.LivePhoneAsCameraRetryClickEvent;
import com.bytedance.android.livesdk.dataChannel.LivePhoneAsCameraSurfaceCreatedEvent;
import com.bytedance.android.livesdk.dataChannel.PhoneAsCameraSurfaceAvailable;
import com.bytedance.android.livesdk.game.broadcast.mirror.message.DualCameraStateMessage;
import com.bytedance.android.livesdk.game.broadcast.mirror.message.DualLiveStateMessage;
import com.bytedance.android.livesdk.game.broadcast.mirror.message.PhoneAsCameraConnectMsg;
import com.bytedance.android.livesdk.game.broadcast.mirror.message.PhoneAsCameraSinkFlipCameraMsg;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class PhoneAsCameraWiredStrategy implements InterfaceC743380TEa {
    public final DataChannel LIZ;
    public final C1273340jEy LIZIZ;
    public final String LIZJ;

    @Override // X.InterfaceC743380TEa
    public final C11PQ<EnumC743340TDw> LIZ() {
        return C0TEL.LJIIIIZZ;
    }

    @Override // X.InterfaceC743380TEa
    public final C11PQ<AbstractC743230TDl> LIZLLL() {
        return C0TEL.LJII;
    }

    @Override // X.InterfaceC743380TEa
    public final void LIZIZ(boolean z) {
        int i = !z ? 1 : 0;
        C0TFE c0tfe = C0TFE.LIZ;
        DualCameraStateMessage dualCameraStateMessage = new DualCameraStateMessage(i);
        c0tfe.getClass();
        String strLIZ = C0TFE.LIZ(dualCameraStateMessage);
        if (strLIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("screen on or off msg, state : ");
            sbLIZ.append(i);
            C20441214yg.LIZIZ("PhoneAsCameraWiredStrategy", C2188811AlT.LIZIZ(sbLIZ));
            1JLc r2 = C0TEL.LIZ;
            if (r2 != null) {
                r2.LJIIIZ(10035, new Object[]{strLIZ});
            }
        }
    }

    @Override // X.InterfaceC743380TEa
    public final void LIZJ(Bundle bundle) {
        C20441214yg.LIZIZ("PhoneAsCameraWiredStrategy", "checkQRParamsAndSetup");
        C0TEL.LIZ(this.LIZIZ);
    }

    public PhoneAsCameraWiredStrategy(LifecycleOwner lifecycleOwner, DataChannel dataChannel, C1273340jEy c1273340jEy, String str) {
        this.LIZ = dataChannel;
        this.LIZIZ = c1273340jEy;
        this.LIZJ = str;
        C0TEL.LJIIJJI = new C0TEP() { // from class: X.0TEN
            @Override // X.C0TEP
            public final void LIZ(C0TER c0ter) {
                DataChannel dataChannel2;
                if (c0ter instanceof PhoneAsCameraSinkFlipCameraMsg) {
                    DataChannel dataChannel3 = this.LIZ.LIZ;
                    if (dataChannel3 != null) {
                        dataChannel3.FQ2(LiveDualDeviceFlipCameraClickMockChannel.class);
                        return;
                    }
                    return;
                }
                if (c0ter instanceof PhoneAsCameraConnectMsg) {
                    if (((PhoneAsCameraConnectMsg) c0ter).startMirror != 1) {
                        return;
                    }
                    C743540TEq.LJJIJ(C0TET.WIRED, "success", C0TES.LIZ(this.LIZ.LIZ), this.LIZ.LIZJ, null);
                } else {
                    if (!(c0ter instanceof DualLiveStateMessage) || (dataChannel2 = this.LIZ.LIZ) == null) {
                        return;
                    }
                    dataChannel2.SX0(C0TZV.class, ((DualLiveStateMessage) c0ter).roomId);
                }
            }
        };
        if (dataChannel != null) {
            dataChannel.BQ2(lifecycleOwner, LivePhoneAsCameraRetryClickEvent.class, new AwS591S0100000_12(this, 537));
            dataChannel.EQ2(lifecycleOwner, LiveDualDeviceFlipCameraChannel.class, new AwS591S0100000_12(this, 538));
            dataChannel.EQ2(lifecycleOwner, LivePhoneAsCameraSurfaceCreatedEvent.class, new AwS591S0100000_12(this, 539));
            dataChannel.EQ2(lifecycleOwner, PhoneAsCameraSurfaceAvailable.class, new AwS591S0100000_12(this, 540));
        }
        lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.bytedance.android.livesdk.game.broadcast.phoneascamera.PhoneAsCameraWiredStrategy.5
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    if (!C0TEL.LIZLLL) {
                        C20441214yg.LIZIZ("GamePhoneAsCameraWiredManager", "destroyAndRelease, hasInit false,  disconnect");
                    } else {
                        C0TEL.LIZJ();
                    }
                }
            }
        });
    }
}
