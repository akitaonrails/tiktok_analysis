package com.ss.android.ugc.profile.business.ur.socialavatar.review;

import X.AbstractC683590Qrd;
import X.C019F;
import X.C01GW;
import X.C0HBG;
import X.C0HFS;
import X.C0IDG;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C419940GdM;
import X.C437970HFj;
import X.C452501pT;
import X.C688970R0t;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarSwipeBackgroundAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public C0HBG LLJIJIL;
    public Integer LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SocialAvatarSwipeBackgroundAssem.class, "vm", "getVm()Lcom/ss/android/ugc/profile/business/ur/socialavatar/review/SocialAvatarEditViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SocialAvatarSwipeBackgroundAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SocialAvatarEditViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 960), AFwS236S0000000_6.get$arr$(387), null, true);
        this.LLJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(383));
        this.LLJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 959));
    }

    public final RecyclerView Go() {
        return (RecyclerView) this.LLJI.getValue();
    }

    public final SocialAvatarEditViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (SocialAvatarEditViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.0HBG, X.0HFr, X.19ry] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        BackgroundGalleryLayoutManager backgroundGalleryLayoutManager = (BackgroundGalleryLayoutManager) this.LLJ.getValue();
        RecyclerView recyclerViewGo = Go();
        if (recyclerViewGo != null) {
            backgroundGalleryLayoutManager.LLJJI = recyclerViewGo;
            backgroundGalleryLayoutManager.LLILLL = Math.max(0, 0);
            recyclerViewGo.setLayoutManager(backgroundGalleryLayoutManager);
            backgroundGalleryLayoutManager.LLIZLLLIL.LIZIZ(recyclerViewGo);
            recyclerViewGo.addOnScrollListener(backgroundGalleryLayoutManager.LLJ);
            ((BackgroundGalleryLayoutManager) this.LLJ.getValue()).LLJILLL = new C419940GdM();
            ((BackgroundGalleryLayoutManager) this.LLJ.getValue()).LLJJ = new C437970HFj(this);
            Ho();
            ?? r1 = new AbstractC683590Qrd<C0HFS>() { // from class: X.0HBG
                @Override // X.AbstractC438050HFr
                public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                    C0HFS c0hfs;
                    ISocialAvatarService iSocialAvatarService;
                    List<C0HFS> data = getData();
                    if (data != null && i < data.size()) {
                        c0hfs = (C0HFS) ListProtector.get(data, i);
                    } else {
                        c0hfs = null;
                    }
                    C427660Gpo c427660Gpo = (C427660Gpo) viewHolder.itemView.findViewById(R.id.bo6);
                    if (c427660Gpo != null) {
                        C0HBV c0hbv = C0HBV.LIZ;
                        Context context = viewHolder.itemView.getContext();
                        c0hbv.getClass();
                        int iLIZ = C0HBV.LIZ(context);
                        ViewGroup.LayoutParams layoutParams = c427660Gpo.getLayoutParams();
                        layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iLIZ)));
                        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iLIZ)));
                        C786410Ut5.H6(c427660Gpo, layoutParams);
                        if (c0hfs != null && (iSocialAvatarService = (ISocialAvatarService) PluggableExtentionKt.pluggableSpi$default(ISocialAvatarService.class, false, false, false, 14, null)) != null) {
                            iSocialAvatarService.LIZLLL(c0hfs, c427660Gpo, null);
                        }
                    }
                }

                @Override // X.AbstractC438050HFr
                public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
                    return new C1087710ePZ(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eih, viewGroup, false));
                }
            };
            r1.setShowFooter(false);
            Go().setAdapter(r1);
            this.LLJIJIL = r1;
            Go().addItemDecoration(new C0IDG(7));
            Go().setEdgeEffectFactory(new C688970R0t() { // from class: X.19d4
                @Override // X.C688970R0t
                public final EdgeEffect LIZ(final RecyclerView recyclerView, final int i) {
                    return new EdgeEffect(recyclerView.getContext()) { // from class: X.19d1
                        @Override // android.widget.EdgeEffect
                        public final void onRelease() {
                            super.onRelease();
                            RecyclerView recyclerView2 = recyclerView;
                            int childCount = recyclerView2.getChildCount();
                            for (int i2 = 0; i2 < childCount; i2++) {
                                RecyclerView.ViewHolder childViewHolder = recyclerView2.getChildViewHolder(recyclerView2.getChildAt(i2));
                                if (childViewHolder == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.profile.business.ur.socialavatar.review.BackgroundSwipeRecyclerViewHolder");
                                }
                                ((C1087710ePZ) childViewHolder).LL.LJIIIZ();
                            }
                        }

                        public final void LIZ(float f) {
                            int i2;
                            if (i == 2) {
                                i2 = -1;
                            } else {
                                i2 = 1;
                            }
                            float height = i2 * recyclerView.getHeight() * f * 0.2f;
                            RecyclerView recyclerView2 = recyclerView;
                            int childCount = recyclerView2.getChildCount();
                            for (int i3 = 0; i3 < childCount; i3++) {
                                RecyclerView.ViewHolder childViewHolder = recyclerView2.getChildViewHolder(recyclerView2.getChildAt(i3));
                                if (childViewHolder != null) {
                                    C1087710ePZ c1087710ePZ = (C1087710ePZ) childViewHolder;
                                    c1087710ePZ.LL.LIZLLL();
                                    View view2 = c1087710ePZ.itemView;
                                    C786410Ut5.Jc(view2, view2.getTranslationX() + height);
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.profile.business.ur.socialavatar.review.BackgroundSwipeRecyclerViewHolder");
                                }
                            }
                        }

                        @Override // android.widget.EdgeEffect
                        public final void onAbsorb(int i2) {
                            int i3;
                            super.onAbsorb(i2);
                            if (i == 2) {
                                i3 = -1;
                            } else {
                                i3 = 1;
                            }
                            float f = i3 * i2 * 0.5f;
                            RecyclerView recyclerView2 = recyclerView;
                            int childCount = recyclerView2.getChildCount();
                            for (int i4 = 0; i4 < childCount; i4++) {
                                RecyclerView.ViewHolder childViewHolder = recyclerView2.getChildViewHolder(recyclerView2.getChildAt(i4));
                                if (childViewHolder != null) {
                                    C21616519il c21616519il = ((C1087710ePZ) childViewHolder).LL;
                                    c21616519il.LIZ = f;
                                    c21616519il.LJIIIZ();
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.profile.business.ur.socialavatar.review.BackgroundSwipeRecyclerViewHolder");
                                }
                            }
                        }

                        @Override // android.widget.EdgeEffect
                        public final void onPull(float f) {
                            super.onPull(f);
                            LIZ(f);
                        }

                        @Override // android.widget.EdgeEffect
                        public final void onPull(float f, float f2) {
                            super.onPull(f, f2);
                            LIZ(f);
                        }
                    };
                }
            });
            C0HBG c0hbg = this.LLJIJIL;
            if (c0hbg == null) {
                c0hbg = null;
            }
            c0hbg.addData(Ho().wQ2());
            Go().scrollToPosition(Ho().wQ2().size() - 1);
            C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0HFn
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0HNI) obj).LLILZ;
                }
            }, null, new AwS620S0100000_6(this, 100), 6);
            return;
        }
        backgroundGalleryLayoutManager.getClass();
        "The attach RecycleView must not null!!".toString();
        throw new IllegalArgumentException("The attach RecycleView must not null!!");
    }
}
