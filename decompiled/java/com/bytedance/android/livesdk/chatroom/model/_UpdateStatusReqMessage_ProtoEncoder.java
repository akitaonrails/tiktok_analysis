package com.bytedance.android.livesdk.chatroom.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes36.dex */
public final class _UpdateStatusReqMessage_ProtoEncoder implements InterfaceC1132110fZB<UpdateStatusReqMessage> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, UpdateStatusReqMessage updateStatusReqMessage) {
        UpdateStatusReqMessage updateStatusReqMessage2 = updateStatusReqMessage;
        long j = updateStatusReqMessage2.roomId;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        long j2 = updateStatusReqMessage2.streamId;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJFF(j2);
        long j3 = updateStatusReqMessage2.status;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJFF(j3);
        long j4 = updateStatusReqMessage2.reasonNo;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LJFF(j4);
        C1142340fpg.LJFF(c1142350fph, 5, updateStatusReqMessage2.source);
        long j5 = updateStatusReqMessage2.frameRate;
        c1142350fph.LIZLLL(6, 0);
        c1142350fph.LJFF(j5);
        long j6 = updateStatusReqMessage2.bitRate;
        c1142350fph.LIZLLL(7, 0);
        c1142350fph.LJFF(j6);
        C1142340fpg.LIZJ(c1142350fph, 8, updateStatusReqMessage2.pushFps);
        C1142340fpg.LIZJ(c1142350fph, 9, updateStatusReqMessage2.thermalValue);
        long j7 = updateStatusReqMessage2.thermalLevel;
        c1142350fph.LIZLLL(10, 0);
        c1142350fph.LJFF(j7);
        C1142340fpg.LIZJ(c1142350fph, 11, updateStatusReqMessage2.pssAppUsage);
        C1142340fpg.LIZJ(c1142350fph, 12, updateStatusReqMessage2.memoryUsageRateAndroid);
        C1142340fpg.LIZJ(c1142350fph, 13, updateStatusReqMessage2.memoryUsageRateIos);
        C1142340fpg.LIZJ(c1142350fph, 14, updateStatusReqMessage2.cpuSpeed);
        C1142340fpg.LIZJ(c1142350fph, 15, updateStatusReqMessage2.cpuRate);
        C1142340fpg.LJFF(c1142350fph, 16, updateStatusReqMessage2.broadcastScene);
        long j8 = updateStatusReqMessage2.resolutionHeight;
        c1142350fph.LIZLLL(17, 0);
        c1142350fph.LJFF(j8);
        long j9 = updateStatusReqMessage2.resolutionWidth;
        c1142350fph.LIZLLL(18, 0);
        c1142350fph.LJFF(j9);
        long j10 = updateStatusReqMessage2.isCharging;
        c1142350fph.LIZLLL(19, 0);
        c1142350fph.LJFF(j10);
        long j11 = updateStatusReqMessage2.isHw;
        c1142350fph.LIZLLL(20, 0);
        c1142350fph.LJFF(j11);
        C1142340fpg.LIZJ(c1142350fph, 21, updateStatusReqMessage2.drop3DurationRatio);
        C1142340fpg.LIZJ(c1142350fph, 22, updateStatusReqMessage2.uiFps);
        C1142340fpg.LIZJ(c1142350fph, 23, updateStatusReqMessage2.batteryLevel);
        C1142340fpg.LIZJ(c1142350fph, 24, updateStatusReqMessage2.batteryValue);
        C1142340fpg.LJFF(c1142350fph, 25, updateStatusReqMessage2.pushParamInvalid);
        C1142340fpg.LJFF(c1142350fph, 26, updateStatusReqMessage2.eventKey);
        C1142340fpg.LJFF(c1142350fph, 27, updateStatusReqMessage2.cameraMode);
        long j12 = updateStatusReqMessage2.reportMode;
        c1142350fph.LIZLLL(28, 0);
        c1142350fph.LJFF(j12);
        long j13 = updateStatusReqMessage2.transportSendVideoStallTime;
        c1142350fph.LIZLLL(29, 0);
        c1142350fph.LJFF(j13);
        long j14 = updateStatusReqMessage2.dropCount;
        c1142350fph.LIZLLL(30, 0);
        c1142350fph.LJFF(j14);
        long j15 = updateStatusReqMessage2.transportSendVideoStallCount;
        c1142350fph.LIZLLL(31, 0);
        c1142350fph.LJFF(j15);
        C1142340fpg.LJFF(c1142350fph, 32, updateStatusReqMessage2.pusherType);
        long j16 = updateStatusReqMessage2.reconnectCount;
        c1142350fph.LIZLLL(33, 0);
        c1142350fph.LJFF(j16);
        C1142340fpg.LJFF(c1142350fph, 34, updateStatusReqMessage2.requestTimeMs);
        C1142340fpg.LIZJ(c1142350fph, 35, updateStatusReqMessage2.volume);
        C1142340fpg.LIZJ(c1142350fph, 36, updateStatusReqMessage2.cameraTargetFps);
        C1142340fpg.LIZJ(c1142350fph, 37, updateStatusReqMessage2.outCapFps);
        C1142340fpg.LIZJ(c1142350fph, 38, updateStatusReqMessage2.effectProcessTime);
        C1142340fpg.LIZJ(c1142350fph, 39, updateStatusReqMessage2.realtimeCpuSpeedScoreHost);
        C1142340fpg.LIZJ(c1142350fph, 40, updateStatusReqMessage2.realtimeThermalScoreHost);
        C1142340fpg.LIZJ(c1142350fph, 41, updateStatusReqMessage2.realtimeStreamDropScore);
        C1142340fpg.LIZJ(c1142350fph, 42, updateStatusReqMessage2.realtimeEffectProcessScore);
        C1142340fpg.LIZJ(c1142350fph, 43, updateStatusReqMessage2.realtimePerformanceHostScore);
        C1142340fpg.LIZJ(c1142350fph, 44, updateStatusReqMessage2.realtimePerformanceNormalizedHostScore);
    }
}
