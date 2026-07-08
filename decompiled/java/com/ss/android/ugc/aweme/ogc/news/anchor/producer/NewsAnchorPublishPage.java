package com.ss.android.ugc.aweme.ogc.news.anchor.producer;

import X.AbstractC426530Gnz;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0OM1;
import X.C0ZP4;
import X.C1110404Vy;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1222450hut;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C13LE;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19646111tj;
import X.C19652411uk;
import X.C19654211v2;
import X.C19654611v6;
import X.C19655911vJ;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20467080b;
import X.C21578619ce;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C431260Gvc;
import X.C444910HcX;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C995130c0F;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC19655811vI;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC836760Ws6;
import Y.ACListenerS163S0100000_29;
import Y.ARunnableS39S0101000_28;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.KeyboardFakePopupWindow;
import com.ss.android.ugc.aweme.ogc.news.anchor.producer.NewsAnchorPublishPage;
import com.ss.android.ugc.aweme.ogc.news.anchor.producer.NewsAnchorPublishViewModel;
import com.zhiliaoapp.musically.R;
import irm.AkS95S0100000_29;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.AwS643S0100000_29;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes30.dex */
@InterfaceC836760Ws6
public final class NewsAnchorPublishPage extends BaseFragment implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiorKmE9LTI/Zy49HELIOSKy0jO2EjOiooPCw2OmsCLDggCSsvISAhGDAuJSYgIBUtLio=";
    public final AssemVMLazy LLIZ;
    public final C01GW LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(NewsAnchorPublishPage.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ogc/news/anchor/producer/NewsAnchorPublishViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public final C19654211v2 SR() {
        return (C19654211v2) this.LLIZLLLIL.getValue();
    }

    public final NewsAnchorPublishViewModel UR() {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        return (NewsAnchorPublishViewModel) assemVMLazy.getValue();
    }

    public NewsAnchorPublishPage() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(NewsAnchorPublishViewModel.class);
        this.LLIZ = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS563S0100000_19(c19719912DlLIZ, 1649), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 1650), AFwS273S0000000_29.get$arr$(95));
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(103));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        UR().zQ2(new C19652411uk(Lifecycle.Event.ON_PAUSE, getContext()));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        UR().zQ2(new C19652411uk(Lifecycle.Event.ON_RESUME, getContext()));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS273S0000000_29.get$arr$(94));
        UR().zQ2(new C19652411uk(Lifecycle.Event.ON_CREATE, this));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C19654211v2 c19654211v2SR = SR();
        ACListenerS163S0100000_29 aCListenerS163S0100000_29 = new ACListenerS163S0100000_29(this, 64);
        TuxNavBar tuxNavBar = c19654211v2SR.LLILZ;
        if (tuxNavBar != null) {
            C786410Ut5.i9(tuxNavBar, aCListenerS163S0100000_29);
        }
        TuxTextView tuxTextView = c19654211v2SR.LLJI;
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, aCListenerS163S0100000_29);
        }
        View view2 = c19654211v2SR.LLILZLL;
        if (view2 != null) {
            C786410Ut5.I7(aCListenerS163S0100000_29, view2);
        }
        c19654211v2SR.LL = new C1222450hut(this);
        final C19646111tj c19646111tj = c19654211v2SR.LLILLJJLI;
        if (c19646111tj != null) {
            C19655911vJ editor = c19646111tj.getEditor();
            editor.setCallback(new InterfaceC19655811vI() { // from class: X.11v7
                public boolean LIZ;

                @Override // X.InterfaceC19655811vI
                public final void LIZ() {
                    this.LIZ = true;
                }

                @Override // X.InterfaceC19655811vI
                public final void LJLILLLLZI(CharSequence charSequence) {
                    this.LIZIZ.UR().zQ2(new C19652011ug(EnumC19367210pq.TITLE_CHANGE, charSequence, this.LIZ, true));
                    this.LIZ = false;
                }
            });
            final int i = 0;
            editor.setOnEditorActionListener(new TextView.OnEditorActionListener(this, c19646111tj, i) { // from class: X.12Y8
                public final int $t;
                public Object l0;
                public Object l1;

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                    switch (this.$t) {
                        case 0:
                            return onEditorAction$0(this, textView, i2, keyEvent);
                        case 1:
                            return onEditorAction$1(this, textView, i2, keyEvent);
                        default:
                            return false;
                    }
                }

                {
                    this.$t = i;
                    this.l0 = this;
                    this.l1 = c19646111tj;
                }

                public static final boolean onEditorAction$0(C12Y8 c12y8, TextView textView, int i2, KeyEvent keyEvent) throws Throwable {
                    String string;
                    if (i2 == 6) {
                        NewsAnchorPublishViewModel newsAnchorPublishViewModelUR = ((NewsAnchorPublishPage) c12y8.l0).UR();
                        EnumC19367210pq enumC19367210pq = EnumC19367210pq.TITLE_CHANGE;
                        Editable editableC = C2204961BRm.c(((C19646111tj) c12y8.l1).getEditor(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOWvYNHA2SWLHTU5qLglE6Or4xDtyojXJOkCfyNUoyd1dnh3q5UCJ5I8NL1HvDE=", null));
                        if (editableC == null || (string = editableC.toString()) == null) {
                            string = "";
                        }
                        newsAnchorPublishViewModelUR.zQ2(new C19652011ug(enumC19367210pq, string, true, true));
                        return false;
                    }
                    return false;
                }

                public static final boolean onEditorAction$1(C12Y8 c12y8, TextView textView, int i2, KeyEvent keyEvent) throws Throwable {
                    String string;
                    if (i2 == 6) {
                        NewsAnchorPublishViewModel newsAnchorPublishViewModelUR = ((NewsAnchorPublishPage) c12y8.l0).UR();
                        EnumC19367210pq enumC19367210pq = EnumC19367210pq.LINK_CHANGE;
                        Editable editableC = C2204961BRm.c(((C19646111tj) c12y8.l1).getEditor(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOWvYNHA2SWLHTU5qLglE6Or4xDtyojXJOkCfyNUoyd1dnh3q5UCJ5I8NL1HvDE=", null));
                        if (editableC == null || (string = editableC.toString()) == null) {
                            string = "";
                        }
                        newsAnchorPublishViewModelUR.zQ2(new C19652011ug(enumC19367210pq, string, true, true));
                        return false;
                    }
                    return false;
                }
            });
        }
        final C19646111tj c19646111tj2 = c19654211v2SR.LLILLL;
        if (c19646111tj2 != null) {
            C19655911vJ editor2 = c19646111tj2.getEditor();
            editor2.setCallback(new InterfaceC19655811vI() { // from class: X.11v8
                public boolean LIZ;

                @Override // X.InterfaceC19655811vI
                public final void LIZ() {
                    this.LIZ = true;
                }

                @Override // X.InterfaceC19655811vI
                public final void LJLILLLLZI(CharSequence charSequence) {
                    this.LIZIZ.UR().zQ2(new C19652011ug(EnumC19367210pq.LINK_CHANGE, charSequence, this.LIZ, true));
                    this.LIZ = false;
                }
            });
            final int i2 = 1;
            editor2.setOnEditorActionListener(new TextView.OnEditorActionListener(this, c19646111tj2, i2) { // from class: X.12Y8
                public final int $t;
                public Object l0;
                public Object l1;

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i22, KeyEvent keyEvent) {
                    switch (this.$t) {
                        case 0:
                            return onEditorAction$0(this, textView, i22, keyEvent);
                        case 1:
                            return onEditorAction$1(this, textView, i22, keyEvent);
                        default:
                            return false;
                    }
                }

                {
                    this.$t = i2;
                    this.l0 = this;
                    this.l1 = c19646111tj2;
                }

                public static final boolean onEditorAction$0(C12Y8 c12y8, TextView textView, int i22, KeyEvent keyEvent) throws Throwable {
                    String string;
                    if (i22 == 6) {
                        NewsAnchorPublishViewModel newsAnchorPublishViewModelUR = ((NewsAnchorPublishPage) c12y8.l0).UR();
                        EnumC19367210pq enumC19367210pq = EnumC19367210pq.TITLE_CHANGE;
                        Editable editableC = C2204961BRm.c(((C19646111tj) c12y8.l1).getEditor(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOWvYNHA2SWLHTU5qLglE6Or4xDtyojXJOkCfyNUoyd1dnh3q5UCJ5I8NL1HvDE=", null));
                        if (editableC == null || (string = editableC.toString()) == null) {
                            string = "";
                        }
                        newsAnchorPublishViewModelUR.zQ2(new C19652011ug(enumC19367210pq, string, true, true));
                        return false;
                    }
                    return false;
                }

                public static final boolean onEditorAction$1(C12Y8 c12y8, TextView textView, int i22, KeyEvent keyEvent) throws Throwable {
                    String string;
                    if (i22 == 6) {
                        NewsAnchorPublishViewModel newsAnchorPublishViewModelUR = ((NewsAnchorPublishPage) c12y8.l0).UR();
                        EnumC19367210pq enumC19367210pq = EnumC19367210pq.LINK_CHANGE;
                        Editable editableC = C2204961BRm.c(((C19646111tj) c12y8.l1).getEditor(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOWvYNHA2SWLHTU5qLglE6Or4xDtyojXJOkCfyNUoyd1dnh3q5UCJ5I8NL1HvDE=", null));
                        if (editableC == null || (string = editableC.toString()) == null) {
                            string = "";
                        }
                        newsAnchorPublishViewModelUR.zQ2(new C19652011ug(enumC19367210pq, string, true, true));
                        return false;
                    }
                    return false;
                }
            });
            C786410Ut5.I7(new ACListenerS163S0100000_29(this, 65), c19646111tj2.getBtnPreviewLink());
        }
        C736680Sv4.LJIIIIZZ(this, UR(), new C2217381BqS() { // from class: X.11vG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19654511v5) obj).LLILZIL;
            }
        }, null, new AwS643S0100000_29(this, 144), 6);
        C736680Sv4.LJIIIIZZ(this, UR(), new C2217381BqS() { // from class: X.11vH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19654511v5) obj).LLILZLL;
            }
        }, null, new AwS643S0100000_29(this, 26), 6);
        C736680Sv4.LJIIIIZZ(this, UR(), new C2217381BqS() { // from class: X.11vC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19654511v5) obj).LL;
            }
        }, null, new AwS643S0100000_29(this, 27), 6);
        C736680Sv4.LJIIIIZZ(this, UR(), new C2217381BqS() { // from class: X.11vD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19654511v5) obj).LLILLJJLI;
            }
        }, null, new AwS643S0100000_29(this, 28), 6);
        C736680Sv4.LJIIIIZZ(this, UR(), new C2217381BqS() { // from class: X.11vE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19654511v5) obj).LLILLL;
            }
        }, null, new AwS643S0100000_29(this, 24), 6);
        C736680Sv4.LJIIIIZZ(this, UR(), new C2217381BqS() { // from class: X.11vB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19654511v5) obj).LLILZ;
            }
        }, null, new AwS643S0100000_29(this, 25), 6);
        C736680Sv4.LJIIIIZZ(this, UR(), new C2217381BqS() { // from class: X.11vF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19654511v5) obj).LLIZ;
            }
        }, null, new AwS633S0100000_19(this, 288), 6);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View decorView;
        Window window;
        final C19654211v2 c19654211v2SR = SR();
        c19654211v2SR.getClass();
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dsv, viewGroup, false);
        c19654211v2SR.LLILZIL = viewTd.findViewById(R.id.i6l);
        c19654211v2SR.LLILZLL = viewTd.findViewById(R.id.nea);
        c19654211v2SR.LLIZ = (C21578619ce) viewTd.findViewById(R.id.p4o);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, viewTd.getContext());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            viewTd.setBackgroundColor(iIntValue);
            TuxNavBar tuxNavBar = (TuxNavBar) viewTd.findViewById(R.id.p15);
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
            c1251150ifB.LJIIIIZZ = C20467080b.LIZIZ(2131823332);
            c1251150ifB.LIZJ(new AwS563S0100000_19(c19654211v2SR, 3187));
            c0om1.LJ(c1251150ifB);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = tuxNavBar.getContext().getString(2131826552);
            c0om1.LIZJ = c1250250idj;
            c0om1.LIZLLL = false;
            tuxNavBar.setNavActions(c0om1);
            tuxNavBar.setNavBackground(iIntValue);
            c19654211v2SR.LLILZ = tuxNavBar;
        }
        C19646111tj c19646111tj = (C19646111tj) viewTd.findViewById(R.id.kqs);
        C19GS c19gs = null;
        if (c19646111tj != null) {
            c19646111tj.getTvTitle().setText(c19646111tj.getContext().getString(2131826544));
            C19655911vJ editor = c19646111tj.getEditor();
            editor.setId(R.id.guk);
            editor.setHint(editor.getContext().getString(2131838670));
            editor.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.0zns
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) throws Throwable {
                    C19655911vJ editor2;
                    String string;
                    if (i == 5) {
                        C19646111tj c19646111tj2 = c19654211v2SR.LLILLL;
                        if (c19646111tj2 != null && (editor2 = c19646111tj2.getEditor()) != null) {
                            editor2.requestFocus();
                            Editable editableC = C2204961BRm.c(editor2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOWvYNHA2SWLHTU5qLglE6Or4xDtyojXJOkCfyNUoyd1dnh3q5UCJ5I8NLtPviMFb3a9+lw=", null));
                            if (editableC != null && (string = editableC.toString()) != null) {
                                editor2.setSelection(string.length());
                                return true;
                            }
                            return true;
                        }
                        return true;
                    }
                    return false;
                }
            });
            final int i = 1;
            editor.setOnFocusChangeListener(new View.OnFocusChangeListener(c19654211v2SR, i) { // from class: X.10kK
                public final int $t;
                public Object l0;

                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    switch (this.$t) {
                        case 0:
                            onFocusChange$0(this, view, z);
                            break;
                        case 1:
                            onFocusChange$1(this, view, z);
                            break;
                    }
                }

                {
                    this.$t = i;
                    this.l0 = c19654211v2SR;
                }

                public static final void onFocusChange$0(ViewOnFocusChangeListenerC19333010kK viewOnFocusChangeListenerC19333010kK, View view, boolean z) {
                    C21578619ce c21578619ce;
                    View childAt;
                    if (z && (c21578619ce = ((C19654211v2) viewOnFocusChangeListenerC19333010kK.l0).LLIZ) != null && (childAt = c21578619ce.getChildAt(0)) != null) {
                        int height = childAt.getHeight();
                        C19654211v2 c19654211v2 = (C19654211v2) viewOnFocusChangeListenerC19333010kK.l0;
                        C21578619ce c21578619ce2 = c19654211v2.LLIZ;
                        if (c21578619ce2 != null) {
                            HandlerHook.viewPost(c21578619ce2, new ARunnableS39S0101000_28(height, c19654211v2, 5));
                        }
                    }
                }

                public static final void onFocusChange$1(ViewOnFocusChangeListenerC19333010kK viewOnFocusChangeListenerC19333010kK, View view, boolean z) {
                    C21578619ce c21578619ce;
                    if (z && (c21578619ce = ((C19654211v2) viewOnFocusChangeListenerC19333010kK.l0).LLIZ) != null) {
                        c21578619ce.smoothScrollTo(0, 0);
                    }
                }
            });
        } else {
            c19646111tj = null;
        }
        c19654211v2SR.LLILLJJLI = c19646111tj;
        C19646111tj c19646111tj2 = (C19646111tj) viewTd.findViewById(R.id.kqo);
        if (c19646111tj2 != null) {
            String string = c19646111tj2.getContext().getString(2131826548);
            TuxTextView tvTitle = c19646111tj2.getTvTitle();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string);
            sbLIZ.append('*');
            C444910HcX c444910HcX = new C444910HcX(C2188811AlT.LIZIZ(sbLIZ));
            C786410Ut5.s2(c444910HcX, new C19654611v6(c19646111tj2), string.length(), string.length() + 1, 18);
            tvTitle.setText(c444910HcX);
            TuxTextView tvSubTitle = c19646111tj2.getTvSubTitle();
            C995130c0F.LIZLLL(tvSubTitle, true);
            tvSubTitle.setText(tvSubTitle.getContext().getString(2131838668));
            C19655911vJ editor2 = c19646111tj2.getEditor();
            editor2.setId(R.id.gtc);
            editor2.setHint(editor2.getContext().getString(2131838667));
            final int i2 = 0;
            editor2.setOnFocusChangeListener(new View.OnFocusChangeListener(c19654211v2SR, i2) { // from class: X.10kK
                public final int $t;
                public Object l0;

                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    switch (this.$t) {
                        case 0:
                            onFocusChange$0(this, view, z);
                            break;
                        case 1:
                            onFocusChange$1(this, view, z);
                            break;
                    }
                }

                {
                    this.$t = i2;
                    this.l0 = c19654211v2SR;
                }

                public static final void onFocusChange$0(ViewOnFocusChangeListenerC19333010kK viewOnFocusChangeListenerC19333010kK, View view, boolean z) {
                    C21578619ce c21578619ce;
                    View childAt;
                    if (z && (c21578619ce = ((C19654211v2) viewOnFocusChangeListenerC19333010kK.l0).LLIZ) != null && (childAt = c21578619ce.getChildAt(0)) != null) {
                        int height = childAt.getHeight();
                        C19654211v2 c19654211v2 = (C19654211v2) viewOnFocusChangeListenerC19333010kK.l0;
                        C21578619ce c21578619ce2 = c19654211v2.LLIZ;
                        if (c21578619ce2 != null) {
                            HandlerHook.viewPost(c21578619ce2, new ARunnableS39S0101000_28(height, c19654211v2, 5));
                        }
                    }
                }

                public static final void onFocusChange$1(ViewOnFocusChangeListenerC19333010kK viewOnFocusChangeListenerC19333010kK, View view, boolean z) {
                    C21578619ce c21578619ce;
                    if (z && (c21578619ce = ((C19654211v2) viewOnFocusChangeListenerC19333010kK.l0).LLIZ) != null) {
                        c21578619ce.smoothScrollTo(0, 0);
                    }
                }
            });
        } else {
            c19646111tj2 = null;
        }
        c19654211v2SR.LLILLL = c19646111tj2;
        c19654211v2SR.LLIZLLLIL = viewTd.findViewById(R.id.i3q);
        c19654211v2SR.LLJI = (TuxTextView) viewTd.findViewById(R.id.af5);
        C197039127h c197039127h = (C197039127h) viewTd.findViewById(R.id.cmo);
        c19654211v2SR.LLJ = c197039127h;
        if (c197039127h != null) {
            C786410Ut5.I7(new AkS95S0100000_29(c19654211v2SR, 93), c197039127h);
        }
        final Context context = viewTd.getContext();
        TuxTextView tuxTextView = c19654211v2SR.LLJI;
        if (tuxTextView != null) {
            String string2 = context.getString(2131838665);
            String string3 = context.getString(2131838679);
            String strJ4 = C786410Ut5.j4(string2, Arrays.copyOf(new Object[]{string3}, 1));
            int iLJJJ = a0.LJJJ(strJ4, string3, 0, false, 6);
            C444910HcX c444910HcX2 = new C444910HcX(strJ4);
            c444910HcX2.LIZ(51);
            C786410Ut5.s2(c444910HcX2, new AbstractC426530Gnz() { // from class: X.11v3
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    if (C0OBG.LIZIZ(view)) {
                        return;
                    }
                    Activity activityLIZ = C1388190mED.LIZ(context);
                    if ((activityLIZ instanceof C19EG) && activityLIZ != null) {
                        C19654211v2 c19654211v2 = c19654211v2SR;
                        Context context2 = context;
                        C1222450hut c1222450hut = c19654211v2.LL;
                        if (c1222450hut != null) {
                            c1222450hut.LIZ.UR().zQ2(new C19653011uq(context2));
                        }
                    }
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    Integer numLIZ = C1308910kAL.LIZ(R.attr.a1h, context);
                    if (numLIZ != null) {
                        textPaint.setColor(numLIZ.intValue());
                    }
                    C444890HcV c444890HcV = new C444890HcV();
                    c444890HcV.LIZ(52);
                    textPaint.setTypeface(c444890HcV.getTypeface());
                    textPaint.setUnderlineText(false);
                }
            }, iLJJJ, string3.length() + iLJJJ, 18);
            tuxTextView.setText(c444910HcX2);
            tuxTextView.setMovementMethod(C431260Gvc.LIZ);
        }
        C19654211v2 c19654211v2SR2 = SR();
        Context context2 = getContext();
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            decorView = window.getDecorView();
        } else {
            decorView = null;
        }
        c19654211v2SR2.getClass();
        KeyboardFakePopupWindow keyboardFakePopupWindowLIZ = C1110404Vy.LIZ().LIZ(context2, decorView);
        c19654211v2SR2.getClass();
        if (keyboardFakePopupWindowLIZ != null) {
            keyboardFakePopupWindowLIZ.LLJ = c19654211v2SR2;
        }
        if (keyboardFakePopupWindowLIZ != null) {
            keyboardFakePopupWindowLIZ.show();
        }
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity2 = getActivity();
            if (activity2 instanceof C19GS) {
                c19gs = (C19GS) activity2;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
