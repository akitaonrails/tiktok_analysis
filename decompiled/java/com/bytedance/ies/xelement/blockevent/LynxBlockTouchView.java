package com.bytedance.ies.xelement.blockevent;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import j27.s;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxBlockTouchView extends UISimpleView<AndroidView> {
    public LynxBlockTouchView(s sVar) {
        super(sVar, null);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(final Context context) {
        return new AndroidView(context) { // from class: X.0jfj
            @Override // com.lynx.tasm.behavior.ui.view.AndroidView, android.view.View
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                return true;
            }

            {
                new LinkedHashMap();
            }
        };
    }
}
