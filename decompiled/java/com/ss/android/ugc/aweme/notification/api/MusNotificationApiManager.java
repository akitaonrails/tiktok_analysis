package com.ss.android.ugc.aweme.notification.api;

import X.AbstractC19484711Kz;
import X.AbstractC19486711Lt;
import X.AbstractC2126608Uu;
import X.C08JS;
import X.C09S2;
import X.C11NZ;
import X.C11S5;
import X.C1598790rht;
import X.C15O7;
import X.C1902600zbu;
import X.C2188811AlT;
import X.C2222691Bz1;
import X.C482790IwX;
import X.C593760NQo;
import X.C844470XAv;
import X.InterfaceC1485505rh;
import X.InterfaceC1485705rj;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501240pAY;
import X.InterfaceC19474811He;
import X.InterfaceC20673515v3;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MultiNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineDatas;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes29.dex */
public final class MusNotificationApiManager {
    public static final NoticeApi LIZ;
    public static final NoticeWebcastApi LIZIZ;

    public interface NoticeApi {
        @InterfaceC1501200pAU("/aweme/v1/notice/multi/")
        ListenableFuture<NoticeListsResponse> LIZ(@InterfaceC1501120pAM("group_list") String str, @InterfaceC1501120pAM("scenario") int i);

        @InterfaceC1501240pAY("/tiktok/notice/report_start/v1")
        @InterfaceC1485505rh
        C11NZ<BaseResponse> LIZIZ(@InterfaceC1501100pAK("trigger_notice_info") String str);

        @InterfaceC1501240pAY("/tiktok/v1/sharer/link/notice/ignore/")
        AbstractC19486711Lt LIZJ(@InterfaceC1501120pAM("link_id") String str);

        @InterfaceC1501200pAU("/tiktok/user/relation/recommended_notice/update/v1")
        C11NZ<BaseResponse> LIZLLL();

        @InterfaceC1501200pAU
        ListenableFuture<NoticeCombineResponse> fetchCombineNotice(@InterfaceC1485705rj String str, @InterfaceC1501120pAM("live_entrance") int i, @InterfaceC1501120pAM("req_from") String str2, @InterfaceC1501120pAM("is_draw") long j, @InterfaceC1501120pAM("content_type") int i2, @InterfaceC1501120pAM("channel_id") int i3, @InterfaceC1501120pAM("count") int i4, @InterfaceC1501130pAN Map<String, String> map, @InterfaceC1501120pAM("scenario") int i5, @InterfaceC1501120pAM("has_shown_following_popup") boolean z, @InterfaceC1501120pAM("clean_count_type") int i6, @InterfaceC1501120pAM("Ecommercemsgexpversion") int i7, @InterfaceC1501120pAM("disable_live") String str3);
    }

    /* JADX INFO: loaded from: classes5.dex */
    public interface NoticeWebcastApi {
        @InterfaceC1501200pAU("/webcast/tab/")
        C15O7<Object> fetchRecommendAvatars(@InterfaceC1501120pAM("live_entrance") int i, @InterfaceC1501130pAN Map<String, String> map);
    }

    static {
        String str = C593760NQo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("/");
        LIZ = (NoticeApi) C09S2.LIZJ(NoticeApi.class, C2188811AlT.LIZIZ(sbLIZ));
        LIZIZ = (NoticeWebcastApi) C09S2.LIZJ(NoticeWebcastApi.class, C2222691Bz1.LJIIIIZZ() ? "https://webcast.tiktokv.com" : "https://webcast-va.tiktokv.com");
    }

