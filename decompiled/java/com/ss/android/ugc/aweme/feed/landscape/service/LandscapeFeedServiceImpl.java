package com.ss.android.ugc.aweme.feed.landscape.service;

import X.C01GW;
import X.C03H5;
import X.C0K77;
import X.C0OAD;
import X.C0SXF;
import X.C1383760m74;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C305460ByC;
import X.C452501pT;
import X.C692450REd;
import X.C692670REz;
import X.C695370RPj;
import X.C713250RyN;
import X.C713260RyO;
import X.C713270RyP;
import X.C713280RyQ;
import X.C713290RyR;
import X.C723830SaL;
import X.C729510SjV;
import X.C735370Ssx;
import X.InterfaceC665370Q7z;
import android.app.Activity;
import android.content.Context;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.ILandscapeFeedService;
import com.ss.android.ugc.aweme.abilities.LandscapePanelStateNotificationAbility;
import com.ss.android.ugc.aweme.aicreation.AICreatorSwipeGuideUIComponent;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarAssemWrap;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeAutoRotationSwipeGuideUIComponent;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeFeedActivity;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeInteractEntrancesContainer;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeProfilePanelAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class LandscapeFeedServiceImpl implements ILandscapeFeedService {
    public final C01GW LIZ = C452501pT.LIZIZ(new C713280RyQ());

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final C13IQ<? extends UIContentAssem> LJIIIIZZ() {
        return C13LE.LIZ(AICreatorSwipeGuideUIComponent.class);
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LJIIIZ() {
        return C13LE.LIZ(FeedAvatarAssemWrap.class);
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LIZLLL() {
        boolean z = C692450REd.LIZ;
        return !C692450REd.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final C13IQ<? extends UIContentAssem> LJIIL() {
        if (C713290RyR.LIZ) {
            return C13LE.LIZ(LandscapeAutoRotationSwipeGuideUIComponent.class);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LIZ(Activity activity) {
        return activity instanceof LandscapeFeedActivity;
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LIZIZ(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        C713250RyN.LIZ.getClass();
        if (!C713250RyN.LIZJ(aweme) || C713250RyN.LIZIZ(aweme)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LIZJ(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        C713250RyN.LIZ.getClass();
        if (!C735370Ssx.LJJIJIL(aweme) || !C713250RyN.LIZJ(aweme) || C713250RyN.LIZIZ(aweme)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LJII(String str) {
        return Intrinsics.LJFF("creator_ai_assistant", str);
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final int LJ(Context context, Aweme aweme) {
        if (aweme != null) {
            return C0SXF.LJIJJLI(aweme, context);
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LJI(Context context, InterfaceC665370Q7z interfaceC665370Q7z) {
        LandscapeProfilePanelAbility landscapeProfilePanelAbility;
        boolean z = C305460ByC.LIZ;
        if (!C305460ByC.LIZ || !C0SXF.LJIL(context) || (landscapeProfilePanelAbility = (LandscapeProfilePanelAbility) C1558520qew.LIZ(interfaceC665370Q7z, LandscapeProfilePanelAbility.class, null)) == null || landscapeProfilePanelAbility.LJJII()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LJIIJJI(int i, Aweme aweme) {
        C0K77 c0k77;
        C713250RyN.LIZ.getClass();
        if (C713260RyO.LIZ || i == 2 || i == 27) {
            C695370RPj.LIZ.getClass();
            if (C695370RPj.LIZ(aweme).LIZIZ() && C0SXF.LJJ(aweme) && !C729510SjV.LJJIJIL(aweme) && !C0OAD.LIZIZ(aweme) && ((c0k77 = (C0K77) this.LIZ.getValue()) == null || !c0k77.LJJJJLI(aweme))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LJIILIIL(int i, Aweme aweme) {
        if (!LJIIJJI(i, aweme) && !C1383760m74.LIZIZ.LJJIFFI(aweme)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final void LJIILJJIL(Assembler assembler, InteractAreaComponent interactAreaComponent) {
        assembler.LQ2(interactAreaComponent, new C692670REz());
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LJIILL(Context context, Aweme aweme) {
        if (!C0SXF.LJIL(context)) {
            return false;
        }
        boolean z = C713270RyP.LIZ;
        if (!C713270RyP.LIZ) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final void LJFF(InterfaceC665370Q7z interfaceC665370Q7z, int i, boolean z) {
        LandscapePanelStateNotificationAbility landscapePanelStateNotificationAbility = (LandscapePanelStateNotificationAbility) C1558520qew.LIZ(interfaceC665370Q7z, LandscapePanelStateNotificationAbility.class, null);
        if (landscapePanelStateNotificationAbility != null) {
            landscapePanelStateNotificationAbility.tq1(i, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final void LJIIJ(ReusedUIAssem<? extends C03H5> reusedUIAssem, int i, Aweme aweme) {
        if (LJIILIIL(i, aweme)) {
            C723830SaL.LJ(reusedUIAssem, C13LE.LIZ(LandscapeInteractEntrancesContainer.class), true, null);
        }
    }
}
