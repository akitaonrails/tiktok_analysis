package xem;

import X.C197039127h;
import X.C814420VxA;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;

/* JADX INFO: loaded from: classes32.dex */
public final class f {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LIZ(String str, dc.a aVar, C197039127h c197039127h) {
        String str2;
        String str3;
        switch (str.hashCode()) {
            case -2143256671:
                if (str.equals("app:tux_iconEnd")) {
                    c197039127h.setButtonEndIcon(Integer.valueOf(CastIntegerProtector.parseInt(aVar.LIZ)));
                }
                break;
            case -1909861454:
                if (str.equals("app:tux_buttonVariant") && (str2 = aVar.LIZ) != null) {
                    switch (str2.hashCode()) {
                        case -1908079720:
                            if (str2.equals("const_secondary")) {
                                c197039127h.setButtonVariant(2);
                            }
                            break;
                        case -817598092:
                            if (str2.equals("secondary")) {
                                c197039127h.setButtonVariant(1);
                            }
                            break;
                        case -314765822:
                            if (str2.equals("primary")) {
                                c197039127h.setButtonVariant(0);
                            }
                            break;
                        case 3387192:
                            if (str2.equals("none")) {
                                c197039127h.setButtonVariant(-1);
                            }
                            break;
                        case 98331279:
                            if (str2.equals("ghost")) {
                                c197039127h.setButtonVariant(4);
                            }
                            break;
                    }
                }
                break;
            case -1594092198:
                if (str.equals("app:tux_buttonCapsule")) {
                    c197039127h.LJJLI(ec.a.LIZ(aVar));
                }
                break;
            case -697836383:
                if (str.equals("app:tux_iconHeight")) {
                    c197039127h.setIconHeight(C814420VxA.LIZIZ(ec.a.LIZJ(c197039127h.getContext(), aVar)));
                }
                break;
            case 486716404:
                if (str.equals("app:tux_buttonSize") && (str3 = aVar.LIZ) != null) {
                    switch (str3.hashCode()) {
                        case -1078030475:
                            if (str3.equals("medium")) {
                                c197039127h.setButtonSize(2);
                            }
                            break;
                        case 3387192:
                            if (str3.equals("none")) {
                                c197039127h.setButtonSize(-1);
                            }
                            break;
                        case 3560192:
                            if (str3.equals("tiny")) {
                                c197039127h.setButtonSize(0);
                            }
                            break;
                        case 102742843:
                            if (str3.equals("large")) {
                                c197039127h.setButtonSize(3);
                            }
                            break;
                        case 109548807:
                            if (str3.equals("small")) {
                                c197039127h.setButtonSize(1);
                            }
                            break;
                    }
                }
                break;
            case 902192320:
                if (str.equals("app:tux_buttonAutoSizing")) {
                    c197039127h.LJJJJLI(ec.a.LIZ(aVar));
                }
                break;
            case 1927750056:
                if (str.equals("app:tux_iconStart")) {
                    c197039127h.setButtonStartIcon(Integer.valueOf(CastIntegerProtector.parseInt(aVar.LIZ)));
                }
                break;
            case 1931119372:
                if (str.equals("app:tux_iconWidth")) {
                    c197039127h.setIconWidth(C814420VxA.LIZIZ(ec.a.LIZJ(c197039127h.getContext(), aVar)));
                }
                break;
        }
    }
}
