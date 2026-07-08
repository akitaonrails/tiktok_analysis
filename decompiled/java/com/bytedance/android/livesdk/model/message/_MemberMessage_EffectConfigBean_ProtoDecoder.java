package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MemberMessage_EffectConfigBean_ProtoDecoder implements C0IMD<MemberMessage.EffectConfigBean> {
    public static MemberMessage.EffectConfigBean LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MemberMessage.EffectConfigBean effectConfigBean = new MemberMessage.EffectConfigBean();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 4) {
                            if (iLJI != 8) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                effectConfigBean.badge = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            effectConfigBean.textKey = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        effectConfigBean.icon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    effectConfigBean.type = (int) c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return effectConfigBean;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MemberMessage.EffectConfigBean effectConfigBean) {
        MemberMessage.EffectConfigBean effectConfigBean2 = effectConfigBean;
        ImageModel imageModel = effectConfigBean2.icon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        Text text = effectConfigBean2.textKey;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        ImageModel imageModel2 = effectConfigBean2.badge;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
    }

    @Override // X.C0IMD
    public final MemberMessage.EffectConfigBean LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MemberMessage.EffectConfigBean effectConfigBean, List list) {
    }
}
