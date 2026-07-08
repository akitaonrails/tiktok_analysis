package com.ss.android.ugc.aweme.homepage.ui.slide;

import X.C1388190mED;
import X.C1570630qyT;
import X.C19EG;
import X.C426750GoL;
import X.C487280J9a;
import X.InterfaceC487330J9f;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import com.bytedance.hox.Hox;

/* JADX INFO: loaded from: classes25.dex */
public abstract class AbsTabScrollProfileStrategy implements IXTabScrollProfileStrategy, InterfaceC487330J9f {
    public static boolean LLILLL;
    public static final Rect LLILZ = new Rect();
    public final String LL;
    public final C19EG LLILLJJLI;

    public abstract boolean LIZ();

    @Override // com.bytedance.tiktok.homepage.mainfragment.InterceptHomeViewPagerProtocol
    public final AbsTabScrollProfileStrategy Rk0() {
        return this;
    }

    public final boolean LIZJ() {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LLILLJJLI);
        if (c19egLIZIZ == null) {
            return false;
        }
        return Hox.LLJILJIL.LIZ(c19egLIZIZ).LQ2(this.LL);
    }

    public AbsTabScrollProfileStrategy(C19EG c19eg, String str) {
        this.LL = str;
        this.LLILLJJLI = c19eg;
        C487280J9a.LIZIZ(this.LLILLJJLI, this);
    }

    public boolean LIZLLL(int i, int i2) {
        Rect rect = LLILZ;
        if (!rect.isEmpty() && rect.contains(i, i2)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        if (activity != null) {
            C1570630qyT.LIZ(activity);
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.InterceptHomeViewPagerProtocol
    public boolean LY1(float f, float f2, boolean z) {
        if (!LIZJ() || zu1()) {
            return false;
        }
        int i = (int) f;
        int i2 = (int) f2;
        C19EG c19eg = this.LLILLJJLI;
        boolean zLIZLLL = C426750GoL.LIZLLL(c19eg);
        if (zLIZLLL != LLILLL) {
            LLILLL = zLIZLLL;
            C1570630qyT.LIZ(c19eg);
        }
        if (!LIZLLL(i, i2)) {
            return false;
        }
        return LIZ();
    }
}
