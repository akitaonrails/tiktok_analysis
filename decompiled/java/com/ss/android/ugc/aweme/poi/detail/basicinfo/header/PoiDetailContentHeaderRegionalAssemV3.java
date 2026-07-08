package com.ss.android.ugc.aweme.poi.detail.basicinfo.header;

import X.C019F;
import X.C1184460gvc;
import X.C1184480gve;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723580SZw;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailContentHeaderRegionalAssemV3 extends PoiDetailContentHeaderBaseAssemV3 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final C1559260qg8 LLJJIII = new C1559260qg8(new C723580SZw(this, C1184460gvc.class, "PoiDetailContentHeaderHierarchyDataV3"), checkSupervisorPrepared());
    public final AssemVMLazy LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiDetailContentHeaderRegionalAssemV3.class, "poiDetailHeaderVm", "getPoiDetailHeaderVm()Lcom/ss/android/ugc/aweme/poi/detail/container/PoiDetailInfoViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiDetailContentHeaderRegionalAssemV3() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailInfoViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 999), AFwS256S0000000_18.get$arr$(349), null, true);
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailContentHeaderBaseAssemV3
    public final void ap(View view) {
        PoiListApi.PoiDetailResponse poiDetailResponse;
        String str;
        String str2;
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        C1184480gve c1184480gve3;
        C1184460gvc c1184460gvc = (C1184460gvc) this.LLJJIII.getValue();
        if (c1184460gvc != null && (poiDetailResponse = c1184460gvc.LLILLJJLI) != null) {
            AssemVMLazy assemVMLazy = this.LLJJIJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
            String str3 = ((PoiDetailInfoViewModel) assemVMLazy.getValue()).LL;
            cp(str3, poiDetailResponse);
            C1184460gvc c1184460gvc2 = (C1184460gvc) this.LLJJIII.getValue();
            C1184480gve c1184480gve4 = null;
            if (c1184460gvc2 != null && (c1184480gve3 = c1184460gvc2.LLILLL) != null) {
                str = c1184480gve3.LLILLJJLI;
            } else {
                str = null;
            }
            C1184460gvc c1184460gvc3 = (C1184460gvc) this.LLJJIII.getValue();
            if (c1184460gvc3 != null && (c1184480gve2 = c1184460gvc3.LLILLL) != null) {
                str2 = c1184480gve2.LL;
            } else {
                str2 = null;
            }
            dp(poiDetailResponse, str3, str, str2);
            C1184460gvc c1184460gvc4 = (C1184460gvc) this.LLJJIII.getValue();
            if (c1184460gvc4 != null) {
                c1184480gve = c1184460gvc4.LLILLL;
            } else {
                c1184480gve = null;
            }
            Oo(str3, poiDetailResponse, c1184480gve);
            Context context = view.getContext();
            C1184460gvc c1184460gvc5 = (C1184460gvc) this.LLJJIII.getValue();
            if (c1184460gvc5 != null) {
                c1184480gve4 = c1184460gvc5.LLILLL;
            }
            Vo(str3, poiDetailResponse, context, c1184480gve4);
        }
    }
}
