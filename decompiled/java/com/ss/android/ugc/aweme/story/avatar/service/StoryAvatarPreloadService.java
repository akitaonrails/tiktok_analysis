package com.ss.android.ugc.aweme.story.avatar.service;

import X.C20270314Td;
import X.InterfaceC20270614Tg;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class StoryAvatarPreloadService implements IStoryAvatarPreloadService {
    public C20270314Td LIZIZ;
    public String LIZJ;
    public LifecycleOwner LIZLLL;
    public Function2<? super Boolean, ? super Boolean, Unit> LJ;

    @Override // com.ss.android.ugc.aweme.story.avatar.service.IStoryAvatarPreloadService
    public final boolean LIZ(LifecycleOwner lifecycleOwner, MutableLiveData mutableLiveData, InterfaceC20270614Tg interfaceC20270614Tg, String str, Function0 function0, Function0 function02, Function1 function1, Function2 function2) {
        C20270314Td c20270314Td = this.LIZIZ;
        if (c20270314Td != null) {
            if (Intrinsics.LJFF(str, this.LIZJ) && Intrinsics.LJFF(lifecycleOwner, this.LIZLLL)) {
                return c20270314Td.LIZJ();
            }
            c20270314Td.LIZ("service_replaced");
        }
        if (function0 != null) {
            function0.invoke();
        }
        C20270314Td c20270314Td2 = new C20270314Td(lifecycleOwner, mutableLiveData, interfaceC20270614Tg, str, function02, new AwS574S0100000_30(this, 436), function1, function2);
        if (!c20270314Td2.LIZJ()) {
            return false;
        }
        this.LIZIZ = c20270314Td2;
        this.LIZJ = str;
        this.LIZLLL = lifecycleOwner;
        this.LJ = function2;
        return true;
    }
}
