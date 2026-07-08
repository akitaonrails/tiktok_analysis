package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C0H5I;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public class AkS5S1100000_6 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$0(irm.AkS5S1100000_6 r5, android.view.View r6) {
        /*
            java.lang.Object r0 = r5.l1
            com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem r0 = (com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem) r0
            com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageViewModel r0 = r0.mp()
            X.002o r0 = r0.getState()
            X.0HOf r0 = (X.C440270HOf) r0
            X.0HOC r0 = r0.LLILZIL
            r4 = 0
            if (r0 == 0) goto L64
            X.0HNn r1 = r0.LIZ
        L15:
            boolean r0 = r1 instanceof X.C0HGK
            if (r0 == 0) goto L60
            X.0HGK r1 = (X.C0HGK) r1
            if (r1 == 0) goto L60
            java.lang.String r3 = r1.LIZ
            if (r3 == 0) goto L61
            java.lang.Object r0 = r5.l1
            com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem r0 = (com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem) r0
            com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageViewModel r0 = r0.mp()
            X.002o r0 = r0.getState()
            X.0HOf r0 = (X.C440270HOf) r0
            X.0HOC r0 = r0.LLILZIL
            if (r0 == 0) goto L35
            X.0H7H r4 = r0.LIZIZ
        L35:
            r1 = 0
            if (r3 == 0) goto L58
            X.0HNd r2 = new X.0HNd
            r2.<init>(r1, r4, r3)
        L3d:
            java.lang.Object r0 = r5.l1
            com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem r0 = (com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem) r0
            X.0HNc r1 = r0.LLJJI
            if (r1 == 0) goto L57
            r0 = -2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.0H6M r1 = r1.LIZIZ(r2, r0)
            if (r1 == 0) goto L57
            java.lang.Object r0 = r5.l1
            com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem r0 = (com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem) r0
            r0.lp(r1)
        L57:
            return
        L58:
            X.0HNb r2 = new X.0HNb
            java.lang.String r0 = r5.s0
            r2.<init>(r1, r4, r0)
            goto L3d
        L60:
            r3 = r4
        L61:
            X.0H7H r4 = X.C0H7H.TEXT_PLACEHOLDER
            goto L35
        L64:
            r1 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: irm.AkS5S1100000_6.LIZ$0(irm.AkS5S1100000_6, android.view.View):void");
    }

    public static final void LIZ$1(AkS5S1100000_6 akS5S1100000_6, View view) {
        ((C0H5I) akS5S1100000_6.l1).LLILLJJLI.invoke(akS5S1100000_6.s0);
    }

    public static final void LIZ$2(AkS5S1100000_6 akS5S1100000_6, View view) {
        ((C0H5I) akS5S1100000_6.l1).LLILLL.invoke(akS5S1100000_6.s0);
    }

    public AkS5S1100000_6(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
