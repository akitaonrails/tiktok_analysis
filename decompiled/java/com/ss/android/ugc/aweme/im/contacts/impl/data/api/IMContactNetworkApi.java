package com.ss.android.ugc.aweme.im.contacts.impl.data.api;

import X.C1724906pD;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501330pAh;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserFeatureRequestBody;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserFeatureResponse;
import com.ss.android.ugc.aweme.im.contacts.api.model.UserSettingsUpdateBody;
import com.ss.android.ugc.aweme.im.contacts.impl.model.IMContactListResponse;
import com.ss.android.ugc.aweme.im.contacts.impl.model.UserProfileResponse;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface IMContactNetworkApi {
    public static final C1724906pD LIZ = C1724906pD.LIZ;

    @InterfaceC1501200pAU("/tiktok/v1/im/user/list/")
    Object LIZ(@InterfaceC1501120pAM("user_type") Integer num, @InterfaceC1501120pAM("index") Integer num2, @InterfaceC1501120pAM("count") Integer num3, @InterfaceC1501120pAM("user_type_cursor") int i, @InterfaceC1501120pAM("source") String str, InterfaceC1364105Vn<? super IMContactListResponse> interfaceC1364105Vn);

    @InterfaceC1501200pAU("/tiktok/v1/im/user/profile/")
    Object LIZIZ(@InterfaceC1501120pAM("user_ids") String str, @InterfaceC1501120pAM("source") String str2, @InterfaceC1501120pAM("need_fans_tags") boolean z, InterfaceC1364105Vn<? super UserProfileResponse> interfaceC1364105Vn);

    @InterfaceC1501330pAh({"Content-Type: application/json"})
    @InterfaceC1501200pAU("/tiktok/v1/im/user/feature/get")
    Object LIZJ(@InterfaceC1501120pAM("im_user_feature_names") List<Integer> list, @InterfaceC1501120pAM("other_user_id") Long l, @InterfaceC1501120pAM("extra") String str, InterfaceC1364105Vn<? super IMUserFeatureResponse> interfaceC1364105Vn);

    @InterfaceC1501330pAh({"Content-Type: application/json"})
    @InterfaceC1501240pAY("/tiktok/v1/im/user/feature/update")
    Object updateUserFeature(@InterfaceC1485405rg IMUserFeatureRequestBody iMUserFeatureRequestBody, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501330pAh({"Content-Type: application/json"})
    @InterfaceC1501240pAY("/tiktok/v1/im/user/settings")
    Object updateUserSettings(@InterfaceC1485405rg UserSettingsUpdateBody userSettingsUpdateBody, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);
}
