package com.ss.android.ugc.aweme.commentv2.commentlist.powercell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C03K6;
import X.C0A8B;
import X.C0H9H;
import X.C0ZP4;
import X.C10EU;
import X.C1157070gDR;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C12ES;
import X.C1340820kzo;
import X.C1342410l2N;
import X.C1349280lDS;
import X.C1350920lG6;
import X.C1388190mED;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1770850wBP;
import X.C1893080zMY;
import X.C1913380ztI;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C21146717pB;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C523420Kfs;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC1342430l2P;
import X.EnumC1342610l2h;
import X.EnumC1350940lG8;
import X.InterfaceC0148002o;
import X.InterfaceC1342980l3I;
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
import Y.ACListenerS155S0100000_21;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentListAssemVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeCommentConfig;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.ZeroCommentConfig;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class PostModeFullPageStatusFooterCell extends PowerCell<C1157070gDR> implements InterfaceC724530SbT, InterfaceC1342980l3I {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public C1749280vcc LL;
    public View LLILLJJLI;
    public final AssemVMLazy LLILLL;
    public CommentContextSource LLILZ;
    public EnumC1342430l2P LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PostModeFullPageStatusFooterCell.class, "listVm", "getListVm()Lcom/ss/android/ugc/aweme/commentv2/commentlist/viewmodel/CommentListAssemVM;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    public PostModeFullPageStatusFooterCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommentListAssemVM.class);
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(c19719912DlLIZ, 400);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(113);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 411), awS565S0100000_21, AFwS209S0000000_21.get$arr$(191), new AwS565S0100000_21((C03K6) this, 386), new AwS565S0100000_21((C03K6) this, 388), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 390), aFwS259S0000000_21, new AwS565S0100000_21((C03K6) this, 392), null, new AwS565S0100000_21((C03K6) this, 393));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS565S0100000_21 awS565S0100000_212 = new AwS565S0100000_21((C03K6) this, 387);
            AwS565S0100000_21 awS565S0100000_213 = new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 389);
            AwS565S0100000_21 awS565S0100000_214 = new AwS565S0100000_21(c19719912DlLIZ, 391);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS422S0200000_21((InterfaceC451590HnJ) obj, awS565S0100000_212, 30));
            AwS565S0100000_21 awS565S0100000_215 = new AwS565S0100000_21(c01gwLIZIZ, 394);
            AwS565S0100000_21 awS565S0100000_216 = new AwS565S0100000_21(c01gwLIZIZ, 395);
            AwS565S0100000_21 awS565S0100000_217 = new AwS565S0100000_21(c01gwLIZIZ, 396);
            AwS565S0100000_21 awS565S0100000_218 = new AwS565S0100000_21(c01gwLIZIZ, 397);
            AwS565S0100000_21 awS565S0100000_219 = new AwS565S0100000_21(c01gwLIZIZ, 398);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS565S0100000_214, awS565S0100000_21, new C452080Ho6(), awS565S0100000_215, awS565S0100000_216, awS565S0100000_213, aFwS259S0000000_21, awS565S0100000_217, awS565S0100000_218, awS565S0100000_219);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 399), awS565S0100000_21, AFwS209S0000000_21.get$arr$(192), new AwS565S0100000_21((C03K6) this, 401), new AwS565S0100000_21((C03K6) this, 402), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 403), aFwS259S0000000_21, new AwS565S0100000_21((C03K6) this, 404), null, new AwS565S0100000_21((C03K6) this, 405));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 406), awS565S0100000_21, AFwS209S0000000_21.get$arr$(193), new AwS565S0100000_21((C03K6) this, 407), new AwS565S0100000_21((C03K6) this, 408), new AwS565S0100000_21((C03K6) this, 409), aFwS259S0000000_21, null, null, new AwS565S0100000_21((C03K6) this, 410));
        }
        this.LLILLL = assemVMLazy;
        this.LLILZIL = EnumC1342430l2P.DEFAULT;
    }

    public final CommentContextSource I5() {
        if (this.LLILZ == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJ(this.itemView, null), "source_default_key", CommentContextSource.class, null);
            this.LLILZ = interfaceC1555100qZQLIZIZ != null ? (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLILZ;
    }

    public final CommentListAssemVM L5() {
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        return (CommentListAssemVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (C1749280vcc) this.itemView.findViewById(R.id.w28);
        this.LLILLJJLI = this.itemView.findViewById(R.id.mpt);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        C1749280vcc c1749280vcc;
        super.onViewAttachedToWindow();
        if (this.LLILZIL != EnumC1342430l2P.LOADING || (c1749280vcc = this.LL) == null) {
            return;
        }
        c1749280vcc.LJ();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        Integer numValueOf;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ZeroCommentConfig zeroCommentConfig;
        ViewGroup.LayoutParams layoutParams3;
        CommentContextSource commentContextSourceI5;
        C1749280vcc c1749280vcc;
        Context context;
        ZeroCommentConfig zeroCommentConfig2;
        TuxTextView tuxTextView;
        String str;
        ViewGroup.LayoutParams layoutParams4;
        CommentCommonModel commonModel;
        AwemeCommentConfig commentConfig;
        ViewGroup.LayoutParams layoutParams5;
        Activity activityLIZ;
        ViewGroup.LayoutParams layoutParams6;
        C1157070gDR c1157070gDR = (C1157070gDR) interfaceC1891350zJl;
        this.LLILZIL = c1157070gDR.LL.LIZ;
        C1749280vcc c1749280vcc2 = this.LL;
        if (c1749280vcc2 != null) {
            C786410Ut5.LLLZLZ(c1749280vcc2, 0);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PostModeFullPageStatusFooterCell onBindItemView t.status.type = ");
        sbLIZ.append(c1157070gDR.LL.LIZ);
        sbLIZ.append(" t.status.height.value = ");
        EnumC1342610l2h enumC1342610l2h = c1157070gDR.LL.LIZIZ;
        AwemeCommentConfig commentConfig2 = null;
        if (enumC1342610l2h != null) {
            numValueOf = Integer.valueOf(enumC1342610l2h.getValue());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        switch (C1342410l2N.LIZ[c1157070gDR.LL.LIZ.ordinal()]) {
            case 2:
                C1749280vcc c1749280vcc3 = this.LL;
                if (c1749280vcc3 != null) {
                    C786410Ut5.LLLZLZ(c1749280vcc3, 8);
                }
                break;
            case 3:
                if (c1157070gDR.LL.LIZIZ == EnumC1342610l2h.CUSTOMIZE_LOADING) {
                    C1749280vcc c1749280vcc4 = this.LL;
                    if (c1749280vcc4 != null && (layoutParams2 = c1749280vcc4.getLayoutParams()) != null) {
                        layoutParams2.height = c1157070gDR.LL.LIZIZ.pxValue(c1749280vcc4);
                    }
                } else {
                    C1749280vcc c1749280vcc5 = this.LL;
                    if (c1749280vcc5 != null && (layoutParams = c1749280vcc5.getLayoutParams()) != null) {
                        layoutParams.height = (int) C12ES.LIZJ(52.0f, this.itemView.getContext());
                    }
                }
                C1749280vcc c1749280vcc6 = this.LL;
                if (c1749280vcc6 != null) {
                    c1749280vcc6.LJ();
                }
                break;
            case 4:
                Aweme aweme = L5().LLJI;
                if (aweme != null && (commentConfig = aweme.getCommentConfig()) != null) {
                    zeroCommentConfig = commentConfig.zeroCommentConfig;
                } else {
                    zeroCommentConfig = null;
                }
                if (((Boolean) C0A8B.LIZ.getValue()).booleanValue() && aweme != null && zeroCommentConfig != null && !C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(aweme))) {
                    CommentService.LIZ.getClass();
                    if (C523420Kfs.LIZ().LJJIJIIJIL(aweme)) {
                        Boolean bool = zeroCommentConfig.enabled;
                        Boolean bool2 = Boolean.TRUE;
                        if (Intrinsics.LJFF(bool, bool2) && ((commentContextSourceI5 = I5()) == null || (commonModel = commentContextSourceI5.getCommonModel()) == null || !Intrinsics.LJFF(commonModel.isSpiltMode(), bool2))) {
                            C1749280vcc c1749280vcc7 = this.LL;
                            if (c1749280vcc7 != null && (layoutParams4 = c1749280vcc7.getLayoutParams()) != null) {
                                layoutParams4.height = (int) C12ES.LIZJ(300.0f, this.itemView.getContext());
                            }
                            Aweme aweme2 = L5().LLJI;
                            if (aweme2 != null && (c1749280vcc = this.LL) != null && (context = c1749280vcc.getContext()) != null) {
                                Aweme aweme3 = L5().LLJI;
                                if (aweme3 != null) {
                                    commentConfig2 = aweme3.getCommentConfig();
                                }
                                if (!C960203pA.LIZIZ(context) ? commentConfig2 != null : commentConfig2 != null) {
                                    if (commentConfig2.zeroCommentConfig != null && (zeroCommentConfig2 = commentConfig2.zeroCommentConfig) != null && zeroCommentConfig2.titleText != null) {
                                        C1350920lG6.LLIILZL(aweme2, CommentContextSourceKt.enterFrom(I5()), CommentContextSourceKt.enterMethod(I5()), EnumC1350940lG8.COMMENT_EMPTY);
                                        C1749280vcc c1749280vcc8 = this.LL;
                                        if (c1749280vcc8 != null) {
                                            c1749280vcc8.setLayoutVariant(1);
                                        }
                                        C1749280vcc c1749280vcc9 = this.LL;
                                        if (c1749280vcc9 != null) {
                                            ZeroCommentConfig zeroCommentConfig3 = commentConfig2.zeroCommentConfig;
                                            if (zeroCommentConfig3 == null || (str = zeroCommentConfig3.titleText) == null) {
                                                str = "";
                                            }
                                            c1749280vcc9.setStatus(C1349280lDS.LJI(context, aweme2, str));
                                        }
                                        C1749280vcc c1749280vcc10 = this.LL;
                                        if (c1749280vcc10 != null) {
                                            C786410Ut5.K7(c1749280vcc10, new ACListenerS155S0100000_21(this, 243));
                                        }
                                        C1749280vcc c1749280vcc11 = this.LL;
                                        if (c1749280vcc11 != null && (tuxTextView = (TuxTextView) c1749280vcc11.findViewById(R.id.message_tv)) != null) {
                                            tuxTextView.setTuxFont(102);
                                            tuxTextView.setTextColorRes(R.attr.a1j);
                                        }
                                    }
                                }
                            }
                            View view = this.LLILLJJLI;
                            if (view != null) {
                                C786410Ut5.LJLLLLLL(8, view);
                            }
                        }
                    }
                }
                C1749280vcc c1749280vcc12 = this.LL;
                if (c1749280vcc12 != null && (layoutParams3 = c1749280vcc12.getLayoutParams()) != null) {
                    layoutParams3.height = (int) C12ES.LIZJ(52.0f, this.itemView.getContext());
                }
                C1749280vcc c1749280vcc13 = this.LL;
                if (c1749280vcc13 != null) {
                    c1749280vcc13.setTopMargin(C12ES.LIZJ(20.0f, this.itemView.getContext()));
                }
                C1749280vcc c1749280vcc14 = this.LL;
                if (c1749280vcc14 != null) {
                    C0H9H.LIZJ((int) C12ES.LIZJ(32.0f, this.itemView.getContext()), c1749280vcc14);
                }
                C1749280vcc c1749280vcc15 = this.LL;
                if (c1749280vcc15 != null) {
                    C1722300uv6 c1722300uv6 = new C1722300uv6();
                    c1722300uv6.LJIIIIZZ = L5().IQ2(this.itemView.getContext(), EnumC1342430l2P.COMMENT_EMPTY);
                    if (L5().HQ2()) {
                        c1722300uv6.LJIIIZ = new AwS585S0100000_6(this, 370);
                    }
                    c1749280vcc15.setStatus(c1722300uv6);
                }
                View view2 = this.LLILLJJLI;
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(0, view2);
                }
                break;
            case 5:
                C1749280vcc c1749280vcc16 = this.LL;
                if (c1749280vcc16 != null && (layoutParams5 = c1749280vcc16.getLayoutParams()) != null) {
                    layoutParams5.height = (int) C12ES.LIZJ(52.0f, this.itemView.getContext());
                }
                C1749280vcc c1749280vcc17 = this.LL;
                if (c1749280vcc17 != null) {
                    c1749280vcc17.setTopMargin(C12ES.LIZJ(20.0f, this.itemView.getContext()));
                }
                C1749280vcc c1749280vcc18 = this.LL;
                if (c1749280vcc18 != null) {
                    C0H9H.LIZJ((int) C12ES.LIZJ(32.0f, this.itemView.getContext()), c1749280vcc18);
                }
                C1749280vcc c1749280vcc19 = this.LL;
                if (c1749280vcc19 != null) {
                    C1722300uv6 c1722300uv62 = new C1722300uv6();
                    c1722300uv62.LJIIIIZZ = L5().IQ2(this.itemView.getContext(), EnumC1342430l2P.COMMENT_DISLIKE);
                    c1749280vcc19.setStatus(c1722300uv62);
                }
                break;
            case 6:
                C1749280vcc c1749280vcc20 = this.LL;
                if (c1749280vcc20 != null) {
                    c1749280vcc20.setTopMargin(C12ES.LIZJ(18.0f, this.itemView.getContext()));
                }
                C1749280vcc c1749280vcc21 = this.LL;
                if (c1749280vcc21 != null) {
                    C0H9H.LIZJ((int) C12ES.LIZJ(20.0f, this.itemView.getContext()), c1749280vcc21);
                }
                C1749280vcc c1749280vcc22 = this.LL;
                if (c1749280vcc22 != null) {
                    C1722300uv6 c1722300uv63 = new C1722300uv6();
                    c1722300uv63.LJIIIIZZ = L5().IQ2(this.itemView.getContext(), EnumC1342430l2P.COMMENT_CLOSE);
                    c1749280vcc22.setStatus(c1722300uv63);
                }
                break;
            case 7:
                C1749280vcc c1749280vcc23 = this.LL;
                if (c1749280vcc23 != null && (layoutParams6 = c1749280vcc23.getLayoutParams()) != null) {
                    layoutParams6.height = (int) C12ES.LIZJ(252.0f, this.itemView.getContext());
                }
                C1913380ztI c1913380ztI = C1913380ztI.LLILLJJLI;
                if (c1913380ztI.isStandardUIEnable()) {
                    C1749280vcc c1749280vcc24 = this.LL;
                    if (c1749280vcc24 != null) {
                        c1913380ztI.setStatusView(c1749280vcc24, "comment_list_page", new AwS565S0100000_21(this, 1489), c1157070gDR.LLILLJJLI);
                    }
                    Context context2 = getContext();
                    if (context2 != null && (activityLIZ = C1388190mED.LIZ(context2)) != null) {
                        c1913380ztI.triggerNetworkTips(activityLIZ, "comment_list_page", (Exception) null, this.LL);
                        break;
                    }
                } else {
                    C1749280vcc c1749280vcc25 = this.LL;
                    if (c1749280vcc25 != null) {
                        C1722300uv6 c1722300uv64 = new C1722300uv6();
                        C1893080zMY.LIZ(c1722300uv64, new AwS565S0100000_21(this, 1491));
                        c1749280vcc25.setStatus(c1722300uv64);
                    }
                    break;
                }
                break;
            case 8:
                C1749280vcc c1749280vcc26 = this.LL;
                if (c1749280vcc26 != null) {
                    c1749280vcc26.setTopMargin(C12ES.LIZJ(18.0f, this.itemView.getContext()));
                }
                C1749280vcc c1749280vcc27 = this.LL;
                if (c1749280vcc27 != null) {
                    C1722300uv6 c1722300uv65 = new C1722300uv6();
                    c1722300uv65.LJIIIIZZ = L5().IQ2(this.itemView.getContext(), EnumC1342430l2P.LOAD_MORE_ERR);
                    c1749280vcc27.setStatus(c1722300uv65);
                }
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                C1749280vcc c1749280vcc28 = this.LL;
                if (c1749280vcc28 != null) {
                    C1722300uv6 c1722300uv66 = new C1722300uv6();
                    c1722300uv66.LJIIIIZZ = L5().IQ2(this.itemView.getContext(), EnumC1342430l2P.FILTER_STATUS);
                    c1749280vcc28.setStatus(c1722300uv66);
                }
                break;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.a4_, viewGroup, false);
    }

    @Override // X.InterfaceC1342980l3I
    public final void vd(boolean z, boolean z2, C1340820kzo c1340820kzo) {
        C1749280vcc c1749280vcc = this.LL;
        if (c1749280vcc != null) {
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            c1722300uv6.LJIIIIZZ = L5().IQ2(this.itemView.getContext(), EnumC1342430l2P.COMMENT_EMPTY);
            c1749280vcc.setStatus(c1722300uv6);
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
