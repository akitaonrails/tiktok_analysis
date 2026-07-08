package com.ss.android.ugc.aweme.shortvideo.edit;

import X.C09CT;
import X.C11NZ;
import X.C570820Ma8;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftMusicPermissionCheckApi {
    public static final /* synthetic */ int LIZ = 0;

    public interface CheckPermissionRequest {
        @InterfaceC1501160pAQ("/tiktok/v1/permission/check/")
        C11NZ<DraftMusicPermissionCheckResponse> checkPermission(@InterfaceC1501070pAH("check_entities") C570820Ma8 c570820Ma8);
    }

    public static final class PermissionCheckEntity implements Serializable {

        @C09CT("check_type")
        public int checkType;

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public String id = "";

        @C09CT("id_type")
        public int idType;

        public final int getCheckType() {
            return this.checkType;
        }

        public final String getId() {
            return this.id;
        }

        public final int getIdType() {
            return this.idType;
        }

        public final void setCheckType(int i) {
            this.checkType = i;
        }

        public final void setId(String str) {
            this.id = str;
        }

        public final void setIdType(int i) {
            this.idType = i;
        }
    }
}
