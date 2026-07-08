package webcast.data.cohost_biz;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tikcast.linkmic.common.CohostUserInfo;
import tikcast.linkmic.common._CohostUserInfo_ProtoDecoder;
import webcast.data.cohost_biz.BizMigrateGroupResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _BizMigrateGroupResponse_ResponseData_ProtoDecoder implements C0IMD<BizMigrateGroupResponse.ResponseData> {
    public static BizMigrateGroupResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BizMigrateGroupResponse.ResponseData responseData = new BizMigrateGroupResponse.ResponseData();
        responseData.userInfos = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    long jLIZJ2 = c1516680pZS.LIZJ();
                    Long lValueOf = null;
                    CohostUserInfo cohostUserInfoLIZLLL = null;
                    while (true) {
                        int iLJI2 = c1516680pZS.LJI();
                        if (iLJI2 == -1) {
                            break;
                        }
                        if (iLJI2 != 1) {
                            if (iLJI2 == 2) {
                                cohostUserInfoLIZLLL = _CohostUserInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                        }
                    }
                    c1516680pZS.LJ(jLIZJ2);
                    if (lValueOf != null) {
                        if (cohostUserInfoLIZLLL != null) {
                            responseData.userInfos.put(lValueOf, cohostUserInfoLIZLLL);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    public static void LJ(BizMigrateGroupResponse.ResponseData responseData) {
        ImageModel imageModel;
        Map<Long, CohostUserInfo> map = responseData.userInfos;
        if (map == null) {
            responseData.userInfos = new HashMap();
            return;
        }
        if (map.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<Long, CohostUserInfo>> it2 = responseData.userInfos.entrySet().iterator();
        while (it2.hasNext()) {
            CohostUserInfo value = it2.next().getValue();
            if (value != null && (imageModel = value.avatarThumb) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BizMigrateGroupResponse.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final BizMigrateGroupResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BizMigrateGroupResponse.ResponseData responseData, List list) {
    }
}
