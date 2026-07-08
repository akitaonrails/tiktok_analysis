package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.VoteUser;
import com.bytedance.android.livesdk.model._VoteUser_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PollOptionInfo_ProtoDecoder implements C0IMD<PollOptionInfo> {
    public static PollOptionInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PollOptionInfo pollOptionInfo = new PollOptionInfo();
        pollOptionInfo.voteUserList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                pollOptionInfo.voteUserList.add(_VoteUser_ProtoDecoder.LIZLLL(c1516680pZS));
                            }
                        } else {
                            pollOptionInfo.optionIndex = (int) c1516680pZS.LJIIJJI();
                        }
                    } else {
                        pollOptionInfo.displayContent = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    pollOptionInfo.votes = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return pollOptionInfo;
            }
        }
    }

    public static void LJ(PollOptionInfo pollOptionInfo) {
        ImageModel imageModel;
        List<VoteUser> list = pollOptionInfo.voteUserList;
        if (list == null) {
            pollOptionInfo.voteUserList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (VoteUser voteUser : pollOptionInfo.voteUserList) {
            if (voteUser != null && (imageModel = voteUser.avatarThumb) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PollOptionInfo pollOptionInfo) {
        LJ(pollOptionInfo);
    }

    @Override // X.C0IMD
    public final PollOptionInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PollOptionInfo pollOptionInfo, List list) {
    }
}
