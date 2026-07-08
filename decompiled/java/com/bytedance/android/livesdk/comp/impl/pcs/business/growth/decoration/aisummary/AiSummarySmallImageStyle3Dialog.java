package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.aisummary;

import X.AbstractC1812500xGa;
import X.AbstractC1812590xGj;
import X.AbstractC1812820xH6;
import X.C0GZW;
import X.C0HTI;
import X.C1161920gLG;
import X.C1390410mHn;
import X.C13LP;
import X.C16F5;
import X.C1812520xGc;
import X.C1812550xGf;
import X.C1812570xGh;
import X.C1812640xGo;
import X.C1812670xGr;
import X.C1812850xH9;
import X.C1812880xHC;
import X.C1813080xHW;
import X.C1813280xHq;
import X.C1834150xpV;
import X.C1954807lC;
import X.C197039127h;
import X.C19R6;
import X.C20736316Cj;
import X.C344180DeS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C475510Ikn;
import X.C497700JfU;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1180504jb;
import X.InterfaceC1813000xHO;
import X.InterfaceC1813270xHp;
import X.InterfaceC775640Ubi;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent.RichTextPreviewView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class AiSummarySmallImageStyle3Dialog extends LiveSheetFragment implements InterfaceC1813270xHp<C1812670xGr, AbstractC1812500xGa, AbstractC1812820xH6, AiSummaryViewModel>, InterfaceC1813000xHO {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDw6JiA/OmE0Oio7HELIOSPSd9LCAvJj0yPCwjJ2EyITY5JCIyOjxiCCYAPSghKD0qGygtJSMaJSQrLBwnMSkpegs6KSkjLg==";
    public int LLJLLL;
    public View LLJZ;
    public ViewGroup LLJZIJLIL;
    public C1390410mHn LLL;
    public LiveIconView LLLF;
    public C16F5 LLLFF;
    public HorizontalScrollView LLLFFI;
    public FrameLayout LLLFZ;
    public C1812550xGf LLLI;
    public C1812550xGf LLLII;
    public C1812550xGf LLLIIII;

    @Override // X.InterfaceC1813000xHO
    public final String getEntrance() {
        return null;
    }

    public final AiSummaryViewModel wS() {
        return (AiSummaryViewModel) ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).createViewModel(AiSummaryViewModel.class);
    }

    public final void zS() {
        HorizontalScrollView horizontalScrollView = this.LLLFFI;
        if (horizontalScrollView != null) {
            C500260Jjc.LJIILIIL(horizontalScrollView);
        }
        ViewGroup viewGroup = this.LLJZIJLIL;
        if (viewGroup != null) {
            C500260Jjc.LLFFF(viewGroup);
        }
        C1390410mHn c1390410mHn = this.LLL;
        if (c1390410mHn != null) {
            C500260Jjc.LJIILIIL(c1390410mHn);
        }
        C1390410mHn c1390410mHn2 = this.LLL;
        if (c1390410mHn2 != null) {
            c1390410mHn2.LIZLLL();
        }
        LiveIconView liveIconView = this.LLLF;
        if (liveIconView != null) {
            C500260Jjc.LLFFF(liveIconView);
        }
        C16F5 c16f5 = this.LLLFF;
        if (c16f5 != null) {
            C500260Jjc.LLFFF(c16f5);
        }
    }

    public AiSummarySmallImageStyle3Dialog() {
        C1813080xHW.LIZ = "design_3";
    }

    @Override // X.InterfaceC1813270xHp
    public final void Xh(InterfaceC775640Ubi interfaceC775640Ubi) {
        C1812670xGr c1812670xGr = (C1812670xGr) interfaceC775640Ubi;
        int i = C1812640xGo.LIZ[c1812670xGr.LIZIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        zS();
                        return;
                    }
                    throw new C1954807lC();
                }
                HorizontalScrollView horizontalScrollView = this.LLLFFI;
                if (horizontalScrollView != null) {
                    C500260Jjc.LJIILIIL(horizontalScrollView);
                }
                ViewGroup viewGroup = this.LLJZIJLIL;
                if (viewGroup != null) {
                    C500260Jjc.LLFFF(viewGroup);
                }
                C1390410mHn c1390410mHn = this.LLL;
                if (c1390410mHn != null) {
                    C500260Jjc.LLFFF(c1390410mHn);
                }
                C1390410mHn c1390410mHn2 = this.LLL;
                if (c1390410mHn2 != null) {
                    c1390410mHn2.LIZJ();
                }
                LiveIconView liveIconView = this.LLLF;
                if (liveIconView != null) {
                    C500260Jjc.LJIILIIL(liveIconView);
                }
                C16F5 c16f5 = this.LLLFF;
                if (c16f5 == null) {
                    return;
                }
                C500260Jjc.LJIILIIL(c16f5);
                return;
            }
            zS();
            return;
        }
        ViewGroup viewGroup2 = this.LLJZIJLIL;
        if (viewGroup2 != null) {
            C500260Jjc.LJIILIIL(viewGroup2);
        }
        C1390410mHn c1390410mHn3 = this.LLL;
        if (c1390410mHn3 != null) {
            C500260Jjc.LJIILIIL(c1390410mHn3);
        }
        C1390410mHn c1390410mHn4 = this.LLL;
        if (c1390410mHn4 != null) {
            c1390410mHn4.LIZLLL();
        }
        LiveIconView liveIconView2 = this.LLLF;
        if (liveIconView2 != null) {
            C500260Jjc.LJIILIIL(liveIconView2);
        }
        C16F5 c16f52 = this.LLLFF;
        if (c16f52 != null) {
            C500260Jjc.LJIILIIL(c16f52);
        }
        HorizontalScrollView horizontalScrollView2 = this.LLLFFI;
        if (horizontalScrollView2 != null) {
            C500260Jjc.LLFFF(horizontalScrollView2);
        }
        AbstractC1812590xGj abstractC1812590xGj = c1812670xGr.LIZ;
        if (!(abstractC1812590xGj instanceof C1812570xGh)) {
            return;
        }
        List<C1812850xH9> list = abstractC1812590xGj.LL;
        C1812550xGf c1812550xGf = this.LLLI;
        if (c1812550xGf != null) {
            c1812550xGf.LIZIZ();
        }
        C1812550xGf c1812550xGf2 = this.LLLII;
        if (c1812550xGf2 != null) {
            c1812550xGf2.LIZIZ();
        }
        C1812550xGf c1812550xGf3 = this.LLLIIII;
        if (c1812550xGf3 != null) {
            c1812550xGf3.LIZIZ();
        }
        C1812850xH9 c1812850xH9 = (C1812850xH9) C13LP.LJJJLZIJ(0, list);
        if (c1812850xH9 != null) {
            uS(this.LLLI, c1812850xH9, 0);
        }
        C1812850xH9 c1812850xH92 = (C1812850xH9) C13LP.LJJJLZIJ(1, list);
        if (c1812850xH92 != null) {
            uS(this.LLLII, c1812850xH92, 1);
        }
        C1812850xH9 c1812850xH93 = (C1812850xH9) C13LP.LJJJLZIJ(2, list);
        if (c1812850xH93 == null) {
            return;
        }
        uS(this.LLLIIII, c1812850xH93, 2);
    }

    @Override // X.InterfaceC1813270xHp
    public final void gn(InterfaceC1180504jb interfaceC1180504jb) {
        DataChannel dataChannelLJ;
        Context context;
        AbstractC1812820xH6 abstractC1812820xH6 = (AbstractC1812820xH6) interfaceC1180504jb;
        if (abstractC1812820xH6.LIZ() && (dataChannelLJ = C475510Ikn.LJ(this)) != null && (context = getContext()) != null) {
            C1812880xHC.LIZJ(abstractC1812820xH6, this, context, dataChannelLJ);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(0, null);
        sheetOptions.draggable = false;
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(16.0f);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        C1813080xHW.LJ(null);
    }

    public final int BS(int i, View view) {
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

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int iLJIIZILJ;
        View view2;
        View view3;
        ViewGroup.LayoutParams layoutParams;
        super.onViewCreated(view, bundle);
        String strValueOf = String.valueOf(C500260Jjc.LJJLIIIJ(C475510Ikn.LJ(this)));
        View view4 = this.LLJZ;
        if (view4 != null) {
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0xHJ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                    this.LL.close(1);
                }
            }, view4);
        }
        if (view.findViewById(R.id.l53) != null && (iLJIIZILJ = C497740JfY.LJIIZILJ() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28))) > 0) {
            int iMin = Math.min((int) (iLJIIZILJ / 2.5f), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL))));
            C1812550xGf c1812550xGf = this.LLLI;
            View view5 = null;
            if (c1812550xGf != null) {
                view2 = c1812550xGf.LIZ;
            } else {
                view2 = null;
            }
            BS(iMin, view2);
            C1812550xGf c1812550xGf2 = this.LLLII;
            if (c1812550xGf2 != null) {
                view3 = c1812550xGf2.LIZ;
            } else {
                view3 = null;
            }
            BS(iMin, view3);
            C1812550xGf c1812550xGf3 = this.LLLIIII;
            if (c1812550xGf3 != null) {
                view5 = c1812550xGf3.LIZ;
            }
            int iBS = BS(iMin, view5);
            FrameLayout frameLayout = this.LLLFZ;
            if (frameLayout != null && (layoutParams = frameLayout.getLayoutParams()) != null) {
                layoutParams.height = iBS;
            }
        }
        C1813280xHq.LIZ(this, wS(), this);
        wS().vQ2(new C1812520xGc(C497700JfU.LIZ.LIZ(), this.LLJLLL, strValueOf, "live_capsule", 3));
    }

    public final C1812550xGf yS(int i, View view) {
        View viewFindViewById = view.findViewById(i);
        C19R6 c19r6 = (C19R6) viewFindViewById.findViewById(R.id.rp3);
        C19R6 c19r62 = (C19R6) viewFindViewById.findViewById(R.id.rqg);
        C0GZW c0gzw = (C0GZW) viewFindViewById.findViewById(R.id.u1f);
        RichTextPreviewView richTextPreviewView = (RichTextPreviewView) viewFindViewById.findViewById(R.id.rsd);
        C197039127h c197039127h = (C197039127h) viewFindViewById.findViewById(R.id.use_button);
        if (c197039127h != null) {
            c197039127h.LJJJJL(new C344180DeS());
        }
        return new C1812550xGf(viewFindViewById, c19r6, c19r62, c0gzw, richTextPreviewView, null, c197039127h);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fy5, viewGroup, false);
        this.LLJZ = viewTd.findViewById(R.id.e1y);
        this.LLJZIJLIL = (ViewGroup) viewTd.findViewById(R.id.w28);
        this.LLL = (C1390410mHn) viewTd.findViewById(R.id.nnp);
        C1834150xpV.LJII(viewTd.getContext());
        LiveIconView liveIconView = (LiveIconView) viewTd.findViewById(R.id.h2p);
        C16F5 c16f5 = null;
        if (liveIconView != null) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.n4;
            liveIconView.setIcon(c0hti.LIZ(liveIconView.getContext()));
            liveIconView.setIconTint(C20736316Cj.LIZIZ(R.attr.eok, liveIconView.getContext()));
        } else {
            liveIconView = null;
        }
        this.LLLF = liveIconView;
        C16F5 c16f52 = (C16F5) viewTd.findViewById(R.id.h3c);
        if (c16f52 != null) {
            c16f5 = c16f52;
        }
        this.LLLFF = c16f5;
        this.LLLFFI = (HorizontalScrollView) viewTd.findViewById(R.id.l53);
        this.LLLFZ = (FrameLayout) viewTd.findViewById(R.id.eux);
        this.LLLI = yS(R.id.l23, viewTd);
        this.LLLII = yS(R.id.l3q, viewTd);
        this.LLLIIII = yS(R.id.l49, viewTd);
        View view = this.LLJZ;
        if (view != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.ey_);
            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30)));
            view.setBackground(c384050F3z.LIZ(viewTd.getContext()));
        }
        return viewTd;
    }

    public final void uS(C1812550xGf c1812550xGf, C1812850xH9 c1812850xH9, int i) {
        if (c1812550xGf != null) {
            c1812550xGf.LIZ(LifecycleOwnerKt.getLifecycleScope(this), wS(), c1812850xH9, false, i, true);
        }
    }
}
