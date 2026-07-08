package com.ss.android.ugc.aweme.relation.usercard.spi;

import X.InterfaceC1186204kW;
import com.ss.android.ugc.aweme.IDetailPageShareVMService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.relation.usercard.vm.RecUserVideoListSharedVM;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class RelationUserCardDetailServiceImpl implements IDetailPageShareVMService {
    @Override // com.ss.android.ugc.aweme.IDetailPageShareVMService
    public final HashMap<String, InterfaceC1186204kW> LIZ() {
        HashMap<String, InterfaceC1186204kW> map = new HashMap<>();
        map.put("[UserCard]_DETAIL", new InterfaceC1186204kW() { // from class: X.04kb
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                return new Pair<>(C338480DOs.LIZ(c2189821An6.getUid()), RecUserVideoListSharedVM.class);
            }
        });
        return map;
    }
}
