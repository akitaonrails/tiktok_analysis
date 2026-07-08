package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC1950107kR;
import X.C1169150gWv;
import X.C1169240gX4;
import X.C1950707kX;
import X.C2097608Jq;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes19.dex */
public final class MixVideosAction extends AbstractC1950107kR<Unit> {
    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        String str2;
        String str3;
        String str4;
        String str5;
        Pair[] pairArr = new Pair[1];
        C1169240gX4 c1169240gX4 = new C1169240gX4();
        Object obj = map.get(FollowStatusChangeMethod.PARAM_UID);
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            str2 = null;
        }
        String str6 = "";
        if (str2 == null) {
            Object obj2 = map.get("mix_id");
            if (!(obj2 instanceof String) || (str2 = (String) obj2) == null) {
                str2 = "";
            }
        }
        c1169240gX4.setMixId(str2);
        Object obj3 = map.get("author_id");
        if (!(obj3 instanceof String) || (str3 = (String) obj3) == null) {
            str3 = "";
        }
        c1169240gX4.setMUsrId(str3);
        Object obj4 = map.get("sec_uid");
        if (!(obj4 instanceof String) || (str4 = (String) obj4) == null) {
            str4 = "";
        }
        c1169240gX4.setMSecUid(str4);
        Object obj5 = map.get("source_aid");
        if ((obj5 instanceof String) && (str5 = (String) obj5) != null) {
            c1169240gX4.setMAid(str5);
        }
        c1169240gX4.setMNeedShowDialog(true);
        c1169240gX4.setSearchParam(new C1169150gWv("", -1, "", 0, "", null));
        c1169240gX4.setMVideoFrom("from_profile_mix_list");
        c1169240gX4.setFromShare(true);
        String mixId = c1169240gX4.getMixId();
        if ((mixId instanceof String) && mixId != null) {
            str6 = mixId;
        }
        c1169240gX4.setViewModelKey(str6);
        pairArr[0] = new Pair("mix_video_list_params", c1169240gX4);
        return new Pair<>("//mix/detail", C2097608Jq.LJI(pairArr));
    }
}
