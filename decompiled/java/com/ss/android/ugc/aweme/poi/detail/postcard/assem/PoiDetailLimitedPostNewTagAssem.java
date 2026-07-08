package com.ss.android.ugc.aweme.poi.detail.postcard.assem;

import X.C01GW;
import X.C1186740gzI;
import X.C1188050h1P;
import X.C1189860h4K;
import X.C13BV;
import X.C13LP;
import X.C1559260qg8;
import X.C339190DRl;
import X.C452501pT;
import X.C723580SZw;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.post.PoiPostPageShareVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.AwS667S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailLimitedPostNewTagAssem extends UIContentAssem {
    public C1189860h4K LLJ;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C1186740gzI.class, "PoiLimitedPostHierarchyData"), checkSupervisorPrepared());
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1190));

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        PoiListApi.PoiMergedListResponse poiMergedListResponse;
        PoiListApi.PoiDetailResponse poiDetailResponse;
        List<PoiListApi.PostTag> postTagList;
        List<PoiListApi.PostTag> postTagList2;
        C1189860h4K c1189860h4K;
        super.onViewCreated(view);
        C1189860h4K c1189860h4K2 = (C1189860h4K) view.findViewById(R.id.r42);
        this.LLJ = c1189860h4K2;
        if (c1189860h4K2 != null) {
            c1189860h4K2.setOnTagClick(new AwS667S0100000_18(this, 16));
        }
        C1186740gzI c1186740gzI = (C1186740gzI) this.LLIZLLLIL.getValue();
        if (c1186740gzI != null) {
            poiMergedListResponse = c1186740gzI.LL;
        } else {
            poiMergedListResponse = null;
        }
        C1186740gzI c1186740gzI2 = (C1186740gzI) this.LLIZLLLIL.getValue();
        if (c1186740gzI2 != null && (poiDetailResponse = c1186740gzI2.LLILLJJLI) != null && poiDetailResponse.isNonRegionalPOI() && poiMergedListResponse != null && (postTagList = poiMergedListResponse.getPostTagList()) != null && !postTagList.isEmpty()) {
            if (poiMergedListResponse == null || (postTagList2 = poiMergedListResponse.getPostTagList()) == null) {
                postTagList2 = C13BV.INSTANCE;
            }
            List<PoiListApi.PostTag> listLIZ = C1188050h1P.LIZ(postTagList2);
            ArrayList arrayList = (ArrayList) listLIZ;
            if (arrayList.size() < 3) {
                PoiPostPageShareVM poiPostPageShareVM = (PoiPostPageShareVM) this.LLJI.getValue();
                if (poiPostPageShareVM != null) {
                    poiPostPageShareVM.IQ2(null);
                }
                C1189860h4K c1189860h4K3 = this.LLJ;
                if (c1189860h4K3 != null) {
                    C339190DRl.LIZIZ(c1189860h4K3);
                    return;
                }
                return;
            }
            C1189860h4K c1189860h4K4 = this.LLJ;
            if (c1189860h4K4 != null) {
                C339190DRl.LIZLLL(c1189860h4K4);
            }
            int iLIZIZ = C1188050h1P.LIZIZ(listLIZ);
            PoiPostPageShareVM poiPostPageShareVM2 = (PoiPostPageShareVM) this.LLJI.getValue();
            if (poiPostPageShareVM2 != null) {
                poiPostPageShareVM2.IQ2((PoiListApi.PostTag) C13LP.LJJJLZIJ(iLIZIZ, listLIZ));
            }
            C1189860h4K c1189860h4K5 = this.LLJ;
            if (c1189860h4K5 != null) {
                c1189860h4K5.LIZJ(listLIZ, iLIZIZ, new AwS632S0100000_18(this, 221), false);
            }
            if (iLIZIZ < 0 || iLIZIZ >= arrayList.size() || (c1189860h4K = this.LLJ) == null) {
                return;
            }
            c1189860h4K.LIZIZ(iLIZIZ);
            return;
        }
        C1189860h4K c1189860h4K6 = this.LLJ;
        if (c1189860h4K6 == null) {
            return;
        }
        C339190DRl.LIZIZ(c1189860h4K6);
    }
}
