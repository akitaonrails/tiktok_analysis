package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.linkcore.RTCExtraInfo;
import com.bytedance.android.livesdk.model.message.linkcore._RTCExtraInfo_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tikcast.linkmic.common.ContentPosition;
import tikcast.linkmic.common.GroupChannelAllUser;
import tikcast.linkmic.common.LayoutData;
import tikcast.linkmic.common._ContentPosition_ProtoDecoder;
import tikcast.linkmic.common._GroupChannelAllUser_ProtoDecoder;
import tikcast.linkmic.common._LayoutData_ProtoDecoder;
import tikcast.linkmic.common._MigrationDetails_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _P2PGroupChangeContent_ProtoDecoder implements C0IMD<P2PGroupChangeContent> {
    public static P2PGroupChangeContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        P2PGroupChangeContent p2PGroupChangeContent = new P2PGroupChangeContent();
        p2PGroupChangeContent.groupExtInfo = new ArrayList();
        p2PGroupChangeContent.contentPos = new ArrayList();
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
                                    p2PGroupChangeContent.crossRoomLayout = _LayoutData_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                p2PGroupChangeContent.contentPos.add(_ContentPosition_ProtoDecoder.LIZLLL(c1516680pZS));
                            }
                        } else {
                            p2PGroupChangeContent.migrationDetails = _MigrationDetails_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        p2PGroupChangeContent.groupUser = _GroupChannelAllUser_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    p2PGroupChangeContent.groupExtInfo.add(_RTCExtraInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return p2PGroupChangeContent;
            }
        }
    }

    public static void LJ(P2PGroupChangeContent p2PGroupChangeContent) {
        List<RTCExtraInfo> list = p2PGroupChangeContent.groupExtInfo;
        if (list == null) {
            p2PGroupChangeContent.groupExtInfo = new ArrayList();
        } else if (!list.isEmpty()) {
            for (RTCExtraInfo rTCExtraInfo : p2PGroupChangeContent.groupExtInfo) {
                if (rTCExtraInfo != null) {
                    _RTCExtraInfo_ProtoDecoder.LJ(rTCExtraInfo);
                }
            }
        }
        GroupChannelAllUser groupChannelAllUser = p2PGroupChangeContent.groupUser;
        if (groupChannelAllUser != null) {
            _GroupChannelAllUser_ProtoDecoder.LJ(groupChannelAllUser);
        }
        List<ContentPosition> list2 = p2PGroupChangeContent.contentPos;
        if (list2 == null) {
            p2PGroupChangeContent.contentPos = new ArrayList();
        } else if (!list2.isEmpty()) {
            Iterator<ContentPosition> it2 = p2PGroupChangeContent.contentPos.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        LayoutData layoutData = p2PGroupChangeContent.crossRoomLayout;
        if (layoutData != null) {
            _LayoutData_ProtoDecoder.LJ(layoutData);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(P2PGroupChangeContent p2PGroupChangeContent) {
        LJ(p2PGroupChangeContent);
    }

    @Override // X.C0IMD
    public final P2PGroupChangeContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, P2PGroupChangeContent p2PGroupChangeContent, List list) {
    }
}
