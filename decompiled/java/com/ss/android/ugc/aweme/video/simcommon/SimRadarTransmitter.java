package com.ss.android.ugc.aweme.video.simcommon;

import X.C01GW;
import X.C2344809Gs;
import X.C266290Ac7;
import X.C266330AcB;
import X.C266360AcE;
import X.C266400AcI;
import X.C266410AcJ;
import X.C266430AcL;
import X.C266450AcN;
import X.C266470AcP;
import X.InterfaceC266480AcQ;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.playerkit.radar.IRadarTransmitter;

/* JADX INFO: loaded from: classes5.dex */
public class SimRadarTransmitter implements IRadarTransmitter {
    @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
    public /* bridge */ /* synthetic */ boolean analyzerEnabled() {
        return true;
    }

    public /* bridge */ /* synthetic */ boolean localTraceEnabled() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
    public /* bridge */ /* synthetic */ int networkQualityType() {
        return -2;
    }

    @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
    public /* bridge */ /* synthetic */ void startVideo(String str) {
    }

    @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
    public /* bridge */ /* synthetic */ void tag(String str) {
    }

    @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
    public /* bridge */ /* synthetic */ InterfaceC266480AcQ tracer() {
        return null;
    }

    @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
    public /* bridge */ /* synthetic */ void transmitE(String str, String str2, Exception exc) {
    }

    @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
    public /* bridge */ /* synthetic */ void transmitI(String str, String str2) {
    }

    @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
    public /* bridge */ /* synthetic */ void transmitW(String str, String str2) {
    }

    @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
    public boolean aLogWriteFuncAddrEnabled() {
        C01GW c01gw = C266400AcI.LIZ;
        return ((Boolean) C266400AcI.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
    public int kernelLogLever() {
        C01GW c01gw = C266410AcJ.LIZ;
        return ((Number) C266410AcJ.LIZ.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
    public int kernelLogLeverPrecise() {
        C01GW c01gw = C266360AcE.LIZ;
        return ((Number) C266360AcE.LIZ.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
    public int logNotifyLevel() {
        C01GW c01gw = C266450AcN.LIZ;
        return ((Number) C266450AcN.LIZ.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
    public boolean remoteTransmitEnabled() {
        C01GW c01gw = C266290Ac7.LIZ;
        return ((Boolean) C266290Ac7.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
    public boolean sdkTransmitEnabled() {
        C01GW c01gw = C266470AcP.LIZ;
        return ((Boolean) C266470AcP.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
    public boolean ttSDKALogOptEnabled() {
        C01GW c01gw = C266330AcB.LIZ;
        return ((Boolean) C266330AcB.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
    public boolean enabled() {
        return C266430AcL.LIZ();
    }

    @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
    public long getALogSimpleWriteFuncAddr() {
        return ALog.getALogSimpleWriteFuncAddr();
    }

    public void transmitI(String str) {
        C2344809Gs.LJ(str);
    }

    public void transmitE(String str, Exception exc) throws Exception {
        C2344809Gs.LIZIZ(str, exc);
    }
}
