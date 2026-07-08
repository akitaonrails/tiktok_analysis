package com.ss.android.ugc.aweme.internalshare.impl.data.api;

import X.C1473705pn;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.im.common.model.InternalShareSortedListResponse;
import com.ss.android.ugc.aweme.internalshare.api.model.InternalShareExpHitResponse;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface InternalShareApi {
    public static final C1473705pn LIZ = C1473705pn.LIZ;

    @InterfaceC1501160pAQ("internal_share/exp_hit_check")
    Object checkExpHit(@InterfaceC1501070pAH("exp_list") String str, @InterfaceC1501070pAH("uid_list") String str2, InterfaceC1364105Vn<? super InternalShareExpHitResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("internal_share/sorted_list_v2")
    Object getInternalShareSortedList(@InterfaceC1501050pAF("last_recent_share_list") String str, @InterfaceC1501050pAF("recent_chat_list") String str2, @InterfaceC1501050pAF("count") Integer num, @InterfaceC1501050pAF("source_action") Integer num2, @InterfaceC1501050pAF("need_extra_info_keys") List<String> list, @InterfaceC1501050pAF("extra_params") String str3, @InterfaceC1501050pAF("client_last_share_list") String str4, @InterfaceC1501050pAF(Scene.SCENE_SERVICE) String str5, InterfaceC1364105Vn<? super InternalShareSortedListResponse> interfaceC1364105Vn);
}
