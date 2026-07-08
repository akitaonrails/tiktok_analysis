package com.ss.android.ugc.profile.business.ad.platform.business;

import X.C08JS;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.profile.business.ad.platform.BioContactData;

/* JADX INFO: loaded from: classes20.dex */
public final class BioStructuralBAContactProtocol extends BioStructuralBABaseProtocol<BioContactData> {
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "bio_business_account_phone";
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017b  */
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJII(android.view.View r21) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ad.platform.business.BioStructuralBAContactProtocol.LJII(android.view.View):boolean");
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        BioContactData bioContactData;
        try {
            bioContactData = (BioContactData) C08JS.LIZ(nVar.toString(), BioContactData.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
            bioContactData = null;
        }
        this.LLJILJIL = bioContactData;
    }
}
