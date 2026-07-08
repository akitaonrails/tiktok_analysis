package com.ss.android.ugc.aweme.business.repost.cell;

import X.C01GW;
import X.C0I1R;
import X.C0I1T;
import X.C0S1B;
import X.C0ZE7;
import X.C1308910kAL;
import X.C1602160rnK;
import X.C1607280rva;
import X.C1607310rvd;
import X.C1608750rxx;
import X.C1908030zkf;
import X.C20611315l1;
import X.C20611815l6;
import X.C20611915l7;
import X.C20750716Hx;
import X.C2211751BhN;
import X.C315740CZg;
import X.C316580Cb2;
import X.C384050F3z;
import X.C427660Gpo;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1606090rtf;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.ui.cell.MentionBaseCell;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import wh6.AbS168S1200000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class RepostMentionHorizontalCell extends MentionBaseCell<C316580Cb2> {
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 311));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 315));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 312));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 313));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 316));
    public final C20750716Hx LLIZ = new C20750716Hx(this, 2);

    @Override // com.ss.android.ugc.aweme.base.ui.cell.MentionBaseCell
    public final String I5() {
        return "repost_text";
    }

    @Override // com.ss.android.ugc.aweme.base.ui.cell.MentionBaseCell
    public final int L5() {
        return R.layout.dlz;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        C2211751BhN.LIZ(this.itemView, this.LLIZ);
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.LLILZ.getValue();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.ob);
        c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
        appCompatImageView.setBackgroundDrawable(c384050F3z.LIZ(this.itemView.getContext()));
        AvatarComponentView avatarComponentView = (AvatarComponentView) this.LLILLJJLI.getValue();
        C427660Gpo avatar = avatarComponentView.getAvatar();
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.zj);
        c384050F3z2.LIZJ = Float.valueOf(2.1474836E9f);
        avatar.setBackground(c384050F3z2.LIZ(avatarComponentView.getContext()));
        C1608750rxx config = avatarComponentView.getConfig();
        new AwS610S0100000_31(this, 134).invoke(config.LIZ);
        config.LIZJ(new C1607280rva(new C1607310rvd(EnumC1606090rtf.REPOST_PANEL, (C0ZE7) this.LLILZLL.getValue(), false, false, N5().LLILLJJLI, 110)));
        avatarComponentView.LJFF(avatarComponentView.getConfig());
        ((TuxTextView) this.LLILLL.getValue()).setTextColorRes(R.attr.zi);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.cell.MentionBaseCell
    /* JADX INFO: renamed from: P5 */
    public final void onBindItemView(C316580Cb2 c316580Cb2) {
        float f;
        boolean z;
        int i;
        Integer numLIZJ;
        super.onBindItemView(c316580Cb2);
        View view = (View) this.LLILLJJLI.getValue();
        if (c316580Cb2.LL.LJIIJ && c316580Cb2.LLILLJJLI) {
            f = 0.75f;
        } else {
            f = 1.0f;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
        view.setAlpha(f);
        ((C0ZE7) this.LLILZLL.getValue()).LJI = Integer.valueOf(getBindingAdapterPosition());
        AvatarComponentView avatarComponentView = (AvatarComponentView) this.LLILLJJLI.getValue();
        C20611915l7 c20611915l7 = c316580Cb2.LL;
        C0S1B.LIZ(avatarComponentView, c20611915l7.LIZ, C20611815l6.LJFF(c20611915l7), this, false, null, 56);
        String str = N5().vQ2().get("enter_from");
        if (str == null) {
            str = "";
        }
        if (!c316580Cb2.LL.LJIIL.LIZJ && c316580Cb2.LLILLJJLI) {
            z = true;
        } else {
            z = false;
        }
        TuxIconView tuxIconView = (TuxIconView) this.LLILZ.getValue();
        int i2 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, i);
        View view2 = (View) this.LLILZIL.getValue();
        if (z) {
            i2 = 0;
        }
        int visibility = view2.getVisibility();
        view2.setVisibility(i2);
        C1602160rnK.LIZIZ(visibility, i2, view2);
        C786410Ut5.I7(new AbS168S1200000_31(this, str, c316580Cb2, 1), this.itemView);
        String strLIZIZ = C20611815l6.LIZIZ(c316580Cb2.LL);
        if (C315740CZg.LIZ("repost_text", false)) {
            ((TextView) this.LLILLL.getValue()).setText(strLIZIZ);
            String str2 = c316580Cb2.LL.LJIIL.LIZLLL;
            if (str2.length() > 0 && (numLIZJ = C1308910kAL.LIZJ(R.attr.nj, this.itemView.getContext())) != null) {
                C0I1R.LIZ((TuxTextView) this.LLILLL.getValue(), strLIZIZ, str2, numLIZJ.intValue());
            }
        } else {
            SpannableString spannableString = new SpannableString(strLIZIZ);
            C20611315l1 c20611315l1 = c316580Cb2.LL.LJIIL;
            if (c20611315l1.LIZJ) {
                for (Position position : c20611315l1.LJI) {
                    C0I1T c0i1t = C0I1T.LIZ;
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.nj, this.itemView.getContext());
                    String str3 = c316580Cb2.LL.LJIIL.LIZLLL;
                    int begin = position.getBegin();
                    c0i1t.getClass();
                    spannableString = C0I1T.LIZIZ(begin, strLIZIZ, numLIZJ2, str3);
                }
            }
            ((TextView) this.LLILLL.getValue()).setText(spannableString);
        }
        Context context = this.itemView.getContext();
        C20611915l7 c20611915l72 = c316580Cb2.LL;
        C1908030zkf.LJI(context, c20611915l72.LJI, c20611915l72.LJII, (TextView) this.LLILLL.getValue());
        C2211751BhN.LJ(C2211751BhN.LJIIIZ(), false);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.cell.MentionBaseCell, com.bytedance.ies.powerlist.PowerCell
    public final /* bridge */ /* synthetic */ void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        onBindItemView((C316580Cb2) interfaceC1891350zJl);
    }
}
