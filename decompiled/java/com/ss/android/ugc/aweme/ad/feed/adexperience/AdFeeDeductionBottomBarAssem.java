package com.ss.android.ugc.aweme.ad.feed.adexperience;

import X.C01GW;
import X.C04S4;
import X.C0DT0;
import X.C0PEM;
import X.C1003300cDQ;
import X.C12ES;
import X.C13IQ;
import X.C13LE;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C19EG;
import X.C1DFH;
import X.C2107308Nj;
import X.C2217381BqS;
import X.C23250099c;
import X.C704210Rjn;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC700430Rdh;
import X.InterfaceC1554640qYg;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import Y.ACListenerS82S0300000_16;
import Y.ATListenerS335S0200000_6;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ability.pid.IPidAbility;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commercialize.model.AdDisclaimer;
import com.ss.android.ugc.aweme.commercialize.model.DisclaimerText;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol;
import com.ss.android.ugc.aweme.feed.assem.story.FeedStoryTagAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AFwS287S0000000_4;
import kotlin.jvm.internal.AFwS300S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS67S1000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class AdFeeDeductionBottomBarAssem extends BaseCellSlotComponent<AdFeeDeductionBottomBarAssem> implements IAdDeductionAbility, IPidAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public ViewGroup LLJLLIL;
    public final InterfaceC1731706qJ LLJLLL;
    public final C01GW LLJZ;
    public final List<Runnable> LLJZIJLIL;
    public final AdFeeDeductionBottomBarAssem$descExpandModeProtocol$1 LLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AdFeeDeductionBottomBarAssem.class, "adFeeDeductionBottomVM", "getAdFeeDeductionBottomVM()Lcom/ss/android/ugc/aweme/ad/feed/adexperience/AdFeeDeductionBottomVM;", 0);
        C13LE.LIZ.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.ss.android.ugc.aweme.ad.feed.adexperience.AdFeeDeductionBottomBarAssem$descExpandModeProtocol$1] */
    public AdFeeDeductionBottomBarAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AdFeeDeductionBottomVM.class);
        this.LLJLLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 55), null, AFwS252S0000000_16.get$arr$(74));
        this.LLJZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS252S0000000_16.get$arr$(75));
        this.LLJZIJLIL = new ArrayList();
        this.LLL = new DescExpandModeProtocol() { // from class: com.ss.android.ugc.aweme.ad.feed.adexperience.AdFeeDeductionBottomBarAssem$descExpandModeProtocol$1
        };
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b4w;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == 762396125 || iHashCode == 1742177753) {
            return this;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.IAdDeductionAbility
    public final void GH2() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        ViewGroup viewGroup = this.LLJLLIL;
        if (viewGroup != null) {
            int i = AdFeeDeductionBottomBarAssemTrigger.LLJL;
            if (C704210Rjn.LIZIZ(aweme)) {
                C786410Ut5.LJLZ(0, viewGroup);
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C0DT0(this, null), 2);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    public final boolean tp() {
        if (((Boolean) C04S4.LIZ.getValue()).booleanValue()) {
            return true;
        }
        return this instanceof FeedStoryTagAssem;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        ((ArrayList) this.LLJZIJLIL).clear();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), DescExpandModeProtocol.class, C1697810uHb.LJIILJJIL(this.LLL));
    }

    @Override // com.ss.android.ugc.aweme.ability.pid.IPidAbility
    public final void ex0(String str) {
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJLLL.getValue(this, LLLF[0]);
        assemViewModel.getClass();
        assemViewModel.setState(new AwS67S1000000_16(str, 38));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.a8v);
        this.LLJLLIL = viewGroup;
        if (viewGroup != null) {
            setComponentClickStatusExperimental(viewGroup, EnumC700430Rdh.POSITIVE);
        }
        View viewFindViewById = view.findViewById(R.id.hrx);
        if (viewFindViewById != null) {
            viewFindViewById.setTextAlignment(5);
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(this, LLLF[0]), new C2217381BqS() { // from class: X.0cDO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C231700ux) obj).LL;
            }
        }, C736820SvI.LJ(), AFwS300S0000000_16.get$arr$(0), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZ.getValue(), new C2217381BqS() { // from class: X.0cDP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, C736820SvI.LJ(), AFwS300S0000000_16.get$arr$(1), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZ.getValue(), new C2217381BqS() { // from class: X.0cDM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, C736820SvI.LJ(), AFwS287S0000000_4.get$arr$(5), 4);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        C19EG activity;
        AdDisclaimer disclaimer;
        AdDisclaimer disclaimer2;
        List<String> list;
        VideoItemParams videoItemParams2 = videoItemParams;
        Aweme aweme = videoItemParams2.getAweme();
        Fragment fragment = videoItemParams2.fragment;
        String str = null;
        if (fragment != null) {
            activity = fragment.getActivity();
        } else {
            activity = null;
        }
        ViewGroup viewGroup = this.LLJLLIL;
        if (viewGroup != null) {
            C786410Ut5.K7(viewGroup, null);
            int i = AdFeeDeductionBottomBarAssemTrigger.LLJL;
            if (C704210Rjn.LIZIZ(aweme)) {
                C786410Ut5.LJLZ(0, viewGroup);
                ViewGroup viewGroup2 = this.LLJLLIL;
                List<Runnable> list2 = this.LLJZIJLIL;
                if (activity != null && viewGroup2 != null) {
                    TuxTextView tuxTextView = (TuxTextView) viewGroup2.findViewById(R.id.hrx);
                    TuxIconView tuxIconView = (TuxIconView) viewGroup2.findViewById(R.id.hry);
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    if (awemeRawAd != null && (disclaimer = awemeRawAd.getDisclaimer()) != null) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) tuxTextView.getLayoutParams();
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) tuxIconView.getLayoutParams();
                        int i2 = disclaimer.type;
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 == 3) {
                                    layoutParams.topMargin = (int) C12ES.LIZJ(10.0f, activity);
                                    layoutParams.bottomMargin = (int) C12ES.LIZJ(10.0f, activity);
                                    layoutParams2.topMargin = (int) C12ES.LIZJ(10.0f, activity);
                                    AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                                    if (awemeRawAd2 != null && (disclaimer2 = awemeRawAd2.getDisclaimer()) != null && (list = disclaimer2.pidList) != null) {
                                        str = (String) ListProtector.get(list, 0);
                                    }
                                    C1003300cDQ.LIZIZ(aweme, activity, viewGroup2, str, true, list2);
                                }
                            } else {
                                layoutParams.topMargin = (int) C12ES.LIZJ(12.0f, activity);
                                layoutParams2.topMargin = (int) C12ES.LIZJ(12.0f, activity);
                                viewGroup2.setBackgroundColor(C960203pA.LIZ(R.attr.e4, activity));
                                tuxTextView.setTuxFont(62);
                                tuxIconView.setTintColorRes(R.attr.zi);
                                List<DisclaimerText> list3 = disclaimer.textList;
                                if (list3 != null) {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                    for (DisclaimerText disclaimerText : list3) {
                                        String str2 = disclaimerText.text;
                                        int i3 = disclaimerText.type;
                                        if (i3 == 0) {
                                            spannableStringBuilder.append((CharSequence) str2);
                                        } else if (i3 == 1) {
                                            final ACListenerS82S0300000_16 aCListenerS82S0300000_16 = new ACListenerS82S0300000_16(aweme, disclaimerText, activity, 14);
                                            final Context context = viewGroup2.getContext();
                                            ClickableSpan clickableSpan = new ClickableSpan(context, aCListenerS82S0300000_16) { // from class: X.0cCz
                                                public final View.OnClickListener LL;
                                                public final Context LLILLJJLI;

                                                @Override // android.text.style.ClickableSpan
                                                public final void onClick(View view) {
                                                    this.LL.onClick(view);
                                                }

                                                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                                public final void updateDrawState(TextPaint textPaint) {
                                                    textPaint.setColor(C960203pA.LIZ(R.attr.zi, this.LLILLJJLI));
                                                }

                                                {
                                                    this.LL = aCListenerS82S0300000_16;
                                                    this.LLILLJJLI = context;
                                                }
                                            };
                                            int length = spannableStringBuilder.length();
                                            spannableStringBuilder.append((CharSequence) str2);
                                            C786410Ut5.q2(spannableStringBuilder, clickableSpan, length, str2.length() + length, 17);
                                        }
                                    }
                                    tuxTextView.setText(spannableStringBuilder);
                                    tuxTextView.setOnTouchListener(new ATListenerS335S0200000_6(spannableStringBuilder, tuxTextView, 2));
                                }
                            }
                        } else {
                            tuxTextView.setText(disclaimer.pureText);
                            viewGroup2.setBackgroundColor(0);
                            tuxIconView.setTintColorRes(R.attr.ef);
                            layoutParams.topMargin = (int) C12ES.LIZJ(0.0f, activity);
                            layoutParams2.topMargin = (int) C12ES.LIZJ(0.0f, activity);
                        }
                        C786410Ut5.R6(tuxTextView, layoutParams);
                        C786410Ut5.M6(tuxIconView, layoutParams2);
                        return;
                    }
                    return;
                }
                return;
            }
            if (C704210Rjn.LIZ(aweme)) {
                AwemeCommerceStruct commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
                if (commerceVideoAuthInfo == null || commerceVideoAuthInfo.getDarkPostStatus() != 1) {
                    return;
                }
                C786410Ut5.LJLZ(8, viewGroup);
                return;
            }
            ViewGroup viewGroup3 = this.LLJLLIL;
            if (viewGroup3 == null) {
                return;
            }
            C786410Ut5.LJLZ(8, viewGroup3);
        }
    }
}
