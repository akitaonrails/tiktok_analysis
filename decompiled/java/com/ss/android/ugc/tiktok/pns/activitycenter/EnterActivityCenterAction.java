package com.ss.android.ugc.tiktok.pns.activitycenter;

import X.C1801870wzR;
import X.C1AF0;
import android.net.Uri;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes28.dex */
public final class EnterActivityCenterAction implements IRouteAction {
    public static final C1801870wzR Companion = new Object() { // from class: X.0wzR
    };

    private final String getSchema(String str, String str2, String str3) {
        n nVar;
        n nVarLJJIJ;
        n nVarLJJIJ2;
        String strLJIL;
        Set<Map.Entry<String, k>> setEntrySet;
        Set<Map.Entry<String, k>> setEntrySet2;
        Set<Map.Entry<String, k>> setEntrySet3;
        Set<Map.Entry<String, k>> setEntrySet4;
        String strLJIL2 = null;
        try {
            nVar = (n) SettingsManager.LIZLLL().LJIIIIZZ("activity_center_entrance_v2", n.class, null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            nVar = null;
        }
        if (nVar == null || (nVarLJJIJ = nVar.LJJIJ("special")) == null || (nVarLJJIJ2 = nVarLJJIJ.LJJIJ(str)) == null || (strLJIL = nVar.LJJIJIIJI("schemaPath").LJIL()) == null) {
            return null;
        }
        k kVarLJJIIZ = nVarLJJIJ2.LJJIIZ("url");
        if (kVarLJJIIZ != null) {
            strLJIL2 = kVarLJJIIZ.LJIL();
        }
        Uri.Builder builderBuildUpon = UriProtector.parse(strLJIL2).buildUpon();
        builderBuildUpon.appendQueryParameter("enable_biometrics", str2);
        builderBuildUpon.appendQueryParameter("biometrics_prompt", str3);
        n nVarLJJIJ3 = nVarLJJIJ2.LJJIJ("urlQuery");
        if (nVarLJJIJ3 != null && (setEntrySet4 = nVarLJJIJ3.entrySet()) != null) {
            Iterator<T> it2 = setEntrySet4.iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                builderBuildUpon.appendQueryParameter((String) entry.getKey(), ((k) entry.getValue()).LJIL());
            }
        }
        n nVarLJJIJ4 = nVar.LJJIJ("urlQuery");
        if (nVarLJJIJ4 != null && (setEntrySet3 = nVarLJJIJ4.entrySet()) != null) {
            Iterator<T> it3 = setEntrySet3.iterator();
            while (it3.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it3.next();
                if (nVarLJJIJ3.LJJIJIIJI((String) entry2.getKey()) == null) {
                    builderBuildUpon.appendQueryParameter((String) entry2.getKey(), ((k) entry2.getValue()).LJIL());
                }
            }
        }
        String string = builderBuildUpon.toString();
        Uri.Builder builderBuildUpon2 = UriProtector.parse(strLJIL).buildUpon();
        builderBuildUpon2.appendQueryParameter("url", string);
        n nVarLJJIJ5 = nVar.LJJIJ("schemaQuery");
        if (nVarLJJIJ5 != null && (setEntrySet2 = nVarLJJIJ5.entrySet()) != null) {
            Iterator<T> it4 = setEntrySet2.iterator();
            while (it4.hasNext()) {
                Map.Entry entry3 = (Map.Entry) it4.next();
                builderBuildUpon2.appendQueryParameter((String) entry3.getKey(), ((k) entry3.getValue()).LJIL());
            }
        }
        n nVarLJJIJ6 = nVarLJJIJ2.LJJIJ("schemaQuery");
        if (nVarLJJIJ6 != null && (setEntrySet = nVarLJJIJ6.entrySet()) != null) {
            Iterator<T> it5 = setEntrySet.iterator();
            while (it5.hasNext()) {
                Map.Entry entry4 = (Map.Entry) it5.next();
                builderBuildUpon2.appendQueryParameter((String) entry4.getKey(), ((k) entry4.getValue()).LJIL());
            }
        }
        return builderBuildUpon2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb A[Catch: Exception -> 0x00c5, TRY_LEAVE, TryCatch #0 {Exception -> 0x00c5, blocks: (B:26:0x007a, B:28:0x0080, B:30:0x0083, B:32:0x008b, B:34:0x0091, B:38:0x00a0, B:41:0x00aa, B:43:0x00bb), top: B:49:0x007a }] */
    @Override // com.bytedance.router.route.IRouteAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object open(android.content.Context r12, java.lang.String r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.pns.activitycenter.EnterActivityCenterAction.open(android.content.Context, java.lang.String, android.os.Bundle):java.lang.Object");
    }
}
