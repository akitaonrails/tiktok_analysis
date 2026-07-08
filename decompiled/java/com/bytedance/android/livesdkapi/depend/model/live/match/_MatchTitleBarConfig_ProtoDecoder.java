package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MatchTitleBarConfig_ProtoDecoder implements C0IMD<MatchTitleBarConfig> {
    public static MatchTitleBarConfig LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MatchTitleBarConfig matchTitleBarConfig = new MatchTitleBarConfig();
        matchTitleBarConfig.displayRules = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    matchTitleBarConfig.displayRules.add(_MatchTitleBarDisplayRule_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return matchTitleBarConfig;
            }
        }
    }

    public static void LJ(MatchTitleBarConfig matchTitleBarConfig) {
        TitleBarDisplayResource titleBarDisplayResource;
        List<MatchTitleBarDisplayRule> list = matchTitleBarConfig.displayRules;
        if (list == null) {
            matchTitleBarConfig.displayRules = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (MatchTitleBarDisplayRule matchTitleBarDisplayRule : matchTitleBarConfig.displayRules) {
            if (matchTitleBarDisplayRule != null && (titleBarDisplayResource = matchTitleBarDisplayRule.displayResource) != null) {
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
    }

    @Override // X.C0IMD
    public final void LIZ(MatchTitleBarConfig matchTitleBarConfig) {
        LJ(matchTitleBarConfig);
    }

    @Override // X.C0IMD
    public final MatchTitleBarConfig LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MatchTitleBarConfig matchTitleBarConfig, List list) {
    }
}
