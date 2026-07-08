package com.ss.android.ugc.aweme.feed.collection.collection.component;

import X.C01GW;
import X.C0RF0;
import X.C0RQI;
import X.C0SR4;
import X.C0SZ8;
import X.C0VWC;
import X.C0VWN;
import X.C123100dR;
import X.C13BV;
import X.C13LE;
import X.C1558420qem;
import X.C1558520qew;
import X.C21599719g3;
import X.C21600219g8;
import X.C2217381BqS;
import X.C360660ECa;
import X.C452501pT;
import X.C582550Mt3;
import X.C628500Oky;
import X.C630740Ooa;
import X.C711430RvR;
import X.C711970RwJ;
import X.C712020RwO;
import X.C714430S0r;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.InterfaceC1602960roc;
import X.InterfaceC469360Ias;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.CollectionVHAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionProgressBarAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.component.BaseFeedCollectionViewPagerComponent;
import com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.feed.collection.story.ability.StoryInvisibleVideoAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseFeedCollectionViewPagerComponent extends BaseCellContentComponent<BaseFeedCollectionViewPagerComponent> implements FeedCollectionViewPagerAbility {
    public C0RF0 LLJJJJLIIL;
    public C0SZ8 LLJJLIIIJLLLLLLLZ;
    public boolean LLJLLL;
    public C712020RwO LLLI;
    public C0RQI LLJJL = C0RQI.LOOP_CURRENT_USER;
    public String LLJL = "";
    public String LLJLIL = "";
    public int LLJLILLLLZIIL = -1;
    public int LLJLL = -1;
    public int LLJLLIL = -1;
    public final C01GW LLJZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS243S0000000_11.get$arr$(105));
    public final C630740Ooa LLJZIJLIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 290));
    public final C630740Ooa LLL = C628500Oky.LIZ(new AwS555S0100000_11(this, 296));
    public final C630740Ooa LLLF = C628500Oky.LIZ(new AwS555S0100000_11(this, 294));
    public final C630740Ooa LLLFF = C628500Oky.LIZ(new AwS555S0100000_11(this, 291));
    public final C630740Ooa LLLFFI = C628500Oky.LIZ(new AwS555S0100000_11(this, 295));
    public final C01GW LLLFZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 292));
    public final C711970RwJ LLLII = new C0VWC() { // from class: X.0RwJ
        @Override // X.C0VWC
        public final void onStop(String str) {
        }

        @Override // X.C0VWC
        public final void LJIIJ(String str) {
            String eventType;
            InterfaceC1602960roc interfaceC1602960rocLIZIZ = C0VWN.LIZIZ(str);
            if (interfaceC1602960rocLIZIZ == null || (eventType = this.LIZ.op().LJ.param.getEventType()) == null) {
                return;
            }
            interfaceC1602960rocLIZIZ.LIZ("enter_from", eventType);
        }
    };
    public final C01GW LLLIIII = C452501pT.LIZIZ(new AwS555S0100000_11(this, 293));

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public void LJL() {
        this.LLJLLL = false;
        mp().LJJIIJZLJL(this.LLLI);
        kp();
        InterfaceC1602960roc interfaceC1602960rocLIZIZ = C0VWN.LIZIZ("story_horizontally_viewpager");
        if (interfaceC1602960rocLIZIZ != null) {
            interfaceC1602960rocLIZIZ.LJIIIIZZ();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public void LJLLLL() {
        this.LLJJLIIIJLLLLLLLZ = null;
        lp().setData(C13BV.INSTANCE);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public abstract C0RQI hp(int i);

    public abstract void kp();

    public abstract C711430RvR lp();

    public abstract void up();

    public final InterfaceC713360RyY Fz2() {
        return (InterfaceC713360RyY) this.LLJZIJLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility
    public final C0SZ8 LJLIL() {
        if (!this.LLJJIJI) {
            return null;
        }
        if (ep(mp().getCurrentItem(), this.LLJJLIIIJLLLLLLLZ)) {
            return this.LLJJLIIIJLLLLLLLZ;
        }
        for (int childCount = mp().getChildCount() - 1; -1 < childCount; childCount--) {
            View childAt = mp().getChildAt(childCount);
            Object tag = childAt != null ? childAt.getTag(R.id.hu_) : null;
            C0SZ8 c0sz8 = tag instanceof C0SZ8 ? (C0SZ8) tag : null;
            if (ep(mp().getCurrentItem(), c0sz8)) {
                return c0sz8;
            }
        }
        return null;
    }

    public final CollectionVHAbility ip() {
        return (CollectionVHAbility) this.LLLFF.getValue();
    }

    public final C714430S0r mp() {
        return (C714430S0r) this.LLLFZ.getValue();
    }

    public final C0RF0 op() {
        C0RF0 c0rf0 = this.LLJJJJLIIL;
        if (c0rf0 != null) {
            return c0rf0;
        }
        "Property must be initialized before accessing".toString();
        throw new IllegalStateException("Property must be initialized before accessing");
    }

    public final FeedCollectionProgressBarAbility sp() {
        return (FeedCollectionProgressBarAbility) this.LLLF.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility
    public final C0SZ8 D() {
        int childCount = mp().getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                return null;
            }
            View childAt = mp().getChildAt(i);
            Object tag = childAt != null ? childAt.getTag(R.id.hu_) : null;
            C0SZ8 c0sz8 = tag instanceof C0SZ8 ? (C0SZ8) tag : null;
            if (ep(mp().getCurrentItem() - 1, c0sz8)) {
                return c0sz8;
            }
            i++;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility
    public final C0SZ8 F() {
        int childCount = mp().getChildCount() - 1;
        while (true) {
            if (-1 >= childCount) {
                return null;
            }
            View childAt = mp().getChildAt(childCount);
            Object tag = childAt != null ? childAt.getTag(R.id.hu_) : null;
            C0SZ8 c0sz8 = tag instanceof C0SZ8 ? (C0SZ8) tag : null;
            if (ep(mp().getCurrentItem() + 1, c0sz8)) {
                return c0sz8;
            }
            childCount--;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility
    public final List<Aweme> Fg() {
        return lp().Fg();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility
    public final Aweme LJIIIIZZ() {
        return getItem(LJIL());
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.IViewPagerAbility
    public final int LJIL() {
        C21600219g8 c21600219g8;
        View view = getView();
        if (!(view instanceof C21599719g3) || (c21600219g8 = (C21600219g8) view) == null) {
            return 0;
        }
        return c21600219g8.getCurrentItem();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.IAdapterAbility
    public final C0SR4 LJJLIIIJL() {
        return lp();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility
    public final Aweme LLLJ() {
        int currentItem = mp().getCurrentItem() + 1;
        if (currentItem >= lp().getCount()) {
            return null;
        }
        return lp().getItem(currentItem);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public void Vo() {
        C0SZ8 c0sz8;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        InterfaceC713360RyY interfaceC713360RyYFz2 = Fz2();
        if (interfaceC713360RyYFz2 != null && (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7zLIZIZ, FeedCollectionViewPagerAbility.class, null);
        }
        for (int childCount = mp().getChildCount() - 1; -1 < childCount; childCount--) {
            View childAt = mp().getChildAt(childCount);
            Object tag = childAt != null ? childAt.getTag(R.id.hu_) : null;
            if ((tag instanceof C0SZ8) && (c0sz8 = (C0SZ8) tag) != null) {
                c0sz8.onDestroyView();
            }
        }
        kp();
        InterfaceC1602960roc interfaceC1602960rocLIZIZ = C0VWN.LIZIZ("story_horizontally_viewpager");
        if (interfaceC1602960rocLIZIZ != null) {
            interfaceC1602960rocLIZIZ.LJIIIIZZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.IViewPagerAbility
    public final View getView() {
        return mp();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility
    public final boolean oD0() {
        int currentItem;
        if (lp().getCount() <= 0 || (currentItem = mp().getCurrentItem() - 1) <= -1) {
            return false;
        }
        M32(currentItem, "click", Boolean.FALSE);
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public void onParentSet() {
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        super.onParentSet();
        InterfaceC713360RyY interfaceC713360RyYFz2 = Fz2();
        if (interfaceC713360RyYFz2 == null || (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) == null) {
            return;
        }
        C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this, FeedCollectionViewPagerAbility.class, null, null);
    }

    public void tp() {
        mp().setAdapter(lp());
        mp().LIZLLL(new C360660ECa() { // from class: X.0RwL
            @Override // X.C360660ECa, X.InterfaceC469360Ias
            public final void onPageScrollStateChanged(int i) {
                C0SZ8 c0sz8J92;
                InterfaceC739930T0t interfaceC739930T0tLJIJJLI;
                if (i != 0) {
                    if (i == 1) {
                        CollectionVHAbility collectionVHAbilityIp = this.LL.ip();
                        if (collectionVHAbilityIp != null && (c0sz8J92 = collectionVHAbilityIp.j92()) != null && (interfaceC739930T0tLJIJJLI = c0sz8J92.LJIJJLI()) != null) {
                            interfaceC739930T0tLJIJJLI.Fm();
                        }
                        this.LL.Es0(C0RQI.LOOP_CURRENT_VIDEO);
                        return;
                    }
                    return;
                }
                BaseFeedCollectionViewPagerComponent baseFeedCollectionViewPagerComponent = this.LL;
                baseFeedCollectionViewPagerComponent.Es0(baseFeedCollectionViewPagerComponent.hp(-1));
            }
        });
    }

    public final void yp() {
        CommonCellAbility commonCellAbility;
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        CommonCellAbility commonCellAbility2;
        InterfaceC713360RyY interfaceC713360RyYFz22;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        InterfaceC494301wD interfaceC494301wDLIZ;
        C0SZ8 c0sz8LJLIL = LJLIL();
        if (c0sz8LJLIL == null) {
            return;
        }
        InterfaceC494301wD interfaceC494301wDLIZ2 = null;
        if (!(c0sz8LJLIL instanceof CommonCellAbility) || (commonCellAbility2 = (CommonCellAbility) c0sz8LJLIL) == null || (interfaceC713360RyYFz22 = commonCellAbility2.Fz2()) == null || (interfaceC665370Q7zLIZIZ2 = C1558420qem.LIZIZ(interfaceC713360RyYFz22)) == null || (interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, StoryInvisibleVideoAbility.class, null)) == null) {
            C0SZ8 c0sz8LLJLLL = c0sz8LJLIL.LLJLLL();
            if ((c0sz8LLJLLL instanceof CommonCellAbility) && (commonCellAbility = (CommonCellAbility) c0sz8LLJLLL) != null && (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) != null && (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) != null) {
                interfaceC494301wDLIZ2 = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, StoryInvisibleVideoAbility.class, null);
            }
        } else {
            interfaceC494301wDLIZ2 = interfaceC494301wDLIZ;
        }
        StoryInvisibleVideoAbility storyInvisibleVideoAbility = (StoryInvisibleVideoAbility) interfaceC494301wDLIZ2;
        if (storyInvisibleVideoAbility != null) {
            storyInvisibleVideoAbility.lF2();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.IViewPagerAbility
    public final void By1(C360660ECa c360660ECa) {
        C21600219g8 c21600219g8;
        View view = getView();
        if ((view instanceof C21599719g3) && (c21600219g8 = (C21600219g8) view) != null) {
            c21600219g8.LJJIIJZLJL(c360660ECa);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility
    public final boolean E30(String str) {
        int currentItem;
        int count = lp().getCount();
        if (count <= 0 || (currentItem = mp().getCurrentItem() + 1) >= count) {
            return false;
        }
        M32(currentItem, str, Boolean.FALSE);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility
    public void Es0(C0RQI c0rqi) {
        this.LLJJL = c0rqi;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility
    public final C0SZ8 LJJIJIL(String str) {
        Object tag;
        C0SZ8 c0sz8;
        if (str == null) {
            return null;
        }
        int childCount = mp().getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = mp().getChildAt(i);
            if (childAt != null) {
                tag = childAt.getTag(R.id.hu_);
            } else {
                tag = null;
            }
            if ((tag instanceof C0SZ8) && (c0sz8 = (C0SZ8) tag) != null && c0sz8.hm() != null && TextUtils.equals(c0sz8.hm().getAid(), str)) {
                return c0sz8;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.IViewPagerAbility
    public final void LLJJI(InterfaceC469360Ias interfaceC469360Ias) {
        C21600219g8 c21600219g8;
        View view = getView();
        if ((view instanceof C21599719g3) && (c21600219g8 = (C21600219g8) view) != null) {
            c21600219g8.LIZLLL(interfaceC469360Ias);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility
    public final Aweme getItem(int i) {
        return lp().getItem(i);
    }

    public void onPlayCompleted(String str) {
        if (mp().getCurrentItem() == lp().getCount() - 1) {
            up();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZ.getValue(), new C2217381BqS() { // from class: X.0RwN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJJJ;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(64), 4);
        tp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Ias, X.0RwO] */
    public final void zp(int i) {
        this.LLJLLL = true;
        this.LLJLLIL = i;
        C714430S0r c714430S0rMp = mp();
        kp();
        final InterfaceC1602960roc interfaceC1602960rocLIZ = C0VWN.LIZ("story_horizontally_viewpager", false);
        interfaceC1602960rocLIZ.LJIIJ(this.LLLII);
        kp();
        C582550Mt3.LIZ = "story_horizontally_viewpager";
        ?? r0 = new C360660ECa() { // from class: X.0RwO
            @Override // X.C360660ECa, X.InterfaceC469360Ias
            public final void onPageScrollStateChanged(int i2) {
                if (i2 != 0) {
                    if (i2 != 1) {
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
        this.LLLI = r0;
        c714430S0rMp.LIZLLL(r0);
    }

    private final boolean ep(int i, C0SZ8 c0sz8) {
        Aweme item;
        Aweme awemeHm;
        if (c0sz8 == null || (item = lp().getItem(i)) == null || (awemeHm = c0sz8.hm()) == null) {
            return false;
        }
        return Intrinsics.LJFF(item.getAid(), awemeHm.getAid());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public void J1(int i, Aweme aweme) {
        if (((Boolean) this.LLLIIII.getValue()).booleanValue()) {
            return;
        }
        zp(i);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility
    public void ee1(int i, Aweme aweme) {
        zp(i);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility
    public final void M32(int i, String str, Boolean bool) {
        if (mp().getCurrentItem() != i && C123100dR.LIZ(str)) {
            mp().setTag(R.id.e80, str);
        }
        if (bool != null) {
            mp().LLFFF(i, bool.booleanValue());
        } else {
            mp().LLFFF(i, false);
        }
    }
}
