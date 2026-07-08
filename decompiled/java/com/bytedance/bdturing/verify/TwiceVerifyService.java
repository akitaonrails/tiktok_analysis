package com.bytedance.bdturing.verify;

import X.AbstractC202165148l;
import X.AnonymousClass1493;
import X.C0WZX;
import X.C1701330uNH;
import X.C202171148r;
import X.C202176148w;
import X.C202177148x;
import X.C2204961BRm;
import X.InterfaceC202160148g;
import android.app.Activity;
import android.content.Intent;
import com.bytedance.bdturing.twiceverify.TwiceVerifyWebActivity;
import com.bytedance.router.monitor.RouterPageMonitor;

/* JADX INFO: loaded from: classes31.dex */
public class TwiceVerifyService implements AnonymousClass1493 {
    @Override // X.AnonymousClass1493
    public boolean isProcess(int i) {
        return i == 6 || i == 7 || i == 10;
    }

    @Override // X.AnonymousClass1493
    public boolean execute(AbstractC202165148l abstractC202165148l, InterfaceC202160148g interfaceC202160148g) {
        if (C202171148r.LIZ().LIZ == null) {
            return false;
        }
        C202171148r c202171148rLIZ = C202171148r.LIZ();
        c202171148rLIZ.LIZIZ = new C202176148w(interfaceC202160148g);
        if (abstractC202165148l instanceof C202177148x) {
            c202171148rLIZ.LIZ.LIZ();
            return true;
        }
        c202171148rLIZ.LIZJ = abstractC202165148l;
        Intent intent = new Intent();
        Activity activity = abstractC202165148l.getActivity();
        intent.setClass(activity, TwiceVerifyWebActivity.class);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyGYn7cm4RGPatmlzWAGrSzcoXFq7Lzwpkij6G8BrQXETGQt8pL7JM=", null));
        return true;
    }
}
