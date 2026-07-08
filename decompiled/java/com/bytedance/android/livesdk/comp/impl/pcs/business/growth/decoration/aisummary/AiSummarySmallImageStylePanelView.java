package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.aisummary;

import X.C038Q;
import X.C0GZW;
import X.C1161920gLG;
import X.C1308910kAL;
import X.C1390410mHn;
import X.C13LP;
import X.C1778310wNR;
import X.C1812240xGA;
import X.C1812520xGc;
import X.C1812550xGf;
import X.C1812570xGh;
import X.C1812610xGl;
import X.C1812750xGz;
import X.C1812850xH9;
import X.C1813080xHW;
import X.C1954807lC;
import X.C197039127h;
import X.C19R6;
import X.C23250099c;
import X.C324390Cnd;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C497700JfU;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1812620xGm;
import X.EnumC768840UDy;
import X.InterfaceC1891350zJl;
import android.graphics.drawable.LayerDrawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.aisummary.AiSummarySmallImageStylePanelView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent.RichTextPreviewView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAISummaryBoardSetting;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class AiSummarySmallImageStylePanelView extends PowerCell<C1812570xGh> {
    public C1812550xGf LLILLJJLI;
    public C1812550xGf LLILLL;
    public C1812550xGf LLILZ;
    public View LLILZIL;
    public C1812570xGh LLILZLL;
    public C1390410mHn LLIZ;
    public View LLIZLLLIL;
    public C1778310wNR LLJ;
    public boolean LLJIJIL;
    public final AiSummaryViewModel LL = (AiSummaryViewModel) ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).createViewModel(AiSummaryViewModel.class);
    public final boolean LLJI = LiveAISummaryBoardSetting.INSTANCE.aiSummaryUsageOpt();

    public AiSummarySmallImageStylePanelView() {
        C1813080xHW.LIZ = "design_2";
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        P5(this.LLILLJJLI, 0);
        P5(this.LLILLL, 1);
        P5(this.LLILZ, 2);
    }

    public final void I5(List<C1812850xH9> list) {
        C1812550xGf c1812550xGf = this.LLILLJJLI;
        if (c1812550xGf != null) {
            c1812550xGf.LIZIZ();
        }
        C1812550xGf c1812550xGf2 = this.LLILLL;
        if (c1812550xGf2 != null) {
            c1812550xGf2.LIZIZ();
        }
        C1812550xGf c1812550xGf3 = this.LLILZ;
        if (c1812550xGf3 != null) {
            c1812550xGf3.LIZIZ();
        }
        C1812850xH9 c1812850xH9 = (C1812850xH9) C13LP.LJJJLZIJ(0, list);
        if (c1812850xH9 != null) {
            L5(this.LLILLJJLI, c1812850xH9, 0);
        }
        C1812850xH9 c1812850xH92 = (C1812850xH9) C13LP.LJJJLZIJ(1, list);
        if (c1812850xH92 != null) {
            L5(this.LLILLL, c1812850xH92, 1);
        }
        C1812850xH9 c1812850xH93 = (C1812850xH9) C13LP.LJJJLZIJ(2, list);
        if (c1812850xH93 != null) {
            L5(this.LLILZ, c1812850xH93, 2);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        List<C1812850xH9> list;
        EnumC768840UDy enumC768840UDy;
        C1812570xGh c1812570xGh = (C1812570xGh) interfaceC1891350zJl;
        this.LLILZLL = c1812570xGh;
        boolean z = false;
        if (this.LLJI) {
            C1778310wNR c1778310wNR = c1812570xGh.LLILZ;
            if (c1778310wNR != null) {
                this.LLJ = c1778310wNR;
            }
            if (c1812570xGh.LLILLL == EnumC1812620xGm.LOADING && c1812570xGh.LL.isEmpty() && !this.LLJIJIL && this.LLJ != null) {
                z = true;
            }
            if (z) {
                this.LLJIJIL = true;
                C1390410mHn c1390410mHn = this.LLIZ;
                if (c1390410mHn != null) {
                    C500260Jjc.LLFFF(c1390410mHn);
                }
                C1390410mHn c1390410mHn2 = this.LLIZ;
                if (c1390410mHn2 != null) {
                    c1390410mHn2.LIZJ();
                }
                View view = this.LLIZLLLIL;
                if (view != null) {
                    C500260Jjc.LJIILLIIL(view);
                }
                C1778310wNR c1778310wNR2 = this.LLJ;
                if (c1778310wNR2 != null) {
                    if (c1778310wNR2.LIZJ) {
                        enumC768840UDy = EnumC768840UDy.PREVIEW;
                    } else {
                        enumC768840UDy = EnumC768840UDy.BROADCAST;
                    }
                    this.LL.vQ2(new C1812520xGc(enumC768840UDy, 1, c1778310wNR2.LIZ, c1778310wNR2.LIZIZ, 0));
                }
                LifecycleOwner currentLifecycleOwner = getCurrentLifecycleOwner();
                if (currentLifecycleOwner != null) {
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(currentLifecycleOwner), null, null, new C324390Cnd(currentLifecycleOwner, this, null), 3);
                    return;
                }
                return;
            }
            int i = C1812610xGl.LIZ[c1812570xGh.LLILLL.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3 && i != 4) {
                    throw new C1954807lC();
                }
                C1390410mHn c1390410mHn3 = this.LLIZ;
                if (c1390410mHn3 != null) {
                    C500260Jjc.LJIILLIIL(c1390410mHn3);
                }
                View view2 = this.LLIZLLLIL;
                if (view2 != null) {
                    C500260Jjc.LLFFF(view2);
                }
                if (!c1812570xGh.LL.isEmpty()) {
                    list = c1812570xGh.LL;
                } else {
                    list = c1812570xGh.LLILLJJLI;
                }
                I5(list);
                return;
            }
            C1390410mHn c1390410mHn4 = this.LLIZ;
            if (c1390410mHn4 != null) {
                C500260Jjc.LLFFF(c1390410mHn4);
            }
            C1390410mHn c1390410mHn5 = this.LLIZ;
            if (c1390410mHn5 != null) {
                c1390410mHn5.LIZJ();
            }
            View view3 = this.LLIZLLLIL;
            if (view3 == null) {
                return;
            }
            C500260Jjc.LJIILLIIL(view3);
            return;
        }
        C1812550xGf c1812550xGf = this.LLILLJJLI;
        if (c1812550xGf != null) {
            c1812550xGf.LIZIZ();
        }
        C1812550xGf c1812550xGf2 = this.LLILLL;
        if (c1812550xGf2 != null) {
            c1812550xGf2.LIZIZ();
        }
        C1812550xGf c1812550xGf3 = this.LLILZ;
        if (c1812550xGf3 != null) {
            c1812550xGf3.LIZIZ();
        }
        C1812850xH9 c1812850xH9 = (C1812850xH9) C13LP.LJJJLZIJ(0, c1812570xGh.LL);
        if (c1812850xH9 != null) {
            L5(this.LLILLJJLI, c1812850xH9, 0);
        }
        C1812850xH9 c1812850xH92 = (C1812850xH9) C13LP.LJJJLZIJ(1, c1812570xGh.LL);
        if (c1812850xH92 != null) {
            L5(this.LLILLL, c1812850xH92, 1);
        }
        C1812850xH9 c1812850xH93 = (C1812850xH9) C13LP.LJJJLZIJ(2, c1812570xGh.LL);
        if (c1812850xH93 == null) {
            return;
        }
        L5(this.LLILZ, c1812850xH93, 2);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        int i;
        int iLJIIZILJ;
        View view;
        ViewGroup.LayoutParams layoutParams;
        Integer numLIZJ;
        if (this.LLJI && !LiveAISummaryBoardSetting.INSTANCE.previewKeepOldStyle()) {
            i = R.layout.fy7;
        } else {
            i = R.layout.fy6;
        }
        View view2 = null;
        View viewInflateItemView$default = PowerCell.inflateItemView$default(this, viewGroup, i, false, 4, null);
        TextView textView = (TextView) viewInflateItemView$default.findViewById(R.id.ji6);
        if (textView != null && C497700JfU.LIZ.LIZ() != EnumC768840UDy.PREVIEW && (numLIZJ = C1308910kAL.LIZJ(R.attr.c5r, new ContextThemeWrapper(viewInflateItemView$default.getContext(), R.style.z4))) != null) {
            textView.setTextColor(numLIZJ.intValue());
        }
        this.LLILLJJLI = N5(R.id.l23, viewInflateItemView$default);
        this.LLILLL = N5(R.id.l3q, viewInflateItemView$default);
        this.LLILZ = N5(R.id.l49, viewInflateItemView$default);
        this.LLIZ = (C1390410mHn) viewInflateItemView$default.findViewById(R.id.nnp);
        this.LLIZLLLIL = viewInflateItemView$default.findViewById(R.id.l53);
        if (this.LLJI && !LiveAISummaryBoardSetting.INSTANCE.previewKeepOldStyle() && viewInflateItemView$default.findViewById(R.id.l53) != null && (iLJIIZILJ = C497740JfY.LJIIZILJ() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28))) > 0) {
            int iMin = Math.min((int) (iLJIIZILJ / 2.5f), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL))));
            C1812550xGf c1812550xGf = this.LLILLJJLI;
            View view3 = null;
            if (c1812550xGf != null) {
                view = c1812550xGf.LIZ;
            } else {
                view = null;
            }
            R5(iMin, view);
            C1812550xGf c1812550xGf2 = this.LLILLL;
            if (c1812550xGf2 != null) {
                view2 = c1812550xGf2.LIZ;
            }
            R5(iMin, view2);
            C1812550xGf c1812550xGf3 = this.LLILZ;
            if (c1812550xGf3 != null) {
                view3 = c1812550xGf3.LIZ;
            }
            int iR5 = R5(iMin, view3);
            View viewFindViewById = viewInflateItemView$default.findViewById(R.id.eux);
            if (viewFindViewById != null && (layoutParams = viewFindViewById.getLayoutParams()) != null) {
                layoutParams.height = iR5;
            }
        }
        View viewFindViewById2 = viewInflateItemView$default.findViewById(R.id.hor);
        this.LLILZIL = viewFindViewById2;
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0xGi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    AiSummarySmallImageStylePanelView aiSummarySmallImageStylePanelView = this.LL;
                    C1812570xGh c1812570xGh = aiSummarySmallImageStylePanelView.LLILZLL;
                    if (c1812570xGh != null) {
                        aiSummarySmallImageStylePanelView.LL.vQ2(new C1812510xGb(c1812570xGh));
                    }
                }
            }, viewFindViewById2);
        }
        return viewInflateItemView$default;
    }

    public final C1812550xGf N5(int i, View view) {
        TuxIconView tuxIconView;
        C197039127h c197039127h;
        View viewFindViewById = view.findViewById(i);
        C19R6 c19r6 = (C19R6) viewFindViewById.findViewById(R.id.rp3);
        C19R6 c19r62 = (C19R6) viewFindViewById.findViewById(R.id.rqg);
        C0GZW c0gzw = (C0GZW) viewFindViewById.findViewById(R.id.u1f);
        RichTextPreviewView richTextPreviewView = (RichTextPreviewView) viewFindViewById.findViewById(R.id.rsd);
        if (this.LLJI) {
            tuxIconView = (TuxIconView) viewFindViewById.findViewById(R.id.ojy);
            c197039127h = (C197039127h) viewFindViewById.findViewById(R.id.use_button);
            if (C497700JfU.LIZ.LIZ() != EnumC768840UDy.PREVIEW) {
                C500260Jjc.LJIILIIL(tuxIconView);
            } else {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                c419910GdJ.LIZ = R.raw.icon_pen;
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(viewFindViewById.getContext());
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.exp);
                c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)));
                LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(viewFindViewById.getContext()));
                if (tuxIconView != null) {
                    tuxIconView.setImageDrawable(layerDrawableLJIILIIL);
                }
            }
            if (c197039127h != null) {
                c197039127h.LJJJJL(new C038Q());
            }
        } else {
            tuxIconView = null;
            c197039127h = null;
        }
        return new C1812550xGf(viewFindViewById, c19r6, c19r62, c0gzw, richTextPreviewView, tuxIconView, c197039127h);
    }

    public final void P5(C1812550xGf c1812550xGf, int i) {
        C1812850xH9 c1812850xH9;
        if (c1812550xGf == null || (c1812850xH9 = c1812550xGf.LJII) == null) {
            return;
        }
        this.LL.vQ2(new C1812240xGA(new C1812750xGz(c1812850xH9, "show", "", "design_2", "small", i)));
    }

    public final int R5(int i, View view) {
        if (view == null || i <= 0) {
            return 0;
        }
        int i2 = (int) ((i * 220.0f) / 154.0f);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && (layoutParams.width != i || layoutParams.height != i2)) {
            layoutParams.width = i;
            layoutParams.height = i2;
            C786410Ut5.W5(view, layoutParams);
        }
        return i2;
    }

    public final void L5(C1812550xGf c1812550xGf, C1812850xH9 c1812850xH9, int i) {
        if (c1812550xGf != null) {
            c1812550xGf.LIZ(LifecycleOwnerKt.getLifecycleScope(this), this.LL, c1812850xH9, false, i, false);
        }
    }
}
