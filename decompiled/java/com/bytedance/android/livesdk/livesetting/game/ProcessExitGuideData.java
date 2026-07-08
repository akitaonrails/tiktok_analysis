package com.bytedance.android.livesdk.livesetting.game;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class ProcessExitGuideData {
    public static final TypeAdapter ADAPTER = new ProcessExitGuideData_OptTypeAdapter(NormalGson.singleton());

    @C09CT("brand")
    public String brand;

    @C09CT("exit_description")
    public List<String> exitDescriptionList;

    @C09CT("exit_reason")
    public List<Integer> exitReasonList;

    public ProcessExitGuideData() {
        this(null, null, null);
    }

    public ProcessExitGuideData(String str, List<Integer> list, List<String> list2) {
        this.brand = str;
        this.exitReasonList = list;
        this.exitDescriptionList = list2;
    }
}
