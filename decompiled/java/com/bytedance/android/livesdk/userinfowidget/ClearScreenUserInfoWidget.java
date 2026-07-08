package com.bytedance.android.livesdk.userinfowidget;

import X.C0IX0;
import X.C0IX4;
import X.C0JSS;
import X.C0KVU;
import X.C1096340edU;
import X.C1121670fIL;
import X.C1151970g5D;
import X.C1161920gLG;
import X.C19ME;
import X.C464360IIw;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.EnumC1096020ecy;
import Y.ALAdapterS12S0200000_17;
import Y.ALAdapterS13S0100000_17;
import Y.ALAdapterS4S0200000_7;
import Y.AObjectS350S0100000_7;
import Y.AObjectS360S0100000_17;
import Y.AUListenerS217S0200000_7;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.ChangeNameWidth;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.dataChannel.PreloadAnchorInfoShowStatus;
import com.bytedance.android.livesdk.dataChannel.StartClearScreenEvent;
import com.bytedance.android.livesdk.dataChannel.UserInfoWidgetVisible;
import com.bytedance.android.livesdk.livesetting.LiveClearScreenFollowFixSetting;
import com.bytedance.android.livesdk.livesetting.LiveUserNameClearScreenOptSetting;
import com.bytedance.android.livesdk.livesetting.widget.LivePreloadNextRoomWidgetsSetting;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdk.watch.chatroom.portrait.TopMaskShowAfterLayoutVisibleEvent;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes18.dex */
public class ClearScreenUserInfoWidget extends LiveRoomUserInfoWidget {
    public static final /* synthetic */ int l0 = 0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f319X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f320Y;
    public boolean Z;
    public ViewGroup a0;
    public Animator b0;
    public Animator c0;
    public Animator d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Animator f321e0;
    public int f0;
    public int g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f322h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f323i0;
    public int j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f324k0 = -1;

    @Override // com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget, X.InterfaceC1087920ePu
    public String JA() {
        return "ClearScreenUserInfoWidget";
    }

    @Override // com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget
    public final void i2() {
        this.LLL = 0;
    }

