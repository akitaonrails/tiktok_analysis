package com.ss.android.ugc.aweme.search.lynx.xsearch.searchmarkdown.core.ui;

import X.C1299120juY;
import X.C301240BrO;
import X.C418440Gaw;
import X.C689140R1k;
import X.C689170R1n;
import X.C814420VxA;
import X.InterfaceC1312540kGC;
import X.InterfaceC1967107nB;
import X.InterfaceC689210R1r;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.ss.android.ugc.aweme.search.lynx.xsearch.searchmarkdown.core.ui.LynxSearchMarkdown;
import j27.s;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class LynxSearchMarkdown extends LynxUI<C689140R1k> {
    public boolean LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;

    public LynxSearchMarkdown(s sVar) {
        super(sVar);
    }

    @InterfaceC1967107nB
    public void getExposedQuotes(Callback callback) {
        ((C689140R1k) this.mView).LIZ(callback);
    }

    @InterfaceC1312540kGC(name = "config")
    public void setConfig(ReadableMap readableMap) {
        ((C689140R1k) this.mView).setConfig(readableMap);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, C1299120juY> map) {
        super.setEvents(map);
        if (map != null) {
            this.LL = map.containsKey("tapSup");
            this.LLILLJJLI = map.containsKey("tapSupList");
            this.LLILLL = map.containsKey("tapText");
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context, Object obj) {
        C689140R1k c689140R1k = new C689140R1k(context);
        c689140R1k.setOnMarkdownClickListener(new InterfaceC689210R1r() { // from class: X.0R1m
            @Override // X.InterfaceC689210R1r
            public final void LIZJ() {
                LynxSearchMarkdown lynxSearchMarkdown = this.LIZ;
                if (lynxSearchMarkdown.LLILLL) {
                    lynxSearchMarkdown.mContext.LLIZ.LIZIZ(new C1289960jfm(lynxSearchMarkdown.getSign(), "tapText"));
                }
            }

            @Override // X.InterfaceC689210R1r
            public final void LIZ(List<? extends Number> list) {
                LynxSearchMarkdown lynxSearchMarkdown = this.LIZ;
                if (lynxSearchMarkdown.LLILLJJLI) {
                    C1298720jtu c1298720jtu = lynxSearchMarkdown.mContext.LLIZ;
                    C1289960jfm c1289960jfm = new C1289960jfm(lynxSearchMarkdown.getSign(), "tapSupList");
                    c1289960jfm.LIZIZ(list, "indexList");
                    c1298720jtu.LIZIZ(c1289960jfm);
                }
            }

            @Override // X.InterfaceC689210R1r
            public final void LIZIZ(Number number) {
                LynxSearchMarkdown lynxSearchMarkdown = this.LIZ;
                if (lynxSearchMarkdown.LL) {
                    C1298720jtu c1298720jtu = lynxSearchMarkdown.mContext.LLIZ;
                    C1289960jfm c1289960jfm = new C1289960jfm(lynxSearchMarkdown.getSign(), "tapSup");
                    c1289960jfm.LIZIZ(number, "index");
                    c1298720jtu.LIZIZ(c1289960jfm);
                }
            }
        });
        return c689140R1k;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateLayout(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        super.updateLayout(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
        C689140R1k c689140R1k = (C689140R1k) this.mView;
        c689140R1k.getClass();
        if (C301240BrO.LIZ() && c689140R1k.LLILZ) {
            C689170R1n c689170R1n = c689140R1k.LLILZLL;
            int iLIZIZ = i3 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            String str = c689170R1n.LIZIZ;
            boolean z = c689170R1n.LIZJ;
            c689170R1n.getClass();
            c689140R1k.LIZIZ(new C689170R1n(iLIZIZ, str, z));
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateLayoutInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        super.updateLayoutInfo(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
    }
}
