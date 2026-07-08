package webcast.data.cohost_biz;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact.BattleGamePlayContent;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostABInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.GamePlayContent;
import com.bytedance.android.livesdk.chatroom.model.interact.VirtualWaitingUser;
import com.bytedance.android.livesdk.chatroom.model.interact._BattleGamePlayContent_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._CohostABInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._GamePlayContent_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._VirtualWaitingUser_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tikcast.linkmic.common.CohostUserInfo;
import tikcast.linkmic.common.GuestUserInfo;
import tikcast.linkmic.common._CohostUserInfo_ProtoDecoder;
import tikcast.linkmic.common._GuestUserInfo_ProtoDecoder;
import webcast.data.cohost_biz.BizRechargeResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _BizRechargeResponse_ResponseData_ProtoDecoder implements C0IMD<BizRechargeResponse.ResponseData> {
    public static BizRechargeResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BizRechargeResponse.ResponseData responseData = new BizRechargeResponse.ResponseData();
        responseData.userInfos = new HashMap();
        responseData.virtualWaitingUsers = new ArrayList();
        responseData.guestInfos = new HashMap();
        responseData.abInfos = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                Long lValueOf = null;
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    responseData.gameplayContent = _GamePlayContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                long jLIZJ2 = c1516680pZS.LIZJ();
                                GuestUserInfo guestUserInfoLIZLLL = null;
                                while (true) {
                                    int iLJI2 = c1516680pZS.LJI();
                                    if (iLJI2 == -1) {
                                        break;
                                    }
                                    if (iLJI2 != 1) {
                                        if (iLJI2 == 2) {
                                            guestUserInfoLIZLLL = _GuestUserInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                        }
                                    } else {
                                        lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                    }
                                }
                                c1516680pZS.LJ(jLIZJ2);
                                if (lValueOf != null) {
                                    if (guestUserInfoLIZLLL != null) {
                                        responseData.guestInfos.put(lValueOf, guestUserInfoLIZLLL);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        } else {
                            long jLIZJ3 = c1516680pZS.LIZJ();
                            CohostABInfo cohostABInfoLIZLLL = null;
                            while (true) {
                                int iLJI3 = c1516680pZS.LJI();
                                if (iLJI3 == -1) {
                                    break;
                                }
                                if (iLJI3 != 1) {
                                    if (iLJI3 == 2) {
                                        cohostABInfoLIZLLL = _CohostABInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            }
                            c1516680pZS.LJ(jLIZJ3);
                            if (lValueOf != null) {
                                if (cohostABInfoLIZLLL != null) {
                                    responseData.abInfos.put(lValueOf, cohostABInfoLIZLLL);
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else {
                                throw new IllegalStateException("Map key must not be null!");
                            }
                        }
                    } else {
                        responseData.virtualWaitingUsers.add(_VirtualWaitingUser_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    long jLIZJ4 = c1516680pZS.LIZJ();
                    CohostUserInfo cohostUserInfoLIZLLL = null;
                    while (true) {
                        int iLJI4 = c1516680pZS.LJI();
                        if (iLJI4 == -1) {
                            break;
                        }
                        if (iLJI4 != 1) {
                            if (iLJI4 == 2) {
                                cohostUserInfoLIZLLL = _CohostUserInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                        }
                    }
                    c1516680pZS.LJ(jLIZJ4);
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

    public static void LJ(BizRechargeResponse.ResponseData responseData) {
        ImageModel imageModel;
        ImageModel imageModel2;
        BattleGamePlayContent battleGamePlayContent;
        Map<Long, CohostUserInfo> map = responseData.userInfos;
        if (map == null) {
            responseData.userInfos = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<Long, CohostUserInfo>> it2 = responseData.userInfos.entrySet().iterator();
            while (it2.hasNext()) {
                CohostUserInfo value = it2.next().getValue();
                if (value != null && (imageModel = value.avatarThumb) != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
            }
        }
        List<VirtualWaitingUser> list = responseData.virtualWaitingUsers;
        if (list == null) {
            responseData.virtualWaitingUsers = new ArrayList();
        } else if (!list.isEmpty()) {
            for (VirtualWaitingUser virtualWaitingUser : responseData.virtualWaitingUsers) {
                if (virtualWaitingUser != null) {
                    _VirtualWaitingUser_ProtoDecoder.LJ(virtualWaitingUser);
                }
            }
        }
        Map<Long, CohostABInfo> map2 = responseData.abInfos;
        if (map2 == null) {
            responseData.abInfos = new HashMap();
        } else if (!map2.isEmpty()) {
            Iterator<Map.Entry<Long, CohostABInfo>> it3 = responseData.abInfos.entrySet().iterator();
            while (it3.hasNext()) {
                it3.next().getValue();
            }
        }
        Map<Long, GuestUserInfo> map3 = responseData.guestInfos;
        if (map3 == null) {
            responseData.guestInfos = new HashMap();
        } else if (!map3.isEmpty()) {
            Iterator<Map.Entry<Long, GuestUserInfo>> it4 = responseData.guestInfos.entrySet().iterator();
            while (it4.hasNext()) {
                GuestUserInfo value2 = it4.next().getValue();
                if (value2 != null && (imageModel2 = value2.avatarThumb) != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel2);
                }
            }
        }
        GamePlayContent gamePlayContent = responseData.gameplayContent;
        if (gamePlayContent != null && (battleGamePlayContent = gamePlayContent.battleGameplayContent) != null) {
            _BattleGamePlayContent_ProtoDecoder.LJ(battleGamePlayContent);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BizRechargeResponse.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final BizRechargeResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BizRechargeResponse.ResponseData responseData, List list) {
    }
}
