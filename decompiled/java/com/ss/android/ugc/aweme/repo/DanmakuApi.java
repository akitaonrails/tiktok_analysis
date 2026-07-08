package com.ss.android.ugc.aweme.repo;

import X.AbstractC19484711Kz;
import X.C0CQT;
import X.C11NZ;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes22.dex */
public final class DanmakuApi {
    public static final DanmakuApi LIZ = new DanmakuApi();
    public static final RetrofitApi LIZIZ = (RetrofitApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(RetrofitApi.class);

    public interface RetrofitApi {
        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/tiktok/danmaku/create/v1")
        C11NZ<CreateDanmakuResponse> createDanmaku(@InterfaceC1501050pAF("item_id") String str, @InterfaceC1501050pAF("offset_time") long j, @InterfaceC1501050pAF("text") String str2, @InterfaceC1501050pAF("skip_rethink") boolean z);

        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/tiktok/danmaku/delete/v1")
        C11NZ<DanmakuDeleteResponse> deleteDanmaku(@InterfaceC1501050pAF("danmaku_id") String str, @InterfaceC1501050pAF("delete_danmaku_user_type") int i);

        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/tiktok/danmaku/digg/v1")
        C11NZ<DanmakuDiggResponse> diggDanmaku(@InterfaceC1501050pAF("item_id") String str, @InterfaceC1501050pAF("danmaku_id") String str2, @InterfaceC1501050pAF("action") int i);

        @InterfaceC1501160pAQ("/tiktok/danmaku/get_by_id/v1")
        AbstractC19484711Kz<DanmakuResponse> getDanmaku(@InterfaceC1501070pAH("item_id") String str, @InterfaceC1501070pAH("danmaku_id") String str2);

        @InterfaceC1501160pAQ("/tiktok/danmaku/get/v1")
        C11NZ<DanmakuListResponse> getDanmaku(@InterfaceC1501070pAH("item_id") String str, @InterfaceC1501070pAH("start_time") long j);

        @InterfaceC1501160pAQ("/tiktok/danmaku/list/v1")
        C11NZ<DanmakuItemListResponse> getDanmakuList(@InterfaceC1501070pAH("item_id") String str, @InterfaceC1501070pAH("offset") long j, @InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("need_total_count") boolean z);
    }
}
