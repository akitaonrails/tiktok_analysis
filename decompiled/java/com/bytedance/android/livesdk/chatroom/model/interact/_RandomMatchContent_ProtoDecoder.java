package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.interact.RandomMatchContent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RandomMatchContent_ProtoDecoder implements C0IMD<RandomMatchContent> {
    public static RandomMatchContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RandomMatchContent randomMatchContent = new RandomMatchContent();
        randomMatchContent.pairedGroupList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 20) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    randomMatchContent.matchedPreferenceTag = c1516680pZS.LJIIJ();
                                }
                            } else {
                                randomMatchContent.pairedGroupList.add(_RandomMatchContent_UserGroup_ProtoDecoder.LIZLLL(c1516680pZS));
                            }
                        } else {
                            randomMatchContent.pairedTime = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        randomMatchContent.sourceType = c1516680pZS.LJIIJJI();
                    }
                } else {
                    randomMatchContent.matchId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return randomMatchContent;
            }
        }
    }

    public static void LJ(RandomMatchContent randomMatchContent) {
        List<RandomMatchContent.UserGroup> list = randomMatchContent.pairedGroupList;
        if (list == null) {
            randomMatchContent.pairedGroupList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (RandomMatchContent.UserGroup userGroup : randomMatchContent.pairedGroupList) {
            if (userGroup != null) {
                _RandomMatchContent_UserGroup_ProtoDecoder.LJ(userGroup);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RandomMatchContent randomMatchContent) {
        LJ(randomMatchContent);
    }

    @Override // X.C0IMD
    public final RandomMatchContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RandomMatchContent randomMatchContent, List list) {
    }
}
