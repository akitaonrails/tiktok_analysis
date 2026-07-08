package com.ss.android.ugc.aweme.tako.multiconversation;

import X.C03IT;
import X.C0DSB;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1863370yad;
import X.C2211631BhB;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426770GoN;
import X.C427690Gpr;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import X.ViewOnLongClickListenerC20306714cz;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS609S0100000_30;
import wh6.AbS515S0200000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoSubConversationItemAssem extends ReusedUISlotAssem<TakoSubConversationItemAssem> implements InterfaceC712990Rxx<C1863370yad> {
    public C1863370yad LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public TuxTextView LLJLIL;
    public SmartImageView LLJLILLLLZIIL;
    public TuxIconView LLJLL;
    public C426770GoN LLJLLIL;
    public View LLJLLL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fnl;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.we3);
        this.LLJLLL = view.findViewById(R.id.we5);
        this.LLJLILLLLZIIL = (SmartImageView) view.findViewById(R.id.we4);
        this.LLJLL = (TuxIconView) view.findViewById(R.id.we1);
        this.LLJLLIL = (C426770GoN) view.findViewById(R.id.we2);
        this.LLJL = view;
        C427690Gpr.LJ(view, C418440Gaw.LIZIZ(12));
        View view2 = this.LLJL;
        if (view2 != null) {
            C786410Ut5.I7(new AbS515S0200000_30(this, view, 0), view2);
        }
        View view3 = this.LLJL;
        if (view3 != null) {
            view3.setOnLongClickListener(new ViewOnLongClickListenerC20306714cz(this, view, 0));
        }
        View view4 = this.LLJL;
        if (view4 != null) {
            C2211631BhB.LJ(view4, new AwS609S0100000_30(this, 108));
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1863370yad c1863370yad) {
        C426770GoN c426770GoN;
        TuxIconView tuxIconView;
        C1863370yad c1863370yad2 = c1863370yad;
        this.LLJJLIIIJLLLLLLLZ = c1863370yad2;
        View view = this.LLJL;
        if (view != null) {
            if (c1863370yad2.LLILZ) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.oo);
                view.setBackground(c384050F3z.LIZ(view.getContext()));
            } else {
                view.setBackground(null);
            }
        }
        TuxTextView tuxTextView = this.LLJLIL;
        if (tuxTextView != null) {
            String string = c1863370yad2.LL.conversationTitle;
            if (string == null || string.length() == 0) {
                string = tuxTextView.getContext().getString(2131822475);
            }
            tuxTextView.setText(string);
        }
        SmartImageView smartImageView = this.LLJLILLLLZIIL;
        if (smartImageView != null) {
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(2));
            c384050F3z2.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
            c384050F3z2.LJFF = Integer.valueOf(R.attr.a03);
            smartImageView.setBackground(c384050F3z2.LIZ(smartImageView.getContext()));
            if (c1863370yad2.LL.unreadCount > 0) {
                C426770GoN c426770GoN2 = this.LLJLLIL;
                if (c426770GoN2 != null) {
                    C0DSB.LIZJ(c426770GoN2);
                }
                TuxIconView tuxIconView2 = this.LLJLL;
                if (tuxIconView2 != null) {
                    C0DSB.LIZIZ(tuxIconView2);
                }
                C0DSB.LIZIZ(smartImageView);
            } else {
                C426770GoN c426770GoN3 = this.LLJLLIL;
                if (c426770GoN3 != null) {
                    C0DSB.LIZIZ(c426770GoN3);
                }
                BaseVideo baseVideo = c1863370yad2.LL.relatedVideo;
                if (baseVideo != null) {
                    C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(baseVideo.urlList));
                    c1331670kl3LJIIJ.LJJ(smartImageView);
                    c1331670kl3LJIIJ.LJIIJJI();
                    TuxIconView tuxIconView3 = this.LLJLL;
                    if (tuxIconView3 != null) {
                        C0DSB.LIZJ(tuxIconView3);
                    }
                    C0DSB.LIZJ(smartImageView);
                } else {
                    TuxIconView tuxIconView4 = this.LLJLL;
                    if (tuxIconView4 != null) {
                        C0DSB.LIZIZ(tuxIconView4);
                    }
                    C0DSB.LIZIZ(smartImageView);
                }
            }
        }
        SmartImageView smartImageView2 = this.LLJLILLLLZIIL;
        if (smartImageView2 != null && smartImageView2.getVisibility() == 8 && (c426770GoN = this.LLJLLIL) != null && c426770GoN.getVisibility() == 8 && (tuxIconView = this.LLJLL) != null && tuxIconView.getVisibility() == 8) {
            View view2 = this.LLJLLL;
            if (view2 != null) {
                C0DSB.LIZIZ(view2);
                return;
            }
            return;
        }
        View view3 = this.LLJLLL;
        if (view3 == null) {
            return;
        }
        C0DSB.LIZJ(view3);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1863370yad c1863370yad) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1863370yad c1863370yad) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
