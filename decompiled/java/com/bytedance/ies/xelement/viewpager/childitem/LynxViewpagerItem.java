package com.bytedance.ies.xelement.viewpager.childitem;

import X.C1289960jfm;
import X.C1290180jg8;
import X.C1298720jtu;
import X.C1299120juY;
import X.InterfaceC1290150jg5;
import X.InterfaceC1312540kGC;
import android.content.Context;
import android.view.View;
import com.bytedance.ies.xelement.viewpager.childitem.LynxViewpagerItem;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import j27.s;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxViewpagerItem extends UIGroup<C1290180jg8> {
    public String LL;
    public InterfaceC1290150jg5 LLILLJJLI;
    public boolean LLILLL;

    public LynxViewpagerItem(s sVar) {
        super(sVar, null);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(final Context context) {
        return new AndroidView(context, this) { // from class: X.0jg8
            public final LynxViewpagerItem LL;

            {
                new LinkedHashMap();
                this.LL = this;
            }

            @Override // com.lynx.tasm.behavior.ui.view.AndroidView, android.view.View
            public final void onMeasure(int i, int i2) {
                int width;
                View view;
                super.onMeasure(i, i2);
                if (getMeasuredWidth() == 0) {
                    Object parent = getParent();
                    if ((parent instanceof C1336770ktH) && (view = (View) parent) != null) {
                        width = view.getMeasuredWidth();
                    } else {
                        width = this.LL.getWidth();
                    }
                    setMeasuredDimension(width, View.MeasureSpec.getSize(i2));
                    InterfaceC1314130kIl interfaceC1314130kIl = this.mDrawChildHook;
                    if (interfaceC1314130kIl != null) {
                        interfaceC1314130kIl.performMeasureChildrenUI();
                    }
                }
            }
        };
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, C1299120juY> map) {
        super.setEvents(map);
        if (map != null) {
            this.LLILLL = map.containsKey("attach");
        }
    }

    @InterfaceC1312540kGC(name = "tag")
    public final void setTag(String str) {
        this.LL = str;
        InterfaceC1290150jg5 interfaceC1290150jg5 = this.LLILLJJLI;
        if (interfaceC1290150jg5 != null) {
            interfaceC1290150jg5.LIZ(str);
        }
    }

    public LynxViewpagerItem(s sVar, Object obj) {
        super(sVar, obj);
    }

    public final void LJJIIZI(int i, boolean z) {
        if (!this.LLILLL) {
            return;
        }
        C1298720jtu c1298720jtu = this.mContext.LLIZ;
        C1289960jfm c1289960jfm = new C1289960jfm(getSign(), "attach");
        c1289960jfm.LIZIZ(Boolean.valueOf(z), "attach");
        c1289960jfm.LIZIZ(String.valueOf(this.LL), "tag");
        c1289960jfm.LIZIZ(Integer.valueOf(i), "index");
        c1298720jtu.LIZIZ(c1289960jfm);
    }
}
