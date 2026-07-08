package com.bytedance.android.livesdk.marketing.ui;

import X.AbstractC1115900f92;
import X.C0TZM;
import X.C1115820f8u;
import X.C1115920f94;
import X.C1115940f96;
import X.C1161920gLG;
import X.C13BV;
import X.C16F5;
import X.C19EG;
import X.C21211517zd;
import X.C500260Jjc;
import X.C755580TkS;
import X.C776250Uch;
import X.C786410Ut5;
import X.EnumC1115870f8z;
import X.InterfaceC1115910f93;
import X.InterfaceC1115950f97;
import X.ViewOnClickListenerC1115860f8y;
import Y.ALAdapterS9S0100000_12;
import Y.AObserverS221S0100000_17;
import Y.AUListenerS262S0100000_12;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.marketing.service.ILiveMarketingService;
import com.bytedance.android.livesdk.dataChannel.MarketingCapsuleVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.marketing.service.LiveMarketingController;
import com.bytedance.android.livesdk.marketing.viewmodel.LiveMarketingViewModel;
import com.bytedance.android.livesdkapi.avoidance.IBusinessAvoidanceService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.HiddenChangeAwareAnimatableRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveMarketingWidget extends HiddenChangeAwareAnimatableRecyclableWidget implements InterfaceC1115910f93 {
    public View LL;
    public View LLILLJJLI;
    public LiveIconView LLILLL;
    public C16F5 LLILZ;
    public LiveIconView LLILZIL;
    public ValueAnimator LLILZLL;
    public ValueAnimator LLIZ;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.h70;
    }

    @Override // com.bytedance.ies.sdk.widgets.HiddenChangeAwareAnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void x1() {
        ValueAnimator valueAnimator = this.LLILZLL;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.LLIZ;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            return;
        }
        valueAnimator2.cancel();
    }

    public final LiveMarketingViewModel y1() {
        C19EG c19egLJ = C500260Jjc.LJ(this.context);
        if (c19egLJ != null) {
            return (LiveMarketingViewModel) ViewModelProviders.of(c19egLJ).get(LiveMarketingViewModel.class);
        }
        return null;
    }

    public final void A1() {
        super.show();
        C500260Jjc.LLFFF(this.LLILLJJLI);
    }

    @Override // X.InterfaceC1115910f93
    public final View LJIILJJIL() {
        View view = getView();
        if (view != null) {
            return view.getRootView();
        }
        return null;
    }

    @Override // X.InterfaceC1115910f93
    public final boolean LJJII() {
        View view = getView();
        if (view != null) {
            return view.hasWindowFocus();
        }
        return false;
    }

    @Override // com.bytedance.android.widget.Widget
    public final boolean isShowing() {
        return super.isShowing();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    @Override // com.bytedance.ies.sdk.widgets.HiddenChangeAwareAnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void show() {
        /*
            r5 = this;
            android.view.View r0 = r5.getView()
            r2 = 0
            if (r0 == 0) goto L81
            android.view.ViewParent r4 = r0.getParent()
        Lb:
            boolean r0 = r4 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r0 == 0) goto L7f
            android.view.View r4 = (android.view.View) r4
        L11:
            r3 = 0
            if (r4 == 0) goto L7d
            android.view.View r0 = r5.getView()
            if (r0 == 0) goto L1e
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
        L1e:
            boolean r0 = r2 instanceof X.C19ME
            if (r0 == 0) goto L7d
            X.19ME r2 = (X.C19ME) r2
            if (r2 == 0) goto L7d
            int r0 = r2.rightToLeft
            android.view.View r0 = r4.findViewById(r0)
            int r1 = r0.getRight()
            int r0 = r2.leftToLeft
            android.view.View r0 = r4.findViewById(r0)
            int r0 = r0.getRight()
            int r1 = r1 - r0
            int r0 = r2.leftMargin
            int r1 = r1 - r0
            int r0 = r2.rightMargin
            int r1 = r1 - r0
            android.view.View r0 = r5.LLILLJJLI
            if (r0 == 0) goto L48
            r0.measure(r3, r3)
        L48:
            android.view.View r0 = r5.LLILLJJLI
            if (r0 == 0) goto L7b
            int r0 = r0.getMeasuredWidth()
        L50:
            int r4 = java.lang.Math.min(r1, r0)
        L54:
            r5.x1()
            r0 = 2
            int[] r1 = new int[r0]
            r1[r3] = r3
            r0 = 1
            r1[r0] = r4
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r1)
            Y.AUListenerS69S0101000_12 r1 = new Y.AUListenerS69S0101000_12
            r0 = 0
            r1.<init>(r5, r4, r0)
            r2.addUpdateListener(r1)
            Y.ALAdapterS9S0100000_12 r1 = new Y.ALAdapterS9S0100000_12
            r0 = 1
            r1.<init>(r5, r0)
            r2.addListener(r1)
            r2.start()
            r5.LLILZLL = r2
            return
        L7b:
            r0 = 0
            goto L50
        L7d:
            r4 = 0
            goto L54
        L7f:
            r4 = r2
            goto L11
        L81:
            r4 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.marketing.ui.LiveMarketingWidget.show():void");
    }

    public final void z1() {
        super.hide();
        C500260Jjc.LJIILIIL(this.LLILLJJLI);
    }

    @Override // com.bytedance.ies.sdk.widgets.HiddenChangeAwareAnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.IHiddenChangeAwareWidget
    public final void onHide() {
        super.onHide();
    }

    @Override // X.InterfaceC1115910f93
    public final void LLLLILI(C1115940f96 c1115940f96) {
        ViewOnClickListenerC1115860f8y viewOnClickListenerC1115860f8y = new View.OnClickListener() { // from class: X.0f8y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z;
                AbstractC1115900f92 abstractC1115900f92 = LiveMarketingController.LLIZ;
                if (abstractC1115900f92 != null) {
                    abstractC1115900f92.LIZLLL();
                }
                if (LiveMarketingController.LLIZ != null) {
                    z = true;
                } else {
                    z = false;
                }
                DataChannel dataChannel = null;
                if (z) {
                    LiveMarketingController.LIZJ(LiveMarketingController.LL, C0KAJ.MANUALLY_ROUTE, null, 6);
                    return;
                }
                C1102070emj c1102070emj = C1102070emj.LIZ;
                C1115920f94 c1115920f94 = LiveMarketingController.LLILLJJLI;
                if (c1115920f94 != null) {
                    dataChannel = c1115920f94.LJ;
                }
                C1102070emj.LJIILJJIL(c1102070emj, dataChannel, LiveMarketingController.LL, LiveMarketingController.LLJ, C0KAJ.MANUALLY_ROUTE, null, null, 112);
            }
        };
        LiveMarketingViewModel liveMarketingViewModelY1 = y1();
        if (liveMarketingViewModelY1 == null) {
            return;
        }
        liveMarketingViewModelY1.LL.setValue(c1115940f96.LIZ);
        liveMarketingViewModelY1.LLILLJJLI.setValue(c1115940f96.LIZIZ);
        liveMarketingViewModelY1.LLILLL.setValue(c1115940f96.LIZJ);
        liveMarketingViewModelY1.LLILZ.setValue(c1115940f96.LIZLLL);
        View view = getView();
        if (view != null) {
            C786410Ut5.I7(viewOnClickListenerC1115860f8y, view);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LL = findViewById(R.id.bnu);
        this.LLILLJJLI = findViewById(R.id.ex3);
        this.LLILLL = (LiveIconView) findViewById(R.id.jxe);
        this.LLILZ = (C16F5) findViewById(R.id.text);
        LiveIconView liveIconView = (LiveIconView) findViewById(R.id.b8t);
        this.LLILZIL = liveIconView;
        if (liveIconView != null) {
            liveIconView.setIconAutoMirrored(true);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onUnload(RecycleSource recycleSource) {
        DataChannel dataChannel;
        DataChannel dataChannel2;
        Lifecycle lifecycle = getLifecycle();
        LiveMarketingController liveMarketingController = LiveMarketingController.LL;
        lifecycle.removeObserver(liveMarketingController);
        liveMarketingController.getClass();
        IBusinessAvoidanceService iBusinessAvoidanceService = (IBusinessAvoidanceService) C1161920gLG.LIZJ(IBusinessAvoidanceService.class);
        C1115820f8u c1115820f8u = LiveMarketingController.LLJIJIL;
        C1115920f94 c1115920f94 = LiveMarketingController.LLILLJJLI;
        if (c1115920f94 != null) {
            dataChannel = c1115920f94.LJ;
        } else {
            dataChannel = null;
        }
        iBusinessAvoidanceService.im2(c1115820f8u, dataChannel);
        C1115920f94 c1115920f942 = LiveMarketingController.LLILLJJLI;
        if (c1115920f942 != null && (dataChannel2 = c1115920f942.LJ) != null) {
            dataChannel2.zW(MarketingCapsuleVisibilityChannel.class, Boolean.FALSE);
        }
        LiveMarketingController.LLILLJJLI = null;
        LiveMarketingController.LLILLL = null;
        IMessageManager iMessageManager = LiveMarketingController.LLILZ;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) liveMarketingController);
        }
        LiveMarketingController.LLILZ = null;
        LiveMarketingController.LLILZIL.removeCallbacksAndMessages(null);
        ((LinkedHashMap) LiveMarketingController.LLILZLL).clear();
        LiveMarketingController.LLIZ = null;
        LiveMarketingController.LLIZLLLIL = null;
        LiveMarketingController.LLJ = null;
        LiveMarketingController.LLJI.clear();
        x1();
        LiveMarketingViewModel liveMarketingViewModelY1 = y1();
        if (liveMarketingViewModelY1 == null) {
            return;
        }
        liveMarketingViewModelY1.LL.setValue(null);
        liveMarketingViewModelY1.LLILLJJLI.setValue(null);
        liveMarketingViewModelY1.LLILLL.setValue(null);
        liveMarketingViewModelY1.LLILZ.setValue(null);
    }

    @Override // X.InterfaceC1115910f93
    public final void LJJZZI(boolean z, boolean z2) {
        if (z2) {
            x1();
            z1();
        } else {
            x1();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS262S0100000_12(this, 0));
            valueAnimatorOfFloat.addListener(new ALAdapterS9S0100000_12(this, 0));
            valueAnimatorOfFloat.start();
            this.LLIZ = valueAnimatorOfFloat;
        }
        LiveMarketingViewModel liveMarketingViewModelY1 = y1();
        if (liveMarketingViewModelY1 != null && z) {
            liveMarketingViewModelY1.LL.setValue(null);
            liveMarketingViewModelY1.LLILLJJLI.setValue(null);
            liveMarketingViewModelY1.LLILLL.setValue(null);
            liveMarketingViewModelY1.LLILZ.setValue(null);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onLoad(RecycleSource recycleSource, Object[] objArr) {
        boolean zBooleanValue;
        LiveMarketingController liveMarketingController = LiveMarketingController.LL;
        Context context = this.context;
        DataChannel dataChannel = this.dataChannel;
        liveMarketingController.getClass();
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        if (room != null) {
            Intrinsics.LJFF(dataChannel.gg0(C0TZM.class), Boolean.TRUE);
            w wVar = w.LIZ;
            wVar.getClass();
            String strLJIIIZ = w.LJIIIZ();
            String strLJIIL = w.LJIIL();
            String strLIZLLL = w.LIZLLL();
            Boolean bool = (Boolean) dataChannel.gg0(C755580TkS.class);
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            C1115920f94 c1115920f94 = new C1115920f94(context, this, room, new C21211517zd(w.LJFF(), w.LJI(), strLJIIIZ, strLJIIL, strLIZLLL, wVar.LIZ(), wVar.LIZIZ(), w.LJIL(), w.LJJ(), zBooleanValue), dataChannel);
            LiveMarketingController.LLILLJJLI = c1115920f94;
            Map<EnumC1115870f8z, InterfaceC1115950f97> mapXH1 = ((ILiveMarketingService) C1161920gLG.LIZJ(ILiveMarketingService.class)).xH1();
            if (mapXH1 != null) {
                Iterator<Map.Entry<EnumC1115870f8z, InterfaceC1115950f97>> it2 = mapXH1.entrySet().iterator();
                while (it2.hasNext()) {
                    InterfaceC1115950f97 value = it2.next().getValue();
                    value.isActive();
                    AbstractC1115900f92 abstractC1115900f92LIZ = value.LIZ(c1115920f94);
                    LiveMarketingController.LLILZLL.put(abstractC1115900f92LIZ.LIZ(), abstractC1115900f92LIZ);
                }
            }
            LiveMarketingController.LLILLL = new WeakReference<>(this);
            LiveMarketingController.LLILZ = (IMessageManager) dataChannel.gg0(C776250Uch.class);
            Iterator it3 = ((LinkedHashMap) LiveMarketingController.LLILZLL).values().iterator();
            while (it3.hasNext()) {
                it3.next().getClass();
                Iterator it4 = C13BV.INSTANCE.iterator();
                while (it4.hasNext()) {
                    int iIntValue = ((Number) it4.next()).intValue();
                    IMessageManager iMessageManager = LiveMarketingController.LLILZ;
                    if (iMessageManager != null) {
                        iMessageManager.addMessageListener(iIntValue, (OnIMMessageListener) LiveMarketingController.LL);
                    }
                }
            }
            ((IBusinessAvoidanceService) C1161920gLG.LIZJ(IBusinessAvoidanceService.class)).az(LiveMarketingController.LLJIJIL, dataChannel);
        }
        getLifecycle().addObserver(LiveMarketingController.LL);
        LiveMarketingViewModel liveMarketingViewModelY1 = y1();
        if (liveMarketingViewModelY1 == null) {
            return;
        }
        liveMarketingViewModelY1.LL.observe(this, new AObserverS221S0100000_17(this, 18));
        liveMarketingViewModelY1.LLILLJJLI.observe(this, new AObserverS221S0100000_17(this, 19));
        liveMarketingViewModelY1.LLILLL.observe(this, new AObserverS221S0100000_17(this, 20));
        liveMarketingViewModelY1.LLILZ.observe(this, new AObserverS221S0100000_17(this, 21));
    }
}
