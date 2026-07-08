package com.ss.android.ugc.aweme.feed.collection.collection;

import X.C01GW;
import X.C0HTT;
import X.C0NC0;
import X.C0R6M;
import X.C0R8C;
import X.C0RAF;
import X.C0RD4;
import X.C0RF0;
import X.C0RGL;
import X.C0RGM;
import X.C0RGQ;
import X.C0RHA;
import X.C0RHH;
import X.C0RHP;
import X.C0SKK;
import X.C0SMO;
import X.C0SR4;
import X.C0SUL;
import X.C0SYH;
import X.C0SZ8;
import X.C10EU;
import X.C1389890mGx;
import X.C1389910mGz;
import X.C13LE;
import X.C1480420ocy;
import X.C1480430ocz;
import X.C1481290oeN;
import X.C1483410ohn;
import X.C1558420qem;
import X.C1558520qew;
import X.C19719912Dl;
import X.C19EG;
import X.C21599719g3;
import X.C2189821An6;
import X.C452501pT;
import X.C582980Mtk;
import X.C583630Mun;
import X.C584270Mvp;
import X.C628500Oky;
import X.C630740Ooa;
import X.C690610R7b;
import X.C690620R7c;
import X.C690630R7d;
import X.C690660R7g;
import X.C691100R8y;
import X.C693050RGl;
import X.C693070RGn;
import X.C708600Rqs;
import X.C710930Rud;
import X.C729510SjV;
import X.C729980SkG;
import X.C735280Sso;
import X.C735840Sti;
import X.C737030Svd;
import X.C737910Sx3;
import X.EnumC452301pR;
import X.InterfaceC1294060jmO;
import X.InterfaceC214902198i;
import X.InterfaceC494301wD;
import X.InterfaceC582840MtW;
import X.InterfaceC583650Mup;
import X.InterfaceC665370Q7z;
import X.InterfaceC689860R4e;
import X.InterfaceC690460R6m;
import X.InterfaceC713360RyY;
import X.InterfaceC739930T0t;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView;
import com.ss.android.ugc.aweme.feed.assem.ability.IPlayerProgressAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.bottom.BottomToastVM;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.CollectionVHAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility;
import com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.feed.collection.common.ability.FeedPlayerViewInitAbility;
import com.ss.android.ugc.aweme.feed.collection.story.ability.PlayEventDispatchAbility;
import com.ss.android.ugc.aweme.feed.collection.sub.ability.SubCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.feed.immersive.panel.viewholer.StoryImmersiveCollectionVH;
import com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsImmersiveActionService;
import com.ss.android.ugc.aweme.story.note.IStoryThoughtMyDataManager;
import com.ss.android.ugc.aweme.story.note.StoryNoteStatusChangeCallback;
import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS0S1000001_11;
import kotlin.jvm.internal.AwS26S0001000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS5S0011000_11;
import kotlin.jvm.internal.AwS62S1000000_11;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseCollectionFeedVH<P extends C0SMO<P, VideoItemParams>> extends BaseCollectionCell<P, VideoItemParams> implements Observer<C0RD4>, C0RGM, InterfaceC582840MtW, CommonCellAbility, CollectionVHAbility, IVideoCellAbility, IPlayerProgressAbility, FeedPlayerViewInitAbility, PlayEventDispatchAbility {
    public final C0RF0 LLLI;
    public String LLLII;
    public BaseFeedPlayerView LLLIIII;
    public final C01GW LLLIIIIL;
    public JSONObject LLLIIIL;
    public final C630740Ooa LLLIIL;
    public final C01GW LLLIILIL;
    public final C01GW LLLIL;
    public final C630740Ooa LLLILZ;
    public final C630740Ooa LLLILZJ;
    public final C630740Ooa LLLILZLLLI;
    public final C630740Ooa LLLIZZ;
    public final C01GW LLLJ;

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.CollectionVHAbility
    public final void CC0(Aweme aweme) {
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.story.ability.PlayEventDispatchAbility
    public final InterfaceC583650Mup EL1() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void Es(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final ImageView F2() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility
    public final InterfaceC713360RyY Fz2() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void H8(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    @InterfaceC1294060jmO
    public final Integer Ia() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final InterfaceC689860R4e K9() {
        return null;
    }

    public abstract String LLLLJI();

    public abstract void LLLLLLLLL();

    public abstract void LLLLZI(C693070RGn c693070RGn);

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void Q5(String str) {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void R() {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void Uc() {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void Vu() {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final InterfaceC690460R6m Wn0() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public int Yf2() {
        return 3;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.CollectionVHAbility
    public void Z20(int i, Aweme aweme) {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    @InterfaceC1294060jmO
    public final Integer br() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final View by1() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void ek(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final RootCellCommonAbility gI() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void ii(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final Aweme im() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.CollectionVHAbility
    public final C0SZ8 j92() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void nO1() {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final C0SUL om() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void td(HashMap<String, String> map) {
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.CollectionVHAbility
    public void xO2(C693050RGl c693050RGl) {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final boolean yE0() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final View yy0() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LLFF() {
        BaseFeedPlayerView baseFeedPlayerView = this.LLLIIII;
        if (baseFeedPlayerView != null) {
            baseFeedPlayerView.VJ2();
        }
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null) {
            c0sz8LLJLLL.LLFF();
        }
    }

    public final VideoPlayViewModel LLLLLLL() {
        return (VideoPlayViewModel) this.LLLIL.getValue();
    }

    public final VideoViewModel LLLLLLZZ() {
        return (VideoViewModel) this.LLLIILIL.getValue();
    }

    public final FeedCollectionViewPagerAbility LLLLLZ() {
        return (FeedCollectionViewPagerAbility) this.LLLILZJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final List<Aweme> VA1() {
        return new ArrayList();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final Fragment getFragment() {
        return this.LLLI.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.InterfaceC583650Mup
    public final View getVideoView() {
        BaseFeedPlayerView baseFeedPlayerView = this.LLLIIII;
        if (baseFeedPlayerView != null) {
            return baseFeedPlayerView.getVideoView();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final BaseFeedPageParams nJ2() {
        return this.LLLI.LJ;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.CollectionVHAbility
    public final void xc2() {
        BottomToastVM bottomToastVM = (BottomToastVM) this.LLLILZ.getValue();
        if (bottomToastVM != null) {
            int i = C0RGL.LIZ;
            C1389910mGz c1389910mGz = bottomToastVM.LL;
            if (c1389910mGz != null) {
                c1389910mGz.LIZJ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.InterfaceC739930T0t
    public final void Fm() {
        InterfaceC739930T0t interfaceC739930T0tLJIJJLI;
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL == null || (interfaceC739930T0tLJIJJLI = c0sz8LLJLLL.LJIJJLI()) == null) {
            return;
        }
        interfaceC739930T0tLJIJJLI.Fm();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.C0SZ8
    public final void G() {
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null) {
            c0sz8LLJLLL.G();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IPlayerProgressAbility
    public final LiveData<Integer> Hw() {
        InterfaceC494301wD interfaceC494301wDLIZ;
        CommonCellAbility commonCellAbility;
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        LiveData<Integer> liveDataHw;
        CommonCellAbility commonCellAbility2;
        InterfaceC713360RyY interfaceC713360RyYFz22;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null) {
            if (!(c0sz8LLJLLL instanceof CommonCellAbility) || (commonCellAbility2 = (CommonCellAbility) c0sz8LLJLLL) == null || (interfaceC713360RyYFz22 = commonCellAbility2.Fz2()) == null || (interfaceC665370Q7zLIZIZ2 = C1558420qem.LIZIZ(interfaceC713360RyYFz22)) == null || (interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, IPlayerProgressAbility.class, null)) == null) {
                C0SZ8 c0sz8LLJLLL2 = c0sz8LLJLLL.LLJLLL();
                interfaceC494301wDLIZ = (!(c0sz8LLJLLL2 instanceof CommonCellAbility) || (commonCellAbility = (CommonCellAbility) c0sz8LLJLLL2) == null || (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) == null || (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) == null) ? null : C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, IPlayerProgressAbility.class, null);
            }
            IPlayerProgressAbility iPlayerProgressAbility = (IPlayerProgressAbility) interfaceC494301wDLIZ;
            if (iPlayerProgressAbility != null && (!Intrinsics.LJFF(iPlayerProgressAbility, this)) && (liveDataHw = iPlayerProgressAbility.Hw()) != null) {
                return liveDataHw;
            }
        }
        return new MutableLiveData(0);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8, X.C0SZA
    public Aweme LJIIIIZZ() {
        Aweme aweme;
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        return (c0sz8LLJLLL == null || (aweme = c0sz8LLJLLL.getAweme()) == null) ? this.LLJJIJIIJIL : aweme;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final C0SKK LJLLLL() {
        C0SKK c0skkLJLLLL;
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        return (c0sz8LLJLLL == null || (c0skkLJLLLL = c0sz8LLJLLL.LJLLLL()) == null) ? C0SKK.INITIALIZED : c0skkLJLLLL;
    }

    @Override // X.C0RGM
    public void LLI() {
        ViewGroup viewGroup;
        FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityLLLLLZ = LLLLLZ();
        View view = feedCollectionViewPagerAbilityLLLLLZ != null ? feedCollectionViewPagerAbilityLLLLLZ.getView() : null;
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

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LLIZLLLIL() {
        if (C1483410ohn.LJLJJI().isPlaying()) {
            LLLLLLL().zQ2();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LLJJJIL() {
        if (C1483410ohn.LJLJJI().isPlaying()) {
            LLLLLLL().yQ2(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LLJLL() {
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null) {
            c0sz8LLJLLL.LLJLL();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final C0SZ8 LLJLLL() {
        FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityLLLLLZ = LLLLLZ();
        if (feedCollectionViewPagerAbilityLLLLLZ != null) {
            return feedCollectionViewPagerAbilityLLLLLZ.LJLIL();
        }
        return null;
    }

    public final Aweme LLLLILI() {
        Aweme awemeLJIIIIZZ = LJIIIIZZ();
        String str = "";
        try {
            JSONObject jSONObject = this.LLLIIIL;
            if (jSONObject != null) {
                String string = JSONObjectProtectorUtils.getString(jSONObject, "request_id");
                if (string != null) {
                    str = string;
                }
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!TextUtils.isEmpty(str) && awemeLJIIIIZZ != null) {
            awemeLJIIIIZZ.setRequestId(str);
        }
        return awemeLJIIIIZZ;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final C584270Mvp LLLLLJIL() {
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null) {
            return c0sz8LLJLLL.LLLLLJIL();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final boolean LLLZ() {
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null) {
            return c0sz8LLJLLL.LLLZ();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final boolean LLLZZIL() {
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null) {
            return c0sz8LLJLLL.LLLZZIL();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final View Vy1() {
        InterfaceC494301wD interfaceC494301wDLIZ;
        CommonCellAbility commonCellAbility;
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        CommonCellAbility commonCellAbility2;
        InterfaceC713360RyY interfaceC713360RyYFz22;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL == null) {
            return null;
        }
        if (!(c0sz8LLJLLL instanceof CommonCellAbility) || (commonCellAbility2 = (CommonCellAbility) c0sz8LLJLLL) == null || (interfaceC713360RyYFz22 = commonCellAbility2.Fz2()) == null || (interfaceC665370Q7zLIZIZ2 = C1558420qem.LIZIZ(interfaceC713360RyYFz22)) == null || (interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, IVideoCellAbility.class, null)) == null) {
            C0SZ8 c0sz8LLJLLL2 = c0sz8LLJLLL.LLJLLL();
            interfaceC494301wDLIZ = (!(c0sz8LLJLLL2 instanceof CommonCellAbility) || (commonCellAbility = (CommonCellAbility) c0sz8LLJLLL2) == null || (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) == null || (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) == null) ? null : C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, IVideoCellAbility.class, null);
        }
        IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) interfaceC494301wDLIZ;
        if (iVideoCellAbility == null || !(!Intrinsics.LJFF(iVideoCellAbility, this))) {
            return null;
        }
        return iVideoCellAbility.Vy1();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.InterfaceC583650Mup
    public final void Z1() {
        LLLLLLL().yQ2(true);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public Aweme getAweme() {
        return LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public Aweme hm() {
        return LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final boolean l() {
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null) {
            return c0sz8LLJLLL.l();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final boolean l1() {
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null) {
            return c0sz8LLJLLL.l1();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.InterfaceC739930T0t
    public final void no() {
        InterfaceC739930T0t interfaceC739930T0tLJIJJLI;
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL == null || (interfaceC739930T0tLJIJJLI = c0sz8LLJLLL.LJIJJLI()) == null) {
            return;
        }
        interfaceC739930T0tLJIJJLI.no();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.C0SZ8
    public void onDestroyView() {
        super.onDestroyView();
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
        C1558520qew.LJIIJJI(interfaceC665370Q7zLIZIZ, CommonCellAbility.class, null);
        C1558520qew.LJIIJJI(interfaceC665370Q7zLIZIZ, CollectionVHAbility.class, null);
        C1558520qew.LJIIJJI(interfaceC665370Q7zLIZIZ, IVideoCellAbility.class, null);
        C1558520qew.LJIIJJI(interfaceC665370Q7zLIZIZ, FeedPlayerViewInitAbility.class, null);
        C1558520qew.LJIIJJI(interfaceC665370Q7zLIZIZ, IPlayerProgressAbility.class, null);
        C1558520qew.LJIIJJI(interfaceC665370Q7zLIZIZ, PlayEventDispatchAbility.class, null);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.C0SZ8
    public final void onPause() {
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null) {
            c0sz8LLJLLL.onPause();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final View.OnTouchListener q5() {
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null) {
            return c0sz8LLJLLL.q5();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.InterfaceC583650Mup
    public final void sc() {
        LLLLLLL().yQ2(true);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.C0SZ8
    public final InterfaceC583650Mup x3() {
        return C729510SjV.LJJJIL(LJIIIIZZ()) ? (C583630Mun) this.LLLIIIIL.getValue() : this;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final BaseFeedPlayerView E() {
        return this.LLLIIII;
    }

    @Override // X.C0RGJ
    public final String gq() {
        return this.LLLII;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.C0SZ8
    public final void Ar(Aweme aweme) {
        LLLLLLZZ().yQ2(aweme);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.CollectionVHAbility
    public void Dk2(C693070RGn c693070RGn) {
        if (!C710930Rud.LJFF(c693070RGn.LIZ, c693070RGn.LJI)) {
            LLLLLLL().zQ2();
        }
        LLLLZI(c693070RGn);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void F0(String str) {
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null) {
            c0sz8LLJLLL.F0(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.C0SZ8
    public final void K1(boolean z) {
        VideoViewModel videoViewModelLLLLLLZZ = LLLLLLZZ();
        videoViewModelLLLLLLZZ.getClass();
        videoViewModelLLLLLLZZ.setState(new C0R8C(z));
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void K8(View.OnTouchListener onTouchListener) {
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null) {
            c0sz8LLJLLL.K8(onTouchListener);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.BaseCollectionViewHolder, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public void LJJIJIIJIL(int i) {
        Aweme item;
        super.LJJIJIIJIL(i);
        FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityLLLLLZ = LLLLLZ();
        if (feedCollectionViewPagerAbilityLLLLLZ != null) {
            int iLJIL = feedCollectionViewPagerAbilityLLLLLZ.LJIL();
            FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityLLLLLZ2 = LLLLLZ();
            if (feedCollectionViewPagerAbilityLLLLLZ2 != null && (item = feedCollectionViewPagerAbilityLLLLLZ2.getItem(iLJIL)) != null) {
                C729510SjV.LIZLLL(item, new AwS590S0100000_11(this, (BaseCollectionFeedVH<C0SMO<Object, VideoItemParams>>) 115));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final C0SZ8 LJJIJIL(String str) {
        C0SZ8 c0sz8LJJIJIL;
        FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityLLLLLZ = LLLLLZ();
        C0SZ8 c0sz8LJLIL = null;
        if (feedCollectionViewPagerAbilityLLLLLZ != null) {
            c0sz8LJJIJIL = feedCollectionViewPagerAbilityLLLLLZ.LJJIJIL(str);
        } else {
            c0sz8LJJIJIL = null;
        }
        FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityLLLLLZ2 = LLLLLZ();
        if (feedCollectionViewPagerAbilityLLLLLZ2 != null) {
            c0sz8LJLIL = feedCollectionViewPagerAbilityLLLLLZ2.LJLIL();
        }
        if (Intrinsics.LJFF(c0sz8LJJIJIL, c0sz8LJLIL) && c0sz8LJLIL != null) {
            return this;
        }
        return c0sz8LJJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LJJIL(C0R6M c0r6m) {
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null) {
            c0sz8LLJLLL.LJJIL(c0r6m);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LJJIZ(C0RHA c0rha) {
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null) {
            c0sz8LLJLLL.LJJIZ(c0rha);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LJLIIIL(int i) {
        super.LJLIIIL(i);
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null) {
            c0sz8LLJLLL.LJLIIIL(i);
        }
        VideoViewModel videoViewModelLLLLLLZZ = LLLLLLZZ();
        videoViewModelLLLLLLZZ.getClass();
        videoViewModelLLLLLLZZ.setState(new AwS26S0001000_11(i, 6));
        if (i != 1 && i != 6) {
            if (i == 5) {
                LLLLLLL().zQ2();
            } else {
                LLLLLLL().xQ2(1);
            }
            LLLLLLZZ().zQ2();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LLIIII(boolean z) {
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null) {
            c0sz8LLJLLL.LLIIII(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LLIIIJ(C0SYH c0syh) {
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null) {
            c0sz8LLJLLL.LLIIIJ(c0syh);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LLJLIL(Long l) {
        long jLongValue = l.longValue();
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null) {
            c0sz8LLJLLL.LLJLIL(Long.valueOf(jLongValue));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LLLI(int i) {
        super.LLLI(i);
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null) {
            c0sz8LLJLLL.LLLI(i);
        }
        if (i != 1 && i != 2) {
            return;
        }
        LLLLLLZZ().AQ2();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder
    public final void LLLL(Aweme aweme) {
        this.LLJJIJIIJIL = aweme;
        BaseFeedPageParams baseFeedPageParams = this.LLLI.LJ;
        this.LLLIIIL = C708600Rqs.LIZ(baseFeedPageParams.pageType, aweme, baseFeedPageParams.param.getEnterMethodValue(), this.LLLI.LJ.eventType);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.InterfaceC583650Mup
    public final void LLLLIL(Aweme aweme) {
        InterfaceC583650Mup interfaceC583650Mup;
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if ((c0sz8LLJLLL instanceof InterfaceC583650Mup) && (interfaceC583650Mup = (InterfaceC583650Mup) c0sz8LLJLLL) != null) {
            interfaceC583650Mup.LLLLIL(aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.common.ability.FeedPlayerViewInitAbility
    public final void Wo0(BaseFeedPlayerView baseFeedPlayerView) {
        this.LLLIIII = baseFeedPlayerView;
        baseFeedPlayerView.Dn(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void g1(int i) {
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null) {
            c0sz8LLJLLL.g1(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.BaseCollectionViewHolder, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public void h(boolean z) {
        String aid;
        super.h(z);
        VideoViewModel videoViewModelLLLLLLZZ = LLLLLLZZ();
        Aweme aweme = this.LLJJIJIIJIL;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        videoViewModelLLLLLLZZ.CQ2(aid, z);
        if (C729510SjV.LJJIJIL(LJIIIIZZ())) {
            C735840Sti.LIZ.getClass();
            C735840Sti.LIZIZ = "slide";
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        OnUIPlayListener onUIPlayListener;
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if ((c0sz8LLJLLL instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) c0sz8LLJLLL) != null) {
            onUIPlayListener.onBuffering(z);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(C0RD4 c0rd4) {
        C0SZ8 c0sz8LLJLLL;
        CommonCellAbility commonCellAbility;
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        CommonCellAbility commonCellAbility2;
        InterfaceC713360RyY interfaceC713360RyYFz22;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        InterfaceC494301wD interfaceC494301wDLIZ;
        Bundle bundle;
        boolean z;
        String authorUid;
        String secUid;
        String str;
        HashMap<String, String> mobParams;
        String str2;
        User author;
        InterfaceC214902198i interfaceC214902198i;
        User author2;
        C0SR4 c0sr4LJJLIIIJL;
        C0RD4 c0rd42 = c0rd4;
        String str3 = c0rd42.LIZ;
        boolean z2 = false;
        Object obj = null;
        numValueOf = null;
        Integer numValueOf = null;
        Object objLIZLLL = null;
        String aid = null;
        Object obj2 = null;
        interfaceC494301wDLIZ = null;
        interfaceC494301wDLIZ = null;
        interfaceC494301wDLIZ = null;
        InterfaceC494301wD interfaceC494301wDLIZ2 = null;
        switch (str3.hashCode()) {
            case -1618328215:
                if (!str3.equals("video_digg")) {
                    return;
                }
                C0HTT<C737030Svd> c0htt = this.LLLI.LIZIZ;
                Object obj3 = c0rd42.LIZIZ;
                if (obj3 != null) {
                    obj = obj3;
                }
                c0htt.LLIIL(new C737030Svd(((Number) obj).intValue(), LLLLILI()));
                return;
            case -1245454328:
                if (!str3.equals("VIDEO_CANCEL_REPORT_SKIP_BEHAVIOR")) {
                    return;
                }
                C0SZ8 c0sz8LLJLLL2 = LLJLLL();
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
                if (subCellAbility == null) {
                    return;
                }
                subCellAbility.KF1();
                return;
            case -962685926:
                if (!str3.equals("on_render_ready")) {
                    return;
                }
                this.LLLI.LIZIZ.LLIIL(new C737030Svd(53, LLLLILI()));
                return;
            case -162745511:
                if (!str3.equals("feed_internal_event")) {
                    return;
                }
                C0HTT<C737030Svd> c0htt2 = this.LLLI.LIZIZ;
                Object obj4 = c0rd42.LIZIZ;
                if (obj4 != null) {
                    obj2 = obj4;
                }
                c0htt2.LLIIL(obj2);
                return;
            case -144973899:
                if (!str3.equals("title_view_click")) {
                    return;
                }
                break;
            case 1181771620:
                if (!str3.equals("video_share_click")) {
                    return;
                }
                Aweme awemeLLLLILI = LLLLILI();
                C735280Sso.LIZ.getClass();
                if (!C735280Sso.LJ(awemeLLLLILI) || !C735280Sso.LJFF(awemeLLLLILI) || (awemeLLLLILI != null && AwemeExtKt.isCollected(awemeLLLLILI))) {
                    C737030Svd c737030Svd = new C737030Svd(3, awemeLLLLILI);
                    LLLLLLLLL();
                    c737030Svd.LJIIJ = "story_share_icon";
                    Object obj5 = c0rd42.LIZIZ;
                    if (obj5 == null) {
                        obj5 = null;
                    }
                    if ((obj5 instanceof Bundle) && (bundle = (Bundle) obj5) != null) {
                        c737030Svd.LIZJ = bundle;
                    }
                    this.LLLI.LIZIZ.LLIIL(c737030Svd);
                    return;
                }
                C1389890mGx c1389890mGx = new C1389890mGx(this.LLLI.LIZJ);
                c1389890mGx.LJIIIZ(2131858551);
                c1389890mGx.LJIIJJI();
                return;
            case 1964086245:
                if (!str3.equals("to_profile")) {
                    return;
                }
                break;
            default:
                return;
        }
        String str4 = "";
        if (Intrinsics.LJFF(this.LLLI.LJ.param.getFrom(), "STORY_ENTRANCE_HIGHLIGHTS") && !Intrinsics.LJFF(c0rd42.LIZ, "to_profile")) {
            Aweme awemeLJIIIIZZ = LJIIIIZZ();
            if (awemeLJIIIIZZ != null) {
                author2 = awemeLJIIIIZZ.getAuthor();
            } else {
                author2 = null;
            }
            if (C10EU.LJIILLIIL(author2)) {
                C2189821An6 c2189821An6 = this.LLLI.LJ.param;
                IStoryHighlightsImmersiveActionService iStoryHighlightsImmersiveActionService = (IStoryHighlightsImmersiveActionService) PluggableExtentionKt.pluggableSpi$default(IStoryHighlightsImmersiveActionService.class, false, false, false, 14, null);
                if (iStoryHighlightsImmersiveActionService == null) {
                    return;
                }
                Aweme awemeLJIIIIZZ2 = LJIIIIZZ();
                Context context = this.LLJILJILJ.LIZ.getContext();
                Fragment fragment = this.LLLI.LIZJ;
                FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityLLLLLZ = LLLLLZ();
                if (feedCollectionViewPagerAbilityLLLLLZ != null && (c0sr4LJJLIIIJL = feedCollectionViewPagerAbilityLLLLLZ.LJJLIIIJL()) != null) {
                    numValueOf = Integer.valueOf(c0sr4LJJLIIIJL.getCount());
                }
                String eventType = c2189821An6.getEventType();
                if (eventType != null) {
                    str4 = eventType;
                }
                iStoryHighlightsImmersiveActionService.LIZ(awemeLJIIIIZZ2, context, fragment, numValueOf, str4, "click_title", new AwS555S0100000_11(this, (BaseCollectionFeedVH<C0SMO<Object, VideoItemParams>>) 9), new AwS590S0100000_11(this, (BaseCollectionFeedVH<C0SMO<Object, VideoItemParams>>) 5));
                return;
            }
        }
        Aweme awemeLJIIIIZZ3 = LJIIIIZZ();
        C2189821An6 c2189821An62 = this.LLLI.LJ.param;
        if (!Intrinsics.LJFF(c2189821An62.getFrom(), "STORY_ENTRANCE_MINE") && !Intrinsics.LJFF(c2189821An62.getFrom(), "STORY_ENTRANCE_OTHER")) {
            z = false;
        } else {
            z = true;
        }
        if (c2189821An62.getVideoType() == 14) {
            z2 = true;
        }
        if (C729980SkG.LJIIIIZZ(awemeLJIIIIZZ3) && z && !z2) {
            IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
            if (iDetailFeedSafService != null) {
                objLIZLLL = iDetailFeedSafService.LIZLLL(this.LLLI.LIZJ);
            }
            if ((objLIZLLL instanceof InterfaceC214902198i) && (interfaceC214902198i = (InterfaceC214902198i) objLIZLLL) != null) {
                interfaceC214902198i.onBackPressed();
                return;
            }
            C19EG c19eg = this.LLJILLL;
            if (c19eg == null) {
                return;
            }
            c19eg.onBackPressed();
            return;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LLJILJILJ.LIZ.getContext(), "aweme://user/profile/");
        if (awemeLJIIIIZZ3 != null) {
            authorUid = AwemeExtKt.getAuthorUid(awemeLJIIIIZZ3);
        } else {
            authorUid = null;
        }
        smartRouteBuildRoute.withParam("uid", authorUid);
        if (awemeLJIIIIZZ3 != null && (author = awemeLJIIIIZZ3.getAuthor()) != null) {
            secUid = author.getSecUid();
        } else {
            secUid = null;
        }
        smartRouteBuildRoute.withParam("sec_user_id", secUid);
        if (awemeLJIIIIZZ3 != null) {
            aid = awemeLJIIIIZZ3.getAid();
        }
        smartRouteBuildRoute.withParam("video_id", aid);
        smartRouteBuildRoute.withParam("enter_from", this.LLLI.LJIIIZ);
        smartRouteBuildRoute.withParam("extra_from_pre_page", this.LLLI.LJIIIZ);
        String str5 = "click_head";
        if (Intrinsics.LJFF(c0rd42.LIZ, "to_profile")) {
            str = "click_head";
        } else {
            str = "click_name";
        }
        smartRouteBuildRoute.withParam("enter_method", str);
        if (awemeLJIIIIZZ3 != null && (mobParams = awemeLJIIIIZZ3.getMobParams()) != null && (str2 = mobParams.get("is_from_push")) != null && Intrinsics.LJFF(str2, "1")) {
            smartRouteBuildRoute.withParam("is_from_push", 1);
            String str6 = mobParams.get("push_type");
            if (str6 == null) {
                str6 = "";
            }
            smartRouteBuildRoute.withParam("push_type", str6);
            String str7 = mobParams.get("push_id");
            if (str7 != null) {
                str4 = str7;
            }
            smartRouteBuildRoute.withParam("push_id", str4);
        }
        smartRouteBuildRoute.open();
        C0RHP c0rhp = C0RHP.LIZ;
        Context context2 = this.LLJILJILJ.LIZ.getContext();
        Aweme awemeLJIIIIZZ4 = LJIIIIZZ();
        BaseFeedPageParams baseFeedPageParams = this.LLLI.LJ;
        int i = baseFeedPageParams.pageType;
        String str8 = baseFeedPageParams.eventType;
        String from = baseFeedPageParams.param.getFrom();
        if (!Intrinsics.LJFF(c0rd42.LIZ, "to_profile")) {
            str5 = "click_name";
        }
        String strLLLLJI = LLLLJI();
        c0rhp.getClass();
        C0RHP.LIZ(context2, awemeLJIIIIZZ4, i, str8, from, str5, strLLLLJI, null, null);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        OnUIPlayListener onUIPlayListener;
        LLLLLLL().xQ2(2);
        LLLLLLL().onPausePlay(str);
        BaseFeedPlayerView baseFeedPlayerView = this.LLLIIII;
        if (baseFeedPlayerView != null) {
            baseFeedPlayerView.onPausePlay(str);
        }
        FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityLLLLLZ = LLLLLZ();
        C0SZ8 c0sz8LJJIJIL = null;
        if (feedCollectionViewPagerAbilityLLLLLZ != null) {
            c0sz8LJJIJIL = feedCollectionViewPagerAbilityLLLLLZ.LJJIJIL(str);
        }
        if ((c0sz8LJJIJIL instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) c0sz8LJJIJIL) != null) {
            onUIPlayListener.onPausePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        OnUIPlayListener onUIPlayListener;
        LLLLLLL().onPlayCompleted(str);
        BaseFeedPlayerView baseFeedPlayerView = this.LLLIIII;
        if (baseFeedPlayerView != null) {
            baseFeedPlayerView.onPlayCompleted(str);
        }
        FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityLLLLLZ = LLLLLZ();
        C0SZ8 c0sz8LJJIJIL = null;
        if (feedCollectionViewPagerAbilityLLLLLZ != null) {
            c0sz8LJJIJIL = feedCollectionViewPagerAbilityLLLLLZ.LJJIJIL(str);
        }
        if ((c0sz8LJJIJIL instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) c0sz8LJJIJIL) != null) {
            onUIPlayListener.onPlayCompleted(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        OnUIPlayListener onUIPlayListener;
        LLLLLLL().wQ2();
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if ((c0sz8LLJLLL instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) c0sz8LLJLLL) != null) {
            onUIPlayListener.onPlayCompletedFirstTime(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(C1481290oeN c1481290oeN) {
        OnUIPlayListener onUIPlayListener;
        LLLLLLL().xQ2(3);
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if ((c0sz8LLJLLL instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) c0sz8LLJLLL) != null) {
            onUIPlayListener.onPlayFailed(c1481290oeN);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        OnUIPlayListener onUIPlayListener;
        BaseFeedPlayerView baseFeedPlayerView = this.LLLIIII;
        if (baseFeedPlayerView != null) {
            baseFeedPlayerView.onPlayProgressChange(f);
        }
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if ((c0sz8LLJLLL instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) c0sz8LLJLLL) != null) {
            onUIPlayListener.onPlayProgressChange(f);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        OnUIPlayListener onUIPlayListener;
        FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityLLLLLZ = LLLLLZ();
        C0SZ8 c0sz8LJJIJIL = null;
        if (feedCollectionViewPagerAbilityLLLLLZ != null) {
            c0sz8LJJIJIL = feedCollectionViewPagerAbilityLLLLLZ.LJJIJIL(str);
        }
        if ((c0sz8LJJIJIL instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) c0sz8LJJIJIL) != null) {
            onUIPlayListener.onPlayStop(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        OnUIPlayListener onUIPlayListener;
        LLLLLLL().onPreparePlay(str);
        BaseFeedPlayerView baseFeedPlayerView = this.LLLIIII;
        if (baseFeedPlayerView != null) {
            baseFeedPlayerView.onPreparePlay(str);
        }
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if ((c0sz8LLJLLL instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) c0sz8LLJLLL) != null) {
            onUIPlayListener.onPreparePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        OnUIPlayListener onUIPlayListener;
        VideoPlayViewModel videoPlayViewModelLLLLLLL = LLLLLLL();
        String sourceId = null;
        if (c1480420ocy != null) {
            sourceId = c1480420ocy.getSourceId();
        }
        videoPlayViewModelLLLLLLL.LJJIJIIJI(sourceId);
        BaseFeedPlayerView baseFeedPlayerView = this.LLLIIII;
        if (baseFeedPlayerView != null) {
            baseFeedPlayerView.onRenderFirstFrame(c1480420ocy);
        }
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if ((c0sz8LLJLLL instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) c0sz8LLJLLL) != null) {
            onUIPlayListener.onRenderFirstFrame(c1480420ocy);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(C1480430ocz c1480430ocz) {
        OnUIPlayListener onUIPlayListener;
        ((DataCenter) this.LLLIIL.getValue()).zQ2(null, "on_render_ready");
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if ((c0sz8LLJLLL instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) c0sz8LLJLLL) != null) {
            onUIPlayListener.onRenderReady(c1480430ocz);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        OnUIPlayListener onUIPlayListener;
        LLLLLLL().onResumePlay(str);
        BaseFeedPlayerView baseFeedPlayerView = this.LLLIIII;
        if (baseFeedPlayerView != null) {
            baseFeedPlayerView.onResumePlay(str);
        }
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if ((c0sz8LLJLLL instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) c0sz8LLJLLL) != null) {
            onUIPlayListener.onResumePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.InterfaceC583650Mup
    public final void ys(int i) {
        InterfaceC583650Mup interfaceC583650Mup;
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if ((c0sz8LLJLLL instanceof InterfaceC583650Mup) && (interfaceC583650Mup = (InterfaceC583650Mup) c0sz8LLJLLL) != null) {
            interfaceC583650Mup.ys(i);
        }
    }

    public BaseCollectionFeedVH(C0RF0 c0rf0, C0RGQ c0rgq) {
        super(c0rf0, c0rgq);
        this.LLLI = c0rf0;
        this.LLLII = "";
        StoryImmersiveCollectionVH storyImmersiveCollectionVH = (StoryImmersiveCollectionVH) this;
        this.LLLIIIIL = C452501pT.LIZIZ(new AwS555S0100000_11(storyImmersiveCollectionVH, 8));
        C630740Ooa c630740OoaLIZ = C628500Oky.LIZ(new AwS555S0100000_11(storyImmersiveCollectionVH, 6));
        this.LLLIIL = c630740OoaLIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoViewModel.class);
        AFwS243S0000000_11 aFwS243S0000000_11 = AFwS243S0000000_11.get$arr$(5);
        EnumC452301pR enumC452301pR = EnumC452301pR.SYNCHRONIZED;
        this.LLLIILIL = C737910Sx3.LIZLLL(this, c19719912DlLIZ, aFwS243S0000000_11, enumC452301pR);
        this.LLLIL = C737910Sx3.LIZLLL(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS243S0000000_11.get$arr$(6), enumC452301pR);
        this.LLLILZ = C628500Oky.LIZ(new AwS555S0100000_11(storyImmersiveCollectionVH, 5));
        this.LLLILZJ = C628500Oky.LIZ(new AwS555S0100000_11(storyImmersiveCollectionVH, 11));
        this.LLLILZLLLI = C628500Oky.LIZ(new AwS555S0100000_11(storyImmersiveCollectionVH, 10));
        this.LLLIZZ = C628500Oky.LIZ(new AwS555S0100000_11(storyImmersiveCollectionVH, 7));
        this.LLLJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(9));
        DataCenter dataCenter = (DataCenter) c630740OoaLIZ.getValue();
        dataCenter.yQ2("feed_internal_event", this, false);
        dataCenter.yQ2("video_share_click", this, false);
        dataCenter.yQ2("on_render_ready", this, false);
        dataCenter.yQ2("video_digg", this, false);
        dataCenter.yQ2("title_view_click", this, false);
        dataCenter.yQ2("to_profile", this, false);
        dataCenter.yQ2("VIDEO_CANCEL_REPORT_SKIP_BEHAVIOR", this, false);
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
        C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this, CommonCellAbility.class, null, null);
        C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this, CollectionVHAbility.class, null, null);
        C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this, IVideoCellAbility.class, null, null);
        C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this, FeedPlayerViewInitAbility.class, null, null);
        C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this, IPlayerProgressAbility.class, null, null);
        C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this, PlayEventDispatchAbility.class, null, null);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.BaseCollectionViewHolder, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.InterfaceC1473950oSX
    public final void LLILLIZIL(int i, int i2) {
        VideoPlayViewModel videoPlayViewModelLLLLLLL = LLLLLLL();
        videoPlayViewModelLLLLLLL.getClass();
        videoPlayViewModelLLLLLLL.setState(new C690660R7g());
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LLJJ(int i, boolean z) {
        VideoPlayViewModel videoPlayViewModelLLLLLLL = LLLLLLL();
        videoPlayViewModelLLLLLLL.getClass();
        videoPlayViewModelLLLLLLL.setState(new AwS5S0011000_11(z, i, 1));
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder
    public final VideoItemParams LLLIILIL(Aweme aweme, boolean z) {
        VideoItemParams videoItemParamsLIZ = C0RAF.LIZ(this.LLLI);
        videoItemParamsLIZ.setAweme(aweme);
        videoItemParamsLIZ.setDataCenter((DataCenter) this.LLLIIL.getValue());
        videoItemParamsLIZ.setRequestId(this.LLLIIIL);
        videoItemParamsLIZ.setEnterMethodValue(videoItemParamsLIZ.mEnterMethodValue);
        videoItemParamsLIZ.currentPosition = this.LLJJIJIL;
        videoItemParamsLIZ.setFromInnerBind(z);
        return videoItemParamsLIZ;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LLLLIILL(int i, String str) {
        String str2;
        if (C729510SjV.LJJIIZI(LJIIIIZZ())) {
            StoryNoteDataCollection storyNoteDataCollectionKO = ((IStoryThoughtMyDataManager) this.LLLJ.getValue()).KO(false);
            if (storyNoteDataCollectionKO != null) {
                str2 = storyNoteDataCollectionKO.aid;
            } else {
                str2 = null;
            }
            if (Intrinsics.LJFF(str2, str)) {
                ((StoryNoteStatusChangeCallback) this.LLLJ.getValue()).onStoryNoteDelete();
            }
        }
        FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityLLLLLZ = LLLLLZ();
        if (feedCollectionViewPagerAbilityLLLLLZ != null) {
            feedCollectionViewPagerAbilityLLLLLZ.jd2(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.bytedance.ext_power_list.AssemReusedContainer, X.C0SMN
    /* JADX INFO: renamed from: LLLLZ, reason: merged with bridge method [inline-methods] */
    public final void SN1(int i, VideoItemParams videoItemParams) {
        Aweme aweme;
        String str;
        if (videoItemParams != null) {
            aweme = videoItemParams.getAweme();
        } else {
            aweme = null;
        }
        Map<Integer, String> map = C691100R8y.LIZ;
        if (aweme == null) {
            str = "";
        } else if (C729510SjV.LJJIJIL(aweme)) {
            str = "cell_story";
        } else if (C582980Mtk.LIZIZ(aweme)) {
            str = "cell_photos";
        } else if (C0NC0.LIZ(aweme)) {
            str = "cell_text";
        } else {
            str = "cell_feed";
        }
        this.LLLII = str;
        LLLIZZ().LL.LIZIZ = this.LLLII;
        super.SN1(i, videoItemParams);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void Z(int i, boolean z) {
        VideoPlayViewModel videoPlayViewModelLLLLLLL = LLLLLLL();
        videoPlayViewModelLLLLLLL.getClass();
        videoPlayViewModelLLLLLLL.setState(new AwS5S0011000_11(z, i, 0));
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(String str, C1481290oeN c1481290oeN) {
        OnUIPlayListener onUIPlayListener;
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if ((c0sz8LLJLLL instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) c0sz8LLJLLL) != null) {
            onUIPlayListener.onRetryOnError(str, c1481290oeN);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
        OnUIPlayListener onUIPlayListener;
        if (z) {
            VideoPlayViewModel videoPlayViewModelLLLLLLL = LLLLLLL();
            videoPlayViewModelLLLLLLL.getClass();
            videoPlayViewModelLLLLLLL.setState(new AwS62S1000000_11(str, 15));
        }
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if ((c0sz8LLJLLL instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) c0sz8LLJLLL) != null) {
            onUIPlayListener.onSeekEnd(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSpeedChanged(String str, float f) {
        OnUIPlayListener onUIPlayListener;
        VideoPlayViewModel videoPlayViewModelLLLLLLL = LLLLLLL();
        videoPlayViewModelLLLLLLL.getClass();
        videoPlayViewModelLLLLLLL.setState(new AwS0S1000001_11(str, f, 1));
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if ((c0sz8LLJLLL instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) c0sz8LLJLLL) != null) {
            onUIPlayListener.onSpeedChanged(str, f);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayProgressChange(String str, long j, long j2) {
        float f;
        OnUIPlayListener onUIPlayListener;
        VideoPlayViewModel videoPlayViewModelLLLLLLL = LLLLLLL();
        videoPlayViewModelLLLLLLL.getClass();
        videoPlayViewModelLLLLLLL.setState(new C690620R7c(j));
        if (j2 == 0) {
            f = 0.0f;
        } else {
            f = (j * 100.0f) / j2;
        }
        VideoPlayViewModel videoPlayViewModelLLLLLLL2 = LLLLLLL();
        videoPlayViewModelLLLLLLL2.getClass();
        videoPlayViewModelLLLLLLL2.setState(new C690610R7b(f));
        VideoPlayViewModel videoPlayViewModelLLLLLLL3 = LLLLLLL();
        videoPlayViewModelLLLLLLL3.getClass();
        videoPlayViewModelLLLLLLL3.setState(new C690630R7d(j / 1000.0f));
        BaseFeedPlayerView baseFeedPlayerView = this.LLLIIII;
        if (baseFeedPlayerView != null) {
            baseFeedPlayerView.onPlayProgressChange(str, j, j2);
        }
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if ((c0sz8LLJLLL instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) c0sz8LLJLLL) != null) {
            onUIPlayListener.onPlayProgressChange(str, j, j2);
        }
        Aweme awemeLJIIIIZZ = LJIIIIZZ();
        if (awemeLJIIIIZZ != null && C582980Mtk.LIZIZ(awemeLJIIIIZZ)) {
            return;
        }
        VideoPlayViewModel videoPlayViewModelLLLLLLL4 = LLLLLLL();
        C0RHH c0rhh = new C0RHH(str, j, j2);
        videoPlayViewModelLLLLLLL4.getClass();
        videoPlayViewModelLLLLLLL4.setState(new AwS590S0100000_11(c0rhh, 490));
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i, float f) {
        OnUIPlayListener onUIPlayListener;
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if ((c0sz8LLJLLL instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) c0sz8LLJLLL) != null) {
            onUIPlayListener.onSeekStart(str, i, f);
        }
    }
}
