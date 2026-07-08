package com.ss.android.vesdk;

import X.C1621480sIU;
import X.C1664350tPd;
import X.C2218021BrU;
import X.C2218031BrV;
import X.C2484209oO;
import X.InterfaceC1621790sIz;
import X.InterfaceC2218061BrY;
import X.InterfaceC2218071BrZ;
import X.InterfaceC2218081Bra;
import X.InterfaceC2218141Brg;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ttve.nativePort.TEAAudioRecord;
import com.ss.android.vesdk.VEAudioCaptureSettings;

/* JADX INFO: loaded from: classes35.dex */
public class VEAudioCapture implements InterfaceC2218061BrY {
    public C2218021BrU audioRecord;
    public C1664350tPd<InterfaceC2218071BrZ> mCaptureListeners = new C1664350tPd<>();
    public InterfaceC1621790sIz mAudioDeviceListener = null;

    public static boolean isSupportEarBack(C1621480sIU c1621480sIU) {
        return false;
    }

    public void release() {
        release(null);
    }

    public int start() {
        return start(null);
    }

    public int stop() {
        return stop(null);
    }

    public void clean() {
        this.mCaptureListeners.LIZIZ();
    }

    public InterfaceC2218141Brg createAudioWriter() {
        TEAAudioRecord tEAAudioRecord;
        C2218021BrU c2218021BrU = this.audioRecord;
        if (!(c2218021BrU.LIZLLL instanceof TEAAudioRecord) || (tEAAudioRecord = (TEAAudioRecord) c2218021BrU.LIZLLL) == null) {
            return null;
        }
        return tEAAudioRecord.createAudioWriter();
    }

    public int getMicState() {
        return this.audioRecord.LIZ;
    }

    public void onBackGround() {
        this.audioRecord.LIZIZ = true;
    }

    public void onForeGround() {
        this.audioRecord.LIZIZ = false;
    }

    public VEAudioCapture() {
        C2218021BrU c2218021BrU = new C2218021BrU();
        this.audioRecord = c2218021BrU;
        c2218021BrU.LJ = new C2218031BrV(this);
    }

    public boolean addCaptureListener(InterfaceC2218081Bra interfaceC2218081Bra) {
        if (interfaceC2218081Bra == null) {
            C2484209oO.LIZJ("VEAudioCapture", "addCaptureListener error listener is null!!!");
            return false;
        }
        this.audioRecord.LIZJ = interfaceC2218081Bra;
        return this.mCaptureListeners.LIZ(interfaceC2218081Bra);
    }

    public boolean addStateListener(InterfaceC2218071BrZ interfaceC2218071BrZ) {
        if (interfaceC2218071BrZ == null) {
            C2484209oO.LIZJ("VEAudioCapture", "addStateListener error listener is null!!!");
            return false;
        }
        this.audioRecord.LIZJ = interfaceC2218071BrZ;
        return this.mCaptureListeners.LIZ(interfaceC2218071BrZ);
    }

    @Override // X.InterfaceC2218061BrY
    public int init(VEAudioCaptureSettings vEAudioCaptureSettings) {
        VEAudioCaptureSettings.Builder builder = new VEAudioCaptureSettings.Builder(vEAudioCaptureSettings);
        builder.setAudioSource(VEConfigCenter.getInstance().getValue("ve_audio_source_type", 1));
        this.audioRecord.init(builder.build());
        return 0;
    }

    @Override // X.InterfaceC2218061BrY
    public void release(Cert cert) {
        this.audioRecord.release(cert);
    }

    public boolean removeCaptureListener(InterfaceC2218081Bra interfaceC2218081Bra) {
        return this.mCaptureListeners.LJ(interfaceC2218081Bra);
    }

    public boolean removeStateListener(InterfaceC2218071BrZ interfaceC2218071BrZ) {
        return this.mCaptureListeners.LJ(interfaceC2218071BrZ);
    }

    public void setAudioDevice(C1621480sIU c1621480sIU) {
        if (c1621480sIU == null) {
            return;
        }
        this.audioRecord.LJIJI = c1621480sIU;
        InterfaceC1621790sIz interfaceC1621790sIz = this.mAudioDeviceListener;
        if (interfaceC1621790sIz != null) {
            interfaceC1621790sIz.LIZ(c1621480sIU.LIZ);
        }
    }

    public void setAudioDeviceChangeListener(InterfaceC1621790sIz interfaceC1621790sIz) {
        this.mAudioDeviceListener = interfaceC1621790sIz;
    }

    @Override // X.InterfaceC2218061BrY
    public int start(Cert cert) {
        return this.audioRecord.start(cert);
    }

    @Override // X.InterfaceC2218061BrY
    public int stop(Cert cert) {
        return this.audioRecord.stop(cert);
    }
}
