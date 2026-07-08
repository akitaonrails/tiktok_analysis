package com.bytedance.android.livesdk.model.linksetting;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.multilive._MultiLiveAnchorPanelSettings_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import tikcast.linkmic.common.AnchorLayoutSetting;
import tikcast.linkmic.common._AnchorLayoutSetting_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _MultiLiveUpdateUserSettingContent_ProtoDecoder implements C0IMD<MultiLiveUpdateUserSettingContent> {
    public static MultiLiveUpdateUserSettingContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MultiLiveUpdateUserSettingContent multiLiveUpdateUserSettingContent = new MultiLiveUpdateUserSettingContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            multiLiveUpdateUserSettingContent.resetPointAfterLeave = c1516680pZS.LJIIJ();
                        }
                    } else {
                        multiLiveUpdateUserSettingContent.anchorLayoutSetting = _AnchorLayoutSetting_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    multiLiveUpdateUserSettingContent.multiLiveAnchorPanelSettings = _MultiLiveAnchorPanelSettings_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return multiLiveUpdateUserSettingContent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MultiLiveUpdateUserSettingContent multiLiveUpdateUserSettingContent) {
        AnchorLayoutSetting anchorLayoutSetting = multiLiveUpdateUserSettingContent.anchorLayoutSetting;
        if (anchorLayoutSetting != null) {
            _AnchorLayoutSetting_ProtoDecoder.LJ(anchorLayoutSetting);
        }
    }

    @Override // X.C0IMD
    public final MultiLiveUpdateUserSettingContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MultiLiveUpdateUserSettingContent multiLiveUpdateUserSettingContent, List list) {
    }
}
