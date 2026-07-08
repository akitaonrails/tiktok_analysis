package kotlin.jvm.internal;

import X.C09AY;
import X.C12RM;
import X.C19653911uz;
import X.C19654511v5;
import X.C375830EoP;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes30.dex */
public class AwS9S0020000_29 extends C09AY implements Function1 {
    public final int $t;
    public boolean z0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS9S0020000_29 awS9S0020000_29, Object obj) {
        boolean z;
        C19654511v5 c19654511v5 = (C19654511v5) obj;
        if (awS9S0020000_29.z0 && awS9S0020000_29.z1) {
            z = true;
        } else {
            z = false;
        }
        return C19654511v5.LIZ(c19654511v5, null, null, null, null, new C19653911uz(Boolean.valueOf(z)), null, null, 111);
    }

    public static final Object invoke$1(AwS9S0020000_29 awS9S0020000_29, Object obj) {
        List<ComposerBeautyExtraBeautify.ItemsBean> items = ((ComposerBeautyExtraBeautify) obj).getItems();
        if (items != null) {
            boolean z = awS9S0020000_29.z0;
            boolean z2 = awS9S0020000_29.z1;
            for (ComposerBeautyExtraBeautify.ItemsBean itemsBean : items) {
                if (z && z2) {
                    itemsBean.setValue(0);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS9S0020000_29 awS9S0020000_29, Object obj) {
        return C12RM.LIZ((C12RM) obj, null, null, new C375830EoP(Boolean.valueOf(!awS9S0020000_29.z0)), new C375830EoP(Boolean.valueOf(awS9S0020000_29.z1)), null, 159);
    }

    public static final Object invoke$3(AwS9S0020000_29 awS9S0020000_29, Object obj) {
        List<ComposerBeautyExtraBeautify.ItemsBean> items = ((ComposerBeautyExtraBeautify) obj).getItems();
        if (items != null) {
            boolean z = awS9S0020000_29.z0;
            boolean z2 = awS9S0020000_29.z1;
            for (ComposerBeautyExtraBeautify.ItemsBean itemsBean : items) {
                if (z && z2) {
                    itemsBean.setValue(0);
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S0020000_29(boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
        this.z1 = z2;
    }
}
