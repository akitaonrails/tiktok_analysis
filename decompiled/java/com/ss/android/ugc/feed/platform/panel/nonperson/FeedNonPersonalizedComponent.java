package com.ss.android.ugc.feed.platform.panel.nonperson;

import X.AbstractC1604130rqV;
import X.C01D1;
import X.C01GW;
import X.C0SR4;
import X.C1255920ims;
import X.C13LE;
import X.C1558520qew;
import X.C1566140qrE;
import X.C1566840qsM;
import X.C1567040qsg;
import X.C1601390rm5;
import X.C1601440rmA;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C299750Boz;
import X.C452501pT;
import X.C630740Ooa;
import X.C724750Sbp;
import X.EnumC452301pR;
import X.InterfaceC1554640qYg;
import X.InterfaceC1565950qqv;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tiktok.homepage.mainfragment.NonPersonalizedVM;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS140S0110000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedNonPersonalizedComponent extends BasePanelComponent implements IFeedNonPersonalizedAbility, InterfaceC1554640qYg {
    public static final C1566840qsM LLIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public final AssemVMLazy LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public Pair<String, Integer> LLILZIL;
    public final C01GW LLILZLL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0qsM] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeedNonPersonalizedComponent.class, "nonPersonalizedVM", "getNonPersonalizedVM()Lcom/bytedance/tiktok/homepage/mainfragment/NonPersonalizedVM;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLIZ = new Object() { // from class: X.0qsM
        };
    }

    public FeedNonPersonalizedComponent() {
        C01GW c01gwLIZIZ;
        C01GW c01gwLIZIZ2;
        C01GW c01gwLIZIZ3;
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(NonPersonalizedVM.class);
        this.LL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 1553), AFwS264S0000000_24.get$arr$(539), null, true);
        this.LLILLJJLI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(417));
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1554), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS140S0110000_24(false, (InterfaceC1565950qqv) this, 28));
        }
        this.LLILLL = c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa2 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1555), null);
            C1566140qrE.LIZJ(this, c630740Ooa2);
            c01gwLIZIZ2 = c630740Ooa2;
        } else {
            c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS140S0110000_24(false, (InterfaceC1565950qqv) this, 29));
        }
        this.LLILZ = c01gwLIZIZ2;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa3 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1556), null);
            C1566140qrE.LIZJ(this, c630740Ooa3);
            c01gwLIZIZ3 = c630740Ooa3;
        } else {
            c01gwLIZIZ3 = C452501pT.LIZIZ(new AwS140S0110000_24(false, (InterfaceC1565950qqv) this, 30));
        }
        this.LLILZLL = c01gwLIZIZ3;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.nonperson.IFeedNonPersonalizedAbility
    public final boolean HD2() {
        if (!bo(2)) {
            return false;
        }
        IPageStateAbility iPageStateAbility = (IPageStateAbility) this.LLILZ.getValue();
        if (iPageStateAbility != null) {
            iPageStateAbility.t4(true);
        }
        fo().LJIIIZ("interceptShowLoading...");
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.nonperson.IFeedNonPersonalizedAbility
    public final void mn0() {
        if (bo(4)) {
            this.LLILZIL = null;
            AssemVMLazy assemVMLazy = this.LL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZLLLIL;
            ((NonPersonalizedVM) assemVMLazy.getValue()).xQ2(0, null);
            fo().LJIIIZ("notifyOnRefreshResult>>> showToast");
        }
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1236297514) {
            return null;
        }
        return this;
    }

    public final AbstractC1604130rqV fo() {
        return (AbstractC1604130rqV) this.LLILLJJLI.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.feed.platform.panel.nonperson.IFeedNonPersonalizedAbility
    public final boolean P72() {
        T t;
        boolean zLIZJ = false;
        if (!ComplianceServiceProvider.LJI().LJIIJ(false)) {
            return false;
        }
        IFeedFetchDataAbility iFeedFetchDataAbility = (IFeedFetchDataAbility) this.LLILLL.getValue();
        C1255920ims<?> c1255920imsKB1 = iFeedFetchDataAbility != null ? iFeedFetchDataAbility.KB1() : null;
        if (!(c1255920imsKB1 instanceof C1601390rm5)) {
            c1255920imsKB1 = null;
        } else if (c1255920imsKB1 != null && (t = c1255920imsKB1.LL) != 0) {
            T t2 = t.mData;
            Boolean boolValueOf = Boolean.valueOf(t2 == 0 ? false : ((FeedItemList) t2).isNonPersonalized);
            if (boolValueOf != null && !(((Boolean) new AwS568S0100000_24(boolValueOf, 1552).invoke()).booleanValue() ^ C1567040qsg.LIZIZ())) {
                AbstractC1604130rqV abstractC1604130rqVFo = fo();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("changeNonPersonalized>>> error. dataState:");
                sbLIZ.append(boolValueOf);
                abstractC1604130rqVFo.LJIILL(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        this.LLILZIL = new Pair<>(getPanelContext().LIZ, 6);
        C1601440rmA c1601440rmA = new C1601440rmA();
        c1601440rmA.LIZ = 0;
        c1601440rmA.LIZIZ = 1;
        c1601440rmA.LJJIZ = "switch_to_non_personalize";
        c1601440rmA.LJJIIJ = false;
        if (c1255920imsKB1 == null) {
            fo().LJIILL("changeNonPersonalized>>> feedFetchPresenter=null");
        } else {
            zLIZJ = c1255920imsKB1.LIZJ(1, c1601440rmA.LIZ());
        }
        fo().LJIIIZ("changeNonPersonalized>>> sendRequest:" + zLIZJ);
        return true;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static final IFeedNonPersonalizedAbility m344do(InterfaceC665370Q7z interfaceC665370Q7z) {
        LLIZ.getClass();
        if (interfaceC665370Q7z == null) {
            return null;
        }
        return (IFeedNonPersonalizedAbility) C1558520qew.LIZ(interfaceC665370Q7z, IFeedNonPersonalizedAbility.class, null);
    }

    public final boolean bo(int i) {
        Pair<String, Integer> pair = this.LLILZIL;
        if (pair != null && Intrinsics.LJFF(pair.getFirst(), getPanelContext().LIZ) && (pair.getSecond().intValue() & i) != 0) {
            this.LLILZIL = pair.copy(pair.getFirst(), Integer.valueOf((~i) | pair.getSecond().intValue()));
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.nonperson.IFeedNonPersonalizedAbility
    public final void i02(Exception exc) {
        IPlayerComponentAbility iPlayerComponentAbilityX32;
        C0SR4 c0sr4Zv0;
        if (!bo(4)) {
            return;
        }
        this.LLILZIL = null;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLILZLL.getValue();
        if (iFeedPanelPlatformAbility != null && (c0sr4Zv0 = iFeedPanelPlatformAbility.Zv0()) != null) {
            c0sr4Zv0.setData(new ArrayList());
        }
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility2 = (IFeedPanelPlatformAbility) this.LLILZLL.getValue();
        if (iFeedPanelPlatformAbility2 != null && (iPlayerComponentAbilityX32 = iFeedPanelPlatformAbility2.x32()) != null) {
            iPlayerComponentAbilityX32.hs();
        }
        IPageStateAbility iPageStateAbility = (IPageStateAbility) this.LLILZ.getValue();
        if (iPageStateAbility != null) {
            iPageStateAbility.cD2(false);
        }
        IPageStateAbility iPageStateAbility2 = (IPageStateAbility) this.LLILZ.getValue();
        if (iPageStateAbility2 != null) {
            iPageStateAbility2.Ys2(exc);
        }
        fo().LJIIIZ("notifyShowLoadError...");
    }
}
