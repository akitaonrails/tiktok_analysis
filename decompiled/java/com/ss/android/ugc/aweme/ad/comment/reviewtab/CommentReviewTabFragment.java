package com.ss.android.ugc.aweme.ad.comment.reviewtab;

import X.C01GW;
import X.C06Z8;
import X.C098200Yq;
import X.C0I7D;
import X.C0QSJ;
import X.C0WZX;
import X.C1022620cia;
import X.C1055070dYv;
import X.C1074330e3z;
import X.C13LN;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1685300txQ;
import X.C1749280vcc;
import X.C1843750y4z;
import X.C1843760y50;
import X.C1843780y52;
import X.C1843790y53;
import X.C1843800y54;
import X.C1843810y55;
import X.C1843820y56;
import X.C1843830y57;
import X.C1843860y5A;
import X.C1843870y5B;
import X.C1843880y5C;
import X.C1843890y5D;
import X.C1843900y5E;
import X.C1844100y5Y;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2211751BhN;
import X.C23250099c;
import X.C295880Bik;
import X.C452501pT;
import X.C523420Kfs;
import X.C673150Qan;
import X.C687700QyG;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1344590l5t;
import X.InterfaceC1349750lED;
import X.InterfaceC687730QyJ;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS161S0100000_27;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.model.Review;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.vm.ReviewViewModel;
import com.ss.android.ugc.aweme.comment.api.ICommentPageReusedProtocol;
import com.ss.android.ugc.aweme.comment.api.IPageActionBarAbility;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.commercialize.model.commenttab.ReviewArea;
import com.ss.android.ugc.aweme.commercialize.model.commenttab.SortItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import wh6.AbS706S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class CommentReviewTabFragment extends AbsFragment implements InterfaceC1344590l5t, InterfaceC1349750lED, ICommentPageReusedProtocol, IKeyboardAbility, C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQoZyw8JSgpJzt9HELIOSOiA6ICokPCQuZww8JSgpJzsBLTMlLDgHKScKOy40JSAiPQ==";
    public ReviewViewModel LL;
    public C1844100y5Y LLILLJJLI;
    public C06Z8 LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new C1055070dYv(this));
    public CharSequence LLILZIL = "Reviews";
    public boolean LLILZLL;
    public boolean LLIZ;
    public View LLIZLLLIL;

    @Override // X.InterfaceC1349750lED
    public final void B7() {
    }

    @Override // X.InterfaceC1349750lED
    public final void BC(boolean z) {
    }

    @Override // X.InterfaceC1344590l5t
    public final Drawable Cw(boolean z) {
        return null;
    }

    @Override // X.InterfaceC1344590l5t
    public final Drawable GF(Context context) {
        return null;
    }

    @Override // X.InterfaceC1349750lED
    public final int Rc() {
        return 12;
    }

    @Override // X.InterfaceC1349750lED
    public final void ZC(View view, Function0<Unit> function0, Function0<Unit> function02, int i, int i2) {
    }

    @Override // X.InterfaceC1344590l5t
    public final Drawable aJ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentPageReusedProtocol
    public final void bT(Aweme aweme) {
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{AdsReviewTabScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AdsReviewTabScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AdsReviewTabScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC1349750lED
    public final String getTabName() {
        return "ads_review_tab";
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC1344590l5t
    public final Integer DJ() {
        return 12;
    }

    @Override // X.InterfaceC1349750lED
    public final void LJJJJLI() {
        C1022620cia.LIZ("ReviewTab", "scrollToTop");
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.reviewtab.IKeyboardAbility
    public final Editable gy1() {
        C0I7D editText;
        C06Z8 c06z8 = this.LLILLL;
        if (c06z8 == null || (editText = c06z8.getEditText()) == null) {
            return null;
        }
        return C2204961BRm.LLLLJI(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOusLZzB0T/gsVH8tkjK4TuMx1wqBHommY1+ypqufnOmlfhFYcB/h7qQChdL9Q==", null));
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C1022620cia.LIZ("ReviewTab", "onDestroy");
        super.onDestroy();
        IPageActionBarAbility iPageActionBarAbility = (IPageActionBarAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IPageActionBarAbility.class, null);
        if (iPageActionBarAbility != null) {
            iPageActionBarAbility.wj1(12, null);
        }
        this.LLIZ = false;
    }

    @Override // X.InterfaceC1349750lED
    public final void Fv(String str) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        C1022620cia.LIZ("ReviewTab", "onPanelDismiss");
        C1844100y5Y c1844100y5Y = this.LLILLJJLI;
        if ((c1844100y5Y instanceof C1844100y5Y) && c1844100y5Y != null && (viewOnAttachStateChangeListenerC20604515jv = c1844100y5Y.LIZIZ) != null) {
            C2211751BhN.LIZIZ(viewOnAttachStateChangeListenerC20604515jv);
        }
        ReviewViewModel reviewViewModel = this.LL;
        if (reviewViewModel != null) {
            reviewViewModel.AQ2(C1843900y5E.LIZ);
        }
        IPageActionBarAbility iPageActionBarAbility = (IPageActionBarAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IPageActionBarAbility.class, null);
        if (iPageActionBarAbility != null) {
            iPageActionBarAbility.wj1(12, null);
        }
        this.LLIZ = false;
    }

    @Override // X.InterfaceC1349750lED
    public final void Pz(String str) {
        C1022620cia.LIZ("ReviewTab", "onPanelShow");
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.reviewtab.IKeyboardAbility
    public final void YH1(Editable editable) {
        TuxIconView sendButton;
        C0I7D editText;
        C06Z8 c06z8 = this.LLILLL;
        if (c06z8 != null && (editText = c06z8.getEditText()) != null) {
            editText.setText(editable);
        }
        C06Z8 c06z82 = this.LLILLL;
        if (c06z82 != null && (sendButton = c06z82.getSendButton()) != null) {
            int i = 0;
            if (editable == null || editable.length() == 0) {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, sendButton);
        }
    }

    @Override // X.InterfaceC1344590l5t
    public final CharSequence c4(Context context) {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.reviewtab.IKeyboardAbility
    public final void kS1(Editable editable) {
        String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("publishReview: text -> ");
        sbLIZ.append((Object) editable);
        C1022620cia.LIZ("ReviewTab", C2188811AlT.LIZIZ(sbLIZ));
        String string = editable.toString();
        ReviewViewModel reviewViewModel = this.LL;
        if (reviewViewModel != null) {
            long jWQ2 = ReviewViewModel.wQ2();
            String strZQ2 = reviewViewModel.zQ2();
            if (strZQ2.length() == 0) {
                strLIZIZ = "*";
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(C13LN.LJLLI(strZQ2));
                sbLIZ2.append("**");
                sbLIZ2.append(C13LN.LJLLL(strZQ2));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(System.currentTimeMillis());
            sbLIZ3.append(UUID.randomUUID());
            reviewViewModel.AQ2(new C1843890y5D(new Review(C2188811AlT.LIZIZ(sbLIZ3), false, 0L, 0L, jWQ2, strLIZIZ, string, 0.0f, null, jCurrentTimeMillis, 0L, false), false));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C1022620cia.LIZ("ReviewTab", "onAttach");
        super.onAttach(context);
        ReviewViewModel reviewViewModel = (ReviewViewModel) C1074330e3z.LIZ(ReviewViewModel.class, this, null);
        reviewViewModel.LL = new C1843830y57(context, this);
        this.LL = reviewViewModel;
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1843760y50(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1843750y4z(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1843810y55(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1843820y56(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1843800y54(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1843790y53(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1843780y52(this, null), 3);
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AwemeRawAd awemeRawAd;
        ReviewArea reviewArea;
        List<SortItem> sortList;
        SortItem sortItem;
        ReviewViewModel reviewViewModel;
        View editBox;
        TuxIconView sendButton;
        C1022620cia.LIZ("ReviewTab", "onViewCreated");
        super.onViewCreated(view, bundle);
        ReviewViewModel reviewViewModel2 = this.LL;
        if (reviewViewModel2 != null) {
            reviewViewModel2.AQ2(new C1843880y5C());
        }
        this.LLILLJJLI = new C1844100y5Y((C1749280vcc) view.findViewById(R.id.thp), (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.thn));
        C06Z8 c06z8 = (C06Z8) view.findViewById(R.id.hkk);
        this.LLILLL = c06z8;
        if (c06z8 != null) {
            C0I7D c0i7d = c06z8.LLILLL;
            c0i7d.setFocusable(false);
            c0i7d.setClickable(false);
            c0i7d.setLongClickable(false);
            c0i7d.setOnTouchListener(new View.OnTouchListener() { // from class: X.0y58
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return false;
                }
            });
            c0i7d.setKeyListener(null);
            c0i7d.setMovementMethod(null);
        }
        C06Z8 c06z82 = this.LLILLL;
        if (c06z82 != null && (sendButton = c06z82.getSendButton()) != null) {
            C786410Ut5.a9(sendButton, new ACListenerS161S0100000_27(this, 209));
        }
        C06Z8 c06z83 = this.LLILLL;
        if (c06z83 != null && (editBox = c06z83.getEditBox()) != null) {
            C786410Ut5.I7(new AbS706S0100000_27(this, 18, 42), editBox);
        }
        C1558520qew.LJI(this, AdsReviewTabScope.class, this, IKeyboardAbility.class, null, null);
        Aweme aweme = (Aweme) this.LLILZ.getValue();
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (reviewArea = awemeRawAd.getReviewArea()) != null && (sortList = reviewArea.getSortList()) != null && (sortItem = (SortItem) ListProtector.get(sortList, 0)) != null && (reviewViewModel = this.LL) != null) {
            reviewViewModel.AQ2(new C1843870y5B(sortItem.getOrderType()));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        if (C295880Bik.LIZLLL) {
            CommentService.LIZ.getClass();
            viewTd = C786410Ut5.Td(layoutInflater.cloneInContext(C523420Kfs.LIZ().getCommentThemeContext(layoutInflater.getContext())), R.layout.agt, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.agt, viewGroup, false);
        }
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0Guz] */
    @Override // X.InterfaceC1349750lED
    public final void u5(String str, String str2, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPanelSelectChanged: isSelected -> ");
        sbLIZ.append(z);
        C1022620cia.LIZ("ReviewTab", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZLL = z;
        if (z && !this.LLIZ) {
            C1022620cia.LIZ("ReviewTab", "initTouchListener");
            IPageActionBarAbility iPageActionBarAbility = (IPageActionBarAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IPageActionBarAbility.class, null);
            if (iPageActionBarAbility != 0) {
                final AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(this, 1416);
                final AwS606S0100000_27 awS606S0100000_27 = new AwS606S0100000_27(this, 661);
                iPageActionBarAbility.wj1(12, new View.OnTouchListener(awS571S0100000_27, awS606S0100000_27) { // from class: X.0Guz
                    public final Function0<Boolean> LL;
                    public final Function1<View, Unit> LLILLJJLI;

                    {
                        this.LL = awS571S0100000_27;
                        this.LLILLJJLI = awS606S0100000_27;
                    }

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        ViewParent parent;
                        TextView textView;
                        Spannable spannableValueOf;
                        if (this.LL.invoke().booleanValue()) {
                            return false;
                        }
                        Function1<View, Unit> function1 = this.LLILLJJLI;
                        if (view != null) {
                            parent = view.getParent();
                        } else {
                            parent = null;
                        }
                        if (!(parent instanceof View)) {
                            parent = null;
                        }
                        function1.invoke(parent);
                        if (!(view instanceof TextView) || (textView = (TextView) view) == null) {
                            return false;
                        }
                        CharSequence text = textView.getText();
                        if (text instanceof Spannable) {
                            spannableValueOf = (Spannable) text;
                        } else {
                            if (text instanceof SpannedString) {
                                spannableValueOf = SpannableString.valueOf(text);
                            }
                            return false;
                        }
                        if (spannableValueOf == null || motionEvent == null) {
                            return false;
                        }
                        int iU3 = C786410Ut5.U3(textView.getLayout(), textView.getLayout().getLineForVertical((int) ((motionEvent.getY() - textView.getTotalPaddingTop()) + textView.getScrollY())), (motionEvent.getX() - textView.getTotalPaddingLeft()) + textView.getScrollX());
                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableValueOf.getSpans(iU3, iU3, ClickableSpan.class);
                        if (clickableSpanArr == null || clickableSpanArr.length == 0) {
                            return false;
                        }
                        if (motionEvent.getAction() == 1) {
                            clickableSpanArr[0].onClick(textView);
                        }
                        return true;
                    }
                });
            }
            this.LLIZ = true;
        }
        ReviewViewModel reviewViewModel = this.LL;
        if (reviewViewModel != null) {
            reviewViewModel.AQ2(new C1843860y5A(z));
        }
    }
}
