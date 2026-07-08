package defpackage;

import X.C1744320vUc;
import X.C240600wO;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes27.dex */
public final class t7 extends p0 {
    public final TextView LLILLJJLI;

    public t7(View view) {
        super(view);
        this.LLILLJJLI = (TextView) this.itemView.findViewById(R.id.zbz);
    }

    @Override // defpackage.p0
    public final void I5(C1744320vUc c1744320vUc, String str) {
        if (c1744320vUc == null) {
            return;
        }
        String str2 = c1744320vUc.LIZIZ;
        TextView textView = this.LLILLJJLI;
        str2.toString();
        SpannableStringBuilder spannableStringBuilderLIZ = C240600wO.LIZ(str, null, null, str2, this.itemView.getContext());
        CharSequence charSequence = str2;
        if (spannableStringBuilderLIZ != null) {
            charSequence = spannableStringBuilderLIZ;
        }
        textView.setText(charSequence);
    }
}
