package com.ss.android.ugc.aweme.base.ui.cell;

import X.C01GW;
import X.C13LE;
import X.C20611915l7;
import X.C316580Cb2;
import X.C452501pT;
import X.C737520SwQ;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.base.vm.MentionContainerViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS114S1200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS85S0500000_31;

/* JADX INFO: loaded from: classes32.dex */
public abstract class MentionBaseCell<ITEM extends C316580Cb2> extends PowerCell<ITEM> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS85S0500000_31(this, C13LE.LIZ(MentionContainerViewModel.class), new AwS575S0100000_31((MentionBaseCell) this, 296), AFwS276S0000000_31.get$arr$(291), (Function0) null, 2));

    public abstract String I5();

    public abstract int L5();

    public final MentionContainerViewModel N5() {
        return (MentionContainerViewModel) this.LL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: P5, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindItemView(ITEM r6) {
        /*
            r5 = this;
            android.view.View r1 = r5.itemView
            X.15l7 r0 = r6.LL
            boolean r0 = r0.LJIIJ
            if (r0 == 0) goto L33
            r0 = 1065353216(0x3f800000, float:1.0)
        La:
            X.C786410Ut5.T4(r1, r0)
            boolean r0 = X.C286800BLy.LIZ()
            if (r0 == 0) goto L32
            X.15l7 r0 = r6.LL
            X.0CbM r0 = r0.LJIILIIL
            java.lang.String r4 = r0.LIZ
            android.view.View r1 = r5.itemView
            r0 = 2131381380(0x7f0a4c84, float:1.8383076E38)
            android.view.View r3 = r1.findViewById(r0)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L32
            int r0 = r4.length()
            r2 = 0
            if (r0 != 0) goto L37
            r0 = 8
            X.C786410Ut5.LLIL(r3, r0)
        L32:
            return
        L33:
            r0 = 1050253722(0x3e99999a, float:0.3)
            goto La
        L37:
            r3.setText(r4)
            int r1 = r4.hashCode()
            r0 = -554436100(0xffffffffdef3f9fc, float:-8.79018E18)
            if (r1 == r0) goto L6b
            r0 = 83461(0x14605, float:1.16954E-40)
            if (r1 == r0) goto L5f
            r0 = 103145323(0x625df6b, float:3.1197192E-35)
            if (r1 != r0) goto L77
            java.lang.String r0 = "local"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L77
            r0 = -870213901(0xffffffffcc2196f3, float:-4.2359756E7)
        L58:
            r3.setBackgroundColor(r0)
            X.C786410Ut5.LLIL(r3, r2)
            return
        L5f:
            java.lang.String r0 = "SuG"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L77
            r0 = -855664640(0xffffffffccff9800, float:-1.3400474E8)
            goto L58
        L6b:
            java.lang.String r0 = "relation"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L77
            r0 = -867389616(0xffffffffcc4caf50, float:-5.3656896E7)
            goto L58
        L77:
            r0 = -7829368(0xffffffffff888888, float:NaN)
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.ui.cell.MentionBaseCell.onBindItemView(X.0Cb2):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), L5(), viewGroup, false);
    }

    public final void R5(C20611915l7 c20611915l7, String str) {
        if (c20611915l7.LJIIL.LIZLLL.length() == 0) {
            return;
        }
        C737520SwQ.LIZ("social_search_result_select", new AwS114S1200000_31(str, (String) c20611915l7, (C20611915l7) this, 2));
    }
}
