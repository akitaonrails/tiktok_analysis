package webcast.api.room;

import X.C09CT;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopeListResponse;
import webcast.api.envelope.PortalListResponse;
import webcast.api.envelope.RevenuePermissionResponse;
import webcast.api.goody_bag.GetRoomGoodyBagResponse;

/* JADX INFO: loaded from: classes18.dex */
public final class RoomMultiShortTouchV2Response {

    @C09CT("envelope_list")
    public RedEnvelopeListResponse envelopeList;

    @C09CT("envelope_list_status")
    public long envelopeListStatus;

    @C09CT("goody_bag")
    public GetRoomGoodyBagResponse.ResponseData goodyBag;

    @C09CT("goody_bag_status")
    public long goodyBagStatus;

    @C09CT("portal_list")
    public PortalListResponse.ResponseData portalList;

    @C09CT("portal_list_status")
    public long portalListStatus;

    @C09CT("revenue_permission")
    public RevenuePermissionResponse.ResponseData revenuePermission;

    @C09CT("revenue_permission_status")
    public long revenuePermissionStatus;
}
