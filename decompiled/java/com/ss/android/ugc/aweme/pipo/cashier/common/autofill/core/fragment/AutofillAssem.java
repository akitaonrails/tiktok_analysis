package com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.fragment;

import X.C019F;
import X.C098200Yq;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1708610uZ1;
import X.C1710960uco;
import X.C189200o6;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723590SZx;
import X.C724750Sbp;
import X.InterfaceC1709310ua9;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.pipo.cashier.common.autofill.business.AutofillHostContent;
import com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.AutofillApi;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class AutofillAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public AutofillApi.CardNumberItem LLJI;
    public boolean LLJIJIL;
    public RelativeLayout LLJILJIL;
    public SmartImageView LLJILJILJ;
    public TuxTextView LLJILLL;
    public TuxTextView LLJJ;
    public TuxIconView LLJJI;
    public C197039127h LLJJIII;
    public C197039127h LLJJIJI;
    public TuxTextView LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AutofillAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/pipo/cashier/common/autofill/core/fragment/AutofillViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AutofillAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AutofillViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 838), AFwS268S0000000_26.get$arr$(431), null, true);
        this.LLJ = new C1559260qg8(new C723590SZx(this, C1710960uco.class, null), checkSupervisorPrepared());
    }

    public final C197039127h Go() {
        View viewFindViewById = this.LLJJIII;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.d71) : null;
            this.LLJJIII = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C197039127h Ho() {
        View viewFindViewById = this.LLJJIJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.d75) : null;
            this.LLJJIJI = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C1710960uco Jo() {
        return (C1710960uco) this.LLJ.getValue();
    }

    public final TuxTextView Lo() {
        View viewFindViewById = this.LLJJIJIIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ru8) : null;
            this.LLJJIJIIJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final AutofillViewModel No() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (AutofillViewModel) assemVMLazy.getValue();
    }

    public final void Oo(String str) {
        Object c098200Yq;
        String str2;
        HashMap map = new HashMap();
        String str3 = Jo().LL;
        if (str3 != null) {
            try {
                JSONObject jSONObject = new JSONObject(str3);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject.optString(next));
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
        InterfaceC1709310ua9 interfaceC1709310ua9LIZIZ = C1708610uZ1.LIZIZ("autofill");
        HashMap map2 = new HashMap();
        map2.putAll(map);
        AutofillHostContent autofillHostContent = Jo().LLILLL;
        if (autofillHostContent == null || (str2 = autofillHostContent.merchantId) == null) {
            str2 = "";
        }
        map2.put("merchant_id", str2);
        map2.put("enter_method", str);
        interfaceC1709310ua9LIZIZ.LIZ("ttls_pipo_autofill_click", map2);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0141 A[PHI: r2
      0x0141: PHI (r2v6 android.view.View) = (r2v5 android.view.View), (r2v8 android.view.View) binds: [B:62:0x012b, B:67:0x013f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r16) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.fragment.AutofillAssem.onViewCreated(android.view.View):void");
    }
}
