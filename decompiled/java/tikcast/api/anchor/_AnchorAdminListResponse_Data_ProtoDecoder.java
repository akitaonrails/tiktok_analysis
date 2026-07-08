package tikcast.api.anchor;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tikcast.api.anchor.AnchorAdminListResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorAdminListResponse_Data_ProtoDecoder implements C0IMD<AnchorAdminListResponse.Data> {
    public static AnchorAdminListResponse.Data LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorAdminListResponse.Data data = new AnchorAdminListResponse.Data();
        data.suggestedModerators = new ArrayList();
        data.admins = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            data.suggestedModerators.add(_AnchorSuggestedModerator_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        data.admins.add(_AnchorAdminInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    data.adminMaxCount = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return data;
            }
        }
    }

    public static void LJ(AnchorAdminListResponse.Data data) {
        User user;
        List<AnchorAdminInfo> list = data.admins;
        if (list == null) {
            data.admins = new ArrayList();
        } else if (!list.isEmpty()) {
            for (AnchorAdminInfo anchorAdminInfo : data.admins) {
                if (anchorAdminInfo != null) {
                    User user2 = anchorAdminInfo.userInfo;
                    if (user2 != null) {
                        _User_ProtoDecoder.LJ(user2);
                    }
                    if (anchorAdminInfo.permissions == null) {
                        anchorAdminInfo.permissions = new HashMap();
                    }
                }
            }
        }
        List<AnchorSuggestedModerator> list2 = data.suggestedModerators;
        if (list2 == null) {
            data.suggestedModerators = new ArrayList();
            return;
        }
        if (list2.isEmpty()) {
            return;
        }
        for (AnchorSuggestedModerator anchorSuggestedModerator : data.suggestedModerators) {
            if (anchorSuggestedModerator != null && (user = anchorSuggestedModerator.userInfo) != null) {
                _User_ProtoDecoder.LJ(user);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AnchorAdminListResponse.Data data) {
        LJ(data);
    }

    @Override // X.C0IMD
    public final AnchorAdminListResponse.Data LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorAdminListResponse.Data data, List list) {
    }
}
