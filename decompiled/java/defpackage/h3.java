package defpackage;

import X.C0H1U;
import X.C7736030k;
import X.C786410Ut5;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ColorText;
import com.zhiliaoapp.musically.R;
import g1c.AjS10S0000000_1;
import g1c.AjS20S0300000_1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class h3 extends ConstraintLayout {
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;

    public final TuxTextView getOrderSubmitDiscountItemTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pre);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getOrderSubmitDiscountItemTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.prf);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public /* synthetic */ h3(Context context) {
        this(context, null, 0);
    }

    public final void setDesc(ColorText colorText) {
        String str;
        Integer num;
        Integer num2;
        TuxTextView orderSubmitDiscountItemTextFromXml = getOrderSubmitDiscountItemTextFromXml();
        if (colorText != null) {
            str = colorText.text;
        } else {
            str = null;
        }
        C0H1U.LJIIL(orderSubmitDiscountItemTextFromXml, str, true);
        if (colorText != null) {
            num = colorText.textColor;
        } else {
            num = null;
        }
        orderSubmitDiscountItemTextFromXml.setTextColorRes(C7736030k.LIZ(num, null));
        if (colorText != null) {
            num2 = colorText.textFont;
        } else {
            num2 = null;
        }
        orderSubmitDiscountItemTextFromXml.setTuxFont(C7736030k.LIZJ(num2, null));
    }

    public final void setOrderSubmitDiscountItemTextFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setOrderSubmitDiscountItemTitleFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public h3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.aot, this, true);
    }

    public final void e0(SpannableStringBuilder spannableStringBuilder, ExceptionUX exceptionUX, Function0<Unit> function0) {
        TuxTextView orderSubmitDiscountItemTitleFromXml = getOrderSubmitDiscountItemTitleFromXml();
        C0H1U.LJIIL(orderSubmitDiscountItemTitleFromXml, spannableStringBuilder, true);
        if (exceptionUX != null) {
            C786410Ut5.I7(new AjS20S0300000_1(orderSubmitDiscountItemTitleFromXml, exceptionUX, function0, 20), orderSubmitDiscountItemTitleFromXml);
        } else {
            C786410Ut5.I7(new AjS10S0000000_1(8), orderSubmitDiscountItemTitleFromXml);
        }
    }
}
