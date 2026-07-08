package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.C01GW;
import X.C1346550l93;
import X.C1348210lBj;
import X.C1348220lBk;
import X.C1348230lBl;
import X.C1353500lKG;
import X.C13LE;
import X.C1529880puk;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1548820qPI;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1871910yoP;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C262100zr;
import X.C452230HoL;
import X.C452250HoN;
import X.C452501pT;
import X.C724240Sb0;
import X.C726120Se2;
import X.C736680Sv4;
import X.InterfaceC1059280dfi;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC1340320kz0;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentLinkProductAssem;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS23S0600000_19;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentLinkProductAssem extends UIContentAssem implements IKeyboardProtocol, ICommentLinkProductAssemAbility, InterfaceC1141530foN {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final C726120Se2 LLIZLLLIL = new C726120Se2();
    public final C01GW LLJ;
    public C1353500lKG LLJI;
    public Comment LLJIJIL;
    public boolean LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentLinkProductAssem.class, "commentContextSource", "getCommentContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CommentLinkProductAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(KeyboardVMV2.class);
        this.LLJ = C452501pT.LIZIZ(new AwS23S0600000_19(this, c19719912DlLIZ, C1637806bA.LIZ, new C452230HoL(c19719912DlLIZ), new C452250HoN(), (Function0) null, 28));
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol
    public final void g20() {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol
    public final void p50() {
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1548820qPI.LJIIIIZZ("ec_tag_product_comment", this);
        C1548820qPI.LJIIIIZZ("ec_tag_product_replace", this);
        ((ArrayList) C1348210lBj.LIZ).clear();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, ICommentLinkProductAssemAbility.class, null, null);
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) throws Throwable {
        if ((Intrinsics.LJFF(c262100zr.LIZ, "ec_tag_product_comment") || Intrinsics.LJFF(c262100zr.LIZ, "ec_tag_product_replace")) && !this.LLJILJIL) {
            this.LLJILJIL = true;
            for (String str : (ArrayList) C1348210lBj.LIZ) {
                C1529880puk c1529880puk = SparkContext.Companion;
                c1529880puk.getClass();
                InterfaceC1059280dfi interfaceC1059280dfiLIZ = C1529880puk.LIZ(str);
                if (interfaceC1059280dfiLIZ != null) {
                    interfaceC1059280dfiLIZ.close();
                }
            }
            ((ArrayList) C1348210lBj.LIZ).clear();
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd == null) {
                return;
            }
            String strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "keyword", "");
            if (TextUtils.isEmpty(strLJFF)) {
                return;
            }
            String strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd, "product_id", "");
            String strLJFF3 = C1871910yoP.LJFF(interfaceC1107590evd, "anchor_schema", "");
            String strLJFF4 = C1871910yoP.LJFF(interfaceC1107590evd, "pdp_schema", "");
            Comment comment = this.LLJIJIL;
            if (comment != null) {
                comment.setLinkProductAnchorSchema(strLJFF3);
            }
            try {
                long j = CastLongProtector.parseLong(strLJFF2);
                C1353500lKG c1353500lKG = this.LLJI;
                if (c1353500lKG != null) {
                    c1353500lKG.LJIIIZ(j, strLJFF, strLJFF4);
                }
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C1353500lKG c1353500lKGZy1;
        super.onViewCreated(view);
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), IKeyboardProtocol.class, C1697810uHb.LJIILJJIL(this));
        IKeyboardEditAbility iKeyboardEditAbilityLIZIZ = C1346550l93.LIZIZ(C1558520qew.LJIIL(this));
        if (iKeyboardEditAbilityLIZIZ != null) {
            c1353500lKGZy1 = iKeyboardEditAbilityLIZIZ.Zy1();
        } else {
            c1353500lKGZy1 = null;
        }
        this.LLJI = c1353500lKGZy1;
        if (c1353500lKGZy1 != null) {
            c1353500lKGZy1.setOnLinkSpanClickListener(new InterfaceC1340320kz0() { // from class: X.0lBi
                @Override // X.InterfaceC1340320kz0
                public final void LIZ(TextExtraStruct textExtraStruct) {
                    this.LIZ.to1(textExtraStruct, true);
                    C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
                    CommentLinkProductAssem commentLinkProductAssem = this.LIZ;
                    C726120Se2 c726120Se2 = commentLinkProductAssem.LLIZLLLIL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CommentLinkProductAssem.LLJILJILJ;
                    Aweme aweme = CommentContextSourceKt.aweme(c726120Se2.LIZ(commentLinkProductAssem));
                    CommentLinkProductAssem commentLinkProductAssem2 = this.LIZ;
                    Comment comment = commentLinkProductAssem2.LLJIJIL;
                    CommentContextSourceKt.eventType(commentLinkProductAssem2.LLIZLLLIL.LIZ(commentLinkProductAssem2));
                    c1350920lG6.getClass();
                    C1350920lG6.LJJLIIIJ(comment, aweme);
                }
            });
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJ.getValue(), new C2217381BqS() { // from class: X.0lBY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1346950l9h) obj).LLILZIL;
            }
        }, null, new AwS635S0100000_21(this, 23), 6);
        C1548820qPI.LIZLLL("ec_tag_product_comment", this);
        C1548820qPI.LIZLLL("ec_tag_product_replace", this);
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.ICommentLinkProductAssemAbility
    public final void to1(TextExtraStruct textExtraStruct, boolean z) {
        String productSchema;
        String cid;
        Long lValueOf;
        this.LLJILJIL = false;
        ((ArrayList) C1348210lBj.LIZ).clear();
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        C1348230lBl c1348230lBl = new C1348230lBl();
        c1537900q7g.getClass();
        C1537900q7g.LJIIIIZZ(c1348230lBl);
        Comment comment = this.LLJIJIL;
        if (comment != null) {
            if (textExtraStruct == null) {
                productSchema = "aweme://lynxview/?surl=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_ecommerce_add_product%2Fpages%2Fadd-product%2Ftemplate.js&hide_status_bar=0&disable_tea_intercept=1&hide_nav_bar=1&use_gecko_first=1&channel=tiktok_live_ecommerce_add_product&use_spark=1&use_bdx=1&dynamic=1&page_mode=anchor&status_bar_color=00000000&show_mask=1&trans_status_bar=1&bundle=pages%2Fadd-product%2Ftemplate.js&hide_tabbar_when_push=1&immersive_mode=0&enable_code_cache=1&enable_prefetch=1&spark_perf_biz=content_ecommerce&auto_continue_load=1&bdhm_bid=tiktok_ecom_affiliate&enter_from=comment_panel&source_enter_from=comment_panel&post_mode=comment_tag&post_way=new_video_flow&custom_creator_key=post_way&source_page_type=video&source_enter_method=link_product_in_comment_panel&target_handler=comment_link_product&shoot_entrance_page=comment_panel";
            } else if (z) {
                productSchema = comment.getLinkProductAnchorSchema();
            } else {
                productSchema = textExtraStruct.getProductSchema();
            }
            String rootCommentId = comment.getRootCommentId();
            if (rootCommentId != null && rootCommentId.length() != 0 && !Intrinsics.LJFF(comment.getRootCommentId(), CardStruct.IStatusCode.DEFAULT)) {
                cid = comment.getRootCommentId();
            } else {
                cid = comment.getCid();
            }
            C1348220lBk c1348220lBk = C1348220lBk.LIZ;
            if (textExtraStruct != null) {
                lValueOf = Long.valueOf(textExtraStruct.getProductId());
            } else {
                lValueOf = null;
            }
            Context context = getContext();
            C726120Se2 c726120Se2 = this.LLIZLLLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
            CommentContextSource commentContextSourceLIZ = c726120Se2.LIZ(this);
            c1348220lBk.getClass();
            C1348220lBk.LIZ(lValueOf, cid, productSchema, context, commentContextSourceLIZ);
        }
    }
}
