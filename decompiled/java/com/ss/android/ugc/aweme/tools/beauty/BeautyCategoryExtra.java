package com.ss.android.ugc.aweme.tools.beauty;

import X.C09CT;
import X.EnumC19731112Ht;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes30.dex */
public final class BeautyCategoryExtra {

    @C09CT("ab_group")
    public final String abGroup;

    @C09CT("category_default")
    public boolean beautyModeDefault;

    @C09CT("categoryid")
    public String categoryId;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    @C09CT("default")
    public final boolean f82default;

    @C09CT("exclusive")
    public final boolean exclusive;

    @C09CT("panel_type")
    public final String panelType;

    @C09CT("parentid")
    public String parentId;

    @C09CT("Primary_panel_icon")
    public String primaryPanelIcon;

    @C09CT("primary_panel_icon_list")
    public List<String> primaryPanelIconList;

    @C09CT("Primary_panel_name")
    public String primaryPanelName;

    @C09CT("region_3")
    public final boolean regionM;

    @C09CT("region_2")
    public final boolean regionT;

    @C09CT("showSwitch")
    public boolean showSwitch;

    @C09CT("showTips")
    public boolean showTips;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public BeautyCategoryExtra() {
        boolean z = false;
        this(null, z, z, z, 0 == true ? 1 : 0, z, z, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, 16383, 0 == true ? 1 : 0);
    }

    public String toString() {
        return "BeautyCategoryExtra(abGroup=" + this.abGroup + ", regionT=" + this.regionT + ", regionM=" + this.regionM + ", default=" + this.f82default + ", panelType=" + this.panelType + ", exclusive=" + this.exclusive + ", showTips=" + this.showTips + ", showSwitch=" + this.showSwitch + ", categoryId=" + this.categoryId + ", parentId=" + this.parentId + ", primaryPanelIcon=" + this.primaryPanelIcon + ", primaryPanelIconList=" + this.primaryPanelIconList + ", primaryPanelName=" + this.primaryPanelName + ", beautyModeDefault=" + this.beautyModeDefault + ')';
    }

    public final void setBeautyModeDefault(boolean z) {
        this.beautyModeDefault = z;
    }

    public final void setCategoryId(String str) {
        this.categoryId = str;
    }

    public final void setParentId(String str) {
        this.parentId = str;
    }

    public final void setPrimaryPanelIcon(String str) {
        this.primaryPanelIcon = str;
    }

    public final void setPrimaryPanelIconList(List<String> list) {
        this.primaryPanelIconList = list;
    }

    public final void setPrimaryPanelName(String str) {
        this.primaryPanelName = str;
    }

    public final void setShowSwitch(boolean z) {
        this.showSwitch = z;
    }

    public final void setShowTips(boolean z) {
        this.showTips = z;
    }

    public BeautyCategoryExtra(String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, boolean z6, String str3, String str4, String str5, List<String> list, String str6, boolean z7) {
        this.abGroup = str;
        this.regionT = z;
        this.regionM = z2;
        this.f82default = z3;
        this.panelType = str2;
        this.exclusive = z4;
        this.showTips = z5;
        this.showSwitch = z6;
        this.categoryId = str3;
        this.parentId = str4;
        this.primaryPanelIcon = str5;
        this.primaryPanelIconList = list;
        this.primaryPanelName = str6;
        this.beautyModeDefault = z7;
    }

    public /* synthetic */ BeautyCategoryExtra(String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, boolean z6, String str3, String str4, String str5, List list, String str6, boolean z7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "1" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? EnumC19731112Ht.MALE.getFlag() : str2, (i & 32) != 0 ? false : z4, (i & 64) != 0 ? false : z5, (i & 128) != 0 ? false : z6, (i & 256) != 0 ? "" : str3, (i & 512) != 0 ? "" : str4, (i & 1024) != 0 ? "" : str5, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? new ArrayList() : list, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? str6 : "", (i & 8192) == 0 ? z7 : false);
    }
}
