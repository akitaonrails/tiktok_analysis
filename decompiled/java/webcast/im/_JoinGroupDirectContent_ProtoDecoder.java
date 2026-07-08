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
public final class _JoinGroupDirectContent_ProtoDecoder implements C0IMD<JoinGroupDirectContent> {
    public static JoinGroupDirectContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        JoinGroupDirectContent joinGroupDirectContent = new JoinGroupDirectContent();
        joinGroupDirectContent.groupExtInfo = new ArrayList();
        joinGroupDirectContent.contentPos = new ArrayList();
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
                                    joinGroupDirectContent.crossRoomLayout = _LayoutData_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                joinGroupDirectContent.contentPos.add(_ContentPosition_ProtoDecoder.LIZLLL(c1516680pZS));
                            }
                        } else {
                            joinGroupDirectContent.migrationDetails = _MigrationDetails_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        joinGroupDirectContent.groupUser = _GroupChannelAllUser_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    joinGroupDirectContent.groupExtInfo.add(_RTCExtraInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return joinGroupDirectContent;
            }
        }
    }

    public static void LJ(JoinGroupDirectContent joinGroupDirectContent) {
        List<RTCExtraInfo> list = joinGroupDirectContent.groupExtInfo;
        if (list == null) {
            joinGroupDirectContent.groupExtInfo = new ArrayList();
        } else if (!list.isEmpty()) {
            for (RTCExtraInfo rTCExtraInfo : joinGroupDirectContent.groupExtInfo) {
                if (rTCExtraInfo != null) {
                    _RTCExtraInfo_ProtoDecoder.LJ(rTCExtraInfo);
                }
            }
        }
        GroupChannelAllUser groupChannelAllUser = joinGroupDirectContent.groupUser;
        if (groupChannelAllUser != null) {
            _GroupChannelAllUser_ProtoDecoder.LJ(groupChannelAllUser);
        }
        List<ContentPosition> list2 = joinGroupDirectContent.contentPos;
        if (list2 == null) {
            joinGroupDirectContent.contentPos = new ArrayList();
        } else if (!list2.isEmpty()) {
            Iterator<ContentPosition> it2 = joinGroupDirectContent.contentPos.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        LayoutData layoutData = joinGroupDirectContent.crossRoomLayout;
        if (layoutData != null) {
            _LayoutData_ProtoDecoder.LJ(layoutData);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(JoinGroupDirectContent joinGroupDirectContent) {
        LJ(joinGroupDirectContent);
    }

    @Override // X.C0IMD
    public final JoinGroupDirectContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, JoinGroupDirectContent joinGroupDirectContent, List list) {
    }
}
