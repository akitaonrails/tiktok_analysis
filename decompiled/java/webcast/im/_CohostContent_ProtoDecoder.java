package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact.BattleGamePlayContent;
import com.bytedance.android.livesdk.chatroom.model.interact.GamePlayContent;
import com.bytedance.android.livesdk.chatroom.model.interact.RandomMatchContent;
import com.bytedance.android.livesdk.chatroom.model.interact._BattleGamePlayContent_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._RandomMatchContent_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import webcast.im.PermitJoinGroupBizContent;

/* JADX INFO: loaded from: classes.dex */
public final class _CohostContent_ProtoDecoder implements C0IMD<CohostContent> {
    public static CohostContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CohostContent cohostContent = new CohostContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 11) {
                            if (iLJI != 119) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                cohostContent.joinGroupDirectBizContent = _JoinGroupDirectBizContent_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            cohostContent.listChangeBizContent = _ListChangeBizContent_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        cohostContent.permitJoinGroupBizContent = _PermitJoinGroupBizContent_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    cohostContent.joinGroupBizContent = _JoinGroupBizContent_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cohostContent;
            }
        }
    }

    public static void LJ(CohostContent cohostContent) {
        BattleGamePlayContent battleGamePlayContent;
        PermitJoinGroupBizContent.QuickCohostInviteeUserInfo quickCohostInviteeUserInfo;
        ImageModel imageModel;
        JoinGroupBizContent joinGroupBizContent = cohostContent.joinGroupBizContent;
        if (joinGroupBizContent != null) {
            _JoinGroupBizContent_ProtoDecoder.LJ(joinGroupBizContent);
        }
        PermitJoinGroupBizContent permitJoinGroupBizContent = cohostContent.permitJoinGroupBizContent;
        if (permitJoinGroupBizContent != null && (quickCohostInviteeUserInfo = permitJoinGroupBizContent.quickCohostInviteeUserInfo) != null && (imageModel = quickCohostInviteeUserInfo.avatarThumb) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ListChangeBizContent listChangeBizContent = cohostContent.listChangeBizContent;
        if (listChangeBizContent != null) {
            _ListChangeBizContent_ProtoDecoder.LJ(listChangeBizContent);
        }
        JoinGroupDirectBizContent joinGroupDirectBizContent = cohostContent.joinGroupDirectBizContent;
        if (joinGroupDirectBizContent != null) {
            GamePlayContent gamePlayContent = joinGroupDirectBizContent.gameplayContent;
            if (gamePlayContent != null && (battleGamePlayContent = gamePlayContent.battleGameplayContent) != null) {
                _BattleGamePlayContent_ProtoDecoder.LJ(battleGamePlayContent);
            }
            RandomMatchContent randomMatchContent = joinGroupDirectBizContent.randomMatchContent;
            if (randomMatchContent != null) {
                _RandomMatchContent_ProtoDecoder.LJ(randomMatchContent);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CohostContent cohostContent) {
        LJ(cohostContent);
    }

    @Override // X.C0IMD
    public final CohostContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostContent cohostContent, List list) {
    }
}
