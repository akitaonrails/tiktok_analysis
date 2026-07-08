package com.ss.android.ugc.aweme.port.internal;

import X.C861900XrY;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public interface IActivityPageService {
    public static final C861900XrY Companion = new Object() { // from class: X.0XrY
    };

    void listenToCurrentPage(Function2<? super Boolean, ? super String, Unit> function2);

    void updateCurrentScene(String str, boolean z);
}
