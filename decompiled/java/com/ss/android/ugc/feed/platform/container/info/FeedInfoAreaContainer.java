package com.ss.android.ugc.feed.platform.container.info;

import X.C09R3;
import X.C0HHT;
import X.C0RIY;
import X.C0RIZ;
import X.C0RJX;
import X.C0RJY;
import X.C0RQ6;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C299610Bol;
import X.C693570RIl;
import X.C693590RIn;
import X.C693730RJb;
import X.C693770RJf;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.feed.platform.ab.NarrowScreenOptConfig;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.ss.android.ugc.feed.platform.container.core.VContainerProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedInfoAreaContainer extends BaseContainer<VContainerProtocol, FeedInfoAreaContainer> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public final InterfaceC1731706qJ LLJL;
    public final InterfaceC1731706qJ LLJLIL;
    public final C0RQ6 LLJLILLLLZIIL;
    public boolean LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeedInfoAreaContainer.class, "constraintSizeVM", "getConstraintSizeVM()Lcom/ss/android/ugc/feed/platform/container/info/ConstraintSizeVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(FeedInfoAreaContainer.class, "infoAreaVM", "getInfoAreaVM()Lcom/ss/android/ugc/feed/platform/container/info/FeedInfoAreaVM;", 0);
        c09r3.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public FeedInfoAreaContainer() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ConstraintSizeVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, c1637906bB, new C0RIY(c19719912DlLIZ), null, new C0RJX());
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FeedInfoAreaVM.class);
        this.LLJLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c0hht, c1637906bB, new C0RIZ(c19719912DlLIZ2), null, new C0RJY());
        this.LLJLILLLLZIIL = C0RQ6.FEED_INFO_AREA_CONTAINER;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C736680Sv4.LJIIIZ(this, (AssemViewModel) this.LLJLIL.getValue(this, LLJLLIL[1]), new C2217381BqS() { // from class: X.0RJR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0RJT) obj).LL);
            }
        }, new C2217381BqS() { // from class: X.0RJS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C0RJT) obj).LLILLJJLI);
            }
        }, C736820SvI.LIZLLL(), new C693730RJb(), 8);
        NarrowScreenOptConfig narrowScreenOptConfig = (NarrowScreenOptConfig) C693570RIl.LIZIZ.getValue();
        if (narrowScreenOptConfig == null) {
            narrowScreenOptConfig = C693570RIl.LIZJ;
        }
        int i = narrowScreenOptConfig.adaptionTarget;
        NarrowScreenOptConfig.Companion.getClass();
        if (i == NarrowScreenOptConfig.ONLY_NARROW) {
            C736680Sv4.LJIIIIZZ(this, sp(), new C2217381BqS() { // from class: X.0RJU
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((C0RJW) obj).LL);
                }
            }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(221), 4);
        }
    }

    public final synchronized void op() {
        if (this.LLJLL) {
            return;
        }
        C693590RIn.LIZ(this, new AwS590S0100000_11(this, 363));
        if (Bo()) {
            sp().vQ2((ViewGroup) LJJIJL());
            ConstraintSizeVM constraintSizeVMSp = sp();
            View viewLJJIJL = LJJIJL();
            constraintSizeVMSp.getClass();
            if (C299610Bol.LIZ()) {
                ConstraintSizeVM.xQ2(R.id.videomusictitleblock, C693770RJf.LIZ(), viewLJJIJL);
            } else {
                ConstraintSizeVM.xQ2(R.id.videomusictitleblock, C693770RJf.LIZIZ(), viewLJJIJL);
            }
            ConstraintSizeVM constraintSizeVMSp2 = sp();
            View viewLJJIJL2 = LJJIJL();
            constraintSizeVMSp2.getClass();
            ConstraintSizeVM.xQ2(R.id.p10, C693770RJf.LIZIZ(), viewLJJIJL2);
        }
        this.LLJLL = true;
    }

    public final ConstraintSizeVM sp() {
        return (ConstraintSizeVM) this.LLJL.getValue(this, LLJLLIL[0]);
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, X.InterfaceC694120RKo
    public final void J4() {
        super.J4();
        op();
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final C0RQ6 hp() {
        return this.LLJLILLLLZIIL;
    }
}
