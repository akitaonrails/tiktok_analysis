package kotlin.jvm.internal;

import X.AbstractC20356314kz;
import X.C09AY;
import X.C1143920fsE;
import X.C1143950fsH;
import X.C1322110kVd;
import X.C15ZL;
import X.C15ZN;
import X.C15ZV;
import X.C19EG;
import X.C20362414ly;
import X.C20377814oS;
import X.C204722158u;
import X.C20540515Zb;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C5183020f;
import X.C723850SaN;
import X.EnumC204719158r;
import X.InterfaceC20540815Ze;
import X.InterfaceC20541015Zg;
import android.graphics.drawable.Animatable;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.component.effectcard.MatchHammerAssem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.business.sticker.assem.CommonHorizontalContainerAssem;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public class AwS150S0201000_31 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS150S0201000_31 awS150S0201000_31) {
        MatchHammerAssem matchHammerAssem = (MatchHammerAssem) awS150S0201000_31.l0;
        EnumC204719158r enumC204719158r = (EnumC204719158r) awS150S0201000_31.l1;
        int i = awS150S0201000_31.i2;
        int size = matchHammerAssem.LLLILZJ.size();
        int iOrdinal = enumC204719158r.ordinal();
        if (iOrdinal >= 0 && iOrdinal < size) {
            C1143920fsE c1143920fsE = new C1143920fsE();
            c1143920fsE.LIZIZ = "tiktok_live_interaction_demand_8";
            c1143920fsE.LIZJ = (String) ListProtector.get(matchHammerAssem.LLLILZJ, enumC204719158r.ordinal());
            c1143920fsE.LJFF = true;
            c1143920fsE.LJ = new C1143950fsH() { // from class: X.1592
                @Override // X.C1143950fsH
                public final void LJ(Animatable animatable) {
                }

                @Override // X.C1143950fsH
                public final void LJFF(Animatable animatable) {
                }
            };
            C1322110kVd c1322110kVd = new C1322110kVd(matchHammerAssem.getContext());
            C204722158u c204722158u = new C204722158u(c1322110kVd, c1143920fsE, i);
            FrameLayout frameLayout = matchHammerAssem.LLJLIL;
            if (frameLayout != null) {
                frameLayout.addView(c1322110kVd, i, i);
            }
            c1143920fsE.LIZ = c1322110kVd;
            c1143920fsE.LIZLLL();
            return c204722158u;
        }
        return null;
    }

    public static final Object invoke$1(AwS150S0201000_31 awS150S0201000_31) {
        C19EG c19eg = (C19EG) awS150S0201000_31.l0;
        C723850SaN.LIZIZ(c19eg, new AwS112S0201000_31(c19eg, awS150S0201000_31.i2, (CommonHorizontalContainerAssem) awS150S0201000_31.l1, 13));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS150S0201000_31 r16) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS150S0201000_31.invoke$2(kotlin.jvm.internal.AwS150S0201000_31):java.lang.Object");
    }

    public static final Object invoke$3(AwS150S0201000_31 awS150S0201000_31) {
        if (Intrinsics.LJFF(((C20362414ly) awS150S0201000_31.l0).LLILZLL, (AbstractC20356314kz) awS150S0201000_31.l1)) {
            C20362414ly c20362414ly = (C20362414ly) awS150S0201000_31.l0;
            c20362414ly.N5(awS150S0201000_31.i2, c20362414ly.LLIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS150S0201000_31 awS150S0201000_31) {
        AwS432S0200000_31 awS432S0200000_31 = ((C15ZN) awS150S0201000_31.l0).LIZJ;
        if (awS432S0200000_31 != null) {
            awS432S0200000_31.invoke();
        }
        C15ZL c15zl = ((C15ZN) awS150S0201000_31.l0).LJIIJJI;
        if (c15zl != null) {
            c15zl.LIZLLL = true;
        }
        InterfaceC20541015Zg interfaceC20541015ZgLIZIZ = C15ZV.LIZIZ();
        if (interfaceC20541015ZgLIZIZ != null) {
            interfaceC20541015ZgLIZIZ.LIZ("pnsscreensdk_stb_popup_show", new JSONObject().put("trigger_key", ((C15ZN) awS150S0201000_31.l0).LJIIJJI.LIZ).put("strategy_key", ((C15ZN) awS150S0201000_31.l0).LJIIIIZZ).put("timerbox_key", ((C15ZN) awS150S0201000_31.l0).LJIIIZ).put("current_used_time", ((C20540515Zb) awS150S0201000_31.l1).LIZJ() - ((C15ZN) awS150S0201000_31.l0).LJI).put("current_threshold", ((C15ZN) awS150S0201000_31.l0).LJIIL.invoke().intValue()), null);
        }
        InterfaceC20540815Ze interfaceC20540815ZeLIZ = C15ZV.LIZ();
        if (interfaceC20540815ZeLIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(((C15ZN) awS150S0201000_31.l0).LJIIIIZZ);
            sbLIZ.append('_');
            sbLIZ.append(awS150S0201000_31.i2);
            interfaceC20540815ZeLIZ.LIZ("pnsscreensdk_stb_popup_show", C2097608Jq.LJIIIIZZ(new Pair("trigger_key", ((C15ZN) awS150S0201000_31.l0).LJIIJJI.LIZ), new Pair("strategy_key", C2188811AlT.LIZIZ(sbLIZ)), new Pair("timerbox_key", ((C15ZN) awS150S0201000_31.l0).LJIIIZ), new Pair("current_threshold", String.valueOf(((C15ZN) awS150S0201000_31.l0).LJIIL.invoke().intValue())), new Pair("current_used_time", String.valueOf(((C20540515Zb) awS150S0201000_31.l1).LIZJ() - ((C15ZN) awS150S0201000_31.l0).LJI))));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS150S0201000_31(C20362414ly c20362414ly, AbstractC20356314kz abstractC20356314kz, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c20362414ly;
        this.l1 = abstractC20356314kz;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS150S0201000_31(C20377814oS c20377814oS, C5183020f c5183020f, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c20377814oS;
        this.l1 = c5183020f;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS150S0201000_31(C15ZN c15zn, C20540515Zb c20540515Zb, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c15zn;
        this.l1 = c20540515Zb;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS150S0201000_31(C19EG c19eg, int i, CommonHorizontalContainerAssem commonHorizontalContainerAssem, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c19eg;
        this.i2 = i;
        this.l1 = commonHorizontalContainerAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS150S0201000_31(MatchHammerAssem matchHammerAssem, EnumC204719158r enumC204719158r, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = matchHammerAssem;
        this.l1 = enumC204719158r;
        this.i2 = i;
    }
}
