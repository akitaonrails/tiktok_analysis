package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model.ResumeResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostListUser;
import com.bytedance.android.livesdk.chatroom.model.interact._CohostListUser_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ResumeResponse_ResponseData_ProtoDecoder implements C0IMD<ResumeResponse.ResponseData> {
    public static ResumeResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ResumeResponse.ResponseData responseData = new ResumeResponse.ResponseData();
        responseData.users = new ArrayList();
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
                                    responseData.channelId = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                responseData.totalPositionCount = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            responseData.users.add(_CohostListUser_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        responseData.isResume = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    responseData.rtcExtInfo = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    public static void LJ(ResumeResponse.ResponseData responseData) {
        ImageModel imageModel;
        List<CohostListUser> list = responseData.users;
        if (list == null) {
            responseData.users = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (CohostListUser cohostListUser : responseData.users) {
            if (cohostListUser != null && (imageModel = cohostListUser.avatarThumb) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ResumeResponse.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final ResumeResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ResumeResponse.ResponseData responseData, List list) {
    }
}
