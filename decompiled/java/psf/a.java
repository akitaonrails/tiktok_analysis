package psf;

import android.animation.LayoutTransition;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class a {
    public static void LIZ(String str, dc.a aVar, ConstraintLayout constraintLayout) {
        if (Intrinsics.LJFF(ec.a.LJ(str), "animateLayoutChanges") && Boolean.parseBoolean(aVar.LIZ)) {
            constraintLayout.setLayoutTransition(new LayoutTransition());
        }
    }
}
