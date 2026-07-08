package com.ss.android.ugc.aweme.component.livepincardcomponent;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.commercialize.model.AnoleLogInfo;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleLivePinCardModel implements Serializable {
    public static final int $stable = 8;

    @C09CT("common_data")
    public final AnoleLivePinCardCommonData commonData;

    @C09CT("log_info")
    public final AnoleLogInfo logInfo;

    @C09CT(Scene.SCENE_SERVICE)
    public final Integer scene;

    @C09CT("pin_card")
    public final Map<String, Object> subPinCard;

    public AnoleLivePinCardModel() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnoleLivePinCardModel)) {
            return false;
        }
        AnoleLivePinCardModel anoleLivePinCardModel = (AnoleLivePinCardModel) obj;
        return Intrinsics.LJFF(this.logInfo, anoleLivePinCardModel.logInfo) && Intrinsics.LJFF(this.scene, anoleLivePinCardModel.scene) && Intrinsics.LJFF(this.commonData, anoleLivePinCardModel.commonData) && Intrinsics.LJFF(this.subPinCard, anoleLivePinCardModel.subPinCard);
    }

    public int hashCode() {
        AnoleLogInfo anoleLogInfo = this.logInfo;
        int iHashCode = (anoleLogInfo == null ? 0 : anoleLogInfo.hashCode()) * 31;
        Integer num = this.scene;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        AnoleLivePinCardCommonData anoleLivePinCardCommonData = this.commonData;
        int iHashCode3 = (iHashCode2 + (anoleLivePinCardCommonData == null ? 0 : anoleLivePinCardCommonData.hashCode())) * 31;
        Map<String, Object> map = this.subPinCard;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnoleLivePinCardModel(logInfo=");
        sbLIZ.append(this.logInfo);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", commonData=");
        sbLIZ.append(this.commonData);
        sbLIZ.append(", subPinCard=");
        sbLIZ.append(this.subPinCard);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnoleLivePinCardModel(AnoleLogInfo anoleLogInfo, Integer num, AnoleLivePinCardCommonData anoleLivePinCardCommonData, Map<String, ? extends Object> map) {
        this.logInfo = anoleLogInfo;
        this.scene = num;
        this.commonData = anoleLivePinCardCommonData;
        this.subPinCard = map;
    }
}
