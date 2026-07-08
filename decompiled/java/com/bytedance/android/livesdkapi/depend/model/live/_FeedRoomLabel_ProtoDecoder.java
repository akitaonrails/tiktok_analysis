package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FeedRoomLabel_ProtoDecoder implements C0IMD<FeedRoomLabel> {
    public static FeedRoomLabel LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FeedRoomLabel feedRoomLabel = new FeedRoomLabel();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        feedRoomLabel.location = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        feedRoomLabel.text = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        feedRoomLabel.icon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        feedRoomLabel.logExtra = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        feedRoomLabel.backgroundColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        feedRoomLabel.bgImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return feedRoomLabel;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(FeedRoomLabel feedRoomLabel) {
        FeedRoomLabel feedRoomLabel2 = feedRoomLabel;
        Text text = feedRoomLabel2.text;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        ImageModel imageModel = feedRoomLabel2.icon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ImageModel imageModel2 = feedRoomLabel2.bgImage;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
    }

    @Override // X.C0IMD
    public final FeedRoomLabel LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FeedRoomLabel feedRoomLabel, List list) {
    }
}
