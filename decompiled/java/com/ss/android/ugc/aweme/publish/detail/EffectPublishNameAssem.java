package com.ss.android.ugc.aweme.publish.detail;

import X.C019F;
import X.C1237400iJ0;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1748330vb5;
import X.C1748440vbG;
import X.C1775980wJg;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723590SZx;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.publish.EffectMobilePublishVM;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes27.dex */
public final class EffectPublishNameAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723590SZx(this, MobileEffectData.class, "effect_init_data"), checkSupervisorPrepared());
    public C1237400iJ0 LLJJIII;
    public C1748440vbG LLJJIJI;
    public C1748330vb5 LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public boolean LLJJJ;
    public final C1775980wJg LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EffectPublishNameAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/publish/EffectMobilePublishVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EffectPublishNameAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EffectMobilePublishVM.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 771), AFwS268S0000000_26.get$arr$(461), null, true);
        this.LLJJJIL = new C1775980wJg(this, 5);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.rk;
    }

    public final void hp(boolean z) {
        if (z) {
            Context context = getContext();
            if (context == null) {
                return;
            }
            C1748440vbG c1748440vbG = this.LLJJIJI;
            if (c1748440vbG != null) {
                c1748440vbG.setValidationStatus(3);
            }
            C1748330vb5 c1748330vb5 = this.LLJJIJIIJIL;
            if (c1748330vb5 != null) {
                c1748330vb5.setMessage(context.getString(2131821230));
            }
            C1748330vb5 c1748330vb52 = this.LLJJIJIIJIL;
            if (c1748330vb52 != null) {
                C786410Ut5.LLLLLLLZIL(c1748330vb52, 0);
                return;
            }
            return;
        }
        C1748440vbG c1748440vbG2 = this.LLJJIJI;
        if (c1748440vbG2 != null) {
            c1748440vbG2.setValidationStatus(0);
        }
        C1748330vb5 c1748330vb53 = this.LLJJIJIIJIL;
        if (c1748330vb53 != null) {
            c1748330vb53.setMessage("");
        }
        C1748330vb5 c1748330vb54 = this.LLJJIJIIJIL;
        if (c1748330vb54 != null) {
            C786410Ut5.LLLLLLLZIL(c1748330vb54, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r18) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.publish.detail.EffectPublishNameAssem.onViewCreated(android.view.View):void");
    }
}
