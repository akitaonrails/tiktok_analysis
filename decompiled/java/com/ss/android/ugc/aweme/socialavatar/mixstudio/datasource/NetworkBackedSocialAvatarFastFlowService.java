package com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource;

import X.AnonymousClass0951;
import X.C01GW;
import X.C05YD;
import X.C09IC;
import X.C1341305Mt;
import X.C1910890zpH;
import X.C2188811AlT;
import X.C439030HJl;
import X.C439090HJr;
import X.C452501pT;
import X.InterfaceC439080HJq;
import com.ss.android.ugc.aweme.socialavatar.api.SocialAvatarFastFlowService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class NetworkBackedSocialAvatarFastFlowService implements SocialAvatarFastFlowService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(137));
    public final Map<String, C439030HJl> LIZIZ = new LinkedHashMap();

    public final C1910890zpH LJFF() {
        return (C1910890zpH) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.api.SocialAvatarFastFlowService
    public final C05YD<InterfaceC439080HJq> LIZIZ(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LIZIZ;
        Object obj = linkedHashMap.get(str);
        Object obj2 = obj;
        if (obj == null) {
            C439030HJl c439030HJl = new C439030HJl(LJFF());
            c439030HJl.LIZLLL(false);
            linkedHashMap.put(str, c439030HJl);
            obj2 = c439030HJl;
        }
        AnonymousClass0951 anonymousClass0951LIZIZ = C09IC.LIZIZ(((C439030HJl) obj2).LIZJ);
        C1910890zpH c1910890zpHLJFF = LJFF();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getState: userId: ");
        sbLIZ.append(str);
        sbLIZ.append(", ");
        sbLIZ.append(anonymousClass0951LIZIZ.getValue());
        c1910890zpHLJFF.LJI("NetworkBackedSocialAvatarFastFlowService", C2188811AlT.LIZIZ(sbLIZ));
        return anonymousClass0951LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.api.SocialAvatarFastFlowService
    public final void LIZJ(String str) {
        C439030HJl c439030HJl = (C439030HJl) ((LinkedHashMap) this.LIZIZ).get(str);
        if (c439030HJl != null) {
            c439030HJl.LIZJ.compareAndSet(C439090HJr.LIZ, C1341305Mt.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.api.SocialAvatarFastFlowService
    public final C05YD<InterfaceC439080HJq> LJ(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LIZIZ;
        Object c439030HJl = linkedHashMap.get(str);
        if (c439030HJl == null) {
            c439030HJl = new C439030HJl(LJFF());
            linkedHashMap.put(str, c439030HJl);
        }
        C439030HJl c439030HJl2 = (C439030HJl) c439030HJl;
        c439030HJl2.LIZLLL(false);
        AnonymousClass0951 anonymousClass0951LIZIZ = C09IC.LIZIZ(c439030HJl2.LIZJ);
        C1910890zpH c1910890zpHLJFF = LJFF();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("queryState: ");
        sbLIZ.append(str);
        sbLIZ.append(", ");
        sbLIZ.append(anonymousClass0951LIZIZ.getValue());
        c1910890zpHLJFF.LJI("NetworkBackedSocialAvatarFastFlowService", C2188811AlT.LIZIZ(sbLIZ));
        return anonymousClass0951LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.api.SocialAvatarFastFlowService
    public final void LIZ(String str, InterfaceC439080HJq interfaceC439080HJq) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LIZIZ;
        Object c439030HJl = linkedHashMap.get(str);
        if (c439030HJl == null) {
            c439030HJl = new C439030HJl(LJFF());
            linkedHashMap.put(str, c439030HJl);
        }
        ((C439030HJl) c439030HJl).LIZJ.setValue(interfaceC439080HJq);
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.api.SocialAvatarFastFlowService
    public final void LIZLLL(String str, boolean z) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LIZIZ;
        Object c439030HJl = linkedHashMap.get(str);
        if (c439030HJl == null) {
            c439030HJl = new C439030HJl(LJFF());
            linkedHashMap.put(str, c439030HJl);
        }
        ((C439030HJl) c439030HJl).LIZLLL(z);
    }
}
