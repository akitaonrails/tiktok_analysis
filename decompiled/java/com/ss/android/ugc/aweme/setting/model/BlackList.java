package com.ss.android.ugc.aweme.setting.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class BlackList extends BaseResponse {

    @C09CT("block_list")
    public List<User> blockList;

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("hotsoon_filtered_count")
    public int hotsoonFilteredCount;

    @C09CT("hotsoon_has_more")
    public int hotsoonHasMore;

    @C09CT("hotsoon_text")
    public String hotsoonText;

    @C09CT("index")
    public int index;

    @C09CT("total")
    public int total;

    @C09CT("block_sources")
    public List<UserBlockSource> userBlockSources;

    public final List<UserWithBlockSource> LJ() {
        HashMap map = new HashMap();
        List<UserBlockSource> list = this.userBlockSources;
        if (list != null) {
            for (UserBlockSource userBlockSource : list) {
                map.put(userBlockSource.userId, Integer.valueOf(userBlockSource.blockingByType));
            }
        }
        ArrayList arrayList = new ArrayList();
        List<User> list2 = this.blockList;
        if (list2 != null) {
            for (User user : list2) {
                Integer num = (Integer) map.get(user.getUid());
                arrayList.add(new UserWithBlockSource(num == null ? 0 : num.intValue(), user));
            }
        }
        return arrayList;
    }
}
