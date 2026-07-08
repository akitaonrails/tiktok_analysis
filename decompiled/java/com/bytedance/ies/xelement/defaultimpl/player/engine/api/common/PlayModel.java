package com.bytedance.ies.xelement.defaultimpl.player.engine.api.common;

import X.C09CT;
import X.C1470240oMY;
import X.C1473400oRe;
import X.EnumC1474790oTt;
import X.EnumC2281151EQn;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class PlayModel {

    @C09CT("type")
    public final String encryptType;

    @C09CT("quality")
    public final String quality;

    @C09CT("video_model")
    public final n videoModelJsonObj;

    public PlayModel() {
        this("", "", null);
    }

    public final EnumC2281151EQn getResolution() {
        String str = this.quality;
        return Intrinsics.LJFF(str, EnumC1474790oTt.EXCELLENT.getDesc()) ? EnumC2281151EQn.SuperHigh : Intrinsics.LJFF(str, EnumC1474790oTt.GOOD.getDesc()) ? EnumC2281151EQn.H_High : Intrinsics.LJFF(str, EnumC1474790oTt.REGULAR.getDesc()) ? EnumC2281151EQn.Standard : EnumC2281151EQn.Standard;
    }

    public final C1470240oMY getVideoModel() {
        n nVar = this.videoModelJsonObj;
        if (nVar != null) {
            return makeVideoModel(nVar);
        }
        return null;
    }

    private final boolean isValid(C1473400oRe c1473400oRe) {
        if (c1473400oRe.LJJIJIIJIL == 10) {
            return true;
        }
        return false;
    }

    private final C1470240oMY makeVideoModel(n nVar) {
        try {
            C1470240oMY c1470240oMY = new C1470240oMY();
            C1473400oRe c1473400oRe = new C1473400oRe();
            c1473400oRe.LIZJ(new JSONObject(nVar.toString()));
            if (!isValid(c1473400oRe)) {
                return null;
            }
            c1470240oMY.LJJIJLIJ(c1473400oRe);
            return c1470240oMY;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public PlayModel(String str, String str2, n nVar) {
        this.quality = str;
        this.encryptType = str2;
        this.videoModelJsonObj = nVar;
    }
}
