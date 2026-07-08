package com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.sea.view;

import X.AbstractC468201s0;
import X.C01D1;
import X.C03B0;
import X.C03C8;
import X.C03MU;
import X.C03MY;
import X.C03T6;
import X.C03XN;
import X.C03XO;
import X.C10515049h;
import X.C1308910kAL;
import X.C1326790kdB;
import X.C13LE;
import X.C1637806bA;
import X.C1744700vVE;
import X.C1748720vbi;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2262851Dhb;
import X.C2262861Dhc;
import X.C2262981Dho;
import X.C2262991Dhp;
import X.C418440Gaw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C812503Fj;
import X.C833003Ng;
import X.C833103Nh;
import X.C833303Nj;
import X.C948003nC;
import X.C990603u4;
import X.EnumC036000As;
import X.InterfaceC2217461Bqa;
import Y.AAListenerS327S0100000_16;
import Y.ALAdapterS3S0100000_6;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.CountDownTimer;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.OspBottomViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.base.BaseOspBottomWidget;
import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.sea.view.SeaOspBottomWidget;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BonusInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PlatformPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import irm.AkS100S0100000_35;
import irm.AkS19S0000000_35;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS401S0200000_35;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS436S0200000_35;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.AwS649S0100000_35;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import p8b.c;

