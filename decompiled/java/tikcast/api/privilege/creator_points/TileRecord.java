package tikcast.api.privilege.creator_points;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes29.dex */
public final class TileRecord {

    @C09CT("bill_id")
    public String billId = "";

    @C09CT("created_at")
    public long createdAt;

    @C09CT("expired_at")
    public long expiredAt;

    @C09CT("is_expired")
    public boolean isExpired;

    @C09CT("last_updated_at")
    public long lastUpdatedAt;

    @C09CT("record_status")
    public int recordStatus;

    @C09CT("task_title")
    public Text taskTitle;

    @C09CT("tiles")
    public long tiles;
}
