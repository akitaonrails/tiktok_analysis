package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Question_ProtoDecoder implements C0IMD<Question> {
    public static Question LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Question question = new Question();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    if (iLJI != 20) {
                                        if (iLJI != 21) {
                                            C1516700pZU.LJ(c1516680pZS);
                                        } else {
                                            question.answerFrom = c1516680pZS.LJIIJ();
                                        }
                                    } else {
                                        question.createFrom = c1516680pZS.LJIIJ();
                                    }
                                } else {
                                    question.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                question.createTime = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            question.answerStatus = c1516680pZS.LJIIJ();
                        }
                    } else {
                        question.content = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    question.questionId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return question;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(Question question) {
        User user = question.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final Question LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Question question, List list) {
    }
}
