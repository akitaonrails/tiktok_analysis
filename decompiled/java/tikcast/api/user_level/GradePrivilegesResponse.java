package tikcast.api.user_level;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class GradePrivilegesResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("event_data")
        public EventData eventData;

        @C09CT("invitation_info")
        public InvitationDetailInfo invitationInfo;

        @C09CT("shop_data")
        public ShopData shopData;

        @C09CT("user_grade")
        public UserGrade userGrade;

        @C09CT("tab_list")
        public List<GradeTab> tabList = new ArrayList();

        @C09CT("persona_data_list")
        public List<PersonaData> personaDataList = new ArrayList();
    }
}
