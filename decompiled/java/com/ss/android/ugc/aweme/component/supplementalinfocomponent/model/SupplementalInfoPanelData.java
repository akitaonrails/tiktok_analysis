package com.ss.android.ugc.aweme.component.supplementalinfocomponent.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class SupplementalInfoPanelData {

    @C09CT("panel_button_text")
    public final String panelButtonText;

    @C09CT("panel_desc_list")
    public final List<String> panelDescList;

    @C09CT("panel_note")
    public final String panelNote;

    @C09CT("panel_subtitle")
    public final String panelSubtitle;

    @C09CT("panel_title")
    public final String panelTitle;

    public SupplementalInfoPanelData() {
        this(null, null, null, null, null);
    }

    public SupplementalInfoPanelData(String str, String str2, List<String> list, String str3, String str4) {
        this.panelTitle = str;
        this.panelSubtitle = str2;
        this.panelDescList = list;
        this.panelNote = str3;
        this.panelButtonText = str4;
    }
}
