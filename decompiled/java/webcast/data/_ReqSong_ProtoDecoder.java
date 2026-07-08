package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model.KaraokeSong;
import com.bytedance.android.livesdk.model._KaraokeSong_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ReqSong_ProtoDecoder implements C0IMD<ReqSong> {
    public static ReqSong LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ReqSong reqSong = new ReqSong();
        reqSong.userList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            reqSong.reqCount = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        reqSong.userList.add(_User_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    reqSong.song = _KaraokeSong_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return reqSong;
            }
        }
    }

    public static void LJ(ReqSong reqSong) {
        KaraokeSong karaokeSong = reqSong.song;
        if (karaokeSong != null) {
            _KaraokeSong_ProtoDecoder.LJ(karaokeSong);
        }
        List<User> list = reqSong.userList;
        if (list == null) {
            reqSong.userList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (User user : reqSong.userList) {
            if (user != null) {
                _User_ProtoDecoder.LJ(user);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ReqSong reqSong) {
        LJ(reqSong);
    }

    @Override // X.C0IMD
    public final ReqSong LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ReqSong reqSong, List list) {
    }
}
