package kotlin.jvm.internal;

import X.C09AY;
import X.C0JBN;
import X.C1324610kZf;
import X.C1819620xS4;
import X.C20365714mV;
import X.C20366514md;
import X.C418440Gaw;
import X.C500260Jjc;
import X.InterfaceC1631620sYq;
import android.graphics.drawable.ColorDrawable;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes32.dex */
public class AwS153S0201000_31 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS153S0201000_31(C20365714mV c20365714mV, int i, ImageView imageView, int i2) {
        super(3);
        this.$t = i2;
        this.l0 = c20365714mV;
        this.i2 = i;
        this.l1 = imageView;
    }

    public static final Object invoke$0(AwS153S0201000_31 awS153S0201000_31, Object obj, Object obj2, Object obj3) {
        Object tag;
        String str = (String) obj;
        String str2 = (String) obj2;
        List list = (List) obj3;
        TextView textView = ((C20366514md) awS153S0201000_31.l0).LLIZLLLIL;
        Object obj4 = null;
        if (textView != null) {
            tag = textView.getTag();
        } else {
            tag = null;
        }
        if (tag instanceof String) {
            obj4 = tag;
        }
        if (Intrinsics.LJFF(obj4, PlaybookUtilKt.LJIJJ(str, str2))) {
            if (!list.isEmpty()) {
                C500260Jjc.LJLJLJ(((C20366514md) awS153S0201000_31.l0).LLILZLL, true);
                C20366514md c20366514md = (C20366514md) awS153S0201000_31.l0;
                C1324610kZf c1324610kZfLIZJ = ((C0JBN) c20366514md.LLJJ.getValue()).LIZJ(list);
                c20366514md.L5(c1324610kZfLIZJ, awS153S0201000_31.i2, (C20365714mV) awS153S0201000_31.l1);
                c1324610kZfLIZJ.LJJIFFI = true;
                c1324610kZfLIZJ.LJJI(((C20366514md) awS153S0201000_31.l0).LLILZLL);
            } else {
                C500260Jjc.LJLJLJ(((C20366514md) awS153S0201000_31.l0).LLILZLL, false);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS153S0201000_31 awS153S0201000_31, Object obj, Object obj2, Object obj3) {
        List list = (List) obj3;
        if (Intrinsics.LJFF(obj, ((C20365714mV) awS153S0201000_31.l0).LJFF) && Intrinsics.LJFF(obj2, ((C20365714mV) awS153S0201000_31.l0).LJI) && !list.isEmpty()) {
            C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(list);
            c1324610kZfLIZJ.LJIIJJI = new ColorDrawable(awS153S0201000_31.i2);
            c1324610kZfLIZJ.LJIJI(Float.valueOf(C418440Gaw.LIZIZ(12)));
            c1324610kZfLIZJ.LJJIFFI = true;
            c1324610kZfLIZJ.LJIJJ = ImageView.ScaleType.FIT_START;
            c1324610kZfLIZJ.LJJI((ImageView) awS153S0201000_31.l1);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS153S0201000_31(C20366514md c20366514md, int i, C20365714mV c20365714mV, int i2) {
        super(3);
        this.$t = i2;
        this.l0 = c20366514md;
        this.i2 = i;
        this.l1 = c20365714mV;
    }
}
