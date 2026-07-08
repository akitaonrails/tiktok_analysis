package com.ss.android.ugc.aweme.cell;

import X.AbstractC19293010ds;
import X.C1669670tYD;
import X.C19719212De;
import X.C20088213iq;
import X.C487160J8o;
import X.EnumC1427810nG7;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.internal.AwS634S0100000_20;

/* JADX INFO: loaded from: classes29.dex */
public final class ComposableCell extends BaseCell<C487160J8o> {
    @Override // com.ss.android.ugc.aweme.cell.BaseCell
    public final View I5(ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
        composeView.setViewCompositionStrategy(C20088213iq.LIZIZ);
        return composeView;
    }

    @Override // com.ss.android.ugc.aweme.cell.BaseCell
    /* JADX INFO: renamed from: L5 */
    public final void onBindItemView(AbstractC19293010ds abstractC19293010ds) {
        C1669670tYD.LJ((ComposeView) this.itemView, EnumC1427810nG7.Auto, new C19719212De(514986137, new AwS634S0100000_20((C487160J8o) abstractC19293010ds, 4), true));
    }

    @Override // com.ss.android.ugc.aweme.cell.BaseCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1669670tYD.LJ((ComposeView) this.itemView, EnumC1427810nG7.Auto, new C19719212De(514986137, new AwS634S0100000_20((C487160J8o) interfaceC1891350zJl, 4), true));
    }
}
