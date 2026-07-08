package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser;

import X.C1559260qg8;
import X.C427870Gq9;
import X.C656680PpK;
import X.C656830PpZ;
import X.C656870Ppd;
import X.C723580SZw;
import X.EnumC656690PpL;
import X.EnumC656860Ppc;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardBottomBarAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public class SearchBuiltInBottomAssem extends SearchCardBottomBarAssem {
    public final C1559260qg8 LLLIIIIL = new C1559260qg8(new C723580SZw(this, C656830PpZ.class, null), checkSupervisorPrepared());

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardBottomBarAssem
    public final EnumC656860Ppc yp() {
        EnumC656860Ppc enumC656860Ppc;
        C656870Ppd c656870Ppd = (C656870Ppd) this.LLJJLIIIJLLLLLLLZ.getValue();
        return (c656870Ppd == null || (enumC656860Ppc = c656870Ppd.LL) == null) ? EnumC656860Ppc.NONE : enumC656860Ppc;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardBottomBarAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        Function1<View, Unit> function1;
        super.onViewCreated(view);
        C656830PpZ c656830PpZ = (C656830PpZ) this.LLLIIIIL.getValue();
        if (c656830PpZ != null && (function1 = c656830PpZ.LL) != null) {
            TuxTextView tuxTextView = this.LLJLILLLLZIIL;
            if (tuxTextView != null) {
                C656680PpK.LIZ(tuxTextView, EnumC656690PpL.DESC, function1);
            }
            C427870Gq9 c427870Gq9 = this.LLJLLIL;
            if (c427870Gq9 != null) {
                C656680PpK.LIZ(c427870Gq9, EnumC656690PpL.AUTHOR_AVATAR, function1);
            }
            TuxTextView tuxTextView2 = this.LLJLL;
            if (tuxTextView2 != null) {
                C656680PpK.LIZ(tuxTextView2, EnumC656690PpL.AUTHOR_NAME, function1);
            }
            TuxTextView tuxTextView3 = this.LLL;
            if (tuxTextView3 != null) {
                C656680PpK.LIZ(tuxTextView3, EnumC656690PpL.LIKE, function1);
            }
            C656680PpK.LIZ(view, EnumC656690PpL.ROOT_AREA, function1);
        }
    }
}
