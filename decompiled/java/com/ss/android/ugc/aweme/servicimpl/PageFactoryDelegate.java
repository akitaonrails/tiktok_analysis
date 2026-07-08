package com.ss.android.ugc.aweme.servicimpl;

import X.C0CHQ;
import X.C539900LFk;
import X.InterfaceC1642900sr2;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import com.ss.android.ugc.aweme.creative.model.StoryShootModel;
import com.ss.android.ugc.aweme.dmt_integration.AVInitializerImpl;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.x2;
import com.ss.android.ugc.gamora.PageFactory;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS120S0400000_25;
import kotlin.jvm.internal.AwS234S0300000_25;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class PageFactoryDelegate implements PageFactory {
    @Override // com.ss.android.ugc.gamora.PageFactory
    public final InterfaceC1642900sr2 LIZ(ShortVideoContext shortVideoContext) {
        CreativeInitialModel creativeInitialModel;
        DMCameraModel dMCameraModel;
        StoryShootModel storyShootModel;
        if (!AVInitializerImpl.LIZIZ) {
            return null;
        }
        if (C0CHQ.LIZ().getAccountService().LIZ()) {
            return new InterfaceC1642900sr2() { // from class: X.0sqr
                @Override // X.InterfaceC1642900sr2
                public final void LIZ(C19A3 c19a3) {
                    C1654320t9S.LIZIZ(c19a3, AFwS266S0000000_25.get$arr$(493));
                    C1664590tQ1.LIZLLL(c19a3, null, false, new AwS391S0200000_25((C1650040t2Y) c19a3, c19a3, 225), 3);
                    C1664600tQ2.LIZ(c19a3, null, new AwS391S0200000_25(c19a3, c19a3, 226));
                }
            };
        }
        if (shortVideoContext != null) {
            CreativeModel creativeModel = shortVideoContext.creativeModel;
            if (creativeModel != null && (storyShootModel = creativeModel.storyModel) != null && storyShootModel.isSocialCameraEntrance()) {
                return new InterfaceC1642900sr2() { // from class: X.0sqz
                    @Override // X.InterfaceC1642900sr2
                    public final void LIZ(C19A3 c19a3) {
                        AbstractC214814194y abstractC214814194yLIZ = C372650EjH.LIZ(c19a3);
                        C1654320t9S.LIZIZ(c19a3, AFwS266S0000000_25.get$arr$(229));
                        C1664600tQ2.LIZ(c19a3, "SocialRecordPageFactory", new AwS234S0300000_25(C1664590tQ1.LIZ(c19a3, "SocialRecordPageFactory", true, new AwS120S0400000_25((x2) c19a3, c19a3, this, abstractC214814194yLIZ, 11)), c19a3, c19a3, 16));
                        C1642810sqt.LIZ(C1664600tQ2.LJ(c19a3), "record_planc");
                    }
                };
            }
            CreativeModel creativeModel2 = shortVideoContext.creativeModel;
            if (creativeModel2 != null && (creativeInitialModel = creativeModel2.initialModel) != null && (dMCameraModel = creativeInitialModel.dmCameraModel) != null && dMCameraModel.enterFromDM) {
                return new InterfaceC1642900sr2() { // from class: X.0sqy
                    @Override // X.InterfaceC1642900sr2
                    public final void LIZ(C19A3 c19a3) {
                        AbstractC214814194y abstractC214814194yLIZ = C372650EjH.LIZ(c19a3);
                        C1654320t9S.LIZIZ(c19a3, AFwS266S0000000_25.get$arr$(228));
                        C1664600tQ2.LIZ(c19a3, "NewDMRecordPageFactory", new AwS234S0300000_25(C1664590tQ1.LIZ(c19a3, "NewDMRecordPageFactory", true, new AwS234S0300000_25((x2) c19a3, c19a3, abstractC214814194yLIZ, 12)), c19a3, c19a3, 11));
                        C1642810sqt.LIZ(C1664600tQ2.LJ(c19a3), "record_planc");
                    }
                };
            }
        }
        if (C539900LFk.LJII(shortVideoContext)) {
            return new InterfaceC1642900sr2() { // from class: X.0sxp
                @Override // X.InterfaceC1642900sr2
                public final void LIZ(C19A3 c19a3) {
                    C564100MAm c564100MAm = new C564100MAm();
                    C1654320t9S.LIZIZ(c19a3, AFwS266S0000000_25.get$arr$(499));
                    C1664590tQ1.LIZ(c19a3, "LightRecordPageFactory", true, new AwS604S0100000_25(c564100MAm, 688));
                    C1664600tQ2.LIZ(c19a3, "LightRecordPageFactory", new AwS391S0200000_25(c564100MAm, c19a3, 279));
                }
            };
        }
        return new InterfaceC1642900sr2() { // from class: X.0sqx
            @Override // X.InterfaceC1642900sr2
            public final void LIZ(C19A3 c19a3) {
                AbstractC214814194y abstractC214814194yLIZ = C372650EjH.LIZ(c19a3);
                C1654320t9S.LIZIZ(c19a3, AFwS266S0000000_25.get$arr$(501));
                C1664600tQ2.LIZ(c19a3, "UIDelayRecordPageFactory", new AwS234S0300000_25(C1664590tQ1.LIZ(c19a3, "UIDelayRecordPageFactory", true, new AwS120S0400000_25((x2) c19a3, c19a3, this, abstractC214814194yLIZ, 30)), c19a3, c19a3, 48));
                C1642810sqt.LIZ(C1664600tQ2.LJ(c19a3), "record_planc");
            }
        };
    }
}
