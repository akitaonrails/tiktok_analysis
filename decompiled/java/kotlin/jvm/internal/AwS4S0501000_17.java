package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C1133680fbi;
import X.C1133690fbj;
import X.C1135280feI;
import X.C1135660feu;
import X.C1135670fev;
import X.C1135870ffF;
import X.C1136400fg6;
import X.C1136410fg7;
import X.C1136560fgM;
import X.C118300cf;
import X.C259800zU;
import X.InterfaceC1136020ffU;
import com.bytedance.android.livesdk.livesetting.gift.GiftDownloadEffectBeforeMsgEnqueueSettings;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public class AwS4S0501000_17 extends C09AY implements Function1 {
    public final int $t;
    public int i5;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS4S0501000_17 awS4S0501000_17, Object obj) {
        if (!(obj instanceof GiftMessage)) {
            return Boolean.FALSE;
        }
        C1133690fbj c1133690fbj = C1133690fbj.LIZ;
        GiftMessage giftMessage = (GiftMessage) obj;
        Gift gift = giftMessage.mGift;
        c1133690fbj.getClass();
        if (!C1133690fbj.LJI(gift)) {
            return Boolean.FALSE;
        }
        ((C118300cf) awS4S0501000_17.l0).element++;
        if (giftMessage.giftId == ((GiftMessage) ((C259800zU) awS4S0501000_17.l1).element).giftId) {
            ((C1135660feu) awS4S0501000_17.l2).getClass();
            return Boolean.TRUE;
        }
        if (C1133680fbi.LIZ(giftMessage) < awS4S0501000_17.i5) {
            ((C118300cf) awS4S0501000_17.l3).element++;
        }
        if (((C118300cf) awS4S0501000_17.l3).element > 0 && ((C118300cf) awS4S0501000_17.l0).element <= 1) {
            ((C1135660feu) awS4S0501000_17.l2).getClass();
            return Boolean.TRUE;
        }
        if (((C118300cf) awS4S0501000_17.l0).element >= GiftDownloadEffectBeforeMsgEnqueueSettings.INSTANCE.getHotRoomSpecialQueueWaitSize()) {
            ((C013C) awS4S0501000_17.l4).element = true;
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS4S0501000_17 awS4S0501000_17, Object obj) {
        if (!(obj instanceof C1136560fgM)) {
            return Boolean.FALSE;
        }
        C118300cf c118300cf = (C118300cf) awS4S0501000_17.l0;
        c118300cf.element++;
        C1135280feI c1135280feI = (C1135280feI) obj;
        if (c1135280feI.LJIIL == ((GiftMessage) ((C259800zU) awS4S0501000_17.l1).element).giftId) {
            ((C1136410fg7) awS4S0501000_17.l2).getClass();
            return Boolean.TRUE;
        }
        if (c1135280feI.LJI < awS4S0501000_17.i5) {
            ((C118300cf) awS4S0501000_17.l3).element++;
        }
        if (((C118300cf) awS4S0501000_17.l3).element > 0 && c118300cf.element <= 1) {
            ((C1136410fg7) awS4S0501000_17.l2).getClass();
            return Boolean.TRUE;
        }
        if (c118300cf.element >= GiftDownloadEffectBeforeMsgEnqueueSettings.INSTANCE.getHotRoomSpecialQueueWaitSize()) {
            ((C013C) awS4S0501000_17.l4).element = true;
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public static final Object invoke$2(AwS4S0501000_17 awS4S0501000_17, Object obj) {
        if (!(obj instanceof InterfaceC1136020ffU)) {
            return Boolean.FALSE;
        }
        InterfaceC1136020ffU interfaceC1136020ffU = (InterfaceC1136020ffU) obj;
        if (!C1135870ffF.LJIILIIL(interfaceC1136020ffU)) {
            return Boolean.FALSE;
        }
        ((C118300cf) awS4S0501000_17.l0).element++;
        if (interfaceC1136020ffU.getGiftId() == ((InterfaceC1136020ffU) ((C259800zU) awS4S0501000_17.l1).element).getGiftId()) {
            ((C1135670fev) awS4S0501000_17.l2).getClass();
            return Boolean.TRUE;
        }
        if (C1135870ffF.LIZIZ(interfaceC1136020ffU) < awS4S0501000_17.i5) {
            ((C118300cf) awS4S0501000_17.l3).element++;
        }
        if (((C118300cf) awS4S0501000_17.l3).element > 0 && ((C118300cf) awS4S0501000_17.l0).element <= 1) {
            ((C1135670fev) awS4S0501000_17.l2).getClass();
            return Boolean.TRUE;
        }
        if (((C118300cf) awS4S0501000_17.l0).element >= GiftDownloadEffectBeforeMsgEnqueueSettings.INSTANCE.getHotRoomSpecialQueueWaitSize()) {
            ((C013C) awS4S0501000_17.l4).element = true;
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public static final Object invoke$3(AwS4S0501000_17 awS4S0501000_17, Object obj) {
        if (!(obj instanceof C1136560fgM)) {
            return Boolean.FALSE;
        }
        ((C118300cf) awS4S0501000_17.l0).element++;
        C1135280feI c1135280feI = (C1135280feI) obj;
        if (c1135280feI.LJIIL == ((InterfaceC1136020ffU) ((C259800zU) awS4S0501000_17.l1).element).getGiftId()) {
            ((C1136400fg6) awS4S0501000_17.l2).getClass();
            return Boolean.TRUE;
        }
        if (c1135280feI.LJI < awS4S0501000_17.i5) {
            ((C118300cf) awS4S0501000_17.l3).element++;
        }
        if (((C118300cf) awS4S0501000_17.l3).element > 0 && ((C118300cf) awS4S0501000_17.l0).element <= 1) {
            ((C1136400fg6) awS4S0501000_17.l2).getClass();
            return Boolean.TRUE;
        }
        if (((C118300cf) awS4S0501000_17.l0).element >= GiftDownloadEffectBeforeMsgEnqueueSettings.INSTANCE.getHotRoomSpecialQueueWaitSize()) {
            ((C013C) awS4S0501000_17.l4).element = true;
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS4S0501000_17(C118300cf c118300cf, C118300cf c118300cf2, C259800zU<GiftMessage> c259800zU, C1135660feu c1135660feu, int i, C118300cf c118300cf3, C013C c013c) {
        super(1);
        this.$t = c013c;
        this.l0 = c118300cf;
        this.l1 = c118300cf2;
        this.l2 = c259800zU;
        this.i5 = c1135660feu;
        this.l3 = i;
        this.l4 = c118300cf3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS4S0501000_17(C118300cf c118300cf, C118300cf c118300cf2, C259800zU<InterfaceC1136020ffU> c259800zU, C1135670fev c1135670fev, int i, C118300cf c118300cf3, C013C c013c) {
        super(1);
        this.$t = c013c;
        this.l0 = c118300cf;
        this.l1 = c118300cf2;
        this.l2 = c259800zU;
        this.i5 = c1135670fev;
        this.l3 = i;
        this.l4 = c118300cf3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS4S0501000_17(C118300cf c118300cf, C118300cf c118300cf2, C259800zU<InterfaceC1136020ffU> c259800zU, C1136400fg6 c1136400fg6, int i, C118300cf c118300cf3, C013C c013c) {
        super(1);
        this.$t = c013c;
        this.l0 = c118300cf;
        this.l1 = c118300cf2;
        this.l2 = c259800zU;
        this.i5 = c1136400fg6;
        this.l3 = i;
        this.l4 = c118300cf3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS4S0501000_17(C118300cf c118300cf, C118300cf c118300cf2, C259800zU<GiftMessage> c259800zU, C1136410fg7 c1136410fg7, int i, C118300cf c118300cf3, C013C c013c) {
        super(1);
        this.$t = c013c;
        this.l0 = c118300cf;
        this.l1 = c118300cf2;
        this.l2 = c259800zU;
        this.i5 = c1136410fg7;
        this.l3 = i;
        this.l4 = c118300cf3;
    }
}
