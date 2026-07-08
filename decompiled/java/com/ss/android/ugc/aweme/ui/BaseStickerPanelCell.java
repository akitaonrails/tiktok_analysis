package com.ss.android.ugc.aweme.ui;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C03K6;
import X.C05YD;
import X.C0I0B;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C13LE;
import X.C1419705h5;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C449750HkL;
import X.C450990HmL;
import X.C451010HmN;
import X.C451510HnB;
import X.C451550HnF;
import X.C452070Ho5;
import X.C452080Ho6;
import X.C452501pT;
import X.C454640HsE;
import X.C456970Hvz;
import X.C457760HxG;
import X.C497820Jfg;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C737910Sx3;
import X.C814420VxA;
import X.EnumC2211841BhW;
import X.EnumC451500HnA;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC444050Hb9;
import X.InterfaceC451590HnJ;
import X.InterfaceC453640Hqc;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.ss.android.ugc.aweme.emoji.common.emojipagev2.EmojiPanelShowingStateVM;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.IMStickerPanelEventViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.viewmodel.StickerPanelAssemViewModel;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseStickerPanelCell<T extends InterfaceC1891350zJl> extends PowerCell<T> implements InterfaceC724530SbT {
    public static final C451550HnF LLILZLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static Integer LLIZLLLIL;
    public static String LLJ;
    public final AssemVMLazy LL;
    public final AssemVMLazy LLILLJJLI;
    public final C736950SvV LLILLL;
    public C451010HmN LLILZ;
    public int LLILZIL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0HnF] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BaseStickerPanelCell.class, "emojiPanelShowingStateVM", "getEmojiPanelShowingStateVM()Lcom/ss/android/ugc/aweme/emoji/common/emojipagev2/EmojiPanelShowingStateVM;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(BaseStickerPanelCell.class, "stickerPanelAssemViewModel", "getStickerPanelAssemViewModel()Lcom/ss/android/ugc/aweme/viewmodel/StickerPanelAssemViewModel;", 0)};
        LLILZLL = new Object() { // from class: X.0HnF
        };
    }

    public abstract int I5();

    public abstract void LJJJJLI();

    public abstract C449750HkL T5();

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public void onCreate() {
        super.onCreate();
        C736680Sv4.LJIIIIZZ(this, L5(), new C2217381BqS() { // from class: X.0HnC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C451530HnD) obj).LL);
            }
        }, C736820SvI.LIZLLL(), new AwS620S0100000_6(this, 89), 4);
        C736680Sv4.LJIIIIZZ(this, L5(), new C2217381BqS() { // from class: X.0HnE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C451530HnD) obj).LL);
            }
        }, null, new AwS620S0100000_6(this, 90), 6);
        C736680Sv4.LJIIIIZZ(this, R5(), new C2217381BqS() { // from class: X.0HkU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C443860Haq) obj).LLILZIL;
            }
        }, C736820SvI.LIZLLL(), new AwS620S0100000_6(this, 91), 4);
    }

    public BaseStickerPanelCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EmojiPanelShowingStateVM.class);
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(c19719912DlLIZ, 806);
        AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(369);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy = new AssemVMLazy(new AwS550S0100000_6(c19719912DlLIZ, 793), awS550S0100000_6, AFwS192S0000000_6.get$arr$(348), new AwS550S0100000_6((C03K6) this, 783), new AwS550S0100000_6((C03K6) this, 794), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) this, 797), aFwS236S0000000_6, new AwS550S0100000_6((C03K6) this, 800), null, new AwS550S0100000_6((C03K6) this, 803));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS550S0100000_6 awS550S0100000_62 = new AwS550S0100000_6((C03K6) this, 779);
            AwS550S0100000_6 awS550S0100000_63 = new AwS550S0100000_6((HasDefaultViewModelProviderFactory) this, 781);
            AwS550S0100000_6 awS550S0100000_64 = new AwS550S0100000_6(c19719912DlLIZ, 784);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS407S0200000_6((InterfaceC451590HnJ) obj, awS550S0100000_62, 41));
            AwS550S0100000_6 awS550S0100000_65 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 789);
            AwS550S0100000_6 awS550S0100000_66 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 792);
            AwS550S0100000_6 awS550S0100000_67 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 795);
            AwS550S0100000_6 awS550S0100000_68 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 798);
            AwS550S0100000_6 awS550S0100000_69 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 801);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS550S0100000_64, awS550S0100000_6, new C452080Ho6(), awS550S0100000_65, awS550S0100000_66, awS550S0100000_63, aFwS236S0000000_6, awS550S0100000_67, awS550S0100000_68, awS550S0100000_69);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS550S0100000_6(c19719912DlLIZ, 804), awS550S0100000_6, AFwS192S0000000_6.get$arr$(347), new AwS550S0100000_6((C03K6) this, StrategyCenter.ENABLE_SMART_SERVICE), new AwS550S0100000_6((C03K6) this, 810), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) this, 812), aFwS236S0000000_6, new AwS550S0100000_6((C03K6) this, 814), null, new AwS550S0100000_6((C03K6) this, 816));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS550S0100000_6(c19719912DlLIZ, 817), awS550S0100000_6, AFwS192S0000000_6.get$arr$(343), new AwS550S0100000_6((C03K6) this, 766), new AwS550S0100000_6((C03K6) this, 768), new AwS550S0100000_6((C03K6) this, 771), aFwS236S0000000_6, null, null, new AwS550S0100000_6((C03K6) this, 773));
        }
        this.LL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(StickerPanelAssemViewModel.class);
        AwS550S0100000_6 awS550S0100000_610 = new AwS550S0100000_6(c19719912DlLIZ2, 775);
        AFwS236S0000000_6 aFwS236S0000000_62 = AFwS236S0000000_6.get$arr$(370);
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(new AwS550S0100000_6(c19719912DlLIZ2, 778), awS550S0100000_610, AFwS192S0000000_6.get$arr$(346), new AwS550S0100000_6((C03K6) this, 782), new AwS550S0100000_6((C03K6) this, 785), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) this, 787), aFwS236S0000000_62, new AwS550S0100000_6((C03K6) this, 790), null, new AwS550S0100000_6((C03K6) this, 796));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS550S0100000_6 awS550S0100000_611 = new AwS550S0100000_6((C03K6) this, 799);
            AwS550S0100000_6 awS550S0100000_612 = new AwS550S0100000_6((HasDefaultViewModelProviderFactory) this, 802);
            AwS550S0100000_6 awS550S0100000_613 = new AwS550S0100000_6(c19719912DlLIZ2, 805);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS407S0200000_6((InterfaceC451590HnJ) obj, awS550S0100000_611, 42));
            AwS550S0100000_6 awS550S0100000_614 = new AwS550S0100000_6(c01gwLIZIZ2, (C01GW<C456970Hvz>) 807);
            AwS550S0100000_6 awS550S0100000_615 = new AwS550S0100000_6(c01gwLIZIZ2, (C01GW<C456970Hvz>) 809);
            AwS550S0100000_6 awS550S0100000_616 = new AwS550S0100000_6(c01gwLIZIZ2, (C01GW<C456970Hvz>) 811);
            AwS550S0100000_6 awS550S0100000_617 = new AwS550S0100000_6(c01gwLIZIZ2, (C01GW<C456970Hvz>) 813);
            AwS550S0100000_6 awS550S0100000_618 = new AwS550S0100000_6(c01gwLIZIZ2, (C01GW<C456970Hvz>) 815);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS550S0100000_613, awS550S0100000_610, new C452080Ho6(), awS550S0100000_614, awS550S0100000_615, awS550S0100000_612, aFwS236S0000000_62, awS550S0100000_616, awS550S0100000_617, awS550S0100000_618);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS550S0100000_6(c19719912DlLIZ2, 765), awS550S0100000_610, AFwS192S0000000_6.get$arr$(344), new AwS550S0100000_6((C03K6) this, 769), new AwS550S0100000_6((C03K6) this, 770), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) this, 772), aFwS236S0000000_62, new AwS550S0100000_6((C03K6) this, 774), null, new AwS550S0100000_6((C03K6) this, 776));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS550S0100000_6(c19719912DlLIZ2, 777), awS550S0100000_610, AFwS192S0000000_6.get$arr$(345), new AwS550S0100000_6((C03K6) this, 780), new AwS550S0100000_6((C03K6) this, 786), new AwS550S0100000_6((C03K6) this, 788), aFwS236S0000000_62, null, null, new AwS550S0100000_6((C03K6) this, 791));
        }
        this.LLILLJJLI = assemVMLazy2;
        AwS550S0100000_6 awS550S0100000_619 = new AwS550S0100000_6((BaseStickerPanelCell) this, 767);
        this.LLILLL = new C736950SvV(C13LE.LIZ(IMStickerPanelEventViewModel.class), awS550S0100000_619, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS236S0000000_6.get$arr$(371), null, null, null);
        int iLIZIZ = C497820Jfg.LIZIZ(this.itemView.getContext());
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(16.0f)));
        IMHostApi.LIZ.getClass();
        IMHostApi iMHostApiLIZ = C1419705h5.LIZ();
        if (iMHostApiLIZ != null) {
            iMHostApiLIZ.LIZ();
        }
        this.LLILZ = C450990HmL.LIZ(iLIZIZ, iLIZIZ2);
    }

    public final EmojiPanelShowingStateVM L5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        return (EmojiPanelShowingStateVM) assemVMLazy.getValue();
    }

    public final IMStickerPanelEventViewModel P5() {
        return (IMStickerPanelEventViewModel) this.LLILLL.getValue();
    }

    public final StickerPanelAssemViewModel R5() {
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        return (StickerPanelAssemViewModel) assemVMLazy.getValue();
    }

    public final EnumC451500HnA N5() {
        switch (I5()) {
            case 5:
                return EnumC451500HnA.EMOJI;
            case 6:
            default:
                return null;
            case 7:
                return EnumC451500HnA.FAVOURITES;
            case 8:
                return EnumC451500HnA.GIF;
            case BdTuring.TYPE_ECAF /* 9 */:
                return EnumC451500HnA.STICKER_SET;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return EnumC451500HnA.AIMOJI;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return EnumC451500HnA.AISELF;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return EnumC451500HnA.STREAK_STICKER;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return EnumC451500HnA.POPULAR;
        }
    }

    public void S5() {
        String strInvoke;
        Integer numValueOf;
        if (R5().wQ2().LLJILJILJ) {
            InterfaceC444050Hb9 interfaceC444050Hb9BQ2 = R5().BQ2();
            String str = R5().LLILLL;
            StickerPanelAssemViewModel stickerPanelAssemViewModelR5 = R5();
            Function0<String> function0 = stickerPanelAssemViewModelR5.wQ2().LLLFZ;
            if (function0 == null || (strInvoke = function0.invoke()) == null) {
                strInvoke = stickerPanelAssemViewModelR5.wQ2().LLJ;
            }
            String str2 = null;
            if (interfaceC444050Hb9BQ2 != null && (numValueOf = Integer.valueOf(interfaceC444050Hb9BQ2.LIZJ())) != null) {
                if (numValueOf.intValue() == 5) {
                    str2 = "emoji";
                } else if (numValueOf.intValue() == 8) {
                    str2 = "giphy";
                } else if (numValueOf.intValue() == 7) {
                    str2 = "favourites";
                } else if (numValueOf.intValue() == 9) {
                    str2 = "set";
                } else if (numValueOf.intValue() == 10) {
                    str2 = "aimoji";
                } else if (numValueOf.intValue() == 13) {
                    str2 = "popular_sticker";
                }
            }
            C454640HsE c454640HsE = IMStickerApi.LIZ;
            c454640HsE.LIZIZ().getImStickerAnalytics().LJIIL(strInvoke, str, str2, String.valueOf(c454640HsE.LIZIZ().getImStickerInputPanelService().LIZIZ(interfaceC444050Hb9BQ2)), C0I0B.LJFF.LIZIZ());
        }
    }

    public final void V5() {
        EnumC451500HnA enumC451500HnAN5 = N5();
        if (enumC451500HnAN5 == null) {
            return;
        }
        InterfaceC444050Hb9 interfaceC444050Hb9BQ2 = R5().BQ2();
        Integer numValueOf = interfaceC444050Hb9BQ2 != null ? Integer.valueOf(interfaceC444050Hb9BQ2.LIZJ()) : null;
        int iI5 = I5();
        if (numValueOf == null || numValueOf.intValue() != iI5) {
            return;
        }
        String str = R5().LLILLL;
        if (!(Intrinsics.LJFF(numValueOf, LLIZLLLIL) && Intrinsics.LJFF(str, LLJ)) && R5().wQ2().LLJILJILJ) {
            U5(enumC451500HnAN5, str);
            LLIZLLLIL = numValueOf;
            LLJ = str;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void dispatchStart() {
        super.dispatchStart();
        DurationPerfMon.LIZ.LIZIZ(T5(), true);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onItemViewCreated() {
        super.onItemViewCreated();
        IMStickerApi.LIZ.getClass();
        if (C457760HxG.LIZIZ(true)) {
            C2211631BhB.LJ(this.itemView, new C451510HnB(true, false, 0.5f, 500, EnumC2211841BhW.NORMAL, null, null, this));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public void onResume(boolean z) {
        super.onResume(z);
        V5();
        if (!z) {
            LJJJJLI();
        }
    }

    public void U5(EnumC451500HnA enumC451500HnA, String str) {
        Boolean value;
        C05YD<Boolean> c05ydLJIIL;
        IMStickerApi iMStickerApiLIZIZ = IMStickerApi.LIZ.LIZIZ();
        InterfaceC453640Hqc imStickerAnalytics = iMStickerApiLIZIZ.getImStickerAnalytics();
        String strYQ2 = R5().yQ2();
        if (strYQ2 != null && enumC451500HnA == EnumC451500HnA.AIMOJI && (c05ydLJIIL = iMStickerApiLIZIZ.getImAvatarDuoService().LJIIL(strYQ2)) != null) {
            value = c05ydLJIIL.getValue();
        } else {
            value = null;
        }
        imStickerAnalytics.LJJIFFI("chat", str, enumC451500HnA, null, null, value, C0I0B.LJFF.LIZIZ());
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
