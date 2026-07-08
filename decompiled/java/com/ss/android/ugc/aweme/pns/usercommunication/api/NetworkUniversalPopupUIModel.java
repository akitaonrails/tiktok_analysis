package com.ss.android.ugc.aweme.pns.usercommunication.api;

import X.C09CT;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class NetworkUniversalPopupUIModel implements Serializable {

    @C09CT("back_button_close")
    public final Boolean backButtonClose;

    @C09CT("blocks")
    public final List<NetworkUniversalPopupBlock> blocks;

    @C09CT("bottom_pinned_blocks")
    public final List<NetworkUniversalPopupBlock> bottomPinnedBlocks;

    @C09CT("bottom_sheet_height")
    public final float bottomSheetHeight;

    @C09CT("bottom_sheet_max_height")
    public final float bottomSheetMaxHeight;

    @C09CT("dismiss_click_outside")
    public final boolean dismissClickOutside;

    @C09CT("extra")
    public final String extra;

    @C09CT("style")
    public final String style;

    @C09CT("swipe_down_close")
    public final boolean swipeDownClose;

    @C09CT("top_pinned_blocks")
    public final List<NetworkUniversalPopupBlock> topPinnedBlocks;

    @C09CT("upper_left_back")
    public final boolean upperLeftBack;

    @C09CT("upper_right_close")
    public final boolean upperRightClose;

    @C09CT("webview_url")
    public final String webviewUrl;

    @C09CT("webview_ux_option")
    public final Integer webviewUxOption;

    public NetworkUniversalPopupUIModel() {
        this(null, null, null, false, false, false, false, null, null, null, null, 0.0f, 0.0f, null, 16383, null);
    }

    public NetworkUniversalPopupUIModel(String str, String str2, Integer num, boolean z, boolean z2, boolean z3, boolean z4, String str3, List<NetworkUniversalPopupBlock> list, List<NetworkUniversalPopupBlock> list2, List<NetworkUniversalPopupBlock> list3, float f, float f2, Boolean bool) {
        this.style = str;
        this.webviewUrl = str2;
        this.webviewUxOption = num;
        this.upperRightClose = z;
        this.swipeDownClose = z2;
        this.upperLeftBack = z3;
        this.dismissClickOutside = z4;
        this.extra = str3;
        this.topPinnedBlocks = list;
        this.blocks = list2;
        this.bottomPinnedBlocks = list3;
        this.bottomSheetHeight = f;
        this.bottomSheetMaxHeight = f2;
        this.backButtonClose = bool;
    }

    public NetworkUniversalPopupUIModel(String str, String str2, Integer num, boolean z, boolean z2, boolean z3, boolean z4, String str3, List list, List list2, List list3, float f, float f2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "pop" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3, (i & 64) == 0 ? z4 : false, (i & 128) == 0 ? str3 : "", (i & 256) != 0 ? C13BV.INSTANCE : list, (i & 512) != 0 ? C13BV.INSTANCE : list2, (i & 1024) != 0 ? C13BV.INSTANCE : list3, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? -1.0f : f, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? f2 : -1.0f, (i & 8192) == 0 ? bool : null);
    }
}
