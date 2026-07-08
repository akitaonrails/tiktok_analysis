package webcast.api.feed;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TopliveNoticeTextStruct_ProtoDecoder implements C0IMD<TopliveNoticeTextStruct> {
    public static TopliveNoticeTextStruct LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TopliveNoticeTextStruct topliveNoticeTextStruct = new TopliveNoticeTextStruct();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        topliveNoticeTextStruct.jumpType = c1516680pZS.LJIIJ();
                    }
                } else {
                    topliveNoticeTextStruct.text = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return topliveNoticeTextStruct;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TopliveNoticeTextStruct topliveNoticeTextStruct) {
        Text text = topliveNoticeTextStruct.text;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final TopliveNoticeTextStruct LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TopliveNoticeTextStruct topliveNoticeTextStruct, List list) {
    }
}
