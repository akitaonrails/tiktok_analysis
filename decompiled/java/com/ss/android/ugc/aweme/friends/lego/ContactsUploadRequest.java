package com.ss.android.ugc.aweme.friends.lego;

import X.C0CO3;
import X.C1056700dbY;
import X.C1075950e6b;
import X.C1075960e6c;
import X.C295940Biq;
import X.C800010VZv;
import X.EnumC1074240e3q;
import X.EnumC799980VZs;
import X.InterfaceC800130Va7;
import android.content.Context;
import com.bytedance.keva.Keva;
import java.util.List;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class ContactsUploadRequest implements InterfaceC800130Va7 {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ContactsUploadRequest";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC308150C6b
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C800010VZv.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C800010VZv.LIZIZ(this);
    }

    @Override // X.InterfaceC800130Va7
    public final C0CO3 type() {
        return C0CO3.IDLE;
    }

    @Override // X.InterfaceC800130Va7
    public final void LJI(Context context, boolean z) {
        if (C295940Biq.LIZ() && C1075950e6b.LIZIZ()) {
            C1075960e6c c1075960e6c = C1075960e6c.LIZIZ;
            c1075960e6c.init();
            c1075960e6c.LIZ(AFwS204S0000000_16.get$arr$(182));
        } else {
            if (Keva.getRepo("friendslist_permission_keva_name").getLong("contact_upload_next_time_key", 0L) >= System.currentTimeMillis()) {
                return;
            }
            C1056700dbY.LIZIZ(EnumC1074240e3q.COLD_START);
        }
    }
}
