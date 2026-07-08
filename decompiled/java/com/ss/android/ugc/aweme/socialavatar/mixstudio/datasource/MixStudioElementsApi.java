package com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource;

import X.C09CT;
import X.C2164808dy;
import X.C2188811AlT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioNetworkElement;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public interface MixStudioElementsApi {
    public static final C2164808dy LIZ = C2164808dy.LIZ;

    @InterfaceC1501160pAQ("/tiktok/v1/imagine_sticker/elements")
    Object getMixStudioElements(InterfaceC1364105Vn<? super MixStudioElementsResponse> interfaceC1364105Vn);

    public static final class MixStudioElementListWithType {

        @C09CT("elements")
        public final List<MixStudioNetworkElement> elements;

        @C09CT("id_type")
        public final Integer idType;

        public MixStudioElementListWithType() {
            this(0, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MixStudioElementListWithType)) {
                return false;
            }
            MixStudioElementListWithType mixStudioElementListWithType = (MixStudioElementListWithType) obj;
            return Intrinsics.LJFF(this.idType, mixStudioElementListWithType.idType) && Intrinsics.LJFF(this.elements, mixStudioElementListWithType.elements);
        }

        public final int hashCode() {
            Integer num = this.idType;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            List<MixStudioNetworkElement> list = this.elements;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MixStudioElementListWithType(idType=");
            sbLIZ.append(this.idType);
            sbLIZ.append(", elements=");
            sbLIZ.append(this.elements);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public MixStudioElementListWithType(Integer num, List<MixStudioNetworkElement> list) {
            this.idType = num;
            this.elements = list;
        }
    }

    public static final class MixStudioElementsResponse {

        @C09CT("elements")
        public final List<MixStudioElementListWithType> elementsWithType;

        @C09CT("version")
        public final String version;

        public MixStudioElementsResponse() {
            this("", null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MixStudioElementsResponse)) {
                return false;
            }
            MixStudioElementsResponse mixStudioElementsResponse = (MixStudioElementsResponse) obj;
            return Intrinsics.LJFF(this.version, mixStudioElementsResponse.version) && Intrinsics.LJFF(this.elementsWithType, mixStudioElementsResponse.elementsWithType);
        }

        public final int hashCode() {
            int iHashCode = this.version.hashCode() * 31;
            List<MixStudioElementListWithType> list = this.elementsWithType;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MixStudioElementsResponse(version=");
            sbLIZ.append(this.version);
            sbLIZ.append(", elementsWithType=");
            sbLIZ.append(this.elementsWithType);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public MixStudioElementsResponse(String str, List<MixStudioElementListWithType> list) {
            this.version = str;
            this.elementsWithType = list;
        }
    }
}
