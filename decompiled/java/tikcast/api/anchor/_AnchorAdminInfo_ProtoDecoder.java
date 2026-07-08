package tikcast.api.anchor;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorAdminInfo_ProtoDecoder implements C0IMD<AnchorAdminInfo> {
    public static AnchorAdminInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorAdminInfo anchorAdminInfo = new AnchorAdminInfo();
        anchorAdminInfo.permissions = new HashMap();
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
                                    anchorAdminInfo.recentWatchStatus = c1516680pZS.LJIIJ();
                                }
                            } else {
                                anchorAdminInfo.tagKey = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            anchorAdminInfo.userTag = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        Integer numValueOf = null;
                        Integer numValueOf2 = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 == -1) {
                                break;
                            }
                            if (iLJI2 != 1) {
                                if (iLJI2 == 2) {
                                    numValueOf2 = Integer.valueOf(c1516680pZS.LJIIJ());
                                }
                            } else {
                                numValueOf = Integer.valueOf(c1516680pZS.LJIIJ());
                            }
                        }
                        c1516680pZS.LJ(jLIZJ2);
                        if (numValueOf != null) {
                            if (numValueOf2 != null) {
                                anchorAdminInfo.permissions.put(numValueOf, numValueOf2);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    anchorAdminInfo.userInfo = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorAdminInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AnchorAdminInfo anchorAdminInfo) {
        AnchorAdminInfo anchorAdminInfo2 = anchorAdminInfo;
        User user = anchorAdminInfo2.userInfo;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        if (anchorAdminInfo2.permissions == null) {
            anchorAdminInfo2.permissions = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final AnchorAdminInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorAdminInfo anchorAdminInfo, List list) {
    }
}
