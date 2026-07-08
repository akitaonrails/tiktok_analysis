package com.ss.android.ugc.aweme.captionsheet;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0XQ7;
import X.C161N;
import X.C1760006us;
import X.C1839820xye;
import X.C1E8U;
import X.C20684815ws;
import X.C20693015yC;
import X.C20693815yK;
import X.C20693915yL;
import X.C20698415z4;
import X.C20700315zN;
import X.C20703515zt;
import X.C23250099c;
import X.C2344009Gk;
import X.C452501pT;
import X.C708220RqG;
import X.C746760TRa;
import X.EnumC20698315z3;
import X.EnumC207101162h;
import X.InterfaceC20698115z1;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class DMTranslationPanelFragment extends CaptionsPanelFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYtOTs6Jys/HELIOSISo2PGsIBBshKSs/JS4nISoiGS49LSkKOy40JSAiPQ==";
    public final EnumC20698315z3 LLJJJJ;
    public C20693915yL LLJJJJJIL;
    public final boolean LLJJJJLIIL;
    public final C01GW LLJJL;

    public DMTranslationPanelFragment() {
        this(0);
    }

    public static boolean yS() {
        C1760006us c1760006us = C161N.LIZIZ.LLIIIILZ().get(EnumC207101162h.DIRECT_MESSAGE);
        return c1760006us != null && c1760006us.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment, com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final String getTitle() {
        return (String) this.LLJJL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment
    public final String aS() {
        return getString(2131830815);
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final boolean PR() {
        return this.LLJJJJLIIL;
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment
    public final EnumC20698315z3 iS() {
        return this.LLJJJJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DMTranslationPanelFragment(int i) {
        super(0);
        EnumC20698315z3 enumC20698315z3 = EnumC20698315z3.DIRECT_MESSAGE;
        this.LLJJJJ = enumC20698315z3;
        this.LLJJJJLIIL = true;
        this.LLJJL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1585));
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment
    public final void nS(View view) {
        Aweme aweme;
        InterfaceC20698115z1 interfaceC20698115z1;
        Aweme aweme2;
        InterfaceC20698115z1 interfaceC20698115z12;
        if (!C1E8U.LIZ()) {
            return;
        }
        C1839820xye.LIZ().LJIIIIZZ().getClass();
        this.LLJJ = C20700315zN.LIZJ();
        C20703515zt.LIZ.getClass();
        C161N c161n = C20703515zt.LIZIZ;
        C20698415z4 c20698415z4 = this.LLILLJJLI;
        if (c20698415z4 != null && (interfaceC20698115z12 = c20698415z4.LIZ) != null) {
            aweme = interfaceC20698115z12.getAweme();
        } else {
            aweme = null;
        }
        if (!c161n.LJIJI(aweme)) {
            if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && yS()) {
                C20693015yC c20693015yC = this.LLJI;
                if (c20693015yC != null) {
                    C20693915yL c20693915yL = new C20693915yL(new C20693815yK(C746760TRa.LIZ().LJJIJIIJI(), getString(2131830814), aS(), 126972));
                    this.LLJJJJJIL = c20693915yL;
                    c20693015yC.LIZ(c20693915yL);
                }
                C20693915yL c20693915yL2 = this.LLJJJJJIL;
                if (c20693915yL2 != null) {
                    c20693915yL2.LJI(new AwS397S0200000_31(c20693915yL2, this, 124));
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C708220RqG(c20693915yL2, this, null), 3);
                }
            }
            if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                return;
            }
            UR();
            if (yS()) {
                mS();
            }
            ZR();
        }
        ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        C20698415z4 c20698415z42 = this.LLILLJJLI;
        if (c20698415z42 != null && (interfaceC20698115z1 = c20698415z42.LIZ) != null && (aweme2 = interfaceC20698115z1.getAweme()) != null) {
            AwemeExtKt.getAuthorUid(aweme2);
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJ(getEnterMethod(), "enter_method");
        String enterFrom = getEnterFrom();
        if (enterFrom == null) {
            enterFrom = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", enterFrom);
        c2344009Gk.LIZJ(yS() ? 1 : 0, "auto_translate");
        C20684815ws.LJIILLIIL("show_translation_panel", c2344009Gk.LIZ);
    }
}
