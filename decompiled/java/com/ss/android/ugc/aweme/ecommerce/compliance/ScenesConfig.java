package com.ss.android.ugc.aweme.ecommerce.compliance;

import X.C09CT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class ScenesConfig {

    @C09CT("cold_max_show_count")
    public final int coldMaxShowCount;

    @C09CT("dialog_btn_color")
    public final String dialogBtnColor;

    @C09CT("duration")
    public final int duration;

    @C09CT("fe_channels")
    public final List<String> feChannels;

    @C09CT("limit_source")
    public final Map<String, Object> limitSource;

    @C09CT("max_show_count_in_record_day")
    public final int maxShowCountInRecordDay;

    @C09CT("native_paths")
    public final List<String> nativePaths;

    @C09CT("need_dialog")
    public final boolean needDialog;

    @C09CT("need_toast")
    public final boolean needToast;

    @C09CT("page_type")
    public final int pageType;

    @C09CT("record_day")
    public final int recordDay;

    @C09CT("save_type")
    public final Integer saveType;

    @C09CT("scene_name")
    public final String sceneName;

    @C09CT("toast_content")
    public final String toastContent;

    @C09CT("toast_content_id")
    public final String toastContentId;

    @C09CT("toast_icon")
    public final String toastIcon;

    @C09CT("toast_icon_v2")
    public final ToastIcon toastIconV2;

    public ScenesConfig(String str, List<String> list, List<String> list2, int i, int i2, int i3, int i4, Map<String, ? extends Object> map, boolean z, boolean z2, int i5, Integer num, String str2, String str3, String str4, ToastIcon toastIcon, String str5) {
        this.sceneName = str;
        this.feChannels = list;
        this.nativePaths = list2;
        this.coldMaxShowCount = i;
        this.recordDay = i2;
        this.maxShowCountInRecordDay = i3;
        this.duration = i4;
        this.limitSource = map;
        this.needToast = z;
        this.needDialog = z2;
        this.pageType = i5;
        this.saveType = num;
        this.toastContent = str2;
        this.toastContentId = str3;
        this.toastIcon = str4;
        this.toastIconV2 = toastIcon;
        this.dialogBtnColor = str5;
    }
}
