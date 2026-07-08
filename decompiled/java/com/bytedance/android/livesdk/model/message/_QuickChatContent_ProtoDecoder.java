package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.emoji._EmoteModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _QuickChatContent_ProtoDecoder implements C0IMD<QuickChatContent> {
    public static QuickChatContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        QuickChatContent quickChatContent = new QuickChatContent();
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
                                quickChatContent.emote = _EmoteModel_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            quickChatContent.textStarlingKey = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        quickChatContent.text = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    quickChatContent.type = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return quickChatContent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(QuickChatContent quickChatContent) {
        EmoteModel emoteModel = quickChatContent.emote;
        if (emoteModel != null) {
            _EmoteModel_ProtoDecoder.LJ(emoteModel);
        }
    }

    @Override // X.C0IMD
    public final QuickChatContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, QuickChatContent quickChatContent, List list) {
    }
}
