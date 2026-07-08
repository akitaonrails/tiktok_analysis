package webcast.api.game;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.PersonaCombine;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GetPersonaCombineResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("combines")
        public List<PersonaCombine> combines = new ArrayList();
    }
}
