package com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core;

import X.AbstractViewOnTouchListenerC446430Hez;
import X.C01GW;
import X.C0BRL;
import X.C13LE;
import X.C1913107eT;
import X.C1913207eU;
import X.C21565319aV;
import X.C418440Gaw;
import X.C427870Gq9;
import X.C659750PuH;
import X.C737910Sx3;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import Y.ATListenerS338S0200000_10;
import Y.ATListenerS444S0100000_10;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS241S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchVisualPhotoFeedbackAssem extends ReusedUIContentAssem<SearchPhotoFeedbackAssem> implements InterfaceC712990Rxx<C659750PuH> {
    public final C01GW LLJJJJ = C737910Sx3.LIZJ(this, C13LE.LIZ(SearchPhotoViewModel.class), AFwS241S0000000_10.get$arr$(231));
    public Aweme LLJJJJJIL;
    public FrameLayout LLJJJJLIIL;
    public TextView LLJJL;
    public C427870Gq9 LLJJLIIIJLLLLLLLZ;
    public TextView LLJL;
    public TextView LLJLIL;

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final void cp(View view) {
        if (view != null) {
            final Context context = view.getContext();
            AbstractViewOnTouchListenerC446430Hez abstractViewOnTouchListenerC446430Hez = new AbstractViewOnTouchListenerC446430Hez(context) { // from class: X.0Pud
                @Override // X.AbstractViewOnTouchListenerC446430Hez
                public final void LIZ(boolean z) {
                    int iIntValue;
                    FrameLayout frameLayout = this.LLJIJIL.LLJJJJLIIL;
                    if (frameLayout != null) {
                        if (z) {
                            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, frameLayout.getContext());
                            if (numLIZJ != null) {
                                iIntValue = numLIZJ.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            frameLayout.setForeground(new ColorDrawable(iIntValue));
                            return;
                        }
                        frameLayout.setForeground(null);
                    }
                }
            };
            abstractViewOnTouchListenerC446430Hez.LLIZLLLIL = new ATListenerS338S0200000_10(view, this, 1);
            view.setOnTouchListener(abstractViewOnTouchListenerC446430Hez);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        float fLIZIZ;
        int iIntValue;
        FrameLayout frameLayout;
        this.LLJJJJLIIL = (FrameLayout) view.findViewById(R.id.udc);
        this.LLJJL = (TextView) view.findViewById(R.id.desc);
        this.LLJLIL = (TextView) view.findViewById(R.id.mn1);
        this.LLJL = (TextView) view.findViewById(R.id.bc6);
        this.LLJJLIIIJLLLLLLLZ = (C427870Gq9) view.findViewById(R.id.bbz);
        if (C0BRL.LIZ() && (frameLayout = this.LLJJJJLIIL) != null) {
            frameLayout.setOnTouchListener(new ATListenerS444S0100000_10(this, 28));
        }
        FrameLayout frameLayout2 = this.LLJJJJLIIL;
        if (frameLayout2 != null) {
            if (C1913207eU.LIZLLL()) {
                Integer numValueOf = Integer.valueOf(C1913107eT.LIZLLL());
                if (numValueOf.intValue() > 0) {
                    iIntValue = numValueOf.intValue();
                } else {
                    iIntValue = 4;
                }
                fLIZIZ = C418440Gaw.LIZIZ(Integer.valueOf(iIntValue));
            } else {
                fLIZIZ = C1913207eU.LIZIZ();
            }
            C21565319aV.LIZIZ(frameLayout2, Float.valueOf(fLIZIZ), null, null, null, null, 30);
        }
        cp(this.LLJJJJLIIL);
        cp(this.LLJJL);
        cp(this.LLJJLIIIJLLLLLLLZ);
        cp(this.LLJL);
        cp(this.LLJLIL);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C659750PuH c659750PuH) {
        C659750PuH c659750PuH2 = c659750PuH;
        this.LLJJJJJIL = c659750PuH2.LL;
        ((SearchPhotoViewModel) this.LLJJJJ.getValue()).LL = c659750PuH2.LLILLJJLI;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C659750PuH c659750PuH) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C659750PuH c659750PuH) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
