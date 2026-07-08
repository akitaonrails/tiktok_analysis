package com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.markdown;

import X.C01GW;
import X.C01V8;
import X.C123100dR;
import X.C444200HbO;
import X.C452501pT;
import X.C688690Qzr;
import X.C724270Sb3;
import X.InterfaceC342000Daw;
import X.InterfaceC685060Qu0;
import android.view.View;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.base.SearchNimbleBaseAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS254S0300000_10;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchNimbleMarkdownAssem extends SearchNimbleBaseAssem<String> {
    public C688690Qzr LLJZIJLIL;
    public InterfaceC342000Daw LLL;
    public final C01GW LLLF = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(292));
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS554S0100000_10(this, 576));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ez0;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C01V8.LIZ((C01V8) this.LLLF.getValue(), "inflate_cost", null, new AwS554S0100000_10(this, 573), 2);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.base.SearchNimbleBaseAssem
    /* JADX INFO: renamed from: Gp, reason: merged with bridge method [inline-methods] */
    public final String tp() {
        String str;
        String str2;
        String str3;
        if (Ap()) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            List<String> summaries = ((InterfaceC685060Qu0) (c724270Sb3 != null ? c724270Sb3.LL : null)).LLJJI().getSummaries();
            if (summaries != null && (str3 = (String) C444200HbO.LIZ(up(), summaries)) != null) {
                return str3;
            }
            C724270Sb3 c724270Sb32 = this.LLJI;
            String processedSummary = ((InterfaceC685060Qu0) (c724270Sb32 != null ? c724270Sb32.LL : null)).LLJJI().getProcessedSummary();
            if (processedSummary != null) {
                return processedSummary;
            }
        } else {
            C724270Sb3 c724270Sb33 = this.LLJI;
            List<String> snippets = ((InterfaceC685060Qu0) (c724270Sb33 != null ? c724270Sb33.LL : null)).LLJJI().getSnippets();
            if (snippets != null && (str2 = (String) C444200HbO.LIZ(up(), snippets)) != null && C123100dR.LIZ(str2)) {
                return str2;
            }
            C724270Sb3 c724270Sb34 = this.LLJI;
            List<String> summaries2 = ((InterfaceC685060Qu0) (c724270Sb34 != null ? c724270Sb34.LL : null)).LLJJI().getSummaries();
            if (summaries2 != null && (str = (String) C444200HbO.LIZ(up(), summaries2)) != null && C123100dR.LIZ(str)) {
                return str;
            }
            C724270Sb3 c724270Sb35 = this.LLJI;
            String processedSummary2 = ((InterfaceC685060Qu0) (c724270Sb35 != null ? c724270Sb35.LL : null)).LLJJI().getProcessedSummary();
            if (processedSummary2 != null) {
                return processedSummary2;
            }
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.base.SearchNimbleBaseAssem
    /* JADX INFO: renamed from: Bp */
    public final void tp(InterfaceC685060Qu0 interfaceC685060Qu0) {
        super.tp(interfaceC685060Qu0);
        C688690Qzr c688690Qzr = this.LLJZIJLIL;
        if (c688690Qzr != null && C123100dR.LIZ(tp())) {
            C01V8.LIZ((C01V8) this.LLLF.getValue(), "bind_cost", null, new AwS254S0300000_10(this, c688690Qzr, interfaceC685060Qu0, 8), 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.base.SearchNimbleBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C01V8.LIZ((C01V8) this.LLLF.getValue(), "view_created_cost", null, new AwS411S0200000_10(view, this, 45), 2);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.base.SearchNimbleBaseAssem
    public final boolean op(String str) {
        return C123100dR.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.base.SearchNimbleBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(InterfaceC685060Qu0 interfaceC685060Qu0) {
        tp(interfaceC685060Qu0);
    }
}
