package com.ss.android.ugc.aweme.setting.api;

import X.C0221005j;
import X.C11NZ;
import X.C1726240v1S;
import X.InterfaceC1485405rg;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501310pAf;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.setting.model.AuthAppInfoListResponse;
import com.ss.android.ugc.aweme.setting.model.RemoveAuthInfoScopeRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes27.dex */
public interface AuthListApi {
    public static final C1726240v1S LIZ = C1726240v1S.LIZ;

    @InterfaceC1501200pAU("/tiktok/v2/oauth/authorized/app/list/")
    C11NZ<AuthAppInfoListResponse> LIZ(@InterfaceC1501120pAM(Scene.SCENE_SERVICE) String str, @InterfaceC1501120pAM("teen_sec_uid") String str2);

    @InterfaceC1501200pAU("/tiktok/v2/oauth/authorized/app/list/")
    C11NZ<AuthAppInfoListResponse> LIZIZ(@InterfaceC1501120pAM(Scene.SCENE_SERVICE) String str, @InterfaceC1501120pAM("teen_sec_uid") String str2, @InterfaceC1501120pAM("client_key_filter") ArrayList<String> arrayList);

    @InterfaceC1501170pAR("/tiktok/v2/oauth/authorized/app/remove/scope/")
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    C11NZ<C0221005j> removeAuthInfoScope(@InterfaceC1485405rg RemoveAuthInfoScopeRequest removeAuthInfoScopeRequest);
}
