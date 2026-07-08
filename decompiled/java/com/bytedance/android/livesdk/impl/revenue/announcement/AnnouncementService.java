package com.bytedance.android.livesdk.impl.revenue.announcement;

import com.bytedance.android.livesdk.api.revenue.announcement.IAnnouncementService;
import com.bytedance.android.livesdk.impl.revenue.announcement.widget.LivePrivilegeAnnouncementWidget;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* JADX INFO: loaded from: classes18.dex */
public class AnnouncementService implements IAnnouncementService {
    @Override // com.bytedance.android.livesdk.api.revenue.announcement.IAnnouncementService
    public final Class<? extends LiveRecyclableWidget> xy0() {
        return LivePrivilegeAnnouncementWidget.class;
    }
}
