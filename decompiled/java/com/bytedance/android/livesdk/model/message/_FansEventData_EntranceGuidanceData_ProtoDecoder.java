package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.FansEventData;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FansEventData_EntranceGuidanceData_ProtoDecoder implements C0IMD<FansEventData.EntranceGuidanceData> {
    public static FansEventData.EntranceGuidanceData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FansEventData.EntranceGuidanceData entranceGuidanceData = new FansEventData.EntranceGuidanceData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 103) {
                            switch (iLJI) {
                                case 5:
                                    entranceGuidanceData.guidanceType = c1516680pZS.LJIIJ();
                                    break;
                                case 6:
                                    entranceGuidanceData.freqControlKey = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                case 7:
                                    entranceGuidanceData.freqControlDuration = c1516680pZS.LJIIJJI();
                                    break;
                                case 8:
                                    entranceGuidanceData.freqControlValue = c1516680pZS.LJIIJ();
                                    break;
                                case BdTuring.TYPE_ECAF /* 9 */:
                                    entranceGuidanceData.fragmentId = c1516680pZS.LJIIJJI();
                                    break;
                                default:
                                    C1516700pZU.LJ(c1516680pZS);
                                    break;
                            }
                        } else {
                            entranceGuidanceData.entranceGuidanceContainer = _EntranceGuidanceContainer_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        entranceGuidanceData.icon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    entranceGuidanceData.text = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return entranceGuidanceData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(FansEventData.EntranceGuidanceData entranceGuidanceData) {
        FansEventData.EntranceGuidanceData entranceGuidanceData2 = entranceGuidanceData;
        Text text = entranceGuidanceData2.text;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        ImageModel imageModel = entranceGuidanceData2.icon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        EntranceGuidanceContainer entranceGuidanceContainer = entranceGuidanceData2.entranceGuidanceContainer;
        if (entranceGuidanceContainer != null) {
            Text text2 = entranceGuidanceContainer.text;
            if (text2 != null) {
                _Text_ProtoDecoder.LJ(text2);
            }
            if (entranceGuidanceContainer.extra == null) {
                entranceGuidanceContainer.extra = new HashMap();
            }
        }
    }

    @Override // X.C0IMD
    public final FansEventData.EntranceGuidanceData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FansEventData.EntranceGuidanceData entranceGuidanceData, List list) {
    }
}
