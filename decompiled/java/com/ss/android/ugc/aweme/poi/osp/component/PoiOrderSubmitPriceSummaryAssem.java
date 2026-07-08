package com.ss.android.ugc.aweme.poi.osp.component;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C1193330h9v;
import X.C13LE;
import X.C1637806bA;
import X.C166X;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.poi.osp.assem.PoiOrderSubmitSheetViewModel;
import com.ss.android.ugc.aweme.poi.osp.repo.model.PriceSummaryData;
import com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiOrderSubmitPriceSummaryAssem extends BaseSlashReusedComponent<PriceSummaryData> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public final C166X LLJL = new C166X(new AwS597S0100000_18((ReusedUISlotAssem) this, 429));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1666));
    public final AssemVMLazy LLJLILLLLZIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiOrderSubmitPriceSummaryAssem.class, "viewBinding", "getViewBinding()Lcom/ss/android/ugc/tiktok/poi/databinding/PoiOrderSubmitPriceSummaryCellBinding;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PoiOrderSubmitPriceSummaryAssem.class, "orderSummaryViewModel", "getOrderSummaryViewModel()Lcom/ss/android/ugc/aweme/poi/osp/assem/PoiOrderSubmitSheetViewModel;", 0);
        c09r3.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public PoiOrderSubmitPriceSummaryAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiOrderSubmitSheetViewModel.class);
        this.LLJLILLLLZIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1667), AFwS256S0000000_18.get$arr$(536), null, true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        super.Co();
        AssemVMLazy assemVMLazy = this.LLJLILLLLZIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0h9W
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1193040h9S) obj).LLILLJJLI;
            }
        }, null, new AwS632S0100000_18(this, 143), 6);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.e5l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0235 A[PHI: r17
      0x0235: PHI (r17v6 java.util.Map<java.lang.String, java.lang.Object>) = (r17v2 java.util.Map<java.lang.String, java.lang.Object>), (r17v7 java.util.Map<java.lang.String, java.lang.Object>) binds: [B:118:0x0233, B:116:0x022c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x023b A[PHI: r17
      0x023b: PHI (r17v5 java.util.Map<java.lang.String, java.lang.Object>) = (r17v2 java.util.Map<java.lang.String, java.lang.Object>), (r17v6 java.util.Map<java.lang.String, java.lang.Object>) binds: [B:118:0x0233, B:120:0x0239] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e A[PHI: r17
      0x006e: PHI (r17v9 java.util.Map<java.lang.String, java.lang.Object>) = (r17v0 java.util.Map<java.lang.String, java.lang.Object>), (r17v10 java.util.Map<java.lang.String, java.lang.Object>) binds: [B:38:0x006c, B:36:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074 A[PHI: r17
      0x0074: PHI (r17v8 java.util.Map<java.lang.String, java.lang.Object>) = (r17v0 java.util.Map<java.lang.String, java.lang.Object>), (r17v9 java.util.Map<java.lang.String, java.lang.Object>) binds: [B:38:0x006c, B:40:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f5 A[LOOP:1: B:61:0x00ef->B:63:0x00f5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0175 A[LOOP:3: B:73:0x016f->B:75:0x0175, LOOP_END] */
    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, X.InterfaceC1173990gej
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void fm1() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 819
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.osp.component.PoiOrderSubmitPriceSummaryAssem.fm1():void");
    }

    public final C1193330h9v sp() {
        C166X c166x = this.LLJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLL;
        return (C1193330h9v) c166x.LIZ(this);
    }
}
