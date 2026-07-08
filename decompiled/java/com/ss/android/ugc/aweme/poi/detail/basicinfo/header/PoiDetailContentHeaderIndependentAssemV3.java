package com.ss.android.ugc.aweme.poi.detail.basicinfo.header;

import X.C019F;
import X.C1184460gvc;
import X.C1184480gve;
import X.C1200940hMC;
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
public final class PoiDetailContentHeaderIndependentAssemV3 extends PoiDetailContentHeaderBaseAssemV3 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final C1559260qg8 LLJJIII = new C1559260qg8(new C723580SZw(this, C1184460gvc.class, "PoiDetailContentHeaderHierarchyDataV3"), checkSupervisorPrepared());
    public final AssemVMLazy LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiDetailContentHeaderIndependentAssemV3.class, "poiDetailHeaderVm", "getPoiDetailHeaderVm()Lcom/ss/android/ugc/aweme/poi/detail/container/PoiDetailInfoViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiDetailContentHeaderIndependentAssemV3() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailInfoViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 998), AFwS256S0000000_18.get$arr$(348), null, true);
    }

    private final C1184460gvc Jo() {
        return (C1184460gvc) this.LLJJIII.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailContentHeaderBaseAssemV3
    public final void ap(View view) {
        PoiListApi.PoiDetailResponse poiDetailResponse;
        String str;
        String str2;
        C1184480gve c1184480gve;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        C1184480gve c1184480gve2;
        C1184480gve c1184480gve3;
        C1184480gve c1184480gve4;
        C1184480gve c1184480gve5;
        C1184480gve c1184480gve6;
        C1184480gve c1184480gve7;
        C1184480gve c1184480gve8;
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        String str8 = ((PoiDetailInfoViewModel) assemVMLazy.getValue()).LL;
        C1184460gvc c1184460gvcJo = Jo();
        if (c1184460gvcJo != null && (poiDetailResponse = c1184460gvcJo.LLILLJJLI) != null) {
            cp(str8, poiDetailResponse);
            C1184460gvc c1184460gvcJo2 = Jo();
            C1184480gve c1184480gve9 = null;
            if (c1184460gvcJo2 != null && (c1184480gve8 = c1184460gvcJo2.LLILLL) != null) {
                str = c1184480gve8.LLILLJJLI;
            } else {
                str = null;
            }
            C1184460gvc c1184460gvcJo3 = Jo();
            if (c1184460gvcJo3 != null && (c1184480gve7 = c1184460gvcJo3.LLILLL) != null) {
                str2 = c1184480gve7.LL;
            } else {
                str2 = null;
            }
            dp(poiDetailResponse, str8, str, str2);
            Zo(poiDetailResponse);
            if (str8 != null) {
                C1200940hMC c1200940hMC = C1200940hMC.LIZ;
                Context context = view.getContext();
                c1200940hMC.getClass();
                boolean zLIZIZ = C1200940hMC.LIZIZ(context);
                C1184460gvc c1184460gvcJo4 = Jo();
                if (c1184460gvcJo4 != null && (c1184480gve6 = c1184460gvcJo4.LLILLL) != null) {
                    str3 = c1184480gve6.LLIZLLLIL;
                } else {
                    str3 = null;
                }
                C1184460gvc c1184460gvcJo5 = Jo();
                if (c1184460gvcJo5 != null && (c1184480gve5 = c1184460gvcJo5.LLILLL) != null) {
                    str4 = c1184480gve5.LLJ;
                } else {
                    str4 = null;
                }
                C1184460gvc c1184460gvcJo6 = Jo();
                if (c1184460gvcJo6 != null && (c1184480gve4 = c1184460gvcJo6.LLILLL) != null) {
                    str5 = c1184480gve4.LLJI;
                } else {
                    str5 = null;
                }
                C1184460gvc c1184460gvcJo7 = Jo();
                if (c1184460gvcJo7 != null && (c1184480gve3 = c1184460gvcJo7.LLILLL) != null) {
                    str6 = c1184480gve3.LLILLJJLI;
                } else {
                    str6 = null;
                }
                C1184460gvc c1184460gvcJo8 = Jo();
                if (c1184460gvcJo8 != null && (c1184480gve2 = c1184460gvcJo8.LLILLL) != null) {
                    str7 = c1184480gve2.LL;
                } else {
                    str7 = null;
                }
                ep(str8, zLIZIZ, poiDetailResponse, str3, str4, str5, str6, str7, poiDetailResponse.getCollectInfo());
            }
            C1184460gvc c1184460gvcJo9 = Jo();
            if (c1184460gvcJo9 != null) {
                c1184480gve = c1184460gvcJo9.LLILLL;
            } else {
                c1184480gve = null;
            }
            Oo(str8, poiDetailResponse, c1184480gve);
            Context context2 = view.getContext();
            C1184460gvc c1184460gvcJo10 = Jo();
            if (c1184460gvcJo10 != null) {
                c1184480gve9 = c1184460gvcJo10.LLILLL;
            }
            Vo(str8, poiDetailResponse, context2, c1184480gve9);
            So(str8, poiDetailResponse);
            bp();
        }
    }
}
