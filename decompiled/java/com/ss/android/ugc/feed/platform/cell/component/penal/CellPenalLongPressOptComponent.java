package com.ss.android.ugc.feed.platform.cell.component.penal;

import X.C01GW;
import X.C0SZ8;
import X.C10IT;
import X.C1558520qew;
import X.C295030BhN;
import X.C296230BjJ;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import Y.ATListenerS445S0100000_11;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ability.FeedRecommendSkylightDrawerAbility;
import com.ss.android.ugc.aweme.feed.VideoViewCellRootView;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCommentAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoShareAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.ability.VideoDiggAssemAbility;
import com.ss.android.ugc.feed.platform.cell.ability.VideoFavoriteAssemAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class CellPenalLongPressOptComponent extends BaseCellContentComponent<CellPenalLongPressOptComponent> implements InterfaceC1554640qYg {
    public VideoItemParams LLJLLIL;
    public float LLJLLL;
    public float LLJZ;
    public Pair<? extends WeakReference<View>, ? extends Runnable> LLJZIJLIL;
    public boolean LLL;
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1182));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1178));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1179));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1180));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1183));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1181));
    public final C630740Ooa LLJLL = C628500Oky.LIZ(new AwS555S0100000_11(this, 1184));
    public int LLLF = 5;

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        str.getClass();
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        if (view.getId() == R.id.view_rootview && (view instanceof VideoViewCellRootView)) {
            ((VideoViewCellRootView) view).setPenalTouchListener(new ATListenerS445S0100000_11(this, 11));
        }
    }

    public final void ep(View view) {
        Runnable second;
        Pair<? extends WeakReference<View>, ? extends Runnable> pair = this.LLJZIJLIL;
        if (pair != null) {
            second = pair.getSecond();
        } else {
            second = null;
        }
        HandlerHook.viewRemoveCallbacks(view, second);
        this.LLJZIJLIL = null;
    }

    public final boolean hp(MotionEvent motionEvent) {
        C0SZ8 c0sz8LJLIL;
        VideoFavoriteAssemAbility videoFavoriteAssemAbility;
        IVideoCommentAbility iVideoCommentAbility;
        IVideoShareAbility iVideoShareAbility = (IVideoShareAbility) this.LLJJJJLIIL.getValue();
        if (iVideoShareAbility != null && iVideoShareAbility.b41(motionEvent.getRawX(), motionEvent.getRawY())) {
            return true;
        }
        if (C295030BhN.LIZ() && (iVideoCommentAbility = (IVideoCommentAbility) this.LLJJL.getValue()) != null && iVideoCommentAbility.uY(motionEvent.getRawX(), motionEvent.getRawY())) {
            return true;
        }
        if (((Number) C296230BjJ.LIZ.getValue()).intValue() != 0 && (videoFavoriteAssemAbility = (VideoFavoriteAssemAbility) this.LLJLILLLLZIIL.getValue()) != null && videoFavoriteAssemAbility.Ja2(motionEvent.getRawX(), motionEvent.getRawY())) {
            return true;
        }
        VideoDiggAssemAbility videoDiggAssemAbility = (VideoDiggAssemAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (videoDiggAssemAbility != null && videoDiggAssemAbility.sj0(motionEvent.getRawX(), motionEvent.getRawY())) {
            return true;
        }
        Aweme aweme = null;
        FeedRecommendSkylightDrawerAbility feedRecommendSkylightDrawerAbility = (FeedRecommendSkylightDrawerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), FeedRecommendSkylightDrawerAbility.class, null);
        if (feedRecommendSkylightDrawerAbility != null && feedRecommendSkylightDrawerAbility.yw0()) {
            return true;
        }
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJLL.getValue();
        if (iViewPagerComponentAbility != null && (c0sz8LJLIL = iViewPagerComponentAbility.LJLIL()) != null && c0sz8LJLIL.LLIIZ()) {
            return true;
        }
        C10IT c10it = C10IT.LIZ;
        VideoItemParams videoItemParams = this.LLJLLIL;
        if (videoItemParams != null) {
            aweme = videoItemParams.getAweme();
        }
        c10it.getClass();
        if (!C10IT.LJIILJJIL(aweme)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        int scaledTouchSlop;
        Context context = view.getContext();
        if (context != null) {
            scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop() / 4;
        } else {
            scaledTouchSlop = 5;
        }
        this.LLLF = scaledTouchSlop;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        this.LLJLLIL = videoItemParams;
    }
}
