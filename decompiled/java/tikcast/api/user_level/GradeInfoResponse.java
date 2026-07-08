package tikcast.api.user_level;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class GradeInfoResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("grade_config")
        public List<GradeConfig> gradeConfig = new ArrayList();

        @C09CT("user_grade")
        public UserGrade userGrade;
    }
}
