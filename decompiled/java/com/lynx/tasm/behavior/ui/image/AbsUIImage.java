package com.lynx.tasm.behavior.ui.image;

import X.InterfaceC1312540kGC;
import android.content.Context;
import android.view.View;
import com.lynx.tasm.behavior.ui.LynxUI;
import j27.s;

/* JADX INFO: loaded from: classes21.dex */
public abstract class AbsUIImage<T extends View> extends LynxUI<T> {
    @InterfaceC1312540kGC(name = "auto-size")
    public void setAutoSize(boolean z) {
    }

    @InterfaceC1312540kGC(name = "blur-radius")
    public abstract void setBlurRadius(String str);

    @InterfaceC1312540kGC(name = "capInsets")
    public abstract void setCapInsets(String str);

    @InterfaceC1312540kGC(name = "cap-insets")
    public void setCapInsetsBackUp(String str) {
    }

    @InterfaceC1312540kGC(name = "cap-insets-scale")
    public void setCapInsetsScale(String str) {
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "cover-start")
    public abstract void setCoverStart(boolean z);

    @InterfaceC1312540kGC(defaultBoolean = false, name = "disable-default-placeholder")
    public void setDisableDefaultPlaceholder(boolean z) {
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @InterfaceC1312540kGC(name = "disable-default-resize")
    public void setDisableDefaultResize(boolean z) {
    }

    @InterfaceC1312540kGC(name = "loop-count")
    public abstract void setLoopCount(int i);

    @InterfaceC1312540kGC(name = "mode")
    public abstract void setObjectFit(String str);

    @InterfaceC1312540kGC(name = "placeholder")
    public abstract void setPlaceholder(String str);

    @InterfaceC1312540kGC(name = "prefetch-height")
    public abstract void setPreFetchHeight(String str);

    @InterfaceC1312540kGC(name = "prefetch-width")
    public abstract void setPreFetchWidth(String str);

    @InterfaceC1312540kGC(defaultBoolean = false, name = "repeat")
    public abstract void setRepeat(boolean z);

    @InterfaceC1312540kGC(name = "src")
    public abstract void setSource(String str);

    public AbsUIImage(Context context) {
        super(context);
    }

    public AbsUIImage(s sVar) {
        super(sVar);
    }

    public AbsUIImage(s sVar, Object obj) {
        super(sVar, obj);
    }
}
