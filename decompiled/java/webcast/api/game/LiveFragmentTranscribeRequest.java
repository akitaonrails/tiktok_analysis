package webcast.api.game;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LiveFragmentTranscribeRequest {

    @C09CT("room_id")
    public String roomId = "";

    @C09CT("fragment_id")
    public String fragmentId = "";

    @C09CT("language")
    public String language = "";

    @C09CT("transcribe_fragments")
    public List<TranscribeFragment> transcribeFragments = new ArrayList();
}
