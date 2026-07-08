package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.viewholder;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H8;
import X.C03IJ;
import X.C03K6;
import X.C04JU;
import X.C0H1U;
import X.C0H9H;
import X.C0HEZ;
import X.C0HZQ;
import X.C1071804Hc;
import X.C12ES;
import X.C1308910kAL;
import X.C13LE;
import X.C13LP;
import X.C19719912Dl;
import X.C19ME;
import X.C21370518kB;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C890103dr;
import X.C895403ei;
import X.C895903en;
import X.EnumC837803Pc;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ACListenerS105S0200000_1;
import Y.ACListenerS136S0100000_1;
import Y.ARunnableS101S0100000_1;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.CCDCAddCardLongTextAdjust;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentSecurityConfig;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.ATMCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.SaveDisplayInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.SaveDisplayInfoContent;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS402S0200000_1;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS64S0301000_1;
import kotlin.jvm.internal.Intrinsics;
import ola.h;
import p8b.c;

/* JADX INFO: loaded from: classes2.dex */
public final class ATMSaveNewCardViewHolder extends PowerCell<C895403ei> implements C03H8, c {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public TuxTextView LL;
    public C0HZQ LLILLJJLI;
    public C0HZQ LLILLL;
    public TuxIconView LLILZ;
    public TuxIconView LLILZIL;
    public final AssemVMLazy LLILZLL;
    public final C01GW LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ATMSaveNewCardViewHolder.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/payment/card/ATMCardViewModel;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // p8b.c
    public final String getViewName() {
        return "SaveNewCardViewHolder";
    }

