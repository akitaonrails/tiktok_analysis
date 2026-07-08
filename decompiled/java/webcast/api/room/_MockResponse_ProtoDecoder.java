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
public final class _MockResponse_ProtoDecoder implements C0IMD<MockResponse> {
    @Override // X.C0IMD
    public final void LIZ(MockResponse mockResponse) {
        Room room;
        MockResponse.Data data = mockResponse.data;
        if (data != null && (room = data.room) != null) {
            _Room_ProtoDecoder.LJ(room);
        }
    }

    @Override // X.C0IMD
    public final MockResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        MockResponse mockResponse = new MockResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    mockResponse.data = _MockResponse_Data_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return mockResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MockResponse mockResponse, List list) {
    }
}
