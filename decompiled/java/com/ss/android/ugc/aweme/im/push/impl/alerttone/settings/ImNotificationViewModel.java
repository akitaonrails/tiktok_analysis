package com.ss.android.ugc.aweme.im.push.impl.alerttone.settings;

import X.AbstractC1689250u3n;
import X.AbstractC1689260u3o;
import X.C05P0;
import X.C05P1;
import X.C099R;
import X.C13FE;
import X.C1689240u3m;
import X.C1689290u3r;
import X.C1689410u43;
import X.C1689420u44;
import X.C1689430u45;
import X.C1689440u46;
import X.C1689450u47;
import X.C1697810uHb;
import X.C1954807lC;
import X.C20028913Yh;
import X.C2153208c6;
import X.C23250099c;
import X.InterfaceC1364105Vn;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushItem;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class ImNotificationViewModel extends ViewModel {
    public static final List<String> LLILZ = C1697810uHb.LJIIJJI("im_push", "im_push_preview_v2", "im_alert_tones", "im_notification_permissions");
    public static final List<String> LLILZIL = C1697810uHb.LJIIJJI("in_app_im_push", "in_app_im_msg_sound", "in_app_im_msg_vibration");
    public final C05P0<AbstractC1689260u3o> LL;
    public final C05P1<AbstractC1689260u3o> LLILLJJLI;
    public List<PushItem> LLILLL;

    public ImNotificationViewModel() {
        C05P0<AbstractC1689260u3o> c05p0LJI = C20028913Yh.LJI(C1689290u3r.LL);
        this.LL = c05p0LJI;
        this.LLILLJJLI = c05p0LJI;
    }

    public final PushItem vQ2(String str) {
        List<PushItem> list = this.LLILLL;
        PushItem pushItem = null;
        if (list == null) {
            return null;
        }
        Iterator<PushItem> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            PushItem next = it2.next();
            if (Intrinsics.LJFF(next.itemId, str)) {
                pushItem = next;
                break;
            }
        }
        return pushItem;
    }

    public final Object wQ2(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2153208c6.LIZ().LIZ, new C1689450u47(this, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    public final void yQ2(Function1<? super C1689240u3m, C1689240u3m> function1) {
        C1689240u3m c1689240u3mInvoke;
        Object value = ((C13FE) this.LL).getValue();
        if ((value instanceof C1689240u3m) && value != 0 && (c1689240u3mInvoke = function1.invoke(value)) != null) {
            ((C13FE) this.LL).setValue(c1689240u3mInvoke);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x000d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List xQ2(java.util.List r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.ImNotificationViewModel.xQ2(java.util.List, boolean):java.util.List");
    }

    public static AbstractC1689250u3n zQ2(List list, AbstractC1689250u3n abstractC1689250u3n) {
        if (abstractC1689250u3n instanceof C1689420u44) {
            C1689420u44 c1689420u44 = (C1689420u44) abstractC1689250u3n;
            return C1689420u44.LJI(c1689420u44, C1689440u46.LIZIZ(c1689420u44.LIZJ, list), false, 95);
        }
        if (abstractC1689250u3n instanceof C1689410u43) {
            C1689410u43 c1689410u43 = (C1689410u43) abstractC1689250u3n;
            return C1689410u43.LJII(c1689410u43, C1689440u46.LIZIZ(c1689410u43.LIZJ, list), null, 95);
        }
        if (abstractC1689250u3n instanceof C1689430u45) {
            C1689430u45 c1689430u45 = (C1689430u45) abstractC1689250u3n;
            return new C1689430u45(c1689430u45.LIZIZ, c1689430u45.LIZJ, c1689430u45.LIZLLL, c1689430u45.LJ, c1689430u45.LJFF, C1689440u46.LIZIZ(c1689430u45.LIZJ, list), c1689430u45.LJII, c1689430u45.LJIIIIZZ, c1689430u45.LJIIIZ);
        }
        throw new C1954807lC();
    }
}