/* JADX INFO: loaded from: classes36.dex */
public final class SeaOspBottomWidget extends BaseOspBottomWidget implements c {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public C03XO LLJJIJIL;
    public TuxTextView LLJJJ;
    public TuxTextView LLJJJIL;
    public TuxTextView LLJJJJ;
    public C03MU LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public LinearLayout LLJJL;
    public TuxIconView LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public final AssemVMLazy LLJLILLLLZIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SeaOspBottomWidget.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/bottom/OspBottomViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SeaOspBottomWidget() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OspBottomViewModel.class);
        this.LLJLILLLLZIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 167), AFwS283S0000000_35.get$arr$(24), null, true);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.base.BaseOspBottomWidget, com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.avt;
    }

    @Override // p8b.c
    public final String getViewName() {
        return "OrderSubmitBottomAssemWidget";
    }

    public final OspBottomViewModel lp() {
        AssemVMLazy assemVMLazy = this.LLJLILLLLZIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLL;
        return (OspBottomViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.base.BaseOspBottomWidget, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C812503Fj.LIZ.getClass();
        ((LinkedHashMap) C812503Fj.LIZIZ).clear();
        C990603u4.LIZ.getClass();
        C990603u4.LIZJ = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.CharSequence kp(X.C2262861Dhc r4) {
        /*
            java.lang.String r3 = r4.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.base.common.model.Price r2 = r4.LIZJ
            java.lang.Integer r0 = r4.LIZLLL
            if (r0 == 0) goto L15
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L15
        Lf:
            r0 = 0
            java.lang.CharSequence r0 = X.C038O.LIZ(r3, r2, r0, r1)
            return r0
        L15:
            r1 = 0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.sea.view.SeaOspBottomWidget.kp(X.1Dhc):java.lang.CharSequence");
    }

    public final void mp(C833303Nj c833303Nj) {
        Integer numLIZJ;
        Integer numLIZJ2;
        if (c833303Nj == null) {
            return;
        }
        View viewFindViewById = LJJIJL().findViewById(R.id.fyx);
        if (viewFindViewById != null) {
            Integer num = c833303Nj.LIZJ;
            if (num != null) {
                C1744700vVE.LJIIIIZZ(num.intValue(), viewFindViewById);
            }
            Integer num2 = c833303Nj.LIZIZ;
            if (num2 != null) {
                int iIntValue = num2.intValue();
                Context context = viewFindViewById.getContext();
                if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(iIntValue, context)) != null) {
                    viewFindViewById.setBackgroundColor(numLIZJ2.intValue());
                }
            }
        }
        Integer num3 = c833303Nj.LIZ;
        if (num3 != null) {
            int iIntValue2 = num3.intValue();
            Context context2 = getContext();
            if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(iIntValue2, context2)) != null) {
                LJJIJL().setBackgroundColor(numLIZJ.intValue());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.base.BaseOspBottomWidget, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C03MU c03mu;
        super.onViewCreated(view);
        this.LLJJIJIL = (C03XO) view.findViewById(R.id.cbf);
        this.LLJJJ = (TuxTextView) view.findViewById(R.id.total_title);
        this.LLJJJIL = (TuxTextView) view.findViewById(R.id.total_price);
        this.LLJJJJ = (TuxTextView) view.findViewById(R.id.rsz);
        this.LLJJJJJIL = (C03MU) view.findViewById(R.id.qks);
        this.LLJJJJLIIL = (TuxTextView) view.findViewById(R.id.bottom_notice);
        this.LLJJL = (LinearLayout) view.findViewById(R.id.rt0);
        this.LLJJLIIIJLLLLLLLZ = (TuxIconView) view.findViewById(R.id.rtk);
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.1Dhf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2262851Dhb) obj).LL;
            }
        }, null, new AwS649S0100000_35(this, 4), 6);
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.1Dhg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2262851Dhb) obj).LLILLJJLI;
            }
        }, null, new AwS649S0100000_35(this, 5), 6);
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.1Dhh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2262851Dhb) obj).LLILLL;
            }
        }, null, new AwS649S0100000_35(this, 6), 6);
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.1Dhi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2262851Dhb) obj).LLILZ;
            }
        }, null, new AwS615S0100000_1(this, 18), 6);
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.1Dha
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2262851Dhb) obj).LLILZIL;
            }
        }, null, new AwS649S0100000_35(this, 1), 6);
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.1Dhe
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2262851Dhb) obj).LLILZLL;
            }
        }, null, new AwS649S0100000_35(this, 2), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.042I
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C03JV) obj).LLILZLL);
            }
        }, null, new AwS649S0100000_35(this, 3), 6);
        C948003nC<Boolean> c948003nC = ip().getState().LLJLIL;
        if (c948003nC != null && c948003nC.LIZ.booleanValue() && !this.LLJL) {
            C2262851Dhb state = lp().getState();
            mp(state.LLILZLL);
            op(state.LL);
            up(state.LLILLJJLI);
            tp(state.LLILLL);
            C03MY c03my = state.LLILZ;
            if (c03my != null && (c03mu = this.LLJJJJJIL) != null) {
                c03mu.LIZJ(c03my, lp(), ip());
            }
            sp(state.LLILZIL);
            this.LLJL = true;
        }
    }

    public final void op(C03XN c03xn) {
        C03XO c03xo;
        int i;
        C833003Ng c833003Ng;
        C03XO c03xo2 = this.LLJJIJIL;
        if (c03xo2 != null) {
            if (c03xn != null && (c833003Ng = c03xn.LIZ) != null && c833003Ng.LIZ) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, c03xo2);
        }
        C03XO c03xo3 = this.LLJJIJIL;
        if (c03xo3 != null && c03xo3.getVisibility() == 0 && c03xn != null && (c03xo = this.LLJJIJIL) != null) {
            c03xo.LIZ(c03xn, ip());
        }
    }

    public final void sp(C833103Nh c833103Nh) {
        TuxTextView tuxTextView;
        ECRichText eCRichText;
        String str;
        int i;
        C833003Ng c833003Ng;
        TuxTextView tuxTextView2 = this.LLJJJJLIIL;
        if (tuxTextView2 != null) {
            if (c833103Nh != null && (c833003Ng = c833103Nh.LIZ) != null && c833003Ng.LIZ) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, tuxTextView2);
        }
        TuxTextView tuxTextView3 = this.LLJJJJLIIL;
        if (tuxTextView3 != null && tuxTextView3.getVisibility() == 0 && (tuxTextView = this.LLJJJJLIIL) != null) {
            if (c833103Nh != null) {
                eCRichText = c833103Nh.LIZIZ;
                str = c833103Nh.LIZJ;
                if (str == null) {
                }
                C03C8.LIZJ(tuxTextView, eCRichText, str, null);
            }
            eCRichText = null;
            str = "osp_tips";
            C03C8.LIZJ(tuxTextView, eCRichText, str, null);
        }
    }

    public final void tp(final C2262861Dhc c2262861Dhc) {
        int i;
        int iIntValue;
        int i2;
        final View view;
        Icon icon;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel;
        BillInfoData billInfoData;
        PlatformPromotion platformPromotion;
        BonusInfo bonusInfo;
        int i3;
        int iIntValue2;
        if (c2262861Dhc != null) {
            TuxTextView tuxTextView = this.LLJJJIL;
            if (tuxTextView != null) {
                C833003Ng c833003Ng = c2262861Dhc.LIZ;
                if (c833003Ng != null && c833003Ng.LIZ) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                C786410Ut5.LJLLLLLL(i3, tuxTextView);
                Integer num = c2262861Dhc.LJ;
                if (num != null) {
                    iIntValue2 = num.intValue();
                } else {
                    iIntValue2 = 32;
                }
                tuxTextView.setTuxFont(iIntValue2);
                Integer num2 = c2262861Dhc.LJFF;
                if (num2 != null) {
                    tuxTextView.setTextColorRes(num2.intValue());
                }
            }
            Boolean bool = c2262861Dhc.LJIIIZ;
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.LJFF(bool, bool2)) {
                C990603u4 c990603u4 = C990603u4.LIZ;
                final OspBottomViewModel ospBottomViewModelLp = lp();
                final Context context = getContext();
                final TuxTextView tuxTextView2 = this.LLJJJIL;
                C03T6 c03t6 = ip().W;
                final ViewGroup viewGroup = null;
                if (c03t6 != null) {
                    view = c03t6.LIZ.LLLF;
                } else {
                    view = null;
                }
                C03T6 c03t62 = ip().W;
                if (c03t62 != null) {
                    viewGroup = c03t62.LIZ.LLLFF;
                }
                final AwS436S0200000_35 awS436S0200000_35 = new AwS436S0200000_35(this, c2262861Dhc, 73);
                c990603u4.getClass();
                if (context != null && ((icon = C990603u4.LIZIZ) != null || ((orderSubmitAssemViewModel = ospBottomViewModelLp.LLILLL) != null && (billInfoData = orderSubmitAssemViewModel.LLJJI) != null && (platformPromotion = billInfoData.platformPromotion) != null && (bonusInfo = platformPromotion.bonusInfo) != null && (icon = bonusInfo.animationIcon) != null))) {
                    C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                    Image imageRequireImage = icon.requireImage(context);
                    c1326790kdB.getClass();
                    C1326790kdB.LIZLLL(imageRequireImage).LJJII(new AbstractC468201s0() { // from class: X.0GqW
                        @Override // X.InterfaceC1331910klR
                        public final void LIZ(Bitmap bitmap) {
                            int i4;
                            Boolean boolValueOf;
                            ViewGroup.LayoutParams layoutParams;
                            int length;
                            if (bitmap != null) {
                                Context context2 = context;
                                final TuxTextView tuxTextView3 = tuxTextView2;
                                View view2 = view;
                                ViewGroup viewGroup2 = viewGroup;
                                final Function0<Unit> function0 = awS436S0200000_35;
                                OspBottomViewModel ospBottomViewModel = ospBottomViewModelLp;
                                BitmapDrawable bitmapDrawable = new BitmapDrawable(context2.getResources(), bitmap);
                                boolean z = false;
                                if (tuxTextView3 != null) {
                                    List<String> list = ospBottomViewModel.LLJI;
                                    String str = (String) C13LP.LJJJLZIJ(((ArrayList) list).size() - 2, list);
                                    String str2 = (String) C13LP.LJJLIIIJL(ospBottomViewModel.LLJI);
                                    final AwS585S0100000_6 awS585S0100000_6 = new AwS585S0100000_6(tuxTextView3, 436);
                                    if (str != null && str2 != null) {
                                        int i5 = (int) (1200 / ((long) 50));
                                        String strLIZ = C236600vk.LIZ(str);
                                        String strLJJIFFI = u.LJJIFFI(str, strLIZ, "{ani_price}", false);
                                        Long lLIZIZ = C236600vk.LIZIZ(C236600vk.LIZ(str));
                                        Long lLIZIZ2 = C236600vk.LIZIZ(C236600vk.LIZ(str2));
                                        final ArrayList arrayList = new ArrayList();
                                        if (lLIZIZ != null && lLIZIZ2 != null) {
                                            float fLongValue = lLIZIZ.longValue();
                                            if (lLIZIZ2.longValue() - lLIZIZ.longValue() <= 0) {
                                                for (int i6 = 0; i6 < i5; i6++) {
                                                    fLongValue += r17 / ((long) i5);
                                                    String strValueOf = String.valueOf((long) fLongValue);
                                                    ArrayList<Pair> arrayList2 = new ArrayList();
                                                    String string = C13LN.LJLZ(strLIZ).toString();
                                                    int length2 = string.length();
                                                    int i7 = 0;
                                                    for (int i8 = 0; i8 < length2; i8++) {
                                                        char cCharAt = string.charAt(i8);
                                                        if (Character.isDigit(cCharAt)) {
                                                            i7++;
                                                        } else {
                                                            arrayList2.add(new Pair(Integer.valueOf(i7), Character.valueOf(cCharAt)));
                                                        }
                                                    }
                                                    StringBuilder sb = new StringBuilder(strValueOf);
                                                    int i9 = 0;
                                                    for (Pair pair : arrayList2) {
                                                        int iIntValue3 = ((Number) pair.getFirst()).intValue();
                                                        char cCharValue = ((Character) pair.getSecond()).charValue();
                                                        if (iIntValue3 < strValueOf.length() && (length = (sb.length() - iIntValue3) - i9) >= 0 && length <= sb.length()) {
                                                            sb.insert(length, cCharValue);
                                                            i9++;
                                                        }
                                                    }
                                                    arrayList.add(u.LJJIFFI(strLJJIFFI, "{ani_price}", sb.toString(), false));
                                                }
                                            }
                                            z = false;
                                        }
                                        final C118300cf c118300cf = new C118300cf();
                                        if (!arrayList.isEmpty()) {
                                            tuxTextView3.setFontFeatureSettings("tnum");
                                            i4 = 0;
                                            new CountDownTimer() { // from class: X.0GqD
                                                @Override // android.os.CountDownTimer
                                                public final void onFinish() {
                                                    tuxTextView3.setFontFeatureSettings("");
                                                    Function0<Unit> function02 = function0;
                                                    if (function02 != null) {
                                                        function02.invoke();
                                                    }
                                                    cancel();
                                                }

                                                @Override // android.os.CountDownTimer
                                                public final void onTick(long j) {
                                                    if (c118300cf.element < arrayList.size()) {
                                                        if (!a0.LJJJIL((CharSequence) ListProtector.get(arrayList, c118300cf.element))) {
                                                            awS585S0100000_6.invoke((String) ListProtector.get(arrayList, c118300cf.element));
                                                        }
                                                        c118300cf.element++;
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1200L, 50L);
                                                }
                                            }.start();
                                            z = true;
                                        } else {
                                            i4 = 0;
                                        }
                                    } else {
                                        i4 = 0;
                                    }
                                    boolValueOf = Boolean.valueOf(z);
                                } else {
                                    i4 = 0;
                                    boolValueOf = null;
                                }
                                if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                                    int i10 = 0;
                                    do {
                                        C990603u4 c990603u42 = C990603u4.LIZ;
                                        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
                                        long j = ((long) i10) * 130;
                                        c990603u42.getClass();
                                        if (view2 != null && tuxTextView3 != null && viewGroup2 != null && view2.getGlobalVisibleRect(new Rect())) {
                                            SmartImageView smartImageView = new SmartImageView(context2);
                                            if (viewGroup2 instanceof ConstraintLayout) {
                                                C19ME c19me = new C19ME(iLIZIZ, iLIZIZ);
                                                c19me.startToStart = i4;
                                                c19me.topToTop = i4;
                                                layoutParams = c19me;
                                            } else {
                                                layoutParams = new ViewGroup.LayoutParams(iLIZIZ, iLIZIZ);
                                            }
                                            C786410Ut5.G6(smartImageView, layoutParams);
                                            C786410Ut5.LJLLLLLL(8, smartImageView);
                                            smartImageView.setBackground(bitmapDrawable);
                                            smartImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                                            viewGroup2.addView(smartImageView);
                                            Pair pairLIZ = C990603u4.LIZ(view2, viewGroup2);
                                            int iIntValue4 = ((Number) pairLIZ.getFirst()).intValue();
                                            int iIntValue5 = ((Number) pairLIZ.getSecond()).intValue();
                                            C786410Ut5.Tc(smartImageView, smartImageView.getTranslationX() + (iIntValue4 - (iLIZIZ / 2)));
                                            C786410Ut5.td(smartImageView, smartImageView.getTranslationY() + iIntValue5);
                                            int[] iArr = new int[2];
                                            smartImageView.getLocationOnScreen(iArr);
                                            int[] iArr2 = new int[2];
                                            tuxTextView3.getLocationOnScreen(iArr2);
                                            Pair pair2 = new Pair(Integer.valueOf(iArr2[i4] + ((int) (tuxTextView3.getWidth() * 0.125f))), Integer.valueOf(iArr2[1] - iLIZIZ));
                                            int iIntValue6 = ((Number) pair2.getFirst()).intValue();
                                            int iIntValue7 = ((Number) pair2.getSecond()).intValue();
                                            float f = iArr[0];
                                            float f2 = iArr[1];
                                            AwS407S0200000_6 awS407S0200000_6 = new AwS407S0200000_6(smartImageView, viewGroup2, 112);
                                            C786410Ut5.T4(smartImageView, 0.0f);
                                            C786410Ut5.LJLLLLLL(0, smartImageView);
                                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(smartImageView, "alpha", 0.0f, 1.0f);
                                            objectAnimatorOfFloat.setDuration(100L);
                                            Path path = new Path();
                                            path.moveTo(smartImageView.getTranslationX(), smartImageView.getTranslationY());
                                            float f3 = 2;
                                            path.quadTo((smartImageView.getTranslationX() + C814420VxA.LIZIZ(((f + r12) / f3) - ((r9 - f2) * 0.2887f))) - f, ((smartImageView.getTranslationY() + C814420VxA.LIZIZ(((f2 + r9) / f3) + ((r12 - f) * 0.2887f))) - f2) + 10.0f, (smartImageView.getTranslationX() + iIntValue6) - f, (smartImageView.getTranslationY() + iIntValue7) - f2);
                                            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(smartImageView, (Property<SmartImageView, Float>) View.TRANSLATION_X, (Property<SmartImageView, Float>) View.TRANSLATION_Y, path);
                                            objectAnimatorOfFloat2.setDuration(550L);
                                            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(smartImageView, "rotation", 0.0f, -35.0f);
                                            objectAnimatorOfFloat3.setDuration(550L);
                                            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(smartImageView, "alpha", 1.0f, 0.0f);
                                            objectAnimatorOfFloat4.setDuration(100L);
                                            objectAnimatorOfFloat4.setStartDelay(450L);
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setStartDelay(j);
                                            animatorSet.addListener(new ALAdapterS3S0100000_6(awS407S0200000_6, 65));
                                            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
                                            animatorSet.start();
                                        }
                                        i10++;
                                        i4 = 0;
                                    } while (i10 < 6);
                                }
                                if (Intrinsics.LJFF(boolValueOf, Boolean.FALSE)) {
                                    function0.invoke();
                                }
                            }
                        }

                        @Override // X.InterfaceC1331910klR
                        public final void onFailed(Throwable th) {
                            awS436S0200000_35.invoke();
                        }
                    });
                }
            } else {
                final C2262991Dhp c2262991Dhp = c2262861Dhc.LJIIJ;
                if (c2262991Dhp != null) {
                    TuxTextView tuxTextView3 = this.LLJJJIL;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setText(kp(C2262861Dhc.LIZ(c2262861Dhc, c2262991Dhp.LIZIZ)));
                    }
                    int i4 = c2262991Dhp.LIZJ;
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLJJJIL, "translationY", 0.0f, C418440Gaw.LIZIZ(Integer.valueOf(i4)));
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LLJJJIL, "alpha", 1.0f, 0.0f);
                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.LLJJJIL, "translationY", C418440Gaw.LIZIZ(Integer.valueOf(-i4)), 0.0f);
                    ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.LLJJJIL, "alpha", 0.0f, 1.0f);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(375L);
                    animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.setDuration(250L);
                    animatorSet2.playTogether(objectAnimatorOfFloat4, objectAnimatorOfFloat3);
                    animatorSet.addListener(new AAListenerS327S0100000_16(animatorSet2, 15));
                    animatorSet2.addListener(new Animator.AnimatorListener() { // from class: X.1Dhd
                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationCancel(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationRepeat(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                            TuxTextView tuxTextView4 = this.LL.LLJJJIL;
                            if (tuxTextView4 != null) {
                                tuxTextView4.setText(SeaOspBottomWidget.kp(C2262861Dhc.LIZ(c2262861Dhc, c2262991Dhp.LIZ)));
                            }
                        }
                    });
                    animatorSet.start();
                    ip().LLLLZLLIL = Boolean.FALSE;
                } else {
                    TuxTextView tuxTextView4 = this.LLJJJIL;
                    if (tuxTextView4 != null) {
                        tuxTextView4.setText(kp(c2262861Dhc));
                    }
                }
            }
            TuxTextView tuxTextView5 = this.LLJJJJ;
            if (tuxTextView5 != null) {
                if (c2262861Dhc.LJI != null) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                C786410Ut5.LJLLLLLL(i2, tuxTextView5);
            }
            if (c2262861Dhc.LJI == null) {
                this.LLJLIL = false;
                TuxIconView tuxIconView = this.LLJJLIIIJLLLLLLLZ;
                if (tuxIconView != null) {
                    C786410Ut5.LJLLLLLL(8, tuxIconView);
                }
                ip().jT2();
                LinearLayout linearLayout = this.LLJJL;
                if (linearLayout != null) {
                    C786410Ut5.I7(new AkS19S0000000_35(0), linearLayout);
                }
            }
            ECRichText eCRichText = c2262861Dhc.LJI;
            if (eCRichText != null) {
                TuxTextView tuxTextView6 = this.LLJJJJ;
                if (tuxTextView6 != null) {
                    Integer num3 = c2262861Dhc.LJIIIIZZ;
                    if (num3 != null) {
                        iIntValue = num3.intValue();
                    } else {
                        iIntValue = R.attr.e1;
                    }
                    tuxTextView6.setTextColorRes(iIntValue);
                    C03B0 c03b0 = new C03B0(tuxTextView6, "osp_bottom_price_sub_text");
                    C03B0.LIZ(c03b0, eCRichText, null, null, false, null, null, 126);
                    tuxTextView6.setText(c03b0.LIZJ);
                }
                TuxIconView tuxIconView2 = this.LLJJLIIIJLLLLLLLZ;
                if (tuxIconView2 != null) {
                    Integer num4 = c2262861Dhc.LJIIL;
                    int value = EnumC036000As.NO_SAVING.getValue();
                    if (num4 != null && num4.intValue() == value) {
                        i = R.attr.a1j;
                    } else {
                        i = R.attr.a1q;
                    }
                    tuxIconView2.setTintColorRes(i);
                }
                if (Intrinsics.LJFF(c2262861Dhc.LJIIJJI, bool2)) {
                    this.LLJLIL = true;
                    TuxIconView tuxIconView3 = this.LLJJLIIIJLLLLLLLZ;
                    if (tuxIconView3 != null) {
                        C786410Ut5.LJLLLLLL(0, tuxIconView3);
                    }
                    LinearLayout linearLayout2 = this.LLJJL;
                    if (linearLayout2 != null) {
                        C786410Ut5.I7(new AkS100S0100000_35(this, 1), linearLayout2);
                    }
                    TuxTextView tuxTextView7 = this.LLJJJIL;
                    if (tuxTextView7 != null) {
                        C786410Ut5.I7(new AkS100S0100000_35(this, 2), tuxTextView7);
                        return;
                    }
                    return;
                }
                this.LLJLIL = false;
                TuxIconView tuxIconView4 = this.LLJJLIIIJLLLLLLLZ;
                if (tuxIconView4 != null) {
                    C786410Ut5.LJLLLLLL(8, tuxIconView4);
                }
                ip().jT2();
                LinearLayout linearLayout3 = this.LLJJL;
                if (linearLayout3 != null) {
                    C786410Ut5.I7(new AkS19S0000000_35(1), linearLayout3);
                }
                TuxTextView tuxTextView8 = this.LLJJJIL;
                if (tuxTextView8 == null) {
                    return;
                }
                C786410Ut5.I7(new AkS19S0000000_35(2), tuxTextView8);
            }
        }
    }

    public final void up(C2262981Dho c2262981Dho) {
        int iIntValue;
        if (c2262981Dho != null) {
            TuxTextView tuxTextView = this.LLJJJ;
            if (tuxTextView != null) {
                C833003Ng c833003Ng = c2262981Dho.LIZ;
                int i = 0;
                if (c833003Ng == null || !c833003Ng.LIZ) {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, tuxTextView);
                Integer num = c2262981Dho.LIZJ;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 32;
                }
                tuxTextView.setTuxFont(iIntValue);
                String string = c2262981Dho.LIZIZ;
                if (string == null) {
                    Context context = tuxTextView.getContext();
                    if (context != null) {
                        string = context.getString(2131848100);
                    } else {
                        string = null;
                    }
                }
                tuxTextView.setText(string);
            }
            TuxTextView tuxTextView2 = this.LLJJJ;
            if (tuxTextView2 != null) {
                C1748720vbi.LJFF(tuxTextView2, new C10515049h(), new AwS579S0100000_35(this, 124), new AwS401S0200000_35(this, c2262981Dho, 33));
            }
        }
    }
}
