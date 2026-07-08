package com.bytedance.pipo.verify.base.model;

import X.C09CT;
import X.C13LP;
import X.C1713640uh8;
import X.C309810CCl;
import X.C309820CCm;
import Y.AComparatorS45S0000000_26;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class DTOVerifyInfo {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("action_type")
    public final String actionType;

    @C09CT("is_progressive")
    public final k isProgressiveRaw;

    @C09CT("verify_candidate")
    public final k rawVerifyInfoCandidates;

    @C09CT("switch_candidate")
    public final k switchCandidateRaw;

    @C09CT("verify_detail")
    public final k verifyDetailRaw;

    @C09CT("verify_id")
    public final String verifyId;

    @C09CT("verify_type")
    public final String verifyType;

    public DTOVerifyInfo() {
        this(null, null, null, null, null, null, null);
    }

    public final boolean LIZ() {
        return C309810CCl.LIZIZ(this.switchCandidateRaw);
    }

    public final C1713640uh8 LIZIZ() {
        String str;
        VerifyDetail verifyDetail = (VerifyDetail) C309810CCl.LIZJ(this.verifyDetailRaw, VerifyDetail.class);
        if (verifyDetail == null || (str = this.verifyType) == null || !(!a0.LJJJIL(str))) {
            return null;
        }
        String str2 = this.actionType;
        return new C1713640uh8(str, str2, verifyDetail, str2, 2);
    }

    public final List<C1713640uh8> LIZJ() {
        k kVarLIZ = C309810CCl.LIZ(this.rawVerifyInfoCandidates);
        if (kVarLIZ == null) {
            return null;
        }
        if (!(kVarLIZ instanceof h) || kVarLIZ.LJIIL().size() != 0) {
            Type type = new TypeToken<List<? extends RawDTOVerifyInfoCandidate>>() { // from class: X.0uhA
            }.getType();
            try {
                Gson gson = C309820CCm.LIZ;
                List listLJLLLL = C13LP.LJLLLL(new AComparatorS45S0000000_26(0), (Iterable) GsonProtectorUtils.fromJson(C309820CCm.LIZ, kVarLIZ, type));
                ArrayList arrayList = new ArrayList();
                Iterator it2 = listLJLLLL.iterator();
                while (it2.hasNext()) {
                    C1713640uh8 c1713640uh8LIZ = ((RawDTOVerifyInfoCandidate) it2.next()).LIZ();
                    if (c1713640uh8LIZ != null) {
                        arrayList.add(c1713640uh8LIZ);
                    }
                }
                if (!arrayList.isEmpty()) {
                    return arrayList;
                }
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    public final boolean LIZLLL() {
        return C309810CCl.LIZIZ(this.isProgressiveRaw);
    }

    public DTOVerifyInfo(String str, String str2, String str3, k kVar, k kVar2, k kVar3, k kVar4) {
        this.verifyId = str;
        this.verifyType = str2;
        this.actionType = str3;
        this.switchCandidateRaw = kVar;
        this.isProgressiveRaw = kVar2;
        this.verifyDetailRaw = kVar3;
        this.rawVerifyInfoCandidates = kVar4;
    }
}
