package com.bytedance.android.livesdk.userinfowidget;

import X.C0IKU;
import X.C1099610eil;
import X.C1161920gLG;
import X.C472860IgW;
import X.C486790J7d;
import X.C786410Ut5;
import X.C930940aKi;
import X.EnumC1101430elh;
import X.InterfaceC1085480eLy;
import X.InterfaceC1087920ePu;
import X.InterfaceC482090IvP;
import Y.ALAdapterS9S0100000_12;
import Y.ARunnableS6S0310000_7;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdk.livesetting.other.LiveLikeAnimationDowngradeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveU18HiddenCountSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.LiveInnerDowngradeAdaptExp;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.performanhtune.IPTFService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* JADX INFO: loaded from: classes18.dex */
public class UserInfoLikeHelper implements InterfaceC1087920ePu, GenericLifecycleObserver {
    public final ObjectAnimator LL;
    public ObjectAnimator LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public ObjectAnimator LLILZIL;
    public View LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public final boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public final boolean LLJILJIL;

    @Override // X.InterfaceC1087920ePu
    public final String JA() {
        return "UserInfoLikeHelper";
    }

    @Override // X.InterfaceC1087920ePu
    public final /* synthetic */ void onResult(String str) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        this.LL.cancel();
        this.LLILLJJLI.cancel();
        ObjectAnimator objectAnimator = this.LLILZIL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        C786410Ut5.T4(this.LLILZLL, 1.0f);
        if (LiveInnerDowngradeAdaptExp.INSTANCE.isLikeAnimDowngrade(this.LLJILJIL)) {
            ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).ph1(EnumC1101430elh.LIVE_LIKE_ANIM_USERINFO_DOWNGRADE);
        }
    }

    public final void LIZ(View view) {
        if (view != null && view == this.LLILZLL && this.LLILLJJLI != null) {
            return;
        }
        this.LLILZLL = view;
        ObjectAnimator objectAnimator = this.LLILLJJLI;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
            this.LLILLJJLI = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(200L);
            return;
        }
        objectAnimator.setTarget(view);
    }

    @Override // X.InterfaceC1087920ePu
    public final void Py(LikeHelper likeHelper, int i) {
        if (i >= likeHelper.LLJJIJIL && !this.LLIZLLLIL && this.LLJ && !this.LLJI) {
            if (this.LLILLJJLI.isRunning()) {
                this.LLILLJJLI.cancel();
            }
            View view = this.LLILZLL;
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofKeyframe(View.ALPHA, Keyframe.ofFloat(0.5f, view.getAlpha()), Keyframe.ofFloat(1.0f, 1.0f)));
            this.LLILZIL = objectAnimatorOfPropertyValuesHolder;
            objectAnimatorOfPropertyValuesHolder.setStartDelay(200L);
            this.LLILZIL.setDuration(200L);
            C786410Ut5.Pd(this.LLILZIL);
        }
    }

    public UserInfoLikeHelper(LifecycleOwner lifecycleOwner, C1099610eil c1099610eil, C472860IgW c472860IgW, boolean z) {
        this.LLJ = true;
        this.LLJ = LiveU18HiddenCountSetting.INSTANCE.showEngagementCount(Boolean.valueOf(z));
        this.LLJILJIL = z;
        lifecycleOwner.getLifecycle().addObserver(this);
        this.LLILZLL = c472860IgW;
        C786410Ut5.S4(1.0f, c472860IgW);
        C786410Ut5.Qb(c1099610eil, 0.0f);
        C786410Ut5.rc(c1099610eil, 0.0f);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && room.getOwner() != null) {
            C486790J7d.LIZJ(new ARunnableS6S0310000_7(this, room, z, c1099610eil, 0));
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(c1099610eil, PropertyValuesHolder.ofKeyframe(View.SCALE_X, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(1.0f, 1.5f)), PropertyValuesHolder.ofKeyframe(View.SCALE_Y, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(1.0f, 1.5f)), PropertyValuesHolder.ofKeyframe(View.ALPHA, Keyframe.ofFloat(0.0f, 0.5f), Keyframe.ofFloat(0.5f, 0.5f), Keyframe.ofFloat(1.0f, 0.0f)));
        this.LL = objectAnimatorOfPropertyValuesHolder;
        objectAnimatorOfPropertyValuesHolder.setDuration(1000L);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfPropertyValuesHolder.addListener(new ALAdapterS9S0100000_12(c1099610eil, 35));
        LIZ(c472860IgW);
        if (LiveInnerDowngradeAdaptExp.INSTANCE.isLikeAnimDowngrade(z)) {
            ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).FA2(EnumC1101430elh.LIVE_LIKE_ANIM_USERINFO_DOWNGRADE, new InterfaceC482090IvP() { // from class: X.0eMv
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC482090IvP
                public final void LIZ(C0IS4 c0is4) {
                    if (((Integer) c0is4.LIZ).intValue() != 0) {
                        this.LIZ.LLJIJIL = LiveLikeAnimationDowngradeSetting.INSTANCE.isRemoveHeadBreathAnimator();
                    } else {
                        this.LIZ.LLJIJIL = false;
                    }
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1087920ePu
    public final void Pb(InterfaceC1085480eLy interfaceC1085480eLy, int i, int i2, float f, float f2, float f3, float f4) {
        C0IKU c0ikuP71;
        if ((!LiveInnerDowngradeAdaptExp.INSTANCE.getExpValue().getEnableLikeProgressAnim() || (c0ikuP71 = ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).P71("inner_room_downgrade_scene", EnumC1101430elh.LIKE_PROGRESS_ANIM, null, Integer.class)) == null || ((Integer) c0ikuP71.LIZ).intValue() <= 0) && !this.LLIZ && this.LLJ && !this.LLJI) {
            if (i2 >= interfaceC1085480eLy.LJIIJJI()) {
                if (this.LLILZ != i) {
                    this.LLILZ = i;
                    if (this.LLILLJJLI.isRunning()) {
                        this.LLILLJJLI.cancel();
                        C786410Ut5.T4(this.LLILZLL, 0.0f);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i2 >= interfaceC1085480eLy.LJIILLIIL()) {
                if (this.LLILLL == i) {
                    return;
                }
                this.LLILLL = i;
                C786410Ut5.Pd(this.LLILLJJLI);
                return;
            }
            if (this.LL.isRunning() || this.LLJIJIL) {
                return;
            }
            C786410Ut5.Pd(this.LL);
        }
    }
}
