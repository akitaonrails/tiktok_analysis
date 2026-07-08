package com.ss.android.ugc.profile.business.profile.menu.business.content.business.container;

import X.C13LE;
import com.ss.android.ugc.profile.business.profile.menu.business.content.business.base.ContentCellNewBaseUIComponent;
import com.ss.android.ugc.profile.business.profile.menu.business.content.business.base.ContentSectionListBaseComponent;
import com.ss.android.ugc.profile.business.profile.menu.business.content.minis.ContentCellRichCardUIComponent;

/* JADX INFO: loaded from: classes20.dex */
public final class ContentSectionListComponent extends ContentSectionListBaseComponent {
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void Go() {
        Ho("content_section_cell_base_item", C13LE.LIZ(ContentCellNewBaseUIComponent.class), null, -1, false);
        Ho("content_section_cell_rich_base_item", C13LE.LIZ(ContentCellRichCardUIComponent.class), null, -1, false);
    }
}
