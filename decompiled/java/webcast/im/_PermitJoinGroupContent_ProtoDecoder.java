package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.linkcore.RTCExtraInfo;
import com.bytedance.android.livesdk.model.message.linkcore._RTCExtraInfo_ProtoDecoder;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.GroupChannelAllUser;
import tikcast.linkmic.common.GroupPlayer;
import tikcast.linkmic.common.LayoutData;
import tikcast.linkmic.common._GroupChannelAllUser_ProtoDecoder;
import tikcast.linkmic.common._GroupPlayer_ProtoDecoder;
import tikcast.linkmic.common._LayoutData_ProtoDecoder;
import tikcast.linkmic.common._MigrationDetails_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _PermitJoinGroupContent_ProtoDecoder implements C0IMD<PermitJoinGroupContent> {
    public static PermitJoinGroupContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PermitJoinGroupContent permitJoinGroupContent = new PermitJoinGroupContent();
        permitJoinGroupContent.linkedUserUiPositions = new ArrayList();
        permitJoinGroupContent.groupExtInfo = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        permitJoinGroupContent.approver = _GroupPlayer_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        permitJoinGroupContent.agreeStatus = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        permitJoinGroupContent.type = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        permitJoinGroupContent.groupExtInfo.add(_RTCExtraInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 5:
                        permitJoinGroupContent.groupUser = _GroupChannelAllUser_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        permitJoinGroupContent.migrationDetails = _MigrationDetails_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        permitJoinGroupContent.linkedUserUiPositions.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 8:
                        permitJoinGroupContent.permitGroupType = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        permitJoinGroupContent.crossRoomLayout = _LayoutData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return permitJoinGroupContent;
            }
        }
    }

    public static void LJ(PermitJoinGroupContent permitJoinGroupContent) {
        GroupPlayer groupPlayer = permitJoinGroupContent.approver;
        List<RTCExtraInfo> list = permitJoinGroupContent.groupExtInfo;
        if (list == null) {
            permitJoinGroupContent.groupExtInfo = new ArrayList();
        } else if (!list.isEmpty()) {
            for (RTCExtraInfo rTCExtraInfo : permitJoinGroupContent.groupExtInfo) {
                if (rTCExtraInfo != null) {
                    _RTCExtraInfo_ProtoDecoder.LJ(rTCExtraInfo);
                }
            }
        }
        GroupChannelAllUser groupChannelAllUser = permitJoinGroupContent.groupUser;
        if (groupChannelAllUser != null) {
            _GroupChannelAllUser_ProtoDecoder.LJ(groupChannelAllUser);
        }
        if (permitJoinGroupContent.linkedUserUiPositions == null) {
            permitJoinGroupContent.linkedUserUiPositions = new ArrayList();
        }
        LayoutData layoutData = permitJoinGroupContent.crossRoomLayout;
        if (layoutData != null) {
            _LayoutData_ProtoDecoder.LJ(layoutData);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PermitJoinGroupContent permitJoinGroupContent) {
        LJ(permitJoinGroupContent);
    }

    @Override // X.C0IMD
    public final PermitJoinGroupContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PermitJoinGroupContent permitJoinGroupContent, List list) {
    }
}
