package com.bytedance.android.livesdk.subcription.subspaceeditor;

import X.C019F;
import X.C0JCM;
import X.C1119920fFW;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C497740JfY;
import X.C521520Kco;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AFwS290S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class CommentLegalAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final AssemVMLazy LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentLegalAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/subcription/subspaceeditor/SubSpaceEditorVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CommentLegalAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceEditorVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS551S0100000_7(c19719912DlLIZ, 96), AFwS237S0000000_7.get$arr$(42), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hoe;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean z;
        int i;
        int i2;
        super.onViewCreated(view);
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        C0JCM c0jcmWQ2 = ((SubSpaceEditorVM) assemVMLazy.getValue()).wQ2();
        if (c0jcmWQ2 != null) {
            z = c0jcmWQ2.LLILZ;
        } else {
            z = false;
        }
        Context context = getContext();
        if (context != null) {
            TextView textView = (TextView) view.findViewById(R.id.mlq);
            if (z) {
                i = 2131856658;
            } else {
                i = 2131856524;
            }
            String strLJIJI = C497740JfY.LJIJI(i);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (z) {
                i2 = 2131856659;
            } else {
                i2 = 2131856525;
            }
            spannableStringBuilder.append((CharSequence) C786410Ut5.j4(C497740JfY.LJIJI(i2), Arrays.copyOf(new Object[]{strLJIJI}, 1)));
            int iLJJJ = a0.LJJJ(spannableStringBuilder, strLJIJI, 0, false, 6);
            int length = strLJIJI.length() + iLJJJ;
            C786410Ut5.q2(spannableStringBuilder, new C521520Kco(this, context, 1), iLJJJ, length, 33);
            C1119920fFW.LJIIIIZZ(spannableStringBuilder, iLJJJ, length, 33, 500);
            textView.setHighlightColor(0);
            textView.setText(spannableStringBuilder);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        C736680Sv4.LJIIIIZZ(this, this.LLJJI.getValue(), new C2217381BqS() { // from class: X.0JCC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((C0JC4) obj).LLILZLL);
            }
        }, C736820SvI.LIZLLL(), AFwS290S0000000_7.get$arr$(12), 4);
    }
}
