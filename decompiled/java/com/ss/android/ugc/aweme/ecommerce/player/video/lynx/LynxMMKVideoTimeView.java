package com.ss.android.ugc.aweme.ecommerce.player.video.lynx;

import X.C21281718Qd;
import X.InterfaceC1312540kGC;
import android.content.Context;
import android.view.View;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import j27.s;
import kotlin.jvm.internal.AwS669S0100000_20;

/* JADX INFO: loaded from: classes33.dex */
public final class LynxMMKVideoTimeView extends UISimpleView<C21281718Qd> {
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        super.onPropsUpdated();
        ((C21281718Qd) this.mView).h0(new AwS669S0100000_20(this, 0));
    }

    public LynxMMKVideoTimeView(s sVar) {
        super(sVar);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        if (context == null) {
            return super.createView(null);
        }
        return new C21281718Qd(context);
    }

    @InterfaceC1312540kGC(defaultFloat = 12.0f, name = "icon-size")
    public final void setIconSize(float f) {
        ((C21281718Qd) this.mView).setIconSize(f);
    }

    @InterfaceC1312540kGC(name = "play-icon")
    public final void setPlayIcon(String str) {
        ((C21281718Qd) this.mView).setPlayIcon(str);
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "show-time")
    public final void setShowTime(boolean z) {
        ((C21281718Qd) this.mView).setShowTime(z);
    }

    @InterfaceC1312540kGC(name = "stop-icon")
    public final void setStopIcon(String str) {
        ((C21281718Qd) this.mView).setStopIcon(str);
    }

    @InterfaceC1312540kGC(name = "text-color")
    public final void setTextColor(String str) {
        ((C21281718Qd) this.mView).setTextColor(str);
    }

    @InterfaceC1312540kGC(name = "text-font-family")
    public final void setTextFontFamily(String str) {
        ((C21281718Qd) this.mView).setTextFontFamily(str);
    }

    @InterfaceC1312540kGC(defaultFloat = 12.0f, name = "text-font-size")
    public final void setTextFontSize(float f) {
        ((C21281718Qd) this.mView).setTextFontSize(f);
    }

    @InterfaceC1312540kGC(name = "text-font-weight")
    public final void setTextFontWeight(float f) {
        ((C21281718Qd) this.mView).setTextFontWeight(f);
    }

    @InterfaceC1312540kGC(defaultFloat = 2.0f, name = "text-space")
    public final void setTextSpace(float f) {
        ((C21281718Qd) this.mView).setTextSpace(f);
    }
}
