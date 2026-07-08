package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.CohostPlatformMessage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tikcast.linkmic.common.GroupPlayer;
import tikcast.linkmic.common._GroupPlayer_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _CohostPlatformMessage_CohostInviteInfo_ProtoDecoder implements C0IMD<CohostPlatformMessage.CohostInviteInfo> {
    public static CohostPlatformMessage.CohostInviteInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CohostPlatformMessage.CohostInviteInfo cohostInviteInfo = new CohostPlatformMessage.CohostInviteInfo();
        cohostInviteInfo.inviteeInfos = new HashMap();
        cohostInviteInfo.anchorList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            cohostInviteInfo.popUpUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        Long lValueOf = null;
                        CohostPlatformMessage.InviteeInfo inviteeInfoLIZLLL = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 == -1) {
                                break;
                            }
                            if (iLJI2 != 1) {
                                if (iLJI2 == 2) {
                                    inviteeInfoLIZLLL = _CohostPlatformMessage_InviteeInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                            }
                        }
                        c1516680pZS.LJ(jLIZJ2);
                        if (lValueOf != null) {
                            if (inviteeInfoLIZLLL != null) {
                                cohostInviteInfo.inviteeInfos.put(lValueOf, inviteeInfoLIZLLL);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    cohostInviteInfo.anchorList.add(_GroupPlayer_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cohostInviteInfo;
            }
        }
    }

    public static void LJ(CohostPlatformMessage.CohostInviteInfo cohostInviteInfo) {
        ImageModel imageModel;
        List<GroupPlayer> list = cohostInviteInfo.anchorList;
        if (list == null) {
            cohostInviteInfo.anchorList = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<GroupPlayer> it2 = cohostInviteInfo.anchorList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        Map<Long, CohostPlatformMessage.InviteeInfo> map = cohostInviteInfo.inviteeInfos;
        if (map == null) {
            cohostInviteInfo.inviteeInfos = new HashMap();
            return;
        }
        if (map.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<Long, CohostPlatformMessage.InviteeInfo>> it3 = cohostInviteInfo.inviteeInfos.entrySet().iterator();
        while (it3.hasNext()) {
            CohostPlatformMessage.InviteeInfo value = it3.next().getValue();
            if (value != null && (imageModel = value.displayAvatar) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CohostPlatformMessage.CohostInviteInfo cohostInviteInfo) {
        LJ(cohostInviteInfo);
    }

    @Override // X.C0IMD
    public final CohostPlatformMessage.CohostInviteInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostPlatformMessage.CohostInviteInfo cohostInviteInfo, List list) {
    }
}
