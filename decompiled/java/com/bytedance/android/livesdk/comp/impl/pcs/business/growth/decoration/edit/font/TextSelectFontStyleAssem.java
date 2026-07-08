package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.font;

import X.C019F;
import X.C01D1;
import X.C01DP;
import X.C01GW;
import X.C09R3;
import X.C0IJT;
import X.C13LE;
import X.C13LP;
import X.C1637806bA;
import X.C1637906bB;
import X.C1839320xxq;
import X.C1839330xxr;
import X.C1839350xxt;
import X.C1839360xxu;
import X.C1839370xxv;
import X.C1839380xxw;
import X.C1839440xy2;
import X.C1839450xy3;
import X.C1839480xy6;
import X.C1839490xy7;
import X.C1839500xy8;
import X.C1839560xyE;
import X.C19719912Dl;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C23250099c;
import X.C433500GzE;
import X.C452501pT;
import X.C469900Ibk;
import X.C474500IjA;
import X.C500260Jjc;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.RichTextStyleEditViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.font.viewmodel.BoardTextDynamicStyleViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.font.viewmodel.BoardTextSelectFontStyleViewModel;
import com.bytedance.android.livesdk.model.SMBBoardFontStyle;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.editor.board.BoardTextFontStyleData;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TextSelectFontStyleAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final AssemVMLazy LLJJI;
    public final AssemVMLazy LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public final List<C1839330xxr> LLJJIJIIJIL;
    public String LLJJIJIL;
    public final int LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TextSelectFontStyleAssem.class, "boardTextDynamicStyleViewModel", "getBoardTextDynamicStyleViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/font/viewmodel/BoardTextDynamicStyleViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TextSelectFontStyleAssem.class, "boardTextSelectFontStyleViewModel", "getBoardTextSelectFontStyleViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/font/viewmodel/BoardTextSelectFontStyleViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(TextSelectFontStyleAssem.class, "richTextStyleEditViewModel", "getRichTextStyleEditViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/decorationtools/RichTextStyleEditViewModel;", 0);
        c09r3.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public TextSelectFontStyleAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BoardTextDynamicStyleViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new C1839350xxt(c19719912DlLIZ), new C1839480xy6(), null, true);
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BoardTextSelectFontStyleViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new C1839360xxu(c19719912DlLIZ2), new C1839490xy7(), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(RichTextStyleEditViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new C1839370xxv(c19719912DlLIZ3), new C1839500xy8(), null, true);
        this.LLJJIJIIJIL = new ArrayList();
        this.LLJJJ = 2;
        this.LLJJJIL = C452501pT.LIZIZ(new C1839450xy3(this));
        this.LLJJJJ = C452501pT.LIZIZ(new C1839440xy2(this));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.gxs;
    }

    public final void hp() {
        String strLIZ;
        String strLIZ2;
        C1839330xxr c1839330xxr = (C1839330xxr) C13LP.LJJJLL(this.LLJJIJIIJIL);
        if (c1839330xxr != null) {
            BoardTextFontStyleData fontData = c1839330xxr.getFontData();
            if (fontData != null && (strLIZ2 = fontData.LIZ()) != null) {
                this.LLJJIJIL = strLIZ2;
            }
            if (c1839330xxr.LJFF()) {
                BoardTextFontStyleData fontData2 = c1839330xxr.getFontData();
                if (fontData2 != null && (strLIZ = fontData2.LIZ()) != null) {
                    C1839560xyE.LIZJ = strLIZ;
                    lp();
                    ip().setState(new C1839380xxw(fontData2));
                }
                lp();
            }
        }
    }

    public final BoardTextSelectFontStyleViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (BoardTextSelectFontStyleViewModel) assemVMLazy.getValue();
    }

    public final void lp() {
        for (C1839330xxr c1839330xxr : (ArrayList) this.LLJJIJIIJIL) {
            String strLIZJ = C1839560xyE.LIZJ(this.LLJJJ);
            if (TextUtils.isEmpty(strLIZJ) || !Intrinsics.LJFF(strLIZJ, c1839330xxr.getTag())) {
                c1839330xxr.setTextFontTypeLayoutBackground(0);
            } else if (c1839330xxr.LJ()) {
                c1839330xxr.setTextFontTypeLayoutBackground(1);
                c1839330xxr.LIZJ();
                ((C433500GzE) this.LLJJJIL.getValue()).LIZ(c1839330xxr);
            }
        }
    }

    public final void kp(BoardTextFontStyleData boardTextFontStyleData) {
        String strLIZ;
        Object obj;
        if (boardTextFontStyleData != null && (strLIZ = boardTextFontStyleData.LIZ()) != null) {
            C1839560xyE.LIZJ = strLIZ;
            lp();
            ip().setState(new C1839380xxw(boardTextFontStyleData));
            BoardTextSelectFontStyleViewModel boardTextSelectFontStyleViewModelIp = ip();
            if (((C01DP) boardTextSelectFontStyleViewModelIp.LL.getValue()).LIZ()) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_decoration_text_item_editing_page");
                c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
                c474500IjALIZ.LJJII(((C01DP) boardTextSelectFontStyleViewModelIp.LL.getValue()).LLILZ, "decoration_entrance");
                c474500IjALIZ.LJJII("click", "action_type");
                c474500IjALIZ.LJJII("font", "click_position");
                SMBBoardFontStyle sMBBoardFontStyle = boardTextFontStyleData.LIZLLL;
                if (sMBBoardFontStyle == null || (obj = sMBBoardFontStyle.fontIdentifier) == null) {
                    obj = 0;
                }
                c474500IjALIZ.LJJII(obj, "clicked_font");
                c474500IjALIZ.LIZ();
            }
        }
        lp();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C500260Jjc.LLFFF(LJJIJL());
        ((View) this.LLJJJIL.getValue()).setHorizontalScrollBarEnabled(false);
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217371BqR() { // from class: X.0JE7
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C469920Ibm) obj).LL;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C469920Ibm) obj).LL = (List) obj2;
            }
        }, null, new C1839320xxq(this), 6);
        Context context = getContext();
        if (context != null) {
            BoardTextDynamicStyleViewModel boardTextDynamicStyleViewModel = (BoardTextDynamicStyleViewModel) this.LLJJI.getValue();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(boardTextDynamicStyleViewModel), null, null, new C469900Ibk(boardTextDynamicStyleViewModel, context, null), 3);
        }
    }
}
