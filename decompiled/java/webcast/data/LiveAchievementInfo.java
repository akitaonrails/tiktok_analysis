package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LiveAchievementInfo {

    @C09CT("current_value")
    public long currentValue;

    @C09CT("each_level_list")
    public List<LiveAchievementEachLevelInfo> eachLevelList = new ArrayList();

    @C09CT("type")
    public int type;
}
