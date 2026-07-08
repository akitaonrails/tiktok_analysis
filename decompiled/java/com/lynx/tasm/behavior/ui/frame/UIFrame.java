package com.lynx.tasm.behavior.ui.frame;

import X.C1300040jw2;
import X.C1300050jw3;
import X.C1309770kBj;
import X.C1310140kCK;
import X.C1310660kDA;
import X.C1312920kGo;
import X.C2188811AlT;
import X.InterfaceC1298070jsr;
import X.InterfaceC1312540kGC;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateBundle;
import com.lynx.tasm.TemplateData;
import com.lynx.tasm.base.TraceController;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIBody;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes21.dex */
public final class UIFrame extends LynxUI<C1309770kBj> {
    public TemplateBundle LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
        C1309770kBj c1309770kBj = (C1309770kBj) this.mView;
        if (c1309770kBj == null || c1309770kBj.LLJI) {
            return;
        }
        c1309770kBj.LLJI = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lynxframeview destroy ");
        sbLIZ.append(c1309770kBj.toString());
        LynxLog.i("LynxFrameView", C2188811AlT.LIZIZ(sbLIZ));
        TraceEvent.LIZLLL("LynxFrameView.destroy");
        LynxTemplateRender lynxTemplateRender = c1309770kBj.LL;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.LJIILJJIL.LIZ.remove(c1309770kBj.LLJJJIL);
            c1309770kBj.LL.LJJIJLIJ();
            c1309770kBj.LL.LJIIIIZZ();
            c1309770kBj.LL = null;
        }
        TemplateData templateData = c1309770kBj.LLJIJIL;
        if (templateData != null) {
            templateData.LJIILL();
            c1309770kBj.LLJIJIL = null;
        }
        TemplateData templateData2 = c1309770kBj.LLJILJIL;
        if (templateData2 != null) {
            templateData2.LJIILL();
            c1309770kBj.LLJILJIL = null;
        }
        TraceEvent.LJII("LynxFrameView.destroy");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        super.onPropsUpdated();
        if (this.LLILLL && this.LL != null) {
            TemplateBundle templateBundle = this.LL;
            C1309770kBj c1309770kBj = (C1309770kBj) this.mView;
            if (c1309770kBj != null) {
                c1309770kBj.setAttachLynxPageUICallback(new C1310140kCK(this));
                if (c1309770kBj.LJIILL(templateBundle)) {
                    this.LL = null;
                    this.LLILLL = false;
                }
            }
        }
        this.LLILLJJLI = true;
        C1309770kBj c1309770kBj2 = (C1309770kBj) this.mView;
        if (c1309770kBj2 != null) {
            if (!c1309770kBj2.LLILZLL || c1309770kBj2.LL == null) {
                LynxLog.e("LynxFrameView", "onPropsUpdated failed, bundle not loaded or render is null");
                return;
            }
            TemplateData templateData = c1309770kBj2.LLJIJIL;
            if (templateData == null && c1309770kBj2.LLJILJIL == null) {
                return;
            }
            TemplateData templateData2 = c1309770kBj2.LLJILJIL;
            c1309770kBj2.LLJIJIL = null;
            c1309770kBj2.LLJILJIL = null;
            new C1300040jw2();
            c1309770kBj2.LL.LJZL(new C1300050jw3(templateData, templateData2));
        }
    }

    public static TemplateData LJJIJ(InterfaceC1298070jsr interfaceC1298070jsr) {
        ReadableMap readableMapAsMap;
        if (interfaceC1298070jsr == null || interfaceC1298070jsr.isNull() || interfaceC1298070jsr.getType() != ReadableType.Map || (readableMapAsMap = interfaceC1298070jsr.asMap()) == null) {
            return null;
        }
        return TemplateData.LJII(readableMapAsMap.asHashMap());
    }

    public final int LJJIIZI(String str) {
        float f;
        float width;
        float height;
        if (str == null) {
            return -1;
        }
        UIBody uIBody = this.mContext.LLJILJILJ;
        if (uIBody != null) {
            f = uIBody.mFontSize;
            width = uIBody.getWidth();
            height = uIBody.getHeight();
        } else {
            f = 0.0f;
            width = 0.0f;
            height = 0.0f;
        }
        return (int) C1312920kGo.LIZIZ(str, f, this.mFontSize, width, height, 1.0E21f, this.mContext.LLJJJ);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        s sVar = this.mContext;
        sVar.getClass();
        C1309770kBj c1309770kBj = new C1309770kBj(this.mContext);
        c1309770kBj.LLILZIL = sVar;
        C1310660kDA c1310660kDALJIILL = sVar.LJIILL();
        if (c1310660kDALJIILL != null) {
            if (c1310660kDALJIILL instanceof LynxView) {
                c1309770kBj.LLILLL = new WeakReference<>(c1310660kDALJIILL);
            } else if (c1310660kDALJIILL instanceof C1309770kBj) {
                c1309770kBj.LLILLL = new WeakReference<>(((C1309770kBj) c1310660kDALJIILL).getRootView());
                return c1309770kBj;
            }
        }
        return c1309770kBj;
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "auto-height")
    public void setAutoHeight(boolean z) {
        C1309770kBj c1309770kBj = (C1309770kBj) this.mView;
        if (c1309770kBj != null) {
            c1309770kBj.setAutoHeight(z);
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "auto-width")
    public void setAutoWidth(boolean z) {
        C1309770kBj c1309770kBj = (C1309770kBj) this.mView;
        if (c1309770kBj != null) {
            c1309770kBj.setAutoWidth(z);
        }
    }

    @InterfaceC1312540kGC(name = "data")
    public void setData(InterfaceC1298070jsr interfaceC1298070jsr) {
        C1309770kBj c1309770kBj = (C1309770kBj) this.mView;
        if (c1309770kBj != null) {
            if (interfaceC1298070jsr != null && interfaceC1298070jsr.getType() == ReadableType.Long) {
                c1309770kBj.setInitData(interfaceC1298070jsr.asLong());
            } else {
                c1309770kBj.setInitData(LJJIJ(interfaceC1298070jsr));
            }
        }
        this.mProps.remove("data");
    }

    @InterfaceC1312540kGC(name = "embedded-mode")
    public void setEmbeddedMode(int i) {
        C1309770kBj c1309770kBj = (C1309770kBj) this.mView;
        if (c1309770kBj != null) {
            c1309770kBj.setEmbeddedMode(i);
        }
    }

    @InterfaceC1312540kGC(name = "enable-multi-async-thread")
    public void setEnableMultiAsyncThread(Boolean bool) {
        C1309770kBj c1309770kBj = (C1309770kBj) this.mView;
        if (c1309770kBj != null) {
            c1309770kBj.setEnableMultiAsyncThread(bool);
        }
    }

    @InterfaceC1312540kGC(name = "global-props")
    public void setGlobalProps(InterfaceC1298070jsr interfaceC1298070jsr) {
        C1309770kBj c1309770kBj = (C1309770kBj) this.mView;
        if (c1309770kBj != null) {
            if (interfaceC1298070jsr != null && interfaceC1298070jsr.getType() == ReadableType.Long) {
                c1309770kBj.setGlobalProps(interfaceC1298070jsr.asLong());
            } else {
                c1309770kBj.setGlobalProps(LJJIJ(interfaceC1298070jsr));
            }
        }
        this.mProps.remove("global-props");
    }

    @InterfaceC1312540kGC(name = "preset-height")
    public void setPresetHeight(String str) {
        C1309770kBj c1309770kBj = (C1309770kBj) this.mView;
        if (c1309770kBj != null) {
            c1309770kBj.setPresetHeight(LJJIIZI(str));
        }
    }

    @InterfaceC1312540kGC(name = "preset-width")
    public void setPresetWidth(String str) {
        C1309770kBj c1309770kBj = (C1309770kBj) this.mView;
        if (c1309770kBj != null) {
            c1309770kBj.setPresetWidth(LJJIIZI(str));
        }
    }

    @InterfaceC1312540kGC(name = "src")
    public void setSrc(String str) {
        this.LLILLL = true;
        this.LLILLJJLI = false;
        C1309770kBj c1309770kBj = (C1309770kBj) this.mView;
        if (c1309770kBj == null) {
            return;
        }
        c1309770kBj.setUrl(str);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateExtraData(Object obj) {
        C1309770kBj c1309770kBj;
        if (obj instanceof TemplateBundle) {
            TemplateBundle templateBundle = (TemplateBundle) obj;
            if (this.LLILLL && this.LLILLJJLI && (c1309770kBj = (C1309770kBj) this.mView) != null) {
                c1309770kBj.setAttachLynxPageUICallback(new C1310140kCK(this));
                if (c1309770kBj.LJIILL(templateBundle)) {
                    this.LL = null;
                    this.LLILLL = false;
                    this.LLILLJJLI = false;
                    return;
                }
            }
            this.LL = templateBundle;
        }
    }

    public UIFrame(s sVar, Object obj) {
        super(sVar, obj);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setSign(int i, String str) {
        super.setSign(i, str);
        C1309770kBj c1309770kBj = (C1309770kBj) this.mView;
        if (c1309770kBj != null) {
            c1309770kBj.setSign(i);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateLayout(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        super.updateLayout(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
        C1309770kBj c1309770kBj = (C1309770kBj) this.mView;
        if (c1309770kBj == null) {
            return;
        }
        int iMax = Math.max(0, i3 - (((i5 + i7) + i13) + i15));
        int iMax2 = Math.max(0, i4 - (((i6 + i8) + i14) + i16));
        if (TraceController.isTracingStarted()) {
            HashMap map = new HashMap();
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, c1309770kBj.LLJJ);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, c1309770kBj.LLJJI);
            map.put("widthMeasureSpec", View.MeasureSpec.toString(iMakeMeasureSpec));
            map.put("heightMeasureSpec", View.MeasureSpec.toString(iMakeMeasureSpec2));
            TraceEvent.LJIIL(0L, "LynxFrameView.updateLayout", map);
        }
        c1309770kBj.LLIZLLLIL = iMax;
        c1309770kBj.LLJ = iMax2;
    }
}
