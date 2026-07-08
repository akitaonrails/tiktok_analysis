package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.EducationContent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class GetEducationContentResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("education_content")
        public List<EducationContent> educationContent = new ArrayList();
    }
}
