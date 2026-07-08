package com.ss.android.ugc.aweme.story.feed.immersive.panel.component;

import X.AbstractC712240Rwk;
import X.AnonymousClass0652;
import X.C01GW;
import X.C098200Yq;
import X.C0HTT;
import X.C0R9L;
import X.C0RF0;
import X.C0RGJ;
import X.C0S12;
import X.C0SR4;
import X.C0SZ8;
import X.C0T0K;
import X.C0VWC;
import X.C0VWN;
import X.C1189504l3;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1697810uHb;
import X.C189200o6;
import X.C2188811AlT;
import X.C360660ECa;
import X.C452501pT;
import X.C584120Mva;
import X.C584130Mvb;
import X.C626330OhT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C711550Rvd;
import X.C711910RwD;
import X.C711940RwG;
import X.C714420S0q;
import X.C738950Syj;
import X.C786410Ut5;
import X.InterfaceC1602960roc;
import X.InterfaceC469360Ias;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.IStorySafCompatAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.ProviderViewHolderCompatibility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedVHProxyAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.IStoryService;
import com.ss.android.ugc.aweme.story.api.IStoryHorizontalImmersiveDataAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS151S0101000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseUserFeedComponent extends BaseCellContentComponent<BaseUserFeedComponent> implements UserFeedViewPagerAbility, ProviderViewHolderCompatibility, IStoryHorizontalImmersiveDataAbility, IStorySafCompatAbility {
    public C0RF0 LLJJJJLIIL;
    public C711550Rvd LLJJL;
    public AwS151S0101000_11 LLJZ;
    public C0RGJ LLL;
    public final C630740Ooa LLJJLIIIJLLLLLLLZ = C628500Oky.LIZ(new AwS555S0100000_11(this, 895));
    public final C630740Ooa LLJL = C628500Oky.LIZ(new AwS555S0100000_11(this, 894));
    public final C01GW LLJLIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(190));
    public final C711910RwD LLJLILLLLZIIL = new C0VWC() { // from class: X.0RwD
        @Override // X.C0VWC
        public final void onStop(String str) {
        }

        @Override // X.C0VWC
        public final void LJIIJ(String str) {
            String eventType;
            InterfaceC1602960roc interfaceC1602960rocLIZIZ = C0VWN.LIZIZ(str);
            if (interfaceC1602960rocLIZIZ == null || (eventType = this.LIZ.lp().LJ.param.getEventType()) == null) {
                return;
            }
            interfaceC1602960rocLIZIZ.LIZ("enter_from", eventType);
        }
    };
    public final C01GW LLJLL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(192));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 896));
    public final C01GW LLJLLL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(194));
    public final C711940RwG LLJZIJLIL = new C711940RwG(this);
    public final C01GW LLLF = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(191));

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public abstract void hp(int i, C0RGJ c0rgj, C0RGJ c0rgj2);

    public abstract C714420S0q sp();

    public abstract void zp();

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public void Vo() {
        Fragment fragmentLIZLLL;
        if (this.LLJL.getValue() != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(lp().LIZJ, null), UserFeedViewPagerAbility.class, null);
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(lp().LIZJ, null), ProviderViewHolderCompatibility.class, null);
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(lp().LIZJ, null), IStoryHorizontalImmersiveDataAbility.class, null);
        }
        IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
        if (iDetailFeedSafService != null && (fragmentLIZLLL = iDetailFeedSafService.LIZLLL(lp().LIZJ)) != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLIZLLL, null), IStorySafCompatAbility.class, null);
            View view = fragmentLIZLLL.getView();
            if (view != null) {
                view.setTag(R.id.w9y, null);
            }
        }
        sp().LJJIIJZLJL(kp());
        ((LinkedHashMap) this.LLLF.getValue()).clear();
        InterfaceC1602960roc interfaceC1602960rocLIZIZ = C0VWN.LIZIZ("powerlist_fps_story_immersive_user_feed");
        if (interfaceC1602960rocLIZIZ != null) {
            interfaceC1602960rocLIZIZ.LJIIIIZZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility
    public final void bh1() {
        Object c098200Yq;
        int i = 0;
        IStoryService iStoryService = (IStoryService) PluggableExtentionKt.pluggableSpi$default(IStoryService.class, false, false, false, 14, null);
        Boolean boolValueOf = iStoryService != null ? Boolean.valueOf(iStoryService.LJJJLL()) : null;
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE) || boolValueOf == null) {
            return;
        }
        int i2 = -1;
        for (Aweme aweme : op().LJJJLZIJ()) {
            int i3 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            if (C0S12.LIZJ(aweme)) {
                i2 = i;
            }
            i = i3;
        }
        if (i2 != -1) {
            try {
                op().LJJJJL(i2);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.IStorySafCompatAbility
    public void j12() {
        AwS151S0101000_11 awS151S0101000_11 = this.LLJZ;
        if (awS151S0101000_11 != null) {
            awS151S0101000_11.invoke();
        }
        this.LLJZ = null;
    }

    public final C738950Syj kp() {
        return (C738950Syj) this.LLJLL.getValue();
    }

    public final C0RF0 lp() {
        C0RF0 c0rf0 = this.LLJJJJLIIL;
        if (c0rf0 != null) {
            return c0rf0;
        }
        "Property must be initialized before accessing".toString();
        throw new IllegalStateException("Property must be initialized before accessing");
    }

    public final UserFeedVHProxyAbility mp() {
        return (UserFeedVHProxyAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final C0SR4 op() {
        C711550Rvd c711550Rvd = this.LLJJL;
        if (c711550Rvd != null) {
            return c711550Rvd;
        }
        "Property must be initialized before accessing".toString();
        throw new IllegalStateException("Property must be initialized before accessing");
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility
    public final List<C0RGJ> vi() {
        ArrayList arrayList = new ArrayList();
        for (int childCount = sp().getChildCount() - 1; -1 < childCount; childCount--) {
            View childAt = sp().getChildAt(childCount);
            Object tag = childAt != null ? childAt.getTag(R.id.hu_) : null;
            if ((tag instanceof C0RGJ) && tag != null) {
                arrayList.add(tag);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility
    public final C0RGJ CV1() {
        int childCount = sp().getChildCount() - 1;
        while (true) {
            if (-1 >= childCount) {
                return null;
            }
            View childAt = sp().getChildAt(childCount);
            Object tag = childAt != null ? childAt.getTag(R.id.hu_) : null;
            C0RGJ c0rgj = tag instanceof C0RGJ ? (C0RGJ) tag : null;
            if (ep(sp().getCurrentItem() + 1, c0rgj)) {
                return c0rgj;
            }
            childCount--;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility
    public final C0RGJ HN0() {
        int childCount = sp().getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                return null;
            }
            View childAt = sp().getChildAt(i);
            Object tag = childAt != null ? childAt.getTag(R.id.hu_) : null;
            C0RGJ c0rgj = tag instanceof C0RGJ ? (C0RGJ) tag : null;
            if (ep(sp().getCurrentItem() - 1, c0rgj)) {
                return c0rgj;
            }
            i++;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility
    public final boolean Ka0() {
        return sp().getCurrentItem() + 1 < op().LJJJLZIJ().size();
    }

    @Override // com.ss.android.ugc.aweme.story.api.IStoryHorizontalImmersiveDataAbility
    public final Aweme LLLJ() {
        User author;
        FeedCollectionViewPagerAbility feedCollectionViewPagerAbility;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C0T0K.LIZIZ(pJ1());
        Aweme awemeLLLJ = (interfaceC665370Q7zLIZIZ == null || (feedCollectionViewPagerAbility = (FeedCollectionViewPagerAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, FeedCollectionViewPagerAbility.class, null)) == null) ? null : feedCollectionViewPagerAbility.LLLJ();
        if (awemeLLLJ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getNextAweme: author = ");
            User author2 = awemeLLLJ.getAuthor();
            sbLIZ.append(author2 != null ? author2.getNickname() : null);
            sbLIZ.append(", aid = ");
            sbLIZ.append(awemeLLLJ.getAid());
            C2188811AlT.LIZIZ(sbLIZ);
            return awemeLLLJ;
        }
        C0RGJ c0rgjCV1 = CV1();
        Aweme awemeLJIIIIZZ = c0rgjCV1 != null ? c0rgjCV1.LJIIIIZZ() : null;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getNextAweme: author = ");
        sbLIZ2.append((awemeLJIIIIZZ == null || (author = awemeLJIIIIZZ.getAuthor()) == null) ? null : author.getNickname());
        sbLIZ2.append(", aid = ");
        sbLIZ2.append(awemeLJIIIIZZ != null ? awemeLJIIIIZZ.getAid() : null);
        C2188811AlT.LIZIZ(sbLIZ2);
        return awemeLJIIIIZZ;
    }

    public final C0RGJ ip() {
        int childCount = sp().getChildCount() - 1;
        while (true) {
            if (-1 >= childCount) {
                return null;
            }
            View childAt = sp().getChildAt(childCount);
            Object tag = childAt != null ? childAt.getTag(R.id.hu_) : null;
            C0RGJ c0rgj = tag instanceof C0RGJ ? (C0RGJ) tag : null;
            if (ep(sp().getCurrentItem(), c0rgj)) {
                this.LLL = c0rgj;
                return c0rgj;
            }
            childCount--;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void jP() {
        /*
            r9 = this;
            X.0S0q r0 = r9.sp()
            int r0 = r0.getOffscreenPageLimit()
            r2 = 1
            if (r2 != r0) goto Lc
            return
        Lc:
            java.lang.Class<com.ss.android.ugc.aweme.IDetailFeedSafService> r3 = com.ss.android.ugc.aweme.IDetailFeedSafService.class
            r4 = 0
            r7 = 14
            r8 = 0
            r5 = r4
            r6 = r4
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.IDetailFeedSafService r1 = (com.ss.android.ugc.aweme.IDetailFeedSafService) r1
            r5 = 0
            if (r1 == 0) goto L63
            X.0RF0 r0 = r9.lp()
            androidx.fragment.app.Fragment r0 = r0.LIZJ
            androidx.fragment.app.Fragment r4 = r1.LIZLLL(r0)
            r3 = 0
            if (r4 == 0) goto L38
            android.os.Bundle r1 = r4.getArguments()
            if (r1 == 0) goto L38
            java.lang.String r0 = "use_saf"
            int r0 = r1.getInt(r0)
            if (r0 > r2) goto L39
        L38:
            r3 = 1
        L39:
            if (r4 == 0) goto L61
            android.view.View r1 = r4.getView()
            if (r1 == 0) goto L61
            r0 = 2131392437(0x7f0a77b5, float:1.8405502E38)
            java.lang.Object r1 = r1.getTag(r0)
        L48:
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 != 0) goto L4d
            r1 = r5
        L4d:
            if (r3 != 0) goto L65
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L65
            kotlin.jvm.internal.AwS151S0101000_11 r1 = new kotlin.jvm.internal.AwS151S0101000_11
            r0 = 8
            r1.<init>(r9, r0)
            r9.LLJZ = r1
            return
        L61:
            r1 = r5
            goto L48
        L63:
            r4 = r5
            goto L38
        L65:
            X.0S0q r0 = r9.sp()
            r0.setOffscreenPageLimit(r2)
            r9.LLJZ = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.immersive.panel.component.BaseUserFeedComponent.jP():void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public void onParentSet() {
        Fragment fragmentLIZLLL;
        super.onParentSet();
        if (this.LLJL.getValue() != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(lp().LIZJ, null), this, UserFeedViewPagerAbility.class, null, null);
            C1558520qew.LJII(C1558360qeg.LJFF(lp().LIZJ, null), this, ProviderViewHolderCompatibility.class, null, null);
            C1558520qew.LJII(C1558360qeg.LJFF(lp().LIZJ, null), this, IStoryHorizontalImmersiveDataAbility.class, null, null);
            IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
            if (iDetailFeedSafService == null || (fragmentLIZLLL = iDetailFeedSafService.LIZLLL(lp().LIZJ)) == null) {
                return;
            }
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLIZLLL, null), this, IStorySafCompatAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility
    public final C0RGJ pJ1() {
        C0RGJ c0rgjIK2;
        UserFeedVHProxyAbility userFeedVHProxyAbilityMp = mp();
        if (userFeedVHProxyAbilityMp == null || (c0rgjIK2 = userFeedVHProxyAbilityMp.iK2()) == null) {
            return ip();
        }
        this.LLL = c0rgjIK2;
        return c0rgjIK2;
    }

    public void tp() {
        sp().LIZLLL(kp());
        final InterfaceC1602960roc interfaceC1602960rocLIZ = C0VWN.LIZ("powerlist_fps_story_immersive_user_feed", false);
        interfaceC1602960rocLIZ.LJIIJ(this.LLJLILLLLZIIL);
        C360660ECa c360660ECa = new C360660ECa() { // from class: X.0RwF
            @Override // X.C360660ECa, X.InterfaceC469360Ias
            public final void onPageScrollStateChanged(int i) {
                if (i != 0) {
                    if (i != 1) {
                        interfaceC1602960rocLIZ.start();
                        return;
                    } else {
                        interfaceC1602960rocLIZ.start();
                        return;
                    }
                }
                interfaceC1602960rocLIZ.stop();
            }
        };
        if (kp().LIZ$0().contains(c360660ECa)) {
            return;
        }
        kp().LIZ$0().add(c360660ECa);
    }

    public final boolean up() {
        return Intrinsics.LJFF(lp().LJ.param.getFrom(), "STORY_ENTRANCE_ARCHIVE") && C1189504l3.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility
    public final C711940RwG Qc2() {
        return this.LLJZIJLIL;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility
    public final boolean Ed2(String str) {
        if (sp().getCurrentItem() > 0) {
            sp().setTag(R.id.e80, str);
            C626330OhT.LIZ(sp(), sp().getCurrentItem() - 1, lp().LIZJ);
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility
    public final C0RGJ LJJIJIL(String str) {
        boolean z;
        C0SZ8 c0sz8LJJIJIL;
        Object tag;
        C0SZ8 c0sz8LJJIJIL2;
        C0RGJ c0rgj;
        C0SZ8 c0sz8;
        C0RGJ c0rgj2;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        C0RGJ c0rgj3 = this.LLL;
        if (c0rgj3 != null) {
            c0sz8LJJIJIL = c0rgj3.LJJIJIL(str);
        } else {
            c0sz8LJJIJIL = null;
        }
        if ((c0sz8LJJIJIL instanceof C0RGJ) && (c0rgj2 = (C0RGJ) c0sz8LJJIJIL) != null) {
            return c0rgj2;
        }
        for (int childCount = sp().getChildCount() - 1; -1 < childCount; childCount--) {
            View childAt = sp().getChildAt(childCount);
            if (childAt != null) {
                tag = childAt.getTag(R.id.hu_);
            } else {
                tag = null;
            }
            if ((tag instanceof C0RGJ) && (c0sz8 = (C0SZ8) tag) != null) {
                c0sz8LJJIJIL2 = c0sz8.LJJIJIL(str);
            } else {
                c0sz8LJJIJIL2 = null;
            }
            if ((c0sz8LJJIJIL2 instanceof C0RGJ) && (c0rgj = (C0RGJ) c0sz8LJJIJIL2) != null) {
                return c0rgj;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility
    public final C0RGJ Q11(String str) {
        boolean z;
        Object tag;
        C0RGJ c0rgj;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        C0RGJ c0rgj2 = this.LLL;
        if (c0rgj2 != null && c0rgj2.LJJIJIL(str) != null) {
            return this.LLL;
        }
        for (int childCount = sp().getChildCount() - 1; -1 < childCount; childCount--) {
            View childAt = sp().getChildAt(childCount);
            if (childAt != null) {
                tag = childAt.getTag(R.id.hu_);
            } else {
                tag = null;
            }
            if ((tag instanceof C0RGJ) && (c0rgj = (C0RGJ) tag) != null && c0rgj.LJJIJIL(str) != null) {
                return c0rgj;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0070 A[EDGE_INSN: B:105:0x0070->B:30:0x0070 BREAK  A[LOOP:1: B:74:0x011e->B:85:0x0143], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0143 A[LOOP:1: B:74:0x011e->B:85:0x0143, LOOP_END] */
    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int ix(java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.immersive.panel.component.BaseUserFeedComponent.ix(java.lang.String):int");
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.ProviderViewHolderCompatibility
    public final void m51(Aweme aweme) {
        String aid = aweme.getAid();
        if (aid != null) {
            String nickname = null;
            if (AnonymousClass0652.LIZ(aid)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("recordLatestAweme, aid = ");
                sbLIZ.append(aid);
                sbLIZ.append(", nickName = ");
                User author = aweme.getAuthor();
                if (author != null) {
                    nickname = author.getNickname();
                }
                sbLIZ.append(nickname);
                C2188811AlT.LIZIZ(sbLIZ);
                ((HashMap) this.LLLF.getValue()).put(aid, new C584130Mvb(aweme, AFwS198S0000000_11.get$arr$(193)));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0Rvd, X.0SR4, androidx.viewpager.widget.PagerAdapter] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0Rvf] */
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        final C0RF0 c0rf0VK;
        UserFeedVHProxyAbility userFeedVHProxyAbilityMp = mp();
        if (userFeedVHProxyAbilityMp != null && (c0rf0VK = userFeedVHProxyAbilityMp.vK(view)) != null) {
            C714420S0q c714420S0qSp = sp();
            final Context context = sp().getContext();
            final LayoutInflater layoutInflaterNe = C786410Ut5.ne(sp().getContext());
            final ?? r6 = new C0HTT() { // from class: X.0Rvf
                @Override // X.C0HTT
                public final void LLIIL(Object obj) {
                    c0rf0VK.LIZIZ.LLIIL(obj);
                }
            };
            final Fragment fragment = c0rf0VK.LIZJ;
            final View.OnTouchListener onTouchListener = c0rf0VK.LIZLLL;
            final BaseFeedPageParams baseFeedPageParams = c0rf0VK.LJ;
            final C0R9L c0r9l = c0rf0VK.LJFF;
            ?? r3 = new C0SR4(context, layoutInflaterNe, r6, fragment, onTouchListener, baseFeedPageParams, c0r9l) { // from class: X.0Rvd
                @Override // X.C0SR4, X.AbstractC714000Rza
                public final void LJJJJI(View view2) {
                }

                @Override // X.C0SR4
                public final String LJJJLIIL() {
                    return "story_user_list_feed";
                }

                @Override // X.C0SR4
                public final List<C711420RvQ> LJJJJIZL() {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(C711200Rv4.LJ);
                    arrayList.add(new C711420RvQ() { // from class: X.0Rve
                        {
                            AFwS243S0000000_11.get$arr$(736);
                            AFwS243S0000000_11 aFwS243S0000000_11 = C711750Rvx.LJFF;
                            AFwS243S0000000_11.get$arr$(737);
                        }
                    });
                    arrayList.add(C711230Rv7.LJ);
                    arrayList.add(C711520Rva.LJ);
                    return arrayList;
                }

                @Override // X.C0SR4
                public final C711420RvQ LJJLI() {
                    return C711230Rv7.LJ;
                }

                @Override // X.C0SR4, X.InterfaceC692440REc
                public final Aweme getItem(int i) {
                    Object c098200Yq;
                    try {
                        c098200Yq = super.getItem(i);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    return (Aweme) c098200Yq;
                }

                @Override // X.C0SR4, X.AbstractC714000Rza
                public final void LJJJJ(int i, View view2) {
                    C0SZ8 c0sz8LJJLIIIIJ = C0SR4.LJJLIIIIJ(view2);
                    if (c0sz8LJJLIIIIJ != null) {
                        c0sz8LJJLIIIIJ.e1();
                    }
                }
            };
            this.LLJJL = r3;
            r3.LLJILJILJ = new InterfaceC713360RyY() { // from class: X.0RwE
                @Override // X.InterfaceC713360RyY
                public final ViewModelStoreOwner LLIIIILZ() {
                    return (ViewModelStoreOwner) this.LL.LLJLLIL.getValue();
                }

                @Override // androidx.lifecycle.LifecycleOwner
                public final Lifecycle getLifecycle() {
                    return new LifecycleRegistry(this.LL);
                }

                @Override // X.InterfaceC713360RyY
                public final InterfaceC665370Q7z k0() {
                    return C1558520qew.LJIIL(this.LL);
                }
            };
            c714420S0qSp.setAdapter(r3);
            sp().setTag(R.id.e80, "INVALID_TAG");
            C714420S0q c714420S0qSp2 = sp();
            c714420S0qSp2.LLIZLLLIL = true;
            c714420S0qSp2.LLL = 0;
            tp();
            zp();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility
    public boolean rf0(String str) {
        if (Ka0()) {
            sp().setTag(R.id.e80, str);
            C626330OhT.LIZ(sp(), sp().getCurrentItem() + 1, lp().LIZJ);
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility
    public final void vE1(AbstractC712240Rwk abstractC712240Rwk) {
        Object objRemove = ((Map) this.LLJLIL.getValue()).remove(abstractC712240Rwk);
        if (objRemove != null) {
            kp().LIZ$0().remove(objRemove);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility
    public final void yR(final AbstractC712240Rwk abstractC712240Rwk) {
        if (((Map) this.LLJLIL.getValue()).containsKey(abstractC712240Rwk)) {
            return;
        }
        InterfaceC469360Ias interfaceC469360Ias = new InterfaceC469360Ias(abstractC712240Rwk) { // from class: X.0Rwj
            public final AbstractC712240Rwk LL;

            {
                this.LL = abstractC712240Rwk;
            }

            @Override // X.InterfaceC469360Ias
            public final void onPageScrollStateChanged(int i) {
                this.LL.onPageScrollStateChanged(i);
            }

            @Override // X.InterfaceC469360Ias
            public final void onPageSelected(int i) {
                this.LL.onPageSelected(i);
            }

            @Override // X.InterfaceC469360Ias
            public final void onPageScrolled(int i, float f, int i2) {
                this.LL.onPageScrolled(i, f, i2);
            }
        };
        ((Map) this.LLJLIL.getValue()).put(abstractC712240Rwk, interfaceC469360Ias);
        kp().LIZ$0().add(interfaceC469360Ias);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.ProviderViewHolderCompatibility
    public final C584120Mva zk0(String str) {
        C584130Mvb c584130Mvb;
        if (str == null || (c584130Mvb = (C584130Mvb) ((LinkedHashMap) this.LLLF.getValue()).get(str)) == null) {
            return null;
        }
        lp().LIZ.getContext();
        return new C584120Mva(c584130Mvb);
    }

    private final boolean ep(int i, C0RGJ c0rgj) {
        Aweme item;
        Aweme awemeHm;
        if (c0rgj == null || (item = op().getItem(i)) == null || (awemeHm = c0rgj.hm()) == null) {
            return false;
        }
        return Intrinsics.LJFF(item.getAid(), awemeHm.getAid());
    }

    public final void LLFFF(int i, boolean z) {
        Object c098200Yq;
        try {
            if (sp().LLLIZZ) {
                sp().LJIIL();
            }
            sp().LLFFF(i, false);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.ProviderViewHolderCompatibility
    public final void gP1(Aweme aweme, AwS555S0100000_11 awS555S0100000_11) {
        String nickname;
        if (aweme == null || !((HashMap) this.LLLF.getValue()).containsKey(aweme.getAid())) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recordPostModePlayTimeAction, aid = ");
        sbLIZ.append(aweme.getAid());
        sbLIZ.append(", nickName = ");
        User author = aweme.getAuthor();
        if (author != null) {
            nickname = author.getNickname();
        } else {
            nickname = null;
        }
        sbLIZ.append(nickname);
        C2188811AlT.LIZIZ(sbLIZ);
        ((HashMap) this.LLLF.getValue()).put(aweme.getAid(), new C584130Mvb(aweme, awS555S0100000_11));
    }

    public boolean yp(Aweme aweme, String str) {
        String uid;
        User author;
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        return Intrinsics.LJFF(uid, str);
    }
}
