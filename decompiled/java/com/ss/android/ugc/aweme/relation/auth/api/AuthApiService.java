package com.ss.android.ugc.aweme.relation.auth.api;

import X.AbstractC19484711Kz;
import X.C080U;
import X.C1075560e5y;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC2174808fa;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.relation.auth.api.IAuthApi;
import com.ss.android.ugc.aweme.relation.auth.model.ContactUploadResponse;
import com.ss.android.ugc.aweme.relation.auth.model.EmailUploadResponse;
import com.ss.android.ugc.aweme.relation.auth.model.FriendsUploadResponse;
import com.ss.android.ugc.aweme.relation.auth.model.PsiUploadEncryptContactResponseV2;
import com.ss.android.ugc.aweme.relation.auth.model.PsiUploadEncryptContactResponseV3;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class AuthApiService implements IAuthApi {
    public static final AuthApiService LIZIZ = new AuthApiService();
    public final /* synthetic */ IAuthApi LIZ = (IAuthApi) C1075560e5y.LIZIZ.create(IAuthApi.class);

    @Override // com.ss.android.ugc.aweme.relation.auth.api.IAuthApi
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v2/upload/psihashcontacts/")
    public AbstractC19484711Kz<PsiUploadEncryptContactResponseV2> psiFilterContactV2(@InterfaceC1501150pAP Map<String, String> map, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("sync_only") boolean z) {
        return this.LIZ.psiFilterContactV2(map, i, z);
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.api.IAuthApi
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v3/upload/psihashcontacts/")
    public AbstractC19484711Kz<PsiUploadEncryptContactResponseV3> psiFilterContactV3(@InterfaceC1501150pAP Map<String, String> map, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("sync_only") boolean z) {
        return this.LIZ.psiFilterContactV3(map, i, z);
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.api.IAuthApi
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/user/relation/social/settings/update/v1")
    public Object syncSocialRelationStatus(@InterfaceC1501050pAF("social_platform") int i, @InterfaceC1501050pAF("sync_status") boolean z, @InterfaceC1501050pAF("is_manual") boolean z2, @InterfaceC1501050pAF("email_ads_disclosure") boolean z3, @InterfaceC1501050pAF("contact_book_ads_disclosure") boolean z4, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn) {
        boolean zLJI = MethodIDManager.LJI(202490);
        Object objSyncSocialRelationStatus = this.LIZ.syncSocialRelationStatus(i, z, z2, z3, z4, interfaceC1364105Vn);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return objSyncSocialRelationStatus;
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.api.IAuthApi
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/social/friend/")
    public AbstractC19484711Kz<FriendsUploadResponse> uploadFacebookToken(@InterfaceC1501050pAF(Scene.SCENE_SERVICE) int i, @InterfaceC1501050pAF("social") String str, @InterfaceC1501050pAF("sync_only") boolean z, @InterfaceC1501050pAF("secret_access_token") String str2, @InterfaceC1501050pAF("access_token") String str3, @InterfaceC1501050pAF("token_expiration_timestamp") Long l, @InterfaceC1501050pAF("access_token_app") int i2) {
        return this.LIZ.uploadFacebookToken(i, str, z, str2, str3, l, i2);
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.api.IAuthApi
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/upload/hashcontacts/")
    public AbstractC19484711Kz<ContactUploadResponse> uploadHashContact(@InterfaceC1501150pAP Map<String, String> map, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("sync_only") boolean z) {
        return this.LIZ.uploadHashContact(map, i, z);
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.api.IAuthApi
    @InterfaceC1501170pAR("/passport/identity/set_identity_info/")
    public AbstractC19484711Kz<EmailUploadResponse> uploadHashIdentityInfo(@InterfaceC1485405rg IAuthApi.IdentityBody identityBody, @InterfaceC2174808fa List<C080U> list, @InterfaceC1501070pAH("user_identity_source") int i) {
        return this.LIZ.uploadHashIdentityInfo(identityBody, list, i);
    }
}
