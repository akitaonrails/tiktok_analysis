package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem;

import X.AnonymousClass0797;
import X.AnonymousClass0798;
import X.C01GW;
import X.C07GL;
import X.C09R3;
import X.C0HHT;
import X.C118300cf;
import X.C13LE;
import X.C1558520qew;
import X.C1619980sG4;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C259800zU;
import X.C418440Gaw;
import X.C426750GoL;
import X.C435810H7b;
import X.C452501pT;
import X.C657990PrR;
import X.C659520Ptu;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import Y.AAListenerS317S0100000_6;
import Y.AUListenerS216S0200000_6;
import Y.AUListenerS256S0100000_6;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.ISearchVideoHolderAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoCommentVM;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoHolderVM;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS21S0001000_6;
import kotlin.jvm.internal.AwS284S0300000_6;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS6S0800000_6;
import kotlin.jvm.internal.AwS90S0500000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SearchVideoCommentAssem extends ReusedUIContentAssem<SearchVideoCommentAssem> implements InterfaceC712990Rxx<C659520Ptu> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final C01GW LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchVideoCommentAssem.class, "searchVideoHolderVM", "getSearchVideoHolderVM()Lcom/ss/android/ugc/aweme/search/pages/result/common/searchvideo/core/videwmodel/SearchVideoHolderVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SearchVideoCommentAssem.class, "searchVideoCommentVM", "getSearchVideoCommentVM()Lcom/ss/android/ugc/aweme/search/pages/result/common/searchvideo/core/videwmodel/SearchVideoCommentVM;", 0);
        c09r3.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public SearchVideoCommentAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchVideoHolderVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJJJ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ, 573), null, AFwS236S0000000_6.get$arr$(281));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SearchVideoCommentVM.class);
        this.LLJJJJJIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c0hht, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ2, 574), null, AFwS236S0000000_6.get$arr$(282));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 572));
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final SearchVideoCommentVM cp() {
        return (SearchVideoCommentVM) this.LLJJJJJIL.getValue(this, LLJJL[1]);
    }

    /* JADX WARN: Type inference failed for: r2v30, types: [T, android.view.View] */
    /* JADX WARN: Type inference failed for: r2v32, types: [T, android.view.View] */
    /* JADX WARN: Type inference failed for: r2v34, types: [T, android.view.View] */
    /* JADX WARN: Type inference failed for: r2v36, types: [T, android.view.View] */
    /* JADX WARN: Type inference failed for: r2v38, types: [T, android.view.View] */
    /* JADX WARN: Type inference failed for: r2v40, types: [T, android.view.View] */
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View viewFH1;
        cp().LLILLJJLI = ((SearchVideoHolderVM) this.LLJJJJ.getValue(this, LLJJL[0])).LLILLL;
        ISearchVideoHolderAbility iSearchVideoHolderAbility = (ISearchVideoHolderAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchVideoHolderAbility.class, null);
        if (iSearchVideoHolderAbility != null) {
            viewFH1 = iSearchVideoHolderAbility.fH1();
        } else {
            viewFH1 = null;
        }
        C786410Ut5.LJLZ(8, (ViewGroup) view.findViewById(R.id.nbx));
        View viewFindViewById = view.findViewById(R.id.lcm);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        }
        C259800zU c259800zU = new C259800zU();
        C259800zU c259800zU2 = new C259800zU();
        C259800zU c259800zU3 = new C259800zU();
        C259800zU c259800zU4 = new C259800zU();
        C259800zU c259800zU5 = new C259800zU();
        C259800zU c259800zU6 = new C259800zU();
        C259800zU c259800zU7 = new C259800zU();
        c259800zU7.element = "";
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.zeq);
        if (((Number) AnonymousClass0798.LIZ.getValue()).intValue() == 0) {
            if (tuxTextView != null) {
                tuxTextView.setText(view.getContext().getString(2131821656));
            }
        } else if (tuxTextView != null) {
            tuxTextView.setText(view.getContext().getString(2131830716));
        }
        C01GW c01gw = C07GL.LIZ;
        if (((Number) c01gw.getValue()).intValue() == 1) {
            ?? FindViewById = view.findViewById(R.id.i4i);
            c259800zU.element = FindViewById;
            C426750GoL.LJIIL(FindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, null, null, 30);
            c259800zU2.element = view.findViewById(R.id.nbu);
            c259800zU3.element = view.findViewById(R.id.nbt);
            c259800zU4.element = view.findViewById(R.id.zel);
            c259800zU5.element = view.findViewById(R.id.l93);
            c259800zU6.element = view.findViewById(R.id.zep);
        } else if (tuxTextView != null) {
            C2211631BhB.LJ(tuxTextView, new AwS372S0200000_6(this, view, 20));
        }
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.lcn);
        TuxIconView tuxIconView2 = (TuxIconView) view.findViewById(R.id.lco);
        if (((Number) AnonymousClass0797.LIZ.getValue()).intValue() == 0) {
            if (tuxIconView != null) {
                tuxIconView.setIconRes(R.raw.icon_fire_3_fill);
            }
            if (tuxIconView2 != null) {
                tuxIconView2.setIconRes(R.raw.icon_fire_3_fill);
            }
        } else {
            if (tuxIconView != null) {
                tuxIconView.setIconRes(R.raw.icon_comment_large_fill);
            }
            if (tuxIconView2 != null) {
                tuxIconView2.setIconRes(R.raw.icon_comment_large_fill);
            }
        }
        if (((Number) c01gw.getValue()).intValue() == 2) {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            tuxIconView.setIconWidth(iLIZIZ);
            tuxIconView.setIconHeight(iLIZIZ);
            C657990PrR.LIZJ(tuxIconView, new AwS21S0001000_6(iLIZIZ, 3));
            if (tuxTextView != null) {
                tuxTextView.setTuxFont(72);
            }
        }
        for (View view2 : C1697810uHb.LJIIL(c259800zU.element)) {
            ISearchVideoHolderAbility iSearchVideoHolderAbility2 = (ISearchVideoHolderAbility) this.LLJJJJLIIL.getValue();
            if (iSearchVideoHolderAbility2 != null) {
                iSearchVideoHolderAbility2.Bd2(view2, new C435810H7b(2, null, new AwS90S0500000_6(view2, (View) this, (SearchVideoCommentAssem) c259800zU2, (C259800zU<View>) c259800zU6, (C259800zU<TuxTextView>) c259800zU7, (C259800zU<String>) 0)));
            }
        }
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = 1;
        C736680Sv4.LJIIIIZZ(this, cp(), new C2217381BqS() { // from class: X.0H7P
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2005507tN) obj).LL;
            }
        }, null, new AwS6S0800000_6(c118300cf, (C118300cf) c259800zU, (C259800zU<View>) c259800zU6, (C259800zU<TuxTextView>) c259800zU3, (C259800zU<View>) c259800zU2, (C259800zU<View>) c259800zU4, (C259800zU<TuxTextView>) c259800zU5, (C259800zU<View>) c259800zU7, (C259800zU<String>) 0), 6);
        if (((Number) C07GL.LIZ.getValue()).intValue() == 1) {
            AnimatorSet animatorSet = new AnimatorSet();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat.setStartDelay(50L);
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJI());
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(c259800zU3, 35));
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat2.setStartDelay(250L);
            valueAnimatorOfFloat2.setDuration(200L);
            valueAnimatorOfFloat2.setInterpolator(C1619980sG4.LJI());
            valueAnimatorOfFloat2.addUpdateListener(new AUListenerS216S0200000_6(c259800zU2, viewFH1, 3));
            valueAnimatorOfFloat2.addListener(new AAListenerS317S0100000_6(c259800zU2, 15));
            animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
            AnimatorSet animatorSet2 = new AnimatorSet();
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat3.setStartDelay(50L);
            valueAnimatorOfFloat3.setDuration(200L);
            valueAnimatorOfFloat3.setInterpolator(C1619980sG4.LJI());
            valueAnimatorOfFloat3.addUpdateListener(new AUListenerS256S0100000_6(c259800zU2, 36));
            valueAnimatorOfFloat3.addListener(new AAListenerS317S0100000_6(c259800zU2, 16));
            ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat4.setStartDelay(250L);
            valueAnimatorOfFloat4.setDuration(200L);
            valueAnimatorOfFloat4.setInterpolator(C1619980sG4.LJI());
            valueAnimatorOfFloat4.addUpdateListener(new AUListenerS256S0100000_6(c259800zU3, 37));
            animatorSet2.playTogether(valueAnimatorOfFloat3, valueAnimatorOfFloat4);
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJ.getValue(this, LLJJL[0]), new C2217381BqS() { // from class: X.0H7R
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0H89) obj).LLILLJJLI;
                }
            }, null, new AwS284S0300000_6(c118300cf, animatorSet2, animatorSet, 1), 6);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C659520Ptu c659520Ptu) {
        Object obj;
        C659520Ptu c659520Ptu2 = c659520Ptu;
        SearchVideoCommentVM searchVideoCommentVMCp = cp();
        searchVideoCommentVMCp.LL = c659520Ptu2;
        Comment comment = null;
        if (c659520Ptu2 != null) {
            obj = c659520Ptu2.LLILZ;
        } else {
            obj = null;
        }
        if (obj instanceof Comment) {
            comment = (Comment) obj;
        }
        searchVideoCommentVMCp.LLILLL = comment;
        searchVideoCommentVMCp.setState(new AwS585S0100000_6(searchVideoCommentVMCp, 386));
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

    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object dp(com.bytedance.tux.input.TuxTextView r11, java.lang.String r12, X.InterfaceC1364105Vn<? super java.lang.String> r13) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoCommentAssem.dp(com.bytedance.tux.input.TuxTextView, java.lang.String, X.05Vn):java.lang.Object");
    }
}
