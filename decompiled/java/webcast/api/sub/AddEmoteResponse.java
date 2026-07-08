package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AddEmoteResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        /* JADX INFO: renamed from: emotes, reason: collision with root package name */
        @C09CT("emotes")
        public List<EmoteModel> f1038emotes = new ArrayList();

        @C09CT("source")
        public int source;
    }
}
