package com.ss.android.ugc.aweme.poi.quiz.assem;

import X.C01D1;
import X.C01GW;
import X.C0GVX;
import X.C1180600gpO;
import X.C1189060h32;
import X.C1189360h3W;
import X.C1205490hTX;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C197039127h;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2255108sX;
import X.C259800zU;
import X.C337180DJs;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1205570hTf;
import X.InterfaceC1331910klR;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.quiz.assem.PoiQuizHomePageDespAssem;
import com.ss.android.ugc.aweme.poi.quiz.data.CoinCountModel;
import com.ss.android.ugc.aweme.poi.quiz.data.PoiQuizFirstStartStepModel;
import com.ss.android.ugc.aweme.poi.quiz.data.PoiQuizHomePageModel;
import com.ss.android.ugc.aweme.poi.quiz.data.PoiQuizPartialFinishStepModel;
import com.ss.android.ugc.aweme.poi.quiz.data.PoiQuizTitleInfoModel;
import com.ss.android.ugc.aweme.poi.quiz.vm.PoiQuizPageVM;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS667S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import wh6.AbS363S0000000_18;
import wh6.AbS699S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiQuizHomePageDespAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public View LLJI;
    public View LLJIJIL;
    public C1749280vcc LLJILJIL;
    public View LLJILJILJ;
    public TuxTextView LLJILLL;
    public TuxTextView LLJJ;
    public ViewGroup LLJJI;
    public SmartImageView LLJJIII;
    public TuxTextView LLJJIJI;
    public ViewGroup LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public TuxTextView LLJJJ;
    public C197039127h LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiQuizHomePageDespAssem.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/quiz/vm/PoiQuizPageVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiQuizHomePageDespAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiQuizPageVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS556S0100000_12(c19719912DlLIZ, 560), AFwS256S0000000_18.get$arr$(548), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1675));
    }

    public final PoiQuizPageVM Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (PoiQuizPageVM) assemVMLazy.getValue();
    }

    public final void Ho(PoiQuizHomePageModel poiQuizHomePageModel) {
        List<PoiQuizFirstStartStepModel> list = poiQuizHomePageModel.firstStartDescription;
        if (list == null) {
            return;
        }
        int i = 0;
        for (PoiQuizFirstStartStepModel poiQuizFirstStartStepModel : list) {
            int i2 = i + 1;
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.e6g, this.LLJJIJIIJIL, false);
            TextView textView = (TextView) viewTd.findViewById(R.id.tv_step_number);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            textView.setBackground(c384050F3z.LIZ(textView.getContext()));
            TextView textView2 = (TextView) viewTd.findViewById(R.id.tv_step_title);
            TextView textView3 = (TextView) viewTd.findViewById(R.id.tv_step_content);
            textView.setText(String.valueOf(i2));
            String str = "";
            if (textView2 != null) {
                String str2 = poiQuizFirstStartStepModel.title;
                if (str2 == null) {
                    str2 = "";
                }
                textView2.setText(str2);
            }
            if (textView3 != null) {
                String str3 = poiQuizFirstStartStepModel.subTitle;
                if (str3 != null) {
                    str = str3;
                }
                textView3.setText(str);
            }
            if (i != 0) {
                viewTd.setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), 0, 0);
            }
            ViewGroup viewGroup = this.LLJJIJIIJIL;
            if (viewGroup != null) {
                viewGroup.addView(viewTd);
            }
            i = i2;
        }
        TuxTextView tuxTextView = this.LLJJJ;
        if (tuxTextView != null) {
            C337180DJs.LIZ(tuxTextView);
        }
        TuxTextView tuxTextView2 = this.LLJJIJIL;
        if (tuxTextView2 != null) {
            C337180DJs.LIZ(tuxTextView2);
        }
        ViewGroup viewGroup2 = this.LLJJIJIIJIL;
        if (viewGroup2 != null) {
            C337180DJs.LIZJ(viewGroup2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, android.text.SpannableStringBuilder] */
    public final void Jo(PoiQuizHomePageModel poiQuizHomePageModel) {
        String str;
        String str2;
        Integer numValueOf;
        String str3;
        Resources resources;
        Configuration configuration;
        final PoiQuizPartialFinishStepModel poiQuizPartialFinishStepModel = poiQuizHomePageModel.partialFinishDescription;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (poiQuizPartialFinishStepModel != null) {
            str = poiQuizPartialFinishStepModel.firstText;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        if (poiQuizPartialFinishStepModel != null) {
            str2 = poiQuizPartialFinishStepModel.secondText;
        } else {
            str2 = null;
        }
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = new SpannableStringBuilder(strLIZIZ);
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null && (configuration = resources.getConfiguration()) != null) {
            numValueOf = Integer.valueOf(configuration.uiMode & 48);
        } else {
            numValueOf = null;
        }
        if (numValueOf != null && numValueOf.intValue() == 32) {
            if (poiQuizPartialFinishStepModel == null || (str3 = poiQuizPartialFinishStepModel.coinDarkImage) == null) {
                return;
            }
        } else if (poiQuizPartialFinishStepModel == null || (str3 = poiQuizPartialFinishStepModel.coinImage) == null) {
            str3 = "";
        }
        if (str3.length() > 0) {
            C1189360h3W c1189360h3WLIZIZ = new C1180600gpO("poi_quiz", "poi_quiz_coin", null).LIZIZ(str3);
            c1189360h3WLIZIZ.LJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
            c1189360h3WLIZIZ.LIZ.LIZLLL("coinIcon");
            c1189360h3WLIZIZ.LIZ.LJJIIJZLJL(new InterfaceC1331910klR() { // from class: X.0gt3
                @Override // X.InterfaceC1331910klR
                public final void onProgress(float f) {
                }

                @Override // X.InterfaceC1331910klR
                public final void onCanceled() {
                    PoiQuizHomePageDespAssem poiQuizHomePageDespAssem = this.LL;
                    PoiQuizPartialFinishStepModel poiQuizPartialFinishStepModel2 = poiQuizPartialFinishStepModel;
                    SpannableStringBuilder spannableStringBuilder = c259800zU.element;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PoiQuizHomePageDespAssem.LLJJJJ;
                    poiQuizHomePageDespAssem.No(poiQuizPartialFinishStepModel2, spannableStringBuilder, null);
                }

                @Override // X.InterfaceC1331910klR
                public final void LIZ(Bitmap bitmap) {
                    this.LL.No(poiQuizPartialFinishStepModel, c259800zU.element, bitmap);
                }

                @Override // X.InterfaceC1331910klR
                public final void onFailed(Throwable th) {
                    PoiQuizHomePageDespAssem poiQuizHomePageDespAssem = this.LL;
                    PoiQuizPartialFinishStepModel poiQuizPartialFinishStepModel2 = poiQuizPartialFinishStepModel;
                    SpannableStringBuilder spannableStringBuilder = c259800zU.element;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PoiQuizHomePageDespAssem.LLJJJJ;
                    poiQuizHomePageDespAssem.No(poiQuizPartialFinishStepModel2, spannableStringBuilder, null);
                }
            });
        }
    }

    public final void Lo(PoiQuizHomePageModel poiQuizHomePageModel) {
        List listLJJLIIIJILLIZJL;
        Integer numValueOf;
        PoiQuizTitleInfoModel poiQuizTitleInfoModel = poiQuizHomePageModel.titleInfo;
        String str = null;
        if (poiQuizTitleInfoModel != null) {
            str = poiQuizTitleInfoModel.text;
            if (poiQuizTitleInfoModel != null && Intrinsics.LJFF(poiQuizTitleInfoModel.hasCoin, Boolean.TRUE)) {
                ViewGroup viewGroup = this.LLJJI;
                if (viewGroup != null) {
                    C337180DJs.LIZJ(viewGroup);
                }
                if (str != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"{pointNumber}"}, 0, 6)) != null && (numValueOf = Integer.valueOf(listLJJLIIIJILLIZJL.size())) != null) {
                    if (numValueOf.intValue() == 1) {
                        TuxTextView tuxTextView = this.LLJILLL;
                        if (tuxTextView != null) {
                            tuxTextView.setText((CharSequence) ListProtector.get(listLJJLIIIJILLIZJL, 0));
                        }
                        TuxTextView tuxTextView2 = this.LLJILLL;
                        if (tuxTextView2 != null) {
                            C337180DJs.LIZJ(tuxTextView2);
                        }
                        ViewGroup viewGroup2 = this.LLJJI;
                        if (viewGroup2 != null) {
                            C337180DJs.LIZ(viewGroup2);
                        }
                        TuxTextView tuxTextView3 = this.LLJJ;
                        if (tuxTextView3 != null) {
                            C337180DJs.LIZ(tuxTextView3);
                            return;
                        }
                        return;
                    }
                    if (numValueOf.intValue() != 2) {
                        return;
                    }
                    TuxTextView tuxTextView4 = this.LLJJIJI;
                    if (tuxTextView4 != null) {
                        tuxTextView4.setText(String.valueOf(poiQuizTitleInfoModel.coinCount));
                    }
                    String str2 = poiQuizTitleInfoModel.coinImage;
                    if (str2 == null) {
                        str2 = "";
                    }
                    C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str2);
                    c1331670kl3LJIIIZ.LJJ(this.LLJJIII);
                    C786410Ut5.h3(c1331670kl3LJIIIZ);
                    if (((CharSequence) ListProtector.get(listLJJLIIIJILLIZJL, 0)).length() == 0) {
                        TuxTextView tuxTextView5 = this.LLJJ;
                        if (tuxTextView5 != null) {
                            tuxTextView5.setText((CharSequence) ListProtector.get(listLJJLIIIJILLIZJL, 1));
                        }
                        TuxTextView tuxTextView6 = this.LLJJ;
                        if (tuxTextView6 != null) {
                            C337180DJs.LIZJ(tuxTextView6);
                        }
                        TuxTextView tuxTextView7 = this.LLJILLL;
                        if (tuxTextView7 == null) {
                            return;
                        }
                        C337180DJs.LIZ(tuxTextView7);
                        return;
                    }
                    if (((CharSequence) ListProtector.get(listLJJLIIIJILLIZJL, 1)).length() == 0) {
                        TuxTextView tuxTextView8 = this.LLJILLL;
                        if (tuxTextView8 != null) {
                            tuxTextView8.setText((CharSequence) ListProtector.get(listLJJLIIIJILLIZJL, 0));
                        }
                        TuxTextView tuxTextView9 = this.LLJILLL;
                        if (tuxTextView9 != null) {
                            C337180DJs.LIZJ(tuxTextView9);
                        }
                        TuxTextView tuxTextView10 = this.LLJJ;
                        if (tuxTextView10 == null) {
                            return;
                        }
                        C337180DJs.LIZ(tuxTextView10);
                        return;
                    }
                    TuxTextView tuxTextView11 = this.LLJILLL;
                    if (tuxTextView11 != null) {
                        tuxTextView11.setText((CharSequence) ListProtector.get(listLJJLIIIJILLIZJL, 0));
                    }
                    TuxTextView tuxTextView12 = this.LLJJ;
                    if (tuxTextView12 != null) {
                        tuxTextView12.setText((CharSequence) ListProtector.get(listLJJLIIIJILLIZJL, 1));
                    }
                    TuxTextView tuxTextView13 = this.LLJJ;
                    if (tuxTextView13 != null) {
                        C337180DJs.LIZJ(tuxTextView13);
                    }
                    TuxTextView tuxTextView14 = this.LLJILLL;
                    if (tuxTextView14 == null) {
                        return;
                    }
                    C337180DJs.LIZJ(tuxTextView14);
                    return;
                }
                return;
            }
        }
        TuxTextView tuxTextView15 = this.LLJILLL;
        if (tuxTextView15 != null) {
            tuxTextView15.setText(str);
        }
        TuxTextView tuxTextView16 = this.LLJJ;
        if (tuxTextView16 != null) {
            C337180DJs.LIZ(tuxTextView16);
        }
        ViewGroup viewGroup3 = this.LLJJI;
        if (viewGroup3 != null) {
            C337180DJs.LIZ(viewGroup3);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int marginStart;
        int i;
        int marginEnd;
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int marginStart2;
        int i3;
        int marginEnd2;
        int i4;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        String string;
        super.onViewCreated(view);
        this.LLJI = view.findViewById(R.id.r94);
        this.LLJIJIL = view.findViewById(R.id.r90);
        this.LLJILJIL = (C1749280vcc) view.findViewById(R.id.r93);
        this.LLJILJILJ = view.findViewById(R.id.r8w);
        this.LLJILLL = (TuxTextView) view.findViewById(R.id.r92);
        this.LLJJ = (TuxTextView) view.findViewById(R.id.r8z);
        this.LLJJI = (ViewGroup) view.findViewById(R.id.r8v);
        this.LLJJIII = (SmartImageView) view.findViewById(R.id.e3p);
        this.LLJJIJI = (TuxTextView) view.findViewById(R.id.e3i);
        this.LLJJIJIIJIL = (ViewGroup) view.findViewById(R.id.r91);
        this.LLJJIJIL = (TuxTextView) view.findViewById(R.id.r8x);
        this.LLJJJ = (TuxTextView) view.findViewById(R.id.r8y);
        this.LLJJJIL = (C197039127h) view.findViewById(R.id.r8u);
        View view2 = this.LLJI;
        if (view2 != null) {
            C786410Ut5.I7(new AbS363S0000000_18(1), view2);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zq);
            view2.setBackground(c384050F3z.LIZ(view2.getContext()));
        }
        C1749280vcc c1749280vcc = this.LLJILJIL;
        if (c1749280vcc != null) {
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            Context context = getContext();
            if (context == null || (string = context.getString(2131844797)) == null) {
                string = "";
            }
            c1722300uv6.LJI = string;
            c1722300uv6.LJIIIZ = new AwS591S0100000_12(this, 903);
            c1749280vcc.setStatus(c1722300uv6);
        }
        C197039127h c197039127h = this.LLJJJIL;
        if (c197039127h != null) {
            C786410Ut5.I7(new AbS699S0100000_18(this, 46), c197039127h);
            ViewGroup.LayoutParams layoutParams = c197039127h.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginStart2 = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
            } else {
                marginStart2 = 0;
            }
            Integer numValueOf = Integer.valueOf(marginStart2);
            ViewGroup.LayoutParams layoutParams2 = c197039127h.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                i3 = marginLayoutParams4.topMargin;
            } else {
                i3 = 0;
            }
            Integer numValueOf2 = Integer.valueOf(i3);
            ViewGroup.LayoutParams layoutParams3 = c197039127h.getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                marginEnd2 = ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd();
            } else {
                marginEnd2 = 0;
            }
            Integer numValueOf3 = Integer.valueOf(marginEnd2);
            ViewGroup.LayoutParams layoutParams4 = c197039127h.getLayoutParams();
            if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                i4 = marginLayoutParams3.bottomMargin;
            } else {
                i4 = 0;
            }
            C1189060h32.LJJII(c197039127h, numValueOf, numValueOf2, numValueOf3, Integer.valueOf(i4 + ((Number) this.LLJ.getValue()).intValue()));
        }
        View view3 = this.LLJIJIL;
        if (view3 != null) {
            ViewGroup.LayoutParams layoutParams5 = view3.getLayoutParams();
            if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                marginStart = ((ViewGroup.MarginLayoutParams) layoutParams5).getMarginStart();
            } else {
                marginStart = 0;
            }
            Integer numValueOf4 = Integer.valueOf(marginStart);
            ViewGroup.LayoutParams layoutParams6 = view3.getLayoutParams();
            if ((layoutParams6 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams6) != null) {
                i = marginLayoutParams2.topMargin;
            } else {
                i = 0;
            }
            Integer numValueOf5 = Integer.valueOf(i);
            ViewGroup.LayoutParams layoutParams7 = view3.getLayoutParams();
            if (layoutParams7 instanceof ViewGroup.MarginLayoutParams) {
                marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams7).getMarginEnd();
            } else {
                marginEnd = 0;
            }
            Integer numValueOf6 = Integer.valueOf(marginEnd);
            ViewGroup.LayoutParams layoutParams8 = view3.getLayoutParams();
            if ((layoutParams8 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams8) != null) {
                i2 = marginLayoutParams.bottomMargin;
            } else {
                i2 = 0;
            }
            C1189060h32.LJJII(view3, numValueOf4, numValueOf5, numValueOf6, Integer.valueOf(i2 + ((Number) this.LLJ.getValue()).intValue()));
        }
        C736680Sv4.LJIIIZ(this, Go(), new C2217381BqS() { // from class: X.0gmY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1178340glk) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0gmU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1178340glk) obj).LLILLJJLI;
            }
        }, null, new AwS667S0100000_18(this, 30), 12);
        InterfaceC665370Q7z interfaceC665370Q7z = Go().LLIZ;
        if (interfaceC665370Q7z != null) {
            IPoiQuizDespAbility iPoiQuizDespAbility = new IPoiQuizDespAbility() { // from class: com.ss.android.ugc.aweme.poi.quiz.assem.PoiQuizHomePageDespAssem$loadAbility$1
                @Override // com.ss.android.ugc.aweme.poi.quiz.assem.IPoiQuizDespAbility
                public final int getHeight() {
                    View view4 = this.LL.LLJI;
                    if (view4 != null) {
                        return view4.getHeight();
                    }
                    return 0;
                }
            };
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7z, IPoiQuizDespAbility.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7z, iPoiQuizDespAbility, IPoiQuizDespAbility.class, null, null);
                return;
            }
            try {
                InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                if (invocationHandler instanceof C2255108sX) {
                    ((C2255108sX) invocationHandler).LL.add(iPoiQuizDespAbility);
                    return;
                }
                throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                C2255108sX c2255108sX = new C2255108sX();
                c2255108sX.LL.add(iPoiQuizDespAbility);
                c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                Object objNewProxyInstance = Proxy.newProxyInstance(IPoiQuizDespAbility.class.getClassLoader(), new Class[]{IPoiQuizDespAbility.class}, c2255108sX);
                if (objNewProxyInstance != null) {
                    C1558520qew.LJII(interfaceC665370Q7z, (InterfaceC494301wD) objNewProxyInstance, IPoiQuizDespAbility.class, null, null);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.quiz.assem.IPoiQuizDespAbility");
            }
        }
    }

    public final void No(PoiQuizPartialFinishStepModel poiQuizPartialFinishStepModel, SpannableStringBuilder spannableStringBuilder, Bitmap bitmap) {
        ViewGroup viewGroup;
        BitmapDrawable bitmapDrawable;
        List<CoinCountModel> list;
        Resources resources;
        try {
            try {
                Context context = getContext();
                if (context != null && (resources = context.getResources()) != null && bitmap != null) {
                    bitmapDrawable = new BitmapDrawable(resources, bitmap);
                } else {
                    bitmapDrawable = null;
                }
                if (bitmapDrawable != null) {
                    bitmapDrawable.setBounds(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
                }
                if (poiQuizPartialFinishStepModel != null && (list = poiQuizPartialFinishStepModel.coinCountList) != null) {
                    int length = 0;
                    for (CoinCountModel coinCountModel : list) {
                        int iLJJJ = a0.LJJJ(spannableStringBuilder, "{pointNumber}", length, false, 4);
                        if (iLJJJ != -1) {
                            if (bitmapDrawable != null) {
                                C0GVX c0gvx = new C0GVX(bitmapDrawable, 2);
                                spannableStringBuilder.insert(iLJJJ, " ");
                                int i = iLJJJ + 1;
                                C786410Ut5.q2(spannableStringBuilder, c0gvx, iLJJJ, i, 33);
                                iLJJJ = i;
                            }
                            String str = coinCountModel.count;
                            if (str == null) {
                                str = "";
                            }
                            int i2 = iLJJJ + 13;
                            spannableStringBuilder.replace(iLJJJ, i2, (CharSequence) str);
                            C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), iLJJJ, str.length() + iLJJJ, 33);
                            length = str.length() + i2;
                        }
                    }
                }
                TuxTextView tuxTextView = this.LLJJJ;
                if (tuxTextView != null) {
                    C337180DJs.LIZJ(tuxTextView);
                }
                TuxTextView tuxTextView2 = this.LLJJJ;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(spannableStringBuilder);
                }
                TuxTextView tuxTextView3 = this.LLJJIJIL;
                if (tuxTextView3 != null) {
                    C337180DJs.LIZ(tuxTextView3);
                }
                viewGroup = this.LLJJIJIIJIL;
                if (viewGroup == null) {
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1205490hTX c1205490hTX = C1205490hTX.LIZ;
                EnumC1205570hTf enumC1205570hTf = EnumC1205570hTf.POI_QUIZ_HOME_PAGE_ERROR;
                c1205490hTX.getClass();
                C1205490hTX.LIZLLL(enumC1205570hTf, "partially desp", null, e);
                TuxTextView tuxTextView4 = this.LLJJJ;
                if (tuxTextView4 != null) {
                    C337180DJs.LIZJ(tuxTextView4);
                }
                TuxTextView tuxTextView5 = this.LLJJJ;
                if (tuxTextView5 != null) {
                    tuxTextView5.setText(spannableStringBuilder);
                }
                TuxTextView tuxTextView6 = this.LLJJIJIL;
                if (tuxTextView6 != null) {
                    C337180DJs.LIZ(tuxTextView6);
                }
                viewGroup = this.LLJJIJIIJIL;
                if (viewGroup == null) {
                    return;
                }
            }
            C337180DJs.LIZ(viewGroup);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            TuxTextView tuxTextView7 = this.LLJJJ;
            if (tuxTextView7 != null) {
                C337180DJs.LIZJ(tuxTextView7);
            }
            TuxTextView tuxTextView8 = this.LLJJJ;
            if (tuxTextView8 != null) {
                tuxTextView8.setText(spannableStringBuilder);
            }
            TuxTextView tuxTextView9 = this.LLJJIJIL;
            if (tuxTextView9 != null) {
                C337180DJs.LIZ(tuxTextView9);
            }
            ViewGroup viewGroup2 = this.LLJJIJIIJIL;
            if (viewGroup2 != null) {
                C337180DJs.LIZ(viewGroup2);
            }
            throw th;
        }
    }
}
