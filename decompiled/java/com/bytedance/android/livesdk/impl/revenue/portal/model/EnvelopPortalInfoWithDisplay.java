package com.bytedance.android.livesdk.impl.revenue.portal.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.EnvelopePortalMessage;

/* JADX INFO: loaded from: classes18.dex */
public final class EnvelopPortalInfoWithDisplay {

    @C09CT("anchor_avatar")
    public ImageModel anchorAvatar;

    @C09CT("anchor_display_id")
    public String anchorDisplayId;

    @C09CT("anchor_id")
    public String anchorId;

    @C09CT("data_from")
    public String dataFrom;

    @C09CT("room_id")
    public String roomId;

    @C09CT("portal_info")
    public EnvelopePortalMessage.PortalInfo portalInfo = new EnvelopePortalMessage.PortalInfo();

    @C09CT("display")
    public int display = 1;
}
