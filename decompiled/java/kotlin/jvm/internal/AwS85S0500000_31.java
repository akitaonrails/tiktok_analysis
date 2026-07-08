package kotlin.jvm.internal;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C09AY;
import X.C0UIJ;
import X.C1143000fqk;
import X.C1161920gLG;
import X.C118300cf;
import X.C1345710l7h;
import X.C13IQ;
import X.C20361214lm;
import X.C2188811AlT;
import X.C452080Ho6;
import X.C452501pT;
import X.C485430J1x;
import X.C737910Sx3;
import X.C766270U4b;
import X.C827203La;
import X.InterfaceC20354714kj;
import X.InterfaceC207228167e;
import X.InterfaceC214902198i;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.interaction.playentity.LightningQaEntity;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes32.dex */
public class AwS85S0500000_31 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS85S0500000_31 awS85S0500000_31) {
        PlayEntityUtilKt.LJFF((LightningQaEntity) awS85S0500000_31.l0, (C20361214lm) awS85S0500000_31.l1, (InterfaceC20354714kj) awS85S0500000_31.l2, (LifecycleOwner) awS85S0500000_31.l3);
        C0UIJ c0uijCb = ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Cb();
        if (c0uijCb != null) {
            LightningQaEntity lightningQaEntity = (LightningQaEntity) awS85S0500000_31.l0;
            C20361214lm c20361214lm = (C20361214lm) awS85S0500000_31.l1;
            InterfaceC20354714kj interfaceC20354714kj = (InterfaceC20354714kj) awS85S0500000_31.l2;
            LifecycleOwner lifecycleOwner = (LifecycleOwner) awS85S0500000_31.l3;
            Context context = (Context) awS85S0500000_31.l4;
            PlayEntityUtilKt.LJII(lightningQaEntity, 1, c20361214lm, interfaceC20354714kj, true);
            c0uijCb.LJI(null, lifecycleOwner, lightningQaEntity.LLJ);
            c0uijCb.onClick(new View(context));
            c0uijCb.LIZ(lightningQaEntity.LLJ);
            PlayEntityUtilKt.LJ(lightningQaEntity, 1, c20361214lm, interfaceC20354714kj);
        } else {
            PlayEntityUtilKt.LJI((LightningQaEntity) awS85S0500000_31.l0, (C20361214lm) awS85S0500000_31.l1, (InterfaceC20354714kj) awS85S0500000_31.l2, null, "dialog null", 0L, 40);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS85S0500000_31 awS85S0500000_31) {
        Object obj;
        AssemVMLazy assemVMLazy;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory2;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory3;
        InterfaceC214902198i interfaceC214902198iLJIIIIZZ = SAFExtensionKt.LJIIIIZZ(((C03K6) awS85S0500000_31.l0).getContext());
        if (interfaceC214902198iLJIIIIZZ == null) {
            interfaceC214902198iLJIIIIZZ = SAFExtensionKt.LJIILLIIL(C827203La.LIZ(((C03K6) awS85S0500000_31.l0).getContext()));
        }
        if (C1345710l7h.LIZ(interfaceC214902198iLJIIIIZZ)) {
            obj = C485430J1x.LIZ;
        } else {
            obj = C01D1.LIZ;
        }
        C03K6 c03k6 = (C03K6) awS85S0500000_31.l0;
        C13IQ c13iq = (C13IQ) awS85S0500000_31.l1;
        Function0 function0 = (Function0) awS85S0500000_31.l2;
        Function1 function1 = (Function1) awS85S0500000_31.l3;
        Function0 awS575S0100000_31 = (Function0) awS85S0500000_31.l4;
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            AwS575S0100000_31 awS575S0100000_312 = new AwS575S0100000_31(c13iq, 255);
            AFwS221S0000000_31 aFwS221S0000000_31 = AFwS221S0000000_31.get$arr$(395);
            AwS575S0100000_31 awS575S0100000_313 = new AwS575S0100000_31(c03k6, 263);
            AwS575S0100000_31 awS575S0100000_314 = new AwS575S0100000_31(c03k6, 264);
            if (awS575S0100000_31 == null) {
                if ((c03k6 instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory3 = (HasDefaultViewModelProviderFactory) c03k6) != null) {
                    awS575S0100000_31 = new AwS575S0100000_31(hasDefaultViewModelProviderFactory3, 265);
                } else {
                    awS575S0100000_31 = C1143000fqk.LIZ;
                }
            }
            assemVMLazy = new AssemVMLazy(awS575S0100000_312, function0, aFwS221S0000000_31, awS575S0100000_313, awS575S0100000_314, awS575S0100000_31, function1, new AwS575S0100000_31(c03k6, 266), null, new AwS575S0100000_31(c03k6, 267));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS575S0100000_31 awS575S0100000_315 = new AwS575S0100000_31(c03k6, 268);
            if (awS575S0100000_31 == null) {
                if ((c03k6 instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory2 = (HasDefaultViewModelProviderFactory) c03k6) != null) {
                    awS575S0100000_31 = new AwS575S0100000_31(hasDefaultViewModelProviderFactory2, 269);
                } else {
                    awS575S0100000_31 = C1143000fqk.LIZ;
                }
            }
            AwS575S0100000_31 awS575S0100000_316 = new AwS575S0100000_31(c13iq, 270);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS432S0200000_31((InterfaceC451590HnJ) obj, awS575S0100000_315, 37));
            AwS575S0100000_31 awS575S0100000_317 = new AwS575S0100000_31(c01gwLIZIZ, 246);
            AwS575S0100000_31 awS575S0100000_318 = new AwS575S0100000_31(c01gwLIZIZ, 247);
            AwS575S0100000_31 awS575S0100000_319 = new AwS575S0100000_31(c01gwLIZIZ, 248);
            AwS575S0100000_31 awS575S0100000_3110 = new AwS575S0100000_31(c01gwLIZIZ, 249);
            AwS575S0100000_31 awS575S0100000_3111 = new AwS575S0100000_31(c01gwLIZIZ, 250);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS575S0100000_316, function0, new C452080Ho6(), awS575S0100000_317, awS575S0100000_318, awS575S0100000_31, function1, awS575S0100000_319, awS575S0100000_3110, awS575S0100000_3111);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            AwS575S0100000_31 awS575S0100000_3112 = new AwS575S0100000_31(c13iq, 251);
            AFwS221S0000000_31 aFwS221S0000000_312 = AFwS221S0000000_31.get$arr$(393);
            AwS575S0100000_31 awS575S0100000_3113 = new AwS575S0100000_31(c03k6, 252);
            AwS575S0100000_31 awS575S0100000_3114 = new AwS575S0100000_31(c03k6, 253);
            if (awS575S0100000_31 == null) {
                if ((c03k6 instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) c03k6) != null) {
                    awS575S0100000_31 = new AwS575S0100000_31(hasDefaultViewModelProviderFactory, 254);
                } else {
                    awS575S0100000_31 = C1143000fqk.LIZ;
                }
            }
            assemVMLazy = new AssemVMLazy(awS575S0100000_3112, function0, aFwS221S0000000_312, awS575S0100000_3113, awS575S0100000_3114, awS575S0100000_31, function1, new AwS575S0100000_31(c03k6, 256), null, new AwS575S0100000_31(c03k6, 257));
        } else if (Intrinsics.LJFF(obj, C03IJ.LIZ)) {
            AwS575S0100000_31 awS575S0100000_3115 = new AwS575S0100000_31(c13iq, 258);
            AFwS221S0000000_31 aFwS221S0000000_313 = AFwS221S0000000_31.get$arr$(394);
            AwS575S0100000_31 awS575S0100000_3116 = new AwS575S0100000_31(c03k6, 259);
            AwS575S0100000_31 awS575S0100000_3117 = new AwS575S0100000_31(c03k6, 260);
            if (awS575S0100000_31 == null) {
                awS575S0100000_31 = new AwS575S0100000_31(c03k6, 261);
            }
            assemVMLazy = new AssemVMLazy(awS575S0100000_3115, function0, aFwS221S0000000_313, awS575S0100000_3116, awS575S0100000_3117, awS575S0100000_31, function1, null, null, new AwS575S0100000_31(c03k6, 262));
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Don't support this VMScope: ");
            sbLIZ.append(obj);
            sbLIZ.append(" there");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return assemVMLazy.getValue();
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS85S0500000_31 awS85S0500000_31) {
        Object obj;
        AssemVMLazy assemVMLazy;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory2;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory3;
        InterfaceC214902198i interfaceC214902198iLJIIIIZZ = SAFExtensionKt.LJIIIIZZ(((C03K6) awS85S0500000_31.l0).getContext());
        if (interfaceC214902198iLJIIIIZZ == null) {
            interfaceC214902198iLJIIIIZZ = SAFExtensionKt.LJIILLIIL(C827203La.LIZ(((C03K6) awS85S0500000_31.l0).getContext()));
        }
        if (C1345710l7h.LIZ(interfaceC214902198iLJIIIIZZ)) {
            obj = C485430J1x.LIZ;
        } else {
            obj = C01D1.LIZ;
        }
        C03K6 c03k6 = (C03K6) awS85S0500000_31.l0;
        C13IQ c13iq = (C13IQ) awS85S0500000_31.l1;
        Function0 function0 = (Function0) awS85S0500000_31.l2;
        Function1 function1 = (Function1) awS85S0500000_31.l3;
        Function0 awS575S0100000_31 = (Function0) awS85S0500000_31.l4;
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            AwS575S0100000_31 awS575S0100000_312 = new AwS575S0100000_31(c13iq, 280);
            AFwS221S0000000_31 aFwS221S0000000_31 = AFwS221S0000000_31.get$arr$(395);
            AwS575S0100000_31 awS575S0100000_313 = new AwS575S0100000_31(c03k6, 288);
            AwS575S0100000_31 awS575S0100000_314 = new AwS575S0100000_31(c03k6, 289);
            if (awS575S0100000_31 == null) {
                if ((c03k6 instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory3 = (HasDefaultViewModelProviderFactory) c03k6) != null) {
                    awS575S0100000_31 = new AwS575S0100000_31(hasDefaultViewModelProviderFactory3, 290);
                } else {
                    awS575S0100000_31 = C1143000fqk.LIZ;
                }
            }
            assemVMLazy = new AssemVMLazy(awS575S0100000_312, function0, aFwS221S0000000_31, awS575S0100000_313, awS575S0100000_314, awS575S0100000_31, function1, new AwS575S0100000_31(c03k6, 291), null, new AwS575S0100000_31(c03k6, 292));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS575S0100000_31 awS575S0100000_315 = new AwS575S0100000_31(c03k6, 293);
            if (awS575S0100000_31 == null) {
                if ((c03k6 instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory2 = (HasDefaultViewModelProviderFactory) c03k6) != null) {
                    awS575S0100000_31 = new AwS575S0100000_31(hasDefaultViewModelProviderFactory2, 294);
                } else {
                    awS575S0100000_31 = C1143000fqk.LIZ;
                }
            }
            AwS575S0100000_31 awS575S0100000_316 = new AwS575S0100000_31(c13iq, 295);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS432S0200000_31((InterfaceC451590HnJ) obj, awS575S0100000_315, 38));
            AwS575S0100000_31 awS575S0100000_317 = new AwS575S0100000_31(c01gwLIZIZ, 271);
            AwS575S0100000_31 awS575S0100000_318 = new AwS575S0100000_31(c01gwLIZIZ, 272);
            AwS575S0100000_31 awS575S0100000_319 = new AwS575S0100000_31(c01gwLIZIZ, 273);
            AwS575S0100000_31 awS575S0100000_3110 = new AwS575S0100000_31(c01gwLIZIZ, 274);
            AwS575S0100000_31 awS575S0100000_3111 = new AwS575S0100000_31(c01gwLIZIZ, 275);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS575S0100000_316, function0, new C452080Ho6(), awS575S0100000_317, awS575S0100000_318, awS575S0100000_31, function1, awS575S0100000_319, awS575S0100000_3110, awS575S0100000_3111);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            AwS575S0100000_31 awS575S0100000_3112 = new AwS575S0100000_31(c13iq, 276);
            AFwS221S0000000_31 aFwS221S0000000_312 = AFwS221S0000000_31.get$arr$(393);
            AwS575S0100000_31 awS575S0100000_3113 = new AwS575S0100000_31(c03k6, 277);
            AwS575S0100000_31 awS575S0100000_3114 = new AwS575S0100000_31(c03k6, 278);
            if (awS575S0100000_31 == null) {
                if ((c03k6 instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) c03k6) != null) {
                    awS575S0100000_31 = new AwS575S0100000_31(hasDefaultViewModelProviderFactory, 279);
                } else {
                    awS575S0100000_31 = C1143000fqk.LIZ;
                }
            }
            assemVMLazy = new AssemVMLazy(awS575S0100000_3112, function0, aFwS221S0000000_312, awS575S0100000_3113, awS575S0100000_3114, awS575S0100000_31, function1, new AwS575S0100000_31(c03k6, 281), null, new AwS575S0100000_31(c03k6, 282));
        } else if (Intrinsics.LJFF(obj, C03IJ.LIZ)) {
            AwS575S0100000_31 awS575S0100000_3115 = new AwS575S0100000_31(c13iq, 283);
            AFwS221S0000000_31 aFwS221S0000000_313 = AFwS221S0000000_31.get$arr$(394);
            AwS575S0100000_31 awS575S0100000_3116 = new AwS575S0100000_31(c03k6, 284);
            AwS575S0100000_31 awS575S0100000_3117 = new AwS575S0100000_31(c03k6, 285);
            if (awS575S0100000_31 == null) {
                awS575S0100000_31 = new AwS575S0100000_31(c03k6, 286);
            }
            assemVMLazy = new AssemVMLazy(awS575S0100000_3115, function0, aFwS221S0000000_313, awS575S0100000_3116, awS575S0100000_3117, awS575S0100000_31, function1, null, null, new AwS575S0100000_31(c03k6, 287));
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Don't support this VMScope: ");
            sbLIZ.append(obj);
            sbLIZ.append(" there");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return assemVMLazy.getValue();
    }

    public static final Object invoke$3(AwS85S0500000_31 awS85S0500000_31) {
        Resources resources;
        int i;
        String quantityString;
        if (((C118300cf) awS85S0500000_31.l0).element != 0 && (resources = ((Context) awS85S0500000_31.l1).getResources()) != null && (quantityString = resources.getQuantityString(2131755517, (i = ((C118300cf) awS85S0500000_31.l0).element), Integer.valueOf(i))) != null) {
            C766270U4b.LJIIJJI(quantityString);
        }
        if (Intrinsics.LJFF(((InterfaceC207228167e) awS85S0500000_31.l2).getEmotesShowStyle(), 1)) {
            if (((C118300cf) awS85S0500000_31.l3).element > 0) {
                C766270U4b.LIZLLL(2131841514);
            }
        } else if (((List) awS85S0500000_31.l4).size() > ((C118300cf) awS85S0500000_31.l0).element) {
            C766270U4b.LIZLLL(2131841514);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS85S0500000_31(C118300cf c118300cf, C118300cf c118300cf2, Context context, InterfaceC207228167e interfaceC207228167e, C118300cf c118300cf3, List<LiveSubMediaModel> list) {
        super(0);
        this.$t = list;
        this.l0 = c118300cf;
        this.l1 = c118300cf2;
        this.l2 = context;
        this.l3 = interfaceC207228167e;
        this.l4 = c118300cf3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS85S0500000_31(C03K6 c03k6, C13IQ c13iq, Function0 function0, Function1 function1, Function0 function02, int i) {
        super(0);
        this.$t = i;
        this.l0 = c03k6;
        this.l1 = c13iq;
        this.l2 = function0;
        this.l3 = function1;
        this.l4 = function02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS85S0500000_31(LightningQaEntity lightningQaEntity, C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = lightningQaEntity;
        this.l1 = c20361214lm;
        this.l2 = interfaceC20354714kj;
        this.l3 = lifecycleOwner;
        this.l4 = context;
    }
}
