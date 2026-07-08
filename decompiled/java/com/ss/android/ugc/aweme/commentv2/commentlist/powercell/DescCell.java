package com.ss.android.ugc.aweme.commentv2.commentlist.powercell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C03K6;
import X.C04UD;
import X.C098200Yq;
import X.C0HD5;
import X.C0SPV;
import X.C0SWJ;
import X.C0SWK;
import X.C0SWS;
import X.C0SXF;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1308910kAL;
import X.C1331070kk5;
import X.C1331100kk8;
import X.C1340350kz3;
import X.C1341070l0D;
import X.C1341780l1M;
import X.C1350920lG6;
import X.C1351950lHl;
import X.C1357490lQh;
import X.C1357500lQi;
import X.C1357530lQl;
import X.C1357580lQq;
import X.C1357620lQu;
import X.C1361900lXo;
import X.C1392530mLD;
import X.C1392540mLE;
import X.C13LE;
import X.C13LP;
import X.C1401850maF;
import X.C1440005kM;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C293960Bfe;
import X.C427870Gq9;
import X.C452080Ho6;
import X.C452501pT;
import X.C622680Oba;
import X.C712520RxC;
import X.C736680Sv4;
import X.C737030Svd;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C946803n0;
import X.EnumC1260920iuw;
import X.EnumC1260930iux;
import X.EnumC1341650l19;
import X.InterfaceC0148002o;
import X.InterfaceC1393560mMs;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentListModel;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentListAssemVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.platform.AnchorEventCenter;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class DescCell extends PowerCell<C0SWS> implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public C427870Gq9 LL;
    public TuxTextView LLILLJJLI;
    public C0SPV LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public C0SWJ LLIZ;
    public C1357490lQh LLIZLLLIL;
    public C1357580lQq LLJ;
    public int LLJI;
    public User LLJIJIL;
    public DataCenter LLJILJIL;
    public boolean LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public CommentContextSource LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DescCell.class, "listVm", "getListVm()Lcom/ss/android/ugc/aweme/commentv2/commentlist/viewmodel/CommentListAssemVM;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    public DescCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommentListAssemVM.class);
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(c19719912DlLIZ, 370);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(110);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 355), awS565S0100000_21, AFwS209S0000000_21.get$arr$(185), new AwS565S0100000_21((C03K6) this, 356), new AwS565S0100000_21((C03K6) this, 358), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 360), aFwS259S0000000_21, new AwS565S0100000_21((C03K6) this, 362), null, new AwS565S0100000_21((C03K6) this, 363));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS565S0100000_21 awS565S0100000_212 = new AwS565S0100000_21((C03K6) this, 357);
            AwS565S0100000_21 awS565S0100000_213 = new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 359);
            AwS565S0100000_21 awS565S0100000_214 = new AwS565S0100000_21(c19719912DlLIZ, 361);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS422S0200000_21((InterfaceC451590HnJ) obj, awS565S0100000_212, 28));
            AwS565S0100000_21 awS565S0100000_215 = new AwS565S0100000_21(c01gwLIZIZ, 364);
            AwS565S0100000_21 awS565S0100000_216 = new AwS565S0100000_21(c01gwLIZIZ, 365);
            AwS565S0100000_21 awS565S0100000_217 = new AwS565S0100000_21(c01gwLIZIZ, 366);
            AwS565S0100000_21 awS565S0100000_218 = new AwS565S0100000_21(c01gwLIZIZ, 367);
            AwS565S0100000_21 awS565S0100000_219 = new AwS565S0100000_21(c01gwLIZIZ, 368);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS565S0100000_214, awS565S0100000_21, new C452080Ho6(), awS565S0100000_215, awS565S0100000_216, awS565S0100000_213, aFwS259S0000000_21, awS565S0100000_217, awS565S0100000_218, awS565S0100000_219);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 369), awS565S0100000_21, AFwS209S0000000_21.get$arr$(186), new AwS565S0100000_21((C03K6) this, 371), new AwS565S0100000_21((C03K6) this, 372), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 373), aFwS259S0000000_21, new AwS565S0100000_21((C03K6) this, 374), null, new AwS565S0100000_21((C03K6) this, 375));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 376), awS565S0100000_21, AFwS209S0000000_21.get$arr$(187), new AwS565S0100000_21((C03K6) this, 377), new AwS565S0100000_21((C03K6) this, 378), new AwS565S0100000_21((C03K6) this, 379), aFwS259S0000000_21, null, null, new AwS565S0100000_21((C03K6) this, 354));
        }
        this.LLJILLL = assemVMLazy;
    }

    public final CommentContextSource L5() {
        if (this.LLJJ == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJ(this.itemView, null), "source_default_key", CommentContextSource.class, null);
            this.LLJJ = interfaceC1555100qZQLIZIZ != null ? (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJ;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        C1357490lQh c1357490lQh = this.LLIZLLLIL;
        if (c1357490lQh != null) {
            C1357500lQi c1357500lQi = c1357490lQh.LL;
            ViewModelStore viewModelStore = c1357500lQi.LL;
            if (viewModelStore != null) {
                viewModelStore.clear();
            }
            c1357500lQi.LL = null;
            c1357500lQi.LLILLJJLI = null;
        }
        C0SWJ c0swj = this.LLIZ;
        if (c0swj != null) {
            DataCenter dataCenter = c0swj.LLILZIL;
            if (dataCenter != null) {
                dataCenter.BQ2("TAGGED_PEOPLE_ACTION", c0swj);
            }
            C622680Oba.LIZLLL(c0swj);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        C1331070kk5 hierarchy;
        C1331100kk8 c1331100kk8;
        Integer numLIZJ;
        super.onItemViewCreated();
        this.LLJI = C0HD5.LIZLLL(this.itemView, Float.valueOf(32.0f));
        this.LL = (C427870Gq9) this.itemView.findViewById(R.id.bh2);
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.title);
        this.LLILLL = (C0SPV) this.itemView.findViewById(R.id.eac);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.xy6);
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.edi);
        this.LLILZLL = (TuxTextView) this.itemView.findViewById(R.id.edp);
        this.LLIZ = (C0SWJ) this.itemView.findViewById(R.id.x2p);
        this.LLIZLLLIL = (C1357490lQh) this.itemView.findViewById(R.id.onr);
        this.LLJ = (C1357580lQq) this.itemView.findViewById(R.id.a7r);
        C427870Gq9 c427870Gq9 = this.LL;
        if (c427870Gq9 != null && (hierarchy = c427870Gq9.getHierarchy()) != null && (c1331100kk8 = hierarchy.LIZJ) != null) {
            c1331100kk8.LJFF(C0HD5.LIZIZ(c427870Gq9, Float.valueOf(0.5f)));
            Context context = getContext();
            c1331100kk8.LJFF = (context == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.nf, context)) == null) ? 0 : numLIZJ.intValue();
        }
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            C786410Ut5.I7(new C1401850maF(this, 18), tuxTextView);
        }
        C427870Gq9 c427870Gq92 = this.LL;
        if (c427870Gq92 != null) {
            C786410Ut5.I7(new C1401850maF(this, 19), c427870Gq92);
        }
        TuxTextView tuxTextView2 = this.LLILZLL;
        if (tuxTextView2 != null) {
            C1340350kz3.LIZJ(tuxTextView2);
            if (C293960Bfe.LIZ()) {
                C1340350kz3.LIZIZ(tuxTextView2);
            } else {
                tuxTextView2.setTuxFont(62);
            }
        }
        C1341780l1M c1341780l1M = C1341780l1M.LIZ;
        C1341780l1M.LIZIZ(c1341780l1M, this.LL, EnumC1341650l19.AVATAR, 0.0f, null, 12);
        C1341780l1M.LIZIZ(c1341780l1M, this.LLILLJJLI, EnumC1341650l19.USERNAME, 0.0f, null, 12);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        C1357500lQi c1357500lQi;
        C712520RxC c712520RxC;
        Object c098200Yq;
        Object objM1boximpl;
        C2344009Gk c2344009GkLIZIZ;
        CommentListModel listModel;
        String insertCid;
        Integer numLIZJ;
        super.onViewAttachedToWindow();
        CommentContextSource commentContextSourceL5 = L5();
        if (commentContextSourceL5 != null && (listModel = commentContextSourceL5.getListModel()) != null && (insertCid = listModel.getInsertCid()) != null && TextUtils.equals(insertCid, "bubble_desc_click_faker_cid") && (numLIZJ = C1308910kAL.LIZJ(R.attr.a0c, this.itemView.getContext())) != null) {
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.itemView, "backgroundColor", numLIZJ.intValue(), 0);
            objectAnimatorOfInt.setDuration(3000L);
            objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
            objectAnimatorOfInt.setStartDelay(150L);
            objectAnimatorOfInt.start();
        }
        C0SWJ c0swj = this.LLIZ;
        if (c0swj != null) {
            DataCenter dataCenter = c0swj.LLILZIL;
            if (dataCenter != null) {
                dataCenter.yQ2("TAGGED_PEOPLE_ACTION", c0swj, false);
            }
            C622680Oba.LIZJ(c0swj);
        }
        C1357490lQh c1357490lQh = this.LLIZLLLIL;
        if (c1357490lQh == null || (c712520RxC = (c1357500lQi = c1357490lQh.LL).LLILZIL) == null) {
            return;
        }
        C1357530lQl c1357530lQl = c1357500lQi.LLILZ;
        c1357530lQl.getClass();
        try {
            if (C04UD.LIZ()) {
                try {
                    for (InterfaceC1393560mMs interfaceC1393560mMs : c712520RxC.LJIILL()) {
                        C1392530mLD c1392530mLDLJFF = interfaceC1393560mMs.LJII().LJFF();
                        if (C04UD.LIZ() && (c1392530mLDLJFF instanceof C1392530mLD)) {
                            c2344009GkLIZIZ = c1392530mLDLJFF.LJ(interfaceC1393560mMs);
                        } else {
                            InterfaceC1393560mMs interfaceC1393560mMs2 = (InterfaceC1393560mMs) C13LP.LJJJJZI(c712520RxC.LJIILL());
                            InterfaceC1393560mMs interfaceC1393560mMs3 = (InterfaceC1393560mMs) C13LP.LJJJLL(c712520RxC.LJIILL());
                            c2344009GkLIZIZ = C1392540mLE.LIZIZ(c712520RxC, interfaceC1393560mMs2, interfaceC1393560mMs3 != null && interfaceC1393560mMs3.LJJLI() > 1);
                        }
                        interfaceC1393560mMs.p1(c2344009GkLIZIZ);
                        C1357620lQu c1357620lQu = (C1357620lQu) C1361900lXo.LIZ("event_show");
                        if (c1357620lQu != null) {
                            c1357620lQu.LIZJ = true;
                            AnchorEventCenter anchorEventCenter = c1357530lQl.LIZ;
                            if (anchorEventCenter != null) {
                                anchorEventCenter.kF(c1357620lQu, interfaceC1393560mMs);
                            }
                        }
                    }
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                objM1boximpl = C189200o6.m1boximpl(c098200Yq);
            } else {
                objM1boximpl = C13LP.LJJJJZI(c712520RxC.LJIILL());
                InterfaceC1393560mMs interfaceC1393560mMs4 = (InterfaceC1393560mMs) objM1boximpl;
                InterfaceC1393560mMs interfaceC1393560mMs5 = (InterfaceC1393560mMs) C13LP.LJJJLL(c712520RxC.LJIILL());
                interfaceC1393560mMs4.p1(C1392540mLE.LIZIZ(c712520RxC, interfaceC1393560mMs4, interfaceC1393560mMs5 != null && interfaceC1393560mMs5.LJJLI() > 1));
            }
            C189200o6.m2constructorimpl(objM1boximpl);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        Iterator<InterfaceC1393560mMs> it2 = c712520RxC.LJIILL().iterator();
        while (it2.hasNext()) {
            it2.next();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        C0SWJ c0swj = this.LLIZ;
        if (c0swj != null) {
            DataCenter dataCenter = c0swj.LLILZIL;
            if (dataCenter != null) {
                dataCenter.BQ2("TAGGED_PEOPLE_ACTION", c0swj);
            }
            C622680Oba.LIZLLL(c0swj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021a  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.commentlist.powercell.DescCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a3n, viewGroup, false);
    }

    public final void I5(User user, String str) {
        C0SWK c0swk;
        String str2;
        Boolean boolValueOf;
        boolean zBooleanValue;
        String cid;
        Fragment fragmentLIZ;
        C19EG activity;
        String str3;
        Aweme aweme;
        CommentCommonModel commonModel;
        Aweme aweme2;
        String strEventType;
        CommentCommonModel commonModel2;
        C0SWS item = getItem();
        Aweme aweme3 = null;
        if (item != null) {
            c0swk = item.LL;
        } else {
            c0swk = null;
        }
        if (user != null && !TextUtils.isEmpty(user.getUid())) {
            Context context = this.itemView.getContext();
            CommentContextSource commentContextSourceL5 = L5();
            if (commentContextSourceL5 != null && (commonModel2 = commentContextSourceL5.getCommonModel()) != null) {
                str2 = commonModel2.eventType;
            } else {
                str2 = null;
            }
            C1351950lHl.LJJI(user, context, str2, null, "click_head", EnumC1260920iuw.RELATION_LABEL, "comment_panel", null, 7052);
            if (c0swk != null) {
                CommentContextSource commentContextSourceL52 = L5();
                if (commentContextSourceL52 != null) {
                    aweme2 = CommentContextSourceKt.aweme(commentContextSourceL52);
                } else {
                    aweme2 = null;
                }
                CommentContextSource commentContextSourceL53 = L5();
                if (commentContextSourceL53 != null) {
                    strEventType = CommentContextSourceKt.eventType(commentContextSourceL53);
                } else {
                    strEventType = null;
                }
                boolValueOf = Boolean.valueOf(C1341070l0D.LIZJ(c0swk, aweme2, strEventType));
            } else {
                boolValueOf = null;
            }
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            CommentContextSource commentContextSourceL54 = L5();
            if (boolValueOf != null) {
                zBooleanValue = boolValueOf.booleanValue();
            } else {
                zBooleanValue = false;
            }
            if (c0swk != null) {
                cid = c0swk.getCid();
            } else {
                cid = null;
            }
            c1350920lG6.getClass();
            C1350920lG6.LJLJLJ(user, commentContextSourceL54, zBooleanValue, "click_head", cid, null);
            if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                CommentContextSource commentContextSourceL55 = L5();
                if (commentContextSourceL55 != null && (commonModel = commentContextSourceL55.getCommonModel()) != null) {
                    str3 = commonModel.eventType;
                } else {
                    str3 = null;
                }
                EnumC1260930iux enumC1260930iux = EnumC1260930iux.ENTER_PROFILE;
                CommentContextSource commentContextSourceL56 = L5();
                if (commentContextSourceL56 != null) {
                    aweme = CommentContextSourceKt.aweme(commentContextSourceL56);
                } else {
                    aweme = null;
                }
                C1350920lG6.LJJ(str3, c0swk, enumC1260930iux, "click_head", aweme);
            }
            CommentContextSource commentContextSourceL57 = L5();
            if (commentContextSourceL57 != null) {
                aweme3 = CommentContextSourceKt.aweme(commentContextSourceL57);
            }
            C1440005kM.LIZ(new C737030Svd(36, aweme3));
            Context context2 = this.itemView.getContext();
            if (context2 != null && C0SXF.LJIL(context2) && (fragmentLIZ = C946803n0.LIZ(this.itemView)) != null && (activity = fragmentLIZ.getActivity()) != null) {
                activity.finish();
            }
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
