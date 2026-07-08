package com.ss.android.ugc.aweme.story.feed.guidecard.component.panel;

import X.AbstractC706530RnX;
import X.C076I;
import X.C0AWD;
import X.C0ROD;
import X.C0SR4;
import X.C0SZ8;
import X.C13LP;
import X.C1618440sDa;
import X.C19EG;
import X.C2189821An6;
import X.C442540HWy;
import X.C628500Oky;
import X.C630740Ooa;
import X.C706480RnS;
import X.C712440Rx4;
import X.C724240Sb0;
import X.C728750SiH;
import X.C729510SjV;
import X.InterfaceC1616070s9l;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.preload.v2.IStoryPreloaderV2;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS232S0000000_4;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryGuideCardPreLoadPanelComponent extends BasePanelComponent implements InterfaceC1616070s9l {
    public final C630740Ooa LL = C628500Oky.LIZ(new C0ROD(this));

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onBeforePageChange() {
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageScrolledEnd(int i, float f, int i2) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageSelected(int i, boolean z) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageUnSelected(C0SZ8 c0sz8) {
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onScrollToItemStart(int i) {
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onScrollToItemStart(int i, boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LL.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Xl0(this);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LL.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(this);
        }
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        PagerAdapter pagerAdapterLJJLIIIJL;
        C0SR4 c0sr4;
        List<Aweme> listLJJJLZIJ;
        String eventType;
        IStoryPreloaderV2 iStoryPreloaderV2LJJLI;
        IViewPagerAbility iViewPagerAbility = (IViewPagerAbility) this.LL.getValue();
        if (iViewPagerAbility != null) {
            pagerAdapterLJJLIIIJL = iViewPagerAbility.LJJLIIIJL();
        } else {
            pagerAdapterLJJLIIIJL = null;
        }
        if ((pagerAdapterLJJLIIIJL instanceof C0SR4) && (c0sr4 = (C0SR4) pagerAdapterLJJLIIIJL) != null && (listLJJJLZIJ = c0sr4.LJJJLZIJ()) != null) {
            SettingsManager.LIZLLL().getClass();
            int iLJ = SettingsManager.LJ("tt_story_guide_card_preload_count", 5) + i;
            int size = listLJJJLZIJ.size() - 1;
            if (iLJ > size) {
                iLJ = size;
            }
            int iIntValue = i - ((Number) C076I.LIZ.getValue()).intValue();
            if (iIntValue < 0) {
                iIntValue = 0;
            }
            C2189821An6 c2189821An6 = getPanelContext().LIZJ;
            if (c2189821An6 == null || (eventType = c2189821An6.getEventType()) == null) {
                eventType = "";
            }
            if (iIntValue > iLJ) {
                return;
            }
            while (true) {
                Aweme aweme = (Aweme) C13LP.LJJJLZIJ(iIntValue, listLJJJLZIJ);
                if (aweme != null && (C729510SjV.LJJIIJZLJL(aweme, eventType, true) || C729510SjV.LJJIII(aweme, eventType, true) || C729510SjV.LJJIIJ(aweme, eventType, true))) {
                    C728750SiH c728750SiH = C728750SiH.LIZ;
                    Context context = getContext();
                    c728750SiH.getClass();
                    Aweme awemeLIZJ = C712440Rx4.LIZJ(aweme);
                    if (((Boolean) C0AWD.LIZ.getValue()).booleanValue()) {
                        if (awemeLIZJ != null && (iStoryPreloaderV2LJJLI = C1618440sDa.LIZIZ.LJJLI()) != null) {
                            iStoryPreloaderV2LJJLI.LIZ(Collections.singletonList(awemeLIZJ), null, AFwS232S0000000_4.get$arr$(255));
                        }
                    } else if (context != null) {
                        C442540HWy.LIZ.getClass();
                        C442540HWy.LIZIZ(context, awemeLIZJ);
                    }
                    C728750SiH.LJIIJ(iIntValue, aweme, "preloadSkylight");
                    if (C729510SjV.LJJIIJ(aweme, eventType, true)) {
                        C706480RnS c706480RnS = C706480RnS.LIZ;
                        C19EG c19egLIZ = C724240Sb0.LIZ(this);
                        Fragment fragmentLJI = C724240Sb0.LJI(this);
                        List listSingletonList = Collections.singletonList(new AbstractC706530RnX() { // from class: X.0Rna
                            @Override // X.AbstractC706530RnX
                            public final void LIZJ() {
                                LIZIZ().add("story_layout_guide_card_thought");
                                LIZIZ().add("story_layout_guide_card_single_avatar");
                            }
                        });
                        c706480RnS.getClass();
                        C706480RnS.LJIIJ(c19egLIZ, fragmentLJI, listSingletonList);
                    } else if (C729510SjV.LJJIII(aweme, eventType, true)) {
                        C706480RnS c706480RnS2 = C706480RnS.LIZ;
                        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
                        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
                        List listSingletonList2 = Collections.singletonList(new AbstractC706530RnX() { // from class: X.0RnV
                            @Override // X.AbstractC706530RnX
                            public final void LIZJ() {
                                LIZIZ().add("story_layout_guide_card_photo");
                                LIZIZ().addAll(C706550RnZ.LIZJ.LIZ());
                            }
                        });
                        c706480RnS2.getClass();
                        C706480RnS.LJIIJ(c19egLIZ2, fragmentLJI2, listSingletonList2);
                    } else {
                        C706480RnS c706480RnS3 = C706480RnS.LIZ;
                        C19EG c19egLIZ3 = C724240Sb0.LIZ(this);
                        Fragment fragmentLJI3 = C724240Sb0.LJI(this);
                        List listSingletonList3 = Collections.singletonList(new AbstractC706530RnX() { // from class: X.0RnW
                            @Override // X.AbstractC706530RnX
                            public final void LIZJ() {
                                LIZIZ().add("story_layout_guide_card_video");
                                LIZIZ().addAll(C706550RnZ.LIZJ.LIZ());
                            }
                        });
                        c706480RnS3.getClass();
                        C706480RnS.LJIIJ(c19egLIZ3, fragmentLJI3, listSingletonList3);
                    }
                }
                if (iIntValue != iLJ) {
                    iIntValue++;
                } else {
                    return;
                }
            }
        }
    }
}
