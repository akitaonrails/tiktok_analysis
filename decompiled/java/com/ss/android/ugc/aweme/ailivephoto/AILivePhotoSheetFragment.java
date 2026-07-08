package com.ss.android.ugc.aweme.ailivephoto;

import X.C01GW;
import X.C0LAB;
import X.C0LXU;
import X.C0MDW;
import X.C0MEB;
import X.C0MED;
import X.C1440005kM;
import X.C197039127h;
import X.C20684815ws;
import X.C372570Ej9;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C453940Hr6;
import X.C528260Kng;
import X.C565120MEk;
import X.C565130MEl;
import X.C565150MEn;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC565110MEj;
import X.InterfaceC658750Psf;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS143S0100000_8;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.basicui.BasicImageHeaderSheetFragment;
import com.ss.android.ugc.aweme.feed.model.AIAliveInfo;
import com.ss.android.ugc.aweme.services.external.IAILiveService;
import com.ss.android.ugc.aweme.services.external.ImageMonitorParams;
import com.ss.android.ugc.aweme.services.external.OpenPostAlbumParams;
import com.ss.android.ugc.aweme.story.publish.ISocialPublishBridgeService;
import com.ss.android.ugc.gamora.editor.ailive.repo.AILivePhotoPromptStruct;
import com.zhiliaoapp.musically.R;
import irm.AkS53S0200000_8;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class AILivePhotoSheetFragment extends BasicImageHeaderSheetFragment<AILivePhotoPromptStruct> {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQlJSYlLTHELIOSUkJjs8ZgQFBSYlLRUkJjs8Gy0pLDsVOiQrJCo9PA==";
    public AILivePhotoPromptStruct LLIZ;
    public int LLIZLLLIL;
    public OpenPostAlbumParams LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(62));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 52));
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(60));
    public final C01GW LLJJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(61));

    @Override // com.ss.android.ugc.aweme.basicui.BasicImageHeaderSheetFragment
    public final void PR() {
        if (this.LLJIJIL) {
            return;
        }
        cS("cancel");
    }

    @Override // com.ss.android.ugc.aweme.basicui.BasicImageHeaderSheetFragment
    public final void RR() {
        cS("click");
    }

    @Override // com.ss.android.ugc.aweme.basicui.BasicImageHeaderSheetFragment
    public final String VR() {
        AIAliveInfo aIAliveInfo;
        String styleImageUrl;
        OpenPostAlbumParams openPostAlbumParams = this.LLJ;
        return (openPostAlbumParams == null || (aIAliveInfo = openPostAlbumParams.aiAliveInfo) == null || (styleImageUrl = aIAliveInfo.getStyleImageUrl()) == null) ? "" : styleImageUrl;
    }

    @Override // com.ss.android.ugc.aweme.basicui.BasicImageHeaderSheetFragment
    public final Pair<Integer, String> ZR() {
        int i = this.LLIZLLLIL;
        if (i <= 0) {
            return null;
        }
        return new Pair<>(Integer.valueOf(R.raw.icon_flash_fill), C0MED.LIZ(C0MEB.PANEL_TRIES, Integer.valueOf(i), Integer.valueOf(C0LXU.LIZ(Source.EDIT_AI_LIVE_PHOTO.getSource(), true).quota)));
    }

    @Override // com.ss.android.ugc.aweme.basicui.BasicImageHeaderSheetFragment
    public final String aS() {
        return C0MED.LIZ(C0MEB.PANEL_TITLE, new Object[0]);
    }

    @Override // com.ss.android.ugc.aweme.basicui.BasicImageHeaderSheetFragment
    public final void OR() {
        AIAliveInfo aIAliveInfo;
        Bundle arguments = getArguments();
        AILivePhotoPromptStruct aILivePhotoPromptStruct = null;
        Serializable serializable = arguments != null ? arguments.getSerializable("open_album_params") : null;
        OpenPostAlbumParams openPostAlbumParams = serializable instanceof OpenPostAlbumParams ? (OpenPostAlbumParams) serializable : null;
        this.LLJ = openPostAlbumParams;
        if (openPostAlbumParams != null && (aIAliveInfo = openPostAlbumParams.aiAliveInfo) != null) {
            String text = aIAliveInfo.getText();
            if (text == null) {
                text = "";
            }
            String modelPrompt = aIAliveInfo.getModelPrompt();
            if (modelPrompt == null) {
                modelPrompt = "";
            }
            String modelKey = aIAliveInfo.getModelKey();
            if (modelKey == null) {
                modelKey = "";
            }
            String promptType = aIAliveInfo.getPromptType();
            aILivePhotoPromptStruct = new AILivePhotoPromptStruct(text, modelPrompt, promptType != null ? promptType : "", modelKey, "");
        }
        this.LLIZ = aILivePhotoPromptStruct;
        this.LLIZLLLIL = C0LXU.LIZ(Source.EDIT_AI_LIVE_PHOTO.getSource(), true).quotaRemain;
        ISocialPublishBridgeService iSocialPublishBridgeService = (ISocialPublishBridgeService) this.LLJILJIL.getValue();
        if (iSocialPublishBridgeService != null) {
            iSocialPublishBridgeService.Kg((C565130MEl) this.LLJILJILJ.getValue(), new C565120MEk());
        }
        C1440005kM.LIZ(new C453940Hr6(true, false, 4));
    }

    @Override // com.ss.android.ugc.aweme.basicui.BasicImageHeaderSheetFragment
    public final InterfaceC565110MEj<AILivePhotoPromptStruct> WR() {
        String str;
        Context context = getContext();
        if (context == null) {
            return null;
        }
        final C0MDW c0mdw = new C0MDW(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(118)));
        C426750GoL.LJIIJ(marginLayoutParams, context, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, 48);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0mdw);
        c0mdw.setLayoutParams(marginLayoutParams);
        c0mdw.setTextLengthLimit(400);
        final LinearLayout linearLayout = new LinearLayout(context);
        C786410Ut5.d6(linearLayout, BasicImageHeaderSheetFragment.NR());
        linearLayout.setOrientation(1);
        c0mdw.setHint(C0MED.LIZ(C0MEB.PANEL_TEXT_DESC, new Object[0]));
        AILivePhotoPromptStruct aILivePhotoPromptStruct = this.LLIZ;
        c0mdw.LLJILJILJ = aILivePhotoPromptStruct;
        if (aILivePhotoPromptStruct == null || (str = aILivePhotoPromptStruct.prompt) == null) {
            str = "";
        }
        c0mdw.LIZLLL(str);
        linearLayout.addView(c0mdw);
        return new InterfaceC565110MEj<AILivePhotoPromptStruct>() { // from class: X.0MEi
            @Override // X.InterfaceC1391500mJY
            public final void LJZI(int i) {
                c0mdw.LJZI(i);
            }

            @Override // X.InterfaceC1391500mJY
            public final void LLLL(int i) {
                c0mdw.getClass();
            }

            @Override // X.InterfaceC565110MEj
            public final Object getInputResult() {
                return c0mdw.getInputResult();
            }

            @Override // X.InterfaceC565110MEj
            public final View LLLILZJ() {
                return linearLayout;
            }

            @Override // X.InterfaceC1391500mJY
            public final void LJJIIJ(int i) {
                c0mdw.LIZJ();
            }
        };
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ISocialPublishBridgeService iSocialPublishBridgeService = (ISocialPublishBridgeService) this.LLJILJIL.getValue();
        if (iSocialPublishBridgeService != null) {
            iSocialPublishBridgeService.f8((C565130MEl) this.LLJILJILJ.getValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.basicui.BasicImageHeaderSheetFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        if (!this.LLJI) {
            cS("show");
            this.LLJI = true;
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
    public final View SR(InterfaceC565110MEj<AILivePhotoPromptStruct> interfaceC565110MEj) {
        C197039127h c197039127h;
        Context context = getContext();
        if (context == null) {
            return null;
        }
        View viewSR = super.SR(interfaceC565110MEj);
        if (!(viewSR instanceof C197039127h) || (c197039127h = (C197039127h) viewSR) == null) {
            return null;
        }
        if (this.LLIZLLLIL <= 0) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            ViewGroup.MarginLayoutParams marginLayoutParamsNR = BasicImageHeaderSheetFragment.NR();
            C426750GoL.LJIIJ(marginLayoutParamsNR, context, null, Integer.valueOf(C372570Ej9.LIZ(16)), null, null, 58);
            C786410Ut5.d6(linearLayout, marginLayoutParamsNR);
            c197039127h.setButtonStartIcon(null);
            c197039127h.setText(C0MED.LIZ(C0MEB.PANEL_CTA_NOTIFY, new Object[0]));
            C786410Ut5.U8(c197039127h, new ACListenerS143S0100000_8(this, 11));
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            tuxTextView.setText(C0MED.LIZ(C0MEB.PANEL_TRIES_ZERO, Integer.valueOf(this.LLIZLLLIL), Integer.valueOf(C0LXU.LIZ(Source.EDIT_AI_LIVE_PHOTO.getSource(), true).quota)));
            tuxTextView.setTuxFont(51);
            tuxTextView.setTextColorRes(R.attr.a1k);
            tuxTextView.setGravity(17);
            ViewGroup.MarginLayoutParams marginLayoutParamsNR2 = BasicImageHeaderSheetFragment.NR();
            C426750GoL.LJIIJ(marginLayoutParamsNR2, context, Integer.valueOf(C372570Ej9.LIZ(16)), null, Integer.valueOf(C372570Ej9.LIZ(16)), Integer.valueOf(C372570Ej9.LIZ(0)), 36);
            C786410Ut5.R6(tuxTextView, marginLayoutParamsNR2);
            C426750GoL.LJIIIZ(c197039127h, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, null, false, 29);
            linearLayout.addView(tuxTextView);
            linearLayout.addView(c197039127h);
            return linearLayout;
        }
        c197039127h.setText(C0MED.LIZ(C0MEB.PANEL_CTA_UPLOAD, new Object[0]));
        c197039127h.setButtonStartIcon(Integer.valueOf(R.raw.icon_live_photo_ai));
        C786410Ut5.I7(new AkS53S0200000_8((InterfaceC565110MEj) interfaceC565110MEj, this, 1), c197039127h);
        return c197039127h;
    }

    @Override // com.ss.android.ugc.aweme.basicui.BasicImageHeaderSheetFragment
    public final InterfaceC658750Psf UR(Function0<Long> function0) {
        IAILiveService iAILiveService = (IAILiveService) this.LLJILLL.getValue();
        if (iAILiveService != null) {
            return iAILiveService.provideImageMonitorListener(new ImageMonitorParams("sheet", function0, new AwS552S0100000_8(this, 51)));
        }
        return null;
    }

    public final void cS(String str) {
        String modelPrompt;
        OpenPostAlbumParams openPostAlbumParams = this.LLJ;
        if (openPostAlbumParams != null) {
            C565150MEn c565150MEn = C565150MEn.LIZ;
            AIAliveInfo aIAliveInfo = openPostAlbumParams.originAIAliveInfo;
            if (aIAliveInfo != null) {
                modelPrompt = aIAliveInfo.getModelPrompt();
            } else {
                modelPrompt = null;
            }
            String str2 = openPostAlbumParams.enterFrom;
            int i = this.LLIZLLLIL;
            c565150MEn.getClass();
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("origin_ai_alive_prompt", modelPrompt);
            c0lab.LJ("enter_from", str2);
            c0lab.LJ("action_type", str);
            if (C528260Kng.LIZ()) {
                c0lab.LIZ(i, "process_cnt");
            }
            C20684815ws.LJIILLIIL("ai_livephoto_anchor_guide_action", c0lab.LIZ);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C1440005kM.LIZ(new C453940Hr6(false, false, 4));
    }
}
