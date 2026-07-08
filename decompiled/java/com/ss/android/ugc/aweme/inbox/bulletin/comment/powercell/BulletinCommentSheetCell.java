package com.ss.android.ugc.aweme.inbox.bulletin.comment.powercell;

import X.C01GW;
import X.C036E;
import X.C0GY9;
import X.C0OTO;
import X.C0OTS;
import X.C0OWY;
import X.C0OY1;
import X.C0PEM;
import X.C0QSJ;
import X.C1196320hEk;
import X.C1220000hqw;
import X.C123100dR;
import X.C127G;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1356610lPH;
import X.C1389890mGx;
import X.C13LE;
import X.C13LP;
import X.C1623706Xj;
import X.C1843500y4a;
import X.C1954807lC;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C23250099c;
import X.C259800zU;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C427690Gpr;
import X.C430560GuU;
import X.C438710HIf;
import X.C452070Ho5;
import X.C452501pT;
import X.C619000OPq;
import X.C621000OXi;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736820SvI;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC620990OXh;
import X.InterfaceC1146704e9;
import X.InterfaceC1334290kpH;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import X.ViewTreeObserverOnGlobalLayoutListenerC462870IDd;
import Y.AAListenerS320S0100000_9;
import Y.AObjectS384S0100000_9;
import Y.AObjectS62S0000000_9;
import Y.ATListenerS337S0200000_9;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentActionViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentListViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS361S0000000_9;
import wh6.AbS691S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public class BulletinCommentSheetCell extends PowerCell<C0OTS> implements InterfaceC713360RyY, InterfaceC1146704e9 {
    public static final /* synthetic */ int LLJJ = 0;
    public AnimatorSet LLILLJJLI;
    public AnimatorSet LLILLL;
    public AnimatorSet LLILZ;
    public AnimatorSet LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public final C736950SvV LLJI;
    public final C01GW LLJIJIL;
    public C127G LLJILJIL;
    public InterfaceC665370Q7z LLJILJILJ;
    public C0QSJ LLJILLL;
    public final int LL = 8;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(140));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 505));

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BulletinFragmentScope.class});
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.a6h;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLJ.getValue();
    }

    public final void N5() {
        if (((C0OWY) ((AssemViewModel) this.LLJI.getValue()).getState()).LL instanceof C1623706Xj) {
            return;
        }
        this.itemView.getContext();
        try {
            if (C036E.LIZ.LIZIZ()) {
                C0OTS item = getItem();
                if (item != null && !item.LLIZ) {
                    P5();
                    C1389890mGx c1389890mGx = new C1389890mGx(this.itemView);
                    c1389890mGx.LJIIIZ(2131827938);
                    c1389890mGx.LJIIJJI();
                    return;
                }
                C0OTS item2 = getItem();
                if (item2 == null) {
                    return;
                }
                boolean z = !item2.LL.isUserDigged();
                int diggCount = item2.LL.getDiggCount() + (z ? 1 : -1);
                boolean z2 = item2.LLILZ ? z : item2.LL.isAuthorDigged;
                if (z) {
                    AnimatorSet animatorSet = this.LLILZ;
                    if (animatorSet != null) {
                        animatorSet.start();
                    }
                } else {
                    AnimatorSet animatorSet2 = this.LLILZIL;
                    if (animatorSet2 != null) {
                        animatorSet2.start();
                    }
                }
                S5(Boolean.valueOf(z), Integer.valueOf(diggCount), Boolean.valueOf(z2), item2.LLJILJIL);
                BulletinCommentActionViewModel bulletinCommentActionViewModel = (BulletinCommentActionViewModel) this.LLJI.getValue();
                Context context = this.itemView.getContext();
                int i = z ? 1 : 2;
                bulletinCommentActionViewModel.setState(AFwS240S0000000_9.get$arr$(940));
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(bulletinCommentActionViewModel), C0PEM.LIZJ, null, new C0OTO(i, bulletinCommentActionViewModel, item2, context, null), 2);
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        P5();
        C1389890mGx c1389890mGx2 = new C1389890mGx(this.itemView);
        c1389890mGx2.LJIIIZ(2131837962);
        c1389890mGx2.LJIIJJI();
    }

    public final void P5() {
        TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.lmj);
        if (tuxIconView != null) {
            tuxIconView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        }
        TuxIconView tuxIconView2 = (TuxIconView) this.itemView.findViewById(R.id.lf0);
        if (tuxIconView2 != null) {
            tuxIconView2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        View viewFindViewById;
        super.onItemViewCreated();
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LLJI.getValue(), new C2217381BqS() { // from class: X.0OY2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OWY) obj).LL;
            }
        }, this, C736820SvI.LIZLLL(), new AwS588S0100000_9(this, 619), null, AFwS240S0000000_9.get$arr$(923), 16, null);
        View viewFindViewById2 = this.itemView.findViewById(R.id.lmj);
        if (viewFindViewById2 != null && (viewFindViewById = this.itemView.findViewById(R.id.lf0)) != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewFindViewById, "scaleX", 1.0f, 0.8f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(viewFindViewById, "scaleY", 1.0f, 0.8f);
            animatorSet.setDuration(100L);
            animatorSet.setInterpolator(new LinearInterpolator());
            animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
            this.LLILLL = animatorSet;
            animatorSet.addListener(new AAListenerS320S0100000_9(this, 4));
            AnimatorSet animatorSet2 = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(viewFindViewById2, "scaleX", 1.0f, 0.8f);
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewFindViewById2, "scaleY", 1.0f, 0.8f);
            animatorSet2.setDuration(100L);
            animatorSet2.setInterpolator(new LinearInterpolator());
            animatorSet2.play(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4);
            this.LLILLJJLI = animatorSet2;
            animatorSet2.addListener(new AAListenerS320S0100000_9(this, 5));
            AnimatorSet animatorSet3 = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(viewFindViewById, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat5.setDuration(100L);
            objectAnimatorOfFloat5.setInterpolator(new LinearInterpolator());
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(viewFindViewById, "scaleX", 0.8f, 1.0f);
            objectAnimatorOfFloat6.setDuration(200L);
            objectAnimatorOfFloat6.setInterpolator(C0GY9.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
            ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(viewFindViewById, "scaleY", 0.8f, 1.0f);
            objectAnimatorOfFloat7.setDuration(200L);
            objectAnimatorOfFloat7.setInterpolator(C0GY9.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
            ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(viewFindViewById2, "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat8.setDuration(100L);
            objectAnimatorOfFloat8.setInterpolator(new LinearInterpolator());
            ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(viewFindViewById2, "scaleX", 0.8f, 1.0f);
            objectAnimatorOfFloat9.setDuration(200L);
            objectAnimatorOfFloat9.setInterpolator(C0GY9.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
            ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(viewFindViewById2, "scaleY", 0.8f, 1.0f);
            objectAnimatorOfFloat10.setDuration(200L);
            objectAnimatorOfFloat10.setInterpolator(C0GY9.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
            animatorSet3.play(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6).with(objectAnimatorOfFloat7).with(objectAnimatorOfFloat8).with(objectAnimatorOfFloat9).with(objectAnimatorOfFloat10);
            this.LLILZIL = animatorSet3;
            animatorSet3.addListener(new AAListenerS320S0100000_9(this, 6));
            AnimatorSet animatorSet4 = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat11 = ObjectAnimator.ofFloat(viewFindViewById2, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat11.setDuration(0L);
            ObjectAnimator objectAnimatorOfFloat12 = ObjectAnimator.ofFloat(viewFindViewById2, "scaleX", 0.0f, 1.0f);
            objectAnimatorOfFloat12.setDuration(300L);
            objectAnimatorOfFloat12.setInterpolator(C0GY9.LIZIZ(0.34f, 1.56f, 0.64f, 1.0f));
            ObjectAnimator objectAnimatorOfFloat13 = ObjectAnimator.ofFloat(viewFindViewById2, "scaleY", 0.0f, 1.0f);
            objectAnimatorOfFloat13.setDuration(300L);
            objectAnimatorOfFloat13.setInterpolator(C0GY9.LIZIZ(0.34f, 1.56f, 0.64f, 1.0f));
            ObjectAnimator objectAnimatorOfFloat14 = ObjectAnimator.ofFloat(viewFindViewById, "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat14.setDuration(100L);
            objectAnimatorOfFloat14.setInterpolator(new LinearInterpolator());
            ObjectAnimator objectAnimatorOfFloat15 = ObjectAnimator.ofFloat(viewFindViewById, "scaleX", 1.0f, 1.0f);
            objectAnimatorOfFloat15.setDuration(0L);
            ObjectAnimator objectAnimatorOfFloat16 = ObjectAnimator.ofFloat(viewFindViewById, "scaleY", 1.0f, 1.0f);
            objectAnimatorOfFloat16.setDuration(0L);
            AnimatorSet animatorSet5 = new AnimatorSet();
            animatorSet5.play(objectAnimatorOfFloat15).with(objectAnimatorOfFloat16);
            animatorSet4.play(objectAnimatorOfFloat13).with(objectAnimatorOfFloat12).with(objectAnimatorOfFloat11).with(objectAnimatorOfFloat14).after(animatorSet5);
            this.LLILZ = animatorSet4;
            animatorSet4.addListener(new AAListenerS320S0100000_9(this, 7));
            View viewFindViewById3 = this.itemView.findViewById(R.id.mn6);
            if (viewFindViewById3 != null) {
                C786410Ut5.I7(new AbS361S0000000_9(1), viewFindViewById3);
            }
        }
        this.itemView.setOnTouchListener(new ATListenerS337S0200000_9(new C259800zU(), this, 3));
        View viewFindViewById4 = this.itemView.findViewById(R.id.bh2);
        if (viewFindViewById4 != null) {
            C427690Gpr.LJFF(viewFindViewById4, C418440Gaw.LIZIZ(36));
        }
        View viewFindViewById5 = this.itemView.findViewById(R.id.title);
        if (viewFindViewById5 != null) {
            C427690Gpr.LJI(viewFindViewById5, null);
        }
        View viewFindViewById6 = this.itemView.findViewById(R.id.ed1);
        if (viewFindViewById6 != null) {
            C427690Gpr.LJI(viewFindViewById6, null);
        }
        View viewFindViewById7 = this.itemView.findViewById(R.id.ecz);
        if (viewFindViewById7 != null) {
            C427690Gpr.LJI(viewFindViewById7, null);
        }
        View viewFindViewById8 = this.itemView.findViewById(R.id.mn6);
        if (viewFindViewById8 != null) {
            C427690Gpr.LJI(viewFindViewById8, null);
        }
        AwS588S0100000_9 awS588S0100000_9 = new AwS588S0100000_9(this, 620);
        View viewFindViewById9 = this.itemView.findViewById(R.id.bh2);
        if (viewFindViewById9 != null) {
            C786410Ut5.I7(new AbS691S0100000_9(awS588S0100000_9, 62, 42), viewFindViewById9);
        }
        View viewFindViewById10 = this.itemView.findViewById(R.id.title);
        if (viewFindViewById10 != null) {
            C786410Ut5.I7(new AbS691S0100000_9(awS588S0100000_9, 63, 42), viewFindViewById10);
        }
        View viewFindViewById11 = this.itemView.findViewById(R.id.ed1);
        if (viewFindViewById11 != null) {
            C786410Ut5.I7(new AbS691S0100000_9(this, 64, 42), viewFindViewById11);
        }
        View viewFindViewById12 = this.itemView.findViewById(R.id.ecz);
        if (viewFindViewById12 != null) {
            C786410Ut5.I7(new AbS691S0100000_9(this, 61, 42), viewFindViewById12);
        }
        View viewFindViewById13 = this.itemView.findViewById(R.id.sh5);
        if (viewFindViewById13 != null) {
            C786410Ut5.I7(new AbS691S0100000_9(this, 60, 42), viewFindViewById13);
        }
        C2211631BhB.LJ(this.itemView, new AwS588S0100000_9(this, 618));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        C430560GuU c430560GuU = (C430560GuU) this.itemView.findViewById(R.id.eu1);
        if (c430560GuU != null) {
            ViewTreeObserverOnGlobalLayoutListenerC462870IDd viewTreeObserverOnGlobalLayoutListenerC462870IDd = c430560GuU.LLJJJJJIL;
            if (viewTreeObserverOnGlobalLayoutListenerC462870IDd != null) {
                C786410Ut5.C3(c430560GuU.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC462870IDd);
            }
            c430560GuU.LLJJJJJIL = null;
            if (c430560GuU.LLJJJJLIIL != null) {
                C786410Ut5.D3(c430560GuU.getViewTreeObserver(), c430560GuU.LLJJJJLIIL);
            }
            c430560GuU.LLJJJJLIIL = null;
        }
        super.onViewDetachedFromWindow();
    }

    public BulletinCommentSheetCell() {
        C13LE.LIZ(BulletinCommentListViewModel.class);
        AFwS240S0000000_9.get$arr$(293);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        C724750Sbp.LJII(this);
        C1220000hqw.LIZ(this);
        this.LLJI = new C736950SvV(C13LE.LIZ(BulletinCommentActionViewModel.class), null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(294), null, null, null);
        this.LLJIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 504));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJILJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJILJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{BulletinCommentListViewModel.class, new AObjectS62S0000000_9(this, 46), BulletinCommentActionViewModel.class, new AObjectS384S0100000_9(this, 34)}, defaultViewModelProviderFactory);
                    this.LLJILJIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1196320hEk.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        C430560GuU c430560GuU = (C430560GuU) this.itemView.findViewById(R.id.eu1);
        if (c430560GuU != null) {
            ViewGroup.LayoutParams layoutParams = c430560GuU.getLayoutParams();
            layoutParams.height = -2;
            C786410Ut5.W5(c430560GuU, layoutParams);
            ViewTreeObserverOnGlobalLayoutListenerC462870IDd viewTreeObserverOnGlobalLayoutListenerC462870IDd = c430560GuU.LLJJJJJIL;
            if (viewTreeObserverOnGlobalLayoutListenerC462870IDd != null) {
                C786410Ut5.C3(c430560GuU.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC462870IDd);
            }
            c430560GuU.LLJJJJJIL = new ViewTreeObserverOnGlobalLayoutListenerC462870IDd(c430560GuU, 9);
            C786410Ut5.x3(c430560GuU.getViewTreeObserver(), c430560GuU.LLJJJJJIL);
        }
    }

    public final void I5(Comment comment) {
        String string;
        String string2;
        if (C123100dR.LIZ(comment.getReplyToNickName()) && C123100dR.LIZ(comment.getReplyToReplyCommentId()) && !Intrinsics.LJFF(comment.getReplyToReplyCommentId(), CardStruct.IStatusCode.DEFAULT)) {
            TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.ed0);
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            }
            TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.ed1);
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                tuxTextView.setText(comment.getReplyToNickName());
            }
            TuxTextView tuxTextView2 = (TuxTextView) this.itemView.findViewById(R.id.edp);
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
            }
            TuxTextView tuxTextView3 = (TuxTextView) this.itemView.findViewById(R.id.edi);
            if (tuxTextView3 != null) {
                C786410Ut5.LLLLZLL(tuxTextView3, 8);
                return;
            }
            return;
        }
        if (comment.getLabelType() == 1) {
            TuxTextView tuxTextView4 = (TuxTextView) this.itemView.findViewById(R.id.edp);
            if (tuxTextView4 != null) {
                tuxTextView4.setTextColorRes(R.attr.a1s);
                tuxTextView4.setText(comment.getLabelText());
                C786410Ut5.LLLLZLL(tuxTextView4, 0);
            }
            TuxTextView tuxTextView5 = (TuxTextView) this.itemView.findViewById(R.id.edi);
            if (tuxTextView5 != null) {
                Resources resources = tuxTextView5.getResources();
                if (resources == null || (string2 = resources.getString(2131829168)) == null) {
                    string2 = "";
                }
                tuxTextView5.setText(C786410Ut5.j4(string2, Arrays.copyOf(new Object[]{""}, 1)));
                C786410Ut5.LLLLZLL(tuxTextView5, 0);
            }
            TuxIconView tuxIconView2 = (TuxIconView) this.itemView.findViewById(R.id.ed0);
            if (tuxIconView2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
            }
            TuxTextView tuxTextView6 = (TuxTextView) this.itemView.findViewById(R.id.ed1);
            if (tuxTextView6 == null) {
                return;
            }
            C786410Ut5.LLLLZLL(tuxTextView6, 8);
            return;
        }
        if (comment.getLabelType() == this.LL) {
            TuxTextView tuxTextView7 = (TuxTextView) this.itemView.findViewById(R.id.edp);
            if (tuxTextView7 != null) {
                tuxTextView7.setTextColorRes(R.attr.a1k);
                tuxTextView7.setText(comment.getLabelText());
                C786410Ut5.LLLLZLL(tuxTextView7, 0);
            }
            TuxTextView tuxTextView8 = (TuxTextView) this.itemView.findViewById(R.id.edi);
            if (tuxTextView8 != null) {
                Resources resources2 = tuxTextView8.getResources();
                if (resources2 == null || (string = resources2.getString(2131829168)) == null) {
                    string = "";
                }
                tuxTextView8.setText(C786410Ut5.j4(string, Arrays.copyOf(new Object[]{""}, 1)));
                C786410Ut5.LLLLZLL(tuxTextView8, 0);
            }
            TuxIconView tuxIconView3 = (TuxIconView) this.itemView.findViewById(R.id.ed0);
            if (tuxIconView3 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
            }
            TuxTextView tuxTextView9 = (TuxTextView) this.itemView.findViewById(R.id.ed1);
            if (tuxTextView9 == null) {
                return;
            }
            C786410Ut5.LLLLZLL(tuxTextView9, 8);
            return;
        }
        TuxTextView tuxTextView10 = (TuxTextView) this.itemView.findViewById(R.id.edp);
        if (tuxTextView10 != null) {
            C786410Ut5.LLLLZLL(tuxTextView10, 8);
        }
        TuxTextView tuxTextView11 = (TuxTextView) this.itemView.findViewById(R.id.edi);
        if (tuxTextView11 != null) {
            C786410Ut5.LLLLZLL(tuxTextView11, 8);
        }
        TuxIconView tuxIconView4 = (TuxIconView) this.itemView.findViewById(R.id.ed0);
        if (tuxIconView4 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView4, 8);
        }
        TuxTextView tuxTextView12 = (TuxTextView) this.itemView.findViewById(R.id.ed1);
        if (tuxTextView12 == null) {
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextView12, 8);
    }

    public final void L5(User user) {
        UrlModel avatarThumb;
        String nickname;
        if (user != null) {
            avatarThumb = user.getAvatarThumb();
        } else {
            avatarThumb = null;
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatarThumb));
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        c1331670kl3LJIIIIZZ.LJIIJJI = iLIZIZ;
        c1331670kl3LJIIIIZZ.LJIIL = iLIZIZ2;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_default_avatar;
        c1331670kl3LJIIIIZZ.LJJIIZI(c419910GdJ.LIZ(this.itemView.getContext()));
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_color_default_avatar;
        c1331670kl3LJIIIIZZ.LJIL(c419910GdJ2.LIZ(this.itemView.getContext()));
        c1331670kl3LJIIIIZZ.LJJ((InterfaceC1334290kpH) this.itemView.findViewById(R.id.bh2));
        c1331670kl3LJIIIIZZ.LJJIJLIJ = true;
        c1331670kl3LJIIIIZZ.LJIIJJI();
        TextView textView = (TextView) this.itemView.findViewById(R.id.title);
        if (textView != null) {
            if (user == null || (nickname = user.getNickname()) == null) {
                nickname = "";
            }
            textView.setText(nickname);
        }
    }

    public final void R5(String str) {
        C430560GuU c430560GuU = (C430560GuU) this.itemView.findViewById(R.id.eu1);
        if (c430560GuU != null) {
            c430560GuU.setExpandAction(c430560GuU.getContext().getResources().getString(2131825209));
            if (str == null) {
                str = "";
            }
            c430560GuU.setOriginalText(str);
        }
    }

    public final void T5(EnumC620990OXh enumC620990OXh) {
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.sh5);
        if (tuxTextView != null) {
            int i = C621000OXi.LIZ[enumC620990OXh.ordinal()];
            if (i != 1 && i != 2 && i != 3 && i != 4) {
                if (i == 5) {
                    int iIntValue = 0;
                    C786410Ut5.LLLLZLL(tuxTextView, 0);
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, this.itemView.getContext());
                    if (numLIZJ != null) {
                        iIntValue = numLIZJ.intValue();
                    }
                    tuxTextView.setTextColor(iIntValue);
                    tuxTextView.setText(2131829226);
                    return;
                }
                throw new C1954807lC();
            }
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        C0OTS c0ots = (C0OTS) interfaceC1891350zJl;
        if (C619000OPq.LJ(c0ots.LL)) {
            if (C426750GoL.LIZLLL(this.itemView.getContext())) {
                View viewFindViewById = this.itemView.findViewById(R.id.er6);
                if (viewFindViewById != null) {
                    viewFindViewById.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                }
            } else {
                View viewFindViewById2 = this.itemView.findViewById(R.id.er6);
                if (viewFindViewById2 != null) {
                    viewFindViewById2.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                }
            }
        } else {
            View viewFindViewById3 = this.itemView.findViewById(R.id.er6);
            if (viewFindViewById3 != null) {
                viewFindViewById3.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            }
        }
        L5(c0ots.LL.getUser());
        I5(c0ots.LL);
        R5(c0ots.LL.getText());
        U5(Integer.valueOf(c0ots.LL.getCreateTime()), c0ots.LLJILJIL);
        EnumC620990OXh enumC620990OXh = c0ots.LLJILJIL;
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.ecz);
        if (tuxTextView != null) {
            if (enumC620990OXh == EnumC620990OXh.FAIL) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LLLLZLL(tuxTextView, i);
        }
        S5(Boolean.valueOf(c0ots.LL.isUserDigged()), Integer.valueOf(c0ots.LL.getDiggCount()), Boolean.valueOf(c0ots.LL.isAuthorDigged), c0ots.LLJILJIL);
        T5(c0ots.LLJILJIL);
    }

    public final void U5(Integer num, EnumC620990OXh enumC620990OXh) {
        int i;
        long jIntValue;
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.ee7);
        if (tuxTextView != null) {
            if (enumC620990OXh == EnumC620990OXh.FAIL) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LLLLZLL(tuxTextView, i);
            if (enumC620990OXh == EnumC620990OXh.START) {
                jIntValue = System.currentTimeMillis();
            } else if (num != null) {
                jIntValue = ((long) num.intValue()) * 1000;
            } else {
                jIntValue = 0;
            }
            tuxTextView.setText(C1356610lPH.LIZJ(jIntValue, this.itemView.getContext()));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C0OTS c0ots = (C0OTS) interfaceC1891350zJl;
        int i = 0;
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
        if (objLJJJLZIJ instanceof C0OY1) {
            C0OY1 c0oy1 = (C0OY1) objLJJJLZIJ;
            if (c0oy1.LIZ) {
                L5(c0ots.LL.getUser());
            }
            if (c0oy1.LIZIZ) {
                I5(c0ots.LL);
            }
            if (c0oy1.LIZJ) {
                R5(c0ots.LL.getText());
            }
            if (c0oy1.LIZLLL) {
                U5(Integer.valueOf(c0ots.LL.getCreateTime()), c0ots.LLJILJIL);
            }
            if (c0oy1.LJ) {
                S5(Boolean.valueOf(c0ots.LL.isUserDigged()), Integer.valueOf(c0ots.LL.getDiggCount()), Boolean.valueOf(c0ots.LL.isAuthorDigged), c0ots.LLJILJIL);
            }
            if (c0oy1.LJFF) {
                U5(Integer.valueOf(c0ots.LL.getCreateTime()), c0ots.LLJILJIL);
                EnumC620990OXh enumC620990OXh = c0ots.LLJILJIL;
                TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.ecz);
                if (tuxTextView != null) {
                    if (enumC620990OXh == EnumC620990OXh.FAIL) {
                        i = 8;
                    }
                    C786410Ut5.LLLLZLL(tuxTextView, i);
                }
                S5(Boolean.valueOf(c0ots.LL.isUserDigged()), Integer.valueOf(c0ots.LL.getDiggCount()), Boolean.valueOf(c0ots.LL.isAuthorDigged), c0ots.LLJILJIL);
                T5(c0ots.LLJILJIL);
            }
        }
    }

    public final void S5(Boolean bool, Integer num, Boolean bool2, EnumC620990OXh enumC620990OXh) {
        UrlModel urlModel;
        TuxIconView tuxIconView;
        int i;
        int iIntValue;
        int iIntValue2;
        RelativeLayout relativeLayout = (RelativeLayout) this.itemView.findViewById(R.id.mo0);
        TuxIconView tuxIconView2 = (TuxIconView) this.itemView.findViewById(R.id.lmj);
        TuxIconView tuxIconView3 = (TuxIconView) this.itemView.findViewById(R.id.lf0);
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.zts);
        EnumC620990OXh enumC620990OXh2 = EnumC620990OXh.START;
        if (enumC620990OXh != enumC620990OXh2 && enumC620990OXh != EnumC620990OXh.FAIL) {
            if (relativeLayout != null) {
                C786410Ut5.LLIIL(relativeLayout, 0);
            }
        } else if (relativeLayout != null) {
            C786410Ut5.LLIIL(relativeLayout, 8);
        }
        Boolean bool3 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool3)) {
            if (tuxIconView3 != null) {
                C786410Ut5.x5(tuxIconView3, 0.0f);
            }
            if (tuxIconView2 != null) {
                C786410Ut5.x5(tuxIconView2, 1.0f);
            }
        } else {
            if (tuxIconView3 != null) {
                C786410Ut5.x5(tuxIconView3, 1.0f);
            }
            if (tuxIconView2 != null) {
                C786410Ut5.x5(tuxIconView2, 0.0f);
            }
        }
        if (tuxTextView != null) {
            if (num != null && num.intValue() == 0) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LLLLZLL(tuxTextView, i);
            if (Intrinsics.LJFF(bool, bool3)) {
                if (num != null) {
                    iIntValue2 = num.intValue();
                } else {
                    iIntValue2 = 0;
                }
                iIntValue = Math.max(iIntValue2, 1);
            } else if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            tuxTextView.setText(C1843500y4a.LIZIZ(iIntValue));
            if (Intrinsics.LJFF(bool, bool3)) {
                tuxTextView.setTextColorRes(R.attr.a1q);
            } else {
                tuxTextView.setTextColorRes(R.attr.a1k);
            }
        }
        if (Intrinsics.LJFF(bool2, bool3) && enumC620990OXh != enumC620990OXh2 && enumC620990OXh != EnumC620990OXh.FAIL) {
            FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.mn6);
            if (frameLayout != null) {
                C786410Ut5.LJZ(0, frameLayout);
            }
            C0OTS item = getItem();
            if (item != null) {
                urlModel = item.LLILZIL;
            } else {
                urlModel = null;
            }
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c1331670kl3LJIIIIZZ.LJIIJJI = iLIZIZ;
            c1331670kl3LJIIIIZZ.LJIIL = iLIZIZ2;
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(36));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.bv);
            c1331670kl3LJIIIIZZ.LJJIIZI(c384050F3z.LIZ(this.itemView.getContext()));
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_color_default_avatar;
            c1331670kl3LJIIIIZZ.LJIL(c419910GdJ.LIZ(this.itemView.getContext()));
            c1331670kl3LJIIIIZZ.LJJ((InterfaceC1334290kpH) this.itemView.findViewById(R.id.mn5));
            c1331670kl3LJIIIIZZ.LJIIJJI();
            Drawable drawableLJ = C1308910kAL.LJ(R.attr.a20, this.itemView.getContext());
            if (drawableLJ != null && (tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.mn8)) != null) {
                tuxIconView.setImageDrawable(drawableLJ);
            }
        } else {
            FrameLayout frameLayout2 = (FrameLayout) this.itemView.findViewById(R.id.mn6);
            if (frameLayout2 != null) {
                C786410Ut5.LJZ(8, frameLayout2);
            }
        }
        if (relativeLayout != null) {
            relativeLayout.setOnTouchListener(new ATListenerS337S0200000_9(this, bool, 1));
        }
    }
}
