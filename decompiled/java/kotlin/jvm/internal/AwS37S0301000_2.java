package kotlin.jvm.internal;

import X.C09AY;
import X.C1163440gNi;
import X.C1558360qeg;
import X.C1558520qew;
import X.C449650HkB;
import X.C724240Sb0;
import X.InterfaceC665370Q7z;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.im.ability.InputEmojiButtonAbility;
import com.ss.android.ugc.aweme.im.ability.RequestKeyboardAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.input.BulletinEmojiButtonAssem$onViewCreated$1$1;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.input.BulletinEmojiButtonAssem$onViewCreated$1$2;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AwS37S0301000_2 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final Object invoke$0(AwS37S0301000_2 awS37S0301000_2, Object obj) {
        Assembler assembler = (Assembler) obj;
        Fragment fragmentLJI = C724240Sb0.LJI((UIAssem) awS37S0301000_2.l0);
        if (fragmentLJI != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            RequestKeyboardAbility requestKeyboardAbility = (RequestKeyboardAbility) awS37S0301000_2.l1;
            InputEmojiButtonAbility inputEmojiButtonAbility = (InputEmojiButtonAbility) awS37S0301000_2.l2;
            C1558520qew.LJII(interfaceC665370Q7zLJFF, requestKeyboardAbility, RequestKeyboardAbility.class, null, null);
            C1558520qew.LJII(interfaceC665370Q7zLJFF, inputEmojiButtonAbility, InputEmojiButtonAbility.class, null, null);
        }
        assembler.RQ2((UIAssem) awS37S0301000_2.l0, new AwS17S0001000_2(awS37S0301000_2.i3, 0));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS37S0301000_2 awS37S0301000_2, Object obj) {
        Assembler assembler = (Assembler) obj;
        Fragment fragmentLJI = C724240Sb0.LJI((UIAssem) awS37S0301000_2.l0);
        if (fragmentLJI != null) {
            assembler.DQ2(fragmentLJI, new AwS581S0100000_2((C449650HkB) awS37S0301000_2.l1, 664));
        }
        assembler.RQ2((UIAssem) awS37S0301000_2.l0, new AwS110S0101000_2(awS37S0301000_2.i3, (C1163440gNi) awS37S0301000_2.l2, 19));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S0301000_2(UIAssem uIAssem, BulletinEmojiButtonAssem$onViewCreated$1$1 bulletinEmojiButtonAssem$onViewCreated$1$1, BulletinEmojiButtonAssem$onViewCreated$1$2 bulletinEmojiButtonAssem$onViewCreated$1$2, int i) {
        super(1);
        this.$t = i;
        this.l0 = uIAssem;
        this.l1 = bulletinEmojiButtonAssem$onViewCreated$1$1;
        this.l2 = bulletinEmojiButtonAssem$onViewCreated$1$2;
        this.i3 = R.id.d0i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S0301000_2(int i, C1163440gNi c1163440gNi, UIAssem uIAssem, C449650HkB c449650HkB, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = uIAssem;
        this.l1 = c449650HkB;
        this.i3 = i;
        this.l2 = c1163440gNi;
    }
}
