package com.ss.android.ugc.feed.platform.panel.datalayer;

import X.AbstractC606590Nqj;
import X.C1558360qeg;
import X.C1558520qew;
import X.C2189821An6;
import X.C606870NrB;
import X.C724240Sb0;
import X.InterfaceC665370Q7z;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class DataLayerPanelComponent extends BasePanelComponent {
    public static final /* synthetic */ int LL = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0Nqi] */
    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        final IFeedFetchDataAbility iFeedFetchDataAbility;
        C2189821An6 c2189821An6;
        String eventType;
        Fragment fragmentLJI;
        super.onCreate();
        final IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IFeedPanelPlatformAbility.class, null);
        if (iFeedPanelPlatformAbility == null || (iFeedFetchDataAbility = (IFeedFetchDataAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IFeedFetchDataAbility.class, null)) == null || (c2189821An6 = getPanelContext().LIZJ) == null || (eventType = c2189821An6.getEventType()) == null || (fragmentLJI = C724240Sb0.LJI(this)) == null) {
            return;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
        DataLayerAbilityMonitor dataLayerAbilityMonitor = new DataLayerAbilityMonitor(new DataLayerAbilityImpl(Intrinsics.LJFF(eventType, "homepage_hot") ? new C606870NrB(iFeedPanelPlatformAbility, iFeedFetchDataAbility) { // from class: X.0Nrl
            public final IFeedPanelPlatformAbility LIZJ;
            public final IFeedFetchDataAbility LIZLLL;

            @Override // X.C606870NrB
            public final List<Aweme> LIZ() {
                AbstractC1255880imo abstractC1255880imo;
                C1255920ims<?> c1255920imsKB1 = this.LIZLLL.KB1();
                if (!(c1255920imsKB1 instanceof C1601390rm5) || c1255920imsKB1 == null || (abstractC1255880imo = (AbstractC1255880imo) c1255920imsKB1.LL) == null) {
                    return null;
                }
                return abstractC1255880imo.getItems();
            }

            {
                super(iFeedPanelPlatformAbility, iFeedFetchDataAbility);
                this.LIZJ = iFeedPanelPlatformAbility;
                this.LIZLLL = iFeedFetchDataAbility;
            }
        } : new C606870NrB(iFeedPanelPlatformAbility, iFeedFetchDataAbility)), eventType);
        if (Intrinsics.LJFF(eventType, "homepage_hot")) {
            dataLayerAbilityMonitor.jl1(new AbstractC606590Nqj(eventType) { // from class: X.0Nqi
                @Override // X.AbstractC606590Nqj
                public final C606550Nqf LIZ(C606500Nqa c606500Nqa) {
                    if (!c606500Nqa.LIZ()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(this.LIZ);
                        sbLIZ.append(' ');
                        sbLIZ.append(c606500Nqa.LIZ);
                        sbLIZ.append(" invalid");
                        return new C606550Nqf(106, C2188811AlT.LIZIZ(sbLIZ));
                    }
                    return new C606550Nqf(0, null);
                }
            });
        }
        C1558520qew.LJII(interfaceC665370Q7zLJFF, dataLayerAbilityMonitor, DataLayerAbility.class, null, this);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), DataLayerAbility.class, "DataLayerPanel");
        }
    }
}
