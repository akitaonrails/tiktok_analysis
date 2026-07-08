package jem;

import com.bytedance.tux.tag.TuxTag;
import java.util.Locale;

/* JADX INFO: loaded from: classes32.dex */
public final class b {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LIZ(String str, dc.a aVar, TuxTag tuxTag) {
        int i;
        int iHashCode = str.hashCode();
        if (iHashCode != -1036066630) {
            if (iHashCode != -834883116) {
                if (iHashCode == 400734493 && str.equals("app:tux_tagTextColor")) {
                    tuxTag.setTagTextColor(ec.a.LIZIZ(tuxTag.getContext(), aVar));
                    return;
                }
                return;
            }
            if (!str.equals("app:tux_backgroundColor")) {
                return;
            }
            tuxTag.setTagBackgroundColor(ec.a.LIZIZ(tuxTag.getContext(), aVar));
            return;
        }
        if (!str.equals("app:tux_tagSize")) {
            return;
        }
        String lowerCase = aVar.LIZ.toLowerCase(Locale.ROOT);
        switch (lowerCase.hashCode()) {
            case -1078030475:
                if (!lowerCase.equals("medium")) {
                    return;
                }
                i = 2;
                break;
                break;
            case 3560192:
                if (!lowerCase.equals("tiny")) {
                    return;
                }
                i = 0;
                break;
                break;
            case 102742843:
                if (!lowerCase.equals("large")) {
                    return;
                }
                i = 3;
                break;
                break;
            case 109548807:
                if (!lowerCase.equals("small")) {
                    return;
                }
                i = 1;
                break;
                break;
            default:
                return;
        }
        tuxTag.setTagSize(i);
    }
}
