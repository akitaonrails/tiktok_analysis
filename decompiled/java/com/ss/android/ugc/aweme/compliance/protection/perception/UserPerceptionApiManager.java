package com.ss.android.ugc.aweme.compliance.protection.perception;

import X.C09CT;
import X.C0CQT;
import X.C2188811AlT;
import X.InterfaceC164300k5;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class UserPerceptionApiManager {
    public static final UserPerceptionApiManager LIZ = new UserPerceptionApiManager();
    public static final InterfaceC164300k5 LIZIZ = (InterfaceC164300k5) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(InterfaceC164300k5.class);

    public static final class UserPerceptionPopupResponse extends BaseResponse {

        @C09CT("popup_list")
        public final List<PerceptionPopup> popupList;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserPerceptionPopupResponse) && Intrinsics.LJFF(this.popupList, ((UserPerceptionPopupResponse) obj).popupList);
        }

        public final int hashCode() {
            List<PerceptionPopup> list = this.popupList;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("UserPerceptionPopupResponse(popupList=");
            sbLIZ.append(this.popupList);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public UserPerceptionPopupResponse(List<PerceptionPopup> list) {
            this.popupList = list;
        }
    }
}
