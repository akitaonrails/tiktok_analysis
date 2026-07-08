package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PollEndContent_ProtoDecoder implements C0IMD<PollEndContent> {
    public static PollEndContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PollEndContent pollEndContent = new PollEndContent();
        pollEndContent.optionList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            pollEndContent.operator = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        pollEndContent.optionList.add(_PollOptionInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    pollEndContent.endType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return pollEndContent;
            }
        }
    }

    public static void LJ(PollEndContent pollEndContent) {
        List<PollOptionInfo> list = pollEndContent.optionList;
        if (list == null) {
            pollEndContent.optionList = new ArrayList();
        } else if (!list.isEmpty()) {
            for (PollOptionInfo pollOptionInfo : pollEndContent.optionList) {
                if (pollOptionInfo != null) {
                    _PollOptionInfo_ProtoDecoder.LJ(pollOptionInfo);
                }
            }
        }
        User user = pollEndContent.operator;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PollEndContent pollEndContent) {
        LJ(pollEndContent);
    }

    @Override // X.C0IMD
    public final PollEndContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PollEndContent pollEndContent, List list) {
    }
}
