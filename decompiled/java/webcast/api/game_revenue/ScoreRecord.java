package webcast.api.game_revenue;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class ScoreRecord {

    @C09CT("description")
    public Text description;

    @C09CT("source")
    public int source;

    @C09CT("score")
    public String score = "";

    @C09CT("transaction_time")
    public String transactionTime = "";

    @C09CT("extra")
    public String extra = "";
}
