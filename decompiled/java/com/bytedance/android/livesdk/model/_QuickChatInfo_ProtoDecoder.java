package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.emoji._EmoteModel_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _QuickChatInfo_ProtoDecoder implements C0IMD<QuickChatInfo> {
    public static QuickChatInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        QuickChatInfo quickChatInfo = new QuickChatInfo();
        quickChatInfo.list = new ArrayList();
        quickChatInfo.emoteList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    quickChatInfo.displayType = c1516680pZS.LJIIJ();
                                }
                            } else {
                                quickChatInfo.priority = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            quickChatInfo.emoteList.add(_EmoteModel_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        quickChatInfo.duration = c1516680pZS.LJIIJJI();
                    }
                } else {
                    quickChatInfo.list.add(C1516700pZU.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return quickChatInfo;
            }
        }
    }

    public static void LJ(QuickChatInfo quickChatInfo) {
        if (quickChatInfo.list == null) {
            quickChatInfo.list = new ArrayList();
        }
        List<EmoteModel> list = quickChatInfo.emoteList;
        if (list == null) {
            quickChatInfo.emoteList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (EmoteModel emoteModel : quickChatInfo.emoteList) {
            if (emoteModel != null) {
                _EmoteModel_ProtoDecoder.LJ(emoteModel);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(QuickChatInfo quickChatInfo) {
        LJ(quickChatInfo);
    }

    @Override // X.C0IMD
    public final QuickChatInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, QuickChatInfo quickChatInfo, List list) {
    }
}
