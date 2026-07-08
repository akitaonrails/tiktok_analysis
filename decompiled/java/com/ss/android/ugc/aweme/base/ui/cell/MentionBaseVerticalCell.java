package com.ss.android.ugc.aweme.base.ui.cell;

import X.C01GW;
import X.C0ZE7;
import X.C1607280rva;
import X.C1607310rvd;
import X.C1608750rxx;
import X.C20750716Hx;
import X.C2211751BhN;
import X.C316580Cb2;
import X.C427690Gpr;
import X.C452501pT;
import X.EnumC1606090rtf;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public abstract class MentionBaseVerticalCell<T extends C316580Cb2> extends MentionBaseCell<T> {
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS575S0100000_31((MentionBaseVerticalCell) this, 297));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS575S0100000_31((MentionBaseVerticalCell) this, 302));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS575S0100000_31((MentionBaseVerticalCell) this, 299));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS575S0100000_31((MentionBaseVerticalCell) this, 304));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS575S0100000_31((MentionBaseVerticalCell) this, 298));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS575S0100000_31((MentionBaseVerticalCell) this, 301));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(97));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS575S0100000_31((MentionBaseVerticalCell) this, 303));
    public final C20750716Hx LLJI = new C20750716Hx(this, 0);

    @Override // com.ss.android.ugc.aweme.base.ui.cell.MentionBaseCell
    public int L5() {
        return R.layout.dlf;
    }

    public abstract boolean S5();

    public abstract EnumC1606090rtf T5();

    public abstract String U5();

    public abstract String V5();

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        C427690Gpr.LIZLLL(this.itemView, 0);
        C2211751BhN.LIZ(this.itemView, this.LLJI);
        AvatarComponentView avatarComponentView = (AvatarComponentView) this.LLILLJJLI.getValue();
        C1608750rxx config = avatarComponentView.getConfig();
        new AwS610S0100000_31(this, 127).invoke(config.LIZ);
        config.LIZJ(new C1607280rva(new C1607310rvd(T5(), (C0ZE7) this.LLJ.getValue(), false, false, N5().LLILLJJLI, 110)));
        config.LIZ(AFwS276S0000000_31.get$arr$(52));
        avatarComponentView.LJFF(avatarComponentView.getConfig());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0132 A[PHI: r4
      0x0132: PHI (r4v10 java.lang.String) = (r4v7 java.lang.String), (r4v11 java.lang.String) binds: [B:42:0x01e5, B:18:0x0130] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.base.ui.cell.MentionBaseCell
    /* JADX INFO: renamed from: P5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(T r14) {
        /*
            Method dump skipped, instruction units count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.ui.cell.MentionBaseVerticalCell.onBindItemView(X.0Cb2):void");
    }

    @Override // com.ss.android.ugc.aweme.base.ui.cell.MentionBaseCell, com.bytedance.ies.powerlist.PowerCell
    public final /* bridge */ /* synthetic */ void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        onBindItemView((C316580Cb2) interfaceC1891350zJl);
    }
}
