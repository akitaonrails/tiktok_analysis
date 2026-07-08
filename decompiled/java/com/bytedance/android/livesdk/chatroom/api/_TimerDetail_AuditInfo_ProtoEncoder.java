package com.bytedance.android.livesdk.chatroom.api;

import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.chatroom.api.TimerDetail;

/* JADX INFO: loaded from: classes18.dex */
public final class _TimerDetail_AuditInfo_ProtoEncoder implements InterfaceC1132110fZB<TimerDetail.AuditInfo> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, TimerDetail.AuditInfo auditInfo) {
        TimerDetail.AuditInfo auditInfo2 = auditInfo;
        long j = auditInfo2.violationId;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        int i = auditInfo2.taskType;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LIZJ(i);
    }
}
