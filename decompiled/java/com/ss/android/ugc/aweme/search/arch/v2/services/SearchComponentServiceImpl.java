package com.ss.android.ugc.aweme.search.arch.v2.services;

import X.C01GW;
import X.C13LE;
import X.C1559260qg8;
import X.C19719912Dl;
import X.C452501pT;
import X.C657880PrG;
import X.C683220Qr2;
import X.C723580SZw;
import X.InterfaceC655050Pmh;
import android.view.View;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.SearchCardAuthorInfoAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.SearchCardVideoLikeCountAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAdPhotoPlayerAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardCreateTimeAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardFeedbackAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardLivePlayerAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardLiveTagAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardPhotoPlayerAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardPlayerSoundIconAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardVideoPlayerAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchFollowAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.entrycard.ui.SearchEntryCardAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.grid.ui.SearchGridAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.horizontallist.ui.SearchHorizontalListAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.ui.SearchMediaAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.title.ui.SearchCardTitleAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.SearchTop1CardToolbarAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.background.ui.SearchTop1BackgroundAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.interaction.ui.SearchTop1InteractionAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.label.ui.SearchTop1CardLabelAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.topbar.ui.SearchTopBarAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchlemon8photo.core.ui.assem.SearchCardDarkLayerAssem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchComponentServiceImpl implements SearchComponentService {

    public static final class ConfigurableSearchCardFeedBackAssem extends SearchCardFeedbackAssem<InterfaceC655050Pmh> {
        public final C1559260qg8 LLJJJJLIIL = new C1559260qg8(new C723580SZw(this, C657880PrG.class, null), checkSupervisorPrepared());
        public final C01GW LLJJL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 288));
        public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 289));
        public final C01GW LLJL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 290));
        public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 287));
        public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 292));
        public final C01GW LLJLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 291));

        @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardFeedbackAssem
        public final Function0<List<View>> dp() {
            return (Function0) this.LLJLIL.getValue();
        }

        @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardFeedbackAssem
        public final boolean hp() {
            return ((Boolean) this.LLJLILLLLZIIL.getValue()).booleanValue();
        }

        @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardFeedbackAssem
        public final Function0<Boolean> ip() {
            return (Function0) this.LLJLL.getValue();
        }

        @Override // X.InterfaceC685830QvF
        public final List<Integer> sf() {
            return (List) this.LLJJLIIIJLLLLLLLZ.getValue();
        }

        public final C657880PrG sp() {
            return (C657880PrG) this.LLJJJJLIIL.getValue();
        }

        @Override // X.InterfaceC685830QvF
        public final int ue() {
            return ((Number) this.LLJJL.getValue()).intValue();
        }

        @Override // X.InterfaceC685830QvF
        public final List<Integer> ya() {
            return (List) this.LLJL.getValue();
        }

        @Override // X.InterfaceC685830QvF
        public final String getFeedbackType() {
            Function0<String> function0;
            C657880PrG c657880PrGSp = sp();
            if (c657880PrGSp == null || (function0 = c657880PrGSp.LL) == null) {
                return null;
            }
            return function0.invoke();
        }

        @Override // X.InterfaceC685830QvF
        public final void Mj(C683220Qr2 c683220Qr2) {
            Function1<? super C683220Qr2, Unit> function1;
            C657880PrG c657880PrGSp = sp();
            if (c657880PrGSp != null && (function1 = c657880PrGSp.LLILZIL) != null) {
                function1.invoke(c683220Qr2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentService
    public final C19719912Dl LIZ() {
        return C13LE.LIZ(SearchTop1BackgroundAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentService
    public final C19719912Dl LIZIZ() {
        return C13LE.LIZ(ConfigurableSearchCardFeedBackAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentService
    public final C19719912Dl LIZJ() {
        return C13LE.LIZ(SearchCardDarkLayerAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentService
    public final C19719912Dl LIZLLL() {
        return C13LE.LIZ(SearchFollowAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentService
    public final C19719912Dl LJ() {
        return C13LE.LIZ(SearchAdPhotoPlayerAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentService
    public final C19719912Dl LJFF() {
        return C13LE.LIZ(SearchCardVideoPlayerAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentService
    public final C19719912Dl LJI() {
        return C13LE.LIZ(SearchCardPlayerSoundIconAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentService
    public final C19719912Dl LJII() {
        return C13LE.LIZ(SearchTop1CardToolbarAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentService
    public final C19719912Dl LJIIIIZZ() {
        return C13LE.LIZ(SearchTop1InteractionAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentService
    public final C19719912Dl LJIIIZ() {
        return C13LE.LIZ(SearchGridAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentService
    public final C19719912Dl LJIIJ() {
        return C13LE.LIZ(SearchCardAuthorInfoAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentService
    public final C19719912Dl LJIIJJI() {
        return C13LE.LIZ(SearchCardPhotoPlayerAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentService
    public final C19719912Dl LJIIL() {
        return C13LE.LIZ(SearchCardLivePlayerAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentService
    public final C19719912Dl LJIILIIL() {
        return C13LE.LIZ(SearchTopBarAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentService
    public final C19719912Dl LJIILJJIL() {
        return C13LE.LIZ(SearchCardCreateTimeAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentService
    public final C19719912Dl LJIILL() {
        return C13LE.LIZ(SearchCardTitleAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentService
    public final C19719912Dl LJIILLIIL() {
        return C13LE.LIZ(SearchHorizontalListAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentService
    public final C19719912Dl LJIIZILJ() {
        return C13LE.LIZ(SearchCardLiveTagAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentService
    public final C19719912Dl LJIJ() {
        return C13LE.LIZ(SearchCardVideoLikeCountAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentService
    public final C19719912Dl LJIJI() {
        return C13LE.LIZ(SearchMediaAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentService
    public final C19719912Dl LJIJJ() {
        return C13LE.LIZ(SearchEntryCardAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentService
    public final C19719912Dl LJIJJLI() {
        return C13LE.LIZ(SearchTop1CardLabelAssem.class);
    }
}
