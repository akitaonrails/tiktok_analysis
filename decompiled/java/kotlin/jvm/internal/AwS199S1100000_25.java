package kotlin.jvm.internal;

import X.C09AY;
import X.C1668330tW3;
import X.C1670400tZO;
import X.C1672170tcF;
import X.C1672180tcG;
import X.C1672190tcH;
import X.C1685190txF;
import X.C1692150u8T;
import X.C1693430uAX;
import X.C259800zU;
import X.EnumC043200Dm;
import X.EnumC1888140zEa;
import X.InterfaceC1680500tpg;
import com.ss.android.ugc.aweme.model.AMEPublishCampaignItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS199S1100000_25 extends C09AY implements Function2 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            default:
                return null;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS199S1100000_25(com.ss.android.ugc.aweme.model.AMEPublishCampaignItem r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 3 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.l1 = r3
            r1.s0 = r4
            r0 = 2
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.s0 = r4
            r1.l1 = r3
            r0 = 2
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS199S1100000_25.<init>(com.ss.android.ugc.aweme.model.AMEPublishCampaignItem, java.lang.String, int):void");
    }

    public static final Object invoke$0(AwS199S1100000_25 awS199S1100000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1685190txF.LIZ(awS199S1100000_25.s0, null, C1670400tZO.LIZIZ(interfaceC1680500tpg).K3(), (C1693430uAX) awS199S1100000_25.l1, 0L, 0, 2, false, 1, null, null, interfaceC1680500tpg, 102236160, 0, 1714);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS199S1100000_25 awS199S1100000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1668330tW3.LJIIIIZZ(0, 2, interfaceC1680500tpg, awS199S1100000_25.s0, (Function0) awS199S1100000_25.l1, false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS199S1100000_25 awS199S1100000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1693430uAX c1693430uAX = C1670400tZO.LJ(interfaceC1680500tpg).LJIIJJI;
            C1685190txF.LIZ(awS199S1100000_25.s0, null, C1670400tZO.LIZIZ(interfaceC1680500tpg).K3(), c1693430uAX, 0L, 0, 2, false, 2, null, new AwS604S0100000_25((C259800zU) awS199S1100000_25.l1, (C259800zU<EnumC1888140zEa>) 632), interfaceC1680500tpg, 102236160, 0, 690);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS199S1100000_25 awS199S1100000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            EnumC043200Dm enumC043200Dm = EnumC043200Dm.CAMPAIGN;
            String strValueOf = String.valueOf(awS199S1100000_25.s0);
            String str = ((AMEPublishCampaignItem) awS199S1100000_25.l1).activityLargeBannerText;
            if (str == null) {
                str = "";
            }
            C1672170tcF.LIZ(new C1672190tcH(enumC043200Dm, strValueOf, null, null, str, 130, 2028), interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS199S1100000_25 awS199S1100000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            float f = 162;
            float f2 = 20;
            String str = ((AMEPublishCampaignItem) awS199S1100000_25.l1).activitySmallBannerText;
            if (str == null) {
                str = "";
            }
            C1672170tcF.LIZIZ(new C1672180tcG(awS199S1100000_25.s0, null, null, f, f, str, f2, 40, 8, 2438), interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS199S1100000_25(String str, String str2, C259800zU<C1692150u8T> c259800zU) {
        super(2);
        this.$t = c259800zU;
        this.s0 = str;
        this.l1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS199S1100000_25(String str, C1693430uAX c1693430uAX, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1693430uAX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS199S1100000_25(String str, String str2, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.s0 = str;
        this.l1 = str2;
    }
}
