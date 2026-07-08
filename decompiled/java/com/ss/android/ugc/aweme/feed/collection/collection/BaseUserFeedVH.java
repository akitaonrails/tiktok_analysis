package com.ss.android.ugc.aweme.feed.collection.collection;

import X.C0HTT;
import X.C0R6M;
import X.C0R9L;
import X.C0RAF;
import X.C0RF0;
import X.C0RF2;
import X.C0RGJ;
import X.C0RGM;
import X.C0RHA;
import X.C0SKK;
import X.C0SMO;
import X.C0SYH;
import X.C0SZ8;
import X.C1365870leD;
import X.C1480420ocy;
import X.C1480430ocz;
import X.C1481290oeN;
import X.C1558360qeg;
import X.C1558420qem;
import X.C1558520qew;
import X.C584270Mvp;
import X.C628500Oky;
import X.C630740Ooa;
import X.C692910RFx;
import X.C737030Svd;
import X.InterfaceC582840MtW;
import X.InterfaceC583650Mup;
import X.InterfaceC690460R6m;
import X.InterfaceC713360RyY;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView;
import com.ss.android.ugc.aweme.feed.adapter.playerview.EmptyFeedPlayerView;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.ProviderViewHolderCompatibility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedVHProxyAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseUserFeedVH<R extends C0SMO<R, VideoItemParams>> extends BaseCollectionCell<R, VideoItemParams> implements C0RGM, InterfaceC582840MtW, CommonCellAbility, UserFeedVHProxyAbility {
    public final C0RF0 LLLI;
    public C0RGJ LLLII;
    public final C630740Ooa LLLIIII;
    public final C630740Ooa LLLIIIIL;
    public final EmptyFeedPlayerView LLLIIIL;
    public final ImageView LLLIIL;
    public boolean LLLIILIL;

    @Override // com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility
    public final InterfaceC713360RyY Fz2() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedVHProxyAbility
    public final void W50() {
        this.LLLIILIL = true;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final BaseFeedPlayerView E() {
        BaseFeedPlayerView baseFeedPlayerViewE;
        C0RGJ c0rgj = this.LLLII;
        return (c0rgj == null || (baseFeedPlayerViewE = c0rgj.E()) == null) ? this.LLLIIIL : baseFeedPlayerViewE;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final ImageView F2() {
        ImageView imageViewF2;
        C0RGJ c0rgj = this.LLLII;
        return (c0rgj == null || (imageViewF2 = c0rgj.F2()) == null) ? this.LLLIIL : imageViewF2;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.InterfaceC739930T0t
    public final void Fm() {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.Fm();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.C0SZ8
    public final void G() {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.G();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8, X.C0SZA
    public final Aweme LJIIIIZZ() {
        Aweme awemeLJIIIIZZ;
        C0RGJ c0rgj = this.LLLII;
        return (c0rgj == null || (awemeLJIIIIZZ = c0rgj.LJIIIIZZ()) == null) ? getAweme() : awemeLJIIIIZZ;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final C0SKK LJLLLL() {
        C0SKK c0skkLJLLLL;
        C0RGJ c0rgj = this.LLLII;
        return (c0rgj == null || (c0skkLJLLLL = c0rgj.LJLLLL()) == null) ? C0SKK.INITIALIZED : c0skkLJLLLL;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LLFF() {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.LLFF();
        }
    }

    @Override // X.C0RGM
    public final void LLI() {
        C0RGM c0rgm;
        C0RGJ c0rgj = this.LLLII;
        if (!(c0rgj instanceof C0RGM) || (c0rgm = (C0RGM) c0rgj) == null) {
            return;
        }
        c0rgm.LLI();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LLIZLLLIL() {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.LLIZLLLIL();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LLJJJIL() {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.LLJJJIL();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LLJLL() {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.LLJLL();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final C0SZ8 LLJLLL() {
        C0SZ8 c0sz8LLJLLL;
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj == null || (c0sz8LLJLLL = c0rgj.LLJLLL()) == null) {
            return null;
        }
        return c0sz8LLJLLL;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final C584270Mvp LLLLLJIL() {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            return c0rgj.LLLLLJIL();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final boolean LLLZ() {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            return c0rgj.LLLZ();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final boolean LLLZZIL() {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            return c0rgj.LLLZZIL();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.InterfaceC583650Mup
    public final void Z1() {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.Z1();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final Aweme getAweme() {
        Aweme aweme;
        C0RGJ c0rgj = this.LLLII;
        return (c0rgj == null || (aweme = c0rgj.getAweme()) == null) ? this.LLJJIJIIJIL : aweme;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.InterfaceC583650Mup
    public final int getContentType() {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            return c0rgj.getContentType();
        }
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final Aweme hm() {
        Aweme awemeHm;
        C0RGJ c0rgj = this.LLLII;
        return (c0rgj == null || (awemeHm = c0rgj.hm()) == null) ? getAweme() : awemeHm;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final boolean l() {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            return c0rgj.l();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final boolean l1() {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            return c0rgj.l1();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.InterfaceC739930T0t
    public final void no() {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.no();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.C0SZ8
    public final void onPause() {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.onPause();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final View.OnTouchListener q5() {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            return c0rgj.q5();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.InterfaceC583650Mup
    public final void sc() {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.sc();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void unBind() {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.unBind();
        }
        super.unBind();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.C0SZ8
    public final InterfaceC583650Mup x3() {
        InterfaceC583650Mup interfaceC583650MupX3;
        C0RGJ c0rgj = this.LLLII;
        return (c0rgj == null || (interfaceC583650MupX3 = c0rgj.x3()) == null) ? this : interfaceC583650MupX3;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.C0SZ8
    public final void onDestroyView() {
        IDetailFeedSafService iDetailFeedSafService;
        List<C0RGJ> listVi;
        C1558520qew.LJIIJJI(C1558420qem.LIZIZ(this), CommonCellAbility.class, null);
        C1558520qew.LJIIJJI(C1558360qeg.LJFF(this.LLLI.LIZJ, null), UserFeedVHProxyAbility.class, null);
        if (!this.LLLIILIL || (iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null)) == null || iDetailFeedSafService.LIZLLL(this.LLLI.LIZJ) == null) {
            C0RGJ c0rgj = this.LLLII;
            if (c0rgj != null) {
                c0rgj.onDestroyView();
            }
        } else {
            UserFeedViewPagerAbility userFeedViewPagerAbility = (UserFeedViewPagerAbility) this.LLLIIII.getValue();
            if (userFeedViewPagerAbility != null && (listVi = userFeedViewPagerAbility.vi()) != null) {
                Iterator<C0RGJ> it2 = listVi.iterator();
                while (it2.hasNext()) {
                    it2.next().onDestroyView();
                }
            }
        }
        super.onDestroyView();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedVHProxyAbility
    public final C0RGJ iK2() {
        return this.LLLII;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.C0SZ8
    public final void Ar(Aweme aweme) {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.Ar(aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedVHProxyAbility
    public final void E01(C0RGJ c0rgj) {
        if (Intrinsics.LJFF(this.LLLII, c0rgj)) {
            this.LLLII = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void F0(String str) {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.F0(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedVHProxyAbility
    public final void FO0(C0RGJ c0rgj) {
        this.LLLII = c0rgj;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.C0SZ8
    public final void K1(boolean z) {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.K1(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void K8(View.OnTouchListener onTouchListener) {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.K8(onTouchListener);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.BaseCollectionViewHolder, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LJJIJIIJIL(int i) {
        super.LJJIJIIJIL(i);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final C0SZ8 LJJIJIL(String str) {
        UserFeedViewPagerAbility userFeedViewPagerAbility;
        ProviderViewHolderCompatibility providerViewHolderCompatibility;
        C0SZ8 c0sz8Zk0;
        C0RGJ c0rgj = this.LLLII;
        if ((c0rgj == null || (c0sz8Zk0 = c0rgj.LJJIJIL(str)) == null) && (((userFeedViewPagerAbility = (UserFeedViewPagerAbility) this.LLLIIII.getValue()) == null || (c0sz8Zk0 = userFeedViewPagerAbility.LJJIJIL(str)) == null) && ((providerViewHolderCompatibility = (ProviderViewHolderCompatibility) this.LLLIIIIL.getValue()) == null || (c0sz8Zk0 = providerViewHolderCompatibility.zk0(str)) == null))) {
            return null;
        }
        return c0sz8Zk0;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LJJIL(C0R6M c0r6m) {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.LJJIL(c0r6m);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LJJIZ(C0RHA c0rha) {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.LJJIZ(c0rha);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LJLIIIL(int i) {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.LJLIIIL(i);
        }
        super.LJLIIIL(i);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LLIIII(boolean z) {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.LLIIII(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LLIIIJ(C0SYH c0syh) {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.LLIIIJ(c0syh);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LLJLIL(Long l) {
        long jLongValue = l.longValue();
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.LLJLIL(Long.valueOf(jLongValue));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LLLI(int i) {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.LLLI(i);
        }
        super.LLLI(i);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.InterfaceC583650Mup
    public final void LLLLIL(Aweme aweme) {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.LLLLIL(aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void g1(int i) {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.g1(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.BaseCollectionViewHolder, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void h(boolean z) {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.h(z);
        }
        super.h(z);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.onBuffering(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        UserFeedViewPagerAbility userFeedViewPagerAbility = (UserFeedViewPagerAbility) this.LLLIIII.getValue();
        C0RGJ c0rgjQ11 = null;
        if (userFeedViewPagerAbility != null) {
            c0rgjQ11 = userFeedViewPagerAbility.Q11(str);
        }
        if ((c0rgjQ11 instanceof OnUIPlayListener) && c0rgjQ11 != null) {
            c0rgjQ11.onPausePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        UserFeedViewPagerAbility userFeedViewPagerAbility = (UserFeedViewPagerAbility) this.LLLIIII.getValue();
        C0RGJ c0rgjQ11 = null;
        if (userFeedViewPagerAbility != null) {
            c0rgjQ11 = userFeedViewPagerAbility.Q11(str);
        }
        if ((c0rgjQ11 instanceof OnUIPlayListener) && c0rgjQ11 != null) {
            c0rgjQ11.onPlayCompleted(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.onPlayCompletedFirstTime(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.onPlayProgressChange(f);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        UserFeedViewPagerAbility userFeedViewPagerAbility = (UserFeedViewPagerAbility) this.LLLIIII.getValue();
        C0RGJ c0rgjQ11 = null;
        if (userFeedViewPagerAbility != null) {
            c0rgjQ11 = userFeedViewPagerAbility.Q11(str);
        }
        if ((c0rgjQ11 instanceof OnUIPlayListener) && c0rgjQ11 != null) {
            c0rgjQ11.onPlayStop(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.onPreparePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.onRenderFirstFrame(c1480420ocy);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(C1480430ocz c1480430ocz) {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.onRenderReady(c1480430ocz);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.onResumePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void p(int i) {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.p(1);
        }
        super.p(1);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.C0SZ8
    public final void uq(C1365870leD c1365870leD) {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.uq(c1365870leD);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedVHProxyAbility
    public final C0RF0 vK(View view) {
        C0RF0 c0rf0 = this.LLLI;
        int i = c0rf0.LJIILJJIL;
        C0HTT<C737030Svd> c0htt = c0rf0.LIZIZ;
        Fragment fragment = c0rf0.LIZJ;
        View.OnTouchListener onTouchListener = c0rf0.LIZLLL;
        BaseFeedPageParams baseFeedPageParams = c0rf0.LJ;
        C0R9L c0r9l = c0rf0.LJFF;
        C692910RFx c692910RFx = c0rf0.LJI;
        View.OnTouchListener onTouchListener2 = c0rf0.LJII;
        InterfaceC690460R6m interfaceC690460R6m = c0rf0.LJIIIIZZ;
        String str = baseFeedPageParams.eventType;
        if (str == null) {
            str = "";
        }
        return new C0RF0(view, c0htt, fragment, onTouchListener, baseFeedPageParams, c0r9l, c692910RFx, onTouchListener2, interfaceC690460R6m, str, baseFeedPageParams.pageType, c0rf0.LJIIJJI, c0rf0.LJIIL, c0rf0.LJIILIIL, i, c0rf0.LJIILL, c0rf0.LJIILLIIL, null, 131072);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.InterfaceC583650Mup
    public final void ys(int i) {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.ys(i);
        }
    }

    public BaseUserFeedVH(C0RF0 c0rf0, C0RF2<R, VideoItemParams> c0rf2) {
        super(c0rf0, c0rf2);
        this.LLLI = c0rf0;
        this.LLLIIII = C628500Oky.LIZ(new AwS555S0100000_11((BaseUserFeedVH) this, 289));
        this.LLLIIIIL = C628500Oky.LIZ(new AwS555S0100000_11((BaseUserFeedVH) this, 288));
        Context context = c0rf0.LIZJ.getContext();
        if (context != null) {
            this.LLLIIIL = new EmptyFeedPlayerView(context);
            Context context2 = c0rf0.LIZJ.getContext();
            if (context2 != null) {
                this.LLLIIL = new ImageView(context2);
                C1558520qew.LJII(C1558420qem.LIZIZ(this), this, CommonCellAbility.class, null, null);
                C1558520qew.LJII(C1558360qeg.LJFF(c0rf0.LIZJ, null), this, UserFeedVHProxyAbility.class, null, null);
                return;
            }
            throw new NullPointerException("context is null!!");
        }
        throw new NullPointerException("context is null!!");
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LLJJ(int i, boolean z) {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.LLJJ(i, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder
    public final VideoItemParams LLLIILIL(Aweme aweme, boolean z) {
        BaseSubViewHolder baseSubViewHolder;
        VideoItemParams videoItemParamsLLLIILIL;
        C0RGJ c0rgj = this.LLLII;
        if (!(c0rgj instanceof BaseSubViewHolder) || (baseSubViewHolder = (BaseSubViewHolder) c0rgj) == null || (videoItemParamsLLLIILIL = baseSubViewHolder.LLLIILIL(aweme, false)) == null) {
            VideoItemParams videoItemParamsLIZ = C0RAF.LIZ(this.LLLI);
            videoItemParamsLIZ.setAweme(aweme);
            videoItemParamsLIZ.currentPosition = this.LLJJIJIL;
            return videoItemParamsLIZ;
        }
        return videoItemParamsLLLIILIL;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LLLLIILL(int i, String str) {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.LLLLIILL(i, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void Z(int i, boolean z) {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.Z(i, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z) {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.onBuffering(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, C1481290oeN c1481290oeN) {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.onPlayFailed(str, c1481290oeN);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str, C1480430ocz c1480430ocz) {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.onPreparePlay(str, c1480430ocz);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.onRenderFirstFrame(str, c1480420ocy);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(String str, C1481290oeN c1481290oeN) {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.onRetryOnError(str, c1481290oeN);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.onSeekEnd(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSpeedChanged(String str, float f) {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.onSpeedChanged(str, f);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.onPlayProgressChange(str, j, j2);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i, float f) {
        C0RGJ c0rgj = this.LLLII;
        if (c0rgj != null) {
            c0rgj.onSeekStart(str, i, f);
        }
    }
}
