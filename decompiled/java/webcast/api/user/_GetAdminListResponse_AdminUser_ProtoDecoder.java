package webcast.api.user;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import webcast.api.user.GetAdminListResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _GetAdminListResponse_AdminUser_ProtoDecoder implements C0IMD<GetAdminListResponse.AdminUser> {
    public static GetAdminListResponse.AdminUser LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GetAdminListResponse.AdminUser adminUser = new GetAdminListResponse.AdminUser();
        adminUser.permissions = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        adminUser.userInfo = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        adminUser.isAnchorAssign = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 3:
                        adminUser.deprecated1 = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        adminUser.deprecated2 = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        adminUser.deprecated3 = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        Integer numValueOf = null;
                        Integer numValueOf2 = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 != -1) {
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        numValueOf2 = Integer.valueOf(c1516680pZS.LJIIJ());
                                    }
                                } else {
                                    numValueOf = Integer.valueOf(c1516680pZS.LJIIJ());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ2);
                                if (numValueOf != null) {
                                    if (numValueOf2 != null) {
                                        adminUser.permissions.put(numValueOf, numValueOf2);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                                break;
                            }
                        }
                        break;
                    case 7:
                        adminUser.userTag = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        adminUser.recentWatchStatus = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        adminUser.tagKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return adminUser;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GetAdminListResponse.AdminUser adminUser) {
        GetAdminListResponse.AdminUser adminUser2 = adminUser;
        User user = adminUser2.userInfo;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        if (adminUser2.permissions == null) {
            adminUser2.permissions = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final GetAdminListResponse.AdminUser LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetAdminListResponse.AdminUser adminUser, List list) {
    }
}
