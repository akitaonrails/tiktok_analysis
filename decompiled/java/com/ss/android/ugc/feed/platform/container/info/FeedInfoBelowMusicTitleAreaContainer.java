package com.ss.android.ugc.feed.platform.container.info;

import X.C0HHT;
import X.C0RQ6;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C693770RJf;
import X.C724750Sbp;
import X.C737910Sx3;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.ss.android.ugc.feed.platform.container.core.VContainerProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedInfoBelowMusicTitleAreaContainer extends BaseContainer<VContainerProtocol, FeedInfoBelowMusicTitleAreaContainer> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public final InterfaceC1731706qJ LLJL;
    public final C0RQ6 LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeedInfoBelowMusicTitleAreaContainer.class, "constraintSizeVM", "getConstraintSizeVM()Lcom/ss/android/ugc/feed/platform/container/info/ConstraintSizeVM;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FeedInfoBelowMusicTitleAreaContainer() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ConstraintSizeVM.class);
        this.LLJL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 1290), null, AFwS243S0000000_11.get$arr$(582));
        this.LLJLIL = C0RQ6.FEED_INFO_BELOW_MUSIC_TITLE_CONTAINER;
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, X.InterfaceC694120RKo
    public final void J4() {
        super.J4();
        if (Bo()) {
            Object value = this.LLJL.getValue(this, LLJLILLLLZIIL[0]);
            View viewLJJIJL = LJJIJL();
            value.getClass();
            ConstraintSizeVM.xQ2(R.id.p10, C693770RJf.LIZIZ(), viewLJJIJL);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final C0RQ6 hp() {
        return this.LLJLIL;
    }
}
