package xem;

import X.C12KQ;
import X.C12P4;
import X.C814420VxA;
import X.EnumC197015126j;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;

/* JADX INFO: loaded from: classes30.dex */
public final class i {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LIZ(String str, dc.a aVar, C12P4 c12p4) {
        String str2;
        String str3;
        switch (str.hashCode()) {
            case -1718316538:
                if (str.equals("app:tux_shader") && (str2 = aVar.LIZ) != null) {
                    switch (str2.hashCode()) {
                        case -1965072618:
                            if (str2.equals("ease_in")) {
                                c12p4.setShader(EnumC197015126j.EASE_IN);
                            }
                            break;
                        case -1102672091:
                            if (str2.equals("linear")) {
                                c12p4.setShader(EnumC197015126j.LINEAR);
                            }
                            break;
                        case -787702915:
                            if (str2.equals("ease_out")) {
                                c12p4.setShader(EnumC197015126j.EASE_OUT);
                            }
                            break;
                        case 1065009829:
                            if (str2.equals("ease_in_out")) {
                                c12p4.setShader(EnumC197015126j.EASE_IN_OUT);
                            }
                            break;
                    }
                }
                break;
            case -1225922857:
                if (str.equals("app:tux_shadeColor")) {
                    c12p4.setShadeColor(ec.a.LIZIZ(c12p4.getContext(), aVar));
                }
                break;
            case -1222079336:
                if (str.equals("app:tux_endShadeOpacity")) {
                    c12p4.setEndShadeOpacity(CastFloatProtector.parseFloat(aVar.LIZ));
                }
                break;
            case -470191194:
                if (str.equals("app:tux_beginShadeOpacity")) {
                    c12p4.setBeginShadeOpacity(CastFloatProtector.parseFloat(aVar.LIZ));
                }
                break;
            case 72692886:
                if (str.equals("app:tux_layerWidth")) {
                    c12p4.setLayerWidth(C814420VxA.LIZIZ(ec.a.LIZJ(c12p4.getContext(), aVar)));
                }
                break;
            case 1468971888:
                if (str.equals("app:tux_style") && (str3 = aVar.LIZ) != null) {
                    int iHashCode = str3.hashCode();
                    if (iHashCode != -1984141450) {
                        if (iHashCode != -938579425) {
                            if (iHashCode == 1387629604 && str3.equals("horizontal")) {
                                c12p4.setStyle(C12KQ.HORIZONTAL);
                                break;
                            }
                        } else {
                            if (str3.equals("radial")) {
                                c12p4.setStyle(C12KQ.RADIAL);
                            }
                            break;
                        }
                    } else {
                        if (str3.equals("vertical")) {
                            c12p4.setStyle(C12KQ.VERTICAL);
                        }
                        break;
                    }
                }
                break;
            case 1820484695:
                if (str.equals("app:tux_layerHeight")) {
                    c12p4.setLayerHeight(C814420VxA.LIZIZ(ec.a.LIZJ(c12p4.getContext(), aVar)));
                }
                break;
        }
    }
}
