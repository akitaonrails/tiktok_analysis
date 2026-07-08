package kotlin.jvm.internal;

import X.AbstractC1139430fkz;
import X.C09AY;
import X.C0HZQ;
import X.C1084930eL5;
import X.C1124560fN0;
import X.C1128760fTm;
import X.C1130510fWb;
import X.C1135810ff9;
import X.C1135930ffL;
import X.C1136560fgM;
import X.C1137480fhq;
import X.C1143200fr4;
import X.C1143240fr8;
import X.C118300cf;
import X.C1397620mTQ;
import X.C158B;
import X.C784440Upu;
import X.InterfaceC1541990qEH;
import com.bytedance.android.livesdk.chatroom.viewmodule.MiddleTouchWidget;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.keva.Keva;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public class AwS37S0310000_17 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS37S0310000_17 awS37S0310000_17, Object obj) {
        if (awS37S0310000_17.z3 && ((C0HZQ) awS37S0310000_17.l0).isChecked()) {
            Keva keva = C1124560fN0.LIZ;
            C1124560fN0.LIZ.storeLong(C1124560fN0.LIZLLL(), C158B.LIZJ());
        }
        C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
        C1143240fr8 c1143240fr8 = (C1143240fr8) awS37S0310000_17.l1;
        c784440UpuLIZ.LIZIZ(new C1130510fWb(c1143240fr8.LIZ, c1143240fr8.LIZJ));
        C1128760fTm c1128760fTm = C1128760fTm.LJIIJ;
        C1143240fr8 c1143240fr82 = (C1143240fr8) awS37S0310000_17.l1;
        long j = c1143240fr82.LIZ;
        c1128760fTm.LJJIII(c1143240fr82.LIZJ, ((C1143200fr4) awS37S0310000_17.l2).LL, j, "first_time", "send", false);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS37S0310000_17 awS37S0310000_17, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131855988, new AwS37S0310000_17(awS37S0310000_17.z3, (C0HZQ) awS37S0310000_17.l0, (C1143240fr8) awS37S0310000_17.l1, (C1143200fr4) awS37S0310000_17.l2, 0));
        c1397620mTQ.LJII(R.string.f1_, new AwS383S0200000_17((C1143240fr8) awS37S0310000_17.l1, (C1143200fr4) awS37S0310000_17.l2, 13));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS37S0310000_17 awS37S0310000_17, Object obj) {
        LiveEffect.LynxGuide lynxGuide;
        String schema;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (!awS37S0310000_17.z3 || !zBooleanValue) {
            ((C1136560fgM) awS37S0310000_17.l0).LIZJ().LJ(true, zBooleanValue, awS37S0310000_17.z3);
        }
        AbstractC1139430fkz abstractC1139430fkz = (AbstractC1139430fkz) awS37S0310000_17.l1;
        C1136560fgM c1136560fgM = (C1136560fgM) awS37S0310000_17.l0;
        AssetsModel assetsModel = (AssetsModel) awS37S0310000_17.l2;
        abstractC1139430fkz.getClass();
        LiveEffect.StickerSDKExtra stickerSDKExtra = c1136560fgM.LJJII;
        if (stickerSDKExtra != null && (lynxGuide = stickerSDKExtra.lynxGuide) != null && (schema = lynxGuide.getSchema()) != null && schema.length() != 0 && !C1084930eL5.LIZ(c1136560fgM)) {
            C1137480fhq c1137480fhq = C1137480fhq.LIZ;
            AwS295S0300000_17 awS295S0300000_17 = new AwS295S0300000_17(abstractC1139430fkz, c1136560fgM, assetsModel, 1);
            c1137480fhq.getClass();
            C1137480fhq.LIZIZ(schema, assetsModel, null, null, c1136560fgM, awS295S0300000_17);
        } else {
            abstractC1139430fkz.LJIIIZ(c1136560fgM, assetsModel);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS37S0310000_17 r9, java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS37S0310000_17.invoke$3(kotlin.jvm.internal.AwS37S0310000_17, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$4(AwS37S0310000_17 awS37S0310000_17, Object obj) {
        int i;
        if (awS37S0310000_17.z3) {
            C1135930ffL c1135930ffL = (C1135930ffL) awS37S0310000_17.l0;
            c1135930ffL.LJFF--;
        }
        C1135930ffL c1135930ffL2 = (C1135930ffL) awS37S0310000_17.l0;
        int i2 = ((C118300cf) awS37S0310000_17.l1).element;
        boolean z = true;
        if (obj != null) {
            i = 1;
        } else {
            i = 0;
        }
        if (i2 + i == 0) {
            z = false;
        }
        c1135930ffL2.LJI("needMessageAsync", z);
        ((Function1) awS37S0310000_17.l2).invoke(obj);
        if (obj != null) {
            ((C1135930ffL) awS37S0310000_17.l0).LIZ();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS37S0310000_17(MiddleTouchWidget middleTouchWidget, MiddleTouchWidget middleTouchWidget2, boolean z, Function1<? super InterfaceC1541990qEH, Unit> function1, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l0 = middleTouchWidget;
        this.z3 = middleTouchWidget2;
        this.l1 = z;
        this.l2 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S0310000_17(boolean z, C0HZQ c0hzq, C1143240fr8 c1143240fr8, C1143200fr4 c1143200fr4, int i) {
        super(1);
        this.$t = i;
        this.z3 = z;
        this.l0 = c0hzq;
        this.l1 = c1143240fr8;
        this.l2 = c1143200fr4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS37S0310000_17(boolean z, boolean z2, C1135930ffL c1135930ffL, C118300cf c118300cf, Function1<? super C1135810ff9, Unit> function1) {
        super(1);
        this.$t = function1;
        this.z3 = z;
        this.l0 = z2;
        this.l1 = c1135930ffL;
        this.l2 = c118300cf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S0310000_17(boolean z, C1136560fgM c1136560fgM, AbstractC1139430fkz abstractC1139430fkz, AssetsModel assetsModel, int i) {
        super(1);
        this.$t = i;
        this.z3 = z;
        this.l0 = c1136560fgM;
        this.l1 = abstractC1139430fkz;
        this.l2 = assetsModel;
    }
}
