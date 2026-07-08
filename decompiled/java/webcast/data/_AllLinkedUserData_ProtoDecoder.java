package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AllLinkedUserData_ProtoDecoder implements C0IMD<AllLinkedUserData> {
    public static AllLinkedUserData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AllLinkedUserData allLinkedUserData = new AllLinkedUserData();
        allLinkedUserData.linkedUserList = new ArrayList();
        allLinkedUserData.friendList = new ArrayList();
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
                                    allLinkedUserData.friendList.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                                }
                            } else {
                                allLinkedUserData.cardType = c1516680pZS.LJIIJ();
                            }
                        } else {
                            allLinkedUserData.describeMessage = _CardTag_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        allLinkedUserData.relationTag = _CardTag_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    allLinkedUserData.linkedUserList.add(_User_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return allLinkedUserData;
            }
        }
    }

    public static void LJ(AllLinkedUserData allLinkedUserData) {
        ImageModel imageModel;
        ImageModel imageModel2;
        List<User> list = allLinkedUserData.linkedUserList;
        if (list == null) {
            allLinkedUserData.linkedUserList = new ArrayList();
        } else if (!list.isEmpty()) {
            for (User user : allLinkedUserData.linkedUserList) {
                if (user != null) {
                    _User_ProtoDecoder.LJ(user);
                }
            }
        }
        CardTag cardTag = allLinkedUserData.relationTag;
        if (cardTag != null && (imageModel2 = cardTag.icon) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
        CardTag cardTag2 = allLinkedUserData.describeMessage;
        if (cardTag2 != null && (imageModel = cardTag2.icon) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        if (allLinkedUserData.friendList == null) {
            allLinkedUserData.friendList = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AllLinkedUserData allLinkedUserData) {
        LJ(allLinkedUserData);
    }

    @Override // X.C0IMD
    public final AllLinkedUserData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AllLinkedUserData allLinkedUserData, List list) {
    }
}
