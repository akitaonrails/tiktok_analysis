package com.ss.android.ugc.aweme.portrait.service;

import X.C054G;
import X.C095D;
import X.C099R;
import X.C09A1;
import X.C09IR;
import X.C0PEM;
import X.C2252331DDr;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C550600Lic;
import X.C550630Lif;
import X.InterfaceC1364105Vn;
import X.InterfaceC346201Wa;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitImageUploadResult;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class AIPortraitFileServiceImpl implements IAIPortraitFileService {
    public final C054G LIZIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public final C2252331DDr LIZJ = C09IR.LIZIZ(0, 64, null, 5);
    public final ConcurrentHashMap<String, AIPortraitImageUploadResult> LIZLLL = new ConcurrentHashMap<>();

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitFileService
    public final String Kd(String str) {
        String string = UUID.randomUUID().toString();
        C23250099c.LIZLLL(this.LIZIZ, null, null, new C550600Lic(this, string, str, null), 3);
        return string;
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitFileService
    public final InterfaceC346201Wa<AIPortraitImageUploadResult> Ld(String str) {
        return new C095D(new C550630Lif(this, str, null));
    }

    public final Object LIZ(AIPortraitImageUploadResult aIPortraitImageUploadResult, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        this.LIZLLL.put(aIPortraitImageUploadResult.uploadId, aIPortraitImageUploadResult);
        Object objEmit = this.LIZJ.emit(aIPortraitImageUploadResult, interfaceC1364105Vn);
        if (objEmit == C099R.LJFF()) {
            return objEmit;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r17, java.lang.String r18, java.lang.String r19, X.InterfaceC1364105Vn<? super java.lang.String> r20) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.portrait.service.AIPortraitFileServiceImpl.LIZIZ(java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
