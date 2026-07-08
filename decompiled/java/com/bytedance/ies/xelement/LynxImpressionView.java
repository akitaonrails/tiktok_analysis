package com.bytedance.ies.xelement;

import X.C1299120juY;
import X.InterfaceC1312540kGC;
import android.content.Context;
import android.view.View;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import j27.s;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class LynxImpressionView extends UISimpleView<AndroidView> {
    public boolean LL;
    public boolean LLILLJJLI;

    @InterfaceC1312540kGC(defaultInt = 0, name = "impression-percent")
    public void impressionPercent(int i) {
    }

    public LynxImpressionView(s sVar) {
        super(sVar);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        return new AndroidView(context);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, ? extends C1299120juY> map) {
        super.setEvents(map);
        if (map != null) {
            this.LL = map.containsKey("impression");
            this.LLILLJJLI = map.containsKey("exit");
        }
    }
}
