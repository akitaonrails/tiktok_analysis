package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.utils;

import X.C098200Yq;
import X.C09R3;
import X.C0HHT;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C189200o6;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C659520Ptu;
import X.C661470Px3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC661400Pww;
import X.InterfaceC661740PxU;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.ISearchVideoHolderAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchCountdownVM;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoHolderVM;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AFwS289S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SearchVideoDurationCountdownAssem extends ReusedUIContentAssem<SearchVideoDurationCountdownAssem> implements InterfaceC712990Rxx<C659520Ptu> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public View LLJJJJLIIL;
    public TuxTextView LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchVideoDurationCountdownAssem.class, "searchVideoHolderVM", "getSearchVideoHolderVM()Lcom/ss/android/ugc/aweme/search/pages/result/common/searchvideo/core/videwmodel/SearchVideoHolderVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SearchVideoDurationCountdownAssem.class, "searchCountdownVM", "getSearchCountdownVM()Lcom/ss/android/ugc/aweme/search/pages/result/common/searchvideo/core/videwmodel/SearchCountdownVM;", 0);
        c09r3.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public SearchVideoDurationCountdownAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchVideoHolderVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJJJ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ, 589), null, AFwS236S0000000_6.get$arr$(294));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SearchCountdownVM.class);
        this.LLJJJJJIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c0hht, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ2, 590), null, AFwS236S0000000_6.get$arr$(295));
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Object c098200Yq;
        Object c098200Yq2;
        try {
            c098200Yq = view.findViewById(R.id.i5d);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        this.LLJJJJLIIL = (View) c098200Yq;
        try {
            c098200Yq2 = (TuxTextView) view.findViewById(R.id.tv_video_duration);
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
            c098200Yq2 = null;
        }
        this.LLJJL = (TuxTextView) c098200Yq2;
        View view2 = this.LLJJJJLIIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        InterfaceC1731706qJ interfaceC1731706qJ = this.LLJJJJJIL;
        InterfaceC2217461Bqa<?>[] interfaceC2217461BqaArr = LLJJLIIIJLLLLLLLZ;
        final SearchCountdownVM searchCountdownVM = (SearchCountdownVM) interfaceC1731706qJ.getValue(this, interfaceC2217461BqaArr[1]);
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        searchCountdownVM.getClass();
        final ISearchVideoHolderAbility iSearchVideoHolderAbility = (ISearchVideoHolderAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, ISearchVideoHolderAbility.class, null);
        if (iSearchVideoHolderAbility != null) {
            InterfaceC661400Pww interfaceC661400Pww = new InterfaceC661400Pww() { // from class: X.0H8Q
                @Override // X.InterfaceC661400Pww
                public final void LIZIZ(EnumC661340Pwq enumC661340Pwq) {
                    InterfaceC661540PxA interfaceC661540PxA;
                    C659520Ptu item;
                    Aweme aweme;
                    C661470Px3 c661470Px3X4;
                    InterfaceC661540PxA interfaceC661540PxA2;
                    int i = C661220Pwe.LIZ[enumC661340Pwq.ordinal()];
                    if (i != 1 && i != 2 && i != 3) {
                        if (i == 4 && (item = searchCountdownVM.getItem()) != null && (aweme = item.LL) != null && !aweme.hasVisionSearchEntry() && !aweme.isAd() && (c661470Px3X4 = iSearchVideoHolderAbility.X4()) != null && (interfaceC661540PxA2 = c661470Px3X4.LLJ) != null) {
                            interfaceC661540PxA2.LJJIJIIJI(0);
                            return;
                        }
                        return;
                    }
                    C661470Px3 c661470Px3X42 = iSearchVideoHolderAbility.X4();
                    if (c661470Px3X42 != null && (interfaceC661540PxA = c661470Px3X42.LLJ) != null) {
                        interfaceC661540PxA.LJJIIZI();
                    }
                    searchCountdownVM.setState(AFwS236S0000000_6.get$arr$(513));
                }
            };
            InterfaceC661740PxU interfaceC661740PxU = new InterfaceC661740PxU() { // from class: X.0H8O
                @Override // X.InterfaceC661740PxU
                public final void LJJIJIIJI(String str) {
                }

                @Override // X.InterfaceC661740PxU
                public final void onPlayCompleted(String str) {
                }

                @Override // X.InterfaceC661740PxU
                public final void onResumePlay(String str) {
                }

                @Override // X.InterfaceC661740PxU
                public final void LIZ(long j, long j2) {
                    long j3 = (j2 - j) / 1000;
                    long j4 = 60;
                    searchCountdownVM.setState(new C0H8P(j3 / j4, j3 % j4));
                }
            };
            C661470Px3 c661470Px3X4 = iSearchVideoHolderAbility.X4();
            if (c661470Px3X4 != null) {
                c661470Px3X4.LIZLLL(interfaceC661400Pww);
                c661470Px3X4.LLIZ.add(interfaceC661740PxU);
            }
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJJIL.getValue(this, interfaceC2217461BqaArr[1]), new C2217381BqS() { // from class: X.0H8N
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2003707t5) obj).LL;
            }
        }, null, AFwS289S0000000_6.get$arr$(20), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJ.getValue(this, interfaceC2217461BqaArr[0]), new C2217381BqS() { // from class: X.0H8M
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0H89) obj).LLILLJJLI;
            }
        }, null, AFwS289S0000000_6.get$arr$(21), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C659520Ptu c659520Ptu) {
        C659520Ptu c659520Ptu2 = c659520Ptu;
        String strK4 = null;
        if (!c659520Ptu2.LL.hasVisionSearchEntry() && !c659520Ptu2.LL.isAd()) {
            TuxTextView tuxTextView = this.LLJJL;
            if (tuxTextView != null) {
                Video video = c659520Ptu2.LL.getVideo();
                if (video != null) {
                    int duration = video.getDuration() / LSPassThroughRecordSizeConfig.DEFAULT;
                    strK4 = C786410Ut5.k4(Locale.ENGLISH, "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(duration / 60), Integer.valueOf(duration % 60)}, 2));
                }
                tuxTextView.setText(strK4);
            }
            View view = this.LLJJJJLIIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
                return;
            }
            return;
        }
        TuxTextView tuxTextView2 = this.LLJJL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText((CharSequence) null);
        }
        View view2 = this.LLJJJJLIIL;
        if (view2 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, view2);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C659520Ptu c659520Ptu) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C659520Ptu c659520Ptu) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
