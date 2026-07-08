package com.lynx.xelement.viewpager.childitem;

import X.C1289940jfk;
import X.C1289960jfm;
import X.C1290170jg7;
import X.C1298720jtu;
import X.C1299120juY;
import X.InterfaceC1289950jfl;
import X.InterfaceC1312540kGC;
import android.content.Context;
import android.view.View;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import com.lynx.xelement.viewpager.childitem.LynxViewpagerItem;
import j27.s;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class LynxViewpagerItem extends UIGroup<C1290170jg7> {
    public static final C1289940jfk Companion = new Object() { // from class: X.0jfk
    };
    public boolean mEnableIsAttached;
    public InterfaceC1289950jfl mPropChaneListener;
    public String tag;

    public final void setPropChaneListener(InterfaceC1289950jfl interfaceC1289950jfl) {
    }

    public final String getTag() {
        return String.valueOf(this.tag);
    }

    public LynxViewpagerItem(s sVar) {
        this(sVar, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0jg7] */
    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public C1290170jg7 createView(final Context context) {
        return new AndroidView(context, this) { // from class: X.0jg7
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
                    if ((parent instanceof C1336790ktJ) && (view = (View) parent) != null) {
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
    public void setEvents(Map<String, C1299120juY> map) {
        super.setEvents(map);
        if (map != null) {
            this.mEnableIsAttached = map.containsKey("attach");
        }
    }

    @InterfaceC1312540kGC(name = "tag")
    public final void setTag(String str) {
        this.tag = str;
    }

    public LynxViewpagerItem(s sVar, Object obj) {
        super(sVar, obj);
    }

    public final void sendIsAttachedEvent(boolean z, int i) {
        if (!this.mEnableIsAttached) {
            return;
        }
        C1298720jtu c1298720jtu = this.mContext.LLIZ;
        C1289960jfm c1289960jfm = new C1289960jfm(getSign(), "attach");
        c1289960jfm.LIZIZ(Boolean.valueOf(z), "attach");
        c1289960jfm.LIZIZ(getTag(), "tag");
        c1289960jfm.LIZIZ(Integer.valueOf(i), "index");
        c1298720jtu.LIZIZ(c1289960jfm);
    }
}
