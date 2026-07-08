package com.ss.android.ugc.aweme.ui.view;

import X.AbstractC1386130mAt;
import X.AbstractC848400XPy;
import X.AbstractViewOnClickListenerC420730Ged;
import X.C03H5;
import X.C0HTT;
import X.C0SO2;
import X.C0SRL;
import X.C0SRU;
import X.C0SSJ;
import X.C0SV8;
import X.C0SXF;
import X.C0SYP;
import X.C0SYU;
import X.C0WZX;
import X.C0XPD;
import X.C0XQ7;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C1308910kAL;
import X.C1346580l96;
import X.C1346910l9d;
import X.C1346920l9e;
import X.C1348710lCX;
import X.C1349280lDS;
import X.C1349800lEI;
import X.C1353500lKG;
import X.C1355680lNm;
import X.C1357660lQy;
import X.C1359610lU7;
import X.C1360460lVU;
import X.C1364440lbu;
import X.C1370890lmJ;
import X.C1388190mED;
import X.C1389890mGx;
import X.C13IQ;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C15WT;
import X.C1622206Wu;
import X.C1770850wBP;
import X.C19211310Dv;
import X.C19474211Gy;
import X.C19651011uW;
import X.C19719912Dl;
import X.C19EG;
import X.C1EE2;
import X.C1ER1;
import X.C21566519ah;
import X.C21566919al;
import X.C2183561Ad0;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C2344809Gs;
import X.C298410Bmp;
import X.C304280BwI;
import X.C338520DOw;
import X.C418440Gaw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C452501pT;
import X.C5182020e;
import X.C523420Kfs;
import X.C621180OYa;
import X.C627150Oin;
import X.C717590SCv;
import X.C720360SNm;
import X.C720740SOy;
import X.C721640SSk;
import X.C723150SYf;
import X.C724750Sbp;
import X.C729980SkG;
import X.C735280Sso;
import X.C735370Ssx;
import X.C735440St4;
import X.C735840Sti;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C737030Svd;
import X.C786410Ut5;
import X.C814420VxA;
import X.C866950Xzh;
import X.C960203pA;
import X.DialogInterfaceOnClickListenerC738730SyN;
import X.DialogInterfaceOnClickListenerC738760SyQ;
import X.EnumC1341680l1C;
import X.EnumC1346360l8k;
import X.EnumC721170SQp;
import X.InterfaceC0148002o;
import X.InterfaceC1210900hcG;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2183581Ad2;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC616440OFu;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC737440SwI;
import X.InterfaceC849390XTt;
import Y.AObserverS215S0100000_11;
import Y.ARunnableS111S0100000_11;
import Y.ATListenerS454S0100000_21;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SAFTikTokFragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IPostModeCommentActionBarAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.comment.model.CommentInputContent;
import com.ss.android.ugc.aweme.comment.model.CommentStickerStruct;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.commentv2.CommentSyncSharedVM;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.experiment.CommentWithStickerExp;
import com.ss.android.ugc.aweme.experiment.ExploreDetailComponentOptExperiment;
import com.ss.android.ugc.aweme.experiment.PhotoDetailCommentEntryExperiment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.IMStickerPanelEventViewModel;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2;
import com.ss.android.ugc.aweme.ui.view.PostModeActionBarComponentV2;
import com.ss.android.ugc.aweme.viewmodel.PostDiggViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeFavoriteViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModePageViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeShareViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS24S0010000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.AwS79S0500000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class PostModeActionBarComponentV2 implements InterfaceC2183581Ad2, InterfaceC724530SbT, C0HTT<C737030Svd>, InterfaceC616440OFu, IPostModeCommentActionBarAbility {
    public final C0SRL LL;
    public final PostDiggViewModel LLILLJJLI;
    public final PostModeFavoriteViewModel LLILLL;
    public final PostModeShareViewModel LLILZ;
    public boolean LLILZIL;
    public C21566519ah LLILZLL;
    public boolean LLIZ;
    public InterfaceC737440SwI LLIZLLLIL;
    public final C2183561Ad0 LLJ;
    public C723150SYf LLJI;
    public final CommentContextSource LLJIJIL;
    public Comment LLJILJIL;
    public C1353500lKG LLJILJILJ;

    @Override // com.ss.android.ugc.aweme.comment.api.LimitRootAbility
    public final boolean cD0() {
        return false;
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

    @Override // X.InterfaceC2183581Ad2
    public final void LIZ() {
        this.LLILLJJLI.yQ2(new AwS625S0100000_11(this, 84));
    }

    @Override // X.InterfaceC2183581Ad2
    public final void LIZIZ() {
        Aweme aweme;
        C723150SYf c723150SYf;
        C735280Sso c735280Sso = C735280Sso.LIZ;
        Aweme aweme2 = this.LL.LIZJ;
        c735280Sso.getClass();
        if (!C735280Sso.LJFF(aweme2)) {
            C721640SSk c721640SSk = C721640SSk.LIZ;
            Aweme aweme3 = this.LL.LIZJ;
            c721640SSk.getClass();
            if (C721640SSk.LJIIJ(aweme3)) {
                LJIIJ();
            }
            this.LL.LJIIIIZZ.LLJ.setValue(Unit.LIZ);
            return;
        }
        C0SRL c0srl = this.LL;
        if (c0srl == null || (aweme = c0srl.LIZJ) == null) {
            return;
        }
        if (AwemeExtKt.getStatusSafety(aweme) != null) {
            AwemeStatus statusSafety = AwemeExtKt.getStatusSafety(aweme);
            if (statusSafety == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            if (!statusSafety.isPrivate()) {
                return;
            }
        }
        if (this.LLILZIL || (c723150SYf = this.LLJI) == null) {
            return;
        }
        c723150SYf.LJIILL(aweme);
        if (C729980SkG.LJIIIIZZ(aweme) && this.LLILZLL == null) {
            C21566919al c21566919al = new C21566919al(this.LL.LIZLLL());
            c21566919al.LIZ(2131845230);
            c21566919al.LJII(R.string.f1_, new DialogInterfaceOnClickListenerC738760SyQ(aweme, 4), false);
            c21566919al.LJIIJ(2131836386, new DialogInterfaceOnClickListenerC738730SyN(this, aweme, 2), false);
            c21566919al.LIZLLL(new AwS590S0100000_11(this, 511));
            this.LLILZLL = new C21566519ah(c21566919al);
        }
        C21566519ah c21566519ah = this.LLILZLL;
        if (c21566519ah != null) {
            c21566519ah.LIZLLL();
        }
        this.LLILZIL = true;
    }

    @Override // X.InterfaceC2183581Ad2
    public final void LIZLLL() {
        final View view;
        String aid;
        Fragment fragment = this.LL.LIZ;
        if (fragment == null || (view = fragment.getView()) == null) {
            return;
        }
        final PostModeFavoriteViewModel postModeFavoriteViewModel = this.LLILLL;
        postModeFavoriteViewModel.getClass();
        if (!(!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin())) {
            postModeFavoriteViewModel.wQ2(view, this);
            return;
        }
        Aweme aweme = postModeFavoriteViewModel.LL;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        C717590SCv c717590SCv = postModeFavoriteViewModel.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PostModeFavoriteViewModel.LLJI;
        Context context = (Context) c717590SCv.LIZ();
        Activity activityLIZ = context != null ? C1388190mED.LIZ(context) : null;
        C627150Oin c627150Oin = new C627150Oin();
        C786410Ut5.LJJJI("group_id", aid, c627150Oin.LIZ);
        Aweme aweme2 = postModeFavoriteViewModel.LL;
        C786410Ut5.LJJJI("author_id", aweme2 != null ? AwemeExtKt.getAuthorUid(aweme2) : null, c627150Oin.LIZ);
        C786410Ut5.LJJJI("log_pb", C735370Ssx.LJIIJJI(aid), c627150Oin.LIZ);
        C0XPD.LIZIZ(activityLIZ, "graphic_detail", "click_favorite_video", c627150Oin.LIZ, new InterfaceC849390XTt() { // from class: X.0OZc
            @Override // X.InterfaceC849390XTt
            public final /* synthetic */ void LIZIZ() {
            }

            @Override // X.InterfaceC849390XTt
            public final void LIZ() {
                postModeFavoriteViewModel.wQ2(view, this);
            }
        });
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC2183581Ad2
    public final void LJI() {
        String uid;
        List<PhotoModeImageUrlModel> imageList;
        if (this.LLIZ) {
            return;
        }
        this.LLIZ = true;
        C0SRL c0srl = this.LL;
        Fragment fragment = c0srl.LIZ;
        if (fragment != null) {
            this.LLILZ.LLILLL = c0srl.LJIIL.NR();
            PostModeShareViewModel postModeShareViewModel = this.LLILZ;
            C19EG c19eg = this.LL.LIZIZ;
            C0HTT<C737030Svd> c0htt = new C0HTT<C737030Svd>(this) { // from class: X.0SWo
                public final WeakReference<PostModeActionBarComponentV2> LL;

                {
                    this.LL = new WeakReference<>(this);
                }

                @Override // X.C0HTT
                public final void LLIIL(C737030Svd c737030Svd) {
                    C737030Svd c737030Svd2 = c737030Svd;
                    PostModeActionBarComponentV2 postModeActionBarComponentV2 = this.LL.get();
                    if (postModeActionBarComponentV2 != null) {
                        postModeActionBarComponentV2.LLIIL(c737030Svd2);
                    }
                }
            };
            C0SRL c0srl2 = this.LL;
            PostModeDetailParams postModeDetailParams = c0srl2.LJII;
            boolean z = c0srl2.LJIIZILJ;
            Aweme aweme = postModeShareViewModel.LL;
            if (aweme != null) {
                Bundle bundle = new Bundle();
                String str = postModeDetailParams != null ? postModeDetailParams.eventType : null;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                C786410Ut5.LJJJI("event_type", str, bundle);
                C786410Ut5.LJJJI("from_page", "graphic_detail", bundle);
                C786410Ut5.LJJJI("action_from_page", postModeShareViewModel.LLILLJJLI, bundle);
                bundle.putInt("aweme_type", aweme.getAwemeType());
                PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
                bundle.putInt("pic_cnt", (photoModeImageInfo == null || (imageList = photoModeImageInfo.getImageList()) == null) ? 0 : imageList.size());
                C786410Ut5.LJJJI("enter_method", "click_share_button", bundle);
                C786410Ut5.LJJJI("panel_source", "share_panel", bundle);
                C1355680lNm.LIZIZ(bundle, "share_panel");
                bundle.putBoolean("has_overlay", true);
                bundle.putBoolean("exposed_repost_button_can_show", false);
                if (C1EE2.LIZIZ.LIZLLL()) {
                    bundle.putInt("is_enter_graphic_detail", postModeShareViewModel.LLILLL);
                }
                bundle.putInt("if_photo_read_page", 0);
                C786410Ut5.LJJJI("explore_from_group_id", postModeDetailParams != null ? postModeDetailParams.exploreFromGroupId : null, bundle);
                if (Intrinsics.LJFF(postModeDetailParams != null ? postModeDetailParams.eventType : null, "homepage_explore")) {
                    Long l = postModeDetailParams.exploreTabId;
                    bundle.putLong("explore_topic_id", l != null ? l.longValue() : 0L);
                    C786410Ut5.LJJJI("explore_topic", postModeDetailParams.exploreTabName, bundle);
                    C786410Ut5.LJJJI("from_explore_page", postModeDetailParams.fromExplorePage, bundle);
                }
                C1364440lbu.LIZIZ(bundle, aweme);
                for (Map.Entry<String, String> entry : C1ER1.LIZIZ.I(aweme, postModeDetailParams != null ? postModeDetailParams.eventType : null).entrySet()) {
                    C786410Ut5.LJJJI(entry.getKey(), entry.getValue(), bundle);
                }
                PhotoModeImageInfo photoModeImageInfo2 = aweme.getPhotoModeImageInfo();
                if (photoModeImageInfo2 != null) {
                    bundle.putInt("has_title", photoModeImageInfo2.hasTitle() ? 1 : 0);
                }
                if (z) {
                    bundle.putBoolean("key_enhance_share_panel_block_bottom_tips", true);
                }
                if (C0SSJ.LIZ(aweme)) {
                    c19eg = c19eg;
                    aweme = aweme;
                    C621180OYa.LIZ.LJIIJJI(c19eg, fragment, aweme, c0htt, bundle);
                } else {
                    C621180OYa.LIZ.LJJIIJ(c19eg, fragment, aweme, false, c0htt, bundle);
                }
                if (postModeDetailParams != null) {
                    C1370890lmJ c1370890lmJ = C1370890lmJ.LIZ;
                    C735840Sti c735840Sti = C735840Sti.LIZ;
                    C19651011uW c19651011uW = C19651011uW.LIZIZ;
                    C735440St4 c735440St4 = new C735440St4();
                    String str3 = postModeDetailParams.eventType;
                    if (str3 == null) {
                        str3 = "";
                    }
                    c735440St4.LIZLLL = str3;
                    c735440St4.LJIJI(aweme);
                    c735440St4.LJLIL = "video";
                    c735440St4.LJIJ = C735370Ssx.LJIILJJIL(postModeDetailParams.pageType, aweme);
                    User author = aweme.getAuthor();
                    if (author != null && (uid = author.getUid()) != null) {
                        str2 = uid;
                    }
                    c735440St4.LJJLIIIJILLIZJL = str2;
                    User author2 = aweme.getAuthor();
                    c735840Sti.getClass();
                    c735440St4.LJJJLL = C735840Sti.LJIIIIZZ(author2);
                    c735440St4.LJJZZI = C0SXF.LJJIII(c19eg, aweme);
                    C1359610lU7.LIZIZ(aweme, c735440St4);
                    Object objLJIIIZ = c19651011uW.LJIIIZ(aweme, c735440St4);
                    C735840Sti.LIZIZ(aweme, objLJIIIZ);
                    AbstractC1386130mAt<?> abstractC1386130mAt = (AbstractC1386130mAt) c1370890lmJ.appendCreationParams(objLJIIIZ, aweme);
                    abstractC1386130mAt.LIZIZ(C1ER1.LIZIZ.I(aweme, postModeDetailParams.eventType));
                    abstractC1386130mAt.LJFF("from_page", "graphic_detail", InterfaceC1210900hcG.LIZ);
                    abstractC1386130mAt.LIZLLL(C720360SNm.LJII(aweme), "is_inspiration_added");
                    abstractC1386130mAt.LIZLLL(C720360SNm.LJIIJ(aweme), "is_photo_text_added");
                    if (C1EE2.LIZIZ.LIZLLL()) {
                        abstractC1386130mAt.LIZLLL(postModeShareViewModel.LLILLL, "is_enter_graphic_detail");
                    }
                    C15WT.LIZIZ.LJIJJLI(abstractC1386130mAt, postModeDetailParams.eventType, postModeDetailParams.exploreFromGroupId, aweme.getAid());
                    C1357660lQy.LIZJ(aweme, abstractC1386130mAt);
                    C1357660lQy.LJFF(aweme, abstractC1386130mAt);
                    C1357660lQy.LJII(aweme, abstractC1386130mAt);
                    abstractC1386130mAt.LJIILJJIL();
                }
                C1360460lVU.LIZIZ.LJJII().LIZLLL(aweme.getAid());
            }
        }
        HandlerHook.viewPostDelay(this.LLJ, new ARunnableS111S0100000_11(this, 64), 3000L);
    }

    @Override // X.InterfaceC2183581Ad2
    public final void LJII() {
        Aweme aweme = this.LL.LIZJ;
        if (aweme != null) {
            this.LLJ.n0(AwemeExtKt.isCollected(aweme));
        }
    }

    public final void LJIIJ() {
        CharSequence charSequenceLJFF;
        Long l;
        C721640SSk c721640SSk = C721640SSk.LIZ;
        C0SRL c0srl = this.LL;
        Aweme aweme = c0srl.LIZJ;
        Context contextLIZLLL = c0srl.LIZLLL();
        c721640SSk.getClass();
        if (aweme == null) {
            charSequenceLJFF = "";
        } else {
            C1349800lEI c1349800lEI = new C1349800lEI(aweme.getAid());
            c1349800lEI.setCommentClose(true);
            charSequenceLJFF = C1349280lDS.LJFF(contextLIZLLL, aweme, c1349800lEI);
        }
        String string = charSequenceLJFF.toString();
        PostModePageViewModel postModePageViewModel = this.LL.LJIIIIZZ;
        T value = postModePageViewModel.LLJJJJLIIL.getValue();
        if (value != 0 && (l = postModePageViewModel.LLLLII) != null) {
            long jLongValue = l.longValue();
            if (Intrinsics.LJFF(value, string) && System.currentTimeMillis() - jLongValue < postModePageViewModel.LLLLIIIILLL) {
                return;
            }
        }
        postModePageViewModel.LLLLII = Long.valueOf(System.currentTimeMillis());
        postModePageViewModel.LLJJJJJIL.setValue(string);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LL.LJIIL();
    }

    @Override // X.InterfaceC616440OFu
    public final void ZX() {
        PostModeFavoriteViewModel postModeFavoriteViewModel;
        Aweme aweme;
        if (!C298410Bmp.LIZ() && (aweme = (postModeFavoriteViewModel = this.LLILLL).LL) != null) {
            aweme.setCollectStatus(!AwemeExtKt.isCollected(aweme) ? 1 : 0);
            ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).Br(aweme.getCollectStatus(), aweme.getAid());
            postModeFavoriteViewModel.setState(new AwS24S0010000_9(AwemeExtKt.isCollected(aweme), 14));
            postModeFavoriteViewModel.vQ2(postModeFavoriteViewModel.LL);
        }
        this.LLJ.l0();
    }

    public final void LJIIJJI(KeyboardVMV2 keyboardVMV2) {
        Fragment fragment;
        C736680Sv4.LJIIIIZZ(this, keyboardVMV2, new C2217381BqS() { // from class: X.0SYW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1346950l9h) obj).LLILZIL;
            }
        }, null, new AwS625S0100000_11(this, 85), 6);
        C736680Sv4.LJIIIIZZ(this, keyboardVMV2, new C2217381BqS() { // from class: X.0SYX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1346950l9h) obj).LLJI;
            }
        }, C736820SvI.LIZLLL(), new AwS625S0100000_11(this, 86), 4);
        if (CommentWithStickerExp.LIZIZ() && CommentWithStickerExp.LIZ() && (fragment = this.LL.LIZ) != null) {
            AssemViewModel value = new C736950SvV(C13LE.LIZ(IMStickerPanelEventViewModel.class), new AwS555S0100000_11(this, 1103), new C452070Ho5(), C724750Sbp.LJII(fragment), C1220000hqw.LIZ(fragment), AFwS243S0000000_11.get$arr$(542), new C451460Hn6(fragment, false), new C451620HnM(fragment, true), new C338520DOw(fragment)).getValue();
            if (value != null) {
                subscribe(value, C736820SvI.LIZIZ(value.usedInReusedScene), null, new AwS635S0100000_21(this, 87));
            }
        }
    }

    public final void LJIILIIL(CommentInputContent commentInputContent) {
        Editable editableLLLZZIL;
        Editable editableLLLZZIL2;
        Editable editableLLLZZIL3;
        C1353500lKG c1353500lKG;
        Editable editableLLLZZIL4;
        if (commentInputContent == null) {
            return;
        }
        Editable editable = commentInputContent.text;
        C1353500lKG c1353500lKG2 = this.LLJILJILJ;
        if (c1353500lKG2 != null && (editableLLLZZIL4 = C2204961BRm.LLLZZIL(c1353500lKG2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+hLYnH2SU3fvhA2sKjb49sKMJP8E8GpBqmEd8MnjtRSFftvw==", null))) != null) {
            editableLLLZZIL4.clear();
        }
        if (editable != null && editable.length() != 0 && (c1353500lKG = this.LLJILJILJ) != null) {
            c1353500lKG.setText(editable);
        }
        Context contextLIZLLL = this.LL.LIZLLL();
        List<CommentImageModel> list = commentInputContent.imageList;
        CommentStickerStruct commentStickerStruct = commentInputContent.stickerStruct;
        if (C866950Xzh.LIZIZ(list)) {
            String string = contextLIZLLL.getResources().getString(2131826734);
            C1353500lKG c1353500lKG3 = this.LLJILJILJ;
            if (c1353500lKG3 != null && (editableLLLZZIL3 = C2204961BRm.LLLZZIL(c1353500lKG3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+hLYnH2SU3fvhA2sKjb49sKMJP8E8GpBqmEd8MnjtRSFftvw==", null))) != null) {
                editableLLLZZIL3.insert(0, string);
            }
        } else if (commentStickerStruct != null) {
            String string2 = contextLIZLLL.getResources().getString(2131826735);
            C1353500lKG c1353500lKG4 = this.LLJILJILJ;
            if (c1353500lKG4 != null && (editableLLLZZIL2 = C2204961BRm.LLLZZIL(c1353500lKG4, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+hLYnH2SU3fvhA2sKjb49sKMJP8E8GpBqmEd8MnjtRSFftvw==", null))) != null) {
                editableLLLZZIL2.insert(0, string2);
            }
        } else if (C866950Xzh.LIZIZ(commentInputContent.audioList)) {
            String string3 = contextLIZLLL.getResources().getString(2131826733);
            C1353500lKG c1353500lKG5 = this.LLJILJILJ;
            if (c1353500lKG5 != null && (editableLLLZZIL = C2204961BRm.LLLZZIL(c1353500lKG5, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+hLYnH2SU3fvhA2sKjb49sKMJP8E8GpBqmEd8MnjtRSFftvw==", null))) != null) {
                editableLLLZZIL.insert(0, string3);
            }
        }
        C1353500lKG c1353500lKG6 = this.LLJILJILJ;
        if (c1353500lKG6 != null) {
            c1353500lKG6.setEllipsize(TextUtils.TruncateAt.END);
        }
        C1353500lKG c1353500lKG7 = this.LLJILJILJ;
        if (c1353500lKG7 != null) {
            c1353500lKG7.setInputType(0);
        }
        C1353500lKG c1353500lKG8 = this.LLJILJILJ;
        if (c1353500lKG8 != null) {
            c1353500lKG8.setKeyListener(null);
        }
        C1353500lKG c1353500lKG9 = this.LLJILJILJ;
        if (c1353500lKG9 != null) {
            c1353500lKG9.setMovementMethod(null);
        }
    }

    @Override // X.InterfaceC616440OFu
    public final void Me1(String str) {
        C1389890mGx c1389890mGx = new C1389890mGx(this.LL.LIZIZ);
        c1389890mGx.LJIIJ(str);
        c1389890mGx.LJIIJJI();
    }

    @Override // X.C0HTT
    /* JADX INFO: renamed from: Ss1, reason: merged with bridge method [inline-methods] */
    public final void LLIIL(C737030Svd c737030Svd) {
        String str;
        String str2;
        Aweme aweme;
        Aweme aweme2;
        this.LLIZ = false;
        this.LL.LJIIIIZZ.LLJJIJIL.setValue(Boolean.FALSE);
        if (c737030Svd == null) {
            return;
        }
        int i = c737030Svd.LIZ;
        String str3 = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 55) {
                    if (i == 56) {
                        Object obj = c737030Svd.LIZIZ;
                        if ((obj instanceof Aweme) && (aweme2 = (Aweme) obj) != null) {
                            C720740SOy c720740SOy = C720740SOy.LIZ;
                            C0SRL c0srl = this.LL;
                            C19EG c19eg = c0srl.LIZIZ;
                            c720740SOy.getClass();
                            ((IMixFeedService) ServiceManager.get().getService(IMixFeedService.class)).LJJIII(c19eg, aweme2, new C0SV8(c0srl), "graphic_detail", "long_press");
                            return;
                        }
                        return;
                    }
                    return;
                }
                Object obj2 = c737030Svd.LIZIZ;
                if ((obj2 instanceof Aweme) && (aweme = (Aweme) obj2) != null) {
                    C720740SOy c720740SOy2 = C720740SOy.LIZ;
                    Context contextLIZLLL = this.LL.LIZLLL();
                    C19EG c19eg2 = this.LL.LIZIZ;
                    c720740SOy2.getClass();
                    ((IMixFeedService) ServiceManager.get().getService(IMixFeedService.class)).LJJIIJZLJL(new C0SRU(aweme, contextLIZLLL, c19eg2));
                    return;
                }
                return;
            }
            this.LL.LJIIIIZZ.vQ2(EnumC721170SQp.DELETE);
            return;
        }
        Aweme aweme3 = this.LL.LIZJ;
        if (aweme3 == null) {
            return;
        }
        ShareDependService.LIZ.getClass();
        ShareDependService shareDependServiceLJJJJI = ShareDependServiceImpl.LJJJJI();
        C0SRL c0srl2 = this.LL;
        PostModeDetailParams postModeDetailParams = c0srl2.LJII;
        String str4 = "";
        if (postModeDetailParams == null || (str = postModeDetailParams.eventType) == null) {
            str = "";
        }
        Context contextLIZLLL2 = c0srl2.LIZLLL();
        String str5 = c737030Svd.LJIIJ;
        if (str5 == null) {
            str5 = "";
        }
        PostModeDetailParams postModeDetailParams2 = this.LL.LJII;
        if (postModeDetailParams2 != null && (str2 = postModeDetailParams2.eventType) != null) {
            str4 = str2;
        }
        if (postModeDetailParams2 != null) {
            str3 = postModeDetailParams2.exploreFromGroupId;
        }
        shareDependServiceLJJJJI.LJJIZ(aweme3, str, contextLIZLLL2, str5, str4, "", "graphic_detail", 0, null, str3);
    }

    @Override // X.InterfaceC616440OFu
    public final void p30(Exception exc) {
        C2344809Gs.LJI(exc);
        this.LLJ.n0(false);
        this.LLJ.l0();
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IPostModeCommentActionBarAbility
    public final void V8(String str, String str2) {
        String str3 = str;
        if (str3 == null) {
            str3 = "click_input_box";
        }
        LJIIZILJ(this, null, str3, null, "comment_after_poll", 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PostModeActionBarComponentV2(C0SRL c0srl, PostDiggViewModel postDiggViewModel, PostModeFavoriteViewModel postModeFavoriteViewModel, PostModeShareViewModel postModeShareViewModel) {
        int iIntValue;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        CommentContextSource commentContextSource;
        String str;
        ViewGroup viewGroup;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        this.LL = c0srl;
        this.LLILLJJLI = postDiggViewModel;
        this.LLILLL = postModeFavoriteViewModel;
        this.LLILZ = postModeShareViewModel;
        C2183561Ad0 c2183561Ad0 = new C2183561Ad0(c0srl.LIZLLL(), null, this, 6);
        Context contextLIZLLL = c0srl.LIZLLL();
        if (C960203pA.LIZIZ(contextLIZLLL) && C0SO2.LIZLLL()) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zo, contextLIZLLL);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = -16777216;
            }
        } else {
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zm, contextLIZLLL);
            if (numLIZJ2 != null) {
                iIntValue = numLIZJ2.intValue();
            } else {
                iIntValue = -1;
            }
        }
        c2183561Ad0.setBackgroundColor(iIntValue);
        c2183561Ad0.h0();
        this.LLJ = c2183561Ad0;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommentSyncSharedVM.class);
        AFwS243S0000000_11 aFwS243S0000000_11 = AFwS243S0000000_11.get$arr$(543);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        C1622206Wu c1622206WuLJII = C724750Sbp.LJII(this);
        if (this instanceof HasDefaultViewModelProviderFactory) {
            hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) this;
        } else {
            hasDefaultViewModelProviderFactory = null;
        }
        C736950SvV c736950SvV = new C736950SvV(c19719912DlLIZ, null, c452070Ho5, c1622206WuLJII, C1220000hqw.LIZ(hasDefaultViewModelProviderFactory), aFwS243S0000000_11, null, null, null);
        Fragment fragment = c0srl.LIZ;
        if (fragment != null && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(fragment, null), "source_default_key", CommentContextSource.class, null)) != null) {
            commentContextSource = (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource();
        } else {
            commentContextSource = null;
        }
        this.LLJIJIL = commentContextSource;
        ViewGroup viewGroup2 = c0srl.LIZLLL;
        if (viewGroup2 != null && (viewGroup = (ViewGroup) viewGroup2.findViewById(R.id.e_t)) != null) {
            viewGroup.addView(c2183561Ad0);
        }
        PostModeDetailParams postModeDetailParams = c0srl.LJII;
        if (postModeDetailParams != null) {
            str = postModeDetailParams.eventType;
        } else {
            str = null;
        }
        if (ExploreDetailComponentOptExperiment.INSTANCE.addCommentEntranceEnabled(str) || PhotoDetailCommentEntryExperiment.isRoundedInputBoxEnabled()) {
            View viewFindViewById = c2183561Ad0.findViewById(R.id.rjs);
            if (viewFindViewById != null) {
                viewFindViewById.setBackgroundResource(R.drawable.cwd);
            }
            TextView textView = (TextView) c2183561Ad0.findViewById(R.id.rjt);
            if (textView != null) {
                textView.setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), textView.getPaddingTop(), textView.getPaddingEnd(), textView.getPaddingBottom());
            }
        }
        C1353500lKG c1353500lKG = (C1353500lKG) c2183561Ad0.findViewById(R.id.rjt);
        this.LLJILJILJ = c1353500lKG;
        if (c1353500lKG != null) {
            Aweme aweme = c0srl.LIZJ;
            if (aweme != null) {
                C1346580l96 c1346580l96 = C1346580l96.LIZ;
                Context context = c1353500lKG.getContext();
                Comment comment = this.LLJILJIL;
                PostModeDetailParams postModeDetailParams2 = c0srl.LJII;
                String str2 = (postModeDetailParams2 == null || (str2 = postModeDetailParams2.eventType) == null) ? "" : str2;
                c1346580l96.getClass();
                c1353500lKG.setHint(C1346580l96.LIZIZ(context, aweme, comment, false, false, false, false, str2, true, false, false));
            }
            c1353500lKG.clearFocus();
            c1353500lKG.setOnTouchListener(new ATListenerS454S0100000_21(c1353500lKG, 23));
        }
        C1353500lKG c1353500lKG2 = this.LLJILJILJ;
        if (c1353500lKG2 != null) {
            C786410Ut5.I7(new AbstractViewOnClickListenerC420730Ged() { // from class: X.0SYR
                {
                    super(700L);
                }

                @Override // X.AbstractViewOnClickListenerC420730Ged
                public final void LIZ(View view) {
                    if (view != null) {
                        PostModeActionBarComponentV2.LJIIZILJ(this.LLILZ, null, "click_input_box", null, null, 13);
                    }
                }
            }, c1353500lKG2);
        }
        C723150SYf c723150SYf = new C723150SYf(c0srl.LIZIZ);
        this.LLJI = c723150SYf;
        c723150SYf.LJIIJ(new C19211310Dv());
        c2183561Ad0.setCountsVisible$post_mode_release(C1EE2.LIZIZ.showEngagementCount());
        C736680Sv4.LJIIIIZZ(this, postDiggViewModel, new C2217381BqS() { // from class: X.0SRe
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0SRH) obj).LL;
            }
        }, null, new AwS625S0100000_11(this, 137), 6);
        Context contextLIZLLL2 = c0srl.LIZLLL();
        C717590SCv c717590SCv = postDiggViewModel.LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PostDiggViewModel.LLJILJIL;
        c717590SCv.LIZIZ(contextLIZLLL2);
        postDiggViewModel.LLJ = c0srl.LJIIL.NR();
        Aweme aweme2 = c0srl.LIZJ;
        postDiggViewModel.LLIZLLLIL = aweme2;
        postDiggViewModel.setState(new AwS377S0200000_11(postDiggViewModel, aweme2, 96));
        Aweme aweme3 = c0srl.LIZJ;
        if (aweme3 != null) {
            C0SYP.LIZ.getClass();
            if (C0SYP.LIZ(aweme3)) {
                AwemeStatistics statistics = aweme3.getStatistics();
                if (statistics != null) {
                    C721640SSk c721640SSk = C721640SSk.LIZ;
                    long commentCount = statistics.getCommentCount();
                    c721640SSk.getClass();
                    this.LLJ.setCommentText(C721640SSk.LJ(aweme3, commentCount));
                }
            } else {
                this.LLJ.setCommentText(CardStruct.IStatusCode.DEFAULT);
            }
        }
        C736680Sv4.LJIIIIZZ(this, c736950SvV.getValue(), new C2217381BqS() { // from class: X.0HWv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C442480HWs) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS625S0100000_11(this, 136), 4);
        Context contextLIZLLL3 = c0srl.LIZLLL();
        C717590SCv c717590SCv2 = postModeFavoriteViewModel.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = PostModeFavoriteViewModel.LLJI;
        c717590SCv2.LIZIZ(contextLIZLLL3);
        PostModeDetailParams postModeDetailParams3 = c0srl.LJII;
        postModeFavoriteViewModel.LLILZIL = postModeDetailParams3 != null ? postModeDetailParams3.eventType : null;
        postModeFavoriteViewModel.LLILZLL = postModeDetailParams3;
        postModeFavoriteViewModel.LLIZLLLIL = c0srl.LJIIL.NR();
        Aweme aweme4 = c0srl.LIZJ;
        if (aweme4 != null) {
            postModeFavoriteViewModel.LL = aweme4;
            postModeFavoriteViewModel.setState(new AwS375S0200000_9(aweme4, postModeFavoriteViewModel, 132));
        }
        C736680Sv4.LJIIIIZZ(this, postModeFavoriteViewModel, new C2217381BqS() { // from class: X.0OFT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OFR) obj).LLILLJJLI;
            }
        }, null, new AwS625S0100000_11(this, 138), 6);
        C736680Sv4.LJIIIIZZ(this, postModeFavoriteViewModel, new C2217381BqS() { // from class: X.0OFU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0OFR) obj).LLILZ);
            }
        }, null, new AwS625S0100000_11(this, 139), 6);
        c0srl.LJIIIIZZ.LLILZLL.observe(c0srl.LJIILIIL(), new AObserverS215S0100000_11(this, 52));
        postModeShareViewModel.LLILLL = c0srl.LJIIL.NR();
        postModeShareViewModel.LL = c0srl.LIZJ;
        postModeShareViewModel.setState(new AwS590S0100000_11(postModeShareViewModel, 401));
        C736680Sv4.LJIIIIZZ(this, postModeShareViewModel, new C2217381BqS() { // from class: X.0SYS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0SYQ) obj).LL;
            }
        }, null, new AwS625S0100000_11(this, 141), 6);
        SAFTikTokFragment sAFTikTokFragmentLJIILLIIL = c0srl.LJIILLIIL();
        if (sAFTikTokFragmentLJIILLIIL != null) {
            C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(KeyboardVMV2.class);
            LJIIJJI((KeyboardVMV2) C452501pT.LIZIZ(new AwS79S0500000_19(sAFTikTokFragmentLJIILLIIL, c19719912DlLIZ2, new C5182020e((C13IQ) c19719912DlLIZ2, 498), AFwS243S0000000_11.get$arr$(763), (Function0) null, 39)).getValue());
        } else {
            C19EG c19eg = c0srl.LIZIZ;
            C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(KeyboardVMV2.class);
            LJIIJJI((KeyboardVMV2) C452501pT.LIZIZ(new AwS79S0500000_19(c19eg, c19719912DlLIZ3, new C5182020e((C13IQ) c19719912DlLIZ3, 499), AFwS243S0000000_11.get$arr$(764), (Function0) null, 40)).getValue());
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

    public static void LJIIZILJ(PostModeActionBarComponentV2 postModeActionBarComponentV2, EnumC1341680l1C enumC1341680l1C, String str, CommentStickerStruct commentStickerStruct, String str2, int i) {
        String str3;
        String strEventType;
        C19EG activity;
        CommentCommonModel commonModel;
        Integer numValueOf;
        String aid;
        String str4 = str2;
        CommentStickerStruct commentStickerStruct2 = commentStickerStruct;
        String str5 = str;
        EnumC1341680l1C enumC1341680l1C2 = enumC1341680l1C;
        if ((i & 1) != 0) {
            enumC1341680l1C2 = EnumC1341680l1C.TEXT;
        }
        if ((i & 2) != 0) {
            str5 = "";
        }
        if ((i & 4) != 0) {
            commentStickerStruct2 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        postModeActionBarComponentV2.getClass();
        C1348710lCX.LIZ.getClass();
        if (C1348710lCX.LIZ()) {
            C0SRL c0srl = postModeActionBarComponentV2.LL;
            C19EG c19eg = c0srl.LIZIZ;
            Aweme aweme = c0srl.LIZJ;
            if (aweme != null) {
                numValueOf = Integer.valueOf(aweme.getAwemeType());
            } else {
                numValueOf = null;
            }
            String strValueOf = String.valueOf(numValueOf);
            Aweme aweme2 = postModeActionBarComponentV2.LL.LIZJ;
            if (aweme2 != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            C1348710lCX.LIZLLL(c19eg, "photo_cmt_popup", strValueOf, aid, null);
            return;
        }
        if (!ComplianceServiceProvider.LJFF().LIZJ(3) && !ComplianceServiceProvider.LJFF().LJFF()) {
            C721640SSk c721640SSk = C721640SSk.LIZ;
            Aweme aweme3 = postModeActionBarComponentV2.LL.LIZJ;
            c721640SSk.getClass();
            if (C721640SSk.LJIIJ(aweme3)) {
                postModeActionBarComponentV2.LJIIJ();
                return;
            }
        }
        C0SRL c0srl2 = postModeActionBarComponentV2.LL;
        C19EG c19eg2 = c0srl2.LIZIZ;
        Aweme aweme4 = c0srl2.LIZJ;
        PostModeDetailParams postModeDetailParams = c0srl2.LJII;
        if (postModeDetailParams != null) {
            str3 = postModeDetailParams.eventType;
        } else {
            str3 = null;
        }
        if (C0SYU.LIZIZ(c19eg2, aweme4, str3, "", null)) {
            return;
        }
        CommentContextSource commentContextSource = postModeActionBarComponentV2.LLJIJIL;
        if (commentContextSource != null) {
            strEventType = CommentContextSourceKt.eventType(commentContextSource);
        } else {
            strEventType = null;
        }
        WeakReference weakReference = new WeakReference(postModeActionBarComponentV2);
        CommentContextSource commentContextSource2 = postModeActionBarComponentV2.LLJIJIL;
        if (commentContextSource2 != null && (commonModel = commentContextSource2.getCommonModel()) != null) {
            commonModel.setCmtInputPos("bottom_fixed");
        }
        CommentService.LIZ.getClass();
        CommentService commentServiceLIZ = C523420Kfs.LIZ();
        Fragment fragment = postModeActionBarComponentV2.LL.LIZ;
        if (fragment != null) {
            activity = fragment.getActivity();
        } else {
            activity = null;
        }
        C0SRL c0srl3 = postModeActionBarComponentV2.LL;
        Fragment fragment2 = c0srl3.LIZ;
        Aweme aweme5 = c0srl3.LIZJ;
        Comment comment = postModeActionBarComponentV2.LLJILJIL;
        C1346920l9e c1346920l9e = new C1346920l9e(false, false, false, false, false, false, EnumC1346360l8k.POST_MODE_FULL_PAGE, 0, enumC1341680l1C2, false, new C1346910l9d("", null, commentStickerStruct2, 0, EnumC1341680l1C.TEXT, "", null, "", null, ""), false);
        if (str4 != null && str4.length() > 0) {
            c1346920l9e.setPostMethod(str4);
        }
        InterfaceC737440SwI interfaceC737440SwILJLJJL = commentServiceLIZ.LJLJJL(activity, fragment2, aweme5, comment, strEventType, str5, "graphic_detail", c1346920l9e, postModeActionBarComponentV2.LLJIJIL);
        if (interfaceC737440SwILJLJJL != null) {
            if (C304280BwI.LIZIZ()) {
                interfaceC737440SwILJLJJL.e6(new AwS555S0100000_11(weakReference, (WeakReference<PostModeCommentListFragmentV2>) 1583));
                interfaceC737440SwILJLJJL.sp(new AwS555S0100000_11(weakReference, (WeakReference<PostModeCommentListFragmentV2>) 1584));
                interfaceC737440SwILJLJJL.rn(new AwS590S0100000_11(weakReference, (WeakReference<PostModeActionBarComponentV2>) 524));
            } else {
                interfaceC737440SwILJLJJL.e6(new AwS555S0100000_11(postModeActionBarComponentV2, 1585));
                interfaceC737440SwILJLJJL.sp(new AwS555S0100000_11(postModeActionBarComponentV2, 1586));
                interfaceC737440SwILJLJJL.rn(new AwS590S0100000_11(postModeActionBarComponentV2, 510));
            }
        } else {
            interfaceC737440SwILJLJJL = null;
        }
        postModeActionBarComponentV2.LLIZLLLIL = interfaceC737440SwILJLJJL;
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
