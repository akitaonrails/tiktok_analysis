package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UserSetting_ProtoDecoder implements C0IMD<UserSetting> {
    public static UserSetting LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UserSetting userSetting = new UserSetting();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        switch (iLJI) {
                            case 100:
                                userSetting.exampleSetting = _ExampleSetting_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 101:
                                userSetting.revenueTipsSetting = _RevenueTipsSetting_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 102:
                                userSetting.goalAutoUpdateSwitch = _GiftGoalAutoUpdateSwitch_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 103:
                                userSetting.goalVoiceAlterSwitch = _GiftGoalVoiceAlterSwitch_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 104:
                                userSetting.gameServerFeatureSetting = _GameServerFeatureSetting_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 105:
                                userSetting.gameGuessRecommendCreateSwitch = _GameGuessRecommendCreateSwitch_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 106:
                                userSetting.playTogetherAutoStartSwitch = _PlayTogetherAutoStartSwitch_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 107:
                                userSetting.playTogetherShowBoardSwitch = _PlayTogetherShowBoardSwitch_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 108:
                                userSetting.intermissionHighlightGuideDisableSwitch = _IntermissionHighlightGuideDisableSwitch_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 109:
                                userSetting.gameDailyRankingStickerAutoShowSwitch = _GameDailyRankingStickerAutoShowSwitch_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 110:
                                userSetting.dailyRankingStickerAutoShowSwitch = _DailyRankingStickerAutoShowSwitch_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 111:
                                userSetting.aiScriptTipSwitch = _AIScriptTipSwitch_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 112:
                                userSetting.liveFragmentAutoPostSwitch = _LiveFragmentAutoPostSwitch_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 113:
                                userSetting.liveFragmentAiClipSwitch = _LiveFragmentAIClipSwitch_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 114:
                                userSetting.liveFragmentAutoPostItemVisibility = _LiveFragmentAutoPostItemVisibility_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 115:
                                userSetting.personaInboxNoticeSwitch = _PersonaInboxNoticeSwitch_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 116:
                                userSetting.personaAlertSourceNoticeSwitch = _PersonaAlertSourceNoticeSwitch_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 117:
                                userSetting.discordUploadStickerSwitch = _DiscordUploadStickerSwitch_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 118:
                                userSetting.enlargeSetting = _EnlargeSetting_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            default:
                                C1516700pZU.LJ(c1516680pZS);
                                break;
                        }
                    } else {
                        userSetting.version = c1516680pZS.LJIIJJI();
                    }
                } else {
                    userSetting.settingId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userSetting;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(UserSetting userSetting) {
    }

    @Override // X.C0IMD
    public final UserSetting LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UserSetting userSetting, List list) {
    }
}
