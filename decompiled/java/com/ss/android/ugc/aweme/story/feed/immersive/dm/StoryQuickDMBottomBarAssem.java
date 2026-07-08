package com.ss.android.ugc.aweme.story.feed.immersive.dm;

import X.AbstractC453920Hr4;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0I08;
import X.C0I0B;
import X.C0I0E;
import X.C0RF0;
import X.C0RP1;
import X.C0S1H;
import X.C0S1J;
import X.C0S1K;
import X.C0S1M;
import X.C0S2R;
import X.C0S2S;
import X.C0S2U;
import X.C0ZH1;
import X.C11JF;
import X.C11S5;
import X.C13LE;
import X.C1440005kM;
import X.C1558520qew;
import X.C1609930rzr;
import X.C1618440sDa;
import X.C1637806bA;
import X.C1637906bB;
import X.C1701940uOG;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C453910Hr3;
import X.C453940Hr6;
import X.C628500Oky;
import X.C630740Ooa;
import X.C690870R8b;
import X.C706480RnS;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C735840Sti;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C738860Sya;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC2172611A1b;
import X.EnumC713160RyE;
import X.EnumC913010Zrn;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC438360HGw;
import X.InterfaceC665370Q7z;
import X.InterfaceC706770Rnv;
import Y.ACListenerS146S0100000_11;
import Y.AfS147S0200000_11;
import Y.AfS180S0100000_11;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.im.quickchat.mob.IUnifyQuickReplyAnalytics;
import com.ss.android.ugc.aweme.im.service.service.QuickDMEventParam;
import com.ss.android.ugc.aweme.music.model.CelebrationMetaData;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.ability.QuickDMEntranceAbility;
import com.ss.android.ugc.aweme.story.ability.StoryGestureEducationAbility;
import com.ss.android.ugc.aweme.story.feed.common.sub.note.StoryNoteConsumptionViewModel;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS62S1000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryQuickDMBottomBarAssem extends BaseCellSlotComponent<StoryQuickDMBottomBarAssem> implements C0I08, QuickDMEntranceAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLILZ;
    public Aweme LLJLLIL;
    public C11JF LLJLLL;
    public C0S1J LLJZ = C0S1J.CLICK;
    public final C01GW LLJZIJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(444));
    public final C630740Ooa LLL = C628500Oky.LIZ(new AwS555S0100000_11(this, 813));
    public final C630740Ooa LLLF = C628500Oky.LIZ(new AwS555S0100000_11(this, StrategyCenter.ENABLE_SMART_SERVICE));
    public boolean LLLFF;
    public boolean LLLFFI;
    public final InterfaceC1731706qJ LLLFZ;
    public View LLLI;
    public final InterfaceC1731706qJ LLLII;
    public final C01GW LLLIIII;
    public TuxTextView LLLIIIIL;
    public LinearLayout LLLIIIL;
    public String LLLIIL;
    public final C01GW LLLIILIL;
    public final C01GW LLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StoryQuickDMBottomBarAssem.class, "sharerInfoVM", "getSharerInfoVM()Lcom/ss/android/ugc/aweme/feed/assem/sharer/VideoExposeSharerInformationVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(StoryQuickDMBottomBarAssem.class, "storyNoteConsumptionVM", "getStoryNoteConsumptionVM()Lcom/ss/android/ugc/aweme/story/feed/common/sub/note/StoryNoteConsumptionViewModel;", 0);
        c09r3.getClass();
        LLLILZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public StoryQuickDMBottomBarAssem() {
        C0RP1 c0rp1 = C0RP1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoExposeSharerInformationVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLLFZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0rp1, c1637906bB, new AwS555S0100000_11(c19719912DlLIZ, 811), null, AFwS243S0000000_11.get$arr$(442));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(StoryNoteConsumptionViewModel.class);
        this.LLLII = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS555S0100000_11(c19719912DlLIZ2, 812), null, AFwS243S0000000_11.get$arr$(443));
        this.LLLIIII = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(183));
        this.LLLIILIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 807));
        this.LLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 809));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fdw;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 810);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_quick_dm_bottom_bar_dark_mode", true, awS555S0100000_11);
    }

    @Override // com.ss.android.ugc.aweme.story.ability.QuickDMEntranceAbility
    public final boolean EC0() {
        return this.LLJJIJI && getContentView().getVisibility() == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final QuickDMEventParam Ep() {
        C0RF0 c0rf0;
        C2189821An6 c2189821An6Xp0 = xp0();
        String strLJIL = c2189821An6Xp0 != null ? C1609930rzr.LJIL(c2189821An6Xp0) : null;
        C2189821An6 c2189821An6Xp02 = xp0();
        String eventType = c2189821An6Xp02 != null ? c2189821An6Xp02.getEventType() : null;
        C724270Sb3 c724270Sb3 = this.LLJI;
        String aid = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAid();
        C724270Sb3 c724270Sb32 = this.LLJI;
        String authorUid = AwemeExtKt.getAuthorUid(((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme());
        C735840Sti c735840Sti = C735840Sti.LIZ;
        C724270Sb3 c724270Sb33 = this.LLJI;
        User author = ((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).getAweme().getAuthor();
        c735840Sti.getClass();
        String strValueOf = String.valueOf(C735840Sti.LJIIIIZZ(author));
        C0S1J c0s1j = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
        InterfaceC438360HGw interfaceC438360HGwLJJLIIIJL = c1618440sDa.LJJLIIIJL();
        Aweme aweme = this.LLJLLIL;
        InterfaceC706770Rnv interfaceC706770RnvLJJIIJ = c1618440sDa.LJJIIJ();
        C690870R8b c690870R8bJm = jm();
        boolean zLJJIIJZLJL = interfaceC706770RnvLJJIIJ.LJJIIJZLJL((c690870R8bJm == null || (c0rf0 = c690870R8bJm.LIZLLL) == null) ? null : c0rf0.LIZJ);
        boolean z = false;
        String str = interfaceC438360HGwLJJLIIIJL.LIZ(aweme, zLJJIIJZLJL, false, false) ? "1" : CardStruct.IStatusCode.DEFAULT;
        InterfaceC706770Rnv interfaceC706770RnvLJJIIJ2 = c1618440sDa.LJJIIJ();
        C0RF0 c0rf02 = jm().LIZLLL;
        return new QuickDMEventParam(strLJIL, eventType, aid, authorUid, strValueOf, c0s1j, str, objArr2 == true ? 1 : 0, z, interfaceC706770RnvLJJIIJ2.LJJIIJZLJL(c0rf02 != null ? c0rf02.LIZJ : null), objArr == true ? 1 : 0, z, 15200);
    }

    public final void Gp() {
        C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
        InterfaceC438360HGw interfaceC438360HGwLJJLIIIJL = c1618440sDa.LJJLIIIJL();
        Aweme aweme = this.LLJLLIL;
        InterfaceC706770Rnv interfaceC706770RnvLJJIIJ = c1618440sDa.LJJIIJ();
        C0RF0 c0rf0 = jm().LIZLLL;
        boolean zLIZ = interfaceC438360HGwLJJLIIIJL.LIZ(aweme, interfaceC706770RnvLJJIIJ.LJJIIJZLJL(c0rf0 != null ? c0rf0.LIZJ : null), false, false);
        TextView textView = (TextView) getContentView().findViewById(R.id.sml);
        if (textView != null) {
            textView.setText((CharSequence) null);
            textView.setHint(C0S1K.LIZIZ.LJII(textView.getContext(), zLIZ));
        }
    }

    public final void Jp() {
        Aweme aweme = this.LLJLLIL;
        C735840Sti c735840Sti = C735840Sti.LIZ;
        User author = aweme != null ? aweme.getAuthor() : null;
        c735840Sti.getClass();
        int iLJIIIIZZ = C735840Sti.LJIIIIZZ(author);
        if (iLJIIIIZZ == 1 || iLJIIIIZZ == 2) {
            String str = this.LLLIIL;
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (Intrinsics.LJFF(str, ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAid())) {
                return;
            }
            C724270Sb3 c724270Sb32 = this.LLJI;
            this.LLLIIL = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme().getAid();
            IUnifyQuickReplyAnalytics.LIZ.getClass();
            IUnifyQuickReplyAnalytics iUnifyQuickReplyAnalyticsLIZ = C0S1H.LIZ();
            if (iUnifyQuickReplyAnalyticsLIZ != null) {
                C0S2S c0s2s = EnumC2172611A1b.Companion;
                C2189821An6 c2189821An6Xp0 = xp0();
                String eventType = c2189821An6Xp0 != null ? c2189821An6Xp0.getEventType() : null;
                c0s2s.getClass();
                EnumC2172611A1b enumC2172611A1bLIZ = C0S2S.LIZ(eventType);
                C0S2U c0s2u = C0S2U.FIXED_ENTRANCE;
                EnumC913010Zrn enumC913010Zrn = EnumC913010Zrn.AUTO;
                C724270Sb3 c724270Sb33 = this.LLJI;
                String aid = ((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).getAweme().getAid();
                if (aid == null) {
                    aid = "";
                }
                iUnifyQuickReplyAnalyticsLIZ.LIZ(enumC2172611A1bLIZ, c0s2u, enumC913010Zrn, aid, C0ZH1.STORY, C0S2R.PRIVATE, "", C0I0B.LJFF.LIZIZ());
            }
        }
    }

    @Override // X.C0I08
    public final void TG() {
        C1440005kM.LIZ(new C453940Hr6(true, true, (AbstractC453920Hr4) new C453910Hr3("enter_dm_keyboard")));
        StoryGestureEducationAbility storyGestureEducationAbility = (StoryGestureEducationAbility) this.LLL.getValue();
        if (storyGestureEducationAbility != null) {
            storyGestureEducationAbility.tj0(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.ability.QuickDMEntranceAbility
    public final void c92() {
        this.LLJZ = C0S1J.SLIDE_UP;
        getContentView().performClick();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLLF.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, QuickDMEntranceAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final C690870R8b jm() {
        return (C690870R8b) this.LLLIILIL.getValue();
    }

    public final C2189821An6 xp0() {
        return (C2189821An6) this.LLLIL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLLF.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, QuickDMEntranceAbility.class, null, null);
        }
    }

    public final void Ip(String str) {
        boolean z;
        int i;
        boolean z2;
        int length = str.length() - 1;
        int i2 = 0;
        boolean z3 = false;
        while (i2 <= length) {
            if (!z3) {
                i = i2;
            } else {
                i = length;
            }
            if (Intrinsics.LJI(str.charAt(i), 32) <= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z3) {
                if (!z2) {
                    z3 = true;
                } else {
                    i2++;
                }
            } else if (!z2) {
                break;
            } else {
                length--;
            }
        }
        String string = str.subSequence(i2, length + 1).toString();
        if (string == null) {
            string = "";
        }
        if (string.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View view = this.LLLI;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
        } else {
            View view2 = this.LLLI;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
        }
        if (str.length() == 0) {
            LinearLayout linearLayout = this.LLLIIIL;
            if (linearLayout != null) {
                C786410Ut5.LJZL(0, linearLayout);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.LLLIIIL;
        if (linearLayout2 == null) {
            return;
        }
        C786410Ut5.LJZL(8, linearLayout2);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Fragment fragment;
        C0RF0 c0rf0;
        super.onViewCreated(view);
        if (view instanceof ViewGroup) {
            this.LLLIIIL = (LinearLayout) view.findViewById(R.id.gzl);
            View viewFindViewById = view.findViewById(R.id.smk);
            if (viewFindViewById != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.zj);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(24));
                c384050F3z.LJFF = Integer.valueOf(R.attr.zj);
                viewFindViewById.setBackground(c384050F3z.LIZ(view.getContext()));
            }
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.sml);
            this.LLLIIIIL = tuxTextView;
            if (tuxTextView != null) {
                tuxTextView.setHintTextColor(C960203pA.LIZ(R.attr.eh, view.getContext()));
            }
            TuxTextView tuxTextView2 = this.LLLIIIIL;
            if (tuxTextView2 != null) {
                C0S1K c0s1k = C0S1K.LIZIZ;
                Context context = tuxTextView2.getContext();
                C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
                InterfaceC438360HGw interfaceC438360HGwLJJLIIIJL = c1618440sDa.LJJLIIIJL();
                Aweme aweme = this.LLJLLIL;
                InterfaceC706770Rnv interfaceC706770RnvLJJIIJ = c1618440sDa.LJJIIJ();
                C690870R8b c690870R8bJm = jm();
                if (c690870R8bJm != null && (c0rf0 = c690870R8bJm.LIZLLL) != null) {
                    fragment = c0rf0.LIZJ;
                } else {
                    fragment = null;
                }
                tuxTextView2.setHint(c0s1k.LJII(context, interfaceC438360HGwLJJLIIIJL.LIZ(aweme, interfaceC706770RnvLJJIIJ.LJJIIJZLJL(fragment), false, false)));
                tuxTextView2.addTextChangedListener(new C738860Sya(this, 1));
            }
            C786410Ut5.I7(new ACListenerS146S0100000_11(this, 30), getContentView());
            View viewLIZJ = C1618440sDa.LIZIZ.LJJLIIIJL().LIZJ(getContentView());
            this.LLLI = viewLIZJ;
            if (viewLIZJ != null) {
                C786410Ut5.I7(new ACListenerS146S0100000_11(this, 31), viewLIZJ);
            }
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZIJLIL.getValue(), new C2217381BqS() { // from class: X.0RMS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJJIJIL;
            }
        }, null, AFwS294S0000000_11.get$arr$(134), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZIJLIL.getValue(), new C2217381BqS() { // from class: X.0RMP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJJJ;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(135), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZIJLIL.getValue(), new C2217381BqS() { // from class: X.0RMT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(131), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZIJLIL.getValue(), new C2217381BqS() { // from class: X.0RMR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(132), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLII.getValue(this, LLLILZ[1]), new C2217381BqS() { // from class: X.0Ry9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C713080Ry6) obj).LL;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(133), 4);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        Fragment fragment;
        Object obj;
        Integer num;
        Integer num2;
        String eventType;
        String strLJIL;
        Integer numValueOf;
        String aid;
        C2189821An6 c2189821An6Xp0;
        ConcurrentHashMap<String, List<String>> emojiDisplaySet;
        Map<String, String> extra;
        Fragment fragment2;
        CelebrationMetaData celebrationMetaData;
        CelebrationMetaData celebrationMetaData2;
        VideoItemParams videoItemParams2 = videoItemParams;
        this.LLJLLIL = videoItemParams2.getAweme();
        this.LLJZ = C0S1J.CLICK;
        C11JF c11jf = this.LLJLLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        String str = null;
        this.LLJLLL = null;
        this.LLLFFI = false;
        C0S1K c0s1k = C0S1K.LIZIZ;
        Aweme aweme = videoItemParams2.getAweme();
        C0RF0 c0rf0 = jm().LIZLLL;
        if (c0rf0 != null) {
            fragment = c0rf0.LIZJ;
        } else {
            fragment = null;
        }
        this.LLJLLL = (C11JF) c0s1k.LJI(aweme, EnumC713160RyE.DETAIL, fragment).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS147S0200000_11(this, videoItemParams2, 6), new AfS180S0100000_11(this, 6));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme: ");
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme2 = ((VideoItemParams) obj).getAweme();
        if (aweme2 != null && (celebrationMetaData2 = aweme2.getCelebrationMetaData()) != null) {
            num = celebrationMetaData2.celebrationType;
        } else {
            num = null;
        }
        sbLIZ.append(num);
        sbLIZ.append(" onBind: ");
        Aweme aweme3 = this.LLJLLIL;
        if (aweme3 != null && (celebrationMetaData = aweme3.getCelebrationMetaData()) != null) {
            num2 = celebrationMetaData.celebrationType;
        } else {
            num2 = null;
        }
        sbLIZ.append(num2);
        C2188811AlT.LIZIZ(sbLIZ);
        LinearLayout linearLayout = this.LLLIIIL;
        if (linearLayout != null) {
            InterfaceC438360HGw interfaceC438360HGwLJJLIIIJL = C1618440sDa.LIZIZ.LJJLIIIJL();
            InterfaceC1731706qJ interfaceC1731706qJ = this.LLLFZ;
            InterfaceC2217461Bqa<?>[] interfaceC2217461BqaArr = LLLILZ;
            String strAQ2 = ((VideoExposeSharerInformationVM) interfaceC1731706qJ.getValue(this, interfaceC2217461BqaArr[0])).AQ2();
            int iZQ2 = ((VideoExposeSharerInformationVM) this.LLLFZ.getValue(this, interfaceC2217461BqaArr[0])).zQ2();
            AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(this, 1135);
            C2189821An6 c2189821An6Xp02 = xp0();
            if (c2189821An6Xp02 != null) {
                eventType = c2189821An6Xp02.getEventType();
            } else {
                eventType = null;
            }
            C2189821An6 c2189821An6Xp03 = xp0();
            if (c2189821An6Xp03 != null) {
                strLJIL = C1609930rzr.LJIL(c2189821An6Xp03);
            } else {
                strLJIL = "feed";
            }
            C0RF0 c0rf02 = jm().LIZLLL;
            if (c0rf02 != null && (fragment2 = c0rf02.LIZJ) != null) {
                numValueOf = Integer.valueOf(fragment2.hashCode());
            } else {
                numValueOf = null;
            }
            C2189821An6 c2189821An6Xp04 = xp0();
            if (c2189821An6Xp04 != null && (extra = c2189821An6Xp04.getExtra()) != null) {
                str = extra.get("is_centralized_avatar");
            }
            List listLIZLLL = interfaceC438360HGwLJJLIIIJL.LIZLLL(linearLayout, strAQ2, iZQ2, awS550S0100000_6, eventType, strLJIL, numValueOf, str, new AwS550S0100000_6(this, 1136));
            Aweme aweme4 = this.LLJLLIL;
            if (aweme4 != null && (aid = aweme4.getAid()) != null && (c2189821An6Xp0 = xp0()) != null && (emojiDisplaySet = c2189821An6Xp0.getEmojiDisplaySet()) != null) {
                emojiDisplaySet.put(aid, listLIZLLL);
            }
        }
        Gp();
    }

    public final void Fp(String str, String str2) {
        C0S1M.LIZ(str, QuickDMEventParam.LIZ(Ep(), str2, null, null, 16351));
    }

    @Override // X.C0I08
    public final void YO(C0I0E c0i0e, String str) {
        this.LLJZ = C0S1J.CLICK;
        TuxTextView tuxTextView = this.LLLIIIIL;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
        boolean z = true;
        AssemViewModel assemViewModel = (AssemViewModel) this.LLLII.getValue(this, LLLILZ[1]);
        if (str == null) {
            str = "";
        }
        assemViewModel.getClass();
        assemViewModel.setState(new AwS62S1000000_11(str, 4));
        C1440005kM.LIZ(new C453940Hr6(false, z, 4));
    }
}
