package com.ss.android.ugc.feed.platform.container.info;

import X.C0HHT;
import X.C0RQ6;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C693750RJd;
import X.C693760RJe;
import X.C693770RJf;
import X.C724750Sbp;
import X.C737910Sx3;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.ss.android.ugc.feed.platform.container.core.VContainerProtocol;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedInfoAboveAnchorAreaContainer extends BaseContainer<VContainerProtocol, FeedInfoAboveAnchorAreaContainer> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public final InterfaceC1731706qJ LLJL;
    public final C0RQ6 LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeedInfoAboveAnchorAreaContainer.class, "constraintSizeVM", "getConstraintSizeVM()Lcom/ss/android/ugc/feed/platform/container/info/ConstraintSizeVM;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FeedInfoAboveAnchorAreaContainer() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ConstraintSizeVM.class);
        this.LLJL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new C693750RJd(c19719912DlLIZ), null, new C693760RJe());
        this.LLJLIL = C0RQ6.FEED_INFO_ABOVE_ANCHOR_AREA_CONTAINER;
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, X.InterfaceC694120RKo
    public final void J4() {
        super.J4();
        if (Bo()) {
            Object value = this.LLJL.getValue(this, LLJLILLLLZIIL[0]);
            View viewLJJIJL = LJJIJL();
            value.getClass();
            ConstraintSizeVM.xQ2(R.id.aay, C693770RJf.LIZ(), viewLJJIJL);
            ConstraintSizeVM.xQ2(R.id.mrs, C693770RJf.LIZ(), viewLJJIJL);
            ConstraintSizeVM.xQ2(R.id.g3o, C693770RJf.LIZ(), viewLJJIJL);
            ConstraintSizeVM.xQ2(R.id.ox2, C693770RJf.LIZ(), viewLJJIJL);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final C0RQ6 hp() {
        return this.LLJLIL;
    }
}
