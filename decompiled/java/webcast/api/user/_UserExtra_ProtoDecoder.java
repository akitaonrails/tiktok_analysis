package webcast.api.user;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live._Room_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UserExtra_ProtoDecoder implements C0IMD<UserExtra> {
    @Override // X.C0IMD
    public final void LIZ(UserExtra userExtra) {
        Room room = userExtra.preloadRoom;
        if (room != null) {
            _Room_ProtoDecoder.LJ(room);
        }
    }

    @Override // X.C0IMD
    public final UserExtra LIZJ(C1516680pZS c1516680pZS) throws IOException {
        UserExtra userExtra = new UserExtra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            userExtra.preloadEmptyReason = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        userExtra.preloadRoom = _Room_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    userExtra.anonymousIsSilence = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UserExtra userExtra, List list) {
    }
}
