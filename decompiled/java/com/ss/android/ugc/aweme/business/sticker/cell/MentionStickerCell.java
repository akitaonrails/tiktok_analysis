package com.ss.android.ugc.aweme.business.sticker.cell;

import X.C01GW;
import X.C0I1R;
import X.C0S1B;
import X.C1308910kAL;
import X.C20611815l6;
import X.C20611915l7;
import X.C20750716Hx;
import X.C2095008Iq;
import X.C2211751BhN;
import X.C315740CZg;
import X.C316580Cb2;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.ui.cell.MentionBaseCell;
import com.zhiliaoapp.musically.R;
import irm.AkS33S0300000_31;
import java.util.Map;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class MentionStickerCell extends MentionBaseCell<C316580Cb2> {
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 319));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 318));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 320));

    @Override // com.ss.android.ugc.aweme.base.ui.cell.MentionBaseCell
    public final String I5() {
        return "sticker";
    }

    @Override // com.ss.android.ugc.aweme.base.ui.cell.MentionBaseCell
    public final int L5() {
        return R.layout.dlt;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        C2211751BhN.LIZ(this.itemView, new C20750716Hx(this, 3));
        AvatarComponentView avatarComponentView = (AvatarComponentView) this.LLILLL.getValue();
        new AwS610S0100000_31(this, 136).invoke(avatarComponentView.getConfig().LIZ);
        avatarComponentView.LJFF(avatarComponentView.getConfig());
    }

    @Override // com.ss.android.ugc.aweme.base.ui.cell.MentionBaseCell
    /* JADX INFO: renamed from: P5 */
    public final void onBindItemView(C316580Cb2 c316580Cb2) {
        Integer numLIZJ;
        Integer numLJIIJJI;
        Integer numLJIIJJI2;
        Integer numLJIIJJI3;
        Integer numLJIIJJI4;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        super.onBindItemView(c316580Cb2);
        Map<String, String> mapVQ2 = N5().vQ2();
        try {
            String str = mapVQ2.get("cell_width");
            Integer numLJIIJJI5 = null;
            if (str != null) {
                numLJIIJJI = C2095008Iq.LJIIJJI(str);
            } else {
                numLJIIJJI = null;
            }
            String str2 = mapVQ2.get("cell_height");
            if (str2 != null) {
                numLJIIJJI2 = C2095008Iq.LJIIJJI(str2);
            } else {
                numLJIIJJI2 = null;
            }
            String str3 = mapVQ2.get("avatar_size");
            if (str3 != null) {
                numLJIIJJI3 = C2095008Iq.LJIIJJI(str3);
            } else {
                numLJIIJJI3 = null;
            }
            String str4 = mapVQ2.get("name_size");
            if (str4 != null) {
                numLJIIJJI4 = C2095008Iq.LJIIJJI(str4);
            } else {
                numLJIIJJI4 = null;
            }
            String str5 = mapVQ2.get("margin_right");
            if (str5 != null) {
                numLJIIJJI5 = C2095008Iq.LJIIJJI(str5);
            }
            if (numLJIIJJI != null || numLJIIJJI2 != null) {
                ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.LayoutParams) && layoutParams != null) {
                    if (numLJIIJJI != null) {
                        layoutParams.width = (int) TypedValue.applyDimension(1, numLJIIJJI.intValue(), this.itemView.getResources().getDisplayMetrics());
                    }
                    if (numLJIIJJI2 != null) {
                        layoutParams.height = (int) TypedValue.applyDimension(1, numLJIIJJI2.intValue(), this.itemView.getResources().getDisplayMetrics());
                    }
                    C786410Ut5.W5(this.itemView, layoutParams);
                }
            }
            if (numLJIIJJI3 != null) {
                int iIntValue = numLJIIJJI3.intValue();
                ViewGroup.LayoutParams layoutParams2 = ((AvatarComponentView) this.LLILLL.getValue()).getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
                    layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
                    C786410Ut5.e7((AvatarComponentView) this.LLILLL.getValue(), layoutParams2);
                }
            }
            if (numLJIIJJI4 != null) {
                ((TuxTextView) this.LLILZ.getValue()).setTextSize(1, numLJIIJJI4.intValue());
            }
            if (numLJIIJJI5 != null) {
                int iIntValue2 = numLJIIJJI5.intValue();
                ViewGroup.LayoutParams layoutParams3 = ((ConstraintLayout) this.LLILLJJLI.getValue()).getLayoutParams();
                if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                    marginLayoutParams2.setMarginEnd(iIntValue2);
                    C786410Ut5.m6((ConstraintLayout) this.LLILLJJLI.getValue(), marginLayoutParams2);
                }
            }
            if (numLJIIJJI2 != null && numLJIIJJI2.intValue() < 100) {
                ViewGroup.LayoutParams layoutParams4 = ((TuxTextView) this.LLILZ.getValue()).getLayoutParams();
                if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                    marginLayoutParams.topMargin = Math.max(4, (int) (8 * (numLJIIJJI2.intValue() / 100.0f)));
                    C786410Ut5.R6((TuxTextView) this.LLILZ.getValue(), marginLayoutParams);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        AvatarComponentView avatarComponentView = (AvatarComponentView) this.LLILLL.getValue();
        C20611915l7 c20611915l7 = c316580Cb2.LL;
        C0S1B.LIZ(avatarComponentView, c20611915l7.LIZ, C20611815l6.LJFF(c20611915l7), this, false, null, 56);
        String strLIZIZ = C20611815l6.LIZIZ(c316580Cb2.LL);
        TextView textView = (TextView) this.LLILZ.getValue();
        textView.setText(strLIZIZ);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ef, this.itemView.getContext());
        if (numLIZJ2 != null) {
            textView.setTextColor(numLIZJ2.intValue());
        }
        if (C315740CZg.LIZ("sticker", false)) {
            String str6 = c316580Cb2.LL.LJIIL.LIZLLL;
            if (str6.length() > 0 && (numLIZJ = C1308910kAL.LIZJ(R.attr.nj, this.itemView.getContext())) != null) {
                C0I1R.LIZ((TuxTextView) this.LLILZ.getValue(), strLIZIZ, str6, numLIZJ.intValue());
            }
        }
        C786410Ut5.I7(new AkS33S0300000_31(mapVQ2, c316580Cb2, this, 1), this.itemView);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.cell.MentionBaseCell, com.bytedance.ies.powerlist.PowerCell
    public final /* bridge */ /* synthetic */ void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        onBindItemView((C316580Cb2) interfaceC1891350zJl);
    }
}
