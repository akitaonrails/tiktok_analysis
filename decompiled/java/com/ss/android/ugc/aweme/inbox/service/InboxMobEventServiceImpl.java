package com.ss.android.ugc.aweme.inbox.service;

import X.C13LE;
import X.C1598860ri0;
import X.C19719912Dl;
import X.C614770O9j;
import X.EnumC1904390zen;
import X.InterfaceC1891350zJl;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.inbox.api.IInboxMobEventService;
import com.ss.android.ugc.aweme.inbox.assem.InboxEnterMobEventByPushAssem;
import com.ss.android.ugc.aweme.story.inbox.SkylightHighlightsDividerItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public final class InboxMobEventServiceImpl implements IInboxMobEventService {
    @Override // com.ss.android.ugc.aweme.inbox.api.IInboxMobEventService
    public final C19719912Dl LIZ() {
        return C13LE.LIZ(InboxEnterMobEventByPushAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.inbox.api.IInboxMobEventService
    public final long LIZIZ() {
        return EnumC1904390zen.LAUNCH_TO_TAB_INTERVAL.getEventValue();
    }

    @Override // com.ss.android.ugc.aweme.inbox.api.IInboxMobEventService
    public final boolean LIZJ(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (((interfaceC1891350zJl instanceof C1598860ri0) && !((C1598860ri0) interfaceC1891350zJl).LLILLJJLI) || (interfaceC1891350zJl instanceof SkylightHighlightsDividerItem)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.inbox.api.IInboxMobEventService
    public final void LIZLLL(PowerCell<?> powerCell, Function1<? super String, Unit> function1) {
        C614770O9j.LIZIZ.LIZJ().LIZ(powerCell, "notification_page", function1);
    }
}
