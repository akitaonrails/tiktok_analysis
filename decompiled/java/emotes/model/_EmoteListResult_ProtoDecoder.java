package emotes.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.emoji._EmoteModel_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EmoteListResult_ProtoDecoder implements C0IMD<EmoteListResult> {
    public static EmoteListResult LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EmoteListResult emoteListResult = new EmoteListResult();
        emoteListResult.emoteList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        emoteListResult.exist = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                    }
                } else {
                    emoteListResult.emoteList.add(_EmoteModel_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return emoteListResult;
            }
        }
    }

    public static void LJ(EmoteListResult emoteListResult) {
        List<EmoteModel> list = emoteListResult.emoteList;
        if (list == null) {
            emoteListResult.emoteList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (EmoteModel emoteModel : emoteListResult.emoteList) {
            if (emoteModel != null) {
                _EmoteModel_ProtoDecoder.LJ(emoteModel);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EmoteListResult emoteListResult) {
        LJ(emoteListResult);
    }

    @Override // X.C0IMD
    public final EmoteListResult LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EmoteListResult emoteListResult, List list) {
    }
}
