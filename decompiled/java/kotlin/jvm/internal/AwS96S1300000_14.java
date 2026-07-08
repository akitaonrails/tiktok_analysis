package kotlin.jvm.internal;

import X.C09AY;
import X.C0IB7;
import X.C0PEM;
import X.C0ZD9;
import X.C0ZDA;
import X.C13LP;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C896090ZDj;
import X.C896120ZDm;
import X.C896130ZDn;
import X.C898310ZLx;
import X.C898320ZLy;
import X.EnumC896240ZDy;
import android.view.View;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public class AwS96S1300000_14 extends C09AY implements Function2 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS96S1300000_14 awS96S1300000_14, Object obj, Object obj2) {
        C0IB7 c0ib7;
        C0IB7 c0ib72;
        LightInteractionCommonResource lightInteractionCommonResourceLJJIIZI;
        C0ZD9 c0zd9;
        C0ZD9 c0zd92;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("needToast: ");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(", enterMethod: ");
        sbLIZ.append((String) obj2);
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("quotedInfoType: ");
        C896130ZDn c896130ZDn = ((C896120ZDm) awS96S1300000_14.l1).LIZIZ;
        if (c896130ZDn != null && (c0zd92 = c896130ZDn.LJ) != null) {
            c0ib7 = c0zd92.LIZLLL;
        } else {
            c0ib7 = null;
        }
        sbLIZ2.append(c0ib7);
        C2188811AlT.LIZIZ(sbLIZ2);
        C896120ZDm c896120ZDm = (C896120ZDm) awS96S1300000_14.l1;
        Set<C0IB7> set = c896120ZDm.LJ;
        C896130ZDn c896130ZDn2 = c896120ZDm.LIZIZ;
        if (c896130ZDn2 != null && (c0zd9 = c896130ZDn2.LJ) != null) {
            c0ib72 = c0zd9.LIZLLL;
        } else {
            c0ib72 = null;
        }
        if (C13LP.LJJJJ(c0ib72, set)) {
            C896120ZDm c896120ZDm2 = (C896120ZDm) awS96S1300000_14.l1;
            C896130ZDn c896130ZDn3 = (C896130ZDn) awS96S1300000_14.l2;
            C0ZDA c0zda = (C0ZDA) awS96S1300000_14.l3;
            c896120ZDm2.getClass();
            String strLJIIIIZZ = C896120ZDm.LJIIIIZZ(c896130ZDn3.LJ.LIZLLL);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("triggerLightInteraction: ");
            sbLIZ3.append(strLJIIIIZZ);
            C2188811AlT.LIZIZ(sbLIZ3);
            if (strLJIIIIZZ != null) {
                ILightInteractionPlatformService iLightInteractionPlatformServiceLJIIIZ = C896120ZDm.LJIIIZ();
                if (iLightInteractionPlatformServiceLJIIIZ != null) {
                    lightInteractionCommonResourceLJJIIZI = iLightInteractionPlatformServiceLJIIIZ.LJJIIZI(strLJIIIIZZ);
                } else {
                    lightInteractionCommonResourceLJJIIZI = null;
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("commonResource: ");
                sbLIZ4.append(lightInteractionCommonResourceLJJIIZI);
                C2188811AlT.LIZIZ(sbLIZ4);
                if (lightInteractionCommonResourceLJJIIZI != null) {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C896090ZDj(c0zda, c896130ZDn3, c896120ZDm2, strLJIIIIZZ, null), 3);
                    C896120ZDm.LJIIJ(c896120ZDm2.LIZ, c896130ZDn3, EnumC896240ZDy.CLICK);
                    ILightInteractionPlatformService iLightInteractionPlatformServiceLJIIIZ2 = C896120ZDm.LJIIIZ();
                    if (iLightInteractionPlatformServiceLJIIIZ2 != null) {
                        iLightInteractionPlatformServiceLJIIIZ2.LJIILLIIL(c896130ZDn3.LIZ);
                    }
                } else {
                    c896120ZDm2.LJIIJJI(c896130ZDn3, c896130ZDn3.LIZLLL.getNickname(), c0zda);
                }
            } else {
                c896120ZDm2.LJIIJJI(c896130ZDn3, c896130ZDn3.LIZLLL.getNickname(), c0zda);
            }
        } else {
            ((C896120ZDm) awS96S1300000_14.l1).LJIIJJI((C896130ZDn) awS96S1300000_14.l2, awS96S1300000_14.s0, (C0ZDA) awS96S1300000_14.l3);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS96S1300000_14 r32, java.lang.Object r33, java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS96S1300000_14.invoke$1(kotlin.jvm.internal.AwS96S1300000_14, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS96S1300000_14(C896120ZDm c896120ZDm, C896130ZDn c896130ZDn, C0ZDA c0zda, String str, int i) {
        super(2);
        this.$t = i;
        this.l1 = c896120ZDm;
        this.l2 = c896130ZDn;
        this.l3 = c0zda;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS96S1300000_14(C898310ZLx c898310ZLx, String str, C898320ZLy c898320ZLy, View view, int i) {
        super(2);
        this.$t = i;
        this.l1 = c898310ZLx;
        this.s0 = str;
        this.l2 = c898320ZLy;
        this.l3 = view;
    }
}
