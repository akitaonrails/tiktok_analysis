package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PublicAreaMessageCommon_CreatorSuccessInfo_TagItem_ProtoDecoder implements C0IMD<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> {
    public static PublicAreaMessageCommon.CreatorSuccessInfo.TagItem LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PublicAreaMessageCommon.CreatorSuccessInfo.TagItem tagItem = new PublicAreaMessageCommon.CreatorSuccessInfo.TagItem();
        tagItem.eventTrackingFields = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 10) {
                    if (iLJI != 11) {
                        switch (iLJI) {
                            case 1:
                                tagItem.tagType = c1516680pZS.LJIIJ();
                                break;
                            case 2:
                                tagItem.tagText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 3:
                                tagItem.tagValue = c1516680pZS.LJIIJJI();
                                break;
                            case 4:
                                tagItem.displayLocation = c1516680pZS.LJIIJ();
                                break;
                            case 5:
                                long jLIZJ2 = c1516680pZS.LIZJ();
                                String strLIZLLL = null;
                                String strLIZLLL2 = null;
                                while (true) {
                                    int iLJI2 = c1516680pZS.LJI();
                                    if (iLJI2 != -1) {
                                        if (iLJI2 != 1) {
                                            if (iLJI2 == 2) {
                                                strLIZLLL2 = C1516700pZU.LIZLLL(c1516680pZS);
                                            }
                                        } else {
                                            strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                        }
                                    } else {
                                        c1516680pZS.LJ(jLIZJ2);
                                        if (strLIZLLL != null) {
                                            if (strLIZLLL2 != null) {
                                                tagItem.eventTrackingFields.put(strLIZLLL, strLIZLLL2);
                                            } else {
                                                throw new IllegalStateException("Map value must not be null!");
                                            }
                                        } else {
                                            throw new IllegalStateException("Map key must not be null!");
                                        }
                                        break;
                                    }
                                }
                                break;
                            case 6:
                                tagItem.bizName = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            default:
                                C1516700pZU.LJ(c1516680pZS);
                                break;
                        }
                    } else {
                        tagItem.disableCrmClick = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    tagItem.disableCountFrequencyControl = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return tagItem;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PublicAreaMessageCommon.CreatorSuccessInfo.TagItem tagItem) {
        PublicAreaMessageCommon.CreatorSuccessInfo.TagItem tagItem2 = tagItem;
        Text text = tagItem2.tagText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        if (tagItem2.eventTrackingFields == null) {
            tagItem2.eventTrackingFields = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final PublicAreaMessageCommon.CreatorSuccessInfo.TagItem LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PublicAreaMessageCommon.CreatorSuccessInfo.TagItem tagItem, List list) {
    }
}
