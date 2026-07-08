package com.ss.android.ugc.tiktok.tpsc.privacy.account.effectcount;

import X.C09CT;
import X.C11NZ;
import X.C1888970zFv;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1485705rj;
import X.InterfaceC1501200pAU;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public interface EffectCountApi {
    public static final C1888970zFv LIZ = C1888970zFv.LIZ;

    @InterfaceC1501200pAU
    C11NZ<EffectCountResp> LIZ(@InterfaceC1485705rj String str);

    public static final class EffectCountResp extends BaseResponse {

        @C09CT("interaction_video_count")
        public final InteractionVideoCount interactionVideoCount;

        @C09CT("no_pa_control_settings")
        public final NoPAControlSettings noPAControlSettings;

        @C09CT("remove_reuse_download_reminder")
        public final boolean removeReminder;

        public EffectCountResp() {
            this(null, null, false);
        }

        public final EffectCountResp copy(InteractionVideoCount interactionVideoCount, NoPAControlSettings noPAControlSettings, boolean z) {
            return new EffectCountResp(interactionVideoCount, noPAControlSettings, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EffectCountResp)) {
                return false;
            }
            EffectCountResp effectCountResp = (EffectCountResp) obj;
            return Intrinsics.LJFF(this.interactionVideoCount, effectCountResp.interactionVideoCount) && Intrinsics.LJFF(this.noPAControlSettings, effectCountResp.noPAControlSettings) && this.removeReminder == effectCountResp.removeReminder;
        }

        public int hashCode() {
            InteractionVideoCount interactionVideoCount = this.interactionVideoCount;
            int iHashCode = (interactionVideoCount == null ? 0 : interactionVideoCount.hashCode()) * 31;
            NoPAControlSettings noPAControlSettings = this.noPAControlSettings;
            return ((iHashCode + (noPAControlSettings != null ? noPAControlSettings.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.removeReminder);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EffectCountResp(interactionVideoCount=");
            sbLIZ.append(this.interactionVideoCount);
            sbLIZ.append(", noPAControlSettings=");
            sbLIZ.append(this.noPAControlSettings);
            sbLIZ.append(", removeReminder=");
            sbLIZ.append(this.removeReminder);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final InteractionVideoCount getInteractionVideoCount() {
            return this.interactionVideoCount;
        }

        public final NoPAControlSettings getNoPAControlSettings() {
            return this.noPAControlSettings;
        }

        public final boolean getRemoveReminder() {
            return this.removeReminder;
        }

        public EffectCountResp(InteractionVideoCount interactionVideoCount, NoPAControlSettings noPAControlSettings, boolean z) {
            this.interactionVideoCount = interactionVideoCount;
            this.noPAControlSettings = noPAControlSettings;
            this.removeReminder = z;
        }
    }
}
