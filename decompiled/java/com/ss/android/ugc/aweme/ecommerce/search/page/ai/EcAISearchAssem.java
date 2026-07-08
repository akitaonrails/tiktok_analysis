package com.ss.android.ugc.aweme.ecommerce.search.page.ai;

import X.AnonymousClass0956;
import X.C019F;
import X.C1205780hU0;
import X.C13LE;
import X.C1507790pL7;
import X.C1537720q7O;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C724750Sbp;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public final class EcAISearchAssem extends UIContentAssem implements EcSearchAIAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final AssemVMLazy LLIZLLLIL;
    public C1537720q7O LLJ;
    public C1205780hU0 LLJI;
    public boolean LLJIJIL;
    public long LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EcAISearchAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/search/page/ai/EcAISearchViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EcAISearchAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EcAISearchViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 198), AFwS256S0000000_18.get$arr$(64), null, true);
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -574073919) {
            return null;
        }
        return this;
    }

    public final EcAISearchViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (EcAISearchViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.ai.EcSearchAIAbility
    public final View Ce() {
        return LJJIJL();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.ai.EcSearchAIAbility
    public final void XY() {
        EcAISearchViewModel ecAISearchViewModelGo = Go();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancelCurrentRequest: currentChatJob=");
        sbLIZ.append(ecAISearchViewModelGo.LLJ);
        sbLIZ.append(", isActive=");
        AnonymousClass0956 anonymousClass0956 = ecAISearchViewModelGo.LLJ;
        sbLIZ.append(anonymousClass0956 != null ? Boolean.valueOf(anonymousClass0956.isActive()) : null);
        C2188811AlT.LIZIZ(sbLIZ);
        AnonymousClass0956 anonymousClass09562 = ecAISearchViewModelGo.LLJ;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        ecAISearchViewModelGo.LLJ = null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() throws JSONException {
        super.onDestroy();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event_type", "exit");
        jSONObject.put("stay_duration", SystemClock.elapsedRealtime() - this.LLJILJIL);
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZLLL("rd_tiktokec_ai_search_trace", jSONObject);
        C1537720q7O c1537720q7O = this.LLJ;
        if (c1537720q7O != null) {
            c1537720q7O.LLD(true);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        C1537720q7O c1537720q7O = this.LLJ;
        if (c1537720q7O != null) {
            c1537720q7O.onHide();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        C1537720q7O c1537720q7O = this.LLJ;
        if (c1537720q7O != null) {
            c1537720q7O.onShow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x014b  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r14) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.page.ai.EcAISearchAssem.onViewCreated(android.view.View):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.ai.EcSearchAIAbility
    public final void TB1(Map<String, ? extends Object> map, boolean z) {
        EcAISearchViewModel ecAISearchViewModelGo = Go();
        ecAISearchViewModelGo.LLJILJIL = false;
        String string = ecAISearchViewModelGo.LLILZIL;
        if (!z || string == null) {
            string = UUID.randomUUID().toString();
            ecAISearchViewModelGo.LLILZIL = string;
        }
        ecAISearchViewModelGo.xQ2(string, new AwS632S0100000_18(map, (Map<String, ? extends Object>) 25));
    }
}
