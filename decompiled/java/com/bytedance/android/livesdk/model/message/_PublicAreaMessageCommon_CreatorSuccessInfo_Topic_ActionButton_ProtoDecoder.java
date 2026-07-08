package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _PublicAreaMessageCommon_CreatorSuccessInfo_Topic_ActionButton_ProtoDecoder implements C0IMD<PublicAreaMessageCommon.CreatorSuccessInfo.Topic.ActionButton> {
    public static PublicAreaMessageCommon.CreatorSuccessInfo.Topic.ActionButton LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PublicAreaMessageCommon.CreatorSuccessInfo.Topic.ActionButton actionButton = new PublicAreaMessageCommon.CreatorSuccessInfo.Topic.ActionButton();
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
                                    actionButton.enableButtonInactiveText = C1516700pZU.LIZ(c1516680pZS);
                                }
                            } else {
                                actionButton.buttonSchema = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            actionButton.buttonInactiveText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        actionButton.buttonActiveText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    actionButton.buttonType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return actionButton;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PublicAreaMessageCommon.CreatorSuccessInfo.Topic.ActionButton actionButton) {
        PublicAreaMessageCommon.CreatorSuccessInfo.Topic.ActionButton actionButton2 = actionButton;
        Text text = actionButton2.buttonActiveText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        Text text2 = actionButton2.buttonInactiveText;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
    }

    @Override // X.C0IMD
    public final PublicAreaMessageCommon.CreatorSuccessInfo.Topic.ActionButton LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PublicAreaMessageCommon.CreatorSuccessInfo.Topic.ActionButton actionButton, List list) {
    }
}
