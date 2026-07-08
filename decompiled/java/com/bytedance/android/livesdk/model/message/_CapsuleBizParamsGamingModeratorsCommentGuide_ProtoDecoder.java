package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CapsuleBizParamsGamingModeratorsCommentGuide_ProtoDecoder implements C0IMD<CapsuleBizParamsGamingModeratorsCommentGuide> {
    public static CapsuleBizParamsGamingModeratorsCommentGuide LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CapsuleBizParamsGamingModeratorsCommentGuide capsuleBizParamsGamingModeratorsCommentGuide = new CapsuleBizParamsGamingModeratorsCommentGuide();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 5) {
                                if (iLJI != 6) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    capsuleBizParamsGamingModeratorsCommentGuide.action = _GameAction_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                capsuleBizParamsGamingModeratorsCommentGuide.ruleId = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            capsuleBizParamsGamingModeratorsCommentGuide.recommendText = _RecommendComment_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        capsuleBizParamsGamingModeratorsCommentGuide.replyMsgText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    capsuleBizParamsGamingModeratorsCommentGuide.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return capsuleBizParamsGamingModeratorsCommentGuide;
            }
        }
    }

    public static void LJ(CapsuleBizParamsGamingModeratorsCommentGuide capsuleBizParamsGamingModeratorsCommentGuide) {
        User user;
        Text text;
        User user2 = capsuleBizParamsGamingModeratorsCommentGuide.user;
        if (user2 != null) {
            _User_ProtoDecoder.LJ(user2);
        }
        Text text2 = capsuleBizParamsGamingModeratorsCommentGuide.replyMsgText;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
        RecommendComment recommendComment = capsuleBizParamsGamingModeratorsCommentGuide.recommendText;
        if (recommendComment != null && (text = recommendComment.recommendText) != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        GameAction gameAction = capsuleBizParamsGamingModeratorsCommentGuide.action;
        if (gameAction != null && (user = gameAction.followUserInfo) != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CapsuleBizParamsGamingModeratorsCommentGuide capsuleBizParamsGamingModeratorsCommentGuide) {
        LJ(capsuleBizParamsGamingModeratorsCommentGuide);
    }

    @Override // X.C0IMD
    public final CapsuleBizParamsGamingModeratorsCommentGuide LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CapsuleBizParamsGamingModeratorsCommentGuide capsuleBizParamsGamingModeratorsCommentGuide, List list) {
    }
}
