package com.ss.android.ugc.aweme.commentv2.commentlist.powercell;

import X.AbstractC1387200mCc;
import X.AbstractC848400XPy;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C03K6;
import X.C0BTX;
import X.C0DHG;
import X.C0HD5;
import X.C0HIW;
import X.C0HIX;
import X.C0HU6;
import X.C0HUY;
import X.C0XPD;
import X.C0XQ7;
import X.C0ZP4;
import X.C1074340e40;
import X.C1077240e8g;
import X.C10EU;
import X.C1107004Uq;
import X.C1154960gA2;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1339440kxa;
import X.C1339690kxz;
import X.C1341560l10;
import X.C1341920l1a;
import X.C1341940l1c;
import X.C1341960l1e;
import X.C1342000l1i;
import X.C1342130l1v;
import X.C1342220l24;
import X.C1343870l4j;
import X.C1345000l6Y;
import X.C1346290l8d;
import X.C1346310l8f;
import X.C1346330l8h;
import X.C1350920lG6;
import X.C1351950lHl;
import X.C1356610lPH;
import X.C1372520low;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1605770rt9;
import X.C1606010rtX;
import X.C1609500rzA;
import X.C1697810uHb;
import X.C1770850wBP;
import X.C1906580ziK;
import X.C1908030zkf;
import X.C19474211Gy;
import X.C19719212De;
import X.C19719912Dl;
import X.C19746312Np;
import X.C19746412Nq;
import X.C19EG;
import X.C19ME;
import X.C21647019ng;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C2344009Gk;
import X.C2393909Zp;
import X.C275980Ark;
import X.C294210Bg3;
import X.C302050Bsh;
import X.C418440Gaw;
import X.C427870Gq9;
import X.C452070Ho5;
import X.C452080Ho6;
import X.C452501pT;
import X.C461720I8s;
import X.C512401z8;
import X.C5182020e;
import X.C531650Kt9;
import X.C632670Orh;
import X.C724750Sbp;
import X.C735840Sti;
import X.C736680Sv4;
import X.C736950SvV;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C946803n0;
import X.C985403tE;
import X.C991920bv4;
import X.EnumC1260920iuw;
import X.EnumC1606080rte;
import X.EnumC1615506Uf;
import X.EnumC19746112Nn;
import X.InterfaceC0148002o;
import X.InterfaceC1398730mVD;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnLongClickListenerC1401960maQ;
import Y.ACListenerS56S0101000_21;
import Y.ARunnableS116S0100000_16;
import Y.ARunnableS90S0200000_21;
import Y.ATListenerS454S0100000_21;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.commentlist.managementv2.CommentManagementAssemVM;
import com.ss.android.ugc.aweme.comment.longpresspanel.ui.CommentLongPressFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.OptionCount;
import com.ss.android.ugc.aweme.comment.model.PollInfo;
import com.ss.android.ugc.aweme.comment.model.PollStyle;
import com.ss.android.ugc.aweme.comment.poll.CommentPollViewModel;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentListAssemVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS32S0202000_21;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS668S0100000_19;
import kotlin.jvm.internal.AwS79S0500000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class PollCell extends PowerCell<C1341920l1a> implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public static final Map<String, Typeface> LLJZIJLIL;
    public ConstraintLayout LL;
    public SmartImageView LLILLJJLI;
    public TuxTextView LLILLL;
    public LinearLayout LLILZ;
    public final List<C1342000l1i> LLILZIL = new ArrayList();
    public UrlModel LLILZLL;
    public final C736950SvV LLIZ;
    public final C01GW LLIZLLLIL;
    public boolean LLJ;
    public final List<C0ZP4> LLJI;
    public CommentContextSource LLJIJIL;
    public FrameLayout LLJILJIL;
    public C427870Gq9 LLJILJILJ;
    public C1609500rzA LLJILLL;
    public InterfaceC1398730mVD LLJJ;
    public SmartImageView LLJJI;
    public C1343870l4j LLJJIII;
    public TextView LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public TuxTextView LLJJJ;
    public TuxTextView LLJJJIL;
    public TuxTextView LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final List<C21647019ng> LLJJL;
    public ARunnableS90S0200000_21 LLJJLIIIJLLLLLLLZ;
    public Drawable LLJL;
    public final C01GW LLJLIL;
    public final BPEAHandler LLJLILLLLZIIL;
    public final ARunnableS116S0100000_16 LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PollCell.class, "commentListVM", "getCommentListVM()Lcom/ss/android/ugc/aweme/commentv2/commentlist/viewmodel/CommentListAssemVM;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJZIJLIL = new LinkedHashMap();
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

    public PollCell() {
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommentListAssemVM.class);
        AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 123);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(111);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 384), awS560S0100000_16, AFwS209S0000000_21.get$arr$(190), new AwS560S0100000_16((C03K6) this, 133), new AwS560S0100000_16((C03K6) this, 135), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 756), aFwS259S0000000_21, new AwS560S0100000_16((C03K6) this, 136), null, new AwS560S0100000_16((C03K6) this, 137));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS560S0100000_16 awS560S0100000_162 = new AwS560S0100000_16((C03K6) this, 134);
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 755);
            AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(c19719912DlLIZ, 385);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS560S0100000_162, 33));
            AwS560S0100000_16 awS560S0100000_163 = new AwS560S0100000_16(c01gwLIZIZ, 138);
            AwS560S0100000_16 awS560S0100000_164 = new AwS560S0100000_16(c01gwLIZIZ, 139);
            AwS560S0100000_16 awS560S0100000_165 = new AwS560S0100000_16(c01gwLIZIZ, 140);
            AwS560S0100000_16 awS560S0100000_166 = new AwS560S0100000_16(c01gwLIZIZ, 141);
            AwS560S0100000_16 awS560S0100000_167 = new AwS560S0100000_16(c01gwLIZIZ, 122);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            new AssemVMLazy(awS565S0100000_21, awS560S0100000_16, new C452080Ho6(), awS560S0100000_163, awS560S0100000_164, awS563S0100000_19, aFwS259S0000000_21, awS560S0100000_165, awS560S0100000_166, awS560S0100000_167);
        } else if (Intrinsics.LJFF(obj, obj)) {
            new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 380), awS560S0100000_16, AFwS209S0000000_21.get$arr$(188), new AwS560S0100000_16((C03K6) this, 124), new AwS560S0100000_16((C03K6) this, 125), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 754), aFwS259S0000000_21, new AwS560S0100000_16((C03K6) this, 126), null, new AwS560S0100000_16((C03K6) this, 127));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 383), awS560S0100000_16, AFwS209S0000000_21.get$arr$(189), new AwS560S0100000_16((C03K6) this, 129), new AwS560S0100000_16((C03K6) this, 130), new AwS560S0100000_16((C03K6) this, 131), aFwS259S0000000_21, null, null, new AwS560S0100000_16((C03K6) this, 132));
        }
        this.LLIZ = new C736950SvV(C13LE.LIZ(CommentPollViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS259S0000000_21.get$arr$(112), null, null, null);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(CommentManagementAssemVM.class);
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS79S0500000_19(this, c19719912DlLIZ2, new C5182020e((C13IQ) c19719912DlLIZ2, 432), AFwS259S0000000_21.get$arr$(390), (Function0) null, 10));
        this.LLJI = new ArrayList();
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 753));
        this.LLJJL = new ArrayList();
        this.LLJLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 128));
        this.LLJLILLLLZIIL = new BPEAHandler(Looper.getMainLooper());
        this.LLJLL = new ARunnableS116S0100000_16(this, 30);
        this.LLJLLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 382));
        this.LLJLLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 381));
    }

    public final void S5() {
        Iterator it2 = ((ArrayList) this.LLJJL).iterator();
        while (it2.hasNext()) {
            ((C21647019ng) it2.next()).LIZ();
        }
        ((ArrayList) this.LLJJL).clear();
        for (View view : (ArrayList) this.LLILZIL) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
            view.setTranslationX(0.0f);
        }
    }

    public final void T5() {
        this.LLJLILLLLZIIL.removeCallbacks(this.LLJLL);
    }

    public final CommentPollViewModel X5() {
        return (CommentPollViewModel) this.LLIZ.getValue();
    }

    public final CommentContextSource a6() {
        if (this.LLJIJIL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJ(this.itemView, null), "source_default_key", CommentContextSource.class, null);
            this.LLJIJIL = interfaceC1555100qZQLIZIZ != null ? (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJIJIL;
    }

    public final boolean h6() {
        String strEnterFrom;
        Aweme aweme;
        C19EG c19eg;
        Activity activityLIZIZ;
        Aweme aweme2;
        C1341920l1a item = getItem();
        if (item == null || item.LLILLJJLI == 1) {
            return false;
        }
        CommentContextSource commentContextSourceA6 = a6();
        Aweme aweme3 = commentContextSourceA6 != null ? CommentContextSourceKt.aweme(commentContextSourceA6) : null;
        CommentContextSource commentContextSourceA62 = a6();
        if (commentContextSourceA62 == null || (strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSourceA62)) == null) {
            strEnterFrom = "";
        }
        Fragment fragment = getFragment();
        if (fragment == null || !fragment.isAdded()) {
            fragment = null;
        }
        CommentContextSource commentContextSourceA63 = a6();
        FragmentManager childFragmentManager = (commentContextSourceA63 == null || !commentContextSourceA63.isRefactorTitlePanel() || fragment == null) ? null : fragment.getChildFragmentManager();
        String str = CommentLongPressFragment._pnsPageId;
        Context context = this.itemView.getContext();
        AFwS231S0000000_3 aFwS231S0000000_3 = AFwS231S0000000_3.get$arr$(225);
        CommentContextSource commentContextSourceA64 = a6();
        List<C1346330l8h> listLJIILJJIL = C1697810uHb.LJIILJJIL(C10EU.LJIIZILJ((commentContextSourceA64 == null || (aweme2 = CommentContextSourceKt.aweme(commentContextSourceA64)) == null) ? null : AwemeExtKt.getAuthorUid(aweme2)) ? new C1346290l8d("delete", Integer.valueOf(R.raw.icon_trash_bin), context.getString(R.string.gm7), new AwS417S0200000_16(this, item, 97), new C1346310l8f(0, false, null, 6), aFwS231S0000000_3) : new C1346290l8d("report", Integer.valueOf(R.raw.icon_flag), context.getString(R.string.s65), new AwS422S0200000_21(this, item, 118), new C1346310l8f(0, false, null, 6), aFwS231S0000000_3));
        C1341960l1e c1341960l1e = new C1341960l1e(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        Activity activityLIZ = (abstractC1387200mCcLIZIZ == null || (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) == null) ? null : C1388190mED.LIZ(activityLIZIZ);
        if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null) {
            CommentLongPressFragment commentLongPressFragment = new CommentLongPressFragment();
            commentLongPressFragment.LLJI = aweme3;
            commentLongPressFragment.LLJILLL = listLJIILJJIL;
            commentLongPressFragment.LLJJ = c1341960l1e;
            commentLongPressFragment.LLJILJILJ = null;
            commentLongPressFragment.LLJJI = strEnterFrom;
            if (childFragmentManager == null) {
                childFragmentManager = c19eg.getSupportFragmentManager();
            }
            commentLongPressFragment.UR(c19eg, childFragmentManager);
        }
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        CommentContextSource commentContextSourceA65 = a6();
        String strEnterMethod = commentContextSourceA65 != null ? CommentContextSourceKt.enterMethod(commentContextSourceA65) : null;
        c1350920lG6.getClass();
        if (aweme3 != null) {
            C735840Sti c735840Sti = C735840Sti.LIZ;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("message_type", "comment_poll");
            c2344009Gk.LJIIIIZZ("enter_from", strEnterFrom);
            c2344009Gk.LJIIIIZZ("enter_method", strEnterMethod);
            c2344009Gk.LJIIIIZZ("group_id", aweme3.getAid());
            User author = aweme3.getAuthor();
            c2344009Gk.LJIIIIZZ("author_id", author != null ? author.getUid() : null);
            User author2 = aweme3.getAuthor();
            c735840Sti.getClass();
            c2344009Gk.LIZJ(C735840Sti.LJIIIIZZ(author2), "follow_status");
            C735840Sti.LIZIZ(aweme3, c2344009Gk);
            C1350920lG6.LJJJ(c2344009Gk, "ttinter_comment_multi_genre_hotzone_long_press");
        }
        CommentContextSource commentContextSourceA66 = a6();
        String str2 = C10EU.LJIIZILJ((commentContextSourceA66 == null || (aweme = CommentContextSourceKt.aweme(commentContextSourceA66)) == null) ? null : AwemeExtKt.getAuthorUid(aweme)) ? "delete_poll" : "report_poll";
        CommentContextSource commentContextSourceA67 = a6();
        String strEnterMethod2 = commentContextSourceA67 != null ? CommentContextSourceKt.enterMethod(commentContextSourceA67) : null;
        if (aweme3 != null) {
            C735840Sti c735840Sti2 = C735840Sti.LIZ;
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("message_type", "comment_poll");
            c2344009Gk2.LJIIIIZZ("function_type", str2);
            c2344009Gk2.LJIIIIZZ("enter_from", strEnterFrom);
            c2344009Gk2.LJIIIIZZ("enter_method", strEnterMethod2);
            c2344009Gk2.LJIIIIZZ("group_id", aweme3.getAid());
            User author3 = aweme3.getAuthor();
            c2344009Gk2.LJIIIIZZ("author_id", author3 != null ? author3.getUid() : null);
            User author4 = aweme3.getAuthor();
            c735840Sti2.getClass();
            c2344009Gk2.LIZJ(C735840Sti.LJIIIIZZ(author4), "follow_status");
            C735840Sti.LIZIZ(aweme3, c2344009Gk2);
            C1350920lG6.LJJJ(c2344009Gk2, "ttinter_comment_multi_genre_quick_menu_show");
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008b A[PHI: r0
      0x008b: PHI (r0v80 android.graphics.Typeface) = (r0v79 android.graphics.Typeface), (r0v82 android.graphics.Typeface) binds: [B:14:0x0079, B:17:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onItemViewCreated() {
        /*
            Method dump skipped, instruction units count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.commentlist.powercell.PollCell.onItemViewCreated():void");
    }

    public final void U5() {
        DialogFragment dialogFragment;
        FragmentManager childFragmentManager;
        Fragment fragment = getFragment();
        Fragment fragmentLJJJJZI = null;
        if (fragment == null || !fragment.isAdded()) {
            fragment = null;
        }
        CommentContextSource commentContextSourceA6 = a6();
        if (commentContextSourceA6 != null && commentContextSourceA6.isRefactorTitlePanel()) {
            if (fragment != null && (childFragmentManager = fragment.getChildFragmentManager()) != null) {
                fragmentLJJJJZI = childFragmentManager.LJJJJZI("comment_long_press_panel");
            }
            if ((fragmentLJJJJZI instanceof DialogFragment) && (dialogFragment = (DialogFragment) fragmentLJJJJZI) != null) {
                dialogFragment.dismissAllowingStateLoss();
                return;
            }
        }
        String str = CommentLongPressFragment._pnsPageId;
        C2393909Zp.LIZ(this.itemView.getContext());
    }

    public final String c6() {
        CommentCommonModel commonModel;
        CommentContextSource commentContextSourceA6 = a6();
        if (commentContextSourceA6 == null || (commonModel = commentContextSourceA6.getCommonModel()) == null) {
            return null;
        }
        return commonModel.eventType;
    }

    public final Fragment getFragment() {
        Fragment fragment;
        LifecycleOwner currentLifecycleOwner = getCurrentLifecycleOwner();
        return (!(currentLifecycleOwner instanceof Fragment) || (fragment = (Fragment) currentLifecycleOwner) == null) ? C946803n0.LIZ(this.itemView) : fragment;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        Iterator it2 = ((ArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((C0ZP4) it2.next()).dispose();
        }
        ((ArrayList) this.LLJI).clear();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        ARunnableS90S0200000_21 aRunnableS90S0200000_21 = this.LLJJLIIIJLLLLLLLZ;
        if (aRunnableS90S0200000_21 != null) {
            HandlerHook.viewRemoveCallbacks(this.itemView, aRunnableS90S0200000_21);
        }
        this.LLJJLIIIJLLLLLLLZ = null;
        T5();
        ConstraintLayout constraintLayout = this.LL;
        if (constraintLayout != null) {
            constraintLayout.setBackground(this.LLJL);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        InterfaceC1398730mVD interfaceC1398730mVD;
        S5();
        T5();
        this.LLILZLL = null;
        SmartImageView smartImageView = this.LLILLJJLI;
        if (smartImageView != null) {
            smartImageView.setImageDrawable(null);
        }
        SmartImageView smartImageView2 = this.LLILLJJLI;
        if (smartImageView2 != null) {
            C786410Ut5.LLFF(8, smartImageView2);
        }
        if (((Number) C275980Ark.LIZ.getValue()).intValue() == 1 && (interfaceC1398730mVD = this.LLJJ) != null) {
            interfaceC1398730mVD.reset();
        }
        if (C302050Bsh.LIZ() || C1341560l10.LIZLLL()) {
            if (C294210Bg3.LIZ()) {
                C427870Gq9 c427870Gq9 = this.LLJILJILJ;
                if (c427870Gq9 != null) {
                    c427870Gq9.setImageResource(0);
                }
            } else {
                SmartImageView smartImageView3 = this.LLJJI;
                if (smartImageView3 != null) {
                    smartImageView3.setImageResource(0);
                }
            }
        }
        C427870Gq9 c427870Gq92 = this.LLJILJILJ;
        if (c427870Gq92 != null) {
            c427870Gq92.setImageDrawable(null);
        }
        TuxTextView tuxTextView = this.LLJJIJIIJIL;
        if (tuxTextView != null) {
            tuxTextView.setText("");
        }
        TuxTextView tuxTextView2 = this.LLJJIJIL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText("");
        }
        TuxTextView tuxTextView3 = this.LLJJIJIL;
        if (tuxTextView3 != null) {
            C786410Ut5.LLLLZLL(tuxTextView3, 8);
        }
        TuxTextView tuxTextView4 = this.LLJJJ;
        if (tuxTextView4 != null) {
            C786410Ut5.LLLLZLL(tuxTextView4, 8);
        }
        TuxTextView tuxTextView5 = this.LLJJJIL;
        if (tuxTextView5 != null) {
            tuxTextView5.setText("");
        }
        TuxTextView tuxTextView6 = this.LLJJJJ;
        if (tuxTextView6 != null) {
            tuxTextView6.setText("");
        }
        TuxTextView tuxTextView7 = this.LLJJJJJIL;
        if (tuxTextView7 != null) {
            C786410Ut5.LLLLZLL(tuxTextView7, 8);
        }
        TuxTextView tuxTextView8 = this.LLJJJJJIL;
        if (tuxTextView8 != null) {
            C786410Ut5.h9(tuxTextView8, null);
        }
        for (View view : (ArrayList) this.LLILZIL) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
            view.setAlpha(1.0f);
        }
        ((ArrayList) this.LLILZIL).clear();
        super.unBind();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Iterable, java.util.ArrayList, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v9, types: [X.13BV] */
    public static List R5(PollInfo pollInfo) {
        ?? arrayList;
        int iIndexOf;
        Object obj;
        String string;
        List listLIZ = C1341940l1c.LIZ(pollInfo);
        if (!q6(pollInfo)) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
            Iterator it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                it2.next();
                arrayList2.add(new C991920bv4(0, ""));
            }
            return arrayList2;
        }
        List listLIZ2 = C1341940l1c.LIZ(pollInfo);
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLIZ2, 10));
        Iterator it3 = listLIZ2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Integer.valueOf(((OptionCount) it3.next()).count));
        }
        if (arrayList3.isEmpty()) {
            arrayList = C13BV.INSTANCE;
        } else {
            int iLJZI = C13LP.LJZI(arrayList3);
            if (iLJZI == 0) {
                arrayList = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    ((Number) it4.next()).intValue();
                    arrayList.add(0);
                }
            } else {
                double d = iLJZI;
                if (d < 1.0d) {
                    d = 1.0d;
                }
                ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(Double.valueOf((((double) ((Number) it5.next()).intValue()) * 100.0d) / d));
                }
                ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
                Iterator it6 = arrayList4.iterator();
                while (it6.hasNext()) {
                    arrayList5.add(Integer.valueOf((int) Math.floor(((Number) it6.next()).doubleValue())));
                }
                arrayList = new ArrayList(arrayList5);
                int iLJZI2 = 100 - C13LP.LJZI(arrayList);
                ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
                int i = 0;
                for (Object obj2 : arrayList4) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        arrayList6.add(new Pair(Integer.valueOf(i), Double.valueOf(((Number) obj2).doubleValue() - ((Number) ListProtector.get(arrayList5, i)).doubleValue())));
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                List listLJLLLL = C13LP.LJLLLL(new C512401z8(4), arrayList6);
                ArrayList arrayList7 = new ArrayList(C15438062q.LJIJJ(listLJLLLL, 10));
                Iterator it7 = listLJLLLL.iterator();
                while (it7.hasNext()) {
                    arrayList7.add(Integer.valueOf(((Number) ((Pair) it7.next()).getFirst()).intValue()));
                }
                int i3 = 0;
                while (iLJZI2 > 0) {
                    int iIntValue = ((Number) ListProtector.get(arrayList7, i3 % arrayList7.size())).intValue();
                    ListProtector.set(arrayList, iIntValue, Integer.valueOf(((Number) ListProtector.get(arrayList, iIntValue)).intValue() + 1));
                    iLJZI2--;
                    i3++;
                }
                if (arrayList.size() == arrayList3.size() && (iIndexOf = arrayList.indexOf(100)) >= 0) {
                    Iterable iterableLJIIIZ = C1697810uHb.LJIIIZ(arrayList3);
                    if (!(iterableLJIIIZ instanceof Collection) || !((Collection) iterableLJIIIZ).isEmpty()) {
                        C531650Kt9 it8 = iterableLJIIIZ.iterator();
                        while (true) {
                            if (!it8.LLILLL) {
                                break;
                            }
                            int iNextInt = it8.nextInt();
                            if (iNextInt != iIndexOf && ((Number) ListProtector.get(arrayList3, iNextInt)).intValue() > 0) {
                                ArrayList arrayList8 = new ArrayList((Collection) arrayList);
                                ListProtector.set(arrayList8, iIndexOf, 99);
                                arrayList = arrayList8;
                                break;
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayList9 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        int i4 = 0;
        for (Object obj3 : arrayList) {
            int i5 = i4 + 1;
            if (i4 >= 0) {
                int iIntValue2 = ((Number) obj3).intValue();
                if (i4 < arrayList3.size()) {
                    obj = ListProtector.get(arrayList3, i4);
                } else {
                    obj = 0;
                }
                if (((Number) obj).intValue() > 0 && iIntValue2 < 1) {
                    string = "<1%";
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(iIntValue2);
                    sb.append('%');
                    string = sb.toString();
                }
                arrayList9.add(new C991920bv4(iIntValue2, string));
                i4 = i5;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return arrayList9;
    }

    public static Long b6(PollInfo pollInfo) {
        Long l = pollInfo.createTime;
        if (l != null) {
            long jLongValue = l.longValue();
            Long l2 = pollInfo.expireTime;
            if (l2 != null) {
                long jLongValue2 = l2.longValue();
                if (jLongValue > 0 && jLongValue2 > 0) {
                    return Long.valueOf((jLongValue + jLongValue2) * 1000);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static boolean e6(PollInfo pollInfo) {
        int i = pollInfo.pollStatus;
        if (i == 2 || i == 3 || i == 4) {
            return true;
        }
        Long lB6 = b6(pollInfo);
        if (lB6 != null && lB6.longValue() <= System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    public static int i6(PollInfo pollInfo) {
        List listLIZ = C1341940l1c.LIZ(pollInfo);
        Integer num = pollInfo.userPollOption;
        if (num == null || num.intValue() < 0) {
            return -1;
        }
        Iterator it2 = listLIZ.iterator();
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                if (((OptionCount) it2.next()).index == num.intValue()) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() < 0) {
            return -1;
        }
        return numValueOf.intValue();
    }

    public static boolean q6(PollInfo pollInfo) {
        if (e6(pollInfo)) {
            return true;
        }
        Integer num = pollInfo.userPollOption;
        if (num != null && num.intValue() >= 0) {
            return true;
        }
        return false;
    }

    public final void I5(int i) {
        boolean z;
        float f;
        if (i != 1 && i != 3 && !this.LLJ) {
            z = false;
        } else {
            z = true;
        }
        int i2 = 0;
        for (Object obj : (ArrayList) this.LLILZIL) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C1342000l1i c1342000l1i = (C1342000l1i) obj;
                if (z) {
                    f = 0.4f;
                } else {
                    f = 1.0f;
                }
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1342000l1i);
                c1342000l1i.setAlpha(f);
                if (z) {
                    C786410Ut5.b8(c1342000l1i, null);
                    c1342000l1i.setClickable(false);
                } else {
                    c1342000l1i.setClickable(true);
                    C786410Ut5.b8(c1342000l1i, new ACListenerS56S0101000_21(this, i2, 1));
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public final void L5(int i) {
        PollInfo pollInfo;
        if (i != 1) {
            if (i != 3) {
                TuxTextView tuxTextView = this.LLJJJJJIL;
                if (tuxTextView != null) {
                    C786410Ut5.LLLLZLL(tuxTextView, 8);
                }
                TuxTextView tuxTextView2 = this.LLJJJJJIL;
                if (tuxTextView2 != null) {
                    C786410Ut5.h9(tuxTextView2, null);
                }
                C1341920l1a item = getItem();
                if (item != null && (pollInfo = item.LL) != null) {
                    u6(pollInfo);
                    v6(pollInfo);
                    return;
                }
                return;
            }
            TuxTextView tuxTextView3 = this.LLJJJIL;
            if (tuxTextView3 != null) {
                C786410Ut5.LLLLZLL(tuxTextView3, 4);
            }
            TuxTextView tuxTextView4 = this.LLJJJJ;
            if (tuxTextView4 != null) {
                C786410Ut5.LLLLZLL(tuxTextView4, 4);
            }
            TuxTextView tuxTextView5 = this.LLJJJJJIL;
            if (tuxTextView5 == null) {
                return;
            }
            int iIntValue = 0;
            C786410Ut5.LLLLZLL(tuxTextView5, 0);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, tuxTextView5.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            }
            tuxTextView5.setTextColor(iIntValue);
            tuxTextView5.setText(2131829226);
            C786410Ut5.I7(new C1077240e8g(this, 1), tuxTextView5);
            return;
        }
        TuxTextView tuxTextView6 = this.LLJJJIL;
        if (tuxTextView6 != null) {
            C786410Ut5.LLLLZLL(tuxTextView6, 4);
        }
        TuxTextView tuxTextView7 = this.LLJJJJ;
        if (tuxTextView7 != null) {
            C786410Ut5.LLLLZLL(tuxTextView7, 4);
        }
        TuxTextView tuxTextView8 = this.LLJJJJJIL;
        if (tuxTextView8 == null) {
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextView8, 8);
    }

    public final void P5(PollInfo pollInfo) {
        Object c991920bv4;
        boolean z;
        boolean z2;
        float f;
        float f2;
        float f3;
        boolean z3;
        List listLIZ = C1341940l1c.LIZ(pollInfo);
        List listR5 = R5(pollInfo);
        int iI6 = i6(pollInfo);
        int iI62 = i6(pollInfo);
        UrlModel urlModel = this.LLILZLL;
        boolean zQ6 = q6(pollInfo);
        int i = 0;
        for (Object obj : listLIZ) {
            int i2 = i + 1;
            if (i >= 0) {
                OptionCount optionCount = (OptionCount) obj;
                if (i < ((ArrayList) listR5).size()) {
                    c991920bv4 = ListProtector.get(listR5, i);
                } else {
                    c991920bv4 = new C991920bv4(0, "");
                }
                C1342000l1i c1342000l1i = (C1342000l1i) ListProtector.get(this.LLILZIL, i);
                c1342000l1i.setOptionLabel(optionCount.text);
                c1342000l1i.setFillPercent(r12.LIZ);
                c1342000l1i.setDisplayPercentText(((C991920bv4) c991920bv4).LIZIZ);
                if (optionCount.count > 0) {
                    z = true;
                } else {
                    z = false;
                }
                c1342000l1i.setHasAnyVote(z);
                if (i == iI62) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c1342000l1i.setSelectedOption(z2);
                c1342000l1i.setHasSelection(zQ6);
                float f4 = 1.0f;
                if (zQ6 && i == iI62) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                c1342000l1i.setTextActive(f);
                if (zQ6) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                c1342000l1i.setPercentAlpha(f2);
                if (i == iI6 && urlModel != null) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
                c1342000l1i.setAvatarScale(f3);
                if (i != iI6 || urlModel == null) {
                    f4 = 0.0f;
                }
                c1342000l1i.setAvatarAlpha(f4);
                if (i == iI6 && urlModel != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c1342000l1i.LIZJ(urlModel, z3);
                if (!this.LLJ) {
                    c1342000l1i.setClickable(true);
                    C786410Ut5.b8(c1342000l1i, new ACListenerS56S0101000_21(this, i, 2));
                } else {
                    C786410Ut5.b8(c1342000l1i, null);
                    c1342000l1i.setClickable(false);
                }
                c1342000l1i.setOnLongClickListener(new ViewOnLongClickListenerC1401960maQ(this, 6));
                c1342000l1i.setOnTouchListener(new ATListenerS454S0100000_21(this, 25));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public final void W5(C1341920l1a c1341920l1a) {
        Aweme aweme;
        String aid;
        CommentContextSource commentContextSourceA6 = a6();
        if (commentContextSourceA6 != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceA6)) != null && (aid = aweme.getAid()) != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1074340e40(this, aid, c1341920l1a.LL.pollId, null), 3);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: f6, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1341920l1a c1341920l1a) {
        String str;
        boolean z;
        UrlModel avatarThumb;
        User author;
        String str2;
        InterfaceC1398730mVD interfaceC1398730mVD;
        Object c991920bv4;
        boolean z2;
        boolean z3;
        float f;
        float f2;
        float f3;
        boolean z4;
        ConstraintLayout constraintLayout;
        boolean z5;
        boolean z6;
        boolean z7;
        C19ME c19me;
        C19ME c19me2;
        C19ME c19me3;
        C19ME c19me4;
        int i;
        boolean z8;
        C19ME c19me5;
        C19ME c19me6;
        C19ME c19me7;
        C19ME c19me8;
        C19ME c19me9;
        C19ME c19me10;
        Aweme aweme;
        String authorUid;
        Aweme aweme2;
        String authorUid2;
        boolean z9;
        User author2;
        InterfaceC1398730mVD interfaceC1398730mVDLIZ;
        String string;
        Resources resources;
        Aweme aweme3;
        IAccountUserService iAccountUserServiceLJFF;
        User curUser;
        S5();
        ARunnableS90S0200000_21 aRunnableS90S0200000_21 = this.LLJJLIIIJLLLLLLLZ;
        if (aRunnableS90S0200000_21 != null) {
            HandlerHook.viewRemoveCallbacks(this.itemView, aRunnableS90S0200000_21);
        }
        this.LLJJLIIIJLLLLLLLZ = null;
        this.LLJ = ((CommentManagementAssemVM) this.LLIZLLLIL.getValue()).xQ2();
        PollInfo pollInfo = c1341920l1a.LL;
        PollStyle pollStyle = pollInfo.pollStyle;
        if (pollStyle != null) {
            str = pollStyle.cardBgImageUrl;
        } else {
            str = null;
        }
        SmartImageView smartImageView = this.LLILLJJLI;
        if (smartImageView != null) {
            if (str != null && str.length() != 0) {
                C786410Ut5.LLFF(0, smartImageView);
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                c1331670kl3LJIIIZ.LJJ(smartImageView);
                c1331670kl3LJIIIZ.LJIIJJI();
            } else {
                C786410Ut5.LLFF(8, smartImageView);
                smartImageView.setImageDrawable(null);
            }
        }
        if (c1341920l1a.LLILLJJLI != 0) {
            z = true;
        } else {
            z = false;
        }
        try {
            iAccountUserServiceLJFF = C0XQ7.LJFF();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (iAccountUserServiceLJFF != null && (curUser = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUser()) != null) {
            avatarThumb = curUser.getAvatarThumb();
        } else {
            avatarThumb = null;
        }
        this.LLILZLL = avatarThumb;
        CommentContextSource commentContextSourceA6 = a6();
        if (commentContextSourceA6 != null && (aweme3 = CommentContextSourceKt.aweme(commentContextSourceA6)) != null) {
            author = aweme3.getAuthor();
        } else {
            author = null;
        }
        String strC6 = c6();
        if (author != null && !TextUtils.isEmpty(author.getUid())) {
            C1339440kxa c1339440kxa = C1339440kxa.LIZ;
            Drawable drawable = (Drawable) this.LLJLLIL.getValue();
            TuxIconDrawable tuxIconDrawable = (TuxIconDrawable) this.LLJLLL.getValue();
            int iIntValue = ((Number) this.LLJJJJLIIL.getValue()).intValue();
            C427870Gq9 c427870Gq9 = this.LLJILJILJ;
            c1339440kxa.getClass();
            C1339440kxa.LIZIZ(author, null, drawable, tuxIconDrawable, iIntValue, c427870Gq9);
            if (C1339690kxz.LIZ().LIZ) {
                if (TextUtils.isEmpty(author.getUserDisplayName())) {
                    TuxTextView tuxTextView = this.LLJJIJIIJIL;
                    if (tuxTextView != null) {
                        tuxTextView.setText(C1342220l24.LJ(author, strC6, true, true));
                    }
                } else {
                    TuxTextView tuxTextView2 = this.LLJJIJIIJIL;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setText(C1342220l24.LIZIZ(author, author.getUserDisplayName()));
                    }
                }
            } else {
                TuxTextView tuxTextView3 = this.LLJJIJIIJIL;
                if (tuxTextView3 != null) {
                    tuxTextView3.setText(C1342220l24.LJ(author, strC6, true, true));
                }
            }
            C1908030zkf.LJI(this.itemView.getContext(), author.getCustomVerify(), author.getEnterpriseVerifyReason(), this.LLJJIJIIJIL);
            CommentContextSource commentContextSourceA62 = a6();
            if (commentContextSourceA62 != null) {
                aweme = CommentContextSourceKt.aweme(commentContextSourceA62);
            } else {
                aweme = null;
            }
            Comment comment = new Comment();
            comment.setCommentType(1);
            comment.setUser(author);
            comment.setReplyToUserName(null);
            comment.setReplyToReplyId(null);
            String uid = author.getUid();
            if (aweme != null) {
                authorUid = AwemeExtKt.getAuthorUid(aweme);
            } else {
                authorUid = null;
            }
            if (Intrinsics.LJFF(uid, authorUid)) {
                comment.setLabelType(1);
                TuxTextView tuxTextView4 = this.LLJJJ;
                if (tuxTextView4 != null && (resources = tuxTextView4.getResources()) != null) {
                    string = resources.getString(2131826820);
                } else {
                    string = null;
                }
                comment.setLabelText(string);
            }
            C1343870l4j c1343870l4j = this.LLJJIII;
            if (c1343870l4j != null) {
                String strC62 = c6();
                CommentContextSource commentContextSourceA63 = a6();
                c1343870l4j.LIZIZ = aweme;
                c1343870l4j.LIZJ = strC62;
                c1343870l4j.LJ = commentContextSourceA63;
                c1343870l4j.LIZ(comment);
            }
            TextView textView = this.LLJJIJI;
            if (textView != null) {
                C1345000l6Y.LIZIZ(textView, null);
            }
            if (!C294210Bg3.LIZ()) {
                if (this.LLJJ == null) {
                    C1609500rzA c1609500rzA = this.LLJILLL;
                    Fragment fragment = getFragment();
                    String strC63 = c6();
                    if (c1609500rzA != null && fragment != null && strC63 != null) {
                        C1606010rtX c1606010rtX = C1606010rtX.LIZIZ;
                        C1605770rt9 c1605770rt9 = new C1605770rt9(EnumC1615506Uf.STORY, c1609500rzA, fragment, EnumC1606080rte.COMMENT);
                        c1605770rt9.LJFF = strC63;
                        c1605770rt9.LJI = "interaction_panel";
                        c1605770rt9.LJIIJ = false;
                        interfaceC1398730mVDLIZ = c1606010rtX.LIZ(c1605770rt9);
                    } else {
                        interfaceC1398730mVDLIZ = null;
                    }
                    this.LLJJ = interfaceC1398730mVDLIZ;
                }
                CommentContextSource commentContextSourceA64 = a6();
                if (commentContextSourceA64 != null) {
                    aweme2 = CommentContextSourceKt.aweme(commentContextSourceA64);
                } else {
                    aweme2 = null;
                }
                String strLIZIZ = C461720I8s.LIZIZ();
                if (aweme2 != null) {
                    authorUid2 = AwemeExtKt.getAuthorUid(aweme2);
                } else {
                    authorUid2 = null;
                }
                boolean zLJFF = Intrinsics.LJFF(strLIZIZ, authorUid2);
                if (aweme2 != null && (author2 = aweme2.getAuthor()) != null && author2.getFollowStatus() == 2) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                C735840Sti.LIZ.getClass();
                if (C1107004Uq.LIZ(C735840Sti.LJIIIIZZ(author), zLJFF, z9, Intrinsics.LJFF(author.getUid(), strLIZIZ))) {
                    InterfaceC1398730mVD interfaceC1398730mVD2 = this.LLJJ;
                    if (interfaceC1398730mVD2 != null) {
                        interfaceC1398730mVD2.LIZLLL(author);
                    }
                } else {
                    InterfaceC1398730mVD interfaceC1398730mVD3 = this.LLJJ;
                    if (interfaceC1398730mVD3 != null) {
                        interfaceC1398730mVD3.LIZLLL(null);
                    }
                }
            }
            str2 = "";
        } else {
            TuxTextView tuxTextView5 = this.LLJJIJIIJIL;
            str2 = "";
            if (tuxTextView5 != null) {
                tuxTextView5.setText("");
            }
            TuxTextView tuxTextView6 = this.LLJJIJIL;
            if (tuxTextView6 != null) {
                C786410Ut5.LLLLZLL(tuxTextView6, 8);
            }
            TuxTextView tuxTextView7 = this.LLJJJ;
            if (tuxTextView7 != null) {
                C786410Ut5.LLLLZLL(tuxTextView7, 8);
            }
            C427870Gq9 c427870Gq92 = this.LLJILJILJ;
            if (c427870Gq92 != null) {
                c427870Gq92.setImageDrawable(null);
            }
            if (!C294210Bg3.LIZ() && (interfaceC1398730mVD = this.LLJJ) != null) {
                interfaceC1398730mVD.LIZLLL(null);
            }
        }
        if (C0BTX.LIZ() && (constraintLayout = this.LL) != null) {
            if (constraintLayout.findViewById(R.id.t4q) != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (constraintLayout.findViewById(R.id.e_9) != null) {
                z6 = true;
            } else {
                z6 = false;
            }
            View viewFindViewById = constraintLayout.findViewById(R.id.nyt);
            if (viewFindViewById != null && viewFindViewById.getVisibility() != 8) {
                z7 = true;
            } else {
                z7 = false;
            }
            View viewFindViewById2 = this.LLJILJIL;
            if (viewFindViewById2 == null) {
                viewFindViewById2 = constraintLayout.findViewById(R.id.i33);
            }
            ViewGroup.LayoutParams layoutParams = viewFindViewById2.getLayoutParams();
            if ((layoutParams instanceof C19ME) && (c19me10 = (C19ME) layoutParams) != null) {
                if (!z7) {
                    if (c19me10.startToEnd != -1) {
                        c19me10.startToEnd = -1;
                        c19me10.startToStart = 0;
                        C786410Ut5.W5(viewFindViewById2, c19me10);
                    }
                } else if (c19me10.startToEnd != R.id.nyt) {
                    c19me10.startToStart = -1;
                    c19me10.startToEnd = R.id.nyt;
                    C786410Ut5.W5(viewFindViewById2, c19me10);
                }
            }
            View viewFindViewById3 = constraintLayout.findViewById(R.id.edp);
            if (!z6) {
                if (viewFindViewById3 != null && viewFindViewById3.getVisibility() == 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8) {
                    TuxTextView tuxTextView8 = this.LLJJIJIIJIL;
                    if (tuxTextView8 != null) {
                        ViewGroup.LayoutParams layoutParams2 = tuxTextView8.getLayoutParams();
                        if ((layoutParams2 instanceof C19ME) && (c19me9 = (C19ME) layoutParams2) != null && (((ViewGroup.MarginLayoutParams) c19me9).width != -2 || !c19me9.constrainedWidth || c19me9.endToStart != R.id.edi)) {
                            ((ViewGroup.MarginLayoutParams) c19me9).width = -2;
                            c19me9.constrainedWidth = true;
                            c19me9.endToStart = R.id.edi;
                            C786410Ut5.R6(tuxTextView8, c19me9);
                        }
                    }
                    if (viewFindViewById3 != null) {
                        ViewGroup.LayoutParams layoutParams3 = viewFindViewById3.getLayoutParams();
                        if ((layoutParams3 instanceof C19ME) && (c19me8 = (C19ME) layoutParams3) != null && c19me8.endToStart != R.id.jey) {
                            c19me8.endToStart = R.id.jey;
                            C786410Ut5.W5(viewFindViewById3, c19me8);
                        }
                    }
                    View viewFindViewById4 = constraintLayout.findViewById(R.id.xy6);
                    if (viewFindViewById4 != null) {
                        ViewGroup.LayoutParams layoutParams4 = viewFindViewById4.getLayoutParams();
                        if ((layoutParams4 instanceof C19ME) && (c19me7 = (C19ME) layoutParams4) != null && c19me7.startToEnd != R.id.edp) {
                            c19me7.startToEnd = R.id.edp;
                            C786410Ut5.W5(viewFindViewById4, c19me7);
                        }
                    }
                } else {
                    TuxTextView tuxTextView9 = this.LLJJIJIIJIL;
                    if (tuxTextView9 != null) {
                        ViewGroup.LayoutParams layoutParams5 = tuxTextView9.getLayoutParams();
                        if ((layoutParams5 instanceof C19ME) && (c19me6 = (C19ME) layoutParams5) != null && (((ViewGroup.MarginLayoutParams) c19me6).width != -2 || !c19me6.constrainedWidth || c19me6.endToStart != R.id.jey)) {
                            ((ViewGroup.MarginLayoutParams) c19me6).width = -2;
                            c19me6.constrainedWidth = true;
                            c19me6.endToStart = R.id.jey;
                            C786410Ut5.R6(tuxTextView9, c19me6);
                        }
                    }
                    View viewFindViewById5 = constraintLayout.findViewById(R.id.xy6);
                    if (viewFindViewById5 != null) {
                        ViewGroup.LayoutParams layoutParams6 = viewFindViewById5.getLayoutParams();
                        if ((layoutParams6 instanceof C19ME) && (c19me5 = (C19ME) layoutParams6) != null && c19me5.startToEnd != R.id.title) {
                            c19me5.startToEnd = R.id.title;
                            C786410Ut5.W5(viewFindViewById5, c19me5);
                        }
                    }
                }
            } else {
                TuxTextView tuxTextView10 = this.LLJJIJIIJIL;
                if (tuxTextView10 != null) {
                    ViewGroup.LayoutParams layoutParams7 = tuxTextView10.getLayoutParams();
                    if ((layoutParams7 instanceof C19ME) && (c19me3 = (C19ME) layoutParams7) != null && (((ViewGroup.MarginLayoutParams) c19me3).width != 0 || c19me3.constrainedWidth || c19me3.endToStart != R.id.edi)) {
                        ((ViewGroup.MarginLayoutParams) c19me3).width = 0;
                        c19me3.constrainedWidth = false;
                        c19me3.endToStart = R.id.edi;
                        C786410Ut5.R6(tuxTextView10, c19me3);
                    }
                }
                if (viewFindViewById3 != null) {
                    ViewGroup.LayoutParams layoutParams8 = viewFindViewById3.getLayoutParams();
                    if ((layoutParams8 instanceof C19ME) && (c19me2 = (C19ME) layoutParams8) != null && c19me2.endToStart != R.id.e_9) {
                        c19me2.endToStart = R.id.e_9;
                        C786410Ut5.W5(viewFindViewById3, c19me2);
                    }
                }
                View viewFindViewById6 = constraintLayout.findViewById(R.id.xy6);
                if (viewFindViewById6 != null) {
                    ViewGroup.LayoutParams layoutParams9 = viewFindViewById6.getLayoutParams();
                    if ((layoutParams9 instanceof C19ME) && (c19me = (C19ME) layoutParams9) != null && c19me.startToEnd != R.id.e_9) {
                        c19me.startToEnd = R.id.e_9;
                        C786410Ut5.W5(viewFindViewById6, c19me);
                    }
                }
            }
            View viewFindViewById7 = constraintLayout.findViewById(R.id.rg0);
            if (viewFindViewById7 != null) {
                ViewGroup.LayoutParams layoutParams10 = viewFindViewById7.getLayoutParams();
                if ((layoutParams10 instanceof C19ME) && (c19me4 = (C19ME) layoutParams10) != null) {
                    if (z5) {
                        i = R.id.t4q;
                    } else {
                        i = R.id.title;
                    }
                    if (c19me4.topToBottom != i || c19me4.startToStart != i) {
                        c19me4.topToBottom = i;
                        c19me4.startToStart = i;
                        C786410Ut5.W5(viewFindViewById7, c19me4);
                    }
                }
            }
        }
        if (z) {
            L5(c1341920l1a.LLILLJJLI);
        } else {
            u6(pollInfo);
            v6(pollInfo);
        }
        TuxTextView tuxTextView11 = this.LLILLL;
        if (tuxTextView11 != null) {
            String str3 = pollInfo.title;
            if (str3 == null) {
                str3 = "";
            }
            tuxTextView11.setText(str3);
        }
        List listLIZ = C1341940l1c.LIZ(pollInfo);
        if (((ArrayList) this.LLILZIL).size() == listLIZ.size() && (!((ArrayList) this.LLILZIL).isEmpty())) {
            P5(pollInfo);
            I5(c1341920l1a.LLILLJJLI);
            return;
        }
        LinearLayout linearLayout = this.LLILZ;
        if (linearLayout != null) {
            C786410Ut5.LJJJJJL(linearLayout);
        }
        ((ArrayList) this.LLILZIL).clear();
        List listR5 = R5(pollInfo);
        Context context = this.itemView.getContext();
        int iLIZ = C0HD5.LIZ(this.itemView, 48);
        int iLIZ2 = C0HD5.LIZ(this.itemView, 8);
        int iI6 = i6(pollInfo);
        int iI62 = i6(pollInfo);
        UrlModel urlModel = this.LLILZLL;
        boolean zQ6 = q6(pollInfo);
        int i2 = 0;
        for (Object obj : listLIZ) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                OptionCount optionCount = (OptionCount) obj;
                if (i2 < ((ArrayList) listR5).size()) {
                    c991920bv4 = ListProtector.get(listR5, i2);
                } else {
                    c991920bv4 = new C991920bv4(0, str2);
                }
                C991920bv4 c991920bv42 = (C991920bv4) c991920bv4;
                C1342000l1i c1342000l1i = new C1342000l1i(context);
                LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-1, iLIZ);
                if (i2 < listLIZ.size() - 1) {
                    layoutParams11.bottomMargin = iLIZ2;
                }
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1342000l1i);
                c1342000l1i.setLayoutParams(layoutParams11);
                c1342000l1i.setOptionLabel(optionCount.text);
                c1342000l1i.setFillPercent(c991920bv42.LIZ);
                c1342000l1i.setDisplayPercentText(c991920bv42.LIZIZ);
                if (optionCount.count > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c1342000l1i.setHasAnyVote(z2);
                if (i2 == iI62) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c1342000l1i.setSelectedOption(z3);
                c1342000l1i.setHasSelection(zQ6);
                float f4 = 1.0f;
                if (zQ6 && i2 == iI62) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                c1342000l1i.setTextActive(f);
                if (zQ6) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                c1342000l1i.setPercentAlpha(f2);
                if (i2 == iI6 && urlModel != null) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
                c1342000l1i.setAvatarScale(f3);
                if (i2 != iI6 || urlModel == null) {
                    f4 = 0.0f;
                }
                c1342000l1i.setAvatarAlpha(f4);
                if (i2 == iI6 && urlModel != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                c1342000l1i.LIZJ(urlModel, z4);
                if (!this.LLJ) {
                    C786410Ut5.b8(c1342000l1i, new ACListenerS56S0101000_21(this, i2, 3));
                } else {
                    c1342000l1i.setClickable(false);
                }
                c1342000l1i.setOnLongClickListener(new ViewOnLongClickListenerC1401960maQ(this, 6));
                c1342000l1i.setOnTouchListener(new ATListenerS454S0100000_21(this, 25));
                LinearLayout linearLayout2 = this.LLILZ;
                if (linearLayout2 != null) {
                    linearLayout2.addView(c1342000l1i);
                }
                ((ArrayList) this.LLILZIL).add(c1342000l1i);
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        I5(c1341920l1a.LLILLJJLI);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ahj, viewGroup, false);
    }

    public final void r6(C1342000l1i c1342000l1i) {
        C21647019ng c21647019ng = new C21647019ng(this.itemView.getContext(), c1342000l1i.getAvatarView(), new C19746312Np(EnumC19746112Nn.SPRING, new C0HU6(new C1342130l1v(322.27f), new C1342130l1v(35.9f)), C1697810uHb.LJIIJJI(new C19746412Nq("scaleX", new C0HIW(0.0f, 1.0f)), new C19746412Nq("scaleY", new C0HIX(0.0f, 1.0f)), new C19746412Nq("alpha", new C0HUY(0.0f, 1.0f)))), false);
        ((ArrayList) this.LLJJL).add(c21647019ng);
        c21647019ng.LJI(true);
    }

    public final void u6(PollInfo pollInfo) {
        String string;
        Long lB6;
        int i = pollInfo.pollStatus;
        int i2 = 0;
        if (i != 2 && i != 3 && i != 4) {
            if ((i == 1 || i == 0) && (lB6 = b6(pollInfo)) != null) {
                long jLongValue = lB6.longValue() - System.currentTimeMillis();
                if (jLongValue <= 0) {
                    string = this.itemView.getContext().getString(2131829075);
                } else {
                    double d = jLongValue;
                    long j = 1;
                    double millis = d / TimeUnit.DAYS.toMillis(1L);
                    long j2 = 2147483647L;
                    if (millis >= 1.0d) {
                        long jCeil = (long) Math.ceil(millis);
                        Resources resources = this.itemView.getResources();
                        if (jCeil <= 2147483647L) {
                            j2 = jCeil;
                        }
                        string = resources.getQuantityString(2131755152, (int) j2, Long.valueOf(jCeil));
                    } else {
                        double millis2 = d / TimeUnit.HOURS.toMillis(1L);
                        if (millis2 >= 1.0d) {
                            long jCeil2 = (long) Math.ceil(millis2);
                            Resources resources2 = this.itemView.getResources();
                            if (jCeil2 <= 2147483647L) {
                                j2 = jCeil2;
                            }
                            string = resources2.getQuantityString(2131755153, (int) j2, Long.valueOf(jCeil2));
                        } else {
                            long jCeil3 = (long) Math.ceil(d / TimeUnit.MINUTES.toMillis(1L));
                            if (jCeil3 >= 1) {
                                j = jCeil3;
                            }
                            Resources resources3 = this.itemView.getResources();
                            if (j <= 2147483647L) {
                                j2 = j;
                            }
                            string = resources3.getQuantityString(2131755154, (int) j2, Long.valueOf(j));
                        }
                    }
                }
            } else {
                string = "";
            }
        } else {
            string = this.itemView.getContext().getString(2131829075);
        }
        int i3 = pollInfo.totalVotes;
        if (i3 < 0) {
            i3 = 0;
        }
        String quantityString = this.itemView.getResources().getQuantityString(2131755151, i3, C1372520low.LIZ(i3));
        if (string.length() > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(quantityString);
            sbLIZ.append(" · ");
            sbLIZ.append(string);
            quantityString = C2188811AlT.LIZIZ(sbLIZ);
        }
        TuxTextView tuxTextView = this.LLJJJJ;
        if (tuxTextView != null) {
            tuxTextView.setText(quantityString);
        }
        TuxTextView tuxTextView2 = this.LLJJJJ;
        if (tuxTextView2 != null) {
            if (quantityString.length() <= 0) {
                i2 = 8;
            }
            C786410Ut5.LLLLZLL(tuxTextView2, i2);
        }
    }

    public final void v6(PollInfo pollInfo) {
        String strLIZJ;
        Long l = pollInfo.createTime;
        if (l != null && l.longValue() > 0) {
            strLIZJ = C1356610lPH.LIZJ(l.longValue() * 1000, this.itemView.getContext());
        } else {
            strLIZJ = "";
        }
        TuxTextView tuxTextView = this.LLJJJIL;
        if (tuxTextView != null) {
            tuxTextView.setText(strLIZJ);
        }
        TuxTextView tuxTextView2 = this.LLJJJIL;
        if (tuxTextView2 != null) {
            int i = 0;
            if (strLIZJ.length() <= 0) {
                i = 8;
            }
            C786410Ut5.LLLLZLL(tuxTextView2, i);
        }
    }

    public final void V5(User user, String str) {
        CommentContextSource commentContextSourceA6;
        String aid;
        Aweme aweme;
        if (user == null || TextUtils.isEmpty(user.getUid()) || (commentContextSourceA6 = a6()) == null) {
            return;
        }
        String strEventType = CommentContextSourceKt.eventType(commentContextSourceA6);
        Context context = this.itemView.getContext();
        EnumC1260920iuw enumC1260920iuw = EnumC1260920iuw.RELATION_LABEL;
        CommentContextSource commentContextSourceA62 = a6();
        if (commentContextSourceA62 == null || (aweme = CommentContextSourceKt.aweme(commentContextSourceA62)) == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        C1351950lHl.LJJI(user, context, strEventType, strEventType, str, enumC1260920iuw, "comment_panel", aid, 2948);
    }

    public final void d6(C1341920l1a c1341920l1a, int i) {
        Activity activityLIZ;
        String strEventType;
        Activity activityLIZIZ;
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
                activityLIZ = C1388190mED.LIZ(activityLIZIZ);
            } else {
                activityLIZ = null;
            }
            CommentContextSource commentContextSourceA6 = a6();
            if (commentContextSourceA6 == null || (strEventType = CommentContextSourceKt.eventType(commentContextSourceA6)) == null) {
                strEventType = "";
            }
            C0XPD.LIZIZ(activityLIZ, strEventType, "poll", null, null);
            return;
        }
        if (e6(c1341920l1a.LL)) {
            C1389890mGx c1389890mGx = new C1389890mGx(this.itemView);
            c1389890mGx.LJIIIZ(2131829075);
            c1389890mGx.LJIIJJI();
            return;
        }
        OptionCount optionCount = (OptionCount) C13LP.LJJJLZIJ(i, C1341940l1c.LIZ(c1341920l1a.LL));
        if (optionCount != null) {
            int i2 = optionCount.index;
            int iI6 = i6(c1341920l1a.LL);
            if (iI6 >= 0) {
                if (i == iI6) {
                    AwS422S0200000_21 awS422S0200000_21 = new AwS422S0200000_21(this, c1341920l1a, 29);
                    Context context = this.itemView.getContext();
                    if (C0DHG.LIZ() && C1388190mED.LIZ(context) != null) {
                        C632670Orh.LIZIZ(context, new C19719212De(-955875823, new AwS668S0100000_19(awS422S0200000_21, 52), true));
                        return;
                    }
                    C1397580mTM c1397580mTM = new C1397580mTM(context);
                    c1397580mTM.LJFF(2131829079);
                    c1397580mTM.LIZ(2131829076);
                    C985403tE.LIZ(c1397580mTM, new AwS591S0100000_12(awS422S0200000_21, 1083));
                    c1397580mTM.LJII = false;
                    new C1397510mTF(c1397580mTM).LIZLLL();
                    return;
                }
                AwS32S0202000_21 awS32S0202000_21 = new AwS32S0202000_21(this, c1341920l1a, i2, i, 1);
                Context context2 = this.itemView.getContext();
                if (C0DHG.LIZ() && C1388190mED.LIZ(context2) != null) {
                    C632670Orh.LIZIZ(context2, new C19719212De(602382397, new AwS668S0100000_19(awS32S0202000_21, 51), true));
                    return;
                }
                C1397580mTM c1397580mTM2 = new C1397580mTM(context2);
                c1397580mTM2.LJFF(2131829067);
                c1397580mTM2.LIZ(2131829064);
                C985403tE.LIZ(c1397580mTM2, new AwS581S0100000_2(awS32S0202000_21, 618));
                c1397580mTM2.LJII = false;
                new C1397510mTF(c1397580mTM2).LIZLLL();
                return;
            }
            N5(c1341920l1a, i2, i, false);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        Object next;
        boolean z;
        boolean z2;
        boolean z3;
        C1341920l1a c1341920l1a = (C1341920l1a) interfaceC1891350zJl;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C1154960gA2) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            next = null;
        } else {
            next = it2.next();
            while (it2.hasNext()) {
                C1154960gA2 c1154960gA2 = (C1154960gA2) it2.next();
                C1154960gA2 c1154960gA22 = (C1154960gA2) next;
                if (!c1154960gA22.LIZ && !c1154960gA2.LIZ) {
                    z = false;
                } else {
                    z = true;
                }
                if (!c1154960gA22.LIZIZ && !c1154960gA2.LIZIZ) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!c1154960gA22.LIZJ && !c1154960gA2.LIZJ) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                next = new C1154960gA2(z, z2, z3);
            }
        }
        C1154960gA2 c1154960gA23 = (C1154960gA2) next;
        if (c1154960gA23 == null) {
            onBindItemView(c1341920l1a);
            return;
        }
        if (c1154960gA23.LIZJ) {
            onBindItemView(c1341920l1a);
            return;
        }
        if (c1154960gA23.LIZIZ) {
            PollInfo pollInfo = c1341920l1a.LL;
            u6(pollInfo);
            v6(pollInfo);
            P5(pollInfo);
        }
        if (!c1154960gA23.LIZ) {
            return;
        }
        int i = c1341920l1a.LLILLJJLI;
        if (i != 0) {
            L5(i);
        } else {
            L5(0);
        }
        I5(c1341920l1a.LLILLJJLI);
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N5(X.C1341920l1a r37, int r38, int r39, boolean r40) {
        /*
            Method dump skipped, instruction units count: 1284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.commentlist.powercell.PollCell.N5(X.0l1a, int, int, boolean):void");
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
