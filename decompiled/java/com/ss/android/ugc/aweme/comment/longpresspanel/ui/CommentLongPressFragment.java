package com.ss.android.ugc.aweme.comment.longpresspanel.ui;

import X.AbstractC1387200mCc;
import X.C01GW;
import X.C098200Yq;
import X.C099G;
import X.C0BV2;
import X.C0PEM;
import X.C0SUC;
import X.C1110404Vy;
import X.C1308910kAL;
import X.C1341960l1e;
import X.C1345700l7g;
import X.C1346280l8c;
import X.C1346330l8h;
import X.C1350750lFp;
import X.C1350920lG6;
import X.C1354740lMG;
import X.C1354960lMc;
import X.C1354990lMf;
import X.C1355230lN3;
import X.C1356360lOs;
import X.C1357660lQy;
import X.C1369870lkf;
import X.C1371590lnR;
import X.C1373400lqM;
import X.C1390920mIc;
import X.C15WT;
import X.C1685300txQ;
import X.C16BC;
import X.C189200o6;
import X.C1906580ziK;
import X.C19252910Tv;
import X.C19EG;
import X.C19GS;
import X.C19ME;
import X.C20742216Eq;
import X.C2187701Ajg;
import X.C2211751BhN;
import X.C2235108pJ;
import X.C2296808zG;
import X.C23250099c;
import X.C2340909Ff;
import X.C2344009Gk;
import X.C276080Aru;
import X.C299110Bnx;
import X.C418440Gaw;
import X.C447670Hgz;
import X.C452501pT;
import X.C473380IhM;
import X.C786410Ut5;
import X.C814420VxA;
import X.DialogInterfaceOnDismissListenerC1402040maY;
import X.EnumC1342450l2R;
import X.EnumC1373410lqN;
import X.InterfaceC1346260l8a;
import X.InterfaceC1352000lHq;
import X.InterfaceC1355580lNc;
import X.InterfaceC1356400lOw;
import X.InterfaceC1363000lZa;
import X.InterfaceC1366280les;
import X.ViewTreeObserverOnGlobalLayoutListenerC1402100mae;
import Y.ARunnableS121S0100000_21;
import Y.AUListenerS17S0102000_21;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.KeyboardFakePopupWindow;
import com.ss.android.ugc.aweme.comment.longpresspanel.repo.CommentLongPressRepository;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentShareInfo;
import com.ss.android.ugc.aweme.comment.model.FypExposedCommentMobParams;
import com.ss.android.ugc.aweme.comment.services.IKeyboardService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.CommentSharePackage;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentLongPressFragment extends BaseFragment implements InterfaceC1363000lZa, InterfaceC1352000lHq {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2JjFiJSA9LzHELIOSU+LDwgOCQiLCN9PSxiCiA+JSAiPQM8JiIcOyogOwM+KCg+LSs4";
    public C1354960lMc LLIZ;
    public RecyclerView LLIZLLLIL;
    public Comment LLJ;
    public Aweme LLJI;
    public C1346280l8c LLJIJIL;
    public boolean LLJILJIL;
    public InterfaceC1346260l8a LLJILJILJ;
    public List<C1346330l8h> LLJILLL;
    public C1341960l1e LLJJ;
    public EnumC1342450l2R LLJJIII;
    public C1371590lnR LLJJIJI;
    public TuxSheet LLJJIJIIJIL;
    public C16BC LLJJIJIL;
    public C099G LLJJJ;
    public FypExposedCommentMobParams LLJJJIL;
    public View LLJJL;
    public FrameLayout LLJJLIIIJLLLLLLLZ;
    public InterfaceC1366280les LLJL;
    public C20742216Eq LLJLIL;
    public InterfaceC1355580lNc LLJLL;
    public int LLJLLIL;
    public boolean LLJLLL;
    public String LLJJI = "";
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 209));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 207));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 208));
    public boolean LLJLILLLLZIIL = true;
    public int LLJZ = -1;

    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    @Override // X.InterfaceC1352000lHq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLILII() {
        /*
            r6 = this;
            r5 = 0
            r6.LLJLLIL = r5
            X.16Eq r0 = r6.LLJLIL
            r1 = 0
            if (r0 == 0) goto Lc
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
        Lc:
            boolean r0 = r1 instanceof X.C19ME
            if (r0 == 0) goto L79
            X.19ME r1 = (X.C19ME) r1
            if (r1 == 0) goto L79
            int r2 = r1.guideEnd
            if (r2 == 0) goto L79
            androidx.recyclerview.widget.RecyclerView r1 = r6.LLIZLLLIL
            if (r1 == 0) goto L77
            r0 = 2131367903(0x7f0a17df, float:1.835574E38)
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L77
            int r4 = r0.getMeasuredHeight()
        L29:
            X.0lMf r0 = X.C1354990lMf.LIZ
            r0.getClass()
            java.lang.Double r0 = X.C1354990lMf.LIZ()
            r1 = 1
            if (r0 == 0) goto L6c
            android.widget.FrameLayout r0 = r6.LLJJLIIIJLLLLLLLZ
            if (r0 == 0) goto L75
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L75
            android.widget.FrameLayout r0 = r6.LLJJLIIIJLLLLLLLZ
            if (r0 == 0) goto L75
            int r3 = r0.getHeight()
        L47:
            r0 = 2
            int[] r0 = new int[r0]
            r0[r5] = r2
            r0[r1] = r5
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r0)
            r0 = 100
            r2.setDuration(r0)
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            r2.setInterpolator(r0)
            Y.AUListenerS17S0102000_21 r1 = new Y.AUListenerS17S0102000_21
            r0 = 0
            r1.<init>(r6, r4, r3, r0)
            r2.addUpdateListener(r1)
            r2.start()
            return
        L6c:
            android.widget.FrameLayout r0 = r6.LLJJLIIIJLLLLLLLZ
            if (r0 == 0) goto L75
            int r3 = r0.getMeasuredHeight()
            goto L47
        L75:
            r3 = 0
            goto L47
        L77:
            r4 = 0
            goto L29
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.longpresspanel.ui.CommentLongPressFragment.LLILII():void");
    }

    @Override // X.InterfaceC1352000lHq
    public final void LLLLZI(int i) {
    }

    @Override // X.InterfaceC1363000lZa
    public final void sd() {
        C1356360lOs c1356360lOs;
        InterfaceC1356400lOw interfaceC1356400lOw;
        RecyclerView recyclerView = this.LLIZLLLIL;
        if (recyclerView == null || (c1356360lOs = (C1356360lOs) recyclerView.findViewById(R.id.ebt)) == null || (interfaceC1356400lOw = c1356360lOs.LL) == null) {
            return;
        }
        interfaceC1356400lOw.refresh();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C1354740lMG c1354740lMG;
        C1356360lOs c1356360lOs;
        super.onDestroyView();
        RecyclerView recyclerView = this.LLIZLLLIL;
        if (recyclerView != null) {
            C2211751BhN.LIZIZ(recyclerView);
        }
        C099G c099g = this.LLJJJ;
        if (c099g != null) {
            c099g.LIZIZ(null);
        }
        InterfaceC1355580lNc interfaceC1355580lNc = this.LLJLL;
        if (interfaceC1355580lNc != null) {
            interfaceC1355580lNc.release();
        }
        RecyclerView recyclerView2 = this.LLIZLLLIL;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(null);
        }
        C1354960lMc c1354960lMc = this.LLIZ;
        if (c1354960lMc != null && (c1354740lMG = c1354960lMc.LLJILJIL) != null && (c1356360lOs = c1354740lMG.LL) != null) {
            c1356360lOs.LIZ();
        }
        this.LLIZ = null;
    }

    public final void SR(C1346330l8h c1346330l8h) {
        List<C1346330l8h> list;
        List<C1346330l8h> list2;
        int iIndexOf;
        C1354960lMc c1354960lMc;
        C1354960lMc c1354960lMc2 = this.LLIZ;
        if (c1354960lMc2 != null && (list = c1354960lMc2.LL) != null && list.contains(c1346330l8h) && (list2 = c1354960lMc2.LL) != null && (iIndexOf = list2.indexOf(c1346330l8h)) != -1 && (c1354960lMc = this.LLIZ) != null) {
            c1354960lMc.notifyItemChanged(iIndexOf);
        }
    }

    @Override // X.InterfaceC1363000lZa
    public final void gF(boolean z) {
        ViewTreeObserver viewTreeObserver;
        int i;
        FrameLayout frameLayout = this.LLJJLIIIJLLLLLLLZ;
        if (frameLayout != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, frameLayout);
        }
        FrameLayout frameLayout2 = this.LLJJLIIIJLLLLLLLZ;
        if (frameLayout2 != null && (viewTreeObserver = frameLayout2.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC1402100mae viewTreeObserverOnGlobalLayoutListenerC1402100mae = new ViewTreeObserverOnGlobalLayoutListenerC1402100mae(this, 8);
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1402100mae);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1402100mae, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    @Override // X.InterfaceC1363000lZa
    public final void h(boolean z) {
        ViewTreeObserver viewTreeObserver;
        if (this.LLJLLL != z) {
            this.LLJLLL = z;
            FrameLayout frameLayout = this.LLJJLIIIJLLLLLLLZ;
            if (frameLayout != null && (viewTreeObserver = frameLayout.getViewTreeObserver()) != null) {
                ViewTreeObserverOnGlobalLayoutListenerC1402100mae viewTreeObserverOnGlobalLayoutListenerC1402100mae = new ViewTreeObserverOnGlobalLayoutListenerC1402100mae(this, 8);
                viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1402100mae);
                C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1402100mae, ViewTreeObserver.OnGlobalLayoutListener.class);
            }
        }
    }

    @Override // X.InterfaceC1352000lHq
    public final void j(int i) {
        ViewGroup.LayoutParams layoutParams;
        int i2;
        int dimensionPixelSize;
        int measuredHeight;
        int measuredHeight2;
        int measuredHeight3;
        FrameLayout frameLayout;
        View viewFindViewById;
        Context context = getContext();
        if (context == null) {
            return;
        }
        C20742216Eq c20742216Eq = this.LLJLIL;
        C19ME c19me = null;
        if (c20742216Eq != null) {
            layoutParams = c20742216Eq.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof C19ME) {
            c19me = (C19ME) layoutParams;
        }
        if (c19me != null) {
            i2 = c19me.guideEnd;
        } else {
            i2 = 0;
        }
        Resources resources = context.getResources();
        int iN3 = C786410Ut5.n3(resources, "navigation_bar_height", "dimen", "android");
        if (iN3 > 0) {
            dimensionPixelSize = resources.getDimensionPixelSize(iN3);
        } else {
            dimensionPixelSize = 0;
        }
        int i3 = i - dimensionPixelSize;
        C1110404Vy.LIZ().LIZIZ(i3, true);
        this.LLJLLIL = i3;
        if (i2 == i3) {
            return;
        }
        RecyclerView recyclerView = this.LLIZLLLIL;
        if (recyclerView != null && (viewFindViewById = recyclerView.findViewById(R.id.ebt)) != null) {
            measuredHeight = viewFindViewById.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        FrameLayout frameLayout2 = this.LLJJLIIIJLLLLLLLZ;
        if (frameLayout2 != null && frameLayout2.getVisibility() == 0 && (frameLayout = this.LLJJLIIIJLLLLLLLZ) != null) {
            measuredHeight2 = frameLayout.getMeasuredHeight();
        } else {
            measuredHeight2 = 0;
        }
        if (this.LLJZ == -1) {
            View view = this.LLJJL;
            if (view != null) {
                measuredHeight3 = view.getMeasuredHeight();
            } else {
                measuredHeight3 = 0;
            }
            this.LLJZ = measuredHeight3;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i2, i3);
        valueAnimatorOfInt.setDuration(100L);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.addUpdateListener(new AUListenerS17S0102000_21(this, measuredHeight, measuredHeight2, 1));
        valueAnimatorOfInt.start();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Comment comment;
        CommentShareInfo shareInfo;
        CommentSharePackage commentSharePackage;
        super.onAttach(context);
        ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
        C1369870lkf.LJII(true);
        if (((Number) C276080Aru.LIZ.getValue()).intValue() == 1 && (comment = this.LLJ) != null && (shareInfo = comment.getShareInfo()) != null && Intrinsics.LJFF(shareInfo.getNeedConfirm(), Boolean.TRUE)) {
            BaseSharePackage baseSharePackage = null;
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2235108pJ(this, null), 3);
            C1371590lnR c1371590lnR = this.LLJJIJI;
            if (c1371590lnR != null) {
                baseSharePackage = c1371590lnR.LJIJJ;
            }
            if ((baseSharePackage instanceof CommentSharePackage) && (commentSharePackage = (CommentSharePackage) baseSharePackage) != null) {
                commentSharePackage.aclCheck = new AwS582S0100000_3(this, 115);
            }
        }
    }

    public final void UR(C19EG c19eg, FragmentManager fragmentManager) {
        C1371590lnR c1371590lnRLIZJ;
        int iIntValue;
        String aid;
        String authorUid;
        Integer numValueOf;
        String cid;
        String uid;
        User user;
        Activity activityLIZIZ;
        User user2;
        BaseSharePackage baseSharePackage;
        Bundle bundle;
        C1346280l8c c1346280l8c = this.LLJIJIL;
        String aid2 = null;
        if (c1346280l8c != null) {
            CommentLongPressRepository commentLongPressRepository = CommentLongPressRepository.LIZ;
            Aweme aweme = this.LLJI;
            Comment comment = c1346280l8c.LIZJ;
            String str = c1346280l8c.LIZ;
            EnumC1342450l2R enumC1342450l2R = c1346280l8c.LJIIL;
            Integer numValueOf2 = Integer.valueOf(c1346280l8c.LJIILIIL);
            FypExposedCommentMobParams fypExposedCommentMobParams = this.LLJJJIL;
            boolean z = this.LLJILJIL;
            commentLongPressRepository.getClass();
            c1371590lnRLIZJ = CommentLongPressRepository.LIZJ(aweme, comment, c19eg, str, enumC1342450l2R, numValueOf2, fypExposedCommentMobParams, z);
        } else {
            c1371590lnRLIZJ = null;
        }
        this.LLJJIJI = c1371590lnRLIZJ;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1e, c19eg);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        boolean zLJ = c19252910Tv.LIZLLL().LIZIZ().LJ(c19eg);
        if (zLJ) {
            c19252910Tv.LIZLLL().LIZIZ().LIZIZ("CommentListFragment", "CommentLongPressFragment", this.LLJJI);
        }
        C1390920mIc c1390920mIc = new C1390920mIc(zLJ, ((Number) C473380IhM.LIZ(c19eg).getFirst()).intValue());
        c1390920mIc.LJIIIIZZ(4);
        Integer numValueOf3 = Integer.valueOf(iIntValue);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJI = numValueOf3;
        tuxSheet.LLJJIJIIJIL = true;
        tuxSheet.LLJJIJI = this;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC1402040maY(this, 0);
        c1390920mIc.LJI(53);
        c1390920mIc.LIZ.LLILZIL = true;
        if (C299110Bnx.LIZ()) {
            TuxCommentSharePanelBehavior tuxCommentSharePanelBehavior = new TuxCommentSharePanelBehavior();
            if (C0BV2.LIZ() > 0) {
                tuxCommentSharePanelBehavior.LJJIZ = C1355230lN3.LIZ(C0BV2.LIZ());
            }
            this.LLJJIJIL = tuxCommentSharePanelBehavior;
            c1390920mIc.LIZ.LLLIIIIL = tuxCommentSharePanelBehavior;
        } else {
            CommentSharePanelBehavior commentSharePanelBehavior = new CommentSharePanelBehavior();
            if (C0BV2.LIZ() > 0) {
                commentSharePanelBehavior.LIZJ = C1355230lN3.LIZ(C0BV2.LIZ());
            }
            this.LLJJIJIL = commentSharePanelBehavior;
            c1390920mIc.LIZ.LLLIIII = commentSharePanelBehavior;
        }
        this.LLJJIJIIJIL = c1390920mIc.LIZ;
        C1371590lnR c1371590lnR = this.LLJJIJI;
        if (c1371590lnR != null && (baseSharePackage = c1371590lnR.LJIJJ) != null && (bundle = baseSharePackage.extras) != null) {
            bundle.putInt("key_sheet_background_color", iIntValue);
        }
        ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
        C1369870lkf.LJIJI(this.LLJJIJIIJIL);
        TuxSheet tuxSheet2 = this.LLJJIJIIJIL;
        if (tuxSheet2 != null) {
            tuxSheet2.show(fragmentManager, "comment_long_press_panel");
        }
        String str2 = this.LLJJI;
        Aweme aweme2 = this.LLJI;
        Comment comment2 = this.LLJ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        if (aweme2 == null || (aid = aweme2.getAid()) == null) {
            aid = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (aweme2 != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme2);
        } else {
            authorUid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        if (aweme2 != null) {
            numValueOf = Integer.valueOf(AwemeExtKt.getFollowStatus(aweme2));
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "follow_status");
        if (comment2 != null) {
            cid = comment2.getCid();
        } else {
            cid = null;
        }
        c2344009Gk.LJIIIIZZ("comment_id", cid);
        if (comment2 != null && (user2 = comment2.getUser()) != null) {
            uid = user2.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("comment_author_id", uid);
        c2344009Gk.LJIIIIZZ("comment_category", C1345700l7g.LIZ(comment2));
        c2344009Gk.LJIIIIZZ("content_type", "comment");
        c2344009Gk.LJIIIIZZ("comment_message_type", C1350750lFp.LIZ(comment2));
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        if (comment2 != null) {
            user = comment2.getUser();
        } else {
            user = null;
        }
        c1350920lG6.getClass();
        c2344009Gk.LIZJ(C1350920lG6.LJIIL(user), "comment_follow_status_to_user");
        C15WT c15wt = C15WT.LIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null) {
            activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
        } else {
            activityLIZIZ = null;
        }
        String aid3 = C0SUC.LIZ(activityLIZIZ).getAid();
        if (aweme2 != null) {
            aid2 = aweme2.getAid();
        }
        c15wt.LJFF(c2344009Gk, str2, aid3, aid2);
        EnumC1373410lqN enumC1373410lqN = C1373400lqM.LIZ.get("comment");
        if (enumC1373410lqN == null) {
            enumC1373410lqN = EnumC1373410lqN.SHARE_COMMENT;
        }
        c2344009Gk.LIZJ(enumC1373410lqN.getNum(), "item_type");
        C1357660lQy.LJIIIIZZ(c2344009Gk, aweme2);
        C1357660lQy.LIZLLL(c2344009Gk, aweme2);
        C1350920lG6.LJJJ(c2344009Gk, "click_trans_layer");
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View view2;
        Context context;
        int iLIZIZ;
        ConstraintLayout constraintLayout;
        double dDoubleValue;
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.ec5);
        this.LLIZLLLIL = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new WrapLinearLayoutManager(getContext()) { // from class: com.ss.android.ugc.aweme.comment.longpresspanel.ui.CommentLongPressFragment.onViewCreated.1
                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public final boolean canScrollVertically() {
                    if (CommentLongPressFragment.this.LLJLILLLLZIIL) {
                        return super.canScrollVertically();
                    }
                    return false;
                }
            });
        }
        C1341960l1e c1341960l1e = this.LLJJ;
        if (c1341960l1e != null) {
            View view3 = this.LLJJL;
            if (view3 != null) {
                view3.setPadding(c1341960l1e.LIZ, c1341960l1e.LIZIZ, c1341960l1e.LIZJ, c1341960l1e.LIZLLL);
            }
        } else {
            C1354990lMf.LIZ.getClass();
            if (C1354990lMf.LIZJ() && (view2 = this.LLJJL) != null) {
                view2.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
            }
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C447670Hgz(this, null), 3);
        C1354990lMf.LIZ.getClass();
        if (C1354990lMf.LIZ() != null && getContext() != null && (context = getContext()) != null && (iLIZIZ = C2340909Ff.LIZIZ(context)) > 0) {
            View view4 = this.LLJJL;
            if ((view4 instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) view4) != null) {
                double d = iLIZIZ;
                Double dLIZ = C1354990lMf.LIZ();
                if (dLIZ != null) {
                    dDoubleValue = dLIZ.doubleValue();
                } else {
                    dDoubleValue = 0.0d;
                }
                constraintLayout.setMaxHeight((int) (d * dDoubleValue));
            }
        }
        HandlerHook.viewPost(view, new ARunnableS121S0100000_21(this, 46));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View decorView;
        Window window;
        this.LLJJL = C786410Ut5.Td(layoutInflater, R.layout.a3v, viewGroup, false);
        IKeyboardService iKeyboardServiceLIZ = C1110404Vy.LIZ();
        Context context = getContext();
        C19EG activity = getActivity();
        C19GS c19gs = null;
        if (activity != null && (window = activity.getWindow()) != null) {
            decorView = window.getDecorView();
        } else {
            decorView = null;
        }
        KeyboardFakePopupWindow keyboardFakePopupWindowLIZ = iKeyboardServiceLIZ.LIZ(context, decorView);
        this.LLJLL = keyboardFakePopupWindowLIZ;
        if (keyboardFakePopupWindowLIZ != null) {
            keyboardFakePopupWindowLIZ.LLJ = this;
        }
        if (keyboardFakePopupWindowLIZ != null) {
            keyboardFakePopupWindowLIZ.show();
        }
        View view = this.LLJJL;
        if (!(view instanceof View)) {
            view = null;
        }
        if (view != null) {
            try {
                ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view, this);
                view.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity2 = getActivity();
                if (activity2 instanceof C19GS) {
                    c19gs = (C19GS) activity2;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return view;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return view;
    }
}
