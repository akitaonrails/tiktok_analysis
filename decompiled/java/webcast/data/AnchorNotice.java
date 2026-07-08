package webcast.data;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorNotice {

    @C09CT("icon")
    public ImageModel icon;

    @C09CT("notice_id")
    public long noticeId;

    @C09CT("notice_type")
    public int noticeType;

    @C09CT("priority")
    public long priority;

    @C09CT("content")
    public String content = "";

    @C09CT("link")
    public String link = "";

    @C09CT("content_type")
    public String contentType = "";

    @C09CT("freq_ctrl")
    public List<AnchorNoticeFreq> freqCtrl = new ArrayList();

    @C09CT("action_ctrl")
    public List<AnchorNoticeAction> actionCtrl = new ArrayList();

    @C09CT("extra")
    public Map<String, String> extra = new LinkedHashMap();
}
