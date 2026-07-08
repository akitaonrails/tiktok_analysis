package com.ss.android.ugc.aweme.template.viewmodel;

import X.AbstractC848400XPy;
import X.AnonymousClass0956;
import X.C036E;
import X.C0XPD;
import X.C0XQ7;
import X.C1389890mGx;
import X.C298880Bna;
import X.C628430Okr;
import X.C628610Ol9;
import X.InterfaceC0148002o;
import X.InterfaceC849390XTt;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS94S1200000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class TemplateFavoriteViewModel extends AssemViewModel<C628430Okr> {
    public boolean LL = true;
    public String LLILLJJLI;
    public Integer LLILLL;
    public final boolean LLILZ;
    public AnonymousClass0956 LLILZIL;
    public final C628610Ol9 LLILZLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C628430Okr(3, false);
    }

    public TemplateFavoriteViewModel() {
        C298880Bna.LIZ.getClass();
        this.LLILZ = C298880Bna.LIZ();
        this.LLILZLL = new C628610Ol9();
    }

    public final void vQ2(final Fragment fragment) {
        String str;
        if (!this.LLILZ || (str = this.LLILLJJLI) == null) {
            return;
        }
        AnonymousClass0956 anonymousClass0956 = this.LLILZIL;
        if ((anonymousClass0956 != null && anonymousClass0956.isActive()) || fragment.getContext() == null) {
            return;
        }
        try {
            if (C036E.LIZ.LIZIZ()) {
                if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                    C0XPD.LIZJ(fragment, "template_detail_page", "click_favorite_button", null, new InterfaceC849390XTt() { // from class: X.0Okv
                        @Override // X.InterfaceC849390XTt
                        public final /* synthetic */ void LIZIZ() {
                        }

                        @Override // X.InterfaceC849390XTt
                        public final void LIZ() {
                            this.LIZ.vQ2(fragment);
                        }
                    });
                    return;
                } else {
                    withState(new AwS94S1200000_9(this, str, fragment, 2));
                    return;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1389890mGx c1389890mGx = new C1389890mGx(fragment);
        c1389890mGx.LJIIIZ(2131834035);
        c1389890mGx.LJIIJJI();
    }
}
