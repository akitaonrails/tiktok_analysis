package com.ss.android.ugc.aweme.relation.api;

import X.AbstractC19484711Kz;
import X.C2208408l0;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501300pAe;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.relation.model.MaFListResponse;
import com.ss.android.ugc.aweme.relation.model.MaFUserVideoListResponse;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class MafUserApiService implements IMafUserApi {
    public static final MafUserApiService LIZIZ = new MafUserApiService();
    public final /* synthetic */ IMafUserApi LIZ = (IMafUserApi) C2208408l0.LIZIZ.create(IMafUserApi.class);

    @Override // com.ss.android.ugc.aweme.relation.api.IMafUserApi
    @InterfaceC1501200pAU("tiktok/user/relation/maf/items/v1")
    public final AbstractC19484711Kz<MaFUserVideoListResponse> LIZ(@InterfaceC1501120pAM(Scene.SCENE_SERVICE) int i, @InterfaceC1501120pAM("sec_target_user_id") String str, @InterfaceC1501120pAM("count") int i2, @InterfaceC1501120pAM("page_token") String str2) {
        return this.LIZ.LIZ(i, str, i2, str2);
    }

    @Override // com.ss.android.ugc.aweme.relation.api.IMafUserApi
    @InterfaceC1501200pAU("/tiktok/user/relation/maf/list/v1")
    public final AbstractC19484711Kz<MaFListResponse> LIZIZ(@InterfaceC1501120pAM(Scene.SCENE_SERVICE) int i, @InterfaceC1501120pAM("count") int i2, @InterfaceC1501120pAM("page_token") String str, @InterfaceC1501120pAM("rec_impr_users") String str2, @InterfaceC1501120pAM("platforms") String str3, @InterfaceC1501120pAM("sec_target_user_id") String str4, @InterfaceC1501120pAM("maf_type") Integer num, @InterfaceC1501120pAM("sec_target_user_ids") String str5, @InterfaceC1501120pAM("new_maf_count") int i3, @InterfaceC1501120pAM("is_non_personalized") boolean z, @InterfaceC1501120pAM("place_user_info") String str6, @InterfaceC1501120pAM("device_score") Float f) {
        return this.LIZ.LIZIZ(i, i2, str, str2, str3, str4, num, str5, i3, z, str6, f);
    }

    @Override // com.ss.android.ugc.aweme.relation.api.IMafUserApi
    @InterfaceC1501200pAU("/tiktok/user/relation/maf/list/v1")
    public final Object LIZJ(@InterfaceC1501120pAM(Scene.SCENE_SERVICE) int i, @InterfaceC1501120pAM("count") int i2, @InterfaceC1501120pAM("maf_type") Integer num, @InterfaceC1501120pAM("target_user_ids") String str, InterfaceC1364105Vn<? super MaFListResponse> interfaceC1364105Vn) {
        return this.LIZ.LIZJ(i, i2, num, str, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.relation.api.IMafUserApi
    @InterfaceC1501200pAU("/aweme/v1/recommend/user/dislike/")
    public final Object LIZLLL(@InterfaceC1501120pAM("user_id") String str, @InterfaceC1501120pAM("sec_user_id") String str2, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) Integer num, @InterfaceC1501120pAM("action_type") Integer num2, @InterfaceC1501120pAM("maf_scene") Integer num3, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn) {
        boolean zLJI = MethodIDManager.LJI(196668);
        Object objLIZLLL = this.LIZ.LIZLLL(str, str2, num, num2, num3, interfaceC1364105Vn);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return objLIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.relation.api.IMafUserApi
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/user/relation/maf/rec_more/impression/v1")
    public Object recordRecMoreExposure(@InterfaceC1501050pAF("exposed_uids") List<String> list, @InterfaceC1501050pAF("trigger_uid") String str, @InterfaceC1501050pAF(Scene.SCENE_SERVICE) int i, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn) {
        return this.LIZ.recordRecMoreExposure(list, str, i, interfaceC1364105Vn);
    }
}
