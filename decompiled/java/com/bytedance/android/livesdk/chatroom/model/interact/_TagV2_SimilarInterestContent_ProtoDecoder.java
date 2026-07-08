package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.interact.TagV2;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TagV2_SimilarInterestContent_ProtoDecoder implements C0IMD<TagV2.SimilarInterestContent> {
    public static TagV2.SimilarInterestContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TagV2.SimilarInterestContent similarInterestContent = new TagV2.SimilarInterestContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        similarInterestContent.displayText = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    similarInterestContent.contentId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return similarInterestContent;
            }
        }
    }

    @Override // X.C0IMD
    public final TagV2.SimilarInterestContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(TagV2.SimilarInterestContent similarInterestContent) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TagV2.SimilarInterestContent similarInterestContent, List list) {
    }
}
