package com.ss.android.ugc.tools.entry.anchor;

import X.C09IC;
import X.C0LAB;
import X.C0MFG;
import X.C1727006pY;
import X.C1727106pZ;
import X.C188C;
import X.C197039127h;
import X.C20684815ws;
import X.C21287418Si;
import X.C21287618Sk;
import X.C21288518St;
import X.C21291518Tx;
import X.C2188811AlT;
import X.C342380DbY;
import X.C418440Gaw;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC21291418Tw;
import X.InterfaceC1727306pb;
import X.InterfaceC332260D0u;
import X.InterfaceC565110MEj;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS166S0100000_32;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.basicui.BasicImageHeaderSheetFragment;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenConsumptionModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenPrompt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tools.chat.common.save.IAiChatFileService;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes33.dex */
public final class AiChatSheetFragment extends BasicImageHeaderSheetFragment<String> {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjEjJiMgZiAiPTHELIOS0qZiQiKic8OmsNIAw7KTEfISo2PAM+KCg+LSs4";
    public final AIChatGenConsumptionModel LLIZ;
    public final String LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public boolean LLJIJIL;
    public C197039127h LLJILJIL;
    public C0MFG LLJILJILJ;
    public TuxTextView LLJILLL;
    public final String LLJJ;
    public final String LLJJI;
    public final C188C LLJJIII;

    @Override // com.ss.android.ugc.aweme.basicui.BasicImageHeaderSheetFragment
    public final void PR() {
        cS("cancel");
    }

    @Override // com.ss.android.ugc.aweme.basicui.BasicImageHeaderSheetFragment
    public final void RR() {
        cS("click");
    }

    @Override // com.ss.android.ugc.aweme.basicui.BasicImageHeaderSheetFragment
    public final Pair<Integer, String> ZR() {
        int i = this.LLJ;
        if (i <= 0) {
            return null;
        }
        return new Pair<>(Integer.valueOf(R.raw.icon_flash_fill), C21291518Tx.LJ(EnumC21291418Tw.ANCHOR_SHEET_QUOTA_TEXT, Integer.valueOf(i), Integer.valueOf(this.LLJI)));
    }

    @Override // com.ss.android.ugc.aweme.basicui.BasicImageHeaderSheetFragment
    public final String aS() {
        return C21291518Tx.LJ(this.LLIZ.originImageCount <= 0 ? EnumC21291418Tw.ANCHOR_SHEET_TITLE_CREATE : EnumC21291418Tw.ANCHOR_SHEET_TITLE_TRANSFORM, new Object[0]);
    }

    public final void dS() {
        String inputResult;
        AIChatGenPrompt aIChatGenPrompt;
        C0MFG c0mfg = this.LLJILJILJ;
        if (c0mfg == null || (inputResult = c0mfg.getInputResult()) == null || (aIChatGenPrompt = this.LLIZ.prompt) == null) {
            return;
        }
        aIChatGenPrompt.setPromptType(!Intrinsics.LJFF(this.LLJJ, inputResult) ? "input" : this.LLJJI);
        aIChatGenPrompt.setPromptText(inputResult);
    }

