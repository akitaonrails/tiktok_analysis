package kotlin.jvm.internal;

import X.C09AY;
import X.C13BV;
import X.C20441214yg;
import X.C2188811AlT;
import X.C489801vU;
import X.C490701vd;
import X.C915910ZwT;
import X.C950750aqf;
import X.InterfaceC954910axN;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import tikcast.linkmic.common.LayoutState;

/* JADX INFO: loaded from: classes16.dex */
public class AwS66S1000000_15 extends C09AY implements Function1 {
    public final int $t;
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS66S1000000_15(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS66S1000000_15 awS66S1000000_15, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C915910ZwT.LIZIZ(String.valueOf(awS66S1000000_15.s0), true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS66S1000000_15 awS66S1000000_15, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" from LinkState wallpaper downloadImage , start download image: ");
        sbLIZ.append(awS66S1000000_15.s0);
        C20441214yg.LJIIIZ("anchor_shared_bg_viewmodel", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS66S1000000_15 awS66S1000000_15, Object obj) {
        LayoutState layoutState = new LayoutState();
        layoutState.layoutId = awS66S1000000_15.s0;
        return C490701vd.LIZ((C490701vd) obj, 0L, new C489801vU(layoutState, C13BV.INSTANCE), null, null, null, null, 61);
    }

    public static final Object invoke$3(AwS66S1000000_15 awS66S1000000_15, Object obj) {
        InterfaceC954910axN interfaceC954910axN = (InterfaceC954910axN) obj;
        interfaceC954910axN.LJIILIIL(null, "failed");
        interfaceC954910axN.LJIILIIL(awS66S1000000_15.s0, "linkMicId");
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS66S1000000_15 awS66S1000000_15, Object obj) {
        C950750aqf c950750aqf;
        LiveEffect liveEffect;
        String resourceId = null;
        if ((obj instanceof C950750aqf) && (c950750aqf = (C950750aqf) obj) != null && (liveEffect = c950750aqf.LIZ) != null) {
            resourceId = liveEffect.getResourceId();
        }
        return Boolean.valueOf(Intrinsics.LJFF(resourceId, awS66S1000000_15.s0));
    }

    public static final Object invoke$5(AwS66S1000000_15 awS66S1000000_15, Object obj) {
        ((InterfaceC954910axN) obj).LJIILIIL(awS66S1000000_15.s0, "eventName");
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS66S1000000_15 awS66S1000000_15, Object obj) {
        ((InterfaceC954910axN) obj).LJIILIIL(awS66S1000000_15.s0, "popup_url");
        return Unit.LIZ;
    }
}
