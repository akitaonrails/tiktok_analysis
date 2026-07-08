package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user._PrivilegeLogExtra_ProtoDecoder;
import com.bytedance.android.livesdk.message.proto.DisplayControl;
import com.bytedance.android.livesdk.message.proto._DisplayControl_ProtoDecoder;
import com.bytedance.android.livesdk.message.proto._ResourceAttr_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.PrivilegeDynamicEffectMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PrivilegeDynamicEffectMessage_ProtoDecoder implements C0IMD<PrivilegeDynamicEffectMessage> {
    @Override // X.C0IMD
    public final void LIZ(PrivilegeDynamicEffectMessage privilegeDynamicEffectMessage) {
        Text text;
        PrivilegeDynamicEffectMessage privilegeDynamicEffectMessage2 = privilegeDynamicEffectMessage;
        CommonMessageData commonMessageData = privilegeDynamicEffectMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        DisplayControl displayControl = privilegeDynamicEffectMessage2.control;
        if (displayControl != null) {
            _DisplayControl_ProtoDecoder.LJ(displayControl);
        }
        List<PrivilegeDynamicEffectMessage.Placeholder> list = privilegeDynamicEffectMessage2.placeholderList;
        if (list == null) {
            privilegeDynamicEffectMessage2.placeholderList = new ArrayList();
        } else if (!list.isEmpty()) {
            for (PrivilegeDynamicEffectMessage.Placeholder placeholder : privilegeDynamicEffectMessage2.placeholderList) {
                if (placeholder != null) {
                    Text text2 = placeholder.text;
                    if (text2 != null) {
                        _Text_ProtoDecoder.LJ(text2);
                    }
                    PrivilegeDynamicEffectMessage.FontStyle fontStyle = placeholder.fontStyle;
                    if (fontStyle != null) {
                        _PrivilegeDynamicEffectMessage_FontStyle_ProtoDecoder.LJ(fontStyle);
                    }
                }
            }
        }
        PrivilegeDynamicEffectMessage.StickerEffectModel stickerEffectModel = privilegeDynamicEffectMessage2.stickerModel;
        if (stickerEffectModel != null && (text = stickerEffectModel.text) != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final PrivilegeDynamicEffectMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        PrivilegeDynamicEffectMessage privilegeDynamicEffectMessage = new PrivilegeDynamicEffectMessage();
        privilegeDynamicEffectMessage.placeholderList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 100) {
                    switch (iLJI) {
                        case 1:
                            privilegeDynamicEffectMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 2:
                            privilegeDynamicEffectMessage.scene = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 3:
                            privilegeDynamicEffectMessage.resourceAttr = _ResourceAttr_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 4:
                            privilegeDynamicEffectMessage.control = _DisplayControl_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 5:
                            privilegeDynamicEffectMessage.placeholderList.add(_PrivilegeDynamicEffectMessage_Placeholder_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        case 6:
                            privilegeDynamicEffectMessage.effectType = c1516680pZS.LJIIJ();
                            break;
                        case 7:
                            privilegeDynamicEffectMessage.stickerModel = _PrivilegeDynamicEffectMessage_StickerEffectModel_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        default:
                            C1516700pZU.LJ(c1516680pZS);
                            break;
                    }
                } else {
                    privilegeDynamicEffectMessage.privilegeLogExtra = _PrivilegeLogExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return privilegeDynamicEffectMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PrivilegeDynamicEffectMessage privilegeDynamicEffectMessage, List list) {
    }
}
