package com.ss.android.ugc.aweme.aigc;

import X.C1221410htD;
import X.C1221710hth;
import X.C1221750htl;
import X.C19EG;
import X.C2215331Bn9;
import X.C2215341BnA;
import X.C2215351BnB;
import X.EnumC1221320ht4;
import X.InterfaceC1221660htc;
import java.util.List;
import kotlin.jvm.internal.AwS385S0200000_19;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes20.dex */
public interface IAIGCAvatarService {
    List<AIGCStyle> LIZ();

    List<AIGCQuota> Vq();

    int Wq();

    C2215331Bn9 Xq(EnumC1221320ht4 enumC1221320ht4, String str, C1221750htl c1221750htl);

    void Yq(C19EG c19eg, AwS385S0200000_19 awS385S0200000_19);

    C2215331Bn9 Zq(EnumC1221320ht4 enumC1221320ht4, JSONArray jSONArray, JSONArray jSONArray2, C1221750htl c1221750htl);

    boolean ar(EnumC1221320ht4 enumC1221320ht4, String str);

    C2215341BnA br(JSONArray jSONArray);

    void cr(EnumC1221320ht4 enumC1221320ht4, C1221750htl c1221750htl);

    C2215351BnB dr(String str);

    int er();

    void fr(EnumC1221320ht4 enumC1221320ht4, InterfaceC1221660htc interfaceC1221660htc);

    C1221710hth gr(EnumC1221320ht4 enumC1221320ht4);

    void hr(EnumC1221320ht4 enumC1221320ht4, C19EG c19eg, Integer num, Integer num2, boolean z, String str, String str2);

    void ir(C19EG c19eg, C1221410htD c1221410htD, List list);

    void jr(C19EG c19eg, EnumC1221320ht4 enumC1221320ht4, String str, String str2, boolean z);
}
