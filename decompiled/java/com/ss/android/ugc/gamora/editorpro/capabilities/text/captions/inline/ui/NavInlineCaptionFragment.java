package com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui;

import X.C09R3;
import X.C0E12;
import X.C0EJ3;
import X.C0ES3;
import X.C13LE;
import X.C1664740tQG;
import X.C1664770tQJ;
import X.C19EG;
import X.C1DRG;
import X.C2217381BqS;
import X.C363730ENv;
import X.C363750ENx;
import X.C364440EQo;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.InterfaceC362230EIb;
import X.InterfaceC377540ErA;
import X.InterfaceC379610EuV;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes6.dex */
public final class NavInlineCaptionFragment extends InlineCaptionFragment implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLZZJLIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiItJCAhKWspLSYnJzc8OyB9KyQ8KC06JCw4ICogZjHELIOSEpMTt9KyQ8PSY8JjZiICE/ISspZzo6ZgstPwY9JCwiLAwyODElJiEVOiQrJCo9PA==";
    public final C1DRG LLZLL;
    public final C1664740tQG LLZLLIL;
    public final C1664740tQG LLZLLLL;
    public boolean LLZZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(NavInlineCaptionFragment.class, "editProApi", "getEditProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(NavInlineCaptionFragment.class, "epAdjustCanvasApi", "getEpAdjustCanvasApi()Lcom/ss/android/ugc/gamora/editorpro/startup/slide/EditorProAdjustCanvasApi;", 0);
        c09r3.getClass();
        LLZZJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionFragment
    public final boolean IT() {
        return false;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final boolean kS() {
        return false;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionFragment
    public final void NT() {
        if (this.LLZZ) {
            return;
        }
        this.LLZZ = true;
        C0E12 c0e12 = C363750ENx.LIZ;
        int iLIZ = c0e12.getInt("before_caption_control_height", -1);
        if (iLIZ < 0 && getContext() != null) {
            iLIZ = C0ES3.LIZ();
        }
        c0e12.LIZJ("before_caption_control_height", -1);
        if (iLIZ < 0) {
            return;
        }
        C363750ENx.LJFF(iLIZ);
        c0e12.LIZIZ("sync_control_height_when_enter_ep", true);
        if (this.LLLLILI) {
            return;
        }
        C1664740tQG c1664740tQG = this.LLZLLLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLZZJLIL;
        InterfaceC362230EIb interfaceC362230EIb = (InterfaceC362230EIb) c1664740tQG.getValue(this, interfaceC2217461BqaArr[1]);
        if (interfaceC362230EIb != null) {
            interfaceC362230EIb.Dq1(iLIZ, true, null);
        }
        InterfaceC362230EIb interfaceC362230EIb2 = (InterfaceC362230EIb) this.LLZLLLL.getValue(this, interfaceC2217461BqaArr[1]);
        if (interfaceC362230EIb2 != null) {
            interfaceC362230EIb2.HI0();
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionFragment, com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void HS() {
        View viewFindViewById;
        super.HS();
        if (this.LLLLILI) {
            C19EG activity = getActivity();
            if (activity != null && (viewFindViewById = activity.findViewById(R.id.gct)) != null) {
                C786410Ut5.T4(viewFindViewById, 0.0f);
            }
            InterfaceC377540ErA interfaceC377540ErA = (InterfaceC377540ErA) this.LLZLLIL.getValue(this, LLZZJLIL[0]);
            if (interfaceC377540ErA != null) {
                interfaceC377540ErA.Ds();
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionFragment
    public final void LT() {
        super.LT();
        NT();
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLZLL;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        ET().LIZIZ();
        super.onActivityCreated(bundle);
    }

    @Override // com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionFragment
    public final TextStickerData mT(Utterance utterance, C19EG c19eg, Effect effect, Effect effect2) {
        return C363730ENv.LJI(utterance, c19eg, false, effect, effect2);
    }

    public NavInlineCaptionFragment(C1DRG c1drg, C364440EQo c364440EQo, String str, C0EJ3 c0ej3, Effect effect, boolean z) {
        super(c364440EQo, str, true, null, c0ej3, null, effect, z);
        this.LLZLL = c1drg;
        this.LLZLLIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC377540ErA.class, null);
        this.LLZLLLL = C1664770tQJ.LIZIZ(c1drg, InterfaceC362230EIb.class, null);
    }
}
