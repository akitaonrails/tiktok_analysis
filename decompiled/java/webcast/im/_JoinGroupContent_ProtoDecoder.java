package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.linkcore.RTCExtraInfo;
import com.bytedance.android.livesdk.model.message.linkcore._RTCExtraInfo_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.GroupChannelAllUser;
import tikcast.linkmic.common.GroupPlayer;
import tikcast.linkmic.common._GroupChannelAllUser_ProtoDecoder;
import tikcast.linkmic.common._GroupPlayer_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _JoinGroupContent_ProtoDecoder implements C0IMD<JoinGroupContent> {
    public static JoinGroupContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        JoinGroupContent joinGroupContent = new JoinGroupContent();
        joinGroupContent.groupExtInfo = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                joinGroupContent.groupExtInfo.add(_RTCExtraInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                            }
                        } else {
                            joinGroupContent.type = c1516680pZS.LJIIJ();
                        }
                    } else {
                        joinGroupContent.joinUser = _GroupPlayer_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    joinGroupContent.groupUser = _GroupChannelAllUser_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return joinGroupContent;
            }
        }
    }

    public static void LJ(JoinGroupContent joinGroupContent) {
        GroupChannelAllUser groupChannelAllUser = joinGroupContent.groupUser;
        if (groupChannelAllUser != null) {
            _GroupChannelAllUser_ProtoDecoder.LJ(groupChannelAllUser);
        }
        GroupPlayer groupPlayer = joinGroupContent.joinUser;
        List<RTCExtraInfo> list = joinGroupContent.groupExtInfo;
        if (list == null) {
            joinGroupContent.groupExtInfo = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (RTCExtraInfo rTCExtraInfo : joinGroupContent.groupExtInfo) {
            if (rTCExtraInfo != null) {
                _RTCExtraInfo_ProtoDecoder.LJ(rTCExtraInfo);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(JoinGroupContent joinGroupContent) {
        LJ(joinGroupContent);
    }

    @Override // X.C0IMD
    public final JoinGroupContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, JoinGroupContent joinGroupContent, List list) {
    }
}
