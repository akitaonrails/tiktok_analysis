package com.bytedance.android.livesdkapi.message;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoEncoder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _CommonMessageData_ProtoEncoder implements InterfaceC1132110fZB<CommonMessageData> {
    public static void LIZIZ(C1142350fph c1142350fph, CommonMessageData commonMessageData) {
        C1142340fpg.LJFF(c1142350fph, 1, commonMessageData.method);
        long j = commonMessageData.messageId;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJFF(j);
        long j2 = commonMessageData.roomId;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJFF(j2);
        long j3 = commonMessageData.createTime;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LJFF(j3);
        int i = commonMessageData.monitor;
        c1142350fph.LIZLLL(5, 0);
        c1142350fph.LIZJ(i);
        boolean z = commonMessageData.showMsg;
        c1142350fph.LIZLLL(6, 0);
        c1142350fph.LJ(z ? 1 : 0);
        C1142340fpg.LJFF(c1142350fph, 7, commonMessageData.describe);
        _Text_ProtoEncoder.LIZJ(c1142350fph, 8, commonMessageData.displayText);
        long j4 = commonMessageData.foldType;
        c1142350fph.LIZLLL(9, 0);
        c1142350fph.LJFF(j4);
        C1142340fpg.LJ(c1142350fph, 10, commonMessageData.anchorFoldType);
        long j5 = commonMessageData.priorityScore;
        c1142350fph.LIZLLL(11, 0);
        c1142350fph.LJFF(j5);
        C1142340fpg.LJFF(c1142350fph, 12, commonMessageData.logId);
        C1142340fpg.LJFF(c1142350fph, 13, commonMessageData.msgProcessFilterK);
        C1142340fpg.LJFF(c1142350fph, 14, commonMessageData.msgProcessFilterV);
        C1142340fpg.LJFF(c1142350fph, 15, commonMessageData.fromIdc);
        C1142340fpg.LJFF(c1142350fph, 16, commonMessageData.toIdc);
        List<String> list = commonMessageData.filterTags;
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < commonMessageData.filterTags.size(); i2++) {
                C1142340fpg.LJFF(c1142350fph, 17, (String) ListProtector.get(commonMessageData.filterTags, i2));
            }
        }
        LiveMessageSEI liveMessageSEI = commonMessageData.messageSEI;
        if (liveMessageSEI != null) {
            c1142350fph.LIZLLL(18, 2);
            c1142350fph.LJ(_LiveMessageID_ProtoEncoder.LIZJ(1, liveMessageSEI.uniqueID) + C1142340fpg.LJIIL(2, liveMessageSEI.timestamp));
            _LiveMessageID_ProtoEncoder.LIZIZ(c1142350fph, 1, liveMessageSEI.uniqueID);
            long j6 = liveMessageSEI.timestamp;
            c1142350fph.LIZLLL(2, 0);
            c1142350fph.LJFF(j6);
        }
        _LiveMessageID_ProtoEncoder.LIZIZ(c1142350fph, 19, commonMessageData.dependRootID);
        _LiveMessageID_ProtoEncoder.LIZIZ(c1142350fph, 20, commonMessageData.dependID);
        long j7 = commonMessageData.anchorPriorityScore;
        c1142350fph.LIZLLL(21, 0);
        c1142350fph.LJFF(j7);
        long j8 = commonMessageData.roomMessageHeatLevel;
        c1142350fph.LIZLLL(22, 0);
        c1142350fph.LJFF(j8);
        long j9 = commonMessageData.foldTypeForWeb;
        c1142350fph.LIZLLL(23, 0);
        c1142350fph.LJFF(j9);
        long j10 = commonMessageData.anchorFoldTypeForWeb;
        c1142350fph.LIZLLL(24, 0);
        c1142350fph.LJFF(j10);
        long j11 = commonMessageData.clientSendTime;
        c1142350fph.LIZLLL(25, 0);
        c1142350fph.LJFF(j11);
        int i3 = commonMessageData.dispatchStrategy;
        c1142350fph.LIZLLL(26, 0);
        c1142350fph.LIZJ(i3);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, CommonMessageData commonMessageData) {
        LIZIZ(c1142350fph, commonMessageData);
    }
}
