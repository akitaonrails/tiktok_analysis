package kotlin.jvm.internal;

import X.C09AY;
import X.C1664680tQA;
import X.C20280014Ww;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes30.dex */
public class AwS2S0312000_29 extends C09AY implements Function2 {
    public final int $t;
    public int i4;
    public int i5;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

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

    public static final Object invoke$0(AwS2S0312000_29 awS2S0312000_29, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((C20280014Ww) awS2S0312000_29.l0).LIZIZ((C1664680tQA) awS2S0312000_29.l1, awS2S0312000_29.z3, (Aweme) awS2S0312000_29.l2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS2S0312000_29.i4 | 1), awS2S0312000_29.i5);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S0312000_29 awS2S0312000_29, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((C20280014Ww) awS2S0312000_29.l0).LIZLLL((C1664680tQA) awS2S0312000_29.l1, awS2S0312000_29.z3, (Aweme) awS2S0312000_29.l2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS2S0312000_29.i4 | 1), awS2S0312000_29.i5);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS2S0312000_29(C20280014Ww c20280014Ww, C20280014Ww c20280014Ww2, C1664680tQA<DMGroupChatStickerModel> c1664680tQA, boolean z, Aweme aweme, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c20280014Ww;
        this.l1 = c20280014Ww2;
        this.z3 = c1664680tQA;
        this.l2 = z;
        this.i4 = aweme;
        this.i5 = i;
    }
}
