package com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders;

import X.C01GW;
import X.C054G;
import X.C0C64;
import X.C0M0P;
import X.C0M1K;
import X.C0M31;
import X.C123100dR;
import X.C1697580uHE;
import X.C341550DaD;
import X.C452501pT;
import X.C561130Lzb;
import X.C562150M2z;
import X.C786410Ut5;
import X.InterfaceC497601wk;
import X.InterfaceC562000M2k;
import Y.ARunnableS108S0100000_8;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS31S2200000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public class DraftBoxNormalItemViewHolder extends DraftItemBaseBgViewHolder {
    public final View LLJJ;
    public final C561130Lzb LLJJI;
    public final InterfaceC497601wk LLJJIII;
    public final InterfaceC562000M2k LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;

    @Override // com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder
    public final void onViewDetachedFromWindow() {
    }

    public final View f6() {
        return (View) this.LLJJJJ.getValue();
    }

    public final View h6() {
        return (View) this.LLJL.getValue();
    }

    public final TuxIconView i6() {
        return (TuxIconView) this.LLJLIL.getValue();
    }

    public final TuxTextView q6() {
        return (TuxTextView) this.LLJLILLLLZIIL.getValue();
    }

    public ViewGroup r6() {
        return (ViewGroup) this.LLJJIJIIJIL.getValue();
    }

    public final TuxTextView u6() {
        return (TuxTextView) this.LLJJJ.getValue();
    }

    public final TuxIconView v6() {
        return (TuxIconView) this.LLJJIJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder
    public Integer S5() {
        if (C0M1K.LIZ()) {
            return Integer.valueOf(DraftItemBaseBgViewHolder.W5() ? R.layout.cvm : R.layout.cvl);
        }
        return Integer.valueOf(R.layout.cvn);
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder
    public C561130Lzb R5() {
        return this.LLJJI;
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder
    public InterfaceC562000M2k T5() {
        return this.LLJJIJI;
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder
    public InterfaceC497601wk U5() {
        return this.LLJJIII;
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder
    public View getItemView() {
        return this.LLJJ;
    }

    public final void d6(C0M0P c0m0p) {
        if (c0m0p.LJII.length() > 0) {
            ((TuxIconView) this.LLJJJJJIL.getValue()).setIconRes(R.raw.icon_music_note_s_alt);
            ((TextView) this.LLJJJJLIIL.getValue()).setText(c0m0p.LJII);
            C786410Ut5.LJLLLLLL(0, f6());
            C0M31.LIZ(f6(), new AwS409S0200000_8(this, c0m0p, 104));
            return;
        }
        C786410Ut5.LJLLLLLL(8, f6());
    }

    public final boolean e6(C0M0P c0m0p) {
        Object tag;
        boolean zBooleanValue;
        Typeface typefaceLIZIZ;
        View viewH6 = h6();
        Boolean bool = null;
        if (viewH6 != null) {
            tag = viewH6.getTag(R.id.g57);
        } else {
            tag = null;
        }
        if (tag instanceof Boolean) {
            bool = (Boolean) tag;
        }
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (!zBooleanValue && !c0m0p.LJJI) {
            if (c0m0p.LJJIFFI) {
                C786410Ut5.LLLLLLZZ(v6(), 8);
                View view = (View) this.LLJJJIL.getValue();
                if (view != null) {
                    C786410Ut5.LJLLLLLL(0, view);
                    C341550DaD.LIZ(view);
                    TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.g58);
                    if (tuxTextView != null && (typefaceLIZIZ = C1697580uHE.LIZIZ(0.0f, OppoPermissionPopupMaskDelayExp.DEFAULT, 10.0f, 1.0f, null, 0.0f, 0, null, 241)) != null) {
                        tuxTextView.setTypeface(typefaceLIZIZ);
                        tuxTextView.setTextSize(10.0f);
                    }
                }
                return true;
            }
            View view2 = (View) this.LLJJJIL.getValue();
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
            Integer num = c0m0p.LJIJ;
            if (num == null) {
                return false;
            }
            if (num.intValue() == 0) {
                C786410Ut5.LLLLLLZZ(v6(), 8);
            } else {
                v6().setIconRes(num.intValue());
                C786410Ut5.LLLLLLZZ(v6(), 0);
                if (DraftItemBaseBgViewHolder.W5()) {
                    HandlerHook.viewPost(r6(), new ARunnableS108S0100000_8(this, 104));
                    return true;
                }
            }
            return true;
        }
        View view3 = (View) this.LLJJJIL.getValue();
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(8, view3);
        }
        return false;
    }

    public void w6(C0M0P c0m0p) {
        if (this.LLJILLL == 0) {
            u6().setText(c0m0p.LJIIIIZZ);
        } else {
            u6().setText(C562150M2z.LIZ(c0m0p.LJI));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x008c, code lost:
    
        if (r7 != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a7  */
    @Override // com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X5(X.C0M0P r11, int r12) {
        /*
            r10 = this;
            r4 = r10
            boolean r0 = r4.LLJILJIL
            r1 = 0
            r3 = 8
            r5 = r11
            if (r0 == 0) goto L4d
            android.view.View r0 = r4.h6()
            if (r0 == 0) goto L12
            X.C786410Ut5.LJLLLLLL(r3, r0)
        L12:
            android.view.ViewGroup r0 = r4.r6()
            X.C786410Ut5.LJLZ(r3, r0)
            android.view.View r0 = r4.f6()
            X.C786410Ut5.LJLLLLLL(r3, r0)
            X.01GW r0 = r4.LLJJJIL
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L2d
            X.C786410Ut5.LJLLLLLL(r3, r0)
        L2d:
            X.01GW r0 = r4.LLJJL
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            X.C786410Ut5.LJLLLLLL(r1, r0)
            X.01GW r0 = r4.LLJJLIIIJLLLLLLLZ
            java.lang.Object r2 = r0.getValue()
            android.widget.TextView r2 = (android.widget.TextView) r2
            long r0 = r5.LJI
            java.lang.String r0 = X.C562150M2z.LIZ(r0)
            r2.setText(r0)
        L49:
            com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder.b6(r5)
            return
        L4d:
            android.view.ViewGroup r0 = r4.r6()
            X.C786410Ut5.LJLZ(r1, r0)
            X.01GW r0 = r4.LLJJL
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            X.C786410Ut5.LJLLLLLL(r3, r0)
            r4.w6(r5)
            android.view.View r2 = r4.getItemView()
            kotlin.jvm.internal.AwS134S0201000_8 r1 = new kotlin.jvm.internal.AwS134S0201000_8
            r0 = 9
            r8 = r12
            r1.<init>(r4, r8, r5, r0)
            X.C0M31.LIZ(r2, r1)
            android.view.View r2 = r4.getItemView()
            X.0MqM r1 = new X.0MqM
            r0 = 1
            r1.<init>(r4, r5, r0)
            r2.setOnLongClickListener(r1)
            boolean r0 = r4.e6(r5)
            r6 = r0 ^ 1
            boolean r0 = r4.c6(r8, r5)
            r7 = r0 ^ 1
            if (r6 != 0) goto Lb2
            if (r7 == 0) goto L49
        L8e:
            android.view.View r0 = r4.f6()
            X.C786410Ut5.LJLLLLLL(r3, r0)
        L95:
            android.view.View r2 = r4.f6()
            java.lang.String r1 = r5.LJ
            r0 = 2131370358(0x7f0a2176, float:1.836072E38)
            r2.setTag(r0, r1)
            X.01wk r1 = r4.U5()
            if (r1 == 0) goto L49
            X.0Lng r3 = new X.0Lng
            r9 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0 = 3
            X.C23250099c.LIZLLL(r1, r9, r9, r3, r0)
            goto L49
        Lb2:
            if (r7 == 0) goto L95
            goto L8e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxNormalItemViewHolder.X5(X.0M0P, int):void");
    }

    public final boolean c6(int i, C0M0P c0m0p) {
        Object tag;
        View viewH6 = h6();
        Boolean bool = null;
        if (viewH6 != null) {
            tag = viewH6.getTag(R.id.g57);
        } else {
            tag = null;
        }
        if (tag instanceof Boolean) {
            bool = (Boolean) tag;
        }
        if (bool != null && bool.booleanValue()) {
            return false;
        }
        if (!C0M1K.LIZ() && c0m0p.LJJ) {
            d6(c0m0p);
            return true;
        }
        if (!c0m0p.LJJ && c0m0p.LJII.length() > 0) {
            return false;
        }
        String str = c0m0p.LJIJJLI;
        String str2 = c0m0p.LJIJI;
        String str3 = c0m0p.LJIJJ;
        if (str == null || str2 == null) {
            return false;
        }
        if (C123100dR.LIZ(str) && C123100dR.LIZ(str2) && C0C64.LJIILLIIL().LJIJ(31744, 0, "draft_box_remove_effect_follow", true) != 1) {
            ((TuxIconView) this.LLJJJJJIL.getValue()).setIconRes(R.raw.icon_ai_stars);
            ((TextView) this.LLJJJJLIIL.getValue()).setText(str);
            C786410Ut5.LJLLLLLL(0, f6());
            C0M31.LIZ(f6(), new AwS31S2200000_8(this, c0m0p, str2, str3, 0));
            return true;
        }
        d6(c0m0p);
        return true;
    }

    public DraftBoxNormalItemViewHolder(View view, C561130Lzb c561130Lzb, C054G c054g, DraftBoxFragment draftBoxFragment) {
        super(view, c561130Lzb, c054g, draftBoxFragment);
        this.LLJJ = view;
        this.LLJJI = c561130Lzb;
        this.LLJJIII = c054g;
        this.LLJJIJI = draftBoxFragment;
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 868));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 873));
        this.LLJJJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 871));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 842));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 835));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 837));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 839));
        this.LLJJL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 845));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 847));
        this.LLJL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 855));
        this.LLJLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 858));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 863));
        this.LLJLL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(362));
        this.LLJLLIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(360));
        this.LLJLLL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(355));
        this.LLJZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(357));
        this.LLJZIJLIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(356));
    }
}
