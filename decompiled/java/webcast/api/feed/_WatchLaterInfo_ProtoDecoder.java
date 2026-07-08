package webcast.api.feed;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live._Room_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _WatchLaterInfo_ProtoDecoder implements C0IMD<WatchLaterInfo> {
    public static WatchLaterInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        WatchLaterInfo watchLaterInfo = new WatchLaterInfo();
        watchLaterInfo.anchorList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        watchLaterInfo.anchorList.add(_User_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    watchLaterInfo.latestRoom = _Room_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return watchLaterInfo;
            }
        }
    }

    public static void LJ(WatchLaterInfo watchLaterInfo) {
        Room room = watchLaterInfo.latestRoom;
        if (room != null) {
            _Room_ProtoDecoder.LJ(room);
        }
        List<User> list = watchLaterInfo.anchorList;
        if (list == null) {
            watchLaterInfo.anchorList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (User user : watchLaterInfo.anchorList) {
            if (user != null) {
                _User_ProtoDecoder.LJ(user);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(WatchLaterInfo watchLaterInfo) {
        LJ(watchLaterInfo);
    }

    @Override // X.C0IMD
    public final WatchLaterInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, WatchLaterInfo watchLaterInfo, List list) {
    }
}
