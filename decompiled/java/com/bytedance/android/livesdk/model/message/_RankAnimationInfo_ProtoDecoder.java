package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RankAnimationInfo_ProtoDecoder implements C0IMD<RankAnimationInfo> {
    public static RankAnimationInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RankAnimationInfo rankAnimationInfo = new RankAnimationInfo();
        rankAnimationInfo.tileContent = new ArrayList();
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
                                    rankAnimationInfo.tileContent.add(_Text_ProtoDecoder.LIZLLL(c1516680pZS));
                                }
                            } else {
                                rankAnimationInfo.duration = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            rankAnimationInfo.contentText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        rankAnimationInfo.backgroundColorString = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    rankAnimationInfo.type = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return rankAnimationInfo;
            }
        }
    }

    public static void LJ(RankAnimationInfo rankAnimationInfo) {
        Text text = rankAnimationInfo.contentText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        List<Text> list = rankAnimationInfo.tileContent;
        if (list == null) {
            rankAnimationInfo.tileContent = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (Text text2 : rankAnimationInfo.tileContent) {
            if (text2 != null) {
                _Text_ProtoDecoder.LJ(text2);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RankAnimationInfo rankAnimationInfo) {
        LJ(rankAnimationInfo);
    }

    @Override // X.C0IMD
    public final RankAnimationInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RankAnimationInfo rankAnimationInfo, List list) {
    }
}
