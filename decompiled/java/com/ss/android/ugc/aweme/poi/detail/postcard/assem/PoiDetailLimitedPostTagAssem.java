package com.ss.android.ugc.aweme.poi.detail.postcard.assem;

import X.C1186740gzI;
import X.C1203130hPj;
import X.C1203140hPk;
import X.C1559260qg8;
import X.C2211631BhB;
import X.C339190DRl;
import X.C723580SZw;
import X.InterfaceC1203170hPn;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.post.PoiPostPageFragment;
import com.ss.android.ugc.aweme.poi.detail.postcard.assem.PoiDetailLimitedPostTagAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailLimitedPostTagAssem extends UIContentAssem {
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C1186740gzI.class, "PoiLimitedPostHierarchyData"), checkSupervisorPrepared());
    public final Map<Integer, PoiListApi.PostTag> LLJ = new LinkedHashMap();
    public C1203130hPj LLJI;

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        PoiListApi.PoiDetailResponse poiDetailResponse;
        C1186740gzI c1186740gzI;
        PoiListApi.PoiMergedListResponse poiMergedListResponse;
        List<PoiListApi.PostTag> postTagList;
        PoiListApi.PoiMergedListResponse poiMergedListResponse2;
        List<PoiListApi.PostTag> postTagList2;
        super.onViewCreated(view);
        C1203130hPj c1203130hPj = (C1203130hPj) view.findViewById(R.id.r3s);
        this.LLJI = c1203130hPj;
        if (c1203130hPj != null) {
            c1203130hPj.setHorizontalMargin(16);
        }
        C1186740gzI c1186740gzI2 = (C1186740gzI) this.LLIZLLLIL.getValue();
        if (c1186740gzI2 != null && (poiDetailResponse = c1186740gzI2.LLILLJJLI) != null && poiDetailResponse.isNonRegionalPOI() && 1 != 0 && (c1186740gzI = (C1186740gzI) this.LLIZLLLIL.getValue()) != null && (poiMergedListResponse = c1186740gzI.LL) != null && (postTagList = poiMergedListResponse.getPostTagList()) != null && !postTagList.isEmpty()) {
            ((LinkedHashMap) this.LLJ).clear();
            ArrayList arrayList = new ArrayList();
            C1186740gzI c1186740gzI3 = (C1186740gzI) this.LLIZLLLIL.getValue();
            if (c1186740gzI3 != null && (poiMergedListResponse2 = c1186740gzI3.LL) != null && (postTagList2 = poiMergedListResponse2.getPostTagList()) != null) {
                int i = 0;
                for (PoiListApi.PostTag postTag : postTagList2) {
                    String str = postTag.tagName;
                    if (str != null && str.length() != 0) {
                        arrayList.add(new C1203140hPk(postTag.tagName, null, 14));
                        this.LLJ.put(Integer.valueOf(i), postTag);
                        i++;
                    }
                }
            }
            C1203130hPj c1203130hPj2 = this.LLJI;
            if (c1203130hPj2 != null) {
                C2211631BhB.LJ(c1203130hPj2, new AwS597S0100000_18(this, 706));
            }
            C1203130hPj c1203130hPj3 = this.LLJI;
            if (c1203130hPj3 != null) {
                c1203130hPj3.setChips(arrayList);
            }
        } else {
            C339190DRl.LIZIZ(this.LLJI);
        }
        C1203130hPj c1203130hPj4 = this.LLJI;
        if (c1203130hPj4 != null) {
            c1203130hPj4.setOnSelectedChangeListener(new InterfaceC1203170hPn() { // from class: X.0h1G
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC1203170hPn
                public final void LIZ(int i2, boolean z, AbstractC1203190hPp abstractC1203190hPp) {
                    C1173300gdc c1173300gdcQr0;
                    C1185450gxD c1185450gxD;
                    C1185600gxS c1185600gxS;
                    String sessionId;
                    String strS2;
                    InterfaceC665370Q7z interfaceC665370Q7zLJFF;
                    PageFinder pageFinderVia;
                    C1185600gxS c1185600gxS2;
                    C1185450gxD c1185450gxD2;
                    InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
                    InterfaceC1181010gq3 interfaceC1181010gq3LIZ;
                    C1203130hPj c1203130hPj5;
                    if (!z) {
                        return;
                    }
                    if (Intrinsics.LJFF(abstractC1203190hPp, C1203210hPr.LIZ) && (c1203130hPj5 = this.LIZ.LLJI) != null) {
                        c1203130hPj5.LIZ(i2, false, C1203200hPq.LIZ);
                    }
                    if (i2 >= this.LIZ.LLJ.size()) {
                        return;
                    }
                    PoiDetailLimitedPostTagAssem poiDetailLimitedPostTagAssem = this.LIZ;
                    poiDetailLimitedPostTagAssem.getClass();
                    PoiListApi.PoiDetailResponse poiDetailResponseLIZ = C1181890grT.LIZ(C724240Sb0.LJI(poiDetailLimitedPostTagAssem));
                    Fragment fragmentLJI = C724240Sb0.LJI(poiDetailLimitedPostTagAssem);
                    String str2 = null;
                    if (fragmentLJI != null && (interfaceC1181010gq3LIZ = C1174830gg5.LIZ(fragmentLJI)) != null) {
                        c1173300gdcQr0 = interfaceC1181010gq3LIZ.qr0();
                    } else {
                        c1173300gdcQr0 = null;
                    }
                    Fragment fragmentLJI2 = C724240Sb0.LJI(poiDetailLimitedPostTagAssem);
                    if (fragmentLJI2 != null && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(fragmentLJI2, null), "source_default_key", C1185450gxD.class, null)) != null) {
                        c1185450gxD = (C1185450gxD) interfaceC1555100qZQLIZIZ.getSource();
                    } else {
                        c1185450gxD = null;
                    }
                    String str3 = PoiPostPageFragment._pnsPageId;
                    Fragment fragmentLJI3 = C724240Sb0.LJI(poiDetailLimitedPostTagAssem);
                    Integer numValueOf = Integer.valueOf(i2);
                    if (c1173300gdcQr0 != null) {
                        c1185600gxS = (C1185600gxS) c1173300gdcQr0.LIZ;
                    } else {
                        c1185600gxS = null;
                    }
                    String strLIZ = C18JG.LIZ("c7535.d8692", PageFinder.via((View) poiDetailLimitedPostTagAssem.LLJI), null);
                    if (c1173300gdcQr0 != null && (c1185600gxS2 = (C1185600gxS) c1173300gdcQr0.LIZ) != null && (c1185450gxD2 = c1185600gxS2.LJIILIIL) != null) {
                        sessionId = c1185450gxD2.getSessionId();
                    } else {
                        sessionId = null;
                    }
                    InterfaceC1173990gej<?> interfaceC1173990gejLIZ = C1178990gmn.LIZ(poiDetailLimitedPostTagAssem);
                    if (interfaceC1173990gejLIZ != null) {
                        strS2 = interfaceC1173990gejLIZ.S2();
                    } else {
                        strS2 = null;
                    }
                    C1187500h0W.LIZ(fragmentLJI3, numValueOf, poiDetailResponseLIZ, c1185600gxS, c1185450gxD, strLIZ, sessionId, strS2);
                    C1187980h1I c1187980h1I = C1187980h1I.LIZ;
                    Fragment fragmentLJI4 = C724240Sb0.LJI(this.LIZ);
                    if (fragmentLJI4 != null) {
                        interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI4, null);
                    } else {
                        interfaceC665370Q7zLJFF = null;
                    }
                    Fragment fragmentLJI5 = C724240Sb0.LJI(this.LIZ);
                    if (fragmentLJI5 != null) {
                        pageFinderVia = PageFinder.via(fragmentLJI5);
                    } else {
                        pageFinderVia = null;
                    }
                    PoiListApi.PostTag postTag2 = (PoiListApi.PostTag) ((LinkedHashMap) this.LIZ.LLJ).get(Integer.valueOf(i2));
                    if (postTag2 != null) {
                        str2 = postTag2.tagCode;
                    }
                    c1187980h1I.getClass();
                    C1187980h1I.LIZ(interfaceC665370Q7zLJFF, pageFinderVia, str2, i2);
                }
            });
        }
    }
}
