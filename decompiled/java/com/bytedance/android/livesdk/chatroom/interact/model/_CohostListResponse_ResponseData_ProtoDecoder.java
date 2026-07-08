package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model.CohostListResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostABInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostListUser;
import com.bytedance.android.livesdk.chatroom.model.interact._CohostABInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._CohostListUser_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tikcast.linkmic.common.GuestUserInfo;
import tikcast.linkmic.common._GuestUserInfo_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _CohostListResponse_ResponseData_ProtoDecoder implements C0IMD<CohostListResponse.ResponseData> {
    public static CohostListResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CohostListResponse.ResponseData responseData = new CohostListResponse.ResponseData();
        responseData.cohostAbInfos = new HashMap();
        responseData.guestUserInfos = new HashMap();
        responseData.users = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            Long lValueOf = null;
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    long jLIZJ2 = c1516680pZS.LIZJ();
                                    CohostABInfo cohostABInfoLIZLLL = null;
                                    while (true) {
                                        int iLJI2 = c1516680pZS.LJI();
                                        if (iLJI2 == -1) {
                                            break;
                                        }
                                        if (iLJI2 != 1) {
                                            if (iLJI2 == 2) {
                                                cohostABInfoLIZLLL = _CohostABInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                            }
                                        } else {
                                            lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                        }
                                    }
                                    c1516680pZS.LJ(jLIZJ2);
                                    if (lValueOf != null) {
                                        if (cohostABInfoLIZLLL != null) {
                                            responseData.cohostAbInfos.put(lValueOf, cohostABInfoLIZLLL);
                                        } else {
                                            throw new IllegalStateException("Map value must not be null!");
                                        }
                                    } else {
                                        throw new IllegalStateException("Map key must not be null!");
                                    }
                                }
                            } else {
                                long jLIZJ3 = c1516680pZS.LIZJ();
                                GuestUserInfo guestUserInfoLIZLLL = null;
                                while (true) {
                                    int iLJI3 = c1516680pZS.LJI();
                                    if (iLJI3 == -1) {
                                        break;
                                    }
                                    if (iLJI3 != 1) {
                                        if (iLJI3 == 2) {
                                            guestUserInfoLIZLLL = _GuestUserInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                        }
                                    } else {
                                        lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                    }
                                }
                                c1516680pZS.LJ(jLIZJ3);
                                if (lValueOf != null) {
                                    if (guestUserInfoLIZLLL != null) {
                                        responseData.guestUserInfos.put(lValueOf, guestUserInfoLIZLLL);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        } else {
                            responseData.users.add(_CohostListUser_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        responseData.groupChannelId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    responseData.totalPositionCount = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    public static void LJ(CohostListResponse.ResponseData responseData) {
        ImageModel imageModel;
        ImageModel imageModel2;
        List<CohostListUser> list = responseData.users;
        if (list == null) {
            responseData.users = new ArrayList();
        } else if (!list.isEmpty()) {
            for (CohostListUser cohostListUser : responseData.users) {
                if (cohostListUser != null && (imageModel = cohostListUser.avatarThumb) != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
            }
        }
        Map<Long, GuestUserInfo> map = responseData.guestUserInfos;
        if (map == null) {
            responseData.guestUserInfos = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<Long, GuestUserInfo>> it2 = responseData.guestUserInfos.entrySet().iterator();
            while (it2.hasNext()) {
                GuestUserInfo value = it2.next().getValue();
                if (value != null && (imageModel2 = value.avatarThumb) != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel2);
                }
            }
        }
        Map<Long, CohostABInfo> map2 = responseData.cohostAbInfos;
        if (map2 == null) {
            responseData.cohostAbInfos = new HashMap();
        } else {
            if (map2.isEmpty()) {
                return;
            }
            Iterator<Map.Entry<Long, CohostABInfo>> it3 = responseData.cohostAbInfos.entrySet().iterator();
            while (it3.hasNext()) {
                it3.next().getValue();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CohostListResponse.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final CohostListResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostListResponse.ResponseData responseData, List list) {
    }
}
