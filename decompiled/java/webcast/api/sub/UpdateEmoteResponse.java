package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class UpdateEmoteResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("emote_list")
        public List<EmoteModel> emoteList = new ArrayList();
    }
}
