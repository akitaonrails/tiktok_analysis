package com.ss.android.ugc.aweme.outreach.dispersion.data;

import X.C123100dR;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.r;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AwS432S0200000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class SyncOutreachSerializer implements r<SyncOutreachModel> {
    @Override // com.google.gson.r
    public final k LIZ(Object obj, Type type, TreeTypeAdapter.a aVar) {
        SyncOutreachModel syncOutreachModel = (SyncOutreachModel) obj;
        n nVar = new n();
        String str = syncOutreachModel.key;
        AwS432S0200000_31 awS432S0200000_31 = new AwS432S0200000_31(nVar, syncOutreachModel, 112);
        if (C123100dR.LIZ(str)) {
            awS432S0200000_31.invoke();
        }
        String str2 = syncOutreachModel.outreachType;
        AwS432S0200000_31 awS432S0200000_312 = new AwS432S0200000_31(nVar, syncOutreachModel, 113);
        if (C123100dR.LIZ(str2)) {
            awS432S0200000_312.invoke();
        }
        String str3 = syncOutreachModel.outreachScene;
        AwS432S0200000_31 awS432S0200000_313 = new AwS432S0200000_31(nVar, syncOutreachModel, 114);
        if (C123100dR.LIZ(str3)) {
            awS432S0200000_313.invoke();
        }
        String str4 = syncOutreachModel.sessionId;
        AwS432S0200000_31 awS432S0200000_314 = new AwS432S0200000_31(nVar, syncOutreachModel, 115);
        if (C123100dR.LIZ(str4)) {
            awS432S0200000_314.invoke();
        }
        Long l = syncOutreachModel.outreachTime;
        AwS432S0200000_31 awS432S0200000_315 = new AwS432S0200000_31(nVar, syncOutreachModel, 116);
        if (l != null) {
            awS432S0200000_315.invoke();
        }
        String str5 = syncOutreachModel.triggerId;
        AwS432S0200000_31 awS432S0200000_316 = new AwS432S0200000_31(nVar, syncOutreachModel, 117);
        if (C123100dR.LIZ(str5)) {
            awS432S0200000_316.invoke();
        }
        return nVar;
    }
}
