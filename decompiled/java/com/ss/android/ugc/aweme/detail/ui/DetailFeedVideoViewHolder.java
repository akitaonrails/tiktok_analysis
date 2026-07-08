package com.ss.android.ugc.aweme.detail.ui;

import X.C0COP;
import X.C0RF0;
import X.C0S00;
import X.C0S0H;
import X.C1022620cia;
import X.C14LC;
import X.C426750GoL;
import X.C497820Jfg;
import X.C584270Mvp;
import X.C616430OFt;
import X.C786410Ut5;
import X.InterfaceC616440OFu;
import Y.ACListenerS115S0200000_11;
import Y.AUListenerS256S0100000_6;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.detail.ui.DetailFeedVideoViewHolder;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public final class DetailFeedVideoViewHolder extends VideoViewCell {
    public final BaseFeedPageParams T0;
    public final C0S0H U0;
    public final ImageView V0;
    public final C0S00 W0;

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final String gq() {
        return "cell_detail";
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LLJJIJIL() {
        C0S0H c0s0h = this.U0;
        RelativeLayout relativeLayout = this.LLJL;
        c0s0h.getClass();
        if (relativeLayout.getChildCount() == 0 || !c0s0h.LIZIZ) {
            return;
        }
        C0S0H.LIZ(relativeLayout);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final C584270Mvp LLLLLJIL() {
        return new C584270Mvp(true);
    }

    public final boolean s1() {
        if (TextUtils.equals(this.T0.param.getFrom(), "from_duet_mode") || this.T0.param.isFromEffectDiscover()) {
            return true;
        }
        return this.T0.param.isPlaylistCleanMode() && this.T0.param.isSupportScrollInCleanMode();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void u0() {
        C1022620cia.LIZ("CommerceVideoViewHolder", "resetPlayerView before");
        this.W0.LIZLLL();
        if (this.W0.LIZ()) {
            C1022620cia.LIZ("CommerceVideoViewHolder", "resetPlayerView initSlideViewPager");
            this.W0.LIZJ();
        } else {
            C1022620cia.LIZ("CommerceVideoViewHolder", "resetPlayerView super.resetPlayerView()");
            super.u0();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public final void onDestroyView() {
        super.onDestroyView();
        ValueAnimator valueAnimator = this.U0.LIZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void unBind() {
        super.unBind();
        this.W0.LIZIZ();
    }

    public DetailFeedVideoViewHolder(C0RF0 c0rf0) {
        super(c0rf0);
        this.T0 = c0rf0.LJ;
        ConstraintLayout constraintLayout = (ConstraintLayout) c0rf0.LIZ.findViewById(R.id.hpp);
        this.V0 = (ImageView) c0rf0.LIZ.findViewById(R.id.hpq);
        this.W0 = new C0S00(this);
        this.U0 = new C0S0H();
        if (c0rf0.LJ.param.isFromDuetModeOrDuetModeDetail()) {
            if (C14LC.LJIILL == 0) {
                C426750GoL.LJIIIZ(constraintLayout, 0, Integer.valueOf(C497820Jfg.LIZJ(constraintLayout.getContext())), 0, 0, false, 16);
                return;
            }
            return;
        }
        C786410Ut5.LL(8, constraintLayout);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void B0(boolean z) {
        C0S0H c0s0h = this.U0;
        RelativeLayout relativeLayout = this.LLJL;
        c0s0h.LIZIZ = z;
        ValueAnimator valueAnimator = c0s0h.LIZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z) {
            C786410Ut5.T4(relativeLayout, 0.0f);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(relativeLayout.getAlpha(), 1.0f);
            c0s0h.LIZ = valueAnimatorOfFloat;
            if (valueAnimatorOfFloat != null) {
                valueAnimatorOfFloat.setDuration(400L);
            }
        } else {
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(relativeLayout.getAlpha(), 0.0f);
            c0s0h.LIZ = valueAnimatorOfFloat2;
            if (valueAnimatorOfFloat2 != null) {
                valueAnimatorOfFloat2.setDuration(200L);
            }
        }
        ValueAnimator valueAnimator2 = c0s0h.LIZ;
        if (valueAnimator2 != null) {
            valueAnimator2.setInterpolator(new AccelerateInterpolator());
        }
        ValueAnimator valueAnimator3 = c0s0h.LIZ;
        if (valueAnimator3 != null) {
            valueAnimator3.addUpdateListener(new AUListenerS256S0100000_6(relativeLayout, 91));
        }
        ValueAnimator valueAnimator4 = c0s0h.LIZ;
        if (valueAnimator4 != null) {
            valueAnimator4.start();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LJI(Aweme aweme) {
        int i;
        super.LJI(aweme);
        if (this.LLJILJILJ.LJ.param.isFromDuetModeOrDuetModeDetail()) {
            h1(8);
            C786410Ut5.Q7(this.V0, new ACListenerS115S0200000_11(this, aweme, 3));
            Aweme aweme2 = this.LLJJ;
            ImageView imageView = this.V0;
            if (AwemeExtKt.isCollected(aweme2)) {
                i = R.drawable.bhj;
            } else {
                i = R.drawable.bhk;
            }
            imageView.setImageResource(i);
            this.LLLII.setBackgroundResource(R.drawable.bhh);
        }
        if (C0COP.LIZIZ) {
            C786410Ut5.LJLLLLLL(8, this.LLLII);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public final void LJIIZILJ(boolean z) {
        if (s1()) {
            super.LJIIZILJ(true);
        } else {
            super.LJIIZILJ(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public final void LJJIFFI(boolean z) {
        if (!s1()) {
            super.LJJIFFI(z);
        }
    }

    public final void p1(final Aweme aweme) {
        C616430OFt c616430OFt = new C616430OFt();
        c616430OFt.LLILZLL = this.f363e0.param.getFrom();
        c616430OFt.LLILLJJLI = new InterfaceC616440OFu(this) { // from class: X.0S0G
            public final /* synthetic */ DetailFeedVideoViewHolder LLILLJJLI;

            @Override // X.InterfaceC616440OFu
            public final void p30(Exception exc) {
            }

            @Override // X.InterfaceC616440OFu
            public final void ZX() {
                int i = !AwemeExtKt.isCollected(aweme) ? 1 : 0;
                ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).Br(i, aweme.getAid());
                aweme.setCollectStatus(i);
                this.LLILLJJLI.V0.setImageResource(AwemeExtKt.isCollected(aweme) ? R.drawable.bhj : R.drawable.bhk);
            }

            @Override // X.InterfaceC616440OFu
            public final void Me1(String str) {
                C19EG activity;
                Fragment fragment = this.LLILLJJLI.LLJJIII;
                if (fragment != null && (activity = fragment.getActivity()) != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activity);
                    c1389890mGx.LJIIJ(str);
                    c1389890mGx.LJIIJJI();
                }
            }

            {
                this.LLILLJJLI = this;
            }
        };
        c616430OFt.LIZJ(2, aweme.getAid(), Integer.valueOf(!AwemeExtKt.isCollected(aweme) ? 1 : 0));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void K(View view, boolean z) {
        if (s1()) {
            super.K(view, true);
        } else {
            super.K(view, z);
        }
    }
}
