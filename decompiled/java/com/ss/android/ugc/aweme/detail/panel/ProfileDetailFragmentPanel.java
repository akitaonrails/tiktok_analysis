package com.ss.android.ugc.aweme.detail.panel;

import X.AbstractC1255880imo;
import X.C01GW;
import X.C0SZ8;
import X.C1008770cMF;
import X.C10IT;
import X.C1209980ham;
import X.C1440005kM;
import X.C14EU;
import X.C1618440sDa;
import X.C1843500y4a;
import X.C19EG;
import X.C2037307yV;
import X.C2093608Ic;
import X.C2113808Pw;
import X.C2188811AlT;
import X.C2189821An6;
import X.C418440Gaw;
import X.C452501pT;
import X.C486860J7k;
import X.C729510SjV;
import X.C739870T0n;
import X.C745620TMq;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1209130hZP;
import Y.ACListenerS154S0100000_19;
import Y.ARunnableS112S0100000_12;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileDetailFragmentPanel extends DetailFragmentPanel {
    public View A0;
    public TuxTextView B0;
    public View C0;
    public final C01GW D0;
    public boolean E0;
    public boolean F0;
    public View z0;

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC1349040lD4
    public final void LIZIZ() {
        this.F0 = true;
        O70();
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC1349040lD4
    public final void LJJIIJ() {
        this.F0 = false;
        M31();
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final boolean p0() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.detail.component.bottom.DetailBottomLegacyAbility
    public final void XZ() {
        UserStory userStory;
        List<Aweme> stories;
        View view = this.z0;
        if (view != null) {
            boolean z = true;
            if (view.getVisibility() != 8) {
                InterfaceC1209130hZP interfaceC1209130hZP = this.I;
                boolean zP5 = interfaceC1209130hZP != null ? interfaceC1209130hZP.p5(!C10IT.LJIIJJI(LLLLLJLJLL())) : false;
                Aweme awemeLJIIIIZZ = LJIIIIZZ();
                if (awemeLJIIIIZZ == null || (userStory = awemeLJIIIIZZ.getUserStory()) == null || (stories = userStory.getStories()) == null) {
                    z = false;
                } else {
                    Iterator<Aweme> it2 = stories.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.LJFF(it2.next(), LLLLLJLJLL())) {
                            break;
                        }
                    }
                    z = false;
                }
                if (zP5) {
                    if (z) {
                        C1440005kM.LIZ(new C2037307yV("ProfileDetailFragmentPanel"));
                    }
                    C786410Ut5.LJLLLLLL(8, view);
                } else if (!z) {
                    C786410Ut5.LJLLLLLL(8, view);
                }
                InterfaceC1209130hZP interfaceC1209130hZP2 = this.I;
                if (interfaceC1209130hZP2 != null) {
                    interfaceC1209130hZP2.W3();
                }
                InterfaceC1209130hZP interfaceC1209130hZP3 = this.I;
                if (interfaceC1209130hZP3 != null) {
                    interfaceC1209130hZP3.ry();
                }
            }
        }
    }

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
    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.detail.component.bottom.DetailBottomLegacyAbility
    public final void Cu1() {
        AwemeStatistics statistics;
        super.Cu1();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showBottomView current aweme id =  ");
        Aweme awemeLLLLLJLJLL = LLLLLJLJLL();
        View view = null;
        strLIZIZ = null;
        String strLIZIZ = null;
        sbLIZ.append(awemeLLLLLJLJLL != null ? awemeLLLLLJLJLL.getAid() : null);
        sbLIZ.append(" and aweme type is ");
        Aweme awemeLLLLLJLJLL2 = LLLLLJLJLL();
        sbLIZ.append(awemeLLLLLJLJLL2 != null ? Integer.valueOf(awemeLLLLLJLJLL2.getAwemeType()) : null);
        C2188811AlT.LIZIZ(sbLIZ);
        Activity activity = this.activity;
        if (activity == null || activity.isFinishing() || getFragment() == null || this.LLLL.booleanValue()) {
            return;
        }
        if (this.z0 != null) {
            XZ();
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("createCreatorBottomView current aweme id =  ");
        Aweme awemeLLLLLJLJLL3 = LLLLLJLJLL();
        sbLIZ2.append(awemeLLLLLJLJLL3 != null ? awemeLLLLLJLJLL3.getAid() : null);
        sbLIZ2.append(" and aweme type is ");
        Aweme awemeLLLLLJLJLL4 = LLLLLJLJLL();
        sbLIZ2.append(awemeLLLLLJLJLL4 != null ? Integer.valueOf(awemeLLLLLJLJLL4.getAwemeType()) : null);
        C2188811AlT.LIZIZ(sbLIZ2);
        ViewGroup viewGroup = (ViewGroup) getFragment().getView();
        if (viewGroup instanceof FrameLayout) {
            C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
            View viewLIZJ = c1618440sDa.LJJ().LIZJ("detail_feed_story_normal_creator_bottom", getContext(), null, R.layout.blo, null, viewGroup, false, false);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(57)));
            layoutParams.gravity = 80;
            this.A0 = viewLIZJ.findViewById(R.id.ngc);
            this.B0 = (TuxTextView) viewLIZJ.findViewById(R.id.yyi);
            Aweme awemeLLLLLJLJLL5 = LLLLLJLJLL();
            if (awemeLLLLLJLJLL5 != null && (statistics = awemeLLLLLJLJLL5.getStatistics()) != null) {
                strLIZIZ = C1843500y4a.LIZIZ(statistics.getPlayCount());
            }
            TuxTextView tuxTextView = this.B0;
            if (tuxTextView != null) {
                if (strLIZIZ == null) {
                    strLIZIZ = CardStruct.IStatusCode.DEFAULT;
                }
                tuxTextView.setText(strLIZIZ);
            }
            if (C729510SjV.LJIJ(LLLLLJLJLL())) {
                View view2 = this.A0;
                if (view2 != null && view2.getVisibility() != 4) {
                    C786410Ut5.LJLLLLLL(4, view2);
                }
            } else {
                View view3 = this.A0;
                if (view3 != null && view3.getVisibility() != 0) {
                    C786410Ut5.LJLLLLLL(0, view3);
                }
            }
            this.C0 = viewLIZJ.findViewById(R.id.y4f);
            viewLIZJ.findViewById(R.id.w9r);
            if (c1618440sDa.LJJIFFI().LJIIIIZZ()) {
                View view4 = this.C0;
                if (view4 != null) {
                    C786410Ut5.LJLLLLLL(0, view4);
                }
                View view5 = this.C0;
                if (view5 != null) {
                    C786410Ut5.I7(new ACListenerS154S0100000_19((Object) this, 97), view5);
                }
            } else {
                View view6 = this.C0;
                if (view6 != null) {
                    C786410Ut5.LJLLLLLL(8, view6);
                }
            }
            C786410Ut5.LJLLLLLL(8, viewLIZJ);
            viewGroup.addView(viewLIZJ, layoutParams);
            view = viewLIZJ;
        }
        this.z0 = view;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void LLJJJJLIIL() {
        super.LLJJJJLIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageSelected current aweme id =  ");
        Aweme awemeLLLLLJLJLL = LLLLLJLJLL();
        sbLIZ.append(awemeLLLLLJLJLL != null ? awemeLLLLLJLJLL.getAid() : null);
        sbLIZ.append(" and aweme type is ");
        Aweme awemeLLLLLJLJLL2 = LLLLLJLJLL();
        sbLIZ.append(awemeLLLLLJLJLL2 != null ? Integer.valueOf(awemeLLLLLJLJLL2.getAwemeType()) : null);
        C2188811AlT.LIZIZ(sbLIZ);
        XZ();
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final void T() {
        super.T();
        C786410Ut5.LJJZZIII(C2113808Pw.LIZIZ.LL, new ARunnableS112S0100000_12((Object) this, 160));
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final void Z() {
        super.Z();
        HandlerHook.viewPost(this.LLJJIJI, new ARunnableS112S0100000_12((Object) this, 161));
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final Aweme o() {
        return LLLLLJLJLL();
    }

    public ProfileDetailFragmentPanel(C2189821An6 c2189821An6) {
        super(c2189821An6);
        this.D0 = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(93));
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void LLJLL(C0SZ8 c0sz8) {
        String aid;
        super.LLJLL(c0sz8);
        LLLLLJLJLL();
        ICommercePromoteService iCommercePromoteService = (ICommercePromoteService) this.D0.getValue();
        if (iCommercePromoteService != null) {
            Aweme awemeLLLLLJLJLL = LLLLLJLJLL();
            if (awemeLLLLLJLJLL != null) {
                aid = awemeLLLLLJLJLL.getAid();
            } else {
                aid = null;
            }
            iCommercePromoteService.LJIILL(aid);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC21613819iK
    public final void iG(int i) {
        super.iG(i);
        DetailFragmentPanel.a0(this.z0, getFragment().getView(), i);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final void onCommentEvent(C1209980ham c1209980ham) {
        Integer numValueOf;
        String aid = null;
        if (c1209980ham != null && (numValueOf = Integer.valueOf(c1209980ham.LIZ)) != null) {
            if (numValueOf.intValue() == 3 || numValueOf.intValue() == 4 || numValueOf.intValue() == 8) {
                Object obj = c1209980ham.LIZIZ;
                if (!(obj instanceof Object[])) {
                    return;
                }
                Object[] objArr = (Object[]) obj;
                if (objArr.length != 2) {
                    return;
                }
                Aweme awemeLLLLLJLJLL = LLLLLJLJLL();
                if (awemeLLLLLJLJLL != null) {
                    aid = awemeLLLLLJLJLL.getAid();
                }
                C2093608Ic.LIZJ(aid, (String) objArr[0]);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void onCommentListPageDialogEvent(C739870T0n c739870T0n) {
        Activity activity = this.activity;
        if (activity != null && !activity.isFinishing()) {
            if (c739870T0n.LIZIZ != activity.hashCode()) {
                return;
            }
            if (c739870T0n.LIZ == 1) {
                this.E0 = true;
                O70();
            } else {
                this.E0 = false;
                M31();
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onViewerListAuthPageEvent(C745620TMq c745620TMq) {
        if (c745620TMq == null) {
            return;
        }
        if (c745620TMq.LIZ == 1) {
            O70();
        } else {
            if (this.E0 || this.F0) {
                return;
            }
            M31();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final List<Aweme> p(AbstractC1255880imo<?, ?> abstractC1255880imo) {
        List<Aweme> listP = super.p(abstractC1255880imo);
        if (listP == null) {
            return null;
        }
        C1008770cMF.LIZ(listP);
        return listP;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC21613819iK
    public final void xv(boolean z) {
        super.xv(z);
        DetailFragmentPanel.a0(this.z0, getFragment().getView(), 0);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC1212360hec
    public final void LLJJJIL(List<Aweme> list, boolean z) {
        String aid;
        int size;
        super.LLJJJIL(list, z);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRefreshResult current aweme id = ");
        Aweme awemeLLLLLJLJLL = LLLLLJLJLL();
        Integer numValueOf = null;
        if (awemeLLLLLJLJLL != null) {
            aid = awemeLLLLLJLJLL.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(" and aweme type is ");
        Aweme awemeLLLLLJLJLL2 = LLLLLJLJLL();
        if (awemeLLLLLJLJLL2 != null) {
            numValueOf = Integer.valueOf(awemeLLLLLJLJLL2.getAwemeType());
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" and list size is ");
        if (list != null) {
            size = list.size();
        } else {
            size = -1;
        }
        sbLIZ.append(size);
        C2188811AlT.LIZIZ(sbLIZ);
        XZ();
        if (Intrinsics.LJFF(getEventType(), "chat")) {
            e0();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC1212360hec
    public final void Pj(List<Aweme> list, boolean z) {
        String aid;
        int size;
        super.Pj(list, z);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadMoreResult current aweme id = ");
        Aweme awemeLLLLLJLJLL = LLLLLJLJLL();
        Integer numValueOf = null;
        if (awemeLLLLLJLJLL != null) {
            aid = awemeLLLLLJLJLL.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(" and aweme type is ");
        Aweme awemeLLLLLJLJLL2 = LLLLLJLJLL();
        if (awemeLLLLLJLJLL2 != null) {
            numValueOf = Integer.valueOf(awemeLLLLLJLJLL2.getAwemeType());
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" and list size is ");
        if (list != null) {
            size = list.size();
        } else {
            size = -1;
        }
        sbLIZ.append(size);
        C2188811AlT.LIZIZ(sbLIZ);
        XZ();
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC21613819iK
    public final void lQ(float f, int i) {
        super.lQ(f, i);
        View view = this.z0;
        if (view != null && view.getVisibility() == 0) {
            DetailFragmentPanel.a0(this.z0, getFragment().getView(), (int) (f * i));
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC739960T0w, X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onViewCreated(View view, Bundle bundle) {
        C19EG activity;
        super.onViewCreated(view, bundle);
        Fragment fragment = getFragment();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            C486860J7k.LIZIZ(activity).LLILZLL.setValue(Boolean.valueOf(Intrinsics.LJFF(getEventType(), "others_homepage")));
        }
    }
}
