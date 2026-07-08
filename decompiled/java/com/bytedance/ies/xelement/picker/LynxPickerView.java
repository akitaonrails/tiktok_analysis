package com.bytedance.ies.xelement.picker;

import X.C1299120juY;
import X.C1848410yCV;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.InterfaceC1298070jsr;
import X.InterfaceC1305140k4G;
import X.InterfaceC1312540kGC;
import Y.ACListenerS135S0200000_33;
import android.content.Context;
import android.view.View;
import avg.f;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import j27.s;
import java.util.Map;
import mf.a;

/* JADX INFO: loaded from: classes34.dex */
public final class LynxPickerView extends UISimpleView<AndroidView> {
    public String LL;
    public boolean LLILLJJLI;
    public InterfaceC1298070jsr LLILLL;
    public InterfaceC1298070jsr LLILZ;
    public InterfaceC1298070jsr LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final InterfaceC1305140k4G LLJJIJIL;

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        AndroidView androidView = new AndroidView(context);
        View.OnClickListener aCListenerS135S0200000_33 = new ACListenerS135S0200000_33(this, context, 8);
        if (C1848410yCV.LIZ) {
            aCListenerS135S0200000_33 = new f(aCListenerS135S0200000_33);
        }
        a aVar = new a(aCListenerS135S0200000_33);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(androidView);
        }
        androidView.setOnClickListener(aVar);
        return androidView;
    }

    @InterfaceC1312540kGC(name = "cancel-color")
    public final void setCancelColor(String str) {
        this.LLJILJILJ = str;
    }

    @InterfaceC1312540kGC(name = "cancel-string")
    public final void setCancelString(String str) {
        this.LLJIJIL = str;
    }

    @InterfaceC1312540kGC(name = "confirm-color")
    public final void setConfirmColor(String str) {
        this.LLJILJIL = str;
    }

    @InterfaceC1312540kGC(name = "confirm-string")
    public final void setConfirmString(String str) {
        this.LLJI = str;
    }

    @InterfaceC1312540kGC(name = "disabled")
    public final void setDisabled(Boolean bool) {
        if (bool != null) {
            bool.booleanValue();
            this.LLILLJJLI = bool.booleanValue();
        }
    }

    @InterfaceC1312540kGC(name = "end")
    public final void setEnd(String str) {
        this.LLIZ = str;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, ? extends C1299120juY> map) {
        super.setEvents(map);
        if (map != null) {
            this.LLJJIII = map.containsKey("cancel");
            this.LLJJIJI = map.containsKey("change");
            this.LLJJIJIIJIL = map.containsKey("columnchange");
        }
    }

    @InterfaceC1312540kGC(name = "fields")
    public final void setFields(String str) {
        this.LLIZLLLIL = str;
    }

    @InterfaceC1312540kGC(name = "mode")
    public final void setMode(String str) {
        this.LL = str;
    }

    @InterfaceC1312540kGC(name = "range")
    public final void setRange(InterfaceC1298070jsr interfaceC1298070jsr) {
        this.LLILZ = interfaceC1298070jsr;
    }

    @InterfaceC1312540kGC(name = "range-key")
    public final void setRangeKey(InterfaceC1298070jsr interfaceC1298070jsr) {
        this.LLILZIL = interfaceC1298070jsr;
    }

    @InterfaceC1312540kGC(name = "separator")
    public final void setSeparator(String str) {
        this.LLJ = str;
    }

    @InterfaceC1312540kGC(name = "start")
    public final void setStart(String str) {
        this.LLILZLL = str;
    }

    @InterfaceC1312540kGC(name = "title")
    public final void setTitle(String str) {
        this.LLJILLL = str;
    }

    @InterfaceC1312540kGC(name = "title-color")
    public final void setTitleColor(String str) {
        this.LLJJ = str;
    }

    @InterfaceC1312540kGC(name = "title-font-size")
    public final void setTitleFontSize(String str) {
        this.LLJJI = str;
    }

    @InterfaceC1312540kGC(name = "value")
    public final void setValue(InterfaceC1298070jsr interfaceC1298070jsr) {
        this.LLILLL = interfaceC1298070jsr;
    }

    public LynxPickerView(s sVar, Object obj) {
        super(sVar, obj);
        this.LL = "selector";
        this.LLJJIJIL = null;
    }
}
