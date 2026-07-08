package com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolposts.et;

import X.AbstractC1386130mAt;
import X.C19719512Dh;
import X.C2241008qG;
import X.C2344009Gk;
import android.os.BaseBundle;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friends.model.SchoolMutualStruct;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.ur.school.mob.ISchoolPostMob;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class SchoolPostMobImpl implements ISchoolPostMob {
    @Override // com.ss.android.ugc.ur.school.mob.ISchoolPostMob
    public final Object LIZIZ(Aweme aweme, Object obj) throws JSONException {
        User author;
        MatchedFriendStruct matchedFriendStruct;
        SchoolMutualStruct schoolMutualStruct;
        String str;
        if (aweme != null && (author = aweme.getAuthor()) != null && (matchedFriendStruct = author.getMatchedFriendStruct()) != null && (schoolMutualStruct = matchedFriendStruct.schoolMutualStruct) != null) {
            int i = schoolMutualStruct.schoolContentType;
            String str2 = null;
            if (i != 1) {
                if (i != 2) {
                    str = null;
                } else {
                    str = "college_related_post";
                }
            } else {
                str = "college_member_post";
            }
            int i2 = schoolMutualStruct.viewerVerifyStatus;
            if (i2 != 1) {
                if (i2 == 2) {
                    str2 = "potential";
                }
            } else {
                str2 = "verified";
            }
            LIZJ(obj, "school_content_type", str);
            LIZJ(obj, "school_consumer_type", str2);
        }
        return obj;
    }

    public static void LIZJ(Object obj, String str, Object obj2) throws JSONException {
        Map map;
        if (obj instanceof AbstractC1386130mAt) {
            if (obj2 instanceof String) {
                ((AbstractC1386130mAt) obj).LJ(str, (String) obj2);
                return;
            }
            if (obj2 instanceof Integer) {
                ((AbstractC1386130mAt) obj).LIZLLL(((Number) obj2).intValue(), str);
                return;
            } else if (obj2 instanceof Boolean) {
                ((AbstractC1386130mAt) obj).LJI(str, ((Boolean) obj2).booleanValue());
                return;
            } else {
                ((AbstractC1386130mAt) obj).LJ(str, String.valueOf(obj2));
                return;
            }
        }
        if (obj instanceof C2241008qG) {
            if (obj2 instanceof String) {
                ((C2241008qG) obj).LIZLLL(str, (String) obj2);
                return;
            }
            if (obj2 instanceof Integer) {
                ((C2241008qG) obj).LIZIZ((Integer) obj2, str);
                return;
            } else if (obj2 instanceof Boolean) {
                ((C2241008qG) obj).LIZ((Boolean) obj2, str);
                return;
            } else {
                ((C2241008qG) obj).LIZLLL(str, String.valueOf(obj2));
                return;
            }
        }
        if (obj instanceof C2344009Gk) {
            if (obj2 instanceof String) {
                ((C2344009Gk) obj).LJFF(str, (String) obj2);
                return;
            }
            if (obj2 instanceof Integer) {
                ((C2344009Gk) obj).LIZJ(((Number) obj2).intValue(), str);
                return;
            } else if (obj2 instanceof Boolean) {
                ((C2344009Gk) obj).LJ(obj2, str);
                return;
            } else {
                ((C2344009Gk) obj).LJFF(str, String.valueOf(obj2));
                return;
            }
        }
        if (obj instanceof JSONObject) {
            if (obj2 instanceof String) {
                ((JSONObject) obj).put(str, obj2);
                return;
            }
            if (obj2 instanceof Integer) {
                ((JSONObject) obj).put(str, ((Number) obj2).intValue());
                return;
            } else if (obj2 instanceof Boolean) {
                ((JSONObject) obj).put(str, ((Boolean) obj2).booleanValue());
                return;
            } else {
                ((JSONObject) obj).put(str, String.valueOf(obj2));
                return;
            }
        }
        if (obj instanceof Bundle) {
            if (obj2 instanceof String) {
                ((BaseBundle) obj).putString(str, (String) obj2);
                return;
            } else {
                if (!(obj2 instanceof Integer)) {
                    return;
                }
                ((BaseBundle) obj).putInt(str, ((Number) obj2).intValue());
                return;
            }
        }
        if (!C19719512Dh.LJII(obj) || !C19719512Dh.LJII(obj) || (map = (Map) obj) == null) {
            return;
        }
        if (obj2 == null) {
            obj2 = "";
        }
        map.put(str, obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    @Override // com.ss.android.ugc.ur.school.mob.ISchoolPostMob
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r5, java.lang.Object r6, java.lang.String r7, java.lang.String r8) throws org.json.JSONException {
        /*
            r4 = this;
            r2 = 1
            java.lang.String r3 = "school_tab_name"
            if (r5 == 0) goto L2d
            java.util.HashMap r0 = r5.getMobParams()
            if (r0 == 0) goto L2d
            boolean r0 = r0.containsKey(r3)
            if (r0 != r2) goto L2d
            r0 = 1
        L12:
            r1 = 0
            if (r0 == 0) goto L22
            java.util.HashMap r0 = r5.getMobParams()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r0.get(r3)
        L1f:
            LIZJ(r6, r3, r0)
        L22:
            java.lang.String r0 = "school_community_page"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r0)
            if (r0 != 0) goto L2f
            return r6
        L2b:
            r0 = r1
            goto L1f
        L2d:
            r0 = 0
            goto L12
        L2f:
            boolean r0 = X.C1533950q1J.LJ(r8)
            if (r0 == 0) goto L50
            if (r5 == 0) goto L3b
            java.lang.String r1 = r5.getAid()
        L3b:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r1)
            if (r0 != 0) goto L50
        L41:
            java.lang.String r1 = "school_is_inner"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            LIZJ(r6, r1, r0)
            java.lang.String r0 = "school_innerfeed_entrance_group_id"
            LIZJ(r6, r0, r8)
            return r6
        L50:
            r2 = 0
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolposts.et.SchoolPostMobImpl.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Object, java.lang.String, java.lang.String):java.lang.Object");
    }
}
