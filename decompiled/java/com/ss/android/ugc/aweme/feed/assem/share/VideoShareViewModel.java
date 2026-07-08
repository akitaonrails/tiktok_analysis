package com.ss.android.ugc.aweme.feed.assem.share;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C05H9;
import X.C0BPP;
import X.C0C64;
import X.C0HCN;
import X.C0OAD;
import X.C0PEM;
import X.C0S78;
import X.C0SXF;
import X.C0XQ7;
import X.C1004140cEm;
import X.C1238740iLA;
import X.C1251170ifD;
import X.C1367960lha;
import X.C1370970lmR;
import X.C1374870lsj;
import X.C1388190mED;
import X.C1391870mK9;
import X.C13LE;
import X.C13LP;
import X.C13LQ;
import X.C1606660rua;
import X.C1697810uHb;
import X.C1843500y4a;
import X.C1894700zPA;
import X.C19252910Tv;
import X.C19633311rf;
import X.C2178808gE;
import X.C2189821An6;
import X.C2214201BlK;
import X.C2217371BqR;
import X.C2277711EDh;
import X.C23250099c;
import X.C281310B0v;
import X.C291001Au;
import X.C295620BiK;
import X.C418440Gaw;
import X.C423490Gj5;
import X.C618720OOo;
import X.C621180OYa;
import X.C692450REd;
import X.C717590SCv;
import X.C720360SNm;
import X.C727520SgI;
import X.C729510SjV;
import X.C729980SkG;
import X.C732520SoM;
import X.C732590SoT;
import X.C732600SoU;
import X.C732610SoV;
import X.C732630SoX;
import X.C733400Spm;
import X.C733420Spo;
import X.C733430Spp;
import X.C733450Spr;
import X.C733480Spu;
import X.C733510Spx;
import X.C733650SqB;
import X.C735280Sso;
import X.C735370Ssx;
import X.C735440St4;
import X.C735690StT;
import X.C735840Sti;
import X.C740740T3w;
import X.C800330VaR;
import X.C814420VxA;
import X.C844470XAv;
import X.EnumC732770Sol;
import X.InterfaceC0148002o;
import X.InterfaceC2217461Bqa;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.share.ShareOperationInfo;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.assem.base.FeedRightBtnBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.share.ShareExtService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS125S1100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS96S1200000_11;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class VideoShareViewModel extends FeedRightBtnBaseViewModel<C732520SoM> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public boolean LLILLL;
    public volatile boolean LLILZIL;
    public volatile boolean LLILZLL;
    public volatile boolean LLIZLLLIL;
    public volatile boolean LLJ;
    public volatile C2189821An6 LLJI;
    public long LLJIJIL;
    public float LL = C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJL().LJJIIJZLJL();
    public final C717590SCv LLILLJJLI = new C717590SCv(new C733480Spu());
    public String LLILZ = "";
    public volatile EnumC732770Sol LLIZ = EnumC732770Sol.OTHER;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(VideoShareViewModel.class, "context", "getContext()Landroid/content/Context;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217371BqR};
    }

    public static boolean IQ2() {
        if (C621180OYa.LIZIZ.LJIIL()) {
            return false;
        }
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        return C2178808gE.LIZ().LJ(38) != null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C732520SoM(null, 127);
    }

    public final Context getContext() {
        C717590SCv c717590SCv = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (Context) c717590SCv.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedRightBtnBaseViewModel
    public final void onForceHideTextFlagChange() {
        setState(new C732610SoV(this));
    }

    public final void yQ2() {
        this.LLIZ = EnumC732770Sol.OTHER;
        setState(new AwS590S0100000_11(this, 100));
    }

    public final void zQ2() {
        String aid;
        Aweme aweme;
        if (this.LLILZIL) {
            this.LLILZIL = false;
            yQ2();
        }
        if (this.LLILZLL) {
            this.LLILZLL = false;
            this.LLIZ = EnumC732770Sol.OTHER;
            yQ2();
        } else {
            C1374870lsj.LIZ.getClass();
            C1391870mK9<String> c1391870mK9 = C1374870lsj.LJFF;
            VideoItemParams item = getItem();
            if (item == null || (aweme = item.getAweme()) == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
            if (c1391870mK9.LIZIZ.contains(aid)) {
                setState(new AwS590S0100000_11(this, 544));
            }
        }
        if (this.LLIZLLLIL) {
            this.LLIZLLLIL = false;
            yQ2();
        }
        if (this.LLJ) {
            this.LLJ = false;
            yQ2();
        }
        this.LLILZ = "";
        this.LLJI = null;
    }

    public final boolean BQ2() {
        Aweme aweme;
        VideoItemParams item = getItem();
        if (item == null || (aweme = item.getAweme()) == null || !aweme.isAd()) {
            return false;
        }
        IComplianceService iComplianceServiceLJIILIIL = ComplianceServiceProvider.LJIILIIL();
        VideoItemParams item2 = getItem();
        return iComplianceServiceLJIILIIL.LJJJ(item2 != null ? item2.getAweme() : null);
    }

    public final void FQ2() {
        if (C281310B0v.LIZ()) {
            VideoItemParams item = getItem();
            if (C729510SjV.LJJIJIL(item != null ? item.getAweme() : null)) {
                return;
            }
        }
        if (BQ2()) {
            return;
        }
        setState(AFwS243S0000000_11.get$arr$(81));
    }

    public final boolean GQ2() {
        Aweme aweme;
        VideoItemParams item = getItem();
        if (item != null && (aweme = item.getAweme()) != null) {
            C1251170ifD c1251170ifD = C1251170ifD.LIZ;
            String aid = aweme.getAid();
            boolean z = this.LLILLL;
            c1251170ifD.getClass();
            if (!C1251170ifD.LJI(aweme, aid, z) || this.LLILZIL || BQ2() || !C621180OYa.LIZIZ.LJJIIZI(aweme)) {
                return false;
            }
            boolean z2 = C281310B0v.LIZ() && C729510SjV.LJJIJIL(aweme);
            C735280Sso.LIZ.getClass();
            if (!C735280Sso.LJFF(aweme) && !C735280Sso.LIZJ(aweme) && !C735280Sso.LJII(aweme) && !z2) {
                Context context = getContext();
                C733650SqB.LIZ.getClass();
                return (C735690StT.LIZ(context) || C735280Sso.LIZLLL(aweme) || C727520SgI.LJ(aweme) || this.LLILZLL) ? false : true;
            }
        }
        return false;
    }

    public final void RQ2() {
        VideoItemParams item;
        Aweme aweme;
        if (!GQ2() || (item = getItem()) == null || (aweme = item.getAweme()) == null) {
            return;
        }
        C2189821An6 c2189821An6 = this.LLJI;
        boolean fromReferral = c2189821An6 != null ? c2189821An6.getFromReferral() : false;
        if (CQ2(aweme) && !IQ2()) {
            C733650SqB.LIZ.getClass();
            if (C13LP.LJJJJ(C733650SqB.LIZIZ, C1697810uHb.LJ("2s")) && C733420Spo.LJ(Boolean.valueOf(fromReferral))) {
                if (!Boolean.valueOf(fromReferral).booleanValue()) {
                    C733420Spo.LIZ();
                    Keva repo = Keva.getRepo("coin_incentive_share_guide_keva");
                    repo.storeInt("coin_incentive_share_guide_show_times", repo.getInt("coin_incentive_share_guide_show_times", 0) + 1);
                }
                C733510Spx.LIZ.LIZ(C735370Ssx.LIZJ(aweme));
                this.LLILZLL = true;
                AwemeBizExtKt.setHighlighted(aweme, true);
                if (this.LLILZIL) {
                    return;
                }
                this.LLILZIL = true;
                setState(new AwS590S0100000_11((Long) 0L, 548));
                return;
            }
            if (!C13LP.LJJJJ(C733650SqB.LIZIZ, C1697810uHb.LJ("2s")) && C733420Spo.LJ(Boolean.valueOf(fromReferral))) {
                return;
            }
        }
        if (C733420Spo.LJFF()) {
            C733420Spo.LIZIZ();
            C19633311rf c19633311rfLIZIZ = C1238740iLA.LIZIZ();
            c19633311rfLIZIZ.LJ("share_guide_show_times", c19633311rfLIZIZ.LIZ(0, "share_guide_show_times") + 1);
            C733650SqB.LIZ.getClass();
            if (TextUtils.equals(C733650SqB.LIZIZ, "promote")) {
                TQ2(aweme, EnumC732770Sol.OTHER);
                runOnUIThread(new AwS96S1200000_11(this, (Drawable) null, (String) null, 12));
                return;
            }
            if (!C0BPP.LIZ()) {
                C1004140cEm.LIZ.getClass();
                if (C1004140cEm.LIZ().reverseInternalShare != 1 || !C1004140cEm.LIZIZ()) {
                    TQ2(aweme, EnumC732770Sol.OTHER);
                }
            }
            if (!C13LP.LJJJJ(C733650SqB.LIZIZ, C1697810uHb.LJ("like", "loop2", "loop1")) || C0BPP.LIZ()) {
                return;
            }
            C1004140cEm.LIZ.getClass();
            if (C1004140cEm.LIZ().reverseInternalShare == 1 && C1004140cEm.LIZIZ()) {
                return;
            }
            C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C733400Spm(aweme, this, null), 2);
        }
    }

    public final void SQ2() {
        if (C281310B0v.LIZ()) {
            VideoItemParams item = getItem();
            if (C729510SjV.LJJIJIL(item != null ? item.getAweme() : null)) {
                return;
            }
        }
        if (BQ2()) {
            return;
        }
        setState(AFwS243S0000000_11.get$arr$(82));
        this.LLIZLLLIL = true;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedRightBtnBaseViewModel
    public final String getZeroNumReplaceString() {
        if (!C295620BiK.LIZ()) {
            return null;
        }
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZ().getString(R.string.t_b);
    }

    public static C732590SoT DQ2(C732520SoM c732520SoM) {
        C732590SoT c732590SoT = c732520SoM.LLILLL;
        if (c732590SoT == null) {
            return new C732590SoT(null, null, null);
        }
        return c732590SoT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JSONObject AQ2(Aweme aweme) {
        System.currentTimeMillis();
        HashMap map = new HashMap();
        C1367960lha.LIZ.getClass();
        Map mapLJIILJJIL = C1367960lha.LIZ().LJIILJJIL(aweme, C1367960lha.LIZ().LJLJL(aweme.getAid()));
        if (!mapLJIILJJIL.isEmpty()) {
            for (Map.Entry entry : mapLJIILJJIL.entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        if (Intrinsics.LJFF(this.eventType, "homepage_nearby")) {
            C1606660rua.LIZIZ.LIZJ(this.eventType, map, aweme, true);
            map.put("follow_status", String.valueOf(AwemeExtKt.getFollowStatus(aweme)));
            map.put("enter_from", "homepage_nearby");
            map.put("author_id", AwemeExtKt.getAuthorUid(aweme));
            String groupId = aweme.getGroupId();
            if (groupId == null) {
                groupId = "";
            }
            map.put("group_id", groupId);
        }
        map.put("aigc_theme_status", String.valueOf(aweme.aigcInfo.getAIGCLabelType()));
        ILocalServicePassThroughService iLocalServicePassThroughService = (ILocalServicePassThroughService) PluggableExtentionKt.pluggableSpi$default(ILocalServicePassThroughService.class, false, false, false, 14, null);
        if (iLocalServicePassThroughService != null) {
            iLocalServicePassThroughService.LJII(PageFinder.via(this.fragment), "share", null, map);
        }
        return new JSONObject(map);
    }

    public final boolean CQ2(Aweme aweme) {
        boolean fromReferral;
        ShareOperationInfo shareOperationInfo;
        C2189821An6 c2189821An6 = this.LLJI;
        if (c2189821An6 != null) {
            fromReferral = c2189821An6.getFromReferral();
        } else {
            fromReferral = false;
        }
        ShareExtService shareExtService = C621180OYa.LIZIZ;
        if (aweme != null) {
            shareOperationInfo = aweme.getShareOperationInfo();
        } else {
            shareOperationInfo = null;
        }
        return shareExtService.LJJJI(shareOperationInfo, fromReferral);
    }

    public final void EQ2(Aweme aweme) {
        VideoItemParams item;
        Aweme aweme2;
        if (aweme != null && xQ2(aweme) && (item = getItem()) != null && (aweme2 = item.getAweme()) != null) {
            C733510Spx.LIZ.LIZ(aweme2.getAid());
            C733650SqB.LIZ.getClass();
            C733650SqB.LIZIZ = "br_whatsapp";
            this.LLILZLL = true;
            this.LLIZ = EnumC732770Sol.EXTERNAL_SHARE;
            int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "interction_share_button_whatsapp_style", true);
            Context context = getContext();
            if (context != null) {
                C1388190mED.LIZ(context);
            }
            if (C735690StT.LIZIZ()) {
                if (iLJIJ != 1) {
                    if (iLJIJ == 2 && !this.LLILZIL) {
                        this.LLILZIL = true;
                        setState(new AwS125S1100000_11(this, 13));
                        return;
                    }
                    return;
                }
                QQ2(1.02f, 0.95f);
                return;
            }
            setState(new AwS590S0100000_11(this, 543));
            if (iLJIJ != 1) {
                if (iLJIJ != 2) {
                    return;
                }
                QQ2(1.05f, 0.9f);
                return;
            }
            QQ2(1.02f, 0.95f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object HQ2(X.InterfaceC1364105Vn<? super java.lang.Boolean> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C733440Spq
            if (r0 == 0) goto Lb3
            r5 = r9
            X.0Spq r5 = (X.C733440Spq) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb3
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L12:
            java.lang.Object r0 = r5.LLILLL
            java.lang.Object r6 = X.C099R.LJFF()
            int r1 = r5.LLILZIL
            r4 = 1
            if (r1 == 0) goto L33
            if (r1 != r4) goto Lba
            int r2 = r5.LLILLJJLI
            boolean r3 = r5.LL
            X.C155000ia.LIZIZ(r0)
        L26:
            if (r3 != 0) goto L2c
            if (r2 == 0) goto L31
            if (r0 == 0) goto L31
        L2c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L31:
            r4 = 0
            goto L2c
        L33:
            X.C155000ia.LIZIZ(r0)
            java.lang.Object r0 = r8.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto Lb1
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
        L42:
            boolean r3 = r8.xQ2(r0)
            boolean r0 = r8.GQ2()
            if (r0 == 0) goto L91
            boolean r0 = X.C733420Spo.LJFF()
            if (r0 == 0) goto L91
            X.0SqB r0 = X.C733650SqB.LIZ
            r0.getClass()
            java.lang.String r7 = X.C733650SqB.LIZIZ
            java.lang.Object r0 = r8.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto L64
            r0.getAweme()
        L64:
            java.lang.String r2 = "like"
            java.lang.String r1 = "loop2"
            java.lang.String r0 = "loop1"
            java.lang.String[] r0 = new java.lang.String[]{r2, r1, r0}
            java.util.ArrayList r0 = X.C1697810uHb.LJ(r0)
            boolean r0 = X.C13LP.LJJJJ(r7, r0)
            if (r0 == 0) goto L91
            boolean r0 = X.C0BPP.LIZ()
            if (r0 != 0) goto L91
            X.0cEm r0 = X.C1004140cEm.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.internalshare.api.experiment.QuickShareButtonConfig r0 = X.C1004140cEm.LIZ()
            int r0 = r0.reverseInternalShare
            if (r0 != r4) goto Laf
            boolean r0 = X.C1004140cEm.LIZIZ()
            if (r0 == 0) goto Laf
        L91:
            r2 = 0
        L92:
            X.0SqB r1 = X.C733650SqB.LIZ
            java.lang.Object r0 = r8.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto L9f
            r0.getAweme()
        L9f:
            r5.LL = r3
            r5.LLILLJJLI = r2
            r5.LLILZIL = r4
            r1.getClass()
            java.lang.Object r0 = X.C733650SqB.LIZ(r5)
            if (r0 != r6) goto L26
            return r6
        Laf:
            r2 = 1
            goto L92
        Lb1:
            r0 = 0
            goto L42
        Lb3:
            X.0Spq r5 = new X.0Spq
            r5.<init>(r8, r9)
            goto L12
        Lba:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel.HQ2(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void JQ2(android.widget.ImageView r19) {
        /*
            Method dump skipped, instruction units count: 1590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel.JQ2(android.widget.ImageView):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e5, code lost:
    
        if (((X.AbstractC848400XPy) r1).LIZJ(r0) != false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C732520SoM KQ2(X.C732520SoM r15) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel.KQ2(X.0SoM):X.0SoM");
    }

    public final C732520SoM LQ2(C732520SoM c732520SoM) {
        Context context = getContext();
        if (context != null && C1388190mED.LIZ(context) != null && C735690StT.LIZIZ()) {
            this.LLIZ = EnumC732770Sol.EXTERNAL_SHARE;
            C732590SoT c732590SoTDQ2 = DQ2(c732520SoM);
            C844470XAv.LIZ.getClass();
            return C732520SoM.LIZ(c732520SoM, null, C732590SoT.LIZ(c732590SoTDQ2, C800330VaR.LIZIZ(C844470XAv.LIZ(), R.drawable.bb5), null, null, 6), new C291001Au(Boolean.FALSE), null, null, null, 115);
        }
        return NQ2(c732520SoM);
    }

    public final void MQ2(Function0<Unit> function0) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C05H9(function0, null), 2);
    }

    public final C732520SoM NQ2(C732520SoM c732520SoM) {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(this.LL)));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(this.LL)));
        C2277711EDh c2277711EDh = C2277711EDh.LIZIZ;
        C844470XAv.LIZ.getClass();
        Drawable drawableLJIL = c2277711EDh.LJIL(iLIZIZ, iLIZIZ2, C844470XAv.LIZ());
        C732630SoX c732630SoX = c732520SoM.LLILZLL;
        if (c732630SoX == null) {
            c732630SoX = new C732630SoX(0);
        }
        C732630SoX c732630SoX2 = new C732630SoX(c732630SoX.LIZ, Float.valueOf(1.0f), c732630SoX.LIZJ);
        C732590SoT c732590SoTDQ2 = DQ2(c732520SoM);
        if (drawableLJIL == null) {
            drawableLJIL = C423490Gj5.LIZ(iLIZIZ, iLIZIZ, C844470XAv.LIZ());
        }
        return C732520SoM.LIZ(c732520SoM, null, C732590SoT.LIZ(c732590SoTDQ2, drawableLJIL, null, new ViewGroup.LayoutParams(iLIZIZ, iLIZIZ2), 2), new C291001Au(Boolean.FALSE), null, c732630SoX2, null, 83);
    }

    public final C732520SoM OQ2(C732520SoM c732520SoM) {
        User author;
        AwemeStatistics statistics;
        C732600SoU c732600SoU;
        Aweme aweme;
        float f;
        CharSequence charSequenceLIZ;
        String string;
        String strMapZeroNumToString;
        Resources resources;
        Context context;
        Aweme aweme2;
        Aweme aweme3;
        VideoItemParams item = getItem();
        Aweme aweme4 = null;
        if (item != null && (aweme3 = item.getAweme()) != null) {
            author = aweme3.getAuthor();
        } else {
            author = null;
        }
        VideoItemParams item2 = getItem();
        if (item2 != null && (aweme2 = item2.getAweme()) != null) {
            statistics = aweme2.getStatistics();
        } else {
            statistics = null;
        }
        C0S78.LIZJ(new C733450Spr(), true);
        Object objLJIJI = C2277711EDh.LIZIZ.LJIJI();
        if (objLJIJI instanceof C732600SoU) {
            c732600SoU = (C732600SoU) objLJIJI;
        } else {
            c732600SoU = null;
        }
        if (c732600SoU == null) {
            if (statistics != null && author != null) {
                if (!TextUtils.equals(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), author.getUid()) || (C0SXF.LJIL(getContext()) && (!C692450REd.LIZ))) {
                    if (C0HCN.LIZJ()) {
                        f = 11.0f;
                    } else {
                        f = 13.0f;
                    }
                    updateOrigin(0);
                    int forceTextVisible = getForceTextVisible();
                    Float fValueOf = Float.valueOf(f);
                    Fragment fragment = this.fragment;
                    if (fragment != null && (context = fragment.getContext()) != null && C0SXF.LJIL(context)) {
                        charSequenceLIZ = C1843500y4a.LIZIZ(statistics.getShareCount());
                    } else {
                        charSequenceLIZ = C618720OOo.LIZ(statistics.getShareCount());
                    }
                    if (statistics.getShareCount() == 0 && getContext() != null) {
                        Context context2 = getContext();
                        if (context2 != null && (resources = context2.getResources()) != null) {
                            charSequenceLIZ = resources.getText(2131858164);
                            if (charSequenceLIZ == null) {
                            }
                        }
                        strMapZeroNumToString = null;
                        c732600SoU = new C732600SoU(forceTextVisible, fValueOf, strMapZeroNumToString);
                    } else {
                        if (charSequenceLIZ == null && (string = charSequenceLIZ.toString()) != null) {
                            strMapZeroNumToString = mapZeroNumToString(string);
                        } else {
                            strMapZeroNumToString = null;
                        }
                        c732600SoU = new C732600SoU(forceTextVisible, fValueOf, strMapZeroNumToString);
                    }
                } else {
                    c732600SoU = new C732600SoU(8, (String) null, 6);
                }
            } else {
                updateOrigin(0);
                int forceTextVisible2 = getForceTextVisible();
                Float fValueOf2 = Float.valueOf(10.0f);
                C844470XAv.LIZ.getClass();
                c732600SoU = new C732600SoU(forceTextVisible2, fValueOf2, C844470XAv.LIZ().getString(2131858164));
            }
        }
        if (C281310B0v.LIZ()) {
            VideoItemParams item3 = getItem();
            if (item3 != null) {
                aweme = item3.getAweme();
            } else {
                aweme = null;
            }
            if (C729510SjV.LJJIJIL(aweme)) {
                return C732520SoM.LIZ(c732520SoM, new C732600SoU(8, (String) null, 6), null, null, null, null, null, 125);
            }
        }
        if (BQ2()) {
            return C732520SoM.LIZ(c732520SoM, new C732600SoU(8, (String) null, 6), null, null, null, null, null, 125);
        }
        VideoItemParams item4 = getItem();
        if (item4 != null) {
            aweme4 = item4.getAweme();
        }
        if (C0OAD.LIZIZ(aweme4)) {
            return C732520SoM.LIZ(c732520SoM, new C732600SoU(c732600SoU.LIZ, c732600SoU.LIZIZ, mapZeroNumToString(CardStruct.IStatusCode.DEFAULT)), null, null, null, null, null, 125);
        }
        return C732520SoM.LIZ(c732520SoM, c732600SoU, null, null, null, null, null, 125);
    }

    public final C732520SoM PQ2(C732520SoM c732520SoM) {
        C844470XAv.LIZ.getClass();
        return C732520SoM.LIZ(c732520SoM, null, C732590SoT.LIZ(DQ2(c732520SoM), C423490Gj5.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(this.LL))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(this.LL))), C844470XAv.LIZ()), null, null, 6), null, null, null, null, 123);
    }

    public final boolean xQ2(Aweme aweme) {
        VideoItemParams item;
        Aweme aweme2;
        Activity activityLIZ;
        boolean z;
        User author;
        long[] typeLabels;
        if (((Number) C0BPP.LIZ.getValue()).intValue() != 2 && !C0BPP.LIZ()) {
            C1004140cEm.LIZ.getClass();
            if (C1004140cEm.LIZIZ()) {
                return false;
            }
            IInternalShareApi.LIZ.getClass();
            if (!C1370970lmR.LIZ().LIZIZ().LJJII(aweme) && (item = getItem()) != null && (aweme2 = item.getAweme()) != null) {
                try {
                    Activity activityLJFF = C2214201BlK.LJFF();
                    Context context = getContext();
                    String aid = null;
                    if (context != null) {
                        activityLIZ = C1388190mED.LIZ(context);
                    } else {
                        activityLIZ = null;
                    }
                    if (activityLJFF != activityLIZ) {
                        return false;
                    }
                    Aweme awemeLJ = C740740T3w.LJ();
                    if (awemeLJ != null) {
                        aid = awemeLJ.getAid();
                    }
                    if (!TextUtils.equals(aid, aweme2.getAid()) || !C735690StT.LIZ(getContext()) || BQ2()) {
                        return false;
                    }
                    if (C281310B0v.LIZ() && C729510SjV.LJJIJIL(aweme2)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C735280Sso.LIZ.getClass();
                    if (C735280Sso.LJFF(aweme2) || C735280Sso.LIZJ(aweme2) || C735280Sso.LJII(aweme2) || z || !C621180OYa.LIZIZ.LJJIIZI(aweme2)) {
                        return false;
                    }
                    if (aweme2.getAwemeType() != 56 && ((author = aweme2.getAuthor()) == null || (typeLabels = author.getTypeLabels()) == null || !C13LQ.LJIILL(6737595547571456005L, typeLabels))) {
                        List<TextExtraStruct> textExtra = aweme2.getTextExtra();
                        if (textExtra != null && !textExtra.isEmpty()) {
                            for (TextExtraStruct textExtraStruct : textExtra) {
                                String hashTagName = textExtraStruct.getHashTagName();
                                if (hashTagName == null || a0.LJJJIL(hashTagName) || (!a0.LJJIIZI(textExtraStruct.getHashTagName(), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, false) && !a0.LJJIIZI(textExtraStruct.getHashTagName(), "Status", false))) {
                                }
                            }
                        }
                        return false;
                    }
                    if (!C733510Spx.LIZ.LIZ.contains(aweme2.getAid())) {
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return false;
    }

    public static void vQ2(Aweme aweme, C735440St4 c735440St4) {
        List<PhotoModeImageUrlModel> imageList;
        if (aweme.getAwemeType() == 150) {
            c735440St4.LIZLLL(150, "aweme_type");
            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                c735440St4.LIZLLL(imageList.size(), "pic_cnt");
            }
            c735440St4.LIZLLL(C720360SNm.LJII(aweme), "is_inspiration_added");
            c735440St4.LIZLLL(C720360SNm.LJIIJ(aweme), "is_photo_text_added");
        }
    }

    public final void QQ2(float f, float f2) {
        if (this.LLILZIL) {
            return;
        }
        this.LLILZIL = true;
        setState(new C733430Spp(this, f2, f));
    }

    public final void TQ2(Aweme aweme, EnumC732770Sol enumC732770Sol) {
        C733510Spx.LIZ.LIZ(C735370Ssx.LIZJ(aweme));
        this.LLILZLL = true;
        this.LLIZ = enumC732770Sol;
        AwemeBizExtKt.setHighlighted(aweme, true);
        if (C729980SkG.LJIIIIZZ(aweme)) {
            setState(AFwS243S0000000_11.get$arr$(771));
        } else {
            setState(new AwS590S0100000_11(this, 547));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC0148002o paramSync2StateAccept(X.InterfaceC0148002o r6, com.ss.android.ugc.aweme.feed.model.VideoItemParams r7) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r7.getAweme()
            android.content.Context r0 = r5.getContext()
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L29
            boolean r0 = X.C0SXF.LJIL(r0)
            if (r0 != r3) goto L29
            X.0RPj r1 = X.C695370RPj.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.getAweme()
            r1.getClass()
            X.0RLH r0 = X.C695370RPj.LIZ(r0)
            boolean r0 = r0.LIZ()
            if (r0 == 0) goto L99
            r0 = 1103101952(0x41c00000, float:24.0)
        L27:
            r5.LL = r0
        L29:
            int r1 = r5.pageType
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isCollected(r4)
            if (r0 == 0) goto L51
            r0 = 2004(0x7d4, float:2.808E-42)
            if (r1 != r0) goto L51
        L35:
            r0 = 1065353216(0x3f800000, float:1.0)
            r2 = 1
        L38:
            X.0SoM r4 = new X.0SoM
            X.0SoX r1 = new X.0SoX
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.<init>(r3, r0, r2)
            r0 = 95
            r4.<init>(r1, r0)
            X.0SoM r0 = r5.KQ2(r4)
            X.0SoM r0 = r5.OQ2(r0)
            return r0
        L51:
            X.0Sso r0 = X.C735280Sso.LIZ
            r0.getClass()
            boolean r0 = X.C735280Sso.LJFF(r4)
            if (r0 == 0) goto L35
            java.lang.Object r0 = r5.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto L96
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto L96
            java.lang.Object r0 = r5.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto L96
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto L96
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 == 0) goto L96
            java.lang.String r1 = r0.getUid()
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            java.lang.String r0 = r0.getUid()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L35
        L96:
            r0 = 1056964608(0x3f000000, float:0.5)
            goto L38
        L99:
            boolean r0 = X.C0HCN.LIZIZ()
            if (r0 == 0) goto La2
            r0 = 1105199104(0x41e00000, float:28.0)
            goto L27
        La2:
            r0 = 1107296256(0x42000000, float:32.0)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel.paramSync2StateAccept(X.002o, com.ss.android.ugc.aweme.feed.model.VideoItemParams):X.002o");
    }

    public static void wQ2(C735440St4 c735440St4, Aweme aweme, String str, String str2) {
        C735840Sti.LIZ.getClass();
        C735840Sti.LIZJ(c735440St4, aweme, str, str2, null, null);
        if (C729510SjV.LJJIJIL(aweme) && str != null) {
            c735440St4.LIZLLL = str;
        }
    }
}
