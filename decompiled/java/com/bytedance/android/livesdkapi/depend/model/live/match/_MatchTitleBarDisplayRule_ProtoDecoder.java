package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MatchTitleBarDisplayRule_ProtoDecoder implements C0IMD<MatchTitleBarDisplayRule> {
    public static MatchTitleBarDisplayRule LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MatchTitleBarDisplayRule matchTitleBarDisplayRule = new MatchTitleBarDisplayRule();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        matchTitleBarDisplayRule.displayResource = _TitleBarDisplayResource_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    matchTitleBarDisplayRule.trigger = _MatchTitleBarTrigger_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return matchTitleBarDisplayRule;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MatchTitleBarDisplayRule matchTitleBarDisplayRule) {
        TitleBarDisplayResource titleBarDisplayResource = matchTitleBarDisplayRule.displayResource;
        if (titleBarDisplayResource != null) {
            ImageModel imageModel = titleBarDisplayResource.leftIcon;
            if (imageModel != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
            Text text = titleBarDisplayResource.contentText;
            if (text != null) {
                _Text_ProtoDecoder.LJ(text);
            }
            ImageModel imageModel2 = titleBarDisplayResource.rightIcon;
            if (imageModel2 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel2);
            }
        }
    }

    @Override // X.C0IMD
    public final MatchTitleBarDisplayRule LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MatchTitleBarDisplayRule matchTitleBarDisplayRule, List list) {
    }
}
