package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._PrivilegeLogExtra_ProtoDecoder;
import com.bytedance.android.livesdk.message.proto.DisplayControl;
import com.bytedance.android.livesdk.message.proto._DisplayControl_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PrivilegeAdvanceMessage_ProtoDecoder implements C0IMD<PrivilegeAdvanceMessage> {
    @Override // X.C0IMD
    public final void LIZ(PrivilegeAdvanceMessage privilegeAdvanceMessage) {
        PrivilegeAdvanceMessage privilegeAdvanceMessage2 = privilegeAdvanceMessage;
        CommonMessageData commonMessageData = privilegeAdvanceMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        RoomNotifyMessage roomNotifyMessage = privilegeAdvanceMessage2.notify;
        if (roomNotifyMessage != null) {
            _RoomNotifyMessage_ProtoDecoder.LJ(roomNotifyMessage);
        }
        DisplayControl displayControl = privilegeAdvanceMessage2.control;
        if (displayControl != null) {
            _DisplayControl_ProtoDecoder.LJ(displayControl);
        }
        ImageModel imageModel = privilegeAdvanceMessage2.leftIcon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ImageModel imageModel2 = privilegeAdvanceMessage2.rightIcon;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
        ImageModel imageModel3 = privilegeAdvanceMessage2.background;
        if (imageModel3 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel3);
        }
    }

    @Override // X.C0IMD
    public final PrivilegeAdvanceMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        PrivilegeAdvanceMessage privilegeAdvanceMessage = new PrivilegeAdvanceMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 100) {
                    switch (iLJI) {
                        case 1:
                            privilegeAdvanceMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 2:
                            privilegeAdvanceMessage.notify = _RoomNotifyMessage_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 3:
                            privilegeAdvanceMessage.scene = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 4:
                            privilegeAdvanceMessage.control = _DisplayControl_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 5:
                            privilegeAdvanceMessage.leftIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 6:
                            privilegeAdvanceMessage.rightIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 7:
                            privilegeAdvanceMessage.background = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 8:
                            privilegeAdvanceMessage.subType = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        default:
                            C1516700pZU.LJ(c1516680pZS);
                            break;
                    }
                } else {
                    privilegeAdvanceMessage.privilegeLogExtra = _PrivilegeLogExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return privilegeAdvanceMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PrivilegeAdvanceMessage privilegeAdvanceMessage, List list) {
    }
}
