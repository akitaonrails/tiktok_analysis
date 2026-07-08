package com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.contentassem;

import X.AbstractC2172971A2l;
import X.C019F;
import X.C09R3;
import X.C0JMJ;
import X.C0JMR;
import X.C0JMS;
import X.C0JMT;
import X.C0JMZ;
import X.C0KFD;
import X.C0QSJ;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20632315oP;
import X.C2217381BqS;
import X.C490660JMa;
import X.C490710JMf;
import X.C490760JMk;
import X.C521620Kcy;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC490700JMe;
import X.InterfaceC490740JMi;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerLoadMoreAbility;
import com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility;
import com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.contentassem.VideoPlayerPagerAssem;
import com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.model.VideoPlayerFragmentScope;
import com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.viewmodel.PcsCourseVideoPlayerVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class VideoPlayerPagerAssem extends UIContentAssem implements VideoPlayerPagerAbility, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public final VideoPlayerPagerAssem LLIZLLLIL = this;
    public C0JMJ LLJ;
    public C20632315oP LLJI;
    public final AssemVMLazy LLJIJIL;
    public C0JMZ LLJILJIL;
    public final Map<Integer, C490760JMk> LLJILJILJ;
    public C0JMT LLJILLL;
    public final List<InterfaceC490700JMe> LLJJ;
    public final List<C0JMS> LLJJI;
    public final C490710JMf LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public volatile VideoPlayerLoadMoreAbility LLJJJIL;
    public InterfaceC665370Q7z LLJJJJ;
    public C0QSJ LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoPlayerPagerAssem.class, "loadMoreAbility", "getLoadMoreAbility()Lcom/ss/android/ugc/aweme/pcs/course/videoplayerpage/fragment/assem/ability/VideoPlayerLoadMoreAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(VideoPlayerPagerAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/pcs/course/videoplayerpage/fragment/viewmodel/PcsCourseVideoPlayerVM;", 0);
        c09r3.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0JMf] */
    public VideoPlayerPagerAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsCourseVideoPlayerVM.class);
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 726), AFwS237S0000000_7.get$arr$(172), null, true);
        this.LLJILJILJ = new LinkedHashMap();
        this.LLJJ = new ArrayList();
        this.LLJJI = new ArrayList();
        this.LLJJIII = new InterfaceC490740JMi() { // from class: X.0JMf
            @Override // X.InterfaceC490740JMi
            public final void LIZ(boolean z) {
                this.LIZ.Oo(z);
            }
        };
        this.LLJJIJI = true;
        this.LLJJIJIIJIL = true;
        this.LLJJIJIL = -1;
        this.LLJJJ = -1;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoPlayerFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoPlayerFragmentScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final C490760JMk Go() {
        int i = this.LLJJJ;
        if (i == -1) {
            return null;
        }
        return (C490760JMk) ((LinkedHashMap) this.LLJILJILJ).get(Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerLoadMoreAbility Ho() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerLoadMoreAbility r0 = r4.LLJJJIL
            if (r0 != 0) goto L39
            monitor-enter(r4)
            com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerLoadMoreAbility r0 = r4.LLJJJIL     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLJJJJJIL     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJJJJ     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLJJJJ = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.model.VideoPlayerFragmentScope> r1 = com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.model.VideoPlayerFragmentScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLJJJJJIL = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerLoadMoreAbility> r0 = com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerLoadMoreAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerLoadMoreAbility r0 = (com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerLoadMoreAbility) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLJJJIL = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.contentassem.VideoPlayerPagerAssem.Ho():com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerLoadMoreAbility");
    }

    public final C20632315oP Jo() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.video_play_view_pager) : null;
            this.LLJI = (C20632315oP) viewFindViewById;
        }
        return (C20632315oP) viewFindViewById;
    }

    public final C0JMJ Lo() {
        if (this.LLJ == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C0JMJ.class, null);
            this.LLJ = interfaceC1555100qZQLIZIZ != null ? (C0JMJ) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJ;
    }

    public final PcsCourseVideoPlayerVM No() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return (PcsCourseVideoPlayerVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility
    public final int getItemCount() {
        C0JMZ c0jmz = this.LLJILJIL;
        if (c0jmz != null) {
            return c0jmz.getItemCount();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility
    public final C490760JMk zZ0() {
        int i = this.LLJJIJIL;
        if (i == -1) {
            return null;
        }
        return (C490760JMk) ((LinkedHashMap) this.LLJILJILJ).get(Integer.valueOf(i));
    }

    @Override // com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility
    public final C490760JMk LLJLLL() {
        return Go();
    }

    @Override // com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility
    public final ViewGroup.LayoutParams getLayoutParams() {
        C20632315oP c20632315oPJo = Jo();
        if (c20632315oPJo != null) {
            return c20632315oPJo.getLayoutParams();
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        VideoPlayerLoadMoreAbility videoPlayerLoadMoreAbilityHo = Ho();
        if (videoPlayerLoadMoreAbilityHo != null) {
            videoPlayerLoadMoreAbilityHo.QL0(this.LLJJIII);
        }
        C490760JMk c490760JMkGo = Go();
        if (c490760JMkGo != null) {
            c490760JMkGo.N5();
        }
        super.onDestroy();
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        C490760JMk c490760JMkGo = Go();
        if (c490760JMkGo != null && c490760JMkGo.LL.LLILZIL.LJ.getValue().LIZ && c490760JMkGo.LLILZIL != -1) {
            c490760JMkGo.LLILZLL += System.currentTimeMillis() - c490760JMkGo.LLILZIL;
            c490760JMkGo.LLILZIL = -1L;
        }
        super.onPause();
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        C490760JMk c490760JMkGo = Go();
        if (c490760JMkGo == null || c490760JMkGo.LL.LLILZIL.LJ.getValue().LIZ || c490760JMkGo.LLILZIL != -1) {
            return;
        }
        c490760JMkGo.LLILZIL = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility
    public final int qr() {
        return this.LLJJJ;
    }

    @Override // com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility
    public final void NQ1(InterfaceC490700JMe interfaceC490700JMe) {
        ((ArrayList) this.LLJJ).add(interfaceC490700JMe);
    }

    public final void Oo(boolean z) {
        C490760JMk c490760JMk = (C490760JMk) ((LinkedHashMap) this.LLJILJILJ).get(Integer.valueOf(this.LLJJJ));
        if (c490760JMk != null) {
            c490760JMk.LL.setIsFadingMode(z);
        }
        C490760JMk c490760JMk2 = (C490760JMk) ((LinkedHashMap) this.LLJILJILJ).get(Integer.valueOf(this.LLJJJ - 1));
        if (c490760JMk2 != null) {
            c490760JMk2.LL.setIsFadingMode(z);
        }
        C490760JMk c490760JMk3 = (C490760JMk) ((LinkedHashMap) this.LLJILJILJ).get(Integer.valueOf(this.LLJJJ + 1));
        if (c490760JMk3 != null) {
            c490760JMk3.LL.setIsFadingMode(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility
    public final void P30(InterfaceC490700JMe interfaceC490700JMe) {
        ((ArrayList) this.LLJJ).remove(interfaceC490700JMe);
    }

    @Override // com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility
    public final void UT(C490660JMa c490660JMa) {
        ((ArrayList) this.LLJJI).add(c490660JMa);
    }

    @Override // com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility
    public final void Yf0(boolean z) {
        C20632315oP c20632315oPJo = Jo();
        if (c20632315oPJo != null) {
            c20632315oPJo.setUserInputEnabled(z);
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{VideoPlayerFragmentScope.class}).unbindAbility(this.LLIZLLLIL, VideoPlayerPagerAbility.class);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0JMZ] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        final AwS621S0100000_7 awS621S0100000_7 = new AwS621S0100000_7(this, 34);
        final AwS586S0100000_7 awS586S0100000_7 = new AwS586S0100000_7(this, 261);
        final AwS586S0100000_7 awS586S0100000_72 = new AwS586S0100000_7(this, 262);
        this.LLJILJIL = new AbstractC2172971A2l<C0JMR, C490760JMk>(awS586S0100000_7, awS586S0100000_72, awS621S0100000_7) { // from class: X.0JMZ
            public final Function2<C490760JMk, Integer, Unit> LLILLJJLI;
            public final Function1<C490760JMk, Unit> LLILLL;
            public final Function1<C490760JMk, Unit> LLILZ;

            @Override // X.AbstractC21673619ry
            public final long getItemId(int i) {
                return ((C0JMR) ListProtector.get(this.LL.LJFF, i)).LIZ;
            }

            @Override // X.AbstractC21673619ry
            public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
                super.onViewAttachedToWindow(viewHolder);
                this.LLILLL.invoke(viewHolder);
            }

            @Override // X.AbstractC21673619ry
            public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
                super.onViewDetachedFromWindow(viewHolder);
                this.LLILZ.invoke(viewHolder);
            }

            @Override // X.AbstractC21673619ry
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                this.LLILLJJLI.invoke(viewHolder, Integer.valueOf(i));
            }

            @Override // X.AbstractC21673619ry
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                C490760JMk c490760JMk = new C490760JMk(C500260Jjc.LJIILL(R.layout.djb, viewGroup, false));
                try {
                    View view2 = c490760JMk.itemView;
                    if (view2 != null) {
                        view2.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                c490760JMk.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                try {
                    if (c490760JMk.itemView.getParent() != null) {
                        try {
                            SettingsManager.LIZLLL().getClass();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(C490760JMk.class.getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C1AF0.LIZJ(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) c490760JMk.itemView.getParent();
                            if (viewGroup2 != null) {
                                C786410Ut5.LJJJLZIJ(c490760JMk.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2081408Dk.LIZ(e2);
                    C2344809Gs.LIZ(e2);
                }
                C20612085q.LIZ = C490760JMk.class.getName();
                return c490760JMk;
            }

            {
                super(new AbstractC339510DSr<C0JMR>() { // from class: X.0JMV
                    @Override // X.AbstractC339510DSr
                    public final boolean LIZ(C0JMR c0jmr, C0JMR c0jmr2) {
                        C0JMR c0jmr3 = c0jmr;
                        C0JMR c0jmr4 = c0jmr2;
                        if (c0jmr3.LIZ == c0jmr4.LIZ && c0jmr3.LIZJ() == c0jmr4.LIZJ()) {
                            return true;
                        }
                        return false;
                    }

                    @Override // X.AbstractC339510DSr
                    public final boolean LIZIZ(C0JMR c0jmr, C0JMR c0jmr2) {
                        if (c0jmr.LIZ == c0jmr2.LIZ) {
                            return true;
                        }
                        return false;
                    }
                });
                this.LLILLJJLI = awS621S0100000_7;
                this.LLILLL = awS586S0100000_7;
                this.LLILZ = awS586S0100000_72;
                setHasStableIds(true);
            }
        };
        final C20632315oP c20632315oPJo = Jo();
        if (c20632315oPJo != null) {
            c20632315oPJo.setAdapter(this.LLJILJIL);
            c20632315oPJo.setOrientation(1);
            c20632315oPJo.setOffscreenPageLimit(1);
            final RecyclerView recyclerView = (RecyclerView) c20632315oPJo.getChildAt(0);
            recyclerView.setClipToPadding(false);
            recyclerView.setClipChildren(false);
            recyclerView.addOnItemTouchListener(new C0KFD(recyclerView, this, c20632315oPJo) { // from class: X.0JMQ
                public float LL;
                public final int LLILLJJLI;
                public final /* synthetic */ VideoPlayerPagerAssem LLILLL;
                public final /* synthetic */ C20632315oP LLILZ;

                @Override // X.InterfaceC21676019sM
                public final boolean LJJIFFI(RecyclerView recyclerView2, MotionEvent motionEvent) {
                    View view2;
                    RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) ((LinkedHashMap) this.LLILLL.LLJILJILJ).get(Integer.valueOf(this.LLILZ.getCurrentItem()));
                    if (viewHolder != null && (view2 = viewHolder.itemView) != null) {
                        float y = view2.getY();
                        int action = motionEvent.getAction();
                        if (action != 0) {
                            if (action == 2) {
                                float y2 = motionEvent.getY() - this.LL;
                                if (y != 0.0f) {
                                    return false;
                                }
                                if ((y2 <= this.LLILLJJLI || this.LLILLL.No().getState().LLILZLL) && (y != 0.0f || y2 >= (-this.LLILLJJLI) || this.LLILLL.No().getState().LLIZ)) {
                                    return false;
                                }
                                return true;
                            }
                        } else {
                            this.LL = motionEvent.getY();
                        }
                    }
                    return false;
                }

                {
                    this.LLILLL = this;
                    this.LLILZ = c20632315oPJo;
                    this.LLILLJJLI = ViewConfiguration.get(recyclerView.getContext()).getScaledTouchSlop();
                }
            });
            c20632315oPJo.LIZIZ(new C521620Kcy(this, 0));
        }
        VideoPlayerLoadMoreAbility videoPlayerLoadMoreAbilityHo = Ho();
        if (videoPlayerLoadMoreAbilityHo != null) {
            videoPlayerLoadMoreAbilityHo.wF1(this.LLJJIII);
        }
        C736680Sv4.LJIIIIZZ(this, No(), new C2217381BqS() { // from class: X.06JW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C0JMP) obj).LLILLJJLI);
            }
        }, C736820SvI.LIZLLL(), new AwS621S0100000_7(this, 0), 4);
        C736680Sv4.LJIIIIZZ(this, No(), new C2217381BqS() { // from class: X.0JMM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0JMP) obj).LLILLL;
            }
        }, null, new AwS621S0100000_7(this, 1), 6);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{VideoPlayerFragmentScope.class}).bindAbility(this.LLIZLLLIL, VideoPlayerPagerAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C20632315oP c20632315oPJo = Jo();
        if (c20632315oPJo != null) {
            C786410Ut5.r6(c20632315oPJo, layoutParams);
        }
    }

    @Override // com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility
    public final void vP0(C490660JMa c490660JMa) {
        ((ArrayList) this.LLJJI).remove(c490660JMa);
    }
}
