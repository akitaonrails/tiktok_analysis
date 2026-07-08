package com.ss.android.ugc.aweme.story.feed.immersive.gallery;

import X.C01D1;
import X.C01GW;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1895007bY;
import X.C19719912Dl;
import X.C19EG;
import X.C20603715jn;
import X.C2217381BqS;
import X.C330500CxU;
import X.C330530CxX;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C727350Sg1;
import X.C728910SiX;
import X.C729050Sil;
import X.C730090SkR;
import X.C730300Skm;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC21676519sR;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS38S0100000_11;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.feed.common.collection.ability.StoryViewerListAbility;
import com.ss.android.ugc.aweme.story.feed.immersive.ability.StoryViewerListHostAbility;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryViewerListViewModel;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS26S0001000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryViewerListAssem extends UIListContentAssem<StoryViewerListViewModel> implements StoryViewerListAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 871));
    public final AssemVMLazy LLJ;
    public final C630740Ooa LLJI;
    public C730300Skm LLJIJIL;
    public final C1559260qg8 LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StoryViewerListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/story/feed/immersive/gallery/StoryViewerListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public StoryViewerListAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoryViewerListViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 874), AFwS243S0000000_11.get$arr$(456), null, true);
        this.LLJI = C628500Oky.LIZ(new AwS555S0100000_11(this, 875));
        this.LLJILJIL = new C1559260qg8(new C723580SZw(this, C729050Sil.class, "STORY_VIEWER_LIST_HIERARCHY_DATA"), checkSupervisorPrepared());
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLIZLLLIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZ = 5;
        c20603715jn.LIZJ = false;
        c20603715jn.LIZLLL = LoadingFooterCell.class;
        return c20603715jn;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Lo, reason: merged with bridge method [inline-methods] */
    public final StoryViewerListViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (StoryViewerListViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.collection.ability.StoryViewerListAbility
    public final boolean FF() {
        RecyclerView.LayoutManager layoutManager;
        View childAt = Go().getChildAt(0);
        if (childAt == null) {
            return true;
        }
        return childAt.getTop() >= 0 && childAt.getTop() < childAt.getHeight() && (layoutManager = Go().getLayoutManager()) != null && layoutManager.getPosition(childAt) == 0;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.collection.ability.StoryViewerListAbility
    public final boolean isVisible() {
        return Go().getVisibility() == 0;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJI(c19egLIZ, null), StoryViewerListAbility.class, null);
        }
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C727350Sg1 c727350Sg1Ah1;
        Aweme aweme;
        String str;
        int i;
        String str2;
        super.onViewCreated(view);
        Context context = getContext();
        if (context != null) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
            C728910SiX c728910SiX = ((C730090SkR) Jo().getState()).LLILLJJLI;
            if (c728910SiX != null) {
                aweme = c728910SiX.LIZ;
            } else {
                aweme = null;
            }
            C727350Sg1 c727350Sg1 = Jo().LLILLL;
            String str3 = "";
            if (c727350Sg1 == null || (str = c727350Sg1.feedEnterFrom) == null) {
                str = "";
            }
            C727350Sg1 c727350Sg12 = Jo().LLILLL;
            if (c727350Sg12 != null && (str2 = c727350Sg12.feedFrom) != null) {
                str3 = str2;
            }
            C727350Sg1 c727350Sg13 = Jo().LLILLL;
            if (c727350Sg13 != null) {
                i = c727350Sg13.feedPageType;
            } else {
                i = 0;
            }
            this.LLJIJIL = new C730300Skm(viewOnAttachStateChangeListenerC20604515jvGo, context, aweme, new C1895007bY(str, str3, i));
        }
        C330530CxX c330530CxX = C330530CxX.LIZJ;
        C330500CxU.LIZ();
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0Ska
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C730090SkR) obj).LLILLJJLI;
            }
        }, null, new AwS625S0100000_11(this, 67), 6);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0Skc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C730090SkR) obj).LLILZIL;
            }
        }, null, new AwS625S0100000_11(this, 68), 6);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0Skd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C730090SkR) obj).LLJILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS625S0100000_11(this, 69), 4);
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0Skb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C730090SkR c730090SkR = (C730090SkR) obj;
                c730090SkR.getClass();
                return C627260Oiy.LIZLLL(c730090SkR);
            }
        }, null, new AwS590S0100000_11(this, 246), new AwS555S0100000_11(this, 872), new AwS590S0100000_11(this, 245), 2, null);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C1558520qew.LJII(C1558360qeg.LJI(c19egLIZ, null), this, StoryViewerListAbility.class, null, null);
        }
        StoryViewerListHostAbility storyViewerListHostAbility = (StoryViewerListHostAbility) this.LLJI.getValue();
        if (storyViewerListHostAbility != null && (c727350Sg1Ah1 = storyViewerListHostAbility.ah1()) != null) {
            Jo().LLILLL = c727350Sg1Ah1;
        }
        Go().addOnScrollListener(new AsS38S0100000_11(this, 0));
        Go().addOnChildAttachStateChangeListener(new InterfaceC21676519sR() { // from class: X.0SkZ
            @Override // X.InterfaceC21676519sR
            public final void m3(View view2) {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC21676519sR
            public final void g5(View view2) {
                int iFindLastVisibleItemPosition;
                LinearLayoutManager linearLayoutManager;
                RecyclerView.LayoutManager layoutManager = this.LL.Go().getLayoutManager();
                if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                    iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                } else {
                    iFindLastVisibleItemPosition = 0;
                }
                StoryViewerListViewModel storyViewerListViewModelJo = this.LL.Jo();
                if (iFindLastVisibleItemPosition > ((C730090SkR) storyViewerListViewModelJo.getState()).LLJ) {
                    storyViewerListViewModelJo.setState(new AwS26S0001000_11(iFindLastVisibleItemPosition, 2));
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.collection.ability.StoryViewerListAbility
    public final boolean HH1(int i, int i2) {
        Rect rect = new Rect();
        int[] iArr = new int[2];
        Go().getDrawingRect(rect);
        Go().getLocationOnScreen(iArr);
        rect.offset(iArr[0], iArr[1]);
        return rect.contains(i, i2);
    }
}
