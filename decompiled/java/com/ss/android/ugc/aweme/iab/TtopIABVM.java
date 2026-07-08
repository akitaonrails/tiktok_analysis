package com.ss.android.ugc.aweme.iab;

import X.C08S3;
import X.C0PEM;
import X.C13LP;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C23250099c;
import X.C2442409he;
import X.C2442509hf;
import X.C2442609hg;
import X.C350601Xs;
import X.InterfaceC0148002o;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.iab.config.SkipReview;
import com.ss.android.ugc.aweme.iab.config.SkipReviewRule;
import com.ss.android.ugc.aweme.iab.config.TtopIABHyperLinkConfig;
import java.net.URI;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes4.dex */
public final class TtopIABVM extends AssemViewModel<C2442609hg> {
    public final TtopIABRouterParams LL;
    public Long LLILLJJLI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2442609hg(0);
    }

    public final void vQ2() {
        List<SkipReviewRule> list;
        String path;
        String strLJLJJLL;
        List listLJJLIIIJILLIZJL;
        Object objLJJJLL;
        this.LLILLJJLI = Long.valueOf(System.currentTimeMillis());
        TtopIABRouterParams ttopIABRouterParams = this.LL;
        String str = ttopIABRouterParams.url;
        int i = ttopIABRouterParams.businessScene;
        boolean z = ttopIABRouterParams.hyperlinkEnabled;
        C2442409he.LIZ.getClass();
        C2442409he.LIZ(i, str, z);
        TtopIABRouterParams ttopIABRouterParams2 = this.LL;
        String str2 = ttopIABRouterParams2.url;
        int i2 = ttopIABRouterParams2.scene;
        int i3 = ttopIABRouterParams2.businessScene;
        boolean z2 = ttopIABRouterParams2.hyperlinkEnabled;
        C2442409he.LIZ(i3, str2, z2);
        if (!z2) {
            setState(AFwS231S0000000_3.get$arr$(38));
            return;
        }
        SkipReview skipReview = ((TtopIABHyperLinkConfig) C2442509hf.LIZIZ.getValue()).skipReview;
        if (skipReview != null && (list = skipReview.rules) != null && !list.isEmpty()) {
            for (SkipReviewRule skipReviewRule : list) {
                List<String> list2 = skipReviewRule.domain;
                List<String> list3 = skipReviewRule.firstPath;
                try {
                    URI uri = new URI(str2);
                    String host = uri.getHost();
                    if (host == null) {
                        continue;
                    } else {
                        if (list2 != null) {
                            if (list2.isEmpty()) {
                                continue;
                            } else {
                                for (String str3 : list2) {
                                    if (!Intrinsics.LJFF(host, str3)) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append('.');
                                        sbLIZ.append(str3);
                                        if (u.LJIIZILJ(host, C2188811AlT.LIZIZ(sbLIZ), false)) {
                                        }
                                    }
                                }
                            }
                        }
                        if (list3 == null || list3.isEmpty() || ((path = uri.getPath()) != null && (strLJLJJLL = a0.LJLJJLL(path, '/')) != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLJLJJLL, new String[]{"/"}, 0, 6)) != null && (objLJJJLL = C13LP.LJJJLL(listLJJLIIIJILLIZJL)) != null && list3.contains(objLJJJLL))) {
                            setState(AFwS231S0000000_3.get$arr$(39));
                            return;
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C350601Xs(str2, i2, this, null), 2);
    }

    public TtopIABVM(TtopIABRouterParams ttopIABRouterParams) {
        this.LL = ttopIABRouterParams;
    }

    public final void wQ2(String str) {
        String str2;
        Long l = this.LLILLJJLI;
        if (l == null) {
            return;
        }
        TtopIABRouterParams ttopIABRouterParams = this.LL;
        String str3 = ttopIABRouterParams.url;
        int i = ttopIABRouterParams.businessScene;
        boolean z = ttopIABRouterParams.hyperlinkEnabled;
        C2442409he c2442409he = C2442409he.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
        int type = getState().LL.getType();
        c2442409he.getClass();
        C08S3 c08s3 = C08S3.LIZ;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("scenario", String.valueOf(i));
        pairArr[1] = new Pair("url", str3);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[2] = new Pair("is_hyperlink", str2);
        pairArr[3] = new Pair("load_status", str);
        pairArr[4] = new Pair("load_duration", String.valueOf(jCurrentTimeMillis));
        pairArr[5] = new Pair("page_type", String.valueOf(type));
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        c08s3.getClass();
        C08S3.LIZJ("IAB_load", mapLJIIIIZZ);
        this.LLILLJJLI = null;
    }
}
