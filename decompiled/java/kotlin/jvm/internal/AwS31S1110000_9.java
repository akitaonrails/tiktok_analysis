package kotlin.jvm.internal;

import X.C062P;
import X.C09AY;
import X.C0OLW;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinProfileEditFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public class AwS31S1110000_9 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS31S1110000_9 awS31S1110000_9, Object obj) {
        Assembler assembler = (Assembler) obj;
        BulletinProfileEditFragment bulletinProfileEditFragment = (BulletinProfileEditFragment) awS31S1110000_9.l1;
        assembler.DQ2(bulletinProfileEditFragment, new AwS31S1110000_9(bulletinProfileEditFragment, awS31S1110000_9.s0, awS31S1110000_9.z2, 1));
        assembler.QQ2((BulletinProfileEditFragment) awS31S1110000_9.l1, AFwS240S0000000_9.get$arr$(305));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS31S1110000_9 awS31S1110000_9, Object obj) {
        C062P c062p = (C062P) obj;
        BulletinProfileEditFragment bulletinProfileEditFragment = (BulletinProfileEditFragment) awS31S1110000_9.l1;
        c062p.LIZ = new C0OLW(bulletinProfileEditFragment.LLIZ, bulletinProfileEditFragment.LLIZLLLIL, bulletinProfileEditFragment.LLJJI, awS31S1110000_9.s0, awS31S1110000_9.z2, bulletinProfileEditFragment.LLJJ, bulletinProfileEditFragment.LLJ, bulletinProfileEditFragment.LLJI);
        c062p.LIZIZ = "bulletin_profile_edit_param";
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS31S1110000_9(BulletinProfileEditFragment bulletinProfileEditFragment, String str, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l1 = bulletinProfileEditFragment;
        this.s0 = str;
        this.z2 = z;
    }
}
