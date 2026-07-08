package webcast.data;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FansClubTeamMissionDetails {

    @C09CT("current_progress")
    public long currentProgress;

    @C09CT("join_status")
    public int joinStatus;

    @C09CT("top_joiner_avatars")
    public List<ImageModel> topJoinerAvatars = new ArrayList();

    @C09CT("mission_stages")
    public List<FansClubTeamMissionStage> missionStages = new ArrayList();
}
