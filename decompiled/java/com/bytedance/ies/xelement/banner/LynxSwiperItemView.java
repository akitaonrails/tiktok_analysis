package com.bytedance.ies.xelement.banner;

import X.ViewOnAttachStateChangeListenerC1339220kxE;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.ies.xelement.banner.LynxSwiperItemView;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import com.lynx.tasm.behavior.ui.view.UIView;
import j27.s;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxSwiperItemView extends UIView {
    public final void LJJIJ() {
        if (this.mView.getParent() instanceof ViewGroup) {
            ViewParent parent = this.mView.getParent();
            if (parent == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (getOverflow() != 0) {
                viewGroup.setClipChildren(false);
            }
            this.mView.setClipBounds(getBoundRectForOverflow());
        }
    }

    public LynxSwiperItemView(s sVar) {
        super(sVar, null);
    }

    @Override // com.lynx.tasm.behavior.ui.view.UIView, com.lynx.tasm.behavior.ui.LynxUI
    public final AndroidView createView(Context context) {
        AndroidView androidViewCreateView = super.createView(context);
        androidViewCreateView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1339220kxE(0));
        return androidViewCreateView;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setOverflow(int i) {
        super.setOverflow(i);
        this.mView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) { // from class: X.0jfi
            public final WeakReference<LynxSwiperItemView> LL;

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
            }

            {
                this.LL = new WeakReference<>(this);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                LynxSwiperItemView lynxSwiperItemView = this.LL.get();
                if (lynxSwiperItemView != null) {
                    lynxSwiperItemView.LJJIJ();
                }
            }
        });
        LJJIJ();
    }

    @Override // com.lynx.tasm.behavior.ui.view.UIView, com.lynx.tasm.behavior.ui.LynxUI
    public final /* bridge */ /* synthetic */ View createView(Context context) {
        return createView(context);
    }

    public LynxSwiperItemView(s sVar, Object obj) {
        super(sVar, obj);
    }
}
