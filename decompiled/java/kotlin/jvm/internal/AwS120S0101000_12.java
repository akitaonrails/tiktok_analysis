package kotlin.jvm.internal;

import X.C09AY;
import X.C0UCZ;
import X.C0UH7;
import X.C249600xq;
import X.C745350TLp;
import X.C745370TLr;
import X.C767790U9x;
import X.EnumC776090UcR;
import com.bytedance.android.livesdk.broadcast.settingpage.LiveHostSettingFragmentSheet;
import com.bytedance.android.livesdk.settings.customtab.KevaDebugFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public class AwS120S0101000_12 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public Object l0;

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

    public static final Object invoke$0(AwS120S0101000_12 awS120S0101000_12, Object obj) {
        String eventKey;
        C0UH7 c0uh7 = EnumC776090UcR.Companion;
        int i = awS120S0101000_12.i1;
        c0uh7.getClass();
        EnumC776090UcR enumC776090UcRLIZ = C0UH7.LIZ(i);
        if (enumC776090UcRLIZ == null || (eventKey = enumC776090UcRLIZ.getEventKey()) == null) {
            eventKey = "";
        }
        LiveHostSettingFragmentSheet liveHostSettingFragmentSheet = (LiveHostSettingFragmentSheet) awS120S0101000_12.l0;
        C249600xq.LIZ("click", eventKey, liveHostSettingFragmentSheet.LLLIZZ, liveHostSettingFragmentSheet.LLJZ, null);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS120S0101000_12 awS120S0101000_12, Object obj) {
        C745350TLp c745350TLp = ((KevaDebugFragment) awS120S0101000_12.l0).LLILZIL;
        if (c745350TLp != null) {
            int i = awS120S0101000_12.i1;
            Object obj2 = ((C745370TLr) ListProtector.get(c745350TLp.LL, i)).LIZIZ;
            if (obj2 instanceof String) {
                obj = obj.toString();
            } else if (obj2 instanceof Integer) {
                obj = Integer.valueOf(CastIntegerProtector.parseInt(obj.toString()));
            } else if (obj2 instanceof Boolean) {
                obj = Boolean.valueOf(Boolean.parseBoolean(obj.toString()));
            } else if (obj2 instanceof Long) {
                obj = Long.valueOf(CastLongProtector.parseLong(obj.toString()));
            } else if (obj2 instanceof Float) {
                obj = Float.valueOf(CastFloatProtector.parseFloat(obj.toString()));
            } else if (obj2 instanceof Double) {
                obj = Double.valueOf(CastDoubleProtector.parseDouble(obj.toString()));
            }
            ((C745370TLr) ListProtector.get(c745350TLp.LL, i)).LIZIZ = obj;
            c745350TLp.notifyItemChanged(i);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS120S0101000_12 awS120S0101000_12, Object obj) {
        ((Function1) awS120S0101000_12.l0).invoke(Integer.valueOf(awS120S0101000_12.i1));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS120S0101000_12 awS120S0101000_12, Object obj) {
        Function1 function1 = (Function1) awS120S0101000_12.l0;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(awS120S0101000_12.i1));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS120S0101000_12 awS120S0101000_12, Object obj) {
        AwS591S0100000_12 awS591S0100000_12;
        int i = C767790U9x.LJFF;
        int i2 = awS120S0101000_12.i1;
        if (i != i2 && (awS591S0100000_12 = ((C0UCZ) awS120S0101000_12.l0).LLILLJJLI) != null) {
            awS591S0100000_12.invoke(Integer.valueOf(i2));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS120S0101000_12(int i, C0UCZ c0ucz, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c0ucz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS120S0101000_12(int i, LiveHostSettingFragmentSheet liveHostSettingFragmentSheet, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = liveHostSettingFragmentSheet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS120S0101000_12(int i, Function1 function1, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = function1;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS120S0101000_12(KevaDebugFragment kevaDebugFragment, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = kevaDebugFragment;
        this.i1 = i;
    }
}
