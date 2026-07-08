package com.ss.android.ugc.aweme.account.loginapproval;

import X.C01GW;
import X.C080U;
import X.C0CQT;
import X.C123100dR;
import X.C15O7;
import X.C2188811AlT;
import X.C452501pT;
import X.EnumC21267818Ku;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501300pAe;
import X.InterfaceC2174808fa;
import com.bytedance.scene.Scene;
import com.ss.android.account.token.TTTokenUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class LoginApprovalApi {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(32));

    public interface Api {
        @InterfaceC1501240pAY("/passport/user/confirm_notification/")
        @InterfaceC1501300pAe
        C15O7<ConfirmApprovalNotificationData> confirmNotification(@InterfaceC1501100pAK("passport_ticket") String str, @InterfaceC1501100pAK("type") int i, @InterfaceC1501100pAK(Scene.SCENE_SERVICE) int i2, @InterfaceC2174808fa List<C080U> list);

        @InterfaceC1501240pAY("/passport/user/get_data_by_ticket/")
        @InterfaceC1501300pAe
        C15O7<LoginApprovalDeviceData> getDataByTicket(@InterfaceC1501100pAK("passport_ticket") String str, @InterfaceC1501100pAK(Scene.SCENE_SERVICE) int i, @InterfaceC2174808fa List<C080U> list);
    }

    public static List LIZIZ(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0CQT.LIZJ);
        sbLIZ.append(str);
        String strLIZ = TTTokenUtils.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (C123100dR.LIZ(strLIZ)) {
            arrayList.add(new C080U("x-tt-passport-csrf-token", strLIZ));
        }
        return arrayList;
    }

    public static C15O7 LIZ(String str, EnumC21267818Ku enumC21267818Ku) {
        return ((Api) LIZ.getValue()).confirmNotification(str, enumC21267818Ku.toServerRequestValue(), 1, LIZIZ("/passport/user/confirm_notification/"));
    }
}
