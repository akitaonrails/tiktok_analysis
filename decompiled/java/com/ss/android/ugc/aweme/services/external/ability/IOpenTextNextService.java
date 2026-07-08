package com.ss.android.ugc.aweme.services.external.ability;

import X.C19EG;
import android.os.Bundle;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.services.external.IRecordEnv;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public interface IOpenTextNextService {
    void openTextModeCanvas(IRecordEnv iRecordEnv, int i, Function1<? super Boolean, Unit> function1);

    void openTextModeCanvasV2(C19EG c19eg, Parcelable parcelable);

    void textCanvasGoNext(C19EG c19eg, Bundle bundle);

    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void openTextModeCanvas$default(IOpenTextNextService iOpenTextNextService, IRecordEnv iRecordEnv, int i, Function1 function1, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 4) != 0) {
                    function1 = null;
                }
                iOpenTextNextService.openTextModeCanvas(iRecordEnv, i, function1);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openTextModeCanvas");
        }
    }
}
