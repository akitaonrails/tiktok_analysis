package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C0DT1;
import X.C0DT2;
import X.C20612815lG;
import X.C316530Cax;
import X.C316560Cb0;
import X.C345700Dgu;
import X.C345710Dgv;
import X.InterfaceC20613315lL;
import android.view.View;
import com.ss.android.ugc.aweme.base.ui.cell.GroupMentionCell;
import com.ss.android.ugc.aweme.base.vm.MentionContainerViewModel;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes5.dex */
public class AbS497S0200000_4 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS497S0200000_4 abS497S0200000_4, View view) {
        AwS620S0100000_6 awS620S0100000_6;
        if (view != null && (awS620S0100000_6 = ((C345710Dgv) abS497S0200000_4.l0).LIZIZ) != null) {
            awS620S0100000_6.invoke(view, (C345700Dgu) abS497S0200000_4.l1);
        }
    }

    public static final void LIZ$1(AbS497S0200000_4 abS497S0200000_4, View view) {
        if (view != null) {
            MentionContainerViewModel mentionContainerViewModel = (MentionContainerViewModel) ((GroupMentionCell) abS497S0200000_4.l0).LL.getValue();
            C316560Cb0 c316560Cb0 = (C316560Cb0) abS497S0200000_4.l1;
            if (mentionContainerViewModel.LL != null) {
                C316530Cax c316530Cax = (C316530Cax) ((LinkedHashMap) mentionContainerViewModel.LLILZIL).get(c316560Cb0.LL);
                C20612815lG c20612815lG = mentionContainerViewModel.LL;
                if (c20612815lG == null) {
                    c20612815lG = null;
                }
                InterfaceC20613315lL interfaceC20613315lL = c20612815lG.LJII;
                if (interfaceC20613315lL != null) {
                    interfaceC20613315lL.M8(c316560Cb0.LL, c316560Cb0.LLILLJJLI, c316530Cax, mentionContainerViewModel.LLILZLL);
                }
            }
        }
    }

    public static final void LIZ$2(AbS497S0200000_4 abS497S0200000_4, View view) {
        String string;
        if (view != null) {
            Function1<String, Unit> function1 = ((C0DT1) abS497S0200000_4.l0).LLILLJJLI;
            CharSequence text = ((C0DT2) abS497S0200000_4.l1).LL.getText();
            if (text == null || (string = text.toString()) == null) {
                string = "";
            }
            function1.invoke(string);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS497S0200000_4(Object obj, Object obj2, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
