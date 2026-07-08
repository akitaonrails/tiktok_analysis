package com.ss.android.ugc.aweme.im.streak.impl.pet.fe;

import X.C06E8;
import X.C13LE;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.im.streak.impl.pet.fe.event.StreakJsEventHandler;
import kotlin.jvm.internal.AFwS229S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakJSEventLogHandler extends StreakJsEventHandler<C06E8> {
    public static final StreakJSEventLogHandler LLILZ = new StreakJSEventLogHandler();

    @Override // com.ss.android.ugc.aweme.im.streak.impl.pet.fe.event.StreakJsEventHandler, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public StreakJSEventLogHandler() {
        super("StreakPetJsEventLogHandler", C13LE.LIZ(C06E8.class), AFwS229S0000000_2.get$arr$(329));
    }
}
