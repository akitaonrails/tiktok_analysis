package kotlin.jvm.internal;

import X.C09AY;
import X.C0KCX;
import X.C0KHS;
import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendItem;
import com.bytedance.android.livesdk.feed.skylight.multi.MultiTopLiveSkylightAdapter;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public class AwS93S0201000_7 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS93S0201000_7 awS93S0201000_7, Object obj) {
        MultiTopLiveSkylightAdapter multiTopLiveSkylightAdapter = (MultiTopLiveSkylightAdapter) awS93S0201000_7.l0;
        multiTopLiveSkylightAdapter.LL.LJ(awS93S0201000_7.i2, (RecommendItem) awS93S0201000_7.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS93S0201000_7 awS93S0201000_7, Object obj) {
        ((Assembler) obj).RQ2((UIAssem) awS93S0201000_7.l0, new AwS115S0101000_7((C0KCX) awS93S0201000_7.l1, (C0KCX<Enum<Object>>) awS93S0201000_7.i2, 5));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS93S0201000_7 awS93S0201000_7, Object obj) {
        ((Assembler) obj).RQ2((UIAssem) awS93S0201000_7.l0, new AwS115S0101000_7((C0KHS) awS93S0201000_7.l1, (C0KHS<Enum<Object>>) awS93S0201000_7.i2, 6));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS93S0201000_7(MultiTopLiveSkylightAdapter multiTopLiveSkylightAdapter, int i, RecommendItem recommendItem, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = multiTopLiveSkylightAdapter;
        this.i2 = i;
        this.l1 = recommendItem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS93S0201000_7(UIAssem uIAssem, UIAssem uIAssem2, C0KCX<Enum<Object>> c0kcx, int i) {
        super(1);
        this.$t = i;
        this.l0 = uIAssem;
        this.l1 = uIAssem2;
        this.i2 = c0kcx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS93S0201000_7(UIAssem uIAssem, UIAssem uIAssem2, C0KHS<Enum<Object>> c0khs, int i) {
        super(1);
        this.$t = i;
        this.l0 = uIAssem;
        this.l1 = uIAssem2;
        this.i2 = c0khs;
    }
}
