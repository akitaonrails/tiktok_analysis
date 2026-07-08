package psf;

import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import dc.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class e {
    public static void LIZ(String str, a.b bVar, LiveIconView liveIconView) {
        String strLJ = ec.a.LJ(str);
        if (Intrinsics.LJFF(strLJ, "iconTint")) {
            liveIconView.setIconTint(ec.a.LIZIZ(liveIconView.getContext(), bVar));
            return;
        }
        if (Intrinsics.LJFF(strLJ, "icon")) {
            if (Intrinsics.LJFF(bVar.LIZIZ, "attr")) {
                liveIconView.setIconAttr(CastIntegerProtector.parseInt(bVar.LIZ));
            } else {
                if (!Intrinsics.LJFF(bVar.LIZIZ, "drawable")) {
                    return;
                }
                liveIconView.setIcon(CastIntegerProtector.parseInt(bVar.LIZ));
            }
        }
    }
}
