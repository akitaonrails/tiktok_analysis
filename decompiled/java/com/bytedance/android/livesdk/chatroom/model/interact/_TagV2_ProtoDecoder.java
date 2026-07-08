package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.interact.TagV2;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TagV2_ProtoDecoder implements C0IMD<TagV2> {
    public static TagV2 LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TagV2 tagV2 = new TagV2();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                switch (iLJI) {
                                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                        tagV2.secondDegreeRelationContent = _TagV2_SecondDegreeRelationContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                        break;
                                    case BdTuring.TYPE_EMAIL /* 11 */:
                                        tagV2.cohostHistoryDay = c1516680pZS.LJIIJJI();
                                        break;
                                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                        tagV2.similarInterestContent = _TagV2_SimilarInterestContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                        break;
                                    default:
                                        C1516700pZU.LJ(c1516680pZS);
                                        break;
                                }
                            } else {
                                tagV2.starlingKey = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            tagV2.tagValue = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        tagV2.tagType = c1516680pZS.LJIIJ();
                    }
                } else {
                    tagV2.tagClassification = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return tagV2;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TagV2 tagV2) {
        TagV2.SecondDegreeRelationContent secondDegreeRelationContent = tagV2.secondDegreeRelationContent;
        if (secondDegreeRelationContent != null) {
            _TagV2_SecondDegreeRelationContent_ProtoDecoder.LJ(secondDegreeRelationContent);
        }
    }

    @Override // X.C0IMD
    public final TagV2 LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TagV2 tagV2, List list) {
    }
}
