package kotlin.jvm.internal;

import X.C09AY;
import X.C0Y8T;
import X.C0Z1R;
import X.C0ZL0;
import X.C0ZQI;
import X.C1308910kAL;
import X.C1383370m6R;
import X.C1389910mGz;
import X.C786410Ut5;
import X.C865340Xx6;
import X.C869590Y9l;
import X.C901130ZWt;
import X.C909290Zln;
import X.InterfaceC863600XuI;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.notice.NoticeFeature;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.IMMessageListTranslationViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public class AwS48S0500000_14 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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

    public static final Object invoke$0(AwS48S0500000_14 awS48S0500000_14, Object obj) {
        List<C0Y8T> listLJIJJ = ((C865340Xx6) awS48S0500000_14.l0).LIZ.LJIJJ((List) awS48S0500000_14.l1);
        ((C865340Xx6) awS48S0500000_14.l0).LIZ.LJJIIJ(listLJIJJ, (List) awS48S0500000_14.l2, (List) awS48S0500000_14.l3, (Boolean) awS48S0500000_14.l4, (InterfaceC863600XuI) obj);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS48S0500000_14 awS48S0500000_14, Object obj) {
        ViewGroup viewGroup = (ViewGroup) obj;
        int iIntValue = 0;
        TuxTextView tuxTextView = new TuxTextView(viewGroup.getContext(), null, 6, 0);
        final NoticeFeature noticeFeature = (NoticeFeature) awS48S0500000_14.l0;
        final C1389910mGz c1389910mGz = (C1389910mGz) awS48S0500000_14.l1;
        final C909290Zln c909290Zln = (C909290Zln) awS48S0500000_14.l2;
        final C0Z1R c0z1r = (C0Z1R) awS48S0500000_14.l3;
        final Activity activity = (Activity) awS48S0500000_14.l4;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, viewGroup.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        }
        tuxTextView.setTextColor(iIntValue);
        tuxTextView.setTuxFont(42);
        tuxTextView.setText(C1383370m6R.LJIIJ(noticeFeature.LJIIJJI()));
        C786410Ut5.h9(tuxTextView, new View.OnClickListener() { // from class: X.0YoJ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c1389910mGz.LIZJ();
                C866530Xz1 c866530Xz1LIZIZ = C0YNP.LIZIZ(c909290Zln.getConversationId());
                EnumC868530Y5j enumC868530Y5j = EnumC868530Y5j.USER_SET_CONVERSATION_CATEGORY_SECONDARY;
                C914120Zta c914120Zta = new C914120Zta(noticeFeature, activity, 1);
                if (C293390Bej.LIZ()) {
                    C054G c054g = c866530Xz1LIZIZ.LJ;
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(c054g, C2107308Nj.LIZ.LLIILII(), null, new C866090XyJ(c914120Zta, null, c866530Xz1LIZIZ, enumC868530Y5j), 2);
                } else {
                    c866530Xz1LIZIZ.LJIJI().LL(enumC868530Y5j, c914120Zta);
                }
                C0Z1R c0z1r2 = c0z1r;
                C909290Zln c909290Zln2 = c909290Zln;
                c0z1r2.getClass();
                C0Z1R.LIZLLL(c909290Zln2, "accept", enumC868530Y5j);
            }
        });
        viewGroup.addView(tuxTextView);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS48S0500000_14 awS48S0500000_14, Object obj) {
        ((C0ZQI) awS48S0500000_14.l0).LJII((C869590Y9l) awS48S0500000_14.l1, "hide_translate");
        C901130ZWt.LIZIZ.LJIIJJI((Context) awS48S0500000_14.l2, (FragmentManager) awS48S0500000_14.l3, (C869590Y9l) awS48S0500000_14.l1);
        ((C0ZQI) awS48S0500000_14.l0).LJ(C0ZL0.TRANSLATE_HIDE, null);
        IMMessageListTranslationViewModel iMMessageListTranslationViewModel = (IMMessageListTranslationViewModel) awS48S0500000_14.l4;
        String uuid = ((C869590Y9l) awS48S0500000_14.l1).getUuid();
        iMMessageListTranslationViewModel.getClass();
        iMMessageListTranslationViewModel.setState(new AwS65S1000000_14(uuid, 13));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS48S0500000_14 awS48S0500000_14, Object obj) {
        ((C0ZQI) awS48S0500000_14.l0).LJII((C869590Y9l) awS48S0500000_14.l1, "translate");
        C901130ZWt.LIZIZ.LJIIJJI((Context) awS48S0500000_14.l2, (FragmentManager) awS48S0500000_14.l3, (C869590Y9l) awS48S0500000_14.l1);
        ((C0ZQI) awS48S0500000_14.l0).LJ(C0ZL0.TRANSLATE, null);
        IMMessageListTranslationViewModel iMMessageListTranslationViewModel = (IMMessageListTranslationViewModel) awS48S0500000_14.l4;
        String uuid = ((C869590Y9l) awS48S0500000_14.l1).getUuid();
        iMMessageListTranslationViewModel.getClass();
        iMMessageListTranslationViewModel.setState(new AwS65S1000000_14(uuid, 14));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS48S0500000_14(C865340Xx6 c865340Xx6, C865340Xx6 c865340Xx62, List<String> list, List<String> list2, List<String> list3, Boolean bool) {
        super(1);
        this.$t = bool;
        this.l0 = c865340Xx6;
        this.l1 = c865340Xx62;
        this.l2 = list;
        this.l3 = list2;
        this.l4 = list3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS48S0500000_14(Activity activity, C1389910mGz c1389910mGz, C909290Zln c909290Zln, NoticeFeature noticeFeature, C0Z1R c0z1r, int i) {
        super(1);
        this.$t = i;
        this.l0 = noticeFeature;
        this.l1 = c1389910mGz;
        this.l2 = c909290Zln;
        this.l3 = c0z1r;
        this.l4 = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS48S0500000_14(Context context, FragmentManager fragmentManager, C869590Y9l c869590Y9l, C0ZQI c0zqi, IMMessageListTranslationViewModel iMMessageListTranslationViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0zqi;
        this.l1 = c869590Y9l;
        this.l2 = context;
        this.l3 = fragmentManager;
        this.l4 = iMMessageListTranslationViewModel;
    }
}
