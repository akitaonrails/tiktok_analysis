package com.ss.android.ugc.aweme.story.feed.common.collection;

import X.C01GW;
import X.C0HTT;
import X.C0RD4;
import X.C0RF0;
import X.C0RGG;
import X.C0RGJ;
import X.C0RGL;
import X.C0RGM;
import X.C0RGR;
import X.C0RGU;
import X.C0RHH;
import X.C0SKK;
import X.C0SZ8;
import X.C1389910mGz;
import X.C1440005kM;
import X.C1480420ocy;
import X.C1480430ocz;
import X.C1481290oeN;
import X.C1558420qem;
import X.C1558520qew;
import X.C21599719g3;
import X.C2188811AlT;
import X.C452501pT;
import X.C520680KbS;
import X.C583630Mun;
import X.C586380MzE;
import X.C614770O9j;
import X.C628500Oky;
import X.C630740Ooa;
import X.C690470R6n;
import X.C690660R7g;
import X.C693050RGl;
import X.C693070RGn;
import X.C710930Rud;
import X.C714060Rzg;
import X.C726240SeE;
import X.C729510SjV;
import X.C730000SkI;
import X.C735840Sti;
import X.C737030Svd;
import X.C786410Ut5;
import X.EnumC1616310sA9;
import X.InterfaceC494301wD;
import X.InterfaceC582840MtW;
import X.InterfaceC583650Mup;
import X.InterfaceC665370Q7z;
import X.InterfaceC689860R4e;
import X.InterfaceC713360RyY;
import X.InterfaceC739930T0t;
import android.graphics.SurfaceTexture;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView;
import com.ss.android.ugc.aweme.feed.bottom.BottomToastVM;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.CollectionVHAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionPlayerViewAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility;
import com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.feed.collection.common.ability.FeedPlayerViewInitAbility;
import com.ss.android.ugc.aweme.feed.collection.story.ability.PlayEventDispatchAbility;
import com.ss.android.ugc.aweme.feed.collection.sub.ability.SubCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.story.ability.IStoryBubbleListAbility;
import com.ss.android.ugc.aweme.story.api.IStoryCurrentSubAwemeAbility;
import com.ss.android.ugc.aweme.story.feed.common.collection.ability.StoryCollectionCellAbility;
import com.ss.android.ugc.aweme.story.note.IStoryThoughtMyDataManager;
import com.ss.android.ugc.aweme.story.note.StoryNoteStatusChangeCallback;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryPlayerListViewHolder extends VideoViewCell implements StoryCollectionCellAbility, CollectionVHAbility, PlayEventDispatchAbility, CommonCellAbility, InterfaceC582840MtW, FeedPlayerViewInitAbility, IStoryBubbleListAbility, C0RGU {
    public final InterfaceC665370Q7z T0;
    public Aweme U0;
    public int V0;
    public final C630740Ooa W0;
    public final C01GW X0;
    public final C01GW Y0;
    public final C01GW Z0;
    public final C01GW a1;
    public final C630740Ooa b1;
    public String c1;

    @Override // com.ss.android.ugc.aweme.feed.collection.story.ability.PlayEventDispatchAbility
    public final InterfaceC583650Mup EL1() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void Er1(String str) {
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility
    public final InterfaceC713360RyY Fz2() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.collection.ability.StoryCollectionCellAbility
    public final void LB0(C0RGR c0rgr) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.InterfaceC1473950oSX
    public final void LIZ() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.InterfaceC1473950oSX
    public final void LLF(int i, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final int LLLIIL() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0RDR
    public final void Qi1(Video video) {
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.collection.ability.StoryCollectionCellAbility
    public final void Z50(C0RGR c0rgr) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final String gq() {
        return "cell_story";
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.CollectionVHAbility
    public final C0SZ8 j92() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.InterfaceC1473950oSX
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final FeedCollectionViewPagerAbility p1() {
        return (FeedCollectionViewPagerAbility) this.W0.getValue();
    }

    public final void s1() {
        C01GW<C0RGG> c01gw = C0RGG.LJ;
        if (!C586380MzE.LIZ().LIZJ(getEventType()) || C614770O9j.LIZIZ.LJ().LJJIIJ(0, getActivity())) {
            return;
        }
        C1440005kM.LIZ(new C714060Rzg(false, EnumC1616310sA9.SWITCH_STORY.getType(), "", getEventType()));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.InterfaceC739930T0t
    public final void Fm() {
        InterfaceC739930T0t interfaceC739930T0tLJIJJLI;
        super.Fm();
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL == null || (interfaceC739930T0tLJIJJLI = c0sz8LLJLLL.LJIJJLI()) == null) {
            return;
        }
        interfaceC739930T0tLJIJJLI.Fm();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public final void G() {
        super.G();
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null) {
            c0sz8LLJLLL.G();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8, X.C0SZA
    public final Aweme LJIIIIZZ() {
        Aweme aweme;
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null && (aweme = c0sz8LLJLLL.getAweme()) != null) {
            return aweme;
        }
        Aweme aweme2 = this.LLJJ;
        return (aweme2 == null || C729510SjV.LJJIIZ(aweme2)) ? C729510SjV.LJFF(this.U0) : this.LLJJ;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final C0SKK LJLLLL() {
        C0SKK c0skkLJLLLL;
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        return (c0sz8LLJLLL == null || (c0skkLJLLLL = c0sz8LLJLLL.LJLLLL()) == null) ? C0SKK.INITIALIZED : c0skkLJLLLL;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LLFF() {
        super.LLFF();
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null) {
            c0sz8LLJLLL.LLFF();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0RGM
    public final void LLI() {
        ViewGroup viewGroup;
        super.LLI();
        FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityP1 = p1();
        View view = feedCollectionViewPagerAbilityP1 != null ? feedCollectionViewPagerAbilityP1.getView() : null;
        if (!(view instanceof C21599719g3) || (viewGroup = (ViewGroup) view) == null) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Object tag = viewGroup.getChildAt(i).getTag(R.id.hu_);
            if (tag instanceof C0RGM) {
                ((C0RGM) tag).LLI();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LLJLL() {
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null) {
            c0sz8LLJLLL.LLJLL();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final C0SZ8 LLJLLL() {
        FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityP1 = p1();
        if (feedCollectionViewPagerAbilityP1 != null) {
            return feedCollectionViewPagerAbilityP1.LJLIL();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.InterfaceC583650Mup
    public final void Z1() {
        InterfaceC583650Mup interfaceC583650Mup;
        super.Z1();
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (!(c0sz8LLJLLL instanceof InterfaceC583650Mup) || (interfaceC583650Mup = (InterfaceC583650Mup) c0sz8LLJLLL) == null) {
            return;
        }
        interfaceC583650Mup.Z1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public final int getAwemeType() {
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null) {
            return c0sz8LLJLLL.getAwemeType();
        }
        Aweme aweme = this.LLJJ;
        if (aweme != null) {
            return aweme.getAwemeType();
        }
        return 40;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final boolean l() {
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null) {
            return c0sz8LLJLLL.l();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.InterfaceC739930T0t
    public final void no() {
        InterfaceC739930T0t interfaceC739930T0tLJIJJLI;
        super.no();
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL == null || (interfaceC739930T0tLJIJJLI = c0sz8LLJLLL.LJIJJLI()) == null) {
            return;
        }
        interfaceC739930T0tLJIJJLI.no();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public final void onDestroyView() {
        super.onDestroyView();
        InterfaceC665370Q7z interfaceC665370Q7z = this.T0;
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, StoryCollectionCellAbility.class, null);
            C1558520qew.LJIIJJI(interfaceC665370Q7z, CollectionVHAbility.class, null);
            C1558520qew.LJIIJJI(interfaceC665370Q7z, PlayEventDispatchAbility.class, null);
            C1558520qew.LJIIJJI(interfaceC665370Q7z, CommonCellAbility.class, null);
            C1558520qew.LJIIJJI(interfaceC665370Q7z, FeedPlayerViewInitAbility.class, null);
            C1558520qew.LJIIJJI(interfaceC665370Q7z, IStoryBubbleListAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public final void onPause() {
        super.onPause();
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null) {
            c0sz8LLJLLL.onPause();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final View.OnTouchListener q5() {
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null) {
            return c0sz8LLJLLL.q5();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.InterfaceC583650Mup
    public final void sc() {
        InterfaceC583650Mup interfaceC583650Mup;
        super.sc();
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (!(c0sz8LLJLLL instanceof InterfaceC583650Mup) || (interfaceC583650Mup = (InterfaceC583650Mup) c0sz8LLJLLL) == null) {
            return;
        }
        interfaceC583650Mup.sc();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public final InterfaceC583650Mup x3() {
        return C729510SjV.LJJJIL(LJIIIIZZ()) ? (C583630Mun) this.a1.getValue() : this;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.CollectionVHAbility
    public final void xc2() {
        Y();
        BottomToastVM bottomToastVM = (BottomToastVM) this.X0.getValue();
        int i = C0RGL.LIZ;
        C1389910mGz c1389910mGz = bottomToastVM.LL;
        if (c1389910mGz != null) {
            c1389910mGz.LIZJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryBubbleListAbility
    public final ViewGroup CW1() {
        return this.LLLLIIL;
    }

    @Override // X.C0RGU
    public final String LJLILLLLZI() {
        return this.c1;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LLLLIIL() {
        super.LLLLIIL();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public final Aweme getAweme() {
        return this.U0;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final Aweme hm() {
        return this.U0;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.collection.ability.StoryCollectionCellAbility
    public final Aweme o81() {
        return this.U0;
    }

    public StoryPlayerListViewHolder(C0RF0 c0rf0) {
        super(c0rf0);
        this.W0 = C628500Oky.LIZ(new AwS555S0100000_11(this, 555));
        this.X0 = C452501pT.LIZIZ(new AwS555S0100000_11(c0rf0, 549));
        this.Y0 = C452501pT.LIZIZ(new AwS555S0100000_11(this, 554));
        this.Z0 = C452501pT.LIZIZ(new AwS555S0100000_11(this, 553));
        this.a1 = C452501pT.LIZIZ(new AwS555S0100000_11(this, 550));
        this.b1 = C628500Oky.LIZ(AFwS198S0000000_11.get$arr$(141));
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
        C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this, StoryCollectionCellAbility.class, null, null);
        C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this, CollectionVHAbility.class, null, null);
        C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this, PlayEventDispatchAbility.class, null, null);
        C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this, CommonCellAbility.class, null, null);
        C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this, FeedPlayerViewInitAbility.class, null, null);
        C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this, IStoryBubbleListAbility.class, null, null);
        this.T0 = interfaceC665370Q7zLIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.CollectionVHAbility
    public final void CC0(Aweme aweme) {
        String aid;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("syncLastPlaySubAweme: aid = ");
        String aid2 = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        if (aweme != null) {
            aid2 = aweme.getAid();
        }
        this.c1 = aid2;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.CollectionVHAbility
    public final void Dk2(C693070RGn c693070RGn) {
        G();
        if (!C710930Rud.LJFF(c693070RGn.LIZ, c693070RGn.LJI)) {
            nO1();
        }
        C786410Ut5.LLIIL(this.LLLLJ, 0);
        if (c693070RGn.LIZIZ == this.LLJJI) {
            this.V0 = c693070RGn.LIZJ;
            LJI(c693070RGn.LIZ);
            Fm();
            s1();
        }
        if (C729510SjV.LJIJ(c693070RGn.LIZ)) {
            C786410Ut5.LLIIL(this.LLLLJ, 4);
        }
        AssemViewModel assemViewModel = (AssemViewModel) this.Y0.getValue();
        assemViewModel.getClass();
        assemViewModel.setState(new AwS590S0100000_11(c693070RGn, 487));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void K8(View.OnTouchListener onTouchListener) {
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null) {
            c0sz8LLJLLL.K8(onTouchListener);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LJI(Aweme aweme) {
        if (C729510SjV.LJJIIZ(aweme)) {
            this.U0 = aweme;
        } else {
            IStoryCurrentSubAwemeAbility iStoryCurrentSubAwemeAbility = (IStoryCurrentSubAwemeAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), IStoryCurrentSubAwemeAbility.class, null);
            if (iStoryCurrentSubAwemeAbility != null) {
                iStoryCurrentSubAwemeAbility.C90(aweme);
            }
        }
        super.LJI(aweme);
        C729510SjV.LIZLLL(aweme, new AwS590S0100000_11(this, 172));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd  */
    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJIL(int r12) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.common.collection.StoryPlayerListViewHolder.LJJIJIIJIL(int):void");
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final C0SZ8 LJJIJIL(String str) {
        C0SZ8 c0sz8LJJIJIL;
        FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityP1 = p1();
        C0SZ8 c0sz8LJLIL = null;
        if (feedCollectionViewPagerAbilityP1 != null) {
            c0sz8LJJIJIL = feedCollectionViewPagerAbilityP1.LJJIJIL(str);
        } else {
            c0sz8LJJIJIL = null;
        }
        FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityP12 = p1();
        if (feedCollectionViewPagerAbilityP12 != null) {
            c0sz8LJLIL = feedCollectionViewPagerAbilityP12.LJLIL();
        }
        if (Intrinsics.LJFF(c0sz8LJJIJIL, c0sz8LJLIL) && c0sz8LJLIL != null) {
            return this;
        }
        return c0sz8LJJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public final void LJLIIIL(int i) {
        super.LJLIIIL(i);
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null) {
            c0sz8LLJLLL.LJLIIIL(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LLIIII(boolean z) {
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null) {
            c0sz8LLJLLL.LLIIII(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public final void LLLI(int i) {
        C0SZ8 c0sz8LLJLLL;
        super.LLLI(i);
        if ((i != 1 && i != 2) || (c0sz8LLJLLL = LLJLLL()) == null) {
            return;
        }
        c0sz8LLJLLL.LLLI(i);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.InterfaceC583650Mup
    public final void LLLLIL(Aweme aweme) {
        InterfaceC583650Mup interfaceC583650Mup;
        super.LLLLIL(aweme);
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if ((c0sz8LLJLLL instanceof InterfaceC583650Mup) && (interfaceC583650Mup = (InterfaceC583650Mup) c0sz8LLJLLL) != null) {
            interfaceC583650Mup.LLLLIL(aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final BaseFeedPlayerView LLLLLZ(C0RF0 c0rf0) {
        View view = c0rf0.LIZ;
        this.LLLLL = (ViewGroup) C726240SeE.LIZIZ(view, this.LLLLL, R.id.ci1, R.id.vs_bottom_widget_container);
        if (this.LLLLIIL == null) {
            this.LLLLIIL = (FrameLayout) C520680KbS.LIZ(R.id.wb9, view);
        }
        FeedCollectionPlayerViewAbility feedCollectionPlayerViewAbility = (FeedCollectionPlayerViewAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), FeedCollectionPlayerViewAbility.class, null);
        if (feedCollectionPlayerViewAbility == null) {
            return null;
        }
        return feedCollectionPlayerViewAbility.E();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.common.ability.FeedPlayerViewInitAbility
    public final void Wo0(BaseFeedPlayerView baseFeedPlayerView) {
        if (this.LLJLIL == null) {
            this.LLJLIL = baseFeedPlayerView;
            LLLLZLLLI(this.LLJILJILJ);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* JADX INFO: renamed from: b0 */
    public final void onChanged(C0RD4 c0rd4) {
        C0SZ8 c0sz8LLJLLL;
        CommonCellAbility commonCellAbility;
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        CommonCellAbility commonCellAbility2;
        InterfaceC713360RyY interfaceC713360RyYFz22;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        InterfaceC494301wD interfaceC494301wDLIZ;
        super.onChanged(c0rd4);
        if (c0rd4 == null) {
            return;
        }
        String str = c0rd4.LIZ;
        if (str.hashCode() == -1245454328 && str.equals("VIDEO_CANCEL_REPORT_SKIP_BEHAVIOR")) {
            C0SZ8 c0sz8LLJLLL2 = LLJLLL();
            InterfaceC494301wD interfaceC494301wDLIZ2 = null;
            if ((c0sz8LLJLLL2 instanceof CommonCellAbility) && (commonCellAbility2 = (CommonCellAbility) c0sz8LLJLLL2) != null && (interfaceC713360RyYFz22 = commonCellAbility2.Fz2()) != null && (interfaceC665370Q7zLIZIZ2 = C1558420qem.LIZIZ(interfaceC713360RyYFz22)) != null && (interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, SubCellAbility.class, null)) != null) {
                interfaceC494301wDLIZ2 = interfaceC494301wDLIZ;
            } else {
                if ((c0sz8LLJLLL2 instanceof C0SZ8) && c0sz8LLJLLL2 != null) {
                    c0sz8LLJLLL = c0sz8LLJLLL2.LLJLLL();
                } else {
                    c0sz8LLJLLL = null;
                }
                if ((c0sz8LLJLLL instanceof CommonCellAbility) && (commonCellAbility = (CommonCellAbility) c0sz8LLJLLL) != null && (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) != null && (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) != null) {
                    interfaceC494301wDLIZ2 = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, SubCellAbility.class, null);
                }
            }
            SubCellAbility subCellAbility = (SubCellAbility) interfaceC494301wDLIZ2;
            if (subCellAbility != null) {
                subCellAbility.KF1();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final Aweme f(int i) {
        if (C729510SjV.LJJIIZ(this.LLJJ)) {
            return LJIIIIZZ();
        }
        return super.f(i);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void g1(int i) {
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null) {
            c0sz8LLJLLL.g1(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public final void h(boolean z) {
        super.h(z);
        C735840Sti.LIZ.getClass();
        C735840Sti.LIZIZ = "slide";
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null) {
            c0sz8LLJLLL.h(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        OnUIPlayListener onUIPlayListener;
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if ((c0sz8LLJLLL instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) c0sz8LLJLLL) != null) {
            onUIPlayListener.onBuffering(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, androidx.lifecycle.Observer
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        onChanged((C0RD4) obj);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        OnUIPlayListener onUIPlayListener;
        super.onPausePlay(str);
        FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityP1 = p1();
        C0SZ8 c0sz8LJJIJIL = null;
        if (feedCollectionViewPagerAbilityP1 != null) {
            c0sz8LJJIJIL = feedCollectionViewPagerAbilityP1.LJJIJIL(str);
        }
        if ((c0sz8LJJIJIL instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) c0sz8LJJIJIL) != null) {
            onUIPlayListener.onPausePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        OnUIPlayListener onUIPlayListener;
        super.onPlayCompleted(str);
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if ((c0sz8LLJLLL instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) c0sz8LLJLLL) != null) {
            onUIPlayListener.onPlayCompleted(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        OnUIPlayListener onUIPlayListener;
        super.onPlayCompletedFirstTime(str);
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if ((c0sz8LLJLLL instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) c0sz8LLJLLL) != null) {
            onUIPlayListener.onPlayCompletedFirstTime(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(C1481290oeN c1481290oeN) {
        OnUIPlayListener onUIPlayListener;
        super.onPlayFailed(c1481290oeN);
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if ((c0sz8LLJLLL instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) c0sz8LLJLLL) != null) {
            onUIPlayListener.onPlayFailed(c1481290oeN);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        OnUIPlayListener onUIPlayListener;
        super.onPlayProgressChange(f);
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if ((c0sz8LLJLLL instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) c0sz8LLJLLL) != null) {
            onUIPlayListener.onPlayProgressChange(f);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        OnUIPlayListener onUIPlayListener;
        super.onPlayStop(str);
        FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityP1 = p1();
        C0SZ8 c0sz8LJJIJIL = null;
        if (feedCollectionViewPagerAbilityP1 != null) {
            c0sz8LJJIJIL = feedCollectionViewPagerAbilityP1.LJJIJIL(str);
        }
        if ((c0sz8LJJIJIL instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) c0sz8LJJIJIL) != null) {
            onUIPlayListener.onPlayStop(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        OnUIPlayListener onUIPlayListener;
        super.onPreparePlay(str);
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if ((c0sz8LLJLLL instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) c0sz8LLJLLL) != null) {
            onUIPlayListener.onPreparePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        String strGq;
        OnUIPlayListener onUIPlayListener;
        C0RGJ c0rgj;
        C730000SkI c730000SkI = C730000SkI.LIZIZ;
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (!(c0sz8LLJLLL instanceof C0RGJ) || (c0rgj = (C0RGJ) c0sz8LLJLLL) == null || (strGq = c0rgj.gq()) == null) {
            strGq = "";
        }
        c730000SkI.LIZ(249372176, strGq, "cell_type");
        c730000SkI.LIZLLL(249372176, true);
        super.onRenderFirstFrame(c1480420ocy);
        C0SZ8 c0sz8LLJLLL2 = LLJLLL();
        if ((c0sz8LLJLLL2 instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) c0sz8LLJLLL2) != null) {
            onUIPlayListener.onRenderFirstFrame(c1480420ocy);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(C1480430ocz c1480430ocz) {
        OnUIPlayListener onUIPlayListener;
        super.onRenderReady(c1480430ocz);
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if ((c0sz8LLJLLL instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) c0sz8LLJLLL) != null) {
            onUIPlayListener.onRenderReady(c1480430ocz);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        OnUIPlayListener onUIPlayListener;
        super.onResumePlay(str);
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if ((c0sz8LLJLLL instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) c0sz8LLJLLL) != null) {
            onUIPlayListener.onResumePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(C1481290oeN c1481290oeN) {
        OnUIPlayListener onUIPlayListener;
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if ((c0sz8LLJLLL instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) c0sz8LLJLLL) != null) {
            onUIPlayListener.onRetryOnError(c1481290oeN);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void p(int i) {
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null) {
            c0sz8LLJLLL.p(1);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.CollectionVHAbility
    public final void xO2(C693050RGl c693050RGl) {
        Aweme aweme = this.LLJJ;
        if (aweme != null && AwemeBizExtKt.isStoryFakeAweme(aweme)) {
            this.V0 = c693050RGl.LIZIZ;
            LJI(c693050RGl.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.InterfaceC583650Mup
    public final void ys(int i) {
        InterfaceC583650Mup interfaceC583650Mup;
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if ((c0sz8LLJLLL instanceof InterfaceC583650Mup) && (interfaceC583650Mup = (InterfaceC583650Mup) c0sz8LLJLLL) != null) {
            interfaceC583650Mup.ys(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LJJJJ(int i, Aweme aweme) {
        super.LJJJJ(i, aweme);
        RelativeLayout relativeLayout = this.LLLLJ;
        if (relativeLayout != null) {
            C786410Ut5.LLIIL(relativeLayout, 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.InterfaceC1473950oSX
    public final void LLILLIZIL(int i, int i2) {
        AssemViewModel assemViewModel = (AssemViewModel) this.Z0.getValue();
        assemViewModel.getClass();
        assemViewModel.setState(new C690660R7g());
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LLLLIILL(int i, String str) {
        String str2;
        if (C729510SjV.LJJIIZI(LJIIIIZZ())) {
            StoryNoteDataCollection storyNoteDataCollectionKO = ((IStoryThoughtMyDataManager) this.b1.getValue()).KO(false);
            if (storyNoteDataCollectionKO != null) {
                str2 = storyNoteDataCollectionKO.aid;
            } else {
                str2 = null;
            }
            if (Intrinsics.LJFF(str2, str)) {
                ((StoryNoteStatusChangeCallback) this.b1.getValue()).onStoryNoteDelete();
            }
        }
        FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityP1 = p1();
        if (feedCollectionViewPagerAbilityP1 != null) {
            feedCollectionViewPagerAbilityP1.jd2(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.CollectionVHAbility
    public final void Z20(int i, Aweme aweme) {
        if (i != this.LLJJI) {
            return;
        }
        LJI(aweme);
        Fm();
        s1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
        OnUIPlayListener onUIPlayListener;
        super.onSeekEnd(str, z);
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if ((c0sz8LLJLLL instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) c0sz8LLJLLL) != null) {
            onUIPlayListener.onSeekEnd(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSpeedChanged(String str, float f) {
        OnUIPlayListener onUIPlayListener;
        super.onSpeedChanged(str, f);
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if ((c0sz8LLJLLL instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) c0sz8LLJLLL) != null) {
            onUIPlayListener.onSpeedChanged(str, f);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void LLLLJI(Aweme aweme, int i, boolean z) {
        VideoItemParams videoItemParams = this.LLJILLL;
        if (videoItemParams != null) {
            videoItemParams.storyPosition = this.V0;
        }
        super.LLLLJI(aweme, i, z);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final InterfaceC689860R4e LLLLZI(View view, C0HTT<C737030Svd> c0htt, Fragment fragment) {
        return new C690470R6n();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        OnUIPlayListener onUIPlayListener;
        super.onPlayProgressChange(str, j, j2);
        AssemViewModel assemViewModel = (AssemViewModel) this.Z0.getValue();
        C0RHH c0rhh = new C0RHH(str, j, j2);
        assemViewModel.getClass();
        assemViewModel.setState(new AwS590S0100000_11(c0rhh, 490));
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if ((c0sz8LLJLLL instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) c0sz8LLJLLL) != null) {
            onUIPlayListener.onPlayProgressChange(str, j, j2);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i, float f) {
        OnUIPlayListener onUIPlayListener;
        super.onSeekStart(str, i, f);
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if ((c0sz8LLJLLL instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) c0sz8LLJLLL) != null) {
            onUIPlayListener.onSeekStart(str, i, f);
        }
    }
}
