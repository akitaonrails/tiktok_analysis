package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match.CommonCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.VaultGloveCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match._CommonCardInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._VaultGloveCardInfo_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UseVaultGloveCard_ProtoDecoder implements C0IMD<UseVaultGloveCard> {
    public static UseVaultGloveCard LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UseVaultGloveCard useVaultGloveCard = new UseVaultGloveCard();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            useVaultGloveCard.displayContent = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        useVaultGloveCard.anchorId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    useVaultGloveCard.cardInfo = _VaultGloveCardInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return useVaultGloveCard;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(UseVaultGloveCard useVaultGloveCard) {
        CommonCardInfo commonCardInfo;
        UseVaultGloveCard useVaultGloveCard2 = useVaultGloveCard;
        VaultGloveCardInfo vaultGloveCardInfo = useVaultGloveCard2.cardInfo;
        if (vaultGloveCardInfo != null && (commonCardInfo = vaultGloveCardInfo.common) != null) {
            _CommonCardInfo_ProtoDecoder.LJ(commonCardInfo);
        }
        Text text = useVaultGloveCard2.displayContent;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final UseVaultGloveCard LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UseVaultGloveCard useVaultGloveCard, List list) {
    }
}
