package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C19339910lR;
import X.C19407110wH;
import X.C19407310wJ;
import X.C19407410wK;
import X.C339190DRl;
import X.InterfaceC19407610wM;
import android.view.View;
import com.ss.android.ugc.aweme.prop.fragment.ame.AmeProfileFrameActivityBannerTTEPResController;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.ss.android.ugc.gamora.editor.sticker.read.panel.EditTTSPanelFragment;

/* JADX INFO: loaded from: classes30.dex */
public class AkS32S0300000_29 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AkS32S0300000_29 akS32S0300000_29, View view) {
        ((C19407310wJ) akS32S0300000_29.l0).getClass();
        InterfaceC19407610wM interfaceC19407610wM = ((EditTTSPanelFragment) akS32S0300000_29.l1).LLILLL;
        if (interfaceC19407610wM != null) {
            interfaceC19407610wM.LLLF((ReadTextEffectBean) akS32S0300000_29.l2);
        }
        InterfaceC19407610wM interfaceC19407610wM2 = ((EditTTSPanelFragment) akS32S0300000_29.l1).LLILLL;
        if (interfaceC19407610wM2 != null && interfaceC19407610wM2.LLJLILLLLZIIL(((ReadTextEffectBean) akS32S0300000_29.l2).mSpeaker.speakreID)) {
            return;
        }
        C19407310wJ.L5((C19407310wJ) akS32S0300000_29.l0, 2);
    }

    public static final void LIZ$1(AkS32S0300000_29 akS32S0300000_29, View view) {
        ((C19407110wH) akS32S0300000_29.l0).getClass();
        InterfaceC19407610wM interfaceC19407610wM = ((EditTTSPanelFragment) akS32S0300000_29.l1).LLILLL;
        if (interfaceC19407610wM != null) {
            interfaceC19407610wM.LLLF((ReadTextEffectBean) akS32S0300000_29.l2);
        }
        InterfaceC19407610wM interfaceC19407610wM2 = ((EditTTSPanelFragment) akS32S0300000_29.l1).LLILLL;
        if (interfaceC19407610wM2 != null && interfaceC19407610wM2.LLJLILLLLZIIL(((ReadTextEffectBean) akS32S0300000_29.l2).mSpeaker.speakreID)) {
            return;
        }
        C19407110wH.L5((C19407110wH) akS32S0300000_29.l0, 2);
    }

    public static final void LIZ$2(AkS32S0300000_29 akS32S0300000_29, View view) {
        C19407410wK c19407410wK = (C19407410wK) akS32S0300000_29.l0;
        ReadTextEffectBean readTextEffectBean = (ReadTextEffectBean) akS32S0300000_29.l1;
        InterfaceC19407610wM interfaceC19407610wM = c19407410wK.LLJILJIL.LL.LLILLL;
        if (interfaceC19407610wM != null) {
            interfaceC19407610wM.LLLF(readTextEffectBean);
        }
        InterfaceC19407610wM interfaceC19407610wM2 = ((EditTTSPanelFragment) akS32S0300000_29.l2).LLILLL;
        if (interfaceC19407610wM2 != null && interfaceC19407610wM2.LLJLILLLLZIIL(((ReadTextEffectBean) akS32S0300000_29.l1).mSpeaker.speakreID)) {
            return;
        }
        C19407410wK.L5((C19407410wK) akS32S0300000_29.l0, 2);
    }

    public static final void LIZ$3(AkS32S0300000_29 akS32S0300000_29, View view) {
        boolean z;
        C339190DRl.LIZIZ((View) akS32S0300000_29.l0);
        String strLIZ = ((AmeProfileFrameActivityBannerTTEPResController) akS32S0300000_29.l1).LIZ();
        if (strLIZ.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C19339910lR.LIZIZ().storeInt(C19339910lR.LIZ(strLIZ), 2);
        } else {
            C19339910lR.LIZIZ().storeInt("click_status", 2);
        }
        ((View.OnClickListener) akS32S0300000_29.l2).onClick((View) akS32S0300000_29.l0);
    }

    public AkS32S0300000_29(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
