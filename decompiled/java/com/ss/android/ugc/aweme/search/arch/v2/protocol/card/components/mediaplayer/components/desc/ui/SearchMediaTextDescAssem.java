package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.desc.ui;

import X.C01GW;
import X.C1308910kAL;
import X.C1356610lPH;
import X.C1361400lX0;
import X.C21565319aV;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426490Gnv;
import X.C426750GoL;
import X.C452501pT;
import X.C475630Ikz;
import X.C650300Pf2;
import X.C657250PqF;
import X.C666750QDh;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C820940WIi;
import X.EnumC657270PqH;
import X.InterfaceC435460H5s;
import X.InterfaceC650320Pf4;
import X.InterfaceC657240PqE;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMediaTextDescAssem extends BaseSearchMediaOptionalAssem {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(147));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 246));
    public TuxTextView LLJLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eu8;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C650300Pf2.LIZLLL.LJFF((InterfaceC650320Pf4) this.LLJL.getValue());
    }

    public final void yp() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (C666750QDh.LIZ()) {
            TuxTextView tuxTextView = this.LLJLIL;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
                return;
            }
            return;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        boolean z = ((InterfaceC657240PqE) (c724270Sb3 != null ? c724270Sb3.LL : null)).LJJIIZI().getItemVisibility().LIZ;
        C724270Sb3 c724270Sb32 = this.LLJI;
        boolean z2 = ((InterfaceC435460H5s) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme().getUserDigg() == 1;
        TuxTextView tuxTextView2 = this.LLJLIL;
        if (tuxTextView2 != null) {
            C724270Sb3 c724270Sb33 = this.LLJI;
            AwemeStatistics statistics = ((InterfaceC435460H5s) (c724270Sb33 != null ? c724270Sb33.LL : null)).getAweme().getStatistics();
            CharSequence charSequenceLIZ = C820940WIi.LIZ(statistics != null ? statistics.getDiggCount() : 0L);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (z) {
                C426490Gnv.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), spannableStringBuilder);
                spannableStringBuilder.append((CharSequence) "·");
                C426490Gnv.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), spannableStringBuilder);
            }
            spannableStringBuilder.append((CharSequence) " ");
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = z2 ? R.raw.icon_heart_small_fill : R.raw.icon_heart_small;
            c419910GdJ.LJ = z2 ? Integer.valueOf(R.attr.a1r) : Integer.valueOf(R.attr.zi);
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            C786410Ut5.q2(spannableStringBuilder, c419910GdJ.LIZIZ(2, context), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            C426490Gnv.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), spannableStringBuilder);
            spannableStringBuilder.append(charSequenceLIZ);
            C426490Gnv.LIZ(1, spannableStringBuilder);
            tuxTextView2.setText(spannableStringBuilder);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        C650300Pf2.LIZLLL.LIZ((InterfaceC650320Pf4) this.LLJL.getValue());
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem
    public final void op(View view) {
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.u8t);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(InterfaceC657240PqE interfaceC657240PqE) {
        up(interfaceC657240PqE);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem
    public final boolean sp(List list) {
        if (!list.isEmpty() && !list.contains(EnumC657270PqH.DESC_STYLE) && !list.contains(EnumC657270PqH.DIGG_STATE) && !list.contains(EnumC657270PqH.TEXT_DESC_AREA)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem
    /* JADX INFO: renamed from: tp */
    public final void up(InterfaceC657240PqE interfaceC657240PqE) {
        int iIntValue;
        super.up(interfaceC657240PqE);
        Context context = getContext();
        if (context == null) {
            return;
        }
        C657250PqF itemVisibility = interfaceC657240PqE.LJJIIZI().getItemVisibility();
        boolean z = itemVisibility.LIZ;
        Integer numLJJII = interfaceC657240PqE.LJJII();
        if (numLJJII != null) {
            int iIntValue2 = numLJJII.intValue();
            TuxTextView tuxTextView = this.LLJLIL;
            if (tuxTextView != null) {
                tuxTextView.setTuxFont(iIntValue2);
            }
        }
        if (itemVisibility.LIZIZ) {
            yp();
            return;
        }
        if (itemVisibility.LIZJ) {
            TuxTextView tuxTextView2 = this.LLJLIL;
            if (tuxTextView2 == null) {
                return;
            }
            String strLJII = C1356610lPH.LJII(interfaceC657240PqE.getAweme().getCreateTime() * 1000, context);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (z) {
                C426490Gnv.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), spannableStringBuilder);
                spannableStringBuilder.append((CharSequence) "·");
                C426490Gnv.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), spannableStringBuilder);
            }
            spannableStringBuilder.append((CharSequence) strLJII);
            C426490Gnv.LIZ(1, spannableStringBuilder);
            tuxTextView2.setText(spannableStringBuilder);
            return;
        }
        if (!itemVisibility.LJ) {
            return;
        }
        C1361400lX0 c1361400lX0 = new C1361400lX0(context, R.style.y3);
        TuxTextView tuxTextView3 = this.LLJLIL;
        if (tuxTextView3 != null) {
            String strLLII = interfaceC657240PqE.LLII();
            if (strLLII == null) {
                strLLII = "";
            }
            tuxTextView3.setText(strLLII);
        }
        C21565319aV.LIZIZ(this.LLJLIL, Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, null, null, null, 30);
        TuxTextView tuxTextView4 = this.LLJLIL;
        if (tuxTextView4 != null) {
            C426750GoL.LJIIL(tuxTextView4, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), 16);
        }
        Integer numLJLILLLLZI = interfaceC657240PqE.LJLILLLLZI();
        if (numLJLILLLLZI != null) {
            int iIntValue3 = numLJLILLLLZI.intValue();
            TuxTextView tuxTextView5 = this.LLJLIL;
            if (tuxTextView5 != null) {
                Integer numLIZJ = C1308910kAL.LIZJ(iIntValue3, c1361400lX0);
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = -16777216;
                }
                tuxTextView5.setTextColor(iIntValue);
            }
        }
        Integer numLLJLL = interfaceC657240PqE.LLJLL();
        if (numLLJLL == null) {
            return;
        }
        int iIntValue4 = numLLJLL.intValue();
        TuxTextView tuxTextView6 = this.LLJLIL;
        if (tuxTextView6 == null) {
            return;
        }
        tuxTextView6.setBackgroundColor(C475630Ikz.LIZIZ(iIntValue4, context));
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem
    public final boolean up(InterfaceC657240PqE interfaceC657240PqE) {
        C657250PqF itemVisibility = interfaceC657240PqE.LJJIIZI().getItemVisibility();
        if (!itemVisibility.LIZIZ && !itemVisibility.LIZJ && !itemVisibility.LJ) {
            return false;
        }
        return true;
    }
}
