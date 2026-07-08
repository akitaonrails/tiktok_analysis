package com.ss.android.ugc.aweme.notice.api;

import X.C0C64;
import X.C0CO3;
import X.C0X4D;
import X.C800010VZv;
import X.EnumC799980VZs;
import X.InterfaceC800130Va7;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class NoticeCountFetchManager$coldStartCombineRequest$1 implements InterfaceC800130Va7 {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "NoticeCountFetchManager$coldStartCombineRequest$1";
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
        return C0C64.LJIILLIIL().LJIIZILJ(31744, 0, 2, "inbox_notice_count_delay", true) == 1 ? C0CO3.BOOT_FINISH : C0CO3.NORMAL;
    }

    @Override // X.InterfaceC800130Va7
    public final void LJI(Context context, boolean z) {
        C0X4D.LIZ.getClass();
        C0X4D.LIZ(1, false);
    }
}
