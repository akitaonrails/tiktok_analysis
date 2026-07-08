package kotlin.jvm.internal;

import X.C020W;
import X.C05VF;
import X.C09AY;
import X.C0LXV;
import X.C0MAE;
import X.C1653070t7R;
import X.C1653120t7W;
import X.C1655220tAu;
import X.C1672690td5;
import X.C1682250tsV;
import X.C1682260tsW;
import X.C1696490uFT;
import X.C19719212De;
import X.C2217381BqS;
import X.InterfaceC1692460u8y;
import com.ss.android.ugc.aweme.services.effect.EffectService;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.gamora.recorder.bottom.f0;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS139S1100000_25 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS139S1100000_25 awS139S1100000_25, Object obj) {
        InterfaceC1692460u8y interfaceC1692460u8y = (InterfaceC1692460u8y) obj;
        C1696490uFT.LJ(interfaceC1692460u8y, awS139S1100000_25.s0);
        C1696490uFT.LIZLLL(interfaceC1692460u8y, null, new AwS547S0100000_3((Function0) awS139S1100000_25.l1, (Function0<Unit>) 8));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS139S1100000_25 awS139S1100000_25, Object obj) {
        InterfaceC1692460u8y interfaceC1692460u8y = (InterfaceC1692460u8y) obj;
        C1696490uFT.LJ(interfaceC1692460u8y, awS139S1100000_25.s0);
        C1696490uFT.LIZLLL(interfaceC1692460u8y, null, new AwS547S0100000_3((Function0) awS139S1100000_25.l1, (Function0<Unit>) 9));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS139S1100000_25 awS139S1100000_25, Object obj) {
        EffectPlatformBuilder effectPlatformBuilder = (EffectPlatformBuilder) obj;
        String str = awS139S1100000_25.s0;
        if (str != null) {
            effectPlatformBuilder.setRegion(str);
        }
        effectPlatformBuilder.setCacheDir(((EffectService) awS139S1100000_25.l1).MV_RES_CACHE_FILE);
        ((EffectService) awS139S1100000_25.l1).setMvEffectPlatformCacheSize(effectPlatformBuilder);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS139S1100000_25 awS139S1100000_25, Object obj) {
        ((C1655220tAu) awS139S1100000_25.l1).T2(awS139S1100000_25.s0, (String) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS139S1100000_25 awS139S1100000_25, Object obj) {
        ((f0) awS139S1100000_25.l1).handleLeaveSharedARSession(awS139S1100000_25.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS139S1100000_25 awS139S1100000_25, Object obj) {
        ((C1653120t7W) awS139S1100000_25.l1).handleLeaveSharedARSession(awS139S1100000_25.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS139S1100000_25 awS139S1100000_25, Object obj) {
        ((C1653070t7R) awS139S1100000_25.l1).handleLeaveSharedARSession(awS139S1100000_25.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS139S1100000_25 awS139S1100000_25, Object obj) {
        ((l0) awS139S1100000_25.l1).t5().LJJZ(awS139S1100000_25.s0, (String) obj);
        l0 l0Var = (l0) awS139S1100000_25.l1;
        l0Var.LLLLLLL = 1;
        l0Var.getShortVideoContext().creativeModel.aigcMetadataModel.generationTriggerType = C0LXV.UPLOAD_PHOTO.getType();
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS139S1100000_25 awS139S1100000_25, Object obj) {
        C020W c020w;
        C0MAE c0mae = (C0MAE) obj;
        List list = (List) ((C05VF) awS139S1100000_25.l1).LJIIIIZZ.getValue();
        C1682260tsW c1682260tsW = new C2217381BqS() { // from class: X.0tsW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((InterfaceC1672680td4) obj2).getUuid();
            }
        };
        C1682250tsV c1682250tsV = new C2217381BqS() { // from class: X.0tsV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((InterfaceC1672680td4) obj2).getMessageType();
            }
        };
        String str = awS139S1100000_25.s0;
        C05VF c05vf = (C05VF) awS139S1100000_25.l1;
        int size = list.size();
        if (c1682260tsW != null) {
            c020w = new C020W(c1682260tsW, list, 27);
        } else {
            c020w = null;
        }
        c0mae.LIZJ(size, c020w, new C020W(c1682250tsV, list, 28), new C19719212De(-632812321, new C1672690td5(list, str, c05vf), true));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS139S1100000_25(C05VF c05vf, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c05vf;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS139S1100000_25(C1653070t7R c1653070t7R, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1653070t7R;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS139S1100000_25(C1653120t7W c1653120t7W, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1653120t7W;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS139S1100000_25(C1655220tAu c1655220tAu, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1655220tAu;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS139S1100000_25(f0 f0Var, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = f0Var;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS139S1100000_25(l0 l0Var, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = l0Var;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS139S1100000_25(String str, EffectService effectService, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = effectService;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS139S1100000_25(String str, String str2, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.s0 = str;
        this.l1 = str2;
    }
}
