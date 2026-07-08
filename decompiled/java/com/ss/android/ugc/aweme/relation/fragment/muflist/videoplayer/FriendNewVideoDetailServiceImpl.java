package com.ss.android.ugc.aweme.relation.fragment.muflist.videoplayer;

import X.InterfaceC1186204kW;
import com.ss.android.ugc.aweme.IDetailPageShareVMService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.relation.fragment.muflist.videoplayer.FriendNewVideoSharedVM;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class FriendNewVideoDetailServiceImpl implements IDetailPageShareVMService {
    @Override // com.ss.android.ugc.aweme.IDetailPageShareVMService
    public final HashMap<String, InterfaceC1186204kW> LIZ() {
        HashMap<String, InterfaceC1186204kW> map = new HashMap<>();
        map.put("FRIEND_NEW_POST_DETAIL", new InterfaceC1186204kW() { // from class: X.04kZ
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                String uid = c2189821An6.getUid();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(uid);
                sbLIZ.append("_FriendNewVideoSharedVM");
                return new Pair<>(C2188811AlT.LIZIZ(sbLIZ), FriendNewVideoSharedVM.class);
            }
        });
        return map;
    }
}
