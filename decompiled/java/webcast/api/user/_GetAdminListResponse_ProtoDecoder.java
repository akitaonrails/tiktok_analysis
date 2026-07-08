package webcast.api.user;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import webcast.api.user.GetAdminListResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _GetAdminListResponse_ProtoDecoder implements C0IMD<GetAdminListResponse> {
    @Override // X.C0IMD
    public final void LIZ(GetAdminListResponse getAdminListResponse) {
        User user;
        GetAdminListResponse getAdminListResponse2 = getAdminListResponse;
        List<GetAdminListResponse.AdminUser> list = getAdminListResponse2.data;
        if (list == null) {
            getAdminListResponse2.data = new ArrayList();
        } else if (!list.isEmpty()) {
            for (GetAdminListResponse.AdminUser adminUser : getAdminListResponse2.data) {
                if (adminUser != null) {
                    User user2 = adminUser.userInfo;
                    if (user2 != null) {
                        _User_ProtoDecoder.LJ(user2);
                    }
                    if (adminUser.permissions == null) {
                        adminUser.permissions = new HashMap();
                    }
                }
            }
        }
        List<SuggestedModerator> list2 = getAdminListResponse2.suggestedModerators;
        if (list2 == null) {
            getAdminListResponse2.suggestedModerators = new ArrayList();
            return;
        }
        if (list2.isEmpty()) {
            return;
        }
        for (SuggestedModerator suggestedModerator : getAdminListResponse2.suggestedModerators) {
            if (suggestedModerator != null && (user = suggestedModerator.userInfo) != null) {
                _User_ProtoDecoder.LJ(user);
            }
        }
    }

    @Override // X.C0IMD
    public final GetAdminListResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GetAdminListResponse getAdminListResponse = new GetAdminListResponse();
        getAdminListResponse.data = new ArrayList();
        getAdminListResponse.suggestedModerators = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            getAdminListResponse.suggestedModerators.add(_SuggestedModerator_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        getAdminListResponse.extra = _GetAdminListExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    getAdminListResponse.data.add(_GetAdminListResponse_AdminUser_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return getAdminListResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetAdminListResponse getAdminListResponse, List list) {
    }
}
