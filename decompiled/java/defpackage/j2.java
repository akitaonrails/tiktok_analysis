package defpackage;

import X.C10UP;
import X.C1440005kM;
import android.os.Bundle;
import com.ss.android.ugc.governance.eventbus.IEvent;
import zm6.b;

/* JADX INFO: loaded from: classes14.dex */
public final class j2 implements b.a {
    public static final j2 LIZ = new j2();

    @Override // zm6.b.a
    public final void LIZ(b bVar) {
        Bundle bundle;
        String string;
        if (bVar != null && (bundle = bVar.LIZIZ) != null && (string = bundle.getString("com.facebook.platform.APPLINK_NATIVE_URL")) != null) {
            C10UP.LIZ.LJFF("", "", "", string, "meta ddl");
            C1440005kM.LIZIZ(new IEvent() { // from class: X.0WVM
                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent post() {
                    C1440005kM.LIZ(this);
                    return this;
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent postSticky() {
                    C1440005kM.LIZIZ(this);
                    return this;
                }
            });
        }
    }
}
