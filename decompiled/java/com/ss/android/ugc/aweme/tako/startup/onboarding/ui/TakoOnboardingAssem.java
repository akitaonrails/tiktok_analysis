package com.ss.android.ugc.aweme.tako.startup.onboarding.ui;

import X.AnonymousClass0208;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0DSB;
import X.C0DXR;
import X.C0IDH;
import X.C0NQT;
import X.C0PEM;
import X.C0Q4Y;
import X.C104200aO;
import X.C123100dR;
import X.C13LC;
import X.C13LE;
import X.C13LP;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C1857690yRT;
import X.C1857750yRZ;
import X.C1858360ySY;
import X.C1862330yYx;
import X.C1862660yZU;
import X.C1862970yZz;
import X.C1862990ya1;
import X.C1863010ya3;
import X.C1863050ya7;
import X.C1863060ya8;
import X.C1863070ya9;
import X.C1863090yaB;
import X.C1863100yaC;
import X.C1863110yaD;
import X.C1863120yaE;
import X.C1863130yaF;
import X.C1863190yaL;
import X.C1863280yaU;
import X.C1863850ybP;
import X.C1864200yby;
import X.C1954807lC;
import X.C19719912Dl;
import X.C20235214Fq;
import X.C2217381BqS;
import X.C23250099c;
import X.C418440Gaw;
import X.C422230Gh3;
import X.C443380Ha4;
import X.C443390Ha5;
import X.C443430Ha9;
import X.C443440HaA;
import X.C443450HaB;
import X.C443460HaC;
import X.C443470HaD;
import X.C443490HaF;
import X.C452501pT;
import X.C5185020h;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.C844470XAv;
import X.EnumC1862960yZy;
import X.EnumC1863020ya4;
import X.InterfaceC1861530yXf;
import X.InterfaceC1861820yY8;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotItem;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Extra;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.SubConversationConfig;
import com.ss.android.ugc.aweme.tako.ccl.net.TakoOnBoardingResponse;
import com.ss.android.ugc.aweme.tako.ccl.net.TakoOnboardingData;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.startup.onboarding.config.Label;
import com.ss.android.ugc.aweme.tako.startup.onboarding.config.LearnMore;
import com.ss.android.ugc.aweme.tako.startup.onboarding.config.OnBoardingConfig;
import com.ss.android.ugc.aweme.tako.startup.onboarding.ui.TakoOnboardingAssem;
import com.ss.android.ugc.aweme.tako.startup.onboarding.vm.TakoOnboardingViewModel;
import com.ss.android.ugc.aweme.tako.ui.ITakoChatPageAbility;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import com.ss.android.ugc.aweme.tako.vm.TakoFragmentViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.p2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS641S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoOnboardingAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final AssemVMLazy LLJJI;
    public final AssemVMLazy LLJJIII;
    public final C01GW LLJJIJI;
    public EnumC1863020ya4 LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public C422230Gh3 LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoOnboardingAssem.class, "fragmentVM", "getFragmentVM()Lcom/ss/android/ugc/aweme/tako/vm/TakoFragmentViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TakoOnboardingAssem.class, "onboardingVM", "getOnboardingVM()Lcom/ss/android/ugc/aweme/tako/startup/onboarding/vm/TakoOnboardingViewModel;", 0);
        c09r3.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public TakoOnboardingAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoFragmentViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS571S0100000_27(c19719912DlLIZ, 962), AFwS269S0000000_27.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TakoOnboardingViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS571S0100000_27(c19719912DlLIZ2, 963), AFwS269S0000000_27.get$arr$(301), null, true);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 961));
        this.LLJJIJIIJIL = EnumC1863020ya4.VERTICAL;
        this.LLJJIJIL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(209));
        this.LLJJJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 965));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 964));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fql;
    }

    public final IMessageAbility kp() {
        return (IMessageAbility) this.LLJJIJI.getValue();
    }

    public final TakoOnboardingViewModel lp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (TakoOnboardingViewModel) assemVMLazy.getValue();
    }

    public final ITakoContextAbility mp() {
        return (ITakoContextAbility) this.LLJJJ.getValue();
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [X.0yXh, java.lang.Object] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C1862660yZU c1862660yZUJv1;
        String str;
        boolean z;
        Integer numER0;
        boolean z2;
        int i;
        C443430Ha9 c443430Ha9;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        List listLL;
        C443470HaD c443470HaD;
        String str9;
        String str10;
        String str11;
        C443390Ha5 c443390Ha5;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        Label label;
        String str19;
        String str20;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        String str21;
        String str22;
        C13LC<C1863850ybP> c13lcT712;
        C1863850ybP c1863850ybP2;
        C13LC<C1864200yby> c13lcAp0;
        C1864200yby c1864200yby;
        LearnMore learnMore;
        SubConversationConfig subConversationConfigOu;
        super.onViewCreated(view);
        C1862990ya1 c1862990ya1 = C1862990ya1.LIZ;
        boolean zBooleanValue = ((Boolean) this.LLJJIJIL.getValue()).booleanValue();
        c1862990ya1.getClass();
        this.LLJJIJIIJIL = C1862990ya1.LIZ(zBooleanValue);
        ITakoChatPageAbility iTakoChatPageAbility = (ITakoChatPageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoChatPageAbility.class, null);
        if (iTakoChatPageAbility != null) {
            c1862660yZUJv1 = iTakoChatPageAbility.Jv1();
        } else {
            c1862660yZUJv1 = null;
        }
        IMessageAbility iMessageAbilityKp = kp();
        if (iMessageAbilityKp == null || (subConversationConfigOu = iMessageAbilityKp.ou()) == null || (str = subConversationConfigOu.subConversationId) == null) {
            str = C1858360ySY.LIZ.LJFF;
        }
        TakoOnboardingViewModel takoOnboardingViewModelLp = lp();
        int i2 = 0;
        if (c1862660yZUJv1 != null && c1862660yZUJv1.LJII) {
            z = true;
        } else {
            z = false;
        }
        IMessageAbility iMessageAbilityKp2 = kp();
        if (iMessageAbilityKp2 == null || (numER0 = iMessageAbilityKp2.eR0()) == null) {
            numER0 = C1858360ySY.LIZ.LJI;
        }
        IMessageAbility iMessageAbilityKp3 = kp();
        if (iMessageAbilityKp3 != null && iMessageAbilityKp3.DD2(str)) {
            z2 = true;
        } else {
            z2 = false;
        }
        TakoOnboardingViewModel.zQ2(takoOnboardingViewModelLp, z, numER0, z2, false, 8);
        View viewLJJIJL = LJJIJL();
        if (lp().isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewLJJIJL);
        C422230Gh3 c422230Gh3 = (C422230Gh3) view.findViewById(R.id.eqx);
        if (c422230Gh3 != null) {
            c422230Gh3.setDispatchTouchEventListener(new AwS606S0100000_27(this, 276));
        } else {
            c422230Gh3 = null;
        }
        this.LLJJJJ = c422230Gh3;
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.0yaI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1863140yaG) obj).LLILLL);
            }
        }, C736820SvI.LIZLLL(), AnonymousClass0208.get$arr$(33), 4);
        IMessageAbility iMessageAbilityKp4 = kp();
        if (iMessageAbilityKp4 != null) {
            iMessageAbilityKp4.H61(new InterfaceC1861530yXf() { // from class: X.0ya2
                @Override // X.InterfaceC1861530yXf
                public final void LIZ(Message message) {
                }

                @Override // X.InterfaceC1861530yXf
                public final void LIZJ(Message message, int i3, String str23, Map<String, String> map) {
                }

                @Override // X.InterfaceC1861530yXf
                public final void LIZLLL(Message message, int i3, boolean z3, String str23, int i4, String str24, Extra extra, String str25, String str26, Integer num, Integer num2, String str27, String str28, C1862650yZT c1862650yZT, Map map) {
                }

                @Override // X.InterfaceC1861530yXf
                public final void LIZIZ(Message message) {
                    C0CNO.LIZLLL(0L, new AwS571S0100000_27(this.LIZ, 1143));
                }
            });
        }
        String str23 = C1863280yaU.LJIILLIIL;
        final ?? r7 = new InterfaceC1861820yY8() { // from class: X.0yXh
            public boolean LIZ;

            @Override // X.InterfaceC1861820yY8
            public final void LIZIZ() {
                if (this.LIZ) {
                    return;
                }
                this.LIZ = true;
                C1863280yaU.LJIJJ.remove(this);
                TakoOnboardingAssem takoOnboardingAssem = this.LIZIZ;
                takoOnboardingAssem.getClass();
                C0CNO.LIZLLL(0L, new AwS571S0100000_27(takoOnboardingAssem, 1145));
            }

            @Override // X.InterfaceC1861820yY8
            public final void LIZ(int i3) {
                p2.a aVar = p2.LIZ;
                Integer numValueOf = Integer.valueOf(i3);
                aVar.getClass();
                if (p2.a.LIZ(numValueOf) && !this.LIZ) {
                    this.LIZ = true;
                    C1863280yaU.LJIJJ.remove(this);
                    TakoOnboardingAssem takoOnboardingAssem = this.LIZIZ;
                    takoOnboardingAssem.getClass();
                    C0CNO.LIZLLL(0L, new AwS571S0100000_27(takoOnboardingAssem, 1145));
                }
            }
        };
        LifecycleRegistry lifecycle = getLifecycle();
        if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
            C1863280yaU.LJIJJ.add((InterfaceC1861820yY8) r7);
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.tako.base.handlers.MessageOperatorHandler$Companion$addMessageActionObserverList$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1863280yaU.LJIJJ.remove(r7);
                    }
                }
            });
        }
        IMessageAbility iMessageAbilityKp5 = kp();
        if (iMessageAbilityKp5 != null) {
            iMessageAbilityKp5.EG1(new AwS606S0100000_27(this, 373));
        }
        lp().setStateImmediate(new AwS606S0100000_27(this.LLJJIJIIJIL, 377));
        ImageView imageView = (ImageView) LJJIJL().findViewById(R.id.ll4);
        if (imageView != null) {
            C1863130yaF.LIZ.getClass();
            if (C1863130yaF.LIZ()) {
                C0DSB.LIZJ(imageView);
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
                C1857690yRT.LJII(imageView, iLIZIZ, iLIZIZ, false);
            } else {
                C0DSB.LIZIZ(imageView);
            }
        }
        OnBoardingConfig onBoardingConfigLIZ = C1863120yaE.LIZ();
        if (onBoardingConfigLIZ != null && (label = onBoardingConfigLIZ.label) != null) {
            TuxTextView tuxTextView = (TuxTextView) LJJIJL().findViewById(R.id.tv_title_line_1);
            if (tuxTextView != null) {
                String str24 = label.mainTitle1;
                if (str24 != null) {
                    tuxTextView.setText(str24);
                }
                if (this.LLJJIJIIJIL == EnumC1863020ya4.GRID) {
                    tuxTextView.setTuxFont(13);
                }
            }
            TuxTextView tuxTextView2 = (TuxTextView) LJJIJL().findViewById(R.id.tv_title_line_2);
            if (tuxTextView2 != null) {
                String str25 = label.mainTitle2;
                if (str25 != null) {
                    tuxTextView2.setText(str25);
                }
                if (this.LLJJIJIIJIL == EnumC1863020ya4.GRID) {
                    tuxTextView2.setTuxFont(13);
                }
            }
            TuxTextView tuxTextView3 = (TuxTextView) LJJIJL().findViewById(R.id.zpi);
            if (tuxTextView3 != null) {
                EnumC1863020ya4 enumC1863020ya4 = this.LLJJIJIIJIL;
                EnumC1863020ya4 enumC1863020ya42 = EnumC1863020ya4.QUERY_RECOMMEND;
                if (enumC1863020ya4 == enumC1863020ya42) {
                    str19 = label.hintLabelForV4;
                } else {
                    str19 = label.hintLabel;
                }
                if (str19 != null) {
                    tuxTextView3.setText(str19);
                    OnBoardingConfig onBoardingConfigLIZ2 = C1863120yaE.LIZ();
                    if (onBoardingConfigLIZ2 != null && (learnMore = onBoardingConfigLIZ2.learnMore) != null) {
                        str20 = learnMore.url;
                    } else {
                        str20 = null;
                    }
                    C1857690yRT.LIZ(tuxTextView3, null, 62, str20, new AwS571S0100000_27(this, 1144), 1);
                    ITakoContextAbility iTakoContextAbilityMp = mp();
                    if (iTakoContextAbilityMp != null && (c13lcT71 = iTakoContextAbilityMp.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
                        ITakoContextAbility iTakoContextAbilityMp2 = mp();
                        if (iTakoContextAbilityMp2 == null || (c13lcAp0 = iTakoContextAbilityMp2.Ap0()) == null || (c1864200yby = (C1864200yby) c13lcAp0.LIZIZ()) == null || (str21 = c1864200yby.LL) == null) {
                            str21 = "";
                        }
                        ITakoContextAbility iTakoContextAbilityMp3 = mp();
                        if (iTakoContextAbilityMp3 == null || (c13lcT712 = iTakoContextAbilityMp3.T71()) == null || (c1863850ybP2 = (C1863850ybP) c13lcT712.LIZIZ()) == null || (str22 = c1863850ybP2.LLIZ) == null) {
                            str22 = "";
                        }
                        C1862330yYx.LJJLIIIJJI(C1862330yYx.LIZ, c1863850ybP.LL, c1863850ybP.LLILLJJLI, c1863850ybP.LLILZIL, "user_onboarding", "learn_more", str21, str22);
                    }
                }
                if (this.LLJJIJIIJIL == enumC1863020ya42) {
                    C1857750yRZ.LJIILL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), tuxTextView3);
                }
            }
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) LJJIJL().findViewById(R.id.sx7);
        viewOnAttachStateChangeListenerC20604515jv.getState().LIZLLL = C0Q4Y.BUFFER;
        viewOnAttachStateChangeListenerC20604515jv.setTag(R.id.rnd, C1558360qeg.LJ(viewOnAttachStateChangeListenerC20604515jv, null));
        if (this.LLJJIJIIJIL == EnumC1863020ya4.QUERY_RECOMMEND) {
            viewOnAttachStateChangeListenerC20604515jv.setPadding(viewOnAttachStateChangeListenerC20604515jv.getPaddingLeft(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), viewOnAttachStateChangeListenerC20604515jv.getPaddingRight(), viewOnAttachStateChangeListenerC20604515jv.getPaddingBottom());
        }
        EnumC1863020ya4 enumC1863020ya43 = this.LLJJIJIIJIL;
        int[] iArr = C1863010ya3.LIZ;
        int i3 = iArr[enumC1863020ya43.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 == 4) {
                        final Context context = getContext();
                        if (context == null) {
                            C844470XAv.LIZ.getClass();
                            context = C844470XAv.LIZ();
                        }
                        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(context) { // from class: com.ss.android.ugc.aweme.tako.startup.onboarding.ui.TakoOnboardingAssem$initPowerList$6
                            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                            public final boolean canScrollVertically() {
                                return false;
                            }
                        });
                        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                        viewOnAttachStateChangeListenerC20604515jv.setPadding(iLIZIZ2, viewOnAttachStateChangeListenerC20604515jv.getPaddingTop(), iLIZIZ2, viewOnAttachStateChangeListenerC20604515jv.getPaddingBottom());
                        viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C0DXR() { // from class: X.03Ip
                            public final int LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));

                            @Override // X.C0DXR
                            public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                                if (recyclerView.getChildAdapterPosition(view2) != 0) {
                                    rect.top = this.LL;
                                }
                            }
                        });
                        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoOnBoardingQueryCell.class);
                        C422230Gh3 c422230Gh32 = this.LLJJJJ;
                        if (c422230Gh32 != null) {
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c422230Gh32);
                            c422230Gh32.setAlpha(0.0f);
                        }
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    final Context context2 = viewOnAttachStateChangeListenerC20604515jv.getContext();
                    if (context2 == null) {
                        C844470XAv.LIZ.getClass();
                        context2 = C844470XAv.LIZ();
                    }
                    viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new GridLayoutManager(context2) { // from class: com.ss.android.ugc.aweme.tako.startup.onboarding.ui.TakoOnboardingAssem$initPowerList$5$1
                        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                        public final boolean canScrollVertically() {
                            return false;
                        }
                    });
                    int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    viewOnAttachStateChangeListenerC20604515jv.setPadding(iLIZIZ3, viewOnAttachStateChangeListenerC20604515jv.getPaddingTop(), iLIZIZ3, viewOnAttachStateChangeListenerC20604515jv.getPaddingBottom());
                    viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoOnboardingHorizontalCell.class);
                }
            } else {
                int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                viewOnAttachStateChangeListenerC20604515jv.setPadding(iLIZIZ4, viewOnAttachStateChangeListenerC20604515jv.getPaddingTop(), iLIZIZ4, viewOnAttachStateChangeListenerC20604515jv.getPaddingBottom());
                final Context context3 = getContext();
                if (context3 == null) {
                    C844470XAv.LIZ.getClass();
                    context3 = C844470XAv.LIZ();
                }
                viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new GridLayoutManager(context3) { // from class: com.ss.android.ugc.aweme.tako.startup.onboarding.ui.TakoOnboardingAssem$initPowerList$3
                    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                    public final boolean canScrollVertically() {
                        return false;
                    }
                });
                viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C0IDH(this, 3));
                viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoOnBoardingGridCell.class);
            }
        } else {
            final Context context4 = getContext();
            if (context4 == null) {
                C844470XAv.LIZ.getClass();
                context4 = C844470XAv.LIZ();
            }
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(context4) { // from class: com.ss.android.ugc.aweme.tako.startup.onboarding.ui.TakoOnboardingAssem$initPowerList$1
                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public final boolean canScrollVertically() {
                    return false;
                }
            });
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C0DXR() { // from class: X.03Ii
                public final int LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                public final int LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    if (recyclerView.getChildAdapterPosition(view2) != 0) {
                        rect.top = this.LL;
                    }
                    int i4 = this.LLILLJJLI;
                    rect.left = i4;
                    rect.right = i4;
                }
            });
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoOnboardingVerticalCell.class);
        }
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.0yaK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1863140yaG) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new C5185020h(viewOnAttachStateChangeListenerC20604515jv, 29), 4);
        int i4 = iArr[this.LLJJIJIIJIL.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 == 4) {
                        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.0yaJ
                            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                            public final Object get(Object obj) {
                                return ((C1863140yaG) obj).LL;
                            }
                        }, C736820SvI.LIZLLL(), new AwS641S0100000_27(this, 98), 4);
                    }
                } else {
                    TakoOnboardingViewModel takoOnboardingViewModelLp2 = lp();
                    ArrayList arrayList = new ArrayList();
                    C1862970yZz.LIZ.getClass();
                    List list = (List) C1862970yZz.LIZJ.getValue();
                    if (list != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : list) {
                            if (((Boolean) this.LLJJIJIL.getValue()).booleanValue() || !Intrinsics.LJFF(obj, EnumC1862960yZy.TEMPLATE_CREATE.getTypeName())) {
                                arrayList2.add(obj);
                            }
                        }
                        List listLL2 = C13LP.LL(arrayList2, 3);
                        if (listLL2 != null) {
                            int i5 = 0;
                            for (Object obj2 : listLL2) {
                                int i6 = i5 + 1;
                                if (i5 >= 0) {
                                    String str26 = (String) obj2;
                                    Context context5 = getContext();
                                    if (context5 != null) {
                                        C1862970yZz.LIZ.getClass();
                                        C1863190yaL c1863190yaLLIZIZ = C1862970yZz.LIZIZ(str26, false);
                                        Pair pairLIZ = C1862970yZz.LIZ(context5, str26, false);
                                        if (c1863190yaLLIZIZ != null) {
                                            str12 = c1863190yaLLIZIZ.LIZIZ;
                                            str13 = c1863190yaLLIZIZ.LIZ;
                                        } else {
                                            str12 = null;
                                            str13 = null;
                                        }
                                        if (pairLIZ != null) {
                                            str14 = (String) pairLIZ.getFirst();
                                        } else {
                                            str14 = null;
                                        }
                                        C443490HaF c443490HaF = new C443490HaF(str12, str13, str14);
                                        if (Intrinsics.LJFF(str26, EnumC1862960yZy.ASK_VIDEO.getTypeName())) {
                                            if (pairLIZ == null || (str18 = (String) pairLIZ.getSecond()) == null) {
                                                str18 = "";
                                            }
                                            c443390Ha5 = new C443390Ha5(c443490HaF, str18, new C443450HaB(C104200aO.LIZ("#A94BC9"), C104200aO.LIZ("#DBB1E9")), new C443450HaB(C104200aO.LIZ("#FAFAFA"), C104200aO.LIZ("#1E1E1E")), new C443450HaB(C104200aO.LIZ("#FBF7FF"), C104200aO.LIZ("#1D161D")));
                                        } else if (Intrinsics.LJFF(str26, EnumC1862960yZy.TRIP.getTypeName())) {
                                            if (pairLIZ == null || (str17 = (String) pairLIZ.getSecond()) == null) {
                                                str17 = "";
                                            }
                                            c443390Ha5 = new C443390Ha5(c443490HaF, str17, new C443450HaB(C104200aO.LIZ("#3D9354"), C104200aO.LIZ("#7FD8B8")), new C443450HaB(C104200aO.LIZ("#FAFAFA"), C104200aO.LIZ("#1E1E1E")), new C443450HaB(C104200aO.LIZ("#F6FAF5"), C104200aO.LIZ("#151B18")));
                                        } else if (Intrinsics.LJFF(str26, EnumC1862960yZy.RECIPE.getTypeName())) {
                                            if (pairLIZ == null || (str16 = (String) pairLIZ.getSecond()) == null) {
                                                str16 = "";
                                            }
                                            c443390Ha5 = new C443390Ha5(c443490HaF, str16, new C443450HaB(C104200aO.LIZ("#804E04"), C104200aO.LIZ("#F4C895")), new C443450HaB(C104200aO.LIZ("#F8F8F8"), C104200aO.LIZ("#1E1E1E")), new C443450HaB(C104200aO.LIZ("#F7F2EE"), C104200aO.LIZ("#1E1B17")));
                                        } else if (Intrinsics.LJFF(str26, EnumC1862960yZy.TEMPLATE_CREATE.getTypeName())) {
                                            if (pairLIZ == null || (str15 = (String) pairLIZ.getSecond()) == null) {
                                                str15 = "";
                                            }
                                            c443390Ha5 = new C443390Ha5(c443490HaF, str15, new C443450HaB(C104200aO.LIZ("#2E73B8"), C104200aO.LIZ("#95C5F4")), new C443450HaB(C104200aO.LIZ("#FAFAFA"), C104200aO.LIZ("#1E1E1E")), new C443450HaB(C104200aO.LIZ("#F2F6FF"), C104200aO.LIZ("#17191E")));
                                        } else {
                                            c443390Ha5 = null;
                                        }
                                    } else {
                                        c443390Ha5 = null;
                                    }
                                    arrayList.add(new C443380Ha4(c443390Ha5, i5, str26, new C1863070ya9(this), new C1863110yaD(this)));
                                    i5 = i6;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                        }
                    }
                    takoOnboardingViewModelLp2.setStateImmediate(new AwS606S0100000_27(arrayList, (List<TakoActiveBotItem>) 376));
                }
            } else {
                TakoOnboardingViewModel takoOnboardingViewModelLp3 = lp();
                ArrayList arrayList3 = new ArrayList();
                C1862970yZz.LIZ.getClass();
                Iterable iterable = (Iterable) C1862970yZz.LIZJ.getValue();
                if (iterable != null && (listLL = C13LP.LL(iterable, 4)) != null) {
                    int i7 = 0;
                    for (Object obj3 : listLL) {
                        int i8 = i7 + 1;
                        if (i7 >= 0) {
                            String str27 = (String) obj3;
                            Context context6 = getContext();
                            if (context6 != null) {
                                C1862970yZz.LIZ.getClass();
                                C1863190yaL c1863190yaLLIZIZ2 = C1862970yZz.LIZIZ(str27, false);
                                Pair pairLIZ2 = C1862970yZz.LIZ(context6, str27, false);
                                if (c1863190yaLLIZIZ2 != null) {
                                    str9 = c1863190yaLLIZIZ2.LIZIZ;
                                    str10 = c1863190yaLLIZIZ2.LIZ;
                                } else {
                                    str9 = null;
                                    str10 = null;
                                }
                                if (pairLIZ2 != null) {
                                    str11 = (String) pairLIZ2.getFirst();
                                } else {
                                    str11 = null;
                                }
                                C443490HaF c443490HaF2 = new C443490HaF(str9, str10, str11);
                                if (Intrinsics.LJFF(str27, EnumC1862960yZy.ASK_VIDEO.getTypeName())) {
                                    c443470HaD = new C443470HaD(c443490HaF2, new C443450HaB(C104200aO.LIZ("#F8F8F8"), C104200aO.LIZ("#1E1E1E")), new C443450HaB(C104200aO.LIZ("#F1EEF5"), C104200aO.LIZ("#1D161D")), new C443450HaB(C104200aO.LIZ("#552864"), C104200aO.LIZ("#DBB1E9")));
                                } else if (Intrinsics.LJFF(str27, EnumC1862960yZy.TRIP.getTypeName())) {
                                    c443470HaD = new C443470HaD(c443490HaF2, new C443450HaB(C104200aO.LIZ("#F8F8F8"), C104200aO.LIZ("#1E1E1E")), new C443450HaB(C104200aO.LIZ("#F1F7F0"), C104200aO.LIZ("#151B18")), new C443450HaB(C104200aO.LIZ("#0C4D35"), C104200aO.LIZ("#90DDC1")));
                                } else if (Intrinsics.LJFF(str27, EnumC1862960yZy.RECIPE.getTypeName())) {
                                    c443470HaD = new C443470HaD(c443490HaF2, new C443450HaB(C104200aO.LIZ("#F8F8F8"), C104200aO.LIZ("#1E1E1E")), new C443450HaB(C104200aO.LIZ("#F7F2EE"), C104200aO.LIZ("#25201A")), new C443450HaB(C104200aO.LIZ("#804E04"), C104200aO.LIZ("#FFB99C")));
                                } else if (Intrinsics.LJFF(str27, EnumC1862960yZy.TEMPLATE_CREATE.getTypeName())) {
                                    c443470HaD = new C443470HaD(c443490HaF2, new C443450HaB(C104200aO.LIZ("#F8F8F8"), C104200aO.LIZ("#1E1E1E")), new C443450HaB(C104200aO.LIZ("#F2F6FF"), C104200aO.LIZ("#17191E")), new C443450HaB(C104200aO.LIZ("#173859"), C104200aO.LIZ("#BDDEFF")));
                                } else {
                                    c443470HaD = null;
                                }
                            } else {
                                c443470HaD = null;
                            }
                            arrayList3.add(new C443460HaC(c443470HaD, i7, str27, new C1863060ya8(this), new C1863100yaC(this)));
                            i7 = i8;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
                takoOnboardingViewModelLp3.setStateImmediate(new AwS606S0100000_27(arrayList3, (List<TakoActiveBotItem>) 376));
            }
        } else {
            TakoOnboardingViewModel takoOnboardingViewModelLp4 = lp();
            ArrayList arrayList4 = new ArrayList();
            C1862970yZz.LIZ.getClass();
            List list2 = (List) C1862970yZz.LIZJ.getValue();
            if (list2 != null) {
                ArrayList arrayList5 = new ArrayList();
                for (Object obj4 : list2) {
                    if (((Boolean) this.LLJJIJIL.getValue()).booleanValue() || !Intrinsics.LJFF(obj4, EnumC1862960yZy.TEMPLATE_CREATE.getTypeName())) {
                        arrayList5.add(obj4);
                    }
                }
                List listLL3 = C13LP.LL(arrayList5, 3);
                if (listLL3 != null) {
                    int i9 = 0;
                    for (Object obj5 : listLL3) {
                        i2++;
                        if (i9 >= 0) {
                            String str28 = (String) obj5;
                            Context context7 = getContext();
                            if (context7 != null) {
                                C1862970yZz.LIZ.getClass();
                                C1863190yaL c1863190yaLLIZIZ3 = C1862970yZz.LIZIZ(str28, true);
                                Pair pairLIZ3 = C1862970yZz.LIZ(context7, str28, true);
                                if (c1863190yaLLIZIZ3 != null) {
                                    str2 = c1863190yaLLIZIZ3.LIZIZ;
                                    str3 = c1863190yaLLIZIZ3.LIZ;
                                } else {
                                    str2 = null;
                                    str3 = null;
                                }
                                if (pairLIZ3 != null) {
                                    str4 = (String) pairLIZ3.getFirst();
                                } else {
                                    str4 = null;
                                }
                                C443490HaF c443490HaF3 = new C443490HaF(str2, str3, str4);
                                if (Intrinsics.LJFF(str28, EnumC1862960yZy.ASK_VIDEO.getTypeName())) {
                                    if (pairLIZ3 == null || (str8 = (String) pairLIZ3.getSecond()) == null) {
                                        str8 = "";
                                    }
                                    c443430Ha9 = new C443430Ha9(c443490HaF3, str8, new C443450HaB(C104200aO.LIZ("#FDEBFF"), C104200aO.LIZ("#663355")));
                                } else if (Intrinsics.LJFF(str28, EnumC1862960yZy.TRIP.getTypeName())) {
                                    if (pairLIZ3 == null || (str7 = (String) pairLIZ3.getSecond()) == null) {
                                        str7 = "";
                                    }
                                    c443430Ha9 = new C443430Ha9(c443490HaF3, str7, new C443450HaB(C104200aO.LIZ("#E5F9D5"), C104200aO.LIZ("#344F1E")));
                                } else if (Intrinsics.LJFF(str28, EnumC1862960yZy.RECIPE.getTypeName())) {
                                    if (pairLIZ3 == null || (str6 = (String) pairLIZ3.getSecond()) == null) {
                                        str6 = "";
                                    }
                                    c443430Ha9 = new C443430Ha9(c443490HaF3, str6, new C443450HaB(C104200aO.LIZ("#FFE9CA"), C104200aO.LIZ("#71542A")));
                                } else if (Intrinsics.LJFF(str28, EnumC1862960yZy.TEMPLATE_CREATE.getTypeName())) {
                                    if (pairLIZ3 == null || (str5 = (String) pairLIZ3.getSecond()) == null) {
                                        str5 = "";
                                    }
                                    c443430Ha9 = new C443430Ha9(c443490HaF3, str5, new C443450HaB(C104200aO.LIZ("#CAE5FF"), C104200aO.LIZ("#294766")));
                                } else {
                                    c443430Ha9 = null;
                                }
                            } else {
                                c443430Ha9 = null;
                            }
                            arrayList4.add(new C443440HaA(c443430Ha9, i9, str28, new C1863050ya7(this), new C1863090yaB(this)));
                            i9 = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
            }
            takoOnboardingViewModelLp4.setStateImmediate(new AwS606S0100000_27(arrayList4, (List<TakoActiveBotItem>) 376));
        }
        TakoOnboardingViewModel takoOnboardingViewModelLp5 = lp();
        C20235214Fq.LIZ.getClass();
        String strLIZ = C20235214Fq.LIZ();
        if (!C123100dR.LIZ(strLIZ) || strLIZ == null) {
            strLIZ = C20235214Fq.LIZIZ();
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(takoOnboardingViewModelLp5), C0PEM.LIZJ, null, new C0NQT(strLIZ, C20235214Fq.LIZIZ(), this.LLJJIJIIJIL.getComponentType(), takoOnboardingViewModelLp5, null), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void op(int r34, java.lang.String r35, java.lang.String r36) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.startup.onboarding.ui.TakoOnboardingAssem.op(int, java.lang.String, java.lang.String):void");
    }

    public final void hp(int i, String str, String str2, String str3) throws JSONException {
        String str4;
        Map<String, String> commonParams;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        String str5;
        String str6;
        String strUN0;
        EnumC1863020ya4 enumC1863020ya4JS1;
        C13LC<C1864200yby> c13lcAp0;
        C1864200yby c1864200yby;
        C13LC<C1864200yby> c13lcAp02;
        C1864200yby c1864200yby2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C20235214Fq.LIZ.getClass();
        linkedHashMap.put("group_id", C20235214Fq.LIZ());
        linkedHashMap.put("last_feed_group_id", C20235214Fq.LIZIZ());
        linkedHashMap.put("sug_id", str);
        linkedHashMap.put("source", "16");
        linkedHashMap.put("guide_type", str3);
        linkedHashMap.put("rank", String.valueOf(i));
        linkedHashMap.put("word_id", str);
        linkedHashMap.put("impr_id", lp().wQ2());
        linkedHashMap.put("interaction_name", str2);
        linkedHashMap.put("page_type", "user_onboarding");
        linkedHashMap.put("onboarding_style", this.LLJJIJIIJIL.getMobOnboardingStyle());
        TakoOnBoardingResponse takoOnBoardingResponse = lp().getState().LL;
        String mobOnboardingStyle = null;
        if (takoOnBoardingResponse != null) {
            str4 = takoOnBoardingResponse.logId;
        } else {
            str4 = null;
        }
        linkedHashMap.put("log_id", str4);
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        ITakoContextAbility iTakoContextAbilityMp = mp();
        if (iTakoContextAbilityMp != null) {
            commonParams = iTakoContextAbilityMp.getCommonParams();
        } else {
            commonParams = null;
        }
        c1862330yYx.mobTikbotQuickInteractionClick(linkedHashMap, commonParams, null);
        ITakoContextAbility iTakoContextAbilityMp2 = mp();
        if (iTakoContextAbilityMp2 != null && (c13lcT71 = iTakoContextAbilityMp2.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            ITakoContextAbility iTakoContextAbilityMp3 = mp();
            if (iTakoContextAbilityMp3 != null && (c13lcAp02 = iTakoContextAbilityMp3.Ap0()) != null && (c1864200yby2 = (C1864200yby) c13lcAp02.LIZIZ()) != null) {
                str5 = c1864200yby2.LL;
            } else {
                str5 = null;
            }
            String str7 = "";
            if (str5 == null) {
                str5 = "";
            }
            ITakoContextAbility iTakoContextAbilityMp4 = mp();
            if (iTakoContextAbilityMp4 != null && (c13lcAp0 = iTakoContextAbilityMp4.Ap0()) != null && (c1864200yby = (C1864200yby) c13lcAp0.LIZIZ()) != null) {
                str6 = c1864200yby.LLILLJJLI;
            } else {
                str6 = null;
            }
            String str8 = c1863850ybP.LL;
            if (str8 == null) {
                str8 = "";
            }
            String str9 = c1863850ybP.LLILLJJLI;
            if (str9 == null) {
                str9 = "";
            }
            String str10 = c1863850ybP.LLILZIL;
            if (str10 == null) {
                str10 = "";
            }
            TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) this.LLJJJIL.getValue();
            if (takoChatUIAbility != null) {
                strUN0 = takoChatUIAbility.uN0();
            } else {
                strUN0 = null;
            }
            String str11 = c1863850ybP.LLJ;
            if (str11 == null) {
                str11 = "";
            }
            if (str6 != null) {
                str7 = str6;
            }
            TakoChatUIAbility takoChatUIAbility2 = (TakoChatUIAbility) this.LLJJJIL.getValue();
            if (takoChatUIAbility2 != null && (enumC1863020ya4JS1 = takoChatUIAbility2.jS1()) != null) {
                mobOnboardingStyle = enumC1863020ya4JS1.getMobOnboardingStyle();
            }
            C1862330yYx.LJJZ(512, c1862330yYx, str8, str9, str10, str5, c1863850ybP.LLIZ, strUN0, str11, str7, "click_recommendedword", mobOnboardingStyle);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object] */
    public final void ip(int i, String str, String str2, String str3) throws JSONException {
        String str4;
        List<String> list;
        List<String> list2;
        TakoOnboardingData takoOnboardingDataVQ2 = lp().vQ2(str3);
        Map<String, String> commonParams = null;
        Object objLJJJLZIJ = str;
        if (str == null) {
            if (takoOnboardingDataVQ2 != null && (list2 = takoOnboardingDataVQ2.wordIds) != null) {
                objLJJJLZIJ = C13LP.LJJJLZIJ(0, list2);
            } else {
                objLJJJLZIJ = null;
            }
        }
        if (str2 == 0) {
            if (takoOnboardingDataVQ2 != null && (list = takoOnboardingDataVQ2.queries) != null) {
                str2 = C13LP.LJJJLZIJ(0, list);
            } else {
                str2 = 0;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C20235214Fq.LIZ.getClass();
        linkedHashMap.put("group_id", C20235214Fq.LIZ());
        linkedHashMap.put("last_feed_group_id", C20235214Fq.LIZIZ());
        linkedHashMap.put("sug_id", objLJJJLZIJ);
        linkedHashMap.put("source", "16");
        linkedHashMap.put("guide_type", str3);
        linkedHashMap.put("rank", String.valueOf(i));
        linkedHashMap.put("word_id", objLJJJLZIJ);
        linkedHashMap.put("impr_id", lp().wQ2());
        linkedHashMap.put("interaction_name", str2);
        linkedHashMap.put("page_type", "user_onboarding");
        linkedHashMap.put("onboarding_style", this.LLJJIJIIJIL.getMobOnboardingStyle());
        TakoOnBoardingResponse takoOnBoardingResponse = lp().getState().LL;
        if (takoOnBoardingResponse != null) {
            str4 = takoOnBoardingResponse.logId;
        } else {
            str4 = null;
        }
        linkedHashMap.put("log_id", str4);
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        ITakoContextAbility iTakoContextAbilityMp = mp();
        if (iTakoContextAbilityMp != null) {
            commonParams = iTakoContextAbilityMp.getCommonParams();
        }
        c1862330yYx.mobTikbotQuickInteractionShow(linkedHashMap, commonParams);
    }
}
