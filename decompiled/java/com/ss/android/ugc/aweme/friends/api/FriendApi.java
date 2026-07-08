package com.ss.android.ugc.aweme.friends.api;

import X.C11NZ;
import X.C1239330iM7;
import X.C15O7;
import X.InterfaceC1485505rh;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501240pAY;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.friends.model.ShortenUrlModel;
import com.ss.android.ugc.aweme.relation.ContactResponse;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public interface FriendApi {
    public static final C1239330iM7 LIZ = C1239330iM7.LIZ;

    @InterfaceC1501240pAY("/tiktok/user/relation/social/settings/update/v1")
    @InterfaceC1485505rh
    C11NZ<BaseResponse> LIZ(@InterfaceC1501100pAK("social_platform") int i, @InterfaceC1501100pAK("sync_status") Boolean bool, @InterfaceC1501100pAK("is_manual") Boolean bool2, @InterfaceC1501100pAK("email_ads_disclosure") boolean z, @InterfaceC1501100pAK("contact_book_ads_disclosure") boolean z2);

    @InterfaceC1501240pAY("/ug/social/invite/msg/short_url/")
    @InterfaceC1485505rh
    C11NZ<ShortenUrlModel> LIZIZ(@InterfaceC1501100pAK("url") String str);

    @InterfaceC1501200pAU("/tiktok/user/relation/recommended_notice/update/v1")
    C11NZ<BaseResponse> LIZJ(@InterfaceC1501120pAM(Scene.SCENE_SERVICE) int i);

    @InterfaceC1501240pAY("/tiktok/user/relation/social/settings/update/v1")
    @InterfaceC1485505rh
    C15O7<BaseResponse> LIZLLL(@InterfaceC1501100pAK("social_platform") int i, @InterfaceC1501100pAK("sync_status") Boolean bool, @InterfaceC1501100pAK("is_manual") Boolean bool2);

    @InterfaceC1501240pAY("/aweme/v1/upload/hashcontacts/")
    @InterfaceC1485505rh
    C11NZ<ContactResponse> uploadHashContacts(@InterfaceC1501120pAM("need_unregistered_user") String str, @InterfaceC1501150pAP Map<String, String> map, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) Integer num, @InterfaceC1501120pAM("sync_only") Boolean bool);
}
