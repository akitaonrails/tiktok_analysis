package com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage;

import X.C01GW;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C2217381BqS;
import X.C384050F3z;
import X.C417790GZt;
import X.C418440Gaw;
import X.C432910GyH;
import X.C452501pT;
import X.C462960IDm;
import X.C786410Ut5;
import X.EnumC1338240kve;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS110S0200000_6;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeItemCell extends PowerCell<C432910GyH> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public C417790GZt LLILLJJLI;
    public final C462960IDm LL = new C462960IDm(this, 2);
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(200));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MemeItemCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/socialavatar/mixstudio/homepage/MemeItemControl;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final int I5() {
        return ((Number) this.LLILLL.getValue()).intValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        Context context;
        C432910GyH c432910GyH = (C432910GyH) interfaceC1891350zJl;
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(c432910GyH.LL.LIZIZ);
        c1331670kl3LJIIIZ.LJJ(this.LLILLJJLI);
        c1331670kl3LJIIIZ.LJIL = Bitmap.Config.RGB_565;
        c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.CENTER_CROP;
        c1331670kl3LJIIIZ.LJJIL = true;
        C417790GZt c417790GZt = this.LLILLJJLI;
        if (c417790GZt != null && (context = c417790GZt.getContext()) != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.bq);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
            c1331670kl3LJIIIZ.LJJIIZI(c384050F3z.LIZ(context));
        }
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        C417790GZt c417790GZt2 = this.LLILLJJLI;
        if (c417790GZt2 != null) {
            C786410Ut5.Q8(c417790GZt2, new ACListenerS110S0200000_6(this, c432910GyH, 28));
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0GZt, android.view.View, android.widget.ImageView] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        final Context context = viewGroup.getContext();
        ?? r4 = new SmartImageView(context) { // from class: X.0GZt
            @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
            public final void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                C20597815iq.LIZ(this);
            }

            @Override // com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
            public final void onDraw(Canvas canvas) {
                try {
                    super.onDraw(canvas);
                } catch (RuntimeException e) {
                    TryCatchGuardChecker.doCheck(e);
                    BitmapCrashChecker.doCheck(e, this);
                    throw e;
                }
            }

            @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
            public final void onMeasure(int i, int i2) {
                super.onMeasure(i, i);
            }
        };
        r4.setPadding(I5(), I5(), I5(), I5());
        r4.setAdjustViewBounds(true);
        this.LLILLJJLI = r4;
        return r4;
    }
}
