package com.ss.android.ugc.feed.platform.panel.viewpager;

import X.AbstractC1604130rqV;
import X.AbstractC1616100s9o;
import X.AnonymousClass0956;
import X.C01GW;
import X.C08TN;
import X.C0BPE;
import X.C0BSY;
import X.C0CM3;
import X.C0CME;
import X.C0CMJ;
import X.C0RD6;
import X.C0RGX;
import X.C0SR4;
import X.C0SZ8;
import X.C0T0K;
import X.C0T0X;
import X.C0T21;
import X.C0T6T;
import X.C0T6U;
import X.C0T6V;
import X.C1213680hgk;
import X.C1221204qA;
import X.C1558520qew;
import X.C1559420qgO;
import X.C1566140qrE;
import X.C1591220rVg;
import X.C1600760rl4;
import X.C1604000rqI;
import X.C1615480s8o;
import X.C1615960s9a;
import X.C1615970s9b;
import X.C1616000s9e;
import X.C1616020s9g;
import X.C1616140s9s;
import X.C1616170s9v;
import X.C1618440sDa;
import X.C1AW1;
import X.C1ER1;
import X.C2093608Ic;
import X.C21603319gd;
import X.C2189821An6;
import X.C2214201BlK;
import X.C2548709yn;
import X.C299750Boz;
import X.C312240CLu;
import X.C452501pT;
import X.C630740Ooa;
import X.C715140S3k;
import X.C729510SjV;
import X.C741350T6f;
import X.C786410Ut5;
import X.C799570VYd;
import X.EnumC1616060s9k;
import X.EnumC452301pR;
import X.InterfaceC1368705Xh;
import X.InterfaceC1554640qYg;
import X.InterfaceC1565950qqv;
import X.InterfaceC1600810rl9;
import X.InterfaceC1616070s9l;
import X.InterfaceC1616160s9u;
import X.InterfaceC21604719gr;
import X.InterfaceC494301wD;
import X.InterfaceC497601wk;
import X.InterfaceC665370Q7z;
import X.InterfaceC706770Rnv;
import X.InterfaceC743730TFj;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import com.ss.android.ugc.aweme.story.api.IStoryHorizontalImmersiveDataAbility;
import com.ss.android.ugc.feed.platform.monitor.infra.FeedInfraTimingSensor;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS55S0001000_12;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class ViewPagerPanelComponent extends BasePanelUIComponent implements InterfaceC743730TFj, IViewPagerComponentAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ int LLJZ = 0;
    public final C01GW LLJIJIL;
    public VerticalViewPager LLJILJIL;
    public boolean LLJILJILJ;
    public int LLJILLL;
    public Object LLJJ;
    public C0SZ8 LLJJI;
    public int LLJJIII;
    public C0SZ8 LLJJIJI;
    public int LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public String LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public final CopyOnWriteArrayList<InterfaceC1616070s9l> LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW<Runnable> LLJLL;
    public AnonymousClass0956 LLJLLIL;
    public final C01GW LLJLLL;

    @Override // X.InterfaceC743730TFj
    public final void Bg(Activity activity, Fragment fragment) {
    }

    @Override // X.InterfaceC743730TFj
    public final void L() {
    }

    @Override // X.InterfaceC743730TFj
    public final void LLLZIL() {
    }

    @Override // X.InterfaceC743730TFj
    public final void M() {
    }

    @Override // X.InterfaceC743730TFj
    public final void M1(Configuration configuration) {
    }

    @Override // X.InterfaceC743730TFj
    public final void Mf(Bundle bundle) {
    }

    @Override // X.InterfaceC743730TFj
    public final void Re(Bundle bundle) {
    }

    @Override // X.InterfaceC743730TFj
    public final void Tg() {
    }

    @Override // X.InterfaceC743730TFj
    public final void cq() {
    }

    @Override // X.InterfaceC743730TFj
    public final void dd() {
    }

    @Override // X.InterfaceC743730TFj
    public final void fl() {
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final void pN0() {
        this.LLJJJ = false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1889187972) {
            return null;
        }
        return this;
    }

    @Override // X.InterfaceC743730TFj
    public final void w4() {
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final C0SZ8 D() {
        VerticalViewPager verticalViewPager = this.LLJILJIL;
        if (verticalViewPager == null || verticalViewPager.getCurrentItem() < 1) {
            return null;
        }
        for (int childCount = verticalViewPager.getChildCount() - 1; -1 < childCount; childCount--) {
            Object objC12 = C12(childCount);
            C0SZ8 c0sz8 = objC12 instanceof C0SZ8 ? (C0SZ8) objC12 : null;
            if (Go(verticalViewPager.getCurrentItem() - 1, c0sz8)) {
                return c0sz8;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final C0SZ8 F() {
        VerticalViewPager verticalViewPager = this.LLJILJIL;
        if (verticalViewPager == null) {
            return null;
        }
        for (int childCount = verticalViewPager.getChildCount() - 1; -1 < childCount; childCount--) {
            Object objC12 = C12(childCount);
            C0SZ8 c0sz8 = objC12 instanceof C0SZ8 ? (C0SZ8) objC12 : null;
            if (Go(verticalViewPager.getCurrentItem() + 1, c0sz8)) {
                return c0sz8;
            }
        }
        return null;
    }

    public final C0SZ8 Jo() {
        VerticalViewPager verticalViewPager = this.LLJILJIL;
        if (verticalViewPager == null) {
            return null;
        }
        int i = this.LLJJIII;
        if (i > 0 && C2548709yn.LIZ == 2 && i == verticalViewPager.getCurrentItem()) {
            return this.LLJJIJI;
        }
        if (Go(verticalViewPager.getCurrentItem(), this.LLJJIJI)) {
            this.LLJJIII = verticalViewPager.getCurrentItem();
            return this.LLJJIJI;
        }
        for (int childCount = verticalViewPager.getChildCount() - 1; -1 < childCount; childCount--) {
            Object objC12 = C12(childCount);
            C0SZ8 c0sz8 = objC12 instanceof C0SZ8 ? (C0SZ8) objC12 : null;
            if (Go(verticalViewPager.getCurrentItem(), c0sz8)) {
                return c0sz8;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final boolean KT0() {
        VerticalViewPager verticalViewPager;
        VerticalViewPager verticalViewPager2 = this.LLJILJIL;
        if (verticalViewPager2 == null || verticalViewPager2.getScrollState() != 0 || (verticalViewPager = this.LLJILJIL) == null) {
            return false;
        }
        return verticalViewPager.LJJIIJ();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final C0SZ8 LJLIL() {
        if (!((Boolean) C1221204qA.LIZIZ.getValue()).booleanValue()) {
            return Jo();
        }
        C0SZ8 c0sz8 = this.LLJJI;
        if (c0sz8 != null) {
            return c0sz8;
        }
        C0SZ8 c0sz8Jo = Jo();
        this.LLJJI = c0sz8Jo;
        return c0sz8Jo;
    }

    public final PageDispatcher Lo() {
        return (PageDispatcher) this.LLJLLL.getValue();
    }

    public final IFeedPanelPlatformAbility No() {
        return (IFeedPanelPlatformAbility) this.LLJIJIL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final void X20() {
        C0SZ8 c0sz8LJLIL;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        UserFeedViewPagerAbility userFeedViewPagerAbility;
        C0SR4 c0sr4Zv0;
        VerticalViewPager verticalViewPager = this.LLJILJIL;
        if (verticalViewPager == null) {
            return;
        }
        int currentItem = verticalViewPager.getCurrentItem();
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityNo = No();
        int count = (iFeedPanelPlatformAbilityNo == null || (c0sr4Zv0 = iFeedPanelPlatformAbilityNo.Zv0()) == null) ? 0 : c0sr4Zv0.getCount();
        if (1 > currentItem || currentItem >= count) {
            InterfaceC706770Rnv interfaceC706770RnvLJJIIJ = C1618440sDa.LIZIZ.LJJIIJ();
            C2189821An6 c2189821An6 = getPanelContext().LIZJ;
            if (interfaceC706770RnvLJJIIJ.LJIILLIIL(c2189821An6 != null ? c2189821An6.getFrom() : null) && (c0sz8LJLIL = LJLIL()) != null && (interfaceC665370Q7zLIZIZ = C0T0K.LIZIZ(c0sz8LJLIL)) != null && (userFeedViewPagerAbility = (UserFeedViewPagerAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, UserFeedViewPagerAbility.class, null)) != null) {
                userFeedViewPagerAbility.Ed2("auto");
            }
        } else {
            verticalViewPager.setCurrentItemWithDefaultVelocity(currentItem - 1);
        }
        ((AbstractC1604130rqV) this.LLJLILLLLZIIL.getValue()).LJIIJJI(new AwS55S0001000_12(currentItem, 3));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility
    public final void bY1() {
        VerticalViewPager verticalViewPager = this.LLJILJIL;
        if (verticalViewPager != null) {
            verticalViewPager.setOffscreenPageLimit(1);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final boolean cA0() {
        VerticalViewPager verticalViewPager = this.LLJILJIL;
        if (verticalViewPager == null) {
            return false;
        }
        int childCount = verticalViewPager.getChildCount();
        C0SZ8 c0sz8 = null;
        for (int i = 0; i < childCount; i++) {
            Object objC12 = C12(i);
            C0SZ8 c0sz82 = objC12 instanceof C0SZ8 ? (C0SZ8) objC12 : null;
            if (Go(verticalViewPager.getCurrentItem(), c0sz82)) {
                c0sz8 = c0sz82;
            }
        }
        boolean z = this.LLJJIJI != c0sz8;
        this.LLJJIJI = c0sz8;
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00f2 A[PHI: r2
      0x00f2: PHI (r2v1 boolean) = (r2v0 boolean), (r2v0 boolean), (r2v2 boolean) binds: [B:39:0x00ab, B:60:0x00ea, B:62:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean rH() {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.viewpager.ViewPagerPanelComponent.rH():boolean");
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final List<C0SZ8> vi() {
        ArrayList arrayList = new ArrayList();
        VerticalViewPager verticalViewPager = this.LLJILJIL;
        if (verticalViewPager == null) {
            return arrayList;
        }
        for (int childCount = verticalViewPager.getChildCount() - 1; -1 < childCount; childCount--) {
            Object objC12 = C12(childCount);
            if ((objC12 instanceof C0SZ8) && objC12 != null) {
                arrayList.add(objC12);
            }
        }
        return arrayList;
    }

    public ViewPagerPanelComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS556S0100000_12((InterfaceC1565950qqv) this, 660), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C0T6U(false, this));
        }
        this.LLJIJIL = c01gwLIZIZ;
        this.LLJJIII = -1;
        this.LLJJJJ = C452501pT.LIZIZ(new C1559420qgO(this));
        this.LLJJJJJIL = C452501pT.LIZIZ(new C741350T6f(this));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new C1213680hgk(this));
        this.LLJJL = C452501pT.LIZIZ(new C1600760rl4(this));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 659));
        this.LLJL = -1;
        this.LLJLIL = new CopyOnWriteArrayList<>();
        this.LLJLILLLLZIIL = C452501pT.LIZ(EnumC452301pR.NONE, new C1615480s8o());
        this.LLJLL = C452501pT.LIZIZ(new C0T6T(this));
        this.LLJLLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1575));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final C0SZ8 FR() {
        C0SZ8 c0sz8LJLIL = LJLIL();
        if (c0sz8LJLIL == null || BaseListFragmentPanel.LLIZLLLIL(c0sz8LJLIL)) {
            return null;
        }
        return c0sz8LJLIL;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final Aweme J41() {
        int iLJLJJL;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityNo = No();
        C0SR4 c0sr4Zv0 = iFeedPanelPlatformAbilityNo != null ? iFeedPanelPlatformAbilityNo.Zv0() : null;
        VerticalViewPager verticalViewPager = this.LLJILJIL;
        if (verticalViewPager == null) {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityNo2 = No();
            if (iFeedPanelPlatformAbilityNo2 != null) {
                iLJLJJL = iFeedPanelPlatformAbilityNo2.LJLJJL();
            }
            return null;
        }
        iLJLJJL = verticalViewPager.getCurrentItem();
        if (iLJLJJL > 0 && c0sr4Zv0 != null) {
            return c0sr4Zv0.getItem(iLJLJJL - 1);
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility
    public final void K62() {
        VerticalViewPager verticalViewPagerLIZIZ = C0T0X.LIZIZ(this);
        if (verticalViewPagerLIZIZ != null) {
            verticalViewPagerLIZIZ.LLLLLLL.LIZ = null;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final Aweme LJIIIIZZ() {
        C0SZ8 c0sz8LJLIL = LJLIL();
        if (c0sz8LJLIL == null) {
            return null;
        }
        return c0sz8LJLIL.getAweme();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility
    public final int LJIL() {
        VerticalViewPager verticalViewPagerLIZIZ = C0T0X.LIZIZ(this);
        if (verticalViewPagerLIZIZ != null) {
            return verticalViewPagerLIZIZ.getCurrentItem();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility
    public final PagerAdapter LJJLIIIJL() {
        VerticalViewPager verticalViewPagerLIZIZ = C0T0X.LIZIZ(this);
        if (verticalViewPagerLIZIZ != null) {
            return verticalViewPagerLIZIZ.getAdapter();
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility
    public final int LLLIIIL() {
        VerticalViewPager verticalViewPagerLIZIZ = C0T0X.LIZIZ(this);
        if (verticalViewPagerLIZIZ != null) {
            return verticalViewPagerLIZIZ.getScrollState();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final Aweme LLLLLJLJLL() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityNo = No();
        C0SR4 c0sr4Zv0 = iFeedPanelPlatformAbilityNo != null ? iFeedPanelPlatformAbilityNo.Zv0() : null;
        VerticalViewPager verticalViewPager = this.LLJILJIL;
        if (verticalViewPager == null) {
            return null;
        }
        Aweme item = c0sr4Zv0 != null ? c0sr4Zv0.getItem(verticalViewPager.getCurrentItem()) : null;
        Aweme awemeAG2 = aG2(item);
        return awemeAG2 != null ? awemeAG2 : item;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility
    public final int MC0() {
        VerticalViewPager verticalViewPagerLIZIZ = C0T0X.LIZIZ(this);
        if (verticalViewPagerLIZIZ != null) {
            return verticalViewPagerLIZIZ.getExpectedAdapterCount();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility
    public final InterfaceC1368705Xh Ru() {
        return C0T0X.LIZIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility
    public final int getHeight() {
        VerticalViewPager verticalViewPagerLIZIZ = C0T0X.LIZIZ(this);
        if (verticalViewPagerLIZIZ != null) {
            return verticalViewPagerLIZIZ.getHeight();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility
    public final VerticalViewPager j51() {
        return C0T0X.LIZIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        VerticalViewPager verticalViewPager;
        List<InterfaceC1616160s9u> list;
        super.onDestroy();
        VerticalViewPager verticalViewPager2 = this.LLJILJIL;
        if (verticalViewPager2 != null && (list = verticalViewPager2.LLLLLILLIL) != null) {
            ((CopyOnWriteArrayList) list).clear();
        }
        if (this.LLJLL.isInitialized() && (verticalViewPager = this.LLJILJIL) != null) {
            HandlerHook.viewRemoveCallbacks(verticalViewPager, this.LLJLL.getValue());
        }
        this.LLJLIL.clear();
        if (C1591220rVg.LIZIZ()) {
            VerticalViewPager verticalViewPager3 = this.LLJILJIL;
            if (verticalViewPager3 != null) {
                verticalViewPager3.setOnGenericMotionListener(null);
            }
            this.LLJJIJI = null;
            this.LLJJI = null;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new Runnable() { // from class: X.0s9f
            public final void LIZ() {
                this.LL.No();
                ((Boolean) C1221204qA.LIZIZ.getValue()).booleanValue();
                int i = C2548709yn.LIZ;
                new Object() { // from class: X.0s9z
                }.getClass();
                C1602860roS.LIZ.getClass();
                if (C1602860roS.LJ()) {
                    C1832307Fp.LIZ.getClass();
                    if (!C1832307Fp.LIZIZ() && !C1832307Fp.LIZ()) {
                        ((Boolean) C07DE.LIZIZ.getValue()).booleanValue();
                    }
                }
                C1238904t1.LIZ();
                C1E29.LIZIZ(true, true);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ViewPagerPanelComponent@376b.onParentSet$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ViewPagerPanelComponent@376b.onParentSet$1");
            }
        });
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final C0SZ8 Pn2() {
        return this.LLJJIJI;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final boolean Vo2() {
        return this.LLJJJ;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final String getEnterMethod() {
        return this.LLJJJIL;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility
    public final View getView() {
        return this.LLJILJIL;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final boolean ic() {
        return this.LLJJIJIL;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final int m12() {
        return this.LLJJIJIIJIL;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final void Bv0(InterfaceC1616070s9l interfaceC1616070s9l) {
        if (this.LLJLIL.contains(interfaceC1616070s9l)) {
            return;
        }
        this.LLJLIL.add(interfaceC1616070s9l);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final Object C12(int i) {
        View childAt;
        VerticalViewPager verticalViewPager = this.LLJILJIL;
        if (verticalViewPager != null && (childAt = verticalViewPager.getChildAt(i)) != null) {
            return childAt.getTag(R.id.hu_);
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final void CS0(AbstractC1616100s9o abstractC1616100s9o) {
        PageDispatcher pageDispatcherLo = Lo();
        if (pageDispatcherLo != null && !pageDispatcherLo.LLILZ.contains(abstractC1616100s9o)) {
            pageDispatcherLo.LLILZ.add(abstractC1616100s9o);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility
    public final void Em(boolean z) {
        VerticalViewPager verticalViewPagerLIZIZ = C0T0X.LIZIZ(this);
        if (verticalViewPagerLIZIZ != null) {
            verticalViewPagerLIZIZ.setDisableScroll(z);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final C0SZ8 LJJIJIL(String str) {
        C0SZ8 c0sz8;
        C0SZ8 c0sz8LJJIJIL;
        VerticalViewPager verticalViewPager = this.LLJILJIL;
        if (verticalViewPager == null) {
            return null;
        }
        int childCount = verticalViewPager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Object objC12 = C12(i);
            if ((objC12 instanceof C0SZ8) && (c0sz8 = (C0SZ8) objC12) != null && c0sz8.hm() != null) {
                if (C2093608Ic.LIZJ(c0sz8.hm().getAid(), str) && !C729510SjV.LJJIIZ(c0sz8.hm())) {
                    return c0sz8;
                }
                if (C729510SjV.LJJIIZ(c0sz8.hm()) && (c0sz8LJJIJIL = c0sz8.LJJIJIL(str)) != null) {
                    return c0sz8LJJIJIL;
                }
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final boolean Mo1(int i) {
        C21603319gd c21603319gd;
        VerticalViewPager verticalViewPager = this.LLJILJIL;
        if (verticalViewPager == null) {
            return false;
        }
        C1616140s9s c1616140s9s = verticalViewPager.LLLLLLL;
        c1616140s9s.getClass();
        if (!C0BSY.LIZ || !c1616140s9s.LIZIZ || (c21603319gd = c1616140s9s.LIZ) == null || c21603319gd.LIZIZ != i) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final Aweme OO0(Aweme aweme) {
        C0SR4 c0sr4Zv0;
        int iLJLJJL;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityNo = No();
        if (iFeedPanelPlatformAbilityNo == null || (c0sr4Zv0 = iFeedPanelPlatformAbilityNo.Zv0()) == null) {
            return null;
        }
        VerticalViewPager verticalViewPager = this.LLJILJIL;
        if (verticalViewPager != null) {
            iLJLJJL = verticalViewPager.getCurrentItem();
        } else {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityNo2 = No();
            if (iFeedPanelPlatformAbilityNo2 != null) {
                iLJLJJL = iFeedPanelPlatformAbilityNo2.LJLJJL();
            } else {
                iLJLJJL = 0;
            }
        }
        Aweme item = c0sr4Zv0.getItem(iLJLJJL);
        if (item == aweme || LLLLLJLJLL() == aweme) {
            return c0sr4Zv0.getItem(iLJLJJL + 2);
        }
        return item;
    }

    public final void Oo(View view) {
        if (!Intrinsics.LJFF(this.LLJILJIL, view)) {
            VerticalViewPager verticalViewPager = (VerticalViewPager) view;
            this.LLJILJIL = verticalViewPager;
            verticalViewPager.setFixDispatchFirstSelected(true);
            VerticalViewPager verticalViewPager2 = this.LLJILJIL;
            if (verticalViewPager2 != null) {
                ListProtector.add(verticalViewPager2.LLLLLILLIL, 0, new C1615960s9a(this));
            }
            FeedInfraTimingSensor.LL.getClass();
            if (C1AW1.LIZJ()) {
                Bv0(new C715140S3k(this));
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final Aweme Rh(Aweme aweme) {
        C0SR4 c0sr4Zv0;
        int iLJLJJL;
        C0SZ8 c0sz8F;
        FeedCollectionViewPagerAbility feedCollectionViewPagerAbility;
        if ((getPanelContext().LJ instanceof InterfaceC1600810rl9) && C08TN.LIZ().LJJLIIIJLJLI > 0) {
            if (((Boolean) this.LLJJJJLIIL.getValue()).booleanValue()) {
                IStoryHorizontalImmersiveDataAbility iStoryHorizontalImmersiveDataAbility = (IStoryHorizontalImmersiveDataAbility) this.LLJJJJJIL.getValue();
                if (iStoryHorizontalImmersiveDataAbility == null) {
                    return null;
                }
                return iStoryHorizontalImmersiveDataAbility.LLLJ();
            }
            if (((Boolean) this.LLJJL.getValue()).booleanValue()) {
                InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C0T0K.LIZIZ(LJLIL());
                if (interfaceC665370Q7zLIZIZ == null || (feedCollectionViewPagerAbility = (FeedCollectionViewPagerAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, FeedCollectionViewPagerAbility.class, null)) == null) {
                    return null;
                }
                return feedCollectionViewPagerAbility.LLLJ();
            }
        }
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityNo = No();
        if (iFeedPanelPlatformAbilityNo == null || (c0sr4Zv0 = iFeedPanelPlatformAbilityNo.Zv0()) == null) {
            return null;
        }
        VerticalViewPager verticalViewPager = this.LLJILJIL;
        if (verticalViewPager != null) {
            iLJLJJL = verticalViewPager.getCurrentItem();
        } else {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityNo2 = No();
            if (iFeedPanelPlatformAbilityNo2 != null) {
                iLJLJJL = iFeedPanelPlatformAbilityNo2.LJLJJL();
            } else {
                iLJLJJL = 0;
            }
        }
        Aweme item = c0sr4Zv0.getItem(iLJLJJL);
        if (item == aweme || LLLLLJLJLL() == aweme) {
            item = c0sr4Zv0.getItem(iLJLJJL + 1);
            if (C729510SjV.LJJIIZ(item) && (c0sz8F = F()) != null) {
                return c0sz8F.LJIIIIZZ();
            }
        }
        return item;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final void Xl0(InterfaceC1616070s9l interfaceC1616070s9l) {
        this.LLJLIL.remove(interfaceC1616070s9l);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final Aweme aG2(Aweme aweme) {
        UserStory userStory;
        if (C729510SjV.LJJIIZ(aweme)) {
            C0SZ8 c0sz8LJLIL = LJLIL();
            if (c0sz8LJLIL != null) {
                return c0sz8LJLIL.LJIIIIZZ();
            }
            if (aweme != null && (userStory = aweme.getUserStory()) != null) {
                if (UserStoryKt.currentStory(userStory) != null) {
                    return UserStoryKt.currentStory(userStory);
                }
                if (userStory.getStories().size() == 0) {
                    return null;
                }
                if (UserStoryKt.currentStory(userStory) == null) {
                    return (Aweme) ListProtector.get(userStory.getStories(), 0);
                }
                return UserStoryKt.currentStory(userStory);
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final Boolean aT1(int i) {
        C21603319gd c21603319gd;
        int i2;
        Object obj;
        VerticalViewPager verticalViewPager = this.LLJILJIL;
        boolean z = false;
        if (verticalViewPager != null) {
            C1616140s9s c1616140s9s = verticalViewPager.LLLLLLL;
            c1616140s9s.getClass();
            if (C0BSY.LIZ) {
                int i3 = 0;
                while (true) {
                    if (i3 < c1616140s9s.LIZJ.LLJILJILJ.size()) {
                        if (((C21603319gd) ListProtector.get(c1616140s9s.LIZJ.LLJILJILJ, i3)).LIZIZ == i) {
                            c21603319gd = (C21603319gd) ListProtector.get(c1616140s9s.LIZJ.LLJILJILJ, i3);
                            break;
                        }
                        i3++;
                    } else {
                        c21603319gd = null;
                        break;
                    }
                }
                C21603319gd c21603319gd2 = c1616140s9s.LIZ;
                if (c21603319gd2 != null && c21603319gd != null && (i2 = c21603319gd2.LIZIZ) == i && c21603319gd.LIZIZ == i2 && (obj = c21603319gd.LIZ) == c21603319gd2.LIZ && c1616140s9s.LIZJ.LLJJI.LJIJJ(obj) == i) {
                    z = true;
                }
            }
        }
        this.LLJJJ = z;
        return Boolean.valueOf(z);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final void dz2(AbstractC1616100s9o abstractC1616100s9o) {
        PageDispatcher pageDispatcherLo = Lo();
        if (pageDispatcherLo != null) {
            pageDispatcherLo.LLILZ.remove(abstractC1616100s9o);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        c0rd6.LIZIZ("event_on_render_first_frame", new C1615970s9b(this));
        c0rd6.LIZIZ("event_on_live_first_frame", new AwS603S0100000_24(this, 407));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility
    public final void f02(InterfaceC21604719gr interfaceC21604719gr) {
        VerticalViewPager verticalViewPagerLIZIZ = C0T0X.LIZIZ(this);
        if (verticalViewPagerLIZIZ != null) {
            verticalViewPagerLIZIZ.setOnUserDragListener(interfaceC21604719gr);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final Aweme k12(Aweme aweme) {
        C0SR4 c0sr4Zv0;
        int iLJLJJL;
        C0SZ8 c0sz8D;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityNo = No();
        Aweme item = null;
        if (iFeedPanelPlatformAbilityNo != null && (c0sr4Zv0 = iFeedPanelPlatformAbilityNo.Zv0()) != null) {
            VerticalViewPager verticalViewPager = this.LLJILJIL;
            if (verticalViewPager != null) {
                iLJLJJL = verticalViewPager.getCurrentItem();
            } else {
                IFeedPanelPlatformAbility iFeedPanelPlatformAbilityNo2 = No();
                if (iFeedPanelPlatformAbilityNo2 != null) {
                    iLJLJJL = iFeedPanelPlatformAbilityNo2.LJLJJL();
                }
            }
            if (iLJLJJL > 0 && ((item = c0sr4Zv0.getItem(iLJLJJL)) == aweme || LLLLLJLJLL() == aweme)) {
                item = c0sr4Zv0.getItem(iLJLJJL - 1);
                if (C729510SjV.LJJIIZ(item) && (c0sz8D = D()) != null) {
                    return c0sz8D.LJIIIIZZ();
                }
            }
        }
        return item;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final C0SZ8 kq1(boolean z) {
        C0SZ8 c0sz8;
        VerticalViewPager verticalViewPager = this.LLJILJIL;
        if (verticalViewPager == null) {
            return null;
        }
        int childCount = verticalViewPager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Object objC12 = C12(i);
            if (objC12 instanceof C0SZ8) {
                c0sz8 = (C0SZ8) objC12;
            } else {
                c0sz8 = null;
            }
            int currentItem = verticalViewPager.getCurrentItem();
            int i2 = z ? currentItem - 1 : currentItem + 1;
            if (i2 < 0) {
                return null;
            }
            if (Go(i2, c0sz8)) {
                return c0sz8;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d4  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r8) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.viewpager.ViewPagerPanelComponent.onViewCreated(android.view.View):void");
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility
    public final boolean post(Runnable runnable) {
        VerticalViewPager verticalViewPagerLIZIZ = C0T0X.LIZIZ(this);
        if (verticalViewPagerLIZIZ != null) {
            return HandlerHook.viewPost(verticalViewPagerLIZIZ, runnable);
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility
    public final boolean removeCallbacks(Runnable runnable) {
        VerticalViewPager verticalViewPagerLIZIZ = C0T0X.LIZIZ(this);
        if (verticalViewPagerLIZIZ != null) {
            return HandlerHook.viewRemoveCallbacks(verticalViewPagerLIZIZ, runnable);
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final void setEnterMethod(String str) {
        this.LLJJJIL = str;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility
    public final void t21(boolean z) {
        VerticalViewPager verticalViewPagerLIZIZ = C0T0X.LIZIZ(this);
        if (verticalViewPagerLIZIZ != null) {
            verticalViewPagerLIZIZ.setIsTriggerByAutoPlay(z);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final C0SZ8 td0(String str) {
        C0SZ8 c0sz8;
        VerticalViewPager verticalViewPager = this.LLJILJIL;
        if (verticalViewPager == null) {
            return null;
        }
        int childCount = verticalViewPager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Object objC12 = C12(i);
            if ((objC12 instanceof C0SZ8) && (c0sz8 = (C0SZ8) objC12) != null && c0sz8.hm() != null && C2093608Ic.LIZJ(c0sz8.hm().getAid(), str)) {
                return c0sz8;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final boolean to(int i) {
        return CL2(i, true);
    }

    public static void Ho(Object obj, boolean z) {
        View view;
        C0SZ8 c0sz8;
        if ((obj instanceof View) && (view = (View) obj) != null) {
            Object tag = view.getTag(R.id.hu_);
            if ((tag instanceof C0SZ8) && (c0sz8 = (C0SZ8) tag) != null) {
                c0sz8.k1("ViewPagerPanelComponent", z);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final boolean CL2(int i, boolean z) {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityNo;
        C0SR4 c0sr4Zv0;
        if (i < 0 || (iFeedPanelPlatformAbilityNo = No()) == null || (c0sr4Zv0 = iFeedPanelPlatformAbilityNo.Zv0()) == null || i > c0sr4Zv0.getCount() - 1) {
            return false;
        }
        if (!C2214201BlK.LJIIJJI && z) {
            VerticalViewPager verticalViewPager = this.LLJILJIL;
            if (verticalViewPager != null) {
                verticalViewPager.setCurrentItemWithDefaultVelocity(i);
            }
        } else {
            VerticalViewPager verticalViewPager2 = this.LLJILJIL;
            if (verticalViewPager2 != null) {
                verticalViewPager2.LJJIJLIJ(i, false);
            }
        }
        ((AbstractC1604130rqV) this.LLJLILLLLZIIL.getValue()).LJIIJJI(new C0T6V(i, z));
        return true;
    }

    public final boolean Go(int i, C0SZ8 c0sz8) {
        C0SR4 c0sr4Zv0;
        DetailNavArgModel navArgModel;
        TreeMap treeMap;
        TreeMap treeMap2;
        Object obj;
        String from;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityNo = No();
        if (iFeedPanelPlatformAbilityNo == null || (c0sr4Zv0 = iFeedPanelPlatformAbilityNo.Zv0()) == null || c0sz8 == null) {
            return false;
        }
        Aweme awemeLJJJZ = c0sr4Zv0.LJJJZ(i);
        Aweme awemeHm = c0sz8.hm();
        Object obj2 = null;
        if (C729510SjV.LJJIIZ(awemeLJJJZ)) {
            InterfaceC706770Rnv interfaceC706770RnvLJJIIJ = C1618440sDa.LIZIZ.LJJIIJ();
            C2189821An6 c2189821An6 = getPanelContext().LIZJ;
            if (c2189821An6 != null) {
                from = c2189821An6.getFrom();
            } else {
                from = null;
            }
            if (interfaceC706770RnvLJJIIJ.LJIILLIIL(from) && i == 0) {
                return true;
            }
            if (awemeLJJJZ != null && awemeHm != null) {
                return TextUtils.equals(awemeLJJJZ.getAid(), awemeHm.getAid());
            }
        } else if (awemeLJJJZ != null && awemeLJJJZ.isFriendsTabFakeAweme() && awemeHm == null) {
            return true;
        }
        C2189821An6 c2189821An62 = getPanelContext().LIZJ;
        if (c2189821An62 == null || !c2189821An62.isMyProfile() || ((c2189821An62.getPageType() != 1000 && c2189821An62.getPageType() != 1014) || !C0RGX.LIZ(null, false, 3)) ? !(awemeLJJJZ == null || !AwemeExtKt.isPhotoMode(awemeLJJJZ)) : awemeLJJJZ != null) {
            if (awemeHm != null) {
                return TextUtils.equals(awemeLJJJZ.getAid(), awemeHm.getAid());
            }
        }
        if (awemeLJJJZ == awemeHm) {
            return true;
        }
        C2189821An6 c2189821An63 = getPanelContext().LIZJ;
        if (c2189821An63 == null || !C1ER1.LIZIZ.LJJJLL(c2189821An63.getEventType()) || (navArgModel = c2189821An63.getNavArgModel()) == null || navArgModel.getSearchInitPosition() == null || awemeLJJJZ == null || awemeHm == null || !TextUtils.equals(awemeLJJJZ.getAid(), awemeHm.getAid())) {
            return false;
        }
        Map<String, String> identifier = AwemeBizExtKt.getIdentifier(awemeLJJJZ);
        if (identifier != null) {
            treeMap = new TreeMap(identifier);
        } else {
            treeMap = null;
        }
        Map<String, String> identifier2 = AwemeBizExtKt.getIdentifier(awemeHm);
        if (identifier2 != null) {
            treeMap2 = new TreeMap(identifier2);
        } else {
            treeMap2 = null;
        }
        if (treeMap != null) {
            obj = treeMap.get("tabIndex");
        } else {
            obj = null;
        }
        if (treeMap2 != null) {
            obj2 = treeMap2.get("tabIndex");
        }
        return Intrinsics.LJFF(obj, obj2);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility
    public final void LLFFF(int i, boolean z) {
        VerticalViewPager verticalViewPagerLIZIZ = C0T0X.LIZIZ(this);
        if (verticalViewPagerLIZIZ != null) {
            verticalViewPagerLIZIZ.LJJIJLIJ(i, z);
        }
    }

    @Override // X.InterfaceC743730TFj
    public final void LLZLLLL(View view, Bundle bundle) {
        View viewFindViewById = null;
        if (view != null) {
            viewFindViewById = view.findViewById(this.LLIZ);
        }
        if ((viewFindViewById instanceof VerticalViewPager) && viewFindViewById != null) {
            Oo(viewFindViewById);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility
    public final boolean postDelayed(Runnable runnable, long j) {
        VerticalViewPager verticalViewPagerLIZIZ = C0T0X.LIZIZ(this);
        if (verticalViewPagerLIZIZ != null) {
            return HandlerHook.viewPostDelay(verticalViewPagerLIZIZ, runnable, j);
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final void qi1(int i, C0SZ8 c0sz8) {
        String aid;
        Iterator<InterfaceC1616070s9l> it2 = this.LLJLIL.iterator();
        while (true) {
            aid = null;
            if (!it2.hasNext()) {
                break;
            }
            InterfaceC1616070s9l next = it2.next();
            if (next instanceof C0T21) {
                aid = ((C0T21) next).LL;
            }
            if (((Boolean) C0BPE.LIZIZ.getValue()).booleanValue() && !Intrinsics.LJFF(aid, "feed_panel")) {
                String string = next.toString();
                C1616170s9v c1616170s9v = new C1616170s9v(next, c0sz8);
                C312240CLu.LIZ(new C0CM3(C0CMJ.NORMAL_PRIORITY.getType(), C0CME.SCROLL_ON_PAGE_SELECTED, string, c1616170s9v, true));
            } else {
                next.onPageUnSelected(c0sz8);
            }
        }
        C1604000rqI c1604000rqI = new C1604000rqI(i, c0sz8, c0sz8.getAweme(), false);
        PageDispatcher pageDispatcherLo = Lo();
        if (pageDispatcherLo != null) {
            C1616000s9e c1616000s9e = pageDispatcherLo.LLILLL;
            CopyOnWriteArrayList<AbstractC1616100s9o> copyOnWriteArrayList = pageDispatcherLo.LLILZ;
            InterfaceC497601wk interfaceC497601wk = pageDispatcherLo.LLILLJJLI;
            c1616000s9e.LIZJ = copyOnWriteArrayList;
            c1616000s9e.LIZLLL = interfaceC497601wk;
            Iterator<AbstractC1616100s9o> it3 = copyOnWriteArrayList.iterator();
            while (it3.hasNext()) {
                try {
                    it3.next().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            ArrayDeque<C1616020s9g> arrayDeque = c1616000s9e.LJ;
            EnumC1616060s9k enumC1616060s9k = EnumC1616060s9k.LLILLJJLI;
            Aweme aweme = c1604000rqI.LIZIZ;
            if (aweme != null) {
                aid = aweme.getAid();
            }
            arrayDeque.addLast(new C1616020s9g(enumC1616060s9k, c1604000rqI, aid, true));
            c1616000s9e.LIZ(copyOnWriteArrayList, interfaceC497601wk);
        }
    }
}
