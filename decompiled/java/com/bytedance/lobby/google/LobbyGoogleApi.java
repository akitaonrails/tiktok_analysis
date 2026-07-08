package com.bytedance.lobby.google;

import X.AbstractC19484711Kz;
import X.C09CT;
import X.C0X8N;
import X.C1515120pWw;
import X.C2188811AlT;
import X.C2336109Dj;
import X.C2396409aE;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501310pAf;
import X.InterfaceC1501350pAj;
import X.InterfaceC837580WtQ;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes24.dex */
public final class LobbyGoogleApi {
    public static final GoogleApi LIZ = (GoogleApi) C1515120pWw.LJII(C1515120pWw.LJFF("https://www.googleapis.com", null, C2336109Dj.LJI(), C2396409aE.LIZIZ(), null), GoogleApi.class);

    public interface GoogleApi {
        @InterfaceC1501160pAQ("/userinfo/v2/me")
        @InterfaceC1501310pAf({"x-tt-dataflow-id: 671088897"})
        AbstractC19484711Kz<UserInfoResponse> getUserInfo(@InterfaceC1501350pAj("Authorization") String str);
    }

    @C0X8N
    public interface GoogleApiV2 {
        @InterfaceC1501160pAQ("https://www.googleapis.com/userinfo/v2/me")
        @InterfaceC837580WtQ(671088897)
        AbstractC19484711Kz<UserInfoResponse> getUserInfo(@InterfaceC1501350pAj("Authorization") String str);
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static class UserInfoResponse {

        @C09CT("family_name")
        public String familyName;

        @C09CT("given_name")
        public String givenName;

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public String id;

        @C09CT("locale")
        public String locale;

        @C09CT("name")
        public String name;

        @C09CT("picture")
        public String picture;

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("UserInfoResponse{id='");
            sbLIZ.append(this.id);
            sbLIZ.append('\'');
            sbLIZ.append(", name='");
            sbLIZ.append(this.name);
            sbLIZ.append('\'');
            sbLIZ.append(", givenName='");
            sbLIZ.append(this.givenName);
            sbLIZ.append('\'');
            sbLIZ.append(", familyName='");
            sbLIZ.append(this.familyName);
            sbLIZ.append('\'');
            sbLIZ.append(", picture='");
            sbLIZ.append(this.picture);
            sbLIZ.append('\'');
            sbLIZ.append(", locale='");
            sbLIZ.append(this.locale);
            sbLIZ.append('\'');
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
