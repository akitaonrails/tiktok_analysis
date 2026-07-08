package com.ss.android.ugc.aweme.search.lynx.xsearch.keyframe;

import X.C340880DXy;
import X.InterfaceC1312540kGC;
import android.content.Context;
import android.view.View;
import com.lynx.tasm.behavior.ui.LynxUI;
import j27.s;

/* JADX INFO: loaded from: classes5.dex */
public final class LynxSearchKeyframeCover extends LynxUI<C340880DXy> {
    public final s LL;
    public Integer LLILLJJLI;
    public Integer LLILLL;
    public Integer LLILZ;
    public Integer LLILZIL;

    public LynxSearchKeyframeCover(s sVar) {
        super(sVar);
        this.LL = sVar;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        if (context == null) {
            context = this.LL;
        }
        return new C340880DXy(context);
    }

    @InterfaceC1312540kGC(name = "frameBottom")
    public final void setFrameBottom(int i) {
        Integer numValueOf = Integer.valueOf(i);
        this.LLILZIL = numValueOf;
        C340880DXy c340880DXy = (C340880DXy) this.mView;
        if (c340880DXy != null) {
            Integer num = this.LLILLJJLI;
            Integer num2 = this.LLILLL;
            Integer num3 = this.LLILZ;
            c340880DXy.LLILLJJLI = num;
            c340880DXy.LLILLL = num2;
            c340880DXy.LLILZ = num3;
            c340880DXy.LLILZIL = numValueOf;
            c340880DXy.LIZ();
        }
    }

    @InterfaceC1312540kGC(name = "frameLeft")
    public final void setFrameLeft(int i) {
        Integer numValueOf = Integer.valueOf(i);
        this.LLILLJJLI = numValueOf;
        C340880DXy c340880DXy = (C340880DXy) this.mView;
        if (c340880DXy != null) {
            Integer num = this.LLILLL;
            Integer num2 = this.LLILZ;
            Integer num3 = this.LLILZIL;
            c340880DXy.LLILLJJLI = numValueOf;
            c340880DXy.LLILLL = num;
            c340880DXy.LLILZ = num2;
            c340880DXy.LLILZIL = num3;
            c340880DXy.LIZ();
        }
    }

    @InterfaceC1312540kGC(name = "frameRight")
    public final void setFrameRight(int i) {
        Integer numValueOf = Integer.valueOf(i);
        this.LLILZ = numValueOf;
        C340880DXy c340880DXy = (C340880DXy) this.mView;
        if (c340880DXy != null) {
            Integer num = this.LLILLJJLI;
            Integer num2 = this.LLILLL;
            Integer num3 = this.LLILZIL;
            c340880DXy.LLILLJJLI = num;
            c340880DXy.LLILLL = num2;
            c340880DXy.LLILZ = numValueOf;
            c340880DXy.LLILZIL = num3;
            c340880DXy.LIZ();
        }
    }

    @InterfaceC1312540kGC(name = "frameTop")
    public final void setFrameTop(int i) {
        Integer numValueOf = Integer.valueOf(i);
        this.LLILLL = numValueOf;
        C340880DXy c340880DXy = (C340880DXy) this.mView;
        if (c340880DXy != null) {
            Integer num = this.LLILLJJLI;
            Integer num2 = this.LLILZ;
            Integer num3 = this.LLILZIL;
            c340880DXy.LLILLJJLI = num;
            c340880DXy.LLILLL = numValueOf;
            c340880DXy.LLILZ = num2;
            c340880DXy.LLILZIL = num3;
            c340880DXy.LIZ();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    @X.InterfaceC1312540kGC(name = "scaleType")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setScaleType(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            switch(r0) {
                case -1364013995: goto L34;
                case -1362001767: goto L29;
                case -797304696: goto L1e;
                case 727618043: goto L13;
                default: goto L7;
            }
        L7:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP
        L9:
            T extends android.view.View r0 = r2.mView
            X.0DXy r0 = (X.C340880DXy) r0
            if (r0 == 0) goto L12
            r0.setScaleType(r1)
        L12:
            return
        L13:
            java.lang.String r0 = "aspectFill"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP
            goto L9
        L1e:
            java.lang.String r0 = "scaleToFill"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY
            goto L9
        L29:
            java.lang.String r0 = "aspectFit"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            goto L9
        L34:
            java.lang.String r0 = "center"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.xsearch.keyframe.LynxSearchKeyframeCover.setScaleType(java.lang.String):void");
    }

    @InterfaceC1312540kGC(name = "spriteThumbUrl")
    public final void setSpriteThumbUrl(String str) {
        C340880DXy c340880DXy = (C340880DXy) this.mView;
        if (c340880DXy != null) {
            c340880DXy.setSpriteThumbUrl(str);
        }
    }
}
