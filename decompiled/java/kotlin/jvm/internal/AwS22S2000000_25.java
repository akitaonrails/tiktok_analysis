package kotlin.jvm.internal;

import X.C09AY;
import X.C1212320heY;
import X.C1601690rmZ;
import X.C1696490uFT;
import X.C1696500uFU;
import X.C289580BWq;
import X.C786410Ut5;
import X.InterfaceC1692460u8y;
import X.InterfaceC2217461Bqa;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS22S2000000_25 extends C09AY implements Function1 {
    public final int $t;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS22S2000000_25 awS22S2000000_25, Object obj) {
        InterfaceC1692460u8y interfaceC1692460u8y = (InterfaceC1692460u8y) obj;
        if (C1601690rmZ.LIZJ() && C289580BWq.LIZ()) {
            C1696490uFT.LJ(interfaceC1692460u8y, awS22S2000000_25.s0);
            String str = awS22S2000000_25.s1;
            if (str != null) {
                C1212320heY<String> c1212320heY = C1696500uFU.LIZJ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1696490uFT.LIZ;
                c1212320heY.getClass();
                interfaceC1692460u8y.LIZJ(c1212320heY, str);
            }
            C1696490uFT.LJFF(interfaceC1692460u8y);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS22S2000000_25 awS22S2000000_25, Object obj) {
        String string;
        View view = (View) obj;
        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.xtt);
        if (appCompatTextView != null) {
            String str = awS22S2000000_25.s0;
            CharSequence text = appCompatTextView.getText();
            if (text != null) {
                string = text.toString();
            } else {
                string = null;
            }
            if (!Intrinsics.LJFF(string, str)) {
                appCompatTextView.setText(str);
            }
        }
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.xtu);
        if (tuxTextView != null) {
            String str2 = awS22S2000000_25.s1;
            tuxTextView.setText(str2);
            int length = str2.length();
            int i = 0;
            if (length == 0) {
                i = 8;
            }
            C786410Ut5.LLLLZLL(tuxTextView, i);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS22S2000000_25(String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
