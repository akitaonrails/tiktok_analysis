package kotlin.jvm.internal;

import X.C09AY;
import X.C0L2O;
import X.C12ES;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1372740lpI;
import X.C1373550lqb;
import X.C418440Gaw;
import X.C424560Gko;
import X.C438710HIf;
import X.C462800ICw;
import X.C786410Ut5;
import X.InterfaceC1631620sYq;
import X.InterfaceC424570Gkp;
import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostWatch;
import com.ss.android.ugc.aweme.share.improve.pkg.NowSharePackage;
import kotlin.Pair;

/* JADX INFO: loaded from: classes17.dex */
public class AwS316S0300000_16 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS316S0300000_16(Activity activity, Aweme aweme, NowSharePackage nowSharePackage, int i) {
        super(3);
        this.$t = i;
        this.l0 = activity;
        this.l1 = aweme;
        this.l2 = nowSharePackage;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS316S0300000_16 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto L92
            r0 = 4
        L20:
            r4 = r4 | r0
        L21:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L90
            r0 = 1
        L3e:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L56
        L4d:
            kotlin.jvm.internal.AwS58S0001000_16 r4 = new kotlin.jvm.internal.AwS58S0001000_16
            r0 = 0
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L56:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 1
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r7 = 0
            r8 = 0
            r0 = 2131858143(0x7f1192df, float:1.9350066E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r15)
            X.0dXF r3 = new X.0dXF
            r0 = r16
            java.lang.Object r2 = r0.l0
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r0.l1
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r1 = (com.bytedance.android.livesdkapi.session.EnterRoomConfig) r1
            java.lang.Object r0 = r0.l2
            com.ss.android.ugc.aweme.live.livehostimpl.LiveHostWatch r0 = (com.ss.android.ugc.aweme.live.livehostimpl.LiveHostWatch) r0
            r3.<init>(r2, r1, r4, r0)
            r0 = 572278995(0x221c48d3, float:2.1180495E-18)
            X.12De r13 = X.C13Z4.LIZJ(r0, r3, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1456(0x5b0, float:2.04E-42)
            r9 = r8
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r7
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L90:
            r0 = 0
            goto L3e
        L92:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS316S0300000_16.invoke$0(kotlin.jvm.internal.AwS316S0300000_16, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS316S0300000_16 awS316S0300000_16, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        final int iIntValue = ((Number) obj3).intValue();
        if (!zBooleanValue) {
            return null;
        }
        final C424560Gko c424560Gko = new C424560Gko((Activity) awS316S0300000_16.l0);
        C1373550lqb c1373550lqb = C1373550lqb.LIZ;
        Aweme aweme = (Aweme) awS316S0300000_16.l1;
        C1372740lpI c1372740lpI = NowSharePackage.Companion;
        String str = ((NowSharePackage) awS316S0300000_16.l2).itemType;
        c1372740lpI.getClass();
        boolean zLIZIZ = C1372740lpI.LIZIZ(str);
        c1373550lqb.getClass();
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(C1373550lqb.LIZJ(aweme, zLIZIZ)));
        c1331670kl3LJIIIIZZ.LJJ(c424560Gko);
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        final float fLIZIZ = C418440Gaw.LIZIZ(Float.valueOf(370.0f));
        FrameLayout.LayoutParams layoutParamsLIZ = C0L2O.LIZ((Activity) awS316S0300000_16.l0, iIntValue, fLIZIZ, 0.75f, 0.8f, 0.25f);
        final Activity activity = (Activity) awS316S0300000_16.l0;
        c424560Gko.setConfigurationChangedListener(new InterfaceC424570Gkp() { // from class: X.0dbZ
            @Override // X.InterfaceC424570Gkp
            public final void LIZ() {
                FrameLayout.LayoutParams layoutParamsLIZ2 = C0L2O.LIZ(activity, iIntValue, fLIZIZ, 0.75f, 0.8f, 0.25f);
                C424560Gko c424560Gko2 = c424560Gko;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c424560Gko2);
                c424560Gko2.setLayoutParams(layoutParamsLIZ2);
            }
        });
        float fLIZJ = C12ES.LIZJ((layoutParamsLIZ.height / fLIZIZ) * 20.0f, (Activity) awS316S0300000_16.l0);
        C462800ICw.LIZ(c424560Gko, new float[]{fLIZJ, fLIZJ, fLIZJ, fLIZJ});
        C786410Ut5.H9(c424560Gko, null);
        return new Pair(c424560Gko, layoutParamsLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS316S0300000_16(Context context, EnterRoomConfig enterRoomConfig, LiveHostWatch liveHostWatch, int i) {
        super(3);
        this.$t = i;
        this.l0 = context;
        this.l1 = enterRoomConfig;
        this.l2 = liveHostWatch;
    }
}
