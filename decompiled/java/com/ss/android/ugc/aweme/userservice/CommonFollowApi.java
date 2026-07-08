package com.ss.android.ugc.aweme.userservice;

import X.C0PEM;
import X.C11NZ;
import X.C1637606b8;
import X.C19212010Ec;
import X.C2296808zG;
import X.C23250099c;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes10.dex */
public final class CommonFollowApi {
    public static final CommonFollowApi LIZ = new CommonFollowApi();
    public static final FollowService LIZIZ = (FollowService) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(((IMainService) ServiceManager.get().getService(IMainService.class)).getApiUrlPrefix()).create(FollowService.class);

    public interface FollowService {
        @InterfaceC1501160pAQ("/aweme/v3/f2f/follow/")
        ListenableFuture<FollowStatus> face2FaceFollow(@InterfaceC1501070pAH("user_id") String str, @InterfaceC1501070pAH("sec_user_id") String str2);

        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/aweme/v1/commit/follow/user/")
        ListenableFuture<FollowStatus> followWithRetrofitPost(@InterfaceC1501150pAP Map<String, String> map);

        @InterfaceC1501160pAQ("/aweme/v1/remove/follower/")
        C11NZ<BaseResponse> remove(@InterfaceC1501070pAH("user_id") String str, @InterfaceC1501070pAH("sec_user_id") String str2);
    }

    public static FollowStatus LIZ(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4, String str5, Map map) throws ExecutionException, InterruptedException {
        HashMap map2 = new HashMap();
        if (TextUtils.isEmpty(str2)) {
            map2.put("user_id", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            map2.put("sec_user_id", str2);
        }
        map2.put("type", String.valueOf(i));
        map2.put("channel_id", String.valueOf(i3));
        map2.put("city", str4);
        if (i2 != -1) {
            map2.put("from", String.valueOf(i2));
            if (i == 1) {
                map2.put("from_pre", C19212010Ec.LIZJ.LJIJJLI(String.valueOf(i2), String.valueOf(i4)));
            } else {
                map2.put("from_pre", String.valueOf(i4));
            }
        }
        if (!TextUtils.isEmpty(str3)) {
            map2.put("item_id", str3);
        }
        if (!TextUtils.isEmpty(str5)) {
            map2.put("rec_type", str5);
        }
        if (map != null) {
            map2.putAll(map);
        }
        FollowStatus followStatus = LIZIZ.followWithRetrofitPost(map2).get();
        followStatus.setSecUserId(str2);
        followStatus.setUserId(str);
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1637606b8(followStatus, null), 3);
        return followStatus;
    }
}
