package com.ss.android.ugc.aweme.feed.flexible;

import X.C01GW;
import X.C098200Yq;
import X.C0S4J;
import X.C1398470mUn;
import X.C189200o6;
import X.C19A0;
import X.C19EG;
import X.C20087713il;
import X.C214932199m;
import X.C214945199z;
import X.C21659719pj;
import X.C21698419vy;
import X.C21698919w3;
import X.C21699119w5;
import X.C2189821An6;
import X.C2344809Gs;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC1559500qgW;
import X.InterfaceC1616070s9l;
import X.InterfaceC214897198d;
import X.InterfaceC214902198i;
import X.InterfaceC494301wD;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import com.ss.android.ugc.aweme.feed.flexible.ability.FlexibleComponentAbility;
import com.ss.android.ugc.aweme.feed.flexible.api.FlexibleComponentCallback;
import com.ss.android.ugc.aweme.feed.flexible.api.FlexibleSupportAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentService;
import com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class FlexibleSheetComponent extends BasePanelComponent implements FlexibleComponentAbility, FlexibleComponentCallback, FlexibleSupportAbility, InterfaceC1554640qYg {
    public static final C0S4J LLILZLL = new C0S4J("Flexible-Component");
    public C19A0 LL;
    public boolean LLILLJJLI;
    public final C630740Ooa LLILLL = C628500Oky.LIZ(new AwS568S0100000_24(this, 405));
    public final AwS568S0100000_24 LLILZ = new AwS568S0100000_24(this, 404);
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2185));

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -2102626957) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.flexible.api.FlexibleComponentCallback
    public final void aI1() {
        View view;
        ViewGroup viewGroup;
        InterfaceC214902198i interfaceC214902198i;
        C19A0 c19a0 = this.LL;
        if (c19a0 == null) {
            return;
        }
        this.LL = null;
        try {
            try {
                View view2 = c19a0.LIZ.mView;
                if (view2 != null) {
                    C20087713il.LIZJ(view2, true);
                }
                C19A0.LIZ(c19a0, C724240Sb0.LIZ(this));
                SAFFragmentRootScene sAFFragmentRootScene = c19a0.LIZLLL;
                if (sAFFragmentRootScene != null && (interfaceC214902198i = sAFFragmentRootScene.LLJJ) != null) {
                    interfaceC214902198i.YP();
                }
                View view3 = c19a0.LIZ.mView;
                if (view3 != null) {
                    ViewParent parent = view3.getParent();
                    if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                        C786410Ut5.LJJJLZIJ(view3, viewGroup);
                    }
                }
                view = c19a0.LIZ.mView;
                if (view == null) {
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2344809Gs.LJI(e);
                view = c19a0.LIZ.mView;
                if (view == null) {
                    return;
                }
            }
            C20087713il.LIZJ(view, false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            View view4 = c19a0.LIZ.mView;
            if (view4 != null) {
                C20087713il.LIZJ(view4, false);
            }
            throw th;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.flexible.ability.FlexibleComponentAbility
    public final boolean bU0() {
        return this.LL != null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        C19A0 c19a0 = this.LL;
        if (c19a0 != null) {
            c19a0.LIZJ();
        }
        super.onDestroy();
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        C19A0 c19a0 = this.LL;
        if (c19a0 != null) {
            c19a0.LIZLLL();
        }
        super.onPause();
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        C19A0 c19a0 = this.LL;
        if (c19a0 != null) {
            c19a0.LJ();
        }
        super.onResume();
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        C19A0 c19a0 = this.LL;
        if (c19a0 != null) {
            c19a0.LJFF();
        }
        super.onStart();
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        C19A0 c19a0 = this.LL;
        if (c19a0 != null) {
            c19a0.LJI();
        }
        super.onStop();
    }

    @Override // com.ss.android.ugc.aweme.feed.flexible.api.FlexibleSupportAbility
    public final VideoShrinkAbility qX0() {
        return (VideoShrinkAbility) this.LLILZ.invoke();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILLL.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(new InterfaceC1616070s9l() { // from class: X.19w4
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

                @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                public final void onPageSelected(int i) {
                    this.LL.QD0(true);
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.flexible.api.FlexibleComponentCallback
    public final boolean Be1() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.feed.flexible.api.FlexibleComponentCallback
    public final void QD0(boolean z) {
        Object c098200Yq;
        C214932199m c214932199m;
        View view;
        ViewGroup viewGroup;
        if (this.LL == null) {
            return;
        }
        this.LLILLJJLI = z;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            Hox.LLJILJIL.LIZ(c19egLIZ).OQ2((C21699119w5) this.LLILZIL.getValue());
        }
        C19A0 c19a0 = this.LL;
        if (c19a0 != null) {
            c19a0.LIZLLL();
        }
        C19A0 c19a02 = this.LL;
        if (c19a02 != null) {
            c19a02.LJI();
        }
        try {
            C19A0 c19a03 = this.LL;
            if (c19a03 != null && (c214932199m = c19a03.LIZ) != null && (view = c214932199m.mView) != null) {
                ViewParent parent = view.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    C786410Ut5.LJJJLZIJ(view, viewGroup);
                }
                c098200Yq = Unit.LIZ;
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C2344809Gs.LJI(thM5exceptionOrNullimpl);
        }
        C19A0 c19a04 = this.LL;
        if (c19a04 != null) {
            c19a04.LIZJ();
        }
        this.LL = null;
        this.LLILLJJLI = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.feed.flexible.ability.FlexibleComponentAbility
    public final void jC2(C1398470mUn c1398470mUn) {
        C19EG c19egLIZ;
        ViewGroup viewGroup;
        Aweme awemeLJIIIIZZ;
        String eventType;
        Object objLJIILLIIL;
        View view;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && fragmentLJI.isResumed()) {
            if (this.LL != null) {
                LLILZLL.LJII(new AwS568S0100000_24(this, 402));
                return;
            }
            C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
            if ((c19egLIZ2 == null || (objLJIILLIIL = SAFExtensionKt.LJIILLIIL(c19egLIZ2)) == null || (view = ((Fragment) objLJIILLIIL).getView()) == null || (viewGroup = (ViewGroup) view.findViewById(R.id.tyd)) == null) && ((c19egLIZ = C724240Sb0.LIZ(this)) == null || (viewGroup = (ViewGroup) c19egLIZ.findViewById(R.id.tyd)) == null)) {
                LLILZLL.LJII(new AwS568S0100000_24(this, 403));
                return;
            }
            C19EG c19egLIZ3 = C724240Sb0.LIZ(this);
            if (c19egLIZ3 == 0 || !(c19egLIZ3 instanceof InterfaceC214897198d)) {
                return;
            }
            INoticeCountTabBadgePresentService iNoticeCountTabBadgePresentService = (INoticeCountTabBadgePresentService) PluggableExtentionKt.pluggableSpi$default(INoticeCountTabBadgePresentService.class, false, false, false, 14, null);
            if (iNoticeCountTabBadgePresentService != null) {
                iNoticeCountTabBadgePresentService.LIZ();
            }
            String str = c1398470mUn.LIZ;
            if (Intrinsics.LJFF(str, "effect")) {
                C786410Ut5.LJJJI("flexible_fcp_component_key", "anchor_effect", c1398470mUn.LIZJ);
            } else if (Intrinsics.LJFF(str, "music_marquee")) {
                C786410Ut5.LJJJI("flexible_fcp_component_key", "left_container_music_info", c1398470mUn.LIZJ);
            } else {
                C786410Ut5.LJJJI("flexible_fcp_component_key", c1398470mUn.LIZ, c1398470mUn.LIZJ);
            }
            if (c1398470mUn.LIZLLL == null) {
                C21659719pj.Companion.getClass();
                c1398470mUn.LIZLLL = C21659719pj.DEFAULT;
            }
            C786410Ut5.LJJIZ(c1398470mUn.LIZJ, "flexible_sheet_config", c1398470mUn.LIZLLL);
            IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILLL.getValue();
            if (iViewPagerComponentAbility != null) {
                awemeLJIIIIZZ = iViewPagerComponentAbility.LJIIIIZZ();
            } else {
                awemeLJIIIIZZ = null;
            }
            C2189821An6 c2189821An6 = getPanelContext().LIZJ;
            if (c2189821An6 != null) {
                eventType = c2189821An6.getEventType();
            } else {
                eventType = null;
            }
            C21698919w3 c21698919w3 = c1398470mUn.LJ;
            if (c21698919w3 == null) {
                String string = c1398470mUn.LIZJ.getString("flexible_fcp_component_key");
                if (string == null) {
                    string = c1398470mUn.LIZ;
                }
                c21698919w3 = new C21698919w3(null, null, null, null, null, string, "");
            }
            String str2 = c21698919w3.enterFrom;
            if (str2 != null) {
                eventType = str2;
            }
            c21698919w3.setEnterFrom(eventType);
            String aid = c21698919w3.groupId;
            if (aid == null) {
                if (awemeLJIIIIZZ != null) {
                    aid = awemeLJIIIIZZ.getAid();
                } else {
                    aid = null;
                }
            }
            c21698919w3.setGroupId(aid);
            String authorUid = c21698919w3.authorId;
            if (authorUid == null) {
                if (awemeLJIIIIZZ != null) {
                    authorUid = AwemeExtKt.getAuthorUid(awemeLJIIIIZZ);
                } else {
                    authorUid = null;
                }
            }
            c21698919w3.setAuthorId(authorUid);
            Integer numValueOf = c21698919w3.awemeType;
            if (numValueOf == null) {
                if (awemeLJIIIIZZ != null) {
                    numValueOf = Integer.valueOf(awemeLJIIIIZZ.getAwemeType());
                } else {
                    numValueOf = null;
                }
            }
            c21698919w3.setAwemeType(numValueOf);
            C786410Ut5.LJJIZ(c1398470mUn.LIZJ, "flexible_sheet_mob_params", c1398470mUn.LJ);
            Class<? extends Fragment> cls = c1398470mUn.LIZIZ;
            if (cls != null) {
                C786410Ut5.LJJJI("flexible_inset_fragment", cls.getName(), c1398470mUn.LIZJ);
            }
            Bundle bundle = c1398470mUn.LIZJ;
            InterfaceC1559500qgW interfaceC1559500qgW = new InterfaceC1559500qgW() { // from class: X.0qgV
                @Override // X.InterfaceC1559500qgW
                public final FlexibleComponentCallback LIZ() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC1559500qgW
                public final FlexibleSupportAbility LIZIZ() {
                    return this.LIZ;
                }
            };
            String string2 = UUID.randomUUID().toString();
            C21698419vy.LIZ.put(string2, interfaceC1559500qgW);
            C786410Ut5.LJJJI("flexible_root_host_bridge_token", string2, bundle);
            C19A0 c19a0LIZ = C214945199z.LIZ(viewGroup, FlexibleRootFragment.class, c1398470mUn.LIZJ);
            ((InterfaceC214897198d) c19egLIZ3).setDynamicParentScene(c19a0LIZ.LIZ);
            c19a0LIZ.LIZIZ(null);
            c19a0LIZ.LJFF();
            c19a0LIZ.LJ();
            this.LL = c19a0LIZ;
            Hox.LLJILJIL.LIZ(c19egLIZ3).vQ2((C21699119w5) this.LLILZIL.getValue());
            return;
        }
        LLILZLL.LJII(new AwS568S0100000_24(this, 401));
    }
}
