package com.ss.android.ugc.aweme.hangout.component.interact.model;

import X.C007K;
import X.C09CT;
import X.C0J66;
import X.C2188811AlT;
import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendedRoom;
import com.bytedance.android.livesdk.signaling.model.BaseDownlinkData;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiTopLiveRoomMatchScene extends C0J66<C007K, DownLinkRoomMatchData> {
    public MultiTopLiveRoomMatchScene() {
        super(new C007K(null), "multiguest", Collections.singletonList("linkmic_notify"));
    }

    @Override // X.C0J66
    public final Class<DownLinkRoomMatchData> LJIIIIZZ() {
        return DownLinkRoomMatchData.class;
    }

    public static final class DownLinkRoomMatchData extends BaseDownlinkData {
        public static final int $stable = 8;

        @C09CT("recommended_room")
        public RecommendedRoom recommendedRoom;

        @C09CT("req_id")
        public String reqId;

        @C09CT("source")
        public String source;

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public int status;

        public DownLinkRoomMatchData() {
            this(null, 0, "", "");
        }

        public final RecommendedRoom component1() {
            return this.recommendedRoom;
        }

        public final int component2() {
            return this.status;
        }

        public final String component3() {
            return this.reqId;
        }

        public final String component4() {
            return this.source;
        }

        public final DownLinkRoomMatchData copy(RecommendedRoom recommendedRoom, int i, String str, String str2) {
            return new DownLinkRoomMatchData(recommendedRoom, i, str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DownLinkRoomMatchData)) {
                return false;
            }
            DownLinkRoomMatchData downLinkRoomMatchData = (DownLinkRoomMatchData) obj;
            return Intrinsics.LJFF(this.recommendedRoom, downLinkRoomMatchData.recommendedRoom) && this.status == downLinkRoomMatchData.status && Intrinsics.LJFF(this.reqId, downLinkRoomMatchData.reqId) && Intrinsics.LJFF(this.source, downLinkRoomMatchData.source);
        }

        public int hashCode() {
            RecommendedRoom recommendedRoom = this.recommendedRoom;
            return ((((((recommendedRoom == null ? 0 : recommendedRoom.hashCode()) * 31) + this.status) * 31) + this.reqId.hashCode()) * 31) + this.source.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DownLinkRoomMatchData(recommendedRoom=");
            sbLIZ.append(this.recommendedRoom);
            sbLIZ.append(", status=");
            sbLIZ.append(this.status);
            sbLIZ.append(", reqId=");
            sbLIZ.append(this.reqId);
            sbLIZ.append(", source=");
            sbLIZ.append(this.source);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public DownLinkRoomMatchData(RecommendedRoom recommendedRoom, int i, String str, String str2) {
            this.recommendedRoom = recommendedRoom;
            this.status = i;
            this.reqId = str;
            this.source = str2;
        }
    }
}
