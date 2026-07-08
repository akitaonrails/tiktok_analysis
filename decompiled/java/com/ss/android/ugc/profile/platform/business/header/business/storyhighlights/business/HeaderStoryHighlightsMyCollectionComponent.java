package com.ss.android.ugc.profile.platform.business.header.business.storyhighlights.business;

import X.AbstractC21673619ry;
import X.AbstractC21688119uJ;
import X.AbstractC471570IeR;
import X.AbstractC738140SxQ;
import X.C06US;
import X.C06UV;
import X.C0LAB;
import X.C0PEM;
import X.C1220000hqw;
import X.C1250210idf;
import X.C13LE;
import X.C1412505fv;
import X.C1558520qew;
import X.C1674830tgX;
import X.C1767006w0;
import X.C19719912Dl;
import X.C20684815ws;
import X.C21688219uK;
import X.C2217381BqS;
import X.C2262491Dh1;
import X.C2262511Dh3;
import X.C23250099c;
import X.C268330AfP;
import X.C418440Gaw;
import X.C420601kK;
import X.C451610HnL;
import X.C452070Ho5;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC21676519sR;
import X.InterfaceC2217461Bqa;
import Y.AsS30S0100000_2;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.b2c.actionbar.ActionBarButtonConfBusiness;
import com.ss.android.ugc.aweme.story.highlights.feed.MyProfileStoryHighlightsFeedSharedVM;
import com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager;
import com.ss.android.ugc.profile.business.story.data.StoryHighlightsProfileData;
import com.ss.android.ugc.profile.business.story.highlights.StoryHighlightsCenterLinearLayoutManager;
import com.ss.android.ugc.profile.business.story.highlights.StoryHighlightsMyProfileVM;
import com.ss.android.ugc.profile.platform.base.component.BaseUIComponent;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.business.storyhighlights.base.IHeaderStoryHighlightsAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS403S0200000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS651S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class HeaderStoryHighlightsMyCollectionComponent extends BaseUIComponent {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public final AssemVMLazy LLJJL;
    public final C736950SvV LLJJLIIIJLLLLLLLZ;
    public RecyclerView LLJL;
    public C1674830tgX LLJLIL;
    public final Set<String> LLJLILLLLZIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HeaderStoryHighlightsMyCollectionComponent.class, "highlightsVM", "getHighlightsVM()Lcom/ss/android/ugc/profile/business/story/highlights/StoryHighlightsMyProfileVM;", 0);
        C13LE.LIZ.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Oo() {
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Jo() {
        IHeaderStoryHighlightsAbility iHeaderStoryHighlightsAbility;
        View view = this.LLJJ;
        if (view == null || (iHeaderStoryHighlightsAbility = (IHeaderStoryHighlightsAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderStoryHighlightsAbility.class, null)) == null) {
            return;
        }
        String str = this.assemTagInternal;
        if (str == null) {
            str = "";
        }
        iHeaderStoryHighlightsAbility.LJIIIZ(this.LLJILLL, view, str);
    }

    public final void up() {
        C1674830tgX c1674830tgX;
        LinearLayoutManager linearLayoutManager;
        IStoryHighlightsMyDataManager iStoryHighlightsMyDataManager = (IStoryHighlightsMyDataManager) PluggableExtentionKt.pluggableSpi$default(IStoryHighlightsMyDataManager.class, false, false, false, 14, null);
        if (iStoryHighlightsMyDataManager == null || (c1674830tgX = this.LLJLIL) == null) {
            return;
        }
        RecyclerView recyclerView = this.LLJL;
        RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition < 0 || iFindLastVisibleItemPosition < 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int itemCount = c1674830tgX.getItemCount();
        int i = 0;
        while (iFindFirstVisibleItemPosition < itemCount && ((i < 5 || !arrayList.isEmpty()) && arrayList.size() < 5)) {
            StoryHighlightCollection storyHighlightCollectionLLLFZ = c1674830tgX.LLLFZ(iFindFirstVisibleItemPosition);
            if (storyHighlightCollectionLLLFZ != null) {
                i++;
                if (!iStoryHighlightsMyDataManager.LJIIZILJ(storyHighlightCollectionLLLFZ.collectionId)) {
                    arrayList.add(storyHighlightCollectionLLLFZ.collectionId);
                }
            }
            iFindFirstVisibleItemPosition++;
        }
        yp().setState(new AwS581S0100000_2((List) arrayList, (List<ActionBarButtonConfBusiness>) 485));
    }

    public final StoryHighlightsMyProfileVM yp() {
        AssemVMLazy assemVMLazy = this.LLJJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLL;
        return (StoryHighlightsMyProfileVM) assemVMLazy.getValue();
    }

    public HeaderStoryHighlightsMyCollectionComponent() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoryHighlightsMyProfileVM.class);
        AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(c19719912DlLIZ, 893);
        AFwS229S0000000_2 aFwS229S0000000_2 = AFwS229S0000000_2.get$arr$(542);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS546S0100000_2, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS546S0100000_2((AbstractC738140SxQ) this, 894), aFwS229S0000000_2, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJJL = assemVMLazy;
        AFwS187S0000000_2 aFwS187S0000000_2 = AFwS187S0000000_2.get$arr$(745);
        this.LLJJLIIIJLLLLLLLZ = new C736950SvV(C13LE.LIZ(MyProfileStoryHighlightsFeedSharedVM.class), aFwS187S0000000_2, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS229S0000000_2.get$arr$(543), new AwS546S0100000_2((AbstractC738140SxQ) this, 895), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJLILLLLZIIL = new LinkedHashSet();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC1248970ibf
    public final void Hj(ProfileComponents profileComponents) {
        super.Hj(profileComponents);
        n nVar = profileComponents.bizData;
        if (nVar != null) {
            ep(nVar);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View So(ProfileComponentUIConfig profileComponentUIConfig) {
        float fLIZIZ;
        float fLIZIZ2;
        int paddingLeft;
        int paddingRight;
        AbstractC21673619ry adapter;
        RecyclerView.LayoutManager storyHighlightsCenterLinearLayoutManager;
        Context context = getContext();
        FragmentManager childFragmentManager = null;
        if (context == null) {
            return null;
        }
        RecyclerView recyclerView = new RecyclerView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        layoutParams.setMargins(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        C786410Ut5.p6(recyclerView, layoutParams);
        recyclerView.setClipToPadding(false);
        recyclerView.setClipChildren(false);
        boolean zLJIIIZ = C268330AfP.LJIIIZ();
        if (zLJIIIZ) {
            fLIZIZ = C418440Gaw.LIZIZ(12);
        } else {
            fLIZIZ = C418440Gaw.LIZIZ(8);
        }
        int iLIZIZ = C814420VxA.LIZIZ(fLIZIZ);
        if (zLJIIIZ) {
            fLIZIZ2 = C418440Gaw.LIZIZ(6);
        } else {
            fLIZIZ2 = C418440Gaw.LIZIZ(8);
        }
        int iLIZIZ2 = C814420VxA.LIZIZ(fLIZIZ2);
        RecyclerView recyclerView2 = this.LLJL;
        if (recyclerView2 != null) {
            paddingLeft = recyclerView2.getPaddingLeft();
        } else {
            paddingLeft = 0;
        }
        RecyclerView recyclerView3 = this.LLJL;
        if (recyclerView3 != null) {
            paddingRight = recyclerView3.getPaddingRight();
        } else {
            paddingRight = 0;
        }
        recyclerView.setPadding(paddingLeft, iLIZIZ, paddingRight, iLIZIZ2);
        recyclerView.addItemDecoration(new C1767006w0(context, 10));
        recyclerView.addOnScrollListener(new AsS30S0100000_2(this, 1));
        this.LLJL = recyclerView;
        this.LLJLIL = new C1674830tgX(6, new AwS403S0200000_2(this, context, 38), null, null);
        RecyclerView recyclerView4 = this.LLJL;
        if (recyclerView4 != null) {
            if (C268330AfP.LJIIIZ()) {
                storyHighlightsCenterLinearLayoutManager = new LinearLayoutManager(context, 0, false);
            } else {
                storyHighlightsCenterLinearLayoutManager = new StoryHighlightsCenterLinearLayoutManager(context, 0, false);
            }
            recyclerView4.setLayoutManager(storyHighlightsCenterLinearLayoutManager);
            recyclerView4.setAdapter(this.LLJLIL);
        }
        RecyclerView recyclerView5 = this.LLJL;
        if (recyclerView5 != null) {
            recyclerView5.addOnChildAttachStateChangeListener(new InterfaceC21676519sR() { // from class: X.06UT
                @Override // X.InterfaceC21676519sR
                public final void m3(View view) {
                }

                @Override // X.InterfaceC21676519sR
                public final void g5(View view) {
                    int childAdapterPosition;
                    C1674830tgX c1674830tgX;
                    StoryHighlightCollection storyHighlightCollectionLLLFZ;
                    String str;
                    int iIntValue;
                    RecyclerView recyclerView6 = this.LL.LLJL;
                    if (recyclerView6 != null && (childAdapterPosition = recyclerView6.getChildAdapterPosition(view)) != -1 && childAdapterPosition != 0 && (c1674830tgX = this.LL.LLJLIL) != null && (storyHighlightCollectionLLLFZ = c1674830tgX.LLLFZ(childAdapterPosition)) != null && (str = storyHighlightCollectionLLLFZ.collectionId) != null && this.LL.LLJLILLLLZIIL.add(str)) {
                        this.LL.yp();
                        Integer num = storyHighlightCollectionLLLFZ.count;
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        C06US.LIZ.getClass();
                        C06US.LJFF(iIntValue, childAdapterPosition - 1, -1, "personal_homepage", str, "other");
                    }
                }
            });
        }
        C1674830tgX c1674830tgX = this.LLJLIL;
        if (c1674830tgX != null) {
            StoryHighlightsMyProfileVM storyHighlightsMyProfileVMYp = yp();
            MyProfileStoryHighlightsFeedSharedVM myProfileStoryHighlightsFeedSharedVM = (MyProfileStoryHighlightsFeedSharedVM) this.LLJJLIIIJLLLLLLLZ.getValue();
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null) {
                childFragmentManager = fragmentLJI.getChildFragmentManager();
            }
            C06UV c06uv = new C06UV(c1674830tgX, storyHighlightsMyProfileVMYp, myProfileStoryHighlightsFeedSharedVM, childFragmentManager, context, C724240Sb0.LJI(this));
            RecyclerView recyclerView6 = this.LLJL;
            if (recyclerView6 != null) {
                C2262511Dh3 c2262511Dh3 = new C2262511Dh3(0.9f, 1.2f, 39);
                final C2262491Dh1 c2262491Dh1 = new C2262491Dh1();
                c2262491Dh1.LIZ = recyclerView6;
                c2262491Dh1.LIZJ = c06uv;
                c2262491Dh1.LJFF = c2262511Dh3;
                C21688219uK c21688219uK = new C21688219uK(new AbstractC21688119uJ() { // from class: X.1Dh2
                    @Override // X.AbstractC21688119uJ
                    public final boolean LJII() {
                        return false;
                    }

                    @Override // X.AbstractC21688119uJ
                    public final boolean LJIIIIZZ() {
                        return false;
                    }

                    @Override // X.AbstractC21688119uJ
                    public final void LJIILL() {
                    }

                    @Override // X.AbstractC21688119uJ
                    public final boolean LIZ(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                        if (viewHolder2.getAdapterPosition() != 0) {
                            return true;
                        }
                        return false;
                    }

                    @Override // X.AbstractC21688119uJ
                    public final void LIZJ(RecyclerView recyclerView7, RecyclerView.ViewHolder viewHolder) {
                        C2262481Dh0 c2262481Dh0;
                        super.LIZJ(recyclerView7, viewHolder);
                        recyclerView7.requestDisallowInterceptTouchEvent(false);
                        Object tag = viewHolder.itemView.getTag(R.id.s6b);
                        if ((tag instanceof C2262481Dh0) && (c2262481Dh0 = (C2262481Dh0) tag) != null) {
                            c2262481Dh0.LIZ();
                            c2262481Dh0.LJIIJ = false;
                            C2262491Dh1 c2262491Dh12 = c2262491Dh1;
                            c2262491Dh12.getClass();
                            viewHolder.itemView.setOnTouchListener(new ViewOnTouchListenerC2262471Dgz(c2262491Dh12, c2262481Dh0));
                            return;
                        }
                        c2262491Dh1.LIZ(viewHolder);
                    }

                    @Override // X.AbstractC21688119uJ
                    public final int LJFF(RecyclerView recyclerView7, RecyclerView.ViewHolder viewHolder) {
                        if (viewHolder.getAdapterPosition() == 0) {
                            return 0;
                        }
                        return AbstractC21688119uJ.LJIIIZ(12, 0);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
                    @Override // X.AbstractC21688119uJ
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LJIILJJIL(androidx.recyclerview.widget.RecyclerView.ViewHolder r9, int r10) {
                        /*
                            r8 = this;
                            if (r10 == 0) goto Lf
                            r0 = 2
                            if (r10 != r0) goto Le
                            X.1Dh1 r0 = r1
                            r0.LJ = r9
                            if (r9 == 0) goto Le
                            r9.getAdapterPosition()
                        Le:
                            return
                        Lf:
                            X.1Dh1 r0 = r1
                            androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = r0.LJ
                            r3 = 0
                            if (r4 == 0) goto L70
                            android.view.View r1 = r4.itemView
                            r0 = 2131386827(0x7f0a61cb, float:1.8394123E38)
                            java.lang.Object r5 = r1.getTag(r0)
                            boolean r0 = r5 instanceof X.C2262481Dh0
                            if (r0 == 0) goto L77
                            X.1Dh0 r5 = (X.C2262481Dh0) r5
                            r6 = 0
                            r7 = 1
                            if (r5 == 0) goto L77
                            boolean r0 = r5.LJIIJ
                            if (r0 != r7) goto L5c
                            int r1 = r4.getAdapterPosition()
                            r0 = -1
                            if (r1 == r0) goto L5a
                            X.1Dh1 r0 = r1
                            X.1Dh4 r0 = r0.LIZJ
                            if (r0 == 0) goto L75
                            java.lang.String r2 = r0.getItemId(r1)
                        L3e:
                            if (r1 <= r7) goto L4d
                            X.1Dh1 r0 = r1
                            X.1Dh4 r0 = r0.LIZJ
                            if (r0 == 0) goto L4d
                            int r1 = r1 - r7
                            java.lang.String r1 = r0.getItemId(r1)
                            if (r1 != 0) goto L4f
                        L4d:
                            java.lang.String r1 = ""
                        L4f:
                            if (r2 == 0) goto L5a
                            X.1Dh1 r0 = r1
                            X.1Dh4 r0 = r0.LIZJ
                            if (r0 == 0) goto L5a
                            r0.LIZJ(r2, r1)
                        L5a:
                            if (r5 == 0) goto L77
                        L5c:
                            r5.LIZ()
                            r5.LJIIJ = r6
                            X.1Dh1 r0 = r1
                            r0.getClass()
                            X.1Dgz r1 = new X.1Dgz
                            r1.<init>(r0, r5)
                            android.view.View r0 = r4.itemView
                            r0.setOnTouchListener(r1)
                        L70:
                            X.1Dh1 r0 = r1
                            r0.LJ = r3
                            return
                        L75:
                            r2 = r3
                            goto L3e
                        L77:
                            X.1Dh1 r0 = r1
                            r0.LIZ(r4)
                            goto L70
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C2262501Dh2.LJIILJJIL(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
                    }

                    @Override // X.AbstractC21688119uJ
                    public final boolean LJIIL(RecyclerView recyclerView7, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                        InterfaceC2262521Dh4 interfaceC2262521Dh4;
                        int adapterPosition = viewHolder.getAdapterPosition();
                        int adapterPosition2 = viewHolder2.getAdapterPosition();
                        if (adapterPosition != 0 && adapterPosition2 != 0 && adapterPosition != -1 && adapterPosition2 != -1 && (interfaceC2262521Dh4 = c2262491Dh1.LIZJ) != null) {
                            interfaceC2262521Dh4.onMove(adapterPosition, adapterPosition2);
                            return true;
                        }
                        return false;
                    }
                });
                c2262491Dh1.LIZIZ = c21688219uK;
                c21688219uK.LJ(recyclerView6);
                RecyclerView recyclerView7 = c2262491Dh1.LIZ;
                if (recyclerView7 != null && (adapter = recyclerView7.getAdapter()) != null) {
                    adapter.registerAdapterDataObserver(new AbstractC471570IeR() { // from class: X.06XK
                        @Override // X.AbstractC471570IeR
                        public final void LIZLLL(final int i, final int i2) {
                            final C2262491Dh1 c2262491Dh12 = c2262491Dh1;
                            RecyclerView recyclerView8 = c2262491Dh12.LIZ;
                            if (recyclerView8 != null) {
                                HandlerHook.viewPost(recyclerView8, new Runnable() { // from class: X.06XL
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean zLIZ;
                                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
                                        C1C7U.LIZ("StoryHighlightsListGestureHelper@ddbb.setupAdapterObserver$1$onItemRangeInserted$1");
                                        try {
                                            int i3 = i;
                                            int i4 = i2 + i3;
                                            while (i3 < i4) {
                                                RecyclerView recyclerView9 = c2262491Dh12.LIZ;
                                                if (recyclerView9 != null && (viewHolderFindViewHolderForAdapterPosition = recyclerView9.findViewHolderForAdapterPosition(i3)) != null) {
                                                    c2262491Dh12.LIZ(viewHolderFindViewHolderForAdapterPosition);
                                                }
                                                i3++;
                                            }
                                        } finally {
                                            if (!zLIZ) {
                                            }
                                        }
                                        C1C7U.LIZIZ("StoryHighlightsListGestureHelper@ddbb.setupAdapterObserver$1$onItemRangeInserted$1");
                                    }
                                });
                            }
                        }
                    });
                }
                C1674830tgX c1674830tgX2 = this.LLJLIL;
                if (c1674830tgX2 != null) {
                    c1674830tgX2.LLILZIL = c2262491Dh1;
                }
            }
        }
        yp();
        C06US.LIZ.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "personal_homepage");
        c0lab.LJ("enter_method", "personal_fixed_entrance");
        C20684815ws.LJIILLIIL("ttsocial_story_highlight_create_btn_show", c0lab.LIZ);
        return this.LLJL;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void ep(n nVar) {
        try {
            StoryHighlightsProfileData storyHighlightsProfileData = (StoryHighlightsProfileData) C1250210idf.LIZ(nVar.toString(), StoryHighlightsProfileData.class);
            if (storyHighlightsProfileData != null) {
                List<StoryHighlightCollection> highlightCollections = storyHighlightsProfileData.getHighlightCollections();
                if (highlightCollections != null) {
                    C23250099c.LIZLLL(ViewModelKt.getViewModelScope(yp()), C0PEM.LIZJ, null, new C420601kK(highlightCollections, null), 2);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(fragmentLJI.getViewLifecycleOwner()), null, null, new C1412505fv(fragmentLJI, this, null), 3);
            C736680Sv4.LJIIIZ(this, yp(), new C2217381BqS() { // from class: X.05nG
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C05ND) obj).LL);
                }
            }, new C2217381BqS() { // from class: X.05nI
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C05ND) obj).LLILLJJLI;
                }
            }, null, new AwS651S0100000_2(this, 6), 12);
        }
    }
}
