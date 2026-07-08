package xem;

import X.C814420VxA;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tux.icon.TuxIconView;

/* JADX INFO: loaded from: classes32.dex */
public final class k {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LIZ(String str, dc.a aVar, TuxIconView tuxIconView) {
        switch (str.hashCode()) {
            case -1754043686:
                if (str.equals("app:tux_icon")) {
                    tuxIconView.setIconRes(CastIntegerProtector.parseInt(aVar.LIZ));
                }
                break;
            case -697836383:
                if (str.equals("app:tux_iconHeight")) {
                    tuxIconView.setIconHeight(C814420VxA.LIZIZ(ec.a.LIZJ(tuxIconView.getContext(), aVar)));
                }
                break;
            case -380386150:
                if (str.equals("app:tux_iconShadow")) {
                    tuxIconView.LIZJ(ec.a.LIZ(aVar));
                }
                break;
            case 361903975:
                if (str.equals("app:tux_tintColor")) {
                    tuxIconView.setTintColor(ec.a.LIZIZ(tuxIconView.getContext(), aVar));
                }
                break;
            case 1931119372:
                if (str.equals("app:tux_iconWidth")) {
                    tuxIconView.setIconWidth(C814420VxA.LIZIZ(ec.a.LIZJ(tuxIconView.getContext(), aVar)));
                }
                break;
        }
    }
}
