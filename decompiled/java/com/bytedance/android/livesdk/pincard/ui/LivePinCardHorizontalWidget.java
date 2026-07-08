package com.bytedance.android.livesdk.pincard.ui;

import X.C1107460evQ;
import X.C1107850ew3;
import X.C1107920ewA;
import X.C1107930ewB;
import X.C1548820qPI;
import X.C1619980sG4;
import X.C417850GZz;
import X.C500260Jjc;
import X.C786410Ut5;
import X.EnumC1107860ew4;
import X.InterfaceC1107910ew9;
import X.InterfaceC1107950ewD;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ALAdapterS13S0100000_17;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.pincard.event.LivePinCardVisibilityChannel;
import com.bytedance.android.live.uikit.setting.LiveConflictAvoidPushCardAnimOpt;
import com.bytedance.android.livesdk.livesetting.roomfunction.LivePinCardSetting;
import com.bytedance.ies.sdk.datachannel.Channel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.HiddenChangeAwareRecyclableWidget;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS254S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class LivePinCardHorizontalWidget extends HiddenChangeAwareRecyclableWidget implements InterfaceC1107950ewD {
    public ViewGroup LL;
    public View LLILLJJLI;
    public View LLILLL;
    public Animator LLILZ;
    public Animator LLILZIL;
    public Animator LLILZLL;
    public Animator LLIZ;
    public Animator LLIZLLLIL;
    public boolean LLJ = true;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i0u;
    }

    @Override // com.bytedance.ies.sdk.widgets.HiddenChangeAwareRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        C1107850ew3.LL.LIZ();
        x1();
        ViewGroup viewGroup = this.LL;
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        View view = this.LLILLJJLI;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = view instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB ? (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) view : null;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
            boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.LJJ(true);
        }
        this.LLILLJJLI = null;
        View view2 = this.LLILLL;
        if ((view2 instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) view2) != null) {
            boolean z2 = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
        }
        this.LLILLL = null;
    }

    @Override // X.InterfaceC1107950ewD
    public final void u0() {
        this.LLILLJJLI = this.LLILLL;
        x1();
        if (!this.LLJ) {
            y1();
            return;
        }
        Animator animator = this.LLILZLL;
        if (animator != null) {
            animator.start();
        }
    }

    public final void x1() {
        Animator animator = this.LLILZ;
        if (animator != null && animator.isRunning()) {
            animator.cancel();
        }
        Animator animator2 = this.LLILZIL;
        if (animator2 != null && animator2.isRunning()) {
            animator2.cancel();
        }
        Animator animator3 = this.LLILZLL;
        if (animator3 != null && animator3.isRunning()) {
            animator3.cancel();
        }
        Animator animator4 = this.LLIZ;
        if (animator4 != null && animator4.isRunning()) {
            animator4.cancel();
        }
        Animator animator5 = this.LLIZLLLIL;
        if (animator5 == null || !animator5.isRunning()) {
            return;
        }
        animator5.cancel();
    }

    public final void y1() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        ViewGroup viewGroup = this.LL;
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        View view = this.LLILLJJLI;
        if ((view instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) view) != null) {
            boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
        }
        this.LLILLJJLI = null;
    }

    @Override // X.InterfaceC1107950ewD
    public final View LJIILJJIL() {
        View view = getView();
        if (view != null) {
            return view.getRootView();
        }
        return null;
    }

    @Override // X.InterfaceC1107950ewD
    public final boolean LJJII() {
        View view = getView();
        if (view != null) {
            return view.hasWindowFocus();
        }
        return false;
    }

    @Override // X.InterfaceC1107950ewD
    public final void a0() {
        x1();
        Animator animator = this.LLILZIL;
        if (animator != null) {
            animator.start();
        }
    }

    @Override // X.InterfaceC1107950ewD
    public final void j0() {
        x1();
        Animator animator = this.LLIZ;
        if (animator != null) {
            animator.start();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.HiddenChangeAwareRecyclableWidget, com.bytedance.ies.sdk.widgets.IHiddenChangeAwareWidget
    public final void onHide() {
        super.onHide();
        if (C1107850ew3.LLIZ == null) {
            C1107850ew3.LLJI = null;
        }
    }

    @Override // X.InterfaceC1107950ewD
    public final void LJJLL(View view) {
        this.LLILLJJLI = this.LLILLL;
        this.LLILLL = view;
        if (this.LLJ) {
            x1();
            Animator animator = this.LLIZLLLIL;
            if (animator != null) {
                animator.start();
                return;
            }
            return;
        }
        y1();
        ViewGroup viewGroup = this.LL;
        if (viewGroup == null) {
            return;
        }
        C786410Ut5.LJJJJI(viewGroup);
        viewGroup.addView(this.LLILLL);
    }

    @Override // X.InterfaceC1107950ewD
    public final void LLJILJIL(boolean z) {
        if (z) {
            ViewGroup viewGroup = this.LL;
            if (viewGroup != null) {
                C500260Jjc.LJJZ(-2, viewGroup);
            }
            ViewGroup viewGroup2 = this.LL;
            if (viewGroup2 != null) {
                C417850GZz.LIZ(LivePinCardSetting.INSTANCE.pinCardRadiusPx(), viewGroup2);
                return;
            }
            return;
        }
        ViewGroup viewGroup3 = this.LL;
        if (viewGroup3 == null) {
            return;
        }
        C500260Jjc.LJJZ(LivePinCardSetting.INSTANCE.pinCardDefaultHeightPx(), viewGroup3);
    }

    @Override // X.InterfaceC1107950ewD
    public final void LLLIIIIL(boolean z) {
        this.LLJ = z;
    }

    @Override // X.InterfaceC1107950ewD
    public final void P(View view) {
        this.LLILLL = view;
        if (this.LLJ) {
            x1();
            Animator animator = this.LLILZ;
            if (animator != null) {
                animator.start();
                return;
            }
            return;
        }
        ViewGroup viewGroup = this.LL;
        if (viewGroup == null) {
            return;
        }
        C786410Ut5.LJJJJI(viewGroup);
        viewGroup.addView(this.LLILLL);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        ViewGroup viewGroup;
        View view = getView();
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        this.LL = viewGroup;
        Interpolator interpolatorLJIIIZ = C1619980sG4.LJIIIZ();
        AnimatorSet animatorSet = new AnimatorSet();
        LiveConflictAvoidPushCardAnimOpt liveConflictAvoidPushCardAnimOpt = LiveConflictAvoidPushCardAnimOpt.INSTANCE;
        if (liveConflictAvoidPushCardAnimOpt.enable()) {
            animatorSet.setInterpolator(interpolatorLJIIIZ);
        }
        animatorSet.addListener(new ALAdapterS13S0100000_17(this, 124));
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.LL, (Property<ViewGroup, Float>) View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.LL, (Property<ViewGroup, Float>) View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.LL, (Property<ViewGroup, Float>) View.ALPHA, 0.0f, 1.0f));
        this.LLILZ = animatorSet;
        AnimatorSet animatorSet2 = new AnimatorSet();
        if (liveConflictAvoidPushCardAnimOpt.enable()) {
            animatorSet2.setInterpolator(interpolatorLJIIIZ);
        }
        animatorSet2.addListener(new ALAdapterS13S0100000_17(this, 125));
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.LL, (Property<ViewGroup, Float>) View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.LL, (Property<ViewGroup, Float>) View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.LL, (Property<ViewGroup, Float>) View.ALPHA, 0.0f, 1.0f));
        this.LLILZIL = animatorSet2;
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.addListener(new ALAdapterS13S0100000_17(this, 126));
        animatorSet3.playTogether(ObjectAnimator.ofFloat(this.LL, (Property<ViewGroup, Float>) View.SCALE_X, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.LL, (Property<ViewGroup, Float>) View.SCALE_Y, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.LL, (Property<ViewGroup, Float>) View.ALPHA, 1.0f, 0.0f));
        this.LLILZLL = animatorSet3;
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.addListener(new ALAdapterS13S0100000_17(this, 127));
        animatorSet4.playTogether(ObjectAnimator.ofFloat(this.LL, (Property<ViewGroup, Float>) View.SCALE_X, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.LL, (Property<ViewGroup, Float>) View.SCALE_Y, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.LL, (Property<ViewGroup, Float>) View.ALPHA, 1.0f, 0.0f));
        this.LLIZ = animatorSet4;
        AnimatorSet animatorSet5 = new AnimatorSet();
        animatorSet5.play(this.LLILZ).after(300L).after(this.LLILZLL);
        animatorSet5.playSequentially(new Animator[0]);
        this.LLIZLLLIL = animatorSet5;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        C1107850ew3 c1107850ew3 = C1107850ew3.LL;
        Context context = this.context;
        DataChannel dataChannel = this.dataChannel;
        C1107850ew3.LLILLJJLI = this;
        if (C1107850ew3.LLILLL == null) {
            C1107850ew3.LLILLL = new C1107460evQ(context, this, dataChannel);
        }
        C1107850ew3.LLJIJIL = false;
        this.LLJ = true;
        C1107460evQ c1107460evQ = C1107850ew3.LLILLL;
        if (c1107460evQ != null) {
            for (Map.Entry entry : ((LinkedHashMap) C1107850ew3.LLILZLL).entrySet()) {
                ((InterfaceC1107910ew9) entry.getKey()).LIZLLL(c1107460evQ, (Map) entry.getValue());
            }
        }
        ((LinkedHashMap) C1107850ew3.LLILZLL).clear();
        for (Map.Entry<Class<? extends Channel<Boolean>>, EnumC1107860ew4> entry2 : C1107850ew3.LLJILJIL.entrySet()) {
            dataChannel.EQ2(this, entry2.getKey(), new C1107920ewA(entry2));
        }
        Iterator<Class<? extends Channel<Boolean>>> it2 = C1107850ew3.LLJILJILJ.iterator();
        while (it2.hasNext()) {
            dataChannel.EQ2(this, it2.next(), AFwS254S0000000_17.get$arr$(463));
        }
        dataChannel.EQ2(this, LivePinCardVisibilityChannel.class, new C1107930ewB());
        C1548820qPI.LIZLLL("event_area_js_event_live_card_action", c1107850ew3);
    }
}
