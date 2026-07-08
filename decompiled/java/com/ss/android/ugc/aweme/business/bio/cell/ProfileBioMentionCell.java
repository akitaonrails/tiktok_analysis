package com.ss.android.ugc.aweme.business.bio.cell;

import X.C01GW;
import X.C0I1R;
import X.C0S1B;
import X.C1308910kAL;
import X.C20611815l6;
import X.C20611915l7;
import X.C315740CZg;
import X.C316580Cb2;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.ui.cell.MentionBaseCell;
import com.zhiliaoapp.musically.R;
import irm.AkS68S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class ProfileBioMentionCell extends MentionBaseCell<C316580Cb2> {
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 305));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 306));

    @Override // com.ss.android.ugc.aweme.base.ui.cell.MentionBaseCell
    public final String I5() {
        return "profile_bio";
    }

    @Override // com.ss.android.ugc.aweme.base.ui.cell.MentionBaseCell
    public final int L5() {
        return R.layout.dlt;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        AvatarComponentView avatarComponentView = (AvatarComponentView) this.LLILLJJLI.getValue();
        new AwS610S0100000_31(this, 130).invoke(avatarComponentView.getConfig().LIZ);
        avatarComponentView.LJFF(avatarComponentView.getConfig());
    }

    @Override // com.ss.android.ugc.aweme.base.ui.cell.MentionBaseCell
    /* JADX INFO: renamed from: P5 */
    public final void onBindItemView(C316580Cb2 c316580Cb2) {
        Integer numLIZJ;
        super.onBindItemView(c316580Cb2);
        AvatarComponentView avatarComponentView = (AvatarComponentView) this.LLILLJJLI.getValue();
        C20611915l7 c20611915l7 = c316580Cb2.LL;
        C0S1B.LIZ(avatarComponentView, c20611915l7.LIZ, C20611815l6.LJFF(c20611915l7), this, false, null, 56);
        String strLIZIZ = C20611815l6.LIZIZ(c316580Cb2.LL);
        TextView textView = (TextView) this.LLILLL.getValue();
        textView.setText(strLIZIZ);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, this.itemView.getContext());
        if (numLIZJ2 != null) {
            textView.setTextColor(numLIZJ2.intValue());
        }
        if (C315740CZg.LIZ("profile_bio", false)) {
            String str = c316580Cb2.LL.LJIIL.LIZLLL;
            if (str.length() > 0 && (numLIZJ = C1308910kAL.LIZJ(R.attr.nj, this.itemView.getContext())) != null) {
                C0I1R.LIZ((TuxTextView) this.LLILLL.getValue(), strLIZIZ, str, numLIZJ.intValue());
            }
        }
        C786410Ut5.I7(new AkS68S0200000_31(c316580Cb2, this, 1), this.itemView);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.cell.MentionBaseCell, com.bytedance.ies.powerlist.PowerCell
    public final /* bridge */ /* synthetic */ void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        onBindItemView((C316580Cb2) interfaceC1891350zJl);
    }
}
