package com.ss.android.ugc.aweme.business.live.cell;

import X.C01GW;
import X.C0IVH;
import X.C0ZP4;
import X.C1152490g63;
import X.C1220000hqw;
import X.C1322110kVd;
import X.C13LE;
import X.C1572230r13;
import X.C1591220rVg;
import X.C1595960rdK;
import X.C1597900rgS;
import X.C1597910rgT;
import X.C1607470rvt;
import X.C1620910sHZ;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736950SvV;
import X.InterfaceC1594910rbd;
import X.InterfaceC1595940rdI;
import Y.ARunnableS119S0100000_19;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.base.ability.ISkylightListAbility;
import com.ss.android.ugc.aweme.base.ui.cell.BaseSkylightCell;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightContainerViewModel;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS62S0001000_24;

/* JADX INFO: loaded from: classes25.dex */
public abstract class BaseFollowingLiveSkylightCell<T extends InterfaceC1594910rbd> extends BaseSkylightCell<T> {
    public volatile boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public Boolean LLILZIL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(83));
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(57));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS568S0100000_24((BaseFollowingLiveSkylightCell) this, 148));
    public final C1620910sHZ LLJ = new C1620910sHZ(this, 6);
    public final C1620910sHZ LLJI = new C1620910sHZ(this, 5);
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24((BaseFollowingLiveSkylightCell) this, 149));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19((BaseFollowingLiveSkylightCell) this, 381));
    public final ARunnableS119S0100000_19 LLJILJILJ = new ARunnableS119S0100000_19(this, 29);

    public abstract ConstraintLayout U5();

    public abstract void a6();

    private final HomeTabAbility V5() {
        return (HomeTabAbility) this.LLIZLLLIL.getValue();
    }

    public void b6() {
        if (C1152490g63.LIZ()) {
            this.LLILLJJLI = false;
        }
    }

    public void c6() {
        if (C1152490g63.LIZ()) {
            e6();
        }
    }

    public final void e6() {
        FeedSkylightContainerViewModel feedSkylightContainerViewModel;
        InterfaceC1595940rdI interfaceC1595940rdI;
        FeedSkylightContainerViewModel feedSkylightContainerViewModel2;
        FeedSkylightContainerViewModel feedSkylightContainerViewModel3;
        ISkylightListAbility iSkylightListAbility;
        if (C0IVH.LIZIZ() && (((feedSkylightContainerViewModel3 = (FeedSkylightContainerViewModel) this.LLJILJIL.getValue()) == null || !feedSkylightContainerViewModel3.xQ2()) && (iSkylightListAbility = (ISkylightListAbility) this.LLJIJIL.getValue()) != null)) {
            if (((FeedSkylightListViewModel) new C736950SvV(C13LE.LIZ(FeedSkylightListViewModel.class), new AwS62S0001000_24(iSkylightListAbility.uH2(), 10), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(710), null, null, null).getValue()).LLLF) {
                return;
            }
        }
        if ((C1152490g63.LIZ() && this.LLILLJJLI) || (feedSkylightContainerViewModel = (FeedSkylightContainerViewModel) this.LLJILJIL.getValue()) == null || !feedSkylightContainerViewModel.xQ2()) {
            return;
        }
        this.LLILLJJLI = true;
        a6();
        if (C1597900rgS.LIZ(C1597910rgT.LIZ())) {
            return;
        }
        T item = getItem();
        if (!(item instanceof InterfaceC1595940rdI) || (interfaceC1595940rdI = (InterfaceC1595940rdI) item) == null) {
            return;
        }
        boolean zLIZ = C1595960rdK.LIZ(interfaceC1595940rdI, C1597910rgT.LIZ().LIZJ);
        C1597910rgT.LIZ().LIZLLL(zLIZ ? 0 : 3, zLIZ, true);
        if (this.LLILLL && (feedSkylightContainerViewModel2 = (FeedSkylightContainerViewModel) this.LLJILJIL.getValue()) != null && feedSkylightContainerViewModel2.xQ2()) {
            C1597900rgS.LJFF(C1597910rgT.LIZ(), zLIZ);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        if (C1591220rVg.LIZLLL()) {
            HomeTabAbility homeTabAbilityV5 = V5();
            if (homeTabAbilityV5 != null) {
                homeTabAbilityV5.tx0(this.LLJ);
            }
            HomeTabAbility homeTabAbilityV52 = V5();
            if (homeTabAbilityV52 != null) {
                homeTabAbilityV52.Ik0(this.LLJI);
            }
            C1572230r13.LIZ((List) this.LLIZ.getValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell, com.bytedance.ies.powerlist.PowerCell
    public void onItemViewCreated() {
        C0ZP4 c0zp4YQ2;
        super.onItemViewCreated();
        if (C1607470rvt.LIZ().followingSkyFixVersion <= 0) {
            View view = this.itemView;
            ViewGroup viewGroup = view instanceof ConstraintLayout ? (ViewGroup) view : null;
            if (viewGroup != null) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
            ConstraintLayout constraintLayoutU5 = U5();
            if (constraintLayoutU5 != null) {
                constraintLayoutU5.setClipChildren(false);
                constraintLayoutU5.setClipToPadding(false);
            }
        }
        if (!C1591220rVg.LIZLLL()) {
            FeedSkylightContainerViewModel feedSkylightContainerViewModel = (FeedSkylightContainerViewModel) this.LLJILJIL.getValue();
            if (feedSkylightContainerViewModel != null) {
                feedSkylightContainerViewModel.yQ2(null, new AwS603S0100000_24(this, (BaseFollowingLiveSkylightCell<InterfaceC1594910rbd>) 609));
                return;
            }
            return;
        }
        FeedSkylightContainerViewModel feedSkylightContainerViewModel2 = (FeedSkylightContainerViewModel) this.LLJILJIL.getValue();
        if (feedSkylightContainerViewModel2 == null || (c0zp4YQ2 = feedSkylightContainerViewModel2.yQ2(this, new AwS603S0100000_24(this, (BaseFollowingLiveSkylightCell<InterfaceC1594910rbd>) 608))) == null) {
            return;
        }
        ((List) this.LLIZ.getValue()).add(c0zp4YQ2);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public void onPause() {
        super.onPause();
        W5(false);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.cell.BaseSkylightCell, com.bytedance.ies.powerlist.PowerCell
    public void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        HomeTabAbility homeTabAbilityV5 = V5();
        if (homeTabAbilityV5 != null) {
            homeTabAbilityV5.ao(this.LLJ);
        }
        HomeTabAbility homeTabAbilityV52 = V5();
        if (homeTabAbilityV52 != null) {
            homeTabAbilityV52.UC1(this.LLJI);
        }
        this.LLILZ = true;
        this.LLILLL = true;
        HandlerHook.viewPost(this.itemView, this.LLJILJILJ);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        HomeTabAbility homeTabAbilityV5 = V5();
        if (homeTabAbilityV5 != null) {
            homeTabAbilityV5.tx0(this.LLJ);
        }
        HomeTabAbility homeTabAbilityV52 = V5();
        if (homeTabAbilityV52 != null) {
            homeTabAbilityV52.Ik0(this.LLJI);
        }
        this.LLILZ = false;
        this.LLILLJJLI = false;
        this.LLILLL = false;
        this.LLILZIL = Boolean.FALSE;
        HandlerHook.viewRemoveCallbacks(this.itemView, this.LLJILJILJ);
        if (C1591220rVg.LIZLLL()) {
            C1572230r13.LIZ((List) this.LLIZ.getValue());
        }
    }

    public final void W5(boolean z) {
        if (!C1152490g63.LIZ() || !this.LLILZ || z == this.LLILLL) {
            return;
        }
        this.LLILLL = z;
        if (z) {
            e6();
        } else {
            this.LLILLJJLI = false;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public void onResume(boolean z) {
        super.onResume(z);
        W5(true);
    }

    public final void X5(List<String> list, C1322110kVd c1322110kVd) {
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJJIIJ(list, c1322110kVd, "follow_window_avatar", (String) this.LLILZLL.getValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d6(java.lang.String r6, java.lang.String r7, boolean r8) {
        /*
            r5 = this;
            java.lang.String r4 = "Following"
            java.lang.String r3 = "HOME"
            r2 = 1
            r1 = 0
            if (r8 == 0) goto L2a
            boolean r0 = android.text.TextUtils.equals(r7, r4)
            if (r0 == 0) goto L41
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r0 = r5.V5()
            if (r0 == 0) goto L41
            boolean r0 = r0.ft0(r3)
            if (r0 != r2) goto L41
        L1a:
            boolean r0 = android.text.TextUtils.equals(r6, r4)
        L1e:
            if (r2 == 0) goto L24
            r5.onResume(r1)
        L23:
            return
        L24:
            if (r0 == 0) goto L23
            r5.onPause()
            return
        L2a:
            boolean r0 = android.text.TextUtils.equals(r7, r3)
            if (r0 == 0) goto L41
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r0 = r5.V5()
            if (r0 == 0) goto L41
            boolean r0 = r0.ft0(r4)
            if (r0 != r2) goto L41
        L3c:
            boolean r0 = android.text.TextUtils.equals(r6, r3)
            goto L1e
        L41:
            r2 = 0
            if (r8 == 0) goto L3c
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.business.live.cell.BaseFollowingLiveSkylightCell.d6(java.lang.String, java.lang.String, boolean):void");
    }
}
