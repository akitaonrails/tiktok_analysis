package webcast.data.oec_msg;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CarouselCfg {

    @C09CT("interval_ms")
    public long intervalMs;

    @C09CT("text_status_list")
    public List<Integer> textStatusList = new ArrayList();

    @C09CT("times")
    public int times;
}
