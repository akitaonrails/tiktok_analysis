package com.ss.android.ugc.aweme.pns.universalpopup.core.model;

import X.C09CT;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class UniversalPopup implements Serializable {

    @C09CT("align")
    public final String align;

    @C09CT("back_button_close")
    public final Boolean backButtonClose;

    @C09CT("blocks")
    public final List<UniversalPopupBlock> blocks;

    @C09CT("body")
    public final String body;

    @C09CT("bottom_pinned_blocks")
    public final List<UniversalPopupBlock> bottomPinnedBlocks;

    @C09CT("bottom_sheet_height")
    public final float bottomSheetHeight;

    @C09CT("bottom_sheet_max_height")
    public final float bottomSheetMaxHeight;

    @C09CT("business")
    public final String business;

    @C09CT("buttons")
    public final List<UniversalPopupButton> buttons;

    @C09CT("dismiss_click_outside")
    public final Boolean dismissClickOutside;

    @C09CT("extra")
    public final Map<String, String> extra;

    @C09CT("first_button_highlight")
    public final Boolean firstButtonHighlight;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("icon_url_dark")
    public final String iconUrlDark;

    @C09CT("is_compliance")
    public final boolean isCompliance;

    @C09CT("is_dispatch_blocks")
    public final boolean isDispatchBlocks;

    @C09CT("sub_pop_up")
    public final Boolean isSubPopUp;

    @C09CT("policy_version")
    public final String policyVersion;

    @C09CT("popup_id")
    public final String popupId;

    @C09CT("body_link_list")
    public final List<UniversalPopupBodyLinkList> popupLinkList;

    @C09CT("style")
    public final String style;

    @C09CT("style_extra")
    public final StyleExtra styleExtra;

    @C09CT("swipe_down_close")
    public final Boolean swipeDownClose;

    @C09CT("title")
    public final String title;

    @C09CT("top_pinned_blocks")
    public final List<UniversalPopupBlock> topPinnedBlocks;

    @C09CT("upper_left_back")
    public final Boolean upperLeftBack;

    @C09CT("upper_right_close")
    public final Boolean upperRightClose;

    public UniversalPopup() {
        this(false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0.0f, 0.0f, null, false, 134217727, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalPopup)) {
            return false;
        }
        UniversalPopup universalPopup = (UniversalPopup) obj;
        return this.isDispatchBlocks == universalPopup.isDispatchBlocks && Intrinsics.LJFF(this.business, universalPopup.business) && Intrinsics.LJFF(this.popupId, universalPopup.popupId) && Intrinsics.LJFF(this.policyVersion, universalPopup.policyVersion) && Intrinsics.LJFF(this.style, universalPopup.style) && Intrinsics.LJFF(this.title, universalPopup.title) && Intrinsics.LJFF(this.body, universalPopup.body) && Intrinsics.LJFF(this.topPinnedBlocks, universalPopup.topPinnedBlocks) && Intrinsics.LJFF(this.blocks, universalPopup.blocks) && Intrinsics.LJFF(this.bottomPinnedBlocks, universalPopup.bottomPinnedBlocks) && Intrinsics.LJFF(this.align, universalPopup.align) && Intrinsics.LJFF(this.buttons, universalPopup.buttons) && Intrinsics.LJFF(this.iconUrl, universalPopup.iconUrl) && Intrinsics.LJFF(this.iconUrlDark, universalPopup.iconUrlDark) && Intrinsics.LJFF(this.popupLinkList, universalPopup.popupLinkList) && Intrinsics.LJFF(this.isSubPopUp, universalPopup.isSubPopUp) && Intrinsics.LJFF(this.firstButtonHighlight, universalPopup.firstButtonHighlight) && Intrinsics.LJFF(this.extra, universalPopup.extra) && Intrinsics.LJFF(this.upperRightClose, universalPopup.upperRightClose) && Intrinsics.LJFF(this.swipeDownClose, universalPopup.swipeDownClose) && Intrinsics.LJFF(this.upperLeftBack, universalPopup.upperLeftBack) && Intrinsics.LJFF(this.dismissClickOutside, universalPopup.dismissClickOutside) && Intrinsics.LJFF(this.styleExtra, universalPopup.styleExtra) && Float.compare(this.bottomSheetHeight, universalPopup.bottomSheetHeight) == 0 && Float.compare(this.bottomSheetMaxHeight, universalPopup.bottomSheetMaxHeight) == 0 && Intrinsics.LJFF(this.backButtonClose, universalPopup.backButtonClose) && this.isCompliance == universalPopup.isCompliance;
    }

    public final boolean isCompliance() {
        return this.isCompliance;
    }

    public final boolean isDispatchBlocks() {
        return this.isDispatchBlocks;
    }

    public final Boolean isSubPopUp() {
        return this.isSubPopUp;
    }

    public UniversalPopup(boolean z, String str, String str2, String str3, String str4, String str5, String str6, List<UniversalPopupBlock> list, List<UniversalPopupBlock> list2, List<UniversalPopupBlock> list3, String str7, List<UniversalPopupButton> list4, String str8, String str9, List<UniversalPopupBodyLinkList> list5, Boolean bool, Boolean bool2, Map<String, String> map, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, StyleExtra styleExtra, float f, float f2, Boolean bool7, boolean z2) {
        this.isDispatchBlocks = z;
        this.business = str;
        this.popupId = str2;
        this.policyVersion = str3;
        this.style = str4;
        this.title = str5;
        this.body = str6;
        this.topPinnedBlocks = list;
        this.blocks = list2;
        this.bottomPinnedBlocks = list3;
        this.align = str7;
        this.buttons = list4;
        this.iconUrl = str8;
        this.iconUrlDark = str9;
        this.popupLinkList = list5;
        this.isSubPopUp = bool;
        this.firstButtonHighlight = bool2;
        this.extra = map;
        this.upperRightClose = bool3;
        this.swipeDownClose = bool4;
        this.upperLeftBack = bool5;
        this.dismissClickOutside = bool6;
        this.styleExtra = styleExtra;
        this.bottomSheetHeight = f;
        this.bottomSheetMaxHeight = f2;
        this.backButtonClose = bool7;
        this.isCompliance = z2;
    }

    public UniversalPopup(boolean z, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, String str7, List list4, String str8, String str9, List list5, Boolean bool, Boolean bool2, Map map, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, StyleExtra styleExtra, float f, float f2, Boolean bool7, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? C13BV.INSTANCE : list, (i & 256) != 0 ? C13BV.INSTANCE : list2, (i & 512) != 0 ? C13BV.INSTANCE : list3, (i & 1024) != 0 ? null : str7, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C13BV.INSTANCE : list4, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? "" : str8, (i & 8192) == 0 ? str9 : "", (i & 16384) != 0 ? C13BV.INSTANCE : list5, (32768 & i) != 0 ? Boolean.FALSE : bool, (65536 & i) != 0 ? Boolean.FALSE : bool2, (131072 & i) != 0 ? null : map, (262144 & i) != 0 ? Boolean.FALSE : bool3, (524288 & i) != 0 ? Boolean.FALSE : bool4, (1048576 & i) != 0 ? Boolean.FALSE : bool5, (2097152 & i) != 0 ? Boolean.FALSE : bool6, (4194304 & i) != 0 ? new StyleExtra(null, null, null) : styleExtra, (8388608 & i) != 0 ? -1.0f : f, (16777216 & i) == 0 ? f2 : -1.0f, (33554432 & i) != 0 ? null : bool7, (i & 67108864) != 0 ? false : z2);
    }
}
