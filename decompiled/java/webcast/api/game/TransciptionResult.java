package webcast.api.game;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class TransciptionResult {

    @C09CT("duration")
    public long duration;

    @C09CT("utterances")
    public List<Utterance> utterances = new ArrayList();

    @C09CT("language")
    public String language = "";
}
