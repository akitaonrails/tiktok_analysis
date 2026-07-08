package kotlin.jvm.internal;

import X.C09AY;
import X.C0PEM;
import X.C0Z1B;
import X.C1619106Vp;
import X.C19EG;
import X.C2296808zG;
import X.C23250099c;
import X.C909440Zm2;
import X.EnumC909380Zlw;
import X.InterfaceC2257971DZj;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.utils.IChatCustomizeHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public class AwS41S1110000_14 extends C09AY implements Function2 {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

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

    public static final Object invoke$0(AwS41S1110000_14 awS41S1110000_14, Object obj, Object obj2) {
        C19EG c19eg = (C19EG) awS41S1110000_14.l1;
        if (c19eg != null && LifecycleOwnerKt.getLifecycleScope(c19eg) != null) {
            String str = awS41S1110000_14.s0;
            boolean z = awS41S1110000_14.z2;
            IChatCustomizeHelper.LIZ.getClass();
            IChatCustomizeHelper iChatCustomizeHelperLIZ = C1619106Vp.LIZ();
            if (iChatCustomizeHelperLIZ != null) {
                iChatCustomizeHelperLIZ.openCustomizeFragment(str, true, (InterfaceC2257971DZj) C0Z1B.LIZ, z, "settable");
            }
        }
        C19EG c19eg2 = (C19EG) awS41S1110000_14.l1;
        if (c19eg2 != null) {
            c19eg2.finish();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS41S1110000_14 awS41S1110000_14, Object obj, Object obj2) {
        C19EG c19eg = (C19EG) awS41S1110000_14.l1;
        if (c19eg != null && LifecycleOwnerKt.getLifecycleScope(c19eg) != null) {
            String str = awS41S1110000_14.s0;
            boolean z = awS41S1110000_14.z2;
            IChatCustomizeHelper.LIZ.getClass();
            IChatCustomizeHelper iChatCustomizeHelperLIZ = C1619106Vp.LIZ();
            if (iChatCustomizeHelperLIZ != null) {
                iChatCustomizeHelperLIZ.openCustomizeFragment(str, false, (InterfaceC2257971DZj) C0Z1B.LIZ, z, "settable");
            }
        }
        C19EG c19eg2 = (C19EG) awS41S1110000_14.l1;
        if (c19eg2 != null) {
            c19eg2.finish();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS41S1110000_14 awS41S1110000_14, Object obj, Object obj2) {
        if (awS41S1110000_14.z2) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C909440Zm2((EnumC909380Zlw) awS41S1110000_14.l1, awS41S1110000_14.s0, null), 3);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS41S1110000_14(EnumC909380Zlw enumC909380Zlw, String str, boolean z, int i) {
        super(2);
        this.$t = i;
        this.z2 = z;
        this.l1 = enumC909380Zlw;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS41S1110000_14(C19EG c19eg, String str, boolean z, int i) {
        super(2);
        this.$t = i;
        this.l1 = c19eg;
        this.s0 = str;
        this.z2 = z;
    }
}
