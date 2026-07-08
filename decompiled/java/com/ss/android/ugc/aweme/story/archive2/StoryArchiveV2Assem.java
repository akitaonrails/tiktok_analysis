package com.ss.android.ugc.aweme.story.archive2;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C06Y0;
import X.C0FI2;
import X.C0OM1;
import X.C1209070hZJ;
import X.C1220000hqw;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C13LE;
import X.C19EG;
import X.C19U1;
import X.C20587115h7;
import X.C20632315oP;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736820SvI;
import X.C736950SvV;
import X.EnumC1173730geJ;
import X.InterfaceC1173910geb;
import X.InterfaceC1584740rLE;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService;
import com.ss.android.ugc.aweme.story.archive2.calendar.StoryArchiveV2CalendarFragment;
import com.ss.android.ugc.aweme.story.archive2.list.StoryArchiveV2ListFragment;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class StoryArchiveV2Assem extends UIContentAssem {
    public final C736950SvV LLIZLLLIL = new C736950SvV(C13LE.LIZ(StoryArchiveV2ArchiveViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(761), new AwS562S0100000_18((AbstractC738140SxQ) this, 2273), new C451610HnL(this, true, true), new C723700Sa8(this));
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(616));

    public final StoryArchiveV2ArchiveViewModel Go() {
        return (StoryArchiveV2ArchiveViewModel) this.LLIZLLLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ICreativeForwardService iCreativeForwardService;
        final Fragment fragmentLJI;
        final Context context;
        super.onViewCreated(view);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (fragmentLJI = C724240Sb0.LJI(this)) != null && (context = getContext()) != null) {
            final TuxNavBar tuxNavBar = (TuxNavBar) LJJIJL().findViewById(R.id.p15);
            C20632315oP c20632315oP = (C20632315oP) LJJIJL().findViewById(R.id.view_pager);
            final C19U1 c19u1 = (C19U1) LJJIJL().findViewById(R.id.wya);
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
            c1251150ifB.LIZJ(new AwS562S0100000_18(c19egLIZ, 2455));
            c0om1.LJ(c1251150ifB);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZIZ = "title";
            c1250250idj.LIZJ = context.getString(2131833969);
            c0om1.LIZJ = c1250250idj;
            tuxNavBar.setNavActions(c0om1);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e1, tuxNavBar.getContext());
            if (numLIZJ != null) {
                tuxNavBar.setNavBackground(numLIZJ.intValue());
            }
            final List list = (List) this.LLJ.getValue();
            c20632315oP.setAdapter(new FragmentStateAdapter(fragmentLJI, list) { // from class: X.0geH
                public final List<EnumC1173730geJ> LLJI;

                @Override // X.AbstractC21673619ry
                public final int getItemCount() {
                    return this.LLJI.size();
                }

                public static StoryArchiveV2ListFragment LLLILZLLLI(boolean z) {
                    StoryArchiveV2ListFragment storyArchiveV2ListFragment = new StoryArchiveV2ListFragment();
                    storyArchiveV2ListFragment.setArguments(C799520VXy.LIZ(new Pair("is_thought_page", Boolean.valueOf(z))));
                    return storyArchiveV2ListFragment;
                }

                @Override // androidx.viewpager2.adapter.FragmentStateAdapter
                public final Fragment LLLII(int i) {
                    int i2 = C1173700geG.LIZ[((EnumC1173730geJ) ListProtector.get(this.LLJI, i)).ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                return LLLILZLLLI(true);
                            }
                            throw new C1954807lC();
                        }
                        return LLLILZLLLI(false);
                    }
                    return new StoryArchiveV2CalendarFragment();
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.LLJI = list;
                }
            });
            new C20587115h7(c19u1, c20632315oP, new InterfaceC1173910geb() { // from class: X.0geO
                @Override // X.InterfaceC1173910geb
                public final void LIZ(C19U0 c19u0, int i) {
                    int i2;
                    int i3;
                    View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.fb7, c19u1, false);
                    TuxIconView tuxIconView = (TuxIconView) C1616006Uk.LIZ(R.id.jxe, viewTd);
                    if (tuxIconView != null) {
                        c19u0.LIZLLL(viewTd);
                        EnumC1173730geJ enumC1173730geJ = (EnumC1173730geJ) C13LP.LJJJLZIJ(i, (List) this.LLJ.getValue());
                        if (enumC1173730geJ == null) {
                            return;
                        }
                        this.getClass();
                        int i4 = C1173720geI.LIZ[enumC1173730geJ.ordinal()];
                        if (i4 != 1) {
                            if (i4 != 2 && i4 == 3) {
                                i2 = R.raw.icon_thought_fill;
                            } else {
                                i2 = R.raw.icon_story_star;
                            }
                        } else {
                            i2 = R.raw.icon_calendar_fill;
                        }
                        tuxIconView.setIconRes(i2);
                        if (i == 0) {
                            i3 = R.attr.a00;
                        } else {
                            i3 = R.attr.a1k;
                        }
                        tuxIconView.setTintColorRes(i3);
                        return;
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(R.id.jxe)));
                }
            }, 0).LIZ();
            c19u1.addOnTabSelectedListener(new InterfaceC1584740rLE() { // from class: X.0geN
                @Override // X.InterfaceC1586460rO0
                public final void ih(C19U0 c19u0) {
                }

                @Override // X.InterfaceC1586460rO0
                public final void Oq(C19U0 c19u0) {
                    int i;
                    TuxIconView tuxIconView;
                    if (c19u0 == null) {
                        return;
                    }
                    EnumC1173730geJ enumC1173730geJ = (EnumC1173730geJ) C13LP.LJJJLZIJ(c19u0.LJ, (List) this.LL.LLJ.getValue());
                    if (enumC1173730geJ == null) {
                        return;
                    }
                    View view2 = c19u0.LJFF;
                    if (view2 != null && (tuxIconView = (TuxIconView) view2.findViewById(R.id.jxe)) != null) {
                        tuxIconView.setTintColorRes(R.attr.a00);
                    }
                    if (enumC1173730geJ == EnumC1173730geJ.THOUGHT) {
                        i = 2131833980;
                    } else {
                        i = 2131833969;
                    }
                    TuxNavBar tuxNavBar2 = tuxNavBar;
                    C1250250idj c1250250idj2 = new C1250250idj();
                    c1250250idj2.LIZIZ = "title";
                    c1250250idj2.LIZJ = context.getString(i);
                    tuxNavBar2.LJIJJ(c1250250idj2);
                    C1173900gea c1173900gea = C1173900gea.LIZ;
                    String tabName = this.LL.Go().LLILLJJLI.getTabName();
                    String tabName2 = enumC1173730geJ.getTabName();
                    c1173900gea.getClass();
                    C0LAB c0lab = new C0LAB();
                    c0lab.LJ("from_tab_name", tabName);
                    c0lab.LJ("to_tab_name", tabName2);
                    C20684815ws.LJIILLIIL("change_story_archive_tab", c0lab.LIZ);
                    this.LL.Go().LLILLJJLI = enumC1173730geJ;
                }

                @Override // X.InterfaceC1586460rO0
                public final void Yn(C19U0 c19u0) {
                    View view2;
                    TuxIconView tuxIconView;
                    if (c19u0 != null && (view2 = c19u0.LJFF) != null && (tuxIconView = (TuxIconView) view2.findViewById(R.id.jxe)) != null) {
                        tuxIconView.setTintColorRes(R.attr.a1k);
                    }
                }
            });
        }
        StoryArchiveV2ArchiveViewModel storyArchiveV2ArchiveViewModelGo = Go();
        selectSubscribe(storyArchiveV2ArchiveViewModelGo, new C2217381BqS() { // from class: X.0geB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1173560ge2) obj).LLIZLLLIL);
            }
        }, new C2217381BqS() { // from class: X.0geC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1173560ge2) obj).LLJ);
            }
        }, new C2217381BqS() { // from class: X.0geD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1173560ge2) obj).LLJI;
            }
        }, new C2217381BqS() { // from class: X.0ge9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1173560ge2) obj).LLILLL;
            }
        }, C736820SvI.LIZIZ(storyArchiveV2ArchiveViewModelGo.usedInReusedScene), null, new C06Y0(this));
        StoryArchiveV2ArchiveViewModel storyArchiveV2ArchiveViewModelGo2 = Go();
        selectSubscribe(storyArchiveV2ArchiveViewModelGo2, new C2217381BqS() { // from class: X.0gdu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1173560ge2) obj).LLILZIL;
            }
        }, new C2217381BqS() { // from class: X.0geA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1173560ge2) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0gdw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1173560ge2) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZIZ(storyArchiveV2ArchiveViewModelGo2.usedInReusedScene), null, new C1209070hZJ(this, 3));
        Go().getClass();
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LJI(null) && C0FI2.LJJI("Damion-Regular.ttf") == null && (iCreativeForwardService = (ICreativeForwardService) PluggableExtentionKt.pluggableSpi$default(ICreativeForwardService.class, false, false, false, 14, null)) != null) {
            iCreativeForwardService.preDownloadOnThisDayFontList();
        }
        Go().vQ2(EnumC1173730geJ.LIST);
        List list2 = (List) this.LLJ.getValue();
        EnumC1173730geJ enumC1173730geJ = EnumC1173730geJ.THOUGHT;
        if (list2.contains(enumC1173730geJ)) {
            Go().vQ2(enumC1173730geJ);
        }
    }
}
