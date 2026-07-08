package com.ss.android.ugc.aweme.im.ui.assem;

import X.C019F;
import X.C0I0B;
import X.C0YNP;
import X.C1156020gBk;
import X.C1241040iOs;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723580SZw;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C904440Zdy;
import X.EnumC1241050iOt;
import X.EnumC904370Zdr;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS154S0100000_19;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.analytics.IIMMediaGridAnalytics;
import com.ss.android.ugc.aweme.im.viewmodel.HistorySearchResultVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class HistorySearchMediaGridEntryAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final AssemVMLazy LLJJI;
    public final C1559260qg8 LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HistorySearchMediaGridEntryAssem.class, "resultVM", "getResultVM()Lcom/ss/android/ugc/aweme/im/viewmodel/HistorySearchResultVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public HistorySearchMediaGridEntryAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(HistorySearchResultVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1520), AFwS257S0000000_19.get$arr$(178), null, true);
        this.LLJJIII = new C1559260qg8(new C723580SZw(this, C1156020gBk.class, null), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cjv;
    }

    public final void hp(EnumC904370Zdr enumC904370Zdr) {
        String str;
        EnumC1241050iOt enumC1241050iOt;
        Context context = getContentView().getContext();
        C1156020gBk c1156020gBk = (C1156020gBk) this.LLJJIII.getValue();
        if (c1156020gBk != null && (str = c1156020gBk.LL) != null) {
            long jLJII = C0YNP.LJII(str);
            IIMMediaGridAnalytics iIMMediaGridAnalytics = (IIMMediaGridAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMMediaGridAnalytics.class);
            if (iIMMediaGridAnalytics != null) {
                AssemVMLazy assemVMLazy = this.LLJJI;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
                C1241040iOs c1241040iOs = (C1241040iOs) ((HistorySearchResultVM) assemVMLazy.getValue()).LLILLL.getValue();
                if (c1241040iOs != null) {
                    if (C904440Zdy.LIZ[enumC904370Zdr.ordinal()] == 1) {
                        enumC1241050iOt = EnumC1241050iOt.SHARED_VIDEO;
                    } else {
                        enumC1241050iOt = EnumC1241050iOt.PRIVATE_MEDIA;
                    }
                    iIMMediaGridAnalytics.LIZ("ttsocial_chat_search_quick_btn_click", iIMMediaGridAnalytics.LIZLLL(c1241040iOs.LIZ, c1241040iOs.LIZJ, c1241040iOs.LIZIZ, enumC1241050iOt, c1241040iOs.LIZLLL), C0I0B.LJFF.LIZIZ());
                }
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//im/search/media_grid");
            smartRouteBuildRoute.withParam("conversation_id", str);
            smartRouteBuildRoute.withParam("media_type", enumC904370Zdr.name());
            smartRouteBuildRoute.withParam("user_id", jLJII);
            smartRouteBuildRoute.open();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        LinearLayout linearLayout = (LinearLayout) getContentView().findViewById(R.id.v3s);
        LinearLayout linearLayout2 = (LinearLayout) getContentView().findViewById(R.id.rvd);
        C786410Ut5.R7(linearLayout, new ACListenerS154S0100000_19(this, 108));
        C786410Ut5.R7(linearLayout2, new ACListenerS154S0100000_19(this, 109));
    }
}