    public static void LJI() {
        boolean zLJI = MethodIDManager.LJI(137789);
        AbstractC19484711Kz.LJIJJ(LIZ.LIZLLL()).LJJIJIIJI(C11S5.LIZ()).LIZ(new InterfaceC19474811He<BaseResponse>() { // from class: X.0zbr
            @Override // X.InterfaceC19474811He
            public final void onError(Throwable th) {
            }

            @Override // X.InterfaceC19474811He
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
            }

            @Override // X.InterfaceC19474811He
            public final /* bridge */ /* synthetic */ void onSuccess(BaseResponse baseResponse) {
            }
        });
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static ListenableFuture LIZ(int i) {
        InterfaceC20673515v3 interfaceC20673515v3K4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4();
        C844470XAv.LIZ.getClass();
        Map<String, String> mapLLIFFJFJJ = interfaceC20673515v3K4.LLIFFJFJJ(C844470XAv.LIZ());
        if (Boolean.TRUE.equals(ComplianceServiceProvider.LJI().LJJIII().getValue())) {
            C1902600zbu.LIZ.getClass();
            if (C1902600zbu.LIZ()) {
                mapLLIFFJFJJ.put("is_non_personalized", "1");
            }
        }
        return LIZ.fetchCombineNotice("/aweme/janus/v1/notice/multi/", 5, "tiktok_message", 0L, 3, 81, 0, mapLLIFFJFJJ, i, false, 1, 2, "1");
    }

    public static AbstractC19486711Lt LJ(String str) {
        return LIZ.LIZJ(str);
    }

    public static void LJFF(String str) {
        boolean zLJI = MethodIDManager.LJI(202174);
        AbstractC19484711Kz.LJIJJ(LIZ.LIZIZ(str)).LJJIJIIJI(C11S5.LIZ()).LIZ(new InterfaceC19474811He<BaseResponse>() { // from class: X.0zbs
            @Override // X.InterfaceC19474811He
            public final void onError(Throwable th) {
            }

            @Override // X.InterfaceC19474811He
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
            }

            @Override // X.InterfaceC19474811He
            public final /* bridge */ /* synthetic */ void onSuccess(BaseResponse baseResponse) {
            }
        });
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static NoticeListsResponse LIZIZ(int i, List list) {
        try {
            return LIZ.LIZ(C08JS.LIZLLL(list), i).get();
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }

    public static NoticeListsResponse LIZJ(int i, List list) {
        try {
            return LIZ.LIZ(C08JS.LIZLLL(list), i).get();
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static NoticeListsResponse LIZLLL(List<MultiNotice> list, MutableLiveData<NoticeCombineDatas> mutableLiveData, int i) throws InterruptedException {
        try {
            ListenableFuture<NoticeListsResponse> listenableFutureLIZ = LIZ.LIZ(C08JS.LIZLLL(list), i);
            ArrayList arrayList = new ArrayList();
            try {
                NoticeCombineResponse noticeCombineResponse = (NoticeCombineResponse) LIZ(i).get();
                if (noticeCombineResponse != null) {
                    if (noticeCombineResponse.getData() != null) {
                        noticeCombineResponse.getData().setLiveNotices(null);
                    }
                    if (noticeCombineResponse.getData() != null) {
                        C1598790rht.LIZIZ(noticeCombineResponse.getData());
                    }
                    if (noticeCombineResponse.getData() != null) {
                        noticeCombineResponse.getData().setShopNotice(null);
                    }
                    mutableLiveData.postValue(noticeCombineResponse.getData());
                    if (noticeCombineResponse.getData() != null) {
                        if (noticeCombineResponse.getData().shopNotice != null) {
                            arrayList.addAll(noticeCombineResponse.getData().shopNotice);
                        }
                        if (noticeCombineResponse.getData().reportNotice != null) {
                            arrayList.addAll(noticeCombineResponse.getData().reportNotice);
                        }
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            NoticeListsResponse noticeListsResponse = listenableFutureLIZ.get();
            if (!C482790IwX.LIZ(arrayList) && noticeListsResponse != null) {
                noticeListsResponse.setCollapseNotices(arrayList);
            }
            return noticeListsResponse;
        } catch (ExecutionException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw AbstractC2126608Uu.getCompatibleException(e2);
        }
    }
}
