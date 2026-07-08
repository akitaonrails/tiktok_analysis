package webcast.api.battle;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.depend.model.live.match.AnchorGiftModeMap;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.android.livesdkapi.depend.model.live.match._AnchorGiftModeMap_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._GiftMode_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import webcast.api.battle.BattlePlaybookInfoResponse;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play._Playbook_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _BattlePlaybookInfoResponse_ResponseData_ProtoDecoder implements C0IMD<BattlePlaybookInfoResponse.ResponseData> {
    public static BattlePlaybookInfoResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattlePlaybookInfoResponse.ResponseData responseData = new BattlePlaybookInfoResponse.ResponseData();
        responseData.anchorGiftModeMapByType = new HashMap();
        responseData.anchorsPermission = new HashMap();
        responseData.matchPlaybooks = new ArrayList();
        responseData.giftMode = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                Object objValueOf = null;
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                responseData.matchPlaybooks.add(_Playbook_ProtoDecoder.LIZLLL(c1516680pZS));
                            }
                        } else {
                            long jLIZJ2 = c1516680pZS.LIZJ();
                            AnchorGiftModeMap anchorGiftModeMapLIZLLL = null;
                            while (true) {
                                int iLJI2 = c1516680pZS.LJI();
                                if (iLJI2 == -1) {
                                    break;
                                }
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        anchorGiftModeMapLIZLLL = _AnchorGiftModeMap_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    objValueOf = Integer.valueOf(c1516680pZS.LJIIJ());
                                }
                            }
                            c1516680pZS.LJ(jLIZJ2);
                            if (objValueOf != null) {
                                if (anchorGiftModeMapLIZLLL != null) {
                                    responseData.anchorGiftModeMapByType.put((Integer) objValueOf, anchorGiftModeMapLIZLLL);
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else {
                                throw new IllegalStateException("Map key must not be null!");
                            }
                        }
                    } else {
                        responseData.giftMode.add(_GiftMode_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    long jLIZJ3 = c1516680pZS.LIZJ();
                    Integer numValueOf = null;
                    while (true) {
                        int iLJI3 = c1516680pZS.LJI();
                        if (iLJI3 == -1) {
                            break;
                        }
                        if (iLJI3 != 1) {
                            if (iLJI3 == 2) {
                                numValueOf = Integer.valueOf(c1516680pZS.LJIIJ());
                            }
                        } else {
                            objValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                        }
                    }
                    c1516680pZS.LJ(jLIZJ3);
                    if (objValueOf != null) {
                        if (numValueOf != null) {
                            responseData.anchorsPermission.put((Long) objValueOf, numValueOf);
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

    public static void LJ(BattlePlaybookInfoResponse.ResponseData responseData) {
        if (responseData.anchorsPermission == null) {
            responseData.anchorsPermission = new HashMap();
        }
        List<GiftMode> list = responseData.giftMode;
        if (list == null) {
            responseData.giftMode = new ArrayList();
        } else if (!list.isEmpty()) {
            for (GiftMode giftMode : responseData.giftMode) {
                if (giftMode != null) {
                    _GiftMode_ProtoDecoder.LJ(giftMode);
                }
            }
        }
        Map<Integer, AnchorGiftModeMap> map = responseData.anchorGiftModeMapByType;
        if (map == null) {
            responseData.anchorGiftModeMapByType = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<Integer, AnchorGiftModeMap>> it2 = responseData.anchorGiftModeMapByType.entrySet().iterator();
            while (it2.hasNext()) {
                AnchorGiftModeMap value = it2.next().getValue();
                if (value != null) {
                    _AnchorGiftModeMap_ProtoDecoder.LJ(value);
                }
            }
        }
        List<Playbook> list2 = responseData.matchPlaybooks;
        if (list2 == null) {
            responseData.matchPlaybooks = new ArrayList();
            return;
        }
        if (list2.isEmpty()) {
            return;
        }
        for (Playbook playbook : responseData.matchPlaybooks) {
            if (playbook != null) {
                _Playbook_ProtoDecoder.LJ(playbook);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattlePlaybookInfoResponse.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final BattlePlaybookInfoResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattlePlaybookInfoResponse.ResponseData responseData, List list) {
    }
}
