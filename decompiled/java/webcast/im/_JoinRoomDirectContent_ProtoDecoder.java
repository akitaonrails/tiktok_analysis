package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.linkcore.RTCExtraInfo;
import com.bytedance.android.livesdk.model.message.linkcore._Player_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._RTCExtraInfo_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.SpotInfo;
import tikcast.linkmic.common._LayoutState_ProtoDecoder;
import tikcast.linkmic.common._PosIdentity_ProtoDecoder;
import tikcast.linkmic.common._SpotInfo_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _JoinRoomDirectContent_ProtoDecoder implements C0IMD<JoinRoomDirectContent> {
    public static JoinRoomDirectContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        JoinRoomDirectContent joinRoomDirectContent = new JoinRoomDirectContent();
        joinRoomDirectContent.uiPos = new ArrayList();
        joinRoomDirectContent.spotList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        joinRoomDirectContent.joiner = _Player_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        joinRoomDirectContent.joinerLinkMicId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        joinRoomDirectContent.joinerExtInfo = _RTCExtraInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        joinRoomDirectContent.layout = _LayoutState_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        joinRoomDirectContent.spotList.add(_SpotInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 6:
                        joinRoomDirectContent.uiPos.add(_PosIdentity_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return joinRoomDirectContent;
            }
        }
    }

    public static void LJ(JoinRoomDirectContent joinRoomDirectContent) {
        RTCExtraInfo rTCExtraInfo = joinRoomDirectContent.joinerExtInfo;
        if (rTCExtraInfo != null) {
            _RTCExtraInfo_ProtoDecoder.LJ(rTCExtraInfo);
        }
        LayoutState layoutState = joinRoomDirectContent.layout;
        if (layoutState != null) {
            _LayoutState_ProtoDecoder.LJ(layoutState);
        }
        List<SpotInfo> list = joinRoomDirectContent.spotList;
        if (list == null) {
            joinRoomDirectContent.spotList = new ArrayList();
        } else if (!list.isEmpty()) {
            for (SpotInfo spotInfo : joinRoomDirectContent.spotList) {
                if (spotInfo != null) {
                    _SpotInfo_ProtoDecoder.LJ(spotInfo);
                }
            }
        }
        List<PosIdentity> list2 = joinRoomDirectContent.uiPos;
        if (list2 == null) {
            joinRoomDirectContent.uiPos = new ArrayList();
        } else {
            if (list2.isEmpty()) {
                return;
            }
            Iterator<PosIdentity> it2 = joinRoomDirectContent.uiPos.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(JoinRoomDirectContent joinRoomDirectContent) {
        LJ(joinRoomDirectContent);
    }

    @Override // X.C0IMD
    public final JoinRoomDirectContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, JoinRoomDirectContent joinRoomDirectContent, List list) {
    }
}
