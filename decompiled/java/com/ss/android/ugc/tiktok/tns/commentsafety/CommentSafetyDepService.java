package com.ss.android.ugc.tiktok.tns.commentsafety;

import X.AbstractC1387200mCc;
import X.C11NZ;
import X.C1388190mED;
import X.C1906580ziK;
import X.C2209171BdD;
import X.C632140Oqq;
import X.InterfaceC1888230zEj;
import android.app.Activity;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class CommentSafetyDepService implements ICommentSafetyDepService {
    @Override // com.ss.android.ugc.tiktok.tns.commentsafety.ICommentSafetyDepService
    public final boolean LIZJ() {
        return true;
    }

    @Override // com.ss.android.ugc.tiktok.tns.commentsafety.ICommentSafetyDepService
    public final boolean LIZIZ() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("privacy_setting_filter_all_new_version", false);
    }

    @Override // com.ss.android.ugc.tiktok.tns.commentsafety.ICommentSafetyDepService
    public final Activity getTopActivity() {
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
        if (abstractC1387200mCcLJFF == null || (activityLIZIZ = abstractC1387200mCcLJFF.LIZIZ()) == null) {
            return null;
        }
        return C1388190mED.LIZ(activityLIZIZ);
    }

    @Override // com.ss.android.ugc.tiktok.tns.commentsafety.ICommentSafetyDepService
    public final InterfaceC1888230zEj LIZLLL() {
        return C2209171BdD.LIZ;
    }

    @Override // com.ss.android.ugc.tiktok.tns.commentsafety.ICommentSafetyDepService
    public final <T> C11NZ<T> LIZ(C11NZ<T> c11nz, String str, Map<String, String> map) {
        return C632140Oqq.LIZLLL(c11nz, str, map);
    }
}