    public ATMSaveNewCardViewHolder() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ATMCardViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 1007);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(183);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 997), awS545S0100000_1, AFwS207S0000000_19.get$arr$(201), new AwS545S0100000_1((C03K6) this, 999), new AwS545S0100000_1((C03K6) this, 1001), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1003), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1299), null, new AwS545S0100000_1((C03K6) this, 1005));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1((C03K6) this, LSPassThroughRecordSizeConfig.DEFAULT);
            AwS545S0100000_1 awS545S0100000_13 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1002);
            AwS545S0100000_1 awS545S0100000_14 = new AwS545S0100000_1(c19719912DlLIZ, 1004);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_12, 76));
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c01gwLIZIZ, 1300);
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c01gwLIZIZ, 1301);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c01gwLIZIZ, 1302);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c01gwLIZIZ, 1303);
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 1304);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS545S0100000_14, awS545S0100000_1, new C452080Ho6(), awS563S0100000_19, awS563S0100000_192, awS545S0100000_13, aFwS228S0000000_1, awS563S0100000_193, awS563S0100000_194, awS563S0100000_195);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1006), awS545S0100000_1, AFwS207S0000000_19.get$arr$(202), new AwS545S0100000_1((C03K6) this, 1008), new AwS545S0100000_1((C03K6) this, 1009), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1010), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1305), null, new AwS545S0100000_1((C03K6) this, 1011));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1012), awS545S0100000_1, AFwS207S0000000_19.get$arr$(203), new AwS545S0100000_1((C03K6) this, 1013), new AwS545S0100000_1((C03K6) this, 1014), new AwS545S0100000_1((C03K6) this, 1015), aFwS228S0000000_1, null, null, new AwS545S0100000_1((C03K6) this, 1016));
        }
        this.LLILZLL = assemVMLazy;
        this.LLIZ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 998));
    }

    public final C0HZQ I5() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.dj8) : null;
            this.LLILLJJLI = (C0HZQ) viewFindViewById;
        }
        return (C0HZQ) viewFindViewById;
    }

    public final C0HZQ L5() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.dj9) : null;
            this.LLILLL = (C0HZQ) viewFindViewById;
        }
        return (C0HZQ) viewFindViewById;
    }

    public final TuxIconView N5() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.jxe) : null;
            this.LLILZ = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final TuxTextView P5() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.z6l) : null;
            this.LL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final ATMCardViewModel R5() {
        AssemVMLazy assemVMLazy = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZLLLIL;
        return (ATMCardViewModel) assemVMLazy.getValue();
    }

    @Override // X.C03H8
    public final View LJJIJL() {
        return this.itemView;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        SaveDisplayInfoContent saveDisplayInfoContent;
        String str;
        SaveDisplayInfoContent saveDisplayInfoContent2;
        ViewGroup viewGroup;
        int i;
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        List<SaveDisplayInfoContent> list;
        ViewTreeObserver.OnPreDrawListener onPreDrawListener2;
        List<SaveDisplayInfoContent> list2;
        PaymentMethodsData paymentMethodsData;
        EnumC837803Pc enumC837803Pc;
        Context context;
        C895403ei c895403ei = (C895403ei) interfaceC1891350zJl;
        super.onBindItemView(c895403ei);
        L5().setSize(((h) this.LLIZ.getValue()).LJJZZIII());
        I5().setSize(((h) this.LLIZ.getValue()).LJJZZIII());
        P5().setTuxFont(((h) this.LLIZ.getValue()).LJJLIIIJJI());
        if (Intrinsics.LJFF(((EcPaymentSecurityConfig) C895903en.LIZIZ.getValue()).useCheckBox, Boolean.TRUE)) {
            C0H9H.LJFF(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), P5());
            C0H9H.LIZLLL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), P5());
            L5().setShape(1);
            C12ES.LJIILL(0, L5());
            C0H1U.LIZIZ(I5());
        } else if (((h) this.LLIZ.getValue()).LLD() == 0) {
            C0H1U.LIZIZ(L5());
            C12ES.LJIILL(0, I5());
        } else {
            C12ES.LJIILL(0, L5());
            C0H1U.LIZIZ(I5());
        }
        this.itemView.setPadding(C0H9H.LIZIZ(16), this.itemView.getPaddingTop(), C0H9H.LIZIZ(16), this.itemView.getPaddingBottom());
        P5().setText(c895403ei.LL);
        I5().setChecked(R5().LLILZ);
        L5().setChecked(R5().LLILZ);
        EnterParams enterParams = R5().LL;
        if (enterParams != null && (paymentMethodsData = enterParams.paymentData) != null) {
            EnterParams enterParams2 = R5().LL;
            if (enterParams2 != null) {
                enumC837803Pc = enterParams2.LJJIJIIJI;
            } else {
                enumC837803Pc = null;
            }
            if (paymentMethodsData.LJIILLIIL(enumC837803Pc) == ButtonStyle.TOKO_STYLE && (context = getContext()) != null) {
                L5().setCheckBoxCheckedColor(C0HEZ.LIZ(R.attr.dt, context));
                I5().setCheckBoxCheckedColor(C0HEZ.LIZ(R.attr.dt, context));
            }
        }
        if (((h) this.LLIZ.getValue()).LLD() == 1) {
            C0H9H.LJFF(8, P5());
        }
        SaveDisplayInfo saveDisplayInfo = c895403ei.LLILLL;
        if (saveDisplayInfo != null && (list2 = saveDisplayInfo.content) != null) {
            saveDisplayInfoContent = (SaveDisplayInfoContent) C13LP.LJJJLL(list2);
        } else {
            saveDisplayInfoContent = null;
        }
        if (C895903en.LIZ() && saveDisplayInfoContent != null && saveDisplayInfoContent.title != null && saveDisplayInfoContent != null && saveDisplayInfoContent.desc != null) {
            C12ES.LJIILL(0, N5());
            C786410Ut5.I7(new AjS40S0200000_1(this, saveDisplayInfoContent, 47), N5());
        } else {
            C0H1U.LIZIZ(N5());
        }
        if (CCDCAddCardLongTextAdjust.LIZ()) {
            TuxTextView tuxTextViewP5 = P5();
            TuxTextView tuxTextViewP52 = P5();
            TuxIconView tuxIconView = this.LLILZIL;
            if (tuxIconView != null) {
                C21370518kB.LIZIZ(tuxIconView, tuxTextViewP52);
                C786410Ut5.Jc(tuxIconView, 0.0f);
                C786410Ut5.ed(tuxIconView, 0.0f);
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                C786410Ut5.a9(tuxIconView, null);
            }
            if (tuxTextViewP52.getPaddingEnd() != 0) {
                tuxTextViewP52.setPaddingRelative(tuxTextViewP52.getPaddingStart(), tuxTextViewP52.getPaddingTop(), 0, tuxTextViewP52.getPaddingBottom());
            }
            View view = this.itemView;
            Object tag = view.getTag(R.id.dkp);
            if ((tag instanceof ViewTreeObserver.OnPreDrawListener) && (onPreDrawListener2 = (ViewTreeObserver.OnPreDrawListener) tag) != null) {
                C786410Ut5.D3(view.getViewTreeObserver(), onPreDrawListener2);
            }
            view.setTag(R.id.dkp, null);
            view.setTouchDelegate(null);
            SaveDisplayInfo saveDisplayInfo2 = c895403ei.LLILLL;
            if (saveDisplayInfo2 != null && (list = saveDisplayInfo2.content) != null) {
                saveDisplayInfoContent2 = (SaveDisplayInfoContent) C13LP.LJJJLL(list);
            } else {
                saveDisplayInfoContent2 = null;
            }
            if (C895903en.LIZ() && saveDisplayInfoContent2 != null && saveDisplayInfoContent2.title != null && saveDisplayInfoContent2.desc != null) {
                C0H1U.LIZIZ(N5());
                AwS402S0200000_1 awS402S0200000_1 = new AwS402S0200000_1(this, saveDisplayInfoContent2, 59);
                int iLIZIZ = C0H9H.LIZIZ(16);
                int iLIZIZ2 = C0H9H.LIZIZ(4);
                TuxIconView tuxIconView2 = this.LLILZIL;
                if (tuxIconView2 != null) {
                    i = 0;
                } else {
                    View view2 = this.itemView;
                    if ((view2 instanceof ConstraintLayout) && (viewGroup = (ViewGroup) view2) != null) {
                        Context context2 = viewGroup.getContext();
                        tuxIconView2 = new TuxIconView(context2, null, 0, 6, null);
                        tuxIconView2.setId(R.id.dkq);
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZ = R.raw.icon_info_circle;
                        c419910GdJ.LIZIZ = iLIZIZ;
                        c419910GdJ.LIZJ = iLIZIZ;
                        c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.a1k, context2);
                        c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
                        tuxIconView2.setTuxIcon(c419910GdJ);
                        tuxIconView2.setClickable(true);
                        tuxIconView2.setFocusable(true);
                        tuxIconView2.setBackground(null);
                        C19ME c19me = new C19ME(iLIZIZ, iLIZIZ);
                        i = 0;
                        c19me.topToTop = 0;
                        c19me.startToStart = 0;
                        viewGroup.addView(tuxIconView2, c19me);
                        this.LLILZIL = tuxIconView2;
                    } else {
                        "ATMSaveNewCardViewHolder root must be ConstraintLayout for trailing-icon anchor".toString();
                        throw new IllegalStateException("ATMSaveNewCardViewHolder root must be ConstraintLayout for trailing-icon anchor");
                    }
                }
                C786410Ut5.LLLLLLZZ(tuxIconView2, i);
                C786410Ut5.a9(tuxIconView2, new ACListenerS136S0100000_1(awS402S0200000_1, 18));
                int i2 = (iLIZIZ2 * 2) + iLIZIZ;
                if (tuxTextViewP5.getPaddingEnd() != i2) {
                    tuxTextViewP5.setPaddingRelative(tuxTextViewP5.getPaddingStart(), tuxTextViewP5.getPaddingTop(), i2, tuxTextViewP5.getPaddingBottom());
                }
                C21370518kB.LIZ(tuxTextViewP5, tuxIconView2, this.itemView, iLIZIZ, iLIZIZ2);
                ViewGroup viewGroup2 = (ViewGroup) this.itemView;
                AwS64S0301000_1 awS64S0301000_1 = new AwS64S0301000_1(tuxIconView2, new Rect(), C0H9H.LIZIZ(40), viewGroup2, 0);
                Object tag2 = viewGroup2.getTag(R.id.dkp);
                if ((tag2 instanceof ViewTreeObserver.OnPreDrawListener) && (onPreDrawListener = (ViewTreeObserver.OnPreDrawListener) tag2) != null) {
                    C786410Ut5.D3(viewGroup2.getViewTreeObserver(), onPreDrawListener);
                }
                C04JU c04ju = new C04JU(awS64S0301000_1, 0);
                C786410Ut5.y3(viewGroup2.getViewTreeObserver(), c04ju);
                viewGroup2.setTag(R.id.dkp, c04ju);
                HandlerHook.viewPost(viewGroup2, new ARunnableS101S0100000_1(awS64S0301000_1, 43));
                C1071804Hc.LIZ(tuxTextViewP5);
            }
        }
        C890103dr c890103dr = C890103dr.LIZ;
        HashMap map = new HashMap();
        map.put("page_name", "atm_card_info");
        if (R5().LLILZ) {
            str = "save";
        } else {
            str = "cancel";
        }
        map.put("button_type", str);
        map.put("pay_bind_status", CardStruct.IStatusCode.DEFAULT);
        c890103dr.getClass();
        C890103dr.LJI("save", map);
        C786410Ut5.I7(new ACListenerS105S0200000_1(this, c895403ei, 10), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        if (CCDCAddCardLongTextAdjust.LIZ()) {
            return C0H1U.LIZJ(R.layout.ahr, viewGroup, false);
        }
        return C0H1U.LIZJ(R.layout.ahq, viewGroup, false);
    }
}
