package com.ss.android.ugc.profile.business.profile.menu.business.content.minis;

import X.EnumC995430c0j;
import android.view.View;
import android.view.ViewGroup;
import com.google.gson.n;

/* JADX INFO: loaded from: classes20.dex */
public class ContentCellMinisRichCardProtocol extends ContentCellMinisProtocol {
    public int LLLFF = EnumC995430c0j.CONTAINER_LOCATION_UNKNOWN.ordinal();

    @Override // com.ss.android.ugc.profile.business.profile.menu.business.content.minis.ContentCellMinisProtocol, com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol
    public final boolean LJLJLLL(n nVar) {
        return false;
    }

    @Override // com.ss.android.ugc.profile.business.profile.menu.business.content.minis.ContentCellMinisProtocol, com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "content_section_cell_tiktok_minis_rich_card";
    }

    @Override // com.ss.android.ugc.profile.business.profile.menu.business.content.minis.ContentCellMinisProtocol, com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol
    public final void LJLJI() {
        View childAt;
        ViewGroup viewGroup;
        super.LJLJI();
        if (this.LLLFF == EnumC995430c0j.CONTAINER_LOCATION_BOTTOM.ordinal()) {
            View view = this.LLILZLL;
            if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null || (childAt = viewGroup.getChildAt(0)) == null) {
                childAt = this.LLILZLL;
            }
            childAt.setBackground(null);
        }
        childAt = (View) this.LLJZIJLIL.getValue();
        if (childAt == null) {
            return;
        }
        childAt.setBackground(null);
    }
}
