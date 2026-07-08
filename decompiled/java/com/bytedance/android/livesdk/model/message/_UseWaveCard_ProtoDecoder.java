package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.WaveCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleUserInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._WaveCardInfo_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UseWaveCard_ProtoDecoder implements C0IMD<UseWaveCard> {
    public static UseWaveCard LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UseWaveCard useWaveCard = new UseWaveCard();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            useWaveCard.displayContent = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        useWaveCard.anchorId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    useWaveCard.cardInfo = _WaveCardInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return useWaveCard;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(UseWaveCard useWaveCard) {
        UseWaveCard useWaveCard2 = useWaveCard;
        WaveCardInfo waveCardInfo = useWaveCard2.cardInfo;
        if (waveCardInfo != null) {
            ImageModel imageModel = waveCardInfo.cardImage;
            if (imageModel != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
            BattleUserInfo battleUserInfo = waveCardInfo.sendUser;
            if (battleUserInfo != null) {
                _BattleUserInfo_ProtoDecoder.LJ(battleUserInfo);
            }
        }
        Text text = useWaveCard2.displayContent;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final UseWaveCard LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UseWaveCard useWaveCard, List list) {
    }
}
