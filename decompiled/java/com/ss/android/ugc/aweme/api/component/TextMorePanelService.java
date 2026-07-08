package com.ss.android.ugc.aweme.api.component;

import X.C1354060lLA;
import X.C1354070lLB;
import X.InterfaceC1354490lLr;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ad.feed.component.ITextMorePanelService;
import com.ss.android.ugc.aweme.ad.panel.TitlePanelAgentAssem;
import com.ss.android.ugc.aweme.ad.panel.TitlePanelCommerceProductAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes22.dex */
public final class TextMorePanelService implements ITextMorePanelService {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0lLA] */
    @Override // com.ss.android.ugc.aweme.ad.feed.component.ITextMorePanelService
    public final C1354060lLA LIZ() {
        return new InterfaceC1354490lLr() { // from class: X.0lLA
            @Override // X.InterfaceC1354420lLk
            public final boolean LIZIZ(C1354140lLI c1354140lLI) {
                Aweme aweme = c1354140lLI.LL.LL;
                String str = TitlePanelAgentAssem.LLJJJ;
                if (a0.LJJJIL(str)) {
                    return false;
                }
                return C693790RJh.LIZ(aweme).contains(str);
            }

            @Override // X.InterfaceC1354420lLk
            public final void LIZ(C1350290lF5 c1350290lF5, ViewGroup viewGroup) {
                Fragment fragment = c1350290lF5.LIZIZ;
                C723850SaN.LIZ(fragment, false, null, new AwS387S0200000_21((FrameLayout) viewGroup, fragment, 112), 3);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0lLB] */
    @Override // com.ss.android.ugc.aweme.ad.feed.component.ITextMorePanelService
    public final C1354070lLB LIZIZ() {
        return new InterfaceC1354490lLr() { // from class: X.0lLB
            @Override // X.InterfaceC1354420lLk
            public final boolean LIZIZ(C1354140lLI c1354140lLI) {
                Aweme aweme = c1354140lLI.LL.LL;
                String str = TitlePanelCommerceProductAssem.LLJJJJ;
                if (a0.LJJJIL(str)) {
                    return false;
                }
                return C693790RJh.LIZ(aweme).contains(str);
            }

            @Override // X.InterfaceC1354420lLk
            public final void LIZ(C1350290lF5 c1350290lF5, ViewGroup viewGroup) {
                Fragment fragment = c1350290lF5.LIZIZ;
                C723850SaN.LIZ(fragment, false, null, new AwS387S0200000_21((FrameLayout) viewGroup, fragment, 113), 3);
            }
        };
    }
}
