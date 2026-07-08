package kotlin.jvm.internal;

import X.C09AY;
import X.C0P0T;
import X.C1398440mUk;
import X.C259800zU;
import X.C705930RmZ;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes30.dex */
public class AwS84S0500000_29 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS84S0500000_29 awS84S0500000_29) {
        C1398440mUk c1398440mUk = C1398440mUk.LIZ;
        Context context = (Context) awS84S0500000_29.l0;
        InteractStickerStruct interactStickerStruct = (InteractStickerStruct) awS84S0500000_29.l1;
        C705930RmZ c705930RmZ = (C705930RmZ) awS84S0500000_29.l2;
        Aweme aweme = (Aweme) awS84S0500000_29.l3;
        c1398440mUk.getClass();
        C1398440mUk.LIZLLL(context, aweme, c705930RmZ, interactStickerStruct);
        C0P0T c0p0t = (C0P0T) ((C259800zU) awS84S0500000_29.l4).element;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS84S0500000_29 awS84S0500000_29) {
        C1398440mUk c1398440mUk = C1398440mUk.LIZ;
        Context context = (Context) awS84S0500000_29.l0;
        InteractStickerStruct interactStickerStruct = (InteractStickerStruct) awS84S0500000_29.l1;
        C705930RmZ c705930RmZ = (C705930RmZ) awS84S0500000_29.l2;
        Aweme aweme = (Aweme) awS84S0500000_29.l3;
        c1398440mUk.getClass();
        C1398440mUk.LIZJ(context, aweme, c705930RmZ, interactStickerStruct);
        C0P0T c0p0t = (C0P0T) ((C259800zU) awS84S0500000_29.l4).element;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS84S0500000_29(Context context, Context context2, InteractStickerStruct interactStickerStruct, C705930RmZ c705930RmZ, Aweme aweme, C259800zU<C0P0T> c259800zU) {
        super(0);
        this.$t = c259800zU;
        this.l0 = context;
        this.l1 = context2;
        this.l2 = interactStickerStruct;
        this.l3 = c705930RmZ;
        this.l4 = aweme;
    }
}
