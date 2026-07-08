package com.ss.android.ugc.aweme.feed.adapter.widget.game;

import X.C01GW;
import X.C054G;
import X.C13LE;
import X.C19719912Dl;
import X.C1ACA;
import X.C1DFK;
import X.C2108208Ns;
import X.C2296808zG;
import X.C23118094a;
import X.C23250099c;
import X.C339190DRl;
import X.C418440Gaw;
import X.C452501pT;
import X.C780140Uiy;
import X.C780180Uj2;
import X.C780190Uj3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC494740Jai;
import X.InterfaceC497601wk;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLiveGameRewardsFypSetting;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.bottom.AbsLivePreviewBottomCardWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.bottom.LivePreviewBottomCardVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.game.GameRewardsPreviewCardWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.GameTagDetail;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class GameRewardsPreviewCardWidget extends AbsLivePreviewBottomCardWidget implements InterfaceC497601wk {
    public static final int LLJJI;
    public final /* synthetic */ C054G LLJIJIL = C2296808zG.LIZ(C2108208Ns.LIZ);
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public C1DFK LLJILLL;
    public Animator LLJJ;

    public GameRewardsPreviewCardWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedLiveViewHolderVM.class);
        this.LLJILJIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, EnumC494740Jai.WIDGET, new C780180Uj2(c19719912DlLIZ), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), WidgetWithoutSyncConfig.INSTANCE.getInitVmWithoutSync());
        this.LLJILJILJ = C452501pT.LIZIZ(new C780190Uj3(this));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.widget.bottom.AbsLivePreviewBottomCardWidget, com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    static {
        new Object() { // from class: X.0Uj4
        };
        LLJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(82));
    }

    public final FrameLayout N1() {
        return (FrameLayout) this.LLJILJILJ.getValue();
    }

    public final FeedLiveViewHolderVM O1() {
        return (FeedLiveViewHolderVM) this.LLJILJIL.getValue();
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LLJIJIL.LL;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        MutableLiveData<Integer> mutableLiveData;
        Integer value;
        FeedLiveViewHolderVM feedLiveViewHolderVMO1 = O1();
        if (feedLiveViewHolderVMO1 != null && (mutableLiveData = feedLiveViewHolderVMO1.LLLIIL) != null && (value = mutableLiveData.getValue()) != null && value.intValue() > 0) {
            mutableLiveData.postValue(-1);
        }
        Animator animator = this.LLJJ;
        if (animator != null) {
            animator.cancel();
        }
        hide();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        ViewGroup.LayoutParams layoutParams;
        super.hide();
        FrameLayout frameLayoutN1 = N1();
        if (frameLayoutN1 != null && (layoutParams = frameLayoutN1.getLayoutParams()) != null) {
            layoutParams.height = 0;
        }
        FrameLayout frameLayoutN12 = N1();
        if (frameLayoutN12 != null) {
            C786410Ut5.LJJJJIZL(frameLayoutN12);
        }
        FrameLayout frameLayoutN13 = N1();
        if (frameLayoutN13 != null) {
            C339190DRl.LIZIZ(frameLayoutN13);
        }
        C1DFK c1dfk = this.LLJILLL;
        if (c1dfk != null) {
            c1dfk.LIZIZ(null);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        ViewGroup.LayoutParams layoutParams;
        FrameLayout frameLayoutN1 = N1();
        if (frameLayoutN1 != null && (layoutParams = frameLayoutN1.getLayoutParams()) != null) {
            layoutParams.height = LLJJI;
        }
        FrameLayout frameLayoutN12 = N1();
        if (frameLayoutN12 != null) {
            C339190DRl.LIZLLL(frameLayoutN12);
        }
        super.show();
    }

    public static Animator P1(View view) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, view.getAlpha(), 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, view.getTranslationY(), view.getLayoutParams().height));
        objectAnimatorOfPropertyValuesHolder.setDuration(290L);
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        NextLiveData<Boolean> nextLiveData;
        MutableLiveData<Integer> mutableLiveData;
        Integer value;
        Aweme aweme;
        C1ACA c1acaZ1;
        LiveRoomStruct liveRoomStruct;
        GameLiveGameRewardsFypSetting gameLiveGameRewardsFypSetting = GameLiveGameRewardsFypSetting.INSTANCE;
        if (gameLiveGameRewardsFypSetting.getConfig().enableCard) {
            C1ACA c1acaZ12 = z1();
            if (c1acaZ12 != null && (aweme = c1acaZ12.LIZIZ) != null && (c1acaZ1 = z1()) != null && (liveRoomStruct = c1acaZ1.LIZJ) != null && !aweme.isAd() && liveRoomStruct.hasCommerceGoods && liveRoomStruct.commercePermission > 0) {
                return;
            }
            long j = gameLiveGameRewardsFypSetting.getConfig().delayTime;
            long j2 = gameLiveGameRewardsFypSetting.getConfig().duration;
            if (j <= 0 || j2 <= 0) {
                return;
            }
            FeedLiveViewHolderVM feedLiveViewHolderVMO1 = O1();
            if (feedLiveViewHolderVMO1 != null && (mutableLiveData = feedLiveViewHolderVMO1.LLJLLIL) != null && (value = mutableLiveData.getValue()) != null && value.intValue() > 0) {
                return;
            }
            M1();
            LivePreviewBottomCardVM livePreviewBottomCardVMM1 = M1();
            if (livePreviewBottomCardVMM1 != null && (nextLiveData = livePreviewBottomCardVMM1.LLILLJJLI) != null && Intrinsics.LJFF(nextLiveData.getValue(), Boolean.TRUE)) {
                return;
            }
            M1();
            C1DFK c1dfkLIZ = this.LLJILLL;
            if (c1dfkLIZ == null || c1dfkLIZ.isCancelled()) {
                c1dfkLIZ = C23118094a.LIZ();
                this.LLJILLL = c1dfkLIZ;
            }
            C23250099c.LIZLLL(this, c1dfkLIZ, null, new C780140Uiy(this, j2, j, null), 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        NextLiveData<Integer> nextLiveData;
        MutableLiveData<Integer> mutableLiveData;
        super.onLoad(objArr);
        FeedLiveViewHolderVM feedLiveViewHolderVMO1 = O1();
        if (feedLiveViewHolderVMO1 != null && (mutableLiveData = feedLiveViewHolderVMO1.LLJLLIL) != null) {
            mutableLiveData.observe(this, new Observer() { // from class: X.0Uj1
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    if (((Integer) obj).intValue() > 0) {
                        this.LL.hide();
                    }
                }
            });
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMO12 = O1();
        if (feedLiveViewHolderVMO12 != null && (nextLiveData = feedLiveViewHolderVMO12.LLJJJJJIL) != null) {
            nextLiveData.observe(this, new Observer() { // from class: X.0Uj0
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    long anchorId;
                    String str;
                    Object objValueOf;
                    LiveRoomStruct liveRoomStruct;
                    GameTagDetail gameTagDetail;
                    LiveRoomStruct liveRoomStruct2;
                    GameTagDetail gameTagDetail2;
                    LiveRoomStruct liveRoomStruct3;
                    LiveRoomStruct liveRoomStruct4;
                    if (this.LL.isShowing()) {
                        GameRewardsPreviewCardWidget gameRewardsPreviewCardWidget = this.LL;
                        C1ACA c1acaZ1 = gameRewardsPreviewCardWidget.z1();
                        long j = 0;
                        if (c1acaZ1 != null && (liveRoomStruct4 = c1acaZ1.LIZJ) != null) {
                            anchorId = liveRoomStruct4.getAnchorId();
                        } else {
                            anchorId = 0;
                        }
                        C1ACA c1acaZ12 = gameRewardsPreviewCardWidget.z1();
                        if (c1acaZ12 != null && (liveRoomStruct3 = c1acaZ12.LIZJ) != null) {
                            j = liveRoomStruct3.id;
                        }
                        C1ACA c1acaZ13 = gameRewardsPreviewCardWidget.z1();
                        String strLJ = "";
                        if (c1acaZ13 == null || (liveRoomStruct2 = c1acaZ13.LIZJ) == null || (gameTagDetail2 = liveRoomStruct2.gameTagDetail) == null || (str = gameTagDetail2.gameTagName) == null) {
                            str = "";
                        }
                        C1ACA c1acaZ14 = gameRewardsPreviewCardWidget.z1();
                        if (c1acaZ14 == null || (liveRoomStruct = c1acaZ14.LIZJ) == null || (gameTagDetail = liveRoomStruct.gameTagDetail) == null) {
                            objValueOf = "";
                        } else {
                            objValueOf = Integer.valueOf(gameTagDetail.gameTagId);
                        }
                        C1ACA c1acaZ15 = gameRewardsPreviewCardWidget.z1();
                        if (c1acaZ15 != null) {
                            strLJ = C1ABT.LJ(c1acaZ15);
                        }
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_preview_page_info");
                        c474500IjALIZ.LJJII(Long.valueOf(anchorId), "anchor_id");
                        c474500IjALIZ.LJJII(Long.valueOf(j), "room_id");
                        c474500IjALIZ.LJJII("game_rewards_pin_card", "info_type");
                        c474500IjALIZ.LJJII(str, "game_name");
                        c474500IjALIZ.LJJII(objValueOf, "game_id");
                        c474500IjALIZ.LJJII(strLJ, "drops_id");
                        c474500IjALIZ.LJJII("click", "action_type");
                        c474500IjALIZ.LIZ();
                    }
                }
            });
        }
    }
}
