package com.ss.android.ugc.aweme.ecommerce.mixmall.player;

import X.C0H9H;
import X.C1300980jxY;
import X.C21281818Qe;
import X.C786410Ut5;
import X.InterfaceC1312540kGC;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import j27.s;

/* JADX INFO: loaded from: classes33.dex */
public class LynxMMKVideoTime extends UISimpleView<C21281818Qe> {
    public LynxMMKVideoTime() {
        throw null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        super.onPropsUpdated();
        C21281818Qe c21281818Qe = (C21281818Qe) this.mView;
        c21281818Qe.h0(false);
        TextView textView = c21281818Qe.LLILZ;
        if (textView != null) {
            textView.setTextColor(c21281818Qe.LLIZLLLIL);
        }
        TextView textView2 = c21281818Qe.LLILZ;
        if (textView2 != null) {
            textView2.setTextSize(c21281818Qe.LLJI);
        }
        TextView textView3 = c21281818Qe.LLILZ;
        if (textView3 != null) {
            C0H9H.LJFF(c21281818Qe.LLJIJIL, textView3);
        }
        TextView textView4 = c21281818Qe.LLILZ;
        if (textView4 != null) {
            Float f = c21281818Qe.LLJ;
            int i = (f == null || f.floatValue() < 500.0f) ? 0 : 1;
            s sVar = c21281818Qe.LL;
            String str = c21281818Qe.LLJILJILJ;
            Typeface typeface = textView4.getTypeface();
            if (sVar != null) {
                String str2 = "ProximaNova-Regular";
                if (str != null) {
                    if (TextUtils.isEmpty(str)) {
                        str = "ProximaNova-Regular";
                    }
                    str2 = str;
                }
                Typeface typefaceLJ = C1300980jxY.LJ(i, sVar, str2);
                if (typefaceLJ != null) {
                    typeface = typefaceLJ;
                }
            }
            textView4.setTypeface(typeface, i);
        }
        TextView textView5 = c21281818Qe.LLILZ;
        if (textView5 != null) {
            C786410Ut5.LLIL(textView5, 0);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        if (context == null) {
            return super.createView(null);
        }
        return new C21281818Qe(context, this.mContext);
    }

    @InterfaceC1312540kGC(defaultFloat = 12.0f, name = "icon-size")
    public final void setIconSize(float f) {
        ((C21281818Qe) this.mView).setIconSize(f);
    }

    @InterfaceC1312540kGC(name = "play-icon")
    public final void setPlayIcon(String str) {
        ((C21281818Qe) this.mView).setPlayIcon(str);
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "show-time")
    public final void setShowTime(boolean z) {
        ((C21281818Qe) this.mView).setShowTime(z);
    }

    @InterfaceC1312540kGC(name = "stop-icon")
    public final void setStopIcon(String str) {
        ((C21281818Qe) this.mView).setStopIcon(str);
    }

    @InterfaceC1312540kGC(name = "text-color")
    public final void setTextColor(String str) {
        ((C21281818Qe) this.mView).setTextColor(str);
    }

    @InterfaceC1312540kGC(name = "text-font-family")
    public final void setTextFontFamily(String str) {
        ((C21281818Qe) this.mView).setTextFontFamily(str);
    }

    @InterfaceC1312540kGC(defaultFloat = 12.0f, name = "text-font-size")
    public final void setTextFontSize(float f) {
        ((C21281818Qe) this.mView).setTextFontSize(f);
    }

    @InterfaceC1312540kGC(name = "text-font-weight")
    public final void setTextFontWeight(float f) {
        ((C21281818Qe) this.mView).setTextFontWeight(f);
    }

    @InterfaceC1312540kGC(defaultFloat = 2.0f, name = "text-space")
    public final void setTextSpace(float f) {
        ((C21281818Qe) this.mView).setTextSpace(f);
    }
}
