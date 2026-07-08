package kotlin.jvm.internal;

import X.C09AY;
import X.C09RB;
import X.C09RD;
import X.C0HKU;
import X.C0HOM;
import X.C0HZQ;
import X.C10EU;
import X.C1372505Yt;
import X.C1372805Yw;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1908030zkf;
import X.C418440Gaw;
import X.C420500GeG;
import X.C440440HOw;
import X.C440480HPa;
import X.C440910HQr;
import X.C441280HSc;
import X.C441990HUv;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC440230HOb;
import X.InterfaceC441960HUs;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility;
import com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.IEmojiBtnAbility;
import com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.IStickerFeatureIconAbility;
import com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.IStickerIconRedDotAbility;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class AwS2S0900000_6 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public Object l7;
    public Object l8;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS2S0900000_6 awS2S0900000_6, Object obj) {
        ViewGroup.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        String customVerify;
        String enterpriseVerifyReason;
        View view;
        C0HZQ c0hzq;
        LinearLayout linearLayout = (LinearLayout) obj;
        TuxTextView tuxTextView = (TuxTextView) C09RB.LJIIL(C09RB.LJIIIZ(new C09RD(linearLayout), new Function1<Object, Boolean>() { // from class: X.0HRS
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj2) {
                return Boolean.valueOf(obj2 instanceof TuxTextView);
            }
        }));
        if (tuxTextView != null) {
            layoutParams = tuxTextView.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof LinearLayout.LayoutParams) && (layoutParams2 = (LinearLayout.LayoutParams) layoutParams) != null) {
            layoutParams2.width = -2;
            layoutParams2.weight = 0.0f;
            layoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        } else {
            layoutParams2 = null;
        }
        if (tuxTextView != null) {
            C786410Ut5.R6(tuxTextView, layoutParams2);
        }
        Context context = (Context) awS2S0900000_6.l0;
        IMUser iMUser = (IMUser) awS2S0900000_6.l1;
        if (iMUser != null) {
            customVerify = iMUser.getCustomVerify();
        } else {
            customVerify = null;
        }
        IMUser iMUser2 = (IMUser) awS2S0900000_6.l1;
        if (iMUser2 != null) {
            enterpriseVerifyReason = iMUser2.getEnterpriseVerifyReason();
        } else {
            enterpriseVerifyReason = null;
        }
        C1908030zkf.LJI(context, customVerify, enterpriseVerifyReason, tuxTextView);
        View view2 = new View((Context) awS2S0900000_6.l0);
        C786410Ut5.W5(view2, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), 1.0f));
        linearLayout.addView(view2);
        if (C440480HPa.LIZIZ()) {
            MixStudioHomePageAssem mixStudioHomePageAssem = (MixStudioHomePageAssem) awS2S0900000_6.l2;
            Context context2 = (Context) awS2S0900000_6.l0;
            InterfaceC440230HOb interfaceC440230HOb = (InterfaceC440230HOb) awS2S0900000_6.l3;
            C0HOM c0hom = (C0HOM) awS2S0900000_6.l4;
            C440440HOw c440440HOw = (C440440HOw) awS2S0900000_6.l5;
            View view3 = (View) awS2S0900000_6.l6;
            Function1 function1 = (Function1) awS2S0900000_6.l7;
            mixStudioHomePageAssem.getClass();
            if (C10EU.LJIIZILJ(c440440HOw.LIZJ) && (c0hom instanceof C1372505Yt)) {
                if (tuxTextView != null) {
                    tuxTextView.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120)));
                }
                View view4 = new View(context2);
                C786410Ut5.W5(view4, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))));
                view = view4;
            } else {
                if (tuxTextView != null) {
                    tuxTextView.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96)));
                }
                C0HZQ c0hzq2 = new C0HZQ(context2, null, 6);
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                C786410Ut5.N6(c0hzq2, new LinearLayout.LayoutParams(iLIZIZ, iLIZIZ));
                c0hzq2.setSize(1);
                c0hzq2.setShape(0);
                c0hzq2.setChecked(MixStudioHomePageAssem.sp(interfaceC440230HOb, c0hom, c440440HOw));
                c0hzq2.setInterceptToggleListener(new AwS16S0600000_6(mixStudioHomePageAssem, (MixStudioHomePageAssem) context2, (Context) c0hom, (C0HOM<? extends List<C440440HOw>>) c440440HOw, (C440440HOw) view3, (View) function1, (Function1<? super InterfaceC440230HOb<? extends List<C440440HOw>>, Unit>) 1));
                view = c0hzq2;
            }
            List list = (List) awS2S0900000_6.l8;
            C440440HOw c440440HOw2 = (C440440HOw) awS2S0900000_6.l5;
            if ((view instanceof C0HZQ) && (c0hzq = (C0HZQ) view) != null) {
                list.add(new C440910HQr(c440440HOw2, linearLayout, c0hzq));
            }
            return view;
        }
        MixStudioHomePageAssem mixStudioHomePageAssem2 = (MixStudioHomePageAssem) awS2S0900000_6.l2;
        Context context3 = (Context) awS2S0900000_6.l0;
        InterfaceC440230HOb interfaceC440230HOb2 = (InterfaceC440230HOb) awS2S0900000_6.l3;
        C440440HOw c440440HOw3 = (C440440HOw) awS2S0900000_6.l5;
        mixStudioHomePageAssem2.getClass();
        if ((interfaceC440230HOb2 instanceof C0HKU) && C10EU.LJIIZILJ(c440440HOw3.LIZJ)) {
            if (tuxTextView != null) {
                tuxTextView.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100)));
            }
            TuxIconView tuxIconView = new TuxIconView(context3, null, 0, 6, null);
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            C786410Ut5.M6(tuxIconView, new LinearLayout.LayoutParams(iLIZIZ2, iLIZIZ2));
            tuxIconView.setIconRes(R.raw.icon_tick_fill_small);
            tuxIconView.setTintColorRes(R.attr.d2);
            return tuxIconView;
        }
        if ((interfaceC440230HOb2 instanceof C1372805Yw) && ((C1372805Yw) interfaceC440230HOb2).LJI(c440440HOw3)) {
            if (tuxTextView != null) {
                tuxTextView.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100)));
            }
            TuxIconView tuxIconView2 = new TuxIconView(context3, null, 0, 6, null);
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            C786410Ut5.M6(tuxIconView2, new LinearLayout.LayoutParams(iLIZIZ3, iLIZIZ3));
            tuxIconView2.setIconRes(R.raw.icon_tick_fill_small);
            tuxIconView2.setTintColorRes(R.attr.d2);
            return tuxIconView2;
        }
        if (tuxTextView != null) {
            tuxTextView.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120)));
        }
        View view5 = new View(context3);
        C786410Ut5.W5(view5, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))));
        return view5;
    }

    public static final Object invoke$1(AwS2S0900000_6 awS2S0900000_6, Object obj) {
        MixStudioStatusRepository mixStudioStatusRepository;
        Assembler assembler = (Assembler) obj;
        UIAssem uIAssem = (UIAssem) awS2S0900000_6.l0;
        assembler.RQ2(uIAssem, new C441990HUv(uIAssem, (IEmojiBtnAbility) awS2S0900000_6.l4, (InterfaceC441960HUs) awS2S0900000_6.l5, (IInputFieldAbility) awS2S0900000_6.l6, (FrameLayout) awS2S0900000_6.l7));
        if (((IStickerFeatureIconAbility) awS2S0900000_6.l1) != null) {
            Fragment fragmentLJI = C724240Sb0.LJI((UIAssem) awS2S0900000_6.l0);
            if (fragmentLJI != null) {
                C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), (IStickerFeatureIconAbility) awS2S0900000_6.l1, IStickerFeatureIconAbility.class, null, null);
            }
            UIAssem uIAssem2 = (UIAssem) awS2S0900000_6.l0;
            assembler.RQ2(uIAssem2, new AwS28S0600000_6(uIAssem2, (IEmojiBtnAbility) awS2S0900000_6.l4, (InterfaceC441960HUs) awS2S0900000_6.l5, (IInputFieldAbility) awS2S0900000_6.l6, (IStickerFeatureIconAbility) awS2S0900000_6.l1, (FrameLayout) awS2S0900000_6.l7, 1));
        }
        if (((IStickerIconRedDotAbility) awS2S0900000_6.l2) != null) {
            Fragment fragmentLJI2 = C724240Sb0.LJI((UIAssem) awS2S0900000_6.l0);
            if (fragmentLJI2 != null) {
                C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI2, null), (IStickerIconRedDotAbility) awS2S0900000_6.l2, IStickerIconRedDotAbility.class, null, null);
            }
            UIAssem uIAssem3 = (UIAssem) awS2S0900000_6.l0;
            assembler.RQ2(uIAssem3, new AwS215S0300000_6(uIAssem3, (IEmojiBtnAbility) awS2S0900000_6.l4, (FrameLayout) awS2S0900000_6.l7, 25));
        }
        if (C441280HSc.LIZ() && (mixStudioStatusRepository = (MixStudioStatusRepository) awS2S0900000_6.l3) != null) {
            UIAssem uIAssem4 = (UIAssem) awS2S0900000_6.l0;
            IEmojiBtnAbility iEmojiBtnAbility = (IEmojiBtnAbility) awS2S0900000_6.l4;
            IInputFieldAbility iInputFieldAbility = (IInputFieldAbility) awS2S0900000_6.l6;
            InterfaceC441960HUs interfaceC441960HUs = (InterfaceC441960HUs) awS2S0900000_6.l5;
            FrameLayout frameLayout = (FrameLayout) awS2S0900000_6.l7;
            SessionInfo sessionInfo = (SessionInfo) awS2S0900000_6.l8;
            assembler.RQ2(uIAssem4, new AwS28S0600000_6(uIAssem4, iEmojiBtnAbility, iInputFieldAbility, interfaceC441960HUs, mixStudioStatusRepository, frameLayout, 2));
            assembler.RQ2(uIAssem4, new AwS28S0600000_6(uIAssem4, iEmojiBtnAbility, iInputFieldAbility, sessionInfo, mixStudioStatusRepository, frameLayout, 3));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S0900000_6(Context context, IMUser iMUser, MixStudioHomePageAssem mixStudioHomePageAssem, InterfaceC440230HOb interfaceC440230HOb, C0HOM c0hom, C440440HOw c440440HOw, C420500GeG c420500GeG, AwS215S0300000_6 awS215S0300000_6, List list, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = iMUser;
        this.l2 = mixStudioHomePageAssem;
        this.l3 = interfaceC440230HOb;
        this.l4 = c0hom;
        this.l5 = c440440HOw;
        this.l6 = c420500GeG;
        this.l7 = awS215S0300000_6;
        this.l8 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S0900000_6(UIAssem uIAssem, IStickerFeatureIconAbility iStickerFeatureIconAbility, IStickerIconRedDotAbility iStickerIconRedDotAbility, MixStudioStatusRepository mixStudioStatusRepository, IEmojiBtnAbility iEmojiBtnAbility, InterfaceC441960HUs interfaceC441960HUs, IInputFieldAbility iInputFieldAbility, FrameLayout frameLayout, SessionInfo sessionInfo, int i) {
        super(1);
        this.$t = i;
        this.l0 = uIAssem;
        this.l1 = iStickerFeatureIconAbility;
        this.l2 = iStickerIconRedDotAbility;
        this.l3 = mixStudioStatusRepository;
        this.l4 = iEmojiBtnAbility;
        this.l5 = interfaceC441960HUs;
        this.l6 = iInputFieldAbility;
        this.l7 = frameLayout;
        this.l8 = sessionInfo;
    }
}
