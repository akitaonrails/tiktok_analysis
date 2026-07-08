package webcast.data;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class TPTaskProgressItem {

    @C09CT("task_progress_blocks")
    public List<TPTaskProgressBlock> taskProgressBlocks = new ArrayList();

    @C09CT("task_progress_bar")
    public List<ImageModel> taskProgressBar = new ArrayList();

    public static final class TPTaskProgressBlock {

        @C09CT("sub_title")
        public TPText subTitle;

        @C09CT("title")
        public TPText title;
    }
}
