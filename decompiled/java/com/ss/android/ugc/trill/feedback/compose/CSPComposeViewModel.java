package com.ss.android.ugc.trill.feedback.compose;

import X.C01GW;
import X.C041J;
import X.C1541950qED;
import X.C1688520u2c;
import X.C1688660u2q;
import X.C1689060u3U;
import X.C1689100u3Y;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C23250099c;
import X.C2503609rW;
import X.C592610NMd;
import X.C592630NMf;
import X.C592640NMg;
import X.C592650NMh;
import X.C610340Nwm;
import X.EnumC1678550tmX;
import X.InterfaceC0148002o;
import X.InterfaceC497601wk;
import android.content.Context;
import android.net.Uri;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.RapButtonConfig;
import com.ss.android.ugc.trill.feedback.api.CSPPageApi;
import com.ss.android.ugc.trill.feedback.api.FaqBottomButtonData;
import com.ss.android.ugc.trill.feedback.api.FaqBottomButtonResponse;
import com.ss.android.ugc.trill.feedback.api.FaqResponse;
import com.ss.android.ugc.trill.feedback.api.FaqSubCategoryItem;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes26.dex */
public final class CSPComposeViewModel extends AssemViewModel<C1688520u2c> {
    public final Map<String, String> LL = new LinkedHashMap();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        RapButtonConfig rapButtonConfig = C1689060u3U.LIZIZ.rapButtonDefaultConfig;
        C1688520u2c c1688520u2c = new C1688520u2c(new C1688660u2q(0), new ArrayList(), new FaqBottomButtonResponse(new FaqBottomButtonData(rapButtonConfig.jumpUrl, rapButtonConfig.btnTextStarlingKey, rapButtonConfig.position, rapButtonConfig.iconAndroid, 1), 200, ""), 0, 0, false, false);
        c1688520u2c.LLILLJJLI = new ArrayList();
        return c1688520u2c;
    }

    public final void vQ2(String str, String str2) {
        this.LL.put(str, str2);
    }

    public final void wQ2(FaqSubCategoryItem faqSubCategoryItem, Context context) {
        boolean z;
        Integer num;
        String path;
        String str = faqSubCategoryItem.url;
        if (C041J.LIZ(str)) {
            Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("hide_nav_bar", "1"), new Pair("container_color_auto_dark", "1"), new Pair("awe_falcon", "sh"));
            try {
                Uri uri = UriProtector.parse(str);
                String path2 = uri.getPath();
                if ((path2 == null || !a0.LJJIIZI(path2, "feedback/offline", false)) && ((path = uri.getPath()) == null || !a0.LJJIIZI(path, "feedback/im", false))) {
                    xQ2(context, uri.toString(), mapLJIIJ);
                }
                Uri.Builder builderBuildUpon = uri.buildUpon();
                builderBuildUpon.appendQueryParameter("enter_from", "rap_main_na");
                builderBuildUpon.appendQueryParameter("entrance", "rap_main");
                xQ2(context, builderBuildUpon.build().toString(), mapLJIIJ);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        Integer num2 = faqSubCategoryItem.originalLabelId;
        if (num2 != null && num2.equals("6437")) {
            z = true;
        } else {
            z = false;
        }
        if (z || ((num = faqSubCategoryItem.originalLabelId) != null && num.equals("9192"))) {
            xQ2(context, C2503609rW.LIZ, null);
            return;
        }
        if (Intrinsics.LJFF(faqSubCategoryItem.hasChildren, Boolean.TRUE)) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//setting/reportproblem/detail");
            smartRouteBuildRoute.withParam("faq_id", faqSubCategoryItem.faqId);
            smartRouteBuildRoute.withParam("enter_from", "rap_main_na");
            smartRouteBuildRoute.withParam("entrance", "rap_main");
            smartRouteBuildRoute.withParam("start_time", System.currentTimeMillis());
            smartRouteBuildRoute.open();
            return;
        }
        if (Intrinsics.LJFF(faqSubCategoryItem.faqId, "7321579127205534214")) {
            xQ2(context, C1689060u3U.LIZ("7385087816658639365"), null);
            return;
        }
        String str2 = faqSubCategoryItem.faqId;
        if (str2 != null) {
            xQ2(context, C1689060u3U.LIZ(str2), null);
        }
    }

    public final void yQ2(Context context, Function1<? super FaqResponse, Unit> function1) {
        setState(AFwS266S0000000_25.get$arr$(337));
        CSPPageApi.FaqRequestBody.Factory.getClass();
        CSPPageApi.FaqRequestBody faqRequestBodyLIZ = C1689100u3Y.LIZ();
        AwS604S0100000_25 awS604S0100000_25 = new AwS604S0100000_25((Function1) function1, (Function1<? super EnumC1678550tmX, Boolean>) 498);
        AwS391S0200000_25 awS391S0200000_25 = new AwS391S0200000_25(context, this, 180);
        C01GW c01gw = C592650NMh.LIZJ;
        C23250099c.LIZLLL((InterfaceC497601wk) c01gw.getValue(), null, null, new C592610NMd(faqRequestBodyLIZ, awS604S0100000_25, awS391S0200000_25, null), 3);
        C23250099c.LIZLLL((InterfaceC497601wk) c01gw.getValue(), null, null, new C592640NMg(new AwS591S0100000_12(this, 660), new AwS591S0100000_12(this, 661), null), 3);
        C23250099c.LIZLLL((InterfaceC497601wk) c01gw.getValue(), null, null, new C592630NMf(C610340Nwm.LIZ(), new AwS604S0100000_25(this, 499), new AwS604S0100000_25(this, 500), null), 3);
    }

    public final void xQ2(Context context, String str, Map<String, String> map) {
        try {
            SparkContext sparkContext = new SparkContext();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aweme://webview?url=");
            sbLIZ.append(URLEncoder.encode(str, "UTF-8"));
            sbLIZ.append("&target_handler=crossPlatform");
            sparkContext.LJJLIIJ(C2188811AlT.LIZIZ(sbLIZ));
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    sparkContext.LJJJZ(entry.getKey(), entry.getValue());
                }
            }
            C1541950qED.LIZJ.getClass();
            new C1541950qED(context, sparkContext).LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
