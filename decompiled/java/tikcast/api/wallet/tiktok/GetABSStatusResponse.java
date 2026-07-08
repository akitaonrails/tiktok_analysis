package tikcast.api.wallet.tiktok;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class GetABSStatusResponse {

    @C09CT("data")
    public ABSData data;

    public static final class ABSData {

        @C09CT("is_abs_on")
        public boolean isAbsOn;

        @C09CT("is_agreed")
        public boolean isAgreed;

        @C09CT("is_eligible")
        public boolean isEligible;

        @C09CT("abs_pipo_avatars")
        public List<String> absPipoAvatars = new ArrayList();

        @C09CT("priority_region")
        public String priorityRegion = "";
    }
}
