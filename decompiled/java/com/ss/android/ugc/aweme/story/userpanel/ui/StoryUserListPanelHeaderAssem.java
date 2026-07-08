package com.ss.android.ugc.aweme.story.userpanel.ui;

import X.AbstractC738140SxQ;
import X.AnonymousClass0956;
import X.C01GW;
import X.C1220000hqw;
import X.C13LE;
import X.C1698080uI2;
import X.C16HH;
import X.C1749260vca;
import X.C1768006wA;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736950SvV;
import X.EnumC1726100v1E;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IMentionMixSearchService;
import com.ss.android.ugc.aweme.story.userpanel.vm.StoryUserListContainerViewModel;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class StoryUserListPanelHeaderAssem extends UIContentAssem {
    public final C736950SvV LLIZLLLIL;
    public final C01GW LLJ;
    public AnonymousClass0956 LLJI;

    public StoryUserListPanelHeaderAssem() {
        AFwS221S0000000_31 aFwS221S0000000_31 = AFwS221S0000000_31.get$arr$(260);
        this.LLIZLLLIL = new C736950SvV(C13LE.LIZ(StoryUserListContainerViewModel.class), aFwS221S0000000_31, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS276S0000000_31.get$arr$(204), new AwS575S0100000_31((AbstractC738140SxQ) this, 1064), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1063));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        AnonymousClass0956 anonymousClass0956 = this.LLJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C1749260vca c1749260vca = (C1749260vca) this.LLJ.getValue();
        c1749260vca.setSearchBarHeight(EnumC1726100v1E.HIGH);
        c1749260vca.getEditTextView().setHint(c1749260vca.getContext().getString(2131836085));
        c1749260vca.getEditTextView().addTextChangedListener(new C1768006wA(this, 4));
        c1749260vca.getEditTextView().setOnEditorActionListener(new C1698080uI2(c1749260vca, 1));
        c1749260vca.getEditTextView().setOnFocusChangeListener(new C16HH(this, 1));
        IMentionMixSearchService iMentionMixSearchService = (IMentionMixSearchService) PluggableExtentionKt.pluggableSpi$default(IMentionMixSearchService.class, false, false, false, 14, null);
        if (iMentionMixSearchService != null && iMentionMixSearchService.LJI()) {
            c1749260vca.getEditTextView().setInputType(32769);
        }
    }
}
