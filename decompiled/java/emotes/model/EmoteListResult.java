package emotes.model;

import X.C09CT;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class EmoteListResult {

    @C09CT("emote_list")
    public List<EmoteModel> emoteList;

    @C09CT("exist")
    public Boolean exist;

    public List<EmoteModel> getEmoteList() {
        return this.emoteList;
    }

    public void setEmoteList(List<EmoteModel> list) {
        this.emoteList = list;
    }
}
