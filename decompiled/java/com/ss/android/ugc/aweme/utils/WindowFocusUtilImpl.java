package com.ss.android.ugc.aweme.utils;

import X.C783060Ung;
import com.ss.android.ugc.aweme.IWindowFocusUtil;

/* JADX INFO: loaded from: classes17.dex */
public final class WindowFocusUtilImpl implements IWindowFocusUtil {
    @Override // com.ss.android.ugc.aweme.IWindowFocusUtil
    public final void LIZ(boolean z) {
        C783060Ung.LIZ.onNext(Boolean.valueOf(z));
    }
}
