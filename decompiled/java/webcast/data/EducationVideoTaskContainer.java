package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class EducationVideoTaskContainer {

    @C09CT("video_category_list")
    public List<EducationVideoCategory> videoCategoryList = new ArrayList();

    @C09CT("category_video_map")
    public Map<String, EducationVideoContainer> categoryVideoMap = new LinkedHashMap();

    @C09CT("video_task_map")
    public Map<String, TaskContainer> videoTaskMap = new LinkedHashMap();
}
