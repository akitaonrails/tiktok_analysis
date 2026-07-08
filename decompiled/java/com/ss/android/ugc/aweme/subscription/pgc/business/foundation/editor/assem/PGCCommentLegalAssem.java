package com.ss.android.ugc.aweme.subscription.pgc.business.foundation.editor.assem;

import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C521520Kco;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.editor.viewmodel.SubSpaceEditorVM;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AFwS290S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class PGCCommentLegalAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final AssemVMLazy LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PGCCommentLegalAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/subscription/pgc/business/foundation/editor/viewmodel/SubSpaceEditorVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PGCCommentLegalAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceEditorVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS551S0100000_7(c19719912DlLIZ, 427), AFwS237S0000000_7.get$arr$(190), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fh8;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Context context = getContext();
        if (context != null) {
            TextView textView = (TextView) view.findViewById(R.id.mlq);
            String string = context.getString(2131839592);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) C786410Ut5.j4(context.getString(2131839593), Arrays.copyOf(new Object[]{string}, 1)));
            int iLJJJ = a0.LJJJ(spannableStringBuilder, string, 0, false, 6);
            if (iLJJJ < 0) {
                textView.setText(spannableStringBuilder);
            } else {
                int length = string.length() + iLJJJ;
                C786410Ut5.q2(spannableStringBuilder, new C521520Kco(this, context, 3), iLJJJ, length, 33);
                C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), iLJJJ, length, 33);
                textView.setHighlightColor(0);
                textView.setText(spannableStringBuilder);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0JCD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((C0JC5) obj).LLILZLL);
            }
        }, C736820SvI.LIZLLL(), AFwS290S0000000_7.get$arr$(13), 4);
    }
}
