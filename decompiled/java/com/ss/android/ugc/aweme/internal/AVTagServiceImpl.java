package com.ss.android.ugc.aweme.internal;

import X.C1697810uHb;
import X.C19EG;
import X.C298690BnH;
import X.C298710BnJ;
import X.C737450SwJ;
import X.InterfaceC1631620sYq;
import android.content.Context;
import com.bytedance.router.OnActivityResultCallback;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public final class AVTagServiceImpl implements IAVTagService {
    @Override // com.ss.android.ugc.aweme.internal.IAVTagService
    public final void LIZ() {
        C737450SwJ.LIZIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVTagService
    public final int LIZIZ() {
        return C737450SwJ.LIZIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVTagService
    public final boolean LIZJ(boolean z) {
        if (C298710BnJ.LIZIZ() <= 0 && !C298690BnH.LIZIZ()) {
            return false;
        }
        if (z) {
            if (C298710BnJ.LIZ()) {
                return true;
            }
        } else if (C1697810uHb.LJ(1, 3, 5).contains(Integer.valueOf(C298710BnJ.LIZIZ()))) {
            return true;
        }
        if (C298690BnH.LIZIZ()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVTagService
    public final void LJFF(C19EG c19eg, Function0 function0) {
        C737450SwJ.LIZIZ.LJFF(c19eg, false, function0);
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVTagService
    public final void LIZLLL(C19EG c19eg, String str, int i, List list, InterfaceC1631620sYq interfaceC1631620sYq) {
        C737450SwJ.LIZIZ.LIZLLL(c19eg, str, null, i, list, interfaceC1631620sYq);
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVTagService
    public final void LJ(Context context, String str, int i, List list, OnActivityResultCallback onActivityResultCallback) {
        C737450SwJ.LIZIZ.LIZJ(context, str, null, i, list, onActivityResultCallback);
    }
}