    @Override // com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget, com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void Y2() {
        GradientDrawable gradientDrawable = (GradientDrawable) this.LLLIIII.getBackground();
        ViewGroup.LayoutParams layoutParams = this.LLLIIII.getLayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        C786410Ut5.X5(layoutParams, this.LLLIIII);
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius((int) C497740JfY.LIZIZ(13.5f));
        }
        C1096340edU c1096340edU = this.LLLZ;
        if (c1096340edU != null) {
            c1096340edU.LJ();
        }
        C500260Jjc.LJIILIIL(this.LLLIIII);
    }

    public final void Z2() {
        C1096340edU c1096340edU = this.LLLZ;
        if (c1096340edU != null) {
            c1096340edU.LJFF();
        }
        Animator animator = this.b0;
        if (animator != null && animator.isRunning()) {
            this.b0.end();
        }
        Animator animator2 = this.c0;
        if (animator2 != null && animator2.isRunning()) {
            this.c0.end();
        }
        Animator animator3 = this.d0;
        if (animator3 != null && animator3.isRunning()) {
            this.d0.end();
        }
        Animator animator4 = this.f321e0;
        if (animator4 == null || !animator4.isRunning()) {
            return;
        }
        this.f321e0.end();
    }

    public final Animator a3() {
        GradientDrawable gradientDrawable = (GradientDrawable) this.LLLIIII.getBackground();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS217S0200000_7(this, gradientDrawable, 9));
        valueAnimatorOfFloat.addListener(new ALAdapterS4S0200000_7(gradientDrawable, this, 3));
        valueAnimatorOfFloat.setDuration(200L);
        return valueAnimatorOfFloat;
    }

    public final Animator b3() {
        GradientDrawable gradientDrawable = (GradientDrawable) this.LLLIIII.getBackground();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS217S0200000_7(this, gradientDrawable, 10));
        valueAnimatorOfFloat.addListener(new ALAdapterS12S0200000_17(gradientDrawable, this, 12));
        valueAnimatorOfFloat.setDuration(200L);
        return valueAnimatorOfFloat;
    }

    public final Animator c3() {
        float f;
        View view;
        if (this.f0 == 0 || this.g0 == 0 || this.f323i0 == 0 || this.LLL == 0 || this.j0 == 0) {
            ViewGroup viewGroup = this.a0;
            if (viewGroup == null || (view = (View) viewGroup.getParent()) == null) {
                float fLIZIZ = C497740JfY.LIZIZ(8.0f);
                f = -((int) fLIZIZ);
            } else {
                f = (-(view.getHeight() - this.a0.getHeight())) / 2.0f;
            }
        } else {
            f = 0.0f;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.a0, (Property<ViewGroup, Float>) View.TRANSLATION_Y, 0.0f, f);
        objectAnimatorOfFloat.addListener(new ALAdapterS13S0100000_17(this, 18));
        objectAnimatorOfFloat.setDuration(200L);
        return objectAnimatorOfFloat;
    }

    public void d3() {
        int i;
        float f;
        View view;
        AnimatorSet animatorSet = new AnimatorSet();
        if (this.f322h0 != 8) {
            this.b0 = b3();
            if ((this.LLJ.getVisibility() == 8 && this.LLJJIJI.getVisibility() == 8 && this.LLJJJJLIIL.getVisibility() == 8 && this.LLJLILLLLZIIL.getVisibility() == 8 && this.LLJLL.getVisibility() == 8) ? false : true) {
                ViewGroup viewGroup = this.a0;
                if (viewGroup == null || (view = (View) viewGroup.getParent()) == null) {
                    float fLIZIZ = C497740JfY.LIZIZ(8.0f);
                    f = -((int) fLIZIZ);
                } else {
                    f = (-(view.getHeight() - this.a0.getHeight())) / 2.0f;
                }
            } else {
                f = 0.0f;
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.a0, (Property<ViewGroup, Float>) View.TRANSLATION_Y, f, 0.0f);
            objectAnimatorOfFloat.addListener(new ALAdapterS13S0100000_17(this, 52));
            objectAnimatorOfFloat.setDuration(200L);
            this.d0 = objectAnimatorOfFloat;
            animatorSet.playTogether(this.b0, objectAnimatorOfFloat);
        }
        animatorSet.addListener(new ALAdapterS13S0100000_17(this, 17));
        animatorSet.start();
        if (LiveUserNameClearScreenOptSetting.INSTANCE.enable()) {
            ViewGroup viewGroup2 = this.LLILZ;
            if (!(viewGroup2 instanceof ConstraintLayout) || (i = ((C19ME) viewGroup2.getLayoutParams()).matchConstraintMaxWidth) <= 0) {
                return;
            }
            this.LLJIJIL.setMaxWidth(i);
        }
    }

    public void e3() {
        int i;
        if (this.LLLZ == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        C1096340edU c1096340edU = this.LLLZ;
        EnumC1096020ecy enumC1096020ecy = c1096340edU.LJIILL;
        if (enumC1096020ecy != EnumC1096020ecy.FOLLOW_ANIM) {
            if (enumC1096020ecy != EnumC1096020ecy.FOLLOWED) {
                this.c0 = a3();
                Animator animatorC3 = c3();
                this.f321e0 = animatorC3;
                animatorSet.playTogether(this.c0, animatorC3);
            }
            animatorSet.addListener(new ALAdapterS13S0100000_17(this, 50));
            animatorSet.start();
            if (LiveUserNameClearScreenOptSetting.INSTANCE.enable() || (i = this.f324k0) <= 0) {
            }
            this.LLJIJIL.setMaxWidth(i);
            this.f324k0 = -1;
            return;
        }
        c1096340edU.LJIIJ();
        this.LLLZ.LJIILL = EnumC1096020ecy.FOLLOWED;
        Animator animatorC32 = c3();
        this.f321e0 = animatorC32;
        animatorSet.playTogether(animatorC32);
        animatorSet.addListener(new ALAdapterS13S0100000_17(this, 50));
        animatorSet.start();
        if (LiveUserNameClearScreenOptSetting.INSTANCE.enable()) {
        }
    }

    @Override // com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget
    public final void f2() {
        this.f323i0 = 8;
    }

    @Override // com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget
    public final void g2() {
        this.j0 = 8;
    }

    @Override // com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget
    public final void h2() {
        View view = this.LLLLZLLIL;
        if (view != null) {
            if (view == this.LLJJIJI) {
                this.g0 = 0;
            } else if (view == this.LLJ) {
                this.f0 = 0;
            }
        }
    }

    @Override // com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        DataChannel dataChannel;
        ViewGroup viewGroup;
        DataChannel dataChannel2 = this.dataChannel;
        Boolean bool = Boolean.TRUE;
        dataChannel2.zW(TopMaskShowAfterLayoutVisibleEvent.class, bool);
        super.show();
        if (LivePreloadNextRoomWidgetsSetting.INSTANCE.enableFollowAnim() && (dataChannel = this.dataChannel) != null && bool.equals(dataChannel.gg0(PreloadAnchorInfoShowStatus.class)) && (viewGroup = this.LLLIIII) != null && viewGroup.getVisibility() == 0) {
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLLIIII, (Property<ViewGroup, Float>) View.ALPHA, 0.0f, 1.0f);
            animatorSet.setDuration(300L);
            animatorSet.play(objectAnimatorOfFloat);
            animatorSet.start();
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.zW(UserInfoWidgetVisible.class, bool);
        }
    }

    @Override // com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, X.InterfaceC1078250eAJ
    public final void LJLIL() {
        super.LJLIL();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            C0IX0.LIZ.getClass();
            C0IX4.LIZ(dataChannel, "userinfo_widget_load");
            C464360IIw.LIZIZ(this.dataChannel, "is_top_optimization", "1");
        }
    }

    @Override // com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget, com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        int i;
        super.onUnload();
        Z2();
        if (this.Z) {
            if (this.c0 == null) {
                this.c0 = a3();
            }
            this.c0.end();
            if (this.f321e0 == null) {
                this.f321e0 = c3();
            }
            this.f321e0.end();
            f3(true);
            C500260Jjc.LLFFF(this.LLIZ);
            C500260Jjc.LLFFF(this.LLILZIL);
            if (LiveUserNameClearScreenOptSetting.INSTANCE.enable() && (i = this.f324k0) > 0) {
                this.LLJIJIL.setMaxWidth(i);
            }
        }
        this.f324k0 = -1;
        this.Z = false;
        this.b0 = null;
        this.c0 = null;
        this.d0 = null;
        this.f321e0 = null;
    }

    public final void W2(boolean z) {
        User user;
        IMicRoomService iMicRoomService = (IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class);
        if (this.LLLLLJLJLL != null && iMicRoomService.On1() && !LiveRoomUserInfoWidget.X1(this.LLLLLJLJLL)) {
            if (z) {
                if (this.LLLLLJLJLL.getOwner() != null && this.LLLLLJLJLL.getOwner().getAvatarThumb() != null) {
                    C1121670fIL.LJIIL(this.LLILZLL, this.LLLLLJLJLL.getOwner().getAvatarThumb(), R.drawable.ela);
                    this.LLJIJIL.setText(C0KVU.LIZ(this.LLLLLJLJLL.getOwner()));
                    this.LLJIJIL.requestLayout();
                    if (this.LLLLLJLJLL.getOwner().getAuthenticationInfo() != null) {
                        C500260Jjc.LLFFF(this.LLJILJIL);
                        C0JSS.LJFF(this.LLJILJIL, this.LLLLLJLJLL.getOwner().getAuthenticationInfo().authenticationBadge, 0, new C1151970g5D(this, 0));
                        return;
                    } else {
                        C500260Jjc.LJIILIIL(this.LLJILJIL);
                        this.LLJILJIL.setImageDrawable(null);
                        return;
                    }
                }
                return;
            }
            OfficialChannelInfo officialChannelInfo = this.LLLLLJLJLL.officialChannelInfo;
            if (officialChannelInfo == null || (user = officialChannelInfo.channelUser) == null || user.getAvatarThumb() == null) {
                return;
            }
            C1121670fIL.LJIIL(this.LLILZLL, this.LLLLLJLJLL.officialChannelInfo.channelUser.getAvatarThumb(), R.drawable.ela);
            this.LLJIJIL.setText(C0KVU.LIZ(this.LLLLLJLJLL.officialChannelInfo.channelUser));
            this.LLJIJIL.requestLayout();
            if (this.LLLLLJLJLL.officialChannelInfo.channelUser.getAuthenticationInfo() != null) {
                C500260Jjc.LLFFF(this.LLJILJIL);
                C0JSS.LJFF(this.LLJILJIL, this.LLLLLJLJLL.officialChannelInfo.channelUser.getAuthenticationInfo().authenticationBadge, 0, new C1151970g5D(this, 1));
            } else {
                C500260Jjc.LJIILIIL(this.LLJILJIL);
                this.LLJILJIL.setImageDrawable(null);
            }
        }
    }

    public final void f3(boolean z) {
        this.LLILZ.setClickable(z);
        this.LLLIIIL.setClickable(z);
        if (LiveClearScreenFollowFixSetting.INSTANCE.disable()) {
            this.LLLIILIL.setClickable(z);
            this.LLLIIL.setClickable(z);
        }
        this.LLLILZJ.setClickable(z);
        this.LLLIL.setClickable(z);
        this.LLLILZLLLI.setClickable(z);
        this.LLLIZZ.setClickable(z);
    }

    @Override // com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onInit(Object... objArr) {
        super.onInit(objArr);
        this.a0 = (ViewGroup) findViewById(R.id.user_base);
        View viewFindViewById = findViewById(R.id.ift);
        if (viewFindViewById != null) {
            viewFindViewById.setPaddingRelative((int) C497740JfY.LIZIZ(3.0f), 0, (int) C497740JfY.LIZIZ(2.0f), 0);
        }
    }

    @Override // com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget, com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onLoad(Object... objArr) {
        DataChannel dataChannel;
        super.onLoad(objArr);
        if (!LivePreloadNextRoomWidgetsSetting.INSTANCE.enable() || (dataChannel = this.dataChannel) == null || !Boolean.TRUE.equals(dataChannel.gg0(PreloadAnchorInfoShowStatus.class))) {
            show();
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            C0IX0.LIZ.getClass();
            C0IX4.LIZ(dataChannel2, "userinfo_widget_load");
            C464360IIw.LIZIZ(this.dataChannel, "is_top_optimization", CardStruct.IStatusCode.DEFAULT);
            this.dataChannel.EQ2(this, StartClearScreenEvent.class, new AObjectS360S0100000_17(this, 129));
        }
        ViewGroup viewGroup = this.LLILZ;
        if (viewGroup instanceof ConstraintLayout) {
            C19ME c19me = (C19ME) viewGroup.getLayoutParams();
            if (!((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad() && ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).XM(this.context) != 1) {
                c19me.matchConstraintMaxWidth = (int) C497740JfY.LIZIZ(200.0f);
            } else {
                c19me.matchConstraintMaxWidth = (int) C497740JfY.LIZIZ(300.0f);
            }
            this.LLILZ.requestLayout();
        }
        this.dataChannel.EQ2(this, ChangeNameWidth.class, new AObjectS350S0100000_7(this, 93));
    }
}
