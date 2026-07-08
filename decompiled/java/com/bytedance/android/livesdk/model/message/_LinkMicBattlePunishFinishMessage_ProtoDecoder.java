package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.model.message.battle._BattleSetting_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchPunishExtraInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match._MatchPunishExtraInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkMicBattlePunishFinishMessage_ProtoDecoder implements C0IMD<LinkMicBattlePunishFinishMessage> {
    @Override // X.C0IMD
    public final void LIZ(LinkMicBattlePunishFinishMessage linkMicBattlePunishFinishMessage) {
        LinkMicBattlePunishFinishMessage linkMicBattlePunishFinishMessage2 = linkMicBattlePunishFinishMessage;
        CommonMessageData commonMessageData = linkMicBattlePunishFinishMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        BattleSetting battleSetting = linkMicBattlePunishFinishMessage2.battleSettings;
        if (battleSetting != null) {
            _BattleSetting_ProtoDecoder.LJ(battleSetting);
        }
        MatchPunishExtraInfo matchPunishExtraInfo = linkMicBattlePunishFinishMessage2.matchPunishExtraInfo;
        if (matchPunishExtraInfo != null) {
            _MatchPunishExtraInfo_ProtoDecoder.LJ(matchPunishExtraInfo);
        }
    }

    @Override // X.C0IMD
    public final LinkMicBattlePunishFinishMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LinkMicBattlePunishFinishMessage linkMicBattlePunishFinishMessage = new LinkMicBattlePunishFinishMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        linkMicBattlePunishFinishMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        linkMicBattlePunishFinishMessage.channelId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        linkMicBattlePunishFinishMessage.opUid = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        linkMicBattlePunishFinishMessage.reason = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        linkMicBattlePunishFinishMessage.battleId = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        linkMicBattlePunishFinishMessage.battleSettings = _BattleSetting_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        linkMicBattlePunishFinishMessage.matchPunishExtraInfo = _MatchPunishExtraInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkMicBattlePunishFinishMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkMicBattlePunishFinishMessage linkMicBattlePunishFinishMessage, List list) {
    }
}
