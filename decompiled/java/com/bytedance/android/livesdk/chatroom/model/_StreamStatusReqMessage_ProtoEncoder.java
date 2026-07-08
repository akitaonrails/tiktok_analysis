package com.bytedance.android.livesdk.chatroom.model;

import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes13.dex */
public final class _StreamStatusReqMessage_ProtoEncoder implements InterfaceC1132110fZB<StreamStatusReqMessage> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, StreamStatusReqMessage streamStatusReqMessage) {
        StreamStatusReqMessage streamStatusReqMessage2 = streamStatusReqMessage;
        long j = streamStatusReqMessage2.roomId;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        long j2 = streamStatusReqMessage2.streamId;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJFF(j2);
        int i = streamStatusReqMessage2.status;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LIZJ(i);
        long j3 = streamStatusReqMessage2.timestamp;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LJFF(j3);
    }
}
