package kotlin.jvm.internal;

import X.C05P0;
import X.C09AY;
import X.C118300cf;
import X.C1623880sMM;
import X.C1677280tkU;
import X.C1677480tko;
import X.C2188811AlT;
import X.InterfaceC1624480sNK;
import X.InterfaceC1624990sO9;
import X.InterfaceC1625060sOG;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS93S0500000_25 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS93S0500000_25 r74, java.lang.Object r75, java.lang.Object r76) {
        /*
            Method dump skipped, instruction units count: 1318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS93S0500000_25.invoke$0(kotlin.jvm.internal.AwS93S0500000_25, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS93S0500000_25 awS93S0500000_25, Object obj, Object obj2) {
        String effect_id;
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        Effect effectLLILIL = ((InterfaceC1624480sNK) awS93S0500000_25.l0).LLILIL();
        if (effectLLILIL != null) {
            effect_id = effectLLILIL.getEffect_id();
        } else {
            effect_id = null;
        }
        C1623880sMM c1623880sMM = C1623880sMM.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IM VE encodeSize: ");
        sbLIZ.append(((C118300cf) awS93S0500000_25.l1).element);
        sbLIZ.append('x');
        sbLIZ.append(((C118300cf) awS93S0500000_25.l2).element);
        sbLIZ.append(" -> ");
        sbLIZ.append(iIntValue);
        sbLIZ.append('x');
        sbLIZ.append(iIntValue2);
        sbLIZ.append(", currentEffect=");
        sbLIZ.append(effect_id);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1623880sMM.getClass();
        C1623880sMM.LIZJ(strLIZIZ);
        ((C118300cf) awS93S0500000_25.l1).element = iIntValue;
        ((C118300cf) awS93S0500000_25.l2).element = iIntValue2;
        ((InterfaceC1624990sO9) awS93S0500000_25.l3).LIZ(iIntValue, iIntValue2);
        ((InterfaceC1625060sOG) awS93S0500000_25.l4).Q4(iIntValue, iIntValue2);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x03af A[PHI: r5
      0x03af: PHI (r5v3 float) = (r5v2 float), (r5v24 float) binds: [B:111:0x03ad, B:23:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS93S0500000_25 r18, java.lang.Object r19, java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 967
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS93S0500000_25.invoke$2(kotlin.jvm.internal.AwS93S0500000_25, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS93S0500000_25(InterfaceC1624480sNK interfaceC1624480sNK, C118300cf c118300cf, C118300cf c118300cf2, InterfaceC1624990sO9 interfaceC1624990sO9, InterfaceC1625060sOG interfaceC1625060sOG, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC1624480sNK;
        this.l1 = c118300cf;
        this.l2 = c118300cf2;
        this.l3 = interfaceC1624990sO9;
        this.l4 = interfaceC1625060sOG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS93S0500000_25(SocMediaResource socMediaResource, SocMediaResource socMediaResource2, C1677480tko<Float, C1677280tkU> c1677480tko, SocialMediaPickerViewModel socialMediaPickerViewModel, Function0<Unit> function0, C05P0<Boolean> c05p0) {
        super(2);
        this.$t = c05p0;
        this.l0 = socMediaResource;
        this.l1 = socMediaResource2;
        this.l2 = c1677480tko;
        this.l3 = socialMediaPickerViewModel;
        this.l4 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS93S0500000_25(Function0 function0, Function0<Unit> function02, Function0<Unit> function03, Integer num, Function0<Unit> function04, Function0<Unit> function05) {
        super(2);
        this.$t = function05;
        this.l0 = function0;
        this.l1 = function02;
        this.l2 = function03;
        this.l3 = num;
        this.l4 = function04;
    }
}
