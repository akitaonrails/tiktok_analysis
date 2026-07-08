package com.ss.android.ugc.aweme.relation.auth.api;

import X.AbstractC19484711Kz;
import X.C080U;
import X.C09CT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC2174808fa;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.relation.auth.model.ContactUploadResponse;
import com.ss.android.ugc.aweme.relation.auth.model.EmailUploadResponse;
import com.ss.android.ugc.aweme.relation.auth.model.FriendsUploadResponse;
import com.ss.android.ugc.aweme.relation.auth.model.PsiUploadEncryptContactResponseV2;
import com.ss.android.ugc.aweme.relation.auth.model.PsiUploadEncryptContactResponseV3;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public interface IAuthApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v2/upload/psihashcontacts/")
    AbstractC19484711Kz<PsiUploadEncryptContactResponseV2> psiFilterContactV2(@InterfaceC1501150pAP Map<String, String> map, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("sync_only") boolean z);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v3/upload/psihashcontacts/")
    AbstractC19484711Kz<PsiUploadEncryptContactResponseV3> psiFilterContactV3(@InterfaceC1501150pAP Map<String, String> map, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("sync_only") boolean z);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/user/relation/social/settings/update/v1")
    Object syncSocialRelationStatus(@InterfaceC1501050pAF("social_platform") int i, @InterfaceC1501050pAF("sync_status") boolean z, @InterfaceC1501050pAF("is_manual") boolean z2, @InterfaceC1501050pAF("email_ads_disclosure") boolean z3, @InterfaceC1501050pAF("contact_book_ads_disclosure") boolean z4, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/social/friend/")
    AbstractC19484711Kz<FriendsUploadResponse> uploadFacebookToken(@InterfaceC1501050pAF(Scene.SCENE_SERVICE) int i, @InterfaceC1501050pAF("social") String str, @InterfaceC1501050pAF("sync_only") boolean z, @InterfaceC1501050pAF("secret_access_token") String str2, @InterfaceC1501050pAF("access_token") String str3, @InterfaceC1501050pAF("token_expiration_timestamp") Long l, @InterfaceC1501050pAF("access_token_app") int i2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/upload/hashcontacts/")
    AbstractC19484711Kz<ContactUploadResponse> uploadHashContact(@InterfaceC1501150pAP Map<String, String> map, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("sync_only") boolean z);

    @InterfaceC1501170pAR("/passport/identity/set_identity_info/")
    AbstractC19484711Kz<EmailUploadResponse> uploadHashIdentityInfo(@InterfaceC1485405rg IdentityBody identityBody, @InterfaceC2174808fa List<C080U> list, @InterfaceC1501070pAH("user_identity_source") int i);

    /* JADX INFO: loaded from: classes4.dex */
    public static final class IdentityBody {

        @C09CT("user_identity_type_list")
        public final List<Integer> identityList;

        @C09CT("user_identity_account_type_list")
        public final List<String> identitySourceList;

        @C09CT("user_identity_raw_value_list")
        public final List<String> identityValue;

        public IdentityBody(List<String> list, List<Integer> list2, List<String> list3) {
            this.identityValue = list;
            this.identityList = list2;
            this.identitySourceList = list3;
        }
    }
}
