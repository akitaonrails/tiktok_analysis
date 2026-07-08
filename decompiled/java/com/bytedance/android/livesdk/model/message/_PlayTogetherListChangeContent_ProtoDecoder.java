package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.game.model.PlayTogetherMember;
import com.bytedance.android.livesdk.game.model._PlayTogetherMember_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PlayTogetherListChangeContent_ProtoDecoder implements C0IMD<PlayTogetherListChangeContent> {
    public static PlayTogetherListChangeContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PlayTogetherListChangeContent playTogetherListChangeContent = new PlayTogetherListChangeContent();
        playTogetherListChangeContent.applyListMembers = new ArrayList();
        playTogetherListChangeContent.pickListMembers = new ArrayList();
        playTogetherListChangeContent.historyListMembers = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                playTogetherListChangeContent.serviceTime = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            playTogetherListChangeContent.pickListMembers.add(_PlayTogetherMember_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        playTogetherListChangeContent.historyListMembers.add(_PlayTogetherMember_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    playTogetherListChangeContent.applyListMembers.add(_PlayTogetherMember_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return playTogetherListChangeContent;
            }
        }
    }

    public static void LJ(PlayTogetherListChangeContent playTogetherListChangeContent) {
        List<PlayTogetherMember> list = playTogetherListChangeContent.applyListMembers;
        if (list == null) {
            playTogetherListChangeContent.applyListMembers = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<PlayTogetherMember> it2 = playTogetherListChangeContent.applyListMembers.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        List<PlayTogetherMember> list2 = playTogetherListChangeContent.historyListMembers;
        if (list2 == null) {
            playTogetherListChangeContent.historyListMembers = new ArrayList();
        } else if (!list2.isEmpty()) {
            Iterator<PlayTogetherMember> it3 = playTogetherListChangeContent.historyListMembers.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
        List<PlayTogetherMember> list3 = playTogetherListChangeContent.pickListMembers;
        if (list3 == null) {
            playTogetherListChangeContent.pickListMembers = new ArrayList();
        } else {
            if (list3.isEmpty()) {
                return;
            }
            Iterator<PlayTogetherMember> it4 = playTogetherListChangeContent.pickListMembers.iterator();
            while (it4.hasNext()) {
                it4.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PlayTogetherListChangeContent playTogetherListChangeContent) {
        LJ(playTogetherListChangeContent);
    }

    @Override // X.C0IMD
    public final PlayTogetherListChangeContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PlayTogetherListChangeContent playTogetherListChangeContent, List list) {
    }
}