    @Override // com.ss.android.ugc.aweme.basicui.BasicImageHeaderSheetFragment
    public final InterfaceC565110MEj<String> WR() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        C0MFG c0mfg = new C0MFG(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(118)));
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        C426750GoL.LJIIJ(marginLayoutParams, context, Integer.valueOf(iLIZIZ), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), Integer.valueOf(iLIZIZ2), null, 48);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0mfg);
        c0mfg.setLayoutParams(marginLayoutParams);
        c0mfg.setTextLengthLimit(C342380DbY.LIZ().inputMaxLength);
        c0mfg.setOnTextFilledStateChanged(new AwS611S0100000_32(this, 218));
        this.LLJILJILJ = c0mfg;
        final LinearLayout linearLayout = new LinearLayout(context);
        C786410Ut5.d6(linearLayout, BasicImageHeaderSheetFragment.NR());
        linearLayout.setOrientation(1);
        C0MFG c0mfg2 = this.LLJILJILJ;
        if (c0mfg2 != null) {
            c0mfg2.setHint(C21291518Tx.LJ(EnumC21291418Tw.ANCHOR_SHEET_EDIT_TEXT_HINT, new Object[0]));
        }
        C0MFG c0mfg3 = this.LLJILJILJ;
        if (c0mfg3 != null) {
            c0mfg3.LIZLLL(this.LLJJ);
        }
        C0MFG c0mfg4 = this.LLJILJILJ;
        if (c0mfg4 != null) {
            c0mfg4.setEditTextHint(C21291518Tx.LJFF(null));
        }
        linearLayout.addView(this.LLJILJILJ);
        return new InterfaceC565110MEj<String>(this) { // from class: X.0MFH
            public final /* synthetic */ C0MFG LL;

            @Override // X.InterfaceC1391500mJY
            public final void LJZI(int i) {
                this.LL.LJZI(i);
            }

            @Override // X.InterfaceC1391500mJY
            public final void LLLL(int i) {
                this.LL.getClass();
            }

            @Override // X.InterfaceC565110MEj
            public final Object getInputResult() {
                return this.LL.getInputResult();
            }

            @Override // X.InterfaceC565110MEj
            public final View LLLILZJ() {
                return linearLayout;
            }

            @Override // X.InterfaceC1391500mJY
            public final void LJJIIJ(int i) {
                this.LL.LIZJ();
            }

            {
                this.LL = this.LLJILJILJ;
            }
        };
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C1727006pY c1727006pY = C1727006pY.LIZ;
        C188C c188c = this.LLJJIII;
        c1727006pY.getClass();
        C1727006pY.LIZLLL.remove(c188c);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        bS();
    }

    @Override // com.ss.android.ugc.aweme.basicui.BasicImageHeaderSheetFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        IAiChatFileService iAiChatFileService;
        InterfaceC332260D0u interfaceC332260D0uOo;
        super.onStart();
        if (!this.LLJIJIL) {
            cS("show");
            this.LLJIJIL = true;
            if (!((Keva) C21287618Sk.LIZ.getValue()).getBoolean("key_privacy_passed", false) && (iAiChatFileService = (IAiChatFileService) PluggableExtentionKt.pluggableSpi$default(IAiChatFileService.class, false, false, false, 14, null)) != null && (interfaceC332260D0uOo = iAiChatFileService.oo(C21288518St.LIZ().guideVideoUrl, ".mp4", 3)) != null) {
                C09IC.LJJI(LifecycleOwnerKt.getLifecycleScope(this), interfaceC332260D0uOo);
            }
        }
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // com.ss.android.ugc.aweme.basicui.BasicImageHeaderSheetFragment
    public final String VR() {
        return this.LLIZLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.basicui.BasicImageHeaderSheetFragment
    public final View SR(InterfaceC565110MEj<String> interfaceC565110MEj) {
        C197039127h c197039127h;
        Context context;
        C197039127h c197039127h2;
        String strLJ;
        View viewSR = super.SR(interfaceC565110MEj);
        if (!(viewSR instanceof C197039127h) || (c197039127h = (C197039127h) viewSR) == null || (context = getContext()) == null) {
            return null;
        }
        this.LLJILJIL = c197039127h;
        int i = 0;
        if ((a0.LJLIIIL(this.LLJJ).toString().length() == 0 || this.LLJ <= 0) && (c197039127h2 = this.LLJILJIL) != null) {
            c197039127h2.setEnabled(false);
        }
        if (this.LLIZ.originImageCount > 0) {
            strLJ = C21291518Tx.LJ(EnumC21291418Tw.ANCHOR_SHEET_BUTTON_OPEN_ALBUM_TEXT, new Object[0]);
        } else {
            strLJ = C21291518Tx.LJ(EnumC21291418Tw.ANCHOR_SHEET_BUTTON_TEXT_TO_IMAGE_TEXT, new Object[0]);
        }
        c197039127h.setText(strLJ);
        c197039127h.setButtonStartIcon(Integer.valueOf(R.raw.icon_ai_add_image_fill));
        C786410Ut5.U8(c197039127h, new ACListenerS166S0100000_32(this, 46));
        C426750GoL.LJIIIZ(c197039127h, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), false, 16);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ViewGroup.MarginLayoutParams marginLayoutParamsNR = BasicImageHeaderSheetFragment.NR();
        C426750GoL.LJIIJ(marginLayoutParamsNR, context, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, null, 58);
        C786410Ut5.d6(linearLayout, marginLayoutParamsNR);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setText(C21291518Tx.LJ(EnumC21291418Tw.ANCHOR_NO_QUOTA_HINT, new Object[0]));
        tuxTextView.setTuxFont(51);
        tuxTextView.setTextColorRes(R.attr.a1k);
        ViewGroup.MarginLayoutParams marginLayoutParamsNR2 = BasicImageHeaderSheetFragment.NR();
        C426750GoL.LJIIJ(marginLayoutParamsNR2, context, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, 48);
        C786410Ut5.R6(tuxTextView, marginLayoutParamsNR2);
        this.LLJILLL = tuxTextView;
        if (this.LLJ > 0) {
            i = 8;
        }
        C786410Ut5.LLLLZLL(tuxTextView, i);
        linearLayout.addView(this.LLJILLL);
        linearLayout.addView(c197039127h);
        return linearLayout;
    }

    public final void cS(String str) {
        String promptType;
        dS();
        C21287418Si c21287418Si = C21287418Si.LIZ;
        AIChatGenConsumptionModel aIChatGenConsumptionModel = this.LLIZ;
        String str2 = aIChatGenConsumptionModel.enterFrom;
        int i = this.LLJ;
        AIChatGenPrompt aIChatGenPrompt = aIChatGenConsumptionModel.prompt;
        if (aIChatGenPrompt == null || (promptType = aIChatGenPrompt.getPromptType()) == null) {
            promptType = "";
        }
        c21287418Si.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str2);
        c0lab.LIZ(i, "vp_process_cnt");
        c0lab.LJ("vp_prompt_type", promptType);
        c0lab.LJ("action_type", str);
        C20684815ws.LJIILLIIL("visual_poet_anchor_guide_action", c0lab.LIZ);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1727006pY c1727006pY = C1727006pY.LIZ;
        C188C c188c = this.LLJJIII;
        c1727006pY.getClass();
        C1727006pY.LIZLLL.add(c188c);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.188C] */
    public AiChatSheetFragment(AIChatGenConsumptionModel aIChatGenConsumptionModel, String str) {
        String promptType;
        String promptText;
        this.LLIZ = aIChatGenConsumptionModel;
        this.LLIZLLLIL = str;
        C1727006pY.LIZ.getClass();
        this.LLJ = C1727006pY.LIZIZ();
        C1727006pY.LIZJ();
        Keva keva = C1727106pZ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_quota_max");
        sbLIZ.append(C1727106pZ.LIZIZ());
        this.LLJI = keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 5);
        AIChatGenPrompt aIChatGenPrompt = aIChatGenConsumptionModel.prompt;
        String str2 = "";
        this.LLJJ = (aIChatGenPrompt == null || (promptText = aIChatGenPrompt.getPromptText()) == null) ? "" : promptText;
        AIChatGenPrompt aIChatGenPrompt2 = aIChatGenConsumptionModel.prompt;
        if (aIChatGenPrompt2 != null && (promptType = aIChatGenPrompt2.getPromptType()) != null) {
            str2 = promptType;
        }
        this.LLJJI = str2;
        this.LLJJIII = new InterfaceC1727306pb() { // from class: X.188C
            @Override // X.InterfaceC1727306pb
            public final void LIZ(int i, int i2) {
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C188B(this.LIZ, i, i2, null), 3);
            }
        };
    }
}
