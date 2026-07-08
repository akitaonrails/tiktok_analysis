package com.bytedance.android.livesdk.chatroom.api;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.chatroom.api.TimerDetail;

/* JADX INFO: loaded from: classes36.dex */
public final class _TimerDetail_ProtoEncoder implements InterfaceC1132110fZB<TimerDetail> {
    public static int LIZJ(TimerDetail timerDetail) {
        int iLIZ = 0;
        int iLJIIL = C1142340fpg.LJIIL(1, timerDetail.timerId) + C1142340fpg.LJIIL(2, timerDetail.anchorId) + C1142340fpg.LJIIL(3, timerDetail.startTimestampS) + C1142340fpg.LJIIL(4, timerDetail.startCountdownTimeS) + C1142340fpg.LJIILL(5, timerDetail.anchorSideTitle) + C1142340fpg.LJIILL(6, timerDetail.userSideTitle) + C1142340fpg.LJIIL(7, timerDetail.timeIncreasePerSubS) + C1142340fpg.LJIIL(8, timerDetail.timeIncreaseCapS) + C1142340fpg.LJIIIZ(9, timerDetail.subCount) + C1142340fpg.LJI(10) + C1142340fpg.LJIIL(11, timerDetail.totalPauseTimeS) + C1142340fpg.LJIIL(12, timerDetail.lastPauseTimestampS) + C1142340fpg.LJIIL(13, timerDetail.totalTimeS) + C1142340fpg.LJIIL(14, timerDetail.remainingTimeS) + C1142340fpg.LJIIL(15, timerDetail.timestampS) + C1142340fpg.LJIIL(16, timerDetail.stickerX) + C1142340fpg.LJIIL(17, timerDetail.stickerY) + C1142340fpg.LJIIL(18, timerDetail.screenW) + C1142340fpg.LJIIL(19, timerDetail.screenH) + C1142340fpg.LJIIIZ(20, timerDetail.timerStatus) + C1142340fpg.LJIIIZ(21, timerDetail.antidirtStatus) + C1142340fpg.LJIIIZ(22, timerDetail.auditStatus);
        TimerDetail.AuditInfo auditInfo = timerDetail.auditInfo;
        if (auditInfo != null) {
            int iLJIIL2 = C1142340fpg.LJIIL(1, auditInfo.violationId) + C1142340fpg.LJIIIZ(2, auditInfo.taskType);
            iLIZ = C1142350fph.LIZ(23) + iLJIIL2 + C1142350fph.LIZIZ(iLJIIL2);
        }
        return iLJIIL + iLIZ;
    }

    public static void LIZIZ(C1142350fph c1142350fph, TimerDetail timerDetail) {
        long j = timerDetail.timerId;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        long j2 = timerDetail.anchorId;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJFF(j2);
        long j3 = timerDetail.startTimestampS;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJFF(j3);
        long j4 = timerDetail.startCountdownTimeS;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LJFF(j4);
        C1142340fpg.LJFF(c1142350fph, 5, timerDetail.anchorSideTitle);
        C1142340fpg.LJFF(c1142350fph, 6, timerDetail.userSideTitle);
        long j5 = timerDetail.timeIncreasePerSubS;
        c1142350fph.LIZLLL(7, 0);
        c1142350fph.LJFF(j5);
        long j6 = timerDetail.timeIncreaseCapS;
        c1142350fph.LIZLLL(8, 0);
        c1142350fph.LJFF(j6);
        int i = timerDetail.subCount;
        c1142350fph.LIZLLL(9, 0);
        c1142350fph.LIZJ(i);
        boolean z = timerDetail.timeIncreaseReachCap;
        c1142350fph.LIZLLL(10, 0);
        c1142350fph.LJ(z ? 1 : 0);
        long j7 = timerDetail.totalPauseTimeS;
        c1142350fph.LIZLLL(11, 0);
        c1142350fph.LJFF(j7);
        long j8 = timerDetail.lastPauseTimestampS;
        c1142350fph.LIZLLL(12, 0);
        c1142350fph.LJFF(j8);
        long j9 = timerDetail.totalTimeS;
        c1142350fph.LIZLLL(13, 0);
        c1142350fph.LJFF(j9);
        long j10 = timerDetail.remainingTimeS;
        c1142350fph.LIZLLL(14, 0);
        c1142350fph.LJFF(j10);
        long j11 = timerDetail.timestampS;
        c1142350fph.LIZLLL(15, 0);
        c1142350fph.LJFF(j11);
        long j12 = timerDetail.stickerX;
        c1142350fph.LIZLLL(16, 0);
        c1142350fph.LJFF(j12);
        long j13 = timerDetail.stickerY;
        c1142350fph.LIZLLL(17, 0);
        c1142350fph.LJFF(j13);
        long j14 = timerDetail.screenW;
        c1142350fph.LIZLLL(18, 0);
        c1142350fph.LJFF(j14);
        long j15 = timerDetail.screenH;
        c1142350fph.LIZLLL(19, 0);
        c1142350fph.LJFF(j15);
        int i2 = timerDetail.timerStatus;
        c1142350fph.LIZLLL(20, 0);
        c1142350fph.LIZJ(i2);
        int i3 = timerDetail.antidirtStatus;
        c1142350fph.LIZLLL(21, 0);
        c1142350fph.LIZJ(i3);
        int i4 = timerDetail.auditStatus;
        c1142350fph.LIZLLL(22, 0);
        c1142350fph.LIZJ(i4);
        TimerDetail.AuditInfo auditInfo = timerDetail.auditInfo;
        if (auditInfo != null) {
            c1142350fph.LIZLLL(23, 2);
            c1142350fph.LJ(C1142340fpg.LJIIL(1, auditInfo.violationId) + C1142340fpg.LJIIIZ(2, auditInfo.taskType));
            long j16 = auditInfo.violationId;
            c1142350fph.LIZLLL(1, 0);
            c1142350fph.LJFF(j16);
            int i5 = auditInfo.taskType;
            c1142350fph.LIZLLL(2, 0);
            c1142350fph.LIZJ(i5);
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, TimerDetail timerDetail) {
        LIZIZ(c1142350fph, timerDetail);
    }
}
