package webcast.data;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class TPActivityDetail {

    @C09CT("background")
    public TouchPointBackground background;

    @C09CT("border_radius")
    public int borderRadius;

    @C09CT("reward_image")
    public ImageModel rewardImage;

    @C09CT("task_progress")
    public List<TPTaskProgressItem> taskProgress = new ArrayList();
}
