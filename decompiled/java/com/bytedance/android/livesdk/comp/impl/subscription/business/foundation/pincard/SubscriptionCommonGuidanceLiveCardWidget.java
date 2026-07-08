package com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.pincard;

import X.C1078480eAg;
import X.C1108220ewe;
import X.C1108230ewf;
import X.C1108300ewm;
import X.C1108310ewn;
import X.C1108330ewp;
import X.C1324720kZq;
import X.C162100jj;
import X.C16F5;
import X.C16FS;
import X.C454590Hs9;
import X.C497740JfY;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.livesetting.performance.LiveWidgetMinLoadSettingV2;
import com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes18.dex */
public final class SubscriptionCommonGuidanceLiveCardWidget extends AnimatableRecyclableWidget {
    public LiveIconView LL;
    public C1324720kZq LLILLJJLI;
    public C16F5 LLILLL;
    public C16F5 LLILZ;
    public C16FS LLILZIL;
    public C1108220ewe LLILZLL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i2j;
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        if (isShowing()) {
            cancelShowAnimation();
            cancelHideAnimation();
            animateHide();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (isShowing()) {
            return;
        }
        cancelShowAnimation();
        cancelHideAnimation();
        animateShow();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        View view;
        this.LL = (LiveIconView) findViewById(R.id.e1g);
        this.LLILLJJLI = (C1324720kZq) findViewById(R.id.wj1);
        this.LLILLL = (C16F5) findViewById(R.id.wi7);
        this.LLILZIL = (C16FS) findViewById(R.id.whx);
        this.LLILZ = (C16F5) findViewById(R.id.jb5);
        if (C454590Hs9.LIZ(this.context) && (view = this.contentView) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.rightMargin = (int) C497740JfY.LIZIZ(12.0f);
                C786410Ut5.W5(view, marginLayoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onUnload(RecycleSource recycleSource) {
        C1108220ewe c1108220ewe = this.LLILZLL;
        if (c1108220ewe != null) {
            c1108220ewe.LIZLLL();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onLoad(RecycleSource recycleSource, Object[] objArr) {
        C1108230ewf c1108230ewf = new C1108230ewf(this);
        if (LiveWidgetMinLoadSettingV2.INSTANCE.enableSubCommonGuideCard()) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    if (obj instanceof C1078480eAg) {
                        Object obj2 = ((C1078480eAg) obj).LIZ;
                        if (obj2 instanceof C1108220ewe) {
                            C1108220ewe c1108220ewe = (C1108220ewe) obj2;
                            this.LLILZLL = c1108220ewe;
                            c1108220ewe.LJFF = new C1108300ewm(this);
                            C1108220ewe c1108220ewe2 = this.LLILZLL;
                            if (c1108220ewe2 != null) {
                                c1108220ewe2.LJ = c1108230ewf;
                            }
                        } else if (obj2 instanceof C1108330ewp) {
                            c1108230ewf.invoke(obj2);
                        }
                    }
                }
            }
        } else {
            C1108220ewe c1108220ewe3 = new C1108220ewe(this, C162100jj.LIZ(this.dataChannel), this.context, this.dataChannel, c1108230ewf, new C1108310ewn(this), null);
            this.LLILZLL = c1108220ewe3;
            c1108220ewe3.LIZJ();
        }
        LiveIconView liveIconView = this.LL;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new View.OnClickListener() { // from class: X.0ewi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1108220ewe c1108220ewe4 = this.LL.LLILZLL;
                    if (c1108220ewe4 != null) {
                        c1108220ewe4.LIZIZ(null);
                    }
                }
            });
        }
    }
}
