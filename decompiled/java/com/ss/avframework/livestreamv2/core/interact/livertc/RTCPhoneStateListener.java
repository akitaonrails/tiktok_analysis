package com.ss.avframework.livestreamv2.core.interact.livertc;

import X.C1274890jHT;
import X.C2188811AlT;
import X.C786410Ut5;
import Y.ARunnableS32S0110000_13;
import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.google.android.gms.common.ConnectionResult;
import com.ss.bytertc.engine.RTCVideoInterface;
import com.ss.bytertc.engine.utils.LogUtil;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public final class RTCPhoneStateListener extends PhoneStateListener {
    public final Context LIZ;
    public final C1274890jHT LIZIZ;
    public final RTCVideoInterface LIZJ;
    public boolean LIZLLL;
    public final AtomicInteger LJ = new AtomicInteger(0);

    public static class PhoneCallHandler extends BPEAHandler {
        public PhoneCallHandler(Looper looper) {
            super(looper);
        }
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        super.onServiceStateChanged(serviceState);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomPhoneStateListener onServiceStateChanged: ");
        sbLIZ.append(serviceState);
        LogUtil.d("RtcPhoneStateListener", C2188811AlT.LIZIZ(sbLIZ));
    }

    public RTCPhoneStateListener(Context context, C1274890jHT c1274890jHT) {
        this.LIZ = C786410Ut5.N3(context);
        this.LIZJ = c1274890jHT.LJIILL;
        this.LIZIZ = c1274890jHT;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i, String str) {
        Looper mainLooper;
        C1274890jHT c1274890jHT;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomPhoneStateListener state: ");
        sbLIZ.append(i);
        sbLIZ.append(" incomingNumber: ");
        sbLIZ.append(str);
        LogUtil.e("RtcPhoneStateListener", C2188811AlT.LIZIZ(sbLIZ));
        boolean zIsSpeakerphoneOn = false;
        if (i != 0) {
            if (i != 1) {
                if (i == 2 && this.LJ.getAndIncrement() == 0 && this.LIZJ != null) {
                    LogUtil.d("RtcPhoneStateListener", "CustomPhoneStateListener onCallStateChanged StartCall");
                    C1274890jHT c1274890jHT2 = this.LIZIZ;
                    if (c1274890jHT2 != null) {
                        c1274890jHT2.LIZLLL();
                        return;
                    }
                    return;
                }
                return;
            }
            LogUtil.d("RtcPhoneStateListener", "CustomPhoneStateListener onCallStateChanged RING");
            if (this.LIZJ == null || !this.LJ.compareAndSet(0, 0)) {
                return;
            }
            AudioManager audioManager = (AudioManager) C786410Ut5.H2(this.LIZ, "audio");
            if ((audioManager != null && (audioManager.isBluetoothScoOn() || audioManager.isWiredHeadsetOn())) || (c1274890jHT = this.LIZIZ) == null) {
                return;
            }
            Context context = c1274890jHT.LJIIL;
            if (context != null) {
                zIsSpeakerphoneOn = ((AudioManager) C786410Ut5.H2(context, "audio")).isSpeakerphoneOn();
            }
            this.LIZLLL = zIsSpeakerphoneOn;
            return;
        }
        if (this.LJ.compareAndSet(0, 0) || this.LJ.decrementAndGet() != 0 || this.LIZJ == null) {
            return;
        }
        LogUtil.d("RtcPhoneStateListener", "CustomPhoneStateListener onCallStateChanged END");
        C1274890jHT c1274890jHT3 = this.LIZIZ;
        if (c1274890jHT3 != null) {
            c1274890jHT3.LIZJ();
        }
        AudioManager audioManager2 = (AudioManager) C786410Ut5.H2(this.LIZ, "audio");
        if (audioManager2 != null && (audioManager2.isBluetoothScoOn() || audioManager2.isWiredHeadsetOn())) {
            return;
        }
        ARunnableS32S0110000_13 aRunnableS32S0110000_13 = new ARunnableS32S0110000_13(this, this.LIZLLL, 9);
        if (Looper.myLooper() != null) {
            mainLooper = Looper.myLooper();
        } else {
            mainLooper = null;
        }
        if (Looper.getMainLooper() != null) {
            mainLooper = Looper.getMainLooper();
        }
        if (mainLooper == null) {
            return;
        }
        new PhoneCallHandler(mainLooper).postDelayed(aRunnableS32S0110000_13, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
    }
}
