package com.ss.android.ugc.aweme.services.mediachoose;

import X.InterfaceC1294060jmO;
import X.InterfaceC1631630sYr;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public interface IVideoLegalCheckerAndToastService {
    void isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, int i, int i2, Function2<? super String, ? super Long, Unit> function2, InterfaceC1631630sYr<? super String, ? super Long, ? super Integer, ? super String, Unit> interfaceC1631630sYr);

    @InterfaceC1294060jmO
    void isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, int i, Function0<Unit> function0);
}
