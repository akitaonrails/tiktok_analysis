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
public final class _PollStartContent_ProtoDecoder implements C0IMD<PollStartContent> {
    public static PollStartContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PollStartContent pollStartContent = new PollStartContent();
        pollStartContent.optionList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    pollStartContent.operator = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                pollStartContent.title = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            pollStartContent.optionList.add(_PollOptionInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        pollStartContent.endTime = c1516680pZS.LJIIJJI();
                    }
                } else {
                    pollStartContent.startTime = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return pollStartContent;
            }
        }
    }

    public static void LJ(PollStartContent pollStartContent) {
        List<PollOptionInfo> list = pollStartContent.optionList;
        if (list == null) {
            pollStartContent.optionList = new ArrayList();
        } else if (!list.isEmpty()) {
            for (PollOptionInfo pollOptionInfo : pollStartContent.optionList) {
                if (pollOptionInfo != null) {
                    _PollOptionInfo_ProtoDecoder.LJ(pollOptionInfo);
                }
            }
        }
        User user = pollStartContent.operator;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PollStartContent pollStartContent) {
        LJ(pollStartContent);
    }

    @Override // X.C0IMD
    public final PollStartContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PollStartContent pollStartContent, List list) {
    }
}
