package tikcast.api.creator_succ;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ActionButton_ProtoDecoder implements C0IMD<ActionButton> {
    public static ActionButton LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ActionButton actionButton = new ActionButton();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                actionButton.buttonSchema = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            actionButton.buttonInactiveText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        actionButton.buttonActiveText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    actionButton.buttonType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return actionButton;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ActionButton actionButton) {
        ActionButton actionButton2 = actionButton;
        Text text = actionButton2.buttonActiveText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        Text text2 = actionButton2.buttonInactiveText;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
    }

    @Override // X.C0IMD
    public final ActionButton LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ActionButton actionButton, List list) {
    }
}
