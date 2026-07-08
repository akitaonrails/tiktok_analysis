package com.ss.android.ugc.aweme.rss.feed.ui;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03H8;
import X.C03K6;
import X.C0ZP4;
import X.C1158940gGS;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1322110kVd;
import X.C1389890mGx;
import X.C13LE;
import X.C13LP;
import X.C1770850wBP;
import X.C1841350y17;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ACListenerS153S0100000_18;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.models.RssArticle;
import com.ss.android.ugc.aweme.rss.feed.viewmodel.RssFeedViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS105S0110000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class RssEntryViewHolder extends PowerCell<C1158940gGS> implements InterfaceC724530SbT, C03H8 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public C1841350y17 LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public SmartImageView LLILZIL;
    public final AssemVMLazy LLILZLL;
    public final C01GW LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RssEntryViewHolder.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/rss/feed/viewmodel/RssFeedViewModel;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C1841350y17 c1841350y17L5 = L5();
        if (c1841350y17L5 != null) {
            C786410Ut5.e9(c1841350y17L5, new ACListenerS153S0100000_18(this, 122));
        }
        C786410Ut5.I7(new ACListenerS153S0100000_18(this, 123), this.itemView);
        AssemVMLazy assemVMLazy = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZLLLIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0gPv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1158890gGN) obj).LLILZ);
            }
        }, C736820SvI.LIZLLL(), new AwS632S0100000_18(this, 189), 4);
    }

    public final C1841350y17 L5() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.tto) : null;
            this.LL = (C1841350y17) viewFindViewById;
        }
        return (C1841350y17) viewFindViewById;
    }

    public RssEntryViewHolder() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RssFeedViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 2195);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(741);
        this.LLILZLL = Intrinsics.LJFF(null, C01D1.LIZ) ? new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 2206), awS562S0100000_18, AFwS206S0000000_18.get$arr$(571), new AwS562S0100000_18((C03K6) this, 2207), new AwS562S0100000_18((C03K6) this, 2208), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 2209), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 2191), null, new AwS562S0100000_18((C03K6) this, 2192)) : Intrinsics.LJFF(null, C019F.LIZ) ? new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 2194), awS562S0100000_18, AFwS206S0000000_18.get$arr$(569), new AwS562S0100000_18((C03K6) this, 2196), new AwS562S0100000_18((C03K6) this, 2197), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 2198), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 2199), null, new AwS562S0100000_18((C03K6) this, 2200)) : new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 2201), awS562S0100000_18, AFwS206S0000000_18.get$arr$(570), new AwS562S0100000_18((C03K6) this, 2202), new AwS562S0100000_18((C03K6) this, 2203), new AwS562S0100000_18((C03K6) this, 2204), aFwS256S0000000_18, null, null, new AwS562S0100000_18((C03K6) this, 2205));
        this.LLIZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2193));
    }

    public final RssArticle I5() {
        C1158940gGS item = getItem();
        if (item != null) {
            return item.LL;
        }
        return null;
    }

    public final void N5() {
        RssArticle rssArticle;
        RssArticle rssArticleI5 = I5();
        if (rssArticleI5 != null) {
            if (rssArticleI5.isPublished) {
                ((C1389890mGx) this.LLIZ.getValue()).LIZIZ();
                ((C1389890mGx) this.LLIZ.getValue()).LJIIJJI();
                return;
            }
            AssemVMLazy assemVMLazy = this.LLILZLL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZLLLIL;
            boolean z = false;
            RssFeedViewModel rssFeedViewModel = (RssFeedViewModel) assemVMLazy.getValue();
            RssArticle rssArticle2 = rssFeedViewModel.LLILZ;
            if (rssArticle2 == null || rssArticle2.guid != rssArticleI5.guid) {
                rssArticle = rssArticleI5;
            } else {
                z = true;
                rssArticle = null;
            }
            rssFeedViewModel.LLILZ = rssArticle;
            rssFeedViewModel.setState(new AwS105S0110000_18(z, rssArticleI5, 1));
        }
    }

    @Override // X.C03H8
    public final View LJJIJL() {
        return this.itemView;
    }

    public final void P5(boolean z) {
        C1841350y17 c1841350y17L5;
        RssArticle rssArticleI5;
        if ((!z || (rssArticleI5 = I5()) == null || !rssArticleI5.isPublished) && (c1841350y17L5 = L5()) != null) {
            c1841350y17L5.setEnabled(z);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        float f;
        RssArticle rssArticleI5 = I5();
        if (rssArticleI5 != null) {
            View viewFindViewById = this.LLILLJJLI;
            View viewFindViewById2 = null;
            if (viewFindViewById == null) {
                View viewLJJIJL = LJJIJL();
                if (viewLJJIJL != null) {
                    viewFindViewById = viewLJJIJL.findViewById(R.id.ttq);
                } else {
                    viewFindViewById = null;
                }
                this.LLILLJJLI = (TuxTextView) viewFindViewById;
            }
            TextView textView = (TextView) viewFindViewById;
            if (textView != null) {
                textView.setText(rssArticleI5.title);
            }
            View viewFindViewById3 = this.LLILLL;
            if (viewFindViewById3 == null) {
                View viewLJJIJL2 = LJJIJL();
                if (viewLJJIJL2 != null) {
                    viewFindViewById3 = viewLJJIJL2.findViewById(R.id.ttn);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLILLL = (TuxTextView) viewFindViewById3;
            }
            TextView textView2 = (TextView) viewFindViewById3;
            if (textView2 != null) {
                textView2.setText(rssArticleI5.description);
            }
            View viewFindViewById4 = this.LLILZ;
            if (viewFindViewById4 == null) {
                View viewLJJIJL3 = LJJIJL();
                if (viewLJJIJL3 != null) {
                    viewFindViewById4 = viewLJJIJL3.findViewById(R.id.ttm);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLILZ = (TuxTextView) viewFindViewById4;
            }
            TextView textView3 = (TextView) viewFindViewById4;
            if (textView3 != null) {
                textView3.setText(rssArticleI5.date);
            }
            String str = (String) C13LP.LJJJLL(rssArticleI5.imageUrls);
            if (str != null) {
                Uri uriBuild = UriProtector.parse(str).buildUpon().appendQueryParameter("x-tt-pns-dt-pass-id", "268435457").build();
                View viewFindViewById5 = this.LLILZIL;
                if (viewFindViewById5 == null) {
                    View viewLJJIJL4 = LJJIJL();
                    if (viewLJJIJL4 != null) {
                        viewFindViewById5 = viewLJJIJL4.findViewById(R.id.f809ttp);
                    } else {
                        viewFindViewById5 = null;
                    }
                    this.LLILZIL = (SmartImageView) viewFindViewById5;
                }
                C1322110kVd c1322110kVd = (C1322110kVd) viewFindViewById5;
                if (c1322110kVd != null) {
                    c1322110kVd.setImageURI(uriBuild.toString());
                }
            }
            if (rssArticleI5.isPublished) {
                f = 0.4f;
            } else {
                f = 1.0f;
            }
            View viewFindViewById6 = this.LLILLJJLI;
            if (viewFindViewById6 == null) {
                View viewLJJIJL5 = LJJIJL();
                if (viewLJJIJL5 != null) {
                    viewFindViewById6 = viewLJJIJL5.findViewById(R.id.ttq);
                } else {
                    viewFindViewById6 = null;
                }
                this.LLILLJJLI = (TuxTextView) viewFindViewById6;
            }
            TuxTextView tuxTextView = (TuxTextView) viewFindViewById6;
            if (tuxTextView != null) {
                C786410Ut5.B5(tuxTextView, f);
            }
            View viewFindViewById7 = this.LLILLL;
            if (viewFindViewById7 == null) {
                View viewLJJIJL6 = LJJIJL();
                if (viewLJJIJL6 != null) {
                    viewFindViewById7 = viewLJJIJL6.findViewById(R.id.ttn);
                } else {
                    viewFindViewById7 = null;
                }
                this.LLILLL = (TuxTextView) viewFindViewById7;
            }
            TuxTextView tuxTextView2 = (TuxTextView) viewFindViewById7;
            if (tuxTextView2 != null) {
                C786410Ut5.B5(tuxTextView2, f);
            }
            View viewFindViewById8 = this.LLILZ;
            if (viewFindViewById8 == null) {
                View viewLJJIJL7 = LJJIJL();
                if (viewLJJIJL7 != null) {
                    viewFindViewById8 = viewLJJIJL7.findViewById(R.id.ttm);
                } else {
                    viewFindViewById8 = null;
                }
                this.LLILZ = (TuxTextView) viewFindViewById8;
            }
            TuxTextView tuxTextView3 = (TuxTextView) viewFindViewById8;
            if (tuxTextView3 != null) {
                C786410Ut5.B5(tuxTextView3, f);
            }
            View view = this.LLILZIL;
            if (view == null) {
                View viewLJJIJL8 = LJJIJL();
                if (viewLJJIJL8 != null) {
                    viewFindViewById2 = viewLJJIJL8.findViewById(R.id.f809ttp);
                }
                this.LLILZIL = (SmartImageView) viewFindViewById2;
                view = viewFindViewById2;
            }
            SmartImageView smartImageView = (SmartImageView) view;
            if (smartImageView != null) {
                C786410Ut5.u5(smartImageView, f);
            }
            P5(!rssArticleI5.isPublished);
        }
        AssemVMLazy assemVMLazy = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZLLLIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0gPx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158890gGN) obj).LLILZIL;
            }
        }, null, new AwS632S0100000_18(this, 0), 6);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.em9, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onResume(boolean z) {
        super.onResume(z);
        P5(true);
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
