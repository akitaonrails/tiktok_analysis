package webcast.api.game;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Utterance {

    @C09CT("end_time")
    public long endTime;

    @C09CT("start_time")
    public long startTime;

    @C09CT("text")
    public String text = "";

    @C09CT("words")
    public List<Word> words = new ArrayList();
}
