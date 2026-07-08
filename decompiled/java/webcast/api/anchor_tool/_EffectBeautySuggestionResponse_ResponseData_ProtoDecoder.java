package webcast.api.anchor_tool;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.api.anchor_tool.EffectBeautySuggestionResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _EffectBeautySuggestionResponse_ResponseData_ProtoDecoder implements C0IMD<EffectBeautySuggestionResponse.ResponseData> {
    public static EffectBeautySuggestionResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EffectBeautySuggestionResponse.ResponseData responseData = new EffectBeautySuggestionResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    responseData.statusCode = c1516680pZS.LJIIJ();
                                }
                            } else {
                                responseData.uniqueKey = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            responseData.suggestedBeautySetting = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        responseData.suggestResultType = c1516680pZS.LJIIJ();
                    }
                } else {
                    responseData.continueSuggest = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final EffectBeautySuggestionResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(EffectBeautySuggestionResponse.ResponseData responseData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EffectBeautySuggestionResponse.ResponseData responseData, List list) {
    }
}
