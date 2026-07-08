package webcast.api.room;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live._Room_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import webcast.api.room.MockResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _MockResponse_Data_ProtoDecoder implements C0IMD<MockResponse.Data> {
    public static MockResponse.Data LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MockResponse.Data data = new MockResponse.Data();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            data.guideVideos = _MockResponse_GuideVideoURL_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        data.mockRoomId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    data.room = _Room_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return data;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MockResponse.Data data) {
        Room room = data.room;
        if (room != null) {
            _Room_ProtoDecoder.LJ(room);
        }
    }

    @Override // X.C0IMD
    public final MockResponse.Data LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MockResponse.Data data, List list) {
    }
}
