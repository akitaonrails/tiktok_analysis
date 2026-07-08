package com.ss.android.ugc.aweme.services.edit;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes14.dex */
public interface IMuteStripApiService {
    boolean checkAndResetFlag();

    void setFlag();

    void startMuteStrip(String str, Function1<? super Boolean, Unit> function1, Function1<? super String, Unit> function12);

    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startMuteStrip$default(IMuteStripApiService iMuteStripApiService, String str, Function1 function1, Function1 function12, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    function1 = null;
                }
                if ((i & 4) != 0) {
                    function12 = null;
                }
                iMuteStripApiService.startMuteStrip(str, function1, function12);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startMuteStrip");
        }
    }
}
