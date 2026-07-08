package com.ss.android.ugc.aweme.mix.services;

import X.AbstractC1386130mAt;
import X.C098200Yq;
import X.C0COU;
import X.C0LAB;
import X.C189200o6;
import X.C2241008qG;
import X.C2344009Gk;
import X.InterfaceC1210900hcG;
import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class PlaylistETServiceImpl implements IPlaylistETService {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.mix.services.IPlaylistETService
    public final <T> T LIZ(T t, String str) {
        Object objAppendQueryParameter;
        if (Intrinsics.LJFF(str, "playlist") && C0COU.LIZ()) {
            try {
                if (!(t instanceof AbstractC1386130mAt)) {
                    if (t instanceof C2241008qG) {
                        C2241008qG c2241008qG = (C2241008qG) t;
                        c2241008qG.LIZ.put("playlist_enter_method", "playlist_item");
                        objAppendQueryParameter = c2241008qG;
                    } else if (t instanceof C2344009Gk) {
                        C2344009Gk c2344009Gk = (C2344009Gk) t;
                        c2344009Gk.getClass();
                        c2344009Gk.LJIIIIZZ("playlist_enter_method", "playlist_item");
                        objAppendQueryParameter = c2344009Gk;
                    } else if (t instanceof C0LAB) {
                        C0LAB c0lab = (C0LAB) t;
                        c0lab.LJ("playlist_enter_method", "playlist_item");
                        objAppendQueryParameter = c0lab;
                    } else if (t instanceof JSONObject) {
                        objAppendQueryParameter = ((JSONObject) t).put("playlist_enter_method", "playlist_item");
                    } else if (t instanceof Uri.Builder) {
                        objAppendQueryParameter = ((Uri.Builder) t).appendQueryParameter("playlist_enter_method", "playlist_item");
                    } else {
                        objAppendQueryParameter = Unit.LIZ;
                    }
                } else {
                    AbstractC1386130mAt abstractC1386130mAt = (AbstractC1386130mAt) t;
                    abstractC1386130mAt.getClass();
                    abstractC1386130mAt.LJFF("playlist_enter_method", "playlist_item", InterfaceC1210900hcG.LIZ);
                    objAppendQueryParameter = abstractC1386130mAt;
                }
                C189200o6.m2constructorimpl(objAppendQueryParameter);
                return t;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        return t;
    }
}
