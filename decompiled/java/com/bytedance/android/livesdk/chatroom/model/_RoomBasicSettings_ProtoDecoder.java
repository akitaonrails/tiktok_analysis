package com.bytedance.android.livesdk.chatroom.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RoomBasicSettings_ProtoDecoder implements C0IMD<RoomBasicSettings> {
    public static RoomBasicSettings LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RoomBasicSettings roomBasicSettings = new RoomBasicSettings();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        roomBasicSettings.commentSwitchSettings = _CommentSwitchSettings_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        roomBasicSettings.contentDisclosureSettings = _ContentDisclosureSettings_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        roomBasicSettings.ageRestrictionSettings = _AgeRestrictionSettings_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        roomBasicSettings.aiCommentReplySwitch = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        roomBasicSettings.enigmaWhisperSwitchSettings = _EnigmaWhisperSwitchSettings_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        roomBasicSettings.locationIconDisplaySettings = _LocationIconDisplaySettings_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        roomBasicSettings.bottomButtonLayoutSettings = _BottomButtonLayoutSettings_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return roomBasicSettings;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RoomBasicSettings roomBasicSettings) {
    }

    @Override // X.C0IMD
    public final RoomBasicSettings LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RoomBasicSettings roomBasicSettings, List list) {
    }
}
