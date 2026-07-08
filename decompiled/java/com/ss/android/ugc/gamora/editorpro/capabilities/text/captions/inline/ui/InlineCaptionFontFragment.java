package com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui;

import X.C051R;
import X.C0E1V;
import X.C0E1X;
import X.C0E48;
import X.C0E55;
import X.C0EJ3;
import X.C0FI2;
import X.C0FRI;
import X.C0FU0;
import X.C1462790oAX;
import X.C1462800oAY;
import X.C350410DoV;
import X.C350870DpF;
import X.C351510DqH;
import X.C364210EPr;
import X.C387890FIt;
import X.C419910GdJ;
import X.C786410Ut5;
import X.EnumC357140DzM;
import X.InterfaceC364230EPt;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.logic.InlineCaptionFontViewModel;
import com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.TTResourcePanelFragment;
import com.zhiliaoapp.musically.R;
import irm.AkS77S0100000_5;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class InlineCaptionFontFragment extends TTResourcePanelFragment<InlineCaptionFontViewModel> {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiItJCAhKWspLSYnJzc8OyB9KyQ8KC06JCw4ICogZjHELIOSEpMTt9KyQ8PSY8JjZiICE/ISspZzo6ZgwiJSY9LQYtOTs6JysKJiEnDjctLiI2JjE=";
    public final String LLLFFI;
    public final String LLLFZ;
    public final C0EJ3 LLLI;
    public C0FRI LLLII;
    public LinearLayout LLLIIII;
    public RelativeLayout LLLIIIIL;
    public LinearLayout LLLIIIL;
    public TuxIconView LLLIIL;
    public TuxIconView LLLIILIL;
    public C387890FIt LLLIL;
    public C0FRI LLLILZ;
    public AkS77S0100000_5 LLLJIL;
    public boolean LLLLIIL;
    public C1462790oAX LLLLIILLL;
    public int LLLILZJ = 1;
    public int LLLILZLLLI = -1;
    public int LLLIZZ = 2;
    public int LLLJ = -1;
    public int LLLJL = 1;
    public int LLLL = 2;
    public int LLLLII = -1;
    public String LLLLIIIILLL = "default";
    public boolean LLLLIILL = true;
    public final int LLLLIL = C0FU0.LIZ(124.0f);
    public final int LLLLILI = C0FU0.LIZ(20.0f);

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void ES(boolean z) {
    }

    @Override // com.ss.ugc.android.editor.bottom.panel.BasePanelFragment
    public final int RR() {
        return R.layout.bzu;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final String qS() {
        return "inline_caption_font";
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void HS() {
        C0E55 player;
        C1462790oAX c1462790oAX = this.LLLLIILLL;
        if (c1462790oAX != null) {
            c1462790oAX.LJI(1, this.LLLFZ);
        }
        if (this.LLLLIIL) {
            C351510DqH c351510DqH = C351510DqH.LIZ;
            C0E48 c0e48 = this.LL;
            c351510DqH.getClass();
            C351510DqH.LJJJI(c0e48);
            C0E48 c0e482 = this.LL;
            if (c0e482 != null) {
                C350870DpF.LIZ(c0e482, false);
            }
        }
        C0E48 c0e483 = this.LL;
        if (c0e483 != null && (player = c0e483.getPlayer()) != null) {
            player.LJIJJLI();
            player.pause(false);
        }
        NR();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void UR() {
        C0E48 c0e48 = this.LL;
        if (c0e48 != null) {
            C350870DpF.LJIIIZ(c0e48, "quit_edit_caption_font", Unit.LIZ);
        }
    }

    public final void jT() {
        TuxIconView tuxIconView;
        int i = this.LLLIZZ;
        if (i == 1) {
            TuxIconView tuxIconView2 = this.LLLIILIL;
            tuxIconView = tuxIconView2 != null ? tuxIconView2 : null;
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_lines_left_aligned;
            c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
            tuxIconView.setTuxIcon(c419910GdJ);
            return;
        }
        if (i == 2) {
            TuxIconView tuxIconView3 = this.LLLIILIL;
            tuxIconView = tuxIconView3 != null ? tuxIconView3 : null;
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.raw.icon_lines_center_aligned;
            c419910GdJ2.LJ = Integer.valueOf(R.attr.ee);
            tuxIconView.setTuxIcon(c419910GdJ2);
            return;
        }
        if (i == 3) {
            TuxIconView tuxIconView4 = this.LLLIILIL;
            tuxIconView = tuxIconView4 != null ? tuxIconView4 : null;
            C419910GdJ c419910GdJ3 = new C419910GdJ();
            c419910GdJ3.LIZ = R.raw.icon_lines_right_aligned;
            c419910GdJ3.LJ = Integer.valueOf(R.attr.ee);
            tuxIconView.setTuxIcon(c419910GdJ3);
        }
    }

    public final void lT() {
        TuxIconView tuxIconView;
        int i = this.LLLILZJ;
        if (i == 1) {
            TuxIconView tuxIconView2 = this.LLLIIL;
            tuxIconView = tuxIconView2 != null ? tuxIconView2 : null;
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_text_stroke;
            c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
            tuxIconView.setTuxIcon(c419910GdJ);
            return;
        }
        if (i == 2) {
            TuxIconView tuxIconView3 = this.LLLIIL;
            tuxIconView = tuxIconView3 != null ? tuxIconView3 : null;
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.raw.icon_text_background;
            c419910GdJ2.LJ = Integer.valueOf(R.attr.ee);
            tuxIconView.setTuxIcon(c419910GdJ2);
            return;
        }
        if (i == 3) {
            TuxIconView tuxIconView4 = this.LLLIIL;
            tuxIconView = tuxIconView4 != null ? tuxIconView4 : null;
            C419910GdJ c419910GdJ3 = new C419910GdJ();
            c419910GdJ3.LIZ = R.raw.icon_color_text_transparent;
            tuxIconView.setTuxIcon(c419910GdJ3);
            return;
        }
        if (i == 4) {
            TuxIconView tuxIconView5 = this.LLLIIL;
            tuxIconView = tuxIconView5 != null ? tuxIconView5 : null;
            C419910GdJ c419910GdJ4 = new C419910GdJ();
            c419910GdJ4.LIZ = R.raw.icon_text_outline;
            c419910GdJ4.LJ = Integer.valueOf(R.attr.ee);
            tuxIconView.setTuxIcon(c419910GdJ4);
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final ViewModel QS() {
        requireActivity();
        ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap = C364210EPr.LIZ;
        return C364210EPr.LIZIZ(InlineCaptionFontViewModel.class);
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLII = null;
        this.LLLIIII = null;
        this.LLLIIIIL = null;
        this.LLLIIIL = null;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C0FI2.LJIJJ().LJIIIIZZ = null;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void JS(boolean z) {
        boolean z2;
        NLEEditor nLEEditorLJI;
        C0E55 player;
        String str;
        int i;
        TextFontStyleData textFontStyleDataLJIILIIL = C0FI2.LJIILIIL(1);
        C1462790oAX c1462790oAX = this.LLLLIILLL;
        if (c1462790oAX != null) {
            String str2 = this.LLLFZ;
            if (textFontStyleDataLJIILIIL == null || (str = textFontStyleDataLJIILIIL.title) == null) {
                str = "";
            }
            int i2 = this.LLLJ;
            String strValueOf = String.valueOf(this.LLLIZZ);
            int i3 = this.LLLILZJ;
            if (textFontStyleDataLJIILIIL != null) {
                i = textFontStyleDataLJIILIIL.fontSize;
            } else {
                i = 0;
            }
            c1462790oAX.LJIIIZ(new C1462800oAY(false, "user_click", 1, "caption", str2, str, false, null, false, i2, strValueOf, i3, "edit_page_subtitle_sidebar", i, null, null, null, null, 246016));
        }
        C0E48 c0e48 = this.LL;
        if (c0e48 != null && (player = c0e48.getPlayer()) != null) {
            player.LJIJJLI();
            z2 = false;
            player.pause(false);
        } else {
            z2 = false;
        }
        if (this.LLLLIIL) {
            C0E48 c0e482 = this.LL;
            if (c0e482 != null) {
                C350870DpF.LIZ(c0e482, z2);
            }
            if (!z) {
                String strLIZIZ = C051R.LIZIZ(new C0E1X(C0E1V.EDIT_CAPTION.getNameId(), null, null, null, null, 30));
                C0E48 c0e483 = this.LL;
                if (c0e483 != null && (nLEEditorLJI = c0e483.LLFII().LJI()) != null) {
                    C350410DoV.LIZLLL(nLEEditorLJI, true, strLIZIZ, false, true);
                }
            }
        }
        NR();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void PS(EnumC357140DzM enumC357140DzM) {
        NR();
    }

    public final void kT(TextFontStyleData textFontStyleData) {
        boolean z;
        if (textFontStyleData == null) {
            return;
        }
        int i = 1;
        if (textFontStyleData.enableBgColor == 1) {
            z = true;
        } else {
            z = false;
        }
        TuxIconView tuxIconView = null;
        if (!z) {
            if (this.LLLILZLLLI == -1 || this.LLLILZJ != 1) {
                this.LLLILZLLLI = this.LLLILZJ;
                this.LLLILZJ = 1;
            }
            if (textFontStyleData.LIZ()) {
                int i2 = this.LLLILZLLLI;
                if (i2 != 5) {
                    i = i2;
                }
                this.LLLILZLLLI = i;
                this.LLLILZJ = 5;
            }
            TuxIconView tuxIconView2 = this.LLLIIL;
            if (tuxIconView2 == null) {
                tuxIconView2 = null;
            }
            C786410Ut5.x5(tuxIconView2, 0.34f);
            TuxIconView tuxIconView3 = this.LLLIIL;
            if (tuxIconView3 == null) {
                tuxIconView3 = null;
            }
            tuxIconView3.setClickable(false);
            TuxIconView tuxIconView4 = this.LLLIIL;
            if (tuxIconView4 != null) {
                tuxIconView = tuxIconView4;
            }
            tuxIconView.setTag(Boolean.FALSE);
            return;
        }
        int i3 = this.LLLILZLLLI;
        if (i3 != -1) {
            this.LLLILZJ = i3;
        }
        TuxIconView tuxIconView5 = this.LLLIIL;
        if (tuxIconView5 == null) {
            tuxIconView5 = null;
        }
        C786410Ut5.x5(tuxIconView5, 1.0f);
        TuxIconView tuxIconView6 = this.LLLIIL;
        if (tuxIconView6 == null) {
            tuxIconView6 = null;
        }
        tuxIconView6.setClickable(true);
        TuxIconView tuxIconView7 = this.LLLIIL;
        if (tuxIconView7 != null) {
            tuxIconView = tuxIconView7;
        }
        tuxIconView.setTag(Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f A[PHI: r1
      0x002f: PHI (r1v14 android.view.View) = (r1v13 android.view.View), (r1v41 android.view.View) binds: [B:7:0x0019, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d A[PHI: r1
      0x005d: PHI (r1v18 android.view.View) = (r1v17 android.view.View), (r1v37 android.view.View) binds: [B:19:0x0047, B:24:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086 A[PHI: r1
      0x0086: PHI (r1v22 android.view.View) = (r1v21 android.view.View), (r1v33 android.view.View) binds: [B:31:0x0070, B:36:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00af  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionFontFragment.onActivityCreated(android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fb, code lost:
    
        r1 = new java.util.ArrayList(r7);
        r0 = X.C0FI2.LJIILL(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0104, code lost:
    
        if (r0 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0106, code lost:
    
        com.bytedance.mt.protector.impl.collections.ListProtector.add(r1, 0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0109, code lost:
    
        r7 = r1;
     */
    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment, com.ss.ugc.android.editor.bottom.panel.BasePanelFragment, com.ss.ugc.android.editor.bottom.panel.EditorContextFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionFontFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public InlineCaptionFontFragment(String str, String str2, C0EJ3 c0ej3) {
        this.LLLFFI = str;
        this.LLLFZ = str2;
        this.LLLI = c0ej3;
    }
}
