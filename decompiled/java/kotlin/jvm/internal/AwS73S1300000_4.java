package kotlin.jvm.internal;

import X.C09AY;
import X.C1263404wy;
import X.C1860130yVP;
import X.C20684815ws;
import X.C21419418s4;
import X.C2344009Gk;
import X.C341410DZz;
import android.content.Context;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public class AwS73S1300000_4 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

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

    public static final Object invoke$0(AwS73S1300000_4 awS73S1300000_4) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("prop_id", ((NewFaceStickerBean) awS73S1300000_4.l1).id);
        c2344009Gk.LJIIIIZZ("scene_id", "1001");
        c2344009Gk.LJIIIIZZ("enter_from", awS73S1300000_4.s0);
        C20684815ws.LJIILLIIL("confirm_toast", c2344009Gk.LIZ);
        C341410DZz.LIZIZ((Context) awS73S1300000_4.l2, (NewFaceStickerBean) awS73S1300000_4.l1);
        ((Function0) awS73S1300000_4.l3).invoke();
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS73S1300000_4 r13) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS73S1300000_4.invoke$1(kotlin.jvm.internal.AwS73S1300000_4):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS73S1300000_4(C1263404wy c1263404wy, C1860130yVP c1860130yVP, String str, C21419418s4 c21419418s4, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1263404wy;
        this.l2 = c1860130yVP;
        this.s0 = str;
        this.l3 = c21419418s4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS73S1300000_4(NewFaceStickerBean newFaceStickerBean, NewFaceStickerBean newFaceStickerBean2, String str, Context context, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l1 = newFaceStickerBean;
        this.s0 = newFaceStickerBean2;
        this.l2 = str;
        this.l3 = context;
    }
}
