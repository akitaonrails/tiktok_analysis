package com.ss.android.ugc.aweme.ecommerce.mall.toko.repository;

import X.C09CT;
import X.C0X52;
import X.C597540Nc8;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501200pAU;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;

/* JADX INFO: loaded from: classes10.dex */
public interface TTDataAuthApi {
    public static final C597540Nc8 LIZ = C597540Nc8.LIZ;

    @InterfaceC1501200pAU("/api/v1/mall/user/data/auth/get")
    Object getTTDataAuthStatus(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("data_type") int i2, InterfaceC1364105Vn<? super C0X52<Response<UserDataAuthInfoData>>> interfaceC1364105Vn);

    public static final class UserDataAuthInfoData {

        @C09CT("auth_status")
        public final int authStatus;

        public UserDataAuthInfoData() {
            this(0);
        }

        public UserDataAuthInfoData(int i) {
            this.authStatus = i;
        }
    }
}
